package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class xl0 extends ac {
    public final yl0 f33134c;

    public xl0(Activity activity, String str) {
        super(activity, null);
        this.f25219b.setText(str);
        this.f25219b.setTranslationY(-1.0f);
        ImageView imageView = this.f25218a;
        yl0 yl0Var = new yl0();
        this.f33134c = yl0Var;
        imageView.setImageDrawable(yl0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        yl0 yl0Var = this.f33134c;
        yl0Var.getClass();
        yl0Var.f33542g = System.currentTimeMillis();
        yl0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        yl0 yl0Var = this.f33134c;
        yl0Var.f33542g = -1L;
        yl0Var.invalidateSelf();
    }
}
