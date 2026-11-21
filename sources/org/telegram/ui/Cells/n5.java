package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
public final class n5 extends FrameLayout {
    public ImageView f31141a;
    public ImageView f31142b;
    public TextView f31143c;
    public int d;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), n10.C(2.0f, this.d, 1073741824));
    }

    public void setItemSize(int i7) {
        this.d = i7;
    }

    public void setType(int i7) {
        TextView textView = this.f31143c;
        ImageView imageView = this.f31142b;
        ImageView imageView2 = this.f31141a;
        if (i7 == 0) {
            imageView2.setImageResource(2131232516);
            imageView.setImageResource(2131232517);
            textView.setText(gd.N0(2131752581, null));
            imageView2.setLayoutParams(c8.ma.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(c8.ma.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(2131232518);
        imageView.setImageResource(2131232519);
        textView.setText(gd.N0(2131750459, null));
        imageView2.setLayoutParams(c8.ma.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(c8.ma.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
