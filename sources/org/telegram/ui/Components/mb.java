package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class mb extends FrameLayout {
    public final nb f28651a;

    public mb(nb nbVar, Context context) {
        super(context);
        this.f28651a = nbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f28651a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f28651a.f29028b;
    }

    @Override
    public final void removeView(View view) {
        nb nbVar = this.f28651a;
        super.removeView(view);
        try {
            nbVar.dismiss();
        } catch (Exception unused) {
        }
        sc.h(nbVar.f29027a);
    }

    public void setTouchable(boolean z10) {
        nb nbVar = this.f28651a;
        WindowManager.LayoutParams layoutParams = nbVar.f29028b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        nbVar.getWindow().setAttributes(nbVar.f29028b);
    }
}
