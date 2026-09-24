package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.gf0;
public final class v5 extends FrameLayout {
    public TextView f21669a;
    public TextView f21670b;
    public gf0 f21671c;
    public AnimatorSet d;
    public ai.q4 e;

    public final void a(String str, int i10, float f7) {
        TextView textView = this.f21669a;
        TextView textView2 = this.f21670b;
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
        gf0 gf0Var = this.f21671c;
        gf0Var.h = i10;
        gf0Var.f24445n = 100;
        gf0Var.a((int) f7, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(ff0 ff0Var) {
        this.f21671c.setDelegate(new m9(this, ff0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f21671c.setTag(obj);
    }
}
