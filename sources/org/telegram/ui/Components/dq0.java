package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class dq0 extends aw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final d6 G0;
    public final sq0 H0;
    public boolean f22456w0;
    public final RectF f22457x0;
    public boolean f22458y0;
    public int f22459z0;

    public dq0(sq0 sq0Var, Context context) {
        super(context, null);
        this.H0 = sq0Var;
        this.f22456w0 = false;
        this.f22457x0 = new RectF();
        this.H = new cq0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5)) > 0.721f;
        this.G0 = new d6(this, 0L, 350L, wr.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        sq0 sq0Var = this.H0;
        tp0 tp0Var = sq0Var.G;
        vl0 vl0Var = sq0Var.E;
        tp0 tp0Var2 = sq0Var.F;
        if (tp0Var2.getVisibility() == 0 && tp0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(tp0Var2.getX(), tp0Var2.getY());
            tp0Var2.draw(canvas);
            canvas.restore();
        }
        if (vl0Var.getVisibility() == 0 && vl0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(vl0Var.getX(), vl0Var.getY());
            vl0Var.draw(canvas);
            canvas.restore();
        }
        if (tp0Var.getVisibility() == 0 && tp0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(tp0Var.getX(), tp0Var.getY());
            tp0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        sq0 sq0Var = this.H0;
        eh.d dVar = sq0Var.Q0;
        eh.d dVar2 = sq0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && sq0Var.O0 != null) {
            sq0.A0(sq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) sq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) sq0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.h3) sq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) sq0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + sq0Var.f27190t0, getMeasuredWidth(), getMeasuredHeight() + sq0Var.f27190t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof rz) {
            sq0 sq0Var = this.H0;
            if (sq0Var.V0 != null) {
                canvas.save();
                sq0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(sq0Var.V0.h.f2264k);
                sq0Var.V0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        org.telegram.ui.ActionBar.f6 f6Var;
        f6Var = ((org.telegram.ui.ActionBar.h3) this.H0).resourcesProvider;
        return f6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.r1 r1Var = this.H;
        r1Var.f18594b = this;
        r1Var.c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f7;
        boolean z11;
        int i13;
        int dp;
        Paint paint;
        int i14;
        boolean z12;
        int i15;
        int i16;
        canvas.save();
        sq0 sq0Var = this.H0;
        Drawable drawable = sq0Var.R;
        FrameLayout frameLayout = sq0Var.f27193w;
        canvas.translate(0.0f, sq0Var.f27190t0);
        int i17 = sq0Var.f27184p0;
        i10 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f22459z0;
        int i18 = sq0Var.f27184p0;
        i11 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f22459z0;
        sq0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.h3) sq0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += sq0Var.G0.f10075b;
            if (this.f22458y0) {
                i16 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingTop;
                if (i16 + dp3 < sq0Var.G0.f10075b) {
                    z12 = true;
                    int i20 = dp3 + sq0Var.G0.f10075b;
                    i15 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + sq0Var.G0.f10075b;
            i15 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > sq0Var.G0.f10075b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                pc pcVar = pc.f26074w;
                if (pcVar != null) {
                    tb tbVar = pcVar.e;
                    if (tbVar != null) {
                        tbVar.setTop(true);
                    }
                    pcVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            float f10 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f22457x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.j6.f18212t0.setColor(sq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
            org.telegram.ui.ActionBar.j6.f18212t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f18212t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            if (this.F0 && 0 > sq0Var.G0.f10075b * 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((systemUiVisibility & 8192) <= 0) {
                z13 = false;
            }
            if (z11 != z13) {
                if (z11) {
                    i13 = systemUiVisibility | 8192;
                } else {
                    i13 = systemUiVisibility & (-8193);
                }
                setSystemUiVisibility(i13);
            }
        }
        canvas.restore();
        this.A0 = this.f22459z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f22458y0;
        sq0 sq0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f22459z0 - AndroidUtilities.dp(30.0f)) {
                sq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && sq0Var.f27184p0 != 0 && motionEvent.getY() < sq0Var.f27184p0 - AndroidUtilities.dp(30.0f)) {
            sq0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z15;
        int emojiPadding;
        int i19;
        int i20;
        int i21;
        dq0 dq0Var = this;
        sq0 sq0Var = dq0Var.H0;
        tp0 tp0Var = sq0Var.G;
        FrameLayout frameLayout = sq0Var.f27170c0;
        tp0 tp0Var2 = sq0Var.F;
        vl0 vl0Var = sq0Var.E;
        if (dq0Var.getLayoutParams().height > 0) {
            size = dq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = sq0Var.H;
        int i22 = 0;
        if (dq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        vz vzVar = sq0Var.J;
        if (dq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        vzVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.h3) sq0Var).isFullscreen;
        if (!z12) {
            dq0Var.f22456w0 = true;
            i20 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingLeft;
            int i23 = sq0Var.G0.f10075b;
            i21 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingLeft;
            dq0Var.setPadding(i20, i23, i21, 0);
            dq0Var.f22456w0 = false;
        }
        int paddingTop = size - dq0Var.getPaddingTop();
        int max = Math.max(sq0Var.M.h(), sq0Var.K.h() - 1);
        int D = org.telegram.messenger.a2.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (vl0Var.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(103.0f);
            int D2 = org.telegram.messenger.a2.D(103.0f, Math.max(2, (int) Math.ceil((sq0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + dp);
            i19 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, vl0Var.getAlpha());
            }
        }
        if (i24 < paddingTop) {
            i13 = 0;
        } else {
            i13 = paddingTop - ((paddingTop / 5) * 3);
        }
        int i26 = 48;
        if (frameLayout != null) {
            i14 = 48;
        } else {
            i14 = 0;
        }
        int dp2 = AndroidUtilities.dp(i14 + 100) + sq0Var.G0.d;
        if (tp0Var2.getPaddingTop() != i13 || tp0Var2.getPaddingBottom() != dp2) {
            dq0Var.f22456w0 = true;
            tp0Var2.setPadding(0, i13, 0, dp2);
            vl0Var.setPadding(0, i13, 0, dp2);
            dq0Var.f22456w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.h3) sq0Var).keyboardVisible;
        if (z13 && dq0Var.getLayoutParams().height <= 0 && tp0Var.getPaddingTop() != i13) {
            dq0Var.f22456w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            tp0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + sq0Var.G0.d);
            dq0Var.f22456w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        dq0Var.f22458y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        dq0Var.f22459z0 = i15;
        dq0Var.f22456w0 = true;
        sq0Var.K0(false);
        dq0Var.f22456w0 = false;
        dq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.h3) sq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = sq0Var.f27186r;
        wp0 wp0Var = sq0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = dq0Var.R();
        sq0Var.N0 = R;
        if (!wp0Var.N && R <= AndroidUtilities.dp(20.0f) && !wp0Var.e && !wp0Var.O) {
            dq0Var.f22456w0 = true;
            wp0Var.j();
            dq0Var.f22456w0 = false;
        }
        dq0Var.f22456w0 = true;
        if (sq0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.h3) sq0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = wp0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (wp0Var.e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!wp0Var.m()) {
                wp0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        dq0Var.f22456w0 = false;
        int childCount = dq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = dq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (wp0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), dq0Var.getPaddingTop() + (i29 - sq0Var.G0.f10075b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(dq0Var.getPaddingTop() + (i29 - sq0Var.G0.f10075b), 1073741824));
                    }
                } else {
                    dq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            dq0Var = this;
        }
        sq0Var.Y0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.H0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f22456w0) {
            return;
        }
        super.requestLayout();
    }
}
