package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import b8.mf;
import j$.util.Comparator$CC;
import j$.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.ik;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.wf;
public final class b8 extends View {
    public static final int H1 = 0;
    public float A0;
    public final j5 A1;
    public float B0;
    public final t7 B1;
    public float C0;
    public final t7 C1;
    public float D0;
    public final w7 D1;
    public final Paint E;
    public float E0;
    public final RectF E1;
    public final RectF F;
    public float F0;
    public final Paint F1;
    public final Paint G;
    public float G0;
    public final Rect G1;
    public final Paint H;
    public float H0;
    public final RectF I;
    public float I0;
    public final Path J;
    public float J0;
    public final float[] K;
    public float K0;
    public final int[] L;
    public int L0;
    public final v7 M;
    public boolean M0;
    public final u7 N;
    public long N0;
    public final z7 O;
    public long O0;
    public final z7 P;
    public VelocityTracker P0;
    public final z7 Q;
    public String Q0;
    public final z7 R;
    public String R0;
    public final z7 S;
    public long S0;
    public final ArrayList T;
    public a8 T0;
    public final Path U;
    public a8 U0;
    public final Paint V;
    public float V0;
    public final LinearGradient W;
    public float W0;
    public float X0;
    public boolean Y0;
    public float Z0;
    public final org.telegram.ui.ActionBar.d2 f42288a;
    public final Matrix f42289a0;
    public float f42290a1;
    public final boolean f42291b;
    public float f42292b0;
    public boolean f42293b1;
    public final f6 f42294c;
    public float f42295c0;
    public TL_wallet.card f42296c1;
    public final m2.t d;
    public final z7 f42297d0;
    public String f42298d1;
    public final SharedPreferences f42299e;
    public final Paint f42300e0;
    public boolean f42301e1;
    public final LinkedHashMap f42302f;
    public final ch0 f42303f0;
    public boolean f42304f1;
    public boolean f42305g0;
    public int f42306g1;
    public final ArrayList h;
    public a8 f42307h0;
    public final t7 f42308h1;
    public a8 f42309i0;
    public boolean f42310i1;
    public boolean f42311j0;
    public boolean f42312j1;
    public final Paint f42313k0;
    public boolean k1;
    public final Paint f42314l0;
    public a8 f42315l1;
    public final Paint m0;
    public o7 m1;
    public final ArrayList f42316n;
    public boolean f42317n0;
    public float[] f42318n1;
    public boolean f42319o0;
    public float f42320o1;
    public boolean f42321p0;
    public final float[] f42322p1;
    public boolean f42323q0;
    public final z7 f42324q1;
    public final Matrix f42325r;
    public boolean f42326r0;
    public final z7 f42327r1;
    public final Matrix f42328s;
    public boolean f42329s0;
    public final Paint f42330s1;
    public boolean f42331t0;
    public final Paint f42332t1;
    public boolean f42333u0;
    public final Matrix f42334u1;
    public boolean f42335v0;
    public final Path f42336v1;
    public final Matrix f42337w;
    public int f42338w0;
    public final RectF f42339w1;
    public final Matrix f42340x;
    public float f42341x0;
    public gi.l3 f42342x1;
    public final Paint f42343y;
    public float f42344y0;
    public gi.l3 f42345y1;
    public float f42346z0;
    public final i1 f42347z1;

    public b8(org.telegram.ui.ActionBar.d2 d2Var, f6 f6Var, m2.t tVar, TL_wallet.card cardVar) {
        super(d2Var.getContext());
        boolean z10;
        SharedPreferences sharedPreferences;
        boolean z11;
        this.f42302f = new LinkedHashMap();
        this.h = new ArrayList();
        this.f42316n = new ArrayList();
        this.f42325r = new Matrix();
        this.f42328s = new Matrix();
        this.f42337w = new Matrix();
        this.f42340x = new Matrix();
        this.f42343y = new Paint(3);
        this.E = new Paint(3);
        this.F = new RectF();
        Paint paint = new Paint(1);
        this.G = paint;
        Paint paint2 = new Paint(1);
        this.H = paint2;
        this.I = new RectF();
        this.J = new Path();
        this.K = new float[450];
        this.L = new int[225];
        this.O = new z7(0.0f, 260.0f, 0.78f);
        this.P = new z7(0.0f, 420.0f, 0.72f);
        this.Q = new z7(1.0f, 420.0f, 0.38f);
        this.R = new z7(0.0f, 170.0f, 0.42f);
        this.S = new z7(0.0f, 170.0f, 0.42f);
        this.T = new ArrayList();
        this.U = new Path();
        Paint paint3 = new Paint(1);
        this.V = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.W = linearGradient;
        this.f42289a0 = new Matrix();
        this.f42297d0 = new z7(0.0f, 120.0f, 1.0f);
        this.f42300e0 = new Paint(1);
        this.f42313k0 = new Paint(1);
        this.f42314l0 = new Paint(1);
        this.m0 = new Paint(1);
        this.V0 = 1.0f;
        this.W0 = 0.5f;
        this.X0 = 0.5f;
        this.f42308h1 = new t7(this, 1);
        this.f42322p1 = new float[3];
        this.f42324q1 = new z7(0.0f, 260.0f, 1.0f);
        this.f42327r1 = new z7(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.f42330s1 = paint4;
        Paint paint5 = new Paint(1);
        this.f42332t1 = paint5;
        this.f42334u1 = new Matrix();
        this.f42336v1 = new Path();
        this.f42339w1 = new RectF();
        this.f42347z1 = new i1(this, 1);
        this.A1 = new j5(2, this);
        this.B1 = new t7(this, 2);
        this.C1 = new t7(this, 3);
        this.D1 = new w7(this);
        this.E1 = new RectF();
        Paint paint6 = new Paint(1);
        this.F1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.G1 = new Rect();
        this.f42288a = d2Var;
        if (cardVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42291b = z10;
        ch0 ch0Var = new ch0(2131624357, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
        this.f42303f0 = ch0Var;
        ch0Var.R(this);
        this.f42294c = f6Var;
        this.d = tVar;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z10) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + d2Var.getCurrentAccount() + "_" + k0.x(d2Var.getCurrentAccount()).t(), 0);
        }
        this.f42299e = sharedPreferences;
        this.Q0 = z10 ? null : sharedPreferences.getString("style", null);
        if (!z10 && !hp.e1().getBoolean("walletcardstickerhint", false)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42310i1 = z11;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint4.setStrokeCap(cap);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(-1);
        setImportantForAccessibility(2);
        setTranslationZ(org.telegram.messenger.g0.L(24.0f));
        paint.setStyle(style);
        paint.setStrokeCap(cap);
        paint2.setTypeface(org.telegram.messenger.g0.o());
        u7 u7Var = new u7(this, getContext());
        this.N = u7Var;
        v7 v7Var = new v7(this, getContext());
        this.M = v7Var;
        u7Var.setTag(a6.f42135o0);
        f6Var.getFrontFace().addView(u7Var, 0, mf.c(-1.0f, -1));
        f6Var.getFrontFace().addView(v7Var, f6Var.getStickerLayerIndex(), mf.c(-1.0f, -1));
        if (z10) {
            v7Var.addOnLayoutChangeListener(new q7(this, 0));
            d(cardVar);
            return;
        }
        int currentAccount = d2Var.getCurrentAccount();
        hp s12 = hp.s1(currentAccount);
        long e10 = h10.i(currentAccount).e();
        TLRPC.UserFull b22 = s12.b2(e10);
        if (b22 != null) {
            TL_wallet.card cardVar2 = b22.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
            return;
        }
        s12.W2(s12.a2(Long.valueOf(e10)), 0, true, new k(this, 4));
    }

    public static boolean F(int i3, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(45);
            HashSet hashSet = ((org.telegram.messenger.o0) hp.s1(i3).f23167x7.m0.f13688b).f24470c;
            if (hashSet != null) {
                if (lastIndexOf > 0) {
                    str = str.substring(0, lastIndexOf);
                }
                if (hashSet.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Path H(a8 a8Var) {
        Bitmap bitmap;
        int i3;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        if (a8Var != null && a8Var.F == null && (bitmap = a8Var.f42184u) != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
            int[] iArr = new int[16384];
            createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
            if (createScaledBitmap != a8Var.f42184u) {
                createScaledBitmap.recycle();
            }
            boolean[] zArr = new boolean[16384];
            int i12 = -1;
            for (int i13 = 0; i13 < 16384; i13++) {
                if ((iArr[i13] >>> 24) >= 110) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zArr[i13] = z11;
                if (i12 < 0 && z11) {
                    i12 = i13;
                }
            }
            if (i12 >= 0) {
                int i14 = 8;
                int[] iArr2 = {-1, -1, 0, 1, 1, 1, 0, -1};
                int[] iArr3 = {0, -1, -1, -1, 0, 1, 1, 1};
                int i15 = i12 % 128;
                int i16 = i12 / 128;
                int i17 = i15 - 1;
                float[] fArr = new float[512];
                int i18 = i16;
                int i19 = i18;
                int i20 = i15;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    if (i21 < 20000) {
                        int i23 = i22 * 2;
                        i3 = 0;
                        if (i23 + 2 > fArr.length) {
                            fArr = Arrays.copyOf(fArr, fArr.length * 2);
                        }
                        fArr[i23] = i20 + 0.5f;
                        fArr[i23 + 1] = i18 + 0.5f;
                        i22++;
                        int i24 = 0;
                        while (i24 < i14 && (iArr2[i24] != i17 - i20 || iArr3[i24] != i19 - i18)) {
                            i24++;
                        }
                        int i25 = 1;
                        while (true) {
                            if (i25 <= i14) {
                                int i26 = (i24 + i25) % i14;
                                i10 = i14;
                                int i27 = i20 + iArr2[i26];
                                int i28 = i24;
                                int i29 = i18 + iArr3[i26];
                                if (i27 >= 0 && i29 >= 0) {
                                    i11 = i25;
                                    if (i27 < 128 && i29 < 128 && zArr[(i29 * 128) + i27]) {
                                        int i30 = (i26 + 7) % 8;
                                        int i31 = i20 + iArr2[i30];
                                        i19 = i18 + iArr3[i30];
                                        i18 = i29;
                                        i17 = i31;
                                        i20 = i27;
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    i11 = i25;
                                }
                                i25 = i11 + 1;
                                i14 = i10;
                                i24 = i28;
                            } else {
                                i10 = i14;
                                z10 = false;
                                break;
                            }
                        }
                        if (!z10 || (i20 == i15 && i18 == i16)) {
                            break;
                        }
                        i21++;
                        i14 = i10;
                    } else {
                        i3 = 0;
                        break;
                    }
                }
                int i32 = (i22 + 1) / 2;
                if (i32 >= 3) {
                    float[] fArr2 = new float[i32 * 2];
                    for (int i33 = i3; i33 < i22; i33 += 2) {
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        for (int i34 = -3; i34 <= 3; i34++) {
                            int i35 = ((((i33 + i34) % i22) + i22) % i22) * 2;
                            f10 += fArr[i35];
                            f11 += fArr[i35 + 1];
                        }
                        fArr2[i33] = ((f10 / 7.0f) / 128.0f) - 0.5f;
                        fArr2[i33 + 1] = ((f11 / 7.0f) / 128.0f) - 0.5f;
                    }
                    Path path = new Path();
                    path.moveTo((fArr2[i3] + fArr2[2]) / 2.0f, (fArr2[1] + fArr2[3]) / 2.0f);
                    int i36 = 1;
                    while (i36 <= i32) {
                        int i37 = i36 % i32;
                        i36++;
                        int i38 = i37 * 2;
                        float f12 = fArr2[i38];
                        float f13 = fArr2[i38 + 1];
                        int i39 = (i36 % i32) * 2;
                        path.quadTo(f12, f13, (fArr2[i39] + f12) / 2.0f, (fArr2[i39 + 1] + f13) / 2.0f);
                    }
                    path.close();
                    a8Var.F = path;
                    return path;
                }
                return null;
            }
            return null;
        } else if (a8Var == null) {
            return null;
        } else {
            return a8Var.F;
        }
    }

    public static void J(gi.l3 l3Var, float f10, float f11) {
        o(l3Var, 3);
        l3Var.p(0.0f, f10 - l3Var.getPaddingLeft());
        l3Var.setTranslationY(f11 - l3Var.getLayoutParams().height);
        l3Var.invalidate();
    }

    public static double N(float f10) {
        return Math.round(f10 * 100.0f) / 100.0d;
    }

    public static String T(TL_wallet.card cardVar) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        ArrayList<TL_wallet.cardSticker> arrayList = cardVar.stickers;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i3);
                i3++;
                TL_wallet.cardSticker cardsticker2 = cardsticker;
                TL_wallet.nftItem nftitem = cardsticker2.nft;
                if (nftitem != null) {
                    sb2.append(nftitem.address);
                    sb2.append(':');
                    sb2.append(y(cardsticker2.coordinates));
                    sb2.append(';');
                }
            }
        }
        sb2.append("bg:");
        TL_wallet.nftItem nftitem2 = cardVar.bg_nft_item;
        if (nftitem2 == null) {
            str = null;
        } else {
            str = nftitem2.address;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static boolean b(a8 a8Var) {
        TL_wallet.nftItem nftitem;
        if (a8Var != null && (nftitem = a8Var.f42164b) != null && nftitem.gift != null) {
            return true;
        }
        return false;
    }

    public static float c(float f10) {
        float f11 = f10 % 360.0f;
        if (f11 > 180.0f) {
            f11 -= 360.0f;
        }
        if (f11 < -180.0f) {
            return f11 + 360.0f;
        }
        return f11;
    }

    public static void e0(int i3, TL_wallet.card cardVar) {
        TLRPC.UserFull b22 = hp.s1(i3).b2(h10.i(i3).e());
        if (b22 == null) {
            return;
        }
        b22.wallet_card = cardVar;
        qr.a0(i3).j2(b22, false);
    }

    public static float n(RectF rectF, RectF rectF2) {
        float min = Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left);
        float min2 = Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top);
        if (min <= 0.0f || min2 <= 0.0f || rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return 0.0f;
        }
        return Utilities.l(((min * min2) / (rectF2.height() * rectF2.width())) * 4.0f);
    }

    public static void o(gi.l3 l3Var, int i3) {
        if ((l3Var.getTag() instanceof Integer) && ((Integer) l3Var.getTag()).intValue() == i3) {
            return;
        }
        l3Var.setTag(Integer.valueOf(i3));
        l3Var.f13077a = i3;
        l3Var.p(1.0f, 0.0f);
    }

    public static float u(float f10, float f11, float f12) {
        float l10 = Utilities.l((f10 - f11) / (f12 - f11));
        return com.google.android.recaptcha.internal.a.B(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static String y(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        if (mediaAreaCoordinates == null) {
            return "";
        }
        return String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.f27237x), Double.valueOf(mediaAreaCoordinates.f27238y), Double.valueOf(mediaAreaCoordinates.f27236w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public final boolean A() {
        f6 f6Var = this.f42294c;
        this.Z0 = f6Var.getFrontFace().getWidth();
        float height = f6Var.getFrontFace().getHeight();
        this.f42290a1 = height;
        if (this.Z0 > 0.0f && height > 0.0f) {
            Matrix matrix = this.f42325r;
            if (f6Var.g(this, matrix) && matrix.invert(this.f42328s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final gi.l3 B(int i3, boolean z10) {
        float f10;
        gi.l3 l3Var = new gi.l3(getContext(), 3);
        l3Var.r(true);
        if (z10) {
            f10 = 15.0f;
        } else {
            f10 = 11.0f;
        }
        l3Var.n(11.0f, 6.0f, f10, 7.0f);
        l3Var.k(z10);
        l3Var.L = Layout.Alignment.ALIGN_NORMAL;
        l3Var.s(12.0f);
        l3Var.d = -1L;
        String M0 = bd.M0(i3, null);
        l3Var.h = gi.l3.a(M0, l3Var.getTextPaint());
        l3Var.u(M0);
        l3Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        l3Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(l3Var, mf.e(-1, 150, 48));
        return l3Var;
    }

    public final boolean C() {
        Path H;
        if (this.f42318n1 == null) {
            H = null;
        } else {
            H = H(this.f42315l1);
        }
        if (H == null) {
            return false;
        }
        float U = U() * this.f42318n1[2];
        Matrix matrix = this.f42334u1;
        matrix.setScale(U, U);
        float[] fArr = this.f42318n1;
        matrix.postTranslate(fArr[0], fArr[1]);
        H.transform(matrix, this.f42336v1);
        return true;
    }

    public final float[] D(float f10) {
        float[] fArr = this.f42322p1;
        fArr[0] = (u(f10, 0.45f, 0.82f) - u(f10, 1.3f, 1.72f)) * 0.9f;
        fArr[1] = (((float) Math.sin(Utilities.l((f10 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f10, 0.6f, 0.92f) - u(f10, 1.18f, 1.46f));
        fArr[2] = u(f10, 1.58f, 1.7f) - u(f10, 1.7f, 1.92f);
        return fArr;
    }

    public final void E(a8 a8Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        a8Var.J = 0L;
        z7 z7Var = a8Var.h;
        z7 z7Var2 = a8Var.f42170f;
        z7 z7Var3 = a8Var.f42169e;
        if (a8Var.f42162a.equals(this.Q0)) {
            l();
        }
        if (a8Var.b()) {
            float[] L = L(z7Var3.f43511a, z7Var2.f43511a);
            z7Var3.a(L[0]);
            z7Var2.a(L[1]);
        }
        a8Var.H = 4;
        a8Var.W = 0.0f;
        a8Var.X = z7Var3.f43511a;
        a8Var.Y = z7Var2.f43511a;
        a8Var.Z = a8Var.f42171g.f43511a * z7Var.f43511a;
        a8Var.f42163a0 = a8Var.f42172i.f43511a;
        if (this.f42341x0 > org.telegram.messenger.g0.L(650.0f)) {
            f10 = 0.32f;
        } else {
            f10 = 0.44f;
        }
        a8Var.f42165b0 = f10;
        this.f42341x0 = 0.0f;
        o7 j10 = j(a8Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.o();
        }
        if (j10 != null) {
            f11 = j10.getScaleX();
        } else {
            f11 = 1.0f;
        }
        a8Var.f42167c0 = f11;
        RectF Z = Z(a8Var);
        if (Z != null) {
            float centerX = Z.centerX() - a8Var.X;
            float centerY = Z.centerY() - a8Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            if (hypot > org.telegram.messenger.g0.L(6.0f)) {
                f12 = centerX / hypot;
            } else {
                f12 = 0.0f;
            }
            a8Var.U = f12;
            if (hypot > org.telegram.messenger.g0.L(6.0f)) {
                f13 = centerY / hypot;
            } else {
                f13 = 1.0f;
            }
            a8Var.V = f13;
        }
        a8Var.f42175l.a(0.0f);
        z7Var.a(1.0f);
        long j11 = this.O0 + 1;
        this.O0 = j11;
        a8Var.I = j11;
        O();
        f0();
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList(this.f42302f.values());
        List.EL.sort(arrayList, Comparator$CC.comparingLong(new ik(5)));
        return arrayList;
    }

    public final void I(a8 a8Var, float[] fArr, float[] fArr2, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        long j10 = a8Var.J;
        z7 z7Var = a8Var.f42178o;
        z7 z7Var2 = a8Var.f42177n;
        if (j10 == 0) {
            long j11 = this.S0 + 1;
            this.S0 = j11;
            a8Var.J = j11;
            ArrayList arrayList = new ArrayList();
            for (a8 a8Var2 : this.f42302f.values()) {
                if (a8Var2 != a8Var && a8Var2.b()) {
                    arrayList.add(a8Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.EL.sort(arrayList, Comparator$CC.comparingLong(new ik(6)));
                for (int i3 = 0; i3 <= arrayList.size() - 10; i3++) {
                    a8 a8Var3 = (a8) arrayList.get(i3);
                    if (this.d.v0()) {
                        E(a8Var3);
                    } else {
                        V(a8Var3);
                    }
                }
                k();
            }
        }
        a8Var.H = 1;
        a8Var.Q = false;
        a8Var.M = false;
        a8Var.L = false;
        a8Var.P = z10;
        a8Var.O = z10;
        long j12 = this.O0 + 1;
        this.O0 = j12;
        a8Var.I = j12;
        z7Var2.a(0.0f);
        z7Var.a(0.0f);
        z7 z7Var3 = a8Var.f42169e;
        float f14 = 500.0f;
        float f15 = 150.0f;
        if (z10) {
            f10 = 150.0f;
        } else {
            f10 = 500.0f;
        }
        float f16 = 0.82f;
        float f17 = 1.0f;
        if (z10) {
            f11 = 0.82f;
        } else {
            f11 = 1.0f;
        }
        z7Var3.d = f10;
        z7Var3.f43514e = f11;
        z7Var3.a(fArr[0]);
        z7Var3.f43512b = fArr2[0];
        z7 z7Var4 = a8Var.f42170f;
        if (z10) {
            f14 = 150.0f;
        }
        if (!z10) {
            f16 = 1.0f;
        }
        z7Var4.d = f14;
        z7Var4.f43514e = f16;
        z7Var4.a(fArr[1]);
        float f18 = fArr2[1];
        z7Var4.f43512b = f18;
        a8Var.h.f43512b = fArr2[2];
        z7 z7Var5 = a8Var.f42171g;
        z7Var5.d = 300.0f;
        z7Var5.f43514e = 0.5f;
        z7Var5.f43512b = 1.0f;
        z7 z7Var6 = a8Var.f42173j;
        if (z10) {
            f15 = 110.0f;
        }
        z7Var6.d = f15;
        z7Var6.f43514e = 0.9f;
        z7Var6.f43512b = 0.0f;
        a8Var.f42176m.f43512b = 1.0f;
        a8Var.f42175l.f43512b = 0.0f;
        float f19 = fArr2[0] - fArr[0];
        float f20 = f18 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f19, f20));
        if (max > org.telegram.messenger.g0.L(6.0f)) {
            f12 = f19 / max;
        } else {
            f12 = 0.0f;
        }
        a8Var.U = f12;
        if (max > org.telegram.messenger.g0.L(6.0f)) {
            f13 = f20 / max;
        } else {
            f13 = 1.0f;
        }
        a8Var.V = f13;
        z7 z7Var7 = a8Var.f42174k;
        z7Var7.a(0.9f);
        z7Var7.f43512b = 0.0f;
        if (z10) {
            float min = Math.min(org.telegram.messenger.g0.L(110.0f), 0.32f * max);
            if (f19 >= 0.0f) {
                f17 = -1.0f;
            }
            z7Var2.a(0.0f);
            z7Var2.f43513c = ((-f20) / max) * min * f17 * 20.0f;
            z7Var.a(0.0f);
            z7Var.f43513c = com.google.android.recaptcha.internal.a.B(min, 0.5f, (f19 / max) * min * f17, 20.0f);
        }
        O();
        f0();
    }

    public final void K(a8 a8Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z10) {
        a8Var.h.a((float) (mediaAreaCoordinates.f27236w / 23.100000381469727d));
        a8Var.f42172i.a(c((float) mediaAreaCoordinates.rotation));
        a8Var.N = z10;
        a8Var.f42169e.a((((float) mediaAreaCoordinates.f27237x) / 100.0f) * this.Z0);
        a8Var.f42170f.a((((float) mediaAreaCoordinates.f27238y) / 100.0f) * this.f42290a1);
        a8Var.f42171g.a(1.0f);
        a8Var.f42173j.a(0.0f);
        a8Var.f42174k.a(0.0f);
        a8Var.f42177n.a(0.0f);
        a8Var.f42178o.a(0.0f);
        a8Var.f42175l.a(0.0f);
        a8Var.H = 2;
        long j10 = this.O0 + 1;
        this.O0 = j10;
        a8Var.I = j10;
        a8Var.f42176m.a(1.0f);
        if (a8Var.J == 0) {
            long j11 = this.S0 + 1;
            this.S0 = j11;
            a8Var.J = j11;
        }
        if (a8Var.f42162a.equals(this.Q0)) {
            this.U0 = a8Var;
            this.T0 = a8Var;
            this.V0 = 1.0f;
            e();
        }
    }

    public final float[] L(float f10, float f11) {
        float[] fArr = {f10, f11};
        this.f42325r.mapPoints(fArr);
        return fArr;
    }

    public final void M(a8 a8Var, float f10, float f11) {
        float y9;
        z7 z7Var = a8Var.f42169e;
        z7 z7Var2 = a8Var.h;
        float[] L = L(z7Var.f43511a, a8Var.f42170f.f43511a);
        boolean z10 = false;
        float t10 = Utilities.t(f10, f11, L[0], L[1]);
        if (Float.isNaN(this.F0)) {
            this.F0 = t10;
            this.G0 = z7Var2.f43512b;
        }
        if (Math.abs(t10 - this.F0) > org.telegram.messenger.g0.L(5.0f)) {
            z7 z7Var3 = a8Var.f42180q;
            z7Var3.d = 700.0f;
            z7Var3.f43514e = 1.0f;
            z7Var3.f43512b = 1.0f;
        }
        float L2 = org.telegram.messenger.g0.L(32.0f) / U();
        if (this.f42311j0) {
            y9 = (this.G0 * t10) / Math.max(1.0f, this.F0);
        } else {
            y9 = com.google.android.recaptcha.internal.a.y(1.21f, L2, (t10 - this.F0) / org.telegram.messenger.g0.L(110.0f), this.G0);
        }
        z7Var2.d = 900.0f;
        z7Var2.f43514e = 1.0f;
        z7Var2.f43512b = Math.max(L2, Math.min(1.21f, y9));
        if (t10 < org.telegram.messenger.g0.L(14.0f)) {
            this.C0 = Float.NaN;
            return;
        }
        float degrees = (float) Math.toDegrees(Math.atan2(f11 - L[1], f10 - L[0]));
        if (!Float.isNaN(this.C0)) {
            this.D0 = c(degrees - this.C0) + this.D0;
        }
        this.C0 = degrees;
        float f12 = this.E0 + this.D0;
        float round = Math.round(f12 / 90.0f) * 90;
        if (Math.abs(f12 - round) < 5.0f) {
            z10 = true;
        }
        if (z10 && !this.M0) {
            performHapticFeedback(4);
        }
        this.M0 = z10;
        z7 z7Var4 = a8Var.f42172i;
        z7Var4.d = 900.0f;
        z7Var4.f43514e = 0.95f;
        if (z10) {
            f12 = round;
        }
        z7Var4.f43512b = f12;
    }

    public final void O() {
        if (!this.f42291b && this.Z0 > 0.0f && this.f42290a1 > 0.0f) {
            SharedPreferences.Editor edit = this.f42299e.edit();
            for (a8 a8Var : this.f42302f.values()) {
                boolean b10 = a8Var.b();
                String str = a8Var.f42162a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", a8Var.f42169e.f43512b / this.Z0);
                        jSONObject.put("y", a8Var.f42170f.f43512b / this.f42290a1);
                        jSONObject.put("r", a8Var.f42172i.f43512b);
                        jSONObject.put("s", a8Var.h.f43512b);
                        jSONObject.put("q", a8Var.N);
                        edit.putString(str, jSONObject.toString());
                    } catch (Exception unused) {
                    }
                } else {
                    edit.remove(str);
                }
            }
            String str2 = this.Q0;
            if (str2 == null) {
                edit.remove("style");
            } else {
                edit.putString("style", str2);
            }
            edit.apply();
        }
    }

    public final float P(a8 a8Var) {
        return (((1.0f - (a8Var.f42180q.f43511a * 0.9f)) * a8Var.f42175l.f43511a * 0.04f) + 1.0f) * U() * a8Var.f42171g.f43511a * a8Var.h.f43511a;
    }

    public final void Q() {
        if (!this.f42301e1 || this.f42306g1 != 0) {
            return;
        }
        if (!this.f42293b1 && (this.f42323q0 || !A())) {
            org.telegram.messenger.g0.i3(this.f42308h1, 1000L);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList G = G();
        int size = G.size();
        int i3 = 0;
        String str = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = G.get(i10);
            i10++;
            a8 a8Var = (a8) obj;
            boolean b10 = a8Var.b();
            String str2 = a8Var.f42162a;
            if (b10) {
                sb2.append(str2);
                sb2.append(':');
                sb2.append(y(a0(a8Var)));
                sb2.append(';');
                if (str2.equals(this.Q0) && m(a8Var)) {
                    str = str2;
                }
            }
        }
        if (a1.g.s(sb2, "bg:", str).equals(this.f42298d1)) {
            this.f42301e1 = false;
            return;
        }
        TL_wallet.setCardStickers setcardstickers = new TL_wallet.setCardStickers();
        ArrayList G2 = G();
        int size2 = G2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = G2.get(i11);
            i11++;
            a8 a8Var2 = (a8) obj2;
            boolean b11 = a8Var2.b();
            String str3 = a8Var2.f42162a;
            if (b11) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                inputwalletcardsticker.nft_address = str3;
                inputwalletcardsticker.coordinates = a0(a8Var2);
                setcardstickers.stickers.add(inputwalletcardsticker);
                if (str3.equals(this.Q0) && m(a8Var2)) {
                    setcardstickers.bg_nft_address = str3;
                }
            }
        }
        this.f42301e1 = false;
        int currentAccount = this.f42288a.getCurrentAccount();
        TL_wallet.card cardVar = this.f42296c1;
        TL_wallet.card cardVar2 = new TL_wallet.card();
        TL_wallet.card cardVar3 = this.f42296c1;
        if (cardVar3 != null) {
            cardVar2.address = cardVar3.address;
            cardVar2.balance = cardVar3.balance;
        }
        ArrayList<TL_wallet.inputWalletCardSticker> arrayList = setcardstickers.stickers;
        int size3 = arrayList.size();
        while (i3 < size3) {
            TL_wallet.inputWalletCardSticker inputwalletcardsticker2 = arrayList.get(i3);
            i3++;
            TL_wallet.inputWalletCardSticker inputwalletcardsticker3 = inputwalletcardsticker2;
            a8 a8Var3 = (a8) this.f42302f.get(inputwalletcardsticker3.nft_address);
            if (a8Var3 != null && a8Var3.f42164b != null) {
                TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                cardsticker.nft = a8Var3.f42164b;
                cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                cardVar2.stickers.add(cardsticker);
                if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                    cardVar2.bg_nft_item = a8Var3.f42164b;
                }
            }
        }
        e0(currentAccount, cardVar2);
        this.f42306g1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new c3.b(1), new wf(this, currentAccount, cardVar, 3));
    }

    public final TL_wallet.cardSticker R(String str) {
        ArrayList<TL_wallet.cardSticker> arrayList;
        TL_wallet.card cardVar = this.f42296c1;
        if (cardVar != null && (arrayList = cardVar.stickers) != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i3);
                i3++;
                TL_wallet.cardSticker cardsticker2 = cardsticker;
                TL_wallet.nftItem nftitem = cardsticker2.nft;
                if (nftitem != null && str.equals(nftitem.address)) {
                    return cardsticker2;
                }
            }
        }
        return null;
    }

    public final void S(o7 o7Var) {
        int i3;
        int i10;
        removeCallbacks(this.B1);
        this.f42331t0 = true;
        this.f42323q0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        o7Var.animate().cancel();
        o7Var.n(o7Var.getScaleX() * o7Var.f43013z0);
        o7Var.setScaleX(1.0f);
        o7Var.setScaleY(1.0f);
        o7Var.m(1.0f, 150L, null);
        final a8 v = v(o7Var.f43011x0);
        String str = v.f42162a;
        if (!b(v) && !v.b()) {
            this.f42331t0 = false;
            return;
        }
        f60 I = f60.I(this.f42288a, o7Var);
        I.f33747s = 51;
        if (m(v) || str.equals(this.Q0)) {
            if (str.equals(this.Q0)) {
                i3 = 2131743113;
            } else {
                i3 = 2131743119;
            }
            I.c(2131232097, bd.M0(i3, null), new Runnable(this) {
                public final b8 f43163b;

                {
                    this.f43163b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f43163b.c0(v);
                            return;
                        default:
                            b8 b8Var = this.f43163b;
                            b8Var.getClass();
                            b8Var.b0(v.f42164b);
                            return;
                    }
                }
            }, false);
        }
        if (v.b()) {
            i10 = 2131743112;
        } else {
            i10 = 2131743120;
        }
        I.c(2131232382, bd.M0(i10, null), new Runnable(this) {
            public final b8 f43163b;

            {
                this.f43163b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f43163b.c0(v);
                        return;
                    default:
                        b8 b8Var = this.f43163b;
                        b8Var.getClass();
                        b8Var.b0(v.f42164b);
                        return;
                }
            }
        }, false);
        I.f33742p = new t7(this, 0);
        I.Z();
        performHapticFeedback(0);
    }

    public final float U() {
        return this.Z0 * 0.231f;
    }

    public final void V(a8 a8Var) {
        if (a8Var.f42162a.equals(this.Q0)) {
            l();
        }
        a8Var.N = false;
        g(a8Var);
        o7 j10 = j(a8Var);
        if (j10 != null) {
            j10.setScaleX(0.93f);
            j10.setScaleY(0.93f);
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        O();
        f0();
    }

    public final void W(a8 a8Var, float f10, float f11) {
        boolean z10;
        float[] fArr;
        boolean z11;
        this.f42309i0 = null;
        this.f42317n0 = true;
        if (this.L0 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42321p0 = z10;
        if (this.f42310i1) {
            if (a8Var == this.f42315l1 && !z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f42312j1 = z11;
            this.k1 = false;
            this.f42310i1 = false;
            hp.e1().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z12 = a8Var.N;
        z7 z7Var = a8Var.f42176m;
        z7 z7Var2 = a8Var.f42170f;
        z7 z7Var3 = a8Var.f42169e;
        float f12 = 1.0f;
        if (z12) {
            a8Var.N = false;
            z7 z7Var4 = a8Var.h;
            z7Var4.d = 420.0f;
            z7Var4.f43514e = 0.8f;
            z7Var4.f43512b = 1.0f;
        }
        o7 j10 = j(a8Var);
        if (j10 != null) {
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.f42333u0 = false;
        if (this.f42321p0) {
            fArr = L(z7Var3.f43511a, z7Var2.f43511a);
        } else {
            RectF Z = Z(a8Var);
            if (Z == null) {
                return;
            }
            float[] fArr2 = {Z.centerX(), Z.centerY()};
            z7 z7Var5 = a8Var.f42171g;
            z7Var5.d = 500.0f;
            z7Var5.f43514e = 0.75f;
            z7Var5.a((f(a8Var) * Z.width()) / U());
            z7Var.a(0.0f);
            w5.m0((w5) this.d.f19007c, 0L);
            fArr = fArr2;
        }
        z7Var3.d = 1100.0f;
        z7Var3.f43514e = 0.9f;
        z7Var3.a(fArr[0]);
        z7Var2.d = 1100.0f;
        z7Var2.f43514e = 0.9f;
        z7Var2.a(fArr[1]);
        a8Var.H = 3;
        long j11 = this.O0 + 1;
        this.O0 = j11;
        a8Var.I = j11;
        z7Var.f43512b = 1.0f;
        z7 z7Var6 = a8Var.f42173j;
        z7Var6.d = 320.0f;
        z7Var6.f43514e = 0.75f;
        z7Var6.f43512b = 1.0f;
        a8Var.f42175l.a(0.0f);
        this.A0 = fArr[0] - f10;
        this.B0 = fArr[1] - f11;
        if (!this.f42321p0) {
            f12 = 0.0f;
        }
        this.O.f43512b = f12;
        performHapticFeedback(3);
    }

    public final void X(a8 a8Var, boolean z10) {
        this.T0 = this.U0;
        this.U0 = a8Var;
        this.V0 = 0.0f;
        this.Y0 = z10;
        if (a8Var != null) {
            this.W0 = a8Var.f42169e.f43512b / this.Z0;
            this.X0 = a8Var.f42170f.f43512b / this.f42290a1;
        }
        f0();
    }

    public final void Y(c0 c0Var) {
        TL_wallet.nftItem nftitem;
        ArrayList arrayList = c0Var.f42360a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
            if (nftitem2.gift != null) {
                v(nftitem2);
            }
        }
        Iterator it = this.f42302f.values().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            a8 a8Var = (a8) it.next();
            int i10 = a8Var.H;
            String str = a8Var.f42162a;
            if (i10 != 3) {
                ArrayList arrayList2 = c0Var.f42362c;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                        if (!wallettransaction.failed && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, str)) {
                            if (str.equals(this.Q0) || str.equals(this.R0)) {
                                this.R0 = null;
                                this.Q0 = null;
                                X(null, true);
                            }
                            it.remove();
                            SharedPreferences sharedPreferences = this.f42299e;
                            if (sharedPreferences != null) {
                                sharedPreferences.edit().remove(str).apply();
                            }
                            z10 = true;
                        }
                    }
                }
            }
        }
        if (z10 && !this.f42291b) {
            O();
            k();
        }
        f0();
    }

    public final RectF Z(a8 a8Var) {
        o7 j10 = j(a8Var);
        if (j10 != null && j10.isShown()) {
            Matrix matrix = this.f42337w;
            f6.k(j10, matrix);
            Matrix matrix2 = this.f42340x;
            f6.k(this, matrix2);
            if (!matrix2.invert(matrix2)) {
                return null;
            }
            matrix.postConcat(matrix2);
            RectF rectF = new RectF(0.0f, 0.0f, j10.getWidth(), j10.getHeight());
            matrix.mapRect(rectF);
            if (rectF.bottom > 0.0f && rectF.top < getHeight()) {
                return rectF;
            }
        }
        return null;
    }

    public final void a() {
        this.f42326r0 = false;
        removeCallbacks(this.C1);
        removeCallbacks(this.B1);
        this.f42307h0 = null;
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        f0();
    }

    public final TL_stories.TL_mediaAreaCoordinates a0(a8 a8Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float U = U() * a8Var.h.f43512b;
        tL_mediaAreaCoordinates.f27237x = N((a8Var.f42169e.f43512b / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.f27238y = N((a8Var.f42170f.f43512b / this.f42290a1) * 100.0f);
        tL_mediaAreaCoordinates.f27236w = N((U / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.h = N((U / this.f42290a1) * 100.0f);
        float f10 = a8Var.f42172i.f43512b % 360.0f;
        if (f10 < 0.0f) {
            f10 += 360.0f;
        }
        tL_mediaAreaCoordinates.rotation = N(f10);
        return tL_mediaAreaCoordinates;
    }

    public final void b0(TL_wallet.nftItem nftitem) {
        if (!A()) {
            return;
        }
        a8 v = v(nftitem);
        if (v.b()) {
            if (this.d.v0()) {
                E(v);
            } else {
                V(v);
            }
        } else if (v.H == 0 && b(v)) {
            d0(v);
        }
        k();
    }

    public final void c0(a8 a8Var) {
        String str = a8Var.f42162a;
        if (str.equals(this.Q0)) {
            l();
        } else if (m(a8Var)) {
            this.Q0 = str;
            if (a8Var.b()) {
                X(a8Var, false);
                k();
            } else {
                this.R0 = str;
                d0(a8Var);
                if (a8Var.H == 0) {
                    this.R0 = null;
                    this.Q0 = null;
                } else {
                    k();
                }
            }
            O();
        }
    }

    public final void d(TL_wallet.card cardVar) {
        String str;
        a8 a8Var;
        a8 a8Var2;
        int i3;
        this.f42296c1 = cardVar;
        this.f42298d1 = T(cardVar);
        if (!this.f42301e1 && this.f42306g1 == 0 && !this.f42323q0) {
            TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
            a8 a8Var3 = null;
            if (nftitem == null) {
                str = null;
            } else {
                str = nftitem.address;
            }
            boolean equals = TextUtils.equals(str, this.Q0);
            if (!equals) {
                this.Q0 = str;
                this.R0 = null;
            }
            ArrayList<TL_wallet.cardSticker> arrayList = cardVar.stickers;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_wallet.cardSticker cardsticker = arrayList.get(i10);
                    i10++;
                    TL_wallet.nftItem nftitem2 = cardsticker.nft;
                    if (nftitem2 != null && nftitem2.gift != null) {
                        v(nftitem2);
                    }
                }
            }
            if (this.f42291b) {
                TL_wallet.nftItem nftitem3 = cardVar.bg_nft_item;
                if (nftitem3 != null && nftitem3.gift != null) {
                    a8Var3 = v(nftitem3);
                }
                this.T0 = a8Var3;
                this.U0 = a8Var3;
                this.V0 = 1.0f;
                e();
                f0();
            } else if (!A()) {
                f0();
            } else {
                this.f42304f1 = true;
                ArrayList G = G();
                int size2 = G.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj = G.get(i11);
                    i11++;
                    a8 a8Var4 = (a8) obj;
                    if (a8Var4.K && (i3 = a8Var4.H) != 3 && i3 != 4 && i3 != 5) {
                        TL_wallet.cardSticker R = R(a8Var4.f42162a);
                        if (R != null) {
                            if (!a8Var4.b() || !y(a0(a8Var4)).equals(y(R.coordinates))) {
                                K(a8Var4, R.coordinates, a8Var4.N);
                            }
                        } else if (a8Var4.b()) {
                            E(a8Var4);
                        }
                    }
                }
                ArrayList<TL_wallet.cardSticker> arrayList2 = cardVar.stickers;
                LinkedHashMap linkedHashMap = this.f42302f;
                if (arrayList2 != null) {
                    int size3 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        TL_wallet.cardSticker cardsticker2 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.nftItem nftitem4 = cardsticker2.nft;
                        if (nftitem4 == null) {
                            a8Var2 = null;
                        } else {
                            a8Var2 = (a8) linkedHashMap.get(nftitem4.address);
                        }
                        if (a8Var2 != null && a8Var2.H == 2) {
                            long j10 = this.O0 + 1;
                            this.O0 = j10;
                            a8Var2.I = j10;
                        }
                    }
                }
                if (!equals) {
                    String str2 = this.Q0;
                    if (str2 == null) {
                        a8Var = null;
                    } else {
                        a8Var = (a8) linkedHashMap.get(str2);
                    }
                    if (a8Var != null && a8Var.b()) {
                        X(a8Var, false);
                    } else {
                        X(null, true);
                    }
                }
                this.f42304f1 = false;
                O();
                f0();
            }
        }
    }

    public final void d0(a8 a8Var) {
        w5.m0((w5) this.d.f19007c, 2600L);
        if (A()) {
            float[] x10 = x(a8Var, Float.NaN, Float.NaN, true);
            RectF Z = Z(a8Var);
            if (x10 != null && Z != null) {
                a8Var.f42171g.a((f(a8Var) * Z.width()) / U());
                a8Var.f42176m.a(0.0f);
                a8Var.f42173j.a(1.0f);
                float[] fArr = {Z.centerX(), Z.centerY()};
                this.f42328s.mapPoints(fArr);
                I(a8Var, fArr, x10, true);
                performHapticFeedback(3);
                return;
            }
            o7 j10 = j(a8Var);
            if (j10 != null) {
                j10.animate().rotation(3.0f).setDuration(90L).withEndAction(new r7(j10, 0)).start();
            }
        }
    }

    public final void e() {
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2;
        float pow;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4;
        a8 a8Var = this.T0;
        if (a8Var == null) {
            stargiftattributebackdrop = null;
        } else {
            stargiftattributebackdrop = a8Var.f42183t;
        }
        float[] i3 = p7.i(stargiftattributebackdrop);
        a8 a8Var2 = this.U0;
        if (a8Var2 == null) {
            stargiftattributebackdrop2 = null;
        } else {
            stargiftattributebackdrop2 = a8Var2.f42183t;
        }
        float[] i10 = p7.i(stargiftattributebackdrop2);
        float f10 = 1.0f;
        if (this.Y0) {
            float f11 = this.V0;
            pow = com.google.android.recaptcha.internal.a.B(f11, 2.0f, 3.0f, f11 * f11);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - this.V0, 4.0d));
        }
        float[] fArr = new float[18];
        float f12 = i3[0];
        float f13 = i3[1];
        float f14 = i3[2];
        float f15 = i10[0];
        float f16 = i10[1];
        float f17 = i10[2];
        float f18 = this.W0;
        float f19 = this.X0;
        if (!this.Y0) {
            f10 = 0.0f;
        }
        System.arraycopy(new float[]{f12, f13, f14, f15, f16, f17, f18, f19, pow, f10}, 0, fArr, 0, 10);
        a8 a8Var3 = this.T0;
        if (a8Var3 == null) {
            stargiftattributebackdrop3 = null;
        } else {
            stargiftattributebackdrop3 = a8Var3.f42183t;
        }
        p7.m(fArr, 0, stargiftattributebackdrop3);
        a8 a8Var4 = this.U0;
        if (a8Var4 == null) {
            stargiftattributebackdrop4 = null;
        } else {
            stargiftattributebackdrop4 = a8Var4.f42183t;
        }
        p7.m(fArr, 1, stargiftattributebackdrop4);
        this.f42294c.setStickerStyle(fArr);
    }

    public final float f(a8 a8Var) {
        o7 j10 = j(a8Var);
        if (j10 != null) {
            org.telegram.ui.Components.k9 k9Var = j10.E;
            if (j10.getWidth() > 0 && k9Var.getWidth() > 0) {
                return ((k9Var.getWidth() / j10.getWidth()) * 288.0f) / 268.0f;
            }
            return 0.77f;
        }
        return 0.77f;
    }

    public final void f0() {
        if (!this.f42293b1 && isAttachedToWindow()) {
            w7 w7Var = this.D1;
            removeCallbacks(w7Var);
            postOnAnimation(w7Var);
        }
    }

    public final void g(a8 a8Var) {
        a8Var.H = 0;
        a8Var.J = 0L;
        a8Var.f42171g.a(1.0f);
        a8Var.h.a(1.0f);
        a8Var.f42172i.a(0.0f);
        a8Var.f42176m.a(0.0f);
        a8Var.f42173j.a(0.0f);
        a8Var.f42174k.a(0.0f);
        o7 j10 = j(a8Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.setScaleX(1.0f);
            j10.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - org.telegram.messenger.g0.L(64.0f)) - org.telegram.messenger.g0.f22603n;
    }

    public final void i(o7 o7Var) {
        float f10;
        ArrayList arrayList = this.h;
        if (!arrayList.contains(o7Var)) {
            arrayList.add(o7Var);
        }
        a8 v = v(o7Var.f43011x0);
        if (v.H == 0) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        o7Var.k(v.R, false, f10);
        f0();
    }

    public final o7 j(a8 a8Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            o7 o7Var = (o7) obj;
            if (o7Var.isAttachedToWindow() && o7Var.f43011x0.address.equals(a8Var.f42162a)) {
                return o7Var;
            }
        }
        return null;
    }

    public final void k() {
        if (!this.f42291b && !this.f42304f1) {
            this.f42301e1 = true;
            t7 t7Var = this.f42308h1;
            org.telegram.messenger.g0.r(t7Var);
            org.telegram.messenger.g0.i3(t7Var, 1500L);
        }
    }

    public final void l() {
        this.R0 = null;
        this.Q0 = null;
        X(null, true);
        O();
        k();
    }

    public final boolean m(a8 a8Var) {
        if (b(a8Var) && F(this.f42288a.getCurrentAccount(), a8Var.f42164b.gift.slug)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f42347z1);
        getViewTreeObserver().addOnPreDrawListener(this.A1);
        for (a8 a8Var : this.f42302f.values()) {
            a8Var.f42166c.P();
            a8Var.d.P();
        }
        f0();
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.f42347z1);
        getViewTreeObserver().removeOnPreDrawListener(this.A1);
        removeCallbacks(this.D1);
        removeCallbacks(this.B1);
        for (a8 a8Var : this.f42302f.values()) {
            a8Var.f42166c.R();
            a8Var.d.R();
        }
        this.N0 = 0L;
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i3;
        float f14;
        Rect rect;
        float f15;
        int i10;
        float f16;
        a8 a8Var;
        Paint paint;
        ArrayList arrayList;
        RectF rectF;
        b8 b8Var = this;
        Canvas canvas2 = canvas;
        if (b8Var.A()) {
            float f17 = b8Var.O.f43511a;
            int i11 = (f17 > 0.01f ? 1 : (f17 == 0.01f ? 0 : -1));
            RectF rectF2 = b8Var.I;
            ?? r10 = 0;
            Paint paint2 = b8Var.f42343y;
            if (i11 < 0) {
                f11 = 0.0f;
                i3 = 0;
                f10 = 0.4f;
                f12 = 2.0f;
                f13 = 0.6f;
            } else {
                float max = Math.max(0.0f, Math.min(1.2f, b8Var.P.f43511a));
                float l10 = Utilities.l(max);
                f10 = 0.4f;
                Paint paint3 = b8Var.H;
                paint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
                f11 = 0.0f;
                f12 = 2.0f;
                float measureText = (((paint3.measureText(bd.M0(2131746329, null)) + org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(56.0f)) * max) + org.telegram.messenger.g0.L(56.0f);
                canvas2.save();
                f13 = 0.6f;
                canvas2.translate(b8Var.getWidth() / 2.0f, ((1.0f - f17) * org.telegram.messenger.g0.L(90.0f)) + b8Var.h());
                float f18 = (f17 * 0.4f) + 0.6f;
                canvas2.scale(f18, f18);
                int i12 = org.telegram.ui.ActionBar.k6.f27878d6;
                org.telegram.ui.ActionBar.d2 d2Var = b8Var.f42288a;
                paint2.setColor(i0.a.f(l10, org.telegram.ui.ActionBar.k6.w0(i12, d2Var.getResourceProvider()), -1750963));
                paint2.setAlpha((int) (Utilities.l(f17) * 255.0f));
                float f19 = (-measureText) / 2.0f;
                float f20 = measureText / 2.0f;
                rectF2.set(f19, -org.telegram.messenger.g0.L(28.0f), f20, org.telegram.messenger.g0.L(28.0f));
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), paint2);
                float L = (f19 + org.telegram.messenger.g0.L(30.0f)) * l10;
                float L2 = org.telegram.messenger.g0.L(21.0f);
                int round = Math.round(b8Var.f42297d0.f43511a);
                ch0 ch0Var = b8Var.f42303f0;
                ch0Var.N(round, false, false);
                float f21 = L - L2;
                i3 = 0;
                float f22 = -L2;
                float f23 = L + L2;
                ch0Var.setBounds((int) f21, (int) f22, (int) f23, (int) L2);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.f(l10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, d2Var.getResourceProvider()), -1), PorterDuff.Mode.SRC_IN);
                Paint paint4 = b8Var.f42300e0;
                paint4.setColorFilter(porterDuffColorFilter);
                paint4.setAlpha((int) (Utilities.l(f17) * 255.0f));
                canvas2 = canvas;
                int saveLayer = canvas2.saveLayer(f21, f22, f23, L2, paint4);
                ch0Var.draw(canvas2);
                canvas2.restoreToCount(saveLayer);
                if (l10 > 0.02f) {
                    paint3.setColor(-1);
                    paint3.setAlpha((int) (Utilities.l((l10 - 0.4f) / 0.6f) * 255.0f));
                    Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                    canvas2.save();
                    canvas2.clipRect(org.telegram.messenger.g0.L(22.0f) + L, -org.telegram.messenger.g0.L(28.0f), f20 - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(28.0f));
                    canvas2.drawText(bd.M0(2131746329, null), L + org.telegram.messenger.g0.L(22.0f), (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f, paint3);
                    canvas2.restore();
                }
                canvas2.restore();
                r10 = 0;
            }
            paint2.setShader(r10);
            paint2.setColorFilter(r10);
            paint2.setAlpha(255);
            ArrayList G = b8Var.G();
            int size = G.size();
            int i13 = i3;
            while (i13 < size) {
                int i14 = i13 + 1;
                a8 a8Var2 = (a8) G.get(i13);
                z7 z7Var = a8Var2.f42169e;
                z7 z7Var2 = a8Var2.f42172i;
                float f24 = z7Var.f43511a;
                float f25 = a8Var2.f42170f.f43511a;
                float U = b8Var.U() * a8Var2.f42171g.f43511a * a8Var2.h.f43511a;
                float f26 = a8Var2.f42173j.f43511a;
                int i15 = a8Var2.H;
                if (i15 == 1 && a8Var2.O && f26 > 0.3f) {
                    float[] L3 = b8Var.L(f24 + a8Var2.f42177n.f43511a, f25 + a8Var2.f42178o.f43511a);
                    float f27 = L3[i3];
                    float f28 = L3[1];
                    U = com.google.android.recaptcha.internal.a.A(f26, 0.15f, 1.0f, U);
                    f14 = f28;
                    f24 = f27;
                } else if (i15 != 3 && i15 != 4 && i15 != 5) {
                    i13 = i14;
                } else {
                    f14 = f25;
                }
                float f29 = U;
                Bitmap a10 = a8Var2.a();
                if (a10 != null) {
                    if (f29 < 1.0f) {
                        i13 = i14;
                    } else {
                        canvas2.save();
                        canvas2.rotate(z7Var2.f43511a, f24, f14);
                        Paint paint5 = paint2;
                        b8Var.t(canvas2, a8Var2, f24, (org.telegram.messenger.g0.L(5.0f) * f26) + org.telegram.messenger.g0.L(1.5f) + f14, com.google.android.recaptcha.internal.a.A(f26, 0.04f, 1.0f, f29), f26, 0.0f, 1.0f);
                        canvas.restore();
                        float l11 = Utilities.l(a8Var2.f42176m.f43511a);
                        if (a8Var2.H == 4 && a8Var2.W > f13 && b8Var.j(a8Var2) != null) {
                            float l12 = Utilities.l((a8Var2.W - f13) / f10);
                            float f30 = (1.0f - ((3.0f - (l12 * f12)) * (l12 * l12))) * 0.45f;
                            float l13 = (1.0f - (Utilities.l(-a8Var2.V) * f13)) * 0.55f;
                            if (l11 < 1.0f) {
                                paint5.setAlpha((int) ((1.0f - l11) * 255.0f));
                                i10 = size;
                                paint = paint5;
                                f16 = f29;
                                arrayList = G;
                                rectF = rectF2;
                                f15 = f14;
                                a8Var = a8Var2;
                                b8Var.r(canvas, a8Var2.v, f24, f15, f16, f30, l13, z7Var2.f43511a, a8Var2.U, a8Var2.V);
                            } else {
                                f15 = f14;
                                i10 = size;
                                f16 = f29;
                                a8Var = a8Var2;
                                paint = paint5;
                                arrayList = G;
                                rectF = rectF2;
                            }
                            if (l11 > f11) {
                                paint.setAlpha((int) (l11 * 255.0f));
                                canvas2 = canvas;
                                r(canvas2, a10, f24, f15, f16, f30, l13, z7Var2.f43511a, a8Var.U, a8Var.V);
                            } else {
                                canvas2 = canvas;
                            }
                            paint.setAlpha(255);
                            rectF2 = rectF;
                            paint2 = paint;
                            i13 = i14;
                            G = arrayList;
                            size = i10;
                        } else {
                            float f31 = f14;
                            int i16 = size;
                            ArrayList arrayList2 = G;
                            canvas2 = canvas;
                            RectF rectF3 = rectF2;
                            canvas2.save();
                            canvas2.rotate(z7Var2.f43511a, f24, f31);
                            float f32 = f29 / f12;
                            rectF3.set(f24 - f32, f31 - f32, f24 + f32, f32 + f31);
                            if (l11 < 1.0f) {
                                paint5.setAlpha((int) ((1.0f - l11) * 255.0f));
                                rect = null;
                                canvas2.drawBitmap(a8Var2.v, (Rect) null, rectF3, paint5);
                            } else {
                                rect = null;
                            }
                            if (l11 > f11) {
                                paint5.setAlpha((int) (l11 * 255.0f));
                                canvas2.drawBitmap(a10, rect, rectF3, paint5);
                            }
                            paint5.setAlpha(255);
                            canvas2.restore();
                            rectF2 = rectF3;
                            paint2 = paint5;
                            i13 = i14;
                            G = arrayList2;
                            size = i16;
                        }
                        b8Var = this;
                    }
                } else {
                    b8Var = this;
                    i13 = i14;
                }
            }
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        f0();
    }

    public final void p() {
        org.telegram.messenger.g0.E2(this.f42342x1);
        org.telegram.messenger.g0.E2(this.f42345y1);
        this.f42345y1 = null;
        this.f42342x1 = null;
        O();
        org.telegram.messenger.g0.r(this.f42308h1);
        this.f42309i0 = null;
        this.f42293b1 = true;
        if (this.f42301e1) {
            Q();
        }
        this.f42303f0.C(false);
        removeCallbacks(this.D1);
        removeCallbacks(this.B1);
        removeCallbacks(this.C1);
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        for (a8 a8Var : this.f42302f.values()) {
            a8Var.f42166c.R();
            a8Var.d.R();
        }
        this.h.clear();
    }

    public final void q(org.telegram.ui.Wallet.a8 r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.b8.q(org.telegram.ui.Wallet.a8, float, float):void");
    }

    public final void r(Canvas canvas, Bitmap bitmap, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18;
        float f19 = f12;
        float f20 = (f19 * f13) + ((-f19) / 2.0f);
        float f21 = 0.3f * f19;
        float f22 = 3.2f * f19;
        float f23 = 0.72f * f14;
        float f24 = f21 * f23;
        double d = f15;
        float cos = (float) Math.cos(Math.toRadians(d));
        float sin = (float) Math.sin(Math.toRadians(d));
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i3 <= 14) {
                int i11 = 0;
                for (int i12 = 14; i11 <= i12; i12 = 14) {
                    float f25 = ((i11 / 14.0f) - 0.5f) * f19;
                    float f26 = ((i3 / 14.0f) - 0.5f) * f19;
                    float f27 = (f25 * cos) - (f26 * sin);
                    float f28 = (f26 * cos) + (f25 * sin);
                    float f29 = (f28 * f17) + (f27 * f16);
                    float f30 = (f28 * f16) + ((-f27) * f17);
                    float f31 = f20 - f29;
                    float f32 = 0.0f;
                    float f33 = 1.0f;
                    if (f31 > 0.0f) {
                        float min = Math.min(f23, f31 / f21);
                        float max = Math.max(0.0f, f31 - f24);
                        f18 = f21;
                        double d10 = min;
                        float sin2 = (f20 - (f18 * ((float) Math.sin(d10)))) - (((float) Math.cos(d10)) * max);
                        float sin3 = (max * ((float) Math.sin(d10))) + ((1.0f - ((float) Math.cos(d10))) * f18);
                        f33 = (((float) Math.cos(d10)) * 0.38f) + 0.62f;
                        f29 = sin2;
                        f32 = sin3;
                    } else {
                        f18 = f21;
                    }
                    float f34 = f22 / (f22 - f32);
                    int i13 = i10 * 2;
                    float[] fArr = this.K;
                    fArr[i13] = (((f29 * f16) - (f30 * f17)) * f34) + f10;
                    fArr[i13 + 1] = ((((f30 * f16) + (f29 * f17)) * f34) + f11) - (f32 * 0.15f);
                    int i14 = (int) (255.0f * f33);
                    this.L[i10] = Color.rgb(i14, i14, i14);
                    i11++;
                    f19 = f12;
                    i10++;
                    f21 = f18;
                }
                i3++;
                f19 = f12;
            } else {
                canvas.drawBitmapMesh(bitmap, 14, 14, this.K, 0, this.L, 0, this.f42343y);
                return;
            }
        }
    }

    public final void s(Canvas canvas, a8 a8Var, float f10, float f11, boolean z10) {
        float f12;
        ImageReceiver imageReceiver = a8Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = a8Var.f42183t;
        Bitmap n4 = imageReceiver.n();
        if (n4 != null && stargiftattributebackdrop != null) {
            canvas.save();
            float f13 = this.Z0;
            float f14 = this.f42290a1;
            Path path = this.J;
            path.rewind();
            float f15 = 0.15f;
            char c2 = 0;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(0.0f, 0.0f, f13, f14, (f13 * 0.15f) / 2.0f, (f14 * 0.15f) / 1.212122f, direction);
            canvas.clipPath(path);
            this.f42294c.h(path, this.Z0, this.f42290a1);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            int i3 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i3 >= 0 && !z10) {
                path.rewind();
                path.addCircle(this.W0 * this.Z0, this.X0 * this.f42290a1, f11, direction);
                canvas.clipPath(path);
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
            Paint paint = this.f42343y;
            paint.setColorFilter(porterDuffColorFilter);
            float f16 = this.Z0 / 336.0f;
            float f17 = this.f42290a1 / 205.0f;
            int i10 = 16;
            int i11 = 0;
            int i12 = 16;
            while (i12 < 336) {
                int i13 = ((i11 % 2) * 18) + i10;
                while (i13 < 205) {
                    float f18 = i12 * f16;
                    float f19 = i13 * f17;
                    float f20 = f15;
                    float f21 = f16 * 12.0f;
                    float l10 = Utilities.l(Math.min(Math.min(i12, 336 - i12), Math.min(i13, 205 - i13)) / 48.0f);
                    float f22 = f16;
                    float B = f10 * f20 * com.google.android.recaptcha.internal.a.B(l10, 2.0f, 3.0f, l10 * l10);
                    if (i3 >= 0) {
                        float l11 = Utilities.l((f11 - Utilities.t(f18, f19, this.W0 * this.Z0, this.X0 * this.f42290a1)) / org.telegram.messenger.g0.L(120.0f));
                        if (z10) {
                            f21 = com.google.android.recaptcha.internal.a.B(l11, 0.8f, 1.0f, f21);
                            B *= 1.0f - Utilities.l(l11 * 1.6f);
                        } else {
                            f12 = f18;
                            f21 *= (((((float) Math.sin(l11 * 3.141592653589793d)) * 0.28f) + l11) * 0.8f) + 0.2f;
                            B *= Utilities.l(l11 * 1.6f);
                            paint.setAlpha((int) (B * 255.0f));
                            float f23 = f21 / 2.0f;
                            RectF rectF = this.I;
                            rectF.set(f12 - f23, f19 - f23, f12 + f23, f19 + f23);
                            canvas.drawBitmap(n4, (Rect) null, rectF, paint);
                            i13 += 37;
                            f15 = f20;
                            c2 = 0;
                            f16 = f22;
                        }
                    }
                    f12 = f18;
                    paint.setAlpha((int) (B * 255.0f));
                    float f232 = f21 / 2.0f;
                    RectF rectF2 = this.I;
                    rectF2.set(f12 - f232, f19 - f232, f12 + f232, f19 + f232);
                    canvas.drawBitmap(n4, (Rect) null, rectF2, paint);
                    i13 += 37;
                    f15 = f20;
                    c2 = 0;
                    f16 = f22;
                }
                i12 += 33;
                i11++;
                i10 = 16;
            }
            paint.setColorFilter(null);
            paint.setAlpha(255);
            canvas.restore();
        }
    }

    public final void t(Canvas canvas, a8 a8Var, float f10, float f11, float f12, float f13, float f14, float f15) {
        if (f15 > 0.01f && a8Var.f42185w != null) {
            float f16 = (((0.05f * f13) + 1.0f) * ((f12 * 176.0f) / 128.0f)) / 2.0f;
            float f17 = f10 - f16;
            float f18 = f11 - f16;
            float f19 = f10 + f16;
            float f20 = f11 + f16;
            RectF rectF = this.I;
            rectF.set(f17, f18, f19, f20);
            Paint paint = this.f42343y;
            int alpha = paint.getAlpha();
            paint.setColor(-16044452);
            float l10 = Utilities.l(a8Var.f42176m.f43511a);
            paint.setAlpha((int) (l10 * Utilities.l((f14 * 0.12f) + (f13 * (-0.049999997f)) + 0.16f) * 255.0f * f15));
            canvas.drawBitmap(a8Var.f42185w, (Rect) null, rectF, paint);
            paint.setColor(-1);
            paint.setAlpha(alpha);
        }
    }

    public final a8 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f42302f;
        a8 a8Var = (a8) linkedHashMap.get(str);
        if (a8Var == null) {
            a8Var = new a8(this, nftitem);
            linkedHashMap.put(nftitem.address, a8Var);
        }
        a8Var.f42164b = nftitem;
        return a8Var;
    }

    public final void w(float r19, float r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.b8.w(float, float, boolean):void");
    }

    public final float[] x(a8 a8Var, float f10, float f11, boolean z10) {
        boolean z11;
        float f12;
        float f13;
        float f14;
        ArrayList arrayList;
        float min;
        float f15;
        float f16;
        if (!z10) {
            a8Var.N = false;
            return new float[]{f10, f11, a8Var.h.f43512b};
        }
        ArrayList<RectF> stickerObstacles = this.f42294c.getStickerObstacles();
        float f17 = this.Z0 * 0.012f;
        int size = stickerObstacles.size();
        int i3 = 0;
        while (i3 < size) {
            RectF rectF = stickerObstacles.get(i3);
            i3++;
            float f18 = -f17;
            rectF.inset(f18, f18);
        }
        stickerObstacles.get(2).left -= this.Z0 * 0.035f;
        float L = org.telegram.messenger.g0.L(32.0f) / U();
        float f19 = a8Var.h.f43512b;
        a8Var.N = false;
        ArrayList arrayList2 = new ArrayList();
        for (a8 a8Var2 : this.f42302f.values()) {
            if (a8Var2 != a8Var && a8Var2.b()) {
                arrayList2.add(a8Var2);
            }
        }
        if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && a8Var == this.f42315l1 && this.f42318n1 != null && arrayList2.isEmpty()) {
            return (float[]) this.f42318n1.clone();
        }
        if (!z11) {
            f12 = this.Z0 * 0.6f;
            f13 = this.f42290a1 * 0.68f;
        } else {
            f12 = f10;
            f13 = f11;
        }
        Random random = new Random((System.nanoTime() / 400000000) + (arrayList2.size() * 31) + (a8Var.f42162a.hashCode() * 7919));
        float nextFloat = (random.nextFloat() * 0.04f) + 0.05f;
        float f20 = 0.5f;
        float nextFloat2 = (((random.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.Z0;
        float nextFloat3 = this.f42290a1 * (((random.nextFloat() - 0.5f) * 0.08f) + 0.55f);
        float U = U() * L * 0.5f;
        float f21 = -3.4028235E38f;
        float[] fArr = null;
        float f22 = U;
        while (f22 <= this.f42290a1 - U) {
            float f23 = f20;
            float f24 = U;
            while (true) {
                float f25 = this.Z0;
                if (f24 <= f25 - U) {
                    float min2 = Math.min(Math.min(f24, f25 - f24), Math.min(f22, this.f42290a1 - f22));
                    float f26 = nextFloat;
                    float min3 = Math.min(Math.max(0.74f, 1.0f - (arrayList2.size() * nextFloat)) * f19, min2 / (U() * f23));
                    int size2 = stickerObstacles.size();
                    float f27 = L;
                    float f28 = f19;
                    int i10 = 0;
                    float f29 = Float.MAX_VALUE;
                    while (i10 < size2) {
                        ArrayList<RectF> arrayList3 = stickerObstacles;
                        RectF rectF2 = stickerObstacles.get(i10);
                        f29 = Math.min(f29, Utilities.t(f24, f22, Math.max(rectF2.left, Math.min(rectF2.right, f24)), Math.max(rectF2.top, Math.min(rectF2.bottom, f22))));
                        i10++;
                        stickerObstacles = arrayList3;
                        z11 = z11;
                    }
                    ArrayList<RectF> arrayList4 = stickerObstacles;
                    boolean z12 = z11;
                    float min4 = Math.min(min3, f29 / (U() * 0.44f));
                    int i11 = 0;
                    for (int size3 = arrayList2.size(); i11 < size3; size3 = size3) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        a8 a8Var3 = (a8) obj;
                        min4 = Math.min(min4, (Utilities.t(f24, f22, a8Var3.f42169e.f43512b, a8Var3.f42170f.f43512b) / (U() * 0.29f)) - a8Var3.h.f43512b);
                    }
                    float l10 = ((Utilities.l((min2 - ((U() * f23) * min4)) / org.telegram.messenger.g0.L(14.0f)) * 0.1f) + 0.9f) * min4;
                    if (l10 < f27) {
                        arrayList = arrayList2;
                    } else {
                        if (arrayList2.isEmpty()) {
                            float f30 = this.Z0 * 0.6f;
                            float y9 = com.google.android.recaptcha.internal.a.y(f12, f30, 0.2f, f30);
                            float f31 = this.f42290a1 * 0.68f;
                            f16 = (random.nextFloat() * org.telegram.messenger.g0.L(5.0f)) + (U() * 1.1f * l10) + (Utilities.t(f24, f22, y9, com.google.android.recaptcha.internal.a.y(f13, f31, 0.2f, f31)) * (-0.45f));
                            f14 = l10;
                            arrayList = arrayList2;
                        } else {
                            float f32 = f22 * l10 * l10;
                            float f33 = l10 * l10;
                            int size4 = arrayList2.size();
                            float f34 = f24 * l10 * l10;
                            int i12 = 0;
                            float f35 = Float.MAX_VALUE;
                            float f36 = 0.0f;
                            while (i12 < size4) {
                                Object obj2 = arrayList2.get(i12);
                                int i13 = i12 + 1;
                                a8 a8Var4 = (a8) obj2;
                                float f37 = l10;
                                z7 z7Var = a8Var4.f42169e;
                                int i14 = size4;
                                z7 z7Var2 = a8Var4.h;
                                ArrayList arrayList5 = arrayList2;
                                z7 z7Var3 = a8Var4.f42170f;
                                f35 = Math.min(f35, Utilities.t(f24, f22, z7Var.f43512b, z7Var3.f43512b) - ((z7Var2.f43512b + f37) * (U() * 0.4f)));
                                float f38 = z7Var2.f43512b;
                                float f39 = f38 * f38;
                                float f40 = a8Var4.f42169e.f43512b;
                                f34 = (f40 * f39) + f34;
                                f32 = (z7Var3.f43512b * f39) + f32;
                                f33 += f39;
                                f36 = Math.max(0.0f, 1.0f - (Math.abs(z7Var3.f43512b - f22) / (U() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f40 - f24) / (U() * 0.12f))) + f36;
                                l10 = f37;
                                i12 = i13;
                                size4 = i14;
                                arrayList2 = arrayList5;
                            }
                            f14 = l10;
                            arrayList = arrayList2;
                            float f41 = f32;
                            if (f35 < 0.0f) {
                                min = f35 * 2.5f;
                            } else {
                                min = Math.min(f35, U() * 0.3f);
                            }
                            float nextFloat4 = (random.nextFloat() * org.telegram.messenger.g0.L(10.0f)) + (((((Math.min(Math.min(min2, f29), U()) * 0.2f) + ((U() * (f14 * 0.9f)) + (min * 1.2f))) - (Utilities.t(f34 / f33, f41 / f33, nextFloat2, nextFloat3) * 0.35f)) - ((U() * f36) * 0.08f)) - (Utilities.t(f24, f22, this.Z0 * f23, this.f42290a1 * 0.55f) * 0.04f));
                            if (z12) {
                                f15 = Utilities.t(f24, f22, f12, f13) * 0.04f;
                            } else {
                                f15 = 0.0f;
                            }
                            f16 = nextFloat4 - f15;
                        }
                        if (f16 > f21) {
                            f21 = f16;
                            fArr = new float[]{f24, f22, f14};
                            f24 += org.telegram.messenger.g0.L(5.0f);
                            nextFloat = f26;
                            L = f27;
                            f19 = f28;
                            stickerObstacles = arrayList4;
                            z11 = z12;
                            arrayList2 = arrayList;
                        }
                    }
                    f24 += org.telegram.messenger.g0.L(5.0f);
                    nextFloat = f26;
                    L = f27;
                    f19 = f28;
                    stickerObstacles = arrayList4;
                    z11 = z12;
                    arrayList2 = arrayList;
                }
            }
            f22 += org.telegram.messenger.g0.L(5.0f);
            f20 = f23;
            nextFloat = nextFloat;
        }
        return fArr;
    }

    public final boolean z(o7 o7Var) {
        if (o7Var.isShown()) {
            Rect rect = this.G1;
            if (o7Var.getGlobalVisibleRect(rect) && rect.width() >= o7Var.getWidth() - 1 && rect.height() >= o7Var.getHeight() - 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
