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
public abstract class h21 extends org.telegram.ui.Components.fa implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final k01 G;
    public final ai.c h;
    public final org.telegram.ui.Components.u81 f33250n;
    public final zh.w4 f33251r;
    public final g21 f33252s;
    public int v;
    public boolean f33253w;
    public ValueAnimator f33254x;
    public float f33255y;

    public h21(Context context, org.telegram.ui.Components.aw0 aw0Var, zh.w4 w4Var, final org.telegram.ui.Components.as0 as0Var) {
        super(context, aw0Var);
        this.F = new Rect();
        this.f33251r = w4Var;
        Objects.requireNonNull(w4Var);
        this.G = new k01(w4Var, 6);
        final org.telegram.ui.Components.cs0 cs0Var = (org.telegram.ui.Components.cs0) this;
        ai.c cVar = new ai.c(cs0Var, context, as0Var);
        this.h = cVar;
        cVar.setAllowDisallowInterceptTouch(true);
        g21 g21Var = new g21(cs0Var);
        this.f33252s = g21Var;
        g21Var.f32978a = w4Var.a();
        cVar.setAdapter(g21Var);
        cVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.u81 n10 = cVar.n(10, true);
        this.f33250n = n10;
        int i10 = org.telegram.ui.ActionBar.j6.Gh;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        int i12 = org.telegram.ui.ActionBar.j6.Eh;
        int i13 = org.telegram.ui.ActionBar.j6.Hh;
        int i14 = org.telegram.ui.ActionBar.j6.f18201s8;
        n10.P = i10;
        n10.Q = i11;
        n10.R = i12;
        n10.S = i13;
        n10.T = i14;
        n10.O.setColor(org.telegram.ui.ActionBar.j6.v0(i10, n10.f27627j0));
        n10.f27635r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                zh.i5 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (cs0Var.f33253w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.as0 as0Var2 = as0Var;
                            org.telegram.ui.Components.d5.S(as0Var2.f21579a, as0Var2.f21580b, as0Var2.f21581c, new org.telegram.ui.Components.pv(as0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !cs0Var.f33253w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.as0 as0Var3 = as0Var;
                            org.telegram.ui.Components.iv0 iv0Var = as0Var3.d;
                            org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
                            storiesController = iv0Var.getStoriesController();
                            if (storiesController.i(iv0Var.f24106j1)) {
                                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(p2Var, view);
                                H.W(new org.telegram.ui.Components.zr0(as0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.f24131v1, iv0Var2.f24106j1, intValue);
                                                return;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.f24131v1, iv0Var3.f24106j1, intValue);
                                                return;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.f24131v1, iv0Var4.f24106j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                iv0Var.x(H, p2Var, iv0Var.f24106j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.f24131v1, iv0Var2.f24106j1, intValue);
                                                return;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.f24131v1, iv0Var3.f24106j1, intValue);
                                                return;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.f24131v1, iv0Var4.f24106j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.f24131v1, iv0Var2.f24106j1, intValue);
                                                return;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.f24131v1, iv0Var3.f24106j1, intValue);
                                                return;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.f24131v1, iv0Var4.f24106j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.f24131v1, iv0Var2.f24106j1, intValue);
                                                return;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.f24131v1, iv0Var3.f24106j1, intValue);
                                                return;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.f24131v1, iv0Var4.f24106j1, intValue);
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
                zh.i5 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (cs0Var.f33253w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.as0 as0Var2 = as0Var;
                            org.telegram.ui.Components.d5.S(as0Var2.f21579a, as0Var2.f21580b, as0Var2.f21581c, new org.telegram.ui.Components.pv(as0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !cs0Var.f33253w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.as0 as0Var3 = as0Var;
                            org.telegram.ui.Components.iv0 iv0Var = as0Var3.d;
                            org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
                            storiesController = iv0Var.getStoriesController();
                            if (storiesController.i(iv0Var.f24106j1)) {
                                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(p2Var, view);
                                H.W(new org.telegram.ui.Components.zr0(as0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.f24131v1, iv0Var2.f24106j1, intValue);
                                                return;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.f24131v1, iv0Var3.f24106j1, intValue);
                                                return;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.f24131v1, iv0Var4.f24106j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                iv0Var.x(H, p2Var, iv0Var.f24106j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.f24131v1, iv0Var2.f24106j1, intValue);
                                                return;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.f24131v1, iv0Var3.f24106j1, intValue);
                                                return;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.f24131v1, iv0Var4.f24106j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.f24131v1, iv0Var2.f24106j1, intValue);
                                                return;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.f24131v1, iv0Var3.f24106j1, intValue);
                                                return;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.f24131v1, iv0Var4.f24106j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                iv0 iv0Var2 = as0Var3.d;
                                                iv0Var2.O0(iv0Var2.f24131v1, iv0Var2.f24106j1, intValue);
                                                return;
                                            case 1:
                                                iv0 iv0Var3 = as0Var3.d;
                                                iv0Var3.Q0(iv0Var3.f24131v1, iv0Var3.f24106j1, intValue);
                                                return;
                                            case 2:
                                                as0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                iv0 iv0Var4 = as0Var3.d;
                                                iv0Var4.P0(iv0Var4.f24131v1, iv0Var4.f24106j1, intValue);
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
        addView(n10, w7.a6.e(-1, 42, 48));
        b(!w4Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f33254x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33254x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f33255y = f7;
            a();
            return;
        }
        float f10 = this.f33255y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f33254x = ofFloat;
        ofFloat.setDuration(480L);
        this.f33254x.setInterpolator(org.telegram.ui.Components.wr.h);
        this.f33254x.addUpdateListener(new f21(this, 0));
        this.f33254x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            zh.w4 w4Var = this.f33251r;
            if (longValue == w4Var.f49004b) {
                org.telegram.ui.Components.u81 u81Var = this.f33250n;
                if (u81Var != null) {
                    i12 = u81Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = w4Var.a();
                g21 g21Var = this.f33252s;
                g21Var.f32978a = a2;
                this.h.o(true);
                b(!w4Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (g21Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new d21(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (u81Var != null && i12 > 0 && w4Var.b(i12) == null) {
                    u81Var.d(0, 0);
                }
            }
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
        return this.f33252s.f(this.f33250n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f33255y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f33255y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f33251r.f49003a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f33251r.f49003a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f33252s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new d21(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f33253w != z10) {
            this.f33253w = z10;
            org.telegram.ui.Components.u81 u81Var = this.f33250n;
            u81Var.setReordering(z10);
            boolean z11 = this.f33253w;
            org.telegram.ui.Components.cs0 cs0Var = (org.telegram.ui.Components.cs0) this;
            org.telegram.ui.Components.iv0 iv0Var = cs0Var.H;
            TextView textView = iv0Var.f24118q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.bs0(0, cs0Var, z11)).start();
            iv0Var.q1(true);
            if (z10) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new yb0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                zh.w4 w4Var = this.f33251r;
                w4Var.e();
                w4Var.f(false);
                int currentPosition = u81Var.getCurrentPosition();
                g21 g21Var = this.f33252s;
                int f12 = g21Var.f(currentPosition);
                this.h.o(true);
                int i10 = g21Var.i(f12);
                u81Var.e(0.0f, i10, i10);
            }
        }
    }
}
