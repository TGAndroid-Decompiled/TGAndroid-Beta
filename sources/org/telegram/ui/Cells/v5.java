package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.cf0;
public final class v5 extends FrameLayout {
    public TextView f24315a;
    public TextView f24316b;
    public cf0 f24317c;
    public AnimatorSet d;
    public m2.b f24318e;

    public final void a(String str, int i10, float f10) {
        TextView textView = this.f24315a;
        TextView textView2 = this.f24316b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f24318e);
        textView2.setTag(null);
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        if (f10 > 0.0f) {
            textView2.setText("+" + ((int) f10));
        } else {
            textView2.setText("" + ((int) f10));
        }
        textView2.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        cf0 cf0Var = this.f24317c;
        cf0Var.h = i10;
        cf0Var.f25922n = 100;
        cf0Var.a((int) f10, false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setSeekBarDelegate(bf0 bf0Var) {
        this.f24317c.setDelegate(new i9(this, bf0Var));
    }

    @Override
    public void setTag(Object obj) {
        super.setTag(obj);
        this.f24317c.setTag(obj);
    }
}
