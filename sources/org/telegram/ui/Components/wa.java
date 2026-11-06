package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class wa extends FrameLayout {
    public final xa f39945a;

    public wa(xa xaVar, Context context) {
        super(context);
        this.f39945a = xaVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f39945a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f39945a.f40239b;
    }

    @Override
    public final void removeView(View view) {
        xa xaVar = this.f39945a;
        super.removeView(view);
        try {
            xaVar.dismiss();
        } catch (Exception unused) {
        }
        cc.h(xaVar.f40238a);
    }

    public void setTouchable(boolean z9) {
        xa xaVar = this.f39945a;
        WindowManager.LayoutParams layoutParams = xaVar.f40239b;
        if (layoutParams == null) {
            return;
        }
        if (!z9) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        xaVar.getWindow().setAttributes(xaVar.f40239b);
    }
}
