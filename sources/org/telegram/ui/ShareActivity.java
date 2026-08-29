package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public class ShareActivity extends Activity {
    public static final int f36249b = 0;
    public org.telegram.ui.Components.dq0 f36250a;

    @Override
    public final void onCreate(Bundle bundle) {
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages_Transparent);
        super.onCreate(bundle);
        setContentView(new View(this), new ViewGroup.LayoutParams(-1, -1));
        Intent intent = getIntent();
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null) {
            Uri data = intent.getData();
            String scheme = data.getScheme();
            String uri = data.toString();
            String queryParameter = data.getQueryParameter("hash");
            if ("tgb".equals(scheme) && uri.toLowerCase().startsWith("tgb://share_game_score") && !TextUtils.isEmpty(queryParameter)) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("botshare", 0);
                String string = sharedPreferences.getString(queryParameter + "_m", null);
                if (TextUtils.isEmpty(string)) {
                    finish();
                    return;
                }
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize == null) {
                    finish();
                    return;
                }
                TLdeserialize.readAttachPath(serializedData, 0L);
                serializedData.cleanup();
                String string2 = sharedPreferences.getString(queryParameter + "_link", null);
                MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, TLdeserialize, false, true);
                messageObject.messageOwner.with_my_score = true;
                try {
                    org.telegram.ui.Components.dq0 N0 = org.telegram.ui.Components.dq0.N0(this, messageObject, null, false, string2);
                    this.f36250a = N0;
                    N0.setCanceledOnTouchOutside(true);
                    this.f36250a.setOnDismissListener(new s5(this, 16));
                    this.f36250a.show();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            org.telegram.ui.Components.dq0 dq0Var = this.f36250a;
            if (dq0Var != null && dq0Var.isShowing()) {
                this.f36250a.dismiss();
                this.f36250a = null;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
