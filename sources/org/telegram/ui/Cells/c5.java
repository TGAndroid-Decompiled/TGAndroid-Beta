package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ef;
import org.telegram.messenger.ff;
import org.telegram.messenger.gd;
import org.telegram.messenger.jc;
import org.telegram.messenger.ur;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.pm0;
import org.telegram.ui.vp0;
import org.telegram.ui.zs;
public class c5 implements xm0, org.telegram.ui.Components.z4, me0, fk0, ez, pm0, jc, jg.y1, fs0, e71, org.telegram.ui.s9, te.b, tg.c, tg.l1, com.google.android.gms.common.api.internal.q {
    public final Object f30477a;

    public c5(Object obj) {
        this.f30477a = obj;
    }

    public static v0.i x(c5 c5Var, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return c5Var.A();
        }
        if (obj instanceof v0.m) {
            for (v0.h hVar : ((v0.m) obj).f59024a) {
                if (hVar instanceof v0.o) {
                    return c5Var.A();
                }
            }
        }
        Context ctx = (Context) c5Var.f30477a;
        kotlin.jvm.internal.j.e(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback") && !ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i7 = Build.VERSION.SDK_INT;
            v0.k kVar = null;
            if (i7 >= 34) {
                v0.k kVar2 = new v0.k(ctx);
                if (kVar2.isAvailableOnDevice()) {
                    kVar = kVar2;
                }
                if (kVar == null) {
                    return c5Var.A();
                }
                return kVar;
            } else if (i7 > 33) {
                return null;
            } else {
                return c5Var.A();
            }
        }
        return c5Var.A();
    }

    public static c5 y(float f10, int i7) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f24118q;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new c5(i10, i11, new int[0]);
        }
        if (i7 == 3) {
            return new c5(i10, i11, i11, i10);
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
            return new c5(i10, i11, new int[0]);
        }
        return new c5(i11, i10, new int[0]);
    }

    public v0.i A() {
        String string;
        Context context = (Context) this.f30477a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List<String> l10 = hd.f.l(arrayList);
        if (l10.isEmpty()) {
            return null;
        }
        v0.i iVar = null;
        for (String str : l10) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                v0.i iVar2 = (v0.i) newInstance;
                if (!iVar2.isAvailableOnDevice()) {
                    continue;
                } else if (iVar != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    iVar = iVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return iVar;
    }

    @Override
    public tg.j B() {
        return ((vp0) this.f30477a).C0;
    }

    @Override
    public void D(float f10, int i7) {
        ((te.h) this.f30477a).f(f10);
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        ((te.h) this.f30477a).f(f10);
    }

    @Override
    public void I() {
        ((y60) this.f30477a).k();
    }

    @Override
    public void J(String str) {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f30477a;
        try {
            v0Var.Q = System.currentTimeMillis();
            v0Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public String J0() {
        return ((org.telegram.ui.web.v0) this.f30477a).f53308j0;
    }

    @Override
    public org.telegram.ui.ActionBar.z0 K(String str) {
        org.telegram.ui.ActionBar.z0 h = ((y60) this.f30477a).h();
        h.setText(str);
        return h;
    }

    @Override
    public a0.h K0() {
        return null;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) this.f30477a;
        m0Var.u1(i7, i10, z10);
        m0Var.dismiss();
    }

    @Override
    public void T(boolean z10) {
        ((ji.p) this.f30477a).setLanguagePillHidden(z10);
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
        bg0 bg0Var = ((eg0) this.f30477a).h.H0;
        if (bg0Var != null) {
            bg0Var.d();
        }
    }

    @Override
    public void W(RectF rectF) {
        rectF.set(((ji.p) this.f30477a).R);
    }

    @Override
    public void a(int i7, boolean z10) {
        g71 g71Var = (g71) this.f30477a;
        g71Var.E = z10;
        g71Var.d = i7;
        g71Var.G(1);
        g71Var.v(i7, z10);
        View[] viewArr = g71Var.f35378e;
        int i10 = 0;
        View view = viewArr[0];
        if (view != null) {
            i10 = view.getMeasuredWidth();
        }
        View view2 = viewArr[1];
        if (view2 != null) {
            if (z10) {
                g71Var.B(view2, i10);
            } else {
                g71Var.B(view2, -i10);
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        u7.x xVar = (u7.x) ((u7.k) obj).n();
        u7.f fVar = new u7.f(1, (TaskCompletionSource) obj2);
        Parcel p12 = xVar.p1();
        int i7 = u7.d.f58439a;
        p12.writeInt(1);
        ((j8.c) this.f30477a).writeToParcel(p12, 0);
        u7.d.c(p12, fVar);
        p12.writeString(null);
        xVar.t1(p12, 63);
    }

    @Override
    public boolean b() {
        g71 g71Var = (g71) this.f30477a;
        if (!g71Var.f35385y && !g71Var.I) {
            return true;
        }
        return false;
    }

    @Override
    public void c() {
        ((g71) this.f30477a).o();
    }

    @Override
    public boolean c1(String str, org.telegram.ui.j9 j9Var) {
        return false;
    }

    @Override
    public void d(ArrayList arrayList) {
        u30.a((u30) this.f30477a, false, arrayList);
    }

    @Override
    public a0.h d1() {
        return null;
    }

    @Override
    public void e(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f30477a;
        chatAttachAlertPhotoLayout.M = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.F.d1(true);
    }

    @Override
    public boolean f(int i7) {
        if (((ChatAttachAlertPhotoLayout) this.f30477a).H.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void g(float f10) {
        g71 g71Var = (g71) this.f30477a;
        View[] viewArr = g71Var.f35378e;
        if (f10 == 1.0f) {
            if (viewArr[1] != null) {
                g71Var.C();
                g71Var.h.put(g71Var.f35379f[1], viewArr[1]);
                g71Var.removeView(viewArr[1]);
                g71Var.B(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            g71Var.w(g71Var.f35376b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (g71Var.E) {
            g71Var.B(view, (1.0f - f10) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            g71Var.B(view2, (-view2.getMeasuredWidth()) * f10);
        } else {
            g71Var.B(view, (1.0f - f10) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            g71Var.B(view3, view3.getMeasuredWidth() * f10);
        }
        g71Var.t(false);
    }

    @Override
    public float get() {
        return ((tg.e2) this.f30477a).G;
    }

    @Override
    public float getBlurAngle() {
        return ((ff) this.f30477a).f23903t;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return ((ff) this.f30477a).f23902s;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return ((ff) this.f30477a).f23901r;
    }

    @Override
    public float getBlurExcludeSize() {
        return ((ff) this.f30477a).f23900q;
    }

    @Override
    public int getBlurType() {
        return ((ff) this.f30477a).f23897n;
    }

    @Override
    public CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        zs zsVar = (zs) this.f30477a;
        sb2.append((Object) zsVar.f30538a.getText());
        sb2.append(" ");
        sb2.append((Object) zsVar.f30539b.getText());
        return sb2.toString();
    }

    @Override
    public float getContrastValue() {
        return com.google.android.gms.internal.vision.e2.c(((ff) this.f30477a).d, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public float getEnhanceValue() {
        return ((ff) this.f30477a).f23886a / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return ((ff) this.f30477a).f23888c / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return ((ff) this.f30477a).f23891g / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (((ff) this.f30477a).f23896m / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(((ff) this.f30477a).f23893j, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public float getSaturationValue() {
        float f10 = ((ff) this.f30477a).f23890f / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(((ff) this.f30477a).f23894k, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return com.google.android.gms.internal.vision.e2.c(((ff) this.f30477a).f23898o, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return ((ff) this.f30477a).f23887b / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return ((ff) this.f30477a).f23892i;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (((ff) this.f30477a).f23892i == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return ((ff) this.f30477a).h;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (((ff) this.f30477a).h == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public float getVignetteValue() {
        return ((ff) this.f30477a).f23895l / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return ((ff) this.f30477a).f23889e / 100.0f;
    }

    @Override
    public boolean h(int i7) {
        y61 y61Var = ((g71) this.f30477a).M;
        if (y61Var == null) {
            return false;
        }
        return y61Var.c(i7);
    }

    @Override
    public void i() {
        ((vp0) this.f30477a).r0(null, true);
    }

    @Override
    public org.telegram.ui.ActionBar.z0 i0(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        y60 y60Var = (y60) this.f30477a;
        int y10 = y60Var.y();
        y60Var.c(i7, str, new di.p6(runnable, z11, y60Var, 25), z10);
        View x10 = y60Var.x(y10);
        if (x10 instanceof org.telegram.ui.ActionBar.z0) {
            return (org.telegram.ui.ActionBar.z0) x10;
        }
        return null;
    }

    @Override
    public ByteBuffer j() {
        ff ffVar = (ff) this.f30477a;
        ffVar.f23899p.q();
        return (ByteBuffer) ffVar.f23899p.f13733f;
    }

    @Override
    public void k(ArrayList arrayList) {
        y61 y61Var = ((g71) this.f30477a).M;
        if (y61Var == null) {
            return;
        }
        y61Var.a(arrayList);
    }

    @Override
    public ji.p k0() {
        return (ji.p) this.f30477a;
    }

    @Override
    public void l(View view, boolean z10) {
        if (z10 == ((ChatAttachAlertPhotoLayout) this.f30477a).L && (view instanceof s5)) {
            s5 s5Var = (s5) view;
            s5Var.f31765y.e(s5Var);
        }
    }

    @Override
    public boolean m(int i7) {
        ef M = ((ChatAttachAlertPhotoLayout) this.f30477a).H.M(i7);
        if (M != null && ChatAttachAlertPhotoLayout.f32764t1.containsKey(Integer.valueOf(M.C))) {
            return true;
        }
        return false;
    }

    @Override
    public void n(boolean z10, float f10) {
        float c10;
        zs zsVar = (zs) this.f30477a;
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
        zsVar.f30539b.setText(gd.a0("AutodownloadSizeLimitUpTo", null, 2131753770, org.telegram.messenger.g0.i0(j3, false, false)));
        zsVar.d = j3;
        s8[] s8VarArr = zsVar.h;
        AnimatorSet[] animatorSetArr = zsVar.f54583n;
        if (zsVar.f54581e == DataAutoDownloadActivity.o0(zsVar.f54584r)) {
            zsVar.f54582f.setText(gd.a0("AutoDownloadPreloadVideoInfo", null, 2131753808, org.telegram.messenger.g0.i0(j3, false, false)));
            if (i7 <= 2097152) {
                z11 = false;
            }
            if (z11 != s8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                s8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new y9(zsVar, 23));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f30477a;
        v0Var.y("scan_qr_popup_closed", null);
        v0Var.f53307i0 = false;
    }

    @Override
    public void p() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((u30) this.f30477a).f40195a.startActivityForResult(intent, 14);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public void r(int i7) {
        vo0 vo0Var = (vo0) this.f30477a;
        yo0 yo0Var = vo0Var.L;
        vo0Var.f40741s = i7;
        if (vo0Var.f40742w != i7) {
            vo0Var.d.clear();
        }
        int i10 = vo0Var.K;
        if (vo0Var.b() == 0 && !vo0Var.f40737e.e() && !vo0Var.J) {
            yo0Var.M1.e(false, true);
        } else {
            yo0Var.f42578t2.b(i10);
        }
        vo0Var.f();
        int i11 = yo0.U2;
        yo0Var.L0(true);
    }

    @Override
    public int r0() {
        return 0;
    }

    @Override
    public boolean s() {
        return !((ff) this.f30477a).f23899p.F();
    }

    public s0.c t(int i7) {
        return null;
    }

    public android.view.ViewGroup u(android.content.Context r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c5.u(android.content.Context, int):android.view.ViewGroup");
    }

    public String v(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            pa.d dVar = (pa.d) this.f30477a;
            pa.e eVar = new pa.e(stringWriter, dVar.f55506a, dVar.f55507b, dVar.f55508c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f55510b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public boolean v1(int i7) {
        if (i7 == ((vo0) this.f30477a).f40740r) {
            return true;
        }
        return false;
    }

    public s0.c w(int i7) {
        return null;
    }

    @Override
    public void y1(float f10) {
        ((tg.e2) this.f30477a).setOutlineWidth(f10);
    }

    public boolean z(int i7, int i10, Bundle bundle) {
        return false;
    }

    public c5(int i7) {
        switch (i7) {
            case 17:
                this.f30477a = new SparseArray();
                return;
            case 18:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f30477a = new nf0(this);
                    return;
                } else {
                    this.f30477a = new nf0(this);
                    return;
                }
            default:
                this.f30477a = new ConcurrentHashMap(16);
                return;
        }
    }

    public c5(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.f30477a = context;
    }

    public c5(int i7, int i10, int... iArr) {
        f50[] f50VarArr = new f50[(iArr.length / 2) + 1];
        this.f30477a = f50VarArr;
        f50 f50Var = new f50(i7, i10);
        int i11 = 0;
        f50VarArr[0] = f50Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((f50[]) this.f30477a)[i12] = new f50(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public c5(EditText editText) {
        this.f30477a = new ji.j(editText);
    }

    @Override
    public void P1(ArrayList arrayList) {
    }

    @Override
    public void S0(ur urVar) {
    }

    @Override
    public void C() {
    }

    @Override
    public void o() {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
