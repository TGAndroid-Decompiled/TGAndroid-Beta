package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.re0;
public final class t5 extends FrameLayout {
    public TextView f25700a;
    public TextView f25701b;
    public re0 f25702c;
    public AnimatorSet d;
    public lh.m7 f25703e;

    public final void a(String str, int i10, float f9) {
        TextView textView = this.f25700a;
        TextView textView2 = this.f25701b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f25703e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f9 > 0.0f) {
            textView2.setText("+" + ((int) f9));
        } else {
            textView2.setText("" + ((int) f9));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        re0 re0Var = this.f25702c;
        re0Var.h = i10;
        re0Var.f32278n = 100;
        re0Var.a((int) f9, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(qe0 qe0Var) {
        this.f25702c.setDelegate(new g9(this, qe0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f25702c.setTag(obj);
    }
}
