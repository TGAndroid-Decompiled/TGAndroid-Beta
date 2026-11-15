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
public class mi0 extends FrameLayout implements org.telegram.messenger.is, org.telegram.ui.ActionBar.z5 {
    public static final org.telegram.ui.Cells.g1 f37255m1 = new org.telegram.ui.Cells.g1(Float.class, "transitionProgress", 2);
    public final ki0 A0;
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
    public org.telegram.messenger.gj I;
    public final Paint I0;
    public boolean J;
    public final Paint J0;
    public int K;
    public lo K0;
    public long L;
    public boolean L0;
    public boolean M;
    public final h2.f M0;
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
    public z70 S0;
    public ai.j0 T;
    public int T0;
    public final ArrayList U;
    public int U0;
    public final ArrayList V;
    public float V0;
    public final ArrayList W;
    public float W0;
    public fh.g X0;
    public fh.g Y0;
    public fh.g Z0;
    public boolean f37256a;
    public final jg.i0 f37257a0;
    public dh.c f37258a1;
    public final di.c1 f37259b;
    public final ci0 f37260b0;
    public gh.e f37261b1;
    public final float f37262c;
    public final RectF f37263c0;
    public int f37264c1;
    public final ArrayList d;
    public boolean f37265d0;
    public boolean f37266d1;
    public final ArrayList f37267e;
    public final HashSet f37268e0;
    public boolean f37269e1;
    public final Paint f37270f;
    public final HashSet f37271f0;
    public lo f37272f1;
    public final int[] f37273g0;
    public boolean f37274g1;
    public final Paint h;
    public li0 f37275h0;
    public boolean f37276h1;
    public final Rect f37277i0;
    public boolean f37278i1;
    public final Drawable f37279j0;
    public Paint f37280j1;
    public final boolean f37281k0;
    public Matrix f37282k1;
    public final org.telegram.ui.ActionBar.e6 f37283l0;
    public LinearGradient l1;
    public ch.p0 m0;
    public final Paint f37284n;
    public int f37285n0;
    public float f37286o0;
    public float f37287p0;
    public float f37288q0;
    public float f37289r;
    public float f37290r0;
    public float f37291s;
    public boolean f37292s0;
    public long f37293t0;
    public org.telegram.ui.ActionBar.e2 f37294u0;
    public ug.a1 f37295v0;
    public float f37296w;
    public gr f37297w0;
    public final RectF f37298x;
    public float f37299x0;
    public final Path f37300y;
    public ch.b0 f37301y0;
    public ValueAnimator f37302z0;

    public mi0(int i7, int i10, Context context, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        this.f37256a = false;
        this.d = new ArrayList();
        this.f37267e = new ArrayList();
        Paint paint = new Paint(1);
        this.f37270f = paint;
        this.h = new Paint(1);
        this.f37284n = new Paint(1);
        this.f37296w = 1.0f;
        this.f37298x = new RectF();
        this.f37300y = new Path();
        this.E = org.telegram.messenger.g0.L(72.0f);
        float L = org.telegram.messenger.g0.L(8.0f);
        this.F = L;
        this.G = L / 2.0f;
        this.H = org.telegram.messenger.g0.L(36.0f);
        this.U = new ArrayList(20);
        this.V = new ArrayList(10);
        this.W = new ArrayList(20);
        this.f37263c0 = new RectF();
        this.f37265d0 = false;
        this.f37268e0 = new HashSet();
        this.f37271f0 = new HashSet();
        this.f37273g0 = new int[2];
        Rect rect = new Rect();
        this.f37277i0 = rect;
        new ArrayList();
        this.D0 = new HashSet();
        this.E0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.I0 = paint2;
        Paint paint3 = new Paint(1);
        this.J0 = paint3;
        this.M0 = new h2.f((int[]) null);
        this.P0 = true;
        this.f37276h1 = false;
        this.N0 = i7;
        this.f37262c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var));
        paint3.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ak, e6Var));
        this.f37283l0 = e6Var;
        this.K = i10;
        this.f37294u0 = e2Var;
        ki0 ki0Var = new ki0(this, context);
        this.A0 = ki0Var;
        ki0Var.setVisibility(8);
        ki0Var.P = false;
        ki0Var.f36526c.setVisibility(8);
        addView(ki0Var);
        if (org.telegram.messenger.gz.c() && org.telegram.messenger.gz.o() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37281k0 = z10;
        Drawable mutate = context.getDrawable(2131232674).mutate();
        this.f37279j0 = mutate;
        int L2 = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.Ke, null, PorterDuff.Mode.MULTIPLY);
        di.c1 c1Var = new di.c1(22, context, this);
        this.f37259b = c1Var;
        c1Var.setClipChildren(false);
        c1Var.setClipToPadding(false);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, 4);
        this.f37257a0 = i0Var;
        c1Var.i(new yh0(this, 0));
        c1Var.setLayoutManager(i0Var);
        c1Var.setOverScrollMode(2);
        ci0 ci0Var = new ci0(this, 0);
        this.f37260b0 = ci0Var;
        c1Var.setAdapter(ci0Var);
        c1Var.j(new gi0(this));
        c1Var.j(new ri(this, 14));
        c1Var.i(new yh0(this, 1));
        c1Var.setOnItemClickListener(new j(this, 11));
        c1Var.setOnItemLongClickListener((ij0) new ai.r1(this, i7, 11));
        addView(c1Var, c8.ja.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (c1Var.getLayoutParams().height - c1Var.getPaddingTop()) - c1Var.getPaddingBottom();
        ki0Var.getLayoutParams().width = paddingTop - org.telegram.messenger.g0.L(12.0f);
        ki0Var.getLayoutParams().height = paddingTop;
        if (i7 != 2 && i7 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, e6Var));
        } else {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        }
        org.telegram.messenger.si.b0(i10).k1();
    }

    public static void a(mi0 mi0Var) {
        if (mi0Var.f37301y0 != null) {
            return;
        }
        ch.b0 b0Var = new ch.b0(mi0Var.N0, mi0Var.f37294u0, mi0Var.W, mi0Var.f37268e0, mi0Var, mi0Var.f37283l0, mi0Var.f37256a);
        mi0Var.f37301y0 = b0Var;
        dh.c cVar = mi0Var.f37258a1;
        boolean z10 = true;
        if (cVar != null) {
            gh.e eVar = mi0Var.f37261b1;
            org.telegram.ui.f01 f01Var = b0Var.f5018m.f49382g0;
            f01Var.f46963y = true;
            f01Var.setBackground(null);
            f01Var.updateColors();
            f01Var.invalidate();
            fh.g c10 = cVar.c(b0Var.f5008a, null, true);
            c10.p(eVar);
            org.telegram.messenger.i20.r(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
            b0Var.f5030z = c10;
        }
        ch.b0 b0Var2 = mi0Var.f37301y0;
        li0 li0Var = mi0Var.f37275h0;
        if (li0Var != null && !li0Var.r()) {
            z10 = false;
        }
        b0Var2.f5018m.setLongPressEnabled(z10);
        mi0Var.j();
        mi0Var.f37301y0.f5021p = new wa0(mi0Var, 13);
        mi0Var.m();
    }

    public static void b(mi0 mi0Var, View view, float f10) {
        if (view instanceof ki0) {
            ((ki0) view).h = f10;
            return;
        }
        view.setScaleX(f10);
        view.setScaleY(f10);
    }

    public static boolean c() {
        return org.telegram.messenger.gz.j();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z10 = true;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
            hashSet.clear();
            if (gjVar != null && (tL_messageReactions = gjVar.f23817k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < gjVar.f23817k.reactions.results.size(); i10++) {
                    if (gjVar.f23817k.reactions.results.get(i10).chosen) {
                        ch.p0 d = ch.p0.d(gjVar.f23817k.reactions.results.get(i10).reaction);
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
            i7++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            if (longSparseArray.valueAt(i12) != null) {
                hashSet2.add((ch.p0) longSparseArray.valueAt(i12));
            }
        }
        return hashSet2;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28922h5));
    }

    public final void d(boolean z10) {
        ch.b0 b0Var = this.f37301y0;
        if (b0Var != null) {
            if (!b0Var.f5022q || !z10) {
                b0Var.f5022q = true;
                if (!z10) {
                    b0Var.f();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ch.t(b0Var, 0));
                    ofFloat.addListener(new ch.z(b0Var, 0));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                }
            }
            this.f37301y0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28052id == this.L && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.I, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i7 == org.telegram.messenger.ns.f25514i4) {
            if (this.N0 == 4) {
                invalidate();
                di.c1 c1Var = this.f37259b;
                c1Var.invalidate();
                c1Var.g1();
                for (int i11 = 0; i11 < c1Var.getChildCount(); i11++) {
                    View childAt = c1Var.getChildAt(i11);
                    if (childAt instanceof ki0) {
                        ki0 ki0Var = (ki0) childAt;
                        ki0Var.f36524a.invalidate();
                        ki0Var.f36525b.invalidate();
                    } else {
                        childAt.invalidate();
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25583u3) {
            p(this.I, null, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        ch.b0 b0Var = this.f37301y0;
        if (b0Var != null) {
            b0Var.d();
        }
    }

    public final void f(float f10, float f11, float f12, int i7, Canvas canvas) {
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
        RectF rectF = this.f37298x;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (org.telegram.messenger.g0.T1(rectF.top, getMeasuredHeight(), er.f34420f.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.f37296w) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f15 = rectF.bottom;
            er erVar = er.f34420f;
            canvas.clipRect(0.0f, (org.telegram.messenger.g0.T1(f15, 0.0f, erVar.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.f37296w) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), erVar.getInterpolation(this.P)));
        }
        if (!org.telegram.messenger.hd.f24101a0 && !this.N) {
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
        Drawable drawable = this.f37279j0;
        drawable.setAlpha(i7);
        Paint paint = this.f37270f;
        paint.setAlpha(i7);
        float f17 = f16 - f10;
        float f18 = L;
        float f19 = f18 * f11;
        float f20 = height - f10;
        float f21 = f16 + f10;
        float f22 = height + f10;
        drawable.setBounds((int) (f17 - f19), (int) (f20 - f19), (int) (f21 + f19), (int) (f19 + f22));
        drawable.draw(canvas);
        boolean L2 = this.f37275h0.L();
        float f23 = height;
        RectF rectF2 = this.f37263c0;
        if (L2) {
            rectF2.set(f17, f20, f21, f22);
            f13 = f10;
            this.f37275h0.J(canvas, rectF2, f13, getX(), getY(), i7, false);
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
        boolean z11 = org.telegram.messenger.hd.f24101a0;
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
        float T1 = org.telegram.messenger.g0.T1(height2, (f26 + f18) - g(), er.f34420f.getInterpolation(this.P));
        float f27 = (-org.telegram.messenger.g0.L(1.0f)) * f11;
        drawable.setBounds((int) ((f25 - f13) - f27), (int) ((T1 - f13) - f27), (int) (f25 + f13 + f27), (int) (f13 + T1 + f27));
        drawable.draw(canvas);
        if (this.f37275h0.L()) {
            rectF2.set(f25 - f12, T1 - f12, f25 + f12, T1 + f12);
            this.f37275h0.J(canvas, rectF2, f12, getX(), getY(), i7, false);
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

    public li0 getDelegate() {
        return this.f37275h0;
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

    public ch.b0 getReactionsWindow() {
        return this.f37301y0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e10;
        HashSet hashSet = this.f37268e0;
        if (hashSet.isEmpty()) {
            return "";
        }
        ch.p0 p0Var = (ch.p0) hashSet.iterator().next();
        long j3 = p0Var.f5189g;
        String str = null;
        if (j3 != 0 && (e10 = g5.e(this.K, j3)) != null) {
            str = org.telegram.messenger.gj.V(e10, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = p0Var.f5188f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<ch.p0> getSelectedReactions() {
        return this.f37268e0;
    }

    public float getTopOffset() {
        if (this.R0) {
            return ((FrameLayout.LayoutParams) this.f37259b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (!q()) {
            return org.telegram.messenger.g0.L(16.0f) + com.google.android.gms.internal.vision.e2.v(itemsCount, 1, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(36.0f) * itemsCount);
        }
        return (org.telegram.messenger.g0.L(36.0f) * itemsCount) - org.telegram.messenger.g0.L(4.0f);
    }

    public List<ch.p0> getVisibleReactionsList() {
        return this.U;
    }

    public int getWindowType() {
        int i7 = this.N0;
        if (i7 == 4) {
            return 13;
        }
        if (i7 == 3) {
            return 11;
        }
        if (i7 == 5) {
            return 14;
        }
        if (this.G0) {
            return 8;
        }
        return 1;
    }

    public View getWindowView() {
        ch.b0 b0Var = this.f37301y0;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f5010c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList arrayList2;
        HashSet hashSet = new HashSet();
        int i7 = 0;
        int i10 = this.N0;
        if (i10 == 4) {
            Iterator it = this.f37268e0.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                ch.p0 p0Var = (ch.p0) it.next();
                if (!hashSet.contains(p0Var)) {
                    hashSet.add(p0Var);
                    arrayList.add(p0Var);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList3 = org.telegram.messenger.si.b0(this.K).f26487n;
            while (i7 < arrayList3.size()) {
                ch.p0 c10 = ch.p0.c((TLRPC.TL_availableReaction) arrayList3.get(i7));
                if (!hashSet.contains(c10)) {
                    hashSet.add(c10);
                    arrayList.add(c10);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
                i7++;
            }
        } else if (this.F0 && i10 != 4) {
            if (i10 == 5) {
                TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.np.s1(this.K).E0();
                if (E0 != null) {
                    while (i7 < E0.effects.size()) {
                        ch.p0 e10 = ch.p0.e(E0.effects.get(i7));
                        if (!hashSet.contains(e10)) {
                            hashSet.add(e10);
                            arrayList.add(e10);
                        }
                        i7++;
                    }
                    return;
                }
                return;
            }
            if (i10 == 3) {
                arrayList2 = org.telegram.messenger.si.b0(this.K).F1;
            } else {
                arrayList2 = org.telegram.messenger.si.b0(this.K).E1;
            }
            if (i10 == 3) {
                TLRPC.TL_messages_savedReactionsTags I1 = org.telegram.messenger.np.s1(this.K).I1(0L, false);
                if (I1 != null) {
                    for (int i12 = 0; i12 < I1.tags.size(); i12++) {
                        ch.p0 d = ch.p0.d(I1.tags.get(i12).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ch.p0 d2 = ch.p0.d((TLRPC.Reaction) arrayList2.get(i13));
                    if (!hashSet.contains(d2)) {
                        hashSet.add(d2);
                        arrayList.add(d2);
                    }
                }
            } else {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ch.p0 d10 = ch.p0.d((TLRPC.Reaction) arrayList2.get(i14));
                    if (!hashSet.contains(d10) && (i10 == 3 || org.telegram.messenger.m10.i(this.K).q() || d10.f5189g == 0)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            }
            if (i10 != 3 || org.telegram.messenger.m10.i(this.K).q()) {
                ArrayList arrayList4 = org.telegram.messenger.si.b0(this.K).D1;
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    ch.p0 d11 = ch.p0.d((TLRPC.Reaction) arrayList4.get(i15));
                    if (!hashSet.contains(d11)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
                ArrayList arrayList5 = org.telegram.messenger.si.b0(this.K).f26487n;
                while (i7 < arrayList5.size()) {
                    ch.p0 c11 = ch.p0.c((TLRPC.TL_availableReaction) arrayList5.get(i7));
                    if (!hashSet.contains(c11)) {
                        hashSet.add(c11);
                        arrayList.add(c11);
                    }
                    i7++;
                }
            }
        } else if (i10 == 3) {
            ArrayList arrayList6 = org.telegram.messenger.si.b0(this.K).F1;
            int i16 = 0;
            while (i7 < arrayList6.size()) {
                ch.p0 d12 = ch.p0.d((TLRPC.Reaction) arrayList6.get(i7));
                if (!hashSet.contains(d12)) {
                    hashSet.add(d12);
                    arrayList.add(d12);
                    i16++;
                }
                if (i16 != 16) {
                    i7++;
                } else {
                    return;
                }
            }
        } else {
            ArrayList arrayList7 = org.telegram.messenger.si.b0(this.K).f26487n;
            while (i7 < arrayList7.size()) {
                arrayList.add(ch.p0.c((TLRPC.TL_availableReaction) arrayList7.get(i7)));
                i7++;
            }
        }
    }

    public void j() {
        int i7 = 0;
        while (true) {
            di.c1 c1Var = this.f37259b;
            if (i7 < c1Var.getChildCount()) {
                View childAt = c1Var.getChildAt(i7);
                if (childAt instanceof ki0) {
                    ((ki0) childAt).f36525b.invalidate();
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int L = org.telegram.messenger.g0.L(24.0f);
        float height = getHeight() / 2.0f;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false);
        this.f37264c1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, x02, 0, tileMode));
        this.f37284n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ch.p0 p0Var, boolean z10) {
        li0 li0Var = this.f37275h0;
        if (li0Var != null) {
            li0Var.h(view, p0Var, z10, true);
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
        this.f37285n0 = 0;
        this.f37286o0 = 0.0f;
        this.C0 = 0.0f;
        this.m0 = null;
        this.f37292s0 = false;
        xh0 xh0Var = new xh0(this, 1);
        di.c1 c1Var = this.f37259b;
        org.telegram.messenger.g0.d0(c1Var, xh0Var);
        this.D0.clear();
        c1Var.invalidate();
        ai.j0 j0Var = this.T;
        if (j0Var != null) {
            j0Var.invalidate();
        }
        invalidate();
    }

    public final void o(dh.c cVar, gh.e eVar) {
        this.f37258a1 = cVar;
        this.f37261b1 = eVar;
        fh.g c10 = cVar.c(this, null, true);
        c10.p(eVar);
        org.telegram.messenger.i20.r(c10, org.telegram.messenger.g0.L(24.0f), 8.0f);
        this.X0 = c10;
        fh.g c11 = cVar.c(this, null, true);
        c11.p(eVar);
        org.telegram.messenger.i20.r(c11, org.telegram.messenger.g0.L(8.0f), 8.0f);
        this.Y0 = c11;
        fh.g c12 = cVar.c(this, null, true);
        c12.p(eVar);
        org.telegram.messenger.i20.r(c12, org.telegram.messenger.g0.L(4.0f), 8.0f);
        this.Z0 = c12;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25514i4);
        org.telegram.messenger.ns.f(this.K).c(this, org.telegram.messenger.ns.T);
        if (this.N0 == 5) {
            org.telegram.messenger.ns.f(this.K).c(this, org.telegram.messenger.ns.f25583u3);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
        org.telegram.messenger.ns.f(this.K).n(this, org.telegram.messenger.ns.T);
        if (this.N0 == 5) {
            org.telegram.messenger.ns.f(this.K).n(this, org.telegram.messenger.ns.f25583u3);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        k();
    }

    public final void p(org.telegram.messenger.gj gjVar, TLRPC.ChatFull chatFull, boolean z10) {
        int i7;
        boolean z11;
        boolean z12;
        TLRPC.ChatFull chatFull2;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i10;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.I = gjVar;
        if (gjVar != null && (message = gjVar.f23817k) != null && (tL_messageReactions2 = message.reactions) != null) {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i7 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i11);
                i11++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i7++;
                }
            }
        } else {
            i7 = 0;
        }
        int i12 = this.N0;
        if (i12 == 0 && this.I != null && i7 >= org.telegram.messenger.np.s1(this.K).O0(org.telegram.messenger.gj.B0(this.I.f23817k))) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.J = z11;
        if (i12 == 0 && this.I != null && org.telegram.messenger.t3.V(org.telegram.messenger.np.s1(this.K).M0(Long.valueOf(-org.telegram.messenger.gj.B0(this.I.f23817k))))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.B0 = z12;
        ArrayList arrayList2 = new ArrayList();
        if (gjVar != null && gjVar.k3()) {
            chatFull2 = org.telegram.messenger.np.s1(this.K).N0(-gjVar.Z0());
            if (chatFull2 == null) {
                this.L = -gjVar.Z0();
                org.telegram.messenger.np.s1(this.K).V2(0, -gjVar.Z0(), true);
                setVisibility(4);
                return;
            }
        } else {
            chatFull2 = chatFull;
        }
        this.f37265d0 = false;
        if (i12 == 3) {
            this.F0 = org.telegram.messenger.m10.i(this.K).q();
            h(arrayList2);
        } else if (i12 == 5) {
            this.F0 = true;
            h(arrayList2);
        } else if (this.J) {
            this.F0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.f37265d0 = true;
                ?? obj = new Object();
                obj.f5184a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.I.f23817k.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(ch.p0.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.f37265d0 = true;
                ?? obj2 = new Object();
                obj2.f5184a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.K).M0(Long.valueOf(chatFull2.f28052id));
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
                    ArrayList arrayList5 = org.telegram.messenger.si.b0(this.K).f26487n;
                    int size4 = arrayList5.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 < size4) {
                            Object obj3 = arrayList5.get(i15);
                            i15++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj3;
                            if ((reaction2 instanceof TLRPC.TL_reactionEmoji) && tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                arrayList2.add(ch.p0.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(ch.p0.d(reaction2));
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
                hashSet.add((ch.p0) arrayList2.get(i16));
            }
            i16++;
        }
        if (!this.J && ((!this.F0 && arrayList2.size() > 16) || (this.F0 && !org.telegram.messenger.m10.i(this.K).q() && org.telegram.messenger.np.s1(this.K).D3()))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.G0 = z13;
        if (i12 == 3 && !org.telegram.messenger.m10.i(this.K).q()) {
            this.G0 = false;
        }
        if (i12 == 4) {
            this.G0 = true;
        }
        ArrayList arrayList6 = this.U;
        arrayList6.clear();
        if (q()) {
            int L = (org.telegram.messenger.g0.f23609q.x - org.telegram.messenger.g0.L(36.0f)) / org.telegram.messenger.g0.L(34.0f);
            if (L > 7) {
                L = 7;
            }
            int i17 = 0;
            if (L < 1) {
                L = 1;
            }
            while (i17 < Math.min(arrayList2.size(), L)) {
                arrayList6.add((ch.p0) arrayList2.get(i17));
                i17++;
            }
            if (i17 < arrayList2.size()) {
                ki0.a(this.A0, (ch.p0) arrayList2.get(i17), -1);
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.H0 = true;
        for (int i18 = 0; i18 < arrayList6.size(); i18++) {
            if (((ch.p0) arrayList6.get(i18)).f5189g != 0) {
                this.H0 = false;
            }
        }
        ArrayList arrayList7 = this.W;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < org.telegram.messenger.g0.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        ci0 ci0Var = this.f37260b0;
        mi0 mi0Var = (mi0) ci0Var.f33611e;
        ArrayList arrayList8 = mi0Var.f37267e;
        ArrayList arrayList9 = mi0Var.U;
        ArrayList arrayList10 = mi0Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i19 = 0; i19 < arrayList9.size(); i19++) {
            ch.p0 p0Var = (ch.p0) arrayList9.get(i19);
            if (p0Var.f5188f == null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            arrayList10.add(new di0(i10, p0Var));
        }
        if (!mi0Var.V.isEmpty() && !org.telegram.messenger.np.s1(mi0Var.K).D3()) {
            arrayList10.add(new di0(1, null));
        }
        if (mi0Var.q()) {
            arrayList10.add(new di0(2, null));
        }
        if (z10) {
            ci0Var.E(arrayList8, arrayList10);
        } else {
            ci0Var.f();
        }
        if (gjVar != null && (tL_messageReactions = gjVar.f23817k.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < gjVar.f23817k.reactions.results.size(); i20++) {
                if (gjVar.f23817k.reactions.results.get(i20).chosen) {
                    this.f37268e0.add(ch.p0.d(gjVar.f23817k.reactions.results.get(i20).reaction));
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
        boolean j3 = org.telegram.messenger.gz.j();
        org.telegram.ui.Cells.g1 g1Var = f37255m1;
        if (j3) {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new zh0(this, 0));
        duration.start();
    }

    @Override
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.D0.clear();
            int i7 = 0;
            while (true) {
                di.c1 c1Var = this.f37259b;
                if (i7 >= c1Var.getChildCount()) {
                    break;
                }
                if (c1Var.getChildAt(i7) instanceof ki0) {
                    ((ki0) c1Var.getChildAt(i7)).d();
                }
                i7++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.V0 = f10;
    }

    public void setChatScrimView(lo loVar) {
        this.f37272f1 = loVar;
    }

    public void setCurrentAccount(int i7) {
        this.K = i7;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.f37299x0 = f10;
        lo loVar = this.f37272f1;
        if (loVar != null) {
            loVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            gr grVar = this.f37297w0;
            int L = org.telegram.messenger.g0.L(28.0f);
            int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.ActionBar.q6.Q(grVar, org.telegram.ui.ActionBar.j6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i7, false), 40)), null, org.telegram.ui.ActionBar.q6.g(i7, 40), null);
            return;
        }
        this.f37297w0.setBackground(null);
    }

    public void setDelegate(li0 li0Var) {
        this.f37275h0 = li0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.O = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.e2 e2Var) {
        this.f37294u0 = e2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.R0 = true;
        if (this.S0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.e6 e6Var = this.f37283l0;
            z70 z70Var = new z70(context, e6Var);
            this.S0 = z70Var;
            z70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.S0.setClickable(true);
            this.S0.setTextSize(1, 12.0f);
            int i7 = this.N0;
            if (i7 != 1 && i7 != 2 && i7 != 4) {
                org.telegram.ui.ActionBar.q6.U(this.S0, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
            } else {
                org.telegram.ui.ActionBar.q6.U(this.S0, org.telegram.ui.ActionBar.j6.G6, e6Var);
                this.S0.setAlpha(0.5f);
            }
            this.S0.setGravity(1);
            addView(this.S0, c8.ja.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.S0.setText(charSequence);
        this.f37274g1 = false;
        ((FrameLayout.LayoutParams) this.A0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((FrameLayout.LayoutParams) this.f37259b.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
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

    public void setParentLayout(lo loVar) {
        this.K0 = loVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f37268e0;
        hashSet.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = arrayList.get(i7);
            i7++;
            ch.p0 b10 = ch.p0.b(str);
            hashSet.add(b10);
            this.f37271f0.add(b10);
        }
        org.telegram.messenger.g0.d0(this.f37259b, new xh0(this, 0));
    }

    public void setSelectedReaction(ch.p0 p0Var) {
        HashSet hashSet = this.f37268e0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        this.f37260b0.f();
    }

    public void setSelectedReactionAnimated(ch.p0 p0Var) {
        HashSet hashSet = this.f37268e0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        org.telegram.messenger.g0.d0(this.f37259b, new xh0(this, 0));
    }

    public void setSelectedReactionInclusive(ch.p0 p0Var) {
        HashSet hashSet = this.f37268e0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        org.telegram.messenger.g0.d0(this.f37259b, new xh0(this, 0));
    }

    public void setSelectedReactions(ArrayList<org.telegram.messenger.gj> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f37268e0;
        hashSet.clear();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.gj gjVar = arrayList.get(i7);
            if (gjVar != null && (tL_messageReactions = gjVar.f23817k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < gjVar.f23817k.reactions.results.size(); i10++) {
                    if (gjVar.f23817k.reactions.results.get(i10).chosen) {
                        hashSet.add(ch.p0.d(gjVar.f23817k.reactions.results.get(i10).reaction));
                    }
                }
            }
        }
        this.f37260b0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<org.telegram.messenger.gj> arrayList) {
        HashSet hashSet = this.f37268e0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        org.telegram.messenger.g0.d0(this.f37259b, new xh0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.f37269e1 != z10) {
            this.f37269e1 = z10;
            if (!z10) {
                int i7 = 0;
                while (true) {
                    di.c1 c1Var = this.f37259b;
                    if (i7 >= c1Var.getChildCount()) {
                        break;
                    }
                    if (c1Var.getChildAt(i7) instanceof ki0) {
                        ki0 ki0Var = (ki0) c1Var.getChildAt(i7);
                        boolean z11 = ki0Var.f36530r;
                        ji0 ji0Var = ki0Var.f36525b;
                        if (z11 && (ji0Var.getImageReceiver().B() != null || ji0Var.getImageReceiver().m() != null)) {
                            ji0Var.setVisibility(0);
                            ki0Var.f36524a.setVisibility(4);
                            if (ki0Var.f36531s) {
                                ki0Var.f36532w = true;
                            }
                        }
                        ki0Var.invalidate();
                    }
                    i7++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f37268e0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ch.p0.d(reaction));
        }
        this.f37260b0.f();
    }

    public void setTop(boolean z10) {
        this.M = z10;
    }

    public void setTransitionProgress(float f10) {
        this.f37296w = f10;
        lo loVar = this.K0;
        if (loVar != null) {
            loVar.setReactionsTransitionProgress((this.L0 && org.telegram.messenger.gz.j()) ? 1.0f : 1.0f);
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
        Paint paint = this.f37270f;
        if (paint != null) {
            try {
                int i7 = this.N0;
                if (i7 != 2 && i7 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, this.f37283l0))) {
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
        ug.a1 a1Var = this.f37295v0;
        if (a1Var != null) {
            a1Var.setColor(i0.a.f(0.7f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.F8, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false)));
        }
        if (getWidth() > 0 && getHeight() > 0 && this.f37264c1 != org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false)) {
            k();
        }
    }

    public void m() {
    }
}
