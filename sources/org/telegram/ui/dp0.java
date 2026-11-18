package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class dp0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f47034a;

    public dp0(PhotoViewer photoViewer) {
        this.f47034a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f47034a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new hf0(this, 19)).setDuration(150L).start();
        }
    }
}
