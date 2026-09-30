package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class lb extends FrameLayout {
    public final mb f25959a;

    public lb(mb mbVar, Context context) {
        super(context);
        this.f25959a = mbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f25959a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f25959a.f26254b;
    }

    @Override
    public final void removeView(View view) {
        mb mbVar = this.f25959a;
        super.removeView(view);
        try {
            mbVar.dismiss();
        } catch (Exception unused) {
        }
        rc.h(mbVar.f26253a);
    }

    public void setTouchable(boolean z10) {
        mb mbVar = this.f25959a;
        WindowManager.LayoutParams layoutParams = mbVar.f26254b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        mbVar.getWindow().setAttributes(mbVar.f26254b);
    }
}
