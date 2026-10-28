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
public final class b20 extends View {
    public final int f37869a;
    public Object f37870b;

    public b20(Context context) {
        super(context);
        this.f37869a = 13;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37869a) {
            case 1:
                super.dispatchDraw(canvas);
                h50 h50Var = (h50) this.f37870b;
                if (h50Var != null && h50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f37869a) {
            case 1:
                super.onAttachedToWindow();
                h50 h50Var = (h50) this.f37870b;
                if (h50Var != null) {
                    h50Var.f39779g = this;
                    int i10 = 0;
                    while (true) {
                        j50[] j50VarArr = h50Var.f39777c;
                        if (i10 < j50VarArr.length) {
                            j50 j50Var = j50VarArr[i10];
                            j50Var.f40438i.add(this);
                            j50Var.a();
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
                zh.m1 m1Var = (zh.m1) this.f37870b;
                if (m1Var != null && !m1Var.f53200i) {
                    m1Var.f53200i = true;
                    m1Var.a();
                    zh.l1 l1Var = new zh.l1(m1Var, 0);
                    m1Var.h = l1Var;
                    LiteMode.addOnPowerSaverAppliedListener(l1Var);
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
        switch (this.f37869a) {
            case 1:
                super.onDetachedFromWindow();
                h50 h50Var = (h50) this.f37870b;
                if (h50Var != null && h50Var.f39779g != this) {
                    int i10 = 0;
                    while (true) {
                        j50[] j50VarArr = h50Var.f39777c;
                        if (i10 < j50VarArr.length) {
                            j50 j50Var = j50VarArr[i10];
                            j50Var.f40438i.remove(this);
                            j50Var.a();
                            i10++;
                        } else {
                            h50Var.f39779g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 13:
                super.onDetachedFromWindow();
                zh.m1 m1Var = (zh.m1) this.f37870b;
                if (m1Var != null && m1Var.f53200i) {
                    m1Var.f53200i = false;
                    m1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
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
        switch (this.f37869a) {
            case 2:
                canvas.drawColor(((ej0) this.f37870b).getThemedColor(org.telegram.ui.ActionBar.y6.f23377e7));
                return;
            case 3:
                cq0 cq0Var = (cq0) this.f37870b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, cq0Var.f38434c.size())));
                int ceil = (int) Math.ceil(cq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                cq0Var.S.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.C5, false));
                cq0Var.U.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                cq0Var.T.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(cq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), cq0Var.U);
                cq0Var.U.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B5, false));
                cq0Var.T.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(cq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), cq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), cq0Var.S);
                return;
            case 4:
                tq0 tq0Var = (tq0) this.f37870b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, tq0Var.f43732c.size())));
                int ceil2 = (int) Math.ceil(tq0Var.f43739h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                tq0Var.f43739h0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.C5, false));
                tq0Var.f43741j0.setColor(org.telegram.ui.ActionBar.y6.x0(null, tq0Var.f43754u0, false));
                int i13 = max2 / 2;
                int i14 = measuredWidth2 - i13;
                int i15 = i13 + measuredWidth2;
                tq0Var.f43740i0.set(i14, 0.0f, i15, getMeasuredHeight());
                canvas.drawRoundRect(tq0Var.f43740i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), tq0Var.f43741j0);
                tq0Var.f43741j0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B5, false));
                tq0Var.f43740i0.set(AndroidUtilities.dp(2.0f) + i14, AndroidUtilities.dp(2.0f), i15 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(tq0Var.f43740i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), tq0Var.f43741j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), tq0Var.f43739h0);
                return;
            case 5:
                ((PhotoViewer) this.f37870b).f35778q3.a(canvas, this);
                return;
            case 6:
            case 7:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f37870b).Q.a(canvas, this);
                return;
            case 11:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f37870b;
                float d = w5Var.K.d(w5Var.J, false);
                if (w5Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.w5.a(w5Var, canvas, d);
                    return;
                }
                return;
            case 12:
                super.onDraw(canvas);
                tg.j0 j0Var = (tg.j0) this.f37870b;
                if (j0Var.f48933p0 - j0Var.f48932o0 > 1) {
                    Paint V0 = org.telegram.ui.ActionBar.y6.V0("paintDivider", tg.j0.f0(j0Var));
                    if (V0 == null) {
                        V0 = org.telegram.ui.ActionBar.y6.f23479k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, V0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37869a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                u41 u41Var = (u41) this.f37870b;
                int[] iArr = u41Var.G;
                getLocationOnScreen(iArr);
                Rect rect = u41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(u41Var.f37896c, rect, u41Var.I, u41Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f37869a) {
            case 0:
                f20 f20Var = (f20) this.f37870b;
                if (f20Var.H) {
                    f20Var.J = (f20Var.l0().getMeasuredHeight() + f20Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + f20Var.I;
                    if (AndroidUtilities.dp(24.0f) + f20Var.f39138y.getMeasuredHeight() > dp) {
                        dp = Math.max(dp, (AndroidUtilities.dp(24.0f) + f20Var.f39138y.getMeasuredHeight()) - f20Var.L);
                    }
                    f20Var.J = dp;
                }
                int i12 = (int) (f20Var.J - (0 * 2.5f));
                f20Var.J = i12;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 6:
                qw0 qw0Var = (qw0) this.f37870b;
                PremiumPreviewFragment premiumPreviewFragment = qw0Var.f42803c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp2 = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + qw0Var.f42803c.U.getMeasuredHeight() > dp2) {
                        dp2 = qw0Var.f42803c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    qw0Var.f42803c.Y = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(qw0Var.f42803c.Y, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f37869a) {
            case 7:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f37870b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((cf1) this.f37870b).fragmentView;
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
        switch (this.f37869a) {
            case 13:
                if (((zh.m1) this.f37870b) != null) {
                    if (isAttachedToWindow()) {
                        zh.m1 m1Var = (zh.m1) this.f37870b;
                        if (m1Var.f53200i) {
                            m1Var.f53200i = false;
                            m1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
                        }
                    }
                    this.f37870b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof zh.m1) {
                    this.f37870b = (zh.m1) drawable;
                    if (isAttachedToWindow()) {
                        zh.m1 m1Var2 = (zh.m1) this.f37870b;
                        if (!m1Var2.f53200i) {
                            m1Var2.f53200i = true;
                            m1Var2.a();
                            zh.l1 l1Var = new zh.l1(m1Var2, 0);
                            m1Var2.h = l1Var;
                            LiteMode.addOnPowerSaverAppliedListener(l1Var);
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

    public b20(Object obj, Context context, int i10) {
        super(context);
        this.f37869a = i10;
        this.f37870b = obj;
    }

    public b20(Context context, h50 h50Var) {
        super(context);
        this.f37869a = 1;
        this.f37870b = h50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new org.telegram.ui.Components.l51(21, this, context));
    }
}
