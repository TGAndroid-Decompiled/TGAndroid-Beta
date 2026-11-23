package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class ab extends FrameLayout {
    public final bb f33452a;

    public ab(bb bbVar, Context context) {
        super(context);
        this.f33452a = bbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f33452a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f33452a.f33725b;
    }

    @Override
    public final void removeView(View view) {
        bb bbVar = this.f33452a;
        super.removeView(view);
        try {
            bbVar.dismiss();
        } catch (Exception unused) {
        }
        fc.h(bbVar.f33724a);
    }

    public void setTouchable(boolean z10) {
        bb bbVar = this.f33452a;
        WindowManager.LayoutParams layoutParams = bbVar.f33725b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        bbVar.getWindow().setAttributes(bbVar.f33725b);
    }
}
