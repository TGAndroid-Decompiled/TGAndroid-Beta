package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class dt0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f31972a;

    public dt0(PhotoViewer photoViewer) {
        this.f31972a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f31972a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new ql0(this, 15)).setDuration(150L).start();
        }
    }
}
