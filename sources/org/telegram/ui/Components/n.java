package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.location.LocationResult;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
public class n implements t4, tj0, uy, org.telegram.ui.nm0, org.telegram.messenger.lc, jg.y1, yr0, u61, org.telegram.ui.r9, te.b, tg.c, tg.l1, u2.m, com.google.android.gms.common.api.internal.n, q5.b {
    public final Object f36185a;

    public n(Object obj) {
        this.f36185a = obj;
    }

    public static n x(float f10, int i7) {
        boolean z9;
        Point point = org.telegram.messenger.g0.f22563q;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new n(i10, i11, new int[0]);
        }
        if (i7 == 3) {
            return new n(i10, i11, i11, i10);
        }
        boolean z10 = true;
        if (i7 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i10 >= i11) {
            z10 = false;
        }
        if (z9 == z10) {
            return new n(i10, i11, new int[0]);
        }
        return new n(i11, i10, new int[0]);
    }

    public void A(long j3, int i7, long j10) {
        x3.f fVar = (x3.f) this.f36185a;
        fVar.f58610j0.getClass();
        if (i7 != 160) {
            if (i7 != 174) {
                if (i7 != 183) {
                    if (i7 != 187) {
                        if (i7 != 19899) {
                            if (i7 != 20533) {
                                if (i7 != 21968) {
                                    if (i7 != 408125543) {
                                        if (i7 != 475249515) {
                                            if (i7 == 524531317 && !fVar.f58625z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f58610j0.f(new f3.t(fVar.v));
                                                fVar.f58625z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f58625z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j11 = fVar.f58619s;
                                    if (j11 != -1 && j11 != j3) {
                                        throw e2.t0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f58619s = j3;
                                    fVar.f58618r = j10;
                                    return;
                                }
                                fVar.h(i7);
                                fVar.f58624y.f58587z = true;
                                return;
                            }
                            fVar.h(i7);
                            fVar.f58624y.f58571i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f58625z) {
                        fVar.g(i7);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f58625z) {
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
            obj.f58576n = -1;
            obj.f58577o = -1;
            obj.f58578p = -1;
            obj.f58579q = -1;
            obj.f58580r = -1;
            obj.f58581s = 0;
            obj.f58582t = -1;
            obj.f58583u = 0.0f;
            obj.v = 0.0f;
            obj.f58584w = 0.0f;
            obj.f58585x = null;
            obj.f58586y = -1;
            obj.f58587z = false;
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
            fVar.f58624y = obj;
            obj.f58562a = fVar.f58622w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    public void B(int i7, String str) {
        x3.f fVar = (x3.f) this.f36185a;
        if (i7 != 134) {
            if (i7 != 17026) {
                if (i7 != 21358) {
                    if (i7 != 2274716) {
                        return;
                    }
                    fVar.h(i7);
                    fVar.f58624y.Z = str;
                    return;
                }
                fVar.h(i7);
                fVar.f58624y.f58564b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw e2.t0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f58622w = str.equals("webm");
                return;
            }
        }
        fVar.h(i7);
        fVar.f58624y.f58566c = str;
    }

    @Override
    public void F(float f10, int i7) {
        ((te.h) this.f36185a).f(f10);
    }

    @Override
    public void G() {
        ((l60) this.f36185a).k();
    }

    @Override
    public org.telegram.ui.ActionBar.z0 H(String str) {
        org.telegram.ui.ActionBar.z0 h = ((l60) this.f36185a).h();
        h.setText(str);
        return h;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        g0 g0Var = (g0) this.f36185a;
        g0Var.q1(i7, i10, z9);
        g0Var.dismiss();
    }

    @Override
    public void M(String str) {
        org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f36185a;
        try {
            x0Var.P = System.currentTimeMillis();
            x0Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
        pf0 pf0Var = ((sf0) this.f36185a).h.G0;
        if (pf0Var != null) {
            pf0Var.d();
        }
    }

    @Override
    public String R0() {
        return ((org.telegram.ui.web.x0) this.f36185a).f51354i0;
    }

    @Override
    public void X(float f10) {
        ((tg.c2) this.f36185a).setOutlineWidth(f10);
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        ((te.h) this.f36185a).f(f10);
    }

    @Override
    public void a(int i7, int i10, int i11, long j3) {
        ((MediaCodec) this.f36185a).queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override
    public void b(int i7, k2.d dVar, long j3, int i10) {
        ((MediaCodec) this.f36185a).queueSecureInputBuffer(i7, 0, dVar.f17171i, j3, i10);
    }

    @Override
    public org.telegram.ui.ActionBar.z0 b0(int i7, Runnable runnable, String str, boolean z9, boolean z10) {
        l60 l60Var = (l60) this.f36185a;
        int x10 = l60Var.x();
        l60Var.c(i7, str, new bi.u7(runnable, z10, l60Var, 25), z9);
        View w10 = l60Var.w(x10);
        if (w10 instanceof org.telegram.ui.ActionBar.z0) {
            return (org.telegram.ui.ActionBar.z0) w10;
        }
        return null;
    }

    @Override
    public void c(ArrayList arrayList) {
        k30.a((k30) this.f36185a, false, arrayList);
    }

    @Override
    public void d(boolean z9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f36185a;
        chatAttachAlertPhotoLayout.L = z9 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override
    public boolean e(int i7) {
        if (((ChatAttachAlertPhotoLayout) this.f36185a).G.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void f(Object obj) {
        Location location;
        org.telegram.messenger.ra raVar = ((org.telegram.messenger.z9) obj).f26831a;
        List list = ((LocationResult) this.f36185a).f7690a;
        int size = list.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) list.get(size - 1);
        }
        g6.d0 d0Var = (g6.d0) raVar;
        if (location == null) {
            d0Var.getClass();
        } else {
            ((org.telegram.messenger.sd) d0Var.f13555b).m(location);
        }
    }

    @Override
    public void g() {
        ((org.telegram.ui.wp0) this.f36185a).r0(null, true);
    }

    @Override
    public Object mo24get() {
        String packageName = ((Context) ((fd.a) this.f36185a).mo24get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public float getBlurAngle() {
        return ((org.telegram.messenger.hf) this.f36185a).f22906t;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return ((org.telegram.messenger.hf) this.f36185a).f22905s;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return ((org.telegram.messenger.hf) this.f36185a).f22904r;
    }

    @Override
    public float getBlurExcludeSize() {
        return ((org.telegram.messenger.hf) this.f36185a).f22903q;
    }

    @Override
    public int getBlurType() {
        return ((org.telegram.messenger.hf) this.f36185a).f22900n;
    }

    @Override
    public float getContrastValue() {
        return com.google.android.recaptcha.internal.a.c(((org.telegram.messenger.hf) this.f36185a).d, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public float getEnhanceValue() {
        return ((org.telegram.messenger.hf) this.f36185a).f22889a / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return ((org.telegram.messenger.hf) this.f36185a).f22891c / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return ((org.telegram.messenger.hf) this.f36185a).f22894g / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (((org.telegram.messenger.hf) this.f36185a).f22899m / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return com.google.android.recaptcha.internal.a.y(((org.telegram.messenger.hf) this.f36185a).f22896j, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public float getSaturationValue() {
        float f10 = ((org.telegram.messenger.hf) this.f36185a).f22893f / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.recaptcha.internal.a.y(((org.telegram.messenger.hf) this.f36185a).f22897k, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return com.google.android.recaptcha.internal.a.c(((org.telegram.messenger.hf) this.f36185a).f22901o, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return ((org.telegram.messenger.hf) this.f36185a).f22890b / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return ((org.telegram.messenger.hf) this.f36185a).f22895i;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (((org.telegram.messenger.hf) this.f36185a).f22895i == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return ((org.telegram.messenger.hf) this.f36185a).h;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (((org.telegram.messenger.hf) this.f36185a).h == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public float getVignetteValue() {
        return ((org.telegram.messenger.hf) this.f36185a).f22898l / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return ((org.telegram.messenger.hf) this.f36185a).f22892e / 100.0f;
    }

    @Override
    public ByteBuffer h() {
        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) this.f36185a;
        hfVar.f22902p.q();
        return (ByteBuffer) hfVar.f22902p.f14061f;
    }

    @Override
    public boolean h1(String str, org.telegram.ui.j9 j9Var) {
        return false;
    }

    @Override
    public void j(View view, boolean z9) {
        if (z9 == ((ChatAttachAlertPhotoLayout) this.f36185a).K && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f30147y.d(q5Var);
        }
    }

    @Override
    public boolean k(int i7) {
        org.telegram.messenger.gf M = ((ChatAttachAlertPhotoLayout) this.f36185a).G.M(i7);
        if (M != null && ChatAttachAlertPhotoLayout.f31195s1.containsKey(Integer.valueOf(M.C))) {
            return true;
        }
        return false;
    }

    @Override
    public boolean k1(int i7) {
        if (i7 == ((ko0) this.f36185a).f35444r) {
            return true;
        }
        return false;
    }

    @Override
    public tg.j l() {
        return ((org.telegram.ui.wp0) this.f36185a).B0;
    }

    @Override
    public void m() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((k30) this.f36185a).f35218a.startActivityForResult(intent, 14);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public boolean o() {
        return !((org.telegram.messenger.hf) this.f36185a).f22902p.F();
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f36185a;
        x0Var.y("scan_qr_popup_closed", null);
        x0Var.f51353h0 = false;
    }

    public void p(int i7, int i10, f3.p pVar) {
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
        x3.f fVar = (x3.f) this.f36185a;
        x3.g gVar = fVar.f58595b;
        SparseArray sparseArray = fVar.f58597c;
        h2.x xVar = fVar.f58611k;
        h2.x xVar2 = fVar.f58607i;
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
                                        fVar.f58624y.f58585x = bArr2;
                                        pVar.readFully(bArr2, 0, i10);
                                        return;
                                    }
                                    throw e2.t0.a(null, "Unexpected id: " + i7);
                                }
                                fVar.h(i7);
                                byte[] bArr3 = new byte[i10];
                                fVar.f58624y.f58574l = bArr3;
                                pVar.readFully(bArr3, 0, i10);
                                return;
                            }
                            Arrays.fill(xVar.f14162a, (byte) 0);
                            pVar.readFully(xVar.f14162a, 4 - i10, i10);
                            xVar.N(0);
                            fVar.A = (int) xVar.C();
                            return;
                        }
                        byte[] bArr4 = new byte[i10];
                        pVar.readFully(bArr4, 0, i10);
                        fVar.h(i7);
                        fVar.f58624y.f58573k = new f3.i0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i7);
                    byte[] bArr5 = new byte[i10];
                    fVar.f58624y.f58572j = bArr5;
                    pVar.readFully(bArr5, 0, i10);
                    return;
                }
                fVar.h(i7);
                x3.e eVar = fVar.f58624y;
                int i24 = eVar.h;
                if (i24 != 1685485123 && i24 != 1685480259) {
                    pVar.s(i10);
                    return;
                }
                byte[] bArr6 = new byte[i10];
                eVar.P = bArr6;
                pVar.readFully(bArr6, 0, i10);
                return;
            } else if (fVar.O == 2) {
                x3.e eVar2 = (x3.e) sparseArray.get(fVar.U);
                int i25 = fVar.X;
                h2.x xVar3 = fVar.f58616p;
                if (i25 == 4 && "V_VP9".equals(eVar2.f58566c)) {
                    xVar3.K(i10);
                    pVar.readFully(xVar3.f14162a, 0, i10);
                    return;
                }
                pVar.s(i10);
                return;
            } else {
                return;
            }
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.f58628c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        x3.e eVar3 = (x3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.s(i10 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.f58563a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i26 = (xVar2.f14162a[2] & 6) >> 1;
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
                int i27 = (xVar2.f14162a[3] & 255) + 1;
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
                            int i32 = xVar2.f14162a[i31] & 255;
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
                            if (xVar2.f14162a[i35] != 0) {
                                int i38 = i22;
                                while (true) {
                                    if (i38 < 8) {
                                        int i39 = i23 << (7 - i38);
                                        i14 = i21;
                                        if ((xVar2.f14162a[i35] & i39) != 0) {
                                            int i40 = i37 + i38;
                                            fVar.l(pVar, i40);
                                            i15 = i23;
                                            j3 = xVar2.f14162a[i35] & b10 & (~i39);
                                            while (i37 < i40) {
                                                j3 = (j3 << 8) | (xVar2.f14162a[i37] & b10);
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
            int i42 = xVar2.f14162a[i13] & 255;
            fVar.P = fVar.n(i42 | (bArr[i12] << 8)) + fVar.M;
            if (eVar3.f58568e != i13 && (i7 != 163 || (xVar2.f14162a[i11] & 128) != 128)) {
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
                    fVar.i(eVar3, ((fVar.R * eVar3.f58569f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i43], false), 0);
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
    public void q(int i7) {
        ko0 ko0Var = (ko0) this.f36185a;
        no0 no0Var = ko0Var.K;
        ko0Var.f35445s = i7;
        if (ko0Var.f35446w != i7) {
            ko0Var.d.clear();
        }
        int i10 = ko0Var.J;
        if (ko0Var.b() == 0 && !ko0Var.f35441e.e() && !ko0Var.I) {
            no0Var.I1.e(false, true);
        } else {
            no0Var.f36450p2.b(i10);
        }
        ko0Var.f();
        int i11 = no0.Q2;
        no0Var.K0(true);
    }

    public boolean r(int i7) {
        n61 n61Var = ((w61) this.f36185a).L;
        if (n61Var == null) {
            return false;
        }
        return n61Var.c(i7);
    }

    public s0.d s(int i7) {
        return null;
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f36185a).setParameters(bundle);
    }

    public android.view.ViewGroup t(android.content.Context r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n.t(android.content.Context, int):android.view.ViewGroup");
    }

    public String u(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            pa.d dVar = (pa.d) this.f36185a;
            pa.e eVar = new pa.e(stringWriter, dVar.f53525a, dVar.f53526b, dVar.f53527c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f53529b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public s0.d v(int i7) {
        return null;
    }

    @Override
    public a0.h v0() {
        return null;
    }

    public void w(int i7, long j3) {
        x3.f fVar = (x3.f) this.f36185a;
        if (i7 != 240) {
            if (i7 != 241) {
                if (i7 != 20529) {
                    if (i7 != 20530) {
                        boolean z9 = false;
                        switch (i7) {
                            case 131:
                                int i10 = (int) j3;
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 17) {
                                            if (i10 != 33) {
                                                fVar.h(i7);
                                                fVar.f58624y.f58568e = -1;
                                                return;
                                            }
                                            fVar.h(i7);
                                            fVar.f58624y.f58568e = 5;
                                            return;
                                        }
                                        fVar.h(i7);
                                        fVar.f58624y.f58568e = 3;
                                        return;
                                    }
                                    fVar.h(i7);
                                    fVar.f58624y.f58568e = 1;
                                    return;
                                }
                                fVar.h(i7);
                                fVar.f58624y.f58568e = 2;
                                return;
                            case 136:
                                fVar.h(i7);
                                x3.e eVar = fVar.f58624y;
                                if (j3 == 1) {
                                    z9 = true;
                                }
                                eVar.Y = z9;
                                return;
                            case 155:
                                fVar.Q = fVar.n(j3);
                                return;
                            case 159:
                                fVar.h(i7);
                                fVar.f58624y.Q = (int) j3;
                                return;
                            case 176:
                                fVar.h(i7);
                                fVar.f58624y.f58576n = (int) j3;
                                return;
                            case 179:
                                if (!fVar.f58625z) {
                                    fVar.g(i7);
                                    fVar.E = fVar.n(j3);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i7);
                                fVar.f58624y.f58577o = (int) j3;
                                return;
                            case 215:
                                fVar.h(i7);
                                fVar.f58624y.d = (int) j3;
                                return;
                            case 231:
                                fVar.M = fVar.n(j3);
                                return;
                            case 238:
                                fVar.X = (int) j3;
                                return;
                            case 247:
                                if (!fVar.f58625z) {
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
                                fVar.f58624y.h = (int) j3;
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
                                fVar.B = j3 + fVar.f58619s;
                                return;
                            case 21432:
                                int i11 = (int) j3;
                                fVar.h(i7);
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        if (i11 != 3) {
                                            if (i11 == 15) {
                                                fVar.f58624y.f58586y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f58624y.f58586y = 1;
                                        return;
                                    }
                                    fVar.f58624y.f58586y = 2;
                                    return;
                                }
                                fVar.f58624y.f58586y = 0;
                                return;
                            case 21680:
                                fVar.h(i7);
                                fVar.f58624y.f58579q = (int) j3;
                                return;
                            case 21682:
                                fVar.h(i7);
                                fVar.f58624y.f58581s = (int) j3;
                                return;
                            case 21690:
                                fVar.h(i7);
                                fVar.f58624y.f58580r = (int) j3;
                                return;
                            case 21930:
                                fVar.h(i7);
                                x3.e eVar2 = fVar.f58624y;
                                if (j3 == 1) {
                                    z9 = true;
                                }
                                eVar2.X = z9;
                                return;
                            case 21938:
                                fVar.h(i7);
                                x3.e eVar3 = fVar.f58624y;
                                eVar3.f58587z = true;
                                eVar3.f58578p = (int) j3;
                                return;
                            case 21998:
                                fVar.h(i7);
                                fVar.f58624y.f58570g = (int) j3;
                                return;
                            case 22186:
                                fVar.h(i7);
                                fVar.f58624y.T = j3;
                                return;
                            case 22203:
                                fVar.h(i7);
                                fVar.f58624y.U = j3;
                                return;
                            case 25188:
                                fVar.h(i7);
                                fVar.f58624y.R = (int) j3;
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
                                                fVar.f58624y.f58582t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f58624y.f58582t = 2;
                                        return;
                                    }
                                    fVar.f58624y.f58582t = 1;
                                    return;
                                }
                                fVar.f58624y.f58582t = 0;
                                return;
                            case 2352003:
                                fVar.h(i7);
                                fVar.f58624y.f58569f = (int) j3;
                                return;
                            case 2807729:
                                fVar.f58620t = j3;
                                return;
                            default:
                                switch (i7) {
                                    case 21945:
                                        fVar.h(i7);
                                        int i13 = (int) j3;
                                        if (i13 != 1) {
                                            if (i13 == 2) {
                                                fVar.f58624y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f58624y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i7);
                                        int g10 = e2.m.g((int) j3);
                                        if (g10 != -1) {
                                            fVar.f58624y.B = g10;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i7);
                                        fVar.f58624y.f58587z = true;
                                        int f10 = e2.m.f((int) j3);
                                        if (f10 != -1) {
                                            fVar.f58624y.A = f10;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i7);
                                        fVar.f58624y.D = (int) j3;
                                        return;
                                    case 21949:
                                        fVar.h(i7);
                                        fVar.f58624y.E = (int) j3;
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
            } else if (!fVar.f58625z) {
                fVar.g(i7);
                if (fVar.G == -1) {
                    fVar.G = j3;
                }
            }
        } else if (!fVar.f58625z) {
            fVar.g(i7);
            if (fVar.H == -1) {
                fVar.H = j3;
            }
        }
    }

    public void y(float f10) {
        w61 w61Var = (w61) this.f36185a;
        View[] viewArr = w61Var.f39950e;
        if (f10 == 1.0f) {
            if (viewArr[1] != null) {
                w61Var.G();
                w61Var.h.put(w61Var.f39951f[1], viewArr[1]);
                w61Var.removeView(viewArr[1]);
                w61Var.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            w61Var.A(w61Var.f39948b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (w61Var.D) {
            w61Var.F(view, (1.0f - f10) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            w61Var.F(view2, (-view2.getMeasuredWidth()) * f10);
        } else {
            w61Var.F(view, (1.0f - f10) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            w61Var.F(view3, view3.getMeasuredWidth() * f10);
        }
        w61Var.x(false);
    }

    public boolean z(int i7, int i10, Bundle bundle) {
        return false;
    }

    public n(int i7) {
        switch (i7) {
            case 15:
                this.f36185a = new SparseArray();
                return;
            case 16:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f36185a = new bf0(this);
                    return;
                } else {
                    this.f36185a = new bf0(this);
                    return;
                }
            default:
                this.f36185a = new ConcurrentHashMap(16);
                return;
        }
    }

    @Override
    public float get() {
        return ((tg.c2) this.f36185a).F;
    }

    public n(int i7, int i10, int... iArr) {
        v40[] v40VarArr = new v40[(iArr.length / 2) + 1];
        this.f36185a = v40VarArr;
        v40 v40Var = new v40(i7, i10);
        int i11 = 0;
        v40VarArr[0] = v40Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((v40[]) this.f36185a)[i12] = new v40(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public n(ArrayList arrayList) {
        this.f36185a = DesugarCollections.unmodifiableList(arrayList);
    }

    public n(EditText editText) {
        ?? obj = new Object();
        obj.f19611a = editText;
        t1.i iVar = new t1.i(editText);
        obj.f19612b = iVar;
        editText.addTextChangedListener(iVar);
        if (t1.a.f55365b == null) {
            synchronized (t1.a.f55364a) {
                try {
                    if (t1.a.f55365b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            t1.a.f55366c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, t1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        t1.a.f55365b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(t1.a.f55365b);
        this.f36185a = obj;
    }

    @Override
    public void V0(org.telegram.messenger.zr zrVar) {
    }

    @Override
    public void m1(ArrayList arrayList) {
    }

    @Override
    public void flush() {
    }

    @Override
    public void i() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
    }
}
