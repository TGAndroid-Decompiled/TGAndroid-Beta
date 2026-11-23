package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class dp0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f47026a;

    public dp0(PhotoViewer photoViewer) {
        this.f47026a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f47026a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new hf0(this, 19)).setDuration(150L).start();
        }
    }
}
