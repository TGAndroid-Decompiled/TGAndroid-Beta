package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class um0 extends kc {
    public final vm0 f31641c;

    public um0(Activity activity, String str) {
        super(activity, null);
        this.f28023b.setText(str);
        this.f28023b.setTranslationY(-1.0f);
        ImageView imageView = this.f28022a;
        vm0 vm0Var = new vm0();
        this.f31641c = vm0Var;
        imageView.setImageDrawable(vm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        vm0 vm0Var = this.f31641c;
        vm0Var.getClass();
        vm0Var.f31930g = System.currentTimeMillis();
        vm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        vm0 vm0Var = this.f31641c;
        vm0Var.f31930g = -1L;
        vm0Var.invalidateSelf();
    }
}
