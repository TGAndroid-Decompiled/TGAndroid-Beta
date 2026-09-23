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
public final class p50 extends View {
    public final int f36025a;
    public Object f36026b;

    public p50(Context context) {
        super(context);
        this.f36025a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36025a) {
            case 0:
                super.dispatchDraw(canvas);
                q50 q50Var = (q50) this.f36026b;
                if (q50Var != null && q50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f36025a) {
            case 0:
                super.onAttachedToWindow();
                q50 q50Var = (q50) this.f36026b;
                if (q50Var != null) {
                    q50Var.f36291g = this;
                    int i10 = 0;
                    while (true) {
                        s50[] s50VarArr = q50Var.f36289c;
                        if (i10 < s50VarArr.length) {
                            s50 s50Var = s50VarArr[i10];
                            s50Var.f37122i.add(this);
                            s50Var.a();
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
                xh.o1 o1Var = (xh.o1) this.f36026b;
                if (o1Var != null && !o1Var.f45998i) {
                    o1Var.f45998i = true;
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
        switch (this.f36025a) {
            case 0:
                super.onDetachedFromWindow();
                q50 q50Var = (q50) this.f36026b;
                if (q50Var != null && q50Var.f36291g != this) {
                    int i10 = 0;
                    while (true) {
                        s50[] s50VarArr = q50Var.f36289c;
                        if (i10 < s50VarArr.length) {
                            s50 s50Var = s50VarArr[i10];
                            s50Var.f37122i.remove(this);
                            s50Var.a();
                            i10++;
                        } else {
                            q50Var.f36291g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                xh.o1 o1Var = (xh.o1) this.f36026b;
                if (o1Var != null && o1Var.f45998i) {
                    o1Var.f45998i = false;
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
        switch (this.f36025a) {
            case 1:
                canvas.drawColor(((lj0) this.f36026b).getThemedColor(org.telegram.ui.ActionBar.h6.e7));
                return;
            case 2:
                dq0 dq0Var = (dq0) this.f36026b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, dq0Var.f32697c.size())));
                int ceil = (int) Math.ceil(dq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                dq0Var.S.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.C5, false));
                dq0Var.U.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18859h5, false));
                int i11 = max / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                dq0Var.T.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(dq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), dq0Var.U);
                dq0Var.U.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B5, false));
                dq0Var.T.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(dq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), dq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), dq0Var.S);
                return;
            case 3:
                uq0 uq0Var = (uq0) this.f36026b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, uq0Var.f38171c.size())));
                int ceil2 = (int) Math.ceil(uq0Var.f38178h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                uq0Var.f38178h0.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.C5, false));
                uq0Var.f38180j0.setColor(org.telegram.ui.ActionBar.h6.w0(null, uq0Var.f38193u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                uq0Var.f38179i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(uq0Var.f38179i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), uq0Var.f38180j0);
                uq0Var.f38180j0.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B5, false));
                uq0Var.f38179i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(uq0Var.f38179i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), uq0Var.f38180j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), uq0Var.f38178h0);
                return;
            case 4:
                ((PhotoViewer) this.f36026b).f31014q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                x21 x21Var = (x21) this.f36026b;
                if (x21Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.bc0 bc0Var = x21Var.f39173n;
                if (bc0Var != null) {
                    bc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                x21Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.bc0 bc0Var2 = x21Var.f39173n;
                if (bc0Var2 != null) {
                    bc0Var2.draw(canvas);
                }
                x21Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f36026b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.f36026b;
                if (j0Var.f42275p0 - j0Var.f42274o0 > 1) {
                    Paint T0 = org.telegram.ui.ActionBar.h6.T0("paintDivider", rg.j0.f0(j0Var));
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.h6.f18910k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f36025a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                o51 o51Var = (o51) this.f36026b;
                int[] iArr = o51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = o51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(o51Var.f38306c, rect, o51Var.I, o51Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f36025a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                vw0 vw0Var = (vw0) this.f36026b;
                PremiumPreviewFragment premiumPreviewFragment = vw0Var.f38487c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + vw0Var.f38487c.U.getMeasuredHeight() > dp) {
                        dp = vw0Var.f38487c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    vw0Var.f38487c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(vw0Var.f38487c.Y, 1073741824));
                return;
            case 13:
                yh.w7 w7Var = (yh.w7) this.f36026b;
                if (w7Var.H) {
                    i12 = (yh.w7.C0(w7Var).getMeasuredHeight() + w7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + w7Var.I;
                    if (AndroidUtilities.dp(24.0f) + w7Var.f35667y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + w7Var.f35667y.getMeasuredHeight();
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
        switch (this.f36025a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f36026b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((wf1) this.f36026b).fragmentView;
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
        switch (this.f36025a) {
            case 12:
                if (((xh.o1) this.f36026b) != null) {
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var = (xh.o1) this.f36026b;
                        if (o1Var.f45998i) {
                            o1Var.f45998i = false;
                            o1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(o1Var.h);
                        }
                    }
                    this.f36026b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.o1) {
                    this.f36026b = (xh.o1) drawable;
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var2 = (xh.o1) this.f36026b;
                        if (!o1Var2.f45998i) {
                            o1Var2.f45998i = true;
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

    public p50(Object obj, Context context, int i10) {
        super(context);
        this.f36025a = i10;
        this.f36026b = obj;
    }

    public p50(Context context, q50 q50Var) {
        super(context);
        this.f36025a = 0;
        this.f36026b = q50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new pv(10, this, context));
    }
}
