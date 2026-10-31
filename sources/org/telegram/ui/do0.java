package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class do0 extends View {
    public final int f36806a;
    public Object f36807b;

    public do0(Context context) {
        super(context);
        this.f36806a = 8;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36806a) {
            case 10:
                super.dispatchDraw(canvas);
                vh.v3 v3Var = ((vh.s7) this.f36807b).f50996x0;
                if (v3Var != null) {
                    v3Var.d(canvas);
                    return;
                }
                return;
            case 11:
                canvas.save();
                vh.o8 o8Var = (vh.o8) this.f36807b;
                canvas.translate(o8Var.f51613c1.getX() + o8Var.f51640l0.getX(), o8Var.f51613c1.getY() + o8Var.f51640l0.getY());
                vh.e8 e8Var = o8Var.f51613c1;
                e8Var.k(canvas, e8Var.getBounds(), o8Var.f51613c1.getOver2Alpha());
                canvas.restore();
                return;
            case 16:
                tg.c cVar = ((zg.e) this.f36807b).I;
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
        switch (this.f36806a) {
            case 8:
                super.onAttachedToWindow();
                ph.i1 i1Var = (ph.i1) this.f36807b;
                if (i1Var != null && !i1Var.f45118i) {
                    i1Var.f45118i = true;
                    i1Var.a();
                    ph.h1 h1Var = new ph.h1(i1Var, 0);
                    i1Var.h = h1Var;
                    org.telegram.messenger.sc.a(h1Var);
                    return;
                }
                return;
            case 15:
                super.onAttachedToWindow();
                ((zf.c1) this.f36807b).f55463f = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f36806a) {
            case 8:
                super.onDetachedFromWindow();
                ph.i1 i1Var = (ph.i1) this.f36807b;
                if (i1Var != null && i1Var.f45118i) {
                    i1Var.f45118i = false;
                    i1Var.a();
                    ph.h1 h1Var = i1Var.h;
                    HashSet hashSet = org.telegram.messenger.sc.f17896n;
                    if (hashSet != null) {
                        hashSet.remove(h1Var);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                super.onDetachedFromWindow();
                ((zf.c1) this.f36807b).f55463f = false;
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
        switch (this.f36806a) {
            case 0:
                lo0 lo0Var = (lo0) this.f36807b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, lo0Var.f39331c.size())));
                int max = Math.max(org.telegram.messenger.i0.L(16.0f) + ((int) Math.ceil(lo0Var.f39338h0.measureText(format))), org.telegram.messenger.i0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                lo0Var.f39338h0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.C5, false));
                lo0Var.f39340j0.setColor(org.telegram.ui.ActionBar.t6.x0(null, lo0Var.f39353u0, false));
                int i12 = max / 2;
                lo0Var.f39339i0.set(measuredWidth - i12, 0.0f, i12 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(lo0Var.f39339i0, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), lo0Var.f39340j0);
                lo0Var.f39340j0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B5, false));
                lo0Var.f39339i0.set(org.telegram.messenger.i0.L(2.0f) + i10, org.telegram.messenger.i0.L(2.0f), i11 - org.telegram.messenger.i0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f));
                canvas.drawRoundRect(lo0Var.f39339i0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), lo0Var.f39340j0);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.i0.L(16.2f), lo0Var.f39338h0);
                return;
            case 1:
                ((PhotoViewer) this.f36807b).f33577q3.a(canvas, this);
                return;
            case 4:
                ((SecretMediaViewer) this.f36807b).O.a(canvas, this);
                return;
            case 7:
                org.telegram.ui.Wallet.l6 l6Var = (org.telegram.ui.Wallet.l6) this.f36807b;
                float e = l6Var.K.e(false, l6Var.J);
                if (l6Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.l6.a(l6Var, canvas, e);
                    return;
                }
                return;
            case 14:
                super.onDraw(canvas);
                yh.a0 a0Var = (yh.a0) this.f36807b;
                rf.w wVar = a0Var.B1;
                float max2 = Math.max(a0Var.f54441i1.e, a0Var.f54442j1.e);
                rf.w wVar2 = a0Var.A1;
                wVar2.c(org.telegram.messenger.i0.L(42.0f) + a0Var.L1.f7766b, 0);
                wVar2.setBounds(0, 0, getWidth(), org.telegram.messenger.i0.L(56.0f) + a0Var.L1.f7766b);
                int i13 = org.telegram.ui.ActionBar.t6.f20872a7;
                wVar2.b(org.telegram.ui.ActionBar.t6.r1(org.telegram.messenger.i0.T1(1.0f, 0.8f, max2), org.telegram.ui.ActionBar.t6.w0(i13, a0Var.I0)));
                wVar2.draw(canvas);
                if (a0Var.E1) {
                    max2 = 1.0f;
                }
                int W1 = org.telegram.messenger.i0.W1(max2, org.telegram.messenger.i0.L(48.0f) + a0Var.L1.d, 0);
                int W12 = org.telegram.messenger.i0.W1(max2, org.telegram.messenger.i0.L(72.0f), 0) + a0Var.L1.d;
                float T1 = org.telegram.messenger.i0.T1(0.8f, org.telegram.messenger.i0.R0(a0Var.L1.d), max2);
                wVar.c(0, W1);
                wVar.setBounds(0, getHeight() - W12, getWidth(), getHeight());
                wVar.b(org.telegram.ui.ActionBar.t6.r1(T1, org.telegram.ui.ActionBar.t6.w0(i13, a0Var.I0)));
                wVar.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f36806a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                y11 y11Var = (y11) this.f36807b;
                int[] iArr = y11Var.G;
                getLocationOnScreen(iArr);
                Rect rect = y11Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                org.telegram.messenger.i0.X1(y11Var.f36905c, rect, y11Var.I, y11Var.e);
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
        switch (this.f36806a) {
            case 2:
                yt0 yt0Var = (yt0) this.f36807b;
                PremiumPreviewFragment premiumPreviewFragment = yt0Var.f43891c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int L = org.telegram.messenger.i0.L(64.0f);
                    if (org.telegram.messenger.i0.L(8.0f) + yt0Var.f43891c.U.getMeasuredHeight() > L) {
                        L = yt0Var.f43891c.U.getMeasuredHeight() + org.telegram.messenger.i0.L(8.0f);
                    }
                    yt0Var.f43891c.Y = L;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(yt0Var.f43891c.Y, 1073741824));
                return;
            case 9:
                rh.h8 h8Var = (rh.h8) this.f36807b;
                if (h8Var.H) {
                    i12 = (h8Var.o0().getMeasuredHeight() + h8Var.I) - org.telegram.messenger.i0.L(16.0f);
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
                wh.g gVar = (wh.g) this.f36807b;
                if (gVar.H) {
                    i13 = (gVar.o0().getMeasuredHeight() + gVar.I) - org.telegram.messenger.i0.L(16.0f);
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
                xh.i iVar = (xh.i) this.f36807b;
                if (iVar.H) {
                    i14 = (xh.i.D0(iVar).getMeasuredHeight() + iVar.I) - org.telegram.messenger.i0.L(16.0f);
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
                zf.c1 c1Var = (zf.c1) this.f36807b;
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
        switch (this.f36806a) {
            case 3:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f36807b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                super.setAlpha(f7);
                View view2 = ((pb1) this.f36807b).fragmentView;
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
        switch (this.f36806a) {
            case 8:
                if (((ph.i1) this.f36807b) != null) {
                    if (isAttachedToWindow()) {
                        ph.i1 i1Var = (ph.i1) this.f36807b;
                        if (i1Var.f45118i) {
                            i1Var.f45118i = false;
                            i1Var.a();
                            ph.h1 h1Var = i1Var.h;
                            HashSet hashSet = org.telegram.messenger.sc.f17896n;
                            if (hashSet != null) {
                                hashSet.remove(h1Var);
                            }
                        }
                    }
                    this.f36807b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof ph.i1) {
                    this.f36807b = (ph.i1) drawable;
                    if (isAttachedToWindow()) {
                        ph.i1 i1Var2 = (ph.i1) this.f36807b;
                        if (!i1Var2.f45118i) {
                            i1Var2.f45118i = true;
                            i1Var2.a();
                            ph.h1 h1Var2 = new ph.h1(i1Var2, 0);
                            i1Var2.h = h1Var2;
                            org.telegram.messenger.sc.a(h1Var2);
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

    public do0(Object obj, Context context, int i10) {
        super(context);
        this.f36806a = i10;
        this.f36807b = obj;
    }
}
