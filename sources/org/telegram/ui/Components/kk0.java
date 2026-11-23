package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class kk0 extends xb {
    public final lk0 f36771c;

    public kk0(Activity activity, String str) {
        super(activity, null);
        this.f41967b.setText(str);
        this.f41967b.setTranslationY(-1.0f);
        ImageView imageView = this.f41966a;
        lk0 lk0Var = new lk0();
        this.f36771c = lk0Var;
        imageView.setImageDrawable(lk0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        lk0 lk0Var = this.f36771c;
        lk0Var.getClass();
        lk0Var.f37154g = System.currentTimeMillis();
        lk0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        lk0 lk0Var = this.f36771c;
        lk0Var.f37154g = -1L;
        lk0Var.invalidateSelf();
    }
}
