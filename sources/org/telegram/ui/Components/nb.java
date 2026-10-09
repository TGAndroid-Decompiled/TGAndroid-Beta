package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class nb extends FrameLayout {
    public final ob f29137a;

    public nb(ob obVar, Context context) {
        super(context);
        this.f29137a = obVar;
    }

    @Override
    public final void addView(View view) {
        super.addView(view);
        this.f29137a.show();
    }

    public WindowManager.LayoutParams getLayout() {
        return this.f29137a.f29446b;
    }

    @Override
    public final void removeView(View view) {
        ob obVar = this.f29137a;
        super.removeView(view);
        try {
            obVar.dismiss();
        } catch (Exception unused) {
        }
        tc.h(obVar.f29445a);
    }

    public void setTouchable(boolean z10) {
        ob obVar = this.f29137a;
        WindowManager.LayoutParams layoutParams = obVar.f29446b;
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            layoutParams.flags |= 16;
        } else {
            layoutParams.flags &= -17;
        }
        obVar.getWindow().setAttributes(obVar.f29446b);
    }
}
