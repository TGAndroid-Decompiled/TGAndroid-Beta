package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.de0;
public final class x5 extends FrameLayout {
    public TextView f23581a;
    public TextView f23582b;
    public de0 f23583c;
    public AnimatorSet d;
    public mg.c2 e;

    public final void a(String str, int i10, float f7) {
        TextView textView = this.f23581a;
        TextView textView2 = this.f23582b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        org.telegram.messenger.i0.r(this.e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f7 > 0.0f) {
            textView2.setText("+" + ((int) f7));
        } else {
            textView2.setText("" + ((int) f7));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        de0 de0Var = this.f23583c;
        de0Var.h = i10;
        de0Var.f25401n = 100;
        de0Var.a((int) f7, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(ce0 ce0Var) {
        this.f23583c.setDelegate(new g9(this, ce0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f23583c.setTag(obj);
    }
}
