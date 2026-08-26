package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.AlertDialog;

public final class QrActivity$$ExternalSyntheticLambda1 implements AlertDialog.OnButtonClickListener, OnApplyWindowInsetsListener {
    public final QrActivity f$0;

    public QrActivity$$ExternalSyntheticLambda1(QrActivity qrActivity) {
        this.f$0 = qrActivity;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        QrActivity qrActivity = this.f$0;
        qrActivity.insets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        qrActivity.fragmentView.requestLayout();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        QrActivity qrActivity = this.f$0;
        qrActivity.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            qrActivity.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
