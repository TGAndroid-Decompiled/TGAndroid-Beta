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
public abstract class q11 extends org.telegram.ui.Components.y9 implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public final Rect C;
    public final sz0 D;
    public final oh.a h;
    public final org.telegram.ui.Components.k81 f37277n;
    public final nh.h6 f37278r;
    public final p11 f37279s;
    public int v;
    public boolean f37280w;
    public ValueAnimator f37281x;
    public float f37282y;

    public q11(Context context, org.telegram.ui.Components.qv0 qv0Var, nh.h6 h6Var, final org.telegram.ui.Components.rr0 rr0Var) {
        super(context, qv0Var);
        this.C = new Rect();
        this.f37278r = h6Var;
        Objects.requireNonNull(h6Var);
        this.D = new sz0(h6Var, 6);
        final org.telegram.ui.Components.sr0 sr0Var = (org.telegram.ui.Components.sr0) this;
        oh.a aVar = new oh.a(sr0Var, context, rr0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        p11 p11Var = new p11(sr0Var);
        this.f37279s = p11Var;
        p11Var.f36921a = h6Var.a();
        aVar.setAdapter(p11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.k81 n10 = aVar.n(10, true);
        this.f37277n = n10;
        int i10 = org.telegram.ui.ActionBar.j6.Gh;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        int i12 = org.telegram.ui.ActionBar.j6.Eh;
        int i13 = org.telegram.ui.ActionBar.j6.Hh;
        int i14 = org.telegram.ui.ActionBar.j6.f20151s8;
        n10.M = i10;
        n10.N = i11;
        n10.O = i12;
        n10.P = i13;
        n10.Q = i14;
        n10.L.setColor(org.telegram.ui.ActionBar.j6.v0(i10, n10.f26218g0));
        n10.f26227r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                nh.t6 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (sr0Var.f37280w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.rr0 rr0Var2 = rr0Var;
                            org.telegram.ui.Components.z4.S(rr0Var2.f28574a, rr0Var2.f28575b, rr0Var2.f28576c, new org.telegram.ui.Components.ev(rr0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !sr0Var.f37280w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.rr0 rr0Var3 = rr0Var;
                            org.telegram.ui.Components.yu0 yu0Var = rr0Var3.d;
                            org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31155s1;
                            storiesController = yu0Var.getStoriesController();
                            if (storiesController.i(yu0Var.f31130g1)) {
                                org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(p2Var, view);
                                H.W(new kh.s2(rr0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                yu0 yu0Var2 = rr0Var3.d;
                                                yu0Var2.O0(yu0Var2.f31155s1, yu0Var2.f31130g1, intValue);
                                                return;
                                            case 1:
                                                yu0 yu0Var3 = rr0Var3.d;
                                                yu0Var3.Q0(yu0Var3.f31155s1, yu0Var3.f31130g1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                yu0 yu0Var4 = rr0Var3.d;
                                                yu0Var4.P0(yu0Var4.f31155s1, yu0Var4.f31130g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                yu0Var.x(H, p2Var, yu0Var.f31130g1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                yu0 yu0Var2 = rr0Var3.d;
                                                yu0Var2.O0(yu0Var2.f31155s1, yu0Var2.f31130g1, intValue);
                                                return;
                                            case 1:
                                                yu0 yu0Var3 = rr0Var3.d;
                                                yu0Var3.Q0(yu0Var3.f31155s1, yu0Var3.f31130g1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                yu0 yu0Var4 = rr0Var3.d;
                                                yu0Var4.P0(yu0Var4.f31155s1, yu0Var4.f31130g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                yu0 yu0Var2 = rr0Var3.d;
                                                yu0Var2.O0(yu0Var2.f31155s1, yu0Var2.f31130g1, intValue);
                                                return;
                                            case 1:
                                                yu0 yu0Var3 = rr0Var3.d;
                                                yu0Var3.Q0(yu0Var3.f31155s1, yu0Var3.f31130g1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                yu0 yu0Var4 = rr0Var3.d;
                                                yu0Var4.P0(yu0Var4.f31155s1, yu0Var4.f31130g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                yu0 yu0Var2 = rr0Var3.d;
                                                yu0Var2.O0(yu0Var2.f31155s1, yu0Var2.f31130g1, intValue);
                                                return;
                                            case 1:
                                                yu0 yu0Var3 = rr0Var3.d;
                                                yu0Var3.Q0(yu0Var3.f31155s1, yu0Var3.f31130g1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                yu0 yu0Var4 = rr0Var3.d;
                                                yu0Var4.P0(yu0Var4.f31155s1, yu0Var4.f31130g1, intValue);
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
                nh.t6 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (sr0Var.f37280w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.rr0 rr0Var2 = rr0Var;
                            org.telegram.ui.Components.z4.S(rr0Var2.f28574a, rr0Var2.f28575b, rr0Var2.f28576c, new org.telegram.ui.Components.ev(rr0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !sr0Var.f37280w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.rr0 rr0Var3 = rr0Var;
                            org.telegram.ui.Components.yu0 yu0Var = rr0Var3.d;
                            org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31155s1;
                            storiesController = yu0Var.getStoriesController();
                            if (storiesController.i(yu0Var.f31130g1)) {
                                org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(p2Var, view);
                                H.W(new kh.s2(rr0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                yu0 yu0Var2 = rr0Var3.d;
                                                yu0Var2.O0(yu0Var2.f31155s1, yu0Var2.f31130g1, intValue);
                                                return;
                                            case 1:
                                                yu0 yu0Var3 = rr0Var3.d;
                                                yu0Var3.Q0(yu0Var3.f31155s1, yu0Var3.f31130g1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                yu0 yu0Var4 = rr0Var3.d;
                                                yu0Var4.P0(yu0Var4.f31155s1, yu0Var4.f31130g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                yu0Var.x(H, p2Var, yu0Var.f31130g1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                yu0 yu0Var2 = rr0Var3.d;
                                                yu0Var2.O0(yu0Var2.f31155s1, yu0Var2.f31130g1, intValue);
                                                return;
                                            case 1:
                                                yu0 yu0Var3 = rr0Var3.d;
                                                yu0Var3.Q0(yu0Var3.f31155s1, yu0Var3.f31130g1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                yu0 yu0Var4 = rr0Var3.d;
                                                yu0Var4.P0(yu0Var4.f31155s1, yu0Var4.f31130g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                yu0 yu0Var2 = rr0Var3.d;
                                                yu0Var2.O0(yu0Var2.f31155s1, yu0Var2.f31130g1, intValue);
                                                return;
                                            case 1:
                                                yu0 yu0Var3 = rr0Var3.d;
                                                yu0Var3.Q0(yu0Var3.f31155s1, yu0Var3.f31130g1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                yu0 yu0Var4 = rr0Var3.d;
                                                yu0Var4.P0(yu0Var4.f31155s1, yu0Var4.f31130g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                yu0 yu0Var2 = rr0Var3.d;
                                                yu0Var2.O0(yu0Var2.f31155s1, yu0Var2.f31130g1, intValue);
                                                return;
                                            case 1:
                                                yu0 yu0Var3 = rr0Var3.d;
                                                yu0Var3.Q0(yu0Var3.f31155s1, yu0Var3.f31130g1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                yu0 yu0Var4 = rr0Var3.d;
                                                yu0Var4.P0(yu0Var4.f31155s1, yu0Var4.f31130g1, intValue);
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
        addView(n10, k7.b6.e(-1, 42, 48));
        b(!h6Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z4, boolean z10, boolean z11) {
        if (this.B == z4 && !z11) {
            return;
        }
        this.B = z4;
        setEnabled(z4);
        ValueAnimator valueAnimator = this.f37281x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37281x = null;
        }
        float f10 = 0.0f;
        if (!z10) {
            if (z4) {
                f10 = 1.0f;
            }
            this.f37282y = f10;
            a();
            return;
        }
        float f11 = this.f37282y;
        if (z4) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f37281x = ofFloat;
        ofFloat.setDuration(480L);
        this.f37281x.setInterpolator(org.telegram.ui.Components.mr.h);
        this.f37281x.addUpdateListener(new o11(this, 0));
        this.f37281x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            nh.h6 h6Var = this.f37278r;
            if (longValue == h6Var.f15365b) {
                org.telegram.ui.Components.k81 k81Var = this.f37277n;
                if (k81Var != null) {
                    i12 = k81Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = h6Var.a();
                p11 p11Var = this.f37279s;
                p11Var.f36921a = a2;
                this.h.o(true);
                b(!h6Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (p11Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new m11(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (k81Var != null && i12 > 0 && h6Var.b(i12) == null) {
                    k81Var.d(0, 0);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.B && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.f37279s.f(this.f37277n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f37282y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f37282y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f37278r.f15364a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f37278r.f15364a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        Rect rect = this.C;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f37279s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new m11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z4) {
        float f10;
        float f11;
        if (this.f37280w != z4) {
            this.f37280w = z4;
            org.telegram.ui.Components.k81 k81Var = this.f37277n;
            k81Var.setReordering(z4);
            boolean z10 = this.f37280w;
            org.telegram.ui.Components.sr0 sr0Var = (org.telegram.ui.Components.sr0) this;
            org.telegram.ui.Components.yu0 yu0Var = sr0Var.E;
            TextView textView = yu0Var.f31142n0;
            textView.setVisibility(0);
            ViewPropertyAnimator animate = textView.animate();
            float f12 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z10) {
                f12 = 0.4f;
            }
            scaleX.scaleY(f12).withEndAction(new jh.f(29, sr0Var, z10)).start();
            yu0Var.q1(true);
            if (z4) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new qb0(profileActivity, 27));
                }
            }
            if (!z4) {
                AndroidUtilities.cancelRunOnUIThread(this.D);
                nh.h6 h6Var = this.f37278r;
                h6Var.e();
                h6Var.f(false);
                int currentPosition = k81Var.getCurrentPosition();
                p11 p11Var = this.f37279s;
                int f13 = p11Var.f(currentPosition);
                this.h.o(true);
                int i10 = p11Var.i(f13);
                k81Var.e(0.0f, i10, i10);
            }
        }
    }
}
