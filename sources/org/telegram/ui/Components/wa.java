package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class wa extends FrameLayout {
    public final xa f39903a;

    public wa(xa xaVar, Context context) {
        super(context);
        this.f39903a = xaVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f39903a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f39903a.f40276b;
    }

    @Override
    public final void removeView(View view) {
        xa xaVar = this.f39903a;
        super.removeView(view);
        try {
            xaVar.dismiss();
        } catch (Exception unused) {
        }
        cc.h(xaVar.f40275a);
    }

    public void setTouchable(boolean z9) {
        xa xaVar = this.f39903a;
        WindowManager.LayoutParams layoutParams = xaVar.f40276b;
        if (layoutParams == null) {
            return;
        }
        if (!z9) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        xaVar.getWindow().setAttributes(xaVar.f40276b);
    }
}
