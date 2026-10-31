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
public final class dy extends View implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public int E;
    public final Paint f36860a;
    public final Paint f36861b;
    public final int f36862c;
    public final ArrayList d;
    public float e;
    public float f36863f;
    public float h;
    public final ImageReceiver f36864n;
    public final ImageReceiver f36865r;
    public final org.telegram.ui.Components.bi0 f36866s;
    public final org.telegram.ui.Components.bi0 f36867w;
    public boolean f36868x;
    public int f36869y;

    public dy(Context context, int i10) {
        super(context);
        this.f36860a = new Paint(1);
        this.f36861b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f36864n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f36865r = imageReceiver2;
        this.f36862c = i10;
        imageReceiver.f14420y = true;
        imageReceiver2.f14420y = true;
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(2131624004, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.f36866s = bi0Var;
        org.telegram.ui.Components.bi0 bi0Var2 = new org.telegram.ui.Components.bi0(2131624003, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.f36867w = bi0Var2;
        imageReceiver.w0(bi0Var);
        imageReceiver2.w0(bi0Var2);
        imageReceiver.W(1);
        bi0Var.K(1);
        bi0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i10 = this.f36862c;
        ArrayList arrayList2 = org.telegram.messenger.b6.q(i10).G;
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((cy) arrayList.get(i11)).f36569c, (cy) arrayList.get(i11));
            org.telegram.messenger.b6.q(i10).v((org.telegram.messenger.z5) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            String S0 = ((org.telegram.messenger.jj) arrayList2.get(i12)).S0();
            if (org.telegram.messenger.b8.G(i10).T(S0)) {
                cy cyVar = (cy) hashMap.get(S0);
                if (cyVar == null) {
                    cyVar = new cy(this, S0);
                }
                org.telegram.messenger.b6.q(i10).a(S0, null, cyVar);
                arrayList.add(cyVar);
            }
        }
        if (arrayList.size() == 0 && !this.D) {
            if (org.telegram.messenger.b6.q(i10).I.size() > 0) {
                this.e = 1.0f;
                this.f36863f = 1.0f;
                this.f36868x = true;
                return;
            }
            this.e = 0.0f;
            this.f36863f = 0.0f;
            this.f36868x = false;
        }
    }

    public final void b() {
        org.telegram.messenger.hs.a0(this.f36862c);
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j10 += ((cy) arrayList.get(i10)).f36567a;
            j11 += ((cy) arrayList.get(i10)).f36568b;
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
        this.h = ((this.e - this.f36863f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19589b5) {
            a();
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.zs.f(this.f36862c).c(this, org.telegram.messenger.zs.f19589b5);
        this.f36864n.P();
        this.f36865r.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f36862c;
            if (i10 < size) {
                org.telegram.messenger.b6.q(i11).v((org.telegram.messenger.z5) arrayList.get(i10));
                i10++;
            } else {
                arrayList.clear();
                org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.f19589b5);
                this.f36864n.R();
                this.f36865r.R();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i10 = this.f36869y;
            int i11 = org.telegram.ui.ActionBar.t6.f21261v8;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            ImageReceiver imageReceiver = this.f36865r;
            ImageReceiver imageReceiver2 = this.f36864n;
            Paint paint = this.f36860a;
            Paint paint2 = this.f36861b;
            if (i10 != x02) {
                this.f36869y = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
                paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.f14397o1 = new PorterDuffColorFilter(x03, mode);
                imageReceiver.f14397o1 = new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, i11, false), mode);
                paint2.setAlpha(100);
            }
            float f7 = this.f36863f;
            float f10 = this.e;
            if (f7 != f10) {
                float f11 = this.h;
                float f12 = f7 + f11;
                this.f36863f = f12;
                if (f11 > 0.0f && f12 > f10) {
                    this.f36863f = f10;
                } else if (f11 < 0.0f && f12 < f10) {
                    this.f36863f = f10;
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
            rectF.set(L3, f13, ((getMeasuredWidth() - (2.0f * L3)) * this.f36863f) + L3, f14);
            canvas.drawRoundRect(rectF, L2, L2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f13);
            if (this.e != 1.0f) {
                this.f36868x = false;
            }
            if (this.f36868x) {
                imageReceiver.h(canvas, null);
            } else {
                imageReceiver2.h(canvas, null);
            }
            if (this.e == 1.0f && !this.f36868x && this.f36866s.f24752a0 == 0) {
                org.telegram.ui.Components.bi0 bi0Var = this.f36867w;
                bi0Var.N(0, false, false);
                bi0Var.start();
                this.f36868x = true;
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
        this.f36864n.y0(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f36865r.y0(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - (L * 2));
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
        org.telegram.ui.Components.bi0 bi0Var;
        org.telegram.ui.Components.bi0 bi0Var2 = this.f36866s;
        if (bi0Var2 != null && (bi0Var = this.f36867w) != null) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21261v8, false);
            if (x02 != this.E || bi0Var2.getColorFilter() == null) {
                this.E = x02;
                bi0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                bi0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
