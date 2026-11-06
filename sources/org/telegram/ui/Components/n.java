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
public class n implements t4, sj0, ty, org.telegram.ui.lm0, org.telegram.messenger.lc, jg.y1, wr0, s61, org.telegram.ui.r9, te.b, tg.c, tg.l1, u2.m, com.google.android.gms.common.api.internal.n, q5.b {
    public final Object f36104a;

    public n(Object obj) {
        this.f36104a = obj;
    }

    public static n x(float f10, int i7) {
        boolean z9;
        Point point = org.telegram.messenger.g0.f22537q;
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
        x3.f fVar = (x3.f) this.f36104a;
        fVar.f58506j0.getClass();
        if (i7 != 160) {
            if (i7 != 174) {
                if (i7 != 183) {
                    if (i7 != 187) {
                        if (i7 != 19899) {
                            if (i7 != 20533) {
                                if (i7 != 21968) {
                                    if (i7 != 408125543) {
                                        if (i7 != 475249515) {
                                            if (i7 == 524531317 && !fVar.f58521z) {
                                                if (fVar.d && fVar.K != -1) {
                                                    fVar.J = true;
                                                    return;
                                                }
                                                fVar.f58506j0.f(new f3.t(fVar.v));
                                                fVar.f58521z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!fVar.f58521z) {
                                            fVar.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j11 = fVar.f58515s;
                                    if (j11 != -1 && j11 != j3) {
                                        throw e2.t0.a(null, "Multiple Segment elements not supported");
                                    }
                                    fVar.f58515s = j3;
                                    fVar.f58514r = j10;
                                    return;
                                }
                                fVar.h(i7);
                                fVar.f58520y.f58483z = true;
                                return;
                            }
                            fVar.h(i7);
                            fVar.f58520y.f58467i = true;
                            return;
                        }
                        fVar.A = -1;
                        fVar.B = -1L;
                        return;
                    } else if (!fVar.f58521z) {
                        fVar.g(i7);
                        fVar.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!fVar.f58521z) {
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
            obj.f58472n = -1;
            obj.f58473o = -1;
            obj.f58474p = -1;
            obj.f58475q = -1;
            obj.f58476r = -1;
            obj.f58477s = 0;
            obj.f58478t = -1;
            obj.f58479u = 0.0f;
            obj.v = 0.0f;
            obj.f58480w = 0.0f;
            obj.f58481x = null;
            obj.f58482y = -1;
            obj.f58483z = false;
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
            fVar.f58520y = obj;
            obj.f58458a = fVar.f58518w;
            return;
        }
        fVar.Y = false;
        fVar.Z = 0L;
    }

    public void B(int i7, String str) {
        x3.f fVar = (x3.f) this.f36104a;
        if (i7 != 134) {
            if (i7 != 17026) {
                if (i7 != 21358) {
                    if (i7 != 2274716) {
                        return;
                    }
                    fVar.h(i7);
                    fVar.f58520y.Z = str;
                    return;
                }
                fVar.h(i7);
                fVar.f58520y.f58460b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw e2.t0.a(null, "DocType " + str + " not supported");
            } else {
                fVar.f58518w = str.equals("webm");
                return;
            }
        }
        fVar.h(i7);
        fVar.f58520y.f58462c = str;
    }

    @Override
    public void F(float f10, int i7) {
        ((te.h) this.f36104a).f(f10);
    }

    @Override
    public void G() {
        ((k60) this.f36104a).k();
    }

    @Override
    public org.telegram.ui.ActionBar.z0 H(String str) {
        org.telegram.ui.ActionBar.z0 h = ((k60) this.f36104a).h();
        h.setText(str);
        return h;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        g0 g0Var = (g0) this.f36104a;
        g0Var.q1(i7, i10, z9);
        g0Var.dismiss();
    }

    @Override
    public void M(String str) {
        org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f36104a;
        try {
            x0Var.P = System.currentTimeMillis();
            x0Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
        of0 of0Var = ((rf0) this.f36104a).h.G0;
        if (of0Var != null) {
            of0Var.d();
        }
    }

    @Override
    public String R0() {
        return ((org.telegram.ui.web.x0) this.f36104a).f51371i0;
    }

    @Override
    public void X(float f10) {
        ((tg.c2) this.f36104a).setOutlineWidth(f10);
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        ((te.h) this.f36104a).f(f10);
    }

    @Override
    public void a(int i7, int i10, int i11, long j3) {
        ((MediaCodec) this.f36104a).queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override
    public void b(int i7, k2.d dVar, long j3, int i10) {
        ((MediaCodec) this.f36104a).queueSecureInputBuffer(i7, 0, dVar.f17168i, j3, i10);
    }

    @Override
    public org.telegram.ui.ActionBar.z0 b0(int i7, Runnable runnable, String str, boolean z9, boolean z10) {
        k60 k60Var = (k60) this.f36104a;
        int x10 = k60Var.x();
        k60Var.c(i7, str, new bi.u7(runnable, z10, k60Var, 25), z9);
        View w10 = k60Var.w(x10);
        if (w10 instanceof org.telegram.ui.ActionBar.z0) {
            return (org.telegram.ui.ActionBar.z0) w10;
        }
        return null;
    }

    @Override
    public void c(ArrayList arrayList) {
        j30.a((j30) this.f36104a, false, arrayList);
    }

    @Override
    public void d(boolean z9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f36104a;
        chatAttachAlertPhotoLayout.L = z9 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override
    public boolean e(int i7) {
        if (((ChatAttachAlertPhotoLayout) this.f36104a).G.d(i7) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void f(Object obj) {
        Location location;
        org.telegram.messenger.ra raVar = ((org.telegram.messenger.z9) obj).f26807a;
        List list = ((LocationResult) this.f36104a).f7692a;
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
        ((org.telegram.ui.up0) this.f36104a).r0(null, true);
    }

    @Override
    public Object mo24get() {
        String packageName = ((Context) ((fd.a) this.f36104a).mo24get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public float getBlurAngle() {
        return ((org.telegram.messenger.hf) this.f36104a).f22923t;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return ((org.telegram.messenger.hf) this.f36104a).f22922s;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return ((org.telegram.messenger.hf) this.f36104a).f22921r;
    }

    @Override
    public float getBlurExcludeSize() {
        return ((org.telegram.messenger.hf) this.f36104a).f22920q;
    }

    @Override
    public int getBlurType() {
        return ((org.telegram.messenger.hf) this.f36104a).f22917n;
    }

    @Override
    public float getContrastValue() {
        return com.google.android.recaptcha.internal.a.c(((org.telegram.messenger.hf) this.f36104a).d, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public float getEnhanceValue() {
        return ((org.telegram.messenger.hf) this.f36104a).f22906a / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return ((org.telegram.messenger.hf) this.f36104a).f22908c / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return ((org.telegram.messenger.hf) this.f36104a).f22911g / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (((org.telegram.messenger.hf) this.f36104a).f22916m / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return com.google.android.recaptcha.internal.a.y(((org.telegram.messenger.hf) this.f36104a).f22913j, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public float getSaturationValue() {
        float f10 = ((org.telegram.messenger.hf) this.f36104a).f22910f / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.recaptcha.internal.a.y(((org.telegram.messenger.hf) this.f36104a).f22914k, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return com.google.android.recaptcha.internal.a.c(((org.telegram.messenger.hf) this.f36104a).f22918o, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return ((org.telegram.messenger.hf) this.f36104a).f22907b / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return ((org.telegram.messenger.hf) this.f36104a).f22912i;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (((org.telegram.messenger.hf) this.f36104a).f22912i == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return ((org.telegram.messenger.hf) this.f36104a).h;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (((org.telegram.messenger.hf) this.f36104a).h == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public float getVignetteValue() {
        return ((org.telegram.messenger.hf) this.f36104a).f22915l / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return ((org.telegram.messenger.hf) this.f36104a).f22909e / 100.0f;
    }

    @Override
    public ByteBuffer h() {
        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) this.f36104a;
        hfVar.f22919p.q();
        return (ByteBuffer) hfVar.f22919p.f14061f;
    }

    @Override
    public boolean h1(String str, org.telegram.ui.j9 j9Var) {
        return false;
    }

    @Override
    public void j(View view, boolean z9) {
        if (z9 == ((ChatAttachAlertPhotoLayout) this.f36104a).K && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f30138y.d(q5Var);
        }
    }

    @Override
    public boolean k(int i7) {
        org.telegram.messenger.gf M = ((ChatAttachAlertPhotoLayout) this.f36104a).G.M(i7);
        if (M != null && ChatAttachAlertPhotoLayout.f31185s1.containsKey(Integer.valueOf(M.C))) {
            return true;
        }
        return false;
    }

    @Override
    public boolean k1(int i7) {
        if (i7 == ((jo0) this.f36104a).f35008r) {
            return true;
        }
        return false;
    }

    @Override
    public tg.j l() {
        return ((org.telegram.ui.up0) this.f36104a).B0;
    }

    @Override
    public void m() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((j30) this.f36104a).f34843a.startActivityForResult(intent, 14);
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
        return !((org.telegram.messenger.hf) this.f36104a).f22919p.F();
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f36104a;
        x0Var.y("scan_qr_popup_closed", null);
        x0Var.f51370h0 = false;
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
        x3.f fVar = (x3.f) this.f36104a;
        x3.g gVar = fVar.f58491b;
        SparseArray sparseArray = fVar.f58493c;
        h2.x xVar = fVar.f58507k;
        h2.x xVar2 = fVar.f58503i;
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
                                        fVar.f58520y.f58481x = bArr2;
                                        pVar.readFully(bArr2, 0, i10);
                                        return;
                                    }
                                    throw e2.t0.a(null, "Unexpected id: " + i7);
                                }
                                fVar.h(i7);
                                byte[] bArr3 = new byte[i10];
                                fVar.f58520y.f58470l = bArr3;
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
                        fVar.f58520y.f58469k = new f3.i0(1, 0, 0, bArr4);
                        return;
                    }
                    fVar.h(i7);
                    byte[] bArr5 = new byte[i10];
                    fVar.f58520y.f58468j = bArr5;
                    pVar.readFully(bArr5, 0, i10);
                    return;
                }
                fVar.h(i7);
                x3.e eVar = fVar.f58520y;
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
                h2.x xVar3 = fVar.f58512p;
                if (i25 == 4 && "V_VP9".equals(eVar2.f58462c)) {
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
            fVar.V = gVar.f58524c;
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
        eVar3.f58459a0.getClass();
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
            if (eVar3.f58464e != i13 && (i7 != 163 || (xVar2.f14162a[i11] & 128) != 128)) {
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
                    fVar.i(eVar3, ((fVar.R * eVar3.f58465f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i43], false), 0);
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
        jo0 jo0Var = (jo0) this.f36104a;
        mo0 mo0Var = jo0Var.K;
        jo0Var.f35009s = i7;
        if (jo0Var.f35010w != i7) {
            jo0Var.d.clear();
        }
        int i10 = jo0Var.J;
        if (jo0Var.b() == 0 && !jo0Var.f35005e.e() && !jo0Var.I) {
            mo0Var.I1.e(false, true);
        } else {
            mo0Var.f36012p2.b(i10);
        }
        jo0Var.f();
        int i11 = mo0.Q2;
        mo0Var.K0(true);
    }

    public boolean r(int i7) {
        l61 l61Var = ((u61) this.f36104a).L;
        if (l61Var == null) {
            return false;
        }
        return l61Var.c(i7);
    }

    public s0.d s(int i7) {
        return null;
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f36104a).setParameters(bundle);
    }

    public android.view.ViewGroup t(android.content.Context r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n.t(android.content.Context, int):android.view.ViewGroup");
    }

    public String u(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            pa.d dVar = (pa.d) this.f36104a;
            pa.e eVar = new pa.e(stringWriter, dVar.f53421a, dVar.f53422b, dVar.f53423c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f53425b.flush();
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
        x3.f fVar = (x3.f) this.f36104a;
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
                                                fVar.f58520y.f58464e = -1;
                                                return;
                                            }
                                            fVar.h(i7);
                                            fVar.f58520y.f58464e = 5;
                                            return;
                                        }
                                        fVar.h(i7);
                                        fVar.f58520y.f58464e = 3;
                                        return;
                                    }
                                    fVar.h(i7);
                                    fVar.f58520y.f58464e = 1;
                                    return;
                                }
                                fVar.h(i7);
                                fVar.f58520y.f58464e = 2;
                                return;
                            case 136:
                                fVar.h(i7);
                                x3.e eVar = fVar.f58520y;
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
                                fVar.f58520y.Q = (int) j3;
                                return;
                            case 176:
                                fVar.h(i7);
                                fVar.f58520y.f58472n = (int) j3;
                                return;
                            case 179:
                                if (!fVar.f58521z) {
                                    fVar.g(i7);
                                    fVar.E = fVar.n(j3);
                                    return;
                                }
                                return;
                            case 186:
                                fVar.h(i7);
                                fVar.f58520y.f58473o = (int) j3;
                                return;
                            case 215:
                                fVar.h(i7);
                                fVar.f58520y.d = (int) j3;
                                return;
                            case 231:
                                fVar.M = fVar.n(j3);
                                return;
                            case 238:
                                fVar.X = (int) j3;
                                return;
                            case 247:
                                if (!fVar.f58521z) {
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
                                fVar.f58520y.h = (int) j3;
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
                                fVar.B = j3 + fVar.f58515s;
                                return;
                            case 21432:
                                int i11 = (int) j3;
                                fVar.h(i7);
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        if (i11 != 3) {
                                            if (i11 == 15) {
                                                fVar.f58520y.f58482y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f58520y.f58482y = 1;
                                        return;
                                    }
                                    fVar.f58520y.f58482y = 2;
                                    return;
                                }
                                fVar.f58520y.f58482y = 0;
                                return;
                            case 21680:
                                fVar.h(i7);
                                fVar.f58520y.f58475q = (int) j3;
                                return;
                            case 21682:
                                fVar.h(i7);
                                fVar.f58520y.f58477s = (int) j3;
                                return;
                            case 21690:
                                fVar.h(i7);
                                fVar.f58520y.f58476r = (int) j3;
                                return;
                            case 21930:
                                fVar.h(i7);
                                x3.e eVar2 = fVar.f58520y;
                                if (j3 == 1) {
                                    z9 = true;
                                }
                                eVar2.X = z9;
                                return;
                            case 21938:
                                fVar.h(i7);
                                x3.e eVar3 = fVar.f58520y;
                                eVar3.f58483z = true;
                                eVar3.f58474p = (int) j3;
                                return;
                            case 21998:
                                fVar.h(i7);
                                fVar.f58520y.f58466g = (int) j3;
                                return;
                            case 22186:
                                fVar.h(i7);
                                fVar.f58520y.T = j3;
                                return;
                            case 22203:
                                fVar.h(i7);
                                fVar.f58520y.U = j3;
                                return;
                            case 25188:
                                fVar.h(i7);
                                fVar.f58520y.R = (int) j3;
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
                                                fVar.f58520y.f58478t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f58520y.f58478t = 2;
                                        return;
                                    }
                                    fVar.f58520y.f58478t = 1;
                                    return;
                                }
                                fVar.f58520y.f58478t = 0;
                                return;
                            case 2352003:
                                fVar.h(i7);
                                fVar.f58520y.f58465f = (int) j3;
                                return;
                            case 2807729:
                                fVar.f58516t = j3;
                                return;
                            default:
                                switch (i7) {
                                    case 21945:
                                        fVar.h(i7);
                                        int i13 = (int) j3;
                                        if (i13 != 1) {
                                            if (i13 == 2) {
                                                fVar.f58520y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        fVar.f58520y.C = 2;
                                        return;
                                    case 21946:
                                        fVar.h(i7);
                                        int g10 = e2.m.g((int) j3);
                                        if (g10 != -1) {
                                            fVar.f58520y.B = g10;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        fVar.h(i7);
                                        fVar.f58520y.f58483z = true;
                                        int f10 = e2.m.f((int) j3);
                                        if (f10 != -1) {
                                            fVar.f58520y.A = f10;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        fVar.h(i7);
                                        fVar.f58520y.D = (int) j3;
                                        return;
                                    case 21949:
                                        fVar.h(i7);
                                        fVar.f58520y.E = (int) j3;
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
            } else if (!fVar.f58521z) {
                fVar.g(i7);
                if (fVar.G == -1) {
                    fVar.G = j3;
                }
            }
        } else if (!fVar.f58521z) {
            fVar.g(i7);
            if (fVar.H == -1) {
                fVar.H = j3;
            }
        }
    }

    public void y(float f10) {
        u61 u61Var = (u61) this.f36104a;
        View[] viewArr = u61Var.f38534e;
        if (f10 == 1.0f) {
            if (viewArr[1] != null) {
                u61Var.G();
                u61Var.h.put(u61Var.f38535f[1], viewArr[1]);
                u61Var.removeView(viewArr[1]);
                u61Var.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            u61Var.A(u61Var.f38532b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (u61Var.D) {
            u61Var.F(view, (1.0f - f10) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            u61Var.F(view2, (-view2.getMeasuredWidth()) * f10);
        } else {
            u61Var.F(view, (1.0f - f10) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            u61Var.F(view3, view3.getMeasuredWidth() * f10);
        }
        u61Var.x(false);
    }

    public boolean z(int i7, int i10, Bundle bundle) {
        return false;
    }

    public n(int i7) {
        switch (i7) {
            case 15:
                this.f36104a = new SparseArray();
                return;
            case 16:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f36104a = new af0(this);
                    return;
                } else {
                    this.f36104a = new af0(this);
                    return;
                }
            default:
                this.f36104a = new ConcurrentHashMap(16);
                return;
        }
    }

    @Override
    public float get() {
        return ((tg.c2) this.f36104a).F;
    }

    public n(int i7, int i10, int... iArr) {
        u40[] u40VarArr = new u40[(iArr.length / 2) + 1];
        this.f36104a = u40VarArr;
        u40 u40Var = new u40(i7, i10);
        int i11 = 0;
        u40VarArr[0] = u40Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((u40[]) this.f36104a)[i12] = new u40(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public n(ArrayList arrayList) {
        this.f36104a = DesugarCollections.unmodifiableList(arrayList);
    }

    public n(EditText editText) {
        ?? obj = new Object();
        obj.f19608a = editText;
        t1.i iVar = new t1.i(editText);
        obj.f19609b = iVar;
        editText.addTextChangedListener(iVar);
        if (t1.a.f55261b == null) {
            synchronized (t1.a.f55260a) {
                try {
                    if (t1.a.f55261b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            t1.a.f55262c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, t1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        t1.a.f55261b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(t1.a.f55261b);
        this.f36104a = obj;
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
