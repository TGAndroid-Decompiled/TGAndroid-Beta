package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.ff0;
public final class w5 extends FrameLayout {
    public TextView f20661a;
    public TextView f20662b;
    public ff0 f20663c;
    public AnimatorSet d;
    public androidx.activity.i e;

    public final void a(String str, int i10, float f7) {
        TextView textView = this.f20661a;
        TextView textView2 = this.f20662b;
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
        ff0 ff0Var = this.f20663c;
        ff0Var.h = i10;
        ff0Var.f23000n = 100;
        ff0Var.a((int) f7, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(ef0 ef0Var) {
        this.f20663c.setDelegate(new o9(this, ef0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f20663c.setTag(obj);
    }
}
