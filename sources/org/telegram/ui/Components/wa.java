package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class wa extends FrameLayout {
    public final xa f39953a;

    public wa(xa xaVar, Context context) {
        super(context);
        this.f39953a = xaVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f39953a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f39953a.f40255b;
    }

    @Override
    public final void removeView(View view) {
        xa xaVar = this.f39953a;
        super.removeView(view);
        try {
            xaVar.dismiss();
        } catch (Exception unused) {
        }
        cc.h(xaVar.f40254a);
    }

    public void setTouchable(boolean z9) {
        xa xaVar = this.f39953a;
        WindowManager.LayoutParams layoutParams = xaVar.f40255b;
        if (layoutParams == null) {
            return;
        }
        if (!z9) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        xaVar.getWindow().setAttributes(xaVar.f40255b);
    }
}
