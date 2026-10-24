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
public abstract class h11 extends org.telegram.ui.Components.ea implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final ly0 G;
    public final di.a h;
    public final org.telegram.ui.Components.k91 f37714n;
    public final ci.v6 f37715r;
    public final g11 f37716s;
    public int v;
    public boolean f37717w;
    public ValueAnimator f37718x;
    public float f37719y;

    public h11(Context context, org.telegram.ui.Components.nw0 nw0Var, ci.v6 v6Var, final org.telegram.ui.Components.qs0 qs0Var) {
        super(context, nw0Var);
        this.F = new Rect();
        this.f37715r = v6Var;
        Objects.requireNonNull(v6Var);
        this.G = new ly0(v6Var, 8);
        final org.telegram.ui.Components.rs0 rs0Var = (org.telegram.ui.Components.rs0) this;
        di.a aVar = new di.a(rs0Var, context, qs0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        g11 g11Var = new g11(rs0Var);
        this.f37716s = g11Var;
        g11Var.f37419a = v6Var.a();
        aVar.setAdapter(g11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.k91 n10 = aVar.n(10, true);
        this.f37714n = n10;
        n10.g(org.telegram.ui.ActionBar.k6.Gh, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.Eh, org.telegram.ui.ActionBar.k6.Hh, org.telegram.ui.ActionBar.k6.f21463s8);
        n10.f27984r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ci.h7 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (rs0Var.f37717w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.qs0 qs0Var2 = qs0Var;
                            org.telegram.ui.Components.d5.R(qs0Var2.f29988a, qs0Var2.f29989b, qs0Var2.f29990c, new org.telegram.ui.Components.rv(qs0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !rs0Var.f37717w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.qs0 qs0Var3 = qs0Var;
                            org.telegram.ui.Components.wv0 wv0Var = qs0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
                            storiesController = wv0Var.getStoriesController();
                            if (storiesController.i(wv0Var.f32385j1)) {
                                org.telegram.ui.Components.h80 H = org.telegram.ui.Components.h80.H(o2Var, view);
                                H.W(new org.telegram.ui.Components.ps0(qs0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                wv0 wv0Var2 = qs0Var3.d;
                                                wv0Var2.R0(wv0Var2.f32410v1, wv0Var2.f32385j1, intValue);
                                                return;
                                            case 1:
                                                wv0 wv0Var3 = qs0Var3.d;
                                                wv0Var3.T0(wv0Var3.f32410v1, wv0Var3.f32385j1, intValue);
                                                return;
                                            case 2:
                                                qs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                wv0 wv0Var4 = qs0Var3.d;
                                                wv0Var4.S0(wv0Var4.f32410v1, wv0Var4.f32385j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                wv0Var.x(H, o2Var, wv0Var.f32385j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                wv0 wv0Var2 = qs0Var3.d;
                                                wv0Var2.R0(wv0Var2.f32410v1, wv0Var2.f32385j1, intValue);
                                                return;
                                            case 1:
                                                wv0 wv0Var3 = qs0Var3.d;
                                                wv0Var3.T0(wv0Var3.f32410v1, wv0Var3.f32385j1, intValue);
                                                return;
                                            case 2:
                                                qs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                wv0 wv0Var4 = qs0Var3.d;
                                                wv0Var4.S0(wv0Var4.f32410v1, wv0Var4.f32385j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                wv0 wv0Var2 = qs0Var3.d;
                                                wv0Var2.R0(wv0Var2.f32410v1, wv0Var2.f32385j1, intValue);
                                                return;
                                            case 1:
                                                wv0 wv0Var3 = qs0Var3.d;
                                                wv0Var3.T0(wv0Var3.f32410v1, wv0Var3.f32385j1, intValue);
                                                return;
                                            case 2:
                                                qs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                wv0 wv0Var4 = qs0Var3.d;
                                                wv0Var4.S0(wv0Var4.f32410v1, wv0Var4.f32385j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                wv0 wv0Var2 = qs0Var3.d;
                                                wv0Var2.R0(wv0Var2.f32410v1, wv0Var2.f32385j1, intValue);
                                                return;
                                            case 1:
                                                wv0 wv0Var3 = qs0Var3.d;
                                                wv0Var3.T0(wv0Var3.f32410v1, wv0Var3.f32385j1, intValue);
                                                return;
                                            case 2:
                                                qs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                wv0 wv0Var4 = qs0Var3.d;
                                                wv0Var4.S0(wv0Var4.f32410v1, wv0Var4.f32385j1, intValue);
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
                        if (rs0Var.f37717w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.qs0 qs0Var2 = qs0Var;
                            org.telegram.ui.Components.d5.R(qs0Var2.f29988a, qs0Var2.f29989b, qs0Var2.f29990c, new org.telegram.ui.Components.rv(qs0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !rs0Var.f37717w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.qs0 qs0Var3 = qs0Var;
                            org.telegram.ui.Components.wv0 wv0Var = qs0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
                            storiesController = wv0Var.getStoriesController();
                            if (storiesController.i(wv0Var.f32385j1)) {
                                org.telegram.ui.Components.h80 H = org.telegram.ui.Components.h80.H(o2Var, view);
                                H.W(new org.telegram.ui.Components.ps0(qs0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                wv0 wv0Var2 = qs0Var3.d;
                                                wv0Var2.R0(wv0Var2.f32410v1, wv0Var2.f32385j1, intValue);
                                                return;
                                            case 1:
                                                wv0 wv0Var3 = qs0Var3.d;
                                                wv0Var3.T0(wv0Var3.f32410v1, wv0Var3.f32385j1, intValue);
                                                return;
                                            case 2:
                                                qs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                wv0 wv0Var4 = qs0Var3.d;
                                                wv0Var4.S0(wv0Var4.f32410v1, wv0Var4.f32385j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                wv0Var.x(H, o2Var, wv0Var.f32385j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                wv0 wv0Var2 = qs0Var3.d;
                                                wv0Var2.R0(wv0Var2.f32410v1, wv0Var2.f32385j1, intValue);
                                                return;
                                            case 1:
                                                wv0 wv0Var3 = qs0Var3.d;
                                                wv0Var3.T0(wv0Var3.f32410v1, wv0Var3.f32385j1, intValue);
                                                return;
                                            case 2:
                                                qs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                wv0 wv0Var4 = qs0Var3.d;
                                                wv0Var4.S0(wv0Var4.f32410v1, wv0Var4.f32385j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                wv0 wv0Var2 = qs0Var3.d;
                                                wv0Var2.R0(wv0Var2.f32410v1, wv0Var2.f32385j1, intValue);
                                                return;
                                            case 1:
                                                wv0 wv0Var3 = qs0Var3.d;
                                                wv0Var3.T0(wv0Var3.f32410v1, wv0Var3.f32385j1, intValue);
                                                return;
                                            case 2:
                                                qs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                wv0 wv0Var4 = qs0Var3.d;
                                                wv0Var4.S0(wv0Var4.f32410v1, wv0Var4.f32385j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                wv0 wv0Var2 = qs0Var3.d;
                                                wv0Var2.R0(wv0Var2.f32410v1, wv0Var2.f32385j1, intValue);
                                                return;
                                            case 1:
                                                wv0 wv0Var3 = qs0Var3.d;
                                                wv0Var3.T0(wv0Var3.f32410v1, wv0Var3.f32385j1, intValue);
                                                return;
                                            case 2:
                                                qs0Var3.d.g1(intValue);
                                                return;
                                            default:
                                                wv0 wv0Var4 = qs0Var3.d;
                                                wv0Var4.S0(wv0Var4.f32410v1, wv0Var4.f32385j1, intValue);
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
        org.telegram.ui.Components.k91 k91Var = this.f37714n;
        if (k91Var != null) {
            i10 = k91Var.getCurrentTabId();
        } else {
            i10 = 0;
        }
        ci.v6 v6Var = this.f37715r;
        boolean a2 = v6Var.a();
        g11 g11Var = this.f37716s;
        g11Var.f37419a = a2;
        this.h.o(true);
        c(!v6Var.h.isEmpty(), true, false);
        int i11 = this.v;
        if (i11 > 0) {
            if (g11Var.i(i11) != -1) {
                AndroidUtilities.runOnUIThread(new d11(this, this.v, 1), 500L);
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
        ValueAnimator valueAnimator = this.f37718x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37718x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f37719y = f7;
            b();
            return;
        }
        float f10 = this.f37719y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f37718x = ofFloat;
        ofFloat.setDuration(480L);
        this.f37718x.setInterpolator(org.telegram.ui.Components.zr.h);
        this.f37718x.addUpdateListener(new f11(this, 0));
        this.f37718x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate && ((Long) objArr[0]).longValue() == this.f37715r.f6024b) {
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
        return this.f37716s.f(this.f37714n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f37719y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f37719y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ci.v6 v6Var = this.f37715r;
        NotificationCenter.getInstance(v6Var.f6023a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
        if (this.E != v6Var.h.isEmpty() && this.f37716s.f37419a == v6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f37715r.f6023a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f37716s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new d11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f37717w != z10) {
            this.f37717w = z10;
            org.telegram.ui.Components.k91 k91Var = this.f37714n;
            k91Var.setReordering(z10);
            boolean z11 = this.f37717w;
            org.telegram.ui.Components.rs0 rs0Var = (org.telegram.ui.Components.rs0) this;
            org.telegram.ui.Components.wv0 wv0Var = rs0Var.H;
            TextView textView = wv0Var.f32397q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.z50(5, rs0Var, z11)).start();
            wv0Var.u1(true);
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
                ci.v6 v6Var = this.f37715r;
                v6Var.e();
                v6Var.f(false);
                int currentPosition = k91Var.getCurrentPosition();
                g11 g11Var = this.f37716s;
                int f12 = g11Var.f(currentPosition);
                this.h.o(true);
                int i10 = g11Var.i(f12);
                k91Var.e(0.0f, i10, i10);
            }
        }
    }
}
