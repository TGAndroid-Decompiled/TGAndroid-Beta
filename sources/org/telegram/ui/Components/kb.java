package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class kb extends FrameLayout {
    public final lb f27836a;

    public kb(lb lbVar, Context context) {
        super(context);
        this.f27836a = lbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f27836a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f27836a.f28134b;
    }

    @Override
    public final void removeView(View view) {
        lb lbVar = this.f27836a;
        super.removeView(view);
        try {
            lbVar.dismiss();
        } catch (Exception unused) {
        }
        qc.h(lbVar.f28133a);
    }

    public void setTouchable(boolean z10) {
        lb lbVar = this.f27836a;
        WindowManager.LayoutParams layoutParams = lbVar.f28134b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        lbVar.getWindow().setAttributes(lbVar.f28134b);
    }
}
