package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CheckBoxBase;
public final class iw0 extends View {
    public final int f37945a;
    public final Object f37946b;

    public iw0(Object obj, Context context, int i10) {
        super(context);
        this.f37945a = i10;
        this.f37946b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37945a) {
            case 6:
                canvas.save();
                qh.ca caVar = (qh.ca) this.f37946b;
                canvas.translate(caVar.Z0.getX() + caVar.f45102i0.getX(), caVar.Z0.getY() + caVar.f45102i0.getY());
                qh.r9 r9Var = caVar.Z0;
                r9Var.k(canvas, r9Var.getBounds(), caVar.Z0.getOver2Alpha());
                canvas.restore();
                return;
            case 11:
                og.b bVar = ((vg.f) this.f37946b).F;
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
        switch (this.f37945a) {
            case 10:
                super.onAttachedToWindow();
                ((uf.z0) this.f37946b).f48787f = true;
                return;
            case 13:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f37946b).f24804l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f37945a) {
            case 10:
                super.onDetachedFromWindow();
                ((uf.z0) this.f37946b).f48787f = false;
                return;
            case 13:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f37946b).f24804l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        switch (this.f37945a) {
            case 2:
                o21 o21Var = (o21) this.f37946b;
                if (o21Var.H) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.fc0 fc0Var = o21Var.f39570n;
                if (fc0Var != null) {
                    fc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                o21Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.fc0 fc0Var2 = o21Var.f39570n;
                if (fc0Var2 != null) {
                    fc0Var2.draw(canvas);
                }
                o21Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 3:
                ((SecretMediaViewer) this.f37946b).N.a(canvas, this);
                return;
            case 9:
                super.onDraw(canvas);
                th.i0 i0Var = (th.i0) this.f37946b;
                lf.b0 b0Var = i0Var.H;
                float max = Math.max(i0Var.f48132b.f50504e, i0Var.f48133c.f50504e);
                lf.b0 b0Var2 = i0Var.G;
                b0Var2.c(AndroidUtilities.dp(42.0f) + i0Var.R.f7758b, 0);
                b0Var2.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + i0Var.R.f7758b);
                int i11 = org.telegram.ui.ActionBar.k6.f21605a7;
                b0Var2.b(org.telegram.ui.ActionBar.k6.l1(AndroidUtilities.lerp(1.0f, 0.8f, max), i0Var.getThemedColor(i11)));
                b0Var2.draw(canvas);
                if (i0Var.K) {
                    max = 1.0f;
                }
                int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + i0Var.R.d, 0, max);
                int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, max) + i0Var.R.d;
                float lerp3 = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(i0Var.R.d), max);
                b0Var.c(0, lerp);
                b0Var.setBounds(0, getHeight() - lerp2, getWidth(), getHeight());
                b0Var.b(org.telegram.ui.ActionBar.k6.l1(lerp3, i0Var.getThemedColor(i11)));
                b0Var.draw(canvas);
                return;
            case 12:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((wh.r0) this.f37946b).f49962c.draw(canvas);
                canvas.restore();
                return;
            case 13:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f37946b;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f37945a) {
            case 4:
                super.onLayout(z4, i10, i11, i12, i13);
                g51 g51Var = (g51) this.f37946b;
                int[] iArr = g51Var.D;
                getLocationOnScreen(iArr);
                Rect rect = g51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(g51Var.f39320c, rect, g51Var.F, g51Var.f39321e);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        switch (this.f37945a) {
            case 0:
                jw0 jw0Var = (jw0) this.f37946b;
                PremiumPreviewFragment premiumPreviewFragment = jw0Var.f38234c;
                if (premiumPreviewFragment.T) {
                    premiumPreviewFragment.V = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + jw0Var.f38234c.R.getMeasuredHeight() > dp) {
                        dp = jw0Var.f38234c.R.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    jw0Var.f38234c.V = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(jw0Var.f38234c.V, 1073741824));
                return;
            case 7:
                rh.g gVar = (rh.g) this.f37946b;
                if (gVar.E) {
                    i12 = (rh.g.y0(gVar).getMeasuredHeight() + gVar.F) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + gVar.F;
                    if (AndroidUtilities.dp(24.0f) + gVar.f38949y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + gVar.f38949y.getMeasuredHeight();
                    }
                    i12 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 8:
                sh.j jVar = (sh.j) this.f37946b;
                if (jVar.E) {
                    i13 = (sh.j.B0(jVar).getMeasuredHeight() + jVar.F) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp3 = AndroidUtilities.dp(140.0f) + jVar.F;
                    if (AndroidUtilities.dp(24.0f) + jVar.f38949y.getMeasuredHeight() > dp3) {
                        dp3 = AndroidUtilities.dp(24.0f) + jVar.f38949y.getMeasuredHeight();
                    }
                    i13 = dp3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), 1073741824));
                return;
            case 10:
                ((View) getParent()).getMeasuredHeight();
                uf.z0 z0Var = (uf.z0) this.f37946b;
                Integer num = z0Var.d;
                if (num != null) {
                    i14 = num.intValue();
                    z0Var.h = i14;
                } else {
                    i14 = 0;
                    z0Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
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
    public void setAlpha(float f10) {
        switch (this.f37945a) {
            case 1:
                super.setAlpha(f10);
                View view = ((ProfileActivity) this.f37946b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 5:
                super.setAlpha(f10);
                View view2 = ((mf1) this.f37946b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    public iw0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f37945a = 13;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, g6Var);
        this.f37946b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.k6.hl, org.telegram.ui.ActionBar.k6.f22052z5, org.telegram.ui.ActionBar.k6.f21786k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
