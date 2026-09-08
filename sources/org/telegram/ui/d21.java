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
public abstract class d21 extends org.telegram.ui.Components.ga implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final f01 G;
    public final ci.a h;
    public final org.telegram.ui.Components.h81 f35653n;
    public final bi.f8 f35654r;
    public final c21 f35655s;
    public int v;
    public boolean f35656w;
    public ValueAnimator f35657x;
    public float f35658y;

    public d21(Context context, org.telegram.ui.Components.ov0 ov0Var, bi.f8 f8Var, final org.telegram.ui.Components.rr0 rr0Var) {
        super(context, ov0Var);
        this.F = new Rect();
        this.f35654r = f8Var;
        Objects.requireNonNull(f8Var);
        this.G = new f01(f8Var, 6);
        final org.telegram.ui.Components.sr0 sr0Var = (org.telegram.ui.Components.sr0) this;
        ci.a aVar = new ci.a(sr0Var, context, rr0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        c21 c21Var = new c21(sr0Var);
        this.f35655s = c21Var;
        c21Var.f35009a = f8Var.a();
        aVar.setAdapter(c21Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.h81 n10 = aVar.n(10, true);
        this.f35653n = n10;
        int i10 = org.telegram.ui.ActionBar.j6.Gh;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        int i12 = org.telegram.ui.ActionBar.j6.Eh;
        int i13 = org.telegram.ui.ActionBar.j6.Hh;
        int i14 = org.telegram.ui.ActionBar.j6.f20964s8;
        n10.P = i10;
        n10.Q = i11;
        n10.R = i12;
        n10.S = i13;
        n10.T = i14;
        n10.O.setColor(org.telegram.ui.ActionBar.j6.v0(i10, n10.f26673j0));
        n10.f26681r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                bi.u8 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (sr0Var.f35656w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.rr0 rr0Var2 = rr0Var;
                            org.telegram.ui.Components.e5.S(rr0Var2.f30104a, rr0Var2.f30105b, rr0Var2.f30106c, new org.telegram.ui.Components.kv(rr0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !sr0Var.f35656w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.rr0 rr0Var3 = rr0Var;
                            org.telegram.ui.Components.xu0 xu0Var = rr0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32753v1;
                            storiesController = xu0Var.getStoriesController();
                            if (storiesController.i(xu0Var.f32728j1)) {
                                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.qr0(rr0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xu0 xu0Var2 = rr0Var3.d;
                                                xu0Var2.O0(xu0Var2.f32753v1, xu0Var2.f32728j1, intValue);
                                                return;
                                            case 1:
                                                xu0 xu0Var3 = rr0Var3.d;
                                                xu0Var3.Q0(xu0Var3.f32753v1, xu0Var3.f32728j1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                xu0 xu0Var4 = rr0Var3.d;
                                                xu0Var4.P0(xu0Var4.f32753v1, xu0Var4.f32728j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                xu0Var.x(H, n2Var, xu0Var.f32728j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xu0 xu0Var2 = rr0Var3.d;
                                                xu0Var2.O0(xu0Var2.f32753v1, xu0Var2.f32728j1, intValue);
                                                return;
                                            case 1:
                                                xu0 xu0Var3 = rr0Var3.d;
                                                xu0Var3.Q0(xu0Var3.f32753v1, xu0Var3.f32728j1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                xu0 xu0Var4 = rr0Var3.d;
                                                xu0Var4.P0(xu0Var4.f32753v1, xu0Var4.f32728j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xu0 xu0Var2 = rr0Var3.d;
                                                xu0Var2.O0(xu0Var2.f32753v1, xu0Var2.f32728j1, intValue);
                                                return;
                                            case 1:
                                                xu0 xu0Var3 = rr0Var3.d;
                                                xu0Var3.Q0(xu0Var3.f32753v1, xu0Var3.f32728j1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                xu0 xu0Var4 = rr0Var3.d;
                                                xu0Var4.P0(xu0Var4.f32753v1, xu0Var4.f32728j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xu0 xu0Var2 = rr0Var3.d;
                                                xu0Var2.O0(xu0Var2.f32753v1, xu0Var2.f32728j1, intValue);
                                                return;
                                            case 1:
                                                xu0 xu0Var3 = rr0Var3.d;
                                                xu0Var3.Q0(xu0Var3.f32753v1, xu0Var3.f32728j1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                xu0 xu0Var4 = rr0Var3.d;
                                                xu0Var4.P0(xu0Var4.f32753v1, xu0Var4.f32728j1, intValue);
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
                bi.u8 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (sr0Var.f35656w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.rr0 rr0Var2 = rr0Var;
                            org.telegram.ui.Components.e5.S(rr0Var2.f30104a, rr0Var2.f30105b, rr0Var2.f30106c, new org.telegram.ui.Components.kv(rr0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !sr0Var.f35656w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.rr0 rr0Var3 = rr0Var;
                            org.telegram.ui.Components.xu0 xu0Var = rr0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32753v1;
                            storiesController = xu0Var.getStoriesController();
                            if (storiesController.i(xu0Var.f32728j1)) {
                                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.qr0(rr0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xu0 xu0Var2 = rr0Var3.d;
                                                xu0Var2.O0(xu0Var2.f32753v1, xu0Var2.f32728j1, intValue);
                                                return;
                                            case 1:
                                                xu0 xu0Var3 = rr0Var3.d;
                                                xu0Var3.Q0(xu0Var3.f32753v1, xu0Var3.f32728j1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                xu0 xu0Var4 = rr0Var3.d;
                                                xu0Var4.P0(xu0Var4.f32753v1, xu0Var4.f32728j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                xu0Var.x(H, n2Var, xu0Var.f32728j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xu0 xu0Var2 = rr0Var3.d;
                                                xu0Var2.O0(xu0Var2.f32753v1, xu0Var2.f32728j1, intValue);
                                                return;
                                            case 1:
                                                xu0 xu0Var3 = rr0Var3.d;
                                                xu0Var3.Q0(xu0Var3.f32753v1, xu0Var3.f32728j1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                xu0 xu0Var4 = rr0Var3.d;
                                                xu0Var4.P0(xu0Var4.f32753v1, xu0Var4.f32728j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xu0 xu0Var2 = rr0Var3.d;
                                                xu0Var2.O0(xu0Var2.f32753v1, xu0Var2.f32728j1, intValue);
                                                return;
                                            case 1:
                                                xu0 xu0Var3 = rr0Var3.d;
                                                xu0Var3.Q0(xu0Var3.f32753v1, xu0Var3.f32728j1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                xu0 xu0Var4 = rr0Var3.d;
                                                xu0Var4.P0(xu0Var4.f32753v1, xu0Var4.f32728j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                xu0 xu0Var2 = rr0Var3.d;
                                                xu0Var2.O0(xu0Var2.f32753v1, xu0Var2.f32728j1, intValue);
                                                return;
                                            case 1:
                                                xu0 xu0Var3 = rr0Var3.d;
                                                xu0Var3.Q0(xu0Var3.f32753v1, xu0Var3.f32728j1, intValue);
                                                return;
                                            case 2:
                                                rr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                xu0 xu0Var4 = rr0Var3.d;
                                                xu0Var4.P0(xu0Var4.f32753v1, xu0Var4.f32728j1, intValue);
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
        addView(n10, w7.x5.e(-1, 42, 48));
        b(!f8Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f35657x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35657x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f35658y = f7;
            a();
            return;
        }
        float f10 = this.f35658y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35657x = ofFloat;
        ofFloat.setDuration(480L);
        this.f35657x.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f35657x.addUpdateListener(new b21(this, 0));
        this.f35657x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            bi.f8 f8Var = this.f35654r;
            if (longValue == f8Var.f3007b) {
                org.telegram.ui.Components.h81 h81Var = this.f35653n;
                if (h81Var != null) {
                    i12 = h81Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = f8Var.a();
                c21 c21Var = this.f35655s;
                c21Var.f35009a = a2;
                this.h.o(true);
                b(!f8Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (c21Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new z11(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (h81Var != null && i12 > 0 && f8Var.b(i12) == null) {
                    h81Var.d(0, 0);
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
        return this.f35655s.f(this.f35653n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f35658y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f35658y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f35654r.f3006a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f35654r.f3006a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f35655s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new z11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f35656w != z10) {
            this.f35656w = z10;
            org.telegram.ui.Components.h81 h81Var = this.f35653n;
            h81Var.setReordering(z10);
            boolean z11 = this.f35656w;
            org.telegram.ui.Components.sr0 sr0Var = (org.telegram.ui.Components.sr0) this;
            org.telegram.ui.Components.xu0 xu0Var = sr0Var.H;
            TextView textView = xu0Var.f32740q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.mr0(1, sr0Var, z11)).start();
            xu0Var.q1(true);
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new yb0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                bi.f8 f8Var = this.f35654r;
                f8Var.e();
                f8Var.f(false);
                int currentPosition = h81Var.getCurrentPosition();
                c21 c21Var = this.f35655s;
                int f12 = c21Var.f(currentPosition);
                this.h.o(true);
                int i10 = c21Var.i(f12);
                h81Var.e(0.0f, i10, i10);
            }
        }
    }
}
