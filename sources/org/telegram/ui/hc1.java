package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hc1 extends FrameLayout {
    public final int f37458a = 0;
    public final Object f37459b;
    public final Object f37460c;

    public hc1(uf.d dVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.f37460c = dVar;
        this.f37459b = viewGroup;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        float f10;
        switch (this.f37458a) {
            case 1:
                Path path = (Path) this.f37459b;
                qh.z4 z4Var = (qh.z4) this.f37460c;
                if (z4Var.h != null && (((z4 = z4Var.f46387f) && view == z4Var.d) || (!z4 && view == z4Var.f46385c))) {
                    if (z4) {
                        f10 = z4Var.f46386e;
                    } else {
                        f10 = 1.0f - z4Var.f46386e;
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
        switch (this.f37458a) {
            case 0:
                super.invalidate();
                org.telegram.ui.ActionBar.r0 r0Var = ((ed1) this.f37460c).f36528q0;
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
        switch (this.f37458a) {
            case 0:
                int[] iArr = (int[]) this.f37459b;
                ed1 ed1Var = (ed1) this.f37460c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    float translationY = ed1Var.f36526p0.getTranslationY();
                    int i10 = iArr[1];
                    if (translationY != i10) {
                        ed1Var.f36526p0.setTranslationY(-i10);
                        ed1Var.f36528q0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < ed1Var.M) {
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
        switch (this.f37458a) {
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.f37459b;
                uf.d dVar = (uf.d) this.f37460c;
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
                if (!dVar.B && !dVar.f48530w) {
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

    public hc1(Context context, ed1 ed1Var) {
        super(context);
        this.f37460c = ed1Var;
        this.f37459b = new int[2];
    }

    public hc1(qh.z4 z4Var, Context context) {
        super(context);
        this.f37460c = z4Var;
        this.f37459b = new Path();
    }
}
