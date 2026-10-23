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
public final class e50 extends View {
    public final int f36819a;
    public Object f36820b;

    public e50(Context context) {
        super(context);
        this.f36819a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36819a) {
            case 0:
                super.dispatchDraw(canvas);
                f50 f50Var = (f50) this.f36820b;
                if (f50Var != null && f50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f36819a) {
            case 0:
                super.onAttachedToWindow();
                f50 f50Var = (f50) this.f36820b;
                if (f50Var != null) {
                    f50Var.f37215g = this;
                    int i10 = 0;
                    while (true) {
                        h50[] h50VarArr = f50Var.f37213c;
                        if (i10 < h50VarArr.length) {
                            h50 h50Var = h50VarArr[i10];
                            h50Var.f37749i.add(this);
                            h50Var.a();
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
                yh.l1 l1Var = (yh.l1) this.f36820b;
                if (l1Var != null && !l1Var.f50824i) {
                    l1Var.f50824i = true;
                    l1Var.a();
                    ig.k0 k0Var = new ig.k0(l1Var, 26);
                    l1Var.h = k0Var;
                    LiteMode.addOnPowerSaverAppliedListener(k0Var);
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
        switch (this.f36819a) {
            case 0:
                super.onDetachedFromWindow();
                f50 f50Var = (f50) this.f36820b;
                if (f50Var != null && f50Var.f37215g != this) {
                    int i10 = 0;
                    while (true) {
                        h50[] h50VarArr = f50Var.f37213c;
                        if (i10 < h50VarArr.length) {
                            h50 h50Var = h50VarArr[i10];
                            h50Var.f37749i.remove(this);
                            h50Var.a();
                            i10++;
                        } else {
                            f50Var.f37215g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                yh.l1 l1Var = (yh.l1) this.f36820b;
                if (l1Var != null && l1Var.f50824i) {
                    l1Var.f50824i = false;
                    l1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(l1Var.h);
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
        switch (this.f36819a) {
            case 1:
                canvas.drawColor(((fj0) this.f36820b).getThemedColor(org.telegram.ui.ActionBar.k6.e7));
                return;
            case 2:
                vp0 vp0Var = (vp0) this.f36820b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, vp0Var.f42806c.size())));
                int ceil = (int) Math.ceil(vp0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                vp0Var.S.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.C5, false));
                vp0Var.U.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21254h5, false));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                vp0Var.T.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(vp0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), vp0Var.U);
                vp0Var.U.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B5, false));
                vp0Var.T.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(vp0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), vp0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), vp0Var.S);
                return;
            case 3:
                mq0 mq0Var = (mq0) this.f36820b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, mq0Var.f39647c.size())));
                int ceil2 = (int) Math.ceil(mq0Var.f39654h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                mq0Var.f39654h0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.C5, false));
                mq0Var.f39656j0.setColor(org.telegram.ui.ActionBar.k6.x0(null, mq0Var.f39669u0, false));
                int i13 = max2 / 2;
                int i14 = measuredWidth2 - i13;
                int i15 = i13 + measuredWidth2;
                mq0Var.f39655i0.set(i14, 0.0f, i15, getMeasuredHeight());
                canvas.drawRoundRect(mq0Var.f39655i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), mq0Var.f39656j0);
                mq0Var.f39656j0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B5, false));
                mq0Var.f39655i0.set(AndroidUtilities.dp(2.0f) + i14, AndroidUtilities.dp(2.0f), i15 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(mq0Var.f39655i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), mq0Var.f39656j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), mq0Var.f39654h0);
                return;
            case 4:
                ((PhotoViewer) this.f36820b).f33687q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 8:
            case 9:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                ((SecretMediaViewer) this.f36820b).Q.a(canvas, this);
                return;
            case 10:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.f36820b;
                float d = x5Var.K.d(x5Var.J, false);
                if (x5Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.x5.a(x5Var, canvas, d);
                    return;
                }
                return;
            case 11:
                super.onDraw(canvas);
                sg.j0 j0Var = (sg.j0) this.f36820b;
                if (j0Var.f46720p0 - j0Var.f46719o0 > 1) {
                    Paint V0 = org.telegram.ui.ActionBar.k6.V0("paintDivider", sg.j0.f0(j0Var));
                    if (V0 == null) {
                        V0 = org.telegram.ui.ActionBar.k6.f21304k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, V0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f36819a) {
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                q41 q41Var = (q41) this.f36820b;
                int[] iArr = q41Var.G;
                getLocationOnScreen(iArr);
                Rect rect = q41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(q41Var.f43501c, rect, q41Var.I, q41Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f36819a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                kw0 kw0Var = (kw0) this.f36820b;
                PremiumPreviewFragment premiumPreviewFragment = kw0Var.f39082c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + kw0Var.f39082c.U.getMeasuredHeight() > dp) {
                        dp = kw0Var.f39082c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    kw0Var.f39082c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(kw0Var.f39082c.Y, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f36819a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f36820b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 9:
                super.setAlpha(f7);
                View view2 = ((ye1) this.f36820b).fragmentView;
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
        switch (this.f36819a) {
            case 12:
                if (((yh.l1) this.f36820b) != null) {
                    if (isAttachedToWindow()) {
                        yh.l1 l1Var = (yh.l1) this.f36820b;
                        if (l1Var.f50824i) {
                            l1Var.f50824i = false;
                            l1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(l1Var.h);
                        }
                    }
                    this.f36820b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof yh.l1) {
                    this.f36820b = (yh.l1) drawable;
                    if (isAttachedToWindow()) {
                        yh.l1 l1Var2 = (yh.l1) this.f36820b;
                        if (!l1Var2.f50824i) {
                            l1Var2.f50824i = true;
                            l1Var2.a();
                            ig.k0 k0Var = new ig.k0(l1Var2, 26);
                            l1Var2.h = k0Var;
                            LiteMode.addOnPowerSaverAppliedListener(k0Var);
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

    public e50(Object obj, Context context, int i10) {
        super(context);
        this.f36819a = i10;
        this.f36820b = obj;
    }

    public e50(Context context, f50 f50Var) {
        super(context);
        this.f36819a = 0;
        this.f36820b = f50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new org.telegram.ui.Components.d51(21, this, context));
    }
}
