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
public abstract class m11 extends org.telegram.ui.Components.y9 implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public final Rect C;
    public final xy0 D;
    public final k11 h;
    public final org.telegram.ui.Components.l81 f38931n;
    public final oh.h6 f38932r;
    public final l11 f38933s;
    public int v;
    public boolean f38934w;
    public ValueAnimator f38935x;
    public float f38936y;

    public m11(Context context, org.telegram.ui.Components.qv0 qv0Var, oh.h6 h6Var, final org.telegram.ui.Components.sr0 sr0Var) {
        super(context, qv0Var);
        this.C = new Rect();
        this.f38932r = h6Var;
        Objects.requireNonNull(h6Var);
        this.D = new xy0(h6Var, 7);
        final org.telegram.ui.Components.tr0 tr0Var = (org.telegram.ui.Components.tr0) this;
        k11 k11Var = new k11(tr0Var, context, sr0Var);
        this.h = k11Var;
        k11Var.setAllowDisallowInterceptTouch(true);
        l11 l11Var = new l11(tr0Var);
        this.f38933s = l11Var;
        l11Var.f38559a = h6Var.a();
        k11Var.setAdapter(l11Var);
        k11Var.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.l81 n10 = k11Var.n(10, true);
        this.f38931n = n10;
        int i10 = org.telegram.ui.ActionBar.k6.Gh;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        int i12 = org.telegram.ui.ActionBar.k6.Eh;
        int i13 = org.telegram.ui.ActionBar.k6.Hh;
        int i14 = org.telegram.ui.ActionBar.k6.f21930s8;
        n10.M = i10;
        n10.N = i11;
        n10.O = i12;
        n10.P = i13;
        n10.Q = i14;
        n10.L.setColor(org.telegram.ui.ActionBar.k6.v0(i10, n10.f28658g0));
        n10.f28667r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                oh.t6 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (tr0Var.f38934w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.sr0 sr0Var2 = sr0Var;
                            org.telegram.ui.Components.z4.S(sr0Var2.f31160a, sr0Var2.f31161b, sr0Var2.f31162c, new org.telegram.ui.Components.hv(sr0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !tr0Var.f38934w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.sr0 sr0Var3 = sr0Var;
                            org.telegram.ui.Components.zu0 zu0Var = sr0Var3.d;
                            org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
                            storiesController = zu0Var.getStoriesController();
                            if (storiesController.i(zu0Var.f33979g1)) {
                                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(p2Var, view);
                                H.W(new lh.s2(sr0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f34004s1, zu0Var2.f33979g1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f34004s1, zu0Var3.f33979g1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f34004s1, zu0Var4.f33979g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                zu0Var.x(H, p2Var, zu0Var.f33979g1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f34004s1, zu0Var2.f33979g1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f34004s1, zu0Var3.f33979g1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f34004s1, zu0Var4.f33979g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f34004s1, zu0Var2.f33979g1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f34004s1, zu0Var3.f33979g1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f34004s1, zu0Var4.f33979g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f34004s1, zu0Var2.f33979g1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f34004s1, zu0Var3.f33979g1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f34004s1, zu0Var4.f33979g1, intValue);
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
                oh.t6 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (tr0Var.f38934w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.sr0 sr0Var2 = sr0Var;
                            org.telegram.ui.Components.z4.S(sr0Var2.f31160a, sr0Var2.f31161b, sr0Var2.f31162c, new org.telegram.ui.Components.hv(sr0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !tr0Var.f38934w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.sr0 sr0Var3 = sr0Var;
                            org.telegram.ui.Components.zu0 zu0Var = sr0Var3.d;
                            org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
                            storiesController = zu0Var.getStoriesController();
                            if (storiesController.i(zu0Var.f33979g1)) {
                                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(p2Var, view);
                                H.W(new lh.s2(sr0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f34004s1, zu0Var2.f33979g1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f34004s1, zu0Var3.f33979g1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f34004s1, zu0Var4.f33979g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                zu0Var.x(H, p2Var, zu0Var.f33979g1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f34004s1, zu0Var2.f33979g1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f34004s1, zu0Var3.f33979g1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f34004s1, zu0Var4.f33979g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f34004s1, zu0Var2.f33979g1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f34004s1, zu0Var3.f33979g1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f34004s1, zu0Var4.f33979g1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f34004s1, zu0Var2.f33979g1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f34004s1, zu0Var3.f33979g1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f34004s1, zu0Var4.f33979g1, intValue);
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
        addView(n10, k7.c6.e(-1, 42, 48));
        b(!h6Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z4, boolean z10, boolean z11) {
        if (this.B == z4 && !z11) {
            return;
        }
        this.B = z4;
        setEnabled(z4);
        ValueAnimator valueAnimator = this.f38935x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38935x = null;
        }
        float f10 = 0.0f;
        if (!z10) {
            if (z4) {
                f10 = 1.0f;
            }
            this.f38936y = f10;
            a();
            return;
        }
        float f11 = this.f38936y;
        if (z4) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f38935x = ofFloat;
        ofFloat.setDuration(480L);
        this.f38935x.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f38935x.addUpdateListener(new j11(this, 0));
        this.f38935x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            oh.h6 h6Var = this.f38932r;
            if (longValue == h6Var.f17185b) {
                org.telegram.ui.Components.l81 l81Var = this.f38931n;
                if (l81Var != null) {
                    i12 = l81Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = h6Var.a();
                l11 l11Var = this.f38933s;
                l11Var.f38559a = a2;
                this.h.o(true);
                b(!h6Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (l11Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new h11(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (l81Var != null && i12 > 0 && h6Var.b(i12) == null) {
                    l81Var.d(0, 0);
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
        return this.f38933s.f(this.f38931n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f38936y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f38936y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f38932r.f17184a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f38932r.f17184a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        Rect rect = this.C;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f38933s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new h11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z4) {
        float f10;
        float f11;
        if (this.f38934w != z4) {
            this.f38934w = z4;
            org.telegram.ui.Components.l81 l81Var = this.f38931n;
            l81Var.setReordering(z4);
            boolean z10 = this.f38934w;
            org.telegram.ui.Components.tr0 tr0Var = (org.telegram.ui.Components.tr0) this;
            org.telegram.ui.Components.zu0 zu0Var = tr0Var.E;
            TextView textView = zu0Var.f33991n0;
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
            scaleX.scaleY(f12).withEndAction(new kh.f(28, tr0Var, z10)).start();
            zu0Var.q1(true);
            if (z4) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new pb0(profileActivity, 27));
                }
            }
            if (!z4) {
                AndroidUtilities.cancelRunOnUIThread(this.D);
                oh.h6 h6Var = this.f38932r;
                h6Var.e();
                h6Var.f(false);
                int currentPosition = l81Var.getCurrentPosition();
                l11 l11Var = this.f38933s;
                int f13 = l11Var.f(currentPosition);
                this.h.o(true);
                int i10 = l11Var.i(f13);
                l81Var.e(0.0f, i10, i10);
            }
        }
    }
}
