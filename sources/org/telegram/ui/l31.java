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
public final class l31 extends FrameLayout {
    public final org.telegram.ui.Components.z5 f38480a;
    public float f38481b;
    public final Path f38482c;
    public Boolean d;
    public final q31 f38483e;

    public l31(q31 q31Var, Context context) {
        super(context);
        this.f38483e = q31Var;
        this.f38480a = new org.telegram.ui.Components.z5(this, 250L, org.telegram.ui.Components.pr.h);
        this.f38482c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.w51 w51Var;
        View[] viewArr;
        org.telegram.ui.Components.h51 G;
        q31 q31Var = this.f38483e;
        View[] viewPages = q31Var.f40310b.getViewPages();
        float f11 = 0.0f;
        this.f38481b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                p31 p31Var = (p31) view;
                FrameLayout frameLayout = p31Var.f39875e;
                org.telegram.ui.Components.h61 h61Var = p31Var.f39876f;
                float clamp = Utilities.clamp(1.0f - Math.abs(p31Var.getTranslationX() / p31Var.getMeasuredWidth()), 1.0f, f11);
                float f12 = this.f38481b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = h61Var.getChildCount();
                    w51Var = h61Var.V2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = h61Var.getChildAt(i13);
                    h61Var.U2.getClass();
                    int H = f2.w0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < w51Var.f32654x.size() && (G = w51Var.G(H)) != null && G.f2505a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f38481b = (paddingTop * clamp) + f12;
                if (p31Var.getVisibility() == 0) {
                    eg.q1 q1Var = p31Var.h;
                    float f13 = -q1Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= h61Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = h61Var.getChildAt(i14);
                        h61Var.U2.getClass();
                        if (w51Var.G(f2.w0.H(childAt2)).f2505a == 28) {
                            f13 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    q1Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f13));
                }
            }
            i12++;
            viewPages = viewArr;
            f11 = 0.0f;
        }
        if (this.f38481b <= AndroidUtilities.statusBarHeight) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f38480a.d(f10, false);
        float f14 = AndroidUtilities.statusBarHeight;
        float f15 = f14 * d;
        this.f38481b = Math.max(f14, this.f38481b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) q31Var).backgroundPaddingLeft;
        float f16 = this.f38481b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) q31Var).backgroundPaddingLeft;
        rectF.set(i10, f16, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, q31Var.f40311c);
        canvas.save();
        Path path = this.f38482c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (f15 > AndroidUtilities.statusBarHeight / 2.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean bool = this.d;
        if (bool != null && bool.booleanValue() == z4) {
            return;
        }
        if (AndroidUtilities.computePerceivedBrightness(q31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5)) > 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v(q31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21932s8), 855638016)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.d = Boolean.valueOf(z4);
        if (!z4) {
            z10 = z11;
        }
        AndroidUtilities.setLightStatusBar(q31Var.getWindow(), z10);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f38481b) {
            this.f38483e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }
}
