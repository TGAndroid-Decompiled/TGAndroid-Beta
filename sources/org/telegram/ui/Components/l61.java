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
public final class l61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final org.telegram.ui.ActionBar.e6 P;
    public float Q;
    public final Paint R;
    public final int f28303a;
    public final i61 f28304b;
    public final TLRPC.StickerSetCovered[] f28305c;
    public final LongSparseArray d;
    public final LongSparseArray f28306e;
    public final View f28307f;
    public final a61 h;
    public final b61 f28308n;
    public final c61 f28309r;
    public final k61 f28310s;
    public final gg.f2 v;
    public final FrameLayout f28311w;
    public org.telegram.ui.ActionBar.n2 f28312x;
    public s4.t0 f28313y;

    public l61(Context context, final i61 i61Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f28303a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f28304b = i61Var;
        this.f28305c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f28306e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = e6Var;
        k61 k61Var = new k61(this, context);
        this.f28310s = k61Var;
        this.v = new gg.f2(context, new z51(this, i61Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, e6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28311w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20868h5, e6Var));
        a61 a61Var = new a61(this, context, e6Var);
        this.h = a61Var;
        a61Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(a61Var, w7.x5.e(-1, -1, 48));
        b61 b61Var = new b61(this, context, i61Var);
        this.f28308n = b61Var;
        final j jVar = new j(this, 19);
        b61Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return i61Var.e(l61.this.f28308n, jVar2, motionEvent);
            }
        });
        b61Var.setOverScrollMode(2);
        b61Var.setClipToPadding(false);
        b61Var.setItemAnimator(null);
        b61Var.setLayoutAnimation(null);
        c61 c61Var = new c61(this, AndroidUtilities.dp(58.0f), b61Var);
        this.f28309r = c61Var;
        b61Var.setLayoutManager(c61Var);
        c61Var.O = new d61(this);
        b61Var.setOnScrollListener(new e61(this));
        b61Var.setAdapter(k61Var);
        b61Var.setOnItemClickListener(jVar);
        addView(b61Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        View view = new View(context);
        this.f28307f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.V5, e6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, w7.x5.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z10) {
        float f7;
        if (this.G != z10) {
            this.G = z10;
            ViewPropertyAnimator animate = this.f28307f.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.bi.s(animate, f7, 200L);
        }
    }

    public final void a(boolean z10) {
        this.M = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.L == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new h61(this, contentTopOffset));
                this.L.addListener(new vd0(this, 26));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.p1.f21455w);
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
        f61 f61Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f20058id = stickerSet.f20065id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            i61 i61Var = this.f28304b;
            i61Var.getClass();
            if (i61Var instanceof ux) {
                f61Var = new f61(this);
            } else {
                f61Var = null;
            }
            xy0 xy0Var = new xy0(getContext(), this.f28312x, inputStickerSet2, null, f61Var, this.P);
            xy0Var.f33035j0 = false;
            xy0Var.f33026c0 = new g61(this, inputStickerSet2);
            this.f28312x.showDialog(xy0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z10;
        b61 b61Var = this.f28308n;
        int childCount = b61Var.getChildCount();
        View view = this.f28307f;
        FrameLayout frameLayout = this.f28311w;
        if (childCount <= 0) {
            int paddingTop = b61Var.getPaddingTop();
            this.E = paddingTop;
            b61Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = b61Var.getChildAt(0);
        for (int i11 = 1; i11 < b61Var.getChildCount(); i11++) {
            View childAt2 = b61Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        am0 am0Var = (am0) b61Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && am0Var != null && am0Var.b() == 0) {
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
        b61Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        b61 b61Var = this.f28308n;
        s4.i0 adapter = b61Var.getAdapter();
        k61 k61Var = this.f28310s;
        if (adapter == k61Var) {
            k61Var.getClass();
            int childCount = b61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = b61Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    ((org.telegram.ui.Cells.s3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.p3) {
                    cj0 cj0Var = ((org.telegram.ui.Cells.p3) childAt).f22643e;
                    cj0Var.setProgressColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Nh, false));
                    int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                    org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                    cj0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, x02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = b61Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = b61Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.s3) {
                ((org.telegram.ui.Cells.s3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.o8) {
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) childAt2;
                o8Var.e();
                o8Var.f();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        b61 b61Var = this.f28308n;
        k61 k61Var = this.f28310s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    s4.i0 adapter = b61Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                k61Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.K != MediaDataController.getInstance(this.f28303a).getFeaturedStickersHashWithoutUnread(false)) {
                this.J = false;
            }
            if (this.J) {
                s4.i0 adapter2 = b61Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            k61Var.G();
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
            Integer num = (Integer) this.f28310s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                c61 c61Var = this.f28309r;
                View m10 = c61Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = c61Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
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
            this.f28308n.dispatchTouchEvent(obtain);
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
        s4.i0 adapter = this.f28308n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.I) {
            this.I = true;
            k61 k61Var = this.f28310s;
            k61Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) k61Var.h.get(stickerSetCovered)) != null) {
                this.f28309r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f28308n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        b61 b61Var = this.f28308n;
        if (b61Var.getPaddingTop() != dp) {
            this.H = true;
            b61Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.t0 t0Var) {
        this.f28313y = t0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        this.f28312x = n2Var;
    }
}
