package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class mb extends FrameLayout {
    public final nb f28525a;

    public mb(nb nbVar, Context context) {
        super(context);
        this.f28525a = nbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f28525a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f28525a.f28772b;
    }

    @Override
    public final void removeView(View view) {
        nb nbVar = this.f28525a;
        super.removeView(view);
        try {
            nbVar.dismiss();
        } catch (Exception unused) {
        }
        sc.h(nbVar.f28771a);
    }

    public void setTouchable(boolean z10) {
        nb nbVar = this.f28525a;
        WindowManager.LayoutParams layoutParams = nbVar.f28772b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        nbVar.getWindow().setAttributes(nbVar.f28772b);
    }
}
