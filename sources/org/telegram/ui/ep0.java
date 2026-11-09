package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class ep0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f45484a;

    public ep0(PhotoViewer photoViewer) {
        this.f45484a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f45484a.D3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new gf0(this, 19)).setDuration(150L).start();
        }
    }
}
