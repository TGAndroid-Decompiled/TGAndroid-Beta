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
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import j$.util.Comparator$CC;
import j$.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.ok;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.xf;
public final class r8 extends View {
    public static final int J1 = 0;
    public float A0;
    public final a6 A1;
    public float B0;
    public final g8 B1;
    public float C0;
    public final g8 C1;
    public float D0;
    public long D1;
    public final Paint E;
    public float E0;
    public boolean E1;
    public final RectF F;
    public float F0;
    public final m8 F1;
    public final Paint G;
    public float G0;
    public final RectF G1;
    public final Paint H;
    public float H0;
    public final Paint H1;
    public final RectF I;
    public float I0;
    public final Rect I1;
    public final Path J;
    public float J0;
    public final float[] K;
    public float K0;
    public final int[] L;
    public int L0;
    public final l8 M;
    public boolean M0;
    public final k8 N;
    public long N0;
    public final p8 O;
    public long O0;
    public final p8 P;
    public VelocityTracker P0;
    public final p8 Q;
    public String Q0;
    public final p8 R;
    public String R0;
    public final p8 S;
    public long S0;
    public final ArrayList T;
    public q8 T0;
    public final Path U;
    public q8 U0;
    public final Paint V;
    public float V0;
    public final LinearGradient W;
    public float W0;
    public float X0;
    public boolean Y0;
    public float Z0;
    public final org.telegram.ui.ActionBar.h2 f44883a;
    public final Matrix f44884a0;
    public float f44885a1;
    public final boolean f44886b;
    public float f44887b0;
    public boolean f44888b1;
    public final x6 f44889c;
    public float f44890c0;
    public TL_wallet.card f44891c1;
    public final k8.a d;
    public final p8 f44892d0;
    public String f44893d1;
    public final SharedPreferences f44894e;
    public final Paint f44895e0;
    public boolean f44896e1;
    public final LinkedHashMap f44897f;
    public final mh0 f44898f0;
    public boolean f44899f1;
    public boolean f44900g0;
    public int f44901g1;
    public final ArrayList h;
    public q8 f44902h0;
    public final g8 f44903h1;
    public q8 f44904i0;
    public boolean f44905i1;
    public boolean f44906j0;
    public boolean f44907j1;
    public final Paint f44908k0;
    public boolean f44909k1;
    public final Paint f44910l0;
    public q8 l1;
    public final Paint m0;
    public e8 f44911m1;
    public final ArrayList f44912n;
    public boolean f44913n0;
    public float[] n1;
    public boolean f44914o0;
    public float f44915o1;
    public boolean f44916p0;
    public final float[] f44917p1;
    public boolean f44918q0;
    public final p8 f44919q1;
    public final Matrix f44920r;
    public boolean f44921r0;
    public final p8 f44922r1;
    public final Matrix f44923s;
    public boolean f44924s0;
    public final Paint f44925s1;
    public boolean f44926t0;
    public final Paint f44927t1;
    public boolean f44928u0;
    public final Matrix f44929u1;
    public boolean f44930v0;
    public final Path f44931v1;
    public final Matrix f44932w;
    public int f44933w0;
    public final RectF f44934w1;
    public final Matrix f44935x;
    public float f44936x0;
    public hi.m3 f44937x1;
    public final Paint f44938y;
    public float f44939y0;
    public hi.m3 f44940y1;
    public float f44941z0;
    public final s1 f44942z1;

    public r8(org.telegram.ui.ActionBar.h2 h2Var, x6 x6Var, k8.a aVar, TL_wallet.card cardVar) {
        super(h2Var.getContext());
        boolean z10;
        SharedPreferences sharedPreferences;
        boolean z11;
        this.f44897f = new LinkedHashMap();
        this.h = new ArrayList();
        this.f44912n = new ArrayList();
        this.f44920r = new Matrix();
        this.f44923s = new Matrix();
        this.f44932w = new Matrix();
        this.f44935x = new Matrix();
        this.f44938y = new Paint(3);
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
        this.O = new p8(0.0f, 260.0f, 0.78f);
        this.P = new p8(0.0f, 420.0f, 0.72f);
        this.Q = new p8(1.0f, 420.0f, 0.38f);
        this.R = new p8(0.0f, 170.0f, 0.42f);
        this.S = new p8(0.0f, 170.0f, 0.42f);
        this.T = new ArrayList();
        this.U = new Path();
        Paint paint3 = new Paint(1);
        this.V = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.W = linearGradient;
        this.f44884a0 = new Matrix();
        this.f44892d0 = new p8(0.0f, 120.0f, 1.0f);
        this.f44895e0 = new Paint(1);
        this.f44908k0 = new Paint(1);
        this.f44910l0 = new Paint(1);
        this.m0 = new Paint(1);
        this.V0 = 1.0f;
        this.W0 = 0.5f;
        this.X0 = 0.5f;
        this.f44903h1 = new g8(this, 2);
        this.f44917p1 = new float[3];
        this.f44919q1 = new p8(0.0f, 260.0f, 1.0f);
        this.f44922r1 = new p8(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.f44925s1 = paint4;
        Paint paint5 = new Paint(1);
        this.f44927t1 = paint5;
        this.f44929u1 = new Matrix();
        this.f44931v1 = new Path();
        this.f44934w1 = new RectF();
        this.f44942z1 = new s1(this, 1);
        this.A1 = new a6(2, this);
        this.B1 = new g8(this, 3);
        this.C1 = new g8(this, 0);
        this.F1 = new m8(this);
        this.G1 = new RectF();
        Paint paint6 = new Paint(1);
        this.H1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.I1 = new Rect();
        this.f44883a = h2Var;
        if (cardVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44886b = z10;
        mh0 mh0Var = new mh0(2131624358, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
        this.f44898f0 = mh0Var;
        mh0Var.R(this);
        this.f44889c = x6Var;
        this.d = aVar;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z10) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + h2Var.getCurrentAccount() + "_" + u0.D(h2Var.getCurrentAccount()).y(), 0);
        }
        this.f44894e = sharedPreferences;
        this.Q0 = z10 ? null : sharedPreferences.getString("style", null);
        if (!z10 && !mp.g1().getBoolean("walletcardstickerhint", false)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44905i1 = z11;
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
        k8 k8Var = new k8(this, getContext());
        this.N = k8Var;
        l8 l8Var = new l8(this, getContext());
        this.M = l8Var;
        k8Var.setTag(s6.f44993o0);
        x6Var.getFrontFace().addView(k8Var, 0, c8.ma.c(-1.0f, -1));
        x6Var.getFrontFace().addView(l8Var, x6Var.getStickerLayerIndex(), c8.ma.c(-1.0f, -1));
        if (z10) {
            l8Var.addOnLayoutChangeListener(new h8(this, 0));
            d(cardVar);
            return;
        }
        int currentAccount = h2Var.getCurrentAccount();
        mp u12 = mp.u1(currentAccount);
        long e10 = j10.i(currentAccount).e();
        TLRPC.UserFull d2 = u12.d2(e10);
        if (d2 != null) {
            this.D1 = SystemClock.elapsedRealtime();
            TL_wallet.card cardVar2 = d2.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
            return;
        }
        u12.c3(u12.c2(Long.valueOf(e10)), 0, true, new k(this, 3));
    }

    public static boolean F(int i7, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(45);
            HashSet hashSet = ((org.telegram.messenger.o0) mp.u1(i7).A7.f26167s0.f14001b).f26017c;
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

    public static Path H(q8 q8Var) {
        Bitmap bitmap;
        int i7;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        if (q8Var != null && q8Var.F == null && (bitmap = q8Var.f44848u) != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
            int[] iArr = new int[16384];
            createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
            if (createScaledBitmap != q8Var.f44848u) {
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
                        i7 = 0;
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
                        i7 = 0;
                        break;
                    }
                }
                int i32 = (i22 + 1) / 2;
                if (i32 >= 3) {
                    float[] fArr2 = new float[i32 * 2];
                    for (int i33 = i7; i33 < i22; i33 += 2) {
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
                    path.moveTo((fArr2[i7] + fArr2[2]) / 2.0f, (fArr2[1] + fArr2[3]) / 2.0f);
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
                    q8Var.F = path;
                    return path;
                }
                return null;
            }
            return null;
        } else if (q8Var == null) {
            return null;
        } else {
            return q8Var.F;
        }
    }

    public static void J(hi.m3 m3Var, float f10, float f11) {
        o(m3Var, 3);
        m3Var.p(0.0f, f10 - m3Var.getPaddingLeft());
        m3Var.setTranslationY(f11 - m3Var.getLayoutParams().height);
        m3Var.invalidate();
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
            int i7 = 0;
            while (i7 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i7);
                i7++;
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

    public static boolean b(q8 q8Var) {
        TL_wallet.nftItem nftitem;
        if (q8Var != null && (nftitem = q8Var.f44828b) != null && nftitem.gift != null) {
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

    public static void e0(int i7, TL_wallet.card cardVar) {
        TLRPC.UserFull d2 = mp.u1(i7).d2(j10.i(i7).e());
        if (d2 == null) {
            return;
        }
        d2.wallet_card = cardVar;
        tr.a0(i7).j2(d2, false);
    }

    public static float n(RectF rectF, RectF rectF2) {
        float min = Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left);
        float min2 = Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top);
        if (min <= 0.0f || min2 <= 0.0f || rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return 0.0f;
        }
        return Utilities.l(((min * min2) / (rectF2.height() * rectF2.width())) * 4.0f);
    }

    public static void o(hi.m3 m3Var, int i7) {
        if ((m3Var.getTag() instanceof Integer) && ((Integer) m3Var.getTag()).intValue() == i7) {
            return;
        }
        m3Var.setTag(Integer.valueOf(i7));
        m3Var.f14991a = i7;
        m3Var.p(1.0f, 0.0f);
    }

    public static float u(float f10, float f11, float f12) {
        float l10 = Utilities.l((f10 - f11) / (f12 - f11));
        return com.google.android.gms.internal.vision.e2.C(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static String y(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        if (mediaAreaCoordinates == null) {
            return "";
        }
        return String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.f28641x), Double.valueOf(mediaAreaCoordinates.f28642y), Double.valueOf(mediaAreaCoordinates.f28640w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public final boolean A() {
        x6 x6Var = this.f44889c;
        this.Z0 = x6Var.getFrontFace().getWidth();
        float height = x6Var.getFrontFace().getHeight();
        this.f44885a1 = height;
        if (this.Z0 > 0.0f && height > 0.0f) {
            Matrix matrix = this.f44920r;
            if (x6Var.g(this, matrix) && matrix.invert(this.f44923s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final hi.m3 B(int i7, boolean z10) {
        float f10;
        hi.m3 m3Var = new hi.m3(getContext(), 3);
        m3Var.r(true);
        if (z10) {
            f10 = 15.0f;
        } else {
            f10 = 11.0f;
        }
        m3Var.n(11.0f, 6.0f, f10, 7.0f);
        m3Var.k(z10);
        m3Var.L = Layout.Alignment.ALIGN_NORMAL;
        m3Var.s(12.0f);
        m3Var.d = -1L;
        String M0 = gd.M0(i7, null);
        m3Var.h = hi.m3.a(M0, m3Var.getTextPaint());
        m3Var.v(M0);
        m3Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        m3Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(m3Var, c8.ma.e(-1, 150, 48));
        return m3Var;
    }

    public final boolean C() {
        Path H;
        if (this.n1 == null) {
            H = null;
        } else {
            H = H(this.l1);
        }
        if (H == null) {
            return false;
        }
        float U = U() * this.n1[2];
        Matrix matrix = this.f44929u1;
        matrix.setScale(U, U);
        float[] fArr = this.n1;
        matrix.postTranslate(fArr[0], fArr[1]);
        H.transform(matrix, this.f44931v1);
        return true;
    }

    public final float[] D(float f10) {
        float[] fArr = this.f44917p1;
        fArr[0] = (u(f10, 0.45f, 0.82f) - u(f10, 1.3f, 1.72f)) * 0.9f;
        fArr[1] = (((float) Math.sin(Utilities.l((f10 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f10, 0.6f, 0.92f) - u(f10, 1.18f, 1.46f));
        fArr[2] = u(f10, 1.58f, 1.7f) - u(f10, 1.7f, 1.92f);
        return fArr;
    }

    public final void E(q8 q8Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        q8Var.J = 0L;
        p8 p8Var = q8Var.h;
        p8 p8Var2 = q8Var.f44834f;
        p8 p8Var3 = q8Var.f44833e;
        if (q8Var.f44826a.equals(this.Q0)) {
            l();
        }
        if (q8Var.b()) {
            float[] L = L(p8Var3.f44795a, p8Var2.f44795a);
            p8Var3.a(L[0]);
            p8Var2.a(L[1]);
        }
        q8Var.H = 4;
        q8Var.W = 0.0f;
        q8Var.X = p8Var3.f44795a;
        q8Var.Y = p8Var2.f44795a;
        q8Var.Z = q8Var.f44835g.f44795a * p8Var.f44795a;
        q8Var.f44827a0 = q8Var.f44836i.f44795a;
        if (this.f44936x0 > org.telegram.messenger.g0.L(650.0f)) {
            f10 = 0.32f;
        } else {
            f10 = 0.44f;
        }
        q8Var.f44829b0 = f10;
        this.f44936x0 = 0.0f;
        e8 j3 = j(q8Var);
        if (j3 != null) {
            j3.animate().cancel();
            j3.o();
        }
        if (j3 != null) {
            f11 = j3.getScaleX();
        } else {
            f11 = 1.0f;
        }
        q8Var.f44831c0 = f11;
        RectF Z = Z(q8Var);
        if (Z != null) {
            float centerX = Z.centerX() - q8Var.X;
            float centerY = Z.centerY() - q8Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            if (hypot > org.telegram.messenger.g0.L(6.0f)) {
                f12 = centerX / hypot;
            } else {
                f12 = 0.0f;
            }
            q8Var.U = f12;
            if (hypot > org.telegram.messenger.g0.L(6.0f)) {
                f13 = centerY / hypot;
            } else {
                f13 = 1.0f;
            }
            q8Var.V = f13;
        }
        q8Var.f44839l.a(0.0f);
        p8Var.a(1.0f);
        long j10 = this.O0 + 1;
        this.O0 = j10;
        q8Var.I = j10;
        O();
        f0();
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList(this.f44897f.values());
        List.EL.sort(arrayList, Comparator$CC.comparingLong(new ok(5)));
        return arrayList;
    }

    public final void I(q8 q8Var, float[] fArr, float[] fArr2, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        long j3 = q8Var.J;
        p8 p8Var = q8Var.f44842o;
        p8 p8Var2 = q8Var.f44841n;
        if (j3 == 0) {
            long j10 = this.S0 + 1;
            this.S0 = j10;
            q8Var.J = j10;
            ArrayList arrayList = new ArrayList();
            for (q8 q8Var2 : this.f44897f.values()) {
                if (q8Var2 != q8Var && q8Var2.b()) {
                    arrayList.add(q8Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.EL.sort(arrayList, Comparator$CC.comparingLong(new ok(6)));
                for (int i7 = 0; i7 <= arrayList.size() - 10; i7++) {
                    q8 q8Var3 = (q8) arrayList.get(i7);
                    if (this.d.J0()) {
                        E(q8Var3);
                    } else {
                        V(q8Var3);
                    }
                }
                k();
            }
        }
        q8Var.H = 1;
        q8Var.Q = false;
        q8Var.M = false;
        q8Var.L = false;
        q8Var.P = z10;
        q8Var.O = z10;
        long j11 = this.O0 + 1;
        this.O0 = j11;
        q8Var.I = j11;
        p8Var2.a(0.0f);
        p8Var.a(0.0f);
        p8 p8Var3 = q8Var.f44833e;
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
        p8Var3.d = f10;
        p8Var3.f44798e = f11;
        p8Var3.a(fArr[0]);
        p8Var3.f44796b = fArr2[0];
        p8 p8Var4 = q8Var.f44834f;
        if (z10) {
            f14 = 150.0f;
        }
        if (!z10) {
            f16 = 1.0f;
        }
        p8Var4.d = f14;
        p8Var4.f44798e = f16;
        p8Var4.a(fArr[1]);
        float f18 = fArr2[1];
        p8Var4.f44796b = f18;
        q8Var.h.f44796b = fArr2[2];
        p8 p8Var5 = q8Var.f44835g;
        p8Var5.d = 300.0f;
        p8Var5.f44798e = 0.5f;
        p8Var5.f44796b = 1.0f;
        p8 p8Var6 = q8Var.f44837j;
        if (z10) {
            f15 = 110.0f;
        }
        p8Var6.d = f15;
        p8Var6.f44798e = 0.9f;
        p8Var6.f44796b = 0.0f;
        q8Var.f44840m.f44796b = 1.0f;
        q8Var.f44839l.f44796b = 0.0f;
        float f19 = fArr2[0] - fArr[0];
        float f20 = f18 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f19, f20));
        if (max > org.telegram.messenger.g0.L(6.0f)) {
            f12 = f19 / max;
        } else {
            f12 = 0.0f;
        }
        q8Var.U = f12;
        if (max > org.telegram.messenger.g0.L(6.0f)) {
            f13 = f20 / max;
        } else {
            f13 = 1.0f;
        }
        q8Var.V = f13;
        p8 p8Var7 = q8Var.f44838k;
        p8Var7.a(0.9f);
        p8Var7.f44796b = 0.0f;
        if (z10) {
            float min = Math.min(org.telegram.messenger.g0.L(110.0f), 0.32f * max);
            if (f19 >= 0.0f) {
                f17 = -1.0f;
            }
            p8Var2.a(0.0f);
            p8Var2.f44797c = ((-f20) / max) * min * f17 * 20.0f;
            p8Var.a(0.0f);
            p8Var.f44797c = com.google.android.gms.internal.vision.e2.C(min, 0.5f, (f19 / max) * min * f17, 20.0f);
        }
        O();
        f0();
    }

    public final void K(q8 q8Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z10) {
        q8Var.h.a((float) (mediaAreaCoordinates.f28640w / 23.100000381469727d));
        q8Var.f44836i.a(c((float) mediaAreaCoordinates.rotation));
        q8Var.N = z10;
        q8Var.f44833e.a((((float) mediaAreaCoordinates.f28641x) / 100.0f) * this.Z0);
        q8Var.f44834f.a((((float) mediaAreaCoordinates.f28642y) / 100.0f) * this.f44885a1);
        q8Var.f44835g.a(1.0f);
        q8Var.f44837j.a(0.0f);
        q8Var.f44838k.a(0.0f);
        q8Var.f44841n.a(0.0f);
        q8Var.f44842o.a(0.0f);
        q8Var.f44839l.a(0.0f);
        q8Var.H = 2;
        long j3 = this.O0 + 1;
        this.O0 = j3;
        q8Var.I = j3;
        q8Var.f44840m.a(1.0f);
        if (q8Var.J == 0) {
            long j10 = this.S0 + 1;
            this.S0 = j10;
            q8Var.J = j10;
        }
        if (q8Var.f44826a.equals(this.Q0)) {
            this.U0 = q8Var;
            this.T0 = q8Var;
            this.V0 = 1.0f;
            e();
        }
    }

    public final float[] L(float f10, float f11) {
        float[] fArr = {f10, f11};
        this.f44920r.mapPoints(fArr);
        return fArr;
    }

    public final void M(q8 q8Var, float f10, float f11) {
        float z10;
        p8 p8Var = q8Var.f44833e;
        p8 p8Var2 = q8Var.h;
        float[] L = L(p8Var.f44795a, q8Var.f44834f.f44795a);
        boolean z11 = false;
        float t6 = Utilities.t(f10, f11, L[0], L[1]);
        if (Float.isNaN(this.F0)) {
            this.F0 = t6;
            this.G0 = p8Var2.f44796b;
        }
        if (Math.abs(t6 - this.F0) > org.telegram.messenger.g0.L(5.0f)) {
            p8 p8Var3 = q8Var.f44844q;
            p8Var3.d = 700.0f;
            p8Var3.f44798e = 1.0f;
            p8Var3.f44796b = 1.0f;
        }
        float L2 = org.telegram.messenger.g0.L(32.0f) / U();
        if (this.f44906j0) {
            z10 = (this.G0 * t6) / Math.max(1.0f, this.F0);
        } else {
            z10 = com.google.android.gms.internal.vision.e2.z(1.21f, L2, (t6 - this.F0) / org.telegram.messenger.g0.L(110.0f), this.G0);
        }
        p8Var2.d = 900.0f;
        p8Var2.f44798e = 1.0f;
        p8Var2.f44796b = Math.max(L2, Math.min(1.21f, z10));
        if (t6 < org.telegram.messenger.g0.L(14.0f)) {
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
            z11 = true;
        }
        if (z11 && !this.M0) {
            performHapticFeedback(4);
        }
        this.M0 = z11;
        p8 p8Var4 = q8Var.f44836i;
        p8Var4.d = 900.0f;
        p8Var4.f44798e = 0.95f;
        if (z11) {
            f12 = round;
        }
        p8Var4.f44796b = f12;
    }

    public final void O() {
        if (!this.f44886b && this.Z0 > 0.0f && this.f44885a1 > 0.0f) {
            SharedPreferences.Editor edit = this.f44894e.edit();
            for (q8 q8Var : this.f44897f.values()) {
                boolean b10 = q8Var.b();
                String str = q8Var.f44826a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", q8Var.f44833e.f44796b / this.Z0);
                        jSONObject.put("y", q8Var.f44834f.f44796b / this.f44885a1);
                        jSONObject.put("r", q8Var.f44836i.f44796b);
                        jSONObject.put("s", q8Var.h.f44796b);
                        jSONObject.put("q", q8Var.N);
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

    public final float P(q8 q8Var) {
        return (((1.0f - (q8Var.f44844q.f44795a * 0.9f)) * q8Var.f44839l.f44795a * 0.04f) + 1.0f) * U() * q8Var.f44835g.f44795a * q8Var.h.f44795a;
    }

    public final void Q() {
        if (!this.f44896e1 || this.f44901g1 != 0) {
            return;
        }
        if (!this.f44888b1 && (this.f44918q0 || !A())) {
            org.telegram.messenger.g0.h3(this.f44903h1, 1000L);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList G = G();
        int size = G.size();
        int i7 = 0;
        String str = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = G.get(i10);
            i10++;
            q8 q8Var = (q8) obj;
            boolean b10 = q8Var.b();
            String str2 = q8Var.f44826a;
            if (b10) {
                sb2.append(str2);
                sb2.append(':');
                sb2.append(y(a0(q8Var)));
                sb2.append(';');
                if (str2.equals(this.Q0) && m(q8Var)) {
                    str = str2;
                }
            }
        }
        if (a8.p0.s(sb2, "bg:", str).equals(this.f44893d1)) {
            this.f44896e1 = false;
            return;
        }
        TL_wallet.setCardStickers setcardstickers = new TL_wallet.setCardStickers();
        ArrayList G2 = G();
        int size2 = G2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = G2.get(i11);
            i11++;
            q8 q8Var2 = (q8) obj2;
            boolean b11 = q8Var2.b();
            String str3 = q8Var2.f44826a;
            if (b11) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                inputwalletcardsticker.nft_address = str3;
                inputwalletcardsticker.coordinates = a0(q8Var2);
                setcardstickers.stickers.add(inputwalletcardsticker);
                if (str3.equals(this.Q0) && m(q8Var2)) {
                    setcardstickers.bg_nft_address = str3;
                }
            }
        }
        this.f44896e1 = false;
        int currentAccount = this.f44883a.getCurrentAccount();
        TL_wallet.card cardVar = this.f44891c1;
        TL_wallet.card cardVar2 = new TL_wallet.card();
        TL_wallet.card cardVar3 = this.f44891c1;
        if (cardVar3 != null) {
            cardVar2.address = cardVar3.address;
            cardVar2.balance = cardVar3.balance;
        }
        ArrayList<TL_wallet.inputWalletCardSticker> arrayList = setcardstickers.stickers;
        int size3 = arrayList.size();
        while (i7 < size3) {
            TL_wallet.inputWalletCardSticker inputwalletcardsticker2 = arrayList.get(i7);
            i7++;
            TL_wallet.inputWalletCardSticker inputwalletcardsticker3 = inputwalletcardsticker2;
            q8 q8Var3 = (q8) this.f44897f.get(inputwalletcardsticker3.nft_address);
            if (q8Var3 != null && q8Var3.f44828b != null) {
                TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                cardsticker.nft = q8Var3.f44828b;
                cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                cardVar2.stickers.add(cardsticker);
                if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                    cardVar2.bg_nft_item = q8Var3.f44828b;
                }
            }
        }
        e0(currentAccount, cardVar2);
        this.f44901g1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new d3.b(1), new xf(this, currentAccount, cardVar, 3));
    }

    public final TL_wallet.cardSticker R(String str) {
        ArrayList<TL_wallet.cardSticker> arrayList;
        TL_wallet.card cardVar = this.f44891c1;
        if (cardVar != null && (arrayList = cardVar.stickers) != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i7);
                i7++;
                TL_wallet.cardSticker cardsticker2 = cardsticker;
                TL_wallet.nftItem nftitem = cardsticker2.nft;
                if (nftitem != null && str.equals(nftitem.address)) {
                    return cardsticker2;
                }
            }
        }
        return null;
    }

    public final void S(e8 e8Var) {
        int i7;
        int i10;
        removeCallbacks(this.B1);
        this.f44926t0 = true;
        this.f44918q0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        e8Var.animate().cancel();
        e8Var.n(e8Var.getScaleX() * e8Var.f44137z0);
        e8Var.setScaleX(1.0f);
        e8Var.setScaleY(1.0f);
        e8Var.m(1.0f, 150L, null);
        final q8 v = v(e8Var.f44135x0);
        String str = v.f44826a;
        if (!b(v) && !v.b()) {
            this.f44926t0 = false;
            return;
        }
        y60 J = y60.J(this.f44883a, e8Var);
        J.f42375s = 51;
        if (m(v) || str.equals(this.Q0)) {
            if (str.equals(this.Q0)) {
                i7 = 2131742864;
            } else {
                i7 = 2131742870;
            }
            J.c(2131232099, gd.M0(i7, null), new Runnable(this) {
                public final r8 f44413b;

                {
                    this.f44413b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f44413b.c0(v);
                            return;
                        default:
                            r8 r8Var = this.f44413b;
                            r8Var.getClass();
                            r8Var.b0(v.f44828b);
                            return;
                    }
                }
            }, false);
        }
        if (v.b()) {
            i10 = 2131742863;
        } else {
            i10 = 2131742871;
        }
        J.c(2131232384, gd.M0(i10, null), new Runnable(this) {
            public final r8 f44413b;

            {
                this.f44413b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f44413b.c0(v);
                        return;
                    default:
                        r8 r8Var = this.f44413b;
                        r8Var.getClass();
                        r8Var.b0(v.f44828b);
                        return;
                }
            }
        }, false);
        J.f42369p = new g8(this, 1);
        J.a0();
        performHapticFeedback(0);
    }

    public final float U() {
        return this.Z0 * 0.231f;
    }

    public final void V(q8 q8Var) {
        if (q8Var.f44826a.equals(this.Q0)) {
            l();
        }
        q8Var.N = false;
        g(q8Var);
        e8 j3 = j(q8Var);
        if (j3 != null) {
            j3.setScaleX(0.93f);
            j3.setScaleY(0.93f);
            j3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        O();
        f0();
    }

    public final void W(q8 q8Var, float f10, float f11) {
        boolean z10;
        float[] fArr;
        boolean z11;
        this.f44904i0 = null;
        this.f44913n0 = true;
        if (this.L0 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44916p0 = z10;
        if (this.f44905i1) {
            if (q8Var == this.l1 && !z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f44907j1 = z11;
            this.f44909k1 = false;
            this.f44905i1 = false;
            mp.g1().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z12 = q8Var.N;
        p8 p8Var = q8Var.f44840m;
        p8 p8Var2 = q8Var.f44834f;
        p8 p8Var3 = q8Var.f44833e;
        float f12 = 1.0f;
        if (z12) {
            q8Var.N = false;
            p8 p8Var4 = q8Var.h;
            p8Var4.d = 420.0f;
            p8Var4.f44798e = 0.8f;
            p8Var4.f44796b = 1.0f;
        }
        e8 j3 = j(q8Var);
        if (j3 != null) {
            j3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.f44928u0 = false;
        if (this.f44916p0) {
            fArr = L(p8Var3.f44795a, p8Var2.f44795a);
        } else {
            RectF Z = Z(q8Var);
            if (Z == null) {
                return;
            }
            float[] fArr2 = {Z.centerX(), Z.centerY()};
            p8 p8Var5 = q8Var.f44835g;
            p8Var5.d = 500.0f;
            p8Var5.f44798e = 0.75f;
            p8Var5.a((f(q8Var) * Z.width()) / U());
            p8Var.a(0.0f);
            n6.m0((n6) this.d.f18184c, 0L);
            fArr = fArr2;
        }
        p8Var3.d = 1100.0f;
        p8Var3.f44798e = 0.9f;
        p8Var3.a(fArr[0]);
        p8Var2.d = 1100.0f;
        p8Var2.f44798e = 0.9f;
        p8Var2.a(fArr[1]);
        q8Var.H = 3;
        long j10 = this.O0 + 1;
        this.O0 = j10;
        q8Var.I = j10;
        p8Var.f44796b = 1.0f;
        p8 p8Var6 = q8Var.f44837j;
        p8Var6.d = 320.0f;
        p8Var6.f44798e = 0.75f;
        p8Var6.f44796b = 1.0f;
        q8Var.f44839l.a(0.0f);
        this.A0 = fArr[0] - f10;
        this.B0 = fArr[1] - f11;
        if (!this.f44916p0) {
            f12 = 0.0f;
        }
        this.O.f44796b = f12;
        performHapticFeedback(3);
    }

    public final void X(q8 q8Var, boolean z10) {
        this.T0 = this.U0;
        this.U0 = q8Var;
        this.V0 = 0.0f;
        this.Y0 = z10;
        if (q8Var != null) {
            this.W0 = q8Var.f44833e.f44796b / this.Z0;
            this.X0 = q8Var.f44834f.f44796b / this.f44885a1;
        }
        f0();
    }

    public final void Y(org.telegram.ui.Wallet.l0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r8.Y(org.telegram.ui.Wallet.l0):void");
    }

    public final RectF Z(q8 q8Var) {
        e8 j3 = j(q8Var);
        if (j3 != null && j3.isShown()) {
            Matrix matrix = this.f44932w;
            x6.k(j3, matrix);
            Matrix matrix2 = this.f44935x;
            x6.k(this, matrix2);
            if (!matrix2.invert(matrix2)) {
                return null;
            }
            matrix.postConcat(matrix2);
            RectF rectF = new RectF(0.0f, 0.0f, j3.getWidth(), j3.getHeight());
            matrix.mapRect(rectF);
            if (rectF.bottom > 0.0f && rectF.top < getHeight()) {
                return rectF;
            }
        }
        return null;
    }

    public final void a() {
        this.f44921r0 = false;
        removeCallbacks(this.C1);
        removeCallbacks(this.B1);
        this.f44902h0 = null;
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        f0();
    }

    public final TL_stories.TL_mediaAreaCoordinates a0(q8 q8Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float U = U() * q8Var.h.f44796b;
        tL_mediaAreaCoordinates.f28641x = N((q8Var.f44833e.f44796b / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.f28642y = N((q8Var.f44834f.f44796b / this.f44885a1) * 100.0f);
        tL_mediaAreaCoordinates.f28640w = N((U / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.h = N((U / this.f44885a1) * 100.0f);
        float f10 = q8Var.f44836i.f44796b % 360.0f;
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
        q8 v = v(nftitem);
        if (v.b()) {
            if (this.d.J0()) {
                E(v);
            } else {
                V(v);
            }
        } else if (v.H == 0 && b(v)) {
            d0(v);
        }
        k();
    }

    public final void c0(q8 q8Var) {
        String str = q8Var.f44826a;
        if (str.equals(this.Q0)) {
            l();
        } else if (m(q8Var)) {
            this.Q0 = str;
            if (q8Var.b()) {
                X(q8Var, false);
                k();
            } else {
                this.R0 = str;
                d0(q8Var);
                if (q8Var.H == 0) {
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
        q8 q8Var;
        q8 q8Var2;
        int i7;
        this.f44891c1 = cardVar;
        this.f44893d1 = T(cardVar);
        if (!this.f44896e1 && this.f44901g1 == 0 && !this.f44918q0) {
            TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
            q8 q8Var3 = null;
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
            if (this.f44886b) {
                TL_wallet.nftItem nftitem3 = cardVar.bg_nft_item;
                if (nftitem3 != null && nftitem3.gift != null) {
                    q8Var3 = v(nftitem3);
                }
                this.T0 = q8Var3;
                this.U0 = q8Var3;
                this.V0 = 1.0f;
                e();
                f0();
            } else if (!A()) {
                f0();
            } else {
                this.f44899f1 = true;
                ArrayList G = G();
                int size2 = G.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj = G.get(i11);
                    i11++;
                    q8 q8Var4 = (q8) obj;
                    if (q8Var4.K && (i7 = q8Var4.H) != 3 && i7 != 4 && i7 != 5) {
                        TL_wallet.cardSticker R = R(q8Var4.f44826a);
                        if (R != null) {
                            if (!q8Var4.b() || !y(a0(q8Var4)).equals(y(R.coordinates))) {
                                K(q8Var4, R.coordinates, q8Var4.N);
                            }
                        } else if (q8Var4.b()) {
                            E(q8Var4);
                        }
                    }
                }
                ArrayList<TL_wallet.cardSticker> arrayList2 = cardVar.stickers;
                LinkedHashMap linkedHashMap = this.f44897f;
                if (arrayList2 != null) {
                    int size3 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        TL_wallet.cardSticker cardsticker2 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.nftItem nftitem4 = cardsticker2.nft;
                        if (nftitem4 == null) {
                            q8Var2 = null;
                        } else {
                            q8Var2 = (q8) linkedHashMap.get(nftitem4.address);
                        }
                        if (q8Var2 != null && q8Var2.H == 2) {
                            long j3 = this.O0 + 1;
                            this.O0 = j3;
                            q8Var2.I = j3;
                        }
                    }
                }
                if (!equals) {
                    String str2 = this.Q0;
                    if (str2 == null) {
                        q8Var = null;
                    } else {
                        q8Var = (q8) linkedHashMap.get(str2);
                    }
                    if (q8Var != null && q8Var.b()) {
                        X(q8Var, false);
                    } else {
                        X(null, true);
                    }
                }
                this.f44899f1 = false;
                O();
                f0();
            }
        }
    }

    public final void d0(q8 q8Var) {
        n6.m0((n6) this.d.f18184c, 2600L);
        if (A()) {
            float[] x10 = x(q8Var, Float.NaN, Float.NaN, true);
            RectF Z = Z(q8Var);
            if (x10 != null && Z != null) {
                q8Var.f44835g.a((f(q8Var) * Z.width()) / U());
                q8Var.f44840m.a(0.0f);
                q8Var.f44837j.a(1.0f);
                float[] fArr = {Z.centerX(), Z.centerY()};
                this.f44923s.mapPoints(fArr);
                I(q8Var, fArr, x10, true);
                performHapticFeedback(3);
                return;
            }
            e8 j3 = j(q8Var);
            if (j3 != null) {
                j3.animate().rotation(3.0f).setDuration(90L).withEndAction(new i8(j3, 0)).start();
            }
        }
    }

    public final void e() {
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2;
        float pow;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4;
        q8 q8Var = this.T0;
        if (q8Var == null) {
            stargiftattributebackdrop = null;
        } else {
            stargiftattributebackdrop = q8Var.f44847t;
        }
        float[] i7 = f8.i(stargiftattributebackdrop);
        q8 q8Var2 = this.U0;
        if (q8Var2 == null) {
            stargiftattributebackdrop2 = null;
        } else {
            stargiftattributebackdrop2 = q8Var2.f44847t;
        }
        float[] i10 = f8.i(stargiftattributebackdrop2);
        float f10 = 1.0f;
        if (this.Y0) {
            float f11 = this.V0;
            pow = com.google.android.gms.internal.vision.e2.C(f11, 2.0f, 3.0f, f11 * f11);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - this.V0, 4.0d));
        }
        float[] fArr = new float[18];
        float f12 = i7[0];
        float f13 = i7[1];
        float f14 = i7[2];
        float f15 = i10[0];
        float f16 = i10[1];
        float f17 = i10[2];
        float f18 = this.W0;
        float f19 = this.X0;
        if (!this.Y0) {
            f10 = 0.0f;
        }
        System.arraycopy(new float[]{f12, f13, f14, f15, f16, f17, f18, f19, pow, f10}, 0, fArr, 0, 10);
        q8 q8Var3 = this.T0;
        if (q8Var3 == null) {
            stargiftattributebackdrop3 = null;
        } else {
            stargiftattributebackdrop3 = q8Var3.f44847t;
        }
        f8.m(fArr, 0, stargiftattributebackdrop3);
        q8 q8Var4 = this.U0;
        if (q8Var4 == null) {
            stargiftattributebackdrop4 = null;
        } else {
            stargiftattributebackdrop4 = q8Var4.f44847t;
        }
        f8.m(fArr, 1, stargiftattributebackdrop4);
        this.f44889c.setStickerStyle(fArr);
    }

    public final float f(q8 q8Var) {
        e8 j3 = j(q8Var);
        if (j3 != null) {
            org.telegram.ui.Components.q9 q9Var = j3.E;
            if (j3.getWidth() > 0 && q9Var.getWidth() > 0) {
                return ((q9Var.getWidth() / j3.getWidth()) * 288.0f) / 268.0f;
            }
            return 0.77f;
        }
        return 0.77f;
    }

    public final void f0() {
        if (!this.f44888b1 && isAttachedToWindow()) {
            m8 m8Var = this.F1;
            removeCallbacks(m8Var);
            postOnAnimation(m8Var);
        }
    }

    public final void g(q8 q8Var) {
        q8Var.H = 0;
        q8Var.J = 0L;
        q8Var.f44835g.a(1.0f);
        q8Var.h.a(1.0f);
        q8Var.f44836i.a(0.0f);
        q8Var.f44840m.a(0.0f);
        q8Var.f44837j.a(0.0f);
        q8Var.f44838k.a(0.0f);
        e8 j3 = j(q8Var);
        if (j3 != null) {
            j3.animate().cancel();
            j3.setScaleX(1.0f);
            j3.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - org.telegram.messenger.g0.L(64.0f)) - org.telegram.messenger.g0.f24116n;
    }

    public final void i(e8 e8Var) {
        float f10;
        ArrayList arrayList = this.h;
        if (!arrayList.contains(e8Var)) {
            arrayList.add(e8Var);
        }
        q8 v = v(e8Var.f44135x0);
        if (v.H == 0) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        e8Var.k(v.R, false, f10);
        f0();
    }

    public final e8 j(q8 q8Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e8 e8Var = (e8) obj;
            if (e8Var.isAttachedToWindow() && e8Var.f44135x0.address.equals(q8Var.f44826a)) {
                return e8Var;
            }
        }
        return null;
    }

    public final void k() {
        if (!this.f44886b && !this.f44899f1) {
            this.f44896e1 = true;
            g8 g8Var = this.f44903h1;
            org.telegram.messenger.g0.r(g8Var);
            org.telegram.messenger.g0.h3(g8Var, 1500L);
        }
    }

    public final void l() {
        this.R0 = null;
        this.Q0 = null;
        X(null, true);
        O();
        k();
    }

    public final boolean m(q8 q8Var) {
        if (b(q8Var) && F(this.f44883a.getCurrentAccount(), q8Var.f44828b.gift.slug)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f44942z1);
        getViewTreeObserver().addOnPreDrawListener(this.A1);
        for (q8 q8Var : this.f44897f.values()) {
            q8Var.f44830c.P();
            q8Var.d.P();
        }
        f0();
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.f44942z1);
        getViewTreeObserver().removeOnPreDrawListener(this.A1);
        removeCallbacks(this.F1);
        removeCallbacks(this.B1);
        for (q8 q8Var : this.f44897f.values()) {
            q8Var.f44830c.R();
            q8Var.d.R();
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
        int i7;
        float f14;
        Rect rect;
        float f15;
        int i10;
        float f16;
        q8 q8Var;
        Paint paint;
        ArrayList arrayList;
        RectF rectF;
        r8 r8Var = this;
        Canvas canvas2 = canvas;
        if (r8Var.A()) {
            float f17 = r8Var.O.f44795a;
            int i11 = (f17 > 0.01f ? 1 : (f17 == 0.01f ? 0 : -1));
            RectF rectF2 = r8Var.I;
            ?? r10 = 0;
            Paint paint2 = r8Var.f44938y;
            if (i11 < 0) {
                f11 = 0.0f;
                i7 = 0;
                f10 = 0.4f;
                f12 = 2.0f;
                f13 = 0.6f;
            } else {
                float max = Math.max(0.0f, Math.min(1.2f, r8Var.P.f44795a));
                float l10 = Utilities.l(max);
                f10 = 0.4f;
                Paint paint3 = r8Var.H;
                paint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
                f11 = 0.0f;
                f12 = 2.0f;
                float measureText = (((paint3.measureText(gd.M0(2131746126, null)) + org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(56.0f)) * max) + org.telegram.messenger.g0.L(56.0f);
                canvas2.save();
                f13 = 0.6f;
                canvas2.translate(r8Var.getWidth() / 2.0f, ((1.0f - f17) * org.telegram.messenger.g0.L(90.0f)) + r8Var.h());
                float f18 = (f17 * 0.4f) + 0.6f;
                canvas2.scale(f18, f18);
                int i12 = org.telegram.ui.ActionBar.n6.f29396d6;
                org.telegram.ui.ActionBar.h2 h2Var = r8Var.f44883a;
                paint2.setColor(i0.a.f(l10, org.telegram.ui.ActionBar.n6.w0(i12, h2Var.getResourceProvider()), -1750963));
                paint2.setAlpha((int) (Utilities.l(f17) * 255.0f));
                float f19 = (-measureText) / 2.0f;
                float f20 = measureText / 2.0f;
                rectF2.set(f19, -org.telegram.messenger.g0.L(28.0f), f20, org.telegram.messenger.g0.L(28.0f));
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), paint2);
                float L = (f19 + org.telegram.messenger.g0.L(30.0f)) * l10;
                float L2 = org.telegram.messenger.g0.L(21.0f);
                int round = Math.round(r8Var.f44892d0.f44795a);
                mh0 mh0Var = r8Var.f44898f0;
                mh0Var.N(round, false, false);
                float f21 = L - L2;
                i7 = 0;
                float f22 = -L2;
                float f23 = L + L2;
                mh0Var.setBounds((int) f21, (int) f22, (int) f23, (int) L2);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.f(l10, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, h2Var.getResourceProvider()), -1), PorterDuff.Mode.SRC_IN);
                Paint paint4 = r8Var.f44895e0;
                paint4.setColorFilter(porterDuffColorFilter);
                paint4.setAlpha((int) (Utilities.l(f17) * 255.0f));
                canvas2 = canvas;
                int saveLayer = canvas2.saveLayer(f21, f22, f23, L2, paint4);
                mh0Var.draw(canvas2);
                canvas2.restoreToCount(saveLayer);
                if (l10 > 0.02f) {
                    paint3.setColor(-1);
                    paint3.setAlpha((int) (Utilities.l((l10 - 0.4f) / 0.6f) * 255.0f));
                    Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                    canvas2.save();
                    canvas2.clipRect(org.telegram.messenger.g0.L(22.0f) + L, -org.telegram.messenger.g0.L(28.0f), f20 - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(28.0f));
                    canvas2.drawText(gd.M0(2131746126, null), L + org.telegram.messenger.g0.L(22.0f), (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f, paint3);
                    canvas2.restore();
                }
                canvas2.restore();
                r10 = 0;
            }
            paint2.setShader(r10);
            paint2.setColorFilter(r10);
            paint2.setAlpha(255);
            ArrayList G = r8Var.G();
            int size = G.size();
            int i13 = i7;
            while (i13 < size) {
                int i14 = i13 + 1;
                q8 q8Var2 = (q8) G.get(i13);
                p8 p8Var = q8Var2.f44833e;
                p8 p8Var2 = q8Var2.f44836i;
                float f24 = p8Var.f44795a;
                float f25 = q8Var2.f44834f.f44795a;
                float U = r8Var.U() * q8Var2.f44835g.f44795a * q8Var2.h.f44795a;
                float f26 = q8Var2.f44837j.f44795a;
                int i15 = q8Var2.H;
                if (i15 == 1 && q8Var2.O && f26 > 0.3f) {
                    float[] L3 = r8Var.L(f24 + q8Var2.f44841n.f44795a, f25 + q8Var2.f44842o.f44795a);
                    float f27 = L3[i7];
                    float f28 = L3[1];
                    U = com.google.android.gms.internal.vision.e2.B(f26, 0.15f, 1.0f, U);
                    f14 = f28;
                    f24 = f27;
                } else if (i15 != 3 && i15 != 4 && i15 != 5) {
                    i13 = i14;
                } else {
                    f14 = f25;
                }
                float f29 = U;
                Bitmap a10 = q8Var2.a();
                if (a10 != null) {
                    if (f29 < 1.0f) {
                        i13 = i14;
                    } else {
                        canvas2.save();
                        canvas2.rotate(p8Var2.f44795a, f24, f14);
                        Paint paint5 = paint2;
                        r8Var.t(canvas2, q8Var2, f24, (org.telegram.messenger.g0.L(5.0f) * f26) + org.telegram.messenger.g0.L(1.5f) + f14, com.google.android.gms.internal.vision.e2.B(f26, 0.04f, 1.0f, f29), f26, 0.0f, 1.0f);
                        canvas.restore();
                        float l11 = Utilities.l(q8Var2.f44840m.f44795a);
                        if (q8Var2.H == 4 && q8Var2.W > f13 && r8Var.j(q8Var2) != null) {
                            float l12 = Utilities.l((q8Var2.W - f13) / f10);
                            float f30 = (1.0f - ((3.0f - (l12 * f12)) * (l12 * l12))) * 0.45f;
                            float l13 = (1.0f - (Utilities.l(-q8Var2.V) * f13)) * 0.55f;
                            if (l11 < 1.0f) {
                                paint5.setAlpha((int) ((1.0f - l11) * 255.0f));
                                i10 = size;
                                paint = paint5;
                                f16 = f29;
                                arrayList = G;
                                rectF = rectF2;
                                f15 = f14;
                                q8Var = q8Var2;
                                r8Var.r(canvas, q8Var2.v, f24, f15, f16, f30, l13, p8Var2.f44795a, q8Var2.U, q8Var2.V);
                            } else {
                                f15 = f14;
                                i10 = size;
                                f16 = f29;
                                q8Var = q8Var2;
                                paint = paint5;
                                arrayList = G;
                                rectF = rectF2;
                            }
                            if (l11 > f11) {
                                paint.setAlpha((int) (l11 * 255.0f));
                                canvas2 = canvas;
                                r(canvas2, a10, f24, f15, f16, f30, l13, p8Var2.f44795a, q8Var.U, q8Var.V);
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
                            canvas2.rotate(p8Var2.f44795a, f24, f31);
                            float f32 = f29 / f12;
                            rectF3.set(f24 - f32, f31 - f32, f24 + f32, f32 + f31);
                            if (l11 < 1.0f) {
                                paint5.setAlpha((int) ((1.0f - l11) * 255.0f));
                                rect = null;
                                canvas2.drawBitmap(q8Var2.v, (Rect) null, rectF3, paint5);
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
                        r8Var = this;
                    }
                } else {
                    r8Var = this;
                    i13 = i14;
                }
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        f0();
    }

    public final void p() {
        org.telegram.messenger.g0.E2(this.f44937x1);
        org.telegram.messenger.g0.E2(this.f44940y1);
        this.f44940y1 = null;
        this.f44937x1 = null;
        O();
        org.telegram.messenger.g0.r(this.f44903h1);
        this.f44904i0 = null;
        this.f44888b1 = true;
        if (this.f44896e1) {
            Q();
        }
        this.f44898f0.C(false);
        removeCallbacks(this.F1);
        removeCallbacks(this.B1);
        removeCallbacks(this.C1);
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        for (q8 q8Var : this.f44897f.values()) {
            q8Var.f44830c.R();
            q8Var.d.R();
        }
        this.h.clear();
    }

    public final void q(org.telegram.ui.Wallet.q8 r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r8.q(org.telegram.ui.Wallet.q8, float, float):void");
    }

    public final void r(Canvas canvas, Bitmap bitmap, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18;
        float f19;
        float f20 = f12;
        float f21 = (f20 * f13) + ((-f20) / 2.0f);
        float f22 = 0.3f * f20;
        float f23 = 3.2f * f20;
        float f24 = 0.72f * f14;
        float f25 = f22 * f24;
        double d = f15;
        float cos = (float) Math.cos(Math.toRadians(d));
        float sin = (float) Math.sin(Math.toRadians(d));
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i7 > 14) {
                canvas.drawBitmapMesh(bitmap, 14, 14, this.K, 0, this.L, 0, this.f44938y);
                return;
            }
            int i11 = 0;
            for (int i12 = 14; i11 <= i12; i12 = 14) {
                float f26 = ((i11 / 14.0f) - 0.5f) * f20;
                float f27 = ((i7 / 14.0f) - 0.5f) * f20;
                float f28 = (f26 * cos) - (f27 * sin);
                float f29 = (f27 * cos) + (f26 * sin);
                float f30 = (f29 * f17) + (f28 * f16);
                float f31 = (f29 * f16) + ((-f28) * f17);
                float f32 = f21 - f30;
                float f33 = 0.0f;
                float f34 = 1.0f;
                if (f32 > 0.0f) {
                    float min = Math.min(f24, f32 / f22);
                    float max = Math.max(0.0f, f32 - f25);
                    f18 = f22;
                    f19 = f21;
                    double d2 = min;
                    float sin2 = (f19 - (((float) Math.sin(d2)) * f18)) - (((float) Math.cos(d2)) * max);
                    float sin3 = (max * ((float) Math.sin(d2))) + ((1.0f - ((float) Math.cos(d2))) * f18);
                    f34 = (((float) Math.cos(d2)) * 0.38f) + 0.62f;
                    f30 = sin2;
                    f33 = sin3;
                } else {
                    f18 = f22;
                    f19 = f21;
                }
                float f35 = f23 / (f23 - f33);
                int i13 = i10 * 2;
                float[] fArr = this.K;
                fArr[i13] = (((f30 * f16) - (f31 * f17)) * f35) + f10;
                fArr[i13 + 1] = org.telegram.ui.Cells.c0.g(f31, f16, f30 * f17, f35, f11) - (f33 * 0.15f);
                int i14 = (int) (255.0f * f34);
                this.L[i10] = Color.rgb(i14, i14, i14);
                i11++;
                f20 = f12;
                i10++;
                f21 = f19;
                f22 = f18;
            }
            i7++;
            f20 = f12;
            f21 = f21;
        }
    }

    public final void s(Canvas canvas, q8 q8Var, float f10, float f11, boolean z10) {
        float f12;
        ImageReceiver imageReceiver = q8Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = q8Var.f44847t;
        Bitmap n10 = imageReceiver.n();
        if (n10 != null && stargiftattributebackdrop != null) {
            canvas.save();
            float f13 = this.Z0;
            float f14 = this.f44885a1;
            Path path = this.J;
            path.rewind();
            float f15 = 0.15f;
            char c10 = 0;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(0.0f, 0.0f, f13, f14, (f13 * 0.15f) / 2.0f, (f14 * 0.15f) / 1.212122f, direction);
            canvas.clipPath(path);
            this.f44889c.h(path, this.Z0, this.f44885a1);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            int i7 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i7 >= 0 && !z10) {
                path.rewind();
                path.addCircle(this.W0 * this.Z0, this.X0 * this.f44885a1, f11, direction);
                canvas.clipPath(path);
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
            Paint paint = this.f44938y;
            paint.setColorFilter(porterDuffColorFilter);
            float f16 = this.Z0 / 336.0f;
            float f17 = this.f44885a1 / 205.0f;
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
                    float C = f10 * f20 * com.google.android.gms.internal.vision.e2.C(l10, 2.0f, 3.0f, l10 * l10);
                    if (i7 >= 0) {
                        float l11 = Utilities.l((f11 - Utilities.t(f18, f19, this.W0 * this.Z0, this.X0 * this.f44885a1)) / org.telegram.messenger.g0.L(120.0f));
                        if (z10) {
                            f21 = com.google.android.gms.internal.vision.e2.C(l11, 0.8f, 1.0f, f21);
                            C *= 1.0f - Utilities.l(l11 * 1.6f);
                        } else {
                            f12 = f18;
                            f21 *= (((((float) Math.sin(l11 * 3.141592653589793d)) * 0.28f) + l11) * 0.8f) + 0.2f;
                            C *= Utilities.l(l11 * 1.6f);
                            paint.setAlpha((int) (C * 255.0f));
                            float f23 = f21 / 2.0f;
                            RectF rectF = this.I;
                            rectF.set(f12 - f23, f19 - f23, f12 + f23, f19 + f23);
                            canvas.drawBitmap(n10, (Rect) null, rectF, paint);
                            i13 += 37;
                            f15 = f20;
                            c10 = 0;
                            f16 = f22;
                        }
                    }
                    f12 = f18;
                    paint.setAlpha((int) (C * 255.0f));
                    float f232 = f21 / 2.0f;
                    RectF rectF2 = this.I;
                    rectF2.set(f12 - f232, f19 - f232, f12 + f232, f19 + f232);
                    canvas.drawBitmap(n10, (Rect) null, rectF2, paint);
                    i13 += 37;
                    f15 = f20;
                    c10 = 0;
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

    public final void t(Canvas canvas, q8 q8Var, float f10, float f11, float f12, float f13, float f14, float f15) {
        if (f15 > 0.01f && q8Var.f44849w != null) {
            float f16 = (((0.05f * f13) + 1.0f) * ((f12 * 176.0f) / 128.0f)) / 2.0f;
            float f17 = f10 - f16;
            float f18 = f11 - f16;
            float f19 = f10 + f16;
            float f20 = f11 + f16;
            RectF rectF = this.I;
            rectF.set(f17, f18, f19, f20);
            Paint paint = this.f44938y;
            int alpha = paint.getAlpha();
            paint.setColor(-16044452);
            float l10 = Utilities.l(q8Var.f44840m.f44795a);
            paint.setAlpha((int) (l10 * Utilities.l((f14 * 0.12f) + (f13 * (-0.049999997f)) + 0.16f) * 255.0f * f15));
            canvas.drawBitmap(q8Var.f44849w, (Rect) null, rectF, paint);
            paint.setColor(-1);
            paint.setAlpha(alpha);
        }
    }

    public final q8 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f44897f;
        q8 q8Var = (q8) linkedHashMap.get(str);
        if (q8Var == null) {
            q8Var = new q8(this, nftitem);
            linkedHashMap.put(nftitem.address, q8Var);
        }
        q8Var.f44828b = nftitem;
        return q8Var;
    }

    public final void w(float r19, float r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r8.w(float, float, boolean):void");
    }

    public final float[] x(q8 q8Var, float f10, float f11, boolean z10) {
        boolean z11;
        float f12;
        float f13;
        float f14;
        ArrayList arrayList;
        float min;
        float f15;
        float f16;
        if (!z10) {
            q8Var.N = false;
            return new float[]{f10, f11, q8Var.h.f44796b};
        }
        ArrayList<RectF> stickerObstacles = this.f44889c.getStickerObstacles();
        float f17 = this.Z0 * 0.012f;
        int size = stickerObstacles.size();
        int i7 = 0;
        while (i7 < size) {
            RectF rectF = stickerObstacles.get(i7);
            i7++;
            float f18 = -f17;
            rectF.inset(f18, f18);
        }
        stickerObstacles.get(2).left -= this.Z0 * 0.035f;
        float L = org.telegram.messenger.g0.L(32.0f) / U();
        float f19 = q8Var.h.f44796b;
        q8Var.N = false;
        ArrayList arrayList2 = new ArrayList();
        for (q8 q8Var2 : this.f44897f.values()) {
            if (q8Var2 != q8Var && q8Var2.b()) {
                arrayList2.add(q8Var2);
            }
        }
        if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && q8Var == this.l1 && this.n1 != null && arrayList2.isEmpty()) {
            return (float[]) this.n1.clone();
        }
        if (!z11) {
            f12 = this.Z0 * 0.6f;
            f13 = this.f44885a1 * 0.68f;
        } else {
            f12 = f10;
            f13 = f11;
        }
        Random random = new Random((System.nanoTime() / 400000000) + (arrayList2.size() * 31) + (q8Var.f44826a.hashCode() * 7919));
        float h = org.telegram.ui.Cells.c0.h(random, 0.04f, 0.05f);
        float f20 = 0.5f;
        float nextFloat = (((random.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.Z0;
        float nextFloat2 = this.f44885a1 * (((random.nextFloat() - 0.5f) * 0.08f) + 0.55f);
        float U = U() * L * 0.5f;
        float f21 = -3.4028235E38f;
        float[] fArr = null;
        float f22 = U;
        while (f22 <= this.f44885a1 - U) {
            float f23 = f20;
            float f24 = U;
            while (true) {
                float f25 = this.Z0;
                if (f24 <= f25 - U) {
                    float min2 = Math.min(Math.min(f24, f25 - f24), Math.min(f22, this.f44885a1 - f22));
                    float f26 = h;
                    float min3 = Math.min(Math.max(0.74f, 1.0f - (arrayList2.size() * h)) * f19, min2 / (U() * f23));
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
                        q8 q8Var3 = (q8) obj;
                        min4 = Math.min(min4, (Utilities.t(f24, f22, q8Var3.f44833e.f44796b, q8Var3.f44834f.f44796b) / (U() * 0.29f)) - q8Var3.h.f44796b);
                    }
                    float l10 = ((Utilities.l((min2 - ((U() * f23) * min4)) / org.telegram.messenger.g0.L(14.0f)) * 0.1f) + 0.9f) * min4;
                    if (l10 < f27) {
                        arrayList = arrayList2;
                    } else {
                        if (arrayList2.isEmpty()) {
                            float f30 = this.Z0 * 0.6f;
                            float z13 = com.google.android.gms.internal.vision.e2.z(f12, f30, 0.2f, f30);
                            float f31 = this.f44885a1 * 0.68f;
                            f16 = (random.nextFloat() * org.telegram.messenger.g0.L(5.0f)) + (U() * 1.1f * l10) + (Utilities.t(f24, f22, z13, com.google.android.gms.internal.vision.e2.z(f13, f31, 0.2f, f31)) * (-0.45f));
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
                                q8 q8Var4 = (q8) obj2;
                                float f37 = l10;
                                p8 p8Var = q8Var4.f44833e;
                                int i14 = size4;
                                p8 p8Var2 = q8Var4.h;
                                ArrayList arrayList5 = arrayList2;
                                p8 p8Var3 = q8Var4.f44834f;
                                f35 = Math.min(f35, Utilities.t(f24, f22, p8Var.f44796b, p8Var3.f44796b) - ((p8Var2.f44796b + f37) * (U() * 0.4f)));
                                float f38 = p8Var2.f44796b;
                                float f39 = f38 * f38;
                                float f40 = q8Var4.f44833e.f44796b;
                                f34 = (f40 * f39) + f34;
                                f32 = (p8Var3.f44796b * f39) + f32;
                                f33 += f39;
                                f36 = Math.max(0.0f, 1.0f - (Math.abs(p8Var3.f44796b - f22) / (U() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f40 - f24) / (U() * 0.12f))) + f36;
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
                            float nextFloat3 = (random.nextFloat() * org.telegram.messenger.g0.L(10.0f)) + (((((Math.min(Math.min(min2, f29), U()) * 0.2f) + ((U() * (f14 * 0.9f)) + (min * 1.2f))) - (Utilities.t(f34 / f33, f41 / f33, nextFloat, nextFloat2) * 0.35f)) - ((U() * f36) * 0.08f)) - (Utilities.t(f24, f22, this.Z0 * f23, this.f44885a1 * 0.55f) * 0.04f));
                            if (z12) {
                                f15 = Utilities.t(f24, f22, f12, f13) * 0.04f;
                            } else {
                                f15 = 0.0f;
                            }
                            f16 = nextFloat3 - f15;
                        }
                        if (f16 > f21) {
                            f21 = f16;
                            fArr = new float[]{f24, f22, f14};
                            f24 += org.telegram.messenger.g0.L(5.0f);
                            h = f26;
                            L = f27;
                            f19 = f28;
                            stickerObstacles = arrayList4;
                            z11 = z12;
                            arrayList2 = arrayList;
                        }
                    }
                    f24 += org.telegram.messenger.g0.L(5.0f);
                    h = f26;
                    L = f27;
                    f19 = f28;
                    stickerObstacles = arrayList4;
                    z11 = z12;
                    arrayList2 = arrayList;
                }
            }
            f22 += org.telegram.messenger.g0.L(5.0f);
            f20 = f23;
            h = h;
        }
        return fArr;
    }

    public final boolean z(e8 e8Var) {
        if (e8Var.isShown()) {
            Rect rect = this.I1;
            if (e8Var.getGlobalVisibleRect(rect) && rect.width() >= e8Var.getWidth() - 1 && rect.height() >= e8Var.getHeight() - 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
