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
public final class i61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final org.telegram.ui.ActionBar.c6 P;
    public float Q;
    public final Paint R;
    public final int f25561a;
    public final f61 f25562b;
    public final TLRPC.StickerSetCovered[] f25563c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f25564f;
    public final x51 h;
    public final y51 f25565n;
    public final z51 f25566r;
    public final h61 f25567s;
    public final hg.e2 v;
    public final FrameLayout f25568w;
    public org.telegram.ui.ActionBar.m2 f25569x;
    public s4.r0 f25570y;

    public i61(Context context, final f61 f61Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f25561a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f25562b = f61Var;
        this.f25563c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = c6Var;
        h61 h61Var = new h61(this, context);
        this.f25567s = h61Var;
        this.v = new hg.e2(context, new w51(this, f61Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, c6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25568w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19672h5, c6Var));
        x51 x51Var = new x51(this, context, c6Var);
        this.h = x51Var;
        x51Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(x51Var, w7.z5.e(-1, -1, 48));
        y51 y51Var = new y51(this, context, f61Var);
        this.f25565n = y51Var;
        final j jVar = new j(this, 19);
        y51Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return f61Var.e(i61.this.f25565n, jVar2, motionEvent);
            }
        });
        y51Var.setOverScrollMode(2);
        y51Var.setClipToPadding(false);
        y51Var.setItemAnimator(null);
        y51Var.setLayoutAnimation(null);
        z51 z51Var = new z51(this, AndroidUtilities.dp(58.0f), y51Var);
        this.f25566r = z51Var;
        y51Var.setLayoutManager(z51Var);
        z51Var.O = new a61(this);
        y51Var.setOnScrollListener(new b61(this));
        y51Var.setAdapter(h61Var);
        y51Var.setOnItemClickListener(jVar);
        addView(y51Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        View view = new View(context);
        this.f25564f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.V5, c6Var));
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
            ViewPropertyAnimator animate = this.f25564f.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.sk.s(animate, f7, 200L);
        }
    }

    public final void a(boolean z10) {
        this.M = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.L == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new e61(this, contentTopOffset));
                this.L.addListener(new k90(this, 29));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.o1.f20254w);
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
        c61 c61Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f18936id = stickerSet.f18943id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            f61 f61Var = this.f25562b;
            f61Var.getClass();
            if (f61Var instanceof qx) {
                c61Var = new c61(this);
            } else {
                c61Var = null;
            }
            uy0 uy0Var = new uy0(getContext(), this.f25569x, inputStickerSet2, null, c61Var, this.P);
            uy0Var.f29500j0 = false;
            uy0Var.f29492c0 = new d61(this, inputStickerSet2);
            this.f25569x.showDialog(uy0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z10;
        y51 y51Var = this.f25565n;
        int childCount = y51Var.getChildCount();
        View view = this.f25564f;
        FrameLayout frameLayout = this.f25568w;
        if (childCount <= 0) {
            int paddingTop = y51Var.getPaddingTop();
            this.E = paddingTop;
            y51Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = y51Var.getChildAt(0);
        for (int i11 = 1; i11 < y51Var.getChildCount(); i11++) {
            View childAt2 = y51Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        wl0 wl0Var = (wl0) y51Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
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
        y51Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        y51 y51Var = this.f25565n;
        s4.g0 adapter = y51Var.getAdapter();
        h61 h61Var = this.f25567s;
        if (adapter == h61Var) {
            h61Var.getClass();
            int childCount = y51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = y51Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    ((org.telegram.ui.Cells.s3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.p3) {
                    yi0 yi0Var = ((org.telegram.ui.Cells.p3) childAt).e;
                    yi0Var.setProgressColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Nh, false));
                    int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                    org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                    yi0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, x02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = y51Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = y51Var.getChildAt(i11);
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
        y51 y51Var = this.f25565n;
        h61 h61Var = this.f25567s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    s4.g0 adapter = y51Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                h61Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.K != MediaDataController.getInstance(this.f25561a).getFeaturedStickersHashWithoutUnread(false)) {
                this.J = false;
            }
            if (this.J) {
                s4.g0 adapter2 = y51Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            h61Var.G();
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
            Integer num = (Integer) this.f25567s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                z51 z51Var = this.f25566r;
                View m10 = z51Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = z51Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false);
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
            this.f25565n.dispatchTouchEvent(obtain);
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
        s4.g0 adapter = this.f25565n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.I) {
            this.I = true;
            h61 h61Var = this.f25567s;
            h61Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) h61Var.h.get(stickerSetCovered)) != null) {
                this.f25566r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f25565n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        y51 y51Var = this.f25565n;
        if (y51Var.getPaddingTop() != dp) {
            this.H = true;
            y51Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.r0 r0Var) {
        this.f25570y = r0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        this.f25569x = m2Var;
    }
}
