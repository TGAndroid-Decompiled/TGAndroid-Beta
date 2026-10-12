package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class zm0 extends kc {
    public final an0 f33440c;

    public zm0(Activity activity, String str) {
        super(activity, null);
        this.f27821b.setText(str);
        this.f27821b.setTranslationY(-1.0f);
        ImageView imageView = this.f27820a;
        an0 an0Var = new an0();
        this.f33440c = an0Var;
        imageView.setImageDrawable(an0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        an0 an0Var = this.f33440c;
        an0Var.getClass();
        an0Var.f24446g = System.currentTimeMillis();
        an0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        an0 an0Var = this.f33440c;
        an0Var.f24446g = -1L;
        an0Var.invalidateSelf();
    }
}
