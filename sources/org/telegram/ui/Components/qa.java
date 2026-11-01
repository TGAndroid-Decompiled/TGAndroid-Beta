package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class qa extends FrameLayout {
    public final ra f29702a;

    public qa(ra raVar, Context context) {
        super(context);
        this.f29702a = raVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f29702a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f29702a.f29968b;
    }

    @Override
    public final void removeView(View view) {
        ra raVar = this.f29702a;
        super.removeView(view);
        try {
            raVar.dismiss();
        } catch (Exception unused) {
        }
        wb.h(raVar.f29967a);
    }

    public void setTouchable(boolean z10) {
        ra raVar = this.f29702a;
        WindowManager.LayoutParams layoutParams = raVar.f29968b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        raVar.getWindow().setAttributes(raVar.f29968b);
    }
}
