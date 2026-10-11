package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class dt0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f37127a;

    public dt0(PhotoViewer photoViewer) {
        this.f37127a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f37127a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new sk0(this, 16)).setDuration(150L).start();
        }
    }
}
