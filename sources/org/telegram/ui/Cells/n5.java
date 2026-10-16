package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sk;
public final class n5 extends FrameLayout {
    public ImageView f21271a;
    public ImageView f21272b;
    public TextView f21273c;
    public int d;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), sk.C(2.0f, this.d, 1073741824));
    }

    public void setItemSize(int i10) {
        this.d = i10;
    }

    public void setType(int i10) {
        TextView textView = this.f21273c;
        ImageView imageView = this.f21272b;
        ImageView imageView2 = this.f21271a;
        if (i10 == 0) {
            imageView2.setImageResource(R.drawable.permissions_camera1);
            imageView.setImageResource(R.drawable.permissions_camera2);
            textView.setText(LocaleController.getString(R.string.CameraPermissionText));
            imageView2.setLayoutParams(w7.z5.a(44.0f, 5.0f, 0.0f, 0.0f, 27.0f, 44, 17));
            imageView.setLayoutParams(w7.z5.a(44.0f, 5.0f, 0.0f, 0.0f, 27.0f, 44, 17));
            return;
        }
        imageView2.setImageResource(R.drawable.permissions_gallery1);
        imageView.setImageResource(R.drawable.permissions_gallery2);
        textView.setText(LocaleController.getString(R.string.GalleryPermissionText));
        imageView2.setLayoutParams(w7.z5.a(44.0f, 0.0f, 0.0f, 2.0f, 27.0f, 44, 17));
        imageView.setLayoutParams(w7.z5.a(44.0f, 0.0f, 0.0f, 2.0f, 27.0f, 44, 17));
    }
}
