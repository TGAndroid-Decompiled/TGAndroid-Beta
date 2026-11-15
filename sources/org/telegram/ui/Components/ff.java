package org.telegram.ui.Components;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class ff implements ce0, g90, wi.l, r0.m, xr0, ue.a, jg.y1, q5.b, x2.c1, com.google.android.gms.common.api.internal.q, tg.l1, sg.t0, u4.c, com.google.android.gms.common.api.internal.n, v4.d0, v4.j1 {
    public final int f34589a;
    public Object f34590b;

    public ff(Object obj, int i7) {
        this.f34589a = i7;
        this.f34590b = obj;
    }

    public void A0() {
        r2.q[] qVarArr;
        r2.q[] qVarArr2;
        r2.k kVar = (r2.k) this.f34590b;
        int i7 = kVar.I - 1;
        kVar.I = i7;
        if (i7 > 0) {
            return;
        }
        int i10 = 0;
        for (r2.q qVar : kVar.K) {
            qVar.n();
            i10 += qVar.Z.f59640a;
        }
        e2.m1[] m1VarArr = new e2.m1[i10];
        int i11 = 0;
        for (r2.q qVar2 : kVar.K) {
            qVar2.n();
            int i12 = qVar2.Z.f59640a;
            int i13 = 0;
            while (i13 < i12) {
                qVar2.n();
                m1VarArr[i11] = qVar2.Z.a(i13);
                i13++;
                i11++;
            }
        }
        kVar.J = new x2.q1(m1VarArr);
        kVar.H.k(kVar);
    }

    @Override
    public int B() {
        return ((v4.o0) this.f34590b).D();
    }

    public boolean B0(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ff.B0(android.view.MotionEvent):boolean");
    }

    public void C0(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.f34590b;
        View childAt = recyclerView.getChildAt(i7);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i7);
    }

    @Override
    public View D() {
        return ((bu) this.f34590b).O1;
    }

    public void D0(long j3, int i7, long j10) {
        x3.f fVar = (x3.f) this.f34590b;
        fVar.f59791j0.getClass();
        if (i7 != 160) {
            if (i7 != 174) {
                if (i7 != 183) {
                    if (i7 != 187) {
                        if (i7 != 19899) {
                            if (i7 != 20533) {
                                if (i7 != 21968) {
                                    if (i7 != 408125543) {
                                        if (i7 != 475249515) {
                                            if (i7 == 524531317 && !fVar.f59806z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f59791j0.f(new f3.t(fVar.v));
                                                fVar.f59806z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f59806z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j11 = fVar.f59800s;
                                    if (j11 != -1 && j11 != j3) {
                                        throw e2.t0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f59800s = j3;
                                    fVar.f59799r = j10;
                                    return;
                                }
                                fVar.h(i7);
                                fVar.f59805y.f59768z = true;
                                return;
                            }
                            fVar.h(i7);
                            fVar.f59805y.f59752i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f59806z) {
                        fVar.g(i7);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f59806z) {
                    fVar.g(i7);
                    fVar.F = -1;
                    fVar.G = -1L;
                    fVar.H = -1L;
                    return;
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f59757n = -1;
            obj.f59758o = -1;
            obj.f59759p = -1;
            obj.f59760q = -1;
            obj.f59761r = -1;
            obj.f59762s = 0;
            obj.f59763t = -1;
            obj.f59764u = 0.0f;
            obj.v = 0.0f;
            obj.f59765w = 0.0f;
            obj.f59766x = null;
            obj.f59767y = -1;
            obj.f59768z = false;
            obj.A = -1;
            obj.B = -1;
            obj.C = -1;
            obj.D = 1000;
            obj.E = 200;
            obj.F = -1.0f;
            obj.G = -1.0f;
            obj.H = -1.0f;
            obj.I = -1.0f;
            obj.J = -1.0f;
            obj.K = -1.0f;
            obj.L = -1.0f;
            obj.M = -1.0f;
            obj.N = -1.0f;
            obj.O = -1.0f;
            obj.Q = 1;
            obj.R = -1;
            obj.S = 8000;
            obj.T = 0L;
            obj.U = 0L;
            obj.W = false;
            obj.Y = true;
            obj.Z = "eng";
            fVar.f59805y = obj;
            obj.f59743a = fVar.f59803w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    @Override
    public void E(int i7, int i10) {
        ((v4.h0) this.f34590b).j(i7, i10);
    }

    @Override
    public void E0() {
        ((x41) this.f34590b).h.c(false);
    }

    @Override
    public boolean F() {
        return false;
    }

    public void F0(int i7, String str) {
        x3.f fVar = (x3.f) this.f34590b;
        if (i7 != 134) {
            if (i7 != 17026) {
                if (i7 != 21358) {
                    if (i7 != 2274716) {
                        return;
                    }
                    fVar.h(i7);
                    fVar.f59805y.Z = str;
                    return;
                }
                fVar.h(i7);
                fVar.f59805y.f59745b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw e2.t0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f59803w = str.equals("webm");
                return;
            }
        }
        fVar.h(i7);
        fVar.f59805y.f59747c = str;
    }

    public void G0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f34590b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long I0 = I0();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + I0);
    }

    @Override
    public void H() {
        ((ys0) this.f34590b).J.a(-1);
    }

    public void H0(long j3) {
        long I0 = I0();
        if (I0 != j3) {
            if (I0 != -1) {
                if (I0 == -2) {
                    I0 = -2;
                } else {
                    return;
                }
            }
            StringBuilder t6 = a8.p0.t(j3, "expected non-string scope or scope ", " but found ");
            t6.append(I0);
            throw new IOException(t6.toString());
        }
    }

    @Override
    public void I(int i7, Object obj) {
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
        ((ProfileInstallReceiver) this.f34590b).setResultCode(i7);
    }

    public long I0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f34590b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public org.telegram.ui.ActionBar.z0 J(String str) {
        org.telegram.ui.ActionBar.d5 d5Var = ((ys0) this.f34590b).J;
        return d5Var.d(0, 0, null, str, true, true, d5Var.f29513n0);
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public void K0(int i7, int i10) {
        ((v4.h0) this.f34590b).p(i7, i10);
    }

    @Override
    public int L() {
        return ((bu) this.f34590b).P1;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        ok0 ok0Var = (ok0) this.f34590b;
        ok0Var.f38013w.setPadding(I0.f15574a, I0.f15575b, I0.f15576c, I0.d);
        ok0Var.f38012s.requestLayout();
        return r0.k1.f55681b;
    }

    @Override
    public boolean N() {
        return false;
    }

    @Override
    public void O(float f10, float f11) {
        Runnable runnable = ((x41) this.f34590b).f41575j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public Paint.FontMetricsInt Q() {
        return ((ki) this.f34590b).C2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public boolean Q0(float f10, float f11) {
        int L = org.telegram.messenger.g0.L(9.0f);
        RectF rectF = ((x41) this.f34590b).f41573g;
        float f12 = -L;
        rectF.inset(f12, f12);
        boolean contains = rectF.contains(f10, f11);
        float f13 = L;
        rectF.inset(f13, f13);
        return contains;
    }

    @Override
    public e2.c1 R() {
        return null;
    }

    @Override
    public int S() {
        v4.o0 o0Var = (v4.o0) this.f34590b;
        return o0Var.f58631m - o0Var.E();
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public void V() {
        bu buVar = (bu) this.f34590b;
        buVar.N1 = null;
        buVar.K0();
    }

    @Override
    public void W(boolean z10) {
        ((ji.p) this.f34590b).setLanguagePillHidden(z10);
    }

    @Override
    public boolean X(boolean z10, float f10, um0 um0Var) {
        return false;
    }

    @Override
    public void Z() {
        ((bu) this.f34590b).L0();
    }

    @Override
    public boolean Z0(View view, float f10, float f11) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f34589a) {
            case 16:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                s6.c cVar = (s6.c) ((s6.e) obj).n();
                Parcel j12 = cVar.j1();
                n7.a.b(j12, (q6.p) this.f34590b);
                try {
                    cVar.f306b.transact(1, j12, null, 1);
                    j12.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    j12.recycle();
                    throw th2;
                }
            default:
                y8.e eVar = (y8.e) this.f34590b;
                h8.b bVar = (h8.b) obj;
                bVar.getClass();
                h8.a aVar = new h8.a(1, (TaskCompletionSource) obj2);
                try {
                    h8.i iVar = (h8.i) bVar.n();
                    Bundle B = bVar.B();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i7 = h8.c.f13638a;
                    obtain.writeInt(1);
                    eVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f13646a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
                    Bundle bundle = Bundle.EMPTY;
                    a8.l8.a(Status.h, Boolean.FALSE, aVar.f13637b);
                    return;
                }
        }
    }

    @Override
    public void b() {
        m71 m71Var = ((bu) this.f34590b).n1;
        if (m71Var != null && m71Var.f37159x) {
            m71Var.f37138a.g0();
            m71Var.n();
            m71Var.f37149g0.d(true, true);
        }
    }

    @Override
    public int b0() {
        return ((bu) this.f34590b).Q1;
    }

    @Override
    public float c0() {
        return 0.0f;
    }

    @Override
    public int d() {
        return 0;
    }

    @Override
    public void d0(RectF rectF) {
        rectF.set(((ji.p) this.f34590b).P);
    }

    @Override
    public int e(View view) {
        return v4.o0.x(view) - ((ViewGroup.MarginLayoutParams) ((v4.p0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public boolean e0(int i7) {
        return true;
    }

    @Override
    public void f0(x2.d1 d1Var) {
        r2.q qVar = (r2.q) d1Var;
        r2.k kVar = (r2.k) this.f34590b;
        kVar.H.f0(kVar);
    }

    @Override
    public void g(Object obj) {
        com.google.android.gms.common.api.internal.m mVar;
        org.telegram.messenger.y9 y9Var = (org.telegram.messenger.y9) obj;
        androidx.activity.n nVar = ((u7.j) this.f34590b).f57882b;
        synchronized (nVar) {
            nVar.f1796b = false;
            mVar = ((com.google.android.gms.common.api.internal.o) nVar.f1797c).f6055b;
        }
        if (mVar != null) {
            ((u7.c) nVar.d).c(mVar, 2441);
        }
    }

    @Override
    public View g0(int i7) {
        return ((v4.o0) this.f34590b).q(i7);
    }

    @Override
    public Object mo24get() {
        switch (this.f34589a) {
            case 9:
                return new org.telegram.ui.ld0((Context) ((d9.o) this.f34590b).f7643b, new qb.a(28), new pb.b(28), 5);
            default:
                return new v5.i(Integer.valueOf(v5.i.d).intValue(), (Context) ((fd.a) this.f34590b).mo24get(), "com.google.android.datatransport.events");
        }
    }

    @Override
    public long getDuration() {
        return 0L;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public void h0() {
        tg.o0 o0Var = (tg.o0) this.f34590b;
        o0Var.f57486b.f56697a.C();
        o0Var.f57494x.setViewHidden(false);
        PhotoViewer photoViewer = ((org.telegram.ui.sp0) o0Var).L;
        Drawable[] drawableArr = PhotoViewer.Z8;
        photoViewer.V2(true, true);
    }

    @Override
    public void h1(int i7, int i10) {
        ((v4.h0) this.f34590b).n(i7, i10, null);
    }

    @Override
    public void i(int i7) {
        org.telegram.ui.Wallet.z9 z9Var = (org.telegram.ui.Wallet.z9) this.f34590b;
        if (!z9Var.f44861r && i7 == z9Var.K) {
            z9Var.j0(z9Var.O.getText().toString().trim());
        }
    }

    @Override
    public int i0(View view) {
        return v4.o0.y(view) + ((ViewGroup.MarginLayoutParams) ((v4.p0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public boolean k0() {
        return true;
    }

    @Override
    public long l() {
        return 0L;
    }

    @Override
    public boolean l1() {
        return false;
    }

    @Override
    public void m() {
        tg.o0 o0Var = (tg.o0) this.f34590b;
        o0Var.f57488e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new hi.j3(o0Var, 26)).setInterpolator(er.h);
    }

    @Override
    public void m0(int i7, int i10) {
        ((v4.h0) this.f34590b).o(i7, i10);
    }

    @Override
    public org.telegram.ui.ActionBar.z0 n0(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        ys0 ys0Var = (ys0) this.f34590b;
        org.telegram.ui.ActionBar.z0 e10 = ys0Var.J.e(0, i7, str);
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.j6.f29070p7;
            e10.d(ys0Var.s0(i10), ys0Var.s0(i10));
        }
        e10.setOnClickListener(new ma0(this, z11, runnable));
        return e10;
    }

    @Override
    public boolean p() {
        bu buVar = (bu) this.f34590b;
        if (buVar.O1 == buVar.f33379m1 && buVar.f33390y1 && "inapp".equals(org.telegram.messenger.np.s1(buVar.f29679a).B3)) {
            return false;
        }
        return true;
    }

    @Override
    public void p0(int i7, int i10, CharSequence charSequence, boolean z10) {
        ki kiVar = (ki) this.f34590b;
        if (kiVar.a1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(kiVar.a1().getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                org.telegram.messenger.j6.l(spannableStringBuilder, kiVar.a1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            kiVar.a1().setText(spannableStringBuilder);
            kiVar.a1().setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public void q0() {
        ((tg.o0) this.f34590b).f57494x.setViewHidden(true);
    }

    @Override
    public void r0(float f10) {
        org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.f34590b;
        sg.k0.e(tp0Var.f57316z1).k(String.valueOf(sg.h.f56640a.indexOf(tp0Var.G0.getCurrentBrush())), f10);
        sg.h1 h1Var = tp0Var.f57306u1;
        h1Var.f56646c = f10;
        tp0Var.s0(h1Var, null);
    }

    @Override
    public void s0() {
        ((x41) this.f34590b).h.c(true);
    }

    @Override
    public boolean t0() {
        return false;
    }

    public String toString() {
        switch (this.f34589a) {
            case 29:
                ze.b bVar = ze.b.f61349e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ug.l0) this.f34590b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public View w(LaunchActivity launchActivity) {
        return null;
    }

    public void w0(int i7, int i10, f3.p pVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j3;
        int i16;
        int i17;
        int i18;
        int i19;
        byte[] bArr;
        int i20;
        x3.f fVar = (x3.f) this.f34590b;
        x3.g gVar = fVar.f59776b;
        SparseArray sparseArray = fVar.f59778c;
        h2.x xVar = fVar.f59792k;
        h2.x xVar2 = fVar.f59788i;
        int i21 = 2;
        int i22 = 0;
        int i23 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 != 165) {
                if (i7 != 16877) {
                    if (i7 != 16981) {
                        if (i7 != 18402) {
                            if (i7 != 21419) {
                                if (i7 != 25506) {
                                    if (i7 == 30322) {
                                        fVar.h(i7);
                                        byte[] bArr2 = new byte[i10];
                                        fVar.f59805y.f59766x = bArr2;
                                        pVar.readFully(bArr2, 0, i10);
                                        return;
                                    }
                                    throw e2.t0.a(null, "Unexpected id: " + i7);
                                }
                                fVar.h(i7);
                                byte[] bArr3 = new byte[i10];
                                fVar.f59805y.f59755l = bArr3;
                                pVar.readFully(bArr3, 0, i10);
                                return;
                            }
                            Arrays.fill(xVar.f13521a, (byte) 0);
                            pVar.readFully(xVar.f13521a, 4 - i10, i10);
                            xVar.N(0);
                            fVar.A = (int) xVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i10];
                        pVar.readFully(bArr4, 0, i10);
                        fVar.h(i7);
                        fVar.f59805y.f59754k = new f3.h0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i7);
                    byte[] bArr5 = new byte[i10];
                    fVar.f59805y.f59753j = bArr5;
                    pVar.readFully(bArr5, 0, i10);
                    return;
                }
                fVar.h(i7);
                x3.e eVar = fVar.f59805y;
                int i24 = eVar.h;
                if (i24 != 1685485123 && i24 != 1685480259) {
                    pVar.m(i10);
                    return;
                }
                byte[] bArr6 = new byte[i10];
                eVar.P = bArr6;
                pVar.readFully(bArr6, 0, i10);
                return;
            } else if (fVar.O == 2) {
                x3.e eVar2 = (x3.e) sparseArray.get(fVar.U);
                int i25 = fVar.X;
                h2.x xVar3 = fVar.f59797p;
                if (i25 == 4 && "V_VP9".equals(eVar2.f59747c)) {
                    xVar3.K(i10);
                    pVar.readFully(xVar3.f13521a, 0, i10);
                    return;
                }
                pVar.m(i10);
                return;
            } else {
                return;
            }
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.f59809c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        x3.e eVar3 = (x3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.m(i10 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.f59744a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i26 = (xVar2.f13521a[2] & 6) >> 1;
            byte b10 = 255;
            if (i26 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i10 - fVar.V) - 3;
            } else {
                fVar.l(pVar, 4);
                int i27 = (xVar2.f13521a[3] & 255) + 1;
                fVar.S = i27;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i27];
                } else if (iArr2.length < i27) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i27)];
                }
                fVar.T = iArr2;
                if (i26 == 2) {
                    int i28 = fVar.S;
                    Arrays.fill(iArr2, 0, i28, ((i10 - fVar.V) - 4) / i28);
                } else if (i26 == 1) {
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 4;
                    while (true) {
                        i17 = fVar.S - 1;
                        if (i29 >= i17) {
                            break;
                        }
                        fVar.T[i29] = 0;
                        while (true) {
                            i18 = i31 + 1;
                            fVar.l(pVar, i18);
                            int i32 = xVar2.f13521a[i31] & 255;
                            int[] iArr3 = fVar.T;
                            i19 = iArr3[i29] + i32;
                            iArr3[i29] = i19;
                            if (i32 != 255) {
                                break;
                            }
                            i31 = i18;
                        }
                        i30 += i19;
                        i29++;
                        i31 = i18;
                    }
                    fVar.T[i17] = ((i10 - fVar.V) - i31) - i30;
                } else if (i26 == 3) {
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 4;
                    while (true) {
                        int i36 = fVar.S - i23;
                        if (i33 < i36) {
                            fVar.T[i33] = i22;
                            int i37 = i35 + 1;
                            fVar.l(pVar, i37);
                            if (xVar2.f13521a[i35] != 0) {
                                int i38 = i22;
                                while (true) {
                                    if (i38 < 8) {
                                        int i39 = i23 << (7 - i38);
                                        i14 = i21;
                                        if ((xVar2.f13521a[i35] & i39) != 0) {
                                            int i40 = i37 + i38;
                                            fVar.l(pVar, i40);
                                            i15 = i23;
                                            j3 = xVar2.f13521a[i35] & b10 & (~i39);
                                            while (i37 < i40) {
                                                j3 = (j3 << 8) | (xVar2.f13521a[i37] & b10);
                                                i37++;
                                                i40 = i40;
                                                b10 = 255;
                                            }
                                            i16 = i40;
                                            if (i33 > 0) {
                                                j3 -= (1 << ((i38 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i38++;
                                            i21 = i14;
                                            b10 = 255;
                                        }
                                    } else {
                                        i14 = i21;
                                        i15 = i23;
                                        j3 = 0;
                                        i16 = i37;
                                        break;
                                    }
                                }
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    break;
                                }
                                int i41 = (int) j3;
                                int[] iArr4 = fVar.T;
                                if (i33 != 0) {
                                    i41 += iArr4[i33 - 1];
                                }
                                iArr4[i33] = i41;
                                i34 += i41;
                                i33++;
                                i22 = i38;
                                i21 = i14;
                                i23 = i15;
                                i35 = i16;
                                b10 = 255;
                            } else {
                                throw e2.t0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            i11 = i21;
                            i12 = i22;
                            i13 = i23;
                            fVar.T[i36] = ((i10 - fVar.V) - i35) - i34;
                            break;
                        }
                    }
                    throw e2.t0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw e2.t0.a(null, "Unexpected lacing value: " + i26);
                }
            }
            i11 = 2;
            i12 = 0;
            i13 = 1;
            int i42 = xVar2.f13521a[i13] & 255;
            fVar.P = fVar.n(i42 | (bArr[i12] << 8)) + fVar.M;
            if (eVar3.f59749e != i13 && (i7 != 163 || (xVar2.f13521a[i11] & 128) != 128)) {
                i20 = i12;
            } else {
                i20 = 1;
            }
            fVar.W = i20;
            fVar.O = i11;
            fVar.R = i12;
        }
        if (i7 == 163) {
            while (true) {
                int i43 = fVar.R;
                if (i43 < fVar.S) {
                    fVar.i(eVar3, ((fVar.R * eVar3.f59750f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i43], false), 0);
                    fVar.R++;
                } else {
                    fVar.O = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i44 = fVar.R;
                if (i44 < fVar.S) {
                    int[] iArr5 = fVar.T;
                    iArr5[i44] = fVar.o(pVar, eVar3, iArr5[i44], true);
                    fVar.R++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public ji.p x0() {
        return (ji.p) this.f34590b;
    }

    @Override
    public void y() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public ClipDescription y0() {
        return ((t0.h) this.f34590b).getDescription();
    }

    @Override
    public boolean z() {
        return true;
    }

    public void z0(int i7, long j3) {
        x3.f fVar = (x3.f) this.f34590b;
        if (i7 != 240) {
            if (i7 != 241) {
                if (i7 != 20529) {
                    if (i7 != 20530) {
                        boolean z10 = false;
                        switch (i7) {
                            case 131:
                                int i10 = (int) j3;
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 17) {
                                            if (i10 != 33) {
                                                fVar.h(i7);
                                                fVar.f59805y.f59749e = -1;
                                                return;
                                            }
                                            fVar.h(i7);
                                            fVar.f59805y.f59749e = 5;
                                            return;
                                        }
                                        fVar.h(i7);
                                        fVar.f59805y.f59749e = 3;
                                        return;
                                    }
                                    fVar.h(i7);
                                    fVar.f59805y.f59749e = 1;
                                    return;
                                }
                                fVar.h(i7);
                                fVar.f59805y.f59749e = 2;
                                return;
                            case 136:
                                fVar.h(i7);
                                x3.e eVar = fVar.f59805y;
                                if (j3 == 1) {
                                    z10 = true;
                                }
                                eVar.Y = z10;
                                return;
                            case 155:
                                fVar.Q = fVar.n(j3);
                                return;
                            case 159:
                                fVar.h(i7);
                                fVar.f59805y.Q = (int) j3;
                                return;
                            case 176:
                                fVar.h(i7);
                                fVar.f59805y.f59757n = (int) j3;
                                return;
                            case 179:
                                if (!fVar.f59806z) {
                                    fVar.g(i7);
                                    fVar.E = fVar.n(j3);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i7);
                                fVar.f59805y.f59758o = (int) j3;
                                return;
                            case 215:
                                fVar.h(i7);
                                fVar.f59805y.d = (int) j3;
                                return;
                            case 231:
                                fVar.M = fVar.n(j3);
                                return;
                            case 238:
                                fVar.X = (int) j3;
                                return;
                            case 247:
                                if (!fVar.f59806z) {
                                    fVar.g(i7);
                                    fVar.F = (int) j3;
                                    return;
                                }
                                return;
                            case 251:
                                fVar.Y = true;
                                return;
                            case 16871:
                                fVar.h(i7);
                                fVar.f59805y.h = (int) j3;
                                return;
                            case 16980:
                                if (j3 != 3) {
                                    throw e2.t0.a(null, "ContentCompAlgo " + j3 + " not supported");
                                }
                                return;
                            case 17029:
                                if (j3 < 1 || j3 > 2) {
                                    throw e2.t0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                                }
                                return;
                            case 17143:
                                if (j3 != 1) {
                                    throw e2.t0.a(null, "EBMLReadVersion " + j3 + " not supported");
                                }
                                return;
                            case 18401:
                                if (j3 != 5) {
                                    throw e2.t0.a(null, "ContentEncAlgo " + j3 + " not supported");
                                }
                                return;
                            case 18408:
                                if (j3 != 1) {
                                    throw e2.t0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
                                }
                                return;
                            case 21420:
                                fVar.B = j3 + fVar.f59800s;
                                return;
                            case 21432:
                                int i11 = (int) j3;
                                fVar.h(i7);
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        if (i11 != 3) {
                                            if (i11 == 15) {
                                                fVar.f59805y.f59767y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f59805y.f59767y = 1;
                                        return;
                                    }
                                    fVar.f59805y.f59767y = 2;
                                    return;
                                }
                                fVar.f59805y.f59767y = 0;
                                return;
                            case 21680:
                                fVar.h(i7);
                                fVar.f59805y.f59760q = (int) j3;
                                return;
                            case 21682:
                                fVar.h(i7);
                                fVar.f59805y.f59762s = (int) j3;
                                return;
                            case 21690:
                                fVar.h(i7);
                                fVar.f59805y.f59761r = (int) j3;
                                return;
                            case 21930:
                                fVar.h(i7);
                                x3.e eVar2 = fVar.f59805y;
                                if (j3 == 1) {
                                    z10 = true;
                                }
                                eVar2.X = z10;
                                return;
                            case 21938:
                                fVar.h(i7);
                                x3.e eVar3 = fVar.f59805y;
                                eVar3.f59768z = true;
                                eVar3.f59759p = (int) j3;
                                return;
                            case 21998:
                                fVar.h(i7);
                                fVar.f59805y.f59751g = (int) j3;
                                return;
                            case 22186:
                                fVar.h(i7);
                                fVar.f59805y.T = j3;
                                return;
                            case 22203:
                                fVar.h(i7);
                                fVar.f59805y.U = j3;
                                return;
                            case 25188:
                                fVar.h(i7);
                                fVar.f59805y.R = (int) j3;
                                return;
                            case 30114:
                                fVar.Z = j3;
                                return;
                            case 30321:
                                fVar.h(i7);
                                int i12 = (int) j3;
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        if (i12 != 2) {
                                            if (i12 == 3) {
                                                fVar.f59805y.f59763t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f59805y.f59763t = 2;
                                        return;
                                    }
                                    fVar.f59805y.f59763t = 1;
                                    return;
                                }
                                fVar.f59805y.f59763t = 0;
                                return;
                            case 2352003:
                                fVar.h(i7);
                                fVar.f59805y.f59750f = (int) j3;
                                return;
                            case 2807729:
                                fVar.f59801t = j3;
                                return;
                            default:
                                switch (i7) {
                                    case 21945:
                                        fVar.h(i7);
                                        int i13 = (int) j3;
                                        if (i13 != 1) {
                                            if (i13 == 2) {
                                                fVar.f59805y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f59805y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i7);
                                        int g10 = e2.m.g((int) j3);
                                        if (g10 != -1) {
                                            fVar.f59805y.B = g10;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i7);
                                        fVar.f59805y.f59768z = true;
                                        int f10 = e2.m.f((int) j3);
                                        if (f10 != -1) {
                                            fVar.f59805y.A = f10;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i7);
                                        fVar.f59805y.D = (int) j3;
                                        return;
                                    case 21949:
                                        fVar.h(i7);
                                        fVar.f59805y.E = (int) j3;
                                        return;
                                    default:
                                        return;
                                }
                        }
                    } else if (j3 != 1) {
                        throw e2.t0.a(null, "ContentEncodingScope " + j3 + " not supported");
                    }
                } else if (j3 != 0) {
                    throw e2.t0.a(null, "ContentEncodingOrder " + j3 + " not supported");
                }
            } else if (!fVar.f59806z) {
                fVar.g(i7);
                if (fVar.G == -1) {
                    fVar.G = j3;
                }
            }
        } else if (!fVar.f59806z) {
            fVar.g(i7);
            if (fVar.H == -1) {
                fVar.H = j3;
            }
        }
    }

    public ff(boolean z10) {
        this.f34589a = 10;
        this.f34590b = new AtomicBoolean(z10);
    }

    public ff(int i7) {
        this.f34589a = i7;
        switch (i7) {
            case 12:
                this.f34590b = new ArrayDeque(16);
                return;
            case 29:
                return;
            default:
                this.f34590b = h9.i0.p();
                return;
        }
    }

    public ff(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f34589a = 17;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f34590b = new t0.g(uri, clipDescription, uri2);
        } else {
            this.f34590b = new org.telegram.ui.ld0(uri, clipDescription, uri2, 16);
        }
    }

    public ff(Context context, f10 f10Var) {
        this.f34589a = 3;
        this.f34590b = new e10(context, f10Var);
    }

    @Override
    public float get() {
        org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.f34590b;
        int i7 = tp0Var.f57316z1;
        sg.h currentBrush = tp0Var.G0.getCurrentBrush();
        if (currentBrush == null) {
            return sg.k0.e(i7).f56693i;
        }
        return sg.k0.e(i7).f(String.valueOf(sg.h.f56640a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public void A(View view) {
    }

    @Override
    public void C(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void M(float f10) {
    }

    @Override
    public void Y(View view) {
    }

    @Override
    public void a(View view) {
    }

    @Override
    public void c(long j3) {
    }

    @Override
    public void j(wi.o oVar) {
    }

    @Override
    public void l0(ArrayList arrayList) {
    }

    @Override
    public void u0(int i7) {
    }

    @Override
    public void v0(String str) {
    }

    @Override
    public void x(View view) {
    }

    @Override
    public void G() {
    }

    @Override
    public void f() {
    }

    @Override
    public void o() {
    }

    @Override
    public void t() {
    }

    @Override
    public void j0(int i7, ArrayList arrayList) {
    }

    @Override
    public void s(float f10, float f11) {
    }

    @Override
    public void a0(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void e1(View view, float f10, float f11) {
    }

    @Override
    public void n(View view, float f10, float f11) {
    }

    @Override
    public void o0(Canvas canvas, int i7, int i10) {
    }

    @Override
    public void r(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
    }

    @Override
    public void v(View view, float f10, float f11) {
    }
}
