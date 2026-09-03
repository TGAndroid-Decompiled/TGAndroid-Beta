package org.telegram.ui.Cells;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.y61;
public class f1 implements y61, org.telegram.ui.Components.y4, oa0, r0.o, androidx.activity.result.b, eg.q2, OnCompleteListener, ra.m, pa.n, o4.m0, com.google.android.gms.common.api.internal.s, uf.j1, wh.h0, wh.p3 {
    public final int f22789a;
    public Object f22790b;

    public f1(Object obj, int i10) {
        this.f22789a = i10;
        this.f22790b = obj;
    }

    public static float[] r(ArrayList arrayList) {
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
            arrayList2.add((PointF) l.d.i(1, arrayList));
        }
        float f21 = ((PointF) arrayList2.get(0)).x;
        if (f21 > f11) {
            for (int i23 = (int) f21; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f22 = ((PointF) l.d.i(1, arrayList2)).x;
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

    public static f1 t(float f10, int i10) {
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
    public void B(CharSequence charSequence) {
        switch (this.f22789a) {
            case 26:
                wh.l3 l3Var = ((wh.y) this.f22790b).L;
                if (l3Var != null) {
                    l3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        l3Var.f49900a.s4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                wh.k3 k3Var = ((wh.o4) this.f22790b).K;
                if (k3Var != null) {
                    k3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        k3Var.f49864a.s4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public boolean D(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public l9 E() {
        switch (this.f22789a) {
            case 26:
                return (wh.y) this.f22790b;
            default:
                return (wh.o4) this.f22790b;
        }
    }

    @Override
    public void F(wh.v5 v5Var, String str) {
        wh.z1 z1Var = (wh.z1) this.f22790b;
        if (z1Var.f50248w0 == null) {
            z1Var.f50248w0 = new m.r3(new sf.h(this, 14), z1Var.getResourceProvider());
        }
        z1Var.f50248w0.f(v5Var, str);
    }

    @Override
    public wh.a G() {
        switch (this.f22789a) {
            case 26:
                return ((wh.y) this.f22790b).f50211a;
            default:
                return ((wh.o4) this.f22790b).f50211a;
        }
    }

    @Override
    public void H(float f10) {
        qh.e9 e9Var = (qh.e9) this.f22790b;
        dg.e1.e(e9Var.C1).k(String.valueOf(dg.m.f4581a.indexOf(e9Var.L0.getCurrentBrush())), f10);
        dg.e2 e2Var = e9Var.f44966x1;
        e2Var.f4526c = f10;
        e9Var.E0(e2Var, null, false);
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        ((ChatActivityEnterView) this.f22790b).T0(i10, z4, 0, true, 0L);
    }

    @Override
    public void J() {
        wh.z1 z1Var = (wh.z1) this.f22790b;
        int i10 = 0;
        wh.z1.Z(z1Var, false, true);
        int i11 = z1Var.F0;
        if (i11 != 2) {
            i10 = i11;
        }
        z1Var.x0(i10, true);
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public boolean L() {
        switch (this.f22789a) {
            case 26:
                wh.y yVar = (wh.y) this.f22790b;
                wh.l3 l3Var = yVar.L;
                if (l3Var != null) {
                    wh.a aVar = yVar.f50211a;
                    if (l3Var.f49900a.R4()) {
                        return true;
                    }
                }
                return false;
            default:
                wh.o4 o4Var = (wh.o4) this.f22790b;
                wh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    wh.a aVar2 = o4Var.f50211a;
                    if (k3Var.f49864a.R4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void M(int i10, int i11) {
        switch (this.f22789a) {
            case 26:
                wh.y yVar = (wh.y) this.f22790b;
                wh.l3 l3Var = yVar.L;
                if (l3Var != null) {
                    wh.a aVar = yVar.f50211a;
                    wh.d2 d2Var = l3Var.f49900a.G3;
                    if (d2Var != null) {
                        d2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                wh.o4 o4Var = (wh.o4) this.f22790b;
                wh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    wh.a aVar2 = o4Var.f50211a;
                    wh.d2 d2Var2 = k3Var.f49864a.G3;
                    if (d2Var2 != null) {
                        d2Var2.f(i10, i11);
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
        im0 im0Var = (im0) this.f22790b;
        im0Var.v.setPadding(defaultWindowInsets.f7757a, defaultWindowInsets.f7758b, defaultWindowInsets.f7759c, defaultWindowInsets.d);
        im0Var.f27864s.requestLayout();
        return r0.m1.f46482b;
    }

    public JSONObject O() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f22790b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(i9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e6) {
                        e = e6;
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
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            i9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public q70 P(View view) {
        return q70.H((wh.z1) this.f22790b, view);
    }

    @Override
    public void Q() {
        switch (this.f22789a) {
            case 26:
                wh.y yVar = (wh.y) this.f22790b;
                wh.l3 l3Var = yVar.L;
                if (l3Var != null) {
                    wh.a aVar = yVar.f50211a;
                    wh.r3 r3Var = l3Var.f49900a;
                    wh.d2 d2Var = r3Var.G3;
                    if (d2Var != null) {
                        d2Var.g();
                    }
                    r3Var.f50016e3.onContentChanged();
                    return;
                }
                return;
            default:
                wh.o4 o4Var = (wh.o4) this.f22790b;
                wh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    wh.a aVar2 = o4Var.f50211a;
                    wh.r3 r3Var2 = k3Var.f49864a;
                    wh.d2 d2Var2 = r3Var2.G3;
                    if (d2Var2 != null) {
                        d2Var2.g();
                    }
                    r3Var2.f50016e3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean R(int i10) {
        return true;
    }

    @Override
    public void S() {
        wh.z1 z1Var = (wh.z1) this.f22790b;
        z1Var.z0();
        z1Var.C0();
    }

    public pa.i T(Object obj) {
        pa.g gVar = ((sa.a0) this.f22790b).f47184b;
        gVar.getClass();
        if (obj == null) {
            return pa.k.f44277a;
        }
        Class<?> cls = obj.getClass();
        sa.n nVar = new sa.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override
    public void U(int i10, int i11, CharSequence charSequence, boolean z4) {
        mi miVar = (mi) this.f22790b;
        if (miVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(miVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z4) {
                Emoji.replaceEmoji(spannableStringBuilder, miVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            miVar.m1().setText(spannableStringBuilder);
            miVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public void W() {
        switch (this.f22789a) {
            case 26:
                wh.y yVar = (wh.y) this.f22790b;
                wh.l3 l3Var = yVar.L;
                if (l3Var != null) {
                    wh.a aVar = yVar.f50211a;
                    wh.r3.N1(l3Var.f49900a);
                    return;
                }
                return;
            default:
                wh.o4 o4Var = (wh.o4) this.f22790b;
                wh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    wh.a aVar2 = o4Var.f50211a;
                    wh.r3.N1(k3Var.f49864a);
                    return;
                }
                return;
        }
    }

    public float Y(int i10, int i11, int i12, int i13) {
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        int i21 = 1;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i22 = (-abs) / 2;
        int i23 = -1;
        if (i14 < i16) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i15 < i17) {
            i23 = 1;
        }
        int i24 = i16 + i18;
        int i25 = i14;
        int i26 = i15;
        int i27 = 0;
        while (i25 != i24) {
            if (z4) {
                i19 = i26;
            } else {
                i19 = i25;
            }
            if (z4) {
                i20 = i25;
            } else {
                i20 = i26;
            }
            boolean z11 = z4;
            if (i27 == i21) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i28 = abs;
            if (z10 == ((pb.b) this.f22790b).b(i19, i20)) {
                if (i27 == 2) {
                    return k7.o6.b(i25, i26, i14, i15);
                }
                i27++;
            }
            i22 += abs2;
            if (i22 > 0) {
                if (i26 == i17) {
                    break;
                }
                i26 += i23;
                i22 -= i28;
            }
            i25 += i18;
            abs = i28;
            z4 = z11;
            i21 = 1;
        }
        if (i27 == 2) {
            return k7.o6.b(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    public float Z(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        pb.b bVar = (pb.b) this.f22790b;
        float Y = Y(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f44286a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f10 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f10 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f10));
        if (i18 < 0) {
            f11 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.f44287b;
            if (i18 >= i19) {
                f11 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f11 = 1.0f;
            }
        }
        return (Y(i10, i11, (int) (((i14 - i10) * f11) + i10), i15) + Y) - 1.0f;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f22789a) {
            case 23:
                v6.f fVar = new v6.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = e7.a.f4991a;
                obtain.writeStrongBinder(fVar);
                e7.a.b(obtain, (GetCredentialRequest) this.f22790b);
                e7.a.b(obtain, gVar);
                ((v6.b) ((v6.d) ((v6.e) obj).u())).E0(obtain, 1);
                return;
            default:
                o5.l lVar = new o5.l((TaskCompletionSource) obj2);
                w6.i iVar = (w6.i) ((w6.c) obj).u();
                Parcel I0 = iVar.I0();
                int i11 = w6.f.f49478a;
                I0.writeStrongBinder(lVar);
                w6.f.c(I0, (l5.e) this.f22790b);
                iVar.J0(I0, 1);
                return;
        }
    }

    @Override
    public boolean b(float f10) {
        boolean z4;
        wh.z1 z1Var = (wh.z1) this.f22790b;
        FrameLayout frameLayout = z1Var.f50243s0;
        if (frameLayout != null) {
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            if (f10 >= iArr[1]) {
                z4 = true;
                wh.z1.Z(z1Var, z4, true);
                return z4;
            }
        }
        z4 = false;
        wh.z1.Z(z1Var, z4, true);
        return z4;
    }

    @Override
    public void c(wh.e1 e1Var) {
        switch (this.f22789a) {
            case 26:
                wh.l3 l3Var = ((wh.y) this.f22790b).L;
                if (l3Var != null) {
                    wh.r3 r3Var = l3Var.f49900a;
                    wh.r3.L1(r3Var, e1Var);
                    r3Var.f50016e3.h(e1Var, true);
                    return;
                }
                return;
            default:
                wh.k3 k3Var = ((wh.o4) this.f22790b).K;
                if (k3Var != null) {
                    wh.r3 r3Var2 = k3Var.f49864a;
                    wh.r3.L1(r3Var2, e1Var);
                    r3Var2.f50016e3.h(e1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void d(wh.o3 o3Var, View view) {
        wh.z1 z1Var = (wh.z1) this.f22790b;
        q70 H = q70.H(z1Var, view);
        H.Q = true;
        z1Var.f50245u0 = wh.d4.c(H, z1Var, z1Var.getParentActivity(), z1Var.getResourceProvider(), o3Var, false);
    }

    public float e(ub.c cVar, ub.c cVar2) {
        int i10 = (int) cVar.f16706b;
        int i11 = (int) cVar2.f16706b;
        float Z = Z((int) cVar.f16705a, i10, (int) cVar2.f16705a, i11);
        float Z2 = Z((int) cVar2.f16705a, i11, (int) cVar.f16705a, i10);
        if (Float.isNaN(Z)) {
            return Z2 / 7.0f;
        }
        if (Float.isNaN(Z2)) {
            return Z / 7.0f;
        }
        return (Z + Z2) / 14.0f;
    }

    @Override
    public void f() {
        switch (this.f22789a) {
            case 26:
                wh.y yVar = (wh.y) this.f22790b;
                wh.l3 l3Var = yVar.L;
                if (l3Var != null) {
                    wh.r3.O1(l3Var.f49900a, yVar.f50211a);
                    return;
                }
                return;
            default:
                wh.o4 o4Var = (wh.o4) this.f22790b;
                wh.k3 k3Var = o4Var.K;
                if (k3Var != null) {
                    wh.r3.O1(k3Var.f49864a, o4Var.f50211a);
                    return;
                }
                return;
        }
    }

    @Override
    public void g(int i10) {
        AndroidUtilities.runOnUIThread(new qh.u9(this, 21));
    }

    @Override
    public float get() {
        qh.e9 e9Var = (qh.e9) this.f22790b;
        int i10 = e9Var.C1;
        dg.m currentBrush = e9Var.L0.getCurrentBrush();
        if (currentBrush == null) {
            return dg.e1.e(i10).f4520i;
        }
        return dg.e1.e(i10).f(String.valueOf(dg.m.f4581a.indexOf(currentBrush)), currentBrush.d());
    }

    public s0.d i(int i10) {
        return null;
    }

    @Override
    public void invalidate() {
        switch (this.f22789a) {
            case 0:
                ((t1) ((g1) this.f22790b).f22832b).invalidate();
                return;
            default:
                ((ng0) this.f22790b).h.invalidate();
                return;
        }
    }

    public pb.d j(cb.m r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f1.j(cb.m):pb.d");
    }

    @Override
    public void k(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f22790b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f368b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f44176a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.J;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f367a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    public ub.a m(float f10, float f11, int i10, int i11) {
        int i12;
        ub.a b10;
        ub.a b11;
        int i13 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i13);
        pb.b bVar = (pb.b) this.f22790b;
        int min = Math.min(bVar.f44286a - 1, i10 + i13) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f44287b - 1, i11 + i13) - max2;
            if (min2 >= f12) {
                pb.b bVar2 = (pb.b) this.f22790b;
                ub.b bVar3 = new ub.b(bVar2, max, max2, min, min2, f10);
                int i14 = bVar3.f48504e;
                int i15 = bVar3.f48503c;
                int i16 = i14 + i15;
                int i17 = bVar3.f48505f;
                int i18 = (i17 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i19 = 0; i19 < i17; i19++) {
                    if ((i19 & 1) == 0) {
                        i12 = (i19 + 1) / 2;
                    } else {
                        i12 = -((i19 + 1) / 2);
                    }
                    int i20 = i12 + i18;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i21 = i15;
                    while (i21 < i16 && !bVar2.b(i21, i20)) {
                        i21++;
                    }
                    int i22 = 0;
                    while (i21 < i16) {
                        if (bVar2.b(i21, i20)) {
                            if (i22 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i22 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i20, i21, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i22 = 1;
                            } else {
                                i22++;
                                iArr[i22] = iArr[i22] + 1;
                            }
                        } else {
                            if (i22 == 1) {
                                i22++;
                            }
                            iArr[i22] = iArr[i22] + 1;
                        }
                        i21++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i20, i16, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f48502b;
                if (!arrayList.isEmpty()) {
                    return (ub.a) arrayList.get(0);
                }
                throw ob.e.a();
            }
            throw ob.e.a();
        }
        throw ob.e.a();
    }

    @Override
    public void n(wh.a aVar) {
        wh.z1 z1Var = (wh.z1) this.f22790b;
        if (aVar != null && (aVar.f49653b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(z1Var)) {
            mi miVar = new mi(z1Var.getParentActivity(), z1Var, false, false, false, z1Var.getResourceProvider());
            miVar.W1 = new h7.u(24);
            miVar.M = true;
            miVar.f29116u1.setVisibility(8);
            miVar.f29103q2 = new qh.l1(z1Var, aVar, miVar, 6);
            miVar.r1();
            miVar.show();
        }
    }

    public s0.d o(int i10) {
        return null;
    }

    @Override
    public void onComplete(Task task) {
        r5.c.h((r5.c) ((r5.j) this.f22790b).f46753c, "joinApplication", task);
    }

    @Override
    public void onContentChanged() {
        wh.z1 z1Var = (wh.z1) this.f22790b;
        if (z1Var.f50246v0 != null) {
            boolean l32 = z1Var.M.l3();
            z1Var.I0 = l32;
            z1Var.f50246v0.h(l32);
            z1Var.f50246v0.invalidate();
        }
        z1Var.C0();
        Runnable runnable = z1Var.J0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public void p(int i10) {
        ((wh.z1) this.f22790b).o0(74, i10);
    }

    @Override
    public void q() {
        int i10;
        wh.z1 z1Var = (wh.z1) this.f22790b;
        wh.f3 f3Var = z1Var.M.f50028k3;
        if (f3Var != null && f3Var.y() && z1Var.M.B4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        z1Var.x0(i10, true);
        z1Var.y0();
        z1Var.w0();
    }

    @Override
    public void s(o4.n0 n0Var) {
        t4.r rVar = (t4.r) n0Var;
        t4.l lVar = (t4.l) this.f22790b;
        lVar.D.s(lVar);
    }

    @Override
    public void u() {
        wh.z1 z1Var = (wh.z1) this.f22790b;
        z1Var.F0 = z1Var.H0;
        wh.z1.Z(z1Var, false, false);
        z1Var.x0(2, true);
    }

    public void v() {
        t4.r[] rVarArr;
        t4.r[] rVarArr2;
        t4.l lVar = (t4.l) this.f22790b;
        int i10 = lVar.E - 1;
        lVar.E = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (t4.r rVar : lVar.G) {
            rVar.h();
            i11 += rVar.V.f16578a;
        }
        o4.s0[] s0VarArr = new o4.s0[i11];
        int i12 = 0;
        for (t4.r rVar2 : lVar.G) {
            rVar2.h();
            int i13 = rVar2.V.f16578a;
            int i14 = 0;
            while (i14 < i13) {
                rVar2.h();
                s0VarArr[i12] = rVar2.V.a(i14);
                i14++;
                i12++;
            }
        }
        lVar.F = new o4.t0(s0VarArr);
        lVar.D.a(lVar);
    }

    @Override
    public Paint.FontMetricsInt w() {
        return ((mi) this.f22790b).B0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void x(wh.q3 q3Var, View view) {
        wh.z1 z1Var = (wh.z1) this.f22790b;
        q70 H = q70.H(z1Var, view);
        H.Q = true;
        z1Var.getParentActivity();
        z1Var.getResourceProvider();
        z1Var.f50245u0 = wh.d4.b(H, z1Var, q3Var, false);
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public Object y2() {
        Class cls = (Class) this.f22790b;
        try {
            return ra.r.f46820a.a(cls);
        } catch (Exception e6) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e6);
        }
    }

    @Override
    public m9 z() {
        switch (this.f22789a) {
            case 26:
                wh.l3 l3Var = ((wh.y) this.f22790b).L;
                if (l3Var != null) {
                    return l3Var.f49900a.getTextSelectionHelper();
                }
                return null;
            default:
                wh.k3 k3Var = ((wh.o4) this.f22790b).K;
                if (k3Var != null) {
                    return k3Var.f49864a.getTextSelectionHelper();
                }
                return null;
        }
    }

    public f1(w6.b bVar, l5.e eVar) {
        this.f22789a = 25;
        this.f22790b = eVar;
    }

    public f1(n9.b bVar) {
        this.f22789a = 9;
        this.f22790b = new File(bVar.f15874b, "com.crashlytics.settings.json");
    }

    public f1(int i10) {
        this.f22789a = i10;
        switch (i10) {
            case 17:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f22790b = new hh0(this);
                    return;
                } else {
                    this.f22790b = new hh0(this);
                    return;
                }
            case 20:
                this.f22790b = new oh.h4(rb.a.h, 17);
                return;
            default:
                return;
        }
    }

    public f1(int i10, int i11, int[] iArr) {
        this.f22789a = 1;
        b60[] b60VarArr = new b60[(iArr.length / 2) + 1];
        this.f22790b = b60VarArr;
        b60 b60Var = new b60(i10, i11);
        int i12 = 0;
        b60VarArr[0] = b60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((b60[]) this.f22790b)[i13] = new b60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public f1(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f22789a = 12;
        this.f22790b = new GestureDetector(context, onGestureListener, null);
    }

    public f1(EditText editText) {
        this.f22789a = 10;
        this.f22790b = new n7.qa(editText);
    }

    @Override
    public void A() {
    }

    @Override
    public void C(int i10) {
    }

    @Override
    public void V(ArrayList arrayList) {
    }

    @Override
    public void X(String str) {
    }

    @Override
    public void h(wh.e1 e1Var, boolean z4) {
    }

    @Override
    public void N(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void l(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
    }
}
