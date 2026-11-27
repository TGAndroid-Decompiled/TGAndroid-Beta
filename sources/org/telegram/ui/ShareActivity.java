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
    public static final int b = 0;
    public kea a;

    @Override
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.a.v();
        hl.v(this, getResources().getConfiguration());
        hl.r3(getWindow());
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
                SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("botshare", 0);
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
                r47 r47Var = new r47(yac.t0, TLdeserialize, false, true);
                r47Var.k.with_my_score = true;
                try {
                    kea H0 = kea.H0(this, r47Var, null, false, string2);
                    this.a = H0;
                    H0.setCanceledOnTouchOutside(true);
                    this.a.setOnDismissListener(new dl8(this, (byte) 7));
                    this.a.show();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
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
            kea keaVar = this.a;
            if (keaVar != null && keaVar.isShowing()) {
                this.a.dismiss();
                this.a = null;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
