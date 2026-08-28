package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.de0;
public final class v5 extends FrameLayout {
    public TextView f25792a;
    public TextView f25793b;
    public de0 f25794c;
    public AnimatorSet d;
    public m.i3 f25795e;

    public final void a(String str, int i9, float f10) {
        TextView textView = this.f25792a;
        TextView textView2 = this.f25793b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f25795e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f10 > 0.0f) {
            textView2.setText("+" + ((int) f10));
        } else {
            textView2.setText("" + ((int) f10));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        de0 de0Var = this.f25794c;
        de0Var.h = i9;
        de0Var.f27729n = 100;
        de0Var.a((int) f10, false);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(ce0 ce0Var) {
        this.f25794c.setDelegate(new j9(this, ce0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f25794c.setTag(obj);
    }
}
