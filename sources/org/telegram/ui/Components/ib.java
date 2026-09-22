package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class ib extends FrameLayout {
    public final jb f24994a;

    public ib(jb jbVar, Context context) {
        super(context);
        this.f24994a = jbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f24994a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f24994a.f25274b;
    }

    @Override
    public final void removeView(View view) {
        jb jbVar = this.f24994a;
        super.removeView(view);
        try {
            jbVar.dismiss();
        } catch (Exception unused) {
        }
        oc.h(jbVar.f25273a);
    }

    public void setTouchable(boolean z10) {
        jb jbVar = this.f24994a;
        WindowManager.LayoutParams layoutParams = jbVar.f25274b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        jbVar.getWindow().setAttributes(jbVar.f25274b);
    }
}
