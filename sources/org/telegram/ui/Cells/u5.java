package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.we0;
public final class u5 extends FrameLayout {
    public TextView f23349a;
    public TextView f23350b;
    public we0 f23351c;
    public AnimatorSet d;
    public androidx.activity.i f23352e;

    public final void a(String str, int i10, float f7) {
        TextView textView = this.f23349a;
        TextView textView2 = this.f23350b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f23352e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f7 > 0.0f) {
            textView2.setText("+" + ((int) f7));
        } else {
            textView2.setText("" + ((int) f7));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        we0 we0Var = this.f23351c;
        we0Var.h = i10;
        we0Var.f32282n = 100;
        we0Var.a((int) f7, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(ve0 ve0Var) {
        this.f23351c.setDelegate(new m9(this, ve0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f23351c.setTag(obj);
    }
}
