package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class et0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f37380a;

    public et0(PhotoViewer photoViewer) {
        this.f37380a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f37380a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new tk0(this, 16)).setDuration(150L).start();
        }
    }
}
