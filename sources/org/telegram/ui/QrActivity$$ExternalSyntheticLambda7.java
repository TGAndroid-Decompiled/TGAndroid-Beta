package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.EmojiThemes;

public final class QrActivity$$ExternalSyntheticLambda7 implements QrActivity.OnItemSelectedListener, OnApplyWindowInsetsListener, AlertDialog.OnButtonClickListener, QrActivity.QrView.QrCenterChangedListener {
    public final QrActivity f$0;

    public QrActivity$$ExternalSyntheticLambda7(QrActivity qrActivity) {
        this.f$0 = qrActivity;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public void onCenterChanged(int i, int i2, int i3, int i4) {
        this.f$0.lambda$createView$0(i, i2, i3, i4);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$onRequestPermissionsResultFragment$16(alertDialog, i);
    }

    @Override
    public void onItemSelected(EmojiThemes emojiThemes, int i) {
        this.f$0.lambda$createView$2(emojiThemes, i);
    }
}
