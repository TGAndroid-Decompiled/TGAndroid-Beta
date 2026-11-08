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
public class ii0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
    public static final org.telegram.ui.Cells.g1 l1 = new org.telegram.ui.Cells.g1(Float.class, "transitionProgress", 2);
    public boolean A0;
    public float B0;
    public final HashSet C0;
    public float D;
    public final HashSet D0;
    public final float E;
    public boolean E0;
    public final float F;
    public boolean F0;
    public int G;
    public boolean G0;
    public org.telegram.messenger.ij H;
    public final Paint H0;
    public boolean I;
    public final Paint I0;
    public int J;
    public bo J0;
    public long K;
    public boolean K0;
    public boolean L;
    public final h2.f L0;
    public boolean M;
    public final int M0;
    public boolean N;
    public boolean N0;
    public float O;
    public boolean O0;
    public long P;
    public Runnable P0;
    public ValueAnimator Q;
    public boolean Q0;
    public FrameLayout R;
    public w70 R0;
    public bi.x5 S;
    public int S0;
    public final ArrayList T;
    public int T0;
    public final ArrayList U;
    public float U0;
    public final ArrayList V;
    public float V0;
    public final jg.i0 W;
    public fh.g W0;
    public fh.g X0;
    public fh.g Y0;
    public dh.c Z0;
    public boolean f34679a;
    public final yh0 f34680a0;
    public gh.e f34681a1;
    public final bi.q1 f34682b;
    public final RectF f34683b0;
    public int f34684b1;
    public final float f34685c;
    public boolean f34686c0;
    public boolean f34687c1;
    public final ArrayList d;
    public final HashSet f34688d0;
    public boolean f34689d1;
    public final ArrayList f34690e;
    public final HashSet f34691e0;
    public bo f34692e1;
    public final Paint f34693f;
    public final int[] f34694f0;
    public boolean f34695f1;
    public hi0 f34696g0;
    public boolean f34697g1;
    public final Paint h;
    public final Rect f34698h0;
    public boolean f34699h1;
    public final Drawable f34700i0;
    public Paint f34701i1;
    public final boolean f34702j0;
    public Matrix f34703j1;
    public final org.telegram.ui.ActionBar.f6 f34704k0;
    public LinearGradient f34705k1;
    public ch.o0 f34706l0;
    public int m0;
    public final Paint f34707n;
    public float f34708n0;
    public float f34709o0;
    public float f34710p0;
    public float f34711q0;
    public float f34712r;
    public boolean f34713r0;
    public float f34714s;
    public long f34715s0;
    public org.telegram.ui.ActionBar.f2 f34716t0;
    public ug.z0 f34717u0;
    public zq f34718v0;
    public float f34719w;
    public float f34720w0;
    public final RectF f34721x;
    public ch.b0 f34722x0;
    public final Path f34723y;
    public ValueAnimator f34724y0;
    public final gi0 f34725z0;

    public ii0(int i7, int i10, Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z9;
        this.f34679a = false;
        this.d = new ArrayList();
        this.f34690e = new ArrayList();
        Paint paint = new Paint(1);
        this.f34693f = paint;
        this.h = new Paint(1);
        this.f34707n = new Paint(1);
        this.f34719w = 1.0f;
        this.f34721x = new RectF();
        this.f34723y = new Path();
        this.D = org.telegram.messenger.g0.L(72.0f);
        float L = org.telegram.messenger.g0.L(8.0f);
        this.E = L;
        this.F = L / 2.0f;
        this.G = org.telegram.messenger.g0.L(36.0f);
        this.T = new ArrayList(20);
        this.U = new ArrayList(10);
        this.V = new ArrayList(20);
        this.f34683b0 = new RectF();
        this.f34686c0 = false;
        this.f34688d0 = new HashSet();
        this.f34691e0 = new HashSet();
        this.f34694f0 = new int[2];
        Rect rect = new Rect();
        this.f34698h0 = rect;
        new ArrayList();
        this.C0 = new HashSet();
        this.D0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.H0 = paint2;
        Paint paint3 = new Paint(1);
        this.I0 = paint3;
        this.L0 = new h2.f((int[]) null);
        this.O0 = true;
        this.f34697g1 = false;
        this.M0 = i7;
        this.f34685c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27944i6, f6Var));
        paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xk, f6Var));
        this.f34704k0 = f6Var;
        this.J = i10;
        this.f34716t0 = f2Var;
        gi0 gi0Var = new gi0(this, context);
        this.f34725z0 = gi0Var;
        gi0Var.setVisibility(8);
        gi0Var.O = false;
        gi0Var.f33951c.setVisibility(8);
        addView(gi0Var);
        if (org.telegram.messenger.iz.c() && org.telegram.messenger.iz.o() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f34702j0 = z9;
        Drawable mutate = context.getDrawable(2131232673).mutate();
        this.f34700i0 = mutate;
        int L2 = org.telegram.messenger.g0.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.He, null, PorterDuff.Mode.MULTIPLY);
        bi.q1 q1Var = new bi.q1(22, context, this);
        this.f34682b = q1Var;
        q1Var.setClipChildren(false);
        q1Var.setClipToPadding(false);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, 4);
        this.W = i0Var;
        q1Var.i(new uh0(this, 0));
        q1Var.setLayoutManager(i0Var);
        q1Var.setOverScrollMode(2);
        yh0 yh0Var = new yh0(this, 0);
        this.f34680a0 = yh0Var;
        q1Var.setAdapter(yh0Var);
        q1Var.j(new ci0(this));
        q1Var.j(new ui(this, 12));
        q1Var.i(new uh0(this, 1));
        q1Var.setOnItemClickListener(new k(this, 11));
        q1Var.setOnItemLongClickListener((dj0) new l2.q(this, i7, 8));
        addView(q1Var, c8.ha.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (q1Var.getLayoutParams().height - q1Var.getPaddingTop()) - q1Var.getPaddingBottom();
        gi0Var.getLayoutParams().width = paddingTop - org.telegram.messenger.g0.L(12.0f);
        gi0Var.getLayoutParams().height = paddingTop;
        if (i7 != 2 && i7 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, f6Var));
        } else {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        }
        org.telegram.messenger.ui.b0(i10).k1();
    }

    public static void a(ii0 ii0Var) {
        if (ii0Var.f34722x0 != null) {
            return;
        }
        ch.b0 b0Var = new ch.b0(ii0Var.M0, ii0Var.f34716t0, ii0Var.V, ii0Var.f34688d0, ii0Var, ii0Var.f34704k0, ii0Var.f34679a);
        ii0Var.f34722x0 = b0Var;
        dh.c cVar = ii0Var.Z0;
        boolean z9 = true;
        if (cVar != null) {
            gh.e eVar = ii0Var.f34681a1;
            org.telegram.ui.i01 i01Var = b0Var.f6193m.f49033f0;
            i01Var.f46545y = true;
            i01Var.setBackground(null);
            i01Var.updateColors();
            i01Var.invalidate();
            fh.g c10 = cVar.c(b0Var.f6183a, null, true);
            c10.p(eVar);
            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
            b0Var.f6205z = c10;
        }
        ch.b0 b0Var2 = ii0Var.f34722x0;
        hi0 hi0Var = ii0Var.f34696g0;
        if (hi0Var != null && !hi0Var.v()) {
            z9 = false;
        }
        b0Var2.f6193m.setLongPressEnabled(z9);
        ii0Var.j();
        ii0Var.f34722x0.f6196p = new ob0(ii0Var, 11);
        ii0Var.m();
    }

    public static void b(ii0 ii0Var, View view, float f10) {
        if (view instanceof gi0) {
            ((gi0) view).h = f10;
            return;
        }
        view.setScaleX(f10);
        view.setScaleY(f10);
    }

    public static boolean c() {
        return org.telegram.messenger.iz.j();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z9 = true;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
            hashSet.clear();
            if (ijVar != null && (tL_messageReactions = ijVar.f23262k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < ijVar.f23262k.reactions.results.size(); i10++) {
                    if (ijVar.f23262k.reactions.results.get(i10).chosen) {
                        ch.o0 d = ch.o0.d(ijVar.f23262k.reactions.results.get(i10).reaction);
                        if (z9 || longSparseArray.indexOfKey(d.h) >= 0) {
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
            z9 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            if (longSparseArray.valueAt(i12) != null) {
                hashSet2.add((ch.o0) longSparseArray.valueAt(i12));
            }
        }
        return hashSet2;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27925h5));
    }

    public final void d(boolean z9) {
        ch.b0 b0Var = this.f34722x0;
        if (b0Var != null) {
            if (!b0Var.f6197q || !z9) {
                b0Var.f6197q = true;
                if (!z9) {
                    b0Var.f();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ch.t(b0Var, 0));
                    ofFloat.addListener(new ch.z(b0Var, 0));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                }
            }
            this.f34722x0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f26957id == this.K && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.H, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i7 == org.telegram.messenger.qs.f25018i4) {
            if (this.M0 == 4) {
                invalidate();
                bi.q1 q1Var = this.f34682b;
                q1Var.invalidate();
                q1Var.g1();
                for (int i11 = 0; i11 < q1Var.getChildCount(); i11++) {
                    View childAt = q1Var.getChildAt(i11);
                    if (childAt instanceof gi0) {
                        gi0 gi0Var = (gi0) childAt;
                        gi0Var.f33949a.invalidate();
                        gi0Var.f33950b.invalidate();
                    } else {
                        childAt.invalidate();
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25087u3) {
            p(this.H, null, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ii0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        ch.b0 b0Var = this.f34722x0;
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
        if (this.M0 == 1) {
            return;
        }
        canvas.save();
        boolean z9 = this.L;
        RectF rectF = this.f34721x;
        if (z9) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (org.telegram.messenger.g0.T1(rectF.top, getMeasuredHeight(), xq.f40366f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.f34719w) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f15 = rectF.bottom;
            xq xqVar = xq.f40366f;
            canvas.clipRect(0.0f, (org.telegram.messenger.g0.T1(f15, 0.0f, xqVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.f34719w) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), xqVar.getInterpolation(this.O)));
        }
        if (!org.telegram.messenger.id.f23157a0 && !this.M) {
            i10 = getWidth() - this.G;
        } else {
            i10 = this.G;
        }
        float f16 = i10 + this.U0;
        if (this.L) {
            height = getPaddingTop() - g();
        } else {
            height = (getHeight() - getPaddingBottom()) + g();
        }
        int L = org.telegram.messenger.g0.L(3.0f);
        Drawable drawable = this.f34700i0;
        drawable.setAlpha(i7);
        Paint paint = this.f34693f;
        paint.setAlpha(i7);
        float f17 = f16 - f10;
        float f18 = L;
        float f19 = f18 * f11;
        float f20 = height - f10;
        float f21 = f16 + f10;
        float f22 = height + f10;
        drawable.setBounds((int) (f17 - f19), (int) (f20 - f19), (int) (f21 + f19), (int) (f19 + f22));
        drawable.draw(canvas);
        boolean U = this.f34696g0.U();
        float f23 = height;
        RectF rectF2 = this.f34683b0;
        if (U) {
            rectF2.set(f17, f20, f21, f22);
            f13 = f10;
            this.f34696g0.L(canvas, rectF2, f13, getX(), getY(), i7, false);
        } else {
            f13 = f10;
            if (this.X0 != null) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(f17, f20, f21, f22);
                Rect rect = org.telegram.messenger.g0.Q;
                rectF3.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                this.X0.setBounds(rect);
                this.X0.setAlpha(paint.getAlpha());
                this.X0.draw(canvas);
            } else {
                canvas.drawCircle(f16, f23, f13, paint);
            }
        }
        boolean z10 = org.telegram.messenger.id.f23157a0;
        float f24 = this.E;
        if (!z10 && !this.M) {
            f14 = (getWidth() - this.G) + f24;
        } else {
            f14 = this.G - f24;
        }
        float f25 = this.U0 + this.V0 + f14;
        boolean z11 = this.L;
        float f26 = this.F;
        if (z11) {
            height2 = (getPaddingTop() - g()) - org.telegram.messenger.g0.L(16.0f);
        } else {
            height2 = ((getHeight() - f26) - f18) + g();
        }
        float T1 = org.telegram.messenger.g0.T1(height2, (f26 + f18) - g(), xq.f40366f.getInterpolation(this.O));
        float f27 = (-org.telegram.messenger.g0.L(1.0f)) * f11;
        drawable.setBounds((int) ((f25 - f13) - f27), (int) ((T1 - f13) - f27), (int) (f25 + f13 + f27), (int) (f13 + T1 + f27));
        drawable.draw(canvas);
        if (this.f34696g0.U()) {
            rectF2.set(f25 - f12, T1 - f12, f25 + f12, T1 + f12);
            this.f34696g0.L(canvas, rectF2, f12, getX(), getY(), i7, false);
        } else if (this.Y0 != null) {
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(f25 - f12, T1 - f12, f25 + f12, T1 + f12);
            Rect rect2 = org.telegram.messenger.g0.Q;
            rectF4.round(rect2);
            rect2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
            this.Y0.setBounds(rect2);
            this.Y0.setAlpha(paint.getAlpha());
            this.Y0.draw(canvas);
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

    public hi0 getDelegate() {
        return this.f34696g0;
    }

    public int getHintTextWidth() {
        return this.S0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.T.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.i(this.B0 / org.telegram.messenger.g0.L(42.0f), 2.0f, 0.0f);
    }

    public ch.b0 getReactionsWindow() {
        return this.f34722x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e10;
        HashSet hashSet = this.f34688d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        ch.o0 o0Var = (ch.o0) hashSet.iterator().next();
        long j3 = o0Var.f6357g;
        String str = null;
        if (j3 != 0 && (e10 = i5.e(this.J, j3)) != null) {
            str = org.telegram.messenger.ij.V(e10, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = o0Var.f6356f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<ch.o0> getSelectedReactions() {
        return this.f34688d0;
    }

    public float getTopOffset() {
        if (this.Q0) {
            return ((FrameLayout.LayoutParams) this.f34682b.getLayoutParams()).topMargin;
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

    public List<ch.o0> getVisibleReactionsList() {
        return this.T;
    }

    public int getWindowType() {
        int i7 = this.M0;
        if (i7 == 4) {
            return 13;
        }
        if (i7 == 3) {
            return 11;
        }
        if (i7 == 5) {
            return 14;
        }
        if (this.F0) {
            return 8;
        }
        return 1;
    }

    public View getWindowView() {
        ch.b0 b0Var = this.f34722x0;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f6185c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList arrayList2;
        HashSet hashSet = new HashSet();
        int i7 = 0;
        int i10 = this.M0;
        if (i10 == 4) {
            Iterator it = this.f34688d0.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                ch.o0 o0Var = (ch.o0) it.next();
                if (!hashSet.contains(o0Var)) {
                    hashSet.add(o0Var);
                    arrayList.add(o0Var);
                    i11++;
                    if (i11 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList3 = org.telegram.messenger.ui.b0(this.J).f25828n;
            while (i7 < arrayList3.size()) {
                ch.o0 c10 = ch.o0.c((TLRPC.TL_availableReaction) arrayList3.get(i7));
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
        } else if (this.E0 && i10 != 4) {
            if (i10 == 5) {
                TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.qp.s1(this.J).E0();
                if (E0 != null) {
                    while (i7 < E0.effects.size()) {
                        ch.o0 e10 = ch.o0.e(E0.effects.get(i7));
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
                arrayList2 = org.telegram.messenger.ui.b0(this.J).E1;
            } else {
                arrayList2 = org.telegram.messenger.ui.b0(this.J).D1;
            }
            if (i10 == 3) {
                TLRPC.TL_messages_savedReactionsTags I1 = org.telegram.messenger.qp.s1(this.J).I1(0L, false);
                if (I1 != null) {
                    for (int i12 = 0; i12 < I1.tags.size(); i12++) {
                        ch.o0 d = ch.o0.d(I1.tags.get(i12).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    ch.o0 d2 = ch.o0.d((TLRPC.Reaction) arrayList2.get(i13));
                    if (!hashSet.contains(d2)) {
                        hashSet.add(d2);
                        arrayList.add(d2);
                    }
                }
            } else {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    ch.o0 d10 = ch.o0.d((TLRPC.Reaction) arrayList2.get(i14));
                    if (!hashSet.contains(d10) && (i10 == 3 || org.telegram.messenger.p10.i(this.J).q() || d10.f6357g == 0)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            }
            if (i10 != 3 || org.telegram.messenger.p10.i(this.J).q()) {
                ArrayList arrayList4 = org.telegram.messenger.ui.b0(this.J).C1;
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    ch.o0 d11 = ch.o0.d((TLRPC.Reaction) arrayList4.get(i15));
                    if (!hashSet.contains(d11)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
                ArrayList arrayList5 = org.telegram.messenger.ui.b0(this.J).f25828n;
                while (i7 < arrayList5.size()) {
                    ch.o0 c11 = ch.o0.c((TLRPC.TL_availableReaction) arrayList5.get(i7));
                    if (!hashSet.contains(c11)) {
                        hashSet.add(c11);
                        arrayList.add(c11);
                    }
                    i7++;
                }
            }
        } else if (i10 == 3) {
            ArrayList arrayList6 = org.telegram.messenger.ui.b0(this.J).E1;
            int i16 = 0;
            while (i7 < arrayList6.size()) {
                ch.o0 d12 = ch.o0.d((TLRPC.Reaction) arrayList6.get(i7));
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
            ArrayList arrayList7 = org.telegram.messenger.ui.b0(this.J).f25828n;
            while (i7 < arrayList7.size()) {
                arrayList.add(ch.o0.c((TLRPC.TL_availableReaction) arrayList7.get(i7)));
                i7++;
            }
        }
    }

    public void j() {
        int i7 = 0;
        while (true) {
            bi.q1 q1Var = this.f34682b;
            if (i7 < q1Var.getChildCount()) {
                View childAt = q1Var.getChildAt(i7);
                if (childAt instanceof gi0) {
                    ((gi0) childAt).f33950b.invalidate();
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
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        this.f34684b1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, x02, 0, tileMode));
        this.f34707n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ch.o0 o0Var, boolean z9) {
        hi0 hi0Var = this.f34696g0;
        if (hi0Var != null) {
            hi0Var.i(view, o0Var, z9, true);
        }
        if (this.M0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.O0 = true;
        this.m0 = 0;
        this.f34708n0 = 0.0f;
        this.B0 = 0.0f;
        this.f34706l0 = null;
        this.f34713r0 = false;
        th0 th0Var = new th0(this, 1);
        bi.q1 q1Var = this.f34682b;
        org.telegram.messenger.g0.d0(q1Var, th0Var);
        this.C0.clear();
        q1Var.invalidate();
        bi.x5 x5Var = this.S;
        if (x5Var != null) {
            x5Var.invalidate();
        }
        invalidate();
    }

    public final void o(dh.c cVar, gh.e eVar) {
        this.Z0 = cVar;
        this.f34681a1 = eVar;
        fh.g c10 = cVar.c(this, null, true);
        c10.p(eVar);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(24.0f), 8.0f);
        this.W0 = c10;
        fh.g c11 = cVar.c(this, null, true);
        c11.p(eVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(8.0f), 8.0f);
        this.X0 = c11;
        fh.g c12 = cVar.c(this, null, true);
        c12.p(eVar);
        org.telegram.messenger.camera.q.p(c12, org.telegram.messenger.g0.L(4.0f), 8.0f);
        this.Y0 = c12;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25018i4);
        org.telegram.messenger.qs.f(this.J).c(this, org.telegram.messenger.qs.T);
        if (this.M0 == 5) {
            org.telegram.messenger.qs.f(this.J).c(this, org.telegram.messenger.qs.f25087u3);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
        org.telegram.messenger.qs.f(this.J).n(this, org.telegram.messenger.qs.T);
        if (this.M0 == 5) {
            org.telegram.messenger.qs.f(this.J).n(this, org.telegram.messenger.qs.f25087u3);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        k();
    }

    public final void p(org.telegram.messenger.ij ijVar, TLRPC.ChatFull chatFull, boolean z9) {
        int i7;
        boolean z10;
        boolean z11;
        TLRPC.ChatFull chatFull2;
        boolean z12;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i10;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.H = ijVar;
        if (ijVar != null && (message = ijVar.f23262k) != null && (tL_messageReactions2 = message.reactions) != null) {
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
        int i12 = this.M0;
        if (i12 == 0 && this.H != null && i7 >= org.telegram.messenger.qp.s1(this.J).O0(org.telegram.messenger.ij.B0(this.H.f23262k))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.I = z10;
        if (i12 == 0 && this.H != null && org.telegram.messenger.t3.V(org.telegram.messenger.qp.s1(this.J).M0(Long.valueOf(-org.telegram.messenger.ij.B0(this.H.f23262k))))) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.A0 = z11;
        ArrayList arrayList2 = new ArrayList();
        if (ijVar != null && ijVar.l3()) {
            chatFull2 = org.telegram.messenger.qp.s1(this.J).N0(-ijVar.Z0());
            if (chatFull2 == null) {
                this.K = -ijVar.Z0();
                org.telegram.messenger.qp.s1(this.J).V2(0, -ijVar.Z0(), true);
                setVisibility(4);
                return;
            }
        } else {
            chatFull2 = chatFull;
        }
        this.f34686c0 = false;
        if (i12 == 3) {
            this.E0 = org.telegram.messenger.p10.i(this.J).q();
            h(arrayList2);
        } else if (i12 == 5) {
            this.E0 = true;
            h(arrayList2);
        } else if (this.I) {
            this.E0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.f34686c0 = true;
                ?? obj = new Object();
                obj.f6352a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.H.f23262k.reactions.results;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i13);
                i13++;
                arrayList2.add(ch.o0.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.f34686c0 = true;
                ?? obj2 = new Object();
                obj2.f6352a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.J).M0(Long.valueOf(chatFull2.f26957id));
                if (M0 != null && !org.telegram.messenger.t3.V(M0)) {
                    this.E0 = true;
                } else {
                    this.E0 = false;
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
                    ArrayList arrayList5 = org.telegram.messenger.ui.b0(this.J).f25828n;
                    int size4 = arrayList5.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 < size4) {
                            Object obj3 = arrayList5.get(i15);
                            i15++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj3;
                            if ((reaction2 instanceof TLRPC.TL_reactionEmoji) && tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                arrayList2.add(ch.o0.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(ch.o0.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.E0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i16))) {
                i16--;
                arrayList2.remove(i16);
            } else {
                hashSet.add((ch.o0) arrayList2.get(i16));
            }
            i16++;
        }
        if (!this.I && ((!this.E0 && arrayList2.size() > 16) || (this.E0 && !org.telegram.messenger.p10.i(this.J).q() && org.telegram.messenger.qp.s1(this.J).D3()))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.F0 = z12;
        if (i12 == 3 && !org.telegram.messenger.p10.i(this.J).q()) {
            this.F0 = false;
        }
        if (i12 == 4) {
            this.F0 = true;
        }
        ArrayList arrayList6 = this.T;
        arrayList6.clear();
        if (q()) {
            int L = (org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(36.0f)) / org.telegram.messenger.g0.L(34.0f);
            if (L > 7) {
                L = 7;
            }
            int i17 = 0;
            if (L < 1) {
                L = 1;
            }
            while (i17 < Math.min(arrayList2.size(), L)) {
                arrayList6.add((ch.o0) arrayList2.get(i17));
                i17++;
            }
            if (i17 < arrayList2.size()) {
                gi0.a(this.f34725z0, (ch.o0) arrayList2.get(i17), -1);
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i18 = 0; i18 < arrayList6.size(); i18++) {
            if (((ch.o0) arrayList6.get(i18)).f6357g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList7 = this.V;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < org.telegram.messenger.g0.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        yh0 yh0Var = this.f34680a0;
        ii0 ii0Var = (ii0) yh0Var.f40673e;
        ArrayList arrayList8 = ii0Var.f34690e;
        ArrayList arrayList9 = ii0Var.T;
        ArrayList arrayList10 = ii0Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i19 = 0; i19 < arrayList9.size(); i19++) {
            ch.o0 o0Var = (ch.o0) arrayList9.get(i19);
            if (o0Var.f6356f == null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            arrayList10.add(new zh0(i10, o0Var));
        }
        if (!ii0Var.U.isEmpty() && !org.telegram.messenger.qp.s1(ii0Var.J).D3()) {
            arrayList10.add(new zh0(1, null));
        }
        if (ii0Var.q()) {
            arrayList10.add(new zh0(2, null));
        }
        if (z9) {
            yh0Var.E(arrayList8, arrayList10);
        } else {
            yh0Var.f();
        }
        if (ijVar != null && (tL_messageReactions = ijVar.f23262k.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < ijVar.f23262k.reactions.results.size(); i20++) {
                if (ijVar.f23262k.reactions.results.get(i20).chosen) {
                    this.f34688d0.add(ch.o0.d(ijVar.f23262k.reactions.results.get(i20).reaction));
                }
            }
        }
    }

    public final boolean q() {
        if (!this.E0 && !this.F0) {
            return false;
        }
        return true;
    }

    public final void r(boolean z9) {
        ObjectAnimator duration;
        this.K0 = z9;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.L0.d();
        boolean j3 = org.telegram.messenger.iz.j();
        org.telegram.ui.Cells.g1 g1Var = l1;
        if (j3) {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new vh0(this, 0));
        duration.start();
    }

    @Override
    public void setAlpha(float f10) {
        if (getAlpha() != f10 && f10 == 0.0f) {
            this.C0.clear();
            int i7 = 0;
            while (true) {
                bi.q1 q1Var = this.f34682b;
                if (i7 >= q1Var.getChildCount()) {
                    break;
                }
                if (q1Var.getChildAt(i7) instanceof gi0) {
                    ((gi0) q1Var.getChildAt(i7)).d();
                }
                i7++;
            }
        }
        super.setAlpha(f10);
    }

    public void setBubbleOffset(float f10) {
        this.U0 = f10;
    }

    public void setChatScrimView(bo boVar) {
        this.f34692e1 = boVar;
    }

    public void setCurrentAccount(int i7) {
        this.J = i7;
    }

    public void setCustomEmojiEnterProgress(float f10) {
        this.f34720w0 = f10;
        bo boVar = this.f34692e1;
        if (boVar != null) {
            boVar.setPopupAlpha(1.0f - f10);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z9) {
        if (z9) {
            zq zqVar = this.f34718v0;
            int L = org.telegram.messenger.g0.L(28.0f);
            int i7 = org.telegram.ui.ActionBar.k6.f27944i6;
            org.telegram.ui.ActionBar.r6.R(zqVar, org.telegram.ui.ActionBar.k6.j0(L, 0, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i7, false), 40)), null, org.telegram.ui.ActionBar.r6.h(i7, 40), null);
            return;
        }
        this.f34718v0.setBackground(null);
    }

    public void setDelegate(hi0 hi0Var) {
        this.f34696g0 = hi0Var;
    }

    public void setFlippedVertically(boolean z9) {
        this.N = z9;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        this.f34716t0 = f2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.Q0 = true;
        if (this.R0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.f6 f6Var = this.f34704k0;
            w70 w70Var = new w70(context, f6Var);
            this.R0 = w70Var;
            w70Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i7 = this.M0;
            if (i7 != 1 && i7 != 2 && i7 != 4) {
                org.telegram.ui.ActionBar.r6.V(this.R0, org.telegram.ui.ActionBar.k6.f28262z6, f6Var);
            } else {
                org.telegram.ui.ActionBar.r6.V(this.R0, org.telegram.ui.ActionBar.k6.G6, f6Var);
                this.R0.setAlpha(0.5f);
            }
            this.R0.setGravity(1);
            addView(this.R0, c8.ha.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.R0.setText(charSequence);
        this.f34695f1 = false;
        ((FrameLayout.LayoutParams) this.f34725z0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
        ((FrameLayout.LayoutParams) this.f34682b.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(20.0f);
    }

    public void setMiniBubblesOffset(float f10) {
        this.V0 = f10;
    }

    public void setMirrorX(boolean z9) {
        this.M = z9;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.P0 = runnable;
    }

    public void setParentLayout(bo boVar) {
        this.J0 = boVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f34688d0;
        hashSet.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = arrayList.get(i7);
            i7++;
            ch.o0 b10 = ch.o0.b(str);
            hashSet.add(b10);
            this.f34691e0.add(b10);
        }
        org.telegram.messenger.g0.d0(this.f34682b, new th0(this, 0));
    }

    public void setSelectedReaction(ch.o0 o0Var) {
        HashSet hashSet = this.f34688d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        this.f34680a0.f();
    }

    public void setSelectedReactionAnimated(ch.o0 o0Var) {
        HashSet hashSet = this.f34688d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        org.telegram.messenger.g0.d0(this.f34682b, new th0(this, 0));
    }

    public void setSelectedReactionInclusive(ch.o0 o0Var) {
        HashSet hashSet = this.f34688d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        org.telegram.messenger.g0.d0(this.f34682b, new th0(this, 0));
    }

    public void setSelectedReactions(ArrayList<org.telegram.messenger.ij> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f34688d0;
        hashSet.clear();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.ij ijVar = arrayList.get(i7);
            if (ijVar != null && (tL_messageReactions = ijVar.f23262k.reactions) != null && tL_messageReactions.results != null) {
                for (int i10 = 0; i10 < ijVar.f23262k.reactions.results.size(); i10++) {
                    if (ijVar.f23262k.reactions.results.get(i10).chosen) {
                        hashSet.add(ch.o0.d(ijVar.f23262k.reactions.results.get(i10).reaction));
                    }
                }
            }
        }
        this.f34680a0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<org.telegram.messenger.ij> arrayList) {
        HashSet hashSet = this.f34688d0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        org.telegram.messenger.g0.d0(this.f34682b, new th0(this, 0));
    }

    public void setSkipDraw(boolean z9) {
        if (this.f34689d1 != z9) {
            this.f34689d1 = z9;
            if (!z9) {
                int i7 = 0;
                while (true) {
                    bi.q1 q1Var = this.f34682b;
                    if (i7 >= q1Var.getChildCount()) {
                        break;
                    }
                    if (q1Var.getChildAt(i7) instanceof gi0) {
                        gi0 gi0Var = (gi0) q1Var.getChildAt(i7);
                        boolean z10 = gi0Var.f33955r;
                        fi0 fi0Var = gi0Var.f33950b;
                        if (z10 && (fi0Var.getImageReceiver().B() != null || fi0Var.getImageReceiver().m() != null)) {
                            fi0Var.setVisibility(0);
                            gi0Var.f33949a.setVisibility(4);
                            if (gi0Var.f33956s) {
                                gi0Var.f33957w = true;
                            }
                        }
                        gi0Var.invalidate();
                    }
                    i7++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f34688d0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ch.o0.d(reaction));
        }
        this.f34680a0.f();
    }

    public void setTop(boolean z9) {
        this.L = z9;
    }

    public void setTransitionProgress(float f10) {
        this.f34719w = f10;
        bo boVar = this.J0;
        if (boVar != null) {
            boVar.setReactionsTransitionProgress((this.K0 && org.telegram.messenger.iz.j()) ? 1.0f : 1.0f);
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
        Paint paint = this.f34693f;
        if (paint != null) {
            try {
                int i7 = this.M0;
                if (i7 != 2 && i7 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.f34704k0))) {
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
        ug.z0 z0Var = this.f34717u0;
        if (z0Var != null) {
            z0Var.setColor(i0.a.f(0.7f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.F8, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27925h5, false)));
        }
        if (getWidth() > 0 && getHeight() > 0 && this.f34684b1 != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false)) {
            k();
        }
    }

    public void m() {
    }
}
