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
    public final int f41075a;
    public Object f41076b;

    public q50(Context context) {
        super(context);
        this.f41075a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41075a) {
            case 0:
                super.dispatchDraw(canvas);
                r50 r50Var = (r50) this.f41076b;
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
        switch (this.f41075a) {
            case 0:
                super.onAttachedToWindow();
                r50 r50Var = (r50) this.f41076b;
                if (r50Var != null) {
                    r50Var.f41360g = this;
                    int i10 = 0;
                    while (true) {
                        t50[] t50VarArr = r50Var.f41357c;
                        if (i10 < t50VarArr.length) {
                            t50 t50Var = t50VarArr[i10];
                            t50Var.f42107i.add(this);
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
                xh.o1 o1Var = (xh.o1) this.f41076b;
                if (o1Var != null && !o1Var.f51555i) {
                    o1Var.f51555i = true;
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
        switch (this.f41075a) {
            case 0:
                super.onDetachedFromWindow();
                r50 r50Var = (r50) this.f41076b;
                if (r50Var != null && r50Var.f41360g != this) {
                    int i10 = 0;
                    while (true) {
                        t50[] t50VarArr = r50Var.f41357c;
                        if (i10 < t50VarArr.length) {
                            t50 t50Var = t50VarArr[i10];
                            t50Var.f42107i.remove(this);
                            t50Var.a();
                            i10++;
                        } else {
                            r50Var.f41360g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                xh.o1 o1Var = (xh.o1) this.f41076b;
                if (o1Var != null && o1Var.f51555i) {
                    o1Var.f51555i = false;
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
        switch (this.f41075a) {
            case 1:
                canvas.drawColor(((rj0) this.f41076b).getThemedColor(org.telegram.ui.ActionBar.h6.e7));
                return;
            case 2:
                jq0 jq0Var = (jq0) this.f41076b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, jq0Var.f39135c.size())));
                int ceil = (int) Math.ceil(jq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                jq0Var.S.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                jq0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20893h5, false));
                int i11 = max / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                jq0Var.T.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(jq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), jq0Var.U);
                jq0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                jq0Var.T.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(jq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), jq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), jq0Var.S);
                return;
            case 3:
                ar0 ar0Var = (ar0) this.f41076b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, ar0Var.f36171c.size())));
                int ceil2 = (int) Math.ceil(ar0Var.f36179h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                ar0Var.f36179h0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                ar0Var.f36181j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, ar0Var.f36194u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                ar0Var.f36180i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(ar0Var.f36180i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), ar0Var.f36181j0);
                ar0Var.f36181j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                ar0Var.f36180i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(ar0Var.f36180i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ar0Var.f36181j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), ar0Var.f36179h0);
                return;
            case 4:
                ((PhotoViewer) this.f41076b).f34072q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                d31 d31Var = (d31) this.f41076b;
                if (d31Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.cd0 cd0Var = d31Var.f36921n;
                if (cd0Var != null) {
                    cd0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                d31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.cd0 cd0Var2 = d31Var.f36921n;
                if (cd0Var2 != null) {
                    cd0Var2.draw(canvas);
                }
                d31Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f41076b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.f41076b;
                if (j0Var.f47412p0 - j0Var.f47411o0 > 1) {
                    Paint U0 = org.telegram.ui.ActionBar.h6.U0("paintDivider", rg.j0.g0(j0Var));
                    if (U0 == null) {
                        U0 = org.telegram.ui.ActionBar.h6.f20944k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41075a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                y51 y51Var = (y51) this.f41076b;
                int[] iArr = y51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = y51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(y51Var.f37600c, rect, y51Var.I, y51Var.f37601e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f41075a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                bx0 bx0Var = (bx0) this.f41076b;
                PremiumPreviewFragment premiumPreviewFragment = bx0Var.f36501c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + bx0Var.f36501c.U.getMeasuredHeight() > dp) {
                        dp = bx0Var.f36501c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    bx0Var.f36501c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(bx0Var.f36501c.Y, 1073741824));
                return;
            case 13:
                yh.p7 p7Var = (yh.p7) this.f41076b;
                if (p7Var.H) {
                    i12 = (yh.p7.D0(p7Var).getMeasuredHeight() + p7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + p7Var.I;
                    if (AndroidUtilities.dp(24.0f) + p7Var.f40434y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + p7Var.f40434y.getMeasuredHeight();
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
        switch (this.f41075a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f41076b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((eg1) this.f41076b).fragmentView;
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
        switch (this.f41075a) {
            case 12:
                if (((xh.o1) this.f41076b) != null) {
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var = (xh.o1) this.f41076b;
                        if (o1Var.f51555i) {
                            o1Var.f51555i = false;
                            o1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(o1Var.h);
                        }
                    }
                    this.f41076b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.o1) {
                    this.f41076b = (xh.o1) drawable;
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var2 = (xh.o1) this.f41076b;
                        if (!o1Var2.f51555i) {
                            o1Var2.f51555i = true;
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
        this.f41075a = i10;
        this.f41076b = obj;
    }

    public q50(Context context, r50 r50Var) {
        super(context);
        this.f41075a = 0;
        this.f41076b = r50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new qv(10, this, context));
    }
}
