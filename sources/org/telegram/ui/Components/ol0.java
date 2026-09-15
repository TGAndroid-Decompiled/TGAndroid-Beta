package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class ol0 extends gc {
    public final pl0 f26839c;

    public ol0(Activity activity, String str) {
        super(activity, null);
        this.f24297b.setText(str);
        this.f24297b.setTranslationY(-1.0f);
        ImageView imageView = this.f24296a;
        pl0 pl0Var = new pl0();
        this.f26839c = pl0Var;
        imageView.setImageDrawable(pl0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        pl0 pl0Var = this.f26839c;
        pl0Var.getClass();
        pl0Var.f27083g = System.currentTimeMillis();
        pl0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        pl0 pl0Var = this.f26839c;
        pl0Var.f27083g = -1L;
        pl0Var.invalidateSelf();
    }
}
