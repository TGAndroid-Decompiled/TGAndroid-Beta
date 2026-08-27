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

    public static final int f36187b = 0;

    public org.telegram.ui.Components.sp0 f36188a;

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
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) {
            finish();
            return;
        }
        Uri data = intent.getData();
        String scheme = data.getScheme();
        String string = data.toString();
        String queryParameter = data.getQueryParameter("hash");
        if (!"tgb".equals(scheme) || !string.toLowerCase().startsWith("tgb://share_game_score") || TextUtils.isEmpty(queryParameter)) {
            finish();
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("botshare", 0);
        String string2 = sharedPreferences.getString(queryParameter + "_m", null);
        if (TextUtils.isEmpty(string2)) {
            finish();
            return;
        }
        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string2));
        TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        if (messageTLdeserialize == null) {
            finish();
            return;
        }
        messageTLdeserialize.readAttachPath(serializedData, 0L);
        serializedData.cleanup();
        String string3 = sharedPreferences.getString(queryParameter + "_link", null);
        MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, messageTLdeserialize, false, true);
        messageObject.messageOwner.with_my_score = true;
        try {
            org.telegram.ui.Components.sp0 sp0VarN0 = org.telegram.ui.Components.sp0.N0(this, messageObject, null, false, string3);
            this.f36188a = sp0VarN0;
            sp0VarN0.setCanceledOnTouchOutside(true);
            this.f36188a.setOnDismissListener(new s5(this, 16));
            this.f36188a.show();
        } catch (Exception e9) {
            FileLog.e(e9);
            finish();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        try {
            org.telegram.ui.Components.sp0 sp0Var = this.f36188a;
            if (sp0Var == null || !sp0Var.isShowing()) {
                return;
            }
            this.f36188a.dismiss();
            this.f36188a = null;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
