package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.rf0;
public final class z5 extends FrameLayout {
    public TextView f25790a;
    public TextView f25791b;
    public rf0 f25792c;
    public AnimatorSet d;
    public m.g3 e;

    public final void a(String str, int i10, float f7) {
        TextView textView = this.f25790a;
        TextView textView2 = this.f25791b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f7 > 0.0f) {
            textView2.setText("+" + ((int) f7));
        } else {
            textView2.setText("" + ((int) f7));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        rf0 rf0Var = this.f25792c;
        rf0Var.h = i10;
        rf0Var.f32247n = 100;
        rf0Var.a((int) f7, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(qf0 qf0Var) {
        this.f25792c.setDelegate(new o9(this, qf0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f25792c.setTag(obj);
    }
}
