package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;

public final class cs0 implements DialogInterface.OnDismissListener {

    public final PhotoViewer f37146a;

    public cs0(PhotoViewer photoViewer) {
        this.f37146a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f37146a.A3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new zk0(this, 16)).setDuration(150L).start();
        }
    }
}
