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
public final class t31 extends FrameLayout implements org.telegram.messenger.ls {
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
    public final int f38224a;
    public final p31 f38225b;
    public final TLRPC.StickerSetCovered[] f38226c;
    public final LongSparseArray d;
    public final LongSparseArray f38227e;
    public final View f38228f;
    public final h31 h;
    public final i31 f38229n;
    public final j31 f38230r;
    public final s31 f38231s;
    public final jg.d2 f38232w;
    public final FrameLayout f38233x;
    public org.telegram.ui.ActionBar.f2 f38234y;

    public t31(Context context, final p31 p31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7 = org.telegram.messenger.p10.f24470s0;
        this.f38224a = i7;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f38225b = p31Var;
        this.f38226c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f38227e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = f6Var;
        s31 s31Var = new s31(this, context);
        this.f38231s = s31Var;
        this.f38232w = new jg.d2(context, new g31(this, p31Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38233x = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27925h5, frameLayout, f6Var);
        h31 h31Var = new h31(this, context, f6Var);
        this.h = h31Var;
        h31Var.setHint(org.telegram.messenger.id.M0(2131745708, null));
        frameLayout.addView(h31Var, c8.ha.e(-1, -1, 48));
        i31 i31Var = new i31(this, context, p31Var);
        this.f38229n = i31Var;
        final k kVar = new k(this, 20);
        i31Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return p31Var.e(t31.this.f38229n, kVar2, motionEvent);
            }
        });
        i31Var.setOverScrollMode(2);
        i31Var.setClipToPadding(false);
        i31Var.setItemAnimator(null);
        i31Var.setLayoutAnimation(null);
        j31 j31Var = new j31(this, org.telegram.messenger.g0.L(58.0f), i31Var);
        this.f38230r = j31Var;
        i31Var.setLayoutManager(j31Var);
        j31Var.O = new k31(this);
        i31Var.setOnScrollListener(new l31(this));
        i31Var.setAdapter(s31Var);
        i31Var.setOnItemClickListener(kVar);
        addView(i31Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f38228f = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, f6Var);
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
            ViewPropertyAnimator animate = this.f38228f.animate();
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
                ofFloat.addUpdateListener(new o31(this, contentTopOffset));
                this.L.addListener(new f11(this, 2));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.i1.f27544w);
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
        m31 m31Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f26976id = stickerSet.f26983id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            p31 p31Var = this.f38225b;
            p31Var.getClass();
            if (p31Var instanceof bw) {
                m31Var = new m31(this);
            } else {
                m31Var = null;
            }
            yv0 yv0Var = new yv0(getContext(), this.f38234y, inputStickerSet2, null, m31Var, this.P);
            yv0Var.f40776a2 = false;
            yv0Var.T1 = new n31(this, inputStickerSet2);
            this.f38234y.showDialog(yv0Var);
        }
    }

    public final boolean c() {
        int i7;
        boolean z9;
        i31 i31Var = this.f38229n;
        int childCount = i31Var.getChildCount();
        View view = this.f38228f;
        FrameLayout frameLayout = this.f38233x;
        if (childCount <= 0) {
            int paddingTop = i31Var.getPaddingTop();
            this.E = paddingTop;
            i31Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = i31Var.getChildAt(0);
        for (int i10 = 1; i10 < i31Var.getChildCount(); i10++) {
            View childAt2 = i31Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        xi0 xi0Var = (xi0) i31Var.G(childAt);
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
        i31Var.setTopGlowOffset(org.telegram.messenger.g0.L(58.0f) + i7);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        i31 i31Var = this.f38229n;
        v4.g0 adapter = i31Var.getAdapter();
        s31 s31Var = this.f38231s;
        if (adapter == s31Var) {
            s31Var.getClass();
            return;
        }
        this.f38232w.getClass();
        int childCount = i31Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = i31Var.getChildAt(i7);
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
        i31 i31Var = this.f38229n;
        s31 s31Var = this.f38231s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    v4.g0 adapter = i31Var.getAdapter();
                    if (adapter != null) {
                        adapter.n(0, adapter.b(), 0);
                        return;
                    }
                    return;
                }
                s31Var.G();
            }
        } else if (i7 == org.telegram.messenger.qs.f25118z0) {
            if (this.K != org.telegram.messenger.ui.b0(this.f38224a).X()) {
                this.J = false;
            }
            if (this.J) {
                v4.g0 adapter2 = i31Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.n(0, adapter2.b(), 0);
                    return;
                }
                return;
            }
            s31Var.G();
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
            Integer num = (Integer) this.f38231s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                j31 j31Var = this.f38230r;
                View m10 = j31Var.m(intValue);
                if (m10 != null) {
                    i7 = (int) m10.getY();
                    i10 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i7 = -1;
                    i10 = -1;
                }
                View m11 = j31Var.m(num.intValue() + 1);
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
            this.f38229n.dispatchTouchEvent(obtain);
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
        v4.g0 adapter = this.f38229n.getAdapter();
        adapter.g(adapter.b() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        Integer num;
        super.onLayout(z9, i7, i10, i11, i12);
        if (!this.I) {
            this.I = true;
            s31 s31Var = this.f38231s;
            s31Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) s31Var.h.get(stickerSetCovered)) != null) {
                this.f38230r.h1(num.intValue(), org.telegram.messenger.g0.L(58.0f) + (-this.f38229n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i7) {
        int L = org.telegram.messenger.g0.L(58.0f) + i7;
        i31 i31Var = this.f38229n;
        if (i31Var.getPaddingTop() != L) {
            this.H = true;
            i31Var.setPadding(0, L, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(v4.s0 s0Var) {
        this.D = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        this.f38234y = f2Var;
    }
}
