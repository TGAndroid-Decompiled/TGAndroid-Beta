package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q31 extends FrameLayout {
    public final org.telegram.ui.Components.e6 f39621a;
    public float f39622b;
    public final Path f39623c;
    public Boolean d;
    public final v31 f39624e;

    public q31(v31 v31Var, Context context) {
        super(context);
        this.f39624e = v31Var;
        this.f39621a = new org.telegram.ui.Components.e6(this, 250L, org.telegram.ui.Components.tr.h);
        this.f39623c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.u61 u61Var;
        View[] viewArr;
        org.telegram.ui.Components.g61 G;
        v31 v31Var = this.f39624e;
        View[] viewPages = v31Var.f41549b.getViewPages();
        float f10 = 0.0f;
        this.f39622b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                u31 u31Var = (u31) view;
                FrameLayout frameLayout = u31Var.f41046e;
                org.telegram.ui.Components.c71 c71Var = u31Var.f41047f;
                float clamp = Utilities.clamp(1.0f - Math.abs(u31Var.getTranslationX() / u31Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.f39622b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = c71Var.getChildCount();
                    u61Var = c71Var.f25250f3;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = c71Var.getChildAt(i13);
                    c71Var.f25249e3.getClass();
                    int H = s4.o0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < u61Var.f31316x.size() && (G = u61Var.G(H)) != null && G.f17187a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f39622b = (paddingTop * clamp) + f11;
                if (u31Var.getVisibility() == 0) {
                    u5 u5Var = u31Var.h;
                    float f12 = -u5Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= c71Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = c71Var.getChildAt(i14);
                        c71Var.f25249e3.getClass();
                        if (u61Var.G(s4.o0.H(childAt2)).f17187a == 28) {
                            f12 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    u5Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
                }
            }
            i12++;
            viewPages = viewArr;
            f10 = 0.0f;
        }
        if (this.f39622b <= AndroidUtilities.statusBarHeight) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f39621a.d(f7, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.f39622b = Math.max(f13, this.f39622b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) v31Var).backgroundPaddingLeft;
        float f15 = this.f39622b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) v31Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, v31Var.f41550c);
        canvas.save();
        Path path = this.f39623c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (f14 > AndroidUtilities.statusBarHeight / 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        if (AndroidUtilities.computePerceivedBrightness(v31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20894h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v(v31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21104s8), 855638016)) > 0.721f) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(v31Var.getWindow(), z11);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f39622b) {
            this.f39624e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }
}
