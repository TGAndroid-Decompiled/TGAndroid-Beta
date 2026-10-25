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
public final class p61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final org.telegram.ui.ActionBar.u6 P;
    public float Q;
    public final Paint R;
    public final int f31449a;
    public final m61 f31450b;
    public final TLRPC.StickerSetCovered[] f31451c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f31452f;
    public final e61 h;
    public final f61 f31453n;
    public final g61 f31454r;
    public final o61 f31455s;
    public final ig.d2 v;
    public final FrameLayout f31456w;
    public org.telegram.ui.ActionBar.r2 f31457x;
    public s4.u0 f31458y;

    public p61(Context context, final m61 m61Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f31449a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f31450b = m61Var;
        this.f31451c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = u6Var;
        o61 o61Var = new o61(this, context);
        this.f31455s = o61Var;
        this.v = new ig.d2(context, new d61(this, m61Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, u6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31456w = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, frameLayout, u6Var);
        e61 e61Var = new e61(this, context, u6Var);
        this.h = e61Var;
        e61Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(e61Var, gb1.i(-1, -1, 48));
        f61 f61Var = new f61(this, context, m61Var);
        this.f31453n = f61Var;
        final j jVar = new j(this, 19);
        f61Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return m61Var.e(p61.this.f31453n, jVar2, motionEvent);
            }
        });
        f61Var.setOverScrollMode(2);
        f61Var.setClipToPadding(false);
        f61Var.setItemAnimator(null);
        f61Var.setLayoutAnimation(null);
        g61 g61Var = new g61(this, AndroidUtilities.dp(58.0f), f61Var);
        this.f31454r = g61Var;
        f61Var.setLayoutManager(g61Var);
        g61Var.O = new h61(this);
        f61Var.setOnScrollListener(new i61(this));
        f61Var.setAdapter(o61Var);
        f61Var.setOnItemClickListener(jVar);
        addView(f61Var, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f31452f = view;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view, u6Var);
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, gb1.i(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z10) {
        float f7;
        if (this.G != z10) {
            this.G = z10;
            ViewPropertyAnimator animate = this.f31452f.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.vh.p(animate, f7, 200L);
        }
    }

    public final void a(boolean z10) {
        this.M = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.L == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new l61(this, contentTopOffset));
                this.L.addListener(new h31(this, 3));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.q1.f22961w);
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
        j61 j61Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f22047id = stickerSet.f22054id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            m61 m61Var = this.f31450b;
            m61Var.getClass();
            if (m61Var instanceof kx) {
                j61Var = new j61(this);
            } else {
                j61Var = null;
            }
            cz0 cz0Var = new cz0(getContext(), this.f31457x, inputStickerSet2, null, j61Var, this.P);
            cz0Var.f27298j0 = false;
            cz0Var.f27290c0 = new k61(this, inputStickerSet2);
            this.f31457x.showDialog(cz0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z10;
        f61 f61Var = this.f31453n;
        int childCount = f61Var.getChildCount();
        View view = this.f31452f;
        FrameLayout frameLayout = this.f31456w;
        if (childCount <= 0) {
            int paddingTop = f61Var.getPaddingTop();
            this.E = paddingTop;
            f61Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = f61Var.getChildAt(0);
        for (int i11 = 1; i11 < f61Var.getChildCount(); i11++) {
            View childAt2 = f61Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        vl0 vl0Var = (vl0) f61Var.G(childAt);
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
        f61Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        f61 f61Var = this.f31453n;
        s4.h0 adapter = f61Var.getAdapter();
        o61 o61Var = this.f31455s;
        if (adapter == o61Var) {
            o61Var.getClass();
            return;
        }
        this.v.getClass();
        int childCount = f61Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = f61Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s8) {
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) childAt;
                s8Var.d();
                s8Var.e();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        f61 f61Var = this.f31453n;
        o61 o61Var = this.f31455s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    s4.h0 adapter = f61Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                o61Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.K != MediaDataController.getInstance(this.f31449a).getFeaturedStickersHashWithoutUnread(false)) {
                this.J = false;
            }
            if (this.J) {
                s4.h0 adapter2 = f61Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            o61Var.G();
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
            Integer num = (Integer) this.f31455s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                g61 g61Var = this.f31454r;
                View m10 = g61Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = g61Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
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
            this.f31453n.dispatchTouchEvent(obtain);
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
        s4.h0 adapter = this.f31453n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.I) {
            this.I = true;
            o61 o61Var = this.f31455s;
            o61Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) o61Var.h.get(stickerSetCovered)) != null) {
                this.f31454r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f31453n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        f61 f61Var = this.f31453n;
        if (f61Var.getPaddingTop() != dp) {
            this.H = true;
            f61Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.u0 u0Var) {
        this.f31458y = u0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.r2 r2Var) {
        this.f31457x = r2Var;
    }
}
