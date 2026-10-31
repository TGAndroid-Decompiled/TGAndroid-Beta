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
public final class w41 extends FrameLayout implements org.telegram.messenger.us {
    public s4.s0 D;
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
    public final org.telegram.ui.ActionBar.p6 P;
    public float Q;
    public final Paint R;
    public final int f31995a;
    public final s41 f31996b;
    public final TLRPC.StickerSetCovered[] f31997c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f31998f;
    public final k41 h;
    public final l41 f31999n;
    public final m41 f32000r;
    public final v41 f32001s;
    public final zf.o1 f32002w;
    public final FrameLayout f32003x;
    public org.telegram.ui.ActionBar.k2 f32004y;

    public w41(Context context, final s41 s41Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10 = org.telegram.messenger.d20.f15147s0;
        this.f31995a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f31996b = s41Var;
        this.f31997c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = p6Var;
        v41 v41Var = new v41(this, context);
        this.f32001s = v41Var;
        this.f32002w = new zf.o1(context, new j41(this, s41Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, p6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32003x = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, frameLayout, p6Var);
        k41 k41Var = new k41(this, context, p6Var);
        this.h = k41Var;
        k41Var.setHint(org.telegram.messenger.cd.L0(2131745722, null));
        frameLayout.addView(k41Var, w7.b6.e(-1, -1, 48));
        l41 l41Var = new l41(this, context, s41Var);
        this.f31999n = l41Var;
        final k kVar = new k(this, 19);
        l41Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return s41Var.e(w41.this.f31999n, kVar2, motionEvent);
            }
        });
        l41Var.setOverScrollMode(2);
        l41Var.setClipToPadding(false);
        l41Var.setItemAnimator(null);
        l41Var.setLayoutAnimation(null);
        m41 m41Var = new m41(this, org.telegram.messenger.i0.L(58.0f), l41Var);
        this.f32000r = m41Var;
        l41Var.setLayoutManager(m41Var);
        m41Var.O = new n41(this);
        l41Var.setOnScrollListener(new o41(this));
        l41Var.setAdapter(v41Var);
        l41Var.setOnItemClickListener(kVar);
        addView(l41Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f31998f = view;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.V5, view, p6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1());
        layoutParams.topMargin = org.telegram.messenger.i0.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, w7.b6.e(-1, 58, 51));
        d();
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(i10);
        f7.c(this, org.telegram.messenger.zs.f19718x0);
        f7.c(this, org.telegram.messenger.zs.f19731z0);
    }

    private void setShadowVisible(boolean z10) {
        float f7;
        if (this.G != z10) {
            this.G = z10;
            ViewPropertyAnimator animate = this.f31998f.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.z20.l(animate, f7, 200L);
        }
    }

    public final void a(boolean z10) {
        this.M = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.L == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new r41(this, contentTopOffset));
                this.L.addListener(new p11(this, 3));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.m1.f20561w);
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
        p41 p41Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f19813id = stickerSet.f19820id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            s41 s41Var = this.f31996b;
            s41Var.getClass();
            if (s41Var instanceof ow) {
                p41Var = new p41(this);
            } else {
                p41Var = null;
            }
            cx0 cx0Var = new cx0(getContext(), this.f32004y, inputStickerSet2, null, p41Var, this.P);
            cx0Var.a2 = false;
            cx0Var.T1 = new q41(this, inputStickerSet2);
            this.f32004y.showDialog(cx0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z10;
        l41 l41Var = this.f31999n;
        int childCount = l41Var.getChildCount();
        View view = this.f31998f;
        FrameLayout frameLayout = this.f32003x;
        if (childCount <= 0) {
            int paddingTop = l41Var.getPaddingTop();
            this.E = paddingTop;
            l41Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = l41Var.getChildAt(0);
        for (int i11 = 1; i11 < l41Var.getChildCount(); i11++) {
            View childAt2 = l41Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        ck0 ck0Var = (ck0) l41Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.i0.L(58.0f);
        if (top > 0 && ck0Var != null && ck0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        if (top < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setShadowVisible(z10);
        if (this.E == i10) {
            return false;
        }
        this.E = i10;
        l41Var.setTopGlowOffset(org.telegram.messenger.i0.L(58.0f) + i10);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        l41 l41Var = this.f31999n;
        s4.g0 adapter = l41Var.getAdapter();
        v41 v41Var = this.f32001s;
        if (adapter == v41Var) {
            v41Var.getClass();
            return;
        }
        this.f32002w.getClass();
        int childCount = l41Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = l41Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.n8) {
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) childAt;
                n8Var.d();
                n8Var.e();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.f19718x0;
        l41 l41Var = this.f31999n;
        v41 v41Var = this.f32001s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    s4.g0 adapter = l41Var.getAdapter();
                    if (adapter != null) {
                        adapter.n(0, adapter.b(), 0);
                        return;
                    }
                    return;
                }
                v41Var.G();
            }
        } else if (i10 == org.telegram.messenger.zs.f19731z0) {
            if (this.K != org.telegram.messenger.ui.b0(this.f31995a).X()) {
                this.J = false;
            }
            if (this.J) {
                s4.g0 adapter2 = l41Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.n(0, adapter2.b(), 0);
                    return;
                }
                return;
            }
            v41Var.G();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i10;
        int i11;
        float f7;
        float f10 = this.Q;
        if (f10 != 0.0f && (stickerSetCovered = this.O) != null) {
            float f11 = f10 - 0.0053333333f;
            this.Q = f11;
            if (f11 < 0.0f) {
                this.Q = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.f32001s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                m41 m41Var = this.f32000r;
                View m10 = m41Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = m41Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
                    Paint paint = this.R;
                    paint.setColor(x02);
                    float f12 = this.Q;
                    if (f12 < 0.06f) {
                        f7 = f12 / 0.06f;
                    } else {
                        f7 = 1.0f;
                    }
                    paint.setAlpha((int) (f7 * 25.5f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, i10, getMeasuredWidth(), i11, paint);
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
            this.f31999n.dispatchTouchEvent(obtain);
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
        s4.g0 adapter = this.f31999n.getAdapter();
        adapter.g(adapter.b() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.I) {
            this.I = true;
            v41 v41Var = this.f32001s;
            v41Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) v41Var.h.get(stickerSetCovered)) != null) {
                this.f32000r.h1(num.intValue(), org.telegram.messenger.i0.L(58.0f) + (-this.f31999n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int L = org.telegram.messenger.i0.L(58.0f) + i10;
        l41 l41Var = this.f31999n;
        if (l41Var.getPaddingTop() != L) {
            this.H = true;
            l41Var.setPadding(0, L, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.D = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        this.f32004y = k2Var;
    }
}
