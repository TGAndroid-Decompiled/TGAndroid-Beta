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
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.sk;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.yf;
public final class a8 extends View {
    public static final int G1 = 0;
    public float A0;
    public final s7 A1;
    public float B0;
    public final s7 B1;
    public float C0;
    public final v7 C1;
    public final Paint D;
    public float D0;
    public final RectF D1;
    public final RectF E;
    public float E0;
    public final Paint E1;
    public final Paint F;
    public float F0;
    public final Rect F1;
    public final Paint G;
    public float G0;
    public final RectF H;
    public float H0;
    public final Path I;
    public float I0;
    public final float[] J;
    public float J0;
    public final int[] K;
    public int K0;
    public final u7 L;
    public boolean L0;
    public final t7 M;
    public long M0;
    public final y7 N;
    public long N0;
    public final y7 O;
    public VelocityTracker O0;
    public final y7 P;
    public String P0;
    public final y7 Q;
    public String Q0;
    public final y7 R;
    public long R0;
    public final ArrayList S;
    public z7 S0;
    public final Path T;
    public z7 T0;
    public final Paint U;
    public float U0;
    public final LinearGradient V;
    public float V0;
    public final Matrix W;
    public float W0;
    public boolean X0;
    public float Y0;
    public float Z0;
    public final org.telegram.ui.ActionBar.f2 f42136a;
    public float f42137a0;
    public boolean f42138a1;
    public final boolean f42139b;
    public float f42140b0;
    public TL_wallet.card f42141b1;
    public final f6 f42142c;
    public final y7 f42143c0;
    public String f42144c1;
    public final m4.d0 d;
    public final Paint f42145d0;
    public boolean f42146d1;
    public final SharedPreferences f42147e;
    public final ah0 f42148e0;
    public boolean f42149e1;
    public final LinkedHashMap f42150f;
    public boolean f42151f0;
    public int f42152f1;
    public z7 f42153g0;
    public final s7 f42154g1;
    public final ArrayList h;
    public z7 f42155h0;
    public boolean f42156h1;
    public boolean f42157i0;
    public boolean f42158i1;
    public final Paint f42159j0;
    public boolean f42160j1;
    public final Paint f42161k0;
    public z7 f42162k1;
    public final Paint f42163l0;
    public n7 l1;
    public boolean m0;
    public float[] f42164m1;
    public final ArrayList f42165n;
    public boolean f42166n0;
    public float n1;
    public boolean f42167o0;
    public final float[] f42168o1;
    public boolean f42169p0;
    public final y7 f42170p1;
    public boolean f42171q0;
    public final y7 f42172q1;
    public final Matrix f42173r;
    public boolean f42174r0;
    public final Paint f42175r1;
    public final Matrix f42176s;
    public boolean f42177s0;
    public final Paint f42178s1;
    public boolean f42179t0;
    public final Matrix f42180t1;
    public boolean f42181u0;
    public final Path f42182u1;
    public int f42183v0;
    public final RectF f42184v1;
    public final Matrix f42185w;
    public float f42186w0;
    public fi.m3 f42187w1;
    public final Matrix f42188x;
    public float f42189x0;
    public fi.m3 f42190x1;
    public final Paint f42191y;
    public float f42192y0;
    public final j1 f42193y1;
    public float f42194z0;
    public final j5 f42195z1;

    public a8(org.telegram.ui.ActionBar.f2 f2Var, f6 f6Var, m4.d0 d0Var, TL_wallet.card cardVar) {
        super(f2Var.getContext());
        SharedPreferences sharedPreferences;
        this.f42150f = new LinkedHashMap();
        this.h = new ArrayList();
        this.f42165n = new ArrayList();
        this.f42173r = new Matrix();
        this.f42176s = new Matrix();
        this.f42185w = new Matrix();
        this.f42188x = new Matrix();
        this.f42191y = new Paint(3);
        this.D = new Paint(3);
        this.E = new RectF();
        Paint paint = new Paint(1);
        this.F = paint;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new RectF();
        this.I = new Path();
        this.J = new float[450];
        this.K = new int[225];
        this.N = new y7(0.0f, 260.0f, 0.78f);
        this.O = new y7(0.0f, 420.0f, 0.72f);
        this.P = new y7(1.0f, 420.0f, 0.38f);
        this.Q = new y7(0.0f, 170.0f, 0.42f);
        this.R = new y7(0.0f, 170.0f, 0.42f);
        this.S = new ArrayList();
        this.T = new Path();
        Paint paint3 = new Paint(1);
        this.U = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.V = linearGradient;
        this.W = new Matrix();
        this.f42143c0 = new y7(0.0f, 120.0f, 1.0f);
        this.f42145d0 = new Paint(1);
        this.f42159j0 = new Paint(1);
        this.f42161k0 = new Paint(1);
        this.f42163l0 = new Paint(1);
        this.U0 = 1.0f;
        this.V0 = 0.5f;
        this.W0 = 0.5f;
        this.f42154g1 = new s7(this, 1);
        this.f42168o1 = new float[3];
        this.f42170p1 = new y7(0.0f, 260.0f, 1.0f);
        this.f42172q1 = new y7(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.f42175r1 = paint4;
        Paint paint5 = new Paint(1);
        this.f42178s1 = paint5;
        this.f42180t1 = new Matrix();
        this.f42182u1 = new Path();
        this.f42184v1 = new RectF();
        this.f42193y1 = new j1(this, 1);
        this.f42195z1 = new j5(2, this);
        this.A1 = new s7(this, 2);
        this.B1 = new s7(this, 3);
        this.C1 = new v7(this);
        this.D1 = new RectF();
        Paint paint6 = new Paint(1);
        this.E1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.F1 = new Rect();
        this.f42136a = f2Var;
        boolean z9 = cardVar != null;
        this.f42139b = z9;
        ah0 ah0Var = new ah0(2131624357, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
        this.f42148e0 = ah0Var;
        ah0Var.R(this);
        this.f42142c = f6Var;
        this.d = d0Var;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z9) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + f2Var.getCurrentAccount() + "_" + l0.x(f2Var.getCurrentAccount()).t(), 0);
        }
        this.f42147e = sharedPreferences;
        this.P0 = z9 ? null : sharedPreferences.getString("style", null);
        this.f42156h1 = (z9 || qp.e1().getBoolean("walletcardstickerhint", false)) ? false : true;
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
        t7 t7Var = new t7(this, getContext());
        this.M = t7Var;
        u7 u7Var = new u7(this, getContext());
        this.L = u7Var;
        t7Var.setTag(a6.f42110n0);
        f6Var.getFrontFace().addView(t7Var, 0, c8.ha.c(-1.0f, -1));
        f6Var.getFrontFace().addView(u7Var, f6Var.getStickerLayerIndex(), c8.ha.c(-1.0f, -1));
        if (z9) {
            u7Var.addOnLayoutChangeListener(new p7(this, 0));
            d(cardVar);
            return;
        }
        int currentAccount = f2Var.getCurrentAccount();
        qp s12 = qp.s1(currentAccount);
        long e10 = p10.i(currentAccount).e();
        TLRPC.UserFull b22 = s12.b2(e10);
        if (b22 != null) {
            TL_wallet.card cardVar2 = b22.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
            return;
        }
        s12.W2(s12.a2(Long.valueOf(e10)), 0, true, new k(this, 4));
    }

    public static boolean F(int i7, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(45);
            HashSet hashSet = ((org.telegram.messenger.o0) qp.s1(i7).f24942x7.m0.f13889b).f24266c;
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

    public static Path H(z7 z7Var) {
        Bitmap bitmap;
        int i7;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        if (z7Var != null && z7Var.F == null && (bitmap = z7Var.f43457u) != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
            int[] iArr = new int[16384];
            createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
            if (createScaledBitmap != z7Var.f43457u) {
                createScaledBitmap.recycle();
            }
            boolean[] zArr = new boolean[16384];
            int i12 = -1;
            for (int i13 = 0; i13 < 16384; i13++) {
                if ((iArr[i13] >>> 24) >= 110) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[i13] = z10;
                if (i12 < 0 && z10) {
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
                                        z9 = true;
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
                                z9 = false;
                                break;
                            }
                        }
                        if (!z9 || (i20 == i15 && i18 == i16)) {
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
                    z7Var.F = path;
                    return path;
                }
                return null;
            }
            return null;
        } else if (z7Var == null) {
            return null;
        } else {
            return z7Var.F;
        }
    }

    public static void J(fi.m3 m3Var, float f10, float f11) {
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

    public static boolean b(z7 z7Var) {
        TL_wallet.nftItem nftitem;
        if (z7Var != null && (nftitem = z7Var.f43437b) != null && nftitem.gift != null) {
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
        TLRPC.UserFull b22 = qp.s1(i7).b2(p10.i(i7).e());
        if (b22 == null) {
            return;
        }
        b22.wallet_card = cardVar;
        yr.a0(i7).j2(b22, false);
    }

    public static float n(RectF rectF, RectF rectF2) {
        float min = Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left);
        float min2 = Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top);
        if (min <= 0.0f || min2 <= 0.0f || rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return 0.0f;
        }
        return Utilities.l(((min * min2) / (rectF2.height() * rectF2.width())) * 4.0f);
    }

    public static void o(fi.m3 m3Var, int i7) {
        if ((m3Var.getTag() instanceof Integer) && ((Integer) m3Var.getTag()).intValue() == i7) {
            return;
        }
        m3Var.setTag(Integer.valueOf(i7));
        m3Var.f12416a = i7;
        m3Var.p(1.0f, 0.0f);
    }

    public static float u(float f10, float f11, float f12) {
        float l10 = Utilities.l((f10 - f11) / (f12 - f11));
        return com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static String y(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        if (mediaAreaCoordinates == null) {
            return "";
        }
        return String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.f27192x), Double.valueOf(mediaAreaCoordinates.f27193y), Double.valueOf(mediaAreaCoordinates.f27191w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public final boolean A() {
        f6 f6Var = this.f42142c;
        this.Y0 = f6Var.getFrontFace().getWidth();
        float height = f6Var.getFrontFace().getHeight();
        this.Z0 = height;
        if (this.Y0 > 0.0f && height > 0.0f) {
            Matrix matrix = this.f42173r;
            if (f6Var.g(this, matrix) && matrix.invert(this.f42176s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final fi.m3 B(int i7, boolean z9) {
        float f10;
        fi.m3 m3Var = new fi.m3(getContext(), 3);
        m3Var.r(true);
        if (z9) {
            f10 = 15.0f;
        } else {
            f10 = 11.0f;
        }
        m3Var.n(11.0f, 6.0f, f10, 7.0f);
        m3Var.k(z9);
        m3Var.K = Layout.Alignment.ALIGN_NORMAL;
        m3Var.s(12.0f);
        m3Var.d = -1L;
        String M0 = id.M0(i7, null);
        m3Var.h = fi.m3.a(M0, m3Var.getTextPaint());
        m3Var.u(M0);
        m3Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        m3Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(m3Var, c8.ha.e(-1, 150, 48));
        return m3Var;
    }

    public final boolean C() {
        Path H;
        if (this.f42164m1 == null) {
            H = null;
        } else {
            H = H(this.f42162k1);
        }
        if (H == null) {
            return false;
        }
        float U = U() * this.f42164m1[2];
        Matrix matrix = this.f42180t1;
        matrix.setScale(U, U);
        float[] fArr = this.f42164m1;
        matrix.postTranslate(fArr[0], fArr[1]);
        H.transform(matrix, this.f42182u1);
        return true;
    }

    public final float[] D(float f10) {
        float[] fArr = this.f42168o1;
        fArr[0] = (u(f10, 0.45f, 0.82f) - u(f10, 1.3f, 1.72f)) * 0.9f;
        fArr[1] = (((float) Math.sin(Utilities.l((f10 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f10, 0.6f, 0.92f) - u(f10, 1.18f, 1.46f));
        fArr[2] = u(f10, 1.58f, 1.7f) - u(f10, 1.7f, 1.92f);
        return fArr;
    }

    public final void E(z7 z7Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        z7Var.J = 0L;
        y7 y7Var = z7Var.h;
        y7 y7Var2 = z7Var.f43443f;
        y7 y7Var3 = z7Var.f43442e;
        if (z7Var.f43435a.equals(this.P0)) {
            l();
        }
        if (z7Var.b()) {
            float[] L = L(y7Var3.f43389a, y7Var2.f43389a);
            y7Var3.a(L[0]);
            y7Var2.a(L[1]);
        }
        z7Var.H = 4;
        z7Var.W = 0.0f;
        z7Var.X = y7Var3.f43389a;
        z7Var.Y = y7Var2.f43389a;
        z7Var.Z = z7Var.f43444g.f43389a * y7Var.f43389a;
        z7Var.f43436a0 = z7Var.f43445i.f43389a;
        if (this.f42186w0 > org.telegram.messenger.g0.L(650.0f)) {
            f10 = 0.32f;
        } else {
            f10 = 0.44f;
        }
        z7Var.f43438b0 = f10;
        this.f42186w0 = 0.0f;
        n7 j3 = j(z7Var);
        if (j3 != null) {
            j3.animate().cancel();
            j3.o();
        }
        if (j3 != null) {
            f11 = j3.getScaleX();
        } else {
            f11 = 1.0f;
        }
        z7Var.f43440c0 = f11;
        RectF Z = Z(z7Var);
        if (Z != null) {
            float centerX = Z.centerX() - z7Var.X;
            float centerY = Z.centerY() - z7Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            if (hypot > org.telegram.messenger.g0.L(6.0f)) {
                f12 = centerX / hypot;
            } else {
                f12 = 0.0f;
            }
            z7Var.U = f12;
            if (hypot > org.telegram.messenger.g0.L(6.0f)) {
                f13 = centerY / hypot;
            } else {
                f13 = 1.0f;
            }
            z7Var.V = f13;
        }
        z7Var.f43448l.a(0.0f);
        y7Var.a(1.0f);
        long j10 = this.N0 + 1;
        this.N0 = j10;
        z7Var.I = j10;
        O();
        f0();
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList(this.f42150f.values());
        List.EL.sort(arrayList, Comparator$CC.comparingLong(new sk(5)));
        return arrayList;
    }

    public final void I(z7 z7Var, float[] fArr, float[] fArr2, boolean z9) {
        float f10;
        float f11;
        float f12;
        float f13;
        long j3 = z7Var.J;
        y7 y7Var = z7Var.f43451o;
        y7 y7Var2 = z7Var.f43450n;
        if (j3 == 0) {
            long j10 = this.R0 + 1;
            this.R0 = j10;
            z7Var.J = j10;
            ArrayList arrayList = new ArrayList();
            for (z7 z7Var2 : this.f42150f.values()) {
                if (z7Var2 != z7Var && z7Var2.b()) {
                    arrayList.add(z7Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.EL.sort(arrayList, Comparator$CC.comparingLong(new sk(6)));
                for (int i7 = 0; i7 <= arrayList.size() - 10; i7++) {
                    z7 z7Var3 = (z7) arrayList.get(i7);
                    if (this.d.M()) {
                        E(z7Var3);
                    } else {
                        V(z7Var3);
                    }
                }
                k();
            }
        }
        z7Var.H = 1;
        z7Var.Q = false;
        z7Var.M = false;
        z7Var.L = false;
        z7Var.P = z9;
        z7Var.O = z9;
        long j11 = this.N0 + 1;
        this.N0 = j11;
        z7Var.I = j11;
        y7Var2.a(0.0f);
        y7Var.a(0.0f);
        y7 y7Var3 = z7Var.f43442e;
        float f14 = 500.0f;
        float f15 = 150.0f;
        if (z9) {
            f10 = 150.0f;
        } else {
            f10 = 500.0f;
        }
        float f16 = 0.82f;
        float f17 = 1.0f;
        if (z9) {
            f11 = 0.82f;
        } else {
            f11 = 1.0f;
        }
        y7Var3.d = f10;
        y7Var3.f43392e = f11;
        y7Var3.a(fArr[0]);
        y7Var3.f43390b = fArr2[0];
        y7 y7Var4 = z7Var.f43443f;
        if (z9) {
            f14 = 150.0f;
        }
        if (!z9) {
            f16 = 1.0f;
        }
        y7Var4.d = f14;
        y7Var4.f43392e = f16;
        y7Var4.a(fArr[1]);
        float f18 = fArr2[1];
        y7Var4.f43390b = f18;
        z7Var.h.f43390b = fArr2[2];
        y7 y7Var5 = z7Var.f43444g;
        y7Var5.d = 300.0f;
        y7Var5.f43392e = 0.5f;
        y7Var5.f43390b = 1.0f;
        y7 y7Var6 = z7Var.f43446j;
        if (z9) {
            f15 = 110.0f;
        }
        y7Var6.d = f15;
        y7Var6.f43392e = 0.9f;
        y7Var6.f43390b = 0.0f;
        z7Var.f43449m.f43390b = 1.0f;
        z7Var.f43448l.f43390b = 0.0f;
        float f19 = fArr2[0] - fArr[0];
        float f20 = f18 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f19, f20));
        if (max > org.telegram.messenger.g0.L(6.0f)) {
            f12 = f19 / max;
        } else {
            f12 = 0.0f;
        }
        z7Var.U = f12;
        if (max > org.telegram.messenger.g0.L(6.0f)) {
            f13 = f20 / max;
        } else {
            f13 = 1.0f;
        }
        z7Var.V = f13;
        y7 y7Var7 = z7Var.f43447k;
        y7Var7.a(0.9f);
        y7Var7.f43390b = 0.0f;
        if (z9) {
            float min = Math.min(org.telegram.messenger.g0.L(110.0f), 0.32f * max);
            if (f19 >= 0.0f) {
                f17 = -1.0f;
            }
            y7Var2.a(0.0f);
            y7Var2.f43391c = ((-f20) / max) * min * f17 * 20.0f;
            y7Var.a(0.0f);
            y7Var.f43391c = com.google.android.recaptcha.internal.a.C(min, 0.5f, (f19 / max) * min * f17, 20.0f);
        }
        O();
        f0();
    }

    public final void K(z7 z7Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z9) {
        z7Var.h.a((float) (mediaAreaCoordinates.f27191w / 23.100000381469727d));
        z7Var.f43445i.a(c((float) mediaAreaCoordinates.rotation));
        z7Var.N = z9;
        z7Var.f43442e.a((((float) mediaAreaCoordinates.f27192x) / 100.0f) * this.Y0);
        z7Var.f43443f.a((((float) mediaAreaCoordinates.f27193y) / 100.0f) * this.Z0);
        z7Var.f43444g.a(1.0f);
        z7Var.f43446j.a(0.0f);
        z7Var.f43447k.a(0.0f);
        z7Var.f43450n.a(0.0f);
        z7Var.f43451o.a(0.0f);
        z7Var.f43448l.a(0.0f);
        z7Var.H = 2;
        long j3 = this.N0 + 1;
        this.N0 = j3;
        z7Var.I = j3;
        z7Var.f43449m.a(1.0f);
        if (z7Var.J == 0) {
            long j10 = this.R0 + 1;
            this.R0 = j10;
            z7Var.J = j10;
        }
        if (z7Var.f43435a.equals(this.P0)) {
            this.T0 = z7Var;
            this.S0 = z7Var;
            this.U0 = 1.0f;
            e();
        }
    }

    public final float[] L(float f10, float f11) {
        float[] fArr = {f10, f11};
        this.f42173r.mapPoints(fArr);
        return fArr;
    }

    public final void M(z7 z7Var, float f10, float f11) {
        float z9;
        y7 y7Var = z7Var.f43442e;
        y7 y7Var2 = z7Var.h;
        float[] L = L(y7Var.f43389a, z7Var.f43443f.f43389a);
        boolean z10 = false;
        float t6 = Utilities.t(f10, f11, L[0], L[1]);
        if (Float.isNaN(this.E0)) {
            this.E0 = t6;
            this.F0 = y7Var2.f43390b;
        }
        if (Math.abs(t6 - this.E0) > org.telegram.messenger.g0.L(5.0f)) {
            y7 y7Var3 = z7Var.f43453q;
            y7Var3.d = 700.0f;
            y7Var3.f43392e = 1.0f;
            y7Var3.f43390b = 1.0f;
        }
        float L2 = org.telegram.messenger.g0.L(32.0f) / U();
        if (this.f42157i0) {
            z9 = (this.F0 * t6) / Math.max(1.0f, this.E0);
        } else {
            z9 = com.google.android.recaptcha.internal.a.z(1.21f, L2, (t6 - this.E0) / org.telegram.messenger.g0.L(110.0f), this.F0);
        }
        y7Var2.d = 900.0f;
        y7Var2.f43392e = 1.0f;
        y7Var2.f43390b = Math.max(L2, Math.min(1.21f, z9));
        if (t6 < org.telegram.messenger.g0.L(14.0f)) {
            this.B0 = Float.NaN;
            return;
        }
        float degrees = (float) Math.toDegrees(Math.atan2(f11 - L[1], f10 - L[0]));
        if (!Float.isNaN(this.B0)) {
            this.C0 = c(degrees - this.B0) + this.C0;
        }
        this.B0 = degrees;
        float f12 = this.D0 + this.C0;
        float round = Math.round(f12 / 90.0f) * 90;
        if (Math.abs(f12 - round) < 5.0f) {
            z10 = true;
        }
        if (z10 && !this.L0) {
            performHapticFeedback(4);
        }
        this.L0 = z10;
        y7 y7Var4 = z7Var.f43445i;
        y7Var4.d = 900.0f;
        y7Var4.f43392e = 0.95f;
        if (z10) {
            f12 = round;
        }
        y7Var4.f43390b = f12;
    }

    public final void O() {
        if (!this.f42139b && this.Y0 > 0.0f && this.Z0 > 0.0f) {
            SharedPreferences.Editor edit = this.f42147e.edit();
            for (z7 z7Var : this.f42150f.values()) {
                boolean b10 = z7Var.b();
                String str = z7Var.f43435a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", z7Var.f43442e.f43390b / this.Y0);
                        jSONObject.put("y", z7Var.f43443f.f43390b / this.Z0);
                        jSONObject.put("r", z7Var.f43445i.f43390b);
                        jSONObject.put("s", z7Var.h.f43390b);
                        jSONObject.put("q", z7Var.N);
                        edit.putString(str, jSONObject.toString());
                    } catch (Exception unused) {
                    }
                } else {
                    edit.remove(str);
                }
            }
            String str2 = this.P0;
            if (str2 == null) {
                edit.remove("style");
            } else {
                edit.putString("style", str2);
            }
            edit.apply();
        }
    }

    public final float P(z7 z7Var) {
        return (((1.0f - (z7Var.f43453q.f43389a * 0.9f)) * z7Var.f43448l.f43389a * 0.04f) + 1.0f) * U() * z7Var.f43444g.f43389a * z7Var.h.f43389a;
    }

    public final void Q() {
        if (!this.f42146d1 || this.f42152f1 != 0) {
            return;
        }
        if (!this.f42138a1 && (this.f42169p0 || !A())) {
            org.telegram.messenger.g0.i3(this.f42154g1, 1000L);
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
            z7 z7Var = (z7) obj;
            boolean b10 = z7Var.b();
            String str2 = z7Var.f43435a;
            if (b10) {
                sb2.append(str2);
                sb2.append(':');
                sb2.append(y(a0(z7Var)));
                sb2.append(';');
                if (str2.equals(this.P0) && m(z7Var)) {
                    str = str2;
                }
            }
        }
        if (a8.p0.s(sb2, "bg:", str).equals(this.f42144c1)) {
            this.f42146d1 = false;
            return;
        }
        TL_wallet.setCardStickers setcardstickers = new TL_wallet.setCardStickers();
        ArrayList G2 = G();
        int size2 = G2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = G2.get(i11);
            i11++;
            z7 z7Var2 = (z7) obj2;
            boolean b11 = z7Var2.b();
            String str3 = z7Var2.f43435a;
            if (b11) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                inputwalletcardsticker.nft_address = str3;
                inputwalletcardsticker.coordinates = a0(z7Var2);
                setcardstickers.stickers.add(inputwalletcardsticker);
                if (str3.equals(this.P0) && m(z7Var2)) {
                    setcardstickers.bg_nft_address = str3;
                }
            }
        }
        this.f42146d1 = false;
        int currentAccount = this.f42136a.getCurrentAccount();
        TL_wallet.card cardVar = this.f42141b1;
        TL_wallet.card cardVar2 = new TL_wallet.card();
        TL_wallet.card cardVar3 = this.f42141b1;
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
            z7 z7Var3 = (z7) this.f42150f.get(inputwalletcardsticker3.nft_address);
            if (z7Var3 != null && z7Var3.f43437b != null) {
                TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                cardsticker.nft = z7Var3.f43437b;
                cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                cardVar2.stickers.add(cardsticker);
                if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                    cardVar2.bg_nft_item = z7Var3.f43437b;
                }
            }
        }
        e0(currentAccount, cardVar2);
        this.f42152f1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new d3.b(1), new yf(this, currentAccount, cardVar, 3));
    }

    public final TL_wallet.cardSticker R(String str) {
        ArrayList<TL_wallet.cardSticker> arrayList;
        TL_wallet.card cardVar = this.f42141b1;
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

    public final void S(n7 n7Var) {
        int i7;
        int i10;
        removeCallbacks(this.A1);
        this.f42177s0 = true;
        this.f42169p0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        n7Var.animate().cancel();
        n7Var.n(n7Var.getScaleX() * n7Var.f42896y0);
        n7Var.setScaleX(1.0f);
        n7Var.setScaleY(1.0f);
        n7Var.m(1.0f, 150L, null);
        final z7 v = v(n7Var.f42894w0);
        String str = v.f43435a;
        if (!b(v) && !v.b()) {
            this.f42177s0 = false;
            return;
        }
        l60 I = l60.I(this.f42136a, n7Var);
        I.f35617s = 51;
        if (m(v) || str.equals(this.P0)) {
            if (str.equals(this.P0)) {
                i7 = 2131743103;
            } else {
                i7 = 2131743109;
            }
            I.c(2131232097, id.M0(i7, null), new Runnable(this) {
                public final a8 f43057b;

                {
                    this.f43057b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f43057b.c0(v);
                            return;
                        default:
                            a8 a8Var = this.f43057b;
                            a8Var.getClass();
                            a8Var.b0(v.f43437b);
                            return;
                    }
                }
            }, false);
        }
        if (v.b()) {
            i10 = 2131743102;
        } else {
            i10 = 2131743110;
        }
        I.c(2131232382, id.M0(i10, null), new Runnable(this) {
            public final a8 f43057b;

            {
                this.f43057b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f43057b.c0(v);
                        return;
                    default:
                        a8 a8Var = this.f43057b;
                        a8Var.getClass();
                        a8Var.b0(v.f43437b);
                        return;
                }
            }
        }, false);
        I.f35612p = new s7(this, 0);
        I.Z();
        performHapticFeedback(0);
    }

    public final float U() {
        return this.Y0 * 0.231f;
    }

    public final void V(z7 z7Var) {
        if (z7Var.f43435a.equals(this.P0)) {
            l();
        }
        z7Var.N = false;
        g(z7Var);
        n7 j3 = j(z7Var);
        if (j3 != null) {
            j3.setScaleX(0.93f);
            j3.setScaleY(0.93f);
            j3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        O();
        f0();
    }

    public final void W(z7 z7Var, float f10, float f11) {
        boolean z9;
        float[] fArr;
        boolean z10;
        this.f42155h0 = null;
        this.m0 = true;
        if (this.K0 == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f42167o0 = z9;
        if (this.f42156h1) {
            if (z7Var == this.f42162k1 && !z9) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f42158i1 = z10;
            this.f42160j1 = false;
            this.f42156h1 = false;
            qp.e1().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z11 = z7Var.N;
        y7 y7Var = z7Var.f43449m;
        y7 y7Var2 = z7Var.f43443f;
        y7 y7Var3 = z7Var.f43442e;
        float f12 = 1.0f;
        if (z11) {
            z7Var.N = false;
            y7 y7Var4 = z7Var.h;
            y7Var4.d = 420.0f;
            y7Var4.f43392e = 0.8f;
            y7Var4.f43390b = 1.0f;
        }
        n7 j3 = j(z7Var);
        if (j3 != null) {
            j3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.f42179t0 = false;
        if (this.f42167o0) {
            fArr = L(y7Var3.f43389a, y7Var2.f43389a);
        } else {
            RectF Z = Z(z7Var);
            if (Z == null) {
                return;
            }
            float[] fArr2 = {Z.centerX(), Z.centerY()};
            y7 y7Var5 = z7Var.f43444g;
            y7Var5.d = 500.0f;
            y7Var5.f43392e = 0.75f;
            y7Var5.a((f(z7Var) * Z.width()) / U());
            y7Var.a(0.0f);
            w5.m0((w5) this.d.f19612b, 0L);
            fArr = fArr2;
        }
        y7Var3.d = 1100.0f;
        y7Var3.f43392e = 0.9f;
        y7Var3.a(fArr[0]);
        y7Var2.d = 1100.0f;
        y7Var2.f43392e = 0.9f;
        y7Var2.a(fArr[1]);
        z7Var.H = 3;
        long j10 = this.N0 + 1;
        this.N0 = j10;
        z7Var.I = j10;
        y7Var.f43390b = 1.0f;
        y7 y7Var6 = z7Var.f43446j;
        y7Var6.d = 320.0f;
        y7Var6.f43392e = 0.75f;
        y7Var6.f43390b = 1.0f;
        z7Var.f43448l.a(0.0f);
        this.f42194z0 = fArr[0] - f10;
        this.A0 = fArr[1] - f11;
        if (!this.f42167o0) {
            f12 = 0.0f;
        }
        this.N.f43390b = f12;
        performHapticFeedback(3);
    }

    public final void X(z7 z7Var, boolean z9) {
        this.S0 = this.T0;
        this.T0 = z7Var;
        this.U0 = 0.0f;
        this.X0 = z9;
        if (z7Var != null) {
            this.V0 = z7Var.f43442e.f43390b / this.Y0;
            this.W0 = z7Var.f43443f.f43390b / this.Z0;
        }
        f0();
    }

    public final void Y(d0 d0Var) {
        TL_wallet.nftItem nftitem;
        ArrayList arrayList = d0Var.f42328a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
            if (nftitem2.gift != null) {
                v(nftitem2);
            }
        }
        Iterator it = this.f42150f.values().iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            z7 z7Var = (z7) it.next();
            int i10 = z7Var.H;
            String str = z7Var.f43435a;
            if (i10 != 3) {
                ArrayList arrayList2 = d0Var.f42330c;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                        if (!wallettransaction.failed && (nftitem = wallettransaction.nft) != null && l0.b(nftitem.address, str)) {
                            if (str.equals(this.P0) || str.equals(this.Q0)) {
                                this.Q0 = null;
                                this.P0 = null;
                                X(null, true);
                            }
                            it.remove();
                            SharedPreferences sharedPreferences = this.f42147e;
                            if (sharedPreferences != null) {
                                sharedPreferences.edit().remove(str).apply();
                            }
                            z9 = true;
                        }
                    }
                }
            }
        }
        if (z9 && !this.f42139b) {
            O();
            k();
        }
        f0();
    }

    public final RectF Z(z7 z7Var) {
        n7 j3 = j(z7Var);
        if (j3 != null && j3.isShown()) {
            Matrix matrix = this.f42185w;
            f6.k(j3, matrix);
            Matrix matrix2 = this.f42188x;
            f6.k(this, matrix2);
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
        this.f42171q0 = false;
        removeCallbacks(this.B1);
        removeCallbacks(this.A1);
        this.f42153g0 = null;
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        f0();
    }

    public final TL_stories.TL_mediaAreaCoordinates a0(z7 z7Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float U = U() * z7Var.h.f43390b;
        tL_mediaAreaCoordinates.f27192x = N((z7Var.f43442e.f43390b / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.f27193y = N((z7Var.f43443f.f43390b / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.f27191w = N((U / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.h = N((U / this.Z0) * 100.0f);
        float f10 = z7Var.f43445i.f43390b % 360.0f;
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
        z7 v = v(nftitem);
        if (v.b()) {
            if (this.d.M()) {
                E(v);
            } else {
                V(v);
            }
        } else if (v.H == 0 && b(v)) {
            d0(v);
        }
        k();
    }

    public final void c0(z7 z7Var) {
        String str = z7Var.f43435a;
        if (str.equals(this.P0)) {
            l();
        } else if (m(z7Var)) {
            this.P0 = str;
            if (z7Var.b()) {
                X(z7Var, false);
                k();
            } else {
                this.Q0 = str;
                d0(z7Var);
                if (z7Var.H == 0) {
                    this.Q0 = null;
                    this.P0 = null;
                } else {
                    k();
                }
            }
            O();
        }
    }

    public final void d(TL_wallet.card cardVar) {
        String str;
        z7 z7Var;
        z7 z7Var2;
        int i7;
        this.f42141b1 = cardVar;
        this.f42144c1 = T(cardVar);
        if (!this.f42146d1 && this.f42152f1 == 0 && !this.f42169p0) {
            TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
            z7 z7Var3 = null;
            if (nftitem == null) {
                str = null;
            } else {
                str = nftitem.address;
            }
            boolean equals = TextUtils.equals(str, this.P0);
            if (!equals) {
                this.P0 = str;
                this.Q0 = null;
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
            if (this.f42139b) {
                TL_wallet.nftItem nftitem3 = cardVar.bg_nft_item;
                if (nftitem3 != null && nftitem3.gift != null) {
                    z7Var3 = v(nftitem3);
                }
                this.S0 = z7Var3;
                this.T0 = z7Var3;
                this.U0 = 1.0f;
                e();
                f0();
            } else if (!A()) {
                f0();
            } else {
                this.f42149e1 = true;
                ArrayList G = G();
                int size2 = G.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj = G.get(i11);
                    i11++;
                    z7 z7Var4 = (z7) obj;
                    if (z7Var4.K && (i7 = z7Var4.H) != 3 && i7 != 4 && i7 != 5) {
                        TL_wallet.cardSticker R = R(z7Var4.f43435a);
                        if (R != null) {
                            if (!z7Var4.b() || !y(a0(z7Var4)).equals(y(R.coordinates))) {
                                K(z7Var4, R.coordinates, z7Var4.N);
                            }
                        } else if (z7Var4.b()) {
                            E(z7Var4);
                        }
                    }
                }
                ArrayList<TL_wallet.cardSticker> arrayList2 = cardVar.stickers;
                LinkedHashMap linkedHashMap = this.f42150f;
                if (arrayList2 != null) {
                    int size3 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        TL_wallet.cardSticker cardsticker2 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.nftItem nftitem4 = cardsticker2.nft;
                        if (nftitem4 == null) {
                            z7Var2 = null;
                        } else {
                            z7Var2 = (z7) linkedHashMap.get(nftitem4.address);
                        }
                        if (z7Var2 != null && z7Var2.H == 2) {
                            long j3 = this.N0 + 1;
                            this.N0 = j3;
                            z7Var2.I = j3;
                        }
                    }
                }
                if (!equals) {
                    String str2 = this.P0;
                    if (str2 == null) {
                        z7Var = null;
                    } else {
                        z7Var = (z7) linkedHashMap.get(str2);
                    }
                    if (z7Var != null && z7Var.b()) {
                        X(z7Var, false);
                    } else {
                        X(null, true);
                    }
                }
                this.f42149e1 = false;
                O();
                f0();
            }
        }
    }

    public final void d0(z7 z7Var) {
        w5.m0((w5) this.d.f19612b, 2600L);
        if (A()) {
            float[] x10 = x(z7Var, Float.NaN, Float.NaN, true);
            RectF Z = Z(z7Var);
            if (x10 != null && Z != null) {
                z7Var.f43444g.a((f(z7Var) * Z.width()) / U());
                z7Var.f43449m.a(0.0f);
                z7Var.f43446j.a(1.0f);
                float[] fArr = {Z.centerX(), Z.centerY()};
                this.f42176s.mapPoints(fArr);
                I(z7Var, fArr, x10, true);
                performHapticFeedback(3);
                return;
            }
            n7 j3 = j(z7Var);
            if (j3 != null) {
                j3.animate().rotation(3.0f).setDuration(90L).withEndAction(new q7(j3, 0)).start();
            }
        }
    }

    public final void e() {
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2;
        float pow;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4;
        z7 z7Var = this.S0;
        if (z7Var == null) {
            stargiftattributebackdrop = null;
        } else {
            stargiftattributebackdrop = z7Var.f43456t;
        }
        float[] i7 = o7.i(stargiftattributebackdrop);
        z7 z7Var2 = this.T0;
        if (z7Var2 == null) {
            stargiftattributebackdrop2 = null;
        } else {
            stargiftattributebackdrop2 = z7Var2.f43456t;
        }
        float[] i10 = o7.i(stargiftattributebackdrop2);
        float f10 = 1.0f;
        if (this.X0) {
            float f11 = this.U0;
            pow = com.google.android.recaptcha.internal.a.C(f11, 2.0f, 3.0f, f11 * f11);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - this.U0, 4.0d));
        }
        float[] fArr = new float[18];
        float f12 = i7[0];
        float f13 = i7[1];
        float f14 = i7[2];
        float f15 = i10[0];
        float f16 = i10[1];
        float f17 = i10[2];
        float f18 = this.V0;
        float f19 = this.W0;
        if (!this.X0) {
            f10 = 0.0f;
        }
        System.arraycopy(new float[]{f12, f13, f14, f15, f16, f17, f18, f19, pow, f10}, 0, fArr, 0, 10);
        z7 z7Var3 = this.S0;
        if (z7Var3 == null) {
            stargiftattributebackdrop3 = null;
        } else {
            stargiftattributebackdrop3 = z7Var3.f43456t;
        }
        o7.m(fArr, 0, stargiftattributebackdrop3);
        z7 z7Var4 = this.T0;
        if (z7Var4 == null) {
            stargiftattributebackdrop4 = null;
        } else {
            stargiftattributebackdrop4 = z7Var4.f43456t;
        }
        o7.m(fArr, 1, stargiftattributebackdrop4);
        this.f42142c.setStickerStyle(fArr);
    }

    public final float f(z7 z7Var) {
        n7 j3 = j(z7Var);
        if (j3 != null) {
            org.telegram.ui.Components.l9 l9Var = j3.D;
            if (j3.getWidth() > 0 && l9Var.getWidth() > 0) {
                return ((l9Var.getWidth() / j3.getWidth()) * 288.0f) / 268.0f;
            }
            return 0.77f;
        }
        return 0.77f;
    }

    public final void f0() {
        if (!this.f42138a1 && isAttachedToWindow()) {
            v7 v7Var = this.C1;
            removeCallbacks(v7Var);
            postOnAnimation(v7Var);
        }
    }

    public final void g(z7 z7Var) {
        z7Var.H = 0;
        z7Var.J = 0L;
        z7Var.f43444g.a(1.0f);
        z7Var.h.a(1.0f);
        z7Var.f43445i.a(0.0f);
        z7Var.f43449m.a(0.0f);
        z7Var.f43446j.a(0.0f);
        z7Var.f43447k.a(0.0f);
        n7 j3 = j(z7Var);
        if (j3 != null) {
            j3.animate().cancel();
            j3.setScaleX(1.0f);
            j3.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - org.telegram.messenger.g0.L(64.0f)) - org.telegram.messenger.g0.f22558n;
    }

    public final void i(n7 n7Var) {
        float f10;
        ArrayList arrayList = this.h;
        if (!arrayList.contains(n7Var)) {
            arrayList.add(n7Var);
        }
        z7 v = v(n7Var.f42894w0);
        if (v.H == 0) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        n7Var.k(v.R, false, f10);
        f0();
    }

    public final n7 j(z7 z7Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            n7 n7Var = (n7) obj;
            if (n7Var.isAttachedToWindow() && n7Var.f42894w0.address.equals(z7Var.f43435a)) {
                return n7Var;
            }
        }
        return null;
    }

    public final void k() {
        if (!this.f42139b && !this.f42149e1) {
            this.f42146d1 = true;
            s7 s7Var = this.f42154g1;
            org.telegram.messenger.g0.r(s7Var);
            org.telegram.messenger.g0.i3(s7Var, 1500L);
        }
    }

    public final void l() {
        this.Q0 = null;
        this.P0 = null;
        X(null, true);
        O();
        k();
    }

    public final boolean m(z7 z7Var) {
        if (b(z7Var) && F(this.f42136a.getCurrentAccount(), z7Var.f43437b.gift.slug)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f42193y1);
        getViewTreeObserver().addOnPreDrawListener(this.f42195z1);
        for (z7 z7Var : this.f42150f.values()) {
            z7Var.f43439c.P();
            z7Var.d.P();
        }
        f0();
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.f42193y1);
        getViewTreeObserver().removeOnPreDrawListener(this.f42195z1);
        removeCallbacks(this.C1);
        removeCallbacks(this.A1);
        for (z7 z7Var : this.f42150f.values()) {
            z7Var.f43439c.R();
            z7Var.d.R();
        }
        this.M0 = 0L;
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
        z7 z7Var;
        Paint paint;
        ArrayList arrayList;
        RectF rectF;
        a8 a8Var = this;
        Canvas canvas2 = canvas;
        if (a8Var.A()) {
            float f17 = a8Var.N.f43389a;
            int i11 = (f17 > 0.01f ? 1 : (f17 == 0.01f ? 0 : -1));
            RectF rectF2 = a8Var.H;
            ?? r10 = 0;
            Paint paint2 = a8Var.f42191y;
            if (i11 < 0) {
                f11 = 0.0f;
                i7 = 0;
                f10 = 0.4f;
                f12 = 2.0f;
                f13 = 0.6f;
            } else {
                float max = Math.max(0.0f, Math.min(1.2f, a8Var.O.f43389a));
                float l10 = Utilities.l(max);
                f10 = 0.4f;
                Paint paint3 = a8Var.G;
                paint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
                f11 = 0.0f;
                f12 = 2.0f;
                float measureText = (((paint3.measureText(id.M0(2131746321, null)) + org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(56.0f)) * max) + org.telegram.messenger.g0.L(56.0f);
                canvas2.save();
                f13 = 0.6f;
                canvas2.translate(a8Var.getWidth() / 2.0f, ((1.0f - f17) * org.telegram.messenger.g0.L(90.0f)) + a8Var.h());
                float f18 = (f17 * 0.4f) + 0.6f;
                canvas2.scale(f18, f18);
                int i12 = org.telegram.ui.ActionBar.l6.f27865d6;
                org.telegram.ui.ActionBar.f2 f2Var = a8Var.f42136a;
                paint2.setColor(i0.a.f(l10, org.telegram.ui.ActionBar.l6.w0(i12, f2Var.getResourceProvider()), -1750963));
                paint2.setAlpha((int) (Utilities.l(f17) * 255.0f));
                float f19 = (-measureText) / 2.0f;
                float f20 = measureText / 2.0f;
                rectF2.set(f19, -org.telegram.messenger.g0.L(28.0f), f20, org.telegram.messenger.g0.L(28.0f));
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), paint2);
                float L = (f19 + org.telegram.messenger.g0.L(30.0f)) * l10;
                float L2 = org.telegram.messenger.g0.L(21.0f);
                int round = Math.round(a8Var.f42143c0.f43389a);
                ah0 ah0Var = a8Var.f42148e0;
                ah0Var.N(round, false, false);
                float f21 = L - L2;
                i7 = 0;
                float f22 = -L2;
                float f23 = L + L2;
                ah0Var.setBounds((int) f21, (int) f22, (int) f23, (int) L2);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.f(l10, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, f2Var.getResourceProvider()), -1), PorterDuff.Mode.SRC_IN);
                Paint paint4 = a8Var.f42145d0;
                paint4.setColorFilter(porterDuffColorFilter);
                paint4.setAlpha((int) (Utilities.l(f17) * 255.0f));
                canvas2 = canvas;
                int saveLayer = canvas2.saveLayer(f21, f22, f23, L2, paint4);
                ah0Var.draw(canvas2);
                canvas2.restoreToCount(saveLayer);
                if (l10 > 0.02f) {
                    paint3.setColor(-1);
                    paint3.setAlpha((int) (Utilities.l((l10 - 0.4f) / 0.6f) * 255.0f));
                    Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                    canvas2.save();
                    canvas2.clipRect(org.telegram.messenger.g0.L(22.0f) + L, -org.telegram.messenger.g0.L(28.0f), f20 - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(28.0f));
                    canvas2.drawText(id.M0(2131746321, null), L + org.telegram.messenger.g0.L(22.0f), (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f, paint3);
                    canvas2.restore();
                }
                canvas2.restore();
                r10 = 0;
            }
            paint2.setShader(r10);
            paint2.setColorFilter(r10);
            paint2.setAlpha(255);
            ArrayList G = a8Var.G();
            int size = G.size();
            int i13 = i7;
            while (i13 < size) {
                int i14 = i13 + 1;
                z7 z7Var2 = (z7) G.get(i13);
                y7 y7Var = z7Var2.f43442e;
                y7 y7Var2 = z7Var2.f43445i;
                float f24 = y7Var.f43389a;
                float f25 = z7Var2.f43443f.f43389a;
                float U = a8Var.U() * z7Var2.f43444g.f43389a * z7Var2.h.f43389a;
                float f26 = z7Var2.f43446j.f43389a;
                int i15 = z7Var2.H;
                if (i15 == 1 && z7Var2.O && f26 > 0.3f) {
                    float[] L3 = a8Var.L(f24 + z7Var2.f43450n.f43389a, f25 + z7Var2.f43451o.f43389a);
                    float f27 = L3[i7];
                    float f28 = L3[1];
                    U = com.google.android.recaptcha.internal.a.B(f26, 0.15f, 1.0f, U);
                    f14 = f28;
                    f24 = f27;
                } else if (i15 != 3 && i15 != 4 && i15 != 5) {
                    i13 = i14;
                } else {
                    f14 = f25;
                }
                float f29 = U;
                Bitmap a10 = z7Var2.a();
                if (a10 != null) {
                    if (f29 < 1.0f) {
                        i13 = i14;
                    } else {
                        canvas2.save();
                        canvas2.rotate(y7Var2.f43389a, f24, f14);
                        Paint paint5 = paint2;
                        a8Var.t(canvas2, z7Var2, f24, (org.telegram.messenger.g0.L(5.0f) * f26) + org.telegram.messenger.g0.L(1.5f) + f14, com.google.android.recaptcha.internal.a.B(f26, 0.04f, 1.0f, f29), f26, 0.0f, 1.0f);
                        canvas.restore();
                        float l11 = Utilities.l(z7Var2.f43449m.f43389a);
                        if (z7Var2.H == 4 && z7Var2.W > f13 && a8Var.j(z7Var2) != null) {
                            float l12 = Utilities.l((z7Var2.W - f13) / f10);
                            float f30 = (1.0f - ((3.0f - (l12 * f12)) * (l12 * l12))) * 0.45f;
                            float l13 = (1.0f - (Utilities.l(-z7Var2.V) * f13)) * 0.55f;
                            if (l11 < 1.0f) {
                                paint5.setAlpha((int) ((1.0f - l11) * 255.0f));
                                i10 = size;
                                paint = paint5;
                                f16 = f29;
                                arrayList = G;
                                rectF = rectF2;
                                f15 = f14;
                                z7Var = z7Var2;
                                a8Var.r(canvas, z7Var2.v, f24, f15, f16, f30, l13, y7Var2.f43389a, z7Var2.U, z7Var2.V);
                            } else {
                                f15 = f14;
                                i10 = size;
                                f16 = f29;
                                z7Var = z7Var2;
                                paint = paint5;
                                arrayList = G;
                                rectF = rectF2;
                            }
                            if (l11 > f11) {
                                paint.setAlpha((int) (l11 * 255.0f));
                                canvas2 = canvas;
                                r(canvas2, a10, f24, f15, f16, f30, l13, y7Var2.f43389a, z7Var.U, z7Var.V);
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
                            canvas2.rotate(y7Var2.f43389a, f24, f31);
                            float f32 = f29 / f12;
                            rectF3.set(f24 - f32, f31 - f32, f24 + f32, f32 + f31);
                            if (l11 < 1.0f) {
                                paint5.setAlpha((int) ((1.0f - l11) * 255.0f));
                                rect = null;
                                canvas2.drawBitmap(z7Var2.v, (Rect) null, rectF3, paint5);
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
                        a8Var = this;
                    }
                } else {
                    a8Var = this;
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
        org.telegram.messenger.g0.E2(this.f42187w1);
        org.telegram.messenger.g0.E2(this.f42190x1);
        this.f42190x1 = null;
        this.f42187w1 = null;
        O();
        org.telegram.messenger.g0.r(this.f42154g1);
        this.f42155h0 = null;
        this.f42138a1 = true;
        if (this.f42146d1) {
            Q();
        }
        this.f42148e0.C(false);
        removeCallbacks(this.C1);
        removeCallbacks(this.A1);
        removeCallbacks(this.B1);
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        for (z7 z7Var : this.f42150f.values()) {
            z7Var.f43439c.R();
            z7Var.d.R();
        }
        this.h.clear();
    }

    public final void q(org.telegram.ui.Wallet.z7 r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.a8.q(org.telegram.ui.Wallet.z7, float, float):void");
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
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i7 > 14) {
                canvas.drawBitmapMesh(bitmap, 14, 14, this.J, 0, this.K, 0, this.f42191y);
                return;
            }
            int i11 = 0;
            for (int i12 = 14; i11 <= i12; i12 = 14) {
                float f25 = ((i11 / 14.0f) - 0.5f) * f19;
                float f26 = ((i7 / 14.0f) - 0.5f) * f19;
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
                    double d2 = min;
                    float sin2 = (f20 - (f18 * ((float) Math.sin(d2)))) - (((float) Math.cos(d2)) * max);
                    float sin3 = (max * ((float) Math.sin(d2))) + ((1.0f - ((float) Math.cos(d2))) * f18);
                    f33 = (((float) Math.cos(d2)) * 0.38f) + 0.62f;
                    f29 = sin2;
                    f32 = sin3;
                } else {
                    f18 = f21;
                }
                float f34 = f22 / (f22 - f32);
                int i13 = i10 * 2;
                float[] fArr = this.J;
                fArr[i13] = (((f29 * f16) - (f30 * f17)) * f34) + f10;
                fArr[i13 + 1] = ((((f30 * f16) + (f29 * f17)) * f34) + f11) - (f32 * 0.15f);
                int i14 = (int) (255.0f * f33);
                this.K[i10] = Color.rgb(i14, i14, i14);
                i11++;
                f19 = f12;
                i10++;
                f21 = f18;
            }
            i7++;
            f19 = f12;
        }
    }

    public final void s(Canvas canvas, z7 z7Var, float f10, float f11, boolean z9) {
        float f12;
        ImageReceiver imageReceiver = z7Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = z7Var.f43456t;
        Bitmap n10 = imageReceiver.n();
        if (n10 != null && stargiftattributebackdrop != null) {
            canvas.save();
            float f13 = this.Y0;
            float f14 = this.Z0;
            Path path = this.I;
            path.rewind();
            float f15 = 0.15f;
            char c10 = 0;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(0.0f, 0.0f, f13, f14, (f13 * 0.15f) / 2.0f, (f14 * 0.15f) / 1.212122f, direction);
            canvas.clipPath(path);
            this.f42142c.h(path, this.Y0, this.Z0);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            int i7 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i7 >= 0 && !z9) {
                path.rewind();
                path.addCircle(this.V0 * this.Y0, this.W0 * this.Z0, f11, direction);
                canvas.clipPath(path);
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
            Paint paint = this.f42191y;
            paint.setColorFilter(porterDuffColorFilter);
            float f16 = this.Y0 / 336.0f;
            float f17 = this.Z0 / 205.0f;
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
                    float C = f10 * f20 * com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10);
                    if (i7 >= 0) {
                        float l11 = Utilities.l((f11 - Utilities.t(f18, f19, this.V0 * this.Y0, this.W0 * this.Z0)) / org.telegram.messenger.g0.L(120.0f));
                        if (z9) {
                            f21 = com.google.android.recaptcha.internal.a.C(l11, 0.8f, 1.0f, f21);
                            C *= 1.0f - Utilities.l(l11 * 1.6f);
                        } else {
                            f12 = f18;
                            f21 *= (((((float) Math.sin(l11 * 3.141592653589793d)) * 0.28f) + l11) * 0.8f) + 0.2f;
                            C *= Utilities.l(l11 * 1.6f);
                            paint.setAlpha((int) (C * 255.0f));
                            float f23 = f21 / 2.0f;
                            RectF rectF = this.H;
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
                    RectF rectF2 = this.H;
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

    public final void t(Canvas canvas, z7 z7Var, float f10, float f11, float f12, float f13, float f14, float f15) {
        if (f15 > 0.01f && z7Var.f43458w != null) {
            float f16 = (((0.05f * f13) + 1.0f) * ((f12 * 176.0f) / 128.0f)) / 2.0f;
            float f17 = f10 - f16;
            float f18 = f11 - f16;
            float f19 = f10 + f16;
            float f20 = f11 + f16;
            RectF rectF = this.H;
            rectF.set(f17, f18, f19, f20);
            Paint paint = this.f42191y;
            int alpha = paint.getAlpha();
            paint.setColor(-16044452);
            float l10 = Utilities.l(z7Var.f43449m.f43389a);
            paint.setAlpha((int) (l10 * Utilities.l((f14 * 0.12f) + (f13 * (-0.049999997f)) + 0.16f) * 255.0f * f15));
            canvas.drawBitmap(z7Var.f43458w, (Rect) null, rectF, paint);
            paint.setColor(-1);
            paint.setAlpha(alpha);
        }
    }

    public final z7 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f42150f;
        z7 z7Var = (z7) linkedHashMap.get(str);
        if (z7Var == null) {
            z7Var = new z7(this, nftitem);
            linkedHashMap.put(nftitem.address, z7Var);
        }
        z7Var.f43437b = nftitem;
        return z7Var;
    }

    public final void w(float r19, float r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.a8.w(float, float, boolean):void");
    }

    public final float[] x(z7 z7Var, float f10, float f11, boolean z9) {
        float f12;
        float f13;
        float f14;
        ArrayList arrayList;
        float nextFloat;
        if (!z9) {
            z7Var.N = false;
            return new float[]{f10, f11, z7Var.h.f43390b};
        }
        ArrayList<RectF> stickerObstacles = this.f42142c.getStickerObstacles();
        float f15 = this.Y0 * 0.012f;
        int size = stickerObstacles.size();
        int i7 = 0;
        while (i7 < size) {
            RectF rectF = stickerObstacles.get(i7);
            i7++;
            float f16 = -f15;
            rectF.inset(f16, f16);
        }
        stickerObstacles.get(2).left -= this.Y0 * 0.035f;
        float L = org.telegram.messenger.g0.L(32.0f) / U();
        float f17 = z7Var.h.f43390b;
        z7Var.N = false;
        ArrayList arrayList2 = new ArrayList();
        for (z7 z7Var2 : this.f42150f.values()) {
            if (z7Var2 != z7Var && z7Var2.b()) {
                arrayList2.add(z7Var2);
            }
        }
        boolean z10 = (Float.isNaN(f10) || Float.isNaN(f11)) ? false : true;
        if (z10 || z7Var != this.f42162k1 || this.f42164m1 == null || !arrayList2.isEmpty()) {
            if (z10) {
                f12 = f10;
                f13 = f11;
            } else {
                f12 = this.Y0 * 0.6f;
                f13 = this.Z0 * 0.68f;
            }
            Random random = new Random((System.nanoTime() / 400000000) + (arrayList2.size() * 31) + (z7Var.f43435a.hashCode() * 7919));
            float nextFloat2 = (random.nextFloat() * 0.04f) + 0.05f;
            float f18 = 0.5f;
            float nextFloat3 = (((random.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.Y0;
            float nextFloat4 = this.Z0 * (((random.nextFloat() - 0.5f) * 0.08f) + 0.55f);
            float U = U() * L * 0.5f;
            float f19 = -3.4028235E38f;
            float[] fArr = null;
            float f20 = U;
            while (f20 <= this.Z0 - U) {
                float f21 = f18;
                float f22 = U;
                while (true) {
                    float f23 = this.Y0;
                    if (f22 <= f23 - U) {
                        float min = Math.min(Math.min(f22, f23 - f22), Math.min(f20, this.Z0 - f20));
                        float f24 = nextFloat2;
                        float min2 = Math.min(Math.max(0.74f, 1.0f - (arrayList2.size() * nextFloat2)) * f17, min / (U() * f21));
                        int size2 = stickerObstacles.size();
                        float f25 = L;
                        float f26 = f17;
                        int i10 = 0;
                        float f27 = Float.MAX_VALUE;
                        while (i10 < size2) {
                            ArrayList<RectF> arrayList3 = stickerObstacles;
                            RectF rectF2 = stickerObstacles.get(i10);
                            f27 = Math.min(f27, Utilities.t(f22, f20, Math.max(rectF2.left, Math.min(rectF2.right, f22)), Math.max(rectF2.top, Math.min(rectF2.bottom, f20))));
                            i10++;
                            stickerObstacles = arrayList3;
                            z10 = z10;
                        }
                        ArrayList<RectF> arrayList4 = stickerObstacles;
                        boolean z11 = z10;
                        float min3 = Math.min(min2, f27 / (U() * 0.44f));
                        int i11 = 0;
                        for (int size3 = arrayList2.size(); i11 < size3; size3 = size3) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            z7 z7Var3 = (z7) obj;
                            min3 = Math.min(min3, (Utilities.t(f22, f20, z7Var3.f43442e.f43390b, z7Var3.f43443f.f43390b) / (U() * 0.29f)) - z7Var3.h.f43390b);
                        }
                        float l10 = ((Utilities.l((min - ((U() * f21) * min3)) / org.telegram.messenger.g0.L(14.0f)) * 0.1f) + 0.9f) * min3;
                        if (l10 < f25) {
                            arrayList = arrayList2;
                        } else {
                            if (arrayList2.isEmpty()) {
                                float f28 = this.Y0 * 0.6f;
                                float z12 = com.google.android.recaptcha.internal.a.z(f12, f28, 0.2f, f28);
                                float f29 = this.Z0 * 0.68f;
                                nextFloat = (random.nextFloat() * org.telegram.messenger.g0.L(5.0f)) + (U() * 1.1f * l10) + (Utilities.t(f22, f20, z12, com.google.android.recaptcha.internal.a.z(f13, f29, 0.2f, f29)) * (-0.45f));
                                f14 = l10;
                                arrayList = arrayList2;
                            } else {
                                float f30 = f20 * l10 * l10;
                                float f31 = l10 * l10;
                                int size4 = arrayList2.size();
                                float f32 = f22 * l10 * l10;
                                int i12 = 0;
                                float f33 = Float.MAX_VALUE;
                                float f34 = 0.0f;
                                while (i12 < size4) {
                                    Object obj2 = arrayList2.get(i12);
                                    int i13 = i12 + 1;
                                    z7 z7Var4 = (z7) obj2;
                                    float f35 = l10;
                                    y7 y7Var = z7Var4.f43442e;
                                    int i14 = size4;
                                    y7 y7Var2 = z7Var4.h;
                                    ArrayList arrayList5 = arrayList2;
                                    y7 y7Var3 = z7Var4.f43443f;
                                    f33 = Math.min(f33, Utilities.t(f22, f20, y7Var.f43390b, y7Var3.f43390b) - ((y7Var2.f43390b + f35) * (U() * 0.4f)));
                                    float f36 = y7Var2.f43390b;
                                    float f37 = f36 * f36;
                                    float f38 = z7Var4.f43442e.f43390b;
                                    f32 = (f38 * f37) + f32;
                                    f30 = (y7Var3.f43390b * f37) + f30;
                                    f31 += f37;
                                    f34 = Math.max(0.0f, 1.0f - (Math.abs(y7Var3.f43390b - f20) / (U() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f38 - f22) / (U() * 0.12f))) + f34;
                                    l10 = f35;
                                    i12 = i13;
                                    size4 = i14;
                                    arrayList2 = arrayList5;
                                }
                                f14 = l10;
                                arrayList = arrayList2;
                                nextFloat = ((random.nextFloat() * org.telegram.messenger.g0.L(10.0f)) + (((((Math.min(Math.min(min, f27), U()) * 0.2f) + ((U() * (f14 * 0.9f)) + ((f33 < 0.0f ? f33 * 2.5f : Math.min(f33, U() * 0.3f)) * 1.2f))) - (Utilities.t(f32 / f31, f30 / f31, nextFloat3, nextFloat4) * 0.35f)) - ((U() * f34) * 0.08f)) - (Utilities.t(f22, f20, this.Y0 * f21, this.Z0 * 0.55f) * 0.04f))) - (z11 ? Utilities.t(f22, f20, f12, f13) * 0.04f : 0.0f);
                            }
                            if (nextFloat > f19) {
                                f19 = nextFloat;
                                fArr = new float[]{f22, f20, f14};
                                f22 += org.telegram.messenger.g0.L(5.0f);
                                nextFloat2 = f24;
                                L = f25;
                                f17 = f26;
                                stickerObstacles = arrayList4;
                                z10 = z11;
                                arrayList2 = arrayList;
                            }
                        }
                        f22 += org.telegram.messenger.g0.L(5.0f);
                        nextFloat2 = f24;
                        L = f25;
                        f17 = f26;
                        stickerObstacles = arrayList4;
                        z10 = z11;
                        arrayList2 = arrayList;
                    }
                }
                f20 += org.telegram.messenger.g0.L(5.0f);
                f18 = f21;
                nextFloat2 = nextFloat2;
            }
            return fArr;
        }
        return (float[]) this.f42164m1.clone();
    }

    public final boolean z(n7 n7Var) {
        if (n7Var.isShown()) {
            Rect rect = this.F1;
            if (n7Var.getGlobalVisibleRect(rect) && rect.width() >= n7Var.getWidth() - 1 && rect.height() >= n7Var.getHeight() - 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
