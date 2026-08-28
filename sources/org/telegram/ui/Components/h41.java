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
public final class h41 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public final org.telegram.ui.ActionBar.b6 L;
    public float M;
    public final Paint N;
    public final int f28967a;
    public final e41 f28968b;
    public final TLRPC.StickerSetCovered[] f28969c;
    public final LongSparseArray d;
    public final LongSparseArray f28970e;
    public final View f28971f;
    public final w31 h;
    public final x31 f28972n;
    public final y31 f28973r;
    public final g41 f28974s;
    public final of.y1 v;
    public final FrameLayout f28975w;
    public org.telegram.ui.ActionBar.o2 f28976x;
    public f2.d1 f28977y;

    public h41(Context context, final e41 e41Var, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9 = UserConfig.selectedAccount;
        this.f28967a = i9;
        this.M = 1.0f;
        this.N = new Paint();
        this.f28968b = e41Var;
        this.f28969c = stickerSetCoveredArr;
        this.d = longSparseArray;
        this.f28970e = longSparseArray2;
        this.K = stickerSetCovered;
        this.L = b6Var;
        g41 g41Var = new g41(this, context);
        this.f28974s = g41Var;
        this.v = new of.y1(context, new v31(this, e41Var), stickerSetCoveredArr, longSparseArray, longSparseArray2, b6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28975w = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
        w31 w31Var = new w31(this, context, b6Var);
        this.h = w31Var;
        w31Var.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView(w31Var, g7.e6.e(-1, -1, 48));
        x31 x31Var = new x31(this, context, e41Var);
        this.f28972n = x31Var;
        final j jVar = new j(this, 19);
        x31Var.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                j jVar2 = jVar;
                return e41Var.e(h41.this.f28972n, jVar2, motionEvent);
            }
        });
        x31Var.setOverScrollMode(2);
        x31Var.setClipToPadding(false);
        x31Var.setItemAnimator(null);
        x31Var.setLayoutAnimation(null);
        y31 y31Var = new y31(this, AndroidUtilities.dp(58.0f), x31Var);
        this.f28973r = y31Var;
        x31Var.setLayoutManager(y31Var);
        y31Var.O = new z31(this);
        x31Var.setOnScrollListener(new a41(this));
        x31Var.setAdapter(g41Var);
        x31Var.setOnItemClickListener(jVar);
        addView(x31Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f28971f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.V5, b6Var));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, g7.e6.e(-1, 58, 51));
        d();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i9);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z10) {
        float f10;
        if (this.C != z10) {
            this.C = z10;
            ViewPropertyAnimator animate = this.f28971f.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setDuration(200L).start();
        }
    }

    public final void a(boolean z10) {
        this.I = z10;
        if (z10) {
            if (getContentTopOffset() > 0 && this.H == null) {
                int contentTopOffset = getContentTopOffset();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.addUpdateListener(new d41(this, contentTopOffset));
                this.H.addListener(new y11(this, 1));
                this.H.setDuration(250L);
                this.H.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
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
        b41 b41Var;
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.f22400id = stickerSet.f22407id;
        }
        TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            e41 e41Var = this.f28968b;
            e41Var.getClass();
            if (e41Var instanceof rw) {
                b41Var = new b41(this);
            } else {
                b41Var = null;
            }
            cx0 cx0Var = new cx0(getContext(), this.f28976x, inputStickerSet2, null, b41Var, this.L);
            cx0Var.f27579f0 = false;
            cx0Var.Y = new c41(this, inputStickerSet2);
            this.f28976x.showDialog(cx0Var);
        }
    }

    public final boolean c() {
        int i9;
        boolean z10;
        x31 x31Var = this.f28972n;
        int childCount = x31Var.getChildCount();
        View view = this.f28971f;
        FrameLayout frameLayout = this.f28975w;
        if (childCount <= 0) {
            int paddingTop = x31Var.getPaddingTop();
            this.A = paddingTop;
            x31Var.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.A);
            view.setTranslationY(this.A);
            setShadowVisible(false);
            return true;
        }
        View childAt = x31Var.getChildAt(0);
        for (int i10 = 1; i10 < x31Var.getChildCount(); i10++) {
            View childAt2 = x31Var.getChildAt(i10);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        ik0 ik0Var = (ik0) x31Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        if (top > 0 && ik0Var != null && ik0Var.b() == 0) {
            i9 = top;
        } else {
            i9 = 0;
        }
        if (top < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setShadowVisible(z10);
        if (this.A == i9) {
            return false;
        }
        this.A = i9;
        x31Var.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i9);
        frameLayout.setTranslationY(this.A);
        view.setTranslationY(this.A);
        return true;
    }

    public final void d() {
        x31 x31Var = this.f28972n;
        f2.r0 adapter = x31Var.getAdapter();
        g41 g41Var = this.f28974s;
        if (adapter == g41Var) {
            g41Var.getClass();
            int childCount = x31Var.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = x31Var.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    ((org.telegram.ui.Cells.s3) childAt).d();
                } else if (childAt instanceof org.telegram.ui.Cells.p3) {
                    jh0 jh0Var = ((org.telegram.ui.Cells.p3) childAt).f24859e;
                    jh0Var.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
                    org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
                    jh0Var.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{14.0f}, w02));
                }
            }
            return;
        }
        this.v.getClass();
        int childCount2 = x31Var.getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = x31Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.s3) {
                ((org.telegram.ui.Cells.s3) childAt2).d();
            } else if (childAt2 instanceof org.telegram.ui.Cells.m8) {
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) childAt2;
                m8Var.e();
                m8Var.f();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.stickersDidLoad;
        x31 x31Var = this.f28972n;
        g41 g41Var = this.f28974s;
        if (i9 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.F) {
                    f2.r0 adapter = x31Var.getAdapter();
                    if (adapter != null) {
                        adapter.r(0, adapter.h(), 0);
                        return;
                    }
                    return;
                }
                g41Var.G();
            }
        } else if (i9 == NotificationCenter.featuredStickersDidLoad) {
            if (this.G != MediaDataController.getInstance(this.f28967a).getFeaturedStickersHashWithoutUnread(false)) {
                this.F = false;
            }
            if (this.F) {
                f2.r0 adapter2 = x31Var.getAdapter();
                if (adapter2 != null) {
                    adapter2.r(0, adapter2.h(), 0);
                    return;
                }
                return;
            }
            g41Var.G();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i9;
        int i10;
        float f10;
        float f11 = this.M;
        if (f11 != 0.0f && (stickerSetCovered = this.K) != null) {
            float f12 = f11 - 0.0053333333f;
            this.M = f12;
            if (f12 < 0.0f) {
                this.M = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.f28974s.h.get(stickerSetCovered);
            if (num != null) {
                int intValue = num.intValue();
                y31 y31Var = this.f28973r;
                View m10 = y31Var.m(intValue);
                if (m10 != null) {
                    i9 = (int) m10.getY();
                    i10 = m10.getMeasuredHeight() + ((int) m10.getY());
                } else {
                    i9 = -1;
                    i10 = -1;
                }
                View m11 = y31Var.m(num.intValue() + 1);
                if (m11 != null) {
                    if (m10 == null) {
                        i9 = (int) m11.getY();
                    }
                    i10 = m11.getMeasuredHeight() + ((int) m11.getY());
                }
                if (m10 != null || m11 != null) {
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
                    Paint paint = this.N;
                    paint.setColor(w02);
                    float f13 = this.M;
                    if (f13 < 0.06f) {
                        f10 = f13 / 0.06f;
                    } else {
                        f10 = 1.0f;
                    }
                    paint.setAlpha((int) (f10 * 25.5f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, i9, getMeasuredWidth(), i10, paint);
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
            this.f28972n.dispatchTouchEvent(obtain);
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
        f2.r0 adapter = this.f28972n.getAdapter();
        adapter.m(adapter.h() - 1);
        this.E = false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        Integer num;
        super.onLayout(z10, i9, i10, i11, i12);
        if (!this.E) {
            this.E = true;
            g41 g41Var = this.f28974s;
            g41Var.G();
            TLRPC.StickerSetCovered stickerSetCovered = this.K;
            if (stickerSetCovered != null && (num = (Integer) g41Var.h.get(stickerSetCovered)) != null) {
                this.f28973r.h1(num.intValue(), AndroidUtilities.dp(58.0f) + (-this.f28972n.getPaddingTop()));
            }
        }
    }

    public void setContentViewPaddingTop(int i9) {
        int dp = AndroidUtilities.dp(58.0f) + i9;
        x31 x31Var = this.f28972n;
        if (x31Var.getPaddingTop() != dp) {
            this.D = true;
            x31Var.setPadding(0, dp, 0, 0);
            this.D = false;
        }
    }

    public void setOnScrollListener(f2.d1 d1Var) {
        this.f28977y = d1Var;
    }

    public void setParentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        this.f28976x = o2Var;
    }
}
