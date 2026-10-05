package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class fm0 extends jc {
    public final gm0 f26526c;

    public fm0(Activity activity, String str) {
        super(activity, null);
        this.f27793b.setText(str);
        this.f27793b.setTranslationY(-1.0f);
        ImageView imageView = this.f27792a;
        gm0 gm0Var = new gm0();
        this.f26526c = gm0Var;
        imageView.setImageDrawable(gm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        gm0 gm0Var = this.f26526c;
        gm0Var.getClass();
        gm0Var.f26947g = System.currentTimeMillis();
        gm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        gm0 gm0Var = this.f26526c;
        gm0Var.f26947g = -1L;
        gm0Var.invalidateSelf();
    }
}
