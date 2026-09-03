package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class ps0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f40122a;

    public ps0(PhotoViewer photoViewer) {
        this.f40122a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f40122a.B3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new gl0(this, 15)).setDuration(150L).start();
        }
    }
}
