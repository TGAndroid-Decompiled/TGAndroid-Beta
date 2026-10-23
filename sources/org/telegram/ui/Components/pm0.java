package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class pm0 extends ic {
    public final qm0 f29599c;

    public pm0(Activity activity, String str) {
        super(activity, null);
        this.f27279b.setText(str);
        this.f27279b.setTranslationY(-1.0f);
        ImageView imageView = this.f27278a;
        qm0 qm0Var = new qm0();
        this.f29599c = qm0Var;
        imageView.setImageDrawable(qm0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        qm0 qm0Var = this.f29599c;
        qm0Var.getClass();
        qm0Var.f29947g = System.currentTimeMillis();
        qm0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        qm0 qm0Var = this.f29599c;
        qm0Var.f29947g = -1L;
        qm0Var.invalidateSelf();
    }
}
