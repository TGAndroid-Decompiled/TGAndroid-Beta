package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qf0;
public final class z5 extends FrameLayout {
    public TextView f25788a;
    public TextView f25789b;
    public qf0 f25790c;
    public AnimatorSet d;
    public m.g3 e;

    public final void a(String str, int i10, float f7) {
        TextView textView = this.f25788a;
        TextView textView2 = this.f25789b;
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
        qf0 qf0Var = this.f25790c;
        qf0Var.h = i10;
        qf0Var.f31914n = 100;
        qf0Var.a((int) f7, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(pf0 pf0Var) {
        this.f25790c.setDelegate(new o9(this, pf0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f25790c.setTag(obj);
    }
}
