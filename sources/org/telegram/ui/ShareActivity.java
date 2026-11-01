package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public class ShareActivity extends Activity {
    public static final int f34051b = 0;
    public org.telegram.ui.Components.pp0 f34052a;

    @Override
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.w0.w();
        org.telegram.messenger.i0.v(this, getResources().getConfiguration());
        org.telegram.messenger.i0.w3(getWindow());
        requestWindowFeature(1);
        setTheme(2131755339);
        super.onCreate(bundle);
        setContentView(new View(this), new ViewGroup.LayoutParams(-1, -1));
        Intent intent = getIntent();
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null) {
            Uri data = intent.getData();
            String scheme = data.getScheme();
            String uri = data.toString();
            String queryParameter = data.getQueryParameter("hash");
            if ("tgb".equals(scheme) && uri.toLowerCase().startsWith("tgb://share_game_score") && !TextUtils.isEmpty(queryParameter)) {
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("botshare", 0);
                String string = sharedPreferences.getString(queryParameter + "_m", null);
                if (TextUtils.isEmpty(string)) {
                    finish();
                    return;
                }
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize == null) {
                    finish();
                    return;
                }
                TLdeserialize.readAttachPath(serializedData, 0L);
                serializedData.cleanup();
                String string2 = sharedPreferences.getString(queryParameter + "_link", null);
                org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(org.telegram.messenger.e20.f15506s0, TLdeserialize, false, true);
                kjVar.f16690k.with_my_score = true;
                try {
                    org.telegram.ui.Components.pp0 N0 = org.telegram.ui.Components.pp0.N0(this, kjVar, null, false, string2);
                    this.f34052a = N0;
                    N0.setCanceledOnTouchOutside(true);
                    this.f34052a.setOnDismissListener(new q5(this, 15));
                    this.f34052a.show();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    finish();
                    return;
                }
            }
            finish();
            return;
        }
        finish();
    }

    @Override
    public final void onPause() {
        super.onPause();
        try {
            org.telegram.ui.Components.pp0 pp0Var = this.f34052a;
            if (pp0Var != null && pp0Var.isShowing()) {
                this.f34052a.dismiss();
                this.f34052a = null;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
