package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
public final class ex extends View implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public int F;
    public final Paint f47369a;
    public final Paint f47370b;
    public final int f47371c;
    public final ArrayList d;
    public float f47372e;
    public float f47373f;
    public float h;
    public final ImageReceiver f47374n;
    public final ImageReceiver f47375r;
    public final org.telegram.ui.Components.mh0 f47376s;
    public final org.telegram.ui.Components.mh0 f47377w;
    public boolean f47378x;
    public int f47379y;

    public ex(Context context, int i7) {
        super(context);
        this.f47369a = new Paint(1);
        this.f47370b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f47374n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f47375r = imageReceiver2;
        this.f47371c = i7;
        imageReceiver.f22677y = true;
        imageReceiver2.f22677y = true;
        org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(2131624005, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f47376s = mh0Var;
        org.telegram.ui.Components.mh0 mh0Var2 = new org.telegram.ui.Components.mh0(2131624004, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f47377w = mh0Var2;
        imageReceiver.w0(mh0Var);
        imageReceiver2.w0(mh0Var2);
        imageReceiver.W(1);
        mh0Var.K(1);
        mh0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i7 = this.f47371c;
        ArrayList arrayList2 = org.telegram.messenger.a6.q(i7).H;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            hashMap.put(((dx) arrayList.get(i10)).f47067c, (dx) arrayList.get(i10));
            org.telegram.messenger.a6.q(i7).v((org.telegram.messenger.y5) arrayList.get(i10));
            i10++;
        }
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            String S0 = ((org.telegram.messenger.fj) arrayList2.get(i11)).S0();
            if (org.telegram.messenger.w7.G(i7).S(S0)) {
                dx dxVar = (dx) hashMap.get(S0);
                if (dxVar == null) {
                    dxVar = new dx(this, S0);
                }
                org.telegram.messenger.a6.q(i7).a(S0, null, dxVar);
                arrayList.add(dxVar);
            }
        }
        if (arrayList.size() == 0 && !this.E) {
            if (org.telegram.messenger.a6.q(i7).J.size() > 0) {
                this.f47372e = 1.0f;
                this.f47373f = 1.0f;
                this.f47378x = true;
                return;
            }
            this.f47372e = 0.0f;
            this.f47373f = 0.0f;
            this.f47378x = false;
        }
    }

    public final void b() {
        org.telegram.messenger.tr.a0(this.f47371c);
        int i7 = 0;
        long j3 = 0;
        long j10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                break;
            }
            j3 += ((dx) arrayList.get(i7)).f47065a;
            j10 += ((dx) arrayList.get(i7)).f47066b;
            i7++;
        }
        if (j3 == 0) {
            this.f47372e = 1.0f;
        } else {
            this.f47372e = ((float) j10) / ((float) j3);
        }
        float f10 = this.f47372e;
        if (f10 > 1.0f) {
            this.f47372e = 1.0f;
        } else if (f10 < 0.0f) {
            this.f47372e = 0.0f;
        }
        this.h = ((this.f47372e - this.f47373f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25105d5) {
            a();
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ks.f(this.f47371c).c(this, org.telegram.messenger.ks.f25105d5);
        this.f47374n.P();
        this.f47375r.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i10 = this.f47371c;
            if (i7 < size) {
                org.telegram.messenger.a6.q(i10).v((org.telegram.messenger.y5) arrayList.get(i7));
                i7++;
            } else {
                arrayList.clear();
                org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.f25105d5);
                this.f47374n.R();
                this.f47375r.R();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i7 = this.f47379y;
            int i10 = org.telegram.ui.ActionBar.n6.f29733v8;
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
            ImageReceiver imageReceiver = this.f47375r;
            ImageReceiver imageReceiver2 = this.f47374n;
            Paint paint = this.f47369a;
            Paint paint2 = this.f47370b;
            if (i7 != x02) {
                this.f47379y = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
                paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.f22656p1 = new PorterDuffColorFilter(x03, mode);
                imageReceiver.f22656p1 = new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, i10, false), mode);
                paint2.setAlpha(100);
            }
            float f10 = this.f47373f;
            float f11 = this.f47372e;
            if (f10 != f11) {
                float f12 = this.h;
                float f13 = f10 + f12;
                this.f47373f = f13;
                if (f12 > 0.0f && f13 > f11) {
                    this.f47373f = f11;
                } else if (f12 < 0.0f && f13 < f11) {
                    this.f47373f = f11;
                } else {
                    invalidate();
                }
            }
            int L = org.telegram.messenger.g0.L(8.0f);
            float L2 = org.telegram.messenger.g0.L(1.0f);
            float L3 = org.telegram.messenger.g0.L(16.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            float measuredHeight = L + (getMeasuredHeight() / 2);
            float f14 = measuredHeight - L2;
            float f15 = measuredHeight + L2;
            rectF.set(L3, f14, getMeasuredWidth() - L3, f15);
            canvas.drawRoundRect(rectF, L2, L2, paint2);
            rectF.set(L3, f14, ((getMeasuredWidth() - (2.0f * L3)) * this.f47373f) + L3, f15);
            canvas.drawRoundRect(rectF, L2, L2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f14);
            if (this.f47372e != 1.0f) {
                this.f47378x = false;
            }
            if (this.f47378x) {
                imageReceiver.h(canvas, null);
            } else {
                imageReceiver2.h(canvas, null);
            }
            if (this.f47372e == 1.0f && !this.f47378x && this.f47376s.f37482b0 == 0) {
                org.telegram.ui.Components.mh0 mh0Var = this.f47377w;
                mh0Var.N(0, false, false);
                mh0Var.start();
                this.f47378x = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.E = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
        int L = org.telegram.messenger.g0.L(15.0f);
        float f10 = L;
        this.f47374n.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - i11);
        this.f47375r.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - (L * 2));
    }

    @Override
    public void setAlpha(float f10) {
        if (f10 == 0.0f) {
            this.E = false;
        }
        super.setAlpha(f10);
    }

    @Override
    public void setVisibility(int i7) {
        if (i7 != 0) {
            this.E = false;
        }
        super.setVisibility(i7);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.mh0 mh0Var;
        org.telegram.ui.Components.mh0 mh0Var2 = this.f47376s;
        if (mh0Var2 != null && (mh0Var = this.f47377w) != null) {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29733v8, false);
            if (x02 != this.F || mh0Var2.getColorFilter() == null) {
                this.F = x02;
                mh0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                mh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
