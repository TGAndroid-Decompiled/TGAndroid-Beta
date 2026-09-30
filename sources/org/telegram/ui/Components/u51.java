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
public final class u51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final org.telegram.ui.ActionBar.d6 P;
    public float Q;
    public final Paint R;
    public final int f28763a;
    public final r51 f28764b;
    public final TLRPC.StickerSetCovered[] f28765c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f28766f;
    public final j51 h;
    public final k51 f28767n;
    public final l51 f28768r;
    public final t51 f28769s;
    public final gg.g2 v;
    public final FrameLayout f28770w;
    public org.telegram.ui.ActionBar.m2 f28771x;
    public s4.s0 f28772y;

    public u51(Context context, final r51 r51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f28763a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f28764b = r51Var;
        this.f28765c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = d6Var;
        t51 t51Var = new t51(this, context);
        this.f28769s = t51Var;
        this.v = new gg.g2(context, new i51(this, r51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, d6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28770w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19146h5, d6Var));
        j51 j51Var = new j51(this, context, d6Var);
        this.h = j51Var;
        j51Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(j51Var, w7.y5.e(-1, -1, 48));
        k51 k51Var = new k51(this, context, r51Var);
        this.f28767n = k51Var;
        final j jVar = new j(this, 19);
        k51Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return r51Var.e(u51.this.f28767n, jVar2, motionEvent);
            }
        });
        k51Var.setOverScrollMode(2);
        k51Var.setClipToPadding(false);
        k51Var.setItemAnimator(null);
        k51Var.setLayoutAnimation(null);
        l51 l51Var = new l51(this, AndroidUtilities.dp(58.0f), k51Var);
        this.f28768r = l51Var;
        k51Var.setLayoutManager(l51Var);
        l51Var.O = new m51(this);
        k51Var.setOnScrollListener(new n51(this));
        k51Var.setAdapter(t51Var);
        k51Var.setOnItemClickListener(jVar);
        addView(k51Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f28766f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.V5, d6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, w7.y5.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z10) {
        float f7;
        if (this.G != z10) {
            this.G = z10;
            ViewPropertyAnimator animate = this.f28766f.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.ok.r(animate, f7, 200L);
        }
    }

    public final void a(boolean z10) {
        this.M = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.L == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new q51(this, contentTopOffset));
                this.L.addListener(new id0(this, 26));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.o1.f19685w);
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
        o51 o51Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f18372id = stickerSet.f18379id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            r51 r51Var = this.f28764b;
            r51Var.getClass();
            if (r51Var instanceof ix) {
                o51Var = new o51(this);
            } else {
                o51Var = null;
            }
            iy0 iy0Var = new iy0(getContext(), this.f28771x, inputStickerSet2, null, o51Var, this.P);
            iy0Var.f25223j0 = false;
            iy0Var.f25215c0 = new p51(this, inputStickerSet2);
            this.f28771x.showDialog(iy0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z10;
        k51 k51Var = this.f28767n;
        int childCount = k51Var.getChildCount();
        View view = this.f28766f;
        FrameLayout frameLayout = this.f28770w;
        if (childCount <= 0) {
            int paddingTop = k51Var.getPaddingTop();
            this.E = paddingTop;
            k51Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = k51Var.getChildAt(0);
        for (int i11 = 1; i11 < k51Var.getChildCount(); i11++) {
            View childAt2 = k51Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        jl0 jl0Var = (jl0) k51Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && jl0Var != null && jl0Var.b() == 0) {
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
        k51Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        k51 k51Var = this.f28767n;
        s4.h0 adapter = k51Var.getAdapter();
        t51 t51Var = this.f28769s;
        if (adapter == t51Var) {
            t51Var.getClass();
            int childCount = k51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = k51Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    ((org.telegram.ui.Cells.s3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.p3) {
                    li0 li0Var = ((org.telegram.ui.Cells.p3) childAt).e;
                    li0Var.setProgressColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                    org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                    li0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, w02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = k51Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = k51Var.getChildAt(i11);
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
        k51 k51Var = this.f28767n;
        t51 t51Var = this.f28769s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    s4.h0 adapter = k51Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                t51Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.K != MediaDataController.getInstance(this.f28763a).getFeaturedStickersHashWithoutUnread(false)) {
                this.J = false;
            }
            if (this.J) {
                s4.h0 adapter2 = k51Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            t51Var.G();
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
            Integer num = (Integer) this.f28769s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                l51 l51Var = this.f28768r;
                View m10 = l51Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = l51Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                    Paint paint = this.R;
                    paint.setColor(w02);
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
            this.f28767n.dispatchTouchEvent(obtain);
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
        s4.h0 adapter = this.f28767n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.I) {
            this.I = true;
            t51 t51Var = this.f28769s;
            t51Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) t51Var.h.get(stickerSetCovered)) != null) {
                this.f28768r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f28767n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        k51 k51Var = this.f28767n;
        if (k51Var.getPaddingTop() != dp) {
            this.H = true;
            k51Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.f28772y = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        this.f28771x = m2Var;
    }
}
