package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.cd0;
public final class s5 extends FrameLayout {
    public TextView f30337a;
    public TextView f30338b;
    public cd0 f30339c;
    public AnimatorSet d;
    public mi.b0 f30340e;

    public final void a(String str, int i3, float f10) {
        TextView textView = this.f30337a;
        TextView textView2 = this.f30338b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        org.telegram.messenger.g0.r(this.f30340e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f10 > 0.0f) {
            textView2.setText("+" + ((int) f10));
        } else {
            textView2.setText("" + ((int) f10));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        cd0 cd0Var = this.f30339c;
        cd0Var.h = i3;
        cd0Var.f32694n = 100;
        cd0Var.a((int) f10, false);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(bd0 bd0Var) {
        this.f30339c.setDelegate(new d9(this, bd0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f30339c.setTag(obj);
    }
}
