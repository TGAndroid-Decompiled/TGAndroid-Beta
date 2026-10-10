package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class um0 extends lc {
    public final vm0 f31559c;

    public um0(Activity activity, String str) {
        super(activity, null);
        this.f28301b.setText(str);
        this.f28301b.setTranslationY(-1.0f);
        ImageView imageView = this.f28300a;
        vm0 vm0Var = new vm0();
        this.f31559c = vm0Var;
        imageView.setImageDrawable(vm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        vm0 vm0Var = this.f31559c;
        vm0Var.getClass();
        vm0Var.f31896g = System.currentTimeMillis();
        vm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        vm0 vm0Var = this.f31559c;
        vm0Var.f31896g = -1L;
        vm0Var.invalidateSelf();
    }
}
