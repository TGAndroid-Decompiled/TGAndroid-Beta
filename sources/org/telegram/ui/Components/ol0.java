package org.telegram.ui.Components;

import android.app.Activity;
import android.widget.ImageView;
public final class ol0 extends ic {
    public final pl0 f29135c;

    public ol0(Activity activity, String str) {
        super(activity, null);
        this.f27097b.setText(str);
        this.f27097b.setTranslationY(-1.0f);
        ImageView imageView = this.f27096a;
        pl0 pl0Var = new pl0();
        this.f29135c = pl0Var;
        imageView.setImageDrawable(pl0Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        pl0 pl0Var = this.f29135c;
        pl0Var.getClass();
        pl0Var.f29451g = System.currentTimeMillis();
        pl0Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        pl0 pl0Var = this.f29135c;
        pl0Var.f29451g = -1L;
        pl0Var.invalidateSelf();
    }
}
