package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class ep0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f47325a;

    public ep0(PhotoViewer photoViewer) {
        this.f47325a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f47325a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new hf0(this, 19)).setDuration(150L).start();
        }
    }
}
