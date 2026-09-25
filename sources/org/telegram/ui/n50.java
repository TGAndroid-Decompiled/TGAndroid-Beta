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
public final class n50 extends View {
    public final int f35751a;
    public Object f35752b;

    public n50(Context context) {
        super(context);
        this.f35751a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f35751a) {
            case 0:
                super.dispatchDraw(canvas);
                o50 o50Var = (o50) this.f35752b;
                if (o50Var != null && o50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f35751a) {
            case 0:
                super.onAttachedToWindow();
                o50 o50Var = (o50) this.f35752b;
                if (o50Var != null) {
                    o50Var.f36055g = this;
                    int i10 = 0;
                    while (true) {
                        q50[] q50VarArr = o50Var.f36053c;
                        if (i10 < q50VarArr.length) {
                            q50 q50Var = q50VarArr[i10];
                            q50Var.f36795i.add(this);
                            q50Var.a();
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
                xh.o1 o1Var = (xh.o1) this.f35752b;
                if (o1Var != null && !o1Var.f46327i) {
                    o1Var.f46327i = true;
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
        switch (this.f35751a) {
            case 0:
                super.onDetachedFromWindow();
                o50 o50Var = (o50) this.f35752b;
                if (o50Var != null && o50Var.f36055g != this) {
                    int i10 = 0;
                    while (true) {
                        q50[] q50VarArr = o50Var.f36053c;
                        if (i10 < q50VarArr.length) {
                            q50 q50Var = q50VarArr[i10];
                            q50Var.f36795i.remove(this);
                            q50Var.a();
                            i10++;
                        } else {
                            o50Var.f36055g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                xh.o1 o1Var = (xh.o1) this.f35752b;
                if (o1Var != null && o1Var.f46327i) {
                    o1Var.f46327i = false;
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
        switch (this.f35751a) {
            case 1:
                canvas.drawColor(((kj0) this.f35752b).getThemedColor(org.telegram.ui.ActionBar.h6.e7));
                return;
            case 2:
                cq0 cq0Var = (cq0) this.f35752b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, cq0Var.f32774c.size())));
                int ceil = (int) Math.ceil(cq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                cq0Var.S.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.C5, false));
                cq0Var.U.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19130h5, false));
                int i11 = max / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                cq0Var.T.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(cq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), cq0Var.U);
                cq0Var.U.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B5, false));
                cq0Var.T.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(cq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), cq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), cq0Var.S);
                return;
            case 3:
                tq0 tq0Var = (tq0) this.f35752b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, tq0Var.f38193c.size())));
                int ceil2 = (int) Math.ceil(tq0Var.f38200h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                tq0Var.f38200h0.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.C5, false));
                tq0Var.f38202j0.setColor(org.telegram.ui.ActionBar.h6.w0(null, tq0Var.f38215u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                tq0Var.f38201i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(tq0Var.f38201i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), tq0Var.f38202j0);
                tq0Var.f38202j0.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B5, false));
                tq0Var.f38201i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(tq0Var.f38201i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), tq0Var.f38202j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), tq0Var.f38200h0);
                return;
            case 4:
                ((PhotoViewer) this.f35752b).f31330q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                w21 w21Var = (w21) this.f35752b;
                if (w21Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.mc0 mc0Var = w21Var.f38877n;
                if (mc0Var != null) {
                    mc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                w21Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.mc0 mc0Var2 = w21Var.f38877n;
                if (mc0Var2 != null) {
                    mc0Var2.draw(canvas);
                }
                w21Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f35752b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.f35752b;
                if (j0Var.f42609p0 - j0Var.f42608o0 > 1) {
                    Paint T0 = org.telegram.ui.ActionBar.h6.T0("paintDivider", rg.j0.f0(j0Var));
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.h6.f19181k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f35751a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                p51 p51Var = (p51) this.f35752b;
                int[] iArr = p51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = p51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(p51Var.f38906c, rect, p51Var.I, p51Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f35751a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                tw0 tw0Var = (tw0) this.f35752b;
                PremiumPreviewFragment premiumPreviewFragment = tw0Var.f38249c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + tw0Var.f38249c.U.getMeasuredHeight() > dp) {
                        dp = tw0Var.f38249c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    tw0Var.f38249c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(tw0Var.f38249c.Y, 1073741824));
                return;
            case 13:
                yh.w7 w7Var = (yh.w7) this.f35752b;
                if (w7Var.H) {
                    i12 = (yh.w7.C0(w7Var).getMeasuredHeight() + w7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + w7Var.I;
                    if (AndroidUtilities.dp(24.0f) + w7Var.f35457y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + w7Var.f35457y.getMeasuredHeight();
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
        switch (this.f35751a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f35752b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((wf1) this.f35752b).fragmentView;
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
        switch (this.f35751a) {
            case 12:
                if (((xh.o1) this.f35752b) != null) {
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var = (xh.o1) this.f35752b;
                        if (o1Var.f46327i) {
                            o1Var.f46327i = false;
                            o1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(o1Var.h);
                        }
                    }
                    this.f35752b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.o1) {
                    this.f35752b = (xh.o1) drawable;
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var2 = (xh.o1) this.f35752b;
                        if (!o1Var2.f46327i) {
                            o1Var2.f46327i = true;
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

    public n50(Object obj, Context context, int i10) {
        super(context);
        this.f35751a = i10;
        this.f35752b = obj;
    }

    public n50(Context context, o50 o50Var) {
        super(context);
        this.f35751a = 0;
        this.f35752b = o50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new ov(10, this, context));
    }
}
