package org.telegram.ui.Cells;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
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
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.z50;
import org.telegram.ui.zx;
public class f1 implements x61, org.telegram.ui.Components.y4, ma0, r0.o, androidx.activity.result.b, f71, OnCompleteListener, ra.m, pa.n, t5.a, tf.j1, com.google.android.gms.common.api.internal.s, vh.g0, vh.p3 {
    public final int f21044a;
    public Object f21045b;

    public f1(Object obj, int i10) {
        this.f21044a = i10;
        this.f21045b = obj;
    }

    public static float[] G(ArrayList arrayList) {
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
            arrayList2.add((PointF) kh.a2.i(1, arrayList));
        }
        float f21 = ((PointF) arrayList2.get(0)).x;
        if (f21 > f11) {
            for (int i23 = (int) f21; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f22 = ((PointF) kh.a2.i(1, arrayList2)).x;
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

    public static f1 K(float f10, int i10) {
        boolean z4;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f10);
        int i12 = (int) (point.y * f10);
        if (i11 == i12) {
            return new f1(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new f1(i11, i12, new int[]{i12, i11});
        }
        boolean z10 = true;
        if (i10 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i11 >= i12) {
            z10 = false;
        }
        if (z4 == z10) {
            return new f1(i11, i12, new int[0]);
        }
        return new f1(i12, i11, new int[0]);
    }

    @Override
    public void A(vh.a aVar) {
        vh.y1 y1Var = (vh.y1) this.f21045b;
        if (aVar != null && (aVar.f45775b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(y1Var)) {
            li liVar = new li(y1Var.getParentActivity(), y1Var, false, false, false, y1Var.getResourceProvider());
            liVar.W1 = new db.a(24);
            liVar.M = true;
            liVar.f26746u1.setVisibility(8);
            liVar.f26733q2 = new ph.m1(y1Var, aVar, liVar, 6);
            liVar.r1();
            liVar.show();
        }
    }

    @Override
    public void B() {
        vh.y1 y1Var = (vh.y1) this.f21045b;
        int i10 = 0;
        vh.y1.Z(y1Var, false, true);
        int i11 = y1Var.F0;
        if (i11 != 2) {
            i10 = i11;
        }
        y1Var.x0(i10, true);
    }

    @Override
    public o70 C(View view) {
        return o70.H((vh.y1) this.f21045b, view);
    }

    public s0.e D(int i10) {
        return null;
    }

    @Override
    public vh.a E() {
        switch (this.f21044a) {
            case 26:
                return ((vh.x) this.f21045b).f46283a;
            default:
                return ((vh.o4) this.f21045b).f46283a;
        }
    }

    public s0.e F(int i10) {
        return null;
    }

    @Override
    public void H() {
        vh.y1 y1Var = (vh.y1) this.f21045b;
        y1Var.z0();
        y1Var.C0();
    }

    @Override
    public a0.h I() {
        switch (this.f21044a) {
            case 22:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        ((ChatActivityEnterView) this.f21045b).T0(i10, z4, 0, true, 0L);
    }

    @Override
    public boolean L() {
        switch (this.f21044a) {
            case 26:
                vh.x xVar = (vh.x) this.f21045b;
                vh.l3 l3Var = xVar.L;
                if (l3Var != null) {
                    vh.a aVar = xVar.f46283a;
                    if (l3Var.f46003a.S4()) {
                        return true;
                    }
                }
                return false;
            default:
                vh.o4 o4Var = (vh.o4) this.f21045b;
                vh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    vh.a aVar2 = o4Var.f46283a;
                    if (k3Var.f45978a.S4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void M(int i10, int i11) {
        switch (this.f21044a) {
            case 26:
                vh.x xVar = (vh.x) this.f21045b;
                vh.l3 l3Var = xVar.L;
                if (l3Var != null) {
                    vh.a aVar = xVar.f46283a;
                    vh.c2 c2Var = l3Var.f46003a.G3;
                    if (c2Var != null) {
                        c2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                vh.o4 o4Var = (vh.o4) this.f21045b;
                vh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    vh.a aVar2 = o4Var.f46283a;
                    vh.c2 c2Var2 = k3Var.f45978a.G3;
                    if (c2Var2 != null) {
                        c2Var2.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        im0 im0Var = (im0) this.f21045b;
        im0Var.v.setPadding(defaultWindowInsets.f7213a, defaultWindowInsets.f7214b, defaultWindowInsets.f7215c, defaultWindowInsets.d);
        im0Var.f25752s.requestLayout();
        return r0.m1.f43129b;
    }

    @Override
    public void P() {
        switch (this.f21044a) {
            case 26:
                vh.x xVar = (vh.x) this.f21045b;
                vh.l3 l3Var = xVar.L;
                if (l3Var != null) {
                    vh.a aVar = xVar.f46283a;
                    vh.r3 r3Var = l3Var.f46003a;
                    vh.c2 c2Var = r3Var.G3;
                    if (c2Var != null) {
                        c2Var.g();
                    }
                    r3Var.f46112e3.onContentChanged();
                    return;
                }
                return;
            default:
                vh.o4 o4Var = (vh.o4) this.f21045b;
                vh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    vh.a aVar2 = o4Var.f46283a;
                    vh.r3 r3Var2 = k3Var.f45978a;
                    vh.c2 c2Var2 = r3Var2.G3;
                    if (c2Var2 != null) {
                        c2Var2.g();
                    }
                    r3Var2.f46112e3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean Q(int i10) {
        switch (this.f21044a) {
            case 22:
                if (i10 == ((wn0) this.f21045b).f44891a0) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public boolean S(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public void T(ArrayList arrayList) {
        boolean z4;
        switch (this.f21044a) {
            case 22:
                wn0 wn0Var = (wn0) this.f21045b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    wn0Var.G.add(((tf.i1) arrayList.get(i10)).f44755a);
                }
                zx zxVar = wn0Var.R;
                if (zxVar != null) {
                    if (wn0Var.A0 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zxVar.d(z4, false);
                }
                wn0Var.l();
                return;
            default:
                return;
        }
    }

    public JSONObject U() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f21045b;
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

    public pa.i X(Object obj) {
        pa.g gVar = ((sa.a0) this.f21045b).f44167b;
        gVar.getClass();
        if (obj == null) {
            return pa.k.f41087a;
        }
        Class<?> cls = obj.getClass();
        sa.n nVar = new sa.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override
    public void a(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
        int i11 = this.f21044a;
    }

    @Override
    public void a0() {
        switch (this.f21044a) {
            case 26:
                vh.x xVar = (vh.x) this.f21045b;
                vh.l3 l3Var = xVar.L;
                if (l3Var != null) {
                    vh.a aVar = xVar.f46283a;
                    vh.r3.O1(l3Var.f46003a);
                    return;
                }
                return;
            default:
                vh.o4 o4Var = (vh.o4) this.f21045b;
                vh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    vh.a aVar2 = o4Var.f46283a;
                    vh.r3.O1(k3Var.f45978a);
                    return;
                }
                return;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f21044a) {
            case 23:
                u5.r rVar = new u5.r(0, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((u5.t) obj).u();
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, rVar);
                M0.writeStringArray((String[]) this.f21045b);
                iVar.R0(M0, 5);
                return;
            default:
                w6.a aVar = new w6.a((TaskCompletionSource) obj2);
                w6.i iVar2 = (w6.i) ((w6.c) obj).u();
                String str = ((w6.b) this.f21045b).f46464k;
                Parcel I0 = iVar2.I0();
                int i10 = w6.f.f46468a;
                I0.writeStrongBinder(aVar);
                I0.writeString(str);
                iVar2.J0(I0, 2);
                return;
        }
    }

    @Override
    public boolean b(float f10) {
        boolean z4;
        vh.y1 y1Var = (vh.y1) this.f21045b;
        FrameLayout frameLayout = y1Var.f46313s0;
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
    public void c(vh.d1 d1Var) {
        switch (this.f21044a) {
            case 26:
                vh.l3 l3Var = ((vh.x) this.f21045b).L;
                if (l3Var != null) {
                    vh.r3 r3Var = l3Var.f46003a;
                    vh.r3.M1(r3Var, d1Var);
                    r3Var.f46112e3.e(d1Var, true);
                    return;
                }
                return;
            default:
                vh.k3 k3Var = ((vh.o4) this.f21045b).K;
                if (k3Var != null) {
                    vh.r3 r3Var2 = k3Var.f45978a;
                    vh.r3.M1(r3Var2, d1Var);
                    r3Var2.f46112e3.e(d1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public Paint.FontMetricsInt d() {
        switch (this.f21044a) {
            case 3:
                return ((li) this.f21045b).B0.getEditText().getPaint().getFontMetricsInt();
            default:
                return ((ph.k) this.f21045b).f41809f.getEditText().getPaint().getFontMetricsInt();
        }
    }

    @Override
    public void f(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f21045b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f330b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f40993a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.J;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f329a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void g(int i10) {
        boolean z4;
        switch (this.f21044a) {
            case 22:
                wn0 wn0Var = (wn0) this.f21045b;
                wn0Var.A0--;
                wn0Var.f44892b0 = i10;
                if (wn0Var.f44894c0 != i10) {
                    wn0Var.f44912s.clear();
                }
                if (wn0Var.f44895d0 != i10) {
                    wn0Var.F.clear();
                }
                wn0Var.K = true;
                zx zxVar = wn0Var.R;
                if (zxVar != null) {
                    if (wn0Var.A0 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zxVar.d(z4, true);
                }
                wn0Var.l();
                zx zxVar2 = wn0Var.R;
                if (zxVar2 != null) {
                    zxVar2.c();
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new ph.ga(this, 19));
                return;
        }
    }

    @Override
    public void h() {
        switch (this.f21044a) {
            case 26:
                vh.x xVar = (vh.x) this.f21045b;
                vh.l3 l3Var = xVar.L;
                if (l3Var != null) {
                    vh.r3.P1(l3Var.f46003a, xVar.f46283a);
                    return;
                }
                return;
            default:
                vh.o4 o4Var = (vh.o4) this.f21045b;
                vh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    vh.r3.P1(k3Var.f45978a, o4Var.f46283a);
                    return;
                }
                return;
        }
    }

    @Override
    public void i(TLRPC.TL_document tL_document, String str, Object obj) {
        int i10 = this.f21044a;
    }

    @Override
    public void invalidate() {
        switch (this.f21044a) {
            case 0:
                ((t1) ((g1) this.f21045b).f21083b).invalidate();
                return;
            default:
                ((lg0) this.f21045b).h.invalidate();
                return;
        }
    }

    @Override
    public void j(int i10, int i11, CharSequence charSequence, boolean z4) {
        switch (this.f21044a) {
            case 3:
                li liVar = (li) this.f21045b;
                if (liVar.m1() != null) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(liVar.m1().getText());
                        spannableStringBuilder.replace(i10, i11 + i10, charSequence);
                        if (z4) {
                            Emoji.replaceEmoji(spannableStringBuilder, liVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
                        }
                        liVar.m1().setText(spannableStringBuilder);
                        liVar.m1().setSelection(i10 + charSequence.length());
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                ph.f fVar = ((ph.k) this.f21045b).f41809f;
                if (fVar != null) {
                    try {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(fVar.getText());
                        spannableStringBuilder2.replace(i10, i11 + i10, charSequence);
                        if (z4) {
                            Emoji.replaceEmoji(spannableStringBuilder2, fVar.getEditText().getPaint().getFontMetricsInt(), false);
                        }
                        fVar.setText(spannableStringBuilder2);
                        fVar.setSelection(i10 + charSequence.length());
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void k(String str) {
        int i10 = this.f21044a;
    }

    @Override
    public void l(vh.o3 o3Var, View view) {
        vh.y1 y1Var = (vh.y1) this.f21045b;
        o70 H = o70.H(y1Var, view);
        H.Q = true;
        y1Var.f46315u0 = vh.d4.c(H, y1Var, y1Var.getParentActivity(), y1Var.getResourceProvider(), o3Var, false);
    }

    @Override
    public void m(int i10) {
        ((vh.y1) this.f21045b).o0(74, i10);
    }

    @Override
    public void n() {
        int i10;
        vh.y1 y1Var = (vh.y1) this.f21045b;
        vh.f3 f3Var = y1Var.M.f46124k3;
        if (f3Var != null && f3Var.y() && y1Var.M.C4()) {
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
        switch (this.f21044a) {
            case 16:
                r5.c.h((r5.c) ((r5.j) this.f21045b).f43373c, "joinApplication", task);
                return;
            default:
                ld.m mVar = (ld.m) this.f21045b;
                Exception exception = task.getException();
                if (exception == null) {
                    if (task.isCanceled()) {
                        mVar.n(null);
                        return;
                    } else {
                        mVar.resumeWith(task.getResult());
                        return;
                    }
                }
                mVar.resumeWith(k7.p7.a(exception));
                return;
        }
    }

    @Override
    public void onContentChanged() {
        vh.y1 y1Var = (vh.y1) this.f21045b;
        if (y1Var.f46316v0 != null) {
            boolean m32 = y1Var.M.m3();
            y1Var.I0 = m32;
            y1Var.f46316v0.h(m32);
            y1Var.f46316v0.invalidate();
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
        ph.l5 l5Var = (ph.l5) this.f21045b;
        ph.i5 i5Var = l5Var.I;
        AndroidUtilities.cancelRunOnUIThread(i5Var);
        i71 i71Var = l5Var.f41910y;
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
        ((ph.l5) this.f21045b).i();
    }

    @Override
    public void p(Bitmap bitmap) {
        ((t5.h) this.f21045b).e(bitmap, 3);
    }

    @Override
    public void q() {
        vh.y1 y1Var = (vh.y1) this.f21045b;
        y1Var.F0 = y1Var.H0;
        vh.y1.Z(y1Var, false, false);
        y1Var.x0(2, true);
    }

    @Override
    public void s(vh.v5 v5Var, String str) {
        vh.y1 y1Var = (vh.y1) this.f21045b;
        if (y1Var.f46318w0 == null) {
            y1Var.f46318w0 = new m.s3(new rh.e(this, 10), y1Var.getResourceProvider());
        }
        y1Var.f46318w0.f(v5Var, str);
    }

    @Override
    public Object s2() {
        Class cls = (Class) this.f21045b;
        try {
            return ra.r.f43434a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    @Override
    public a0.h t() {
        switch (this.f21044a) {
            case 22:
                return null;
            default:
                return null;
        }
    }

    @Override
    public m9 u() {
        switch (this.f21044a) {
            case 26:
                vh.l3 l3Var = ((vh.x) this.f21045b).L;
                if (l3Var != null) {
                    return l3Var.f46003a.getTextSelectionHelper();
                }
                return null;
            default:
                vh.k3 k3Var = ((vh.o4) this.f21045b).K;
                if (k3Var != null) {
                    return k3Var.f45978a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void w(vh.q3 q3Var, View view) {
        vh.y1 y1Var = (vh.y1) this.f21045b;
        o70 H = o70.H(y1Var, view);
        H.Q = true;
        y1Var.getParentActivity();
        y1Var.getResourceProvider();
        y1Var.f46315u0 = vh.d4.b(H, y1Var, q3Var, false);
    }

    @Override
    public void y(CharSequence charSequence) {
        switch (this.f21044a) {
            case 26:
                vh.l3 l3Var = ((vh.x) this.f21045b).L;
                if (l3Var != null) {
                    l3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        l3Var.f46003a.t4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                vh.k3 k3Var = ((vh.o4) this.f21045b).K;
                if (k3Var != null) {
                    k3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        k3Var.f45978a.t4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public l9 z() {
        switch (this.f21044a) {
            case 26:
                return (vh.x) this.f21045b;
            default:
                return (vh.o4) this.f21045b;
        }
    }

    public f1(u5.s sVar, String[] strArr) {
        this.f21044a = 23;
        this.f21045b = strArr;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public f1(n9.b bVar) {
        this.f21044a = 9;
        this.f21045b = new File(bVar.f14862b, "com.crashlytics.settings.json");
    }

    public f1(int i10) {
        this.f21044a = i10;
        switch (i10) {
            case 18:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f21045b = new fh0(this);
                    return;
                } else {
                    this.f21045b = new fh0(this);
                    return;
                }
            case 19:
            default:
                return;
            case 20:
                this.f21045b = new LinkedHashMap(5, 1.0f, false);
                return;
        }
    }

    public f1(int i10, int i11, int[] iArr) {
        this.f21044a = 1;
        z50[] z50VarArr = new z50[(iArr.length / 2) + 1];
        this.f21045b = z50VarArr;
        z50 z50Var = new z50(i10, i11);
        int i12 = 0;
        z50VarArr[0] = z50Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((z50[]) this.f21045b)[i13] = new z50(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public f1(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f21044a = 13;
        this.f21045b = new GestureDetector(context, onGestureListener, null);
    }

    public f1(TextView textView) {
        this.f21044a = 12;
        this.f21045b = new q1.g(textView);
    }

    private final void N(ArrayList arrayList) {
    }

    private final void o(String str) {
    }

    private final void r(String str) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void v() {
    }

    @Override
    public void x(int i10) {
    }

    @Override
    public void e(vh.d1 d1Var, boolean z4) {
    }

    @Override
    public void onError(i71 i71Var, Exception exc) {
    }

    private final void O(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    private final void R(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    private final void V(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
    }

    private final void W(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
