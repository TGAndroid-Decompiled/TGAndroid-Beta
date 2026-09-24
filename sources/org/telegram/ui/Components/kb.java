package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class kb extends FrameLayout {
    public final lb f25723a;

    public kb(lb lbVar, Context context) {
        super(context);
        this.f25723a = lbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f25723a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f25723a.f26049b;
    }

    @Override
    public final void removeView(View view) {
        lb lbVar = this.f25723a;
        super.removeView(view);
        try {
            lbVar.dismiss();
        } catch (Exception unused) {
        }
        qc.h(lbVar.f26048a);
    }

    public void setTouchable(boolean z10) {
        lb lbVar = this.f25723a;
        WindowManager.LayoutParams layoutParams = lbVar.f26049b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        lbVar.getWindow().setAttributes(lbVar.f26049b);
    }
}
