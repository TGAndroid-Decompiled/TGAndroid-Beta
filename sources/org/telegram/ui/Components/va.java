package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class va extends FrameLayout {
    public final wa f38968a;

    public va(wa waVar, Context context) {
        super(context);
        this.f38968a = waVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f38968a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f38968a.f39936b;
    }

    @Override
    public final void removeView(View view) {
        wa waVar = this.f38968a;
        super.removeView(view);
        try {
            waVar.dismiss();
        } catch (Exception unused) {
        }
        bc.h(waVar.f39935a);
    }

    public void setTouchable(boolean z9) {
        wa waVar = this.f38968a;
        WindowManager.LayoutParams layoutParams = waVar.f39936b;
        if (layoutParams == null) {
            return;
        }
        if (!z9) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        waVar.getWindow().setAttributes(waVar.f39936b);
    }
}
