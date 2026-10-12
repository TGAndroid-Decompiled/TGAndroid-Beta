package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.bg0;
public final class v5 extends FrameLayout {
    public TextView f23314a;
    public TextView f23315b;
    public bg0 f23316c;
    public AnimatorSet d;
    public ai.r4 f23317e;

    public final void a(String str, int i10, float f7) {
        TextView textView = this.f23314a;
        TextView textView2 = this.f23315b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f23317e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f7 > 0.0f) {
            textView2.setText("+" + ((int) f7));
        } else {
            textView2.setText("" + ((int) f7));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        bg0 bg0Var = this.f23316c;
        bg0Var.h = i10;
        bg0Var.f24639n = 100;
        bg0Var.a((int) f7, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(ag0 ag0Var) {
        this.f23316c.setDelegate(new k9(this, ag0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f23316c.setTag(obj);
    }
}
