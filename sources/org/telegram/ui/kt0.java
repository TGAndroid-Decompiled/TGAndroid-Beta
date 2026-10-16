package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class kt0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f37514a;

    public kt0(PhotoViewer photoViewer) {
        this.f37514a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f37514a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new xk0(this, 16)).setDuration(150L).start();
        }
    }
}
