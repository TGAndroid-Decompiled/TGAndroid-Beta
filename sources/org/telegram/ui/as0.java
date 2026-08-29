package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class as0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f36594a;

    public as0(PhotoViewer photoViewer) {
        this.f36594a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f36594a.A3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new vk0(this, 16)).setDuration(150L).start();
        }
    }
}
