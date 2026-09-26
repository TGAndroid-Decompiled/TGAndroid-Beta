package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class am0 extends ic {
    public final bm0 f22694c;

    public am0(Activity activity, String str) {
        super(activity, null);
        this.f25047b.setText(str);
        this.f25047b.setTranslationY(-1.0f);
        ImageView imageView = this.f25046a;
        bm0 bm0Var = new bm0();
        this.f22694c = bm0Var;
        imageView.setImageDrawable(bm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        bm0 bm0Var = this.f22694c;
        bm0Var.getClass();
        bm0Var.f23065g = System.currentTimeMillis();
        bm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        bm0 bm0Var = this.f22694c;
        bm0Var.f23065g = -1L;
        bm0Var.invalidateSelf();
    }
}
