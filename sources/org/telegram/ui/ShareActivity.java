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
    public tca a;

    @Override
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.a.v();
        gm.v(this, getResources().getConfiguration());
        gm.r3(getWindow());
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
                k47 k47Var = new k47(z8c.t0, TLdeserialize, false, true);
                k47Var.k.with_my_score = true;
                try {
                    tca G0 = tca.G0(this, k47Var, null, false, string2);
                    this.a = G0;
                    G0.setCanceledOnTouchOutside(true);
                    this.a.setOnDismissListener(new qj8(this, (byte) 7));
                    this.a.show();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
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
            tca tcaVar = this.a;
            if (tcaVar != null && tcaVar.isShowing()) {
                this.a.dismiss();
                this.a = null;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
