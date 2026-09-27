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
public final class q50 extends View {
    public final int f36617a;
    public Object f36618b;

    public q50(Context context) {
        super(context);
        this.f36617a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36617a) {
            case 0:
                super.dispatchDraw(canvas);
                r50 r50Var = (r50) this.f36618b;
                if (r50Var != null && r50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f36617a) {
            case 0:
                super.onAttachedToWindow();
                r50 r50Var = (r50) this.f36618b;
                if (r50Var != null) {
                    r50Var.f36998g = this;
                    int i10 = 0;
                    while (true) {
                        t50[] t50VarArr = r50Var.f36996c;
                        if (i10 < t50VarArr.length) {
                            t50 t50Var = t50VarArr[i10];
                            t50Var.f37655i.add(this);
                            t50Var.a();
                            i10++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 12:
                super.onAttachedToWindow();
                xh.o1 o1Var = (xh.o1) this.f36618b;
                if (o1Var != null && !o1Var.f46393i) {
                    o1Var.f46393i = true;
                    o1Var.a();
                    ii.q1 q1Var = new ii.q1(o1Var, 20);
                    o1Var.h = q1Var;
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
        switch (this.f36617a) {
            case 0:
                super.onDetachedFromWindow();
                r50 r50Var = (r50) this.f36618b;
                if (r50Var != null && r50Var.f36998g != this) {
                    int i10 = 0;
                    while (true) {
                        t50[] t50VarArr = r50Var.f36996c;
                        if (i10 < t50VarArr.length) {
                            t50 t50Var = t50VarArr[i10];
                            t50Var.f37655i.remove(this);
                            t50Var.a();
                            i10++;
                        } else {
                            r50Var.f36998g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                xh.o1 o1Var = (xh.o1) this.f36618b;
                if (o1Var != null && o1Var.f46393i) {
                    o1Var.f46393i = false;
                    o1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(o1Var.h);
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
        switch (this.f36617a) {
            case 1:
                canvas.drawColor(((nj0) this.f36618b).getThemedColor(org.telegram.ui.ActionBar.i6.e7));
                return;
            case 2:
                fq0 fq0Var = (fq0) this.f36618b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, fq0Var.f33609c.size())));
                int ceil = (int) Math.ceil(fq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                fq0Var.S.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.C5, false));
                fq0Var.U.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19128h5, false));
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
            case 3:
                wq0 wq0Var = (wq0) this.f36618b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, wq0Var.f39415c.size())));
                int ceil2 = (int) Math.ceil(wq0Var.f39422h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                wq0Var.f39422h0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.C5, false));
                wq0Var.f39424j0.setColor(org.telegram.ui.ActionBar.i6.w0(null, wq0Var.f39437u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                wq0Var.f39423i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(wq0Var.f39423i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), wq0Var.f39424j0);
                wq0Var.f39424j0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B5, false));
                wq0Var.f39423i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(wq0Var.f39423i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), wq0Var.f39424j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), wq0Var.f39422h0);
                return;
            case 4:
                ((PhotoViewer) this.f36618b).f31331q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                y21 y21Var = (y21) this.f36618b;
                if (y21Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.nc0 nc0Var = y21Var.f40116n;
                if (nc0Var != null) {
                    nc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                y21Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.nc0 nc0Var2 = y21Var.f40116n;
                if (nc0Var2 != null) {
                    nc0Var2.draw(canvas);
                }
                y21Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f36618b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.f36618b;
                if (j0Var.f42653p0 - j0Var.f42652o0 > 1) {
                    Paint T0 = org.telegram.ui.ActionBar.i6.T0("paintDivider", rg.j0.f0(j0Var));
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.i6.f19179k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f36617a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                r51 r51Var = (r51) this.f36618b;
                int[] iArr = r51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = r51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(r51Var.f40142c, rect, r51Var.I, r51Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f36617a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                ww0 ww0Var = (ww0) this.f36618b;
                PremiumPreviewFragment premiumPreviewFragment = ww0Var.f39467c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + ww0Var.f39467c.U.getMeasuredHeight() > dp) {
                        dp = ww0Var.f39467c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    ww0Var.f39467c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ww0Var.f39467c.Y, 1073741824));
                return;
            case 13:
                yh.v7 v7Var = (yh.v7) this.f36618b;
                if (v7Var.H) {
                    i12 = (yh.v7.C0(v7Var).getMeasuredHeight() + v7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + v7Var.I;
                    if (AndroidUtilities.dp(24.0f) + v7Var.f36312y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + v7Var.f36312y.getMeasuredHeight();
                    }
                    i12 = dp2;
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
        switch (this.f36617a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f36618b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((wf1) this.f36618b).fragmentView;
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
        switch (this.f36617a) {
            case 12:
                if (((xh.o1) this.f36618b) != null) {
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var = (xh.o1) this.f36618b;
                        if (o1Var.f46393i) {
                            o1Var.f46393i = false;
                            o1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(o1Var.h);
                        }
                    }
                    this.f36618b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.o1) {
                    this.f36618b = (xh.o1) drawable;
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var2 = (xh.o1) this.f36618b;
                        if (!o1Var2.f46393i) {
                            o1Var2.f46393i = true;
                            o1Var2.a();
                            ii.q1 q1Var = new ii.q1(o1Var2, 20);
                            o1Var2.h = q1Var;
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

    public q50(Object obj, Context context, int i10) {
        super(context);
        this.f36617a = i10;
        this.f36618b = obj;
    }

    public q50(Context context, r50 r50Var) {
        super(context);
        this.f36617a = 0;
        this.f36618b = r50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new rv(10, this, context));
    }
}
