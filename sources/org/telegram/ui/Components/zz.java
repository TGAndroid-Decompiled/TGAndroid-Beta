package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public class zz implements x61, r0.o, androidx.activity.result.b, na0, f71, OnCompleteListener, pa.n, t5.a, tf.i1, com.google.android.gms.common.api.internal.s, ji, vh.h0, vh.q3, v4.f, io0 {
    public final int f31507a;
    public Object f31508b;

    public zz(Object obj, int i10) {
        this.f31507a = i10;
        this.f31508b = obj;
    }

    public static float[] F(ArrayList arrayList) {
        double d;
        double d10;
        float f10;
        double[] dArr;
        ArrayList arrayList2;
        float f11;
        float f12;
        int i10;
        float f13;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointF pointF = (PointF) arrayList.get(i11);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
        }
        int size2 = arrayList.size();
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            d = 1.0d;
            d10 = 6.0d;
            f10 = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i12 = 1;
            while (true) {
                i10 = size2 - 1;
                if (i12 >= i10) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i12 - 1);
                PointF pointF3 = (PointF) arrayList.get(i12);
                int i13 = i12 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i13);
                double[] dArr5 = dArr2[i12];
                float f14 = pointF3.x;
                double d14 = d12;
                double d15 = f14 - pointF2.x;
                dArr5[0] = d15 / 6.0d;
                float f15 = pointF4.x;
                dArr5[1] = (f15 - f13) / 3.0d;
                double d16 = f15 - f14;
                dArr5[2] = d16 / 6.0d;
                float f16 = pointF4.y;
                float f17 = pointF3.y;
                dArr3[i12] = ((f16 - f17) / d16) - ((f17 - pointF2.y) / d15);
                i12 = i13;
                d11 = d13;
                d12 = d14;
            }
            d = d11;
            double d17 = d12;
            d10 = 6.0d;
            f10 = 255.0f;
            dArr3[0] = d17;
            dArr3[i10] = d17;
            double[] dArr6 = dArr2[i10];
            dArr6[1] = d;
            dArr6[0] = d17;
            dArr6[2] = d17;
            for (int i14 = 1; i14 < size2; i14++) {
                double[] dArr7 = dArr2[i14];
                double d18 = dArr7[0];
                int i15 = i14 - 1;
                double[] dArr8 = dArr2[i15];
                double d19 = d18 / dArr8[1];
                dArr7[1] = dArr7[1] - (dArr8[2] * d19);
                dArr7[0] = d17;
                dArr3[i14] = dArr3[i14] - (d19 * dArr3[i15]);
            }
            for (int i16 = size2 - 2; i16 >= 0; i16--) {
                double[] dArr9 = dArr2[i16];
                double d20 = dArr9[2];
                int i17 = i16 + 1;
                double[] dArr10 = dArr2[i17];
                double d21 = d20 / dArr10[1];
                dArr9[1] = dArr9[1] - (dArr10[0] * d21);
                dArr9[2] = d17;
                dArr3[i16] = dArr3[i16] - (d21 * dArr3[i17]);
            }
            dArr = new double[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                dArr[i18] = dArr3[i18] / dArr2[i18][1];
            }
        }
        int length = dArr.length;
        if (length < 1) {
            arrayList2 = null;
            f11 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i19 = 0;
            while (i19 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i19);
                int i20 = i19 + 1;
                PointF pointF6 = (PointF) arrayList.get(i20);
                int i21 = (int) pointF5.x;
                while (true) {
                    float f18 = pointF6.x;
                    if (i21 < ((int) f18)) {
                        float f19 = i21;
                        PointF pointF7 = pointF5;
                        double d22 = f18 - pointF5.x;
                        double d23 = (f19 - f12) / d22;
                        double d24 = d - d23;
                        int i22 = length;
                        double[] dArr11 = dArr;
                        float f20 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i20]) + ((((d24 * d24) * d24) - d24) * dArr11[i19])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f20 > f10) {
                            f20 = 255.0f;
                        } else if (f20 < 0.0f) {
                            f20 = 0.0f;
                        }
                        arrayList2.add(new PointF(f19, f20));
                        i21++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i22;
                    }
                }
                i19 = i20;
            }
            f11 = 0.0f;
            arrayList2.add((PointF) kf.k0.i(1, arrayList));
        }
        float f21 = ((PointF) arrayList2.get(0)).x;
        if (f21 > f11) {
            for (int i23 = (int) f21; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f22 = ((PointF) kf.k0.i(1, arrayList2)).x;
        if (f22 < f10) {
            for (int i24 = ((int) f22) + 1; i24 <= 255; i24++) {
                arrayList2.add(new PointF(i24, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i25 = 0; i25 < size3; i25++) {
            PointF pointF8 = (PointF) arrayList2.get(i25);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i25] = sqrt;
        }
        return fArr;
    }

    @Override
    public void A() {
        vh.y1 y1Var = (vh.y1) this.f31508b;
        int i10 = 0;
        vh.y1.Z(y1Var, false, true);
        int i11 = y1Var.F0;
        if (i11 != 2) {
            i10 = i11;
        }
        y1Var.x0(i10, true);
    }

    @Override
    public p70 C(View view) {
        return p70.H((vh.y1) this.f31508b, view);
    }

    @Override
    public void C0(wg wgVar) {
        NotificationCenter.getInstance(uf.k.a0((uf.k) this.f31508b)).doOnIdle(wgVar);
    }

    @Override
    public void D() {
        vh.y1 y1Var = (vh.y1) this.f31508b;
        y1Var.z0();
        y1Var.C0();
    }

    public boolean G(int i10, int i11, Bundle bundle) {
        return false;
    }

    public JSONObject H() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f31508b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(i9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        i9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    i9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            i9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e6) {
            e = e6;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            i9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public a0.h H0() {
        return null;
    }

    public pa.i I(Object obj) {
        pa.g gVar = ((sa.a0) this.f31508b).f44232b;
        gVar.getClass();
        if (obj == null) {
            return pa.k.f41110a;
        }
        Class<?> cls = obj.getClass();
        sa.n nVar = new sa.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override
    public org.telegram.ui.Cells.l9 J0() {
        switch (this.f31507a) {
            case 21:
                vh.m3 m3Var = ((vh.y) this.f31508b).L;
                if (m3Var != null) {
                    return m3Var.f46100a.getTextSelectionHelper();
                }
                return null;
            default:
                vh.l3 l3Var = ((vh.p4) this.f31508b).K;
                if (l3Var != null) {
                    return l3Var.f46075a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void J1(ArrayList arrayList) {
        boolean z4;
        vn0 vn0Var = (vn0) this.f31508b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            vn0Var.G.add(((tf.h1) arrayList.get(i10)).f44805a);
        }
        org.telegram.ui.cy cyVar = vn0Var.R;
        if (cyVar != null) {
            if (vn0Var.A0 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            cyVar.d(z4, false);
        }
        vn0Var.l();
    }

    @Override
    public void L0(CharSequence charSequence) {
        switch (this.f31507a) {
            case 21:
                vh.m3 m3Var = ((vh.y) this.f31508b).L;
                if (m3Var != null) {
                    m3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        m3Var.f46100a.s4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                vh.l3 l3Var = ((vh.p4) this.f31508b).K;
                if (l3Var != null) {
                    l3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        l3Var.f46075a.s4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        hm0 hm0Var = (hm0) this.f31508b;
        hm0Var.v.setPadding(defaultWindowInsets.f7196a, defaultWindowInsets.f7197b, defaultWindowInsets.f7198c, defaultWindowInsets.d);
        hm0Var.f25454s.requestLayout();
        return r0.m1.f43153b;
    }

    @Override
    public org.telegram.ui.Cells.k9 O0() {
        switch (this.f31507a) {
            case 21:
                return (vh.y) this.f31508b;
            default:
                return (vh.p4) this.f31508b;
        }
    }

    @Override
    public vh.a T0() {
        switch (this.f31507a) {
            case 21:
                return ((vh.y) this.f31508b).f46414a;
            default:
                return ((vh.p4) this.f31508b).f46414a;
        }
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public boolean X1() {
        return false;
    }

    @Override
    public void Y(float f10, boolean z4) {
        zf.g gVar = (zf.g) this.f31508b;
        float f11 = gVar.f47490b;
        float w10 = e2.c.w(gVar.f47491c, f11, f10, f11);
        gVar.d = w10;
        if (z4) {
            m6 m6Var = gVar.e;
            m6Var.getClass();
            m6Var.b(null, w10);
        }
        gVar.invalidate();
    }

    @Override
    public boolean Y0() {
        switch (this.f31507a) {
            case 21:
                vh.y yVar = (vh.y) this.f31508b;
                vh.m3 m3Var = yVar.L;
                if (m3Var != null) {
                    vh.a aVar = yVar.f46414a;
                    if (m3Var.f46100a.R4()) {
                        return true;
                    }
                }
                return false;
            default:
                vh.p4 p4Var = (vh.p4) this.f31508b;
                vh.l3 l3Var = p4Var.K;
                if (l3Var != null) {
                    vh.a aVar2 = p4Var.f46414a;
                    if (l3Var.f46075a.R4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f31507a) {
            case 18:
                u5.r rVar = new u5.r(0, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((u5.t) obj).u();
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, rVar);
                M0.writeStringArray((String[]) this.f31508b);
                iVar.R0(M0, 5);
                return;
            case 19:
            default:
                w6.a aVar = new w6.a((TaskCompletionSource) obj2);
                w6.i iVar2 = (w6.i) ((w6.c) obj).u();
                String str = ((w6.b) this.f31508b).f46546k;
                Parcel I0 = iVar2.I0();
                int i10 = w6.f.f46550a;
                I0.writeStrongBinder(aVar);
                I0.writeString(str);
                iVar2.J0(I0, 2);
                return;
            case 20:
                v6.f fVar = new v6.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = e7.a.f5158a;
                obtain.writeStrongBinder(fVar);
                e7.a.b(obtain, (GetCredentialRequest) this.f31508b);
                e7.a.b(obtain, gVar);
                ((v6.b) ((v6.d) ((v6.e) obj).u())).E0(obtain, 1);
                return;
        }
    }

    @Override
    public boolean b(float f10) {
        boolean z4;
        vh.y1 y1Var = (vh.y1) this.f31508b;
        FrameLayout frameLayout = y1Var.f46398s0;
        if (frameLayout != null) {
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            if (f10 >= iArr[1]) {
                z4 = true;
                vh.y1.Z(y1Var, z4, true);
                return z4;
            }
        }
        z4 = false;
        vh.y1.Z(y1Var, z4, true);
        return z4;
    }

    @Override
    public void c(vh.e1 e1Var) {
        switch (this.f31507a) {
            case 21:
                vh.m3 m3Var = ((vh.y) this.f31508b).L;
                if (m3Var != null) {
                    vh.s3 s3Var = m3Var.f46100a;
                    vh.s3.L1(s3Var, e1Var);
                    s3Var.f46209e3.d(e1Var, true);
                    return;
                }
                return;
            default:
                vh.l3 l3Var = ((vh.p4) this.f31508b).K;
                if (l3Var != null) {
                    vh.s3 s3Var2 = l3Var.f46075a;
                    vh.s3.L1(s3Var2, e1Var);
                    s3Var2.f46209e3.d(e1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public int e(long j10) {
        return -1;
    }

    @Override
    public Paint.FontMetricsInt f() {
        return ((ph.k) this.f31508b).f41842f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void f1(int i10, int i11) {
        switch (this.f31507a) {
            case 21:
                vh.y yVar = (vh.y) this.f31508b;
                vh.m3 m3Var = yVar.L;
                if (m3Var != null) {
                    vh.a aVar = yVar.f46414a;
                    vh.d2 d2Var = m3Var.f46100a.G3;
                    if (d2Var != null) {
                        d2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                vh.p4 p4Var = (vh.p4) this.f31508b;
                vh.l3 l3Var = p4Var.K;
                if (l3Var != null) {
                    vh.a aVar2 = p4Var.f46414a;
                    vh.d2 d2Var2 = l3Var.f46075a.G3;
                    if (d2Var2 != null) {
                        d2Var2.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public s0.d g(int i10) {
        return null;
    }

    @Override
    public CharSequence getContentDescription() {
        zf.g gVar = (zf.g) this.f31508b;
        float f10 = gVar.f47490b;
        return String.valueOf(Math.round((gVar.f47489a.getProgress() * (gVar.f47491c - f10)) + f10));
    }

    @Override
    public long h(int i10) {
        return 0L;
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public void h2() {
        switch (this.f31507a) {
            case 21:
                vh.y yVar = (vh.y) this.f31508b;
                vh.m3 m3Var = yVar.L;
                if (m3Var != null) {
                    vh.a aVar = yVar.f46414a;
                    vh.s3.N1(m3Var.f46100a);
                    return;
                }
                return;
            default:
                vh.p4 p4Var = (vh.p4) this.f31508b;
                vh.l3 l3Var = p4Var.K;
                if (l3Var != null) {
                    vh.a aVar2 = p4Var.f46414a;
                    vh.s3.N1(l3Var.f46075a);
                    return;
                }
                return;
        }
    }

    public s0.d i(int i10) {
        return null;
    }

    @Override
    public void invalidate() {
        ((mg0) this.f31508b).h.invalidate();
    }

    @Override
    public int j0() {
        return 0;
    }

    @Override
    public void k(int i10) {
        boolean z4;
        vn0 vn0Var = (vn0) this.f31508b;
        vn0Var.A0--;
        vn0Var.f44954b0 = i10;
        if (vn0Var.f44956c0 != i10) {
            vn0Var.f44974s.clear();
        }
        if (vn0Var.f44957d0 != i10) {
            vn0Var.F.clear();
        }
        vn0Var.K = true;
        org.telegram.ui.cy cyVar = vn0Var.R;
        if (cyVar != null) {
            if (vn0Var.A0 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            cyVar.d(z4, true);
        }
        vn0Var.l();
        org.telegram.ui.cy cyVar2 = vn0Var.R;
        if (cyVar2 != null) {
            cyVar2.c();
        }
    }

    @Override
    public void l() {
        switch (this.f31507a) {
            case 21:
                vh.y yVar = (vh.y) this.f31508b;
                vh.m3 m3Var = yVar.L;
                if (m3Var != null) {
                    vh.s3.O1(m3Var.f46100a, yVar.f46414a);
                    return;
                }
                return;
            default:
                vh.p4 p4Var = (vh.p4) this.f31508b;
                vh.l3 l3Var = p4Var.K;
                if (l3Var != null) {
                    vh.s3.O1(l3Var.f46075a, p4Var.f46414a);
                    return;
                }
                return;
        }
    }

    @Override
    public void m(vh.p3 p3Var, View view) {
        vh.y1 y1Var = (vh.y1) this.f31508b;
        p70 H = p70.H(y1Var, view);
        H.Q = true;
        y1Var.f46400u0 = vh.e4.c(H, y1Var, y1Var.getParentActivity(), y1Var.getResourceProvider(), p3Var, false);
    }

    @Override
    public void n(int i10) {
        ((vh.y1) this.f31508b).o0(74, i10);
    }

    @Override
    public void o() {
        int i10;
        vh.y1 y1Var = (vh.y1) this.f31508b;
        vh.g3 g3Var = y1Var.M.f46221k3;
        if (g3Var != null && g3Var.y() && y1Var.M.B4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        y1Var.x0(i10, true);
        y1Var.y0();
        y1Var.w0();
    }

    @Override
    public void onComplete(Task task) {
        r5.c.h((r5.c) ((r5.j) this.f31508b).f43397c, "joinApplication", task);
    }

    @Override
    public void onContentChanged() {
        vh.y1 y1Var = (vh.y1) this.f31508b;
        if (y1Var.f46401v0 != null) {
            boolean l32 = y1Var.M.l3();
            y1Var.I0 = l32;
            y1Var.f46401v0.h(l32);
            y1Var.f46401v0.invalidate();
        }
        y1Var.C0();
        Runnable runnable = y1Var.J0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        ph.k5 k5Var = (ph.k5) this.f31508b;
        ph.i5 i5Var = k5Var.I;
        AndroidUtilities.cancelRunOnUIThread(i5Var);
        i71 i71Var = k5Var.f41920y;
        if (i71Var != null && i71Var.y()) {
            AndroidUtilities.runOnUIThread(i5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((ph.k5) this.f31508b).i();
    }

    @Override
    public void p(Bitmap bitmap) {
        ((t5.h) this.f31508b).e(bitmap, 3);
    }

    @Override
    public List q(long j10) {
        return (List) this.f31508b;
    }

    @Override
    public int r() {
        return 1;
    }

    @Override
    public void s() {
        vh.y1 y1Var = (vh.y1) this.f31508b;
        y1Var.F0 = y1Var.H0;
        vh.y1.Z(y1Var, false, false);
        y1Var.x0(2, true);
    }

    @Override
    public void s1() {
        switch (this.f31507a) {
            case 21:
                vh.y yVar = (vh.y) this.f31508b;
                vh.m3 m3Var = yVar.L;
                if (m3Var != null) {
                    vh.a aVar = yVar.f46414a;
                    vh.s3 s3Var = m3Var.f46100a;
                    vh.d2 d2Var = s3Var.G3;
                    if (d2Var != null) {
                        d2Var.g();
                    }
                    s3Var.f46209e3.onContentChanged();
                    return;
                }
                return;
            default:
                vh.p4 p4Var = (vh.p4) this.f31508b;
                vh.l3 l3Var = p4Var.K;
                if (l3Var != null) {
                    vh.a aVar2 = p4Var.f46414a;
                    vh.s3 s3Var2 = l3Var.f46075a;
                    vh.d2 d2Var2 = s3Var2.G3;
                    if (d2Var2 != null) {
                        d2Var2.g();
                    }
                    s3Var2.f46209e3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public void t(vh.w5 w5Var, String str) {
        vh.y1 y1Var = (vh.y1) this.f31508b;
        if (y1Var.f46403w0 == null) {
            y1Var.f46403w0 = new m.s3(new ph.z8(this, 13), y1Var.getResourceProvider());
        }
        y1Var.f46403w0.f(w5Var, str);
    }

    @Override
    public boolean t1(int i10) {
        if (i10 == ((vn0) this.f31508b).f44953a0) {
            return true;
        }
        return false;
    }

    @Override
    public void v(int i10, int i11, CharSequence charSequence, boolean z4) {
        ph.f fVar = ((ph.k) this.f31508b).f41842f;
        if (fVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z4) {
                Emoji.replaceEmoji(spannableStringBuilder, fVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            fVar.setText(spannableStringBuilder);
            fVar.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void w(vh.r3 r3Var, View view) {
        vh.y1 y1Var = (vh.y1) this.f31508b;
        p70 H = p70.H(y1Var, view);
        H.Q = true;
        y1Var.getParentActivity();
        y1Var.getResourceProvider();
        y1Var.f46400u0 = vh.e4.b(H, y1Var, r3Var, false);
    }

    @Override
    public void x(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f31508b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f345b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f41015a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.J;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f344a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void z(vh.a aVar) {
        vh.y1 y1Var = (vh.y1) this.f31508b;
        if (aVar != null && (aVar.f45853b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(y1Var)) {
            li liVar = new li(y1Var.getParentActivity(), y1Var, false, false, false, y1Var.getResourceProvider());
            liVar.W1 = new cb.b(24);
            liVar.M = true;
            liVar.f26742u1.setVisibility(8);
            liVar.f26729q2 = new ph.l1(y1Var, aVar, liVar, 6);
            liVar.r1();
            liVar.show();
        }
    }

    public zz(u5.s sVar, String[] strArr) {
        this.f31507a = 18;
        this.f31508b = strArr;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public zz(n9.b bVar) {
        this.f31507a = 5;
        this.f31508b = new File(bVar.f14847b, "com.crashlytics.settings.json");
    }

    public zz(int i10) {
        this.f31507a = i10;
        switch (i10) {
            case 13:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f31508b = new gh0(this);
                    return;
                } else {
                    this.f31508b = new gh0(this);
                    return;
                }
            case 14:
            default:
                return;
            case 15:
                this.f31508b = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    public zz(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f31507a = 9;
        this.f31508b = new GestureDetector(context, onGestureListener, null);
    }

    public zz(TextView textView) {
        this.f31507a = 8;
        this.f31508b = new q1.g(textView);
    }

    @Override
    public void B() {
    }

    @Override
    public void E(String str) {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void Z0(Object obj) {
    }

    @Override
    public void o1(TLRPC.User user) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void u() {
    }

    @Override
    public void y(int i10) {
    }

    @Override
    public void z0() {
    }

    @Override
    public void d(vh.e1 e1Var, boolean z4) {
    }

    @Override
    public void onError(i71 i71Var, Exception exc) {
    }

    @Override
    public void a(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
    }

    @Override
    public void j(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override
    public void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
