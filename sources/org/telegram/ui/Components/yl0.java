package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class yl0 extends hc {
    public final zl0 f29451c;

    public yl0(Activity activity, String str) {
        super(activity, null);
        this.f23574b.setText(str);
        this.f23574b.setTranslationY(-1.0f);
        ImageView imageView = this.f23573a;
        zl0 zl0Var = new zl0();
        this.f29451c = zl0Var;
        imageView.setImageDrawable(zl0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        zl0 zl0Var = this.f29451c;
        zl0Var.getClass();
        zl0Var.f29723g = System.currentTimeMillis();
        zl0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        zl0 zl0Var = this.f29451c;
        zl0Var.f29723g = -1L;
        zl0Var.invalidateSelf();
    }
}
