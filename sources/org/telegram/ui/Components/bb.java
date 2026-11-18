package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class bb extends FrameLayout {
    public final cb f33620a;

    public bb(cb cbVar, Context context) {
        super(context);
        this.f33620a = cbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f33620a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f33620a.f33959b;
    }

    @Override
    public final void removeView(View view) {
        cb cbVar = this.f33620a;
        super.removeView(view);
        try {
            cbVar.dismiss();
        } catch (Exception unused) {
        }
        gc.h(cbVar.f33958a);
    }

    public void setTouchable(boolean z10) {
        cb cbVar = this.f33620a;
        WindowManager.LayoutParams layoutParams = cbVar.f33959b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        cbVar.getWindow().setAttributes(cbVar.f33959b);
    }
}
