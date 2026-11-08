package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.hd0;
public final class s5 extends FrameLayout {
    public TextView f30264a;
    public TextView f30265b;
    public hd0 f30266c;
    public AnimatorSet d;
    public m.f3 f30267e;

    public final void a(String str, int i7, float f10) {
        TextView textView = this.f30264a;
        TextView textView2 = this.f30265b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        org.telegram.messenger.g0.r(this.f30267e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f10 > 0.0f) {
            textView2.setText("+" + ((int) f10));
        } else {
            textView2.setText("" + ((int) f10));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        hd0 hd0Var = this.f30266c;
        hd0Var.h = i7;
        hd0Var.f34228n = 100;
        hd0Var.a((int) f10, false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(gd0 gd0Var) {
        this.f30266c.setDelegate(new e9(this, gd0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f30266c.setTag(obj);
    }
}
