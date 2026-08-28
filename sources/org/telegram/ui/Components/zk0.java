package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class zk0 extends yb {
    public final al0 f35329c;

    public zk0(Activity activity, String str) {
        super(activity, null);
        this.f34916b.setText(str);
        this.f34916b.setTranslationY(-1.0f);
        ImageView imageView = this.f34915a;
        al0 al0Var = new al0();
        this.f35329c = al0Var;
        imageView.setImageDrawable(al0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        al0 al0Var = this.f35329c;
        al0Var.getClass();
        al0Var.f26860g = System.currentTimeMillis();
        al0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        al0 al0Var = this.f35329c;
        al0Var.f26860g = -1L;
        al0Var.invalidateSelf();
    }
}
