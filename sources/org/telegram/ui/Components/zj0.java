package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class zj0 extends sb {
    public final ak0 f41053c;

    public zj0(Activity activity, String str) {
        super(activity, null);
        this.f37963b.setText(str);
        this.f37963b.setTranslationY(-1.0f);
        ImageView imageView = this.f37962a;
        ak0 ak0Var = new ak0();
        this.f41053c = ak0Var;
        imageView.setImageDrawable(ak0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        ak0 ak0Var = this.f41053c;
        ak0Var.getClass();
        ak0Var.f31868g = System.currentTimeMillis();
        ak0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        ak0 ak0Var = this.f41053c;
        ak0Var.f31868g = -1L;
        ak0Var.invalidateSelf();
    }
}
