package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class lm0 extends ic {
    public final mm0 f28272c;

    public lm0(Activity activity, String str) {
        super(activity, null);
        this.f27186b.setText(str);
        this.f27186b.setTranslationY(-1.0f);
        ImageView imageView = this.f27185a;
        mm0 mm0Var = new mm0();
        this.f28272c = mm0Var;
        imageView.setImageDrawable(mm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        mm0 mm0Var = this.f28272c;
        mm0Var.getClass();
        mm0Var.f28564g = System.currentTimeMillis();
        mm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        mm0 mm0Var = this.f28272c;
        mm0Var.f28564g = -1L;
        mm0Var.invalidateSelf();
    }
}
