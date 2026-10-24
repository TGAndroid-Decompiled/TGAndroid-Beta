package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.sf0;
public final class v5 extends FrameLayout {
    public TextView f23845a;
    public TextView f23846b;
    public sf0 f23847c;
    public AnimatorSet d;
    public u5 e;

    public final void a(String str, int i10, float f7) {
        TextView textView = this.f23845a;
        TextView textView2 = this.f23846b;
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
        sf0 sf0Var = this.f23847c;
        sf0Var.h = i10;
        sf0Var.f30493n = 100;
        sf0Var.a((int) f7, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(rf0 rf0Var) {
        this.f23847c.setDelegate(new k9(this, rf0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f23847c.setTag(obj);
    }
}
