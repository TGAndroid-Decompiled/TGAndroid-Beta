package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mc1 extends FrameLayout {
    public final int f38950a = 0;
    public final Object f38951b;
    public final Object f38952c;

    public mc1(uf.d dVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.f38952c = dVar;
        this.f38951b = viewGroup;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        float f10;
        switch (this.f38950a) {
            case 1:
                Path path = (Path) this.f38951b;
                qh.y4 y4Var = (qh.y4) this.f38952c;
                if (y4Var.h != null && (((z4 = y4Var.f46369f) && view == y4Var.d) || (!z4 && view == y4Var.f46367c))) {
                    if (z4) {
                        f10 = y4Var.f46368e;
                    } else {
                        f10 = 1.0f - y4Var.f46368e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f38950a) {
            case 0:
                super.invalidate();
                org.telegram.ui.ActionBar.r0 r0Var = ((jd1) this.f38952c).f38003q0;
                if (r0Var != null) {
                    r0Var.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f38950a) {
            case 0:
                int[] iArr = (int[]) this.f38951b;
                jd1 jd1Var = (jd1) this.f38952c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    float translationY = jd1Var.f38001p0.getTranslationY();
                    int i10 = iArr[1];
                    if (translationY != i10) {
                        jd1Var.f38001p0.setTranslationY(-i10);
                        jd1Var.f38003q0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < jd1Var.M) {
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int dp;
        switch (this.f38950a) {
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.f38951b;
                uf.d dVar = (uf.d) this.f38952c;
                if (dVar.H && dVar.G) {
                    super.onMeasure(i10, i11);
                    return;
                }
                int size = View.MeasureSpec.getSize(i11);
                if (size == 0) {
                    size = viewGroup.getMeasuredHeight();
                }
                if (size == 0) {
                    size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int dp2 = AndroidUtilities.dp(50.0f);
                int i12 = 0;
                if (dVar.v != 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(30.0f) + dp2;
                }
                if (!dVar.B && !dVar.f48566w) {
                    dp += dp2;
                }
                int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (dp < paddingTop) {
                    i12 = paddingTop - dp;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public mc1(Context context, jd1 jd1Var) {
        super(context);
        this.f38952c = jd1Var;
        this.f38951b = new int[2];
    }

    public mc1(qh.y4 y4Var, Context context) {
        super(context);
        this.f38952c = y4Var;
        this.f38951b = new Path();
    }
}
