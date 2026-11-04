package org.telegram.ui.Components;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
public final class y00 implements c51, org.telegram.messenger.ec, kg.u1, vr0, l61, org.telegram.ui.r9, qe.b, t2.m, com.google.android.gms.common.api.internal.n, p5.b, ug.k1, tg.t0, com.google.android.gms.common.api.internal.p, y2.d, SuccessContinuation {
    public Object f40562a;

    public y00(Object obj) {
        this.f40562a = obj;
    }

    public static String C(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static boolean w(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public void A(long j10, int i3, long j11) {
        w3.f fVar = (w3.f) this.f40562a;
        fVar.f57357j0.getClass();
        if (i3 != 160) {
            if (i3 != 174) {
                if (i3 != 183) {
                    if (i3 != 187) {
                        if (i3 != 19899) {
                            if (i3 != 20533) {
                                if (i3 != 21968) {
                                    if (i3 != 408125543) {
                                        if (i3 != 475249515) {
                                            if (i3 == 524531317 && !fVar.f57372z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f57357j0.f(new e3.t(fVar.v));
                                                fVar.f57372z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f57372z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j12 = fVar.f57366s;
                                    if (j12 != -1 && j12 != j10) {
                                        throw d2.v0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f57366s = j10;
                                    fVar.f57365r = j11;
                                    return;
                                }
                                fVar.h(i3);
                                fVar.f57371y.f57334z = true;
                                return;
                            }
                            fVar.h(i3);
                            fVar.f57371y.f57318i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f57372z) {
                        fVar.g(i3);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f57372z) {
                    fVar.g(i3);
                    fVar.F = -1;
                    fVar.G = -1L;
                    fVar.H = -1L;
                    return;
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f57323n = -1;
            obj.f57324o = -1;
            obj.f57325p = -1;
            obj.f57326q = -1;
            obj.f57327r = -1;
            obj.f57328s = 0;
            obj.f57329t = -1;
            obj.f57330u = 0.0f;
            obj.v = 0.0f;
            obj.f57331w = 0.0f;
            obj.f57332x = null;
            obj.f57333y = -1;
            obj.f57334z = false;
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
            fVar.f57371y = obj;
            obj.f57309a = fVar.f57369w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    public void B(int i3, String str) {
        w3.f fVar = (w3.f) this.f40562a;
        if (i3 != 134) {
            if (i3 != 17026) {
                if (i3 != 21358) {
                    if (i3 != 2274716) {
                        return;
                    }
                    fVar.h(i3);
                    fVar.f57371y.Z = str;
                    return;
                }
                fVar.h(i3);
                fVar.f57371y.f57311b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw d2.v0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f57369w = str.equals("webm");
                return;
            }
        }
        fVar.h(i3);
        fVar.f57371y.f57313c = str;
    }

    @Override
    public a0.h C0() {
        return null;
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
        rf0 rf0Var = ((uf0) this.f40562a).h.H0;
        if (rf0Var != null) {
            rf0Var.d();
        }
    }

    @Override
    public void F(float f10, int i3) {
        ((qe.h) this.f40562a).h(f10);
    }

    @Override
    public boolean J1(int i3) {
        if (i3 == ((lo0) this.f40562a).f35803r) {
            return true;
        }
        return false;
    }

    @Override
    public void M(String str) {
        org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f40562a;
        try {
            w0Var.Q = System.currentTimeMillis();
            w0Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public String M0() {
        return ((org.telegram.ui.web.w0) this.f40562a).f51074j0;
    }

    @Override
    public void N() {
        ug.n0 n0Var = (ug.n0) this.f40562a;
        n0Var.f56168b.f55239a.o();
        n0Var.f56176x.setViewHidden(false);
        PhotoViewer photoViewer = ((org.telegram.ui.kp0) n0Var).L;
        Drawable[] drawableArr = PhotoViewer.V8;
        photoViewer.a3(true, true);
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        ((qe.h) this.f40562a).h(f10);
    }

    @Override
    public void Z() {
        ((ug.n0) this.f40562a).f56176x.setViewHidden(true);
    }

    @Override
    public void a(int i3, j2.d dVar, long j10, int i10) {
        ((MediaCodec) this.f40562a).queueSecureInputBuffer(i3, 0, dVar.f16153i, j10, i10);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        x8.e eVar = (x8.e) this.f40562a;
        g8.b bVar = (g8.b) obj;
        bVar.getClass();
        g8.a aVar = new g8.a(1, (TaskCompletionSource) obj2);
        try {
            g8.i iVar = (g8.i) bVar.m();
            Bundle A = bVar.A();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i3 = g8.c.f12035a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            A.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f12043a.transact(14, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
            Bundle bundle = Bundle.EMPTY;
            b8.y9.a(Status.h, Boolean.FALSE, aVar.f12034b);
        }
    }

    @Override
    public void b(int i3, int i10, int i11, long j10) {
        ((MediaCodec) this.f40562a).queueInputBuffer(i3, 0, i10, j10, i11);
    }

    @Override
    public void c(Object obj) {
        Location location;
        org.telegram.messenger.ka kaVar = ((org.telegram.messenger.t9) obj).f25492a;
        List list = ((LocationResult) this.f40562a).f7747a;
        int size = list.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) list.get(size - 1);
        }
        gi.w5 w5Var = (gi.w5) kaVar;
        if (location == null) {
            w5Var.getClass();
        } else {
            ((org.telegram.messenger.ld) w5Var.f13798b).m(location);
        }
    }

    @Override
    public void e() {
        ((f60) this.f40562a).k();
    }

    @Override
    public boolean e1(String str, org.telegram.ui.i9 i9Var) {
        return false;
    }

    @Override
    public void f() {
        ug.n0 n0Var = (ug.n0) this.f40562a;
        n0Var.f56170e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new gi.j3(n0Var, 25)).setInterpolator(xq.h);
    }

    public void g(int i3, int i10, e3.p pVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        int i16;
        int i17;
        int i18;
        int i19;
        byte[] bArr;
        int i20;
        w3.f fVar = (w3.f) this.f40562a;
        w3.g gVar = fVar.f57342b;
        SparseArray sparseArray = fVar.f57344c;
        g2.y yVar = fVar.f57358k;
        g2.y yVar2 = fVar.f57354i;
        int i21 = 2;
        int i22 = 0;
        int i23 = 1;
        if (i3 != 161 && i3 != 163) {
            if (i3 != 165) {
                if (i3 != 16877) {
                    if (i3 != 16981) {
                        if (i3 != 18402) {
                            if (i3 != 21419) {
                                if (i3 != 25506) {
                                    if (i3 == 30322) {
                                        fVar.h(i3);
                                        byte[] bArr2 = new byte[i10];
                                        fVar.f57371y.f57332x = bArr2;
                                        pVar.readFully(bArr2, 0, i10);
                                        return;
                                    }
                                    throw d2.v0.a(null, "Unexpected id: " + i3);
                                }
                                fVar.h(i3);
                                byte[] bArr3 = new byte[i10];
                                fVar.f57371y.f57321l = bArr3;
                                pVar.readFully(bArr3, 0, i10);
                                return;
                            }
                            Arrays.fill(yVar.f11923a, (byte) 0);
                            pVar.readFully(yVar.f11923a, 4 - i10, i10);
                            yVar.N(0);
                            fVar.A = (int) yVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i10];
                        pVar.readFully(bArr4, 0, i10);
                        fVar.h(i3);
                        fVar.f57371y.f57320k = new e3.h0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i3);
                    byte[] bArr5 = new byte[i10];
                    fVar.f57371y.f57319j = bArr5;
                    pVar.readFully(bArr5, 0, i10);
                    return;
                }
                fVar.h(i3);
                w3.e eVar = fVar.f57371y;
                int i24 = eVar.h;
                if (i24 != 1685485123 && i24 != 1685480259) {
                    pVar.u(i10);
                    return;
                }
                byte[] bArr6 = new byte[i10];
                eVar.P = bArr6;
                pVar.readFully(bArr6, 0, i10);
                return;
            } else if (fVar.O == 2) {
                w3.e eVar2 = (w3.e) sparseArray.get(fVar.U);
                int i25 = fVar.X;
                g2.y yVar3 = fVar.f57363p;
                if (i25 == 4 && "V_VP9".equals(eVar2.f57313c)) {
                    yVar3.K(i10);
                    pVar.readFully(yVar3.f11923a, 0, i10);
                    return;
                }
                pVar.u(i10);
                return;
            } else {
                return;
            }
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.f57375c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            yVar2.K(0);
        }
        w3.e eVar3 = (w3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.u(i10 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.f57310a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i26 = (yVar2.f11923a[2] & 6) >> 1;
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
                int i27 = (yVar2.f11923a[3] & 255) + 1;
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
                            int i32 = yVar2.f11923a[i31] & 255;
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
                            if (yVar2.f11923a[i35] != 0) {
                                int i38 = i22;
                                while (true) {
                                    if (i38 < 8) {
                                        int i39 = i23 << (7 - i38);
                                        i14 = i21;
                                        if ((yVar2.f11923a[i35] & i39) != 0) {
                                            int i40 = i37 + i38;
                                            fVar.l(pVar, i40);
                                            i15 = i23;
                                            j10 = yVar2.f11923a[i35] & b10 & (~i39);
                                            while (i37 < i40) {
                                                j10 = (j10 << 8) | (yVar2.f11923a[i37] & b10);
                                                i37++;
                                                i40 = i40;
                                                b10 = 255;
                                            }
                                            i16 = i40;
                                            if (i33 > 0) {
                                                j10 -= (1 << ((i38 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i38++;
                                            i21 = i14;
                                            b10 = 255;
                                        }
                                    } else {
                                        i14 = i21;
                                        i15 = i23;
                                        j10 = 0;
                                        i16 = i37;
                                        break;
                                    }
                                }
                                if (j10 < -2147483648L || j10 > 2147483647L) {
                                    break;
                                }
                                int i41 = (int) j10;
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
                                throw d2.v0.a(null, "No valid varint length mask found");
                            }
                        } else {
                            i11 = i21;
                            i12 = i22;
                            i13 = i23;
                            fVar.T[i36] = ((i10 - fVar.V) - i35) - i34;
                            break;
                        }
                    }
                    throw d2.v0.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw d2.v0.a(null, "Unexpected lacing value: " + i26);
                }
            }
            i11 = 2;
            i12 = 0;
            i13 = 1;
            int i42 = yVar2.f11923a[i13] & 255;
            fVar.P = fVar.n(i42 | (bArr[i12] << 8)) + fVar.M;
            if (eVar3.f57315e != i13 && (i3 != 163 || (yVar2.f11923a[i11] & 128) != 128)) {
                i20 = i12;
            } else {
                i20 = 1;
            }
            fVar.W = i20;
            fVar.O = i11;
            fVar.R = i12;
        }
        if (i3 == 163) {
            while (true) {
                int i43 = fVar.R;
                if (i43 < fVar.S) {
                    fVar.i(eVar3, ((fVar.R * eVar3.f57316f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i43], false), 0);
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
    public Object mo5get() {
        String packageName = ((Context) ((cd.a) this.f40562a).mo5get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public org.telegram.ui.ActionBar.y0 h(String str) {
        org.telegram.ui.ActionBar.y0 h = ((f60) this.f40562a).h();
        h.setText(str);
        return h;
    }

    public boolean i(int i3) {
        f61 f61Var = ((n61) this.f40562a).M;
        if (f61Var == null) {
            return false;
        }
        return f61Var.c(i3);
    }

    @Override
    public void invalidate() {
        ((ie0) this.f40562a).h.invalidate();
    }

    public boolean j(String str) {
        String u10 = u(str);
        if (!"1".equals(u10) && !Boolean.parseBoolean(u10)) {
            return false;
        }
        return true;
    }

    @Override
    public a0.h k1() {
        return null;
    }

    public ClipDescription l() {
        return ((t0.h) this.f40562a).getDescription();
    }

    @Override
    public org.telegram.ui.ActionBar.y0 n(int i3, Runnable runnable, String str, boolean z10, boolean z11) {
        f60 f60Var = (f60) this.f40562a;
        int x10 = f60Var.x();
        f60Var.c(i3, str, new ci.v6(runnable, z11, f60Var, 25), z10);
        View w10 = f60Var.w(x10);
        if (w10 instanceof org.telegram.ui.ActionBar.y0) {
            return (org.telegram.ui.ActionBar.y0) w10;
        }
        return null;
    }

    public Integer o(String str) {
        String u10 = u(str);
        if (!TextUtils.isEmpty(u10)) {
            try {
                return Integer.valueOf(Integer.parseInt(u10));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + C(str) + "(" + u10 + ") into an int");
                return null;
            }
        }
        return null;
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f40562a;
        w0Var.y("scan_qr_popup_closed", null);
        w0Var.f51073i0 = false;
    }

    public JSONArray p(String str) {
        String u10 = u(str);
        if (!TextUtils.isEmpty(u10)) {
            try {
                return new JSONArray(u10);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + C(str) + ": " + u10 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    @Override
    public boolean q() {
        return true;
    }

    @Override
    public void r(int i3) {
        lo0 lo0Var = (lo0) this.f40562a;
        oo0 oo0Var = lo0Var.L;
        lo0Var.f35804s = i3;
        if (lo0Var.f35805w != i3) {
            lo0Var.d.clear();
        }
        int i10 = lo0Var.K;
        if (lo0Var.b() == 0 && !lo0Var.f35800e.e() && !lo0Var.J) {
            oo0Var.J1.e(false, true);
        } else {
            oo0Var.f36896q2.b(i10);
        }
        lo0Var.f();
        int i11 = oo0.R2;
        oo0Var.K0(true);
    }

    @Override
    public void s(float f10) {
        org.telegram.ui.lp0 lp0Var = (org.telegram.ui.lp0) this.f40562a;
        tg.k0.e(lp0Var.f56002z1).k(String.valueOf(tg.h.f55183a.indexOf(lp0Var.G0.getCurrentBrush())), f10);
        tg.h1 h1Var = lp0Var.f55992u1;
        h1Var.f55188c = f10;
        lp0Var.s0(h1Var, null);
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f40562a).setParameters(bundle);
    }

    public String t(Resources resources, String str, String str2) {
        String[] strArr;
        String u10 = u(str2);
        if (!TextUtils.isEmpty(u10)) {
            return u10;
        }
        String u11 = u(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(u11)) {
            return null;
        }
        int identifier = resources.getIdentifier(u11, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", C(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray p10 = p(str2.concat("_loc_args"));
        if (p10 == null) {
            strArr = null;
        } else {
            int length = p10.length();
            strArr = new String[length];
            for (int i3 = 0; i3 < length; i3++) {
                strArr[i3] = p10.optString(i3);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + C(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            return null;
        }
    }

    @Override
    public Task then(Object obj) {
        ha.b bVar = (ha.b) obj;
        ua.b bVar2 = (ua.b) this.f40562a;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        z9.m mVar = (z9.m) bVar2.f55784c;
        z9.m.b((z9.m) bVar2.f55784c);
        mVar.f60205m.h(null, mVar.f60198e.f286a);
        mVar.f60209q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String u(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f40562a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public void v(int i3, long j10) {
        w3.f fVar = (w3.f) this.f40562a;
        if (i3 != 240) {
            if (i3 != 241) {
                if (i3 != 20529) {
                    if (i3 != 20530) {
                        boolean z10 = false;
                        switch (i3) {
                            case 131:
                                int i10 = (int) j10;
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 17) {
                                            if (i10 != 33) {
                                                fVar.h(i3);
                                                fVar.f57371y.f57315e = -1;
                                                return;
                                            }
                                            fVar.h(i3);
                                            fVar.f57371y.f57315e = 5;
                                            return;
                                        }
                                        fVar.h(i3);
                                        fVar.f57371y.f57315e = 3;
                                        return;
                                    }
                                    fVar.h(i3);
                                    fVar.f57371y.f57315e = 1;
                                    return;
                                }
                                fVar.h(i3);
                                fVar.f57371y.f57315e = 2;
                                return;
                            case 136:
                                fVar.h(i3);
                                w3.e eVar = fVar.f57371y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                eVar.Y = z10;
                                return;
                            case 155:
                                fVar.Q = fVar.n(j10);
                                return;
                            case 159:
                                fVar.h(i3);
                                fVar.f57371y.Q = (int) j10;
                                return;
                            case 176:
                                fVar.h(i3);
                                fVar.f57371y.f57323n = (int) j10;
                                return;
                            case 179:
                                if (!fVar.f57372z) {
                                    fVar.g(i3);
                                    fVar.E = fVar.n(j10);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i3);
                                fVar.f57371y.f57324o = (int) j10;
                                return;
                            case 215:
                                fVar.h(i3);
                                fVar.f57371y.d = (int) j10;
                                return;
                            case 231:
                                fVar.M = fVar.n(j10);
                                return;
                            case 238:
                                fVar.X = (int) j10;
                                return;
                            case 247:
                                if (!fVar.f57372z) {
                                    fVar.g(i3);
                                    fVar.F = (int) j10;
                                    return;
                                }
                                return;
                            case 251:
                                fVar.Y = true;
                                return;
                            case 16871:
                                fVar.h(i3);
                                fVar.f57371y.h = (int) j10;
                                return;
                            case 16980:
                                if (j10 != 3) {
                                    throw d2.v0.a(null, "ContentCompAlgo " + j10 + " not supported");
                                }
                                return;
                            case 17029:
                                if (j10 < 1 || j10 > 2) {
                                    throw d2.v0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 17143:
                                if (j10 != 1) {
                                    throw d2.v0.a(null, "EBMLReadVersion " + j10 + " not supported");
                                }
                                return;
                            case 18401:
                                if (j10 != 5) {
                                    throw d2.v0.a(null, "ContentEncAlgo " + j10 + " not supported");
                                }
                                return;
                            case 18408:
                                if (j10 != 1) {
                                    throw d2.v0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
                                }
                                return;
                            case 21420:
                                fVar.B = j10 + fVar.f57366s;
                                return;
                            case 21432:
                                int i11 = (int) j10;
                                fVar.h(i3);
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        if (i11 != 3) {
                                            if (i11 == 15) {
                                                fVar.f57371y.f57333y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f57371y.f57333y = 1;
                                        return;
                                    }
                                    fVar.f57371y.f57333y = 2;
                                    return;
                                }
                                fVar.f57371y.f57333y = 0;
                                return;
                            case 21680:
                                fVar.h(i3);
                                fVar.f57371y.f57326q = (int) j10;
                                return;
                            case 21682:
                                fVar.h(i3);
                                fVar.f57371y.f57328s = (int) j10;
                                return;
                            case 21690:
                                fVar.h(i3);
                                fVar.f57371y.f57327r = (int) j10;
                                return;
                            case 21930:
                                fVar.h(i3);
                                w3.e eVar2 = fVar.f57371y;
                                if (j10 == 1) {
                                    z10 = true;
                                }
                                eVar2.X = z10;
                                return;
                            case 21938:
                                fVar.h(i3);
                                w3.e eVar3 = fVar.f57371y;
                                eVar3.f57334z = true;
                                eVar3.f57325p = (int) j10;
                                return;
                            case 21998:
                                fVar.h(i3);
                                fVar.f57371y.f57317g = (int) j10;
                                return;
                            case 22186:
                                fVar.h(i3);
                                fVar.f57371y.T = j10;
                                return;
                            case 22203:
                                fVar.h(i3);
                                fVar.f57371y.U = j10;
                                return;
                            case 25188:
                                fVar.h(i3);
                                fVar.f57371y.R = (int) j10;
                                return;
                            case 30114:
                                fVar.Z = j10;
                                return;
                            case 30321:
                                fVar.h(i3);
                                int i12 = (int) j10;
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        if (i12 != 2) {
                                            if (i12 == 3) {
                                                fVar.f57371y.f57329t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f57371y.f57329t = 2;
                                        return;
                                    }
                                    fVar.f57371y.f57329t = 1;
                                    return;
                                }
                                fVar.f57371y.f57329t = 0;
                                return;
                            case 2352003:
                                fVar.h(i3);
                                fVar.f57371y.f57316f = (int) j10;
                                return;
                            case 2807729:
                                fVar.f57367t = j10;
                                return;
                            default:
                                switch (i3) {
                                    case 21945:
                                        fVar.h(i3);
                                        int i13 = (int) j10;
                                        if (i13 != 1) {
                                            if (i13 == 2) {
                                                fVar.f57371y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f57371y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i3);
                                        int g7 = d2.n.g((int) j10);
                                        if (g7 != -1) {
                                            fVar.f57371y.B = g7;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i3);
                                        fVar.f57371y.f57334z = true;
                                        int f10 = d2.n.f((int) j10);
                                        if (f10 != -1) {
                                            fVar.f57371y.A = f10;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i3);
                                        fVar.f57371y.D = (int) j10;
                                        return;
                                    case 21949:
                                        fVar.h(i3);
                                        fVar.f57371y.E = (int) j10;
                                        return;
                                    default:
                                        return;
                                }
                        }
                    } else if (j10 != 1) {
                        throw d2.v0.a(null, "ContentEncodingScope " + j10 + " not supported");
                    }
                } else if (j10 != 0) {
                    throw d2.v0.a(null, "ContentEncodingOrder " + j10 + " not supported");
                }
            } else if (!fVar.f57372z) {
                fVar.g(i3);
                if (fVar.G == -1) {
                    fVar.G = j10;
                }
            }
        } else if (!fVar.f57372z) {
            fVar.g(i3);
            if (fVar.H == -1) {
                fVar.H = j10;
            }
        }
    }

    public void x(float f10) {
        n61 n61Var = (n61) this.f40562a;
        View[] viewArr = n61Var.f36386e;
        if (f10 == 1.0f) {
            if (viewArr[1] != null) {
                n61Var.F();
                n61Var.h.put(n61Var.f36387f[1], viewArr[1]);
                n61Var.removeView(viewArr[1]);
                n61Var.E(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            n61Var.z(n61Var.f36384b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (n61Var.E) {
            n61Var.E(view, (1.0f - f10) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            n61Var.E(view2, (-view2.getMeasuredWidth()) * f10);
        } else {
            n61Var.E(view, (1.0f - f10) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            n61Var.E(view3, view3.getMeasuredWidth() * f10);
        }
        n61Var.v(false);
    }

    public boolean y(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y00.y(android.view.MotionEvent):boolean");
    }

    public Bundle z() {
        Bundle bundle = (Bundle) this.f40562a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public y00(int i3) {
        switch (i3) {
            case 26:
                this.f40562a = new mb.b(4);
                return;
            default:
                this.f40562a = new q2.d(1.0f, 5, 0, false);
                return;
        }
    }

    @Override
    public float get() {
        org.telegram.ui.lp0 lp0Var = (org.telegram.ui.lp0) this.f40562a;
        int i3 = lp0Var.f56002z1;
        tg.h currentBrush = lp0Var.G0.getCurrentBrush();
        if (currentBrush == null) {
            return tg.k0.e(i3).f55235i;
        }
        return tg.k0.e(i3).f(String.valueOf(tg.h.f55183a.indexOf(currentBrush)), currentBrush.d());
    }

    public y00(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f40562a = new GestureDetector(context, onGestureListener, null);
    }

    public y00(Context context, x00 x00Var) {
        this.f40562a = new w00(context, x00Var);
    }

    @Override
    public void V0(org.telegram.messenger.rr rrVar) {
    }

    @Override
    public void b2(ArrayList arrayList) {
    }

    @Override
    public void d() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
