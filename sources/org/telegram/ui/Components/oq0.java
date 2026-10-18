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
public final class oq0 extends jw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final f6 G0;
    public final dr0 H0;
    public boolean f29048w0;
    public final RectF f29049x0;
    public boolean f29050y0;
    public int f29051z0;

    public oq0(dr0 dr0Var, Context context) {
        super(context, null);
        this.H0 = dr0Var;
        this.f29048w0 = false;
        this.f29049x0 = new RectF();
        this.H = new nq0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(dr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5)) > 0.721f;
        this.G0 = new f6(this, 0L, 350L, bs.h);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        dr0 dr0Var = this.H0;
        fq0 fq0Var = dr0Var.G;
        im0 im0Var = dr0Var.E;
        fq0 fq0Var2 = dr0Var.F;
        if (fq0Var2.getVisibility() == 0 && fq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(fq0Var2.getX(), fq0Var2.getY());
            fq0Var2.draw(canvas);
            canvas.restore();
        }
        if (im0Var.getVisibility() == 0 && im0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(im0Var.getX(), im0Var.getY());
            im0Var.draw(canvas);
            canvas.restore();
        }
        if (fq0Var.getVisibility() == 0 && fq0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(fq0Var.getX(), fq0Var.getY());
            fq0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        dr0 dr0Var = this.H0;
        gh.d dVar = dr0Var.Q0;
        gh.d dVar2 = dr0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && dr0Var.O0 != null) {
            dr0.B0(dr0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) dr0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) dr0Var).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) dr0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) dr0Var).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + dr0Var.f25676t0, getMeasuredWidth(), getMeasuredHeight() + dr0Var.f25676t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof tz) {
            dr0 dr0Var = this.H0;
            if (dr0Var.V0 != null) {
                canvas.save();
                dr0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(dr0Var.V0.f8015j.f8004k);
                dr0Var.V0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        org.telegram.ui.ActionBar.d6 d6Var;
        d6Var = ((org.telegram.ui.ActionBar.f3) this.H0).resourcesProvider;
        return d6Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.o1 o1Var = this.H;
        o1Var.f21630b = this;
        o1Var.c();
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
        dr0 dr0Var = this.H0;
        Drawable drawable = dr0Var.R;
        FrameLayout frameLayout = dr0Var.f25679w;
        canvas.translate(0.0f, dr0Var.f25676t0);
        int i17 = dr0Var.f25670p0;
        i10 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingTop;
        int dp2 = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.f29051z0;
        int i18 = dr0Var.f25670p0;
        i11 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingTop;
        int dp3 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.f29051z0;
        dr0Var.X = dp3;
        int dp4 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingTop;
        int i19 = i12 + dp4;
        z10 = ((org.telegram.ui.ActionBar.f3) dr0Var).isFullscreen;
        boolean z13 = true;
        if (!z10) {
            dp2 += dr0Var.G0.f12285b;
            if (this.f29050y0) {
                i16 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingTop;
                if (i16 + dp3 < dr0Var.G0.f12285b) {
                    z12 = true;
                    int i20 = dp3 + dr0Var.G0.f12285b;
                    i15 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z12);
                    dp3 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z12 = false;
            int i202 = dp3 + dr0Var.G0.f12285b;
            i15 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingTop;
            f7 = this.G0.e(z12);
            dp3 = AndroidUtilities.lerp(i202, -i15, f7);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, dp3, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp3 > dr0Var.G0.f12285b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp3) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                qc qcVar = qc.f29631w;
                if (qcVar != null) {
                    ub ubVar = qcVar.e;
                    if (ubVar != null) {
                        ubVar.setTop(true);
                    }
                    qcVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            float f10 = dp2;
            float measuredWidth = (getMeasuredWidth() + AndroidUtilities.dp(36.0f)) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp2;
            RectF rectF = this.f29049x0;
            rectF.set((getMeasuredWidth() - dp) / 2, f10, measuredWidth, dp5);
            org.telegram.ui.ActionBar.h6.f21276t0.setColor(dr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ii));
            org.telegram.ui.ActionBar.h6.f21276t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21276t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (this.F0 && 0 > dr0Var.G0.f12285b * 0.5f) {
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
        canvas.restore();
        this.A0 = this.f29051z0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f29050y0;
        dr0 dr0Var = this.H0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f29051z0 - AndroidUtilities.dp(30.0f)) {
                dr0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && dr0Var.f25670p0 != 0 && motionEvent.getY() < dr0Var.f25670p0 - AndroidUtilities.dp(30.0f)) {
            dr0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oq0.onLayout(boolean, int, int, int, int):void");
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
        oq0 oq0Var = this;
        dr0 dr0Var = oq0Var.H0;
        fq0 fq0Var = dr0Var.G;
        FrameLayout frameLayout = dr0Var.f25656c0;
        fq0 fq0Var2 = dr0Var.F;
        im0 im0Var = dr0Var.E;
        if (oq0Var.getLayoutParams().height > 0) {
            size = oq0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.s sVar = dr0Var.H;
        int i22 = 0;
        if (oq0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        xz xzVar = dr0Var.J;
        if (oq0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        xzVar.G = z11;
        z12 = ((org.telegram.ui.ActionBar.f3) dr0Var).isFullscreen;
        if (!z12) {
            oq0Var.f29048w0 = true;
            i20 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingLeft;
            int i23 = dr0Var.G0.f12285b;
            i21 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingLeft;
            oq0Var.setPadding(i20, i23, i21, 0);
            oq0Var.f29048w0 = false;
        }
        int paddingTop = size - oq0Var.getPaddingTop();
        int max = Math.max(dr0Var.M.h(), dr0Var.K.h() - 1);
        int D = org.telegram.messenger.g0.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingTop;
        int i24 = i12 + D;
        if (im0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.g0.D(103.0f, Math.max(2, (int) Math.ceil((dr0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i19 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingTop;
            int i25 = i19 + D2;
            if (i25 > i24) {
                i24 = AndroidUtilities.lerp(i24, i25, im0Var.getAlpha());
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
        int dp = AndroidUtilities.dp(i14 + 100) + dr0Var.G0.d;
        if (fq0Var2.getPaddingTop() != i13 || fq0Var2.getPaddingBottom() != dp) {
            oq0Var.f29048w0 = true;
            fq0Var2.setPadding(0, i13, 0, dp);
            im0Var.setPadding(0, i13, 0, dp);
            oq0Var.f29048w0 = false;
        }
        z13 = ((org.telegram.ui.ActionBar.f3) dr0Var).keyboardVisible;
        if (z13 && oq0Var.getLayoutParams().height <= 0 && fq0Var.getPaddingTop() != i13) {
            oq0Var.f29048w0 = true;
            if (frameLayout == null) {
                i26 = 0;
            }
            fq0Var.setPadding(0, 0, 0, AndroidUtilities.dp(i26 + 60) + dr0Var.G0.d);
            oq0Var.f29048w0 = false;
        }
        if (i24 >= size) {
            z14 = true;
        } else {
            z14 = false;
        }
        oq0Var.f29050y0 = z14;
        if (z14) {
            i15 = 0;
        } else {
            i15 = size - i24;
        }
        oq0Var.f29051z0 = i15;
        oq0Var.f29048w0 = true;
        dr0Var.L0(false);
        oq0Var.f29048w0 = false;
        oq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i16 = ((org.telegram.ui.ActionBar.f3) dr0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = dr0Var.f25672r;
        iq0 iq0Var = dr0Var.d;
        int i27 = size2 - (i16 * 2);
        int R = oq0Var.R();
        dr0Var.N0 = R;
        if (!iq0Var.N && R <= AndroidUtilities.dp(20.0f) && !iq0Var.e && !iq0Var.O) {
            oq0Var.f29048w0 = true;
            iq0Var.j();
            oq0Var.f29048w0 = false;
        }
        oq0Var.f29048w0 = true;
        if (dr0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z15 = ((org.telegram.ui.ActionBar.f3) dr0Var).keyboardVisible;
                if (z15) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = iq0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (iq0Var.e) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i18);
            }
            i17 = 8;
        } else {
            if (!iq0Var.m()) {
                iq0Var.j();
            }
            i17 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i28 = makeMeasureSpec;
        int i29 = size3;
        oq0Var.f29048w0 = false;
        int childCount = oq0Var.getChildCount();
        while (i22 < childCount) {
            View childAt = oq0Var.getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != i17) {
                if (iq0Var.l(childAt)) {
                    if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), oq0Var.getPaddingTop() + (i29 - dr0Var.G0.f12285b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(oq0Var.getPaddingTop() + (i29 - dr0Var.G0.f12285b), 1073741824));
                    }
                } else {
                    oq0Var.measureChildWithMargins(childAt, i10, 0, i28, 0);
                }
            }
            i22++;
            oq0Var = this;
        }
        dr0Var.Z0();
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
        if (this.f29048w0) {
            return;
        }
        super.requestLayout();
    }
}
