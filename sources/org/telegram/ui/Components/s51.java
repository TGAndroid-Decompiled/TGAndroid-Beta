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
public final class s51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final int f28052a;
    public final p51 f28053b;
    public final TLRPC.StickerSetCovered[] f28054c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f28055f;
    public final h51 h;
    public final i51 f28056n;
    public final j51 f28057r;
    public final r51 f28058s;
    public final gg.g2 v;
    public final FrameLayout f28059w;
    public org.telegram.ui.ActionBar.n2 f28060x;
    public s4.s0 f28061y;

    public s51(Context context, final p51 p51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f28052a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f28053b = p51Var;
        this.f28054c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = f6Var;
        r51 r51Var = new r51(this, context);
        this.f28058s = r51Var;
        this.v = new gg.g2(context, new g51(this, p51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28059w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19165h5, f6Var));
        h51 h51Var = new h51(this, context, f6Var);
        this.h = h51Var;
        h51Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(h51Var, w7.y5.e(-1, -1, 48));
        i51 i51Var = new i51(this, context, p51Var);
        this.f28056n = i51Var;
        final j jVar = new j(this, 19);
        i51Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return p51Var.e(s51.this.f28056n, jVar2, motionEvent);
            }
        });
        i51Var.setOverScrollMode(2);
        i51Var.setClipToPadding(false);
        i51Var.setItemAnimator(null);
        i51Var.setLayoutAnimation(null);
        j51 j51Var = new j51(this, AndroidUtilities.dp(58.0f), i51Var);
        this.f28057r = j51Var;
        i51Var.setLayoutManager(j51Var);
        j51Var.O = new k51(this);
        i51Var.setOnScrollListener(new l51(this));
        i51Var.setAdapter(r51Var);
        i51Var.setOnItemClickListener(jVar);
        addView(i51Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f28055f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.V5, f6Var));
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
            ViewPropertyAnimator animate = this.f28055f.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.rk.r(animate, f7, 200L);
        }
    }

    public final void a(boolean z10) {
        this.M = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.L == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new o51(this, contentTopOffset));
                this.L.addListener(new dd0(this, 26));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.p1.f19699w);
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
        m51 m51Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f18348id = stickerSet.f18355id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            p51 p51Var = this.f28053b;
            p51Var.getClass();
            if (p51Var instanceof fx) {
                m51Var = new m51(this);
            } else {
                m51Var = null;
            }
            gy0 gy0Var = new gy0(getContext(), this.f28060x, inputStickerSet2, null, m51Var, this.P);
            gy0Var.f24488j0 = false;
            gy0Var.f24480c0 = new n51(this, inputStickerSet2);
            this.f28060x.showDialog(gy0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z10;
        i51 i51Var = this.f28056n;
        int childCount = i51Var.getChildCount();
        View view = this.f28055f;
        FrameLayout frameLayout = this.f28059w;
        if (childCount <= 0) {
            int paddingTop = i51Var.getPaddingTop();
            this.E = paddingTop;
            i51Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = i51Var.getChildAt(0);
        for (int i11 = 1; i11 < i51Var.getChildCount(); i11++) {
            View childAt2 = i51Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        fl0 fl0Var = (fl0) i51Var.H(childAt);
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
        i51Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        i51 i51Var = this.f28056n;
        s4.h0 adapter = i51Var.getAdapter();
        r51 r51Var = this.f28058s;
        if (adapter == r51Var) {
            r51Var.getClass();
            int childCount = i51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = i51Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t3) {
                    ((org.telegram.ui.Cells.t3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.q3) {
                    hi0 hi0Var = ((org.telegram.ui.Cells.q3) childAt).e;
                    hi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                    org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                    hi0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, w02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = i51Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = i51Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.t3) {
                ((org.telegram.ui.Cells.t3) childAt2).d();
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
        i51 i51Var = this.f28056n;
        r51 r51Var = this.f28058s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    s4.h0 adapter = i51Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                r51Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.K != MediaDataController.getInstance(this.f28052a).getFeaturedStickersHashWithoutUnread(false)) {
                this.J = false;
            }
            if (this.J) {
                s4.h0 adapter2 = i51Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            r51Var.G();
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
            Integer num = (Integer) this.f28058s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                j51 j51Var = this.f28057r;
                View m10 = j51Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = j51Var.m(num.intValue() + 1);
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
            this.f28056n.dispatchTouchEvent(obtain);
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
        s4.h0 adapter = this.f28056n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.I) {
            this.I = true;
            r51 r51Var = this.f28058s;
            r51Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) r51Var.h.get(stickerSetCovered)) != null) {
                this.f28057r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f28056n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        i51 i51Var = this.f28056n;
        if (i51Var.getPaddingTop() != dp) {
            this.H = true;
            i51Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.f28061y = s0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        this.f28060x = n2Var;
    }
}
