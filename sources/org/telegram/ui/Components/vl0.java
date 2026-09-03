package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class vl0 extends ac {
    public final wl0 f29505c;

    public vl0(Activity activity, String str) {
        super(activity, null);
        this.f23359b.setText(str);
        this.f23359b.setTranslationY(-1.0f);
        ImageView imageView = this.f23358a;
        wl0 wl0Var = new wl0();
        this.f29505c = wl0Var;
        imageView.setImageDrawable(wl0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        wl0 wl0Var = this.f29505c;
        wl0Var.getClass();
        wl0Var.f30312g = System.currentTimeMillis();
        wl0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        wl0 wl0Var = this.f29505c;
        wl0Var.f30312g = -1L;
        wl0Var.invalidateSelf();
    }
}
