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
public final class d51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public ValueAnimator I;
    public boolean J;
    public boolean K;
    public final TLRPC.StickerSetCovered L;
    public final org.telegram.ui.ActionBar.g6 M;
    public float N;
    public final Paint O;
    public final int f26186a;
    public final a51 f26187b;
    public final TLRPC.StickerSetCovered[] f26188c;
    public final LongSparseArray d;
    public final LongSparseArray f26189e;
    public final View f26190f;
    public final s41 h;
    public final t41 f26191n;
    public final u41 f26192r;
    public final c51 f26193s;
    public final uf.m1 v;
    public final FrameLayout f26194w;
    public org.telegram.ui.ActionBar.p2 f26195x;
    public f2.a1 f26196y;

    public d51(Context context, final a51 a51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f26186a = i10;
        this.N = 1.0f;
        this.O = new Paint();
        this.f26187b = a51Var;
        this.f26188c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f26189e = longSparseArray2;
        this.L = stickerSetCovered;
        this.M = g6Var;
        c51 c51Var = new c51(this, context);
        this.f26193s = c51Var;
        this.v = new uf.m1(context, new r41(this, a51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, g6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26194w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, g6Var));
        s41 s41Var = new s41(this, context, g6Var);
        this.h = s41Var;
        s41Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(s41Var, k7.c6.e(-1, -1, 48));
        t41 t41Var = new t41(this, context, a51Var);
        this.f26191n = t41Var;
        final k kVar = new k(this, 19);
        t41Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return a51Var.e(d51.this.f26191n, kVar2, motionEvent);
            }
        });
        t41Var.setOverScrollMode(2);
        t41Var.setClipToPadding(false);
        t41Var.setItemAnimator(null);
        t41Var.setLayoutAnimation(null);
        u41 u41Var = new u41(this, AndroidUtilities.dp(58.0f), t41Var);
        this.f26192r = u41Var;
        t41Var.setLayoutManager(u41Var);
        u41Var.O = new v41(this);
        t41Var.setOnScrollListener(new w41(this));
        t41Var.setAdapter(c51Var);
        t41Var.setOnItemClickListener(kVar);
        addView(t41Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f26190f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.V5, g6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, k7.c6.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z4) {
        float f10;
        if (this.D != z4) {
            this.D = z4;
            ViewPropertyAnimator animate = this.f26190f.animate();
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setDuration(200L).start();
        }
    }

    public final void a(boolean z4) {
        this.J = z4;
        if (z4) {
            if (getContentTopOffset() > 0 && this.I == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.I = ofFloat;
                ofFloat.addUpdateListener(new z41(this, contentTopOffset));
                this.I.addListener(new pd0(this, 24));
                this.I.setDuration(250L);
                this.I.setInterpolator(org.telegram.ui.ActionBar.r1.f22251w);
                this.I.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.I.cancel();
            this.I = null;
        }
    }

    public final void b(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet) {
        x41 x41Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f20865id = stickerSet.f20872id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            a51 a51Var = this.f26187b;
            a51Var.getClass();
            if (a51Var instanceof ex) {
                x41Var = new x41(this);
            } else {
                x41Var = null;
            }
            xx0 xx0Var = new xx0(getContext(), this.f26195x, inputStickerSet2, null, x41Var, this.M);
            xx0Var.f33230g0 = false;
            xx0Var.Z = new y41(this, inputStickerSet2);
            this.f26195x.showDialog(xx0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z4;
        t41 t41Var = this.f26191n;
        int childCount = t41Var.getChildCount();
        View view = this.f26190f;
        FrameLayout frameLayout = this.f26194w;
        if (childCount <= 0) {
            int paddingTop = t41Var.getPaddingTop();
            this.B = paddingTop;
            t41Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.B);
            view.setTranslationY(this.B);
            setShadowVisible(false);
            return true;
        }
        View childAt = t41Var.getChildAt(0);
        for (int i11 = 1; i11 < t41Var.getChildCount(); i11++) {
            View childAt2 = t41Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        el0 el0Var = (el0) t41Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && el0Var != null && el0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        if (top < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        setShadowVisible(z4);
        if (this.B == i10) {
            return false;
        }
        this.B = i10;
        t41Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.B);
        view.setTranslationY(this.B);
        return true;
    }

    public final void d() {
        t41 t41Var = this.f26191n;
        f2.p0 adapter = t41Var.getAdapter();
        c51 c51Var = this.f26193s;
        if (adapter == c51Var) {
            c51Var.getClass();
            int childCount = t41Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t41Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.o3) {
                    gi0 gi0Var = ((org.telegram.ui.Cells.o3) childAt).f23293e;
                    gi0Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                    org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                    gi0Var.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, w02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = t41Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = t41Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.r3) {
                ((org.telegram.ui.Cells.r3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.m8) {
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) childAt2;
                m8Var.e();
                m8Var.f();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        t41 t41Var = this.f26191n;
        c51 c51Var = this.f26193s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.G) {
                    f2.p0 adapter = t41Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                c51Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.H != MediaDataController.getInstance(this.f26186a).getFeaturedStickersHashWithoutUnread(false)) {
                this.G = false;
            }
            if (this.G) {
                f2.p0 adapter2 = t41Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            c51Var.G();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i10;
        int i11;
        float f10;
        float f11 = this.N;
        if (f11 != 0.0f && (stickerSetCovered = this.L) != null) {
            float f12 = f11 - 0.0053333333f;
            this.N = f12;
            if (f12 < 0.0f) {
                this.N = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.f26193s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                u41 u41Var = this.f26192r;
                View m9 = u41Var.m(intValue);
                if (m9 != null) {
                    i10 = (int) m9.getY();
                    i11 = m9.getMeasuredHeight() + ((int) m9.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m10 = u41Var.m(num.intValue() + 1);
                if (m10 != null) {
                    if (m9 == null) {
                        i10 = (int) m10.getY();
                    }
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                }
                if (m9 != null || m10 != null) {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                    Paint paint = this.O;
                    paint.setColor(w02);
                    float f13 = this.N;
                    if (f13 < 0.06f) {
                        f10 = f13 / 0.06f;
                    } else {
                        f10 = 1.0f;
                    }
                    paint.setAlpha((int) (f10 * 25.5f));
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
        this.C = false;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.C) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f26191n.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        return dispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.B;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f2.p0 adapter = this.f26191n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.F = false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z4, i10, i11, i12, i13);
        if (!this.F) {
            this.F = true;
            c51 c51Var = this.f26193s;
            c51Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.L;
            if (stickerSetCovered != null && (num = (Integer) c51Var.h.get(stickerSetCovered)) != null) {
                this.f26192r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f26191n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        t41 t41Var = this.f26191n;
        if (t41Var.getPaddingTop() != dp) {
            this.E = true;
            t41Var.setPadding(0, dp, 0, 0);
            this.E = false;
        }
    }

    public void setOnScrollListener(f2.a1 a1Var) {
        this.f26196y = a1Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        this.f26195x = p2Var;
    }
}
