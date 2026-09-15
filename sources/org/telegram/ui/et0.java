package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class et0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f33401a;

    public et0(PhotoViewer photoViewer) {
        this.f33401a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f33401a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new pl0(this, 15)).setDuration(150L).start();
        }
    }
}
