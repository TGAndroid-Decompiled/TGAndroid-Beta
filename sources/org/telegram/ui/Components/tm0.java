package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class tm0 extends ic {
    public final um0 f33110c;

    public tm0(Activity activity, String str) {
        super(activity, null);
        this.f29300b.setText(str);
        this.f29300b.setTranslationY(-1.0f);
        ImageView imageView = this.f29299a;
        um0 um0Var = new um0();
        this.f33110c = um0Var;
        imageView.setImageDrawable(um0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        um0 um0Var = this.f33110c;
        um0Var.getClass();
        um0Var.f33432g = System.currentTimeMillis();
        um0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        um0 um0Var = this.f33110c;
        um0Var.f33432g = -1L;
        um0Var.invalidateSelf();
    }
}
