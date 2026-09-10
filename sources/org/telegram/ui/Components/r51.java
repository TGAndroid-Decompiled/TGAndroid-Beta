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
public final class r51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final int f26589a;
    public final o51 f26590b;
    public final TLRPC.StickerSetCovered[] f26591c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f26592f;
    public final g51 h;
    public final h51 f26593n;
    public final i51 f26594r;
    public final q51 f26595s;
    public final fg.h2 v;
    public final FrameLayout f26596w;
    public org.telegram.ui.ActionBar.p2 f26597x;
    public s4.s0 f26598y;

    public r51(Context context, final o51 o51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f26589a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f26590b = o51Var;
        this.f26591c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = f6Var;
        q51 q51Var = new q51(this, context);
        this.f26595s = q51Var;
        this.v = new fg.h2(context, new f51(this, o51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26596w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
        g51 g51Var = new g51(this, context, f6Var);
        this.h = g51Var;
        g51Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(g51Var, w7.a6.e(-1, -1, 48));
        h51 h51Var = new h51(this, context, o51Var);
        this.f26593n = h51Var;
        final k kVar = new k(this, 19);
        h51Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return o51Var.e(r51.this.f26593n, kVar2, motionEvent);
            }
        });
        h51Var.setOverScrollMode(2);
        h51Var.setClipToPadding(false);
        h51Var.setItemAnimator(null);
        h51Var.setLayoutAnimation(null);
        i51 i51Var = new i51(this, AndroidUtilities.dp(58.0f), h51Var);
        this.f26594r = i51Var;
        h51Var.setLayoutManager(i51Var);
        i51Var.O = new j51(this);
        h51Var.setOnScrollListener(new k51(this));
        h51Var.setAdapter(q51Var);
        h51Var.setOnItemClickListener(kVar);
        addView(h51Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f26592f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.V5, f6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, w7.a6.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z10) {
        float f7;
        if (this.G != z10) {
            this.G = z10;
            ViewPropertyAnimator animate = this.f26592f.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setDuration(200L).start();
        }
    }

    public final void a(boolean z10) {
        this.M = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.L == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new n51(this, contentTopOffset));
                this.L.addListener(new zn0(this, 15));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
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
        l51 l51Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f17215id = stickerSet.f17222id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            o51 o51Var = this.f26590b;
            o51Var.getClass();
            if (o51Var instanceof kx) {
                l51Var = new l51(this);
            } else {
                l51Var = null;
            }
            hy0 hy0Var = new hy0(getContext(), this.f26597x, inputStickerSet2, null, l51Var, this.P);
            hy0Var.f23815j0 = false;
            hy0Var.f23807c0 = new m51(this, inputStickerSet2);
            this.f26597x.showDialog(hy0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z10;
        h51 h51Var = this.f26593n;
        int childCount = h51Var.getChildCount();
        View view = this.f26592f;
        FrameLayout frameLayout = this.f26596w;
        if (childCount <= 0) {
            int paddingTop = h51Var.getPaddingTop();
            this.E = paddingTop;
            h51Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = h51Var.getChildAt(0);
        for (int i11 = 1; i11 < h51Var.getChildCount(); i11++) {
            View childAt2 = h51Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        fl0 fl0Var = (fl0) h51Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
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
        h51Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        h51 h51Var = this.f26593n;
        s4.h0 adapter = h51Var.getAdapter();
        q51 q51Var = this.f26595s;
        if (adapter == q51Var) {
            q51Var.getClass();
            int childCount = h51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = h51Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.o3) {
                    hi0 hi0Var = ((org.telegram.ui.Cells.o3) childAt).e;
                    hi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                    org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                    hi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, w02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = h51Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = h51Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.r3) {
                ((org.telegram.ui.Cells.r3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.p8) {
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) childAt2;
                p8Var.e();
                p8Var.f();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        h51 h51Var = this.f26593n;
        q51 q51Var = this.f26595s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    s4.h0 adapter = h51Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                q51Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.K != MediaDataController.getInstance(this.f26589a).getFeaturedStickersHashWithoutUnread(false)) {
                this.J = false;
            }
            if (this.J) {
                s4.h0 adapter2 = h51Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            q51Var.G();
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
            Integer num = (Integer) this.f26595s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                i51 i51Var = this.f26594r;
                View m10 = i51Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = i51Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
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
            this.f26593n.dispatchTouchEvent(obtain);
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
        s4.h0 adapter = this.f26593n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.I) {
            this.I = true;
            q51 q51Var = this.f26595s;
            q51Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) q51Var.h.get(stickerSetCovered)) != null) {
                this.f26594r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f26593n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        h51 h51Var = this.f26593n;
        if (h51Var.getPaddingTop() != dp) {
            this.H = true;
            h51Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.f26598y = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        this.f26597x = p2Var;
    }
}
