package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
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
import org.telegram.ui.Components.ShareAlert;

public class ShareActivity extends Activity {
    private Dialog visibleDialog;

    @Override
    protected void onCreate(Bundle bundle) {
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
            ShareAlert shareAlertCreateShareAlert = ShareAlert.createShareAlert(this, messageObject, null, false, string3, false);
            this.visibleDialog = shareAlertCreateShareAlert;
            shareAlertCreateShareAlert.setCanceledOnTouchOutside(true);
            this.visibleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    ShareActivity.$r8$lambda$4KdOU0rHbabAC8AjuUf4d8KX8Hg(this.f$0, dialogInterface);
                }
            });
            this.visibleDialog.show();
        } catch (Exception e) {
            FileLog.e(e);
            finish();
        }
    }

    public static void $r8$lambda$4KdOU0rHbabAC8AjuUf4d8KX8Hg(ShareActivity shareActivity, DialogInterface dialogInterface) {
        if (!shareActivity.isFinishing()) {
            shareActivity.finish();
        }
        shareActivity.visibleDialog = null;
    }

    @Override
    public void onPause() {
        super.onPause();
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            this.visibleDialog.dismiss();
            this.visibleDialog = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
