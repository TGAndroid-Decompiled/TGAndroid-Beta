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
public abstract class e11 extends org.telegram.ui.Components.ga implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final qy0 G;
    public final di.a h;
    public final org.telegram.ui.Components.c91 f36512n;
    public final ci.w6 f36513r;
    public final d11 f36514s;
    public int v;
    public boolean f36515w;
    public ValueAnimator f36516x;
    public float f36517y;

    public e11(Context context, org.telegram.ui.Components.kw0 kw0Var, ci.w6 w6Var, final org.telegram.ui.Components.ns0 ns0Var) {
        super(context, kw0Var);
        this.F = new Rect();
        this.f36513r = w6Var;
        Objects.requireNonNull(w6Var);
        this.G = new qy0(w6Var, 7);
        final org.telegram.ui.Components.os0 os0Var = (org.telegram.ui.Components.os0) this;
        di.a aVar = new di.a(os0Var, context, ns0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        d11 d11Var = new d11(os0Var);
        this.f36514s = d11Var;
        d11Var.f36213a = w6Var.a();
        aVar.setAdapter(d11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.c91 n10 = aVar.n(10, true);
        this.f36512n = n10;
        n10.g(org.telegram.ui.ActionBar.h6.Gh, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.Eh, org.telegram.ui.ActionBar.h6.Hh, org.telegram.ui.ActionBar.h6.f21266s8);
        n10.f25146r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ci.i7 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (os0Var.f36515w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ns0 ns0Var2 = ns0Var;
                            org.telegram.ui.Components.f5.R(ns0Var2.f28833a, ns0Var2.f28834b, ns0Var2.f28835c, new org.telegram.ui.Components.tv(ns0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !os0Var.f36515w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ns0 ns0Var3 = ns0Var;
                            org.telegram.ui.Components.tv0 tv0Var = ns0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30732v1;
                            storiesController = tv0Var.getStoriesController();
                            if (storiesController.i(tv0Var.f30707j1)) {
                                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.ms0(ns0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.f30732v1, tv0Var2.f30707j1, intValue);
                                                return;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.f30732v1, tv0Var3.f30707j1, intValue);
                                                return;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.f30732v1, tv0Var4.f30707j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                tv0Var.x(H, n2Var, tv0Var.f30707j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.f30732v1, tv0Var2.f30707j1, intValue);
                                                return;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.f30732v1, tv0Var3.f30707j1, intValue);
                                                return;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.f30732v1, tv0Var4.f30707j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.f30732v1, tv0Var2.f30707j1, intValue);
                                                return;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.f30732v1, tv0Var3.f30707j1, intValue);
                                                return;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.f30732v1, tv0Var4.f30707j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.f30732v1, tv0Var2.f30707j1, intValue);
                                                return;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.f30732v1, tv0Var3.f30707j1, intValue);
                                                return;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.f30732v1, tv0Var4.f30707j1, intValue);
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
                ci.i7 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (os0Var.f36515w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ns0 ns0Var2 = ns0Var;
                            org.telegram.ui.Components.f5.R(ns0Var2.f28833a, ns0Var2.f28834b, ns0Var2.f28835c, new org.telegram.ui.Components.tv(ns0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !os0Var.f36515w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ns0 ns0Var3 = ns0Var;
                            org.telegram.ui.Components.tv0 tv0Var = ns0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30732v1;
                            storiesController = tv0Var.getStoriesController();
                            if (storiesController.i(tv0Var.f30707j1)) {
                                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.ms0(ns0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.f30732v1, tv0Var2.f30707j1, intValue);
                                                return;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.f30732v1, tv0Var3.f30707j1, intValue);
                                                return;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.f30732v1, tv0Var4.f30707j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                tv0Var.x(H, n2Var, tv0Var.f30707j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.f30732v1, tv0Var2.f30707j1, intValue);
                                                return;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.f30732v1, tv0Var3.f30707j1, intValue);
                                                return;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.f30732v1, tv0Var4.f30707j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.f30732v1, tv0Var2.f30707j1, intValue);
                                                return;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.f30732v1, tv0Var3.f30707j1, intValue);
                                                return;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.f30732v1, tv0Var4.f30707j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                tv0 tv0Var2 = ns0Var3.d;
                                                tv0Var2.Q0(tv0Var2.f30732v1, tv0Var2.f30707j1, intValue);
                                                return;
                                            case 1:
                                                tv0 tv0Var3 = ns0Var3.d;
                                                tv0Var3.S0(tv0Var3.f30732v1, tv0Var3.f30707j1, intValue);
                                                return;
                                            case 2:
                                                ns0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                tv0 tv0Var4 = ns0Var3.d;
                                                tv0Var4.R0(tv0Var4.f30732v1, tv0Var4.f30707j1, intValue);
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
        c(!w6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i10;
        org.telegram.ui.Components.c91 c91Var = this.f36512n;
        if (c91Var != null) {
            i10 = c91Var.getCurrentTabId();
        } else {
            i10 = 0;
        }
        ci.w6 w6Var = this.f36513r;
        boolean a2 = w6Var.a();
        d11 d11Var = this.f36514s;
        d11Var.f36213a = a2;
        this.h.o(true);
        c(!w6Var.h.isEmpty(), true, false);
        int i11 = this.v;
        if (i11 > 0) {
            if (d11Var.i(i11) != -1) {
                AndroidUtilities.runOnUIThread(new a11(this, this.v, 1), 500L);
                this.v = 0;
            }
        } else if (c91Var != null && i10 > 0 && w6Var.b(i10) == null) {
            c91Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f36516x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36516x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f36517y = f7;
            b();
            return;
        }
        float f10 = this.f36517y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f36516x = ofFloat;
        ofFloat.setDuration(480L);
        this.f36516x.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f36516x.addUpdateListener(new c11(this, 0));
        this.f36516x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate && ((Long) objArr[0]).longValue() == this.f36513r.f6119b) {
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
        return this.f36514s.f(this.f36512n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f36517y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f36517y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ci.w6 w6Var = this.f36513r;
        NotificationCenter.getInstance(w6Var.f6118a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
        if (this.E != w6Var.h.isEmpty() && this.f36514s.f36213a == w6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f36513r.f6118a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f36514s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new a11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f36515w != z10) {
            this.f36515w = z10;
            org.telegram.ui.Components.c91 c91Var = this.f36512n;
            c91Var.setReordering(z10);
            boolean z11 = this.f36515w;
            org.telegram.ui.Components.os0 os0Var = (org.telegram.ui.Components.os0) this;
            org.telegram.ui.Components.tv0 tv0Var = os0Var.H;
            TextView textView = tv0Var.f30719q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.b60(5, os0Var, z11)).start();
            tv0Var.s1(true);
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new cb0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                ci.w6 w6Var = this.f36513r;
                w6Var.e();
                w6Var.f(false);
                int currentPosition = c91Var.getCurrentPosition();
                d11 d11Var = this.f36514s;
                int f12 = d11Var.f(currentPosition);
                this.h.o(true);
                int i10 = d11Var.i(f12);
                c91Var.e(0.0f, i10, i10);
            }
        }
    }
}
