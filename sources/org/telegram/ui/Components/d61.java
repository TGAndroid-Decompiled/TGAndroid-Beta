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
public final class d61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final int f25347a;
    public final a61 f25348b;
    public final TLRPC.StickerSetCovered[] f25349c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f25350f;
    public final s51 h;
    public final t51 f25351n;
    public final u51 f25352r;
    public final c61 f25353s;
    public final hg.e2 v;
    public final FrameLayout f25354w;
    public org.telegram.ui.ActionBar.n2 f25355x;
    public s4.r0 f25356y;

    public d61(Context context, final a61 a61Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f25347a = i10;
        this.Q = 1.0f;
        this.R = new Paint();
        this.f25348b = a61Var;
        this.f25349c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.O = stickerSetCovered;
        this.P = d6Var;
        c61 c61Var = new c61(this, context);
        this.f25353s = c61Var;
        this.v = new hg.e2(context, new r51(this, a61Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, d6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25354w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21061h5, d6Var));
        s51 s51Var = new s51(this, context, d6Var);
        this.h = s51Var;
        s51Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(s51Var, w7.z5.e(-1, -1, 48));
        t51 t51Var = new t51(this, context, a61Var);
        this.f25351n = t51Var;
        final j jVar = new j(this, 19);
        t51Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return a61Var.e(d61.this.f25351n, jVar2, motionEvent);
            }
        });
        t51Var.setOverScrollMode(2);
        t51Var.setClipToPadding(false);
        t51Var.setItemAnimator(null);
        t51Var.setLayoutAnimation(null);
        u51 u51Var = new u51(this, AndroidUtilities.dp(58.0f), t51Var);
        this.f25352r = u51Var;
        t51Var.setLayoutManager(u51Var);
        u51Var.O = new v51(this);
        t51Var.setOnScrollListener(new w51(this));
        t51Var.setAdapter(c61Var);
        t51Var.setOnItemClickListener(jVar);
        addView(t51Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f25350f = view;
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
            ViewPropertyAnimator animate = this.f25350f.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.mk.s(animate, f7, 200L);
        }
    }

    public final void a(boolean z10) {
        this.M = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.L == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.L = ofFloat;
                ofFloat.addUpdateListener(new z51(this, contentTopOffset));
                this.L.addListener(new p31(this, 1));
                this.L.setDuration(250L);
                this.L.setInterpolator(org.telegram.ui.ActionBar.o1.f21632w);
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
        x51 x51Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f20296id = stickerSet.f20303id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            a61 a61Var = this.f25348b;
            a61Var.getClass();
            if (a61Var instanceof mx) {
                x51Var = new x51(this);
            } else {
                x51Var = null;
            }
            qy0 qy0Var = new qy0(getContext(), this.f25355x, inputStickerSet2, null, x51Var, this.P);
            qy0Var.f29756j0 = false;
            qy0Var.f29748c0 = new y51(this, inputStickerSet2);
            this.f25355x.showDialog(qy0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z10;
        t51 t51Var = this.f25351n;
        int childCount = t51Var.getChildCount();
        View view = this.f25350f;
        FrameLayout frameLayout = this.f25354w;
        if (childCount <= 0) {
            int paddingTop = t51Var.getPaddingTop();
            this.E = paddingTop;
            t51Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.E);
            view.setTranslationY(this.E);
            setShadowVisible(false);
            return true;
        }
        View childAt = t51Var.getChildAt(0);
        for (int i11 = 1; i11 < t51Var.getChildCount(); i11++) {
            View childAt2 = t51Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        tl0 tl0Var = (tl0) t51Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && tl0Var != null && tl0Var.b() == 0) {
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
        t51Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.E);
        view.setTranslationY(this.E);
        return true;
    }

    public final void d() {
        t51 t51Var = this.f25351n;
        s4.g0 adapter = t51Var.getAdapter();
        c61 c61Var = this.f25353s;
        if (adapter == c61Var) {
            c61Var.getClass();
            int childCount = t51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t51Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r3) {
                    ((org.telegram.ui.Cells.r3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.o3) {
                    ui0 ui0Var = ((org.telegram.ui.Cells.o3) childAt).e;
                    ui0Var.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Nh, false));
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                    org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                    ui0Var.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{14.0f}, x02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = t51Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = t51Var.getChildAt(i11);
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
        t51 t51Var = this.f25351n;
        c61 c61Var = this.f25353s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.J) {
                    s4.g0 adapter = t51Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                c61Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.K != MediaDataController.getInstance(this.f25347a).getFeaturedStickersHashWithoutUnread(false)) {
                this.J = false;
            }
            if (this.J) {
                s4.g0 adapter2 = t51Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            c61Var.G();
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
            Integer num = (Integer) this.f25353s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                u51 u51Var = this.f25352r;
                View m10 = u51Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = u51Var.m(num.intValue() + 1);
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
            this.f25351n.dispatchTouchEvent(obtain);
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
        s4.g0 adapter = this.f25351n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.I = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.I) {
            this.I = true;
            c61 c61Var = this.f25353s;
            c61Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.O;
            if (stickerSetCovered != null && (num = (Integer) c61Var.h.get(stickerSetCovered)) != null) {
                this.f25352r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f25351n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        t51 t51Var = this.f25351n;
        if (t51Var.getPaddingTop() != dp) {
            this.H = true;
            t51Var.setPadding(0, dp, 0, 0);
            this.H = false;
        }
    }

    public void setOnScrollListener(s4.r0 r0Var) {
        this.f25356y = r0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        this.f25355x = n2Var;
    }
}
