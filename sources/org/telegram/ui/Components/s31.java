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
public final class s31 extends FrameLayout implements org.telegram.messenger.ls {
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
    public final int f37867a;
    public final o31 f37868b;
    public final TLRPC.StickerSetCovered[] f37869c;
    public final LongSparseArray d;
    public final LongSparseArray f37870e;
    public final View f37871f;
    public final g31 h;
    public final h31 f37872n;
    public final i31 f37873r;
    public final r31 f37874s;
    public final jg.d2 f37875w;
    public final FrameLayout f37876x;
    public org.telegram.ui.ActionBar.f2 f37877y;

    public s31(Context context, final o31 o31Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7 = org.telegram.messenger.p10.f24459s0;
        this.f37867a = i7;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f37868b = o31Var;
        this.f37869c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f37870e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = f6Var;
        r31 r31Var = new r31(this, context);
        this.f37874s = r31Var;
        this.f37875w = new jg.d2(context, new f31(this, o31Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37876x = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27921h5, frameLayout, f6Var);
        g31 g31Var = new g31(this, context, f6Var);
        this.h = g31Var;
        g31Var.setHint(org.telegram.messenger.hd.M0(2131745706, null));
        frameLayout.addView(g31Var, c8.ha.e(-1, -1, 48));
        h31 h31Var = new h31(this, context, o31Var);
        this.f37872n = h31Var;
        final k kVar = new k(this, 20);
        h31Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return o31Var.e(s31.this.f37872n, kVar2, motionEvent);
            }
        });
        h31Var.setOverScrollMode(2);
        h31Var.setClipToPadding(false);
        h31Var.setItemAnimator(null);
        h31Var.setLayoutAnimation(null);
        i31 i31Var = new i31(this, org.telegram.messenger.g0.L(58.0f), h31Var);
        this.f37873r = i31Var;
        h31Var.setLayoutManager(i31Var);
        i31Var.O = new j31(this);
        h31Var.setOnScrollListener(new k31(this));
        h31Var.setAdapter(r31Var);
        h31Var.setOnItemClickListener(kVar);
        addView(h31Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f37871f = view;
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
            ViewPropertyAnimator animate = this.f37871f.animate();
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
                ofFloat.addUpdateListener(new n31(this, contentTopOffset));
                this.L.addListener(new e11(this, 2));
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
        l31 l31Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f26972id = stickerSet.f26979id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            o31 o31Var = this.f37868b;
            o31Var.getClass();
            if (o31Var instanceof aw) {
                l31Var = new l31(this);
            } else {
                l31Var = null;
            }
            yv0 yv0Var = new yv0(getContext(), this.f37877y, inputStickerSet2, null, l31Var, this.P);
            yv0Var.f40740a2 = false;
            yv0Var.T1 = new m31(this, inputStickerSet2);
            this.f37877y.showDialog(yv0Var);
        }
    }

    public final boolean c() {
        int i7;
        boolean z9;
        h31 h31Var = this.f37872n;
        int childCount = h31Var.getChildCount();
        View view = this.f37871f;
        FrameLayout frameLayout = this.f37876x;
        if (childCount <= 0) {
            int paddingTop = h31Var.getPaddingTop();
            this.E = paddingTop;
            h31Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = h31Var.getChildAt(0);
        for (int i10 = 1; i10 < h31Var.getChildCount(); i10++) {
            View childAt2 = h31Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        xi0 xi0Var = (xi0) h31Var.G(childAt);
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
        h31Var.setTopGlowOffset(org.telegram.messenger.g0.L(58.0f) + i7);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        h31 h31Var = this.f37872n;
        v4.g0 adapter = h31Var.getAdapter();
        r31 r31Var = this.f37874s;
        if (adapter == r31Var) {
            r31Var.getClass();
            return;
        }
        this.f37875w.getClass();
        int childCount = h31Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = h31Var.getChildAt(i7);
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
        h31 h31Var = this.f37872n;
        r31 r31Var = this.f37874s;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    v4.g0 adapter = h31Var.getAdapter();
                    if (adapter != null) {
                        adapter.n(0, adapter.b(), 0);
                        return;
                    }
                    return;
                }
                r31Var.G();
            }
        } else if (i7 == org.telegram.messenger.qs.f25101z0) {
            if (this.K != org.telegram.messenger.ui.b0(this.f37867a).X()) {
                this.J = false;
            }
            if (this.J) {
                v4.g0 adapter2 = h31Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.n(0, adapter2.b(), 0);
                    return;
                }
                return;
            }
            r31Var.G();
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
            Integer num = (Integer) this.f37874s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                i31 i31Var = this.f37873r;
                View m10 = i31Var.m(intValue);
                if (m10 != null) {
                    i7 = (int) m10.getY();
                    i10 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i7 = -1;
                    i10 = -1;
                }
                View m11 = i31Var.m(num.intValue() + 1);
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
            this.f37872n.dispatchTouchEvent(obtain);
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
        v4.g0 adapter = this.f37872n.getAdapter();
        adapter.g(adapter.b() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        Integer num;
        super.onLayout(z9, i7, i10, i11, i12);
        if (!this.I) {
            this.I = true;
            r31 r31Var = this.f37874s;
            r31Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) r31Var.h.get(stickerSetCovered)) != null) {
                this.f37873r.h1(num.intValue(), org.telegram.messenger.g0.L(58.0f) + (-this.f37872n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i7) {
        int L = org.telegram.messenger.g0.L(58.0f) + i7;
        h31 h31Var = this.f37872n;
        if (h31Var.getPaddingTop() != L) {
            this.H = true;
            h31Var.setPadding(0, L, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(v4.s0 s0Var) {
        this.D = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        this.f37877y = f2Var;
    }
}
