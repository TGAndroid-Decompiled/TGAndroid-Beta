package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.f6;
import org.telegram.ui.fs0;
import org.telegram.ui.hm0;
import org.telegram.ui.k30;
import org.telegram.ui.kg0;
import org.telegram.ui.l00;
import org.telegram.ui.lp0;
import org.telegram.ui.m91;
import org.telegram.ui.sm0;
import org.telegram.ui.uw;
import org.telegram.ui.wz0;
public final class r0 extends View {
    public final int f39582a;
    public final Object f39583b;

    public r0(int i3, Context context, Object obj) {
        super(context);
        this.f39582a = i3;
        this.f39583b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f39582a) {
            case 3:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.f39583b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            case 14:
                super.dispatchDraw(canvas);
                ug.a0 a0Var = ((lp0) this.f39583b).G0;
                if (a0Var != null) {
                    a0Var.d(canvas);
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
        switch (this.f39582a) {
            case 3:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.f39583b;
                if (bVar != null) {
                    bVar.f11653i = this;
                    int i3 = 0;
                    while (true) {
                        k30[] k30VarArr = (k30[]) bVar.f11650e;
                        if (i3 < k30VarArr.length) {
                            k30 k30Var = k30VarArr[i3];
                            k30Var.f46753i.add(this);
                            k30Var.a();
                            i3++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f39582a) {
            case 3:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.f39583b;
                if (bVar != null && ((r0) bVar.f11653i) != this) {
                    int i3 = 0;
                    while (true) {
                        k30[] k30VarArr = (k30[]) bVar.f11650e;
                        if (i3 < k30VarArr.length) {
                            k30 k30Var = k30VarArr[i3];
                            k30Var.f46753i.remove(this);
                            k30Var.a();
                            i3++;
                        } else {
                            bVar.f11653i = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i3 = this.f39582a;
        Object obj = this.f39583b;
        switch (i3) {
            case 0:
                if (getAlpha() != 0.0f) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    ((s0) obj).f39597n.a(org.telegram.messenger.g0.L(10.0f), canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                canvas.drawColor(k6.w0(k6.f27899e7, ((kg0) obj).J0));
                return;
            case 5:
                hm0 hm0Var = (hm0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, hm0Var.f45937c.size())));
                int ceil = (int) Math.ceil(hm0Var.T.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                hm0Var.T.setColor(k6.x0(null, k6.C5, false));
                hm0Var.V.setColor(k6.x0(null, k6.f27954h5, false));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                hm0Var.U.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(hm0Var.U, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), hm0Var.V);
                hm0Var.V.setColor(k6.x0(null, k6.B5, false));
                hm0Var.U.set(org.telegram.messenger.g0.L(2.0f) + i11, org.telegram.messenger.g0.L(2.0f), i12 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(hm0Var.U, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), hm0Var.V);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), hm0Var.T);
                return;
            case 6:
                sm0 sm0Var = (sm0) obj;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, sm0Var.f49542c.size())));
                int ceil2 = (int) Math.ceil(sm0Var.f49551i0.measureText(format2));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil2, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                sm0Var.f49551i0.setColor(k6.x0(null, k6.C5, false));
                sm0Var.f49553k0.setColor(k6.x0(null, sm0Var.f49566v0, false));
                int i13 = max2 / 2;
                int i14 = measuredWidth2 - i13;
                int i15 = i13 + measuredWidth2;
                sm0Var.f49552j0.set(i14, 0.0f, i15, getMeasuredHeight());
                canvas.drawRoundRect(sm0Var.f49552j0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), sm0Var.f49553k0);
                sm0Var.f49553k0.setColor(k6.x0(null, k6.B5, false));
                sm0Var.f49552j0.set(org.telegram.messenger.g0.L(2.0f) + i14, org.telegram.messenger.g0.L(2.0f), i15 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(sm0Var.f49552j0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), sm0Var.f49553k0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), org.telegram.messenger.g0.L(16.2f), sm0Var.f49551i0);
                return;
            case 7:
                ((PhotoViewer) obj).f41526r3.a(canvas, this);
                return;
            case 10:
                ((SecretMediaViewer) obj).P.a(canvas, this);
                return;
            case 13:
                f6 f6Var = (f6) obj;
                float e10 = f6Var.L.e(false, f6Var.K);
                if (f6Var.R != null && getWidth() > 0) {
                    f6.a(f6Var, canvas, e10);
                    return;
                }
                return;
            case 15:
                super.onDraw(canvas);
                vg.i0 i0Var = (vg.i0) obj;
                if (i0Var.f56658i2 - i0Var.f56657h2 > 1) {
                    Paint W0 = k6.W0("paintDivider", i0Var.J0);
                    if (W0 == null) {
                        W0 = k6.f28002k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    return;
                }
                return;
            case 16:
                canvas.drawColor(k6.w0(k6.f27899e7, ((xg.e1) obj).J0));
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f39582a) {
            case 11:
                super.onLayout(z10, i3, i10, i11, i12);
                wz0 wz0Var = (wz0) this.f39583b;
                int[] iArr = wz0Var.H;
                getLocationOnScreen(iArr);
                Rect rect = wz0Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(wz0Var.f44192c, rect, wz0Var.J, wz0Var.f44193e);
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f39582a) {
            case 2:
                l00 l00Var = (l00) this.f39583b;
                if (l00Var.I) {
                    l00Var.K = (l00Var.p0().getMeasuredHeight() + l00Var.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + l00Var.J;
                    if (org.telegram.messenger.g0.L(24.0f) + l00Var.E.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + l00Var.E.getMeasuredHeight()) - l00Var.M);
                    }
                    l00Var.K = L;
                }
                int i11 = (int) (l00Var.K - (0 * 2.5f));
                l00Var.K = i11;
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
            case 3:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(38.0f));
                return;
            case 8:
                fs0 fs0Var = (fs0) this.f39583b;
                PremiumPreviewFragment premiumPreviewFragment = fs0Var.f45364c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + fs0Var.f45364c.V.getMeasuredHeight() > L2) {
                        L2 = fs0Var.f45364c.V.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    fs0Var.f45364c.Z = L2;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(fs0Var.f45364c.Z, 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f39582a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                ((s0) this.f39583b).f39597n.f39349f = i3;
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f39582a) {
            case 1:
                super.setAlpha(f10);
                View view = ((uw) this.f39583b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 9:
                super.setAlpha(f10);
                View view2 = ((ProfileActivity) this.f39583b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 12:
                super.setAlpha(f10);
                View view3 = ((m91) this.f39583b).fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    public r0(Context context, g.b bVar) {
        super(context);
        this.f39582a = 3;
        this.f39583b = bVar;
        hs.i(this);
        setOnClickListener(new ux0(23, (Object) this, (Object) context));
    }
}
