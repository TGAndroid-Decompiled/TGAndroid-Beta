package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class gt0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f34042a;

    public gt0(PhotoViewer photoViewer) {
        this.f34042a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f34042a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new sl0(this, 15)).setDuration(150L).start();
        }
    }
}
