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
public abstract class h21 extends org.telegram.ui.Components.ia implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final tz0 G;
    public final ci.a h;
    public final org.telegram.ui.Components.k91 f36375n;
    public final bi.i8 f36376r;
    public final g21 f36377s;
    public int v;
    public boolean f36378w;
    public ValueAnimator f36379x;
    public float f36380y;

    public h21(Context context, org.telegram.ui.Components.ow0 ow0Var, bi.i8 i8Var, final org.telegram.ui.Components.rs0 rs0Var) {
        super(context, ow0Var);
        this.F = new Rect();
        this.f36376r = i8Var;
        Objects.requireNonNull(i8Var);
        this.G = new tz0(i8Var, 7);
        final org.telegram.ui.Components.ss0 ss0Var = (org.telegram.ui.Components.ss0) this;
        ci.a aVar = new ci.a(ss0Var, context, rs0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        g21 g21Var = new g21(ss0Var);
        this.f36377s = g21Var;
        g21Var.f36040a = i8Var.a();
        aVar.setAdapter(g21Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.k91 n10 = aVar.n(10, true);
        this.f36375n = n10;
        n10.g(org.telegram.ui.ActionBar.g6.Gh, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.Eh, org.telegram.ui.ActionBar.g6.Hh, org.telegram.ui.ActionBar.g6.f19880s8);
        n10.f26326r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                bi.x8 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (ss0Var.f36378w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.rs0 rs0Var2 = rs0Var;
                            org.telegram.ui.Components.g5.R(rs0Var2.f28639a, rs0Var2.f28640b, rs0Var2.f28641c, new org.telegram.ui.Components.xv(rs0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ss0Var.f36378w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.rs0 rs0Var3 = rs0Var;
                            org.telegram.ui.Components.xv0 xv0Var = rs0Var3.d;
                            org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31069v1;
                            storiesController = xv0Var.getStoriesController();
                            if (storiesController.i(xv0Var.f31044j1)) {
                                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(m2Var, view);
                                H.W(new org.telegram.ui.Components.qs0(rs0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.P0(xv0Var2.f31069v1, xv0Var2.f31044j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.f31069v1, xv0Var3.f31044j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.f31069v1, xv0Var4.f31044j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                xv0Var.x(H, m2Var, xv0Var.f31044j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.P0(xv0Var2.f31069v1, xv0Var2.f31044j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.f31069v1, xv0Var3.f31044j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.f31069v1, xv0Var4.f31044j1, intValue);
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
                                                xv0Var2.P0(xv0Var2.f31069v1, xv0Var2.f31044j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.f31069v1, xv0Var3.f31044j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.f31069v1, xv0Var4.f31044j1, intValue);
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
                                                xv0Var2.P0(xv0Var2.f31069v1, xv0Var2.f31044j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.f31069v1, xv0Var3.f31044j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.f31069v1, xv0Var4.f31044j1, intValue);
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
                bi.x8 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (ss0Var.f36378w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.rs0 rs0Var2 = rs0Var;
                            org.telegram.ui.Components.g5.R(rs0Var2.f28639a, rs0Var2.f28640b, rs0Var2.f28641c, new org.telegram.ui.Components.xv(rs0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ss0Var.f36378w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.rs0 rs0Var3 = rs0Var;
                            org.telegram.ui.Components.xv0 xv0Var = rs0Var3.d;
                            org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31069v1;
                            storiesController = xv0Var.getStoriesController();
                            if (storiesController.i(xv0Var.f31044j1)) {
                                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(m2Var, view);
                                H.W(new org.telegram.ui.Components.qs0(rs0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.P0(xv0Var2.f31069v1, xv0Var2.f31044j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.f31069v1, xv0Var3.f31044j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.f31069v1, xv0Var4.f31044j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                xv0Var.x(H, m2Var, xv0Var.f31044j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xv0 xv0Var2 = rs0Var3.d;
                                                xv0Var2.P0(xv0Var2.f31069v1, xv0Var2.f31044j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.f31069v1, xv0Var3.f31044j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.f31069v1, xv0Var4.f31044j1, intValue);
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
                                                xv0Var2.P0(xv0Var2.f31069v1, xv0Var2.f31044j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.f31069v1, xv0Var3.f31044j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.f31069v1, xv0Var4.f31044j1, intValue);
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
                                                xv0Var2.P0(xv0Var2.f31069v1, xv0Var2.f31044j1, intValue);
                                                return;
                                            case 1:
                                                xv0 xv0Var3 = rs0Var3.d;
                                                xv0Var3.R0(xv0Var3.f31069v1, xv0Var3.f31044j1, intValue);
                                                return;
                                            case 2:
                                                rs0Var3.d.e1(intValue);
                                                return;
                                            default:
                                                xv0 xv0Var4 = rs0Var3.d;
                                                xv0Var4.Q0(xv0Var4.f31069v1, xv0Var4.f31044j1, intValue);
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
        b(!i8Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f36379x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36379x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f36380y = f7;
            a();
            return;
        }
        float f10 = this.f36380y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f36379x = ofFloat;
        ofFloat.setDuration(480L);
        this.f36379x.setInterpolator(org.telegram.ui.Components.es.h);
        this.f36379x.addUpdateListener(new f21(this, 0));
        this.f36379x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            bi.i8 i8Var = this.f36376r;
            if (longValue == i8Var.f3181b) {
                org.telegram.ui.Components.k91 k91Var = this.f36375n;
                if (k91Var != null) {
                    i12 = k91Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = i8Var.a();
                g21 g21Var = this.f36377s;
                g21Var.f36040a = a2;
                this.h.o(true);
                b(!i8Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (g21Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new d21(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (k91Var != null && i12 > 0 && i8Var.b(i12) == null) {
                    k91Var.d(0, 0);
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
        return this.f36377s.f(this.f36375n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f36380y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f36380y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f36376r.f3180a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f36376r.f3180a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f36377s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new d21(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f36378w != z10) {
            this.f36378w = z10;
            org.telegram.ui.Components.k91 k91Var = this.f36375n;
            k91Var.setReordering(z10);
            boolean z11 = this.f36378w;
            org.telegram.ui.Components.ss0 ss0Var = (org.telegram.ui.Components.ss0) this;
            org.telegram.ui.Components.xv0 xv0Var = ss0Var.H;
            TextView textView = xv0Var.f31056q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.zr0(2, ss0Var, z11)).start();
            xv0Var.r1(true);
            if (z10) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new bc0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                bi.i8 i8Var = this.f36376r;
                i8Var.e();
                i8Var.f(false);
                int currentPosition = k91Var.getCurrentPosition();
                g21 g21Var = this.f36377s;
                int f12 = g21Var.f(currentPosition);
                this.h.o(true);
                int i10 = g21Var.i(f12);
                k91Var.e(0.0f, i10, i10);
            }
        }
    }
}
