package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
public final class l5 extends FrameLayout {
    public ImageView f29571a;
    public ImageView f29572b;
    public TextView f29573c;
    public int d;

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), org.telegram.messenger.camera.q.B(2.0f, this.d, 1073741824));
    }

    public void setItemSize(int i3) {
        this.d = i3;
    }

    public void setType(int i3) {
        TextView textView = this.f29573c;
        ImageView imageView = this.f29572b;
        ImageView imageView2 = this.f29571a;
        if (i3 == 0) {
            imageView2.setImageResource(2131232514);
            imageView.setImageResource(2131232515);
            textView.setText(bd.M0(2131752593, null));
            imageView2.setLayoutParams(mf.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(mf.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(2131232516);
        imageView.setImageResource(2131232517);
        textView.setText(bd.M0(2131750484, null));
        imageView2.setLayoutParams(mf.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(mf.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
