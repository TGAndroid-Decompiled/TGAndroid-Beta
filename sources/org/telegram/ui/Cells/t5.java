package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.sd0;
public final class t5 extends FrameLayout {
    public TextView f31976a;
    public TextView f31977b;
    public sd0 f31978c;
    public AnimatorSet d;
    public j6.o f31979e;

    public final void a(String str, int i7, float f10) {
        TextView textView = this.f31976a;
        TextView textView2 = this.f31977b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        org.telegram.messenger.g0.r(this.f31979e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f10 > 0.0f) {
            textView2.setText("+" + ((int) f10));
        } else {
            textView2.setText("" + ((int) f10));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        sd0 sd0Var = this.f31978c;
        sd0Var.h = i7;
        sd0Var.f39611n = 100;
        sd0Var.a((int) f10, false);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(rd0 rd0Var) {
        this.f31978c.setDelegate(new e9(this, rd0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f31978c.setTag(obj);
    }
}
