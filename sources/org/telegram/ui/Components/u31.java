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
public final class u31 extends FrameLayout implements org.telegram.messenger.ls {
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
    public final org.telegram.ui.ActionBar.g6 P;
    public float Q;
    public final Paint R;
    public final int f38578a;
    public final q31 f38579b;
    public final TLRPC.StickerSetCovered[] f38580c;
    public final LongSparseArray d;
    public final LongSparseArray f38581e;
    public final View f38582f;
    public final i31 h;
    public final j31 f38583n;
    public final k31 f38584r;
    public final t31 f38585s;
    public final jg.d2 f38586w;
    public final FrameLayout f38587x;
    public org.telegram.ui.ActionBar.f2 f38588y;

    public u31(Context context, final q31 q31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i7 = org.telegram.messenger.p10.f24470s0;
        this.f38578a = i7;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f38579b = q31Var;
        this.f38580c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f38581e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = g6Var;
        t31 t31Var = new t31(this, context);
        this.f38585s = t31Var;
        this.f38586w = new jg.d2(context, new h31(this, q31Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, g6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38587x = frameLayout;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, frameLayout, g6Var);
        i31 i31Var = new i31(this, context, g6Var);
        this.h = i31Var;
        i31Var.setHint(org.telegram.messenger.id.M0(2131745705, null));
        frameLayout.addView(i31Var, c8.ha.e(-1, -1, 48));
        j31 j31Var = new j31(this, context, q31Var);
        this.f38583n = j31Var;
        final k kVar = new k(this, 20);
        j31Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return q31Var.e(u31.this.f38583n, kVar2, motionEvent);
            }
        });
        j31Var.setOverScrollMode(2);
        j31Var.setClipToPadding(false);
        j31Var.setItemAnimator(null);
        j31Var.setLayoutAnimation(null);
        k31 k31Var = new k31(this, org.telegram.messenger.g0.L(58.0f), j31Var);
        this.f38584r = k31Var;
        j31Var.setLayoutManager(k31Var);
        k31Var.O = new l31(this);
        j31Var.setOnScrollListener(new m31(this));
        j31Var.setAdapter(t31Var);
        j31Var.setOnItemClickListener(kVar);
        addView(j31Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f38582f = view;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.V5, view, g6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1());
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, c8.ha.e(-1, 58, 51));
        d();
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(i7);
        f10.c(this, org.telegram.messenger.qs.f25104x0);
        f10.c(this, org.telegram.messenger.qs.f25118z0);
    }

    private void setShadowVisible(boolean z9) {
        float f10;
        if (this.G != z9) {
            this.G = z9;
            ViewPropertyAnimator animate = this.f38582f.animate();
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
                ofFloat.addUpdateListener(new p31(this, contentTopOffset));
                this.L.addListener(new g11(this, 2));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.i1.f27519w);
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
        n31 n31Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f26976id = stickerSet.f26983id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            q31 q31Var = this.f38579b;
            q31Var.getClass();
            if (q31Var instanceof bw) {
                n31Var = new n31(this);
            } else {
                n31Var = null;
            }
            zv0 zv0Var = new zv0(getContext(), this.f38588y, inputStickerSet2, null, n31Var, this.P);
            zv0Var.f41144a2 = false;
            zv0Var.T1 = new o31(this, inputStickerSet2);
            this.f38588y.showDialog(zv0Var);
        }
    }

    public final boolean c() {
        int i7;
        boolean z9;
        j31 j31Var = this.f38583n;
        int childCount = j31Var.getChildCount();
        View view = this.f38582f;
        FrameLayout frameLayout = this.f38587x;
        if (childCount <= 0) {
            int paddingTop = j31Var.getPaddingTop();
            this.E = paddingTop;
            j31Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = j31Var.getChildAt(0);
        for (int i10 = 1; i10 < j31Var.getChildCount(); i10++) {
            View childAt2 = j31Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        yi0 yi0Var = (yi0) j31Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(58.0f);
        if (top > 0 && yi0Var != null && yi0Var.b() == 0) {
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
        j31Var.setTopGlowOffset(org.telegram.messenger.g0.L(58.0f) + i7);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        j31 j31Var = this.f38583n;
        v4.g0 adapter = j31Var.getAdapter();
        t31 t31Var = this.f38585s;
        if (adapter == t31Var) {
            t31Var.getClass();
            return;
        }
        this.f38586w.getClass();
        int childCount = j31Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = j31Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.j8) {
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) childAt;
                j8Var.d();
                j8Var.e();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25104x0;
        j31 j31Var = this.f38583n;
        t31 t31Var = this.f38585s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    v4.g0 adapter = j31Var.getAdapter();
                    if (adapter != null) {
                        adapter.n(0, adapter.b(), 0);
                        return;
                    }
                    return;
                }
                t31Var.G();
            }
        } else if (i7 == org.telegram.messenger.qs.f25118z0) {
            if (this.K != org.telegram.messenger.ui.b0(this.f38578a).X()) {
                this.J = false;
            }
            if (this.J) {
                v4.g0 adapter2 = j31Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.n(0, adapter2.b(), 0);
                    return;
                }
                return;
            }
            t31Var.G();
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
            Integer num = (Integer) this.f38585s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                k31 k31Var = this.f38584r;
                View m10 = k31Var.m(intValue);
                if (m10 != null) {
                    i7 = (int) m10.getY();
                    i10 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i7 = -1;
                    i10 = -1;
                }
                View m11 = k31Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i7 = (int) m11.getY();
                    }
                    i10 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false);
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
            this.f38583n.dispatchTouchEvent(obtain);
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
        v4.g0 adapter = this.f38583n.getAdapter();
        adapter.g(adapter.b() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        Integer num;
        super.onLayout(z9, i7, i10, i11, i12);
        if (!this.I) {
            this.I = true;
            t31 t31Var = this.f38585s;
            t31Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) t31Var.h.get(stickerSetCovered)) != null) {
                this.f38584r.h1(num.intValue(), org.telegram.messenger.g0.L(58.0f) + (-this.f38583n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i7) {
        int L = org.telegram.messenger.g0.L(58.0f) + i7;
        j31 j31Var = this.f38583n;
        if (j31Var.getPaddingTop() != L) {
            this.H = true;
            j31Var.setPadding(0, L, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(v4.s0 s0Var) {
        this.D = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        this.f38588y = f2Var;
    }
}
