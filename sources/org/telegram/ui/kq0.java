package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class kq0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f38961a;

    public kq0(PhotoViewer photoViewer) {
        this.f38961a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f38961a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new kg0(this, 19)).setDuration(150L).start();
        }
    }
}
