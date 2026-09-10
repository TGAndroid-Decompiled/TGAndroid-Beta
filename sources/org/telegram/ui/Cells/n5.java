package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
public final class n5 extends FrameLayout {
    public ImageView f19569a;
    public ImageView f19570b;
    public TextView f19571c;
    public int d;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), em.C(2.0f, this.d, 1073741824));
    }

    public void setItemSize(int i10) {
        this.d = i10;
    }

    public void setType(int i10) {
        TextView textView = this.f19571c;
        ImageView imageView = this.f19570b;
        ImageView imageView2 = this.f19569a;
        if (i10 == 0) {
            imageView2.setImageResource(R.drawable.permissions_camera1);
            imageView.setImageResource(R.drawable.permissions_camera2);
            textView.setText(LocaleController.getString(R.string.CameraPermissionText));
            imageView2.setLayoutParams(w7.a6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(w7.a6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(R.drawable.permissions_gallery1);
        imageView.setImageResource(R.drawable.permissions_gallery2);
        textView.setText(LocaleController.getString(R.string.GalleryPermissionText));
        imageView2.setLayoutParams(w7.a6.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(w7.a6.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
