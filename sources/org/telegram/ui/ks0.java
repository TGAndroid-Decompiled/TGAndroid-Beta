package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class ks0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f38667a;

    public ks0(PhotoViewer photoViewer) {
        this.f38667a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f38667a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new ck0(this, 16)).setDuration(150L).start();
        }
    }
}
