package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class ap0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f45474a;

    public ap0(PhotoViewer photoViewer) {
        this.f45474a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f45474a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new ef0(this, 19)).setDuration(150L).start();
        }
    }
}
