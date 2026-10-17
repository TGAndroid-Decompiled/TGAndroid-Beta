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
public abstract class g11 extends org.telegram.ui.Components.ga implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final sy0 G;
    public final di.a h;
    public final org.telegram.ui.Components.b91 f37108n;
    public final ci.w6 f37109r;
    public final f11 f37110s;
    public int v;
    public boolean f37111w;
    public ValueAnimator f37112x;
    public float f37113y;

    public g11(Context context, org.telegram.ui.Components.jw0 jw0Var, ci.w6 w6Var, final org.telegram.ui.Components.ms0 ms0Var) {
        super(context, jw0Var);
        this.F = new Rect();
        this.f37109r = w6Var;
        Objects.requireNonNull(w6Var);
        this.G = new sy0(w6Var, 7);
        final org.telegram.ui.Components.ns0 ns0Var = (org.telegram.ui.Components.ns0) this;
        di.a aVar = new di.a(ns0Var, context, ms0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        f11 f11Var = new f11(ns0Var);
        this.f37110s = f11Var;
        f11Var.f36763a = w6Var.a();
        aVar.setAdapter(f11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.b91 n10 = aVar.n(10, true);
        this.f37108n = n10;
        n10.g(org.telegram.ui.ActionBar.h6.Gh, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.Eh, org.telegram.ui.ActionBar.h6.Hh, org.telegram.ui.ActionBar.h6.f21265s8);
        n10.f24866r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ci.i7 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (ns0Var.f37111w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ms0 ms0Var2 = ms0Var;
                            org.telegram.ui.Components.f5.R(ms0Var2.f28583a, ms0Var2.f28584b, ms0Var2.f28585c, new org.telegram.ui.Components.tv(ms0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ns0Var.f37111w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ms0 ms0Var3 = ms0Var;
                            org.telegram.ui.Components.sv0 sv0Var = ms0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
                            storiesController = sv0Var.getStoriesController();
                            if (storiesController.i(sv0Var.f30363j1)) {
                                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.ls0(ms0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.f30388v1, sv0Var2.f30363j1, intValue);
                                                return;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.f30388v1, sv0Var3.f30363j1, intValue);
                                                return;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.f30388v1, sv0Var4.f30363j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                sv0Var.x(H, n2Var, sv0Var.f30363j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.f30388v1, sv0Var2.f30363j1, intValue);
                                                return;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.f30388v1, sv0Var3.f30363j1, intValue);
                                                return;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.f30388v1, sv0Var4.f30363j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.f30388v1, sv0Var2.f30363j1, intValue);
                                                return;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.f30388v1, sv0Var3.f30363j1, intValue);
                                                return;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.f30388v1, sv0Var4.f30363j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.f30388v1, sv0Var2.f30363j1, intValue);
                                                return;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.f30388v1, sv0Var3.f30363j1, intValue);
                                                return;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.f30388v1, sv0Var4.f30363j1, intValue);
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
                        if (ns0Var.f37111w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ms0 ms0Var2 = ms0Var;
                            org.telegram.ui.Components.f5.R(ms0Var2.f28583a, ms0Var2.f28584b, ms0Var2.f28585c, new org.telegram.ui.Components.tv(ms0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ns0Var.f37111w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ms0 ms0Var3 = ms0Var;
                            org.telegram.ui.Components.sv0 sv0Var = ms0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
                            storiesController = sv0Var.getStoriesController();
                            if (storiesController.i(sv0Var.f30363j1)) {
                                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.ls0(ms0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.f30388v1, sv0Var2.f30363j1, intValue);
                                                return;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.f30388v1, sv0Var3.f30363j1, intValue);
                                                return;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.f30388v1, sv0Var4.f30363j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                sv0Var.x(H, n2Var, sv0Var.f30363j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.f30388v1, sv0Var2.f30363j1, intValue);
                                                return;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.f30388v1, sv0Var3.f30363j1, intValue);
                                                return;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.f30388v1, sv0Var4.f30363j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.f30388v1, sv0Var2.f30363j1, intValue);
                                                return;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.f30388v1, sv0Var3.f30363j1, intValue);
                                                return;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.f30388v1, sv0Var4.f30363j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                sv0 sv0Var2 = ms0Var3.d;
                                                sv0Var2.Q0(sv0Var2.f30388v1, sv0Var2.f30363j1, intValue);
                                                return;
                                            case 1:
                                                sv0 sv0Var3 = ms0Var3.d;
                                                sv0Var3.S0(sv0Var3.f30388v1, sv0Var3.f30363j1, intValue);
                                                return;
                                            case 2:
                                                ms0Var3.d.f1(intValue);
                                                return;
                                            default:
                                                sv0 sv0Var4 = ms0Var3.d;
                                                sv0Var4.R0(sv0Var4.f30388v1, sv0Var4.f30363j1, intValue);
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
        org.telegram.ui.Components.b91 b91Var = this.f37108n;
        if (b91Var != null) {
            i10 = b91Var.getCurrentTabId();
        } else {
            i10 = 0;
        }
        ci.w6 w6Var = this.f37109r;
        boolean a2 = w6Var.a();
        f11 f11Var = this.f37110s;
        f11Var.f36763a = a2;
        this.h.o(true);
        c(!w6Var.h.isEmpty(), true, false);
        int i11 = this.v;
        if (i11 > 0) {
            if (f11Var.i(i11) != -1) {
                AndroidUtilities.runOnUIThread(new c11(this, this.v, 1), 500L);
                this.v = 0;
            }
        } else if (b91Var != null && i10 > 0 && w6Var.b(i10) == null) {
            b91Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f37112x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37112x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f37113y = f7;
            b();
            return;
        }
        float f10 = this.f37113y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f37112x = ofFloat;
        ofFloat.setDuration(480L);
        this.f37112x.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f37112x.addUpdateListener(new e11(this, 0));
        this.f37112x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate && ((Long) objArr[0]).longValue() == this.f37109r.f6121b) {
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
        return this.f37110s.f(this.f37108n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f37113y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f37113y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ci.w6 w6Var = this.f37109r;
        NotificationCenter.getInstance(w6Var.f6120a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
        if (this.E != w6Var.h.isEmpty() && this.f37110s.f36763a == w6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f37109r.f6120a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f37110s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new c11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f37111w != z10) {
            this.f37111w = z10;
            org.telegram.ui.Components.b91 b91Var = this.f37108n;
            b91Var.setReordering(z10);
            boolean z11 = this.f37111w;
            org.telegram.ui.Components.ns0 ns0Var = (org.telegram.ui.Components.ns0) this;
            org.telegram.ui.Components.sv0 sv0Var = ns0Var.H;
            TextView textView = sv0Var.f30375q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.b60(5, ns0Var, z11)).start();
            sv0Var.s1(true);
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new eb0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                ci.w6 w6Var = this.f37109r;
                w6Var.e();
                w6Var.f(false);
                int currentPosition = b91Var.getCurrentPosition();
                f11 f11Var = this.f37110s;
                int f12 = f11Var.f(currentPosition);
                this.h.o(true);
                int i10 = f11Var.i(f12);
                b91Var.e(0.0f, i10, i10);
            }
        }
    }
}
