package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class ks0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f38511a;

    public ks0(PhotoViewer photoViewer) {
        this.f38511a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f38511a.B3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new gl0(this, 16)).setDuration(150L).start();
        }
    }
}
