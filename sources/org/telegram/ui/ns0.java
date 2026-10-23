package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class ns0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f39986a;

    public ns0(PhotoViewer photoViewer) {
        this.f39986a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f39986a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new oj0(this, 17)).setDuration(150L).start();
        }
    }
}
