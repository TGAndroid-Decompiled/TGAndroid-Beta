package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class lt0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f38088a;

    public lt0(PhotoViewer photoViewer) {
        this.f38088a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f38088a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new yk0(this, 16)).setDuration(150L).start();
        }
    }
}
