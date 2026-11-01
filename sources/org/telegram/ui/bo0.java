package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class bo0 extends View {
    public final int f36089a;
    public Object f36090b;

    public bo0(Context context) {
        super(context);
        this.f36089a = 8;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36089a) {
            case 10:
                super.dispatchDraw(canvas);
                vh.v3 v3Var = ((vh.s7) this.f36090b).f51003x0;
                if (v3Var != null) {
                    v3Var.d(canvas);
                    return;
                }
                return;
            case 11:
                canvas.save();
                vh.o8 o8Var = (vh.o8) this.f36090b;
                canvas.translate(o8Var.f51628c1.getX() + o8Var.f51655l0.getX(), o8Var.f51628c1.getY() + o8Var.f51655l0.getY());
                vh.e8 e8Var = o8Var.f51628c1;
                e8Var.k(canvas, e8Var.getBounds(), o8Var.f51628c1.getOver2Alpha());
                canvas.restore();
                return;
            case 16:
                tg.c cVar = ((zg.e) this.f36090b).I;
                if (cVar != null) {
                    cVar.draw(canvas);
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
        switch (this.f36089a) {
            case 8:
                super.onAttachedToWindow();
                ph.i1 i1Var = (ph.i1) this.f36090b;
                if (i1Var != null && !i1Var.f45129i) {
                    i1Var.f45129i = true;
                    i1Var.a();
                    ph.h1 h1Var = new ph.h1(i1Var, 0);
                    i1Var.h = h1Var;
                    org.telegram.messenger.tc.a(h1Var);
                    return;
                }
                return;
            case 15:
                super.onAttachedToWindow();
                ((zf.c1) this.f36090b).f55481f = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f36089a) {
            case 8:
                super.onDetachedFromWindow();
                ph.i1 i1Var = (ph.i1) this.f36090b;
                if (i1Var != null && i1Var.f45129i) {
                    i1Var.f45129i = false;
                    i1Var.a();
                    ph.h1 h1Var = i1Var.h;
                    HashSet hashSet = org.telegram.messenger.tc.f18247n;
                    if (hashSet != null) {
                        hashSet.remove(h1Var);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                super.onDetachedFromWindow();
                ((zf.c1) this.f36090b).f55481f = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int ceil;
        int i10;
        int i11;
        switch (this.f36089a) {
            case 0:
                jo0 jo0Var = (jo0) this.f36090b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, jo0Var.f38486c.size())));
                int max = Math.max(org.telegram.messenger.i0.L(16.0f) + ((int) Math.ceil(jo0Var.f38493h0.measureText(format))), org.telegram.messenger.i0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                jo0Var.f38493h0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.C5, false));
                jo0Var.f38495j0.setColor(org.telegram.ui.ActionBar.t6.x0(null, jo0Var.f38508u0, false));
                int i12 = max / 2;
                jo0Var.f38494i0.set(measuredWidth - i12, 0.0f, i12 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(jo0Var.f38494i0, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), jo0Var.f38495j0);
                jo0Var.f38495j0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B5, false));
                jo0Var.f38494i0.set(org.telegram.messenger.i0.L(2.0f) + i10, org.telegram.messenger.i0.L(2.0f), i11 - org.telegram.messenger.i0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f));
                canvas.drawRoundRect(jo0Var.f38494i0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), jo0Var.f38495j0);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.i0.L(16.2f), jo0Var.f38493h0);
                return;
            case 1:
                ((PhotoViewer) this.f36090b).f33584q3.a(canvas, this);
                return;
            case 4:
                ((SecretMediaViewer) this.f36090b).O.a(canvas, this);
                return;
            case 7:
                org.telegram.ui.Wallet.l6 l6Var = (org.telegram.ui.Wallet.l6) this.f36090b;
                float e = l6Var.K.e(false, l6Var.J);
                if (l6Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.l6.a(l6Var, canvas, e);
                    return;
                }
                return;
            case 14:
                super.onDraw(canvas);
                yh.z zVar = (yh.z) this.f36090b;
                rf.w wVar = zVar.B1;
                float max2 = Math.max(zVar.f54543i1.e, zVar.f54544j1.e);
                rf.w wVar2 = zVar.A1;
                wVar2.c(org.telegram.messenger.i0.L(42.0f) + zVar.L1.f7767b, 0);
                wVar2.setBounds(0, 0, getWidth(), org.telegram.messenger.i0.L(56.0f) + zVar.L1.f7767b);
                int i13 = org.telegram.ui.ActionBar.t6.f20873a7;
                wVar2.b(org.telegram.ui.ActionBar.t6.r1(org.telegram.messenger.i0.T1(1.0f, 0.8f, max2), org.telegram.ui.ActionBar.t6.w0(i13, zVar.I0)));
                wVar2.draw(canvas);
                if (zVar.E1) {
                    max2 = 1.0f;
                }
                int W1 = org.telegram.messenger.i0.W1(max2, org.telegram.messenger.i0.L(48.0f) + zVar.L1.d, 0);
                int W12 = org.telegram.messenger.i0.W1(max2, org.telegram.messenger.i0.L(72.0f), 0) + zVar.L1.d;
                float T1 = org.telegram.messenger.i0.T1(0.8f, org.telegram.messenger.i0.R0(zVar.L1.d), max2);
                wVar.c(0, W1);
                wVar.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                wVar.b(org.telegram.ui.ActionBar.t6.r1(T1, org.telegram.ui.ActionBar.t6.w0(i13, zVar.I0)));
                wVar.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f36089a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                w11 w11Var = (w11) this.f36090b;
                int[] iArr = w11Var.G;
                getLocationOnScreen(iArr);
                Rect rect = w11Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                org.telegram.messenger.i0.X1(w11Var.f36173c, rect, w11Var.I, w11Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f36089a) {
            case 2:
                xt0 xt0Var = (xt0) this.f36090b;
                PremiumPreviewFragment premiumPreviewFragment = xt0Var.f43457c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int L = org.telegram.messenger.i0.L(64.0f);
                    if (org.telegram.messenger.i0.L(8.0f) + xt0Var.f43457c.U.getMeasuredHeight() > L) {
                        L = xt0Var.f43457c.U.getMeasuredHeight() + org.telegram.messenger.i0.L(8.0f);
                    }
                    xt0Var.f43457c.Y = L;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(xt0Var.f43457c.Y, 1073741824));
                return;
            case 9:
                rh.h8 h8Var = (rh.h8) this.f36090b;
                if (h8Var.H) {
                    i12 = (h8Var.p0().getMeasuredHeight() + h8Var.I) - org.telegram.messenger.i0.L(16.0f);
                } else {
                    int L2 = org.telegram.messenger.i0.L(140.0f) + h8Var.I;
                    if (org.telegram.messenger.i0.L(24.0f) + h8Var.D.getMeasuredHeight() > L2) {
                        L2 = org.telegram.messenger.i0.L(24.0f) + h8Var.D.getMeasuredHeight();
                    }
                    i12 = L2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            case 12:
                wh.g gVar = (wh.g) this.f36090b;
                if (gVar.H) {
                    i13 = (gVar.p0().getMeasuredHeight() + gVar.I) - org.telegram.messenger.i0.L(16.0f);
                } else {
                    int L3 = org.telegram.messenger.i0.L(140.0f) + gVar.I;
                    if (org.telegram.messenger.i0.L(24.0f) + gVar.D.getMeasuredHeight() > L3) {
                        L3 = org.telegram.messenger.i0.L(24.0f) + gVar.D.getMeasuredHeight();
                    }
                    i13 = L3;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 - (0 * 2.5f)), 1073741824));
                return;
            case 13:
                xh.i iVar = (xh.i) this.f36090b;
                if (iVar.H) {
                    i14 = (xh.i.E0(iVar).getMeasuredHeight() + iVar.I) - org.telegram.messenger.i0.L(16.0f);
                } else {
                    int L4 = org.telegram.messenger.i0.L(140.0f) + iVar.I;
                    if (org.telegram.messenger.i0.L(24.0f) + iVar.D.getMeasuredHeight() > L4) {
                        L4 = org.telegram.messenger.i0.L(24.0f) + iVar.D.getMeasuredHeight();
                    }
                    i14 = L4;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i14 - (0 * 2.5f)), 1073741824));
                return;
            case 15:
                ((View) getParent()).getMeasuredHeight();
                zf.c1 c1Var = (zf.c1) this.f36090b;
                Integer num = c1Var.d;
                if (num != null) {
                    i15 = num.intValue();
                    c1Var.h = i15;
                } else {
                    i15 = 0;
                    c1Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f36089a) {
            case 3:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f36090b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                super.setAlpha(f7);
                View view2 = ((nb1) this.f36090b).fragmentView;
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
        switch (this.f36089a) {
            case 8:
                if (((ph.i1) this.f36090b) != null) {
                    if (isAttachedToWindow()) {
                        ph.i1 i1Var = (ph.i1) this.f36090b;
                        if (i1Var.f45129i) {
                            i1Var.f45129i = false;
                            i1Var.a();
                            ph.h1 h1Var = i1Var.h;
                            HashSet hashSet = org.telegram.messenger.tc.f18247n;
                            if (hashSet != null) {
                                hashSet.remove(h1Var);
                            }
                        }
                    }
                    this.f36090b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof ph.i1) {
                    this.f36090b = (ph.i1) drawable;
                    if (isAttachedToWindow()) {
                        ph.i1 i1Var2 = (ph.i1) this.f36090b;
                        if (!i1Var2.f45129i) {
                            i1Var2.f45129i = true;
                            i1Var2.a();
                            ph.h1 h1Var2 = new ph.h1(i1Var2, 0);
                            i1Var2.h = h1Var2;
                            org.telegram.messenger.tc.a(h1Var2);
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

    public bo0(Object obj, Context context, int i10) {
        super(context);
        this.f36089a = i10;
        this.f36090b = obj;
    }
}
