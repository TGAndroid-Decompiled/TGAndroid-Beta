package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class n31 extends FrameLayout implements org.telegram.messenger.cs {
    public u4.t0 E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public ValueAnimator M;
    public boolean N;
    public boolean O;
    public final TLRPC.StickerSetCovered P;
    public final org.telegram.ui.ActionBar.e6 Q;
    public float R;
    public final Paint S;
    public final int f36354a;
    public final k31 f36355b;
    public final TLRPC.StickerSetCovered[] f36356c;
    public final LongSparseArray d;
    public final LongSparseArray f36357e;
    public final View f36358f;
    public final c31 h;
    public final d31 f36359n;
    public final e31 f36360r;
    public final m31 f36361s;
    public final kg.y1 f36362w;
    public final FrameLayout f36363x;
    public org.telegram.ui.ActionBar.d2 f36364y;

    public n31(Context context, final k31 k31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.f36354a = i3;
        this.R = 1.0f;
        this.S = new Paint();
        this.f36355b = k31Var;
        this.f36356c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f36357e = longSparseArray2;
        this.P = stickerSetCovered;
        this.Q = e6Var;
        m31 m31Var = new m31(this, context);
        this.f36361s = m31Var;
        this.f36362w = new kg.y1(context, new b31(this, k31Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, e6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36363x = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, frameLayout, e6Var);
        c31 c31Var = new c31(this, context, e6Var);
        this.h = c31Var;
        c31Var.setHint(org.telegram.messenger.bd.M0(2131745715, null));
        frameLayout.addView(c31Var, b8.mf.e(-1, -1, 48));
        d31 d31Var = new d31(this, context, k31Var);
        this.f36359n = d31Var;
        final k kVar = new k(this, 19);
        d31Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return k31Var.e(n31.this.f36359n, kVar2, motionEvent);
            }
        });
        d31Var.setOverScrollMode(2);
        d31Var.setClipToPadding(false);
        d31Var.setItemAnimator(null);
        d31Var.setLayoutAnimation(null);
        e31 e31Var = new e31(this, org.telegram.messenger.g0.L(58.0f), d31Var);
        this.f36360r = e31Var;
        d31Var.setLayoutManager(e31Var);
        e31Var.O = new f31(this);
        d31Var.setOnScrollListener(new g31(this));
        d31Var.setAdapter(m31Var);
        d31Var.setOnItemClickListener(kVar);
        addView(d31Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f36358f = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, e6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1());
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, b8.mf.e(-1, 58, 51));
        d();
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(i3);
        f10.c(this, org.telegram.messenger.hs.f23333x0);
        f10.c(this, org.telegram.messenger.hs.f23347z0);
    }

    private void setShadowVisible(boolean z10) {
        float f10;
        if (this.H != z10) {
            this.H = z10;
            ViewPropertyAnimator animate = this.f36358f.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.camera.q.k(animate, f10, 200L);
        }
    }

    public final void a(boolean z10) {
        this.N = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.M == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.M = ofFloat;
                ofFloat.addUpdateListener(new j31(this, contentTopOffset));
                this.M.addListener(new j01(this, 3));
                this.M.setDuration(250L);
                this.M.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                this.M.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.M;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.M.cancel();
            this.M = null;
        }
    }

    public final void b(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet) {
        h31 h31Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f27021id = stickerSet.f27028id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            k31 k31Var = this.f36355b;
            k31Var.getClass();
            if (k31Var instanceof zv) {
                h31Var = new h31(this);
            } else {
                h31Var = null;
            }
            xv0 xv0Var = new xv0(getContext(), this.f36364y, inputStickerSet2, null, h31Var, this.Q);
            xv0Var.f40507b2 = false;
            xv0Var.U1 = new i31(this, inputStickerSet2);
            this.f36364y.showDialog(xv0Var);
        }
    }

    public final boolean c() {
        int i3;
        boolean z10;
        d31 d31Var = this.f36359n;
        int childCount = d31Var.getChildCount();
        View view = this.f36358f;
        FrameLayout frameLayout = this.f36363x;
        if (childCount <= 0) {
            int paddingTop = d31Var.getPaddingTop();
            this.F = paddingTop;
            d31Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.F);
            view.setTranslationY(this.F);
            setShadowVisible(false);
            return true;
        }
        View childAt = d31Var.getChildAt(0);
        for (int i10 = 1; i10 < d31Var.getChildCount(); i10++) {
            View childAt2 = d31Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        bj0 bj0Var = (bj0) d31Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(58.0f);
        if (top > 0 && bj0Var != null && bj0Var.b() == 0) {
            i3 = top;
        } else {
            i3 = 0;
        }
        if (top < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setShadowVisible(z10);
        if (this.F == i3) {
            return false;
        }
        this.F = i3;
        d31Var.setTopGlowOffset(org.telegram.messenger.g0.L(58.0f) + i3);
        frameLayout.setTranslationY(this.F);
        view.setTranslationY(this.F);
        return true;
    }

    public final void d() {
        d31 d31Var = this.f36359n;
        u4.h0 adapter = d31Var.getAdapter();
        m31 m31Var = this.f36361s;
        if (adapter == m31Var) {
            m31Var.getClass();
            return;
        }
        this.f36362w.getClass();
        int childCount = d31Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = d31Var.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.i8) {
                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) childAt;
                i8Var.d();
                i8Var.e();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f23333x0;
        d31 d31Var = this.f36359n;
        m31 m31Var = this.f36361s;
        if (i3 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.K) {
                    u4.h0 adapter = d31Var.getAdapter();
                    if (adapter != null) {
                        adapter.n(0, adapter.b(), 0);
                        return;
                    }
                    return;
                }
                m31Var.G();
            }
        } else if (i3 == org.telegram.messenger.hs.f23347z0) {
            if (this.L != org.telegram.messenger.li.b0(this.f36354a).X()) {
                this.K = false;
            }
            if (this.K) {
                u4.h0 adapter2 = d31Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.n(0, adapter2.b(), 0);
                    return;
                }
                return;
            }
            m31Var.G();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i3;
        int i10;
        float f10;
        float f11 = this.R;
        if (f11 != 0.0f && (stickerSetCovered = this.P) != null) {
            float f12 = f11 - 0.0053333333f;
            this.R = f12;
            if (f12 < 0.0f) {
                this.R = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.f36361s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                e31 e31Var = this.f36360r;
                View m10 = e31Var.m(intValue);
                if (m10 != null) {
                    i3 = (int) m10.getY();
                    i10 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i3 = -1;
                    i10 = -1;
                }
                View m11 = e31Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i3 = (int) m11.getY();
                    }
                    i10 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
                    Paint paint = this.S;
                    paint.setColor(x02);
                    float f13 = this.R;
                    if (f13 < 0.06f) {
                        f10 = f13 / 0.06f;
                    } else {
                        f10 = 1.0f;
                    }
                    paint.setAlpha((int) (f10 * 25.5f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, i3, getMeasuredWidth(), i10, paint);
                    super.dispatchDraw(canvas2);
                }
            }
        }
        canvas2 = canvas;
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.G = false;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.G) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f36359n.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        return dispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.F;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u4.h0 adapter = this.f36359n.getAdapter();
        adapter.g(adapter.b() - 1);
        this.J = false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        Integer num;
        super.onLayout(z10, i3, i10, i11, i12);
        if (!this.J) {
            this.J = true;
            m31 m31Var = this.f36361s;
            m31Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.P;
            if (stickerSetCovered != null && (num = (Integer) m31Var.h.get(stickerSetCovered)) != null) {
                this.f36360r.h1(num.intValue(), org.telegram.messenger.g0.L(58.0f) + (-this.f36359n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i3) {
        int L = org.telegram.messenger.g0.L(58.0f) + i3;
        d31 d31Var = this.f36359n;
        if (d31Var.getPaddingTop() != L) {
            this.I = true;
            d31Var.setPadding(0, L, 0, 0);
            this.I = false;
        }
    }

    public void setOnScrollListener(u4.t0 t0Var) {
        this.E = t0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.d2 d2Var) {
        this.f36364y = d2Var;
    }
}
