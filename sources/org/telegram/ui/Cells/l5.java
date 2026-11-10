package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.id;
public final class l5 extends FrameLayout {
    public ImageView f29529a;
    public ImageView f29530b;
    public TextView f29531c;
    public int d;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), org.telegram.messenger.camera.q.B(2.0f, this.d, 1073741824));
    }

    public void setItemSize(int i7) {
        this.d = i7;
    }

    public void setType(int i7) {
        TextView textView = this.f29531c;
        ImageView imageView = this.f29530b;
        ImageView imageView2 = this.f29529a;
        if (i7 == 0) {
            imageView2.setImageResource(2131232514);
            imageView.setImageResource(2131232515);
            textView.setText(id.M0(2131752593, null));
            imageView2.setLayoutParams(c8.ha.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(c8.ha.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(2131232516);
        imageView.setImageResource(2131232517);
        textView.setText(id.M0(2131750476, null));
        imageView2.setLayoutParams(c8.ha.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(c8.ha.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
