package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class mb extends FrameLayout {
    public final nb f27351a;

    public mb(nb nbVar, Context context) {
        super(context);
        this.f27351a = nbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f27351a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f27351a.f27651b;
    }

    @Override
    public final void removeView(View view) {
        nb nbVar = this.f27351a;
        super.removeView(view);
        try {
            nbVar.dismiss();
        } catch (Exception unused) {
        }
        sc.h(nbVar.f27650a);
    }

    public void setTouchable(boolean z10) {
        nb nbVar = this.f27351a;
        WindowManager.LayoutParams layoutParams = nbVar.f27651b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        nbVar.getWindow().setAttributes(nbVar.f27651b);
    }
}
