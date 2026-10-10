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
public abstract class a21 extends org.telegram.ui.Components.ja implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final nz0 G;
    public final bi.a h;
    public final org.telegram.ui.Components.o91 f35855n;
    public final ai.y8 f35856r;
    public final z11 f35857s;
    public int v;
    public boolean f35858w;
    public ValueAnimator f35859x;
    public float f35860y;

    public a21(Context context, org.telegram.ui.Components.tw0 tw0Var, ai.y8 y8Var, final org.telegram.ui.Components.ws0 ws0Var) {
        super(context, tw0Var);
        this.F = new Rect();
        this.f35856r = y8Var;
        Objects.requireNonNull(y8Var);
        this.G = new nz0(y8Var, 7);
        final org.telegram.ui.Components.xs0 xs0Var = (org.telegram.ui.Components.xs0) this;
        bi.a aVar = new bi.a(xs0Var, context, ws0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        z11 z11Var = new z11(xs0Var);
        this.f35857s = z11Var;
        z11Var.f44506a = y8Var.a();
        aVar.setAdapter(z11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.o91 n10 = aVar.n(10, true);
        this.f35855n = n10;
        n10.g(org.telegram.ui.ActionBar.i6.Gh, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.Eh, org.telegram.ui.ActionBar.i6.Hh, org.telegram.ui.ActionBar.i6.f21079s8);
        n10.f29422r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ai.m9 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (xs0Var.f35858w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ws0 ws0Var2 = ws0Var;
                            org.telegram.ui.Components.g5.R(ws0Var2.f32758a, ws0Var2.f32759b, ws0Var2.f32760c, new org.telegram.ui.Components.cw(ws0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !xs0Var.f35858w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ws0 ws0Var3 = ws0Var;
                            org.telegram.ui.Components.cw0 cw0Var = ws0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = cw0Var.f25474v1;
                            storiesController = cw0Var.getStoriesController();
                            if (storiesController.i(cw0Var.f25449j1)) {
                                org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.vs0(ws0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25474v1, cw0Var2.f25449j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25474v1, cw0Var3.f25449j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25474v1, cw0Var4.f25449j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                cw0Var.x(H, n2Var, cw0Var.f25449j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25474v1, cw0Var2.f25449j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25474v1, cw0Var3.f25449j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25474v1, cw0Var4.f25449j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25474v1, cw0Var2.f25449j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25474v1, cw0Var3.f25449j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25474v1, cw0Var4.f25449j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25474v1, cw0Var2.f25449j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25474v1, cw0Var3.f25449j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25474v1, cw0Var4.f25449j1, intValue);
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
                ai.m9 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (xs0Var.f35858w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ws0 ws0Var2 = ws0Var;
                            org.telegram.ui.Components.g5.R(ws0Var2.f32758a, ws0Var2.f32759b, ws0Var2.f32760c, new org.telegram.ui.Components.cw(ws0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !xs0Var.f35858w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ws0 ws0Var3 = ws0Var;
                            org.telegram.ui.Components.cw0 cw0Var = ws0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = cw0Var.f25474v1;
                            storiesController = cw0Var.getStoriesController();
                            if (storiesController.i(cw0Var.f25449j1)) {
                                org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.vs0(ws0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25474v1, cw0Var2.f25449j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25474v1, cw0Var3.f25449j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25474v1, cw0Var4.f25449j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                cw0Var.x(H, n2Var, cw0Var.f25449j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25474v1, cw0Var2.f25449j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25474v1, cw0Var3.f25449j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25474v1, cw0Var4.f25449j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25474v1, cw0Var2.f25449j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25474v1, cw0Var3.f25449j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25474v1, cw0Var4.f25449j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25474v1, cw0Var2.f25449j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25474v1, cw0Var3.f25449j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25474v1, cw0Var4.f25449j1, intValue);
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
        b(!y8Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f35859x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35859x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f35860y = f7;
            a();
            return;
        }
        float f10 = this.f35860y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35859x = ofFloat;
        ofFloat.setDuration(480L);
        this.f35859x.setInterpolator(org.telegram.ui.Components.is.h);
        this.f35859x.addUpdateListener(new y11(this, 0));
        this.f35859x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            ai.y8 y8Var = this.f35856r;
            if (longValue == y8Var.f1954b) {
                org.telegram.ui.Components.o91 o91Var = this.f35855n;
                if (o91Var != null) {
                    i12 = o91Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = y8Var.a();
                z11 z11Var = this.f35857s;
                z11Var.f44506a = a2;
                this.h.o(true);
                b(!y8Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (z11Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new w11(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (o91Var != null && i12 > 0 && y8Var.b(i12) == null) {
                    o91Var.d(0, 0);
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
        return this.f35857s.f(this.f35855n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f35860y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f35860y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f35856r.f1953a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f35856r.f1953a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f35857s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new w11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f35858w != z10) {
            this.f35858w = z10;
            org.telegram.ui.Components.o91 o91Var = this.f35855n;
            o91Var.setReordering(z10);
            boolean z11 = this.f35858w;
            org.telegram.ui.Components.xs0 xs0Var = (org.telegram.ui.Components.xs0) this;
            org.telegram.ui.Components.cw0 cw0Var = xs0Var.H;
            TextView textView = cw0Var.f25461q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.es0(2, xs0Var, z11)).start();
            cw0Var.q1(true);
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new xb0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                ai.y8 y8Var = this.f35856r;
                y8Var.e();
                y8Var.f(false);
                int currentPosition = o91Var.getCurrentPosition();
                z11 z11Var = this.f35857s;
                int f12 = z11Var.f(currentPosition);
                this.h.o(true);
                int i10 = z11Var.i(f12);
                o91Var.e(0.0f, i10, i10);
            }
        }
    }
}
