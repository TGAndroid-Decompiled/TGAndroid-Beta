package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wf0;
import org.telegram.ui.Components.xf0;
public final class v5 extends FrameLayout {
    public TextView f23542a;
    public TextView f23543b;
    public xf0 f23544c;
    public AnimatorSet d;
    public ai.r4 f23545e;

    public final void a(String str, int i10, float f7) {
        TextView textView = this.f23542a;
        TextView textView2 = this.f23543b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f23545e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f7 > 0.0f) {
            textView2.setText("+" + ((int) f7));
        } else {
            textView2.setText("" + ((int) f7));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        xf0 xf0Var = this.f23544c;
        xf0Var.h = i10;
        xf0Var.f32826n = 100;
        xf0Var.a((int) f7, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(wf0 wf0Var) {
        this.f23544c.setDelegate(new k9(this, wf0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f23544c.setTag(obj);
    }
}
