package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public abstract class i11 extends org.telegram.ui.Components.ga implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final my0 G;
    public final di.a h;
    public final org.telegram.ui.Components.k91 f38037n;
    public final ci.v6 f38038r;
    public final h11 f38039s;
    public int v;
    public boolean f38040w;
    public ValueAnimator f38041x;
    public float f38042y;

    public i11(Context context, org.telegram.ui.Components.ow0 ow0Var, ci.v6 v6Var, final org.telegram.ui.Components.rs0 rs0Var) {
        super(context, ow0Var);
        this.F = new Rect();
        this.f38038r = v6Var;
        Objects.requireNonNull(v6Var);
        this.G = new my0(v6Var, 8);
        final org.telegram.ui.Components.ss0 ss0Var = (org.telegram.ui.Components.ss0) this;
        di.a aVar = new di.a(ss0Var, context, rs0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        h11 h11Var = new h11(ss0Var);
        this.f38039s = h11Var;
        h11Var.f37708a = v6Var.a();
        aVar.setAdapter(h11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.k91 n10 = aVar.n(10, true);
        this.f38037n = n10;
        n10.g(org.telegram.ui.ActionBar.k6.Gh, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.Eh, org.telegram.ui.ActionBar.k6.Hh, org.telegram.ui.ActionBar.k6.f21462s8);
        n10.f27981r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ci.h7 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (ss0Var.f38040w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.rs0 rs0Var2 = rs0Var;
                            org.telegram.ui.Components.f5.S(rs0Var2.f30259a, rs0Var2.f30260b, rs0Var2.f30261c, new org.telegram.ui.Components.tv(rs0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ss0Var.f38040w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.rs0 rs0Var3 = rs0Var;
                            org.telegram.ui.Components.xv0 xv0Var = rs0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
                            storiesController = xv0Var.getStoriesController();
                            if (storiesController.i(xv0Var.f32686j1)) {
                                org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(o2Var, view);
                                H.W(new org.telegram.ui.Components.qs0(rs0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.f32711v1, xv0Var2.f32686j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.f32711v1, xv0Var3.f32686j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.f32711v1, xv0Var4.f32686j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                xv0Var.x(H, o2Var, xv0Var.f32686j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.f32711v1, xv0Var2.f32686j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.f32711v1, xv0Var3.f32686j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.f32711v1, xv0Var4.f32686j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.f32711v1, xv0Var2.f32686j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.f32711v1, xv0Var3.f32686j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.f32711v1, xv0Var4.f32686j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.f32711v1, xv0Var2.f32686j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.f32711v1, xv0Var3.f32686j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.f32711v1, xv0Var4.f32686j1, intValue);
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
                ci.h7 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (ss0Var.f38040w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.rs0 rs0Var2 = rs0Var;
                            org.telegram.ui.Components.f5.S(rs0Var2.f30259a, rs0Var2.f30260b, rs0Var2.f30261c, new org.telegram.ui.Components.tv(rs0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ss0Var.f38040w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.rs0 rs0Var3 = rs0Var;
                            org.telegram.ui.Components.xv0 xv0Var = rs0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
                            storiesController = xv0Var.getStoriesController();
                            if (storiesController.i(xv0Var.f32686j1)) {
                                org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(o2Var, view);
                                H.W(new org.telegram.ui.Components.qs0(rs0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.f32711v1, xv0Var2.f32686j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.f32711v1, xv0Var3.f32686j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.f32711v1, xv0Var4.f32686j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                xv0Var.x(H, o2Var, xv0Var.f32686j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.f32711v1, xv0Var2.f32686j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.f32711v1, xv0Var3.f32686j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.f32711v1, xv0Var4.f32686j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.f32711v1, xv0Var2.f32686j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.f32711v1, xv0Var3.f32686j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.f32711v1, xv0Var4.f32686j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.R0(xv0Var2.f32711v1, xv0Var2.f32686j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.T0(xv0Var3.f32711v1, xv0Var3.f32686j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.S0(xv0Var4.f32711v1, xv0Var4.f32686j1, intValue);
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
        addView(n10, w7.z5.e(-1, 42, 48));
        c(!v6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i10;
        org.telegram.ui.Components.k91 k91Var = this.f38037n;
        if (k91Var != null) {
            i10 = k91Var.getCurrentTabId();
        } else {
            i10 = 0;
        }
        ci.v6 v6Var = this.f38038r;
        boolean a2 = v6Var.a();
        h11 h11Var = this.f38039s;
        h11Var.f37708a = a2;
        this.h.o(true);
        c(!v6Var.h.isEmpty(), true, false);
        int i11 = this.v;
        if (i11 > 0) {
            if (h11Var.i(i11) != -1) {
                AndroidUtilities.runOnUIThread(new e11(this, this.v, 1), 500L);
                this.v = 0;
            }
        } else if (k91Var != null && i10 > 0 && v6Var.b(i10) == null) {
            k91Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f38041x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38041x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f38042y = f7;
            b();
            return;
        }
        float f10 = this.f38042y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f38041x = ofFloat;
        ofFloat.setDuration(480L);
        this.f38041x.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f38041x.addUpdateListener(new g11(this, 0));
        this.f38041x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate && ((Long) objArr[0]).longValue() == this.f38038r.f6024b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.E && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.f38039s.f(this.f38037n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f38042y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f38042y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ci.v6 v6Var = this.f38038r;
        NotificationCenter.getInstance(v6Var.f6023a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
        if (this.E != v6Var.h.isEmpty() && this.f38039s.f37708a == v6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f38038r.f6023a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f38039s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new e11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f38040w != z10) {
            this.f38040w = z10;
            org.telegram.ui.Components.k91 k91Var = this.f38037n;
            k91Var.setReordering(z10);
            boolean z11 = this.f38040w;
            org.telegram.ui.Components.ss0 ss0Var = (org.telegram.ui.Components.ss0) this;
            org.telegram.ui.Components.xv0 xv0Var = ss0Var.H;
            TextView textView = xv0Var.f32698q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.b60(5, ss0Var, z11)).start();
            xv0Var.u1(true);
            if (z10) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.I4(false);
                    AndroidUtilities.runOnUIThread(new ib0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                ci.v6 v6Var = this.f38038r;
                v6Var.e();
                v6Var.f(false);
                int currentPosition = k91Var.getCurrentPosition();
                h11 h11Var = this.f38039s;
                int f12 = h11Var.f(currentPosition);
                this.h.o(true);
                int i10 = h11Var.i(f12);
                k91Var.e(0.0f, i10, i10);
            }
        }
    }
}
