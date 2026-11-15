package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class ak0 extends pb {
    public final bk0 f33009c;

    public ak0(Activity activity, String str) {
        super(activity, null);
        this.f38262b.setText(str);
        this.f38262b.setTranslationY(-1.0f);
        ImageView imageView = this.f38261a;
        bk0 bk0Var = new bk0();
        this.f33009c = bk0Var;
        imageView.setImageDrawable(bk0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        bk0 bk0Var = this.f33009c;
        bk0Var.getClass();
        bk0Var.f33301g = System.currentTimeMillis();
        bk0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        bk0 bk0Var = this.f33009c;
        bk0Var.f33301g = -1L;
        bk0Var.invalidateSelf();
    }
}
