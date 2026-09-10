package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class jb extends FrameLayout {
    public final kb f24337a;

    public jb(kb kbVar, Context context) {
        super(context);
        this.f24337a = kbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f24337a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f24337a.f24690b;
    }

    @Override
    public final void removeView(View view) {
        kb kbVar = this.f24337a;
        super.removeView(view);
        try {
            kbVar.dismiss();
        } catch (Exception unused) {
        }
        pc.h(kbVar.f24689a);
    }

    public void setTouchable(boolean z10) {
        kb kbVar = this.f24337a;
        WindowManager.LayoutParams layoutParams = kbVar.f24690b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        kbVar.getWindow().setAttributes(kbVar.f24690b);
    }
}
