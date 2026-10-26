package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public abstract class l11 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final ei.a f41111a;
    public final org.telegram.ui.Components.t91 f41112b;
    public final di.v6 f41113c;
    public final k11 d;
    public int e;
    public boolean f41114f;
    public ValueAnimator h;
    public float f41115n;
    public boolean f41116r;
    public final Rect f41117s;
    public final my0 v;

    public l11(Context context, di.v6 v6Var, final org.telegram.ui.Components.ys0 ys0Var) {
        super(context);
        this.f41117s = new Rect();
        this.f41113c = v6Var;
        Objects.requireNonNull(v6Var);
        this.v = new my0(v6Var, 9);
        final org.telegram.ui.Components.zs0 zs0Var = (org.telegram.ui.Components.zs0) this;
        ei.a aVar = new ei.a(zs0Var, context, ys0Var);
        this.f41111a = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        k11 k11Var = new k11(zs0Var);
        this.d = k11Var;
        k11Var.f40785a = v6Var.a();
        aVar.setAdapter(k11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.t91 n10 = aVar.n(10, true);
        this.f41112b = n10;
        n10.g(org.telegram.ui.ActionBar.y6.Gh, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.Eh, org.telegram.ui.ActionBar.y6.Hh, org.telegram.ui.ActionBar.y6.f23636s8);
        n10.f32943r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                di.h7 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (zs0Var.f41114f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ys0 ys0Var2 = ys0Var;
                            org.telegram.ui.Components.g5.R(ys0Var2.f35135a, ys0Var2.f35136b, ys0Var2.f35137c, new org.telegram.ui.Components.tv(ys0Var2, 22));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zs0Var.f41114f) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ys0 ys0Var3 = ys0Var;
                            org.telegram.ui.Components.aw0 aw0Var = ys0Var3.d;
                            org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26704x1;
                            storiesController = aw0Var.getStoriesController();
                            if (storiesController.i(aw0Var.l1)) {
                                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(r2Var, view);
                                H.W(new org.telegram.ui.Components.xs0(ys0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                aw0 aw0Var2 = ys0Var3.d;
                                                aw0Var2.U0(aw0Var2.f26704x1, aw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                aw0 aw0Var3 = ys0Var3.d;
                                                aw0Var3.W0(aw0Var3.f26704x1, aw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                ys0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                aw0 aw0Var4 = ys0Var3.d;
                                                aw0Var4.V0(aw0Var4.f26704x1, aw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                aw0Var.A(new jg.s0(H, 22), r2Var, aw0Var.l1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                aw0 aw0Var2 = ys0Var3.d;
                                                aw0Var2.U0(aw0Var2.f26704x1, aw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                aw0 aw0Var3 = ys0Var3.d;
                                                aw0Var3.W0(aw0Var3.f26704x1, aw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                ys0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                aw0 aw0Var4 = ys0Var3.d;
                                                aw0Var4.V0(aw0Var4.f26704x1, aw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                aw0 aw0Var2 = ys0Var3.d;
                                                aw0Var2.U0(aw0Var2.f26704x1, aw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                aw0 aw0Var3 = ys0Var3.d;
                                                aw0Var3.W0(aw0Var3.f26704x1, aw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                ys0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                aw0 aw0Var4 = ys0Var3.d;
                                                aw0Var4.V0(aw0Var4.f26704x1, aw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                aw0 aw0Var2 = ys0Var3.d;
                                                aw0Var2.U0(aw0Var2.f26704x1, aw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                aw0 aw0Var3 = ys0Var3.d;
                                                aw0Var3.W0(aw0Var3.f26704x1, aw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                ys0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                aw0 aw0Var4 = ys0Var3.d;
                                                aw0Var4.V0(aw0Var4.f26704x1, aw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, true);
                                H.Z();
                            }
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                }
            }
        });
        n10.setOnTabLongClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                di.h7 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (zs0Var.f41114f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ys0 ys0Var2 = ys0Var;
                            org.telegram.ui.Components.g5.R(ys0Var2.f35135a, ys0Var2.f35136b, ys0Var2.f35137c, new org.telegram.ui.Components.tv(ys0Var2, 22));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zs0Var.f41114f) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ys0 ys0Var3 = ys0Var;
                            org.telegram.ui.Components.aw0 aw0Var = ys0Var3.d;
                            org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26704x1;
                            storiesController = aw0Var.getStoriesController();
                            if (storiesController.i(aw0Var.l1)) {
                                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(r2Var, view);
                                H.W(new org.telegram.ui.Components.xs0(ys0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                aw0 aw0Var2 = ys0Var3.d;
                                                aw0Var2.U0(aw0Var2.f26704x1, aw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                aw0 aw0Var3 = ys0Var3.d;
                                                aw0Var3.W0(aw0Var3.f26704x1, aw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                ys0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                aw0 aw0Var4 = ys0Var3.d;
                                                aw0Var4.V0(aw0Var4.f26704x1, aw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                aw0Var.A(new jg.s0(H, 22), r2Var, aw0Var.l1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                aw0 aw0Var2 = ys0Var3.d;
                                                aw0Var2.U0(aw0Var2.f26704x1, aw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                aw0 aw0Var3 = ys0Var3.d;
                                                aw0Var3.W0(aw0Var3.f26704x1, aw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                ys0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                aw0 aw0Var4 = ys0Var3.d;
                                                aw0Var4.V0(aw0Var4.f26704x1, aw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                aw0 aw0Var2 = ys0Var3.d;
                                                aw0Var2.U0(aw0Var2.f26704x1, aw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                aw0 aw0Var3 = ys0Var3.d;
                                                aw0Var3.W0(aw0Var3.f26704x1, aw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                ys0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                aw0 aw0Var4 = ys0Var3.d;
                                                aw0Var4.V0(aw0Var4.f26704x1, aw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                aw0 aw0Var2 = ys0Var3.d;
                                                aw0Var2.U0(aw0Var2.f26704x1, aw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                aw0 aw0Var3 = ys0Var3.d;
                                                aw0Var3.W0(aw0Var3.f26704x1, aw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                ys0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                aw0 aw0Var4 = ys0Var3.d;
                                                aw0Var4.V0(aw0Var4.f26704x1, aw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, true);
                                H.Z();
                            }
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                }
            }
        });
        addView(n10, org.telegram.ui.Components.gb1.i(-1, 42, 48));
        c(!v6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i10;
        org.telegram.ui.Components.t91 t91Var = this.f41112b;
        if (t91Var != null) {
            i10 = t91Var.getCurrentTabId();
        } else {
            i10 = 0;
        }
        di.v6 v6Var = this.f41113c;
        boolean a2 = v6Var.a();
        k11 k11Var = this.d;
        k11Var.f40785a = a2;
        this.f41111a.o(true);
        c(!v6Var.h.isEmpty(), true, false);
        int i11 = this.e;
        if (i11 > 0) {
            if (k11Var.i(i11) != -1) {
                AndroidUtilities.runOnUIThread(new j11(this, this.e, 1), 500L);
                this.e = 0;
            }
        } else if (t91Var != null && i10 > 0 && v6Var.b(i10) == null) {
            t91Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.f41116r == z10 && !z12) {
            return;
        }
        this.f41116r = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f41115n = f7;
            b();
            return;
        }
        float f10 = this.f41115n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.h = ofFloat;
        ofFloat.setDuration(480L);
        this.h.setInterpolator(org.telegram.ui.Components.ds.h);
        this.h.addUpdateListener(new b3(this, 29));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate && ((Long) objArr[0]).longValue() == this.f41113c.f9261b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f41116r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f41112b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f41115n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f41115n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        di.v6 v6Var = this.f41113c;
        NotificationCenter.getInstance(v6Var.f9260a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
        if (this.f41116r != v6Var.h.isEmpty() && this.d.f40785a == v6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f41113c.f9260a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.f41117s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.d.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new j11(this, i10, 0), 500L);
        } else {
            this.e = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f41114f != z10) {
            this.f41114f = z10;
            org.telegram.ui.Components.t91 t91Var = this.f41112b;
            t91Var.setReordering(z10);
            boolean z11 = this.f41114f;
            org.telegram.ui.Components.zs0 zs0Var = (org.telegram.ui.Components.zs0) this;
            org.telegram.ui.Components.aw0 aw0Var = zs0Var.f35400w;
            TextView textView = aw0Var.f26691s0;
            textView.setVisibility(0);
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 1.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!z11) {
                f11 = 0.4f;
            }
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.d60(5, zs0Var, z11)).start();
            aw0Var.C1(true);
            if (z10) {
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.O4(false);
                    AndroidUtilities.runOnUIThread(new fb0(profileActivity, 28));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.v);
                di.v6 v6Var = this.f41113c;
                v6Var.e();
                v6Var.f(false);
                int currentPosition = t91Var.getCurrentPosition();
                k11 k11Var = this.d;
                int f12 = k11Var.f(currentPosition);
                this.f41111a.o(true);
                int i10 = k11Var.i(f12);
                t91Var.e(0.0f, i10, i10);
            }
        }
    }
}
