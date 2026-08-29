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
public final class s41 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public long G;
    public ValueAnimator H;
    public boolean I;
    public boolean J;
    public final TLRPC.StickerSetCovered K;
    public final org.telegram.ui.ActionBar.c6 L;
    public float M;
    public final Paint N;
    public final int f32480a;
    public final p41 f32481b;
    public final TLRPC.StickerSetCovered[] f32482c;
    public final LongSparseArray d;
    public final LongSparseArray f32483e;
    public final View f32484f;
    public final h41 h;
    public final i41 f32485n;
    public final j41 f32486r;
    public final r41 f32487s;
    public final rf.m1 v;
    public final FrameLayout f32488w;
    public org.telegram.ui.ActionBar.o2 f32489x;
    public f2.a1 f32490y;

    public s41(Context context, final p41 p41Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f32480a = i10;
        this.M = 1.0f;
        this.N = new Paint();
        this.f32481b = p41Var;
        this.f32482c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f32483e = longSparseArray2;
        this.K = stickerSetCovered;
        this.L = c6Var;
        r41 r41Var = new r41(this, context);
        this.f32487s = r41Var;
        this.v = new rf.m1(context, new g41(this, p41Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, c6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32488w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
        h41 h41Var = new h41(this, context, c6Var);
        this.h = h41Var;
        h41Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(h41Var, i7.f6.e(-1, -1, 48));
        i41 i41Var = new i41(this, context, p41Var);
        this.f32485n = i41Var;
        final k kVar = new k(this, 19);
        i41Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return p41Var.e(s41.this.f32485n, kVar2, motionEvent);
            }
        });
        i41Var.setOverScrollMode(2);
        i41Var.setClipToPadding(false);
        i41Var.setItemAnimator(null);
        i41Var.setLayoutAnimation(null);
        j41 j41Var = new j41(this, AndroidUtilities.dp(58.0f), i41Var);
        this.f32486r = j41Var;
        i41Var.setLayoutManager(j41Var);
        j41Var.O = new k41(this);
        i41Var.setOnScrollListener(new l41(this));
        i41Var.setAdapter(r41Var);
        i41Var.setOnItemClickListener(kVar);
        addView(i41Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f32484f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.V5, c6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, i7.f6.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z10) {
        float f9;
        if (this.C != z10) {
            this.C = z10;
            ViewPropertyAnimator animate = this.f32484f.animate();
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            animate.alpha(f9).setDuration(200L).start();
        }
    }

    public final void a(boolean z10) {
        this.I = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.H == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.addUpdateListener(new o41(this, contentTopOffset));
                this.H.addListener(new p11(this, 3));
                this.H.setDuration(250L);
                this.H.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                this.H.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.H.cancel();
            this.H = null;
        }
    }

    public final void b(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet) {
        m41 m41Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f22412id = stickerSet.f22419id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            p41 p41Var = this.f32481b;
            p41Var.getClass();
            if (p41Var instanceof yw) {
                m41Var = new m41(this);
            } else {
                m41Var = null;
            }
            nx0 nx0Var = new nx0(getContext(), this.f32489x, inputStickerSet2, null, m41Var, this.L);
            nx0Var.f31177f0 = false;
            nx0Var.Y = new n41(this, inputStickerSet2);
            this.f32489x.showDialog(nx0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z10;
        i41 i41Var = this.f32485n;
        int childCount = i41Var.getChildCount();
        View view = this.f32484f;
        FrameLayout frameLayout = this.f32488w;
        if (childCount <= 0) {
            int paddingTop = i41Var.getPaddingTop();
            this.A = paddingTop;
            i41Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.A);
            view.setTranslationY(this.A);
            setShadowVisible(false);
            return true;
        }
        View childAt = i41Var.getChildAt(0);
        for (int i11 = 1; i11 < i41Var.getChildCount(); i11++) {
            View childAt2 = i41Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        vk0 vk0Var = (vk0) i41Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
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
        if (this.A == i10) {
            return false;
        }
        this.A = i10;
        i41Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.A);
        view.setTranslationY(this.A);
        return true;
    }

    public final void d() {
        i41 i41Var = this.f32485n;
        f2.p0 adapter = i41Var.getAdapter();
        r41 r41Var = this.f32487s;
        if (adapter == r41Var) {
            r41Var.getClass();
            int childCount = i41Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = i41Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.p3) {
                    ((org.telegram.ui.Cells.p3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.m3) {
                    th0 th0Var = ((org.telegram.ui.Cells.m3) childAt).f24689e;
                    th0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                    org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                    th0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, w02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = i41Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = i41Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.p3) {
                ((org.telegram.ui.Cells.p3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.k8) {
                org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) childAt2;
                k8Var.e();
                k8Var.f();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        i41 i41Var = this.f32485n;
        r41 r41Var = this.f32487s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.F) {
                    f2.p0 adapter = i41Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                r41Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.G != MediaDataController.getInstance(this.f32480a).getFeaturedStickersHashWithoutUnread(false)) {
                this.F = false;
            }
            if (this.F) {
                f2.p0 adapter2 = i41Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            r41Var.G();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i10;
        int i11;
        float f9;
        float f10 = this.M;
        if (f10 != 0.0f && (stickerSetCovered = this.K) != null) {
            float f11 = f10 - 0.0053333333f;
            this.M = f11;
            if (f11 < 0.0f) {
                this.M = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.f32487s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                j41 j41Var = this.f32486r;
                View m10 = j41Var.m(intValue);
                if (m10 != null) {
                    i10 = (int) m10.getY();
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m11 = j41Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i10 = (int) m11.getY();
                    }
                    i11 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                    Paint paint = this.N;
                    paint.setColor(w02);
                    float f12 = this.M;
                    if (f12 < 0.06f) {
                        f9 = f12 / 0.06f;
                    } else {
                        f9 = 1.0f;
                    }
                    paint.setAlpha((int) (f9 * 25.5f));
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
        this.B = false;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.B) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f32485n.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        return dispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.A;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f2.p0 adapter = this.f32485n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.E = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.E) {
            this.E = true;
            r41 r41Var = this.f32487s;
            r41Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.K;
            if (stickerSetCovered != null && (num = (Integer) r41Var.h.get(stickerSetCovered)) != null) {
                this.f32486r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f32485n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        i41 i41Var = this.f32485n;
        if (i41Var.getPaddingTop() != dp) {
            this.D = true;
            i41Var.setPadding(0, dp, 0, 0);
            this.D = false;
        }
    }

    public void setOnScrollListener(f2.a1 a1Var) {
        this.f32490y = a1Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        this.f32489x = o2Var;
    }
}
