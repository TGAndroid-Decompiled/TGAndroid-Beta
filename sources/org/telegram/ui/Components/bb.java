package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class bb extends FrameLayout {
    public final cb f25566a;

    public bb(cb cbVar, Context context) {
        super(context);
        this.f25566a = cbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f25566a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f25566a.f25883b;
    }

    @Override
    public final void removeView(View view) {
        cb cbVar = this.f25566a;
        super.removeView(view);
        try {
            cbVar.dismiss();
        } catch (Exception unused) {
        }
        ic.h(cbVar.f25882a);
    }

    public void setTouchable(boolean z4) {
        cb cbVar = this.f25566a;
        WindowManager.LayoutParams layoutParams = cbVar.f25883b;
        if (layoutParams == null) {
            return;
        }
        if (!z4) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        cbVar.getWindow().setAttributes(cbVar.f25883b);
    }
}
