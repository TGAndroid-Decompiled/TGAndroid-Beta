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
public class vi0 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public static final org.telegram.ui.Cells.g1 f40637m1 = new org.telegram.ui.Cells.g1(Float.class, "transitionProgress", 2);
    public final ti0 A0;
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
    public org.telegram.messenger.fj I;
    public final Paint I0;
    public boolean J;
    public final Paint J0;
    public int K;
    public so K0;
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
    public k80 S0;
    public ai.k0 T;
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
    public boolean f40638a;
    public final jg.i0 f40639a0;
    public dh.c f40640a1;
    public final di.b1 f40641b;
    public final li0 f40642b0;
    public gh.e f40643b1;
    public final float f40644c;
    public final RectF f40645c0;
    public int f40646c1;
    public final ArrayList d;
    public boolean f40647d0;
    public boolean f40648d1;
    public final ArrayList f40649e;
    public final HashSet f40650e0;
    public boolean f40651e1;
    public final Paint f40652f;
    public final HashSet f40653f0;
    public so f40654f1;
    public final int[] f40655g0;
    public boolean f40656g1;
    public final Paint h;
    public ui0 f40657h0;
    public boolean f40658h1;
    public final Rect f40659i0;
    public boolean f40660i1;
    public final Drawable f40661j0;
    public Paint f40662j1;
    public final boolean f40663k0;
    public Matrix f40664k1;
    public final org.telegram.ui.ActionBar.i6 f40665l0;
    public LinearGradient l1;
    public ch.p0 m0;
    public final Paint f40666n;
    public int f40667n0;
    public float f40668o0;
    public float f40669p0;
    public float f40670q0;
    public float f40671r;
    public float f40672r0;
    public float f40673s;
    public boolean f40674s0;
    public long f40675t0;
    public org.telegram.ui.ActionBar.h2 f40676u0;
    public ug.c1 f40677v0;
    public float f40678w;
    public nr f40679w0;
    public final RectF f40680x;
    public float f40681x0;
    public final Path f40682y;
    public ch.b0 f40683y0;
    public ValueAnimator f40684z0;

    public vi0(int i7, int i10, Context context, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        boolean z10;
        this.f40638a = false;
        this.d = new ArrayList();
        this.f40649e = new ArrayList();
        Paint paint = new Paint(1);
        this.f40652f = paint;
        this.h = new Paint(1);
        this.f40666n = new Paint(1);
        this.f40678w = 1.0f;
        this.f40680x = new RectF();
        this.f40682y = new Path();
        this.E = org.telegram.messenger.g0.L(72.0f);
        float L = org.telegram.messenger.g0.L(8.0f);
        this.F = L;
        this.G = L / 2.0f;
        this.H = org.telegram.messenger.g0.L(36.0f);
        this.U = new ArrayList(20);
        this.V = new ArrayList(10);
        this.W = new ArrayList(20);
        this.f40645c0 = new RectF();
        this.f40647d0 = false;
        this.f40650e0 = new HashSet();
        this.f40653f0 = new HashSet();
        this.f40655g0 = new int[2];
        Rect rect = new Rect();
        this.f40659i0 = rect;
        new ArrayList();
        this.D0 = new HashSet();
        this.E0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.I0 = paint2;
        Paint paint3 = new Paint(1);
        this.J0 = paint3;
        this.M0 = new h2.f((int[]) null);
        this.P0 = true;
        this.f40658h1 = false;
        this.N0 = i7;
        this.f40644c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29488i6, i6Var));
        paint3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ak, i6Var));
        this.f40665l0 = i6Var;
        this.K = i10;
        this.f40676u0 = h2Var;
        ti0 ti0Var = new ti0(this, context);
        this.A0 = ti0Var;
        ti0Var.setVisibility(8);
        ti0Var.P = false;
        ti0Var.f40011c.setVisibility(8);
        addView(ti0Var);
        if (org.telegram.messenger.bz.c() && org.telegram.messenger.bz.o() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40663k0 = z10;
        Drawable mutate = context.getDrawable(2131232675).mutate();
        this.f40661j0 = mutate;
        int L2 = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.Ke, null, PorterDuff.Mode.MULTIPLY);
        di.b1 b1Var = new di.b1(22, context, this);
        this.f40641b = b1Var;
        b1Var.setClipChildren(false);
        b1Var.setClipToPadding(false);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, 4);
        this.f40639a0 = i0Var;
        b1Var.i(new hi0(this, 0));
        b1Var.setLayoutManager(i0Var);
        b1Var.setOverScrollMode(2);
        li0 li0Var = new li0(this, 0);
        this.f40642b0 = li0Var;
        b1Var.setAdapter(li0Var);
        b1Var.j(new pi0(this));
        b1Var.j(new oa(this, 15));
        b1Var.i(new hi0(this, 1));
        b1Var.setOnItemClickListener(new n(this, 11));
        b1Var.setOnItemLongClickListener(new ai.s1(this, i7, 11));
        addView(b1Var, c8.ma.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (b1Var.getLayoutParams().height - b1Var.getPaddingTop()) - b1Var.getPaddingBottom();
        ti0Var.getLayoutParams().width = paddingTop - org.telegram.messenger.g0.L(12.0f);
        ti0Var.getLayoutParams().height = paddingTop;
        if (i7 != 2 && i7 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, i6Var));
        } else {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        }
        org.telegram.messenger.ri.d0(i10).n1();
    }

    public static void a(vi0 vi0Var) {
        if (vi0Var.f40683y0 != null) {
            return;
        }
        ch.b0 b0Var = new ch.b0(vi0Var.N0, vi0Var.f40676u0, vi0Var.W, vi0Var.f40650e0, vi0Var, vi0Var.f40665l0, vi0Var.f40638a);
        vi0Var.f40683y0 = b0Var;
        dh.c cVar = vi0Var.f40640a1;
        boolean z10 = true;
        if (cVar != null) {
            gh.e eVar = vi0Var.f40643b1;
            org.telegram.ui.j01 j01Var = b0Var.f5307m.f51434g0;
            j01Var.f48842y = true;
            j01Var.setBackground(null);
            j01Var.updateColors();
            j01Var.invalidate();
            fh.g c10 = cVar.c(b0Var.f5297a, null, true);
            c10.p(eVar);
            org.telegram.messenger.n10.s(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
            b0Var.f5319z = c10;
        }
        ch.b0 b0Var2 = vi0Var.f40683y0;
        ui0 ui0Var = vi0Var.f40657h0;
        if (ui0Var != null && !ui0Var.o()) {
            z10 = false;
        }
        b0Var2.f5307m.setLongPressEnabled(z10);
        vi0Var.j();
        vi0Var.f40683y0.f5310p = new gb0(vi0Var, 13);
        vi0Var.m();
    }

    public static void b(vi0 vi0Var, View view, float f10) {
        if (view instanceof ti0) {
            ((ti0) view).h = f10;
            return;
        }
        view.setScaleX(f10);
        view.setScaleY(f10);
    }

    public static boolean c() {
        return org.telegram.messenger.bz.j();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z10 = true;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
            hashSet.clear();
            if (fjVar != null && (tL_messageReactions = fjVar.f23968k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < fjVar.f23968k.reactions.results.size(); i10++) {
                    if (fjVar.f23968k.reactions.results.get(i10).chosen) {
                        ch.p0 d = ch.p0.d(fjVar.f23968k.reactions.results.get(i10).reaction);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29469h5));
    }

    public final void d(boolean z10) {
        ch.b0 b0Var = this.f40683y0;
        if (b0Var != null) {
            if (!b0Var.f5311q || !z10) {
                b0Var.f5311q = true;
                if (!z10) {
                    b0Var.f();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ch.u(b0Var, 0));
                    ofFloat.addListener(new ch.z(b0Var, 0));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                }
            }
            this.f40683y0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28406id == this.L && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.I, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i7 == org.telegram.messenger.ks.f25145k4) {
            if (this.N0 == 4) {
                invalidate();
                di.b1 b1Var = this.f40641b;
                b1Var.invalidate();
                b1Var.g1();
                for (int i11 = 0; i11 < b1Var.getChildCount(); i11++) {
                    View childAt = b1Var.getChildAt(i11);
                    if (childAt instanceof ti0) {
                        ti0 ti0Var = (ti0) childAt;
                        ti0Var.f40009a.invalidate();
                        ti0Var.f40010b.invalidate();
                    } else {
                        childAt.invalidate();
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25216w3) {
            p(this.I, null, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        ch.b0 b0Var = this.f40683y0;
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
        RectF rectF = this.f40680x;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (org.telegram.messenger.g0.T1(rectF.top, getMeasuredHeight(), lr.f37208f.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.f40678w) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f15 = rectF.bottom;
            lr lrVar = lr.f37208f;
            canvas.clipRect(0.0f, (org.telegram.messenger.g0.T1(f15, 0.0f, lrVar.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.f40678w) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), lrVar.getInterpolation(this.P)));
        }
        if (!org.telegram.messenger.gd.f24216a0 && !this.N) {
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
        Drawable drawable = this.f40661j0;
        drawable.setAlpha(i7);
        Paint paint = this.f40652f;
        paint.setAlpha(i7);
        float f17 = f16 - f10;
        float f18 = L;
        float f19 = f18 * f11;
        float f20 = height - f10;
        float f21 = f16 + f10;
        float f22 = height + f10;
        drawable.setBounds((int) (f17 - f19), (int) (f20 - f19), (int) (f21 + f19), (int) (f19 + f22));
        drawable.draw(canvas);
        boolean E = this.f40657h0.E();
        float f23 = height;
        RectF rectF2 = this.f40645c0;
        if (E) {
            rectF2.set(f17, f20, f21, f22);
            f13 = f10;
            this.f40657h0.x(canvas, rectF2, f13, getX(), getY(), i7, false);
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
        boolean z11 = org.telegram.messenger.gd.f24216a0;
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
        float T1 = org.telegram.messenger.g0.T1(height2, (f26 + f18) - g(), lr.f37208f.getInterpolation(this.P));
        float f27 = (-org.telegram.messenger.g0.L(1.0f)) * f11;
        drawable.setBounds((int) ((f25 - f13) - f27), (int) ((T1 - f13) - f27), (int) (f25 + f13 + f27), (int) (f13 + T1 + f27));
        drawable.draw(canvas);
        if (this.f40657h0.E()) {
            rectF2.set(f25 - f12, T1 - f12, f25 + f12, T1 + f12);
            this.f40657h0.x(canvas, rectF2, f12, getX(), getY(), i7, false);
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

    public ui0 getDelegate() {
        return this.f40657h0;
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
        return this.f40683y0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e10;
        HashSet hashSet = this.f40650e0;
        if (hashSet.isEmpty()) {
            return "";
        }
        ch.p0 p0Var = (ch.p0) hashSet.iterator().next();
        long j3 = p0Var.f5479g;
        String str = null;
        if (j3 != 0 && (e10 = o5.e(this.K, j3)) != null) {
            str = org.telegram.messenger.fj.V(e10, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = p0Var.f5478f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<ch.p0> getSelectedReactions() {
        return this.f40650e0;
    }

    public float getTopOffset() {
        if (this.R0) {
            return ((FrameLayout.LayoutParams) this.f40641b.getLayoutParams()).topMargin;
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
        ch.b0 b0Var = this.f40683y0;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f5299c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList arrayList2;
        HashSet hashSet = new HashSet();
        int i7 = 0;
        int i10 = this.N0;
        if (i10 == 4) {
            Iterator it = this.f40650e0.iterator();
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
            ArrayList arrayList3 = org.telegram.messenger.ri.d0(this.K).f26627n;
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
                TLRPC.messages_AvailableEffects G0 = org.telegram.messenger.mp.u1(this.K).G0();
                if (G0 != null) {
                    while (i7 < G0.effects.size()) {
                        ch.p0 e10 = ch.p0.e(G0.effects.get(i7));
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
                arrayList2 = org.telegram.messenger.ri.d0(this.K).H1;
            } else {
                arrayList2 = org.telegram.messenger.ri.d0(this.K).G1;
            }
            if (i10 == 3) {
                TLRPC.TL_messages_savedReactionsTags K1 = org.telegram.messenger.mp.u1(this.K).K1(0L, false);
                if (K1 != null) {
                    for (int i12 = 0; i12 < K1.tags.size(); i12++) {
                        ch.p0 d = ch.p0.d(K1.tags.get(i12).reaction);
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
                    if (!hashSet.contains(d10) && (i10 == 3 || org.telegram.messenger.j10.i(this.K).q() || d10.f5479g == 0)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            }
            if (i10 != 3 || org.telegram.messenger.j10.i(this.K).q()) {
                ArrayList arrayList4 = org.telegram.messenger.ri.d0(this.K).F1;
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    ch.p0 d11 = ch.p0.d((TLRPC.Reaction) arrayList4.get(i15));
                    if (!hashSet.contains(d11)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
                ArrayList arrayList5 = org.telegram.messenger.ri.d0(this.K).f26627n;
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
            ArrayList arrayList6 = org.telegram.messenger.ri.d0(this.K).H1;
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
            ArrayList arrayList7 = org.telegram.messenger.ri.d0(this.K).f26627n;
            while (i7 < arrayList7.size()) {
                arrayList.add(ch.p0.c((TLRPC.TL_availableReaction) arrayList7.get(i7)));
                i7++;
            }
        }
    }

    public void j() {
        int i7 = 0;
        while (true) {
            di.b1 b1Var = this.f40641b;
            if (i7 < b1Var.getChildCount()) {
                View childAt = b1Var.getChildAt(i7);
                if (childAt instanceof ti0) {
                    ((ti0) childAt).f40010b.invalidate();
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
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false);
        this.f40646c1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, x02, 0, tileMode));
        this.f40666n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ch.p0 p0Var, boolean z10) {
        ui0 ui0Var = this.f40657h0;
        if (ui0Var != null) {
            ui0Var.g(view, p0Var, z10, true);
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
        this.f40667n0 = 0;
        this.f40668o0 = 0.0f;
        this.C0 = 0.0f;
        this.m0 = null;
        this.f40674s0 = false;
        gi0 gi0Var = new gi0(this, 1);
        di.b1 b1Var = this.f40641b;
        org.telegram.messenger.g0.d0(b1Var, gi0Var);
        this.D0.clear();
        b1Var.invalidate();
        ai.k0 k0Var = this.T;
        if (k0Var != null) {
            k0Var.invalidate();
        }
        invalidate();
    }

    public final void o(dh.c cVar, gh.e eVar) {
        this.f40640a1 = cVar;
        this.f40643b1 = eVar;
        fh.g c10 = cVar.c(this, null, true);
        c10.p(eVar);
        org.telegram.messenger.n10.s(c10, org.telegram.messenger.g0.L(24.0f), 8.0f);
        this.X0 = c10;
        fh.g c11 = cVar.c(this, null, true);
        c11.p(eVar);
        org.telegram.messenger.n10.s(c11, org.telegram.messenger.g0.L(8.0f), 8.0f);
        this.Y0 = c11;
        fh.g c12 = cVar.c(this, null, true);
        c12.p(eVar);
        org.telegram.messenger.n10.s(c12, org.telegram.messenger.g0.L(4.0f), 8.0f);
        this.Z0 = c12;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25145k4);
        org.telegram.messenger.ks.f(this.K).c(this, org.telegram.messenger.ks.T);
        if (this.N0 == 5) {
            org.telegram.messenger.ks.f(this.K).c(this, org.telegram.messenger.ks.f25216w3);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25145k4);
        org.telegram.messenger.ks.f(this.K).n(this, org.telegram.messenger.ks.T);
        if (this.N0 == 5) {
            org.telegram.messenger.ks.f(this.K).n(this, org.telegram.messenger.ks.f25216w3);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        k();
    }

    public final void p(org.telegram.messenger.fj fjVar, TLRPC.ChatFull chatFull, boolean z10) {
        int i7;
        boolean z11;
        boolean z12;
        TLRPC.ChatFull chatFull2;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i10;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.I = fjVar;
        if (fjVar != null && (message = fjVar.f23968k) != null && (tL_messageReactions2 = message.reactions) != null) {
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
        if (i12 == 0 && this.I != null && i7 >= org.telegram.messenger.mp.u1(this.K).Q0(org.telegram.messenger.fj.B0(this.I.f23968k))) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.J = z11;
        if (i12 == 0 && this.I != null && org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(this.K).O0(Long.valueOf(-org.telegram.messenger.fj.B0(this.I.f23968k))))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.B0 = z12;
        ArrayList arrayList2 = new ArrayList();
        if (fjVar != null && fjVar.k3()) {
            chatFull2 = org.telegram.messenger.mp.u1(this.K).P0(-fjVar.Z0());
            if (chatFull2 == null) {
                this.L = -fjVar.Z0();
                org.telegram.messenger.mp.u1(this.K).b3(0, -fjVar.Z0(), true);
                setVisibility(4);
                return;
            }
        } else {
            chatFull2 = chatFull;
        }
        this.f40647d0 = false;
        if (i12 == 3) {
            this.F0 = org.telegram.messenger.j10.i(this.K).q();
            h(arrayList2);
        } else if (i12 == 5) {
            this.F0 = true;
            h(arrayList2);
        } else if (this.J) {
            this.F0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.f40647d0 = true;
                ?? obj = new Object();
                obj.f5474a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.I.f23968k.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(ch.p0.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.f40647d0 = true;
                ?? obj2 = new Object();
                obj2.f5474a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.K).O0(Long.valueOf(chatFull2.f28406id));
                if (O0 != null && !org.telegram.messenger.v3.V(O0)) {
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
                    ArrayList arrayList5 = org.telegram.messenger.ri.d0(this.K).f26627n;
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
        if (!this.J && ((!this.F0 && arrayList2.size() > 16) || (this.F0 && !org.telegram.messenger.j10.i(this.K).q() && org.telegram.messenger.mp.u1(this.K).K3()))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.G0 = z13;
        if (i12 == 3 && !org.telegram.messenger.j10.i(this.K).q()) {
            this.G0 = false;
        }
        if (i12 == 4) {
            this.G0 = true;
        }
        ArrayList arrayList6 = this.U;
        arrayList6.clear();
        if (q()) {
            int L = (org.telegram.messenger.g0.f24121q.x - org.telegram.messenger.g0.L(36.0f)) / org.telegram.messenger.g0.L(34.0f);
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
                ti0.a(this.A0, (ch.p0) arrayList2.get(i17), -1);
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.H0 = true;
        for (int i18 = 0; i18 < arrayList6.size(); i18++) {
            if (((ch.p0) arrayList6.get(i18)).f5479g != 0) {
                this.H0 = false;
            }
        }
        ArrayList arrayList7 = this.W;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < org.telegram.messenger.g0.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        li0 li0Var = this.f40642b0;
        vi0 vi0Var = (vi0) li0Var.f37131e;
        ArrayList arrayList8 = vi0Var.f40649e;
        ArrayList arrayList9 = vi0Var.U;
        ArrayList arrayList10 = vi0Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i19 = 0; i19 < arrayList9.size(); i19++) {
            ch.p0 p0Var = (ch.p0) arrayList9.get(i19);
            if (p0Var.f5478f == null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            arrayList10.add(new mi0(i10, p0Var));
        }
        if (!vi0Var.V.isEmpty() && !org.telegram.messenger.mp.u1(vi0Var.K).K3()) {
            arrayList10.add(new mi0(1, null));
        }
        if (vi0Var.q()) {
            arrayList10.add(new mi0(2, null));
        }
        if (z10) {
            li0Var.E(arrayList8, arrayList10);
        } else {
            li0Var.f();
        }
        if (fjVar != null && (tL_messageReactions = fjVar.f23968k.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < fjVar.f23968k.reactions.results.size(); i20++) {
                if (fjVar.f23968k.reactions.results.get(i20).chosen) {
                    this.f40650e0.add(ch.p0.d(fjVar.f23968k.reactions.results.get(i20).reaction));
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
        boolean j3 = org.telegram.messenger.bz.j();
        org.telegram.ui.Cells.g1 g1Var = f40637m1;
        if (j3) {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new ii0(this, 0));
        duration.start();
    }

    @Override
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.D0.clear();
            int i7 = 0;
            while (true) {
                di.b1 b1Var = this.f40641b;
                if (i7 >= b1Var.getChildCount()) {
                    break;
                }
                if (b1Var.getChildAt(i7) instanceof ti0) {
                    ((ti0) b1Var.getChildAt(i7)).d();
                }
                i7++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.V0 = f10;
    }

    public void setChatScrimView(so soVar) {
        this.f40654f1 = soVar;
    }

    public void setCurrentAccount(int i7) {
        this.K = i7;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.f40681x0 = f10;
        so soVar = this.f40654f1;
        if (soVar != null) {
            soVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            nr nrVar = this.f40679w0;
            int L = org.telegram.messenger.g0.L(28.0f);
            int i7 = org.telegram.ui.ActionBar.n6.f29488i6;
            org.telegram.ui.ActionBar.u6.Q(nrVar, org.telegram.ui.ActionBar.n6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 40)), null, org.telegram.ui.ActionBar.u6.g(i7, 40), null);
            return;
        }
        this.f40679w0.setBackground(null);
    }

    public void setDelegate(ui0 ui0Var) {
        this.f40657h0 = ui0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.O = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.h2 h2Var) {
        this.f40676u0 = h2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.R0 = true;
        if (this.S0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.i6 i6Var = this.f40665l0;
            k80 k80Var = new k80(context, i6Var);
            this.S0 = k80Var;
            k80Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.S0.setClickable(true);
            this.S0.setTextSize(1, 12.0f);
            int i7 = this.N0;
            if (i7 != 1 && i7 != 2 && i7 != 4) {
                org.telegram.ui.ActionBar.u6.U(this.S0, org.telegram.ui.ActionBar.n6.f29807z6, i6Var);
            } else {
                org.telegram.ui.ActionBar.u6.U(this.S0, org.telegram.ui.ActionBar.n6.G6, i6Var);
                this.S0.setAlpha(0.5f);
            }
            this.S0.setGravity(1);
            addView(this.S0, c8.ma.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.S0.setText(charSequence);
        this.f40656g1 = false;
        ((FrameLayout.LayoutParams) this.A0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((FrameLayout.LayoutParams) this.f40641b.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
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

    public void setParentLayout(so soVar) {
        this.K0 = soVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f40650e0;
        hashSet.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = arrayList.get(i7);
            i7++;
            ch.p0 b10 = ch.p0.b(str);
            hashSet.add(b10);
            this.f40653f0.add(b10);
        }
        org.telegram.messenger.g0.d0(this.f40641b, new gi0(this, 0));
    }

    public void setSelectedReaction(ch.p0 p0Var) {
        HashSet hashSet = this.f40650e0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        this.f40642b0.f();
    }

    public void setSelectedReactionAnimated(ch.p0 p0Var) {
        HashSet hashSet = this.f40650e0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        org.telegram.messenger.g0.d0(this.f40641b, new gi0(this, 0));
    }

    public void setSelectedReactionInclusive(ch.p0 p0Var) {
        HashSet hashSet = this.f40650e0;
        hashSet.clear();
        if (p0Var != null) {
            hashSet.add(p0Var);
        }
        org.telegram.messenger.g0.d0(this.f40641b, new gi0(this, 0));
    }

    public void setSelectedReactions(ArrayList<org.telegram.messenger.fj> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f40650e0;
        hashSet.clear();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.fj fjVar = arrayList.get(i7);
            if (fjVar != null && (tL_messageReactions = fjVar.f23968k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < fjVar.f23968k.reactions.results.size(); i10++) {
                    if (fjVar.f23968k.reactions.results.get(i10).chosen) {
                        hashSet.add(ch.p0.d(fjVar.f23968k.reactions.results.get(i10).reaction));
                    }
                }
            }
        }
        this.f40642b0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<org.telegram.messenger.fj> arrayList) {
        HashSet hashSet = this.f40650e0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        org.telegram.messenger.g0.d0(this.f40641b, new gi0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.f40651e1 != z10) {
            this.f40651e1 = z10;
            if (!z10) {
                int i7 = 0;
                while (true) {
                    di.b1 b1Var = this.f40641b;
                    if (i7 >= b1Var.getChildCount()) {
                        break;
                    }
                    if (b1Var.getChildAt(i7) instanceof ti0) {
                        ti0 ti0Var = (ti0) b1Var.getChildAt(i7);
                        boolean z11 = ti0Var.f40015r;
                        si0 si0Var = ti0Var.f40010b;
                        if (z11 && (si0Var.getImageReceiver().B() != null || si0Var.getImageReceiver().m() != null)) {
                            si0Var.setVisibility(0);
                            ti0Var.f40009a.setVisibility(4);
                            if (ti0Var.f40016s) {
                                ti0Var.f40017w = true;
                            }
                        }
                        ti0Var.invalidate();
                    }
                    i7++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f40650e0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ch.p0.d(reaction));
        }
        this.f40642b0.f();
    }

    public void setTop(boolean z10) {
        this.M = z10;
    }

    public void setTransitionProgress(float f10) {
        this.f40678w = f10;
        so soVar = this.K0;
        if (soVar != null) {
            soVar.setReactionsTransitionProgress((this.L0 && org.telegram.messenger.bz.j()) ? 1.0f : 1.0f);
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
        Paint paint = this.f40652f;
        if (paint != null) {
            try {
                int i7 = this.N0;
                if (i7 != 2 && i7 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, this.f40665l0))) {
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
        ug.c1 c1Var = this.f40677v0;
        if (c1Var != null) {
            c1Var.setColor(i0.a.f(0.7f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.F8, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29469h5, false)));
        }
        if (getWidth() > 0 && getHeight() > 0 && this.f40646c1 != org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false)) {
            k();
        }
    }

    public void m() {
    }
}
