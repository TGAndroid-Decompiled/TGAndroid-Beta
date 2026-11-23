package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
public final class n5 extends FrameLayout {
    public ImageView f31110a;
    public ImageView f31111b;
    public TextView f31112c;
    public int d;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), o10.C(2.0f, this.d, 1073741824));
    }

    public void setItemSize(int i7) {
        this.d = i7;
    }

    public void setType(int i7) {
        TextView textView = this.f31112c;
        ImageView imageView = this.f31111b;
        ImageView imageView2 = this.f31110a;
        if (i7 == 0) {
            imageView2.setImageResource(2131232516);
            imageView.setImageResource(2131232517);
            textView.setText(hd.N0(2131752581, null));
            imageView2.setLayoutParams(c8.na.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(c8.na.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(2131232518);
        imageView.setImageResource(2131232519);
        textView.setText(hd.N0(2131750459, null));
        imageView2.setLayoutParams(c8.na.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(c8.na.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
