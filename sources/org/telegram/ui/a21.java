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
public abstract class a21 extends org.telegram.ui.Components.fa implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final e01 G;
    public final bi.a h;
    public final org.telegram.ui.Components.y81 f31984n;
    public final ai.x8 f31985r;
    public final z11 f31986s;
    public int v;
    public boolean f31987w;
    public ValueAnimator f31988x;
    public float f31989y;

    public a21(Context context, org.telegram.ui.Components.cw0 cw0Var, ai.x8 x8Var, final org.telegram.ui.Components.fs0 fs0Var) {
        super(context, cw0Var);
        this.F = new Rect();
        this.f31985r = x8Var;
        Objects.requireNonNull(x8Var);
        this.G = new e01(x8Var, 6);
        final org.telegram.ui.Components.gs0 gs0Var = (org.telegram.ui.Components.gs0) this;
        bi.a aVar = new bi.a(gs0Var, context, fs0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        z11 z11Var = new z11(gs0Var);
        this.f31986s = z11Var;
        z11Var.f40087a = x8Var.a();
        aVar.setAdapter(z11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.y81 n10 = aVar.n(10, true);
        this.f31984n = n10;
        int i10 = org.telegram.ui.ActionBar.j6.Gh;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        int i12 = org.telegram.ui.ActionBar.j6.Eh;
        int i13 = org.telegram.ui.ActionBar.j6.Hh;
        int i14 = org.telegram.ui.ActionBar.j6.f19387s8;
        n10.P = i10;
        n10.Q = i11;
        n10.R = i12;
        n10.S = i13;
        n10.T = i14;
        n10.O.setColor(org.telegram.ui.ActionBar.j6.v0(i10, n10.f30596j0));
        n10.f30604r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ai.l9 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (gs0Var.f31987w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.fs0 fs0Var2 = fs0Var;
                            org.telegram.ui.Components.d5.S(fs0Var2.f24354a, fs0Var2.f24355b, fs0Var2.f24356c, new org.telegram.ui.Components.mv(fs0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !gs0Var.f31987w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.fs0 fs0Var3 = fs0Var;
                            org.telegram.ui.Components.lv0 lv0Var = fs0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = lv0Var.f26234v1;
                            storiesController = lv0Var.getStoriesController();
                            if (storiesController.i(lv0Var.f26209j1)) {
                                org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.es0(fs0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.f26234v1, lv0Var2.f26209j1, intValue);
                                                return;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.f26234v1, lv0Var3.f26209j1, intValue);
                                                return;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.f26234v1, lv0Var4.f26209j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                lv0Var.x(H, n2Var, lv0Var.f26209j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.f26234v1, lv0Var2.f26209j1, intValue);
                                                return;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.f26234v1, lv0Var3.f26209j1, intValue);
                                                return;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.f26234v1, lv0Var4.f26209j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.f26234v1, lv0Var2.f26209j1, intValue);
                                                return;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.f26234v1, lv0Var3.f26209j1, intValue);
                                                return;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.f26234v1, lv0Var4.f26209j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.f26234v1, lv0Var2.f26209j1, intValue);
                                                return;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.f26234v1, lv0Var3.f26209j1, intValue);
                                                return;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.f26234v1, lv0Var4.f26209j1, intValue);
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
                ai.l9 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (gs0Var.f31987w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.fs0 fs0Var2 = fs0Var;
                            org.telegram.ui.Components.d5.S(fs0Var2.f24354a, fs0Var2.f24355b, fs0Var2.f24356c, new org.telegram.ui.Components.mv(fs0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !gs0Var.f31987w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.fs0 fs0Var3 = fs0Var;
                            org.telegram.ui.Components.lv0 lv0Var = fs0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = lv0Var.f26234v1;
                            storiesController = lv0Var.getStoriesController();
                            if (storiesController.i(lv0Var.f26209j1)) {
                                org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.es0(fs0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.f26234v1, lv0Var2.f26209j1, intValue);
                                                return;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.f26234v1, lv0Var3.f26209j1, intValue);
                                                return;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.f26234v1, lv0Var4.f26209j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                lv0Var.x(H, n2Var, lv0Var.f26209j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.f26234v1, lv0Var2.f26209j1, intValue);
                                                return;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.f26234v1, lv0Var3.f26209j1, intValue);
                                                return;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.f26234v1, lv0Var4.f26209j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.f26234v1, lv0Var2.f26209j1, intValue);
                                                return;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.f26234v1, lv0Var3.f26209j1, intValue);
                                                return;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.f26234v1, lv0Var4.f26209j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                lv0 lv0Var2 = fs0Var3.d;
                                                lv0Var2.O0(lv0Var2.f26234v1, lv0Var2.f26209j1, intValue);
                                                return;
                                            case 1:
                                                lv0 lv0Var3 = fs0Var3.d;
                                                lv0Var3.Q0(lv0Var3.f26234v1, lv0Var3.f26209j1, intValue);
                                                return;
                                            case 2:
                                                fs0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                lv0 lv0Var4 = fs0Var3.d;
                                                lv0Var4.P0(lv0Var4.f26234v1, lv0Var4.f26209j1, intValue);
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
        addView(n10, w7.y5.e(-1, 42, 48));
        b(!x8Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f31988x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31988x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f31989y = f7;
            a();
            return;
        }
        float f10 = this.f31989y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f31988x = ofFloat;
        ofFloat.setDuration(480L);
        this.f31988x.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f31988x.addUpdateListener(new b3(this, 29));
        this.f31988x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            ai.x8 x8Var = this.f31985r;
            if (longValue == x8Var.f1701b) {
                org.telegram.ui.Components.y81 y81Var = this.f31984n;
                if (y81Var != null) {
                    i12 = y81Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = x8Var.a();
                z11 z11Var = this.f31986s;
                z11Var.f40087a = a2;
                this.h.o(true);
                b(!x8Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (z11Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new x11(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (y81Var != null && i12 > 0 && x8Var.b(i12) == null) {
                    y81Var.d(0, 0);
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
        return this.f31986s.f(this.f31984n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f31989y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f31989y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f31985r.f1700a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f31985r.f1700a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f31986s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new x11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f31987w != z10) {
            this.f31987w = z10;
            org.telegram.ui.Components.y81 y81Var = this.f31984n;
            y81Var.setReordering(z10);
            boolean z11 = this.f31987w;
            org.telegram.ui.Components.gs0 gs0Var = (org.telegram.ui.Components.gs0) this;
            org.telegram.ui.Components.lv0 lv0Var = gs0Var.H;
            TextView textView = lv0Var.f26221q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.as0(1, gs0Var, z11)).start();
            lv0Var.q1(true);
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new ac0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                ai.x8 x8Var = this.f31985r;
                x8Var.e();
                x8Var.f(false);
                int currentPosition = y81Var.getCurrentPosition();
                z11 z11Var = this.f31986s;
                int f12 = z11Var.f(currentPosition);
                this.h.o(true);
                int i10 = z11Var.i(f12);
                y81Var.e(0.0f, i10, i10);
            }
        }
    }
}
