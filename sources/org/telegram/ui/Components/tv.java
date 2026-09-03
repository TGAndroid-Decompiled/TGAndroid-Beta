package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class tv extends sv {
    public final uv H;

    public tv(uv uvVar, Context context, int i10, int i11) {
        super(uvVar.f29300s, context, i10, i11);
        this.H = uvVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.H.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
