package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.id0;
public final class s5 extends FrameLayout {
    public TextView f30268a;
    public TextView f30269b;
    public id0 f30270c;
    public AnimatorSet d;
    public m.f3 f30271e;

    public final void a(String str, int i7, float f10) {
        TextView textView = this.f30268a;
        TextView textView2 = this.f30269b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        org.telegram.messenger.g0.r(this.f30271e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f10 > 0.0f) {
            textView2.setText("+" + ((int) f10));
        } else {
            textView2.setText("" + ((int) f10));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        id0 id0Var = this.f30270c;
        id0Var.h = i7;
        id0Var.f34717n = 100;
        id0Var.a((int) f10, false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(hd0 hd0Var) {
        this.f30270c.setDelegate(new e9(this, hd0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f30270c.setTag(obj);
    }
}
