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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class h61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final int f26878a;
    public final e61 f26879b;
    public final TLRPC.StickerSetCovered[] f26880c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f26881f;
    public final w51 h;
    public final x51 f26882n;
    public final y51 f26883r;
    public final g61 f26884s;
    public final hg.e2 v;
    public final FrameLayout f26885w;
    public org.telegram.ui.ActionBar.o2 f26886x;
    public s4.r0 f26887y;

    public h61(Context context, final e61 e61Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f26878a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f26879b = e61Var;
        this.f26880c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = g6Var;
        g61 g61Var = new g61(this, context);
        this.f26884s = g61Var;
        this.v = new hg.e2(context, new v51(this, e61Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, g6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26885w = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, frameLayout, g6Var);
        w51 w51Var = new w51(this, context, g6Var);
        this.h = w51Var;
        w51Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(w51Var, w7.z5.e(-1, -1, 48));
        x51 x51Var = new x51(this, context, e61Var);
        this.f26882n = x51Var;
        final j jVar = new j(this, 19);
        x51Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return e61Var.e(h61.this.f26882n, jVar2, motionEvent);
            }
        });
        x51Var.setOverScrollMode(2);
        x51Var.setClipToPadding(false);
        x51Var.setItemAnimator(null);
        x51Var.setLayoutAnimation(null);
        y51 y51Var = new y51(this, AndroidUtilities.dp(58.0f), x51Var);
        this.f26883r = y51Var;
        x51Var.setLayoutManager(y51Var);
        y51Var.O = new z51(this);
        x51Var.setOnScrollListener(new a61(this));
        x51Var.setAdapter(g61Var);
        x51Var.setOnItemClickListener(jVar);
        addView(x51Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f26881f = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, g6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, w7.z5.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z10) {
        float f7;
        if (this.G != z10) {
            this.G = z10;
            ViewPropertyAnimator animate = this.f26881f.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.tl.s(animate, f7, 200L);
        }
    }

    public final void a(boolean z10) {
        this.M = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.L == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new d61(this, contentTopOffset));
                this.L.addListener(new o31(this, 2));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.o1.f21718w);
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
        b61 b61Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f20364id = stickerSet.f20371id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            e61 e61Var = this.f26879b;
            e61Var.getClass();
            if (e61Var instanceof kx) {
                b61Var = new b61(this);
            } else {
                b61Var = null;
            }
            sy0 sy0Var = new sy0(getContext(), this.f26886x, inputStickerSet2, null, b61Var, this.P);
            sy0Var.f30646j0 = false;
            sy0Var.f30638c0 = new c61(this, inputStickerSet2);
            this.f26886x.showDialog(sy0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z10;
        x51 x51Var = this.f26882n;
        int childCount = x51Var.getChildCount();
        View view = this.f26881f;
        FrameLayout frameLayout = this.f26885w;
        if (childCount <= 0) {
            int paddingTop = x51Var.getPaddingTop();
            this.E = paddingTop;
            x51Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = x51Var.getChildAt(0);
        for (int i11 = 1; i11 < x51Var.getChildCount(); i11++) {
            View childAt2 = x51Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        vl0 vl0Var = (vl0) x51Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
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
        x51Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        x51 x51Var = this.f26882n;
        s4.g0 adapter = x51Var.getAdapter();
        g61 g61Var = this.f26884s;
        if (adapter == g61Var) {
            g61Var.getClass();
            return;
        }
        this.v.getClass();
        int childCount = x51Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = x51Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.o8) {
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) childAt;
                o8Var.d();
                o8Var.e();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        x51 x51Var = this.f26882n;
        g61 g61Var = this.f26884s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    s4.g0 adapter = x51Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                g61Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.K != MediaDataController.getInstance(this.f26878a).getFeaturedStickersHashWithoutUnread(false)) {
                this.J = false;
            }
            if (this.J) {
                s4.g0 adapter2 = x51Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            g61Var.G();
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
            Integer num = (Integer) this.f26884s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                y51 y51Var = this.f26883r;
                View m10 = y51Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = y51Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
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
            this.f26882n.dispatchTouchEvent(obtain);
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
        s4.g0 adapter = this.f26882n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.I) {
            this.I = true;
            g61 g61Var = this.f26884s;
            g61Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) g61Var.h.get(stickerSetCovered)) != null) {
                this.f26883r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f26882n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        x51 x51Var = this.f26882n;
        if (x51Var.getPaddingTop() != dp) {
            this.H = true;
            x51Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.r0 r0Var) {
        this.f26887y = r0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        this.f26886x = o2Var;
    }
}
