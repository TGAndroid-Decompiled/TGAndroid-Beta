package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import androidx.profileinstaller.ProfileInstallReceiver;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ef;
import org.telegram.messenger.ff;
import org.telegram.messenger.gd;
import org.telegram.messenger.jc;
import org.telegram.messenger.ur;
import org.telegram.messenger.x9;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.k9;
import org.telegram.ui.nm0;
import org.telegram.ui.s9;
import org.telegram.ui.up0;
import org.telegram.ui.vp0;
import org.telegram.ui.ys;
public class i5 implements gh.a, zm0, org.telegram.ui.Components.z4, ne0, hk0, dz, nm0, jc, jg.y1, hs0, i71, s9, q5.b, te.b, tg.q1, sg.s0, u4.c, com.google.android.gms.common.api.internal.n {
    public final Object f29095a;

    public i5(Object obj) {
        this.f29095a = obj;
    }

    public static i5 M(float f10, int i7) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f24226q;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new i5(i10, i11, new int[0]);
        }
        if (i7 == 3) {
            return new i5(i10, i11, i11, i10);
        }
        boolean z11 = true;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 >= i11) {
            z11 = false;
        }
        if (z10 == z11) {
            return new i5(i10, i11, new int[0]);
        }
        return new i5(i11, i10, new int[0]);
    }

    public gh.a A() {
        t4 t4Var = ((k5) this.f29095a).d;
        if (t4Var != null) {
            return t4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override
    public float A1() {
        float f10;
        gh.a A = A();
        gh.a B = B();
        if (A != null) {
            f10 = A.A1();
        } else {
            f10 = 0.0f;
        }
        if (B != null) {
            return org.telegram.messenger.g0.T1(B.A1(), f10, ((k5) this.f29095a).f29201a);
        }
        return f10;
    }

    public gh.a B() {
        t4 t4Var;
        k5 k5Var = (k5) this.f29095a;
        if (k5Var.f29201a < 1.0f && (t4Var = k5Var.d) != null) {
            return t4Var.getButtonsGlassColorProvider();
        }
        return null;
    }

    public s0.c C(int i7) {
        return null;
    }

    public android.view.ViewGroup D(android.content.Context r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.i5.D(android.content.Context, int):android.view.ViewGroup");
    }

    @Override
    public int D0() {
        int i7;
        gh.a A = A();
        gh.a B = B();
        if (A != null) {
            i7 = A.D0();
        } else {
            i7 = 0;
        }
        if (B != null) {
            return i0.a.f(((k5) this.f29095a).f29201a, B.D0(), i7);
        }
        return i7;
    }

    @Override
    public int D1() {
        int i7;
        gh.a A = A();
        gh.a B = B();
        if (A != null) {
            i7 = A.D1();
        } else {
            i7 = 0;
        }
        if (B != null) {
            return i0.a.f(((k5) this.f29095a).f29201a, B.D1(), i7);
        }
        return i7;
    }

    @Override
    public void E(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f29095a).setResultCode(i7);
    }

    @Override
    public void E1(RectF rectF) {
        rectF.set(((ji.q) this.f29095a).R);
    }

    public String F(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            pa.d dVar = (pa.d) this.f29095a;
            pa.e eVar = new pa.e(stringWriter, dVar.f55629a, dVar.f55630b, dVar.f55631c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f55633b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public void G(float f10, int i7) {
        ((te.h) this.f29095a).f(f10);
    }

    @Override
    public void H(String str) {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f29095a;
        try {
            v0Var.Q = System.currentTimeMillis();
            v0Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) this.f29095a;
        m0Var.u1(i7, i10, z10);
        m0Var.dismiss();
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        ((te.h) this.f29095a).f(f10);
    }

    public s0.c L(int i7) {
        return null;
    }

    public boolean N(int i7, int i10, Bundle bundle) {
        return false;
    }

    @Override
    public int Q0() {
        int i7;
        k5 k5Var = (k5) this.f29095a;
        gh.a A = A();
        if (A != null && k5Var.d.e()) {
            i7 = A.Q0();
        } else {
            i7 = 0;
        }
        gh.a B = B();
        if (B != null) {
            return i0.a.f(k5Var.f29201a, B.Q0(), i7);
        }
        return i7;
    }

    @Override
    public float T0() {
        float f10;
        float f11;
        k5 k5Var = (k5) this.f29095a;
        gh.a A = A();
        gh.a B = B();
        if (A != null) {
            f10 = A.T0();
        } else {
            f10 = -1.0f;
        }
        if (B != null) {
            f11 = B.T0();
        } else {
            f11 = f10;
        }
        if (f11 >= 0.0f && f10 >= 0.0f) {
            return org.telegram.messenger.g0.T1(f11, f10, k5Var.f29201a);
        }
        if (k5Var.f29201a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public void U0() {
        ((x60) this.f29095a).k();
    }

    @Override
    public float V0() {
        float f10;
        float f11;
        k5 k5Var = (k5) this.f29095a;
        gh.a A = A();
        gh.a B = B();
        if (A != null) {
            f10 = A.V0();
        } else {
            f10 = -1.0f;
        }
        if (B != null) {
            f11 = B.V0();
        } else {
            f11 = f10;
        }
        if (f11 >= 0.0f && f10 >= 0.0f) {
            return org.telegram.messenger.g0.T1(f11, f10, k5Var.f29201a);
        }
        if (k5Var.f29201a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public boolean W1(int i7) {
        if (i7 == ((wo0) this.f29095a).f41694r) {
            return true;
        }
        return false;
    }

    @Override
    public y0 X0(String str) {
        y0 h = ((x60) this.f29095a).h();
        h.setText(str);
        return h;
    }

    @Override
    public int X1() {
        int i7;
        gh.a A = A();
        gh.a B = B();
        if (A != null) {
            i7 = A.X1();
        } else {
            i7 = 0;
        }
        if (B != null) {
            return i0.a.f(((k5) this.f29095a).f29201a, B.X1(), i7);
        }
        return i7;
    }

    @Override
    public a0.h Y0() {
        return null;
    }

    @Override
    public boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override
    public void a(int i7, boolean z10) {
        k71 k71Var = (k71) this.f29095a;
        k71Var.E = z10;
        k71Var.d = i7;
        k71Var.I(1);
        k71Var.w(i7, z10);
        View[] viewArr = k71Var.f36665e;
        int i10 = 0;
        View view = viewArr[0];
        if (view != null) {
            i10 = view.getMeasuredWidth();
        }
        View view2 = viewArr[1];
        if (view2 != null) {
            if (z10) {
                k71Var.D(view2, i10);
            } else {
                k71Var.D(view2, -i10);
            }
        }
    }

    @Override
    public int a0() {
        return 0;
    }

    @Override
    public void b(ArrayList arrayList) {
        u30.a((u30) this.f29095a, false, arrayList);
    }

    @Override
    public void c(float f10) {
        k71 k71Var = (k71) this.f29095a;
        View[] viewArr = k71Var.f36665e;
        if (f10 == 1.0f) {
            if (viewArr[1] != null) {
                k71Var.E();
                k71Var.h.put(k71Var.f36666f[1], viewArr[1]);
                k71Var.removeView(viewArr[1]);
                k71Var.D(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            k71Var.x(k71Var.f36663b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (k71Var.E) {
            k71Var.D(view, (1.0f - f10) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            k71Var.D(view2, (-view2.getMeasuredWidth()) * f10);
        } else {
            k71Var.D(view, (1.0f - f10) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            k71Var.D(view3, view3.getMeasuredWidth() * f10);
        }
        k71Var.u(false);
    }

    @Override
    public boolean d() {
        k71 k71Var = (k71) this.f29095a;
        if (!k71Var.f36672y && !k71Var.I) {
            return true;
        }
        return false;
    }

    @Override
    public void e() {
        ((k71) this.f29095a).p();
    }

    @Override
    public void f(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f29095a;
        chatAttachAlertPhotoLayout.M = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.F.d1(true);
    }

    @Override
    public boolean g(int i7) {
        if (((ChatAttachAlertPhotoLayout) this.f29095a).H.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void g0(Object obj) {
        com.google.android.gms.common.api.internal.m mVar;
        x9 x9Var = (x9) obj;
        androidx.activity.n nVar = ((u7.i) this.f29095a).f58573b;
        synchronized (nVar) {
            nVar.f1759b = false;
            mVar = ((com.google.android.gms.common.api.internal.o) nVar.f1760c).f6331b;
        }
        if (mVar != null) {
            ((u7.c) nVar.d).c(mVar, 2441);
        }
    }

    @Override
    public Object mo23get() {
        return this.f29095a;
    }

    @Override
    public float getBlurAngle() {
        return ((ff) this.f29095a).f24011t;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return ((ff) this.f29095a).f24010s;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return ((ff) this.f29095a).f24009r;
    }

    @Override
    public float getBlurExcludeSize() {
        return ((ff) this.f29095a).f24008q;
    }

    @Override
    public int getBlurType() {
        return ((ff) this.f29095a).f24005n;
    }

    @Override
    public CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        ys ysVar = (ys) this.f29095a;
        sb2.append((Object) ysVar.f30559a.getText());
        sb2.append(" ");
        sb2.append((Object) ysVar.f30560b.getText());
        return sb2.toString();
    }

    @Override
    public float getContrastValue() {
        return com.google.android.gms.internal.vision.e2.c(((ff) this.f29095a).d, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public float getEnhanceValue() {
        return ((ff) this.f29095a).f23994a / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return ((ff) this.f29095a).f23996c / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return ((ff) this.f29095a).f23999g / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (((ff) this.f29095a).f24004m / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(((ff) this.f29095a).f24001j, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public float getSaturationValue() {
        float f10 = ((ff) this.f29095a).f23998f / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(((ff) this.f29095a).f24002k, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return com.google.android.gms.internal.vision.e2.c(((ff) this.f29095a).f24006o, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return ((ff) this.f29095a).f23995b / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return ((ff) this.f29095a).f24000i;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (((ff) this.f29095a).f24000i == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return ((ff) this.f29095a).h;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (((ff) this.f29095a).h == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public float getVignetteValue() {
        return ((ff) this.f29095a).f24003l / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return ((ff) this.f29095a).f23997e / 100.0f;
    }

    @Override
    public void h() {
        tg.t0 t0Var = (tg.t0) this.f29095a;
        t0Var.f58236e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new hi.s3(t0Var, 26)).setInterpolator(kr.h);
    }

    @Override
    public void h2(float f10) {
        vp0 vp0Var = (vp0) this.f29095a;
        sg.j0.e(vp0Var.f58062z1).k(String.valueOf(sg.h.f57338a.indexOf(vp0Var.G0.getCurrentBrush())), f10);
        sg.g1 g1Var = vp0Var.f58052u1;
        g1Var.f57337c = f10;
        vp0Var.v0(g1Var, null);
    }

    @Override
    public boolean i(int i7) {
        c71 c71Var = ((k71) this.f29095a).M;
        if (c71Var == null) {
            return false;
        }
        return c71Var.c(i7);
    }

    @Override
    public int i0() {
        int i7;
        k5 k5Var = (k5) this.f29095a;
        gh.a A = A();
        if (A != null && k5Var.d.e()) {
            i7 = A.i0();
        } else {
            i7 = 0;
        }
        gh.a B = B();
        if (B != null) {
            return i0.a.f(k5Var.f29201a, B.i0(), i7);
        }
        return i7;
    }

    @Override
    public void j(boolean z10, float f10) {
        float c10;
        ys ysVar = (ys) this.f29095a;
        if (f10 <= 0.25f) {
            c10 = com.google.android.gms.internal.vision.e2.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c10 = com.google.android.gms.internal.vision.e2.c(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                if (f12 <= 0.25f) {
                    c10 = com.google.android.gms.internal.vision.e2.c(f12, 0.25f, 9.437184E7f, 10485760);
                } else {
                    c10 = com.google.android.gms.internal.vision.e2.c(f12 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i7 = (int) c10;
        long j3 = i7;
        boolean z11 = true;
        ysVar.f30560b.setText(gd.a0("AutodownloadSizeLimitUpTo", null, 2131753769, org.telegram.messenger.g0.i0(j3, false, false)));
        ysVar.d = j3;
        r8[] r8VarArr = ysVar.h;
        AnimatorSet[] animatorSetArr = ysVar.f54422n;
        if (ysVar.f54420e == DataAutoDownloadActivity.o0(ysVar.f54423r)) {
            ysVar.f54421f.setText(gd.a0("AutoDownloadPreloadVideoInfo", null, 2131753807, org.telegram.messenger.g0.i0(j3, false, false)));
            if (i7 <= 2097152) {
                z11 = false;
            }
            if (z11 != r8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                r8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new org.telegram.ui.Cells.x9(ysVar, 23));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public ByteBuffer k() {
        ff ffVar = (ff) this.f29095a;
        ffVar.f24007p.q();
        return (ByteBuffer) ffVar.f24007p.f13728f;
    }

    @Override
    public void k0() {
        tg.t0 t0Var = (tg.t0) this.f29095a;
        t0Var.f58234b.f57386a.v();
        t0Var.f58242x.setViewHidden(false);
        PhotoViewer photoViewer = ((up0) t0Var).L;
        Drawable[] drawableArr = PhotoViewer.f43272f9;
        photoViewer.W2(true, true);
    }

    @Override
    public void m(ArrayList arrayList) {
        c71 c71Var = ((k71) this.f29095a).M;
        if (c71Var == null) {
            return;
        }
        c71Var.a(arrayList);
    }

    @Override
    public void n(View view, boolean z10) {
        if (z10 == ((ChatAttachAlertPhotoLayout) this.f29095a).L && (view instanceof org.telegram.ui.Cells.r5)) {
            org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
            r5Var.f31795y.d(r5Var);
        }
    }

    @Override
    public boolean o(int i7) {
        ef M = ((ChatAttachAlertPhotoLayout) this.f29095a).H.M(i7);
        if (M != null && ChatAttachAlertPhotoLayout.f32864t1.containsKey(Integer.valueOf(M.C))) {
            return true;
        }
        return false;
    }

    @Override
    public y0 o2(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        x60 x60Var = (x60) this.f29095a;
        int y10 = x60Var.y();
        x60Var.c(i7, str, new di.p6(runnable, z11, x60Var, 25), z10);
        View x10 = x60Var.x(y10);
        if (x10 instanceof y0) {
            return (y0) x10;
        }
        return null;
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f29095a;
        v0Var.y("scan_qr_popup_closed", null);
        v0Var.f53588i0 = false;
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
        cg0 cg0Var = ((fg0) this.f29095a).h.H0;
        if (cg0Var != null) {
            cg0Var.d();
        }
    }

    @Override
    public boolean s() {
        return true;
    }

    @Override
    public void s1(boolean z10) {
        ((ji.q) this.f29095a).setLanguagePillHidden(z10);
    }

    @Override
    public void t() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((u30) this.f29095a).f40250a.startActivityForResult(intent, 14);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public void u() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public a0.h u1() {
        return null;
    }

    @Override
    public void v(int i7) {
        wo0 wo0Var = (wo0) this.f29095a;
        zo0 zo0Var = wo0Var.L;
        wo0Var.f41695s = i7;
        if (wo0Var.f41696w != i7) {
            wo0Var.d.clear();
        }
        int i10 = wo0Var.K;
        if (wo0Var.b() == 0 && !wo0Var.f41691e.e() && !wo0Var.J) {
            zo0Var.M1.e(false, true);
        } else {
            zo0Var.f42995t2.b(i10);
        }
        wo0Var.f();
        int i11 = zo0.U2;
        zo0Var.L0(true);
    }

    @Override
    public ji.q v2() {
        return (ji.q) this.f29095a;
    }

    @Override
    public String w0() {
        return ((org.telegram.ui.web.v0) this.f29095a).f53589j0;
    }

    @Override
    public boolean x() {
        return false;
    }

    @Override
    public void x0() {
        ((tg.t0) this.f29095a).f58242x.setViewHidden(true);
    }

    @Override
    public int x2() {
        int i7;
        t4 t4Var;
        k5 k5Var = (k5) this.f29095a;
        gh.a A = A();
        if (A != null) {
            i7 = A.x2();
        } else {
            i7 = 0;
        }
        if (k5Var.f29201a < 1.0f && (t4Var = k5Var.d) != null) {
            return i0.a.f(k5Var.f29201a, t4Var.getButtonsGlassBackgroundColor(), i7);
        }
        return i7;
    }

    @Override
    public boolean z() {
        return !((ff) this.f29095a).f24007p.F();
    }

    public i5(int i7) {
        switch (i7) {
            case 19:
                this.f29095a = new SparseArray();
                return;
            case 20:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f29095a = new of0(this);
                    return;
                } else {
                    this.f29095a = new of0(this);
                    return;
                }
            default:
                this.f29095a = new ConcurrentHashMap(16);
                return;
        }
    }

    @Override
    public float get() {
        vp0 vp0Var = (vp0) this.f29095a;
        int i7 = vp0Var.f58062z1;
        sg.h currentBrush = vp0Var.G0.getCurrentBrush();
        if (currentBrush == null) {
            return sg.j0.e(i7).f57382i;
        }
        return sg.j0.e(i7).f(String.valueOf(sg.h.f57338a.indexOf(currentBrush)), currentBrush.d());
    }

    public i5(int i7, int i10, int... iArr) {
        f50[] f50VarArr = new f50[(iArr.length / 2) + 1];
        this.f29095a = f50VarArr;
        f50 f50Var = new f50(i7, i10);
        int i11 = 0;
        f50VarArr[0] = f50Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((f50[]) this.f29095a)[i12] = new f50(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public i5(EditText editText) {
        this.f29095a = new t1.a(editText);
    }

    @Override
    public void E0(ur urVar) {
    }

    @Override
    public void m2(ArrayList arrayList) {
    }

    @Override
    public void l() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q() {
    }

    @Override
    public void w() {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
