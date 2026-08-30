package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class is0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f35160a;

    public is0(PhotoViewer photoViewer) {
        this.f35160a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f35160a.B3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new el0(this, 16)).setDuration(150L).start();
        }
    }
}
