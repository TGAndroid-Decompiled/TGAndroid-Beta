package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class cp0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f44869a;

    public cp0(PhotoViewer photoViewer) {
        this.f44869a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f44869a.D3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new ef0(this, 19)).setDuration(150L).start();
        }
    }
}
