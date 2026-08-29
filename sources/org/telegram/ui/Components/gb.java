package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class gb extends FrameLayout {
    public final hb f28863a;

    public gb(hb hbVar, Context context) {
        super(context);
        this.f28863a = hbVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f28863a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f28863a.f29159b;
    }

    @Override
    public final void removeView(View view) {
        hb hbVar = this.f28863a;
        super.removeView(view);
        try {
            hbVar.dismiss();
        } catch (Exception unused) {
        }
        mc.h(hbVar.f29158a);
    }

    public void setTouchable(boolean z10) {
        hb hbVar = this.f28863a;
        WindowManager.LayoutParams layoutParams = hbVar.f29159b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        hbVar.getWindow().setAttributes(hbVar.f29159b);
    }
}
