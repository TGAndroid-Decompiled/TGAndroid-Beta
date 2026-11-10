package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class o00 extends View {
    public final int f48350a;
    public Object f48351b;

    public o00(int i7, Context context, Object obj) {
        super(context);
        this.f48350a = i7;
        this.f48351b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f48350a) {
            case 1:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.f48351b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            case 12:
                super.dispatchDraw(canvas);
                tg.b0 b0Var = ((xp0) this.f48351b).F0;
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
        switch (this.f48350a) {
            case 1:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.f48351b;
                if (bVar != null) {
                    bVar.f13271i = this;
                    int i7 = 0;
                    while (true) {
                        s30[] s30VarArr = (s30[]) bVar.f13268e;
                        if (i7 < s30VarArr.length) {
                            s30 s30Var = s30VarArr[i7];
                            s30Var.f49649i.add(this);
                            s30Var.a();
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
                zh.d1 d1Var = (zh.d1) this.f48351b;
                if (d1Var != null && !d1Var.f60293i) {
                    d1Var.f60293i = true;
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
        switch (this.f48350a) {
            case 1:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.f48351b;
                if (bVar != null && ((o00) bVar.f13271i) != this) {
                    int i7 = 0;
                    while (true) {
                        s30[] s30VarArr = (s30[]) bVar.f13268e;
                        if (i7 < s30VarArr.length) {
                            s30 s30Var = s30VarArr[i7];
                            s30Var.f49649i.remove(this);
                            s30Var.a();
                            i7++;
                        } else {
                            bVar.f13271i = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 15:
                super.onDetachedFromWindow();
                zh.d1 d1Var = (zh.d1) this.f48351b;
                if (d1Var != null && d1Var.f60293i) {
                    d1Var.f60293i = false;
                    d1Var.a();
                    xg.a aVar = d1Var.h;
                    HashSet hashSet = org.telegram.messenger.sc.f25458n;
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
        switch (this.f48350a) {
            case 2:
                canvas.drawColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27910e7, ((tg0) this.f48351b).I0));
                return;
            case 3:
                pm0 pm0Var = (pm0) this.f48351b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, pm0Var.f48795c.size())));
                int ceil = (int) Math.ceil(pm0Var.S.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                pm0Var.S.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.C5, false));
                pm0Var.U.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false));
                int i7 = max / 2;
                int i10 = measuredWidth - i7;
                int i11 = i7 + measuredWidth;
                pm0Var.T.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(pm0Var.T, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), pm0Var.U);
                pm0Var.U.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B5, false));
                pm0Var.T.set(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L(2.0f), i11 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(pm0Var.T, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), pm0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), pm0Var.S);
                return;
            case 4:
                an0 an0Var = (an0) this.f48351b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, an0Var.f43752c.size())));
                int ceil2 = (int) Math.ceil(an0Var.f43760h0.measureText(format2));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil2, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                an0Var.f43760h0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.C5, false));
                an0Var.f43762j0.setColor(org.telegram.ui.ActionBar.m6.x0(null, an0Var.f43775u0, false));
                int i12 = max2 / 2;
                int i13 = measuredWidth2 - i12;
                int i14 = i12 + measuredWidth2;
                an0Var.f43761i0.set(i13, 0.0f, i14, getMeasuredHeight());
                canvas.drawRoundRect(an0Var.f43761i0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), an0Var.f43762j0);
                an0Var.f43762j0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B5, false));
                an0Var.f43761i0.set(org.telegram.messenger.g0.L(2.0f) + i13, org.telegram.messenger.g0.L(2.0f), i14 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(an0Var.f43761i0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), an0Var.f43762j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), org.telegram.messenger.g0.L(16.2f), an0Var.f43760h0);
                return;
            case 5:
                ((PhotoViewer) this.f48351b).f41479p3.a(canvas, this);
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
                ((SecretMediaViewer) this.f48351b).O.a(canvas, this);
                return;
            case 11:
                org.telegram.ui.Wallet.i6 i6Var = (org.telegram.ui.Wallet.i6) this.f48351b;
                float e10 = i6Var.K.e(false, i6Var.J);
                if (i6Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.i6.a(i6Var, canvas, e10);
                    return;
                }
                return;
            case 13:
                super.onDraw(canvas);
                ug.i0 i0Var = (ug.i0) this.f48351b;
                if (i0Var.f56624k2 - i0Var.f56623j2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", i0Var.I0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.m6.f28013k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    return;
                }
                return;
            case 14:
                canvas.drawColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27910e7, ((wg.f1) this.f48351b).I0));
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f48350a) {
            case 9:
                super.onLayout(z9, i7, i10, i11, i12);
                j01 j01Var = (j01) this.f48351b;
                int[] iArr = j01Var.G;
                getLocationOnScreen(iArr);
                Rect rect = j01Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(j01Var.f48619c, rect, j01Var.I, j01Var.f48620e);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f48350a) {
            case 0:
                r00 r00Var = (r00) this.f48351b;
                if (r00Var.H) {
                    r00Var.J = (r00Var.p0().getMeasuredHeight() + r00Var.I) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + r00Var.I;
                    if (org.telegram.messenger.g0.L(24.0f) + r00Var.D.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + r00Var.D.getMeasuredHeight()) - r00Var.L);
                    }
                    r00Var.J = L;
                }
                int i11 = (int) (r00Var.J - (0 * 2.5f));
                r00Var.J = i11;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(38.0f));
                return;
            case 6:
                ss0 ss0Var = (ss0) this.f48351b;
                PremiumPreviewFragment premiumPreviewFragment = ss0Var.f49955c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + ss0Var.f49955c.U.getMeasuredHeight() > L2) {
                        L2 = ss0Var.f49955c.U.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    ss0Var.f49955c.Y = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(ss0Var.f49955c.Y, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f48350a) {
            case 7:
                super.setAlpha(f10);
                View view = ((ProfileActivity) this.f48351b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f10);
                View view2 = ((z91) this.f48351b).fragmentView;
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
        switch (this.f48350a) {
            case 15:
                if (((zh.d1) this.f48351b) != null) {
                    if (isAttachedToWindow()) {
                        zh.d1 d1Var = (zh.d1) this.f48351b;
                        if (d1Var.f60293i) {
                            d1Var.f60293i = false;
                            d1Var.a();
                            xg.a aVar = d1Var.h;
                            HashSet hashSet = org.telegram.messenger.sc.f25458n;
                            if (hashSet != null) {
                                hashSet.remove(aVar);
                            }
                        }
                    }
                    this.f48351b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof zh.d1) {
                    this.f48351b = (zh.d1) drawable;
                    if (isAttachedToWindow()) {
                        zh.d1 d1Var2 = (zh.d1) this.f48351b;
                        if (!d1Var2.f60293i) {
                            d1Var2.f60293i = true;
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

    public o00(Context context) {
        super(context);
        this.f48350a = 15;
    }

    public o00(Context context, g.b bVar) {
        super(context);
        this.f48350a = 1;
        this.f48351b = bVar;
        org.telegram.messenger.qs.i(this);
        setOnClickListener(new org.telegram.ui.Components.u41(17, this, context));
    }
}
