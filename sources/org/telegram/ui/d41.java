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
public final class d41 extends FrameLayout {
    public final org.telegram.ui.Components.g6 f35143a;
    public float f35144b;
    public final Path f35145c;
    public Boolean d;
    public final i41 e;

    public d41(i41 i41Var, Context context) {
        super(context);
        this.e = i41Var;
        this.f35143a = new org.telegram.ui.Components.g6(this, 250L, org.telegram.ui.Components.es.h);
        this.f35145c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.z61 z61Var;
        View[] viewArr;
        org.telegram.ui.Components.l61 G;
        i41 i41Var = this.e;
        View[] viewPages = i41Var.f37030b.getViewPages();
        float f10 = 0.0f;
        this.f35144b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                h41 h41Var = (h41) view;
                FrameLayout frameLayout = h41Var.e;
                org.telegram.ui.Components.h71 h71Var = h41Var.f36602f;
                float clamp = Utilities.clamp(1.0f - Math.abs(h41Var.getTranslationX() / h41Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.f35144b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = h71Var.getChildCount();
                    z61Var = h71Var.W2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = h71Var.getChildAt(i13);
                    h71Var.V2.getClass();
                    int H = s4.n0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < z61Var.f31783x.size() && (G = z61Var.G(H)) != null && G.f43203a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f35144b = (paddingTop * clamp) + f11;
                if (h41Var.getVisibility() == 0) {
                    x5 x5Var = h41Var.h;
                    float f12 = -x5Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= h71Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = h71Var.getChildAt(i14);
                        h71Var.V2.getClass();
                        if (z61Var.G(s4.n0.H(childAt2)).f43203a == 28) {
                            f12 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    x5Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
                }
            }
            i12++;
            viewPages = viewArr;
            f10 = 0.0f;
        }
        if (this.f35144b <= AndroidUtilities.statusBarHeight) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f35143a.d(f7, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.f35144b = Math.max(f13, this.f35144b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.e3) i41Var).backgroundPaddingLeft;
        float f15 = this.f35144b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.e3) i41Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, i41Var.f37031c);
        canvas.save();
        Path path = this.f35145c;
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
        if (AndroidUtilities.computePerceivedBrightness(i41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(i41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20180s8), 855638016)) > 0.721f) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(i41Var.getWindow(), z11);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f35144b) {
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
