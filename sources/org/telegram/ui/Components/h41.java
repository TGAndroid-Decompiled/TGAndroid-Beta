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
public final class h41 extends FrameLayout implements org.telegram.messenger.fs {
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
    public final int f35714a;
    public final e41 f35715b;
    public final TLRPC.StickerSetCovered[] f35716c;
    public final LongSparseArray d;
    public final LongSparseArray f35717e;
    public final View f35718f;
    public final w31 h;
    public final x31 f35719n;
    public final y31 f35720r;
    public final g41 f35721s;
    public final jg.c2 f35722w;
    public final FrameLayout f35723x;
    public org.telegram.ui.ActionBar.h2 f35724y;

    public h41(Context context, final e41 e41Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7 = org.telegram.messenger.j10.f24773t0;
        this.f35714a = i7;
        this.R = 1.0f;
        this.S = new Paint();
        this.f35715b = e41Var;
        this.f35716c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f35717e = longSparseArray2;
        this.P = stickerSetCovered;
        this.Q = i6Var;
        g41 g41Var = new g41(this, context);
        this.f35721s = g41Var;
        this.f35722w = new jg.c2(context, new v31(this, e41Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, i6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35723x = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29469h5, frameLayout, i6Var);
        w31 w31Var = new w31(this, context, i6Var);
        this.h = w31Var;
        w31Var.setHint(org.telegram.messenger.gd.M0(2131745510, null));
        frameLayout.addView(w31Var, c8.ma.e(-1, -1, 48));
        x31 x31Var = new x31(this, context, e41Var);
        this.f35719n = x31Var;
        final n nVar = new n(this, 20);
        x31Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                n nVar2 = nVar;
                return e41Var.e(h41.this.f35719n, nVar2, motionEvent);
            }
        });
        x31Var.setOverScrollMode(2);
        x31Var.setClipToPadding(false);
        x31Var.setItemAnimator(null);
        x31Var.setLayoutAnimation(null);
        y31 y31Var = new y31(this, org.telegram.messenger.g0.L(58.0f), x31Var);
        this.f35720r = y31Var;
        x31Var.setLayoutManager(y31Var);
        y31Var.O = new z31(this);
        x31Var.setOnScrollListener(new a41(this));
        x31Var.setAdapter(g41Var);
        x31Var.setOnItemClickListener(nVar);
        addView(x31Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f35718f = view;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view, i6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1());
        layoutParams.topMargin = org.telegram.messenger.g0.L(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, c8.ma.e(-1, 58, 51));
        d();
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(i7);
        f10.c(this, org.telegram.messenger.ks.f25220x0);
        f10.c(this, org.telegram.messenger.ks.f25234z0);
    }

    private void setShadowVisible(boolean z10) {
        float f10;
        if (this.H != z10) {
            this.H = z10;
            ViewPropertyAnimator animate = this.f35718f.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.n10.n(animate, f10, 200L);
        }
    }

    public final void a(boolean z10) {
        this.N = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.M == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.M = ofFloat;
                ofFloat.addUpdateListener(new d41(this, contentTopOffset));
                this.M.addListener(new s11(this, 2));
                this.M.setDuration(250L);
                this.M.setInterpolator(org.telegram.ui.ActionBar.j1.f29019w);
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
        b41 b41Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f28425id = stickerSet.f28432id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            e41 e41Var = this.f35715b;
            e41Var.getClass();
            if (e41Var instanceof mw) {
                b41Var = new b41(this);
            } else {
                b41Var = null;
            }
            iw0 iw0Var = new iw0(getContext(), this.f35724y, inputStickerSet2, null, b41Var, this.Q);
            iw0Var.f36236e2 = false;
            iw0Var.X1 = new c41(this, inputStickerSet2);
            this.f35724y.showDialog(iw0Var);
        }
    }

    public final boolean c() {
        int i7;
        boolean z10;
        x31 x31Var = this.f35719n;
        int childCount = x31Var.getChildCount();
        View view = this.f35718f;
        FrameLayout frameLayout = this.f35723x;
        if (childCount <= 0) {
            int paddingTop = x31Var.getPaddingTop();
            this.F = paddingTop;
            x31Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.F);
            view.setTranslationY(this.F);
            setShadowVisible(false);
            return true;
        }
        View childAt = x31Var.getChildAt(0);
        for (int i10 = 1; i10 < x31Var.getChildCount(); i10++) {
            View childAt2 = x31Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        kj0 kj0Var = (kj0) x31Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(58.0f);
        if (top > 0 && kj0Var != null && kj0Var.b() == 0) {
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
        x31Var.setTopGlowOffset(org.telegram.messenger.g0.L(58.0f) + i7);
        frameLayout.setTranslationY(this.F);
        view.setTranslationY(this.F);
        return true;
    }

    public final void d() {
        x31 x31Var = this.f35719n;
        v4.i0 adapter = x31Var.getAdapter();
        g41 g41Var = this.f35721s;
        if (adapter == g41Var) {
            g41Var.getClass();
            return;
        }
        this.f35722w.getClass();
        int childCount = x31Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = x31Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.j8) {
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) childAt;
                j8Var.d();
                j8Var.e();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25220x0;
        x31 x31Var = this.f35719n;
        g41 g41Var = this.f35721s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.K) {
                    v4.i0 adapter = x31Var.getAdapter();
                    if (adapter != null) {
                        adapter.n(0, adapter.b(), 0);
                        return;
                    }
                    return;
                }
                g41Var.G();
            }
        } else if (i7 == org.telegram.messenger.ks.f25234z0) {
            if (this.L != org.telegram.messenger.ri.d0(this.f35714a).Z()) {
                this.K = false;
            }
            if (this.K) {
                v4.i0 adapter2 = x31Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.n(0, adapter2.b(), 0);
                    return;
                }
                return;
            }
            g41Var.G();
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
            Integer num = (Integer) this.f35721s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                y31 y31Var = this.f35720r;
                View m10 = y31Var.m(intValue);
                if (m10 != null) {
                    i7 = (int) m10.getY();
                    i10 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i7 = -1;
                    i10 = -1;
                }
                View m11 = y31Var.m(num.intValue() + 1);
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
            this.f35719n.dispatchTouchEvent(obtain);
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
        v4.i0 adapter = this.f35719n.getAdapter();
        adapter.g(adapter.b() - 1);
        this.J = false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        Integer num;
        super.onLayout(z10, i7, i10, i11, i12);
        if (!this.J) {
            this.J = true;
            g41 g41Var = this.f35721s;
            g41Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.P;
            if (stickerSetCovered != null && (num = (Integer) g41Var.h.get(stickerSetCovered)) != null) {
                this.f35720r.h1(num.intValue(), org.telegram.messenger.g0.L(58.0f) + (-this.f35719n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i7) {
        int L = org.telegram.messenger.g0.L(58.0f) + i7;
        x31 x31Var = this.f35719n;
        if (x31Var.getPaddingTop() != L) {
            this.I = true;
            x31Var.setPadding(0, L, 0, 0);
            this.I = false;
        }
    }

    public void setOnScrollListener(v4.u0 u0Var) {
        this.E = u0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.h2 h2Var) {
        this.f35724y = h2Var;
    }
}
