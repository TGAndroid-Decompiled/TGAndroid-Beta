package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class va extends FrameLayout {
    public final wa f39056a;

    public va(wa waVar, Context context) {
        super(context);
        this.f39056a = waVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f39056a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f39056a.f39977b;
    }

    @Override
    public final void removeView(View view) {
        wa waVar = this.f39056a;
        super.removeView(view);
        try {
            waVar.dismiss();
        } catch (Exception unused) {
        }
        ac.h(waVar.f39976a);
    }

    public void setTouchable(boolean z10) {
        wa waVar = this.f39056a;
        WindowManager.LayoutParams layoutParams = waVar.f39977b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        waVar.getWindow().setAttributes(waVar.f39977b);
    }
}
