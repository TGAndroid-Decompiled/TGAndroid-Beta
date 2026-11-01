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
public class nj0 extends FrameLayout implements org.telegram.messenger.vs, org.telegram.ui.ActionBar.k6 {
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
    public org.telegram.messenger.kj H;
    public final Paint H0;
    public boolean I;
    public final Paint I0;
    public int J;
    public ko J0;
    public long K;
    public boolean K0;
    public boolean L;
    public final e2.f L0;
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
    public p80 R0;
    public fg.i S;
    public int S0;
    public final ArrayList T;
    public int T0;
    public final ArrayList U;
    public float U0;
    public final ArrayList V;
    public float V0;
    public final org.telegram.ui.br W;
    public vg.f W0;
    public vg.f X0;
    public vg.f Y0;
    public tg.b Z0;
    public boolean f28858a;
    public final dj0 f28859a0;
    public wg.d f28860a1;
    public final ag.b1 f28861b;
    public final RectF f28862b0;
    public int f28863b1;
    public final float f28864c;
    public boolean f28865c0;
    public boolean f28866c1;
    public final ArrayList d;
    public final HashSet f28867d0;
    public boolean f28868d1;
    public final ArrayList e;
    public final HashSet f28869e0;
    public ko f28870e1;
    public final Paint f28871f;
    public final int[] f28872f0;
    public boolean f28873f1;
    public mj0 f28874g0;
    public boolean f28875g1;
    public final Paint h;
    public final Rect f28876h0;
    public boolean f28877h1;
    public final Drawable f28878i0;
    public Paint f28879i1;
    public final boolean f28880j0;
    public Matrix f28881j1;
    public final org.telegram.ui.ActionBar.p6 f28882k0;
    public LinearGradient f28883k1;
    public sg.o0 f28884l0;
    public int m0;
    public final Paint f28885n;
    public float f28886n0;
    public float f28887o0;
    public float f28888p0;
    public float f28889q0;
    public float f28890r;
    public boolean f28891r0;
    public float f28892s;
    public long f28893s0;
    public org.telegram.ui.ActionBar.k2 f28894t0;
    public kg.l1 f28895u0;
    public ir f28896v0;
    public float f28897w;
    public float f28898w0;
    public final RectF f28899x;
    public sg.b0 f28900x0;
    public final Path f28901y;
    public ValueAnimator f28902y0;
    public final lj0 f28903z0;

    public nj0(int i10, int i11, Context context, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        boolean z10;
        this.f28858a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f28871f = paint;
        this.h = new Paint(1);
        this.f28885n = new Paint(1);
        this.f28897w = 1.0f;
        this.f28899x = new RectF();
        this.f28901y = new Path();
        this.D = org.telegram.messenger.i0.L(72.0f);
        float L = org.telegram.messenger.i0.L(8.0f);
        this.E = L;
        this.F = L / 2.0f;
        this.G = org.telegram.messenger.i0.L(36.0f);
        this.T = new ArrayList(20);
        this.U = new ArrayList(10);
        this.V = new ArrayList(20);
        this.f28862b0 = new RectF();
        this.f28865c0 = false;
        this.f28867d0 = new HashSet();
        this.f28869e0 = new HashSet();
        this.f28872f0 = new int[2];
        Rect rect = new Rect();
        this.f28876h0 = rect;
        new ArrayList();
        this.C0 = new HashSet();
        this.D0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.H0 = paint2;
        Paint paint3 = new Paint(1);
        this.I0 = paint3;
        this.L0 = new e2.f((int[]) null);
        this.O0 = true;
        this.f28875g1 = false;
        this.M0 = i10;
        this.f28864c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var));
        paint3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.xk, p6Var));
        this.f28882k0 = p6Var;
        this.J = i11;
        this.f28894t0 = k2Var;
        lj0 lj0Var = new lj0(this, context);
        this.f28903z0 = lj0Var;
        lj0Var.setVisibility(8);
        lj0Var.O = false;
        lj0Var.f28184c.setVisibility(8);
        addView(lj0Var);
        if (org.telegram.messenger.uz.c() && org.telegram.messenger.uz.o() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28880j0 = z10;
        Drawable mutate = context.getDrawable(2131232670).mutate();
        this.f28878i0 = mutate;
        int L2 = org.telegram.messenger.i0.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.He, null, PorterDuff.Mode.MULTIPLY);
        ag.b1 b1Var = new ag.b1(this, context, 17);
        this.f28861b = b1Var;
        b1Var.setClipChildren(false);
        b1Var.setClipToPadding(false);
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) this, 3);
        this.W = brVar;
        b1Var.i(new zi0(this, 0));
        b1Var.setLayoutManager(brVar);
        b1Var.setOverScrollMode(2);
        dj0 dj0Var = new dj0(this, 0);
        this.f28859a0 = dj0Var;
        b1Var.setAdapter(dj0Var);
        b1Var.j(new hj0(this));
        b1Var.j(new ag.u(this, 27));
        b1Var.i(new zi0(this, 1));
        b1Var.setOnItemClickListener(new k(this, 11));
        b1Var.setOnItemLongClickListener((jk0) new i2.q(this, i10, 10));
        addView(b1Var, w7.b6.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (b1Var.getLayoutParams().height - b1Var.getPaddingTop()) - b1Var.getPaddingBottom();
        lj0Var.getLayoutParams().width = paddingTop - org.telegram.messenger.i0.L(12.0f);
        lj0Var.getLayoutParams().height = paddingTop;
        if (i10 != 2 && i10 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, p6Var));
        } else {
            paint.setColor(i0.b.f(0.13f, -16777216, -1));
        }
        org.telegram.messenger.vi.b0(i11).k1();
    }

    public static void a(nj0 nj0Var) {
        if (nj0Var.f28900x0 != null) {
            return;
        }
        sg.b0 b0Var = new sg.b0(nj0Var.M0, nj0Var.f28894t0, nj0Var.V, nj0Var.f28867d0, nj0Var, nj0Var.f28882k0, nj0Var.f28858a);
        nj0Var.f28900x0 = b0Var;
        tg.b bVar = nj0Var.Z0;
        boolean z10 = true;
        if (bVar != null) {
            wg.d dVar = nj0Var.f28860a1;
            org.telegram.ui.y11 y11Var = b0Var.f48295m.f37301f0;
            y11Var.f43541y = true;
            y11Var.setBackground(null);
            y11Var.updateColors();
            y11Var.invalidate();
            vg.f c10 = bVar.c(b0Var.f48286a, null, true);
            c10.o(dVar);
            org.telegram.messenger.a30.u(c10, org.telegram.messenger.i0.L(12.0f), 8.0f);
            b0Var.f48307z = c10;
        }
        sg.b0 b0Var2 = nj0Var.f28900x0;
        mj0 mj0Var = nj0Var.f28874g0;
        if (mj0Var != null && !mj0Var.f()) {
            z10 = false;
        }
        b0Var2.f48295m.setLongPressEnabled(z10);
        nj0Var.j();
        nj0Var.f28900x0.f48298p = new eb0(nj0Var, 16);
        nj0Var.m();
    }

    public static void b(nj0 nj0Var, View view, float f7) {
        if (view instanceof lj0) {
            ((lj0) view).h = f7;
            return;
        }
        view.setScaleX(f7);
        view.setScaleY(f7);
    }

    public static boolean c() {
        return org.telegram.messenger.uz.j();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z10 = true;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i10);
            hashSet.clear();
            if (kjVar != null && (tL_messageReactions = kjVar.f16690k.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < kjVar.f16690k.reactions.results.size(); i11++) {
                    if (kjVar.f16690k.reactions.results.get(i11).chosen) {
                        sg.o0 d = sg.o0.d(kjVar.f16690k.reactions.results.get(i11).reaction);
                        if (z10 || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i12 = 0;
            while (i12 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i12)))) {
                    longSparseArray.removeAt(i12);
                    i12--;
                }
                i12++;
            }
            i10++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
            if (longSparseArray.valueAt(i13) != null) {
                hashSet2.add((sg.o0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21002h5));
    }

    public final void d(boolean z10) {
        sg.b0 b0Var = this.f28900x0;
        if (b0Var != null) {
            if (!b0Var.f48299q || !z10) {
                b0Var.f48299q = true;
                if (!z10) {
                    b0Var.f();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new sg.u(b0Var, 0));
                    ofFloat.addListener(new sg.z(b0Var, 0));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                }
            }
            this.f28900x0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19795id == this.K && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.H, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i10 == org.telegram.messenger.at.f14726i4) {
            if (this.M0 == 4) {
                invalidate();
                ag.b1 b1Var = this.f28861b;
                b1Var.invalidate();
                b1Var.g1();
                for (int i12 = 0; i12 < b1Var.getChildCount(); i12++) {
                    View childAt = b1Var.getChildAt(i12);
                    if (childAt instanceof lj0) {
                        lj0 lj0Var = (lj0) childAt;
                        lj0Var.f28182a.invalidate();
                        lj0Var.f28183b.invalidate();
                    } else {
                        childAt.invalidate();
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14797u3) {
            p(this.H, null, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nj0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        sg.b0 b0Var = this.f28900x0;
        if (b0Var != null) {
            b0Var.d();
        }
    }

    public final void f(float f7, float f10, float f11, int i10, Canvas canvas) {
        int i11;
        float height;
        float f12;
        float f13;
        float height2;
        if (this.M0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.L;
        RectF rectF = this.f28899x;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (org.telegram.messenger.i0.T1(rectF.top, getMeasuredHeight(), gr.f26523f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.f28897w) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            gr grVar = gr.f26523f;
            canvas.clipRect(0.0f, (org.telegram.messenger.i0.T1(f14, 0.0f, grVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.f28897w) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), grVar.getInterpolation(this.O)));
        }
        if (!org.telegram.messenger.dd.X && !this.M) {
            i11 = getWidth() - this.G;
        } else {
            i11 = this.G;
        }
        float f15 = i11 + this.U0;
        if (this.L) {
            height = getPaddingTop() - g();
        } else {
            height = (getHeight() - getPaddingBottom()) + g();
        }
        int L = org.telegram.messenger.i0.L(3.0f);
        Drawable drawable = this.f28878i0;
        drawable.setAlpha(i10);
        Paint paint = this.f28871f;
        paint.setAlpha(i10);
        float f16 = f15 - f7;
        float f17 = L;
        float f18 = f17 * f10;
        float f19 = height - f7;
        float f20 = f15 + f7;
        float f21 = height + f7;
        drawable.setBounds((int) (f16 - f18), (int) (f19 - f18), (int) (f20 + f18), (int) (f18 + f21));
        drawable.draw(canvas);
        boolean A = this.f28874g0.A();
        float f22 = height;
        RectF rectF2 = this.f28862b0;
        if (A) {
            rectF2.set(f16, f19, f20, f21);
            f12 = f7;
            this.f28874g0.r(canvas, rectF2, f12, getX(), getY(), i10, false);
        } else {
            f12 = f7;
            if (this.X0 != null) {
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(f16, f19, f20, f21);
                Rect rect = org.telegram.messenger.i0.Q;
                rectF3.round(rect);
                rect.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
                this.X0.setBounds(rect);
                this.X0.setAlpha(paint.getAlpha());
                this.X0.draw(canvas);
            } else {
                canvas.drawCircle(f15, f22, f12, paint);
            }
        }
        boolean z11 = org.telegram.messenger.dd.X;
        float f23 = this.E;
        if (!z11 && !this.M) {
            f13 = (getWidth() - this.G) + f23;
        } else {
            f13 = this.G - f23;
        }
        float f24 = this.U0 + this.V0 + f13;
        boolean z12 = this.L;
        float f25 = this.F;
        if (z12) {
            height2 = (getPaddingTop() - g()) - org.telegram.messenger.i0.L(16.0f);
        } else {
            height2 = ((getHeight() - f25) - f17) + g();
        }
        float T1 = org.telegram.messenger.i0.T1(height2, (f25 + f17) - g(), gr.f26523f.getInterpolation(this.O));
        float f26 = (-org.telegram.messenger.i0.L(1.0f)) * f10;
        drawable.setBounds((int) ((f24 - f12) - f26), (int) ((T1 - f12) - f26), (int) (f24 + f12 + f26), (int) (f12 + T1 + f26));
        drawable.draw(canvas);
        if (this.f28874g0.A()) {
            rectF2.set(f24 - f11, T1 - f11, f24 + f11, T1 + f11);
            this.f28874g0.r(canvas, rectF2, f11, getX(), getY(), i10, false);
        } else if (this.Y0 != null) {
            RectF rectF4 = org.telegram.messenger.i0.P;
            rectF4.set(f24 - f11, T1 - f11, f24 + f11, T1 + f11);
            Rect rect2 = org.telegram.messenger.i0.Q;
            rectF4.round(rect2);
            rect2.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
            this.Y0.setBounds(rect2);
            this.Y0.setAlpha(paint.getAlpha());
            this.Y0.draw(canvas);
        } else {
            canvas.drawCircle(f24, T1, f11, paint);
        }
        canvas.restore();
        drawable.setAlpha(255);
        paint.setAlpha(255);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * org.telegram.messenger.i0.L(6.0f));
    }

    public mj0 getDelegate() {
        return this.f28874g0;
    }

    public int getHintTextWidth() {
        return this.S0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.T.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.i(this.B0 / org.telegram.messenger.i0.L(42.0f), 2.0f, 0.0f);
    }

    public sg.b0 getReactionsWindow() {
        return this.f28900x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e;
        HashSet hashSet = this.f28867d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        sg.o0 o0Var = (sg.o0) hashSet.iterator().next();
        long j10 = o0Var.f48446g;
        String str = null;
        if (j10 != 0 && (e = f5.e(this.J, j10)) != null) {
            str = org.telegram.messenger.kj.V(e, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = o0Var.f48445f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<sg.o0> getSelectedReactions() {
        return this.f28867d0;
    }

    public float getTopOffset() {
        if (this.Q0) {
            return ((FrameLayout.LayoutParams) this.f28861b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (!q()) {
            return org.telegram.messenger.i0.L(16.0f) + i0.a.e(itemsCount, 1, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(36.0f) * itemsCount);
        }
        return (org.telegram.messenger.i0.L(36.0f) * itemsCount) - org.telegram.messenger.i0.L(4.0f);
    }

    public List<sg.o0> getVisibleReactionsList() {
        return this.T;
    }

    public int getWindowType() {
        int i10 = this.M0;
        if (i10 == 4) {
            return 13;
        }
        if (i10 == 3) {
            return 11;
        }
        if (i10 == 5) {
            return 14;
        }
        if (this.F0) {
            return 8;
        }
        return 1;
    }

    public View getWindowView() {
        sg.b0 b0Var = this.f28900x0;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f48288c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList arrayList2;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.M0;
        if (i11 == 4) {
            Iterator it = this.f28867d0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                sg.o0 o0Var = (sg.o0) it.next();
                if (!hashSet.contains(o0Var)) {
                    hashSet.add(o0Var);
                    arrayList.add(o0Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList3 = org.telegram.messenger.vi.b0(this.J).f18661n;
            while (i10 < arrayList3.size()) {
                sg.o0 c10 = sg.o0.c((TLRPC.TL_availableReaction) arrayList3.get(i10));
                if (!hashSet.contains(c10)) {
                    hashSet.add(c10);
                    arrayList.add(c10);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
                i10++;
            }
        } else if (this.E0 && i11 != 4) {
            if (i11 == 5) {
                TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.wp.r1(this.J).E0();
                if (E0 != null) {
                    while (i10 < E0.effects.size()) {
                        sg.o0 e = sg.o0.e(E0.effects.get(i10));
                        if (!hashSet.contains(e)) {
                            hashSet.add(e);
                            arrayList.add(e);
                        }
                        i10++;
                    }
                    return;
                }
                return;
            }
            if (i11 == 3) {
                arrayList2 = org.telegram.messenger.vi.b0(this.J).E1;
            } else {
                arrayList2 = org.telegram.messenger.vi.b0(this.J).D1;
            }
            if (i11 == 3) {
                TLRPC.TL_messages_savedReactionsTags H1 = org.telegram.messenger.wp.r1(this.J).H1(0L, false);
                if (H1 != null) {
                    for (int i13 = 0; i13 < H1.tags.size(); i13++) {
                        sg.o0 d = sg.o0.d(H1.tags.get(i13).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    sg.o0 d10 = sg.o0.d((TLRPC.Reaction) arrayList2.get(i14));
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            } else {
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    sg.o0 d11 = sg.o0.d((TLRPC.Reaction) arrayList2.get(i15));
                    if (!hashSet.contains(d11) && (i11 == 3 || org.telegram.messenger.e20.i(this.J).q() || d11.f48446g == 0)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
            }
            if (i11 != 3 || org.telegram.messenger.e20.i(this.J).q()) {
                ArrayList arrayList4 = org.telegram.messenger.vi.b0(this.J).C1;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    sg.o0 d12 = sg.o0.d((TLRPC.Reaction) arrayList4.get(i16));
                    if (!hashSet.contains(d12)) {
                        hashSet.add(d12);
                        arrayList.add(d12);
                    }
                }
                ArrayList arrayList5 = org.telegram.messenger.vi.b0(this.J).f18661n;
                while (i10 < arrayList5.size()) {
                    sg.o0 c11 = sg.o0.c((TLRPC.TL_availableReaction) arrayList5.get(i10));
                    if (!hashSet.contains(c11)) {
                        hashSet.add(c11);
                        arrayList.add(c11);
                    }
                    i10++;
                }
            }
        } else if (i11 == 3) {
            ArrayList arrayList6 = org.telegram.messenger.vi.b0(this.J).E1;
            int i17 = 0;
            while (i10 < arrayList6.size()) {
                sg.o0 d13 = sg.o0.d((TLRPC.Reaction) arrayList6.get(i10));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                    i17++;
                }
                if (i17 != 16) {
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            ArrayList arrayList7 = org.telegram.messenger.vi.b0(this.J).f18661n;
            while (i10 < arrayList7.size()) {
                arrayList.add(sg.o0.c((TLRPC.TL_availableReaction) arrayList7.get(i10)));
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            ag.b1 b1Var = this.f28861b;
            if (i10 < b1Var.getChildCount()) {
                View childAt = b1Var.getChildAt(i10);
                if (childAt instanceof lj0) {
                    ((lj0) childAt).f28183b.invalidate();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int L = org.telegram.messenger.i0.L(24.0f);
        float height = getHeight() / 2.0f;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false);
        this.f28863b1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, x02, 0, tileMode));
        this.f28885n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, sg.o0 o0Var, boolean z10) {
        mj0 mj0Var = this.f28874g0;
        if (mj0Var != null) {
            mj0Var.x(view, o0Var, z10, true);
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
        this.f28886n0 = 0.0f;
        this.B0 = 0.0f;
        this.f28884l0 = null;
        this.f28891r0 = false;
        yi0 yi0Var = new yi0(this, 1);
        ag.b1 b1Var = this.f28861b;
        org.telegram.messenger.i0.d0(b1Var, yi0Var);
        this.C0.clear();
        b1Var.invalidate();
        fg.i iVar = this.S;
        if (iVar != null) {
            iVar.invalidate();
        }
        invalidate();
    }

    public final void o(tg.b bVar, wg.d dVar) {
        this.Z0 = bVar;
        this.f28860a1 = dVar;
        vg.f c10 = bVar.c(this, null, true);
        c10.o(dVar);
        org.telegram.messenger.a30.u(c10, org.telegram.messenger.i0.L(24.0f), 8.0f);
        this.W0 = c10;
        vg.f c11 = bVar.c(this, null, true);
        c11.o(dVar);
        org.telegram.messenger.a30.u(c11, org.telegram.messenger.i0.L(8.0f), 8.0f);
        this.X0 = c11;
        vg.f c12 = bVar.c(this, null, true);
        c12.o(dVar);
        org.telegram.messenger.a30.u(c12, org.telegram.messenger.i0.L(4.0f), 8.0f);
        this.Y0 = c12;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.f(this.J).c(this, org.telegram.messenger.at.T);
        if (this.M0 == 5) {
            org.telegram.messenger.at.f(this.J).c(this, org.telegram.messenger.at.f14797u3);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.f(this.J).n(this, org.telegram.messenger.at.T);
        if (this.M0 == 5) {
            org.telegram.messenger.at.f(this.J).n(this, org.telegram.messenger.at.f14797u3);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        k();
    }

    public final void p(org.telegram.messenger.kj kjVar, TLRPC.ChatFull chatFull, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        TLRPC.ChatFull chatFull2;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i11;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.H = kjVar;
        if (kjVar != null && (message = kjVar.f16690k) != null && (tL_messageReactions2 = message.reactions) != null) {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i10 = 0;
            int i12 = 0;
            while (i12 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i12);
                i12++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i10++;
                }
            }
        } else {
            i10 = 0;
        }
        int i13 = this.M0;
        if (i13 == 0 && this.H != null && i10 >= org.telegram.messenger.wp.r1(this.J).N0(org.telegram.messenger.kj.B0(this.H.f16690k))) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.I = z11;
        if (i13 == 0 && this.H != null && org.telegram.messenger.w3.V(org.telegram.messenger.wp.r1(this.J).L0(Long.valueOf(-org.telegram.messenger.kj.B0(this.H.f16690k))))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.A0 = z12;
        ArrayList arrayList2 = new ArrayList();
        if (kjVar != null && kjVar.k3()) {
            chatFull2 = org.telegram.messenger.wp.r1(this.J).M0(-kjVar.Z0());
            if (chatFull2 == null) {
                this.K = -kjVar.Z0();
                org.telegram.messenger.wp.r1(this.J).T2(0, -kjVar.Z0(), true);
                setVisibility(4);
                return;
            }
        } else {
            chatFull2 = chatFull;
        }
        this.f28865c0 = false;
        if (i13 == 3) {
            this.E0 = org.telegram.messenger.e20.i(this.J).q();
            h(arrayList2);
        } else if (i13 == 5) {
            this.E0 = true;
            h(arrayList2);
        } else if (this.I) {
            this.E0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.f28865c0 = true;
                ?? obj = new Object();
                obj.f48442a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.H.f16690k.reactions.results;
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i14);
                i14++;
                arrayList2.add(sg.o0.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.f28865c0 = true;
                ?? obj2 = new Object();
                obj2.f48442a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.J).L0(Long.valueOf(chatFull2.f19795id));
                if (L0 != null && !org.telegram.messenger.w3.V(L0)) {
                    this.E0 = true;
                } else {
                    this.E0 = false;
                }
                h(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i15);
                    i15++;
                    TLRPC.Reaction reaction2 = reaction;
                    ArrayList arrayList5 = org.telegram.messenger.vi.b0(this.J).f18661n;
                    int size4 = arrayList5.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 < size4) {
                            Object obj3 = arrayList5.get(i16);
                            i16++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj3;
                            if ((reaction2 instanceof TLRPC.TL_reactionEmoji) && tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                arrayList2.add(sg.o0.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(sg.o0.d(reaction2));
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
        int i17 = 0;
        while (i17 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i17))) {
                i17--;
                arrayList2.remove(i17);
            } else {
                hashSet.add((sg.o0) arrayList2.get(i17));
            }
            i17++;
        }
        if (!this.I && ((!this.E0 && arrayList2.size() > 16) || (this.E0 && !org.telegram.messenger.e20.i(this.J).q() && org.telegram.messenger.wp.r1(this.J).A3()))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.F0 = z13;
        if (i13 == 3 && !org.telegram.messenger.e20.i(this.J).q()) {
            this.F0 = false;
        }
        if (i13 == 4) {
            this.F0 = true;
        }
        ArrayList arrayList6 = this.T;
        arrayList6.clear();
        if (q()) {
            int L = (org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(36.0f)) / org.telegram.messenger.i0.L(34.0f);
            if (L > 7) {
                L = 7;
            }
            int i18 = 0;
            if (L < 1) {
                L = 1;
            }
            while (i18 < Math.min(arrayList2.size(), L)) {
                arrayList6.add((sg.o0) arrayList2.get(i18));
                i18++;
            }
            if (i18 < arrayList2.size()) {
                lj0.a(this.f28903z0, (sg.o0) arrayList2.get(i18), -1);
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i19 = 0; i19 < arrayList6.size(); i19++) {
            if (((sg.o0) arrayList6.get(i19)).f48446g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList7 = this.V;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < org.telegram.messenger.i0.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        dj0 dj0Var = this.f28859a0;
        nj0 nj0Var = (nj0) dj0Var.e;
        ArrayList arrayList8 = nj0Var.e;
        ArrayList arrayList9 = nj0Var.T;
        ArrayList arrayList10 = nj0Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i20 = 0; i20 < arrayList9.size(); i20++) {
            sg.o0 o0Var = (sg.o0) arrayList9.get(i20);
            if (o0Var.f48445f == null) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            arrayList10.add(new ej0(i11, o0Var));
        }
        if (!nj0Var.U.isEmpty() && !org.telegram.messenger.wp.r1(nj0Var.J).A3()) {
            arrayList10.add(new ej0(1, null));
        }
        if (nj0Var.q()) {
            arrayList10.add(new ej0(2, null));
        }
        if (z10) {
            dj0Var.E(arrayList8, arrayList10);
        } else {
            dj0Var.f();
        }
        if (kjVar != null && (tL_messageReactions = kjVar.f16690k.reactions) != null && tL_messageReactions.results != null) {
            for (int i21 = 0; i21 < kjVar.f16690k.reactions.results.size(); i21++) {
                if (kjVar.f16690k.reactions.results.get(i21).chosen) {
                    this.f28867d0.add(sg.o0.d(kjVar.f16690k.reactions.results.get(i21).reaction));
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

    public final void r(boolean z10) {
        ObjectAnimator duration;
        this.K0 = z10;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.L0.d();
        boolean j10 = org.telegram.messenger.uz.j();
        org.telegram.ui.Cells.g1 g1Var = l1;
        if (j10) {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, g1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new aj0(this, 0));
        duration.start();
    }

    @Override
    public void setAlpha(float f7) {
        if (getAlpha() != f7 && f7 == 0.0f) {
            this.C0.clear();
            int i10 = 0;
            while (true) {
                ag.b1 b1Var = this.f28861b;
                if (i10 >= b1Var.getChildCount()) {
                    break;
                }
                if (b1Var.getChildAt(i10) instanceof lj0) {
                    ((lj0) b1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f7);
    }

    public void setBubbleOffset(float f7) {
        this.U0 = f7;
    }

    public void setChatScrimView(ko koVar) {
        this.f28870e1 = koVar;
    }

    public void setCurrentAccount(int i10) {
        this.J = i10;
    }

    public void setCustomEmojiEnterProgress(float f7) {
        this.f28898w0 = f7;
        ko koVar = this.f28870e1;
        if (koVar != null) {
            koVar.setPopupAlpha(1.0f - f7);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            ir irVar = this.f28896v0;
            int L = org.telegram.messenger.i0.L(28.0f);
            int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
            org.telegram.ui.ActionBar.a7.R(irVar, org.telegram.ui.ActionBar.t6.j0(L, 0, i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 40)), null, org.telegram.ui.ActionBar.a7.h(i10, 40), null);
            return;
        }
        this.f28896v0.setBackground(null);
    }

    public void setDelegate(mj0 mj0Var) {
        this.f28874g0 = mj0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        this.f28894t0 = k2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.Q0 = true;
        if (this.R0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.p6 p6Var = this.f28882k0;
            p80 p80Var = new p80(context, p6Var);
            this.R0 = p80Var;
            p80Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i10 = this.M0;
            if (i10 != 1 && i10 != 2 && i10 != 4) {
                org.telegram.ui.ActionBar.a7.V(this.R0, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
            } else {
                org.telegram.ui.ActionBar.a7.V(this.R0, org.telegram.ui.ActionBar.t6.G6, p6Var);
                this.R0.setAlpha(0.5f);
            }
            this.R0.setGravity(1);
            addView(this.R0, w7.b6.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.R0.setText(charSequence);
        this.f28873f1 = false;
        ((FrameLayout.LayoutParams) this.f28903z0.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(20.0f);
        ((FrameLayout.LayoutParams) this.f28861b.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(20.0f);
    }

    public void setMiniBubblesOffset(float f7) {
        this.V0 = f7;
    }

    public void setMirrorX(boolean z10) {
        this.M = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.P0 = runnable;
    }

    public void setParentLayout(ko koVar) {
        this.J0 = koVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f28867d0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            sg.o0 b10 = sg.o0.b(str);
            hashSet.add(b10);
            this.f28869e0.add(b10);
        }
        org.telegram.messenger.i0.d0(this.f28861b, new yi0(this, 0));
    }

    public void setSelectedReaction(sg.o0 o0Var) {
        HashSet hashSet = this.f28867d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        this.f28859a0.f();
    }

    public void setSelectedReactionAnimated(sg.o0 o0Var) {
        HashSet hashSet = this.f28867d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        org.telegram.messenger.i0.d0(this.f28861b, new yi0(this, 0));
    }

    public void setSelectedReactionInclusive(sg.o0 o0Var) {
        HashSet hashSet = this.f28867d0;
        hashSet.clear();
        if (o0Var != null) {
            hashSet.add(o0Var);
        }
        org.telegram.messenger.i0.d0(this.f28861b, new yi0(this, 0));
    }

    public void setSelectedReactions(ArrayList<org.telegram.messenger.kj> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f28867d0;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            org.telegram.messenger.kj kjVar = arrayList.get(i10);
            if (kjVar != null && (tL_messageReactions = kjVar.f16690k.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < kjVar.f16690k.reactions.results.size(); i11++) {
                    if (kjVar.f16690k.reactions.results.get(i11).chosen) {
                        hashSet.add(sg.o0.d(kjVar.f16690k.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.f28859a0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<org.telegram.messenger.kj> arrayList) {
        HashSet hashSet = this.f28867d0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        org.telegram.messenger.i0.d0(this.f28861b, new yi0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.f28868d1 != z10) {
            this.f28868d1 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    ag.b1 b1Var = this.f28861b;
                    if (i10 >= b1Var.getChildCount()) {
                        break;
                    }
                    if (b1Var.getChildAt(i10) instanceof lj0) {
                        lj0 lj0Var = (lj0) b1Var.getChildAt(i10);
                        boolean z11 = lj0Var.f28187r;
                        kj0 kj0Var = lj0Var.f28183b;
                        if (z11 && (kj0Var.getImageReceiver().B() != null || kj0Var.getImageReceiver().m() != null)) {
                            kj0Var.setVisibility(0);
                            lj0Var.f28182a.setVisibility(4);
                            if (lj0Var.f28188s) {
                                lj0Var.f28189w = true;
                            }
                        }
                        lj0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f28867d0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(sg.o0.d(reaction));
        }
        this.f28859a0.f();
    }

    public void setTop(boolean z10) {
        this.L = z10;
    }

    public void setTransitionProgress(float f7) {
        this.f28897w = f7;
        ko koVar = this.J0;
        if (koVar != null) {
            koVar.setReactionsTransitionProgress((this.K0 && org.telegram.messenger.uz.j()) ? 1.0f : 1.0f);
        }
        invalidate();
    }

    @Override
    public void setTranslationX(float f7) {
        if (f7 != getTranslationX()) {
            super.setTranslationX(f7);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        Paint paint = this.f28871f;
        if (paint != null) {
            try {
                int i10 = this.M0;
                if (i10 != 2 && i10 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.f28882k0))) {
                    int alpha = paint.getAlpha();
                    paint.setColor(w02);
                    paint.setAlpha(alpha);
                    invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        kg.l1 l1Var = this.f28895u0;
        if (l1Var != null) {
            l1Var.setColor(i0.b.f(0.7f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.F8, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false)));
        }
        if (getWidth() > 0 && getHeight() > 0 && this.f28863b1 != org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false)) {
            k();
        }
    }

    public void m() {
    }
}
