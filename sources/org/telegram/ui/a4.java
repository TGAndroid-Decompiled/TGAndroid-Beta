package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class a4 implements org.telegram.ui.ActionBar.l2, org.telegram.ui.ActionBar.t3 {
    public ValueAnimator B;
    public boolean C;
    public boolean D;
    public boolean E;
    public float F;
    public boolean G;
    public final n4 H;
    public final AnimationNotificationsLocker f32440a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.p2 f32441b;
    public final z3 f32442c;
    public View d;
    public org.telegram.ui.ActionBar.j3 e;
    public boolean f32443f;
    public boolean h;
    public boolean f32444n;
    public boolean f32445r;
    public boolean f32446s;
    public nh.k3 v;
    public float f32447w;
    public float f32448x;
    public ValueAnimator f32449y;

    public a4(n4 n4Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.H = n4Var;
        this.f32441b = p2Var;
        p2Var.getResourceProvider();
        z3 z3Var = new z3(this, p2Var.getContext());
        this.f32442c = z3Var;
        new ph.i3(z3Var, true, new y3(this, 0));
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 a() {
        int w02;
        int w03;
        float progress;
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3();
        n4 n4Var = this.H;
        m3Var.E = n4Var.f36363e0.getTitle();
        m3Var.J = n4Var;
        r3 r3Var = n4Var.f36375r0[0];
        Bitmap bitmap = null;
        if (r3Var != null && SharedConfig.adaptableColorInBrowser) {
            w02 = r3Var.getActionBarColor();
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        m3Var.f20436q = w02;
        r3 r3Var2 = n4Var.f36375r0[0];
        if (r3Var2 != null && SharedConfig.adaptableColorInBrowser) {
            w03 = r3Var2.getBackgroundColor();
        } else {
            w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
        }
        m3Var.f20437r = w03;
        m3Var.f20433n = true;
        if (!this.C) {
            progress = 0.0f;
        } else {
            progress = n4Var.f36375r0[0].getProgress();
        }
        m3Var.I = progress;
        r3 r3Var3 = n4Var.f36375r0[0];
        m3Var.f20425c = r3Var3;
        if (r3Var3 != null && r3Var3.getWebView() != null) {
            bitmap = n4Var.f36375r0[0].getWebView().getFavicon();
        }
        m3Var.F = bitmap;
        r3 r3Var4 = m3Var.f20425c;
        if (r3Var4 != null) {
            m3Var.f20427g = r3Var4.getWidth();
            m3Var.h = m3Var.f20425c.getHeight();
        }
        m3Var.f20428i = l();
        m3Var.D = org.telegram.ui.ActionBar.j6.I.q();
        return m3Var;
    }

    @Override
    public final boolean attachedToParent() {
        return this.f32442c.isAttachedToWindow();
    }

    @Override
    public final boolean b() {
        return this.f32443f;
    }

    @Override
    public final boolean c(org.telegram.ui.ActionBar.j3 j3Var) {
        this.e = j3Var;
        if (j3Var != null) {
            this.f32443f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
        ofFloat.addUpdateListener(new x3(this, 0));
        return ofFloat;
    }

    @Override
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z4, yt0 yt0Var) {
        float f10;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f32448x;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new x3(this, 2));
        this.B.addListener(new androidx.fragment.app.g(this, z4, yt0Var, 3));
        this.B.setInterpolator(org.telegram.ui.Components.mr.h);
        this.B.setDuration(250L);
        this.B.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f32449y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32447w, 1.0f);
        this.f32449y = ofFloat;
        ofFloat.addUpdateListener(new x3(this, 1));
        this.f32449y.addListener(new cg.l0(this, 27));
        this.f32449y.setInterpolator(org.telegram.ui.Components.mr.h);
        this.f32449y.setDuration(320L);
        this.f32449y.start();
    }

    public final void g(org.telegram.ui.ActionBar.p2 p2Var) {
        zn znVar;
        lk lkVar;
        this.f32445r = false;
        this.f32441b = p2Var;
        p2Var.getResourceProvider();
        if ((p2Var instanceof zn) && (lkVar = (znVar = (zn) p2Var).V) != null) {
            lkVar.P();
            znVar.V.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        if (j3Var != null) {
            if (!j3Var.e) {
                j3Var.e = true;
                try {
                    j3Var.show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else {
            z3 z3Var = this.f32442c;
            AndroidUtilities.removeFromParent(z3Var);
            if (p2Var.getLayoutContainer() != null) {
                p2Var.getLayoutContainer().addView(z3Var);
            }
        }
        n4 n4Var = this.H;
        r3 r3Var = n4Var.f36375r0[0];
        if (r3Var != null && r3Var.B) {
            if (r3Var.getWebView() != null) {
                r3Var.getWebView().onResume();
            }
            r3Var.B = false;
        }
        r3 r3Var2 = n4Var.f36375r0[1];
        if (r3Var2 != null && r3Var2.B) {
            if (r3Var2.getWebView() != null) {
                r3Var2.getWebView().onResume();
            }
            r3Var2.B = false;
        }
        n4.Y0.add(n4Var);
    }

    @Override
    public final org.telegram.ui.Components.qc getBulletinFactory() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a4.getBulletinFactory():org.telegram.ui.Components.qc");
    }

    @Override
    public final int getNavigationBarColor(int i10) {
        float min;
        if (this.f32444n) {
            min = 0.0f;
        } else {
            min = Math.min(this.f32447w, 1.0f - this.f32448x) * (1.0f - this.F);
        }
        int j10 = j();
        o0 o0Var = this.H.f36363e0;
        if (o0Var != null) {
            j10 = i0.a.d(o0Var.U, j10, o0Var.f39623x);
        }
        return i0.a.d(min, i10, j10);
    }

    @Override
    public final View getWindowView() {
        return this.f32442c;
    }

    public final void h() {
        if (this.f32446s != isFullyVisible()) {
            this.f32446s = isFullyVisible();
            org.telegram.ui.ActionBar.p2 p2Var = this.f32441b;
            if (p2Var != null && (p2Var.getParentLayout() instanceof ActionBarLayout)) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f32441b.getParentLayout();
                org.telegram.ui.ActionBar.w wVar = actionBarLayout.f19456s;
                if (wVar != null) {
                    wVar.invalidate();
                }
                org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.f19461w;
                if (wVar2 != null) {
                    wVar2.invalidate();
                    return;
                }
                return;
            }
            z3 z3Var = this.f32442c;
            if (z3Var.getParent() instanceof View) {
                ((View) z3Var.getParent()).invalidate();
            }
        }
    }

    public final void i() {
        View view;
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        z3 z3Var = this.f32442c;
        if (j3Var != null) {
            view = j3Var.f19802b;
        } else {
            view = z3Var;
        }
        AndroidUtilities.setLightStatusBar(view, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.j3 j3Var2 = this.e;
        boolean z4 = false;
        if (j3Var2 != null) {
            int navigationBarColor = j3Var2.f19801a.getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
            j3Var2.d.setColor(navigationBarColor);
            j3Var2.f19803c.invalidate();
            AndroidUtilities.setNavigationBarColor(j3Var2, navigationBarColor);
            if (AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f) {
                z4 = true;
            }
            AndroidUtilities.setLightNavigationBar(j3Var2, z4);
            LaunchActivity.D1.H(true, true, true);
            return;
        }
        LaunchActivity.D1.H(true, true, true);
        if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false))) >= 0.721f) {
            z4 = true;
        }
        AndroidUtilities.setLightNavigationBar(z3Var, z4);
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        float min;
        int d;
        float f10 = 0.0f;
        if (this.f32444n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.F) * Math.min(this.f32447w, 1.0f - this.f32448x);
        }
        if (this.C && min > 0.25f) {
            if (!SharedConfig.adaptableColorInBrowser) {
                d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            } else {
                n4 n4Var = this.H;
                if (n4Var.f36375r0[0].getVisibility() == 0) {
                    f10 = 1.0f - (n4Var.f36375r0[0].getTranslationX() / n4Var.f36375r0[0].getWidth());
                }
                d = i0.a.d(1.0f - f10, n4Var.f36375r0[0].getActionBarColor(), n4Var.f36375r0[1].getActionBarColor());
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isFullyVisible() {
        if (this.D && this.f32448x <= 0.0f && this.f32447w >= 1.0f && this.F <= 0.0f && !this.f32444n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isShown() {
        z3 z3Var;
        if (this.h || this.f32445r || this.f32447w <= 0.5f || (z3Var = this.f32442c) == null || !z3Var.isAttachedToWindow() || AndroidUtilities.lerp(z3Var.E0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(z3Var.f40388x0.f31253c)) >= z3Var.getHeight() || this.F >= 1.0f) {
            return false;
        }
        return true;
    }

    public final int j() {
        float translationX;
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sk, false);
        }
        n4 n4Var = this.H;
        if (n4Var.f36375r0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (n4Var.f36375r0[0].getTranslationX() / n4Var.f36375r0[0].getWidth());
        }
        return i0.a.d(1.0f - translationX, n4Var.f36375r0[0].getBackgroundColor(), n4Var.f36375r0[1].getBackgroundColor());
    }

    public final int k() {
        int height;
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        if (view == null) {
            height = AndroidUtilities.displaySize.y;
        } else {
            height = view.getHeight();
        }
        return org.telegram.messenger.y3.z(20.0f, l(), dp + height);
    }

    public final int l() {
        float f10;
        n4 n4Var = this.H;
        int i10 = 0;
        r3 r3Var = n4Var.f36375r0[0];
        if (r3Var != null && r3Var.getVisibility() == 0) {
            f10 = 1.0f - (n4Var.f36375r0[0].getTranslationX() / n4Var.f36375r0[0].getWidth());
        } else {
            f10 = 0.0f;
        }
        float f11 = 1.0f - f10;
        r3 r3Var2 = n4Var.f36375r0[0];
        if (r3Var2 != null && r3Var2.getVisibility() == 0) {
            i10 = (int) (n4Var.f36375r0[0].getAlpha() * n4Var.f36375r0[0].getListTop() * f10);
        }
        r3 r3Var3 = n4Var.f36375r0[1];
        if (r3Var3 != null && r3Var3.getVisibility() == 0) {
            return i10 + ((int) (n4Var.f36375r0[1].getAlpha() * n4Var.f36375r0[1].getListTop() * f11));
        }
        return i10;
    }

    public final void m() {
        n4 n4Var = this.H;
        n4Var.f36375r0[0].setLastVisible(this.G);
        n4Var.f36375r0[1].setLastVisible(false);
    }

    public final void n() {
        float f10;
        View view = this.d;
        if (view == null) {
            return;
        }
        float k10 = k();
        float f11 = 1.0f - this.f32447w;
        if (this.f32444n) {
            f10 = 0.0f;
        } else {
            f10 = this.f32448x;
        }
        view.setTranslationY(Math.max(f11, f10) * k10);
        this.f32442c.invalidate();
    }

    @Override
    public final boolean onAttachedBackPressed() {
        n4 n4Var = this.H;
        if (n4Var.f36370l0) {
            AndroidUtilities.hideKeyboard(this.f32442c);
            return true;
        }
        o0 o0Var = n4Var.f36363e0;
        if (o0Var.Q) {
            o0Var.h(false);
            return true;
        } else if (o0Var.T) {
            o0Var.k(false);
            return true;
        } else {
            if (n4Var.J()) {
                r3 r3Var = n4Var.f36375r0[0];
                if (r3Var.f37689s) {
                    if (r3Var.f() && r3Var.getWebView() != null) {
                        r3Var.getWebView().goBack();
                    }
                    return true;
                }
            }
            if (n4Var.f36359a0.size() > 1) {
                n4Var.G();
                return true;
            }
            dismiss(false);
            return true;
        }
    }

    @Override
    public final void release() {
        this.f32445r = true;
        n4 n4Var = this.H;
        r3 r3Var = n4Var.f36375r0[0];
        if (r3Var != null && r3Var.h) {
            o3 o3Var = r3Var.e;
            o3Var.setSwipeOffsetY((-o3Var.f43682f) + o3Var.e);
            n4Var.f36375r0[0].h = false;
        }
        r3 r3Var2 = n4Var.f36375r0[0];
        if (r3Var2 != null && !r3Var2.B) {
            if (r3Var2.getWebView() != null) {
                r3Var2.getWebView().onPause();
            }
            r3Var2.B = true;
        }
        r3 r3Var3 = n4Var.f36375r0[1];
        if (r3Var3 != null && !r3Var3.B) {
            if (r3Var3.getWebView() != null) {
                r3Var3.getWebView().onPause();
            }
            r3Var3.B = true;
        }
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        if (j3Var != null) {
            j3Var.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f32441b;
        if (p2Var != null) {
            p2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.f32442c);
            }
        }
        nh.k3 k3Var = this.v;
        if (k3Var != null) {
            k3Var.run();
            this.v = null;
        }
        n4.Y0.remove(n4Var);
    }

    @Override
    public final void setLastVisible(boolean z4) {
        this.G = z4;
        n4 n4Var = this.H;
        n4Var.f36375r0[0].setLastVisible(z4);
        n4Var.f36375r0[1].setLastVisible(false);
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (nh.k3) runnable;
    }

    @Override
    public final boolean showDialog(Dialog dialog) {
        return false;
    }

    @Override
    public final void dismiss(boolean z4) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f32444n = z4;
        if (z4) {
            LaunchActivity.D1.f31628v0.b(this);
        } else {
            e(true, new yt0(this, 10));
        }
        i();
        h();
    }

    @Override
    public final org.telegram.ui.ActionBar.u3 mo37getWindowView() {
        return this.f32442c;
    }

    @Override
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
