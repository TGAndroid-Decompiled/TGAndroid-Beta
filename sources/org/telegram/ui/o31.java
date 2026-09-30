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
    public final org.telegram.ui.Components.e6 f36182a;
    public float f36183b;
    public final Path f36184c;
    public Boolean d;
    public final t31 e;

    public o31(t31 t31Var, Context context) {
        super(context);
        this.e = t31Var;
        this.f36182a = new org.telegram.ui.Components.e6(this, 250L, org.telegram.ui.Components.tr.h);
        this.f36184c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.m61 m61Var;
        View[] viewArr;
        org.telegram.ui.Components.y51 G;
        t31 t31Var = this.e;
        View[] viewPages = t31Var.f38064b.getViewPages();
        float f10 = 0.0f;
        this.f36183b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                s31 s31Var = (s31) view;
                FrameLayout frameLayout = s31Var.e;
                org.telegram.ui.Components.u61 u61Var = s31Var.f37680f;
                float clamp = Utilities.clamp(1.0f - Math.abs(s31Var.getTranslationX() / s31Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.f36183b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = u61Var.getChildCount();
                    m61Var = u61Var.f28778f3;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = u61Var.getChildAt(i13);
                    u61Var.f28777e3.getClass();
                    int H = s4.o0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < m61Var.f26226x.size() && (G = m61Var.G(H)) != null && G.f15731a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f36183b = (paddingTop * clamp) + f11;
                if (s31Var.getVisibility() == 0) {
                    t5 t5Var = s31Var.h;
                    float f12 = -t5Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= u61Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = u61Var.getChildAt(i14);
                        u61Var.f28777e3.getClass();
                        if (m61Var.G(s4.o0.H(childAt2)).f15731a == 28) {
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
        if (this.f36183b <= AndroidUtilities.statusBarHeight) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f36182a.d(f7, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.f36183b = Math.max(f13, this.f36183b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.e3) t31Var).backgroundPaddingLeft;
        float f15 = this.f36183b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.e3) t31Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, t31Var.f38065c);
        canvas.save();
        Path path = this.f36184c;
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
        if (AndroidUtilities.computePerceivedBrightness(t31Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19146h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(t31Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19354s8), 855638016)) > 0.721f) {
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
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f36183b) {
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
