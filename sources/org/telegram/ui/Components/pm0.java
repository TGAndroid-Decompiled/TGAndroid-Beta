package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class pm0 extends kc {
    public final qm0 f28059c;

    public pm0(Activity activity, String str) {
        super(activity, null);
        this.f26348b.setText(str);
        this.f26348b.setTranslationY(-1.0f);
        ImageView imageView = this.f26347a;
        qm0 qm0Var = new qm0();
        this.f28059c = qm0Var;
        imageView.setImageDrawable(qm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        qm0 qm0Var = this.f28059c;
        qm0Var.getClass();
        qm0Var.f28332g = System.currentTimeMillis();
        qm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        qm0 qm0Var = this.f28059c;
        qm0Var.f28332g = -1L;
        qm0Var.invalidateSelf();
    }
}
