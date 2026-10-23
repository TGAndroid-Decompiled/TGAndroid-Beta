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
public final class n21 extends FrameLayout {
    public final org.telegram.ui.Components.f6 f39748a;
    public float f39749b;
    public final Path f39750c;
    public Boolean d;
    public final s21 e;

    public n21(s21 s21Var, Context context) {
        super(context);
        this.e = s21Var;
        this.f39748a = new org.telegram.ui.Components.f6(this, 250L, org.telegram.ui.Components.bs.h);
        this.f39750c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.b71 b71Var;
        View[] viewArr;
        org.telegram.ui.Components.m61 G;
        s21 s21Var = this.e;
        View[] viewPages = s21Var.f41292b.getViewPages();
        float f10 = 0.0f;
        this.f39749b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                r21 r21Var = (r21) view;
                FrameLayout frameLayout = r21Var.e;
                org.telegram.ui.Components.j71 j71Var = r21Var.f40982f;
                float clamp = Utilities.clamp(1.0f - Math.abs(r21Var.getTranslationX() / r21Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.f39749b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = j71Var.getChildCount();
                    b71Var = j71Var.Z2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = j71Var.getChildAt(i13);
                    j71Var.Y2.getClass();
                    int H = s4.n0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < b71Var.f24976y.size() && (G = b71Var.G(H)) != null && G.f44713a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f39749b = (paddingTop * clamp) + f11;
                if (r21Var.getVisibility() == 0) {
                    ai.o5 o5Var = r21Var.h;
                    float f12 = -o5Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= j71Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = j71Var.getChildAt(i14);
                        j71Var.Y2.getClass();
                        if (b71Var.G(s4.n0.H(childAt2)).f44713a == 28) {
                            f12 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    o5Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
                }
            }
            i12++;
            viewPages = viewArr;
            f10 = 0.0f;
        }
        if (this.f39749b <= AndroidUtilities.statusBarHeight) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f39748a.d(f7, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.f39749b = Math.max(f13, this.f39749b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) s21Var).backgroundPaddingLeft;
        float f15 = this.f39749b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) s21Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, s21Var.f41293c);
        canvas.save();
        Path path = this.f39750c;
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
        if (AndroidUtilities.computePerceivedBrightness(s21Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v(s21Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21462s8), 855638016)) > 0.721f) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(s21Var.getWindow(), z11);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f39749b) {
            this.e.dismiss();
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
