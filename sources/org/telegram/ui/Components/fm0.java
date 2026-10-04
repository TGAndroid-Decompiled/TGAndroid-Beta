package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class fm0 extends jc {
    public final gm0 f26514c;

    public fm0(Activity activity, String str) {
        super(activity, null);
        this.f27721b.setText(str);
        this.f27721b.setTranslationY(-1.0f);
        ImageView imageView = this.f27720a;
        gm0 gm0Var = new gm0();
        this.f26514c = gm0Var;
        imageView.setImageDrawable(gm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        gm0 gm0Var = this.f26514c;
        gm0Var.getClass();
        gm0Var.f26893g = System.currentTimeMillis();
        gm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        gm0 gm0Var = this.f26514c;
        gm0Var.f26893g = -1L;
        gm0Var.invalidateSelf();
    }
}
