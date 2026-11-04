package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class li0 extends FrameLayout implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public static final org.telegram.ui.Cells.g1 m1 = new org.telegram.ui.Cells.g1(Float.class, "transitionProgress", 2);
    public final ji0 A0;
    public boolean B0;
    public float C0;
    public final HashSet D0;
    public float E;
    public final HashSet E0;
    public final float F;
    public boolean F0;
    public final float G;
    public boolean G0;
    public int H;
    public boolean H0;
    public org.telegram.messenger.zi I;
    public final Paint I0;
    public boolean J;
    public final Paint J0;
    public int K;
    public ao K0;
    public long L;
    public boolean L0;
    public boolean M;
    public final g2.g M0;
    public boolean N;
    public final int N0;
    public boolean O;
    public boolean O0;
    public float P;
    public boolean P0;
    public long Q;
    public Runnable Q0;
    public ValueAnimator R;
    public boolean R0;
    public FrameLayout S;
    public s70 S0;
    public ai.c0 T;
    public int T0;
    public final ArrayList U;
    public int U0;
    public final ArrayList V;
    public float V0;
    public final ArrayList W;
    public float W0;
    public gh.g X0;
    public gh.g Y0;
    public gh.g Z0;
    public boolean f35733a;
    public final kg.f0 f35734a0;
    public eh.c f35735a1;
    public final ci.j1 f35736b;
    public final bi0 f35737b0;
    public hh.e f35738b1;
    public final float f35739c;
    public final RectF f35740c0;
    public int f35741c1;
    public final ArrayList d;
    public boolean f35742d0;
    public boolean f35743d1;
    public final ArrayList f35744e;
    public final HashSet f35745e0;
    public boolean f35746e1;
    public final Paint f35747f;
    public final HashSet f35748f0;
    public ao f35749f1;
    public final int[] f35750g0;
    public boolean f35751g1;
    public final Paint h;
    public ki0 f35752h0;
    public boolean f35753h1;
    public final Rect f35754i0;
    public boolean f35755i1;
    public final Drawable f35756j0;
    public Paint f35757j1;
    public final boolean f35758k0;
    public Matrix k1;
    public final org.telegram.ui.ActionBar.e6 f35759l0;
    public LinearGradient f35760l1;
    public dh.n0 m0;
    public final Paint f35761n;
    public int f35762n0;
    public float f35763o0;
    public float f35764p0;
    public float f35765q0;
    public float f35766r;
    public float f35767r0;
    public float f35768s;
    public boolean f35769s0;
    public long f35770t0;
    public org.telegram.ui.ActionBar.d2 f35771u0;
    public vg.y0 f35772v0;
    public float f35773w;
    public zq f35774w0;
    public final RectF f35775x;
    public float f35776x0;
    public final Path f35777y;
    public dh.a0 f35778y0;
    public ValueAnimator f35779z0;

    public li0(int i3, int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        this.f35733a = false;
        this.d = new ArrayList();
        this.f35744e = new ArrayList();
        Paint paint = new Paint(1);
        this.f35747f = paint;
        this.h = new Paint(1);
        this.f35761n = new Paint(1);
        this.f35773w = 1.0f;
        this.f35775x = new RectF();
        this.f35777y = new Path();
        this.E = org.telegram.messenger.g0.L(72.0f);
        float L = org.telegram.messenger.g0.L(8.0f);
        this.F = L;
        this.G = L / 2.0f;
        this.H = org.telegram.messenger.g0.L(36.0f);
        this.U = new ArrayList(20);
        this.V = new ArrayList(10);
        this.W = new ArrayList(20);
        this.f35740c0 = new RectF();
        this.f35742d0 = false;
        this.f35745e0 = new HashSet();
        this.f35748f0 = new HashSet();
        this.f35750g0 = new int[2];
        Rect rect = new Rect();
        this.f35754i0 = rect;
        new ArrayList();
        this.D0 = new HashSet();
        this.E0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.I0 = paint2;
        Paint paint3 = new Paint(1);
        this.J0 = paint3;
        this.M0 = new g2.g((int[]) null);
        this.P0 = true;
        this.f35753h1 = false;
        this.N0 = i3;
        this.f35739c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var));
        paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xk, e6Var));
        this.f35759l0 = e6Var;
        this.K = i10;
        this.f35771u0 = d2Var;
        ji0 ji0Var = new ji0(this, context);
        this.A0 = ji0Var;
        ji0Var.setVisibility(8);
        ji0Var.P = false;
        ji0Var.f35079c.setVisibility(8);
        addView(ji0Var);
        if (org.telegram.messenger.az.c() && org.telegram.messenger.az.o() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35758k0 = z10;
        Drawable mutate = context.getDrawable(2131232671).mutate();
        this.f35756j0 = mutate;
        int L2 = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.He, null, PorterDuff.Mode.MULTIPLY);
        ci.j1 j1Var = new ci.j1(22, context, this);
        this.f35736b = j1Var;
        j1Var.setClipChildren(false);
        j1Var.setClipToPadding(false);
        kg.f0 f0Var = new kg.f0((ViewGroup) this, 4);
        this.f35734a0 = f0Var;
        j1Var.i(new xh0(this, 0));
        j1Var.setLayoutManager(f0Var);
        j1Var.setOverScrollMode(2);
        bi0 bi0Var = new bi0(this, 0);
        this.f35737b0 = bi0Var;
        j1Var.setAdapter(bi0Var);
        j1Var.j(new fi0(this));
        j1Var.j(new ji(this, 14));
        j1Var.i(new xh0(this, 1));
        j1Var.setOnItemClickListener(new k(this, 11));
        j1Var.setOnItemLongClickListener((hj0) new k2.q(this, i3, 9));
        addView(j1Var, b8.mf.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (j1Var.getLayoutParams().height - j1Var.getPaddingTop()) - j1Var.getPaddingBottom();
        ji0Var.getLayoutParams().width = paddingTop - org.telegram.messenger.g0.L(12.0f);
        ji0Var.getLayoutParams().height = paddingTop;
        if (i3 != 2 && i3 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, e6Var));
        } else {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        }
        org.telegram.messenger.li.b0(i10).k1();
    }

    public static void a(li0 li0Var) {
        if (li0Var.f35778y0 != null) {
            return;
        }
        dh.a0 a0Var = new dh.a0(li0Var.N0, li0Var.f35771u0, li0Var.W, li0Var.f35745e0, li0Var, li0Var.f35759l0, li0Var.f35733a);
        li0Var.f35778y0 = a0Var;
        eh.c cVar = li0Var.f35735a1;
        boolean z10 = true;
        if (cVar != null) {
            hh.e eVar = li0Var.f35738b1;
            org.telegram.ui.yz0 yz0Var = a0Var.f8941m.f45452g0;
            yz0Var.f52475y = true;
            yz0Var.setBackground(null);
            yz0Var.updateColors();
            yz0Var.invalidate();
            gh.g c2 = cVar.c(a0Var.f8931a, null, true);
            c2.p(eVar);
            org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(12.0f), 8.0f);
            a0Var.f8953z = c2;
        }
        dh.a0 a0Var2 = li0Var.f35778y0;
        ki0 ki0Var = li0Var.f35752h0;
        if (ki0Var != null && !ki0Var.r()) {
            z10 = false;
        }
        a0Var2.f8941m.setLongPressEnabled(z10);
        li0Var.j();
        li0Var.f35778y0.f8944p = new jb0(li0Var, 13);
        li0Var.m();
    }

    public static void b(li0 li0Var, View view, float f10) {
        if (view instanceof ji0) {
            ((ji0) view).h = f10;
            return;
        }
        view.setScaleX(f10);
        view.setScaleY(f10);
    }

    public static boolean c() {
        return org.telegram.messenger.az.j();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z10 = true;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
            hashSet.clear();
            if (ziVar != null && (tL_messageReactions = ziVar.f26868k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < ziVar.f26868k.reactions.results.size(); i10++) {
                    if (ziVar.f26868k.reactions.results.get(i10).chosen) {
                        dh.n0 d = dh.n0.d(ziVar.f26868k.reactions.results.get(i10).reaction);
                        if (z10 || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i11 = 0;
            while (i11 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i11)))) {
                    longSparseArray.removeAt(i11);
                    i11--;
                }
                i11++;
            }
            i3++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            if (longSparseArray.valueAt(i12) != null) {
                hashSet2.add((dh.n0) longSparseArray.valueAt(i12));
            }
        }
        return hashSet2;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27954h5));
    }

    public final void d(boolean z10) {
        dh.a0 a0Var = this.f35778y0;
        if (a0Var != null) {
            if (!a0Var.f8945q || !z10) {
                a0Var.f8945q = true;
                if (!z10) {
                    a0Var.f();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new dh.t(a0Var, 0));
                    ofFloat.addListener(new dh.y(a0Var, 0));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                }
            }
            this.f35778y0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f27002id == this.L && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.I, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i3 == org.telegram.messenger.hs.f23246i4) {
            if (this.N0 == 4) {
                invalidate();
                ci.j1 j1Var = this.f35736b;
                j1Var.invalidate();
                j1Var.g1();
                for (int i11 = 0; i11 < j1Var.getChildCount(); i11++) {
                    View childAt = j1Var.getChildAt(i11);
                    if (childAt instanceof ji0) {
                        ji0 ji0Var = (ji0) childAt;
                        ji0Var.f35077a.invalidate();
                        ji0Var.f35078b.invalidate();
                    } else {
                        childAt.invalidate();
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23316u3) {
            p(this.I, null, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        dh.a0 a0Var = this.f35778y0;
        if (a0Var != null) {
            a0Var.d();
        }
    }

    public final void f(float f10, float f11, float f12, int i3, Canvas canvas) {
        int i10;
        float height;
        float f13;
        float f14;
        float height2;
        if (this.N0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.M;
        RectF rectF = this.f35775x;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (org.telegram.messenger.g0.T1(rectF.top, getMeasuredHeight(), xq.f40452f.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.f35773w) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f15 = rectF.bottom;
            xq xqVar = xq.f40452f;
            canvas.clipRect(0.0f, (org.telegram.messenger.g0.T1(f15, 0.0f, xqVar.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.f35773w) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), xqVar.getInterpolation(this.P)));
        }
        if (!org.telegram.messenger.bd.f21784a0 && !this.N) {
            i10 = getWidth() - this.H;
        } else {
            i10 = this.H;
        }
        float f16 = i10 + this.V0;
        if (this.M) {
            height = getPaddingTop() - g();
        } else {
            height = (getHeight() - getPaddingBottom()) + g();
        }
        int L = org.telegram.messenger.g0.L(3.0f);
        Drawable drawable = this.f35756j0;
        drawable.setAlpha(i3);
        Paint paint = this.f35747f;
        paint.setAlpha(i3);
        float f17 = f16 - f10;
        float f18 = L;
        float f19 = f18 * f11;
        float f20 = height - f10;
        float f21 = f16 + f10;
        float f22 = height + f10;
        drawable.setBounds((int) (f17 - f19), (int) (f20 - f19), (int) (f21 + f19), (int) (f19 + f22));
        drawable.draw(canvas);
        boolean O = this.f35752h0.O();
        float f23 = height;
        RectF rectF2 = this.f35740c0;
        if (O) {
            rectF2.set(f17, f20, f21, f22);
            f13 = f10;
            this.f35752h0.E(canvas, rectF2, f13, getX(), getY(), i3, false);
        } else {
            f13 = f10;
            if (this.Y0 != null) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(f17, f20, f21, f22);
                Rect rect = org.telegram.messenger.g0.Q;
                rectF3.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                this.Y0.setBounds(rect);
                this.Y0.setAlpha(paint.getAlpha());
                this.Y0.draw(canvas);
            } else {
                canvas.drawCircle(f16, f23, f13, paint);
            }
        }
        boolean z11 = org.telegram.messenger.bd.f21784a0;
        float f24 = this.F;
        if (!z11 && !this.N) {
            f14 = (getWidth() - this.H) + f24;
        } else {
            f14 = this.H - f24;
        }
        float f25 = this.V0 + this.W0 + f14;
        boolean z12 = this.M;
        float f26 = this.G;
        if (z12) {
            height2 = (getPaddingTop() - g()) - org.telegram.messenger.g0.L(16.0f);
        } else {
            height2 = ((getHeight() - f26) - f18) + g();
        }
        float T1 = org.telegram.messenger.g0.T1(height2, (f26 + f18) - g(), xq.f40452f.getInterpolation(this.P));
        float f27 = (-org.telegram.messenger.g0.L(1.0f)) * f11;
        drawable.setBounds((int) ((f25 - f13) - f27), (int) ((T1 - f13) - f27), (int) (f25 + f13 + f27), (int) (f13 + T1 + f27));
        drawable.draw(canvas);
        if (this.f35752h0.O()) {
            rectF2.set(f25 - f12, T1 - f12, f25 + f12, T1 + f12);
            this.f35752h0.E(canvas, rectF2, f12, getX(), getY(), i3, false);
        } else if (this.Z0 != null) {
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(f25 - f12, T1 - f12, f25 + f12, T1 + f12);
            Rect rect2 = org.telegram.messenger.g0.Q;
            rectF4.round(rect2);
            rect2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
            this.Z0.setBounds(rect2);
            this.Z0.setAlpha(paint.getAlpha());
            this.Z0.draw(canvas);
        } else {
            canvas.drawCircle(f25, T1, f12, paint);
        }
        canvas.restore();
        drawable.setAlpha(255);
        paint.setAlpha(255);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * org.telegram.messenger.g0.L(6.0f));
    }

    public ki0 getDelegate() {
        return this.f35752h0;
    }

    public int getHintTextWidth() {
        return this.T0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.U.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.i(this.C0 / org.telegram.messenger.g0.L(42.0f), 2.0f, 0.0f);
    }

    public dh.a0 getReactionsWindow() {
        return this.f35778y0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e10;
        HashSet hashSet = this.f35745e0;
        if (hashSet.isEmpty()) {
            return "";
        }
        dh.n0 n0Var = (dh.n0) hashSet.iterator().next();
        long j10 = n0Var.f9098g;
        String str = null;
        if (j10 != 0 && (e10 = g5.e(this.K, j10)) != null) {
            str = org.telegram.messenger.zi.V(e10, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = n0Var.f9097f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<dh.n0> getSelectedReactions() {
        return this.f35745e0;
    }

    public float getTopOffset() {
        if (this.R0) {
            return ((FrameLayout.LayoutParams) this.f35736b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (!q()) {
            return org.telegram.messenger.g0.L(16.0f) + com.google.android.recaptcha.internal.a.e(itemsCount, 1, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(36.0f) * itemsCount);
        }
        return (org.telegram.messenger.g0.L(36.0f) * itemsCount) - org.telegram.messenger.g0.L(4.0f);
    }

    public List<dh.n0> getVisibleReactionsList() {
        return this.U;
    }

    public int getWindowType() {
        int i3 = this.N0;
        if (i3 == 4) {
            return 13;
        }
        if (i3 == 3) {
            return 11;
        }
        if (i3 == 5) {
            return 14;
        }
        if (this.G0) {
            return 8;
        }
        return 1;
    }

    public View getWindowView() {
        dh.a0 a0Var = this.f35778y0;
        if (a0Var == null) {
            return null;
        }
        return a0Var.f8933c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList arrayList2;
        HashSet hashSet = new HashSet();
        int i3 = 0;
        int i10 = this.N0;
        if (i10 == 4) {
            Iterator it = this.f35745e0.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                dh.n0 n0Var = (dh.n0) it.next();
                if (!hashSet.contains(n0Var)) {
                    hashSet.add(n0Var);
                    arrayList.add(n0Var);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList3 = org.telegram.messenger.li.b0(this.K).f24036n;
            while (i3 < arrayList3.size()) {
                dh.n0 c2 = dh.n0.c((TLRPC.TL_availableReaction) arrayList3.get(i3));
                if (!hashSet.contains(c2)) {
                    hashSet.add(c2);
                    arrayList.add(c2);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
                i3++;
            }
        } else if (this.F0 && i10 != 4) {
            if (i10 == 5) {
                TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.hp.s1(this.K).E0();
                if (E0 != null) {
                    while (i3 < E0.effects.size()) {
                        dh.n0 e10 = dh.n0.e(E0.effects.get(i3));
                        if (!hashSet.contains(e10)) {
                            hashSet.add(e10);
                            arrayList.add(e10);
                        }
                        i3++;
                    }
                    return;
                }
                return;
            }
            if (i10 == 3) {
                arrayList2 = org.telegram.messenger.li.b0(this.K).F1;
            } else {
                arrayList2 = org.telegram.messenger.li.b0(this.K).E1;
            }
            if (i10 == 3) {
                TLRPC.TL_messages_savedReactionsTags I1 = org.telegram.messenger.hp.s1(this.K).I1(0L, false);
                if (I1 != null) {
                    for (int i12 = 0; i12 < I1.tags.size(); i12++) {
                        dh.n0 d = dh.n0.d(I1.tags.get(i12).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    dh.n0 d10 = dh.n0.d((TLRPC.Reaction) arrayList2.get(i13));
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            } else {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    dh.n0 d11 = dh.n0.d((TLRPC.Reaction) arrayList2.get(i14));
                    if (!hashSet.contains(d11) && (i10 == 3 || org.telegram.messenger.h10.i(this.K).q() || d11.f9098g == 0)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
            }
            if (i10 != 3 || org.telegram.messenger.h10.i(this.K).q()) {
                ArrayList arrayList4 = org.telegram.messenger.li.b0(this.K).D1;
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    dh.n0 d12 = dh.n0.d((TLRPC.Reaction) arrayList4.get(i15));
                    if (!hashSet.contains(d12)) {
                        hashSet.add(d12);
                        arrayList.add(d12);
                    }
                }
                ArrayList arrayList5 = org.telegram.messenger.li.b0(this.K).f24036n;
                while (i3 < arrayList5.size()) {
                    dh.n0 c10 = dh.n0.c((TLRPC.TL_availableReaction) arrayList5.get(i3));
                    if (!hashSet.contains(c10)) {
                        hashSet.add(c10);
                        arrayList.add(c10);
                    }
                    i3++;
                }
            }
        } else if (i10 == 3) {
            ArrayList arrayList6 = org.telegram.messenger.li.b0(this.K).F1;
            int i16 = 0;
            while (i3 < arrayList6.size()) {
                dh.n0 d13 = dh.n0.d((TLRPC.Reaction) arrayList6.get(i3));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                    i16++;
                }
                if (i16 != 16) {
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            ArrayList arrayList7 = org.telegram.messenger.li.b0(this.K).f24036n;
            while (i3 < arrayList7.size()) {
                arrayList.add(dh.n0.c((TLRPC.TL_availableReaction) arrayList7.get(i3)));
                i3++;
            }
        }
    }

    public void j() {
        int i3 = 0;
        while (true) {
            ci.j1 j1Var = this.f35736b;
            if (i3 < j1Var.getChildCount()) {
                View childAt = j1Var.getChildAt(i3);
                if (childAt instanceof ji0) {
                    ((ji0) childAt).f35078b.invalidate();
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int L = org.telegram.messenger.g0.L(24.0f);
        float height = getHeight() / 2.0f;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        this.f35741c1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, x02, 0, tileMode));
        this.f35761n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, dh.n0 n0Var, boolean z10) {
        ki0 ki0Var = this.f35752h0;
        if (ki0Var != null) {
            ki0Var.z(view, n0Var, z10, true);
        }
        if (this.N0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.P0 = true;
        this.f35762n0 = 0;
        this.f35763o0 = 0.0f;
        this.C0 = 0.0f;
        this.m0 = null;
        this.f35769s0 = false;
        wh0 wh0Var = new wh0(this, 1);
        ci.j1 j1Var = this.f35736b;
        org.telegram.messenger.g0.d0(j1Var, wh0Var);
        this.D0.clear();
        j1Var.invalidate();
        ai.c0 c0Var = this.T;
        if (c0Var != null) {
            c0Var.invalidate();
        }
        invalidate();
    }

    public final void o(eh.c cVar, hh.e eVar) {
        this.f35735a1 = cVar;
        this.f35738b1 = eVar;
        gh.g c2 = cVar.c(this, null, true);
        c2.p(eVar);
        org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(24.0f), 8.0f);
        this.X0 = c2;
        gh.g c10 = cVar.c(this, null, true);
        c10.p(eVar);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(8.0f), 8.0f);
        this.Y0 = c10;
        gh.g c11 = cVar.c(this, null, true);
        c11.p(eVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(4.0f), 8.0f);
        this.Z0 = c11;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.f(this.K).c(this, org.telegram.messenger.hs.T);
        if (this.N0 == 5) {
            org.telegram.messenger.hs.f(this.K).c(this, org.telegram.messenger.hs.f23316u3);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.f(this.K).n(this, org.telegram.messenger.hs.T);
        if (this.N0 == 5) {
            org.telegram.messenger.hs.f(this.K).n(this, org.telegram.messenger.hs.f23316u3);
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        k();
    }

    public final void p(org.telegram.messenger.zi ziVar, TLRPC.ChatFull chatFull, boolean z10) {
        int i3;
        boolean z11;
        boolean z12;
        TLRPC.ChatFull chatFull2;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i10;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.I = ziVar;
        if (ziVar != null && (message = ziVar.f26868k) != null && (tL_messageReactions2 = message.reactions) != null) {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i3 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i11);
                i11++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i3++;
                }
            }
        } else {
            i3 = 0;
        }
        int i12 = this.N0;
        if (i12 == 0 && this.I != null && i3 >= org.telegram.messenger.hp.s1(this.K).O0(org.telegram.messenger.zi.B0(this.I.f26868k))) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.J = z11;
        if (i12 == 0 && this.I != null && org.telegram.messenger.t3.V(org.telegram.messenger.hp.s1(this.K).M0(Long.valueOf(-org.telegram.messenger.zi.B0(this.I.f26868k))))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.B0 = z12;
        ArrayList arrayList2 = new ArrayList();
        if (ziVar != null && ziVar.l3()) {
            chatFull2 = org.telegram.messenger.hp.s1(this.K).N0(-ziVar.Z0());
            if (chatFull2 == null) {
                this.L = -ziVar.Z0();
                org.telegram.messenger.hp.s1(this.K).V2(0, -ziVar.Z0(), true);
                setVisibility(4);
                return;
            }
        } else {
            chatFull2 = chatFull;
        }
        this.f35742d0 = false;
        if (i12 == 3) {
            this.F0 = org.telegram.messenger.h10.i(this.K).q();
            h(arrayList2);
        } else if (i12 == 5) {
            this.F0 = true;
            h(arrayList2);
        } else if (this.J) {
            this.F0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.f35742d0 = true;
                ?? obj = new Object();
                obj.f9093a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.I.f26868k.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(dh.n0.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.f35742d0 = true;
                ?? obj2 = new Object();
                obj2.f9093a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.K).M0(Long.valueOf(chatFull2.f27002id));
                if (M0 != null && !org.telegram.messenger.t3.V(M0)) {
                    this.F0 = true;
                } else {
                    this.F0 = false;
                }
                h(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i14);
                    i14++;
                    TLRPC.Reaction reaction2 = reaction;
                    ArrayList arrayList5 = org.telegram.messenger.li.b0(this.K).f24036n;
                    int size4 = arrayList5.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 < size4) {
                            Object obj3 = arrayList5.get(i15);
                            i15++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj3;
                            if ((reaction2 instanceof TLRPC.TL_reactionEmoji) && tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                arrayList2.add(dh.n0.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(dh.n0.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.F0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i16))) {
                i16--;
                arrayList2.remove(i16);
            } else {
                hashSet.add((dh.n0) arrayList2.get(i16));
            }
            i16++;
        }
        if (!this.J && ((!this.F0 && arrayList2.size() > 16) || (this.F0 && !org.telegram.messenger.h10.i(this.K).q() && org.telegram.messenger.hp.s1(this.K).D3()))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.G0 = z13;
        if (i12 == 3 && !org.telegram.messenger.h10.i(this.K).q()) {
            this.G0 = false;
        }
        if (i12 == 4) {
            this.G0 = true;
        }
        ArrayList arrayList6 = this.U;
        arrayList6.clear();
        if (q()) {
            int L = (org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(36.0f)) / org.telegram.messenger.g0.L(34.0f);
            if (L > 7) {
                L = 7;
            }
            int i17 = 0;
            if (L < 1) {
                L = 1;
            }
            while (i17 < Math.min(arrayList2.size(), L)) {
                arrayList6.add((dh.n0) arrayList2.get(i17));
                i17++;
            }
            if (i17 < arrayList2.size()) {
                ji0.a(this.A0, (dh.n0) arrayList2.get(i17), -1);
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.H0 = true;
        for (int i18 = 0; i18 < arrayList6.size(); i18++) {
            if (((dh.n0) arrayList6.get(i18)).f9098g != 0) {
                this.H0 = false;
            }
        }
        ArrayList arrayList7 = this.W;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < org.telegram.messenger.g0.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        bi0 bi0Var = this.f35737b0;
        li0 li0Var = (li0) bi0Var.f32302e;
        ArrayList arrayList8 = li0Var.f35744e;
        ArrayList arrayList9 = li0Var.U;
        ArrayList arrayList10 = li0Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i19 = 0; i19 < arrayList9.size(); i19++) {
            dh.n0 n0Var = (dh.n0) arrayList9.get(i19);
            if (n0Var.f9097f == null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            arrayList10.add(new ci0(i10, n0Var));
        }
        if (!li0Var.V.isEmpty() && !org.telegram.messenger.hp.s1(li0Var.K).D3()) {
            arrayList10.add(new ci0(1, null));
        }
        if (li0Var.q()) {
            arrayList10.add(new ci0(2, null));
        }
        if (z10) {
            bi0Var.E(arrayList8, arrayList10);
        } else {
            bi0Var.f();
        }
        if (ziVar != null && (tL_messageReactions = ziVar.f26868k.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < ziVar.f26868k.reactions.results.size(); i20++) {
                if (ziVar.f26868k.reactions.results.get(i20).chosen) {
                    this.f35745e0.add(dh.n0.d(ziVar.f26868k.reactions.results.get(i20).reaction));
                }
            }
        }
    }

    public final boolean q() {
        if (!this.F0 && !this.G0) {
            return false;
        }
        return true;
    }

    public final void r(boolean z10) {
        ObjectAnimator duration;
        this.L0 = z10;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.M0.d();
        boolean j10 = org.telegram.messenger.az.j();
        org.telegram.ui.Cells.g1 g1Var = m1;
        if (j10) {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new yh0(this, 0));
        duration.start();
    }

    @Override
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.D0.clear();
            int i3 = 0;
            while (true) {
                ci.j1 j1Var = this.f35736b;
                if (i3 >= j1Var.getChildCount()) {
                    break;
                }
                if (j1Var.getChildAt(i3) instanceof ji0) {
                    ((ji0) j1Var.getChildAt(i3)).d();
                }
                i3++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.V0 = f10;
    }

    public void setChatScrimView(ao aoVar) {
        this.f35749f1 = aoVar;
    }

    public void setCurrentAccount(int i3) {
        this.K = i3;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.f35776x0 = f10;
        ao aoVar = this.f35749f1;
        if (aoVar != null) {
            aoVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            zq zqVar = this.f35774w0;
            int L = org.telegram.messenger.g0.L(28.0f);
            int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.ActionBar.r6.R(zqVar, org.telegram.ui.ActionBar.k6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 40)), null, org.telegram.ui.ActionBar.r6.h(i3, 40), null);
            return;
        }
        this.f35774w0.setBackground(null);
    }

    public void setDelegate(ki0 ki0Var) {
        this.f35752h0 = ki0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.O = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.d2 d2Var) {
        this.f35771u0 = d2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.R0 = true;
        if (this.S0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.f35759l0;
            s70 s70Var = new s70(context, e6Var);
            this.S0 = s70Var;
            s70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.S0.setClickable(true);
            this.S0.setTextSize(1, 12.0f);
            int i3 = this.N0;
            if (i3 != 1 && i3 != 2 && i3 != 4) {
                org.telegram.ui.ActionBar.r6.V(this.S0, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
            } else {
                org.telegram.ui.ActionBar.r6.V(this.S0, org.telegram.ui.ActionBar.k6.G6, e6Var);
                this.S0.setAlpha(0.5f);
            }
            this.S0.setGravity(1);
            addView(this.S0, b8.mf.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.S0.setText(charSequence);
        this.f35751g1 = false;
        ((FrameLayout.LayoutParams) this.A0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((FrameLayout.LayoutParams) this.f35736b.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
    }

    public void setMiniBubblesOffset(float f10) {
        this.W0 = f10;
    }

    public void setMirrorX(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.Q0 = runnable;
    }

    public void setParentLayout(ao aoVar) {
        this.K0 = aoVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f35745e0;
        hashSet.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = arrayList.get(i3);
            i3++;
            dh.n0 b10 = dh.n0.b(str);
            hashSet.add(b10);
            this.f35748f0.add(b10);
        }
        org.telegram.messenger.g0.d0(this.f35736b, new wh0(this, 0));
    }

    public void setSelectedReaction(dh.n0 n0Var) {
        HashSet hashSet = this.f35745e0;
        hashSet.clear();
        if (n0Var != null) {
            hashSet.add(n0Var);
        }
        this.f35737b0.f();
    }

    public void setSelectedReactionAnimated(dh.n0 n0Var) {
        HashSet hashSet = this.f35745e0;
        hashSet.clear();
        if (n0Var != null) {
            hashSet.add(n0Var);
        }
        org.telegram.messenger.g0.d0(this.f35736b, new wh0(this, 0));
    }

    public void setSelectedReactionInclusive(dh.n0 n0Var) {
        HashSet hashSet = this.f35745e0;
        hashSet.clear();
        if (n0Var != null) {
            hashSet.add(n0Var);
        }
        org.telegram.messenger.g0.d0(this.f35736b, new wh0(this, 0));
    }

    public void setSelectedReactions(ArrayList<org.telegram.messenger.zi> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f35745e0;
        hashSet.clear();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            org.telegram.messenger.zi ziVar = arrayList.get(i3);
            if (ziVar != null && (tL_messageReactions = ziVar.f26868k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < ziVar.f26868k.reactions.results.size(); i10++) {
                    if (ziVar.f26868k.reactions.results.get(i10).chosen) {
                        hashSet.add(dh.n0.d(ziVar.f26868k.reactions.results.get(i10).reaction));
                    }
                }
            }
        }
        this.f35737b0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<org.telegram.messenger.zi> arrayList) {
        HashSet hashSet = this.f35745e0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        org.telegram.messenger.g0.d0(this.f35736b, new wh0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.f35746e1 != z10) {
            this.f35746e1 = z10;
            if (!z10) {
                int i3 = 0;
                while (true) {
                    ci.j1 j1Var = this.f35736b;
                    if (i3 >= j1Var.getChildCount()) {
                        break;
                    }
                    if (j1Var.getChildAt(i3) instanceof ji0) {
                        ji0 ji0Var = (ji0) j1Var.getChildAt(i3);
                        boolean z11 = ji0Var.f35083r;
                        ii0 ii0Var = ji0Var.f35078b;
                        if (z11 && (ii0Var.getImageReceiver().B() != null || ii0Var.getImageReceiver().m() != null)) {
                            ii0Var.setVisibility(0);
                            ji0Var.f35077a.setVisibility(4);
                            if (ji0Var.f35084s) {
                                ji0Var.f35085w = true;
                            }
                        }
                        ji0Var.invalidate();
                    }
                    i3++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f35745e0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(dh.n0.d(reaction));
        }
        this.f35737b0.f();
    }

    public void setTop(boolean z10) {
        this.M = z10;
    }

    public void setTransitionProgress(float f10) {
        this.f35773w = f10;
        ao aoVar = this.K0;
        if (aoVar != null) {
            aoVar.setReactionsTransitionProgress((this.L0 && org.telegram.messenger.az.j()) ? 1.0f : 1.0f);
        }
        invalidate();
    }

    @Override
    public void setTranslationX(float f10) {
        if (f10 != getTranslationX()) {
            super.setTranslationX(f10);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        Paint paint = this.f35747f;
        if (paint != null) {
            try {
                int i3 = this.N0;
                if (i3 != 2 && i3 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.f35759l0))) {
                    int alpha = paint.getAlpha();
                    paint.setColor(w02);
                    paint.setAlpha(alpha);
                    invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        vg.y0 y0Var = this.f35772v0;
        if (y0Var != null) {
            y0Var.setColor(i0.a.f(0.7f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.F8, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false)));
        }
        if (getWidth() > 0 && getHeight() > 0 && this.f35741c1 != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false)) {
            k();
        }
    }

    public void m() {
    }
}
