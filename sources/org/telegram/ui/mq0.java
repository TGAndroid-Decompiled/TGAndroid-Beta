package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class mq0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f39752a;

    public mq0(PhotoViewer photoViewer) {
        this.f39752a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f39752a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new mg0(this, 19)).setDuration(150L).start();
        }
    }
}
