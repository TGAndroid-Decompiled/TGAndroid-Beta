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
public final class x31 extends FrameLayout implements org.telegram.messenger.is {
    public v4.t0 E;
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
    public final int f41547a;
    public final u31 f41548b;
    public final TLRPC.StickerSetCovered[] f41549c;
    public final LongSparseArray d;
    public final LongSparseArray f41550e;
    public final View f41551f;
    public final m31 h;
    public final n31 f41552n;
    public final o31 f41553r;
    public final w31 f41554s;
    public final jg.c2 f41555w;
    public final FrameLayout f41556x;
    public org.telegram.ui.ActionBar.e2 f41557y;

    public x31(Context context, final u31 u31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7 = org.telegram.messenger.m10.f24940t0;
        this.f41547a = i7;
        this.R = 1.0f;
        this.S = new Paint();
        this.f41548b = u31Var;
        this.f41549c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f41550e = longSparseArray2;
        this.P = stickerSetCovered;
        this.Q = e6Var;
        w31 w31Var = new w31(this, context);
        this.f41554s = w31Var;
        this.f41555w = new jg.c2(context, new l31(this, u31Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, e6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41556x = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, frameLayout, e6Var);
        m31 m31Var = new m31(this, context, e6Var);
        this.h = m31Var;
        m31Var.setHint(org.telegram.messenger.hd.M0(2131745705, null));
        frameLayout.addView(m31Var, c8.ja.e(-1, -1, 48));
        n31 n31Var = new n31(this, context, u31Var);
        this.f41552n = n31Var;
        final j jVar = new j(this, 20);
        n31Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return u31Var.e(x31.this.f41552n, jVar2, motionEvent);
            }
        });
        n31Var.setOverScrollMode(2);
        n31Var.setClipToPadding(false);
        n31Var.setItemAnimator(null);
        n31Var.setLayoutAnimation(null);
        o31 o31Var = new o31(this, org.telegram.messenger.g0.L(58.0f), n31Var);
        this.f41553r = o31Var;
        n31Var.setLayoutManager(o31Var);
        o31Var.O = new p31(this);
        n31Var.setOnScrollListener(new q31(this));
        n31Var.setAdapter(w31Var);
        n31Var.setOnItemClickListener(jVar);
        addView(n31Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f41551f = view;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.V5, view, e6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1());
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, c8.ja.e(-1, 58, 51));
        d();
        org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(i7);
        f10.c(this, org.telegram.messenger.ns.f25601x0);
        f10.c(this, org.telegram.messenger.ns.f25615z0);
    }

    private void setShadowVisible(boolean z10) {
        float f10;
        if (this.H != z10) {
            this.H = z10;
            ViewPropertyAnimator animate = this.f41551f.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.i20.m(animate, f10, 200L);
        }
    }

    public final void a(boolean z10) {
        this.N = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.M == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.M = ofFloat;
                ofFloat.addUpdateListener(new t31(this, contentTopOffset));
                this.M.addListener(new i11(this, 2));
                this.M.setDuration(250L);
                this.M.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
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
        r31 r31Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f28071id = stickerSet.f28078id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            u31 u31Var = this.f41548b;
            u31Var.getClass();
            if (u31Var instanceof gw) {
                r31Var = new r31(this);
            } else {
                r31Var = null;
            }
            bw0 bw0Var = new bw0(getContext(), this.f41557y, inputStickerSet2, null, r31Var, this.Q);
            bw0Var.f33402e2 = false;
            bw0Var.X1 = new s31(this, inputStickerSet2);
            this.f41557y.showDialog(bw0Var);
        }
    }

    public final boolean c() {
        int i7;
        boolean z10;
        n31 n31Var = this.f41552n;
        int childCount = n31Var.getChildCount();
        View view = this.f41551f;
        FrameLayout frameLayout = this.f41556x;
        if (childCount <= 0) {
            int paddingTop = n31Var.getPaddingTop();
            this.F = paddingTop;
            n31Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.F);
            view.setTranslationY(this.F);
            setShadowVisible(false);
            return true;
        }
        View childAt = n31Var.getChildAt(0);
        for (int i10 = 1; i10 < n31Var.getChildCount(); i10++) {
            View childAt2 = n31Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        cj0 cj0Var = (cj0) n31Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(58.0f);
        if (top > 0 && cj0Var != null && cj0Var.b() == 0) {
            i7 = top;
        } else {
            i7 = 0;
        }
        if (top < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setShadowVisible(z10);
        if (this.F == i7) {
            return false;
        }
        this.F = i7;
        n31Var.setTopGlowOffset(org.telegram.messenger.g0.L(58.0f) + i7);
        frameLayout.setTranslationY(this.F);
        view.setTranslationY(this.F);
        return true;
    }

    public final void d() {
        n31 n31Var = this.f41552n;
        v4.h0 adapter = n31Var.getAdapter();
        w31 w31Var = this.f41554s;
        if (adapter == w31Var) {
            w31Var.getClass();
            return;
        }
        this.f41555w.getClass();
        int childCount = n31Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = n31Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.i8) {
                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) childAt;
                i8Var.d();
                i8Var.e();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f25601x0;
        n31 n31Var = this.f41552n;
        w31 w31Var = this.f41554s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.K) {
                    v4.h0 adapter = n31Var.getAdapter();
                    if (adapter != null) {
                        adapter.n(0, adapter.b(), 0);
                        return;
                    }
                    return;
                }
                w31Var.G();
            }
        } else if (i7 == org.telegram.messenger.ns.f25615z0) {
            if (this.L != org.telegram.messenger.si.b0(this.f41547a).X()) {
                this.K = false;
            }
            if (this.K) {
                v4.h0 adapter2 = n31Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.n(0, adapter2.b(), 0);
                    return;
                }
                return;
            }
            w31Var.G();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i7;
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
            Integer num = (Integer) this.f41554s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                o31 o31Var = this.f41553r;
                View m10 = o31Var.m(intValue);
                if (m10 != null) {
                    i7 = (int) m10.getY();
                    i10 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i7 = -1;
                    i10 = -1;
                }
                View m11 = o31Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i7 = (int) m11.getY();
                    }
                    i10 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
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
        this.G = false;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.G) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f41552n.dispatchTouchEvent(obtain);
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
        v4.h0 adapter = this.f41552n.getAdapter();
        adapter.g(adapter.b() - 1);
        this.J = false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        Integer num;
        super.onLayout(z10, i7, i10, i11, i12);
        if (!this.J) {
            this.J = true;
            w31 w31Var = this.f41554s;
            w31Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.P;
            if (stickerSetCovered != null && (num = (Integer) w31Var.h.get(stickerSetCovered)) != null) {
                this.f41553r.h1(num.intValue(), org.telegram.messenger.g0.L(58.0f) + (-this.f41552n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i7) {
        int L = org.telegram.messenger.g0.L(58.0f) + i7;
        n31 n31Var = this.f41552n;
        if (n31Var.getPaddingTop() != L) {
            this.I = true;
            n31Var.setPadding(0, L, 0, 0);
            this.I = false;
        }
    }

    public void setOnScrollListener(v4.t0 t0Var) {
        this.E = t0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.e2 e2Var) {
        this.f41557y = e2Var;
    }
}
