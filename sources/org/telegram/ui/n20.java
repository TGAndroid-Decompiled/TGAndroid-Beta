package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
public final class n20 extends View {
    public final int f38793a;
    public Object f38794b;

    public n20(Context context) {
        super(context);
        this.f38793a = 13;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f38793a) {
            case 1:
                super.dispatchDraw(canvas);
                s50 s50Var = (s50) this.f38794b;
                if (s50Var != null && s50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f38793a) {
            case 1:
                super.onAttachedToWindow();
                s50 s50Var = (s50) this.f38794b;
                if (s50Var != null) {
                    s50Var.f40342g = this;
                    int i10 = 0;
                    while (true) {
                        u50[] u50VarArr = s50Var.f40339c;
                        if (i10 < u50VarArr.length) {
                            u50 u50Var = u50VarArr[i10];
                            u50Var.f41113i.add(this);
                            u50Var.a();
                            i10++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 13:
                super.onAttachedToWindow();
                xh.n1 n1Var = (xh.n1) this.f38794b;
                if (n1Var != null && !n1Var.f50146i) {
                    n1Var.f50146i = true;
                    n1Var.a();
                    ii.q1 q1Var = new ii.q1(n1Var, 20);
                    n1Var.h = q1Var;
                    LiteMode.addOnPowerSaverAppliedListener(q1Var);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f38793a) {
            case 1:
                super.onDetachedFromWindow();
                s50 s50Var = (s50) this.f38794b;
                if (s50Var != null && s50Var.f40342g != this) {
                    int i10 = 0;
                    while (true) {
                        u50[] u50VarArr = s50Var.f40339c;
                        if (i10 < u50VarArr.length) {
                            u50 u50Var = u50VarArr[i10];
                            u50Var.f41113i.remove(this);
                            u50Var.a();
                            i10++;
                        } else {
                            s50Var.f40342g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 13:
                super.onDetachedFromWindow();
                xh.n1 n1Var = (xh.n1) this.f38794b;
                if (n1Var != null && n1Var.f50146i) {
                    n1Var.f50146i = false;
                    n1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(n1Var.h);
                    return;
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        switch (this.f38793a) {
            case 2:
                canvas.drawColor(((oj0) this.f38794b).getThemedColor(org.telegram.ui.ActionBar.i6.e7));
                return;
            case 3:
                fq0 fq0Var = (fq0) this.f38794b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, fq0Var.f36376c.size())));
                int ceil = (int) Math.ceil(fq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                fq0Var.S.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.C5, false));
                fq0Var.U.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20899h5, false));
                int i11 = max / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                fq0Var.T.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(fq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), fq0Var.U);
                fq0Var.U.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B5, false));
                fq0Var.T.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(fq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), fq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), fq0Var.S);
                return;
            case 4:
                wq0 wq0Var = (wq0) this.f38794b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, wq0Var.f42671c.size())));
                int ceil2 = (int) Math.ceil(wq0Var.f42679h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                wq0Var.f42679h0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.C5, false));
                wq0Var.f42681j0.setColor(org.telegram.ui.ActionBar.i6.w0(null, wq0Var.f42694u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                wq0Var.f42680i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(wq0Var.f42680i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), wq0Var.f42681j0);
                wq0Var.f42681j0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B5, false));
                wq0Var.f42680i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(wq0Var.f42680i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), wq0Var.f42681j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), wq0Var.f42679h0);
                return;
            case 5:
                ((PhotoViewer) this.f38794b).f34020q3.a(canvas, this);
                return;
            case 6:
            case 7:
            case 10:
            case 11:
            default:
                super.onDraw(canvas);
                return;
            case 8:
                y21 y21Var = (y21) this.f38794b;
                if (y21Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.pc0 pc0Var = y21Var.f43091n;
                if (pc0Var != null) {
                    pc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                y21Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.pc0 pc0Var2 = y21Var.f43091n;
                if (pc0Var2 != null) {
                    pc0Var2.draw(canvas);
                }
                y21Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 9:
                ((SecretMediaViewer) this.f38794b).Q.a(canvas, this);
                return;
            case 12:
                super.onDraw(canvas);
                rg.k0 k0Var = (rg.k0) this.f38794b;
                if (k0Var.f46172p0 - k0Var.f46171o0 > 1) {
                    Paint T0 = org.telegram.ui.ActionBar.i6.T0("paintDivider", rg.k0.f0(k0Var));
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.i6.f20950k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f38793a) {
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                p51 p51Var = (p51) this.f38794b;
                int[] iArr = p51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = p51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(p51Var.f41950c, rect, p51Var.I, p51Var.f41951e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        switch (this.f38793a) {
            case 0:
                r20 r20Var = (r20) this.f38794b;
                if (r20Var.H) {
                    int i13 = r20Var.I;
                    kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
                    r20Var.J = (kVar.getMeasuredHeight() + i13) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + r20Var.I;
                    if (AndroidUtilities.dp(24.0f) + r20Var.f39958y.getMeasuredHeight() > dp) {
                        dp = Math.max(dp, (AndroidUtilities.dp(24.0f) + r20Var.f39958y.getMeasuredHeight()) - r20Var.L);
                    }
                    r20Var.J = dp;
                }
                int i14 = (int) (r20Var.J - (0 * 2.5f));
                r20Var.J = i14;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 6:
                ww0 ww0Var = (ww0) this.f38794b;
                PremiumPreviewFragment premiumPreviewFragment = ww0Var.f42717c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp2 = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + ww0Var.f42717c.U.getMeasuredHeight() > dp2) {
                        dp2 = ww0Var.f42717c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    ww0Var.f42717c.Y = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ww0Var.f42717c.Y, 1073741824));
                return;
            case 14:
                yh.z7 z7Var = (yh.z7) this.f38794b;
                if (z7Var.H) {
                    i12 = (yh.z7.J0(z7Var).getMeasuredHeight() + z7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + z7Var.I;
                    if (AndroidUtilities.dp(24.0f) + z7Var.f39958y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + z7Var.f39958y.getMeasuredHeight();
                    }
                    i12 = dp3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f38793a) {
            case 7:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f38794b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 11:
                super.setAlpha(f7);
                View view2 = ((wf1) this.f38794b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        switch (this.f38793a) {
            case 13:
                if (((xh.n1) this.f38794b) != null) {
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var = (xh.n1) this.f38794b;
                        if (n1Var.f50146i) {
                            n1Var.f50146i = false;
                            n1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(n1Var.h);
                        }
                    }
                    this.f38794b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.n1) {
                    this.f38794b = (xh.n1) drawable;
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var2 = (xh.n1) this.f38794b;
                        if (!n1Var2.f50146i) {
                            n1Var2.f50146i = true;
                            n1Var2.a();
                            ii.q1 q1Var = new ii.q1(n1Var2, 20);
                            n1Var2.h = q1Var;
                            LiteMode.addOnPowerSaverAppliedListener(q1Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setBackground(drawable);
                return;
        }
    }

    public n20(Object obj, Context context, int i10) {
        super(context);
        this.f38793a = i10;
        this.f38794b = obj;
    }

    public n20(Context context, s50 s50Var) {
        super(context);
        this.f38793a = 1;
        this.f38794b = s50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new tv(10, this, context));
    }
}
