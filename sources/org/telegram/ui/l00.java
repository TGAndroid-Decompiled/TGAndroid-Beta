package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class l00 extends View {
    public final int f47372a;
    public Object f47373b;

    public l00(int i7, Context context, Object obj) {
        super(context);
        this.f47372a = i7;
        this.f47373b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f47372a) {
            case 1:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.f47373b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            case 12:
                super.dispatchDraw(canvas);
                tg.b0 b0Var = ((up0) this.f47373b).F0;
                if (b0Var != null) {
                    b0Var.d(canvas);
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
        switch (this.f47372a) {
            case 1:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.f47373b;
                if (bVar != null) {
                    bVar.f13269i = this;
                    int i7 = 0;
                    while (true) {
                        p30[] p30VarArr = (p30[]) bVar.f13266e;
                        if (i7 < p30VarArr.length) {
                            p30 p30Var = p30VarArr[i7];
                            p30Var.f48604i.add(this);
                            p30Var.a();
                            i7++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 15:
                super.onAttachedToWindow();
                zh.e1 e1Var = (zh.e1) this.f47373b;
                if (e1Var != null && !e1Var.f60210i) {
                    e1Var.f60210i = true;
                    e1Var.a();
                    xg.a aVar = new xg.a(e1Var, 3);
                    e1Var.h = aVar;
                    org.telegram.messenger.rc.a(aVar);
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
        switch (this.f47372a) {
            case 1:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.f47373b;
                if (bVar != null && ((l00) bVar.f13269i) != this) {
                    int i7 = 0;
                    while (true) {
                        p30[] p30VarArr = (p30[]) bVar.f13266e;
                        if (i7 < p30VarArr.length) {
                            p30 p30Var = p30VarArr[i7];
                            p30Var.f48604i.remove(this);
                            p30Var.a();
                            i7++;
                        } else {
                            bVar.f13269i = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 15:
                super.onDetachedFromWindow();
                zh.e1 e1Var = (zh.e1) this.f47373b;
                if (e1Var != null && e1Var.f60210i) {
                    e1Var.f60210i = false;
                    e1Var.a();
                    xg.a aVar = e1Var.h;
                    HashSet hashSet = org.telegram.messenger.rc.f25272n;
                    if (hashSet != null) {
                        hashSet.remove(aVar);
                        return;
                    }
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
        switch (this.f47372a) {
            case 2:
                canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27869e7, ((qg0) this.f47373b).I0));
                return;
            case 3:
                mm0 mm0Var = (mm0) this.f47373b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, mm0Var.f47836c.size())));
                int ceil = (int) Math.ceil(mm0Var.S.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                mm0Var.S.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.C5, false));
                mm0Var.U.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27922h5, false));
                int i7 = max / 2;
                int i10 = measuredWidth - i7;
                int i11 = i7 + measuredWidth;
                mm0Var.T.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(mm0Var.T, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), mm0Var.U);
                mm0Var.U.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B5, false));
                mm0Var.T.set(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L(2.0f), i11 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(mm0Var.T, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), mm0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), mm0Var.S);
                return;
            case 4:
                xm0 xm0Var = (xm0) this.f47373b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, xm0Var.f51914c.size())));
                int ceil2 = (int) Math.ceil(xm0Var.f51922h0.measureText(format2));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil2, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                xm0Var.f51922h0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.C5, false));
                xm0Var.f51924j0.setColor(org.telegram.ui.ActionBar.k6.x0(null, xm0Var.f51937u0, false));
                int i12 = max2 / 2;
                int i13 = measuredWidth2 - i12;
                int i14 = i12 + measuredWidth2;
                xm0Var.f51923i0.set(i13, 0.0f, i14, getMeasuredHeight());
                canvas.drawRoundRect(xm0Var.f51923i0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), xm0Var.f51924j0);
                xm0Var.f51924j0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B5, false));
                xm0Var.f51923i0.set(org.telegram.messenger.g0.L(2.0f) + i13, org.telegram.messenger.g0.L(2.0f), i14 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(xm0Var.f51923i0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), xm0Var.f51924j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), org.telegram.messenger.g0.L(16.2f), xm0Var.f51922h0);
                return;
            case 5:
                ((PhotoViewer) this.f47373b).f41477p3.a(canvas, this);
                return;
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            default:
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f47373b).O.a(canvas, this);
                return;
            case 11:
                org.telegram.ui.Wallet.h6 h6Var = (org.telegram.ui.Wallet.h6) this.f47373b;
                float e10 = h6Var.K.e(false, h6Var.J);
                if (h6Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.h6.a(h6Var, canvas, e10);
                    return;
                }
                return;
            case 13:
                super.onDraw(canvas);
                ug.i0 i0Var = (ug.i0) this.f47373b;
                if (i0Var.f56517h2 - i0Var.f56516g2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", i0Var.I0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.k6.f27972k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    return;
                }
                return;
            case 14:
                canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27869e7, ((wg.f1) this.f47373b).I0));
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f47372a) {
            case 9:
                super.onLayout(z9, i7, i10, i11, i12);
                g01 g01Var = (g01) this.f47373b;
                int[] iArr = g01Var.G;
                getLocationOnScreen(iArr);
                Rect rect = g01Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(g01Var.f47623c, rect, g01Var.I, g01Var.f47624e);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f47372a) {
            case 0:
                o00 o00Var = (o00) this.f47373b;
                if (o00Var.H) {
                    o00Var.J = (o00Var.p0().getMeasuredHeight() + o00Var.I) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + o00Var.I;
                    if (org.telegram.messenger.g0.L(24.0f) + o00Var.D.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + o00Var.D.getMeasuredHeight()) - o00Var.L);
                    }
                    o00Var.J = L;
                }
                int i11 = (int) (o00Var.J - (0 * 2.5f));
                o00Var.J = i11;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(38.0f));
                return;
            case 6:
                ps0 ps0Var = (ps0) this.f47373b;
                PremiumPreviewFragment premiumPreviewFragment = ps0Var.f48948c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + ps0Var.f48948c.U.getMeasuredHeight() > L2) {
                        L2 = ps0Var.f48948c.U.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    ps0Var.f48948c.Y = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(ps0Var.f48948c.Y, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f47372a) {
            case 7:
                super.setAlpha(f10);
                View view = ((ProfileActivity) this.f47373b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f10);
                View view2 = ((v91) this.f47373b).fragmentView;
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

    @Override
    public void setBackground(Drawable drawable) {
        switch (this.f47372a) {
            case 15:
                if (((zh.e1) this.f47373b) != null) {
                    if (isAttachedToWindow()) {
                        zh.e1 e1Var = (zh.e1) this.f47373b;
                        if (e1Var.f60210i) {
                            e1Var.f60210i = false;
                            e1Var.a();
                            xg.a aVar = e1Var.h;
                            HashSet hashSet = org.telegram.messenger.rc.f25272n;
                            if (hashSet != null) {
                                hashSet.remove(aVar);
                            }
                        }
                    }
                    this.f47373b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof zh.e1) {
                    this.f47373b = (zh.e1) drawable;
                    if (isAttachedToWindow()) {
                        zh.e1 e1Var2 = (zh.e1) this.f47373b;
                        if (!e1Var2.f60210i) {
                            e1Var2.f60210i = true;
                            e1Var2.a();
                            xg.a aVar2 = new xg.a(e1Var2, 3);
                            e1Var2.h = aVar2;
                            org.telegram.messenger.rc.a(aVar2);
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

    public l00(Context context) {
        super(context);
        this.f47372a = 15;
    }

    public l00(Context context, g.b bVar) {
        super(context);
        this.f47372a = 1;
        this.f47373b = bVar;
        org.telegram.messenger.qs.i(this);
        setOnClickListener(new org.telegram.ui.Components.t41(17, this, context));
    }
}
