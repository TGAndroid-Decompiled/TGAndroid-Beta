package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class kb extends FrameLayout {
    public final lb f25667a;

    public kb(lb lbVar, Context context) {
        super(context);
        this.f25667a = lbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f25667a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f25667a.f25964b;
    }

    @Override
    public final void removeView(View view) {
        lb lbVar = this.f25667a;
        super.removeView(view);
        try {
            lbVar.dismiss();
        } catch (Exception unused) {
        }
        qc.h(lbVar.f25963a);
    }

    public void setTouchable(boolean z10) {
        lb lbVar = this.f25667a;
        WindowManager.LayoutParams layoutParams = lbVar.f25964b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        lbVar.getWindow().setAttributes(lbVar.f25964b);
    }
}
