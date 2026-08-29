package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CheckBoxBase;
public final class op0 extends View {
    public final int f41208a;
    public final Object f41209b;

    public op0(Object obj, Context context, int i10) {
        super(context);
        this.f41208a = i10;
        this.f41209b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41208a) {
            case 11:
                lg.b bVar = ((sg.f) this.f41209b).E;
                if (bVar != null) {
                    bVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f41208a) {
            case 10:
                super.onAttachedToWindow();
                ((rf.a1) this.f41209b).f47174f = true;
                return;
            case 13:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f41209b).f26319l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f41208a) {
            case 10:
                super.onDetachedFromWindow();
                ((rf.a1) this.f41209b).f47174f = false;
                return;
            case 13:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f41209b).f26319l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        int i11 = this.f41208a;
        Object obj = this.f41209b;
        switch (i11) {
            case 0:
                zp0 zp0Var = (zp0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, zp0Var.f45275c.size())));
                int ceil = (int) Math.ceil(zp0Var.f45277d0.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                zp0Var.f45277d0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.C5, false));
                zp0Var.f45281f0.setColor(org.telegram.ui.ActionBar.g6.w0(null, zp0Var.f45292q0, false));
                int i12 = max / 2;
                int i13 = measuredWidth - i12;
                int i14 = i12 + measuredWidth;
                zp0Var.f45279e0.set(i13, 0.0f, i14, getMeasuredHeight());
                canvas.drawRoundRect(zp0Var.f45279e0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), zp0Var.f45281f0);
                zp0Var.f45281f0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B5, false));
                zp0Var.f45279e0.set(AndroidUtilities.dp(2.0f) + i13, AndroidUtilities.dp(2.0f), i14 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(zp0Var.f45279e0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), zp0Var.f45281f0);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), zp0Var.f45277d0);
                return;
            case 1:
                ((PhotoViewer) obj).f35757m3.a(canvas, this);
                return;
            case 4:
                a21 a21Var = (a21) obj;
                if (a21Var.G) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.yb0 yb0Var = a21Var.f36408n;
                if (yb0Var != null) {
                    yb0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                a21Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.yb0 yb0Var2 = a21Var.f36408n;
                if (yb0Var2 != null) {
                    yb0Var2.draw(canvas);
                }
                a21Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 5:
                ((SecretMediaViewer) obj).M.a(canvas, this);
                return;
            case 9:
                super.onDraw(canvas);
                qh.i0 i0Var = (qh.i0) obj;
                jf.b0 b0Var = i0Var.G;
                float max2 = Math.max(i0Var.f46713b.f49505e, i0Var.f46714c.f49505e);
                jf.b0 b0Var2 = i0Var.F;
                b0Var2.c(AndroidUtilities.dp(42.0f) + i0Var.Q.f8187b, 0);
                b0Var2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + i0Var.Q.f8187b);
                int i15 = org.telegram.ui.ActionBar.g6.f23009a7;
                b0Var2.b(org.telegram.ui.ActionBar.g6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max2), i0Var.getThemedColor(i15)));
                b0Var2.draw(canvas);
                if (i0Var.J) {
                    max2 = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + i0Var.Q.d, 0, max2);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max2) + i0Var.Q.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(i0Var.Q.d), max2);
                b0Var.c(0, lerp);
                b0Var.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                b0Var.b(org.telegram.ui.ActionBar.g6.l1(lerp3, i0Var.getThemedColor(i15)));
                b0Var.draw(canvas);
                return;
            case 12:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((th.q0) obj).f48684c.draw(canvas);
                canvas.restore();
                return;
            case 13:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41208a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                s41 s41Var = (s41) this.f41209b;
                int[] iArr = s41Var.C;
                getLocationOnScreen(iArr);
                Rect rect = s41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(s41Var.f45076c, rect, s41Var.E, s41Var.f45077e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f41208a) {
            case 2:
                xv0 xv0Var = (xv0) this.f41209b;
                PremiumPreviewFragment premiumPreviewFragment = xv0Var.f44660c;
                if (premiumPreviewFragment.S) {
                    premiumPreviewFragment.U = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + xv0Var.f44660c.Q.getMeasuredHeight() > dp) {
                        dp = xv0Var.f44660c.Q.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    xv0Var.f44660c.U = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(xv0Var.f44660c.U, 1073741824));
                return;
            case 8:
                ph.j jVar = (ph.j) this.f41209b;
                if (jVar.D) {
                    i12 = (ph.j.B0(jVar).getMeasuredHeight() + jVar.E) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + jVar.E;
                    if (AndroidUtilities.dp(24.0f) + jVar.f45023y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + jVar.f45023y.getMeasuredHeight();
                    }
                    i12 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 10:
                ((View) getParent()).getMeasuredHeight();
                rf.a1 a1Var = (rf.a1) this.f41209b;
                Integer num = a1Var.d;
                if (num != null) {
                    i13 = num.intValue();
                    a1Var.h = i13;
                } else {
                    i13 = 0;
                    a1Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                return;
            case 13:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(24.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f9) {
        switch (this.f41208a) {
            case 3:
                super.setAlpha(f9);
                View view = ((ProfileActivity) this.f41209b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                super.setAlpha(f9);
                View view2 = ((ze1) this.f41209b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f9);
                return;
        }
    }

    public op0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f41208a = 13;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, c6Var);
        this.f41209b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.g6.hl, org.telegram.ui.ActionBar.g6.f23449z5, org.telegram.ui.ActionBar.g6.f23190k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
