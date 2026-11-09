package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class wa extends FrameLayout {
    public final xa f40017a;

    public wa(xa xaVar, Context context) {
        super(context);
        this.f40017a = xaVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f40017a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f40017a.f40351b;
    }

    @Override
    public final void removeView(View view) {
        xa xaVar = this.f40017a;
        super.removeView(view);
        try {
            xaVar.dismiss();
        } catch (Exception unused) {
        }
        cc.h(xaVar.f40350a);
    }

    public void setTouchable(boolean z9) {
        xa xaVar = this.f40017a;
        WindowManager.LayoutParams layoutParams = xaVar.f40351b;
        if (layoutParams == null) {
            return;
        }
        if (!z9) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        xaVar.getWindow().setAttributes(xaVar.f40351b);
    }
}
