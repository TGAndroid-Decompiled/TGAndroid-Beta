package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class zk0 extends ob {
    public final al0 f33103c;

    public zk0(Activity activity, String str) {
        super(activity, null);
        this.f29023b.setText(str);
        this.f29023b.setTranslationY(-1.0f);
        ImageView imageView = this.f29022a;
        al0 al0Var = new al0();
        this.f33103c = al0Var;
        imageView.setImageDrawable(al0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        al0 al0Var = this.f33103c;
        al0Var.getClass();
        al0Var.f24432g = System.currentTimeMillis();
        al0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        al0 al0Var = this.f33103c;
        al0Var.f24432g = -1L;
        al0Var.invalidateSelf();
    }
}
