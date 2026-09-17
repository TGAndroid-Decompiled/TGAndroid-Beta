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
public abstract class c21 extends org.telegram.ui.Components.ea implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final g01 G;
    public final bi.a h;
    public final org.telegram.ui.Components.i81 f32645n;
    public final ai.x8 f32646r;
    public final b21 f32647s;
    public int v;
    public boolean f32648w;
    public ValueAnimator f32649x;
    public float f32650y;

    public c21(Context context, org.telegram.ui.Components.qv0 qv0Var, ai.x8 x8Var, final org.telegram.ui.Components.sr0 sr0Var) {
        super(context, qv0Var);
        this.F = new Rect();
        this.f32646r = x8Var;
        Objects.requireNonNull(x8Var);
        this.G = new g01(x8Var, 6);
        final org.telegram.ui.Components.ur0 ur0Var = (org.telegram.ui.Components.ur0) this;
        bi.a aVar = new bi.a(ur0Var, context, sr0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        b21 b21Var = new b21(ur0Var);
        this.f32647s = b21Var;
        b21Var.f32036a = x8Var.a();
        aVar.setAdapter(b21Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.i81 n10 = aVar.n(10, true);
        this.f32645n = n10;
        int i10 = org.telegram.ui.ActionBar.j6.Gh;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        int i12 = org.telegram.ui.ActionBar.j6.Eh;
        int i13 = org.telegram.ui.ActionBar.j6.Hh;
        int i14 = org.telegram.ui.ActionBar.j6.f19139s8;
        n10.P = i10;
        n10.Q = i11;
        n10.R = i12;
        n10.S = i13;
        n10.T = i14;
        n10.O.setColor(org.telegram.ui.ActionBar.j6.v0(i10, n10.f24883j0));
        n10.f24891r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ai.l9 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (ur0Var.f32648w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.sr0 sr0Var2 = sr0Var;
                            org.telegram.ui.Components.c5.S(sr0Var2.f27910a, sr0Var2.f27911b, sr0Var2.f27912c, new org.telegram.ui.Components.lv(sr0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ur0Var.f32648w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.sr0 sr0Var3 = sr0Var;
                            org.telegram.ui.Components.zu0 zu0Var = sr0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30656v1;
                            storiesController = zu0Var.getStoriesController();
                            if (storiesController.i(zu0Var.f30631j1)) {
                                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(o2Var, view);
                                H.W(new org.telegram.ui.Components.rr0(sr0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f30656v1, zu0Var2.f30631j1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f30656v1, zu0Var3.f30631j1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f30656v1, zu0Var4.f30631j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                zu0Var.x(H, o2Var, zu0Var.f30631j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f30656v1, zu0Var2.f30631j1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f30656v1, zu0Var3.f30631j1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f30656v1, zu0Var4.f30631j1, intValue);
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
                                                zu0Var2.O0(zu0Var2.f30656v1, zu0Var2.f30631j1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f30656v1, zu0Var3.f30631j1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f30656v1, zu0Var4.f30631j1, intValue);
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
                                                zu0Var2.O0(zu0Var2.f30656v1, zu0Var2.f30631j1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f30656v1, zu0Var3.f30631j1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f30656v1, zu0Var4.f30631j1, intValue);
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
                        if (ur0Var.f32648w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.sr0 sr0Var2 = sr0Var;
                            org.telegram.ui.Components.c5.S(sr0Var2.f27910a, sr0Var2.f27911b, sr0Var2.f27912c, new org.telegram.ui.Components.lv(sr0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ur0Var.f32648w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.sr0 sr0Var3 = sr0Var;
                            org.telegram.ui.Components.zu0 zu0Var = sr0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30656v1;
                            storiesController = zu0Var.getStoriesController();
                            if (storiesController.i(zu0Var.f30631j1)) {
                                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(o2Var, view);
                                H.W(new org.telegram.ui.Components.rr0(sr0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f30656v1, zu0Var2.f30631j1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f30656v1, zu0Var3.f30631j1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f30656v1, zu0Var4.f30631j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                zu0Var.x(H, o2Var, zu0Var.f30631j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zu0 zu0Var2 = sr0Var3.d;
                                                zu0Var2.O0(zu0Var2.f30656v1, zu0Var2.f30631j1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f30656v1, zu0Var3.f30631j1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f30656v1, zu0Var4.f30631j1, intValue);
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
                                                zu0Var2.O0(zu0Var2.f30656v1, zu0Var2.f30631j1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f30656v1, zu0Var3.f30631j1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f30656v1, zu0Var4.f30631j1, intValue);
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
                                                zu0Var2.O0(zu0Var2.f30656v1, zu0Var2.f30631j1, intValue);
                                                return;
                                            case 1:
                                                zu0 zu0Var3 = sr0Var3.d;
                                                zu0Var3.Q0(zu0Var3.f30656v1, zu0Var3.f30631j1, intValue);
                                                return;
                                            case 2:
                                                sr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                zu0 zu0Var4 = sr0Var3.d;
                                                zu0Var4.P0(zu0Var4.f30656v1, zu0Var4.f30631j1, intValue);
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
        b(!x8Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f32649x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f32649x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f32650y = f7;
            a();
            return;
        }
        float f10 = this.f32650y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f32649x = ofFloat;
        ofFloat.setDuration(480L);
        this.f32649x.setInterpolator(org.telegram.ui.Components.qr.h);
        this.f32649x.addUpdateListener(new b3(this, 29));
        this.f32649x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            ai.x8 x8Var = this.f32646r;
            if (longValue == x8Var.f1704b) {
                org.telegram.ui.Components.i81 i81Var = this.f32645n;
                if (i81Var != null) {
                    i12 = i81Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = x8Var.a();
                b21 b21Var = this.f32647s;
                b21Var.f32036a = a2;
                this.h.o(true);
                b(!x8Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (b21Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new z11(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (i81Var != null && i12 > 0 && x8Var.b(i12) == null) {
                    i81Var.d(0, 0);
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
        return this.f32647s.f(this.f32645n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f32650y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f32650y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f32646r.f1703a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f32646r.f1703a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f32647s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new z11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f32648w != z10) {
            this.f32648w = z10;
            org.telegram.ui.Components.i81 i81Var = this.f32645n;
            i81Var.setReordering(z10);
            boolean z11 = this.f32648w;
            org.telegram.ui.Components.ur0 ur0Var = (org.telegram.ui.Components.ur0) this;
            org.telegram.ui.Components.zu0 zu0Var = ur0Var.H;
            TextView textView = zu0Var.f30643q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.tr0(0, ur0Var, z11)).start();
            zu0Var.q1(true);
            if (z10) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new ac0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                ai.x8 x8Var = this.f32646r;
                x8Var.e();
                x8Var.f(false);
                int currentPosition = i81Var.getCurrentPosition();
                b21 b21Var = this.f32647s;
                int f12 = b21Var.f(currentPosition);
                this.h.o(true);
                int i10 = b21Var.i(f12);
                i81Var.e(0.0f, i10, i10);
            }
        }
    }
}
