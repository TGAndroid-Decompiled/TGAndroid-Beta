package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class wl0 extends ac {
    public final xl0 f30386c;

    public wl0(Activity activity, String str) {
        super(activity, null);
        this.f23342b.setText(str);
        this.f23342b.setTranslationY(-1.0f);
        ImageView imageView = this.f23341a;
        xl0 xl0Var = new xl0();
        this.f30386c = xl0Var;
        imageView.setImageDrawable(xl0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        xl0 xl0Var = this.f30386c;
        xl0Var.getClass();
        xl0Var.f30695g = System.currentTimeMillis();
        xl0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        xl0 xl0Var = this.f30386c;
        xl0Var.f30695g = -1L;
        xl0Var.invalidateSelf();
    }
}
