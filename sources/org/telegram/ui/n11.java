package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public abstract class n11 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final ei.a f41608a;
    public final org.telegram.ui.Components.u91 f41609b;
    public final di.v6 f41610c;
    public final m11 d;
    public int e;
    public boolean f41611f;
    public ValueAnimator h;
    public float f41612n;
    public boolean f41613r;
    public final Rect f41614s;
    public final oy0 v;

    public n11(Context context, di.v6 v6Var, final org.telegram.ui.Components.zs0 zs0Var) {
        super(context);
        this.f41614s = new Rect();
        this.f41610c = v6Var;
        Objects.requireNonNull(v6Var);
        this.v = new oy0(v6Var, 9);
        final org.telegram.ui.Components.at0 at0Var = (org.telegram.ui.Components.at0) this;
        ei.a aVar = new ei.a(at0Var, context, zs0Var);
        this.f41608a = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        m11 m11Var = new m11(at0Var);
        this.d = m11Var;
        m11Var.f41301a = v6Var.a();
        aVar.setAdapter(m11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.u91 n10 = aVar.n(10, true);
        this.f41609b = n10;
        n10.g(org.telegram.ui.ActionBar.y6.Gh, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.Eh, org.telegram.ui.ActionBar.y6.Hh, org.telegram.ui.ActionBar.y6.f23637s8);
        n10.f33317r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                di.h7 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (at0Var.f41611f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.zs0 zs0Var2 = zs0Var;
                            org.telegram.ui.Components.g5.R(zs0Var2.f35442a, zs0Var2.f35443b, zs0Var2.f35444c, new org.telegram.ui.Components.tv(zs0Var2, 22));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !at0Var.f41611f) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.zs0 zs0Var3 = zs0Var;
                            org.telegram.ui.Components.bw0 bw0Var = zs0Var3.d;
                            org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
                            storiesController = bw0Var.getStoriesController();
                            if (storiesController.i(bw0Var.l1)) {
                                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(r2Var, view);
                                H.W(new org.telegram.ui.Components.ys0(zs0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.f26992x1, bw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.f26992x1, bw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.f26992x1, bw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                bw0Var.A(new jg.s0(H, 22), r2Var, bw0Var.l1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.f26992x1, bw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.f26992x1, bw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.f26992x1, bw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.f26992x1, bw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.f26992x1, bw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.f26992x1, bw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.f26992x1, bw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.f26992x1, bw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.f26992x1, bw0Var4.l1, intValue);
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
                di.h7 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (at0Var.f41611f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.zs0 zs0Var2 = zs0Var;
                            org.telegram.ui.Components.g5.R(zs0Var2.f35442a, zs0Var2.f35443b, zs0Var2.f35444c, new org.telegram.ui.Components.tv(zs0Var2, 22));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !at0Var.f41611f) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.zs0 zs0Var3 = zs0Var;
                            org.telegram.ui.Components.bw0 bw0Var = zs0Var3.d;
                            org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
                            storiesController = bw0Var.getStoriesController();
                            if (storiesController.i(bw0Var.l1)) {
                                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(r2Var, view);
                                H.W(new org.telegram.ui.Components.ys0(zs0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.f26992x1, bw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.f26992x1, bw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.f26992x1, bw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                bw0Var.A(new jg.s0(H, 22), r2Var, bw0Var.l1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.f26992x1, bw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.f26992x1, bw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.f26992x1, bw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.f26992x1, bw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.f26992x1, bw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.f26992x1, bw0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                bw0 bw0Var2 = zs0Var3.d;
                                                bw0Var2.U0(bw0Var2.f26992x1, bw0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                bw0 bw0Var3 = zs0Var3.d;
                                                bw0Var3.W0(bw0Var3.f26992x1, bw0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zs0Var3.d.m1(intValue);
                                                return;
                                            default:
                                                bw0 bw0Var4 = zs0Var3.d;
                                                bw0Var4.V0(bw0Var4.f26992x1, bw0Var4.l1, intValue);
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
        addView(n10, org.telegram.ui.Components.kb1.i(-1, 42, 48));
        c(!v6Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i10;
        org.telegram.ui.Components.u91 u91Var = this.f41609b;
        if (u91Var != null) {
            i10 = u91Var.getCurrentTabId();
        } else {
            i10 = 0;
        }
        di.v6 v6Var = this.f41610c;
        boolean a2 = v6Var.a();
        m11 m11Var = this.d;
        m11Var.f41301a = a2;
        this.f41608a.o(true);
        c(!v6Var.h.isEmpty(), true, false);
        int i11 = this.e;
        if (i11 > 0) {
            if (m11Var.i(i11) != -1) {
                AndroidUtilities.runOnUIThread(new l11(this, this.e, 1), 500L);
                this.e = 0;
            }
        } else if (u91Var != null && i10 > 0 && v6Var.b(i10) == null) {
            u91Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.f41613r == z10 && !z12) {
            return;
        }
        this.f41613r = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f41612n = f7;
            b();
            return;
        }
        float f10 = this.f41612n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.h = ofFloat;
        ofFloat.setDuration(480L);
        this.h.setInterpolator(org.telegram.ui.Components.ds.h);
        this.h.addUpdateListener(new b3(this, 29));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate && ((Long) objArr[0]).longValue() == this.f41610c.f9260b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f41613r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f41609b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f41612n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f41612n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        di.v6 v6Var = this.f41610c;
        NotificationCenter.getInstance(v6Var.f9259a).addWeakObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
        if (this.f41613r != v6Var.h.isEmpty() && this.d.f41301a == v6Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f41610c.f9259a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.f41614s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.d.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new l11(this, i10, 0), 500L);
        } else {
            this.e = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f41611f != z10) {
            this.f41611f = z10;
            org.telegram.ui.Components.u91 u91Var = this.f41609b;
            u91Var.setReordering(z10);
            boolean z11 = this.f41611f;
            org.telegram.ui.Components.at0 at0Var = (org.telegram.ui.Components.at0) this;
            org.telegram.ui.Components.bw0 bw0Var = at0Var.f26662w;
            TextView textView = bw0Var.f26979s0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.d60(5, at0Var, z11)).start();
            bw0Var.C1(true);
            if (z10) {
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.O4(false);
                    AndroidUtilities.runOnUIThread(new hb0(profileActivity, 28));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.v);
                di.v6 v6Var = this.f41610c;
                v6Var.e();
                v6Var.f(false);
                int currentPosition = u91Var.getCurrentPosition();
                m11 m11Var = this.d;
                int f12 = m11Var.f(currentPosition);
                this.f41608a.o(true);
                int i10 = m11Var.i(f12);
                u91Var.e(0.0f, i10, i10);
            }
        }
    }
}
