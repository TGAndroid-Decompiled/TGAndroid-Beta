package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class gt0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f38133a;

    public gt0(PhotoViewer photoViewer) {
        this.f38133a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f38133a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new uk0(this, 16)).setDuration(150L).start();
        }
    }
}
