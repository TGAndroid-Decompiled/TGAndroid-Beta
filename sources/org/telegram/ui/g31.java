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
public final class g31 extends FrameLayout {
    public final org.telegram.ui.Components.z5 f37075a;
    public float f37076b;
    public final Path f37077c;
    public Boolean d;
    public final m31 f37078e;

    public g31(m31 m31Var, Context context) {
        super(context);
        this.f37078e = m31Var;
        this.f37075a = new org.telegram.ui.Components.z5(this, 250L, org.telegram.ui.Components.pr.h);
        this.f37077c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.x51 x51Var;
        View[] viewArr;
        org.telegram.ui.Components.j51 G;
        m31 m31Var = this.f37078e;
        View[] viewPages = m31Var.f38955b.getViewPages();
        float f11 = 0.0f;
        this.f37076b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                l31 l31Var = (l31) view;
                FrameLayout frameLayout = l31Var.f38574e;
                org.telegram.ui.Components.i61 i61Var = l31Var.f38575f;
                float clamp = Utilities.clamp(1.0f - Math.abs(l31Var.getTranslationX() / l31Var.getMeasuredWidth()), 1.0f, f11);
                float f12 = this.f37076b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = i61Var.getChildCount();
                    x51Var = i61Var.V2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = i61Var.getChildAt(i13);
                    i61Var.U2.getClass();
                    int H = f2.w0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < x51Var.f32960x.size() && (G = x51Var.G(H)) != null && G.f2505a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f37076b = (paddingTop * clamp) + f12;
                if (l31Var.getVisibility() == 0) {
                    eg.q1 q1Var = l31Var.h;
                    float f13 = -q1Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i61Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = i61Var.getChildAt(i14);
                        i61Var.U2.getClass();
                        if (x51Var.G(f2.w0.H(childAt2)).f2505a == 28) {
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
        if (this.f37076b <= AndroidUtilities.statusBarHeight) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f37075a.d(f10, false);
        float f14 = AndroidUtilities.statusBarHeight;
        float f15 = f14 * d;
        this.f37076b = Math.max(f14, this.f37076b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) m31Var).backgroundPaddingLeft;
        float f16 = this.f37076b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) m31Var).backgroundPaddingLeft;
        rectF.set(i10, f16, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, m31Var.f38956c);
        canvas.save();
        Path path = this.f37077c;
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
        if (AndroidUtilities.computePerceivedBrightness(m31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5)) > 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v(m31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21930s8), 855638016)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.d = Boolean.valueOf(z4);
        if (!z4) {
            z10 = z11;
        }
        AndroidUtilities.setLightStatusBar(m31Var.getWindow(), z10);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f37076b) {
            this.f37078e.dismiss();
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
