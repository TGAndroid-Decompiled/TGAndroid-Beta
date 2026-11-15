package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class po0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.l51, org.telegram.ui.Components.v51, org.telegram.ui.Components.fd0, wi.l {
    public final PhotoViewer f50321a;

    public po0(PhotoViewer photoViewer) {
        this.f50321a = photoViewer;
    }

    @Override
    public void C(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.f50321a;
        photoViewer.S8 = false;
        try {
            tq0 tq0Var = photoViewer.f42781h0;
            if (tq0Var != null && tq0Var.getParent() == null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.f42781h0, photoViewer.f42753e0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.E2) {
            org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
            if (u51Var != null) {
                u51Var.A0(null);
                photoViewer.G2.z0(photoViewer.D2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.C2;
        if (textureView != null && photoViewer.f42942z2 != null) {
            textureView.setSurfaceTexture(surfaceTexture);
            org.telegram.messenger.g0.E2(photoViewer.C2);
            photoViewer.f42942z2.addView(photoViewer.C2, 0, c8.ja.e(-1, -1, 17));
        }
    }

    @Override
    public View D() {
        if (m()) {
            return this.f50321a.f42772g0.getWebView();
        }
        return null;
    }

    @Override
    public boolean F() {
        tq0 tq0Var;
        PhotoViewer photoViewer = PhotoViewer.f42712f9;
        PhotoViewer photoViewer2 = this.f50321a;
        if (photoViewer == photoViewer2 && photoViewer2.f42752e && !photoViewer2.J3 && !photoViewer2.S8 && (tq0Var = photoViewer2.f42781h0) != null && tq0Var.getParent() != null) {
            PhotoViewer photoViewer3 = this.f50321a;
            if (!photoViewer3.B3 && photoViewer3.f42834n4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void G() {
        this.f50321a.f42739c4.cancelRewind();
    }

    @Override
    public int L() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f50321a;
        if (m10) {
            return photoViewer.f42772g0.getEmbedWidth();
        }
        org.telegram.ui.Components.ie0 ie0Var = photoViewer.f42942z2;
        if (ie0Var != null && ie0Var.getAspectRatio() > 0.0f) {
            return Math.round(photoViewer.f42942z2.getAspectRatio() * 1000.0f);
        }
        return photoViewer.V;
    }

    @Override
    public void M(float f10) {
        this.f50321a.f42739c4.setX(f10);
    }

    @Override
    public boolean N() {
        PhotoViewer photoViewer = this.f50321a;
        if (photoViewer.f42878s2 && h() && !photoViewer.f42888t4) {
            return true;
        }
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public e2.c1 R() {
        org.telegram.ui.Components.u51 u51Var;
        if (!m() && (u51Var = this.f50321a.G2) != null) {
            return u51Var.d;
        }
        return null;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public void V() {
        this.f50321a.P8 = null;
        PhotoViewer photoViewer = PhotoViewer.f42713g9;
        PhotoViewer photoViewer2 = this.f50321a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.f42712f9;
        PhotoViewer photoViewer4 = this.f50321a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.S8) {
                photoViewer4.S8 = false;
                try {
                    tq0 tq0Var = photoViewer4.f42781h0;
                    if (tq0Var != null && tq0Var.getParent() == null) {
                        PhotoViewer photoViewer5 = this.f50321a;
                        ((WindowManager) this.f50321a.E.getSystemService("window")).addView(photoViewer5.f42781h0, photoViewer5.f42753e0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.f50321a.z0(false, false);
        }
    }

    @Override
    public boolean X(boolean z10, float f10, org.telegram.ui.Components.um0 um0Var) {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f50321a;
        if (m10) {
            photoViewer.f42739c4.startRewind(photoViewer.f42772g0, z10, f10, photoViewer.f42893u1, um0Var);
            return true;
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
        if (u51Var == null) {
            return false;
        }
        photoViewer.f42739c4.startRewind(u51Var, z10, f10, photoViewer.f42893u1, um0Var);
        return true;
    }

    @Override
    public void Z() {
        View view;
        PhotoViewer photoViewer = this.f50321a;
        if (photoViewer.J3) {
            if (PhotoViewer.f42712f9 != null) {
                PhotoViewer.f42712f9.z0(false, true);
            }
            bq0 bq0Var = photoViewer.f42772g0;
            if (bq0Var != null && bq0Var.f32975f != null) {
                if (org.telegram.messenger.t0.f26617x) {
                    try {
                        bq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.f26609b, BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                bq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) bq0Var.f32975f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(bq0Var.f32975f);
                }
                bq0Var.addView(bq0Var.f32975f, 0, c8.ja.e(-1, -1, 51));
                wi.n nVar = bq0Var.f32972b.P8;
                if (nVar != null) {
                    nVar.a(new fi.e(21));
                }
            }
            PhotoViewer.f42712f9 = PhotoViewer.f42713g9;
            PhotoViewer.f42713g9 = null;
            if (photoViewer.f42772g0 == null) {
                photoViewer.L3 = true;
                Bitmap bitmap = photoViewer.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    photoViewer.C3 = null;
                }
                photoViewer.F3 = true;
            }
            photoViewer.J3 = false;
            if (photoViewer.E2) {
                view = photoViewer.D2;
            } else {
                view = photoViewer.C2;
            }
            if (photoViewer.f42772g0 == null && view != null) {
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.f42942z2.addView(view);
            }
            if (org.telegram.messenger.t0.f26617x) {
                try {
                    photoViewer.E.startService(new Intent(org.telegram.messenger.t0.f26609b, BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.f42772g0 == null) {
                if (view != null) {
                    photoViewer.B3 = true;
                    org.telegram.ui.Components.pi0 s12 = photoViewer.s1(false);
                    float f10 = s12.f38314c / photoViewer.f42924x3.getLayoutParams().width;
                    photoViewer.f42924x3.setScaleX(f10);
                    photoViewer.f42924x3.setScaleY(f10);
                    photoViewer.f42924x3.setTranslationX(s12.f38312a);
                    photoViewer.f42924x3.setTranslationY(s12.f38313b);
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationX(s12.f38312a - photoViewer.f42942z2.getX());
                    view.setTranslationY(s12.f38313b - photoViewer.f42942z2.getY());
                    nq0 nq0Var = photoViewer.F2;
                    if (nq0Var != null) {
                        nq0Var.setScaleX(f10);
                        photoViewer.F2.setScaleY(f10);
                        photoViewer.F2.setTranslationX(view.getTranslationX());
                        photoViewer.F2.setTranslationY(view.getTranslationY());
                    }
                    photoViewer.X = 0.0f;
                    dp0 dp0Var = new dp0(photoViewer, f10, 1);
                    view.setOutlineProvider(dp0Var);
                    view.setClipToOutline(true);
                    photoViewer.f42924x3.setOutlineProvider(dp0Var);
                    photoViewer.f42924x3.setClipToOutline(true);
                    nq0 nq0Var2 = photoViewer.F2;
                    if (nq0Var2 != null) {
                        nq0Var2.setOutlineProvider(dp0Var);
                        photoViewer.F2.setClipToOutline(true);
                    }
                }
            } else {
                photoViewer.f42827m6 = 0.0f;
            }
            try {
                photoViewer.f42752e = true;
                photoViewer.f42762f = true;
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.f42781h0, photoViewer.f42753e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f42623a1.add(photoViewer.f42885t1);
                }
                uq0 uq0Var = photoViewer.f42748d5;
                if (uq0Var != null && !uq0Var.f52013s) {
                    uq0Var.f51997a.O0(false, false);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (photoViewer.E2) {
                l2.f0 f0Var = photoViewer.G2.d;
                if (f0Var != null) {
                    f0Var.z1(null);
                }
                photoViewer.G2.z0(photoViewer.D2);
                photoViewer.D2.setVisibility(4);
                photoViewer.G3 = 2;
                photoViewer.F3 = false;
                photoViewer.f42763f0.invalidate();
                photoViewer.f42904v3 = 4;
                return;
            }
            photoViewer.f42904v3 = 4;
        }
    }

    @Override
    public void b() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f50321a;
        if (m10) {
            photoViewer.f42772g0.f();
            return;
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
        if (u51Var != null) {
            u51Var.g0();
        }
    }

    @Override
    public int b0() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f50321a;
        if (m10) {
            return photoViewer.f42772g0.getEmbedHeight();
        }
        org.telegram.ui.Components.ie0 ie0Var = photoViewer.f42942z2;
        if (ie0Var != null && ie0Var.getAspectRatio() > 0.0f) {
            return 1000;
        }
        return photoViewer.W;
    }

    @Override
    public void c(long j3) {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f50321a;
        if (m10) {
            photoViewer.f42772g0.i(j3);
            return;
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
        if (u51Var != null) {
            u51Var.p0(j3);
        }
    }

    @Override
    public float c0() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f50321a;
        if (m10) {
            return photoViewer.f42772g0.getBufferedPosition();
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
        if (u51Var != null && u51Var.U() > 0) {
            return Math.max(photoViewer.R8, ((float) photoViewer.G2.K()) / ((float) photoViewer.G2.U()));
        }
        return photoViewer.R8;
    }

    @Override
    public int d() {
        return 0;
    }

    @Override
    public void e(float f10) {
        bq0 bq0Var;
        PhotoViewer photoViewer = this.f50321a;
        if (photoViewer.G2 == null && ((bq0Var = photoViewer.f42772g0) == null || !bq0Var.f32981y)) {
            return;
        }
        if (!photoViewer.B8 && photoViewer.R7.getVisibility() == 0) {
            f10 = ((photoViewer.S7.getRightProgress() - photoViewer.S7.getLeftProgress()) * f10) + photoViewer.S7.getLeftProgress();
        }
        long x12 = photoViewer.x1();
        if (x12 == -9223372036854775807L) {
            photoViewer.f42718a3 = f10;
        } else {
            photoViewer.r2((int) (f10 * ((float) x12)));
        }
        photoViewer.Z2(false);
        photoViewer.f42895u3 = false;
    }

    @Override
    public void f() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f50321a;
        if (m10) {
            photoViewer.f42772g0.g();
            return;
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
        if (u51Var != null) {
            u51Var.h0();
        }
    }

    @Override
    public void g(float f10) {
        hp0 hp0Var;
        hp0 hp0Var2;
        PhotoViewer photoViewer = this.f50321a;
        bq0 bq0Var = photoViewer.f42772g0;
        if (bq0Var != null && bq0Var.f32981y && (hp0Var2 = photoViewer.f42879s3) != null) {
            int i7 = photoViewer.f42859q3.h - org.telegram.ui.Components.w51.S;
            hp0Var2.O = bq0Var;
            if (hp0Var2.f32888a0 != 0) {
                hp0Var2.f32888a0 = 0L;
                hp0Var2.f32898g0 = null;
                hp0Var2.f32897f0 = null;
                hp0Var2.f32895e0 = null;
                hp0Var2.b(-1);
            }
            if (i7 != 0) {
                hp0Var2.f32901r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (hp0Var2.f32900n != i10) {
                    hp0Var2.f32900n = i10;
                }
            }
            String g02 = org.telegram.messenger.g0.g0((int) ((bq0Var.getVideoDuration() * f10) / 1000), false, false);
            hp0Var2.E = g02;
            hp0Var2.F = (int) Math.ceil(hp0Var2.G.measureText(g02));
            hp0Var2.invalidate();
            if (hp0Var2.f32896f != null) {
                Utilities.f22416e.a(hp0Var2.f32896f);
            }
            double videoDuration = (f10 * bq0Var.getVideoDuration()) / 1000.0d;
            hp0Var2.P = videoDuration;
            String c10 = bq0Var.c((int) videoDuration);
            if (c10 != null) {
                hp0Var2.R.o0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (hp0Var = photoViewer.f42879s3) != null) {
            hp0Var.e(photoViewer.T4, f10, photoViewer.f42859q3.h - org.telegram.ui.Components.w51.S);
        }
        this.f50321a.Z2(true);
        PhotoViewer.Q(this.f50321a);
    }

    @Override
    public long getDuration() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f50321a;
        if (m10) {
            return photoViewer.f42772g0.getVideoDuration();
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
        if (u51Var != null) {
            return u51Var.U();
        }
        return 0L;
    }

    @Override
    public boolean h() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f50321a;
        if (m10) {
            return photoViewer.f42772g0.H;
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
        if (u51Var != null && u51Var.d0()) {
            return true;
        }
        return false;
    }

    @Override
    public void i() {
        PhotoViewer photoViewer = this.f50321a;
        if (photoViewer.f42816l3 && photoViewer.P3) {
            photoViewer.q2();
        }
    }

    @Override
    public void invalidate() {
        this.f50321a.f42763f0.invalidate();
    }

    @Override
    public void j(wi.o oVar) {
        PhotoViewer photoViewer = this.f50321a;
        photoViewer.S8 = true;
        if (photoViewer.E2) {
            org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
            if (u51Var != null) {
                u51Var.z0(null);
                photoViewer.G2.A0(null);
                photoViewer.G2.A0(oVar);
            }
        } else {
            TextureView textureView = photoViewer.C2;
            if (textureView != null) {
                photoViewer.Q8 = oVar;
                org.telegram.messenger.g0.E2(textureView);
                photoViewer.Q8 = null;
            }
        }
        try {
            tq0 tq0Var = photoViewer.f42781h0;
            if (tq0Var != null && tq0Var.getParent() != null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).removeViewImmediate(photoViewer.f42781h0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void k() {
        PhotoViewer photoViewer = this.f50321a;
        if (photoViewer.f42816l3 && photoViewer.P3) {
            org.telegram.messenger.g0.r(photoViewer.f42933y2);
        }
    }

    @Override
    public long l() {
        boolean m10 = m();
        PhotoViewer photoViewer = this.f50321a;
        if (m10) {
            return photoViewer.f42772g0.getCurrentPosition();
        }
        org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
        if (u51Var != null) {
            return u51Var.S();
        }
        return 0L;
    }

    public boolean m() {
        PhotoViewer photoViewer = this.f50321a;
        if (photoViewer.f42888t4 && photoViewer.f42772g0 != null) {
            return true;
        }
        return false;
    }

    public void n(boolean z10) {
        float f10;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f50321a;
        if (photoViewer.W0.isClickable() != z11) {
            photoViewer.W0.setClickable(z11);
            photoViewer.W0.setVisibility(0);
            photoViewer.W0.clearAnimation();
            ViewPropertyAnimator animate = photoViewer.W0.animate();
            if (!z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.er.f34419f).setDuration(150L).withEndAction(new org.telegram.ui.Components.fp0(11, photoViewer, z11));
        }
    }

    public void o() {
        PhotoViewer photoViewer = this.f50321a;
        org.telegram.ui.Components.u51 u51Var = photoViewer.G2;
        if (u51Var == null) {
            return;
        }
        u51Var.p0(((float) u51Var.U()) * photoViewer.f42919w8);
        photoViewer.G2.g0();
        photoViewer.S7.setProgress(photoViewer.f42919w8);
        photoViewer.n0();
        ef0 ef0Var = new ef0(this, 22);
        photoViewer.I2 = ef0Var;
        org.telegram.messenger.g0.i3(ef0Var, 860L);
    }

    @Override
    public void o0(Canvas canvas, int i7, int i10) {
        this.f50321a.f42729b4.draw(canvas, i7, i10);
    }

    @Override
    public boolean p() {
        if (m()) {
            bq0 bq0Var = this.f50321a.f42772g0;
            if (bq0Var.f32981y && "inapp".equals(org.telegram.messenger.np.s1(bq0Var.f32971a).B3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean q() {
        return this.f50321a.f42739c4.rewinding;
    }

    @Override
    public boolean t0() {
        if (m() && !this.f50321a.f42772g0.f32981y) {
            return false;
        }
        return true;
    }

    @Override
    public void u(Rect rect) {
        oq0 oq0Var;
        PhotoViewer photoViewer = this.f50321a;
        RectF rectF = photoViewer.T8;
        if (photoViewer.U8 && (oq0Var = photoViewer.f42763f0) != null && oq0Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            photoViewer.f42763f0.getLocationOnScreen(iArr);
            rect.set(Math.round(rectF.left + iArr[0]), Math.round(rectF.top + iArr[1]), Math.round(rectF.right + iArr[0]), Math.round(rectF.bottom + iArr[1]));
            return;
        }
        rect.setEmpty();
    }

    @Override
    public View w(LaunchActivity launchActivity) {
        return null;
    }

    @Override
    public void A(View view) {
    }

    @Override
    public void Y(View view) {
    }

    @Override
    public void a(View view) {
    }

    @Override
    public void u0(int i7) {
    }

    @Override
    public void x(View view) {
    }

    @Override
    public void j0(int i7, ArrayList arrayList) {
    }
}
