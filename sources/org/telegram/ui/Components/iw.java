package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.va1;
public final class iw extends on0 {
    public long h;
    public boolean f27462n;
    public float f27463r;
    public final kw f27464s;

    public iw(kw kwVar, Context context) {
        super(context);
        float f7;
        this.f27464s = kwVar;
        boolean z10 = kwVar.f28166n;
        this.f27462n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f27463r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        va1 va1Var = new va1(this, context, 8);
        this.f29245b = va1Var;
        va1Var.setOrientation(0);
        addView(this.f29245b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = kw.f28160e0;
            if (i10 < 8) {
                int i11 = iArr[i10];
                hw hwVar = new hw(this, context, kw.f28161f0[i10]);
                hwVar.setContentDescription(kw.f(i10));
                this.f29245b.addView(hwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f27462n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f29244a = false;
                    return;
                }
            }
            this.f29244a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f27464s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f29245b.getChildCount()) * 32.0f), this.f27463r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
