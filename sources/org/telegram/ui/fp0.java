package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class fp0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f45819a;

    public fp0(PhotoViewer photoViewer) {
        this.f45819a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f45819a.D3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new hf0(this, 19)).setDuration(150L).start();
        }
    }
}
