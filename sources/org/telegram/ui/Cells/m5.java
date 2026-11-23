package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
public final class m5 extends FrameLayout {
    public ImageView f31152a;
    public ImageView f31153b;
    public TextView f31154c;
    public int d;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), m10.C(2.0f, this.d, 1073741824));
    }

    public void setItemSize(int i7) {
        this.d = i7;
    }

    public void setType(int i7) {
        TextView textView = this.f31154c;
        ImageView imageView = this.f31153b;
        ImageView imageView2 = this.f31152a;
        if (i7 == 0) {
            imageView2.setImageResource(2131232519);
            imageView.setImageResource(2131232520);
            textView.setText(gd.N0(2131752581, null));
            imageView2.setLayoutParams(c8.na.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(c8.na.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(2131232521);
        imageView.setImageResource(2131232522);
        textView.setText(gd.N0(2131750459, null));
        imageView2.setLayoutParams(c8.na.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(c8.na.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
