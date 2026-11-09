package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class n00 extends View {
    public final int f48045a;
    public Object f48046b;

    public n00(int i7, Context context, Object obj) {
        super(context);
        this.f48045a = i7;
        this.f48046b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f48045a) {
            case 1:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.f48046b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            case 12:
                super.dispatchDraw(canvas);
                tg.b0 b0Var = ((wp0) this.f48046b).F0;
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
        switch (this.f48045a) {
            case 1:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.f48046b;
                if (bVar != null) {
                    bVar.f13269i = this;
                    int i7 = 0;
                    while (true) {
                        r30[] r30VarArr = (r30[]) bVar.f13266e;
                        if (i7 < r30VarArr.length) {
                            r30 r30Var = r30VarArr[i7];
                            r30Var.f49262i.add(this);
                            r30Var.a();
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
                zh.d1 d1Var = (zh.d1) this.f48046b;
                if (d1Var != null && !d1Var.f60291i) {
                    d1Var.f60291i = true;
                    d1Var.a();
                    xg.a aVar = new xg.a(d1Var, 3);
                    d1Var.h = aVar;
                    org.telegram.messenger.sc.a(aVar);
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
        switch (this.f48045a) {
            case 1:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.f48046b;
                if (bVar != null && ((n00) bVar.f13269i) != this) {
                    int i7 = 0;
                    while (true) {
                        r30[] r30VarArr = (r30[]) bVar.f13266e;
                        if (i7 < r30VarArr.length) {
                            r30 r30Var = r30VarArr[i7];
                            r30Var.f49262i.remove(this);
                            r30Var.a();
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
                zh.d1 d1Var = (zh.d1) this.f48046b;
                if (d1Var != null && d1Var.f60291i) {
                    d1Var.f60291i = false;
                    d1Var.a();
                    xg.a aVar = d1Var.h;
                    HashSet hashSet = org.telegram.messenger.sc.f25454n;
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
        switch (this.f48045a) {
            case 2:
                canvas.drawColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27885e7, ((sg0) this.f48046b).I0));
                return;
            case 3:
                om0 om0Var = (om0) this.f48046b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, om0Var.f48477c.size())));
                int ceil = (int) Math.ceil(om0Var.S.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                om0Var.S.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.C5, false));
                om0Var.U.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false));
                int i7 = max / 2;
                int i10 = measuredWidth - i7;
                int i11 = i7 + measuredWidth;
                om0Var.T.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(om0Var.T, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), om0Var.U);
                om0Var.U.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.B5, false));
                om0Var.T.set(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L(2.0f), i11 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(om0Var.T, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), om0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), om0Var.S);
                return;
            case 4:
                zm0 zm0Var = (zm0) this.f48046b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, zm0Var.f52602c.size())));
                int ceil2 = (int) Math.ceil(zm0Var.f52610h0.measureText(format2));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil2, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                zm0Var.f52610h0.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.C5, false));
                zm0Var.f52612j0.setColor(org.telegram.ui.ActionBar.l6.x0(null, zm0Var.f52625u0, false));
                int i12 = max2 / 2;
                int i13 = measuredWidth2 - i12;
                int i14 = i12 + measuredWidth2;
                zm0Var.f52611i0.set(i13, 0.0f, i14, getMeasuredHeight());
                canvas.drawRoundRect(zm0Var.f52611i0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), zm0Var.f52612j0);
                zm0Var.f52612j0.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.B5, false));
                zm0Var.f52611i0.set(org.telegram.messenger.g0.L(2.0f) + i13, org.telegram.messenger.g0.L(2.0f), i14 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(zm0Var.f52611i0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), zm0Var.f52612j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), org.telegram.messenger.g0.L(16.2f), zm0Var.f52610h0);
                return;
            case 5:
                ((PhotoViewer) this.f48046b).f41488p3.a(canvas, this);
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
                ((SecretMediaViewer) this.f48046b).O.a(canvas, this);
                return;
            case 11:
                org.telegram.ui.Wallet.f6 f6Var = (org.telegram.ui.Wallet.f6) this.f48046b;
                float e10 = f6Var.K.e(false, f6Var.J);
                if (f6Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.f6.a(f6Var, canvas, e10);
                    return;
                }
                return;
            case 13:
                super.onDraw(canvas);
                ug.i0 i0Var = (ug.i0) this.f48046b;
                if (i0Var.f56622h2 - i0Var.f56621g2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.l6.W0("paintDivider", i0Var.I0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.l6.f27988k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    return;
                }
                return;
            case 14:
                canvas.drawColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27885e7, ((wg.f1) this.f48046b).I0));
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f48045a) {
            case 9:
                super.onLayout(z9, i7, i10, i11, i12);
                i01 i01Var = (i01) this.f48046b;
                int[] iArr = i01Var.G;
                getLocationOnScreen(iArr);
                Rect rect = i01Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(i01Var.f48284c, rect, i01Var.I, i01Var.f48285e);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f48045a) {
            case 0:
                q00 q00Var = (q00) this.f48046b;
                if (q00Var.H) {
                    q00Var.J = (q00Var.p0().getMeasuredHeight() + q00Var.I) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + q00Var.I;
                    if (org.telegram.messenger.g0.L(24.0f) + q00Var.D.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + q00Var.D.getMeasuredHeight()) - q00Var.L);
                    }
                    q00Var.J = L;
                }
                int i11 = (int) (q00Var.J - (0 * 2.5f));
                q00Var.J = i11;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(38.0f));
                return;
            case 6:
                rs0 rs0Var = (rs0) this.f48046b;
                PremiumPreviewFragment premiumPreviewFragment = rs0Var.f49601c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + rs0Var.f49601c.U.getMeasuredHeight() > L2) {
                        L2 = rs0Var.f49601c.U.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    rs0Var.f49601c.Y = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(rs0Var.f49601c.Y, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f48045a) {
            case 7:
                super.setAlpha(f10);
                View view = ((ProfileActivity) this.f48046b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f10);
                View view2 = ((y91) this.f48046b).fragmentView;
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
        switch (this.f48045a) {
            case 15:
                if (((zh.d1) this.f48046b) != null) {
                    if (isAttachedToWindow()) {
                        zh.d1 d1Var = (zh.d1) this.f48046b;
                        if (d1Var.f60291i) {
                            d1Var.f60291i = false;
                            d1Var.a();
                            xg.a aVar = d1Var.h;
                            HashSet hashSet = org.telegram.messenger.sc.f25454n;
                            if (hashSet != null) {
                                hashSet.remove(aVar);
                            }
                        }
                    }
                    this.f48046b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof zh.d1) {
                    this.f48046b = (zh.d1) drawable;
                    if (isAttachedToWindow()) {
                        zh.d1 d1Var2 = (zh.d1) this.f48046b;
                        if (!d1Var2.f60291i) {
                            d1Var2.f60291i = true;
                            d1Var2.a();
                            xg.a aVar2 = new xg.a(d1Var2, 3);
                            d1Var2.h = aVar2;
                            org.telegram.messenger.sc.a(aVar2);
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

    public n00(Context context) {
        super(context);
        this.f48045a = 15;
    }

    public n00(Context context, g.b bVar) {
        super(context);
        this.f48045a = 1;
        this.f48046b = bVar;
        org.telegram.messenger.qs.i(this);
        setOnClickListener(new org.telegram.ui.Components.u41(17, this, context));
    }
}
