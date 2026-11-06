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
public final class n31 extends FrameLayout implements org.telegram.messenger.ls {
    public v4.s0 D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public long K;
    public ValueAnimator L;
    public boolean M;
    public boolean N;
    public final TLRPC.StickerSetCovered O;
    public final org.telegram.ui.ActionBar.f6 P;
    public float Q;
    public final Paint R;
    public final int f36231a;
    public final j31 f36232b;
    public final TLRPC.StickerSetCovered[] f36233c;
    public final LongSparseArray d;
    public final LongSparseArray f36234e;
    public final View f36235f;
    public final b31 h;
    public final c31 f36236n;
    public final d31 f36237r;
    public final m31 f36238s;
    public final jg.d2 f36239w;
    public final FrameLayout f36240x;
    public org.telegram.ui.ActionBar.f2 f36241y;

    public n31(Context context, final j31 j31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7 = org.telegram.messenger.p10.f24459s0;
        this.f36231a = i7;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f36232b = j31Var;
        this.f36233c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f36234e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = f6Var;
        m31 m31Var = new m31(this, context);
        this.f36238s = m31Var;
        this.f36239w = new jg.d2(context, new a31(this, j31Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36240x = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27921h5, frameLayout, f6Var);
        b31 b31Var = new b31(this, context, f6Var);
        this.h = b31Var;
        b31Var.setHint(org.telegram.messenger.hd.M0(2131745706, null));
        frameLayout.addView(b31Var, c8.ha.e(-1, -1, 48));
        c31 c31Var = new c31(this, context, j31Var);
        this.f36236n = c31Var;
        final k kVar = new k(this, 19);
        c31Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return j31Var.e(n31.this.f36236n, kVar2, motionEvent);
            }
        });
        c31Var.setOverScrollMode(2);
        c31Var.setClipToPadding(false);
        c31Var.setItemAnimator(null);
        c31Var.setLayoutAnimation(null);
        d31 d31Var = new d31(this, org.telegram.messenger.g0.L(58.0f), c31Var);
        this.f36237r = d31Var;
        c31Var.setLayoutManager(d31Var);
        d31Var.O = new e31(this);
        c31Var.setOnScrollListener(new f31(this));
        c31Var.setAdapter(m31Var);
        c31Var.setOnItemClickListener(kVar);
        addView(c31Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f36235f = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, f6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1());
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, c8.ha.e(-1, 58, 51));
        d();
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(i7);
        f10.c(this, org.telegram.messenger.qs.f25087x0);
        f10.c(this, org.telegram.messenger.qs.f25101z0);
    }

    private void setShadowVisible(boolean z9) {
        float f10;
        if (this.G != z9) {
            this.G = z9;
            ViewPropertyAnimator animate = this.f36235f.animate();
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.camera.q.k(animate, f10, 200L);
        }
    }

    public final void a(boolean z9) {
        this.M = z9;
        if (z9) {
            if (getContentTopOffset() > 0 && this.L == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new i31(this, contentTopOffset));
                this.L.addListener(new j01(this, 3));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.i1.f27540w);
                this.L.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.L.cancel();
            this.L = null;
        }
    }

    public final void b(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet) {
        g31 g31Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f26972id = stickerSet.f26979id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            j31 j31Var = this.f36232b;
            j31Var.getClass();
            if (j31Var instanceof aw) {
                g31Var = new g31(this);
            } else {
                g31Var = null;
            }
            yv0 yv0Var = new yv0(getContext(), this.f36241y, inputStickerSet2, null, g31Var, this.P);
            yv0Var.f40721a2 = false;
            yv0Var.T1 = new h31(this, inputStickerSet2);
            this.f36241y.showDialog(yv0Var);
        }
    }

    public final boolean c() {
        int i7;
        boolean z9;
        c31 c31Var = this.f36236n;
        int childCount = c31Var.getChildCount();
        View view = this.f36235f;
        FrameLayout frameLayout = this.f36240x;
        if (childCount <= 0) {
            int paddingTop = c31Var.getPaddingTop();
            this.E = paddingTop;
            c31Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = c31Var.getChildAt(0);
        for (int i10 = 1; i10 < c31Var.getChildCount(); i10++) {
            View childAt2 = c31Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        xi0 xi0Var = (xi0) c31Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(58.0f);
        if (top > 0 && xi0Var != null && xi0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        if (top < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        setShadowVisible(z9);
        if (this.E == i7) {
            return false;
        }
        this.E = i7;
        c31Var.setTopGlowOffset(org.telegram.messenger.g0.L(58.0f) + i7);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        c31 c31Var = this.f36236n;
        v4.g0 adapter = c31Var.getAdapter();
        m31 m31Var = this.f36238s;
        if (adapter == m31Var) {
            m31Var.getClass();
            return;
        }
        this.f36239w.getClass();
        int childCount = c31Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = c31Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.j8) {
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) childAt;
                j8Var.d();
                j8Var.e();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25087x0;
        c31 c31Var = this.f36236n;
        m31 m31Var = this.f36238s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    v4.g0 adapter = c31Var.getAdapter();
                    if (adapter != null) {
                        adapter.n(0, adapter.b(), 0);
                        return;
                    }
                    return;
                }
                m31Var.G();
            }
        } else if (i7 == org.telegram.messenger.qs.f25101z0) {
            if (this.K != org.telegram.messenger.ui.b0(this.f36231a).X()) {
                this.J = false;
            }
            if (this.J) {
                v4.g0 adapter2 = c31Var.getAdapter();
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
        int i7;
        int i10;
        float f10;
        float f11 = this.Q;
        if (f11 != 0.0f && (stickerSetCovered = this.O) != null) {
            float f12 = f11 - 0.0053333333f;
            this.Q = f12;
            if (f12 < 0.0f) {
                this.Q = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.f36238s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                d31 d31Var = this.f36237r;
                View m10 = d31Var.m(intValue);
                if (m10 != null) {
                    i7 = (int) m10.getY();
                    i10 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i7 = -1;
                    i10 = -1;
                }
                View m11 = d31Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i7 = (int) m11.getY();
                    }
                    i10 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
                    Paint paint = this.R;
                    paint.setColor(x02);
                    float f13 = this.Q;
                    if (f13 < 0.06f) {
                        f10 = f13 / 0.06f;
                    } else {
                        f10 = 1.0f;
                    }
                    paint.setAlpha((int) (f10 * 25.5f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, i7, getMeasuredWidth(), i10, paint);
                    super.dispatchDraw(canvas2);
                }
            }
        }
        canvas2 = canvas;
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.F = false;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.F) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f36236n.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        return dispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.E;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v4.g0 adapter = this.f36236n.getAdapter();
        adapter.g(adapter.b() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        Integer num;
        super.onLayout(z9, i7, i10, i11, i12);
        if (!this.I) {
            this.I = true;
            m31 m31Var = this.f36238s;
            m31Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) m31Var.h.get(stickerSetCovered)) != null) {
                this.f36237r.h1(num.intValue(), org.telegram.messenger.g0.L(58.0f) + (-this.f36236n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i7) {
        int L = org.telegram.messenger.g0.L(58.0f) + i7;
        c31 c31Var = this.f36236n;
        if (c31Var.getPaddingTop() != L) {
            this.H = true;
            c31Var.setPadding(0, L, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(v4.s0 s0Var) {
        this.D = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        this.f36241y = f2Var;
    }
}
