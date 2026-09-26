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
public final class o31 extends FrameLayout {
    public final org.telegram.ui.Components.e6 f36043a;
    public float f36044b;
    public final Path f36045c;
    public Boolean d;
    public final t31 e;

    public o31(t31 t31Var, Context context) {
        super(context);
        this.e = t31Var;
        this.f36043a = new org.telegram.ui.Components.e6(this, 250L, org.telegram.ui.Components.sr.h);
        this.f36045c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.k61 k61Var;
        View[] viewArr;
        org.telegram.ui.Components.w51 G;
        t31 t31Var = this.e;
        View[] viewPages = t31Var.f37955b.getViewPages();
        float f10 = 0.0f;
        this.f36044b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                s31 s31Var = (s31) view;
                FrameLayout frameLayout = s31Var.e;
                org.telegram.ui.Components.s61 s61Var = s31Var.f37583f;
                float clamp = Utilities.clamp(1.0f - Math.abs(s31Var.getTranslationX() / s31Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.f36044b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = s61Var.getChildCount();
                    k61Var = s61Var.Y2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = s61Var.getChildAt(i13);
                    s61Var.X2.getClass();
                    int H = s4.o0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < k61Var.f25647x.size() && (G = k61Var.G(H)) != null && G.f15715a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f36044b = (paddingTop * clamp) + f11;
                if (s31Var.getVisibility() == 0) {
                    t5 t5Var = s31Var.h;
                    float f12 = -t5Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= s61Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = s61Var.getChildAt(i14);
                        s61Var.X2.getClass();
                        if (k61Var.G(s4.o0.H(childAt2)).f15715a == 28) {
                            f12 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    t5Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
                }
            }
            i12++;
            viewPages = viewArr;
            f10 = 0.0f;
        }
        if (this.f36044b <= AndroidUtilities.statusBarHeight) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f36043a.d(f7, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.f36044b = Math.max(f13, this.f36044b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.e3) t31Var).backgroundPaddingLeft;
        float f15 = this.f36044b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.e3) t31Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, t31Var.f37956c);
        canvas.save();
        Path path = this.f36045c;
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
        if (AndroidUtilities.computePerceivedBrightness(t31Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19129h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(t31Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19337s8), 855638016)) > 0.721f) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(t31Var.getWindow(), z11);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f36044b) {
            this.e.dismiss();
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
