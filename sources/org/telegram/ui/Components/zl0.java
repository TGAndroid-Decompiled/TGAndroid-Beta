package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class zl0 extends ic {
    public final am0 f30919c;

    public zl0(Activity activity, String str) {
        super(activity, null);
        this.f24983b.setText(str);
        this.f24983b.setTranslationY(-1.0f);
        ImageView imageView = this.f24982a;
        am0 am0Var = new am0();
        this.f30919c = am0Var;
        imageView.setImageDrawable(am0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        am0 am0Var = this.f30919c;
        am0Var.getClass();
        am0Var.f22714g = System.currentTimeMillis();
        am0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        am0 am0Var = this.f30919c;
        am0Var.f22714g = -1L;
        am0Var.invalidateSelf();
    }
}
