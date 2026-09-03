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
public final class e51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final org.telegram.ui.ActionBar.f6 M;
    public float N;
    public final Paint O;
    public final int f24479a;
    public final b51 f24480b;
    public final TLRPC.StickerSetCovered[] f24481c;
    public final LongSparseArray d;
    public final LongSparseArray e;
    public final View f24482f;
    public final t41 h;
    public final u41 f24483n;
    public final v41 f24484r;
    public final d51 f24485s;
    public final tf.m1 v;
    public final FrameLayout f24486w;
    public org.telegram.ui.ActionBar.p2 f24487x;
    public f2.z0 f24488y;

    public e51(Context context, final b51 b51Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f24479a = i10;
        this.N = 1.0f;
        this.O = new Paint();
        this.f24480b = b51Var;
        this.f24481c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.e = longSparseArray2;
        this.L = stickerSetCovered;
        this.M = f6Var;
        d51 d51Var = new d51(this, context);
        this.f24485s = d51Var;
        this.v = new tf.m1(context, new s41(this, b51Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, f6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24486w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, f6Var));
        t41 t41Var = new t41(this, context, f6Var);
        this.h = t41Var;
        t41Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(t41Var, k7.b6.e(-1, -1, 48));
        u41 u41Var = new u41(this, context, b51Var);
        this.f24483n = u41Var;
        final k kVar = new k(this, 19);
        u41Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar2 = kVar;
                return b51Var.e(e51.this.f24483n, kVar2, motionEvent);
            }
        });
        u41Var.setOverScrollMode(2);
        u41Var.setClipToPadding(false);
        u41Var.setItemAnimator(null);
        u41Var.setLayoutAnimation(null);
        v41 v41Var = new v41(this, AndroidUtilities.dp(58.0f), u41Var);
        this.f24484r = v41Var;
        u41Var.setLayoutManager(v41Var);
        v41Var.O = new w41(this);
        u41Var.setOnScrollListener(new x41(this));
        u41Var.setAdapter(d51Var);
        u41Var.setOnItemClickListener(kVar);
        addView(u41Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f24482f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.V5, f6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, k7.b6.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z4) {
        float f10;
        if (this.D != z4) {
            this.D = z4;
            ViewPropertyAnimator animate = this.f24482f.animate();
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
                ofFloat.addUpdateListener(new a51(this, contentTopOffset));
                this.I.addListener(new od0(this, 24));
                this.I.setDuration(250L);
                this.I.setInterpolator(org.telegram.ui.ActionBar.r1.f20518w);
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
        y41 y41Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f19179id = stickerSet.f19186id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            b51 b51Var = this.f24480b;
            b51Var.getClass();
            if (b51Var instanceof cx) {
                y41Var = new y41(this);
            } else {
                y41Var = null;
            }
            xx0 xx0Var = new xx0(getContext(), this.f24487x, inputStickerSet2, null, y41Var, this.M);
            xx0Var.f30758g0 = false;
            xx0Var.Z = new z41(this, inputStickerSet2);
            this.f24487x.showDialog(xx0Var);
        }
    }

    public final boolean c() {
        int i10;
        boolean z4;
        u41 u41Var = this.f24483n;
        int childCount = u41Var.getChildCount();
        View view = this.f24482f;
        FrameLayout frameLayout = this.f24486w;
        if (childCount <= 0) {
            int paddingTop = u41Var.getPaddingTop();
            this.B = paddingTop;
            u41Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.B);
            view.setTranslationY(this.B);
            setShadowVisible(false);
            return true;
        }
        View childAt = u41Var.getChildAt(0);
        for (int i11 = 1; i11 < u41Var.getChildCount(); i11++) {
            View childAt2 = u41Var.getChildAt(i11);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        dl0 dl0Var = (dl0) u41Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && dl0Var != null && dl0Var.b() == 0) {
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
        u41Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i10);
        frameLayout.setTranslationY(this.B);
        view.setTranslationY(this.B);
        return true;
    }

    public final void d() {
        u41 u41Var = this.f24483n;
        f2.o0 adapter = u41Var.getAdapter();
        d51 d51Var = this.f24485s;
        if (adapter == d51Var) {
            d51Var.getClass();
            int childCount = u41Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = u41Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q3) {
                    ((org.telegram.ui.Cells.q3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.n3) {
                    fi0 fi0Var = ((org.telegram.ui.Cells.n3) childAt).e;
                    fi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                    org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                    fi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, w02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = u41Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = u41Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.q3) {
                ((org.telegram.ui.Cells.q3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.l8) {
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) childAt2;
                l8Var.e();
                l8Var.f();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        u41 u41Var = this.f24483n;
        d51 d51Var = this.f24485s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.G) {
                    f2.o0 adapter = u41Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                d51Var.G();
            }
        } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.H != MediaDataController.getInstance(this.f24479a).getFeaturedStickersHashWithoutUnread(false)) {
                this.G = false;
            }
            if (this.G) {
                f2.o0 adapter2 = u41Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            d51Var.G();
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
            Integer num = (Integer) this.f24485s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                v41 v41Var = this.f24484r;
                View m9 = v41Var.m(intValue);
                if (m9 != null) {
                    i10 = (int) m9.getY();
                    i11 = m9.getMeasuredHeight() + ((int) m9.getY());
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                View m10 = v41Var.m(num.intValue() + 1);
                if (m10 != null) {
                    if (m9 == null) {
                        i10 = (int) m10.getY();
                    }
                    i11 = m10.getMeasuredHeight() + ((int) m10.getY());
                }
                if (m9 != null || m10 != null) {
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
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
            this.f24483n.dispatchTouchEvent(obtain);
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
        f2.o0 adapter = this.f24483n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.F = false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z4, i10, i11, i12, i13);
        if (!this.F) {
            this.F = true;
            d51 d51Var = this.f24485s;
            d51Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.L;
            if (stickerSetCovered != null && (num = (Integer) d51Var.h.get(stickerSetCovered)) != null) {
                this.f24484r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f24483n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i10) {
        int dp = AndroidUtilities.dp(58.0f) + i10;
        u41 u41Var = this.f24483n;
        if (u41Var.getPaddingTop() != dp) {
            this.E = true;
            u41Var.setPadding(0, dp, 0, 0);
            this.E = false;
        }
    }

    public void setOnScrollListener(f2.z0 z0Var) {
        this.f24488y = z0Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        this.f24487x = p2Var;
    }
}
