package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class sa extends FrameLayout {
    public final ta f39263a;

    public sa(ta taVar, Context context) {
        super(context);
        this.f39263a = taVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f39263a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f39263a.f39620b;
    }

    @Override
    public final void removeView(View view) {
        ta taVar = this.f39263a;
        super.removeView(view);
        try {
            taVar.dismiss();
        } catch (Exception unused) {
        }
        xb.h(taVar.f39619a);
    }

    public void setTouchable(boolean z10) {
        ta taVar = this.f39263a;
        WindowManager.LayoutParams layoutParams = taVar.f39620b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        taVar.getWindow().setAttributes(taVar.f39620b);
    }
}
