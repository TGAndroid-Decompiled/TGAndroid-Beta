package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class cm0 extends jc {
    public final dm0 f23364c;

    public cm0(Activity activity, String str) {
        super(activity, null);
        this.f25401b.setText(str);
        this.f25401b.setTranslationY(-1.0f);
        ImageView imageView = this.f25400a;
        dm0 dm0Var = new dm0();
        this.f23364c = dm0Var;
        imageView.setImageDrawable(dm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        dm0 dm0Var = this.f23364c;
        dm0Var.getClass();
        dm0Var.f23683g = System.currentTimeMillis();
        dm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        dm0 dm0Var = this.f23364c;
        dm0Var.f23683g = -1L;
        dm0Var.invalidateSelf();
    }
}
