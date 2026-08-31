package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class bb extends FrameLayout {
    public final cb f25555a;

    public bb(cb cbVar, Context context) {
        super(context);
        this.f25555a = cbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f25555a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f25555a.f25906b;
    }

    @Override
    public final void removeView(View view) {
        cb cbVar = this.f25555a;
        super.removeView(view);
        try {
            cbVar.dismiss();
        } catch (Exception unused) {
        }
        ic.h(cbVar.f25905a);
    }

    public void setTouchable(boolean z4) {
        cb cbVar = this.f25555a;
        WindowManager.LayoutParams layoutParams = cbVar.f25906b;
        if (layoutParams == null) {
            return;
        }
        if (!z4) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        cbVar.getWindow().setAttributes(cbVar.f25906b);
    }
}
