package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class wl0 extends ac {
    public final xl0 f32790c;

    public wl0(Activity activity, String str) {
        super(activity, null);
        this.f25211b.setText(str);
        this.f25211b.setTranslationY(-1.0f);
        ImageView imageView = this.f25210a;
        xl0 xl0Var = new xl0();
        this.f32790c = xl0Var;
        imageView.setImageDrawable(xl0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        xl0 xl0Var = this.f32790c;
        xl0Var.getClass();
        xl0Var.f33132g = System.currentTimeMillis();
        xl0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        xl0 xl0Var = this.f32790c;
        xl0Var.f33132g = -1L;
        xl0Var.invalidateSelf();
    }
}
