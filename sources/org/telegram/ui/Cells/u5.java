package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.pf0;
public final class u5 extends FrameLayout {
    public TextView f23591a;
    public TextView f23592b;
    public pf0 f23593c;
    public AnimatorSet d;
    public androidx.activity.i e;

    public final void a(String str, int i10, float f7) {
        TextView textView = this.f23591a;
        TextView textView2 = this.f23592b;
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
        pf0 pf0Var = this.f23593c;
        pf0Var.h = i10;
        pf0Var.f29285n = 100;
        pf0Var.a((int) f7, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(of0 of0Var) {
        this.f23593c.setDelegate(new j9(this, of0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f23593c.setTag(obj);
    }
}
