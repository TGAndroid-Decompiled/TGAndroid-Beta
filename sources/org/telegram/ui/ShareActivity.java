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
    public taa a;

    @Override
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.a.v();
        gl.v(this, getResources().getConfiguration());
        gl.s3(getWindow());
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
                k27 k27Var = new k27(y6c.t0, TLdeserialize, false, true);
                k27Var.k.with_my_score = true;
                try {
                    taa G0 = taa.G0(this, k27Var, null, false, string2);
                    this.a = G0;
                    G0.setCanceledOnTouchOutside(true);
                    this.a.setOnDismissListener(new ph8(this, (byte) 7));
                    this.a.show();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
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
            taa taaVar = this.a;
            if (taaVar != null && taaVar.isShowing()) {
                this.a.dismiss();
                this.a = null;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
