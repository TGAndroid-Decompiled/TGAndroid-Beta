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
    public static final int f43910b = 0;
    public org.telegram.ui.Components.zo0 f43911a;

    @Override
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.t0.w();
        org.telegram.messenger.g0.v(this, getResources().getConfiguration());
        org.telegram.messenger.g0.v3(getWindow());
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
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("botshare", 0);
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
                org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(org.telegram.messenger.i10.f24637t0, TLdeserialize, false, true);
                fjVar.f24073k.with_my_score = true;
                try {
                    org.telegram.ui.Components.zo0 O0 = org.telegram.ui.Components.zo0.O0(this, fjVar, null, false, string2);
                    this.f43911a = O0;
                    O0.setCanceledOnTouchOutside(true);
                    this.f43911a.setOnDismissListener(new q5(this, 15));
                    this.f43911a.show();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
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
            org.telegram.ui.Components.zo0 zo0Var = this.f43911a;
            if (zo0Var != null && zo0Var.isShowing()) {
                this.f43911a.dismiss();
                this.f43911a = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
