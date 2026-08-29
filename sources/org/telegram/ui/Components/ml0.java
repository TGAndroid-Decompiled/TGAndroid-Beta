package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class ml0 extends ec {
    public final nl0 f30725c;

    public ml0(Activity activity, String str) {
        super(activity, null);
        this.f28000b.setText(str);
        this.f28000b.setTranslationY(-1.0f);
        ImageView imageView = this.f27999a;
        nl0 nl0Var = new nl0();
        this.f30725c = nl0Var;
        imageView.setImageDrawable(nl0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        nl0 nl0Var = this.f30725c;
        nl0Var.getClass();
        nl0Var.f31090g = System.currentTimeMillis();
        nl0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        nl0 nl0Var = this.f30725c;
        nl0Var.f31090g = -1L;
        nl0Var.invalidateSelf();
    }
}
