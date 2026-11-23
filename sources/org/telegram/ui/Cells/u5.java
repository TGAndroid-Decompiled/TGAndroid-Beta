package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.td0;
public final class u5 extends FrameLayout {
    public TextView f32055a;
    public TextView f32056b;
    public td0 f32057c;
    public AnimatorSet d;
    public j6.o f32058e;

    public final void a(String str, int i7, float f10) {
        TextView textView = this.f32055a;
        TextView textView2 = this.f32056b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        org.telegram.messenger.g0.r(this.f32058e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f10 > 0.0f) {
            textView2.setText("+" + ((int) f10));
        } else {
            textView2.setText("" + ((int) f10));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        td0 td0Var = this.f32057c;
        td0Var.h = i7;
        td0Var.f39874n = 100;
        td0Var.a((int) f10, false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(sd0 sd0Var) {
        this.f32057c.setDelegate(new f9(this, sd0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f32057c.setTag(obj);
    }
}
