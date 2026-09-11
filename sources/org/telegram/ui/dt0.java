package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class dt0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f35859a;

    public dt0(PhotoViewer photoViewer) {
        this.f35859a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f35859a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new rl0(this, 15)).setDuration(150L).start();
        }
    }
}
