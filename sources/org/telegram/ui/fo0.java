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
public final class fo0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.y51, org.telegram.ui.Components.k61, org.telegram.ui.Components.pd0, wi.l {
    public final PhotoViewer f47939a;

    public fo0(PhotoViewer photoViewer) {
        this.f47939a = photoViewer;
    }

    @Override
    public boolean A1(boolean z10, float f10, org.telegram.ui.Components.en0 en0Var) {
        boolean g10 = g();
        PhotoViewer photoViewer = this.f47939a;
        if (g10) {
            photoViewer.f43307c4.startRewind(photoViewer.f43343g0, z10, f10, photoViewer.f43464u1, en0Var);
            return true;
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var == null) {
            return false;
        }
        photoViewer.f43307c4.startRewind(h61Var, z10, f10, photoViewer.f43464u1, en0Var);
        return true;
    }

    @Override
    public boolean C2() {
        if (g() && !this.f47939a.f43343g0.f36730y) {
            return false;
        }
        return true;
    }

    @Override
    public void E0(SurfaceTexture surfaceTexture) {
        PhotoViewer photoViewer = this.f47939a;
        photoViewer.Y8 = false;
        try {
            vq0 vq0Var = photoViewer.f43352h0;
            if (vq0Var != null && vq0Var.getParent() == null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.f43352h0, photoViewer.f43323e0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (photoViewer.E2) {
            org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
            if (h61Var != null) {
                h61Var.A0(null);
                photoViewer.G2.z0(photoViewer.D2);
            }
            surfaceTexture.release();
            return;
        }
        TextureView textureView = photoViewer.C2;
        if (textureView != null && photoViewer.f43513z2 != null) {
            textureView.setSurfaceTexture(surfaceTexture);
            org.telegram.messenger.g0.E2(photoViewer.C2);
            photoViewer.f43513z2.addView(photoViewer.C2, 0, c8.na.e(-1, -1, 17));
        }
    }

    @Override
    public void I(wi.o oVar) {
        PhotoViewer photoViewer = this.f47939a;
        photoViewer.Y8 = true;
        if (photoViewer.E2) {
            org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
            if (h61Var != null) {
                h61Var.z0(null);
                photoViewer.G2.A0(null);
                photoViewer.G2.A0(oVar);
            }
        } else {
            TextureView textureView = photoViewer.C2;
            if (textureView != null) {
                photoViewer.W8 = oVar;
                org.telegram.messenger.g0.E2(textureView);
                photoViewer.W8 = null;
            }
        }
        try {
            vq0 vq0Var = photoViewer.f43352h0;
            if (vq0Var != null && vq0Var.getParent() != null) {
                ((WindowManager) photoViewer.E.getSystemService("window")).removeViewImmediate(photoViewer.f43352h0);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public View K0() {
        if (g()) {
            return this.f47939a.f43343g0.getWebView();
        }
        return null;
    }

    @Override
    public boolean O0() {
        vq0 vq0Var;
        PhotoViewer photoViewer = PhotoViewer.f43278l9;
        PhotoViewer photoViewer2 = this.f47939a;
        if (photoViewer == photoViewer2 && photoViewer2.f43322e && !photoViewer2.J3 && !photoViewer2.Y8 && (vq0Var = photoViewer2.f43352h0) != null && vq0Var.getParent() != null) {
            PhotoViewer photoViewer3 = this.f47939a;
            if (!photoViewer3.B3 && photoViewer3.f43405n4 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void P1() {
        View view;
        PhotoViewer photoViewer = this.f47939a;
        if (photoViewer.J3) {
            if (PhotoViewer.f43278l9 != null) {
                PhotoViewer.f43278l9.z0(false, true);
            }
            dq0 dq0Var = photoViewer.f43343g0;
            if (dq0Var != null && dq0Var.f36724f != null) {
                if (org.telegram.messenger.t0.f27021x) {
                    try {
                        dq0Var.getContext().startService(new Intent(org.telegram.messenger.t0.f27013b, BringAppForegroundService.class));
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                }
                dq0Var.h.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) dq0Var.f36724f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(dq0Var.f36724f);
                }
                dq0Var.addView(dq0Var.f36724f, 0, c8.na.e(-1, -1, 51));
                wi.n nVar = dq0Var.f36721b.V8;
                if (nVar != null) {
                    nVar.a(new fi.e(22));
                }
            }
            PhotoViewer.f43278l9 = PhotoViewer.f43279m9;
            PhotoViewer.f43279m9 = null;
            if (photoViewer.f43343g0 == null) {
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
            if (photoViewer.f43343g0 == null && view != null) {
                org.telegram.messenger.g0.E2(view);
                view.setVisibility(4);
                photoViewer.f43513z2.addView(view);
            }
            if (org.telegram.messenger.t0.f27021x) {
                try {
                    photoViewer.E.startService(new Intent(org.telegram.messenger.t0.f27013b, BringAppForegroundService.class));
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                }
            }
            if (photoViewer.f43343g0 == null) {
                if (view != null) {
                    photoViewer.B3 = true;
                    org.telegram.ui.Components.aj0 s12 = photoViewer.s1(false);
                    float f10 = s12.f33484c / photoViewer.f43495x3.getLayoutParams().width;
                    photoViewer.f43495x3.setScaleX(f10);
                    photoViewer.f43495x3.setScaleY(f10);
                    photoViewer.f43495x3.setTranslationX(s12.f33482a);
                    photoViewer.f43495x3.setTranslationY(s12.f33483b);
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationX(s12.f33482a - photoViewer.f43513z2.getX());
                    view.setTranslationY(s12.f33483b - photoViewer.f43513z2.getY());
                    pq0 pq0Var = photoViewer.F2;
                    if (pq0Var != null) {
                        pq0Var.setScaleX(f10);
                        photoViewer.F2.setScaleY(f10);
                        photoViewer.F2.setTranslationX(view.getTranslationX());
                        photoViewer.F2.setTranslationY(view.getTranslationY());
                    }
                    photoViewer.X = 0.0f;
                    fp0 fp0Var = new fp0(photoViewer, f10, 1);
                    view.setOutlineProvider(fp0Var);
                    view.setClipToOutline(true);
                    photoViewer.f43495x3.setOutlineProvider(fp0Var);
                    photoViewer.f43495x3.setClipToOutline(true);
                    pq0 pq0Var2 = photoViewer.F2;
                    if (pq0Var2 != null) {
                        pq0Var2.setOutlineProvider(fp0Var);
                        photoViewer.F2.setClipToOutline(true);
                    }
                }
            } else {
                photoViewer.f43398m6 = 0.0f;
            }
            try {
                photoViewer.f43322e = true;
                photoViewer.f43333f = true;
                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.f43352h0, photoViewer.f43323e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).f43188a1.add(photoViewer.f43456t1);
                }
                wq0 wq0Var = photoViewer.f43317d5;
                if (wq0Var != null && !wq0Var.f53742s) {
                    wq0Var.f53726a.P0(false, false);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (photoViewer.E2) {
                l2.g0 g0Var = photoViewer.G2.d;
                if (g0Var != null) {
                    g0Var.z1(null);
                }
                photoViewer.G2.z0(photoViewer.D2);
                photoViewer.D2.setVisibility(4);
                photoViewer.G3 = 2;
                photoViewer.F3 = false;
                photoViewer.f43334f0.invalidate();
                photoViewer.f43475v3 = 4;
                return;
            }
            photoViewer.f43475v3 = 4;
        }
    }

    @Override
    public void T0() {
        this.f47939a.f43307c4.cancelRewind();
    }

    @Override
    public int V1() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.f47939a;
        if (g10) {
            return photoViewer.f43343g0.getEmbedHeight();
        }
        org.telegram.ui.Components.te0 te0Var = photoViewer.f43513z2;
        if (te0Var != null && te0Var.getAspectRatio() > 0.0f) {
            return 1000;
        }
        return photoViewer.W;
    }

    @Override
    public void a() {
        PhotoViewer photoViewer = this.f47939a;
        if (photoViewer.f43387l3 && photoViewer.P3) {
            photoViewer.r2();
        }
    }

    @Override
    public void b() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.f47939a;
        if (g10) {
            photoViewer.f43343g0.f();
            return;
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null) {
            h61Var.g0();
        }
    }

    @Override
    public int b1() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.f47939a;
        if (g10) {
            return photoViewer.f43343g0.getEmbedWidth();
        }
        org.telegram.ui.Components.te0 te0Var = photoViewer.f43513z2;
        if (te0Var != null && te0Var.getAspectRatio() > 0.0f) {
            return Math.round(photoViewer.f43513z2.getAspectRatio() * 1000.0f);
        }
        return photoViewer.V;
    }

    @Override
    public void c(long j3) {
        boolean g10 = g();
        PhotoViewer photoViewer = this.f47939a;
        if (g10) {
            photoViewer.f43343g0.i(j3);
            return;
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null) {
            h61Var.p0(j3);
        }
    }

    @Override
    public void d() {
        PhotoViewer photoViewer = this.f47939a;
        if (photoViewer.f43387l3 && photoViewer.P3) {
            org.telegram.messenger.g0.r(photoViewer.f43504y2);
        }
    }

    @Override
    public void d1(float f10) {
        this.f47939a.f43307c4.setX(f10);
    }

    @Override
    public float d2() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.f47939a;
        if (g10) {
            return photoViewer.f43343g0.getBufferedPosition();
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null && h61Var.U() > 0) {
            return Math.max(photoViewer.X8, ((float) photoViewer.G2.K()) / ((float) photoViewer.G2.U()));
        }
        return photoViewer.X8;
    }

    @Override
    public void e(float f10) {
        dq0 dq0Var;
        PhotoViewer photoViewer = this.f47939a;
        if (photoViewer.G2 == null && ((dq0Var = photoViewer.f43343g0) == null || !dq0Var.f36730y)) {
            return;
        }
        if (!photoViewer.H8 && photoViewer.X7.getVisibility() == 0) {
            f10 = ((photoViewer.Y7.getRightProgress() - photoViewer.Y7.getLeftProgress()) * f10) + photoViewer.Y7.getLeftProgress();
        }
        long x12 = photoViewer.x1();
        if (x12 == -9223372036854775807L) {
            photoViewer.f43284a3 = f10;
        } else {
            photoViewer.s2((int) (f10 * ((float) x12)));
        }
        photoViewer.a3(false);
        photoViewer.f43466u3 = false;
    }

    @Override
    public void f() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.f47939a;
        if (g10) {
            photoViewer.f43343g0.g();
            return;
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null) {
            h61Var.h0();
        }
    }

    @Override
    public boolean f0() {
        if (g()) {
            dq0 dq0Var = this.f47939a.f43343g0;
            if (dq0Var.f36730y && "inapp".equals(org.telegram.messenger.mp.u1(dq0Var.f36720a).D3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean g() {
        PhotoViewer photoViewer = this.f47939a;
        if (photoViewer.f43459t4 && photoViewer.f43343g0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public long getDuration() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.f47939a;
        if (g10) {
            return photoViewer.f43343g0.getVideoDuration();
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null) {
            return h61Var.U();
        }
        return 0L;
    }

    @Override
    public void h(float f10) {
        jp0 jp0Var;
        jp0 jp0Var2;
        PhotoViewer photoViewer = this.f47939a;
        dq0 dq0Var = photoViewer.f43343g0;
        if (dq0Var != null && dq0Var.f36730y && (jp0Var2 = photoViewer.f43450s3) != null) {
            int i7 = photoViewer.f43430q3.h - org.telegram.ui.Components.l61.S;
            jp0Var2.O = dq0Var;
            if (jp0Var2.f38393a0 != 0) {
                jp0Var2.f38393a0 = 0L;
                jp0Var2.f38403g0 = null;
                jp0Var2.f38402f0 = null;
                jp0Var2.f38400e0 = null;
                jp0Var2.b(-1);
            }
            if (i7 != 0) {
                jp0Var2.f38406r = i7;
                int i10 = ((int) (i7 * f10)) / 5;
                if (jp0Var2.f38405n != i10) {
                    jp0Var2.f38405n = i10;
                }
            }
            String g02 = org.telegram.messenger.g0.g0((int) ((dq0Var.getVideoDuration() * f10) / 1000), false, false);
            jp0Var2.E = g02;
            jp0Var2.F = (int) Math.ceil(jp0Var2.G.measureText(g02));
            jp0Var2.invalidate();
            if (jp0Var2.f38401f != null) {
                Utilities.f22877e.a(jp0Var2.f38401f);
            }
            double videoDuration = (f10 * dq0Var.getVideoDuration()) / 1000.0d;
            jp0Var2.P = videoDuration;
            String c10 = dq0Var.c((int) videoDuration);
            if (c10 != null) {
                jp0Var2.R.p0(c10, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (jp0Var = photoViewer.f43450s3) != null) {
            jp0Var.e(photoViewer.T4, f10, photoViewer.f43430q3.h - org.telegram.ui.Components.l61.S);
        }
        this.f47939a.a3(true);
        PhotoViewer.Q(this.f47939a);
    }

    @Override
    public boolean h1() {
        PhotoViewer photoViewer = this.f47939a;
        if (photoViewer.f43449s2 && j() && !photoViewer.f43459t4) {
            return true;
        }
        return false;
    }

    public void i() {
        boolean z10;
        int i7;
        hi.r7 r7Var;
        PhotoViewer photoViewer = this.f47939a;
        if (photoViewer.f43425p7 == null) {
            return;
        }
        org.telegram.ui.Components.j61 j61Var = photoViewer.f43391l7;
        boolean z11 = false;
        if (j61Var != null && (r7Var = j61Var.f36309b) != null && r7Var.f15304f != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && j61Var.d) {
            z11 = true;
        }
        photoViewer.f43418p0.R(126, z10);
        photoViewer.f43434q7.a(z11, true);
        org.telegram.ui.ActionBar.y0 y0Var = photoViewer.f43425p7;
        if (z11) {
            i7 = 2131743339;
        } else {
            i7 = 2131743340;
        }
        y0Var.setSubtext(org.telegram.messenger.gd.N0(i7, null));
    }

    @Override
    public boolean i1() {
        return false;
    }

    @Override
    public void invalidate() {
        this.f47939a.f43334f0.invalidate();
    }

    @Override
    public boolean j() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.f47939a;
        if (g10) {
            return photoViewer.f43343g0.H;
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null && h61Var.d0()) {
            return true;
        }
        return false;
    }

    public void k(boolean z10) {
        float f10;
        boolean z11 = !z10;
        PhotoViewer photoViewer = this.f47939a;
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
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.kr.f36858f).setDuration(150L).withEndAction(new org.telegram.ui.Components.qp0(11, photoViewer, z11));
        }
    }

    @Override
    public boolean l0() {
        return this.f47939a.f43307c4.rewinding;
    }

    public void m() {
        PhotoViewer photoViewer = this.f47939a;
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var == null) {
            return;
        }
        h61Var.p0(((float) h61Var.U()) * photoViewer.C8);
        photoViewer.G2.g0();
        photoViewer.Y7.setProgress(photoViewer.C8);
        photoViewer.n0();
        gf0 gf0Var = new gf0(this, 22);
        photoViewer.I2 = gf0Var;
        org.telegram.messenger.g0.h3(gf0Var, 860L);
    }

    @Override
    public long n() {
        boolean g10 = g();
        PhotoViewer photoViewer = this.f47939a;
        if (g10) {
            return photoViewer.f43343g0.getCurrentPosition();
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.G2;
        if (h61Var != null) {
            return h61Var.S();
        }
        return 0L;
    }

    @Override
    public e2.c1 n1() {
        org.telegram.ui.Components.h61 h61Var;
        if (!g() && (h61Var = this.f47939a.G2) != null) {
            return h61Var.d;
        }
        return null;
    }

    @Override
    public boolean o1() {
        return false;
    }

    @Override
    public void t2(Canvas canvas, int i7, int i10) {
        this.f47939a.f43296b4.draw(canvas, i7, i10);
    }

    @Override
    public void v1() {
        this.f47939a.V8 = null;
        PhotoViewer photoViewer = PhotoViewer.f43279m9;
        PhotoViewer photoViewer2 = this.f47939a;
        if (photoViewer == photoViewer2) {
            photoViewer2.J0();
            MediaController.B().F0();
            return;
        }
        PhotoViewer photoViewer3 = PhotoViewer.f43278l9;
        PhotoViewer photoViewer4 = this.f47939a;
        if (photoViewer3 == photoViewer4) {
            if (photoViewer4.Y8) {
                photoViewer4.Y8 = false;
                try {
                    vq0 vq0Var = photoViewer4.f43352h0;
                    if (vq0Var != null && vq0Var.getParent() == null) {
                        PhotoViewer photoViewer5 = this.f47939a;
                        ((WindowManager) this.f47939a.E.getSystemService("window")).addView(photoViewer5.f43352h0, photoViewer5.f43323e0);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            this.f47939a.z0(false, false);
        }
    }

    @Override
    public void w0(Rect rect) {
        qq0 qq0Var;
        PhotoViewer photoViewer = this.f47939a;
        RectF rectF = photoViewer.Z8;
        if (photoViewer.f43290a9 && (qq0Var = photoViewer.f43334f0) != null && qq0Var.isAttachedToWindow()) {
            int[] iArr = new int[2];
            photoViewer.f43334f0.getLocationOnScreen(iArr);
            rect.set(Math.round(rectF.left + iArr[0]), Math.round(rectF.top + iArr[1]), Math.round(rectF.right + iArr[0]), Math.round(rectF.bottom + iArr[1]));
            return;
        }
        rect.setEmpty();
    }

    @Override
    public int y() {
        return 0;
    }

    @Override
    public View y0(LaunchActivity launchActivity) {
        return null;
    }

    @Override
    public void B0(View view) {
    }

    @Override
    public void D1(View view) {
    }

    @Override
    public void D2(int i7) {
    }

    @Override
    public void l(View view) {
    }

    @Override
    public void z0(View view) {
    }

    @Override
    public void n2(int i7, ArrayList arrayList) {
    }
}
