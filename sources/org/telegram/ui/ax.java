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
public final class ax extends View implements org.telegram.messenger.is, org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public int F;
    public final Paint f45520a;
    public final Paint f45521b;
    public final int f45522c;
    public final ArrayList d;
    public float f45523e;
    public float f45524f;
    public float h;
    public final ImageReceiver f45525n;
    public final ImageReceiver f45526r;
    public final org.telegram.ui.Components.ch0 f45527s;
    public final org.telegram.ui.Components.ch0 f45528w;
    public boolean f45529x;
    public int f45530y;

    public ax(Context context, int i7) {
        super(context);
        this.f45520a = new Paint(1);
        this.f45521b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f45525n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f45526r = imageReceiver2;
        this.f45522c = i7;
        imageReceiver.f22311y = true;
        imageReceiver2.f22311y = true;
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624005, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f45527s = ch0Var;
        org.telegram.ui.Components.ch0 ch0Var2 = new org.telegram.ui.Components.ch0(2131624004, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.f45528w = ch0Var2;
        imageReceiver.w0(ch0Var);
        imageReceiver2.w0(ch0Var2);
        imageReceiver.W(1);
        ch0Var.K(1);
        ch0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i7 = this.f45522c;
        ArrayList arrayList2 = org.telegram.messenger.z5.q(i7).H;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            hashMap.put(((zw) arrayList.get(i10)).f54034c, (zw) arrayList.get(i10));
            org.telegram.messenger.z5.q(i7).v((org.telegram.messenger.x5) arrayList.get(i10));
            i10++;
        }
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            String S0 = ((org.telegram.messenger.gj) arrayList2.get(i11)).S0();
            if (org.telegram.messenger.w7.G(i7).S(S0)) {
                zw zwVar = (zw) hashMap.get(S0);
                if (zwVar == null) {
                    zwVar = new zw(this, S0);
                }
                org.telegram.messenger.z5.q(i7).a(S0, null, zwVar);
                arrayList.add(zwVar);
            }
        }
        if (arrayList.size() == 0 && !this.E) {
            if (org.telegram.messenger.z5.q(i7).J.size() > 0) {
                this.f45523e = 1.0f;
                this.f45524f = 1.0f;
                this.f45529x = true;
                return;
            }
            this.f45523e = 0.0f;
            this.f45524f = 0.0f;
            this.f45529x = false;
        }
    }

    public final void b() {
        org.telegram.messenger.vr.a0(this.f45522c);
        int i7 = 0;
        long j3 = 0;
        long j10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                break;
            }
            j3 += ((zw) arrayList.get(i7)).f54032a;
            j10 += ((zw) arrayList.get(i7)).f54033b;
            i7++;
        }
        if (j3 == 0) {
            this.f45523e = 1.0f;
        } else {
            this.f45523e = ((float) j10) / ((float) j3);
        }
        float f10 = this.f45523e;
        if (f10 > 1.0f) {
            this.f45523e = 1.0f;
        } else if (f10 < 0.0f) {
            this.f45523e = 0.0f;
        }
        this.h = ((this.f45523e - this.f45524f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25475b5) {
            a();
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ns.f(this.f45522c).c(this, org.telegram.messenger.ns.f25475b5);
        this.f45525n.P();
        this.f45526r.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i10 = this.f45522c;
            if (i7 < size) {
                org.telegram.messenger.z5.q(i10).v((org.telegram.messenger.x5) arrayList.get(i7));
                i7++;
            } else {
                arrayList.clear();
                org.telegram.messenger.ns.f(i10).n(this, org.telegram.messenger.ns.f25475b5);
                this.f45525n.R();
                this.f45526r.R();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i7 = this.f45530y;
            int i10 = org.telegram.ui.ActionBar.j6.f29186v8;
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
            ImageReceiver imageReceiver = this.f45526r;
            ImageReceiver imageReceiver2 = this.f45525n;
            Paint paint = this.f45520a;
            Paint paint2 = this.f45521b;
            if (i7 != x02) {
                this.f45530y = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
                paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.f22290p1 = new PorterDuffColorFilter(x03, mode);
                imageReceiver.f22290p1 = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, i10, false), mode);
                paint2.setAlpha(100);
            }
            float f10 = this.f45524f;
            float f11 = this.f45523e;
            if (f10 != f11) {
                float f12 = this.h;
                float f13 = f10 + f12;
                this.f45524f = f13;
                if (f12 > 0.0f && f13 > f11) {
                    this.f45524f = f11;
                } else if (f12 < 0.0f && f13 < f11) {
                    this.f45524f = f11;
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
            rectF.set(L3, f14, ((getMeasuredWidth() - (2.0f * L3)) * this.f45524f) + L3, f15);
            canvas.drawRoundRect(rectF, L2, L2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f14);
            if (this.f45523e != 1.0f) {
                this.f45529x = false;
            }
            if (this.f45529x) {
                imageReceiver.h(canvas, null);
            } else {
                imageReceiver2.h(canvas, null);
            }
            if (this.f45523e == 1.0f && !this.f45529x && this.f45527s.f33575b0 == 0) {
                org.telegram.ui.Components.ch0 ch0Var = this.f45528w;
                ch0Var.N(0, false, false);
                ch0Var.start();
                this.f45529x = true;
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
        this.f45525n.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - i11);
        this.f45526r.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - (L * 2));
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
        org.telegram.ui.Components.ch0 ch0Var;
        org.telegram.ui.Components.ch0 ch0Var2 = this.f45527s;
        if (ch0Var2 != null && (ch0Var = this.f45528w) != null) {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29186v8, false);
            if (x02 != this.F || ch0Var2.getColorFilter() == null) {
                this.F = x02;
                ch0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                ch0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
