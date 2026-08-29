package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
public class n implements b5, lg.g, u61, x71, androidx.activity.result.b, OnCompleteListener, pa.m, l4.d1, na.n, r5.a, rd.b, com.google.android.gms.common.api.internal.s, th.c1, a3.b {
    public final int f30786a;
    public Object f30787b;

    public n(Object obj, int i10) {
        this.f30786a = i10;
        this.f30787b = obj;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f30786a) {
            case 0:
                g0 g0Var = (g0) this.f30787b;
                g0Var.l0(i10, i11, z10);
                g0Var.dismiss();
                return;
            case 18:
                ((th.p) this.f30787b).H(i10, z10, i11, false, 0L);
                th.p pVar = (th.p) this.f30787b;
                org.telegram.ui.ki0 ki0Var = pVar.K;
                if (ki0Var != null) {
                    ki0Var.i();
                    pVar.K = null;
                    return;
                }
                return;
            default:
                ((th.x1) this.f30787b).s0(i10, i11, z10);
                return;
        }
    }

    @Override
    public void T0(th.d1 d1Var, int i10, int i11) {
        th.w2 w2Var;
        org.telegram.ui.Cells.k9 textSelectionHelper;
        th.g5 g5Var = (th.g5) this.f30787b;
        if (!g5Var.C && i10 != i11 && (w2Var = g5Var.A) != null && (textSelectionHelper = w2Var.f48834a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != g5Var) {
                g5Var.post(new org.telegram.messenger.o6(this, d1Var, i11, textSelectionHelper, i10, 6));
            }
        }
    }

    @Override
    public void Z0(CharSequence charSequence) {
        th.w2 w2Var = ((th.g5) this.f30787b).A;
        if (w2Var != null && charSequence != null && charSequence.length() > 0) {
            w2Var.f48834a.t4(charSequence.toString());
        }
    }

    @Override
    public void a(l4.e1 e1Var) {
        q4.r rVar = (q4.r) e1Var;
        q4.l lVar = (q4.l) this.f30787b;
        lVar.C.a(lVar);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f30786a) {
            case 17:
                t6.f fVar = new t6.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = c7.b.f2998a;
                obtain.writeStrongBinder(fVar);
                c7.b.b(obtain, (s6.f) this.f30787b);
                c7.b.b(obtain, gVar);
                ((t6.b) ((t6.d) ((t6.e) obj).u())).E0(obtain, 6);
                return;
            default:
                u6.a aVar = new u6.a((TaskCompletionSource) obj2);
                u6.i iVar = (u6.i) ((u6.c) obj).u();
                String str = ((u6.b) this.f30787b).f49117k;
                Parcel I0 = iVar.I0();
                int i11 = u6.f.f49121a;
                I0.writeStrongBinder(aVar);
                I0.writeString(str);
                iVar.J0(I0, 2);
                return;
        }
    }

    public float b(sb.c cVar, sb.c cVar2) {
        int i10 = (int) cVar.f16970b;
        int i11 = (int) cVar2.f16970b;
        float u10 = u((int) cVar.f16969a, i10, (int) cVar2.f16969a, i11);
        float u11 = u((int) cVar2.f16969a, i11, (int) cVar.f16969a, i10);
        if (Float.isNaN(u10)) {
            return u11 / 7.0f;
        }
        if (Float.isNaN(u11)) {
            return u10 / 7.0f;
        }
        return (u10 + u11) / 14.0f;
    }

    @Override
    public void d(Canvas canvas) {
        switch (this.f30786a) {
            case 1:
                ni niVar = (ni) this.f30787b;
                canvas.drawColor(niVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                if (SharedConfig.chatBlurEnabled()) {
                    niVar.f31068y2.b(canvas, -3);
                    return;
                }
                return;
            default:
                dq0 dq0Var = (dq0) this.f30787b;
                canvas.drawColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                if (SharedConfig.chatBlurEnabled()) {
                    dq0Var.K0.b(canvas, -3);
                    return;
                }
                return;
        }
    }

    @Override
    public void e(th.d1 d1Var) {
        th.w2 w2Var = ((th.g5) this.f30787b).A;
        if (w2Var != null) {
            th.p3 p3Var = w2Var.f48834a;
            th.p3.M1(p3Var, d1Var);
            p3Var.f48638d3.U(d1Var, true);
        }
    }

    public boolean f(int i10) {
        q71 q71Var = ((z71) this.f30787b).H;
        if (q71Var == null) {
            return false;
        }
        return q71Var.c(i10);
    }

    public s0.c g(int i10) {
        return null;
    }

    @Override
    public Object mo18get() {
        return new v5.c((Context) ((a3.c) this.f30787b).f49a, new f7.v(8), new bb.a(8), 8);
    }

    public sb.a h(float f9, float f10, int i10, int i11) {
        int i12;
        sb.a b10;
        sb.a b11;
        int i13 = (int) (f10 * f9);
        int max = Math.max(0, i10 - i13);
        nb.b bVar = (nb.b) this.f30787b;
        int min = Math.min(bVar.f17202a - 1, i10 + i13) - max;
        float f11 = 3.0f * f9;
        if (min >= f11) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(bVar.f17203b - 1, i11 + i13) - max2;
            if (min2 >= f11) {
                nb.b bVar2 = (nb.b) this.f30787b;
                sb.b bVar3 = new sb.b(bVar2, max, max2, min, min2, f9);
                int i14 = bVar3.f47699e;
                int i15 = bVar3.f47698c;
                int i16 = i14 + i15;
                int i17 = bVar3.f47700f;
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
                ArrayList arrayList = bVar3.f47697b;
                if (!arrayList.isEmpty()) {
                    return (sb.a) arrayList.get(0);
                }
                throw mb.e.a();
            }
            throw mb.e.a();
        }
        throw mb.e.a();
    }

    public s0.c i(int i10) {
        return null;
    }

    @Override
    public boolean i1(th.d1 d1Var) {
        return false;
    }

    public void j(float f9) {
        z71 z71Var = (z71) this.f30787b;
        if (f9 == 1.0f) {
            View[] viewArr = z71Var.f35261e;
            View[] viewArr2 = z71Var.f35261e;
            if (viewArr[1] != null) {
                z71Var.F();
                z71Var.h.put(z71Var.f35262f[1], viewArr2[1]);
                z71Var.removeView(viewArr2[1]);
                z71Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            z71Var.z(z71Var.f35259b);
            return;
        }
        View[] viewArr3 = z71Var.f35261e;
        View[] viewArr4 = z71Var.f35261e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (z71Var.f35268y) {
            z71Var.E(view, (1.0f - f9) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            z71Var.E(view2, (-view2.getMeasuredWidth()) * f9);
        } else {
            z71Var.E(view, (1.0f - f9) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            z71Var.E(view3, view3.getMeasuredWidth() * f9);
        }
        z71Var.w(false);
    }

    public void k() {
        q4.r[] rVarArr;
        q4.r[] rVarArr2;
        q4.l lVar = (q4.l) this.f30787b;
        int i10 = lVar.D - 1;
        lVar.D = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q4.r rVar : lVar.F) {
            rVar.d();
            i11 += rVar.U.f14357a;
        }
        l4.j1[] j1VarArr = new l4.j1[i11];
        int i12 = 0;
        for (q4.r rVar2 : lVar.F) {
            rVar2.d();
            int i13 = rVar2.U.f14357a;
            int i14 = 0;
            while (i14 < i13) {
                rVar2.d();
                j1VarArr[i12] = rVar2.U.a(i14);
                i14++;
                i12++;
            }
        }
        lVar.E = new l4.k1(j1VarArr);
        lVar.C.c(lVar);
    }

    @Override
    public void l(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f30787b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f894b;
        int i10 = aVar.f893a;
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        if (i10 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f45457a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.K;
        if (resultReceiver != null) {
            resultReceiver.send(i11, extras);
        } else {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i11 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public boolean m() {
        th.g5 g5Var = (th.g5) this.f30787b;
        th.w2 w2Var = g5Var.A;
        if (w2Var != null && g5Var.f48892a != null) {
            return w2Var.f48834a.S4();
        }
        return false;
    }

    public boolean n(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public void n1(Editable editable) {
        th.g5 g5Var = (th.g5) this.f30787b;
        th.a aVar = g5Var.f48892a;
        if (aVar != null) {
            aVar.f48343s = true;
            aVar.f48342r = g5Var.f48464r.A;
        }
        g5Var.u();
        th.w2 w2Var = g5Var.A;
        if (w2Var != null && g5Var.f48892a != null) {
            w2Var.a();
        }
    }

    public byte o() {
        int read = ((com.google.firebase.messaging.d) this.f30787b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public void o0(Bitmap bitmap) {
        s5.b bVar = r5.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f9 = width;
            int height = bitmap.getHeight();
            int d = (int) a4.w.d(f9, 9.0f, 16.0f, 0.5f);
            float f10 = (d - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f9, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, d, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((r5.h) this.f30787b).e(bitmap2, 0);
    }

    @Override
    public void onComplete(Task task) {
        p5.c.h((p5.c) ((p5.j) this.f30787b).f45642c, "launchApplication", task);
    }

    @Override
    public void onError(x61 x61Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        s50 s50Var;
        VideoEditedInfo videoEditedInfo;
        r50 r50Var = (r50) this.f30787b;
        x61 x61Var = r50Var.D0.K;
        if (x61Var != null && x61Var.z() && i10 == 4 && (videoEditedInfo = (s50Var = r50Var.D0).J) != null) {
            x61 x61Var2 = s50Var.K;
            long j10 = videoEditedInfo.startTime;
            if (j10 <= 0) {
                j10 = 0;
            }
            x61Var2.L(j10);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public int p() {
        return ((o() & 255) << 24) | ((o() & 255) << 16) | ((o() & 255) << 8) | (o() & 255);
    }

    @Override
    public Object p2() {
        Type type = (Type) this.f30787b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException("Invalid EnumMap type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + type.toString());
    }

    @Override
    public void q(g.x xVar) {
        switch (this.f30786a) {
            case 1:
                xVar.a(((ni) this.f30787b).getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                xVar.a(((dq0) this.f30787b).getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    public int r() {
        return ((o() & Byte.MAX_VALUE) << 21) | ((o() & Byte.MAX_VALUE) << 14) | ((o() & Byte.MAX_VALUE) << 7) | (o() & Byte.MAX_VALUE);
    }

    @Override
    public boolean r0(th.d1 d1Var) {
        return false;
    }

    public na.i s(Object obj) {
        na.g gVar = ((qa.a0) this.f30787b).f46513b;
        gVar.getClass();
        if (obj == null) {
            return na.k.f17193a;
        }
        Class<?> cls = obj.getClass();
        qa.n nVar = new qa.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    public float t(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        int i21 = 1;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
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
            if (z10) {
                i19 = i26;
            } else {
                i19 = i25;
            }
            if (z10) {
                i20 = i25;
            } else {
                i20 = i26;
            }
            boolean z12 = z10;
            if (i27 == i21) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i28 = abs;
            if (z11 == ((nb.b) this.f30787b).b(i19, i20)) {
                if (i27 == 2) {
                    return i7.z5.b(i25, i26, i14, i15);
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
            z10 = z12;
            i21 = 1;
        }
        if (i27 == 2) {
            return i7.z5.b(i24, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override
    public boolean t1(boolean z10) {
        return false;
    }

    public float u(int i10, int i11, int i12, int i13) {
        float f9;
        float f10;
        nb.b bVar = (nb.b) this.f30787b;
        float t10 = t(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f9 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.f17202a;
            if (i14 >= i16) {
                int i17 = i16 - 1;
                f9 = ((i16 - 1) - i10) / (i14 - i10);
                i14 = i17;
            } else {
                f9 = 1.0f;
            }
        }
        float f11 = i11;
        int i18 = (int) (f11 - ((i13 - i11) * f9));
        if (i18 < 0) {
            f10 = f11 / (i11 - i18);
        } else {
            int i19 = bVar.f17203b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (t(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + t10) - 1.0f;
    }

    public void v(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.f30787b).skip(j10 - j11);
            if (skip > 0) {
                j11 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public void z(int i10, int i11) {
        th.b2 b2Var;
        th.g5 g5Var = (th.g5) this.f30787b;
        th.w2 w2Var = g5Var.A;
        if (w2Var != null && g5Var.f48892a != null && (b2Var = w2Var.f48834a.F3) != null) {
            b2Var.f(i10, i11);
        }
    }

    public n(j6.a aVar) {
        this.f30786a = 22;
        z5.l.h(aVar);
        this.f30787b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public n(EditText editText) {
        this.f30786a = 10;
        this.f30787b = new oc.i(editText);
    }

    public n(int i10) {
        this.f30786a = i10;
        switch (i10) {
            case 15:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f30787b = new vg0(this);
                    return;
                } else {
                    this.f30787b = new vg0(this);
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public void S0(th.d1 d1Var) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void u0() {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
    }
}
