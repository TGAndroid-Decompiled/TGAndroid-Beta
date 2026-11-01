package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
public final class q5 extends FrameLayout {
    public ImageView f22832a;
    public ImageView f22833b;
    public TextView f22834c;
    public int d;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), a30.B(2.0f, this.d, 1073741824));
    }

    public void setItemSize(int i10) {
        this.d = i10;
    }

    public void setType(int i10) {
        TextView textView = this.f22834c;
        ImageView imageView = this.f22833b;
        ImageView imageView2 = this.f22832a;
        if (i10 == 0) {
            imageView2.setImageResource(2131232513);
            imageView.setImageResource(2131232514);
            textView.setText(dd.L0(2131752593, null));
            imageView2.setLayoutParams(w7.b6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(w7.b6.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(2131232515);
        imageView.setImageResource(2131232516);
        textView.setText(dd.L0(2131750485, null));
        imageView2.setLayoutParams(w7.b6.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(w7.b6.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
