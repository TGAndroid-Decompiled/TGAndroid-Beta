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
public final class j41 extends FrameLayout implements org.telegram.messenger.fs {
    public v4.u0 E;
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
    public final org.telegram.ui.ActionBar.i6 Q;
    public float R;
    public final Paint S;
    public final int f36260a;
    public final g41 f36261b;
    public final TLRPC.StickerSetCovered[] f36262c;
    public final LongSparseArray d;
    public final LongSparseArray f36263e;
    public final View f36264f;
    public final y31 h;
    public final z31 f36265n;
    public final a41 f36266r;
    public final i41 f36267s;
    public final jg.c2 f36268w;
    public final FrameLayout f36269x;
    public org.telegram.ui.ActionBar.g2 f36270y;

    public j41(Context context, final g41 g41Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7 = org.telegram.messenger.i10.f24637t0;
        this.f36260a = i7;
        this.R = 1.0f;
        this.S = new Paint();
        this.f36261b = g41Var;
        this.f36262c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f36263e = longSparseArray2;
        this.P = stickerSetCovered;
        this.Q = i6Var;
        i41 i41Var = new i41(this, context);
        this.f36267s = i41Var;
        this.f36268w = new jg.c2(context, new x31(this, g41Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, i6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36269x = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, frameLayout, i6Var);
        y31 y31Var = new y31(this, context, i6Var);
        this.h = y31Var;
        y31Var.setHint(org.telegram.messenger.gd.N0(2131745509, null));
        frameLayout.addView(y31Var, c8.na.e(-1, -1, 48));
        z31 z31Var = new z31(this, context, g41Var);
        this.f36265n = z31Var;
        final n nVar = new n(this, 20);
        z31Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                n nVar2 = nVar;
                return g41Var.e(j41.this.f36265n, nVar2, motionEvent);
            }
        });
        z31Var.setOverScrollMode(2);
        z31Var.setClipToPadding(false);
        z31Var.setItemAnimator(null);
        z31Var.setLayoutAnimation(null);
        a41 a41Var = new a41(this, org.telegram.messenger.g0.L(58.0f), z31Var);
        this.f36266r = a41Var;
        z31Var.setLayoutManager(a41Var);
        a41Var.O = new b41(this);
        z31Var.setOnScrollListener(new c41(this));
        z31Var.setAdapter(i41Var);
        z31Var.setOnItemClickListener(nVar);
        addView(z31Var, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f36264f = view;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view, i6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1());
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, c8.na.e(-1, 58, 51));
        d();
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(i7);
        f10.c(this, org.telegram.messenger.ks.f25317x0);
        f10.c(this, org.telegram.messenger.ks.f25331z0);
    }

    private void setShadowVisible(boolean z10) {
        float f10;
        if (this.H != z10) {
            this.H = z10;
            ViewPropertyAnimator animate = this.f36264f.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.m10.n(animate, f10, 200L);
        }
    }

    public final void a(boolean z10) {
        this.N = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.M == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.M = ofFloat;
                ofFloat.addUpdateListener(new f41(this, contentTopOffset));
                this.M.addListener(new s11(this, 2));
                this.M.setDuration(250L);
                this.M.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
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
        d41 d41Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f28512id = stickerSet.f28519id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            g41 g41Var = this.f36261b;
            g41Var.getClass();
            if (g41Var instanceof lw) {
                d41Var = new d41(this);
            } else {
                d41Var = null;
            }
            jw0 jw0Var = new jw0(getContext(), this.f36270y, inputStickerSet2, null, d41Var, this.Q);
            jw0Var.f36530e2 = false;
            jw0Var.X1 = new e41(this, inputStickerSet2);
            this.f36270y.showDialog(jw0Var);
        }
    }

    public final boolean c() {
        int i7;
        boolean z10;
        z31 z31Var = this.f36265n;
        int childCount = z31Var.getChildCount();
        View view = this.f36264f;
        FrameLayout frameLayout = this.f36269x;
        if (childCount <= 0) {
            int paddingTop = z31Var.getPaddingTop();
            this.F = paddingTop;
            z31Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.F);
            view.setTranslationY(this.F);
            setShadowVisible(false);
            return true;
        }
        View childAt = z31Var.getChildAt(0);
        for (int i10 = 1; i10 < z31Var.getChildCount(); i10++) {
            View childAt2 = z31Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        mj0 mj0Var = (mj0) z31Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(58.0f);
        if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
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
        z31Var.setTopGlowOffset(org.telegram.messenger.g0.L(58.0f) + i7);
        frameLayout.setTranslationY(this.F);
        view.setTranslationY(this.F);
        return true;
    }

    public final void d() {
        z31 z31Var = this.f36265n;
        v4.i0 adapter = z31Var.getAdapter();
        i41 i41Var = this.f36267s;
        if (adapter == i41Var) {
            i41Var.getClass();
            return;
        }
        this.f36268w.getClass();
        int childCount = z31Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = z31Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.j8) {
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) childAt;
                j8Var.d();
                j8Var.e();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25317x0;
        z31 z31Var = this.f36265n;
        i41 i41Var = this.f36267s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.K) {
                    v4.i0 adapter = z31Var.getAdapter();
                    if (adapter != null) {
                        adapter.n(0, adapter.b(), 0);
                        return;
                    }
                    return;
                }
                i41Var.G();
            }
        } else if (i7 == org.telegram.messenger.ks.f25331z0) {
            if (this.L != org.telegram.messenger.ri.d0(this.f36260a).Z()) {
                this.K = false;
            }
            if (this.K) {
                v4.i0 adapter2 = z31Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.n(0, adapter2.b(), 0);
                    return;
                }
                return;
            }
            i41Var.G();
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
            Integer num = (Integer) this.f36267s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                a41 a41Var = this.f36266r;
                View m10 = a41Var.m(intValue);
                if (m10 != null) {
                    i7 = (int) m10.getY();
                    i10 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i7 = -1;
                    i10 = -1;
                }
                View m11 = a41Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i7 = (int) m11.getY();
                    }
                    i10 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
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
            this.f36265n.dispatchTouchEvent(obtain);
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
        v4.i0 adapter = this.f36265n.getAdapter();
        adapter.g(adapter.b() - 1);
        this.J = false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        Integer num;
        super.onLayout(z10, i7, i10, i11, i12);
        if (!this.J) {
            this.J = true;
            i41 i41Var = this.f36267s;
            i41Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.P;
            if (stickerSetCovered != null && (num = (Integer) i41Var.h.get(stickerSetCovered)) != null) {
                this.f36266r.h1(num.intValue(), org.telegram.messenger.g0.L(58.0f) + (-this.f36265n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i7) {
        int L = org.telegram.messenger.g0.L(58.0f) + i7;
        z31 z31Var = this.f36265n;
        if (z31Var.getPaddingTop() != L) {
            this.I = true;
            z31Var.setPadding(0, L, 0, 0);
            this.I = false;
        }
    }

    public void setOnScrollListener(v4.u0 u0Var) {
        this.E = u0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        this.f36270y = g2Var;
    }
}
