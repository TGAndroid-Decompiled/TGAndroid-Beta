package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ra1;

public final class kv extends am0 {
    public long h;

    public boolean f30188n;

    public float f30189r;

    public final mv f30190s;

    public kv(mv mvVar, Context context) {
        super(context);
        this.f30190s = mvVar;
        boolean z10 = mvVar.f30754n;
        this.f30188n = z10;
        this.f30189r = z10 ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ra1 ra1Var = new ra1(this, context, 8);
        this.f26767b = ra1Var;
        ra1Var.setOrientation(0);
        addView(this.f26767b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = mv.f30750c0;
            if (i10 >= 8) {
                return;
            }
            jv jvVar = new jv(this, context, iArr[i10], mv.f30751d0[i10]);
            jvVar.setContentDescription(mv.f(i10));
            this.f26767b.addView(jvVar);
            i10++;
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (!this.f30188n || this.d) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f26766a = false;
                return;
            } else if (action != 2) {
                return;
            }
        }
        this.f26766a = true;
        if (!this.d) {
            this.f26769e = -1;
        }
        this.f30190s.requestDisallowInterceptTouchEvent(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f26767b.getChildCount()) * 32.0f), this.f30189r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
