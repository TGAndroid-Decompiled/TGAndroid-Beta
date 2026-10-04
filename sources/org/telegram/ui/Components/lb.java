package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class lb extends FrameLayout {
    public final mb f28326a;

    public lb(mb mbVar, Context context) {
        super(context);
        this.f28326a = mbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f28326a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f28326a.f28567b;
    }

    @Override
    public final void removeView(View view) {
        mb mbVar = this.f28326a;
        super.removeView(view);
        try {
            mbVar.dismiss();
        } catch (Exception unused) {
        }
        rc.h(mbVar.f28566a);
    }

    public void setTouchable(boolean z10) {
        mb mbVar = this.f28326a;
        WindowManager.LayoutParams layoutParams = mbVar.f28567b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        mbVar.getWindow().setAttributes(mbVar.f28567b);
    }
}
