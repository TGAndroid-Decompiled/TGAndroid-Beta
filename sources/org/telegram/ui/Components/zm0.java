package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class zm0 extends kc {
    public final an0 f33438c;

    public zm0(Activity activity, String str) {
        super(activity, null);
        this.f27818b.setText(str);
        this.f27818b.setTranslationY(-1.0f);
        ImageView imageView = this.f27817a;
        an0 an0Var = new an0();
        this.f33438c = an0Var;
        imageView.setImageDrawable(an0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        an0 an0Var = this.f33438c;
        an0Var.getClass();
        an0Var.f24449g = System.currentTimeMillis();
        an0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        an0 an0Var = this.f33438c;
        an0Var.f24449g = -1L;
        an0Var.invalidateSelf();
    }
}
