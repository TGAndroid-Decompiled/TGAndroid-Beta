package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.bf0;
public final class u5 extends FrameLayout {
    public TextView f22374a;
    public TextView f22375b;
    public bf0 f22376c;
    public AnimatorSet d;
    public m2.b e;

    public final void a(String str, int i10, float f10) {
        TextView textView = this.f22374a;
        TextView textView2 = this.f22375b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f10 > 0.0f) {
            textView2.setText("+" + ((int) f10));
        } else {
            textView2.setText("" + ((int) f10));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        bf0 bf0Var = this.f22376c;
        bf0Var.h = i10;
        bf0Var.f23666n = 100;
        bf0Var.a((int) f10, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(af0 af0Var) {
        this.f22376c.setDelegate(new h9(this, af0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f22376c.setTag(obj);
    }
}
