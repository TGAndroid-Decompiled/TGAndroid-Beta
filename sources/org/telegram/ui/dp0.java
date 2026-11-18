package org.telegram.ui;

import android.content.DialogInterface;
import android.widget.ImageView;
public final class dp0 implements DialogInterface.OnDismissListener {
    public final PhotoViewer f46957a;

    public dp0(PhotoViewer photoViewer) {
        this.f46957a = photoViewer;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ImageView imageView = this.f46957a.E3;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).withEndAction(new if0(this, 19)).setDuration(150L).start();
        }
    }
}
