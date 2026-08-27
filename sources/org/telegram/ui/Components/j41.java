package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class j41 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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

    public final int f29580a;

    public final g41 f29581b;

    public final TLRPC.StickerSetCovered[] f29582c;
    public final LongSparseArray d;

    public final LongSparseArray f29583e;

    public final View f29584f;
    public final y31 h;

    public final z31 f29585n;

    public final a41 f29586r;

    public final i41 f29587s;
    public final pf.l1 v;

    public final FrameLayout f29588w;

    public org.telegram.ui.ActionBar.n2 f29589x;

    public f2.b1 f29590y;

    public j41(Context context, final g41 g41Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f29580a = i10;
        this.M = 1.0f;
        this.N = new Paint();
        this.f29581b = g41Var;
        this.f29582c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f29583e = longSparseArray2;
        this.K = stickerSetCovered;
        this.L = c6Var;
        i41 i41Var = new i41(this, context);
        this.f29587s = i41Var;
        this.v = new pf.l1(context, new x31(this, g41Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, c6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29588w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        y31 y31Var = new y31(this, context, c6Var);
        this.h = y31Var;
        y31Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(y31Var, h7.z5.e(-1, -1, 48));
        z31 z31Var = new z31(this, context, g41Var);
        this.f29585n = z31Var;
        final j jVar = new j(this, 19);
        z31Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return g41Var.e(this.f34100a.f29585n, jVar2, motionEvent);
            }
        });
        z31Var.setOverScrollMode(2);
        z31Var.setClipToPadding(false);
        z31Var.setItemAnimator(null);
        z31Var.setLayoutAnimation(null);
        a41 a41Var = new a41(this, AndroidUtilities.dp(58.0f), z31Var);
        this.f29586r = a41Var;
        z31Var.setLayoutManager(a41Var);
        a41Var.O = new b41(this);
        z31Var.setOnScrollListener(new c41(this));
        z31Var.setAdapter(i41Var);
        z31Var.setOnItemClickListener(jVar);
        addView(z31Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f29584f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.V5, c6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, h7.z5.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            this.f29584f.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).start();
        }
    }

    public final void a(boolean z10) {
        this.I = z10;
        if (!z10) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.H.cancel();
                this.H = null;
                return;
            }
            return;
        }
        if (getContentTopOffset() <= 0 || this.H != null) {
            return;
        }
        int contentTopOffset = getContentTopOffset();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.H = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new f41(this, contentTopOffset));
        this.H.addListener(new f11(this, 3));
        this.H.setDuration(250L);
        this.H.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
        this.H.start();
    }

    public final void b(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet) {
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f22400id = stickerSet.f22407id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            g41 g41Var = this.f29581b;
            g41Var.getClass();
            ex0 ex0Var = new ex0(getContext(), this.f29589x, inputStickerSet2, null, g41Var instanceof rw ? new d41(this) : null, this.L);
            ex0Var.f28179f0 = false;
            ex0Var.Y = new e41(this, inputStickerSet2);
            this.f29589x.showDialog(ex0Var);
        }
    }

    public final boolean c() {
        z31 z31Var = this.f29585n;
        int childCount = z31Var.getChildCount();
        View view = this.f29584f;
        FrameLayout frameLayout = this.f29588w;
        if (childCount <= 0) {
            int paddingTop = z31Var.getPaddingTop();
            this.A = paddingTop;
            z31Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.A);
            view.setTranslationY(this.A);
            setShadowVisible(false);
            return true;
        }
        View childAt = z31Var.getChildAt(0);
        for (int i10 = 1; i10 < z31Var.getChildCount(); i10++) {
            View childAt2 = z31Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        lk0 lk0Var = (lk0) z31Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        int i11 = (top <= 0 || lk0Var == null || lk0Var.b() != 0) ? 0 : top;
        setShadowVisible(top < 0);
        if (this.A == i11) {
            return false;
        }
        this.A = i11;
        z31Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i11);
        frameLayout.setTranslationY(this.A);
        view.setTranslationY(this.A);
        return true;
    }

    public final void d() {
        z31 z31Var = this.f29585n;
        f2.q0 adapter = z31Var.getAdapter();
        i41 i41Var = this.f29587s;
        if (adapter != i41Var) {
            this.v.getClass();
            int childCount = z31Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = z31Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.p3) {
                    ((org.telegram.ui.Cells.p3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.j8) {
                    org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) childAt;
                    j8Var.e();
                    j8Var.f();
                }
            }
            return;
        }
        i41Var.getClass();
        int childCount2 = z31Var.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = z31Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.p3) {
                ((org.telegram.ui.Cells.p3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.m3) {
                lh0 lh0Var = ((org.telegram.ui.Cells.m3) childAt2).f24671e;
                lh0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
                int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                lh0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, iW0));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        z31 z31Var = this.f29585n;
        i41 i41Var = this.f29587s;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (!this.F) {
                    i41Var.G();
                    return;
                }
                f2.q0 adapter = z31Var.getAdapter();
                if (adapter != null) {
                    adapter.r(0, adapter.h(), 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.featuredStickersDidLoad) {
            if (this.G != MediaDataController.getInstance(this.f29580a).getFeaturedStickersHashWithoutUnread(false)) {
                this.F = false;
            }
            if (!this.F) {
                i41Var.G();
                return;
            }
            f2.q0 adapter2 = z31Var.getAdapter();
            if (adapter2 != null) {
                adapter2.r(0, adapter2.h(), 0);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int y10;
        int measuredHeight;
        float f10 = this.M;
        if (f10 == 0.0f || (stickerSetCovered = this.K) == null) {
            canvas2 = canvas;
        } else {
            float f11 = f10 - 0.0053333333f;
            this.M = f11;
            if (f11 < 0.0f) {
                this.M = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.f29587s.h.get(stickerSetCovered);
            if (num != null) {
                int iIntValue = num.intValue();
                a41 a41Var = this.f29586r;
                View viewM = a41Var.m(iIntValue);
                if (viewM != null) {
                    y10 = (int) viewM.getY();
                    measuredHeight = viewM.getMeasuredHeight() + ((int) viewM.getY());
                } else {
                    y10 = -1;
                    measuredHeight = -1;
                }
                View viewM2 = a41Var.m(num.intValue() + 1);
                if (viewM2 != null) {
                    if (viewM == null) {
                        y10 = (int) viewM2.getY();
                    }
                    measuredHeight = viewM2.getMeasuredHeight() + ((int) viewM2.getY());
                }
                if (viewM == null && viewM2 == null) {
                    canvas2 = canvas;
                } else {
                    int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                    Paint paint = this.N;
                    paint.setColor(iW0);
                    float f12 = this.M;
                    paint.setAlpha((int) ((f12 < 0.06f ? f12 / 0.06f : 1.0f) * 25.5f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, y10, getMeasuredWidth(), measuredHeight, paint);
                }
            } else {
                canvas2 = canvas;
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.B = false;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.B) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            this.f29585n.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        return zDispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.A;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f2.q0 adapter = this.f29585n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.E = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Integer num;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.E) {
            return;
        }
        this.E = true;
        i41 i41Var = this.f29587s;
        i41Var.G();
        TLRPC.StickerSetCovered stickerSetCovered = this.K;
        if (stickerSetCovered == null || (num = (Integer) i41Var.h.get(stickerSetCovered)) == null) {
            return;
        }
        this.f29586r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f29585n.getPaddingTop()));
    }

    public void setContentViewPaddingTop(int i10) {
        int iDp = AndroidUtilities.dp(58.0f) + i10;
        z31 z31Var = this.f29585n;
        if (z31Var.getPaddingTop() != iDp) {
            this.D = true;
            z31Var.setPadding(0, iDp, 0, 0);
            this.D = false;
        }
    }

    public void setOnScrollListener(f2.b1 b1Var) {
        this.f29590y = b1Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        this.f29589x = n2Var;
    }
}
