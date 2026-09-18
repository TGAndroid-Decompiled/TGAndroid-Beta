package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final jb f24922a;

    public ib(jb jbVar, Context context) {
        super(context);
        this.f24922a = jbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f24922a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f24922a.f25202b;
    }

    @Override
    public final void removeView(View view) {
        jb jbVar = this.f24922a;
        super.removeView(view);
        try {
            jbVar.dismiss();
        } catch (Exception unused) {
        }
        oc.h(jbVar.f25201a);
    }

    public void setTouchable(boolean z10) {
        jb jbVar = this.f24922a;
        WindowManager.LayoutParams layoutParams = jbVar.f25202b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        jbVar.getWindow().setAttributes(jbVar.f25202b);
    }
}
