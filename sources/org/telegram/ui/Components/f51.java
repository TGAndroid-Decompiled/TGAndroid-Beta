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
public final class f51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final int f26757a;
    public final c51 f26758b;
    public final TLRPC.StickerSetCovered[] f26759c;
    public final LongSparseArray d;
    public final LongSparseArray f26760e;
    public final View f26761f;
    public final u41 h;
    public final v41 f26762n;
    public final w41 f26763r;
    public final e51 f26764s;
    public final uf.m1 v;
    public final FrameLayout f26765w;
    public org.telegram.ui.ActionBar.p2 f26766x;
    public f2.a1 f26767y;

    public f51(Context context, final c51 c51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f26757a = i10;
        this.N = 1.0f;
        this.O = new Paint();
        this.f26758b = c51Var;
        this.f26759c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f26760e = longSparseArray2;
        this.L = stickerSetCovered;
        this.M = g6Var;
        e51 e51Var = new e51(this, context);
        this.f26764s = e51Var;
        this.v = new uf.m1(context, new t41(this, c51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, g6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26765w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var));
        u41 u41Var = new u41(this, context, g6Var);
        this.h = u41Var;
        u41Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(u41Var, k7.c6.e(-1, -1, 48));
        v41 v41Var = new v41(this, context, c51Var);
        this.f26762n = v41Var;
        final k kVar = new k(this, 19);
        v41Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return c51Var.e(f51.this.f26762n, kVar2, motionEvent);
            }
        });
        v41Var.setOverScrollMode(2);
        v41Var.setClipToPadding(false);
        v41Var.setItemAnimator(null);
        v41Var.setLayoutAnimation(null);
        w41 w41Var = new w41(this, AndroidUtilities.dp(58.0f), v41Var);
        this.f26763r = w41Var;
        v41Var.setLayoutManager(w41Var);
        w41Var.O = new x41(this);
        v41Var.setOnScrollListener(new y41(this));
        v41Var.setAdapter(e51Var);
        v41Var.setOnItemClickListener(kVar);
        addView(v41Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f26761f = view;
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
            ViewPropertyAnimator animate = this.f26761f.animate();
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
                ofFloat.addUpdateListener(new b51(this, contentTopOffset));
                this.I.addListener(new pd0(this, 24));
                this.I.setDuration(250L);
                this.I.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
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
        z41 z41Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f20863id = stickerSet.f20870id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            c51 c51Var = this.f26758b;
            c51Var.getClass();
            if (c51Var instanceof ex) {
                z41Var = new z41(this);
            } else {
                z41Var = null;
            }
            yx0 yx0Var = new yx0(getContext(), this.f26766x, inputStickerSet2, null, z41Var, this.M);
            yx0Var.f33624g0 = false;
            yx0Var.Z = new a51(this, inputStickerSet2);
            this.f26766x.showDialog(yx0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z4;
        v41 v41Var = this.f26762n;
        int childCount = v41Var.getChildCount();
        View view = this.f26761f;
        FrameLayout frameLayout = this.f26765w;
        if (childCount <= 0) {
            int paddingTop = v41Var.getPaddingTop();
            this.B = paddingTop;
            v41Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.B);
            view.setTranslationY(this.B);
            setShadowVisible(false);
            return true;
        }
        View childAt = v41Var.getChildAt(0);
        for (int i11 = 1; i11 < v41Var.getChildCount(); i11++) {
            View childAt2 = v41Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        fl0 fl0Var = (fl0) v41Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
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
        v41Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.B);
        view.setTranslationY(this.B);
        return true;
    }

    public final void d() {
        v41 v41Var = this.f26762n;
        f2.p0 adapter = v41Var.getAdapter();
        e51 e51Var = this.f26764s;
        if (adapter == e51Var) {
            e51Var.getClass();
            int childCount = v41Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = v41Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.o3) {
                    gi0 gi0Var = ((org.telegram.ui.Cells.o3) childAt).f23291e;
                    gi0Var.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                    org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                    gi0Var.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{14.0f}, w02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = v41Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = v41Var.getChildAt(i11);
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
        v41 v41Var = this.f26762n;
        e51 e51Var = this.f26764s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.G) {
                    f2.p0 adapter = v41Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                e51Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.H != MediaDataController.getInstance(this.f26757a).getFeaturedStickersHashWithoutUnread(false)) {
                this.G = false;
            }
            if (this.G) {
                f2.p0 adapter2 = v41Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            e51Var.G();
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
            Integer num = (Integer) this.f26764s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                w41 w41Var = this.f26763r;
                View m9 = w41Var.m(intValue);
                if (m9 != null) {
                    i10 = (int) m9.getY();
                    i11 = m9.getMeasuredHeight() + ((int) m9.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m10 = w41Var.m(num.intValue() + 1);
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
            this.f26762n.dispatchTouchEvent(obtain);
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
        f2.p0 adapter = this.f26762n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.F = false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z4, i10, i11, i12, i13);
        if (!this.F) {
            this.F = true;
            e51 e51Var = this.f26764s;
            e51Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.L;
            if (stickerSetCovered != null && (num = (Integer) e51Var.h.get(stickerSetCovered)) != null) {
                this.f26763r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f26762n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        v41 v41Var = this.f26762n;
        if (v41Var.getPaddingTop() != dp) {
            this.E = true;
            v41Var.setPadding(0, dp, 0, 0);
            this.E = false;
        }
    }

    public void setOnScrollListener(f2.a1 a1Var) {
        this.f26767y = a1Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        this.f26766x = p2Var;
    }
}
