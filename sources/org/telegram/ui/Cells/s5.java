package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.ie0;

public final class s5 extends FrameLayout {

    public TextView f25633a;

    public TextView f25634b;

    public ie0 f25635c;
    public AnimatorSet d;

    public m.i3 f25636e;

    public final void a(String str, int i10, float f10) {
        TextView textView = this.f25633a;
        TextView textView2 = this.f25634b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f25636e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f10 > 0.0f) {
            textView2.setText("+" + ((int) f10));
        } else {
            textView2.setText("" + ((int) f10));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        ie0 ie0Var = this.f25635c;
        ie0Var.h = i10;
        ie0Var.f29346n = 100;
        ie0Var.a((int) f10, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(he0 he0Var) {
        this.f25635c.setDelegate(new f9(this, he0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f25635c.setTag(obj);
    }
}
