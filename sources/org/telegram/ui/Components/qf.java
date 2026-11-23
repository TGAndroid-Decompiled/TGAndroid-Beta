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
public final class qf implements oe0, s90, wi.l, r0.m, is0, ue.a, jg.y1, q5.b, x2.e1, com.google.android.gms.common.api.internal.q, tg.m1, sg.t0, u4.c, com.google.android.gms.common.api.internal.n, v4.e0, v4.k1 {
    public final int f38894a;
    public final Object f38895b;

    public qf(Object obj, int i7) {
        this.f38894a = i7;
        this.f38895b = obj;
    }

    @Override
    public void A() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void A0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f38895b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long C0 = C0();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + C0);
    }

    public void B0(long j3) {
        long C0 = C0();
        if (C0 != j3) {
            if (C0 != -1) {
                if (C0 == -2) {
                    C0 = -2;
                } else {
                    return;
                }
            }
            StringBuilder t6 = a8.p0.t(j3, "expected non-string scope or scope ", " but found ");
            t6.append(C0);
            throw new IOException(t6.toString());
        }
    }

    @Override
    public void C(int i7, Object obj) {
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
        ((ProfileInstallReceiver) this.f38895b).setResultCode(i7);
    }

    public long C0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f38895b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public View E() {
        return ((iu) this.f38895b).O1;
    }

    @Override
    public void E0() {
        ((k51) this.f38895b).h.c(false);
    }

    @Override
    public void F(int i7, int i10) {
        ((v4.i0) this.f38895b).j(i7, i10);
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public void I() {
        ((jt0) this.f38895b).J.a(-1);
    }

    @Override
    public int J() {
        return ((iu) this.f38895b).P1;
    }

    @Override
    public org.telegram.ui.ActionBar.y0 K(String str) {
        org.telegram.ui.ActionBar.g5 g5Var = ((jt0) this.f38895b).J;
        return g5Var.d(0, 0, null, str, true, true, g5Var.f29918n0);
    }

    @Override
    public a0.h K0() {
        return null;
    }

    @Override
    public void M(float f10, float f11) {
        Runnable runnable = ((k51) this.f38895b).f36793j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void M0(int i7, int i10) {
        ((v4.i0) this.f38895b).p(i7, i10);
    }

    @Override
    public boolean N() {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public Paint.FontMetricsInt P() {
        return ((ui) this.f38895b).C2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        yk0 yk0Var = (yk0) this.f38895b;
        yk0Var.f42450w.setPadding(I0.f15917a, I0.f15918b, I0.f15919c, I0.d);
        yk0Var.f42449s.requestLayout();
        return r0.l1.f56302b;
    }

    @Override
    public e2.c1 Q() {
        return null;
    }

    @Override
    public boolean Q0(float f10, float f11) {
        int L = org.telegram.messenger.g0.L(9.0f);
        RectF rectF = ((k51) this.f38895b).f36791g;
        float f12 = -L;
        rectF.inset(f12, f12);
        boolean contains = rectF.contains(f10, f11);
        float f13 = L;
        rectF.inset(f13, f13);
        return contains;
    }

    @Override
    public int R() {
        v4.p0 p0Var = (v4.p0) this.f38895b;
        return p0Var.f59259m - p0Var.E();
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void T(boolean z10) {
        ((ji.r) this.f38895b).setEditPillHidden(z10);
    }

    @Override
    public void U() {
        iu iuVar = (iu) this.f38895b;
        iuVar.N1 = null;
        iuVar.L0();
    }

    @Override
    public boolean V(boolean z10, float f10, fn0 fn0Var) {
        return false;
    }

    @Override
    public void W(RectF rectF) {
        ((ji.r) this.f38895b).l(rectF);
    }

    @Override
    public void Z() {
        ((iu) this.f38895b).M0();
    }

    @Override
    public boolean Z0(View view, float f10, float f11) {
        return false;
    }

    @Override
    public int a(View view) {
        return v4.p0.x(view) - ((ViewGroup.MarginLayoutParams) ((v4.q0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public int a0() {
        return ((iu) this.f38895b).Q1;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i7 = this.f38894a;
        Object obj3 = this.f38895b;
        switch (i7) {
            case 17:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                s6.c cVar = (s6.c) ((s6.e) obj).n();
                Parcel j12 = cVar.j1();
                n7.a.b(j12, (q6.p) obj3);
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
                y8.e eVar = (y8.e) obj3;
                h8.b bVar = (h8.b) obj;
                bVar.getClass();
                h8.a aVar = new h8.a(1, (TaskCompletionSource) obj2);
                try {
                    h8.i iVar = (h8.i) bVar.n();
                    Bundle B = bVar.B();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = h8.c.f13982a;
                    obtain.writeInt(1);
                    eVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f13990a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
                    Bundle bundle = Bundle.EMPTY;
                    a8.l8.a(Status.h, Boolean.FALSE, aVar.f13981b);
                    return;
                }
        }
    }

    @Override
    public void b() {
        z71 z71Var = ((iu) this.f38895b).n1;
        if (z71Var != null && z71Var.f42730x) {
            z71Var.f42709a.g0();
            z71Var.n();
            z71Var.f42720g0.d(true, true);
        }
    }

    @Override
    public float b0() {
        return 0.0f;
    }

    @Override
    public void c0(x2.f1 f1Var) {
        r2.p pVar = (r2.p) f1Var;
        r2.j jVar = (r2.j) this.f38895b;
        jVar.H.c0(jVar);
    }

    @Override
    public View d0(int i7) {
        return ((v4.p0) this.f38895b).q(i7);
    }

    @Override
    public a0.h d1() {
        return null;
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public void e0() {
        tg.p0 p0Var = (tg.p0) this.f38895b;
        p0Var.f58115b.f57316a.u();
        p0Var.f58123x.setViewHidden(false);
        PhotoViewer photoViewer = ((org.telegram.ui.up0) p0Var).L;
        Drawable[] drawableArr = PhotoViewer.Z8;
        photoViewer.V2(true, true);
    }

    @Override
    public int f0(View view) {
        return v4.p0.y(view) + ((ViewGroup.MarginLayoutParams) ((v4.q0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public void g0(int i7, int i10) {
        ((v4.i0) this.f38895b).o(i7, i10);
    }

    @Override
    public void g1(int i7, int i10) {
        ((v4.i0) this.f38895b).n(i7, i10, null);
    }

    @Override
    public Object mo24get() {
        switch (this.f38894a) {
            case 9:
                return new org.telegram.ui.md0((Context) ((e.a) this.f38895b).f10209a, new qb.a(28), new pb.b(28), 5);
            default:
                return new v5.i(Integer.valueOf(v5.i.d).intValue(), (Context) ((fd.a) this.f38895b).mo24get(), "com.google.android.datatransport.events");
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
    public org.telegram.ui.ActionBar.y0 i0(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        jt0 jt0Var = (jt0) this.f38895b;
        org.telegram.ui.ActionBar.y0 e10 = jt0Var.J.e(0, i7, str);
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.m6.f29602p7;
            e10.d(jt0Var.s0(i10), jt0Var.s0(i10));
        }
        e10.setOnClickListener(new xa0(this, z11, runnable));
        return e10;
    }

    @Override
    public void j() {
        tg.p0 p0Var = (tg.p0) this.f38895b;
        p0Var.f58117e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new hi.j3(p0Var, 26)).setInterpolator(nr.h);
    }

    @Override
    public ji.r k0() {
        return (ji.r) this.f38895b;
    }

    @Override
    public long l() {
        return 0L;
    }

    @Override
    public void l0(int i7, int i10, CharSequence charSequence, boolean z10) {
        ui uiVar = (ui) this.f38895b;
        if (uiVar.b1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(uiVar.b1().getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                org.telegram.messenger.j6.l(spannableStringBuilder, uiVar.b1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            uiVar.b1().setText(spannableStringBuilder);
            uiVar.b1().setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public boolean m0() {
        return true;
    }

    @Override
    public boolean m1() {
        return false;
    }

    @Override
    public void n0() {
        ((tg.p0) this.f38895b).f58123x.setViewHidden(true);
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public boolean p() {
        iu iuVar = (iu) this.f38895b;
        if (iuVar.O1 == iuVar.f36311m1 && iuVar.f36322y1 && "inapp".equals(org.telegram.messenger.np.u1(iuVar.f30173a).D3)) {
            return false;
        }
        return true;
    }

    @Override
    public void q(Object obj) {
        com.google.android.gms.common.api.internal.m mVar;
        org.telegram.messenger.y9 y9Var = (org.telegram.messenger.y9) obj;
        androidx.activity.n nVar = ((u7.i) this.f38895b).f58493b;
        synchronized (nVar) {
            nVar.f1807b = false;
            mVar = ((com.google.android.gms.common.api.internal.o) nVar.f1808c).f6367b;
        }
        if (mVar != null) {
            ((u7.c) nVar.d).c(mVar, 2441);
        }
    }

    @Override
    public void r(int i7) {
        org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) this.f38895b;
        if (!naVar.f44715r && i7 == naVar.K) {
            naVar.j0(naVar.O.getText().toString().trim());
        }
    }

    public void r0(int i7, int i10, f3.p pVar) {
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
        x3.f fVar = (x3.f) this.f38895b;
        x3.g gVar = fVar.f60392b;
        SparseArray sparseArray = fVar.f60394c;
        h2.x xVar = fVar.f60408k;
        h2.x xVar2 = fVar.f60404i;
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
                                        fVar.f60421y.f60382x = bArr2;
                                        pVar.readFully(bArr2, 0, i10);
                                        return;
                                    }
                                    throw e2.t0.a(null, "Unexpected id: " + i7);
                                }
                                fVar.h(i7);
                                byte[] bArr3 = new byte[i10];
                                fVar.f60421y.f60371l = bArr3;
                                pVar.readFully(bArr3, 0, i10);
                                return;
                            }
                            Arrays.fill(xVar.f13865a, (byte) 0);
                            pVar.readFully(xVar.f13865a, 4 - i10, i10);
                            xVar.N(0);
                            fVar.A = (int) xVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i10];
                        pVar.readFully(bArr4, 0, i10);
                        fVar.h(i7);
                        fVar.f60421y.f60370k = new f3.h0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i7);
                    byte[] bArr5 = new byte[i10];
                    fVar.f60421y.f60369j = bArr5;
                    pVar.readFully(bArr5, 0, i10);
                    return;
                }
                fVar.h(i7);
                x3.e eVar = fVar.f60421y;
                int i24 = eVar.h;
                if (i24 != 1685485123 && i24 != 1685480259) {
                    pVar.r(i10);
                    return;
                }
                byte[] bArr6 = new byte[i10];
                eVar.P = bArr6;
                pVar.readFully(bArr6, 0, i10);
                return;
            } else if (fVar.O == 2) {
                x3.e eVar2 = (x3.e) sparseArray.get(fVar.U);
                int i25 = fVar.X;
                h2.x xVar3 = fVar.f60413p;
                if (i25 == 4 && "V_VP9".equals(eVar2.f60363c)) {
                    xVar3.K(i10);
                    pVar.readFully(xVar3.f13865a, 0, i10);
                    return;
                }
                pVar.r(i10);
                return;
            } else {
                return;
            }
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.f60425c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        x3.e eVar3 = (x3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.r(i10 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.f60360a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i26 = (xVar2.f13865a[2] & 6) >> 1;
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
                int i27 = (xVar2.f13865a[3] & 255) + 1;
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
                            int i32 = xVar2.f13865a[i31] & 255;
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
                            if (xVar2.f13865a[i35] != 0) {
                                int i38 = i22;
                                while (true) {
                                    if (i38 < 8) {
                                        int i39 = i23 << (7 - i38);
                                        i14 = i21;
                                        if ((xVar2.f13865a[i35] & i39) != 0) {
                                            int i40 = i37 + i38;
                                            fVar.l(pVar, i40);
                                            i15 = i23;
                                            j3 = xVar2.f13865a[i35] & b10 & (~i39);
                                            while (i37 < i40) {
                                                j3 = (j3 << 8) | (xVar2.f13865a[i37] & b10);
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
            int i42 = xVar2.f13865a[i13] & 255;
            fVar.P = fVar.n(i42 | (bArr[i12] << 8)) + fVar.M;
            if (eVar3.f60365e != i13 && (i7 != 163 || (xVar2.f13865a[i11] & 128) != 128)) {
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
                    fVar.i(eVar3, ((fVar.R * eVar3.f60366f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i43], false), 0);
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
    public boolean s() {
        return false;
    }

    public ClipDescription s0() {
        return ((t0.h) this.f38895b).getDescription();
    }

    @Override
    public void t0() {
        ((k51) this.f38895b).h.c(true);
    }

    @Override
    public void u(Rect rect) {
        rect.setEmpty();
    }

    public void u0(int i7, long j3) {
        x3.f fVar = (x3.f) this.f38895b;
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
                                                fVar.f60421y.f60365e = -1;
                                                return;
                                            }
                                            fVar.h(i7);
                                            fVar.f60421y.f60365e = 5;
                                            return;
                                        }
                                        fVar.h(i7);
                                        fVar.f60421y.f60365e = 3;
                                        return;
                                    }
                                    fVar.h(i7);
                                    fVar.f60421y.f60365e = 1;
                                    return;
                                }
                                fVar.h(i7);
                                fVar.f60421y.f60365e = 2;
                                return;
                            case 136:
                                fVar.h(i7);
                                x3.e eVar = fVar.f60421y;
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
                                fVar.f60421y.Q = (int) j3;
                                return;
                            case 176:
                                fVar.h(i7);
                                fVar.f60421y.f60373n = (int) j3;
                                return;
                            case 179:
                                if (!fVar.f60422z) {
                                    fVar.g(i7);
                                    fVar.E = fVar.n(j3);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i7);
                                fVar.f60421y.f60374o = (int) j3;
                                return;
                            case 215:
                                fVar.h(i7);
                                fVar.f60421y.d = (int) j3;
                                return;
                            case 231:
                                fVar.M = fVar.n(j3);
                                return;
                            case 238:
                                fVar.X = (int) j3;
                                return;
                            case 247:
                                if (!fVar.f60422z) {
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
                                fVar.f60421y.h = (int) j3;
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
                                fVar.B = j3 + fVar.f60416s;
                                return;
                            case 21432:
                                int i11 = (int) j3;
                                fVar.h(i7);
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        if (i11 != 3) {
                                            if (i11 == 15) {
                                                fVar.f60421y.f60383y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f60421y.f60383y = 1;
                                        return;
                                    }
                                    fVar.f60421y.f60383y = 2;
                                    return;
                                }
                                fVar.f60421y.f60383y = 0;
                                return;
                            case 21680:
                                fVar.h(i7);
                                fVar.f60421y.f60376q = (int) j3;
                                return;
                            case 21682:
                                fVar.h(i7);
                                fVar.f60421y.f60378s = (int) j3;
                                return;
                            case 21690:
                                fVar.h(i7);
                                fVar.f60421y.f60377r = (int) j3;
                                return;
                            case 21930:
                                fVar.h(i7);
                                x3.e eVar2 = fVar.f60421y;
                                if (j3 == 1) {
                                    z10 = true;
                                }
                                eVar2.X = z10;
                                return;
                            case 21938:
                                fVar.h(i7);
                                x3.e eVar3 = fVar.f60421y;
                                eVar3.f60384z = true;
                                eVar3.f60375p = (int) j3;
                                return;
                            case 21998:
                                fVar.h(i7);
                                fVar.f60421y.f60367g = (int) j3;
                                return;
                            case 22186:
                                fVar.h(i7);
                                fVar.f60421y.T = j3;
                                return;
                            case 22203:
                                fVar.h(i7);
                                fVar.f60421y.U = j3;
                                return;
                            case 25188:
                                fVar.h(i7);
                                fVar.f60421y.R = (int) j3;
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
                                                fVar.f60421y.f60379t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f60421y.f60379t = 2;
                                        return;
                                    }
                                    fVar.f60421y.f60379t = 1;
                                    return;
                                }
                                fVar.f60421y.f60379t = 0;
                                return;
                            case 2352003:
                                fVar.h(i7);
                                fVar.f60421y.f60366f = (int) j3;
                                return;
                            case 2807729:
                                fVar.f60417t = j3;
                                return;
                            default:
                                switch (i7) {
                                    case 21945:
                                        fVar.h(i7);
                                        int i13 = (int) j3;
                                        if (i13 != 1) {
                                            if (i13 == 2) {
                                                fVar.f60421y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f60421y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i7);
                                        int g10 = e2.m.g((int) j3);
                                        if (g10 != -1) {
                                            fVar.f60421y.B = g10;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i7);
                                        fVar.f60421y.f60384z = true;
                                        int f10 = e2.m.f((int) j3);
                                        if (f10 != -1) {
                                            fVar.f60421y.A = f10;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i7);
                                        fVar.f60421y.D = (int) j3;
                                        return;
                                    case 21949:
                                        fVar.h(i7);
                                        fVar.f60421y.E = (int) j3;
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
            } else if (!fVar.f60422z) {
                fVar.g(i7);
                if (fVar.G == -1) {
                    fVar.G = j3;
                }
            }
        } else if (!fVar.f60422z) {
            fVar.g(i7);
            if (fVar.H == -1) {
                fVar.H = j3;
            }
        }
    }

    @Override
    public View v(LaunchActivity launchActivity) {
        return null;
    }

    public void v0() {
        r2.p[] pVarArr;
        r2.p[] pVarArr2;
        r2.j jVar = (r2.j) this.f38895b;
        int i7 = jVar.I - 1;
        jVar.I = i7;
        if (i7 > 0) {
            return;
        }
        int i10 = 0;
        for (r2.p pVar : jVar.K) {
            pVar.h();
            i10 += pVar.Z.f60258a;
        }
        e2.m1[] m1VarArr = new e2.m1[i10];
        int i11 = 0;
        for (r2.p pVar2 : jVar.K) {
            pVar2.h();
            int i12 = pVar2.Z.f60258a;
            int i13 = 0;
            while (i13 < i12) {
                pVar2.h();
                m1VarArr[i11] = pVar2.Z.a(i13);
                i13++;
                i11++;
            }
        }
        jVar.J = new x2.r1(m1VarArr);
        jVar.H.m(jVar);
    }

    @Override
    public boolean v1(int i7) {
        return true;
    }

    public boolean w0(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qf.w0(android.view.MotionEvent):boolean");
    }

    public void x0(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.f38895b;
        View childAt = recyclerView.getChildAt(i7);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i7);
    }

    @Override
    public boolean y() {
        return true;
    }

    public void y0(long j3, int i7, long j10) {
        x3.f fVar = (x3.f) this.f38895b;
        fVar.f60407j0.getClass();
        if (i7 != 160) {
            if (i7 != 174) {
                if (i7 != 183) {
                    if (i7 != 187) {
                        if (i7 != 19899) {
                            if (i7 != 20533) {
                                if (i7 != 21968) {
                                    if (i7 != 408125543) {
                                        if (i7 != 475249515) {
                                            if (i7 == 524531317 && !fVar.f60422z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f60407j0.j(new f3.t(fVar.v));
                                                fVar.f60422z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f60422z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j11 = fVar.f60416s;
                                    if (j11 != -1 && j11 != j3) {
                                        throw e2.t0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f60416s = j3;
                                    fVar.f60415r = j10;
                                    return;
                                }
                                fVar.h(i7);
                                fVar.f60421y.f60384z = true;
                                return;
                            }
                            fVar.h(i7);
                            fVar.f60421y.f60368i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f60422z) {
                        fVar.g(i7);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f60422z) {
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
            obj.f60373n = -1;
            obj.f60374o = -1;
            obj.f60375p = -1;
            obj.f60376q = -1;
            obj.f60377r = -1;
            obj.f60378s = 0;
            obj.f60379t = -1;
            obj.f60380u = 0.0f;
            obj.v = 0.0f;
            obj.f60381w = 0.0f;
            obj.f60382x = null;
            obj.f60383y = -1;
            obj.f60384z = false;
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
            fVar.f60421y = obj;
            obj.f60359a = fVar.f60419w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    @Override
    public void y1(float f10) {
        org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f38895b;
        sg.k0.e(vp0Var.f57946z1).k(String.valueOf(sg.h.f57259a.indexOf(vp0Var.G0.getCurrentBrush())), f10);
        sg.h1 h1Var = vp0Var.f57936u1;
        h1Var.f57265c = f10;
        vp0Var.s0(h1Var, null);
    }

    @Override
    public int z() {
        return ((v4.p0) this.f38895b).D();
    }

    public void z0(int i7, String str) {
        x3.f fVar = (x3.f) this.f38895b;
        if (i7 != 134) {
            if (i7 != 17026) {
                if (i7 != 21358) {
                    if (i7 != 2274716) {
                        return;
                    }
                    fVar.h(i7);
                    fVar.f60421y.Z = str;
                    return;
                }
                fVar.h(i7);
                fVar.f60421y.f60361b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw e2.t0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f60419w = str.equals("webm");
                return;
            }
        }
        fVar.h(i7);
        fVar.f60421y.f60363c = str;
    }

    public qf(boolean z10) {
        this.f38894a = 10;
        this.f38895b = new AtomicBoolean(z10);
    }

    public qf(int i7) {
        this.f38894a = i7;
        switch (i7) {
            case 12:
                this.f38895b = new ArrayDeque(16);
                return;
            default:
                this.f38895b = h9.i0.p();
                return;
        }
    }

    public qf(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f38894a = 18;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f38895b = new t0.g(uri, clipDescription, uri2);
        } else {
            this.f38895b = new org.telegram.ui.md0(uri, clipDescription, uri2, 16);
        }
    }

    public qf(Context context, p10 p10Var) {
        this.f38894a = 3;
        this.f38895b = new o10(context, p10Var);
    }

    @Override
    public float get() {
        org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.f38895b;
        int i7 = vp0Var.f57946z1;
        sg.h currentBrush = vp0Var.G0.getCurrentBrush();
        if (currentBrush == null) {
            return sg.k0.e(i7).f57312i;
        }
        return sg.k0.e(i7).f(String.valueOf(sg.h.f57259a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public void B(View view) {
    }

    @Override
    public void D(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void L(float f10) {
    }

    @Override
    public void P1(ArrayList arrayList) {
    }

    @Override
    public void X(View view) {
    }

    @Override
    public void c(long j3) {
    }

    @Override
    public void d(View view) {
    }

    @Override
    public void i(wi.o oVar) {
    }

    @Override
    public void p0(int i7) {
    }

    @Override
    public void q0(String str) {
    }

    @Override
    public void w(View view) {
    }

    @Override
    public void H() {
    }

    @Override
    public void f() {
    }

    @Override
    public void k() {
    }

    @Override
    public void n() {
    }

    @Override
    public void h0(int i7, ArrayList arrayList) {
    }

    @Override
    public void t(float f10, float f11) {
    }

    @Override
    public void Y(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void e1(View view, float f10, float f11) {
    }

    @Override
    public void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
    }

    @Override
    public void j0(Canvas canvas, int i7, int i10) {
    }

    @Override
    public void o(View view, float f10, float f11) {
    }

    @Override
    public void x(View view, float f10, float f11) {
    }
}
