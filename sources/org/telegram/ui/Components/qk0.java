package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.widget.EditText;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class qk0 implements f71, tf.j1, org.telegram.ui.u9, com.google.android.gms.common.api.internal.s, dg.s2, OnCompleteListener, ra.m, t5.a, ji, fo0, y4, vh.g0, a3.b {
    public final int f28148a;
    public final Object f28149b;

    public qk0(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f28148a = i10;
        this.f28149b = obj;
    }

    @Override
    public vh.a E() {
        return ((vh.i4) this.f28149b).f46283a;
    }

    @Override
    public void F(float f10) {
        ph.h9 h9Var = (ph.h9) this.f28149b;
        cg.f1.e(h9Var.C1).k(String.valueOf(cg.m.f2447a.indexOf(h9Var.L0.getCurrentBrush())), f10);
        cg.f2 f2Var = h9Var.f41370x1;
        f2Var.f2403c = f10;
        h9Var.E0(f2Var, null, false);
    }

    @Override
    public String G0() {
        return ((org.telegram.ui.web.a1) this.f28149b).f39429f0;
    }

    @Override
    public a0.h I() {
        return null;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        vh.y1 y1Var = (vh.y1) this.f28149b;
        y1Var.s0(i10, i11, z4);
        org.telegram.ui.si0 si0Var = y1Var.L0;
        if (si0Var != null) {
            si0Var.i();
            y1Var.L0 = null;
        }
    }

    @Override
    public void K(String str) {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f28149b;
        try {
            a1Var.M = System.currentTimeMillis();
            a1Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public boolean L() {
        vh.i4 i4Var = (vh.i4) this.f28149b;
        vh.g4 g4Var = i4Var.D;
        if (g4Var != null) {
            vh.a aVar = i4Var.f46283a;
            if (((vh.n3) g4Var).f46026a.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void M(int i10, int i11) {
        vh.i4 i4Var = (vh.i4) this.f28149b;
        vh.g4 g4Var = i4Var.D;
        if (g4Var != null) {
            vh.a aVar = i4Var.f46283a;
            vh.c2 c2Var = ((vh.n3) g4Var).f46026a.G3;
            if (c2Var != null) {
                c2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void P() {
        vh.i4 i4Var = (vh.i4) this.f28149b;
        vh.g4 g4Var = i4Var.D;
        if (g4Var != null) {
            vh.a aVar = i4Var.f46283a;
            vh.r3 r3Var = ((vh.n3) g4Var).f46026a;
            vh.c2 c2Var = r3Var.G3;
            if (c2Var != null) {
                c2Var.g();
            }
            r3Var.f46112e3.onContentChanged();
        }
    }

    @Override
    public boolean Q(int i10) {
        if (i10 == ((hq0) this.f28149b).f25472r) {
            return true;
        }
        return false;
    }

    @Override
    public boolean V() {
        return false;
    }

    public void a(int i10, int i11, r3.l lVar) {
        char c3;
        char c10;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        x3.d dVar = (x3.d) this.f28149b;
        x3.e eVar = dVar.f46741b;
        SparseArray sparseArray = dVar.f46743c;
        h5.w wVar = dVar.f46746i;
        h5.w wVar2 = dVar.f46745g;
        int i17 = 1;
        int i18 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 != 165) {
                if (i10 != 16877) {
                    if (i10 != 16981) {
                        if (i10 != 18402) {
                            if (i10 != 21419) {
                                if (i10 != 25506) {
                                    if (i10 == 30322) {
                                        dVar.b(i10);
                                        byte[] bArr2 = new byte[i11];
                                        dVar.f46758u.v = bArr2;
                                        lVar.readFully(bArr2, 0, i11);
                                        return;
                                    }
                                    throw j3.r1.a("Unexpected id: " + i10, null);
                                }
                                dVar.b(i10);
                                byte[] bArr3 = new byte[i11];
                                dVar.f46758u.f46718k = bArr3;
                                lVar.readFully(bArr3, 0, i11);
                                return;
                            }
                            Arrays.fill(wVar.f7000a, (byte) 0);
                            lVar.readFully(wVar.f7000a, 4 - i11, i11);
                            wVar.F(0);
                            dVar.f46759w = (int) wVar.v();
                            return;
                        }
                        byte[] bArr4 = new byte[i11];
                        lVar.readFully(bArr4, 0, i11);
                        dVar.b(i10);
                        dVar.f46758u.f46717j = new r3.u(1, 0, 0, bArr4);
                        return;
                    }
                    dVar.b(i10);
                    byte[] bArr5 = new byte[i11];
                    dVar.f46758u.f46716i = bArr5;
                    lVar.readFully(bArr5, 0, i11);
                    return;
                }
                dVar.b(i10);
                x3.c cVar = dVar.f46758u;
                int i19 = cVar.f46715g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    lVar.u(i11);
                    return;
                }
                byte[] bArr6 = new byte[i11];
                cVar.N = bArr6;
                lVar.readFully(bArr6, 0, i11);
                return;
            } else if (dVar.G == 2) {
                x3.c cVar2 = (x3.c) sparseArray.get(dVar.M);
                int i20 = dVar.P;
                h5.w wVar3 = dVar.f46751n;
                if (i20 == 4 && "V_VP9".equals(cVar2.f46712b)) {
                    wVar3.C(i11);
                    lVar.readFully(wVar3.f7000a, 0, i11);
                    return;
                }
                lVar.u(i11);
                return;
            } else {
                return;
            }
        }
        if (dVar.G == 0) {
            dVar.M = (int) eVar.b(lVar, false, true, 8);
            dVar.N = eVar.f46765c;
            dVar.I = -9223372036854775807L;
            dVar.G = 1;
            wVar2.C(0);
        }
        x3.c cVar3 = (x3.c) sparseArray.get(dVar.M);
        if (cVar3 == null) {
            lVar.u(i11 - dVar.N);
            dVar.G = 0;
            return;
        }
        cVar3.X.getClass();
        if (dVar.G == 1) {
            dVar.g(lVar, 3);
            int i21 = (wVar2.f7000a[2] & 6) >> 1;
            byte b10 = 255;
            if (i21 == 0) {
                dVar.K = 1;
                int[] iArr = dVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.L = iArr;
                iArr[0] = (i11 - dVar.N) - 3;
            } else {
                dVar.g(lVar, 4);
                int i22 = (wVar2.f7000a[3] & 255) + 1;
                dVar.K = i22;
                int[] iArr2 = dVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                dVar.L = iArr2;
                if (i21 == 2) {
                    int i23 = dVar.K;
                    Arrays.fill(iArr2, 0, i23, ((i11 - dVar.N) - 4) / i23);
                } else if (i21 == 1) {
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 4;
                    while (true) {
                        i13 = dVar.K - 1;
                        if (i24 >= i13) {
                            break;
                        }
                        dVar.L[i24] = 0;
                        while (true) {
                            i14 = i26 + 1;
                            dVar.g(lVar, i14);
                            int i27 = wVar2.f7000a[i26] & 255;
                            int[] iArr3 = dVar.L;
                            i15 = iArr3[i24] + i27;
                            iArr3[i24] = i15;
                            if (i27 != 255) {
                                break;
                            }
                            i26 = i14;
                        }
                        i25 += i15;
                        i24++;
                        i26 = i14;
                    }
                    dVar.L[i13] = ((i11 - dVar.N) - i26) - i25;
                } else if (i21 == 3) {
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        int i31 = dVar.K - i17;
                        if (i28 < i31) {
                            dVar.L[i28] = i18;
                            int i32 = i30 + 1;
                            dVar.g(lVar, i32);
                            if (wVar2.f7000a[i30] != 0) {
                                int i33 = 0;
                                while (true) {
                                    if (i33 < 8) {
                                        int i34 = 1 << (7 - i33);
                                        if ((wVar2.f7000a[i30] & i34) != 0) {
                                            i12 = i32 + i33;
                                            dVar.g(lVar, i12);
                                            j10 = wVar2.f7000a[i30] & b10 & (~i34);
                                            while (i32 < i12) {
                                                j10 = (j10 << 8) | (wVar2.f7000a[i32] & b10);
                                                i32++;
                                                b10 = 255;
                                            }
                                            if (i28 > 0) {
                                                j10 -= (1 << ((i33 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i33++;
                                            b10 = 255;
                                        }
                                    } else {
                                        j10 = 0;
                                        i12 = i32;
                                        break;
                                    }
                                }
                                if (j10 < -2147483648L || j10 > 2147483647L) {
                                    break;
                                }
                                int i35 = (int) j10;
                                int[] iArr4 = dVar.L;
                                if (i28 != 0) {
                                    i35 += iArr4[i28 - 1];
                                }
                                iArr4[i28] = i35;
                                i29 += i35;
                                i28++;
                                i30 = i12;
                                b10 = 255;
                                i17 = 1;
                                i18 = 0;
                            } else {
                                throw j3.r1.a("No valid varint length mask found", null);
                            }
                        } else {
                            c3 = 1;
                            c10 = 0;
                            dVar.L[i31] = ((i11 - dVar.N) - i30) - i29;
                            break;
                        }
                    }
                    throw j3.r1.a("EBML lacing sample size out of range.", null);
                } else {
                    throw j3.r1.a("Unexpected lacing value: " + i21, null);
                }
            }
            c3 = 1;
            c10 = 0;
            int i36 = wVar2.f7000a[c3] & 255;
            dVar.H = dVar.k(i36 | (bArr[c10] << 8)) + dVar.B;
            if (cVar3.d != 2 && (i10 != 163 || (wVar2.f7000a[2] & 128) != 128)) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            dVar.O = i16;
            dVar.G = 2;
            dVar.J = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i37 = dVar.J;
                if (i37 < dVar.K) {
                    dVar.c(cVar3, ((dVar.J * cVar3.e) / 1000) + dVar.H, dVar.O, dVar.l(lVar, cVar3, dVar.L[i37], false), 0);
                    dVar.J++;
                } else {
                    dVar.G = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i38 = dVar.J;
                if (i38 < dVar.K) {
                    int[] iArr5 = dVar.L;
                    iArr5[i38] = dVar.l(lVar, cVar3, iArr5[i38], true);
                    dVar.J++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void a0() {
        vh.i4 i4Var = (vh.i4) this.f28149b;
        vh.g4 g4Var = i4Var.D;
        if (g4Var != null) {
            vh.a aVar = i4Var.f46283a;
            vh.r3.O1(((vh.n3) g4Var).f46026a);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i10 = this.f28148a;
        Object obj3 = this.f28149b;
        switch (i10) {
            case 4:
                p6.b bVar = new p6.b(0, (TaskCompletionSource) obj2);
                b7.r1 r1Var = (b7.r1) ((b7.q1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(r1Var.f1726b);
                int i11 = b7.l.f1698a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((q6.v) obj3).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    r1Var.f1725a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 14:
                u5.r rVar = new u5.r(1, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((u5.t) obj).u();
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, rVar);
                M0.writeStringArray((String[]) obj3);
                iVar.R0(M0, 6);
                return;
            default:
                v6.f fVar = new v6.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = e7.a.f5152a;
                obtain3.writeStrongBinder(fVar);
                e7.a.b(obtain3, (GetCredentialRequest) obj3);
                e7.a.b(obtain3, gVar);
                ((v6.b) ((v6.d) ((v6.e) obj).u())).E0(obtain3, 1);
                return;
        }
    }

    @Override
    public void b(float f10) {
        vh.x xVar = (vh.x) this.f28149b;
        MessageObject messageObject = xVar.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(xVar.M, f10);
    }

    @Override
    public void c(vh.d1 d1Var) {
        vh.g4 g4Var = ((vh.i4) this.f28149b).D;
        if (g4Var != null) {
            vh.r3 r3Var = ((vh.n3) g4Var).f46026a;
            vh.r3.M1(r3Var, d1Var);
            r3Var.f46112e3.e(d1Var, true);
        }
    }

    @Override
    public void d(float f10) {
        MessageObject messageObject = ((vh.x) this.f28149b).M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
    }

    public void e(int i10, long j10) {
        x3.d dVar = (x3.d) this.f28149b;
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z4 = false;
                switch (i10) {
                    case 131:
                        dVar.b(i10);
                        dVar.f46758u.d = (int) j10;
                        return;
                    case 136:
                        dVar.b(i10);
                        x3.c cVar = dVar.f46758u;
                        if (j10 == 1) {
                            z4 = true;
                        }
                        cVar.V = z4;
                        return;
                    case 155:
                        dVar.I = dVar.k(j10);
                        return;
                    case 159:
                        dVar.b(i10);
                        dVar.f46758u.O = (int) j10;
                        return;
                    case 176:
                        dVar.b(i10);
                        dVar.f46758u.f46720m = (int) j10;
                        return;
                    case 179:
                        dVar.a(i10);
                        dVar.C.c(dVar.k(j10));
                        return;
                    case 186:
                        dVar.b(i10);
                        dVar.f46758u.f46721n = (int) j10;
                        return;
                    case 215:
                        dVar.b(i10);
                        dVar.f46758u.f46713c = (int) j10;
                        return;
                    case 231:
                        dVar.B = dVar.k(j10);
                        return;
                    case 238:
                        dVar.P = (int) j10;
                        return;
                    case 241:
                        if (!dVar.E) {
                            dVar.a(i10);
                            dVar.D.c(j10);
                            dVar.E = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.Q = true;
                        return;
                    case 16871:
                        dVar.b(i10);
                        dVar.f46758u.f46715g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw j3.r1.a("ContentCompAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw j3.r1.a("DocTypeReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw j3.r1.a("EBMLReadVersion " + j10 + " not supported", null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw j3.r1.a("ContentEncAlgo " + j10 + " not supported", null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw j3.r1.a("AESSettingsCipherMode " + j10 + " not supported", null);
                        }
                        return;
                    case 21420:
                        dVar.f46760x = j10 + dVar.f46754q;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        dVar.b(i10);
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 15) {
                                        dVar.f46758u.f46729w = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f46758u.f46729w = 1;
                                return;
                            }
                            dVar.f46758u.f46729w = 2;
                            return;
                        }
                        dVar.f46758u.f46729w = 0;
                        return;
                    case 21680:
                        dVar.b(i10);
                        dVar.f46758u.f46722o = (int) j10;
                        return;
                    case 21682:
                        dVar.b(i10);
                        dVar.f46758u.f46724q = (int) j10;
                        return;
                    case 21690:
                        dVar.b(i10);
                        dVar.f46758u.f46723p = (int) j10;
                        return;
                    case 21930:
                        dVar.b(i10);
                        x3.c cVar2 = dVar.f46758u;
                        if (j10 == 1) {
                            z4 = true;
                        }
                        cVar2.U = z4;
                        return;
                    case 21998:
                        dVar.b(i10);
                        dVar.f46758u.f46714f = (int) j10;
                        return;
                    case 22186:
                        dVar.b(i10);
                        dVar.f46758u.R = j10;
                        return;
                    case 22203:
                        dVar.b(i10);
                        dVar.f46758u.S = j10;
                        return;
                    case 25188:
                        dVar.b(i10);
                        dVar.f46758u.P = (int) j10;
                        return;
                    case 30114:
                        dVar.R = j10;
                        return;
                    case 30321:
                        dVar.b(i10);
                        int i12 = (int) j10;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        dVar.f46758u.f46725r = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f46758u.f46725r = 2;
                                return;
                            }
                            dVar.f46758u.f46725r = 1;
                            return;
                        }
                        dVar.f46758u.f46725r = 0;
                        return;
                    case 2352003:
                        dVar.b(i10);
                        dVar.f46758u.e = (int) j10;
                        return;
                    case 2807729:
                        dVar.f46755r = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                dVar.b(i10);
                                int i13 = (int) j10;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        dVar.f46758u.A = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f46758u.A = 2;
                                return;
                            case 21946:
                                dVar.b(i10);
                                int c3 = i5.b.c((int) j10);
                                if (c3 != -1) {
                                    dVar.f46758u.f46732z = c3;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.b(i10);
                                dVar.f46758u.f46730x = true;
                                int b10 = i5.b.b((int) j10);
                                if (b10 != -1) {
                                    dVar.f46758u.f46731y = b10;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.b(i10);
                                dVar.f46758u.B = (int) j10;
                                return;
                            case 21949:
                                dVar.b(i10);
                                dVar.f46758u.C = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw j3.r1.a("ContentEncodingScope " + j10 + " not supported", null);
            }
        } else if (j10 == 0) {
        } else {
            throw j3.r1.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
    }

    public p9.a f(JSONObject jSONObject) {
        p9.b aVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            aVar = new z9.d(18);
        } else {
            aVar = new ab.a(19);
        }
        return aVar.h((db.a) this.f28149b, jSONObject);
    }

    @Override
    public boolean f1(String str, org.telegram.ui.m9 m9Var) {
        return false;
    }

    @Override
    public void g(int i10) {
        hq0 hq0Var = (hq0) this.f28149b;
        lq0 lq0Var = hq0Var.H;
        hq0Var.f25473s = i10;
        if (hq0Var.v != i10) {
            hq0Var.d.clear();
        }
        int i11 = hq0Var.G;
        if (hq0Var.h() == 0 && !hq0Var.e.e() && !hq0Var.F) {
            lq0Var.N.e(false, true);
        } else {
            lq0Var.f26867u0.b(i11);
        }
        hq0Var.l();
        int i12 = lq0.X0;
        lq0Var.K0(true);
    }

    @Override
    public Object mo0get() {
        return new s5.m((Context) ((a3.c) this.f28149b).f46b, new z9.d(7), new h7.u(7), 13);
    }

    @Override
    public void h() {
        vh.i4 i4Var = (vh.i4) this.f28149b;
        vh.g4 g4Var = i4Var.D;
        if (g4Var != null) {
            vh.r3.P1(((vh.n3) g4Var).f46026a, i4Var.f46283a);
        }
    }

    public void i() {
        s5.h hVar = (s5.h) this.f28149b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f44077i.iterator();
            while (it2.hasNext()) {
                ((s5.g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        r5.c.h((r5.c) ((r5.j) this.f28149b).f43373c, "launchApplication", task);
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f28149b;
        a1Var.v("scan_qr_popup_closed", null);
        a1Var.f39427e0 = false;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        rk0 rk0Var = (rk0) this.f28149b;
        if (z4 && rk0Var.f28485n.n() >= 0) {
            rk0Var.f28488w = true;
        }
        mg0 mg0Var = rk0Var.f28484f;
        cc0 cc0Var = rk0Var.f28489x;
        mg0Var.a(z4, true);
        AndroidUtilities.cancelRunOnUIThread(cc0Var);
        if (z4) {
            AndroidUtilities.runOnUIThread(cc0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p(Bitmap bitmap) {
        u5.b bVar = t5.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int d = (int) android.support.v4.media.a.d(f10, 9.0f, 16.0f, 0.5f);
            float f11 = (d - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f11, f10, height + f11);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, d, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((t5.h) this.f28149b).e(bitmap2, 0);
    }

    @Override
    public Object s2() {
        Type type = (Type) this.f28149b;
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
    public a0.h t() {
        return null;
    }

    @Override
    public org.telegram.ui.Cells.m9 u() {
        vh.g4 g4Var = ((vh.i4) this.f28149b).D;
        if (g4Var != null) {
            return ((vh.n3) g4Var).f46026a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void x(wg wgVar) {
        NotificationCenter.getInstance(uf.k.a0((uf.k) this.f28149b)).doOnIdle(wgVar);
    }

    @Override
    public void y(CharSequence charSequence) {
        vh.g4 g4Var = ((vh.i4) this.f28149b).D;
        if (g4Var != null) {
            vh.n3 n3Var = (vh.n3) g4Var;
            n3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                n3Var.f46026a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public org.telegram.ui.Cells.l9 z() {
        return (vh.i4) this.f28149b;
    }

    public qk0(Object obj, int i10) {
        this.f28148a = i10;
        this.f28149b = obj;
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    public qk0(o2.o oVar) {
        this.f28148a = 3;
        this.f28149b = (com.google.android.gms.internal.play_billing.r) oVar.f16220b;
    }

    public qk0(EditText editText) {
        this.f28148a = 7;
        this.f28149b = new n7.qa(editText);
    }

    @Override
    public float get() {
        ph.h9 h9Var = (ph.h9) this.f28149b;
        int i10 = h9Var.C1;
        cg.m currentBrush = h9Var.L0.getCurrentBrush();
        if (currentBrush == null) {
            return cg.f1.e(i10).f2397i;
        }
        return cg.f1.e(i10).f(String.valueOf(cg.m.f2447a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public void C() {
    }

    @Override
    public void D(Object obj) {
    }

    @Override
    public void G(TLRPC.User user) {
    }

    @Override
    public void S0(MrzRecognizer.Result result) {
    }

    @Override
    public void T(ArrayList arrayList) {
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
    public void r() {
    }

    @Override
    public void onError(i71 i71Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }

    @Override
    public void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override
    public void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
