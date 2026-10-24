package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final jb f27390a;

    public ib(jb jbVar, Context context) {
        super(context);
        this.f27390a = jbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f27390a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f27390a.f27655b;
    }

    @Override
    public final void removeView(View view) {
        jb jbVar = this.f27390a;
        super.removeView(view);
        try {
            jbVar.dismiss();
        } catch (Exception unused) {
        }
        oc.h(jbVar.f27654a);
    }

    public void setTouchable(boolean z10) {
        jb jbVar = this.f27390a;
        WindowManager.LayoutParams layoutParams = jbVar.f27655b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        jbVar.getWindow().setAttributes(jbVar.f27655b);
    }
}
