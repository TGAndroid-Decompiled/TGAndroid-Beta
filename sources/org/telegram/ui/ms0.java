package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class ms0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f39650a;

    public ms0(PhotoViewer photoViewer) {
        this.f39650a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f39650a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new nj0(this, 17)).setDuration(150L).start();
        }
    }
}
