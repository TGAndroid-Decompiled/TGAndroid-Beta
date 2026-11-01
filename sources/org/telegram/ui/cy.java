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
public final class cy extends View implements org.telegram.messenger.vs, org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public int E;
    public final Paint f36437a;
    public final Paint f36438b;
    public final int f36439c;
    public final ArrayList d;
    public float e;
    public float f36440f;
    public float h;
    public final ImageReceiver f36441n;
    public final ImageReceiver f36442r;
    public final org.telegram.ui.Components.ci0 f36443s;
    public final org.telegram.ui.Components.ci0 f36444w;
    public boolean f36445x;
    public int f36446y;

    public cy(Context context, int i10) {
        super(context);
        this.f36437a = new Paint(1);
        this.f36438b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f36441n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f36442r = imageReceiver2;
        this.f36439c = i10;
        imageReceiver.f14421y = true;
        imageReceiver2.f14421y = true;
        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(2131624004, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.f36443s = ci0Var;
        org.telegram.ui.Components.ci0 ci0Var2 = new org.telegram.ui.Components.ci0(2131624003, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.f36444w = ci0Var2;
        imageReceiver.w0(ci0Var);
        imageReceiver2.w0(ci0Var2);
        imageReceiver.W(1);
        ci0Var.K(1);
        ci0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i10 = this.f36439c;
        ArrayList arrayList2 = org.telegram.messenger.b6.q(i10).G;
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((ay) arrayList.get(i11)).f35857c, (ay) arrayList.get(i11));
            org.telegram.messenger.b6.q(i10).v((org.telegram.messenger.z5) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            String S0 = ((org.telegram.messenger.kj) arrayList2.get(i12)).S0();
            if (org.telegram.messenger.b8.G(i10).T(S0)) {
                ay ayVar = (ay) hashMap.get(S0);
                if (ayVar == null) {
                    ayVar = new ay(this, S0);
                }
                org.telegram.messenger.b6.q(i10).a(S0, null, ayVar);
                arrayList.add(ayVar);
            }
        }
        if (arrayList.size() == 0 && !this.D) {
            if (org.telegram.messenger.b6.q(i10).I.size() > 0) {
                this.e = 1.0f;
                this.f36440f = 1.0f;
                this.f36445x = true;
                return;
            }
            this.e = 0.0f;
            this.f36440f = 0.0f;
            this.f36445x = false;
        }
    }

    public final void b() {
        org.telegram.messenger.is.a0(this.f36439c);
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j10 += ((ay) arrayList.get(i10)).f35855a;
            j11 += ((ay) arrayList.get(i10)).f35856b;
            i10++;
        }
        if (j10 == 0) {
            this.e = 1.0f;
        } else {
            this.e = ((float) j11) / ((float) j10);
        }
        float f7 = this.e;
        if (f7 > 1.0f) {
            this.e = 1.0f;
        } else if (f7 < 0.0f) {
            this.e = 0.0f;
        }
        this.h = ((this.e - this.f36440f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14685b5) {
            a();
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.at.f(this.f36439c).c(this, org.telegram.messenger.at.f14685b5);
        this.f36441n.P();
        this.f36442r.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f36439c;
            if (i10 < size) {
                org.telegram.messenger.b6.q(i11).v((org.telegram.messenger.z5) arrayList.get(i10));
                i10++;
            } else {
                arrayList.clear();
                org.telegram.messenger.at.f(i11).n(this, org.telegram.messenger.at.f14685b5);
                this.f36441n.R();
                this.f36442r.R();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i10 = this.f36446y;
            int i11 = org.telegram.ui.ActionBar.t6.f21262v8;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            ImageReceiver imageReceiver = this.f36442r;
            ImageReceiver imageReceiver2 = this.f36441n;
            Paint paint = this.f36437a;
            Paint paint2 = this.f36438b;
            if (i10 != x02) {
                this.f36446y = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
                paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.f14398o1 = new PorterDuffColorFilter(x03, mode);
                imageReceiver.f14398o1 = new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, i11, false), mode);
                paint2.setAlpha(100);
            }
            float f7 = this.f36440f;
            float f10 = this.e;
            if (f7 != f10) {
                float f11 = this.h;
                float f12 = f7 + f11;
                this.f36440f = f12;
                if (f11 > 0.0f && f12 > f10) {
                    this.f36440f = f10;
                } else if (f11 < 0.0f && f12 < f10) {
                    this.f36440f = f10;
                } else {
                    invalidate();
                }
            }
            int L = org.telegram.messenger.i0.L(8.0f);
            float L2 = org.telegram.messenger.i0.L(1.0f);
            float L3 = org.telegram.messenger.i0.L(16.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            float measuredHeight = L + (getMeasuredHeight() / 2);
            float f13 = measuredHeight - L2;
            float f14 = measuredHeight + L2;
            rectF.set(L3, f13, getMeasuredWidth() - L3, f14);
            canvas.drawRoundRect(rectF, L2, L2, paint2);
            rectF.set(L3, f13, ((getMeasuredWidth() - (2.0f * L3)) * this.f36440f) + L3, f14);
            canvas.drawRoundRect(rectF, L2, L2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f13);
            if (this.e != 1.0f) {
                this.f36445x = false;
            }
            if (this.f36445x) {
                imageReceiver.h(canvas, null);
            } else {
                imageReceiver2.h(canvas, null);
            }
            if (this.e == 1.0f && !this.f36445x && this.f36443s.f25131a0 == 0) {
                org.telegram.ui.Components.ci0 ci0Var = this.f36444w;
                ci0Var.N(0, false, false);
                ci0Var.start();
                this.f36445x = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.D = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        int L = org.telegram.messenger.i0.L(15.0f);
        float f7 = L;
        this.f36441n.y0(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f36442r.y0(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - (L * 2));
    }

    @Override
    public void setAlpha(float f7) {
        if (f7 == 0.0f) {
            this.D = false;
        }
        super.setAlpha(f7);
    }

    @Override
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.D = false;
        }
        super.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.ci0 ci0Var;
        org.telegram.ui.Components.ci0 ci0Var2 = this.f36443s;
        if (ci0Var2 != null && (ci0Var = this.f36444w) != null) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21262v8, false);
            if (x02 != this.E || ci0Var2.getColorFilter() == null) {
                this.E = x02;
                ci0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                ci0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
