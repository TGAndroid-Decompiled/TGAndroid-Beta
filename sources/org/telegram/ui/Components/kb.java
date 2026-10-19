package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class kb extends FrameLayout {
    public final lb f27800a;

    public kb(lb lbVar, Context context) {
        super(context);
        this.f27800a = lbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f27800a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f27800a.f28176b;
    }

    @Override
    public final void removeView(View view) {
        lb lbVar = this.f27800a;
        super.removeView(view);
        try {
            lbVar.dismiss();
        } catch (Exception unused) {
        }
        qc.h(lbVar.f28175a);
    }

    public void setTouchable(boolean z10) {
        lb lbVar = this.f27800a;
        WindowManager.LayoutParams layoutParams = lbVar.f28176b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        lbVar.getWindow().setAttributes(lbVar.f28176b);
    }
}
