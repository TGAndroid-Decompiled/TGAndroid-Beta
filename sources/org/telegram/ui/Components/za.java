package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

public final class za extends FrameLayout {

    public final ab f35216a;

    public za(ab abVar, Context context) {
        super(context);
        this.f35216a = abVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f35216a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f35216a.f26711b;
    }

    @Override
    public final void removeView(View view) {
        ab abVar = this.f35216a;
        super.removeView(view);
        try {
            abVar.dismiss();
        } catch (Exception unused) {
        }
        ec.h(abVar.f26710a);
    }

    public void setTouchable(boolean z10) {
        ab abVar = this.f35216a;
        WindowManager.LayoutParams layoutParams = abVar.f26711b;
        if (layoutParams == null) {
            return;
        }
        if (z10) {
            layoutParams.flags &= -17;
        } else {
            layoutParams.flags |= 16;
        }
        abVar.getWindow().setAttributes(abVar.f26711b);
    }
}
