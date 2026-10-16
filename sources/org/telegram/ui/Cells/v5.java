package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.wf0;
public final class v5 extends FrameLayout {
    public TextView f22272a;
    public TextView f22273b;
    public wf0 f22274c;
    public AnimatorSet d;
    public androidx.activity.i e;

    public final void a(String str, int i10, float f7) {
        TextView textView = this.f22272a;
        TextView textView2 = this.f22273b;
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
        wf0 wf0Var = this.f22274c;
        wf0Var.h = i10;
        wf0Var.f30544n = 100;
        wf0Var.a((int) f7, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(vf0 vf0Var) {
        this.f22274c.setDelegate(new k9(this, vf0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f22274c.setTag(obj);
    }
}
