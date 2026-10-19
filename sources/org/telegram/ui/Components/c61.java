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
public final class c61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final int f25088a;
    public final z51 f25089b;
    public final TLRPC.StickerSetCovered[] f25090c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f25091f;
    public final r51 h;
    public final s51 f25092n;
    public final t51 f25093r;
    public final b61 f25094s;
    public final hg.e2 v;
    public final FrameLayout f25095w;
    public org.telegram.ui.ActionBar.n2 f25096x;
    public s4.r0 f25097y;

    public c61(Context context, final z51 z51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f25088a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f25089b = z51Var;
        this.f25090c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = d6Var;
        b61 b61Var = new b61(this, context);
        this.f25094s = b61Var;
        this.v = new hg.e2(context, new q51(this, z51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, d6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25095w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21058h5, d6Var));
        r51 r51Var = new r51(this, context, d6Var);
        this.h = r51Var;
        r51Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(r51Var, w7.z5.e(-1, -1, 48));
        s51 s51Var = new s51(this, context, z51Var);
        this.f25092n = s51Var;
        final j jVar = new j(this, 19);
        s51Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return z51Var.e(c61.this.f25092n, jVar2, motionEvent);
            }
        });
        s51Var.setOverScrollMode(2);
        s51Var.setClipToPadding(false);
        s51Var.setItemAnimator(null);
        s51Var.setLayoutAnimation(null);
        t51 t51Var = new t51(this, AndroidUtilities.dp(58.0f), s51Var);
        this.f25093r = t51Var;
        s51Var.setLayoutManager(t51Var);
        t51Var.O = new u51(this);
        s51Var.setOnScrollListener(new v51(this));
        s51Var.setAdapter(b61Var);
        s51Var.setOnItemClickListener(jVar);
        addView(s51Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f25091f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.V5, d6Var));
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
            ViewPropertyAnimator animate = this.f25091f.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.kk.s(animate, f7, 200L);
        }
    }

    public final void a(boolean z10) {
        this.M = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.L == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new y51(this, contentTopOffset));
                this.L.addListener(new o31(this, 1));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.o1.f21629w);
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
        w51 w51Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f20293id = stickerSet.f20300id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            z51 z51Var = this.f25089b;
            z51Var.getClass();
            if (z51Var instanceof mx) {
                w51Var = new w51(this);
            } else {
                w51Var = null;
            }
            py0 py0Var = new py0(getContext(), this.f25096x, inputStickerSet2, null, w51Var, this.P);
            py0Var.f29427j0 = false;
            py0Var.f29419c0 = new x51(this, inputStickerSet2);
            this.f25096x.showDialog(py0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z10;
        s51 s51Var = this.f25092n;
        int childCount = s51Var.getChildCount();
        View view = this.f25091f;
        FrameLayout frameLayout = this.f25095w;
        if (childCount <= 0) {
            int paddingTop = s51Var.getPaddingTop();
            this.E = paddingTop;
            s51Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = s51Var.getChildAt(0);
        for (int i11 = 1; i11 < s51Var.getChildCount(); i11++) {
            View childAt2 = s51Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        sl0 sl0Var = (sl0) s51Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && sl0Var != null && sl0Var.b() == 0) {
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
        s51Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        s51 s51Var = this.f25092n;
        s4.g0 adapter = s51Var.getAdapter();
        b61 b61Var = this.f25094s;
        if (adapter == b61Var) {
            b61Var.getClass();
            int childCount = s51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = s51Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.o3) {
                    ti0 ti0Var = ((org.telegram.ui.Cells.o3) childAt).e;
                    ti0Var.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Nh, false));
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                    org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                    ti0Var.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{14.0f}, x02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = s51Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = s51Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.r3) {
                ((org.telegram.ui.Cells.r3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.n8) {
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) childAt2;
                n8Var.e();
                n8Var.f();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        s51 s51Var = this.f25092n;
        b61 b61Var = this.f25094s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    s4.g0 adapter = s51Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                b61Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.K != MediaDataController.getInstance(this.f25088a).getFeaturedStickersHashWithoutUnread(false)) {
                this.J = false;
            }
            if (this.J) {
                s4.g0 adapter2 = s51Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            b61Var.G();
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
            Integer num = (Integer) this.f25094s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                t51 t51Var = this.f25093r;
                View m10 = t51Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = t51Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
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
            this.f25092n.dispatchTouchEvent(obtain);
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
        s4.g0 adapter = this.f25092n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.I) {
            this.I = true;
            b61 b61Var = this.f25094s;
            b61Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) b61Var.h.get(stickerSetCovered)) != null) {
                this.f25093r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f25092n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        s51 s51Var = this.f25092n;
        if (s51Var.getPaddingTop() != dp) {
            this.H = true;
            s51Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.r0 r0Var) {
        this.f25097y = r0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        this.f25096x = n2Var;
    }
}
