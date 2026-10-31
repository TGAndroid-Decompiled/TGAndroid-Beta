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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.uk;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ng;
public final class h8 extends View {
    public static final int G1 = 0;
    public float A0;
    public final z7 A1;
    public float B0;
    public final z7 B1;
    public float C0;
    public final c8 C1;
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
    public final b8 L;
    public boolean L0;
    public final a8 M;
    public long M0;
    public final f8 N;
    public long N0;
    public final f8 O;
    public VelocityTracker O0;
    public final f8 P;
    public String P0;
    public final f8 Q;
    public String Q0;
    public final f8 R;
    public long R0;
    public final ArrayList S;
    public g8 S0;
    public final Path T;
    public g8 T0;
    public final Paint U;
    public float U0;
    public final LinearGradient V;
    public float V0;
    public final Matrix W;
    public float W0;
    public boolean X0;
    public float Y0;
    public float Z0;
    public final org.telegram.ui.ActionBar.k2 f34626a;
    public float f34627a0;
    public boolean f34628a1;
    public final boolean f34629b;
    public float f34630b0;
    public TL_wallet.card f34631b1;
    public final l6 f34632c;
    public final f8 f34633c0;
    public String f34634c1;
    public final m4.c d;
    public final Paint f34635d0;
    public boolean f34636d1;
    public final SharedPreferences e;
    public final bi0 f34637e0;
    public boolean f34638e1;
    public final LinkedHashMap f34639f;
    public boolean f34640f0;
    public int f34641f1;
    public g8 f34642g0;
    public final z7 f34643g1;
    public final ArrayList h;
    public g8 f34644h0;
    public boolean f34645h1;
    public boolean f34646i0;
    public boolean f34647i1;
    public final Paint f34648j0;
    public boolean f34649j1;
    public final Paint f34650k0;
    public g8 f34651k1;
    public final Paint f34652l0;
    public u7 l1;
    public boolean m0;
    public float[] f34653m1;
    public final ArrayList f34654n;
    public boolean f34655n0;
    public float f34656n1;
    public boolean f34657o0;
    public final float[] f34658o1;
    public boolean f34659p0;
    public final f8 f34660p1;
    public boolean f34661q0;
    public final f8 f34662q1;
    public final Matrix f34663r;
    public boolean f34664r0;
    public final Paint f34665r1;
    public final Matrix f34666s;
    public boolean f34667s0;
    public final Paint f34668s1;
    public boolean f34669t0;
    public final Matrix f34670t1;
    public boolean f34671u0;
    public final Path f34672u1;
    public int f34673v0;
    public final RectF f34674v1;
    public final Matrix f34675w;
    public float f34676w0;
    public vh.p2 f34677w1;
    public final Matrix f34678x;
    public float f34679x0;
    public vh.p2 f34680x1;
    public final Paint f34681y;
    public float f34682y0;
    public final k1 f34683y1;
    public float f34684z0;
    public final n5 f34685z1;

    public h8(org.telegram.ui.ActionBar.k2 k2Var, l6 l6Var, m4.c cVar, TL_wallet.card cardVar) {
        super(k2Var.getContext());
        boolean z10;
        SharedPreferences sharedPreferences;
        boolean z11;
        this.f34639f = new LinkedHashMap();
        this.h = new ArrayList();
        this.f34654n = new ArrayList();
        this.f34663r = new Matrix();
        this.f34666s = new Matrix();
        this.f34675w = new Matrix();
        this.f34678x = new Matrix();
        this.f34681y = new Paint(3);
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
        this.N = new f8(0.0f, 260.0f, 0.78f);
        this.O = new f8(0.0f, 420.0f, 0.72f);
        this.P = new f8(1.0f, 420.0f, 0.38f);
        this.Q = new f8(0.0f, 170.0f, 0.42f);
        this.R = new f8(0.0f, 170.0f, 0.42f);
        this.S = new ArrayList();
        this.T = new Path();
        Paint paint3 = new Paint(1);
        this.U = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.V = linearGradient;
        this.W = new Matrix();
        this.f34633c0 = new f8(0.0f, 120.0f, 1.0f);
        this.f34635d0 = new Paint(1);
        this.f34648j0 = new Paint(1);
        this.f34650k0 = new Paint(1);
        this.f34652l0 = new Paint(1);
        this.U0 = 1.0f;
        this.V0 = 0.5f;
        this.W0 = 0.5f;
        this.f34643g1 = new z7(this, 1);
        this.f34658o1 = new float[3];
        this.f34660p1 = new f8(0.0f, 260.0f, 1.0f);
        this.f34662q1 = new f8(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.f34665r1 = paint4;
        Paint paint5 = new Paint(1);
        this.f34668s1 = paint5;
        this.f34670t1 = new Matrix();
        this.f34672u1 = new Path();
        this.f34674v1 = new RectF();
        this.f34683y1 = new k1(this, 1);
        this.f34685z1 = new n5(2, this);
        this.A1 = new z7(this, 2);
        this.B1 = new z7(this, 3);
        this.C1 = new c8(this);
        this.D1 = new RectF();
        Paint paint6 = new Paint(1);
        this.E1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.F1 = new Rect();
        this.f34626a = k2Var;
        if (cardVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34629b = z10;
        bi0 bi0Var = new bi0(2131624355, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f), true, null);
        this.f34637e0 = bi0Var;
        bi0Var.R(this);
        this.f34632c = l6Var;
        this.d = cVar;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z10) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + k2Var.getCurrentAccount() + "_" + k0.x(k2Var.getCurrentAccount()).t(), 0);
        }
        this.e = sharedPreferences;
        this.P0 = z10 ? null : sharedPreferences.getString("style", null);
        if (!z10 && !vp.d1().getBoolean("walletcardstickerhint", false)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f34645h1 = z11;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint4.setStrokeCap(cap);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(-1);
        setImportantForAccessibility(2);
        setTranslationZ(org.telegram.messenger.i0.L(24.0f));
        paint.setStyle(style);
        paint.setStrokeCap(cap);
        paint2.setTypeface(org.telegram.messenger.i0.o());
        a8 a8Var = new a8(this, getContext());
        this.M = a8Var;
        b8 b8Var = new b8(this, getContext());
        this.L = b8Var;
        a8Var.setTag(g6.f34551n0);
        l6Var.getFrontFace().addView(a8Var, 0, w7.b6.c(-1.0f, -1));
        l6Var.getFrontFace().addView(b8Var, l6Var.getStickerLayerIndex(), w7.b6.c(-1.0f, -1));
        if (z10) {
            b8Var.addOnLayoutChangeListener(new w7(this, 0));
            d(cardVar);
            return;
        }
        int currentAccount = k2Var.getCurrentAccount();
        vp r12 = vp.r1(currentAccount);
        long e = d20.i(currentAccount).e();
        TLRPC.UserFull a2 = r12.a2(e);
        if (a2 != null) {
            TL_wallet.card cardVar2 = a2.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
            return;
        }
        r12.U2(r12.Z1(Long.valueOf(e)), 0, true, new k(this, 4));
    }

    public static boolean F(int i10, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(45);
            HashSet hashSet = ((org.telegram.messenger.r0) vp.r1(i10).f18957y7.m0.f10700a).f17673c;
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

    public static Path H(g8 g8Var) {
        Bitmap bitmap;
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        if (g8Var != null && g8Var.F == null && (bitmap = g8Var.f34597u) != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
            int[] iArr = new int[16384];
            createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
            if (createScaledBitmap != g8Var.f34597u) {
                createScaledBitmap.recycle();
            }
            boolean[] zArr = new boolean[16384];
            int i13 = -1;
            for (int i14 = 0; i14 < 16384; i14++) {
                if ((iArr[i14] >>> 24) >= 110) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zArr[i14] = z11;
                if (i13 < 0 && z11) {
                    i13 = i14;
                }
            }
            if (i13 >= 0) {
                int i15 = 8;
                int[] iArr2 = {-1, -1, 0, 1, 1, 1, 0, -1};
                int[] iArr3 = {0, -1, -1, -1, 0, 1, 1, 1};
                int i16 = i13 % 128;
                int i17 = i13 / 128;
                int i18 = i16 - 1;
                float[] fArr = new float[512];
                int i19 = i17;
                int i20 = i19;
                int i21 = i16;
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    if (i22 < 20000) {
                        int i24 = i23 * 2;
                        i10 = 0;
                        if (i24 + 2 > fArr.length) {
                            fArr = Arrays.copyOf(fArr, fArr.length * 2);
                        }
                        fArr[i24] = i21 + 0.5f;
                        fArr[i24 + 1] = i19 + 0.5f;
                        i23++;
                        int i25 = 0;
                        while (i25 < i15 && (iArr2[i25] != i18 - i21 || iArr3[i25] != i20 - i19)) {
                            i25++;
                        }
                        int i26 = 1;
                        while (true) {
                            if (i26 <= i15) {
                                int i27 = (i25 + i26) % i15;
                                i11 = i15;
                                int i28 = i21 + iArr2[i27];
                                int i29 = i25;
                                int i30 = i19 + iArr3[i27];
                                if (i28 >= 0 && i30 >= 0) {
                                    i12 = i26;
                                    if (i28 < 128 && i30 < 128 && zArr[(i30 * 128) + i28]) {
                                        int i31 = (i27 + 7) % 8;
                                        int i32 = i21 + iArr2[i31];
                                        i20 = i19 + iArr3[i31];
                                        i19 = i30;
                                        i18 = i32;
                                        i21 = i28;
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    i12 = i26;
                                }
                                i26 = i12 + 1;
                                i15 = i11;
                                i25 = i29;
                            } else {
                                i11 = i15;
                                z10 = false;
                                break;
                            }
                        }
                        if (!z10 || (i21 == i16 && i19 == i17)) {
                            break;
                        }
                        i22++;
                        i15 = i11;
                    } else {
                        i10 = 0;
                        break;
                    }
                }
                int i33 = (i23 + 1) / 2;
                if (i33 >= 3) {
                    float[] fArr2 = new float[i33 * 2];
                    for (int i34 = i10; i34 < i23; i34 += 2) {
                        float f7 = 0.0f;
                        float f10 = 0.0f;
                        for (int i35 = -3; i35 <= 3; i35++) {
                            int i36 = ((((i34 + i35) % i23) + i23) % i23) * 2;
                            f7 += fArr[i36];
                            f10 += fArr[i36 + 1];
                        }
                        fArr2[i34] = ((f7 / 7.0f) / 128.0f) - 0.5f;
                        fArr2[i34 + 1] = ((f10 / 7.0f) / 128.0f) - 0.5f;
                    }
                    Path path = new Path();
                    path.moveTo((fArr2[i10] + fArr2[2]) / 2.0f, (fArr2[1] + fArr2[3]) / 2.0f);
                    int i37 = 1;
                    while (i37 <= i33) {
                        int i38 = i37 % i33;
                        i37++;
                        int i39 = i38 * 2;
                        float f11 = fArr2[i39];
                        float f12 = fArr2[i39 + 1];
                        int i40 = (i37 % i33) * 2;
                        path.quadTo(f11, f12, (fArr2[i40] + f11) / 2.0f, (fArr2[i40 + 1] + f12) / 2.0f);
                    }
                    path.close();
                    g8Var.F = path;
                    return path;
                }
                return null;
            }
            return null;
        } else if (g8Var == null) {
            return null;
        } else {
            return g8Var.F;
        }
    }

    public static void J(vh.p2 p2Var, float f7, float f10) {
        o(p2Var, 3);
        p2Var.m(0.0f, f7 - p2Var.getPaddingLeft());
        p2Var.setTranslationY(f10 - p2Var.getLayoutParams().height);
        p2Var.invalidate();
    }

    public static double N(float f7) {
        return Math.round(f7 * 100.0f) / 100.0d;
    }

    public static String T(TL_wallet.card cardVar) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        ArrayList<TL_wallet.cardSticker> arrayList = cardVar.stickers;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i10);
                i10++;
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

    public static boolean b(g8 g8Var) {
        TL_wallet.nftItem nftitem;
        if (g8Var != null && (nftitem = g8Var.f34578b) != null && nftitem.gift != null) {
            return true;
        }
        return false;
    }

    public static float c(float f7) {
        float f10 = f7 % 360.0f;
        if (f10 > 180.0f) {
            f10 -= 360.0f;
        }
        if (f10 < -180.0f) {
            return f10 + 360.0f;
        }
        return f10;
    }

    public static void e0(int i10, TL_wallet.card cardVar) {
        TLRPC.UserFull a2 = vp.r1(i10).a2(d20.i(i10).e());
        if (a2 == null) {
            return;
        }
        a2.wallet_card = cardVar;
        hs.a0(i10).j2(a2, false);
    }

    public static float n(RectF rectF, RectF rectF2) {
        float min = Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left);
        float min2 = Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top);
        if (min <= 0.0f || min2 <= 0.0f || rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return 0.0f;
        }
        return Utilities.l(((min * min2) / (rectF2.height() * rectF2.width())) * 4.0f);
    }

    public static void o(vh.p2 p2Var, int i10) {
        if ((p2Var.getTag() instanceof Integer) && ((Integer) p2Var.getTag()).intValue() == i10) {
            return;
        }
        p2Var.setTag(Integer.valueOf(i10));
        p2Var.f51725a = i10;
        p2Var.m(1.0f, 0.0f);
    }

    public static float u(float f7, float f10, float f11) {
        float l4 = Utilities.l((f7 - f10) / (f11 - f10));
        return c3.i0.D(l4, 2.0f, 3.0f, l4 * l4);
    }

    public static String y(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        if (mediaAreaCoordinates == null) {
            return "";
        }
        return String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.f20028x), Double.valueOf(mediaAreaCoordinates.f20029y), Double.valueOf(mediaAreaCoordinates.f20027w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public final boolean A() {
        l6 l6Var = this.f34632c;
        this.Y0 = l6Var.getFrontFace().getWidth();
        float height = l6Var.getFrontFace().getHeight();
        this.Z0 = height;
        if (this.Y0 > 0.0f && height > 0.0f) {
            Matrix matrix = this.f34663r;
            if (l6Var.g(this, matrix) && matrix.invert(this.f34666s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final vh.p2 B(int i10, boolean z10) {
        float f7;
        vh.p2 p2Var = new vh.p2(getContext(), 3);
        p2Var.p(true);
        if (z10) {
            f7 = 15.0f;
        } else {
            f7 = 11.0f;
        }
        p2Var.k(11.0f, 6.0f, f7, 7.0f);
        p2Var.i(z10);
        p2Var.K = Layout.Alignment.ALIGN_NORMAL;
        p2Var.q(12.0f);
        p2Var.d = -1L;
        String L0 = cd.L0(i10, null);
        p2Var.h = vh.p2.a(L0, p2Var.getTextPaint());
        p2Var.s(L0);
        p2Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        p2Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(p2Var, w7.b6.e(-1, 150, 48));
        return p2Var;
    }

    public final boolean C() {
        Path H;
        if (this.f34653m1 == null) {
            H = null;
        } else {
            H = H(this.f34651k1);
        }
        if (H == null) {
            return false;
        }
        float U = U() * this.f34653m1[2];
        Matrix matrix = this.f34670t1;
        matrix.setScale(U, U);
        float[] fArr = this.f34653m1;
        matrix.postTranslate(fArr[0], fArr[1]);
        H.transform(matrix, this.f34672u1);
        return true;
    }

    public final float[] D(float f7) {
        float[] fArr = this.f34658o1;
        fArr[0] = (u(f7, 0.45f, 0.82f) - u(f7, 1.3f, 1.72f)) * 0.9f;
        fArr[1] = (((float) Math.sin(Utilities.l((f7 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f7, 0.6f, 0.92f) - u(f7, 1.18f, 1.46f));
        fArr[2] = u(f7, 1.58f, 1.7f) - u(f7, 1.7f, 1.92f);
        return fArr;
    }

    public final void E(g8 g8Var) {
        float f7;
        float f10;
        float f11;
        float f12;
        g8Var.J = 0L;
        f8 f8Var = g8Var.h;
        f8 f8Var2 = g8Var.f34583f;
        f8 f8Var3 = g8Var.e;
        if (g8Var.f34576a.equals(this.P0)) {
            l();
        }
        if (g8Var.b()) {
            float[] L = L(f8Var3.f34508a, f8Var2.f34508a);
            f8Var3.a(L[0]);
            f8Var2.a(L[1]);
        }
        g8Var.H = 4;
        g8Var.W = 0.0f;
        g8Var.X = f8Var3.f34508a;
        g8Var.Y = f8Var2.f34508a;
        g8Var.Z = g8Var.f34584g.f34508a * f8Var.f34508a;
        g8Var.f34577a0 = g8Var.f34585i.f34508a;
        if (this.f34676w0 > org.telegram.messenger.i0.L(650.0f)) {
            f7 = 0.32f;
        } else {
            f7 = 0.44f;
        }
        g8Var.f34579b0 = f7;
        this.f34676w0 = 0.0f;
        u7 j10 = j(g8Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.o();
        }
        if (j10 != null) {
            f10 = j10.getScaleX();
        } else {
            f10 = 1.0f;
        }
        g8Var.f34581c0 = f10;
        RectF Z = Z(g8Var);
        if (Z != null) {
            float centerX = Z.centerX() - g8Var.X;
            float centerY = Z.centerY() - g8Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            if (hypot > org.telegram.messenger.i0.L(6.0f)) {
                f11 = centerX / hypot;
            } else {
                f11 = 0.0f;
            }
            g8Var.U = f11;
            if (hypot > org.telegram.messenger.i0.L(6.0f)) {
                f12 = centerY / hypot;
            } else {
                f12 = 1.0f;
            }
            g8Var.V = f12;
        }
        g8Var.f34588l.a(0.0f);
        f8Var.a(1.0f);
        long j11 = this.N0 + 1;
        this.N0 = j11;
        g8Var.I = j11;
        O();
        f0();
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList(this.f34639f.values());
        List.EL.sort(arrayList, Comparator$CC.comparingLong(new uk(5)));
        return arrayList;
    }

    public final void I(g8 g8Var, float[] fArr, float[] fArr2, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        long j10 = g8Var.J;
        f8 f8Var = g8Var.f34591o;
        f8 f8Var2 = g8Var.f34590n;
        if (j10 == 0) {
            long j11 = this.R0 + 1;
            this.R0 = j11;
            g8Var.J = j11;
            ArrayList arrayList = new ArrayList();
            for (g8 g8Var2 : this.f34639f.values()) {
                if (g8Var2 != g8Var && g8Var2.b()) {
                    arrayList.add(g8Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.EL.sort(arrayList, Comparator$CC.comparingLong(new uk(6)));
                for (int i10 = 0; i10 <= arrayList.size() - 10; i10++) {
                    g8 g8Var3 = (g8) arrayList.get(i10);
                    if (this.d.L()) {
                        E(g8Var3);
                    } else {
                        V(g8Var3);
                    }
                }
                k();
            }
        }
        g8Var.H = 1;
        g8Var.Q = false;
        g8Var.M = false;
        g8Var.L = false;
        g8Var.P = z10;
        g8Var.O = z10;
        long j12 = this.N0 + 1;
        this.N0 = j12;
        g8Var.I = j12;
        f8Var2.a(0.0f);
        f8Var.a(0.0f);
        f8 f8Var3 = g8Var.e;
        float f13 = 500.0f;
        float f14 = 150.0f;
        if (z10) {
            f7 = 150.0f;
        } else {
            f7 = 500.0f;
        }
        float f15 = 0.82f;
        float f16 = 1.0f;
        if (z10) {
            f10 = 0.82f;
        } else {
            f10 = 1.0f;
        }
        f8Var3.d = f7;
        f8Var3.e = f10;
        f8Var3.a(fArr[0]);
        f8Var3.f34509b = fArr2[0];
        f8 f8Var4 = g8Var.f34583f;
        if (z10) {
            f13 = 150.0f;
        }
        if (!z10) {
            f15 = 1.0f;
        }
        f8Var4.d = f13;
        f8Var4.e = f15;
        f8Var4.a(fArr[1]);
        float f17 = fArr2[1];
        f8Var4.f34509b = f17;
        g8Var.h.f34509b = fArr2[2];
        f8 f8Var5 = g8Var.f34584g;
        f8Var5.d = 300.0f;
        f8Var5.e = 0.5f;
        f8Var5.f34509b = 1.0f;
        f8 f8Var6 = g8Var.f34586j;
        if (z10) {
            f14 = 110.0f;
        }
        f8Var6.d = f14;
        f8Var6.e = 0.9f;
        f8Var6.f34509b = 0.0f;
        g8Var.f34589m.f34509b = 1.0f;
        g8Var.f34588l.f34509b = 0.0f;
        float f18 = fArr2[0] - fArr[0];
        float f19 = f17 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f18, f19));
        if (max > org.telegram.messenger.i0.L(6.0f)) {
            f11 = f18 / max;
        } else {
            f11 = 0.0f;
        }
        g8Var.U = f11;
        if (max > org.telegram.messenger.i0.L(6.0f)) {
            f12 = f19 / max;
        } else {
            f12 = 1.0f;
        }
        g8Var.V = f12;
        f8 f8Var7 = g8Var.f34587k;
        f8Var7.a(0.9f);
        f8Var7.f34509b = 0.0f;
        if (z10) {
            float min = Math.min(org.telegram.messenger.i0.L(110.0f), 0.32f * max);
            if (f18 >= 0.0f) {
                f16 = -1.0f;
            }
            f8Var2.a(0.0f);
            f8Var2.f34510c = ((-f19) / max) * min * f16 * 20.0f;
            f8Var.a(0.0f);
            f8Var.f34510c = c3.i0.D(min, 0.5f, (f18 / max) * min * f16, 20.0f);
        }
        O();
        f0();
    }

    public final void K(g8 g8Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z10) {
        g8Var.h.a((float) (mediaAreaCoordinates.f20027w / 23.100000381469727d));
        g8Var.f34585i.a(c((float) mediaAreaCoordinates.rotation));
        g8Var.N = z10;
        g8Var.e.a((((float) mediaAreaCoordinates.f20028x) / 100.0f) * this.Y0);
        g8Var.f34583f.a((((float) mediaAreaCoordinates.f20029y) / 100.0f) * this.Z0);
        g8Var.f34584g.a(1.0f);
        g8Var.f34586j.a(0.0f);
        g8Var.f34587k.a(0.0f);
        g8Var.f34590n.a(0.0f);
        g8Var.f34591o.a(0.0f);
        g8Var.f34588l.a(0.0f);
        g8Var.H = 2;
        long j10 = this.N0 + 1;
        this.N0 = j10;
        g8Var.I = j10;
        g8Var.f34589m.a(1.0f);
        if (g8Var.J == 0) {
            long j11 = this.R0 + 1;
            this.R0 = j11;
            g8Var.J = j11;
        }
        if (g8Var.f34576a.equals(this.P0)) {
            this.T0 = g8Var;
            this.S0 = g8Var;
            this.U0 = 1.0f;
            e();
        }
    }

    public final float[] L(float f7, float f10) {
        float[] fArr = {f7, f10};
        this.f34663r.mapPoints(fArr);
        return fArr;
    }

    public final void M(g8 g8Var, float f7, float f10) {
        float z10;
        f8 f8Var = g8Var.e;
        f8 f8Var2 = g8Var.h;
        float[] L = L(f8Var.f34508a, g8Var.f34583f.f34508a);
        boolean z11 = false;
        float t10 = Utilities.t(f7, f10, L[0], L[1]);
        if (Float.isNaN(this.E0)) {
            this.E0 = t10;
            this.F0 = f8Var2.f34509b;
        }
        if (Math.abs(t10 - this.E0) > org.telegram.messenger.i0.L(5.0f)) {
            f8 f8Var3 = g8Var.f34593q;
            f8Var3.d = 700.0f;
            f8Var3.e = 1.0f;
            f8Var3.f34509b = 1.0f;
        }
        float L2 = org.telegram.messenger.i0.L(32.0f) / U();
        if (this.f34646i0) {
            z10 = (this.F0 * t10) / Math.max(1.0f, this.E0);
        } else {
            z10 = c3.i0.z(1.21f, L2, (t10 - this.E0) / org.telegram.messenger.i0.L(110.0f), this.F0);
        }
        f8Var2.d = 900.0f;
        f8Var2.e = 1.0f;
        f8Var2.f34509b = Math.max(L2, Math.min(1.21f, z10));
        if (t10 < org.telegram.messenger.i0.L(14.0f)) {
            this.B0 = Float.NaN;
            return;
        }
        float degrees = (float) Math.toDegrees(Math.atan2(f10 - L[1], f7 - L[0]));
        if (!Float.isNaN(this.B0)) {
            this.C0 = c(degrees - this.B0) + this.C0;
        }
        this.B0 = degrees;
        float f11 = this.D0 + this.C0;
        float round = Math.round(f11 / 90.0f) * 90;
        if (Math.abs(f11 - round) < 5.0f) {
            z11 = true;
        }
        if (z11 && !this.L0) {
            performHapticFeedback(4);
        }
        this.L0 = z11;
        f8 f8Var4 = g8Var.f34585i;
        f8Var4.d = 900.0f;
        f8Var4.e = 0.95f;
        if (z11) {
            f11 = round;
        }
        f8Var4.f34509b = f11;
    }

    public final void O() {
        if (!this.f34629b && this.Y0 > 0.0f && this.Z0 > 0.0f) {
            SharedPreferences.Editor edit = this.e.edit();
            for (g8 g8Var : this.f34639f.values()) {
                boolean b10 = g8Var.b();
                String str = g8Var.f34576a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", g8Var.e.f34509b / this.Y0);
                        jSONObject.put("y", g8Var.f34583f.f34509b / this.Z0);
                        jSONObject.put("r", g8Var.f34585i.f34509b);
                        jSONObject.put("s", g8Var.h.f34509b);
                        jSONObject.put("q", g8Var.N);
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

    public final float P(g8 g8Var) {
        return (((1.0f - (g8Var.f34593q.f34508a * 0.9f)) * g8Var.f34588l.f34508a * 0.04f) + 1.0f) * U() * g8Var.f34584g.f34508a * g8Var.h.f34508a;
    }

    public final void Q() {
        if (!this.f34636d1 || this.f34641f1 != 0) {
            return;
        }
        if (!this.f34628a1 && (this.f34659p0 || !A())) {
            org.telegram.messenger.i0.h3(this.f34643g1, 1000L);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList G = G();
        int size = G.size();
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (i11 < size) {
            Object obj = G.get(i11);
            i11++;
            g8 g8Var = (g8) obj;
            boolean b10 = g8Var.b();
            String str2 = g8Var.f34576a;
            if (b10) {
                sb2.append(str2);
                sb2.append(':');
                sb2.append(y(a0(g8Var)));
                sb2.append(';');
                if (str2.equals(this.P0) && m(g8Var)) {
                    str = str2;
                }
            }
        }
        if (a1.g.r(sb2, "bg:", str).equals(this.f34634c1)) {
            this.f34636d1 = false;
            return;
        }
        TL_wallet.setCardStickers setcardstickers = new TL_wallet.setCardStickers();
        ArrayList G2 = G();
        int size2 = G2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = G2.get(i12);
            i12++;
            g8 g8Var2 = (g8) obj2;
            boolean b11 = g8Var2.b();
            String str3 = g8Var2.f34576a;
            if (b11) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                inputwalletcardsticker.nft_address = str3;
                inputwalletcardsticker.coordinates = a0(g8Var2);
                setcardstickers.stickers.add(inputwalletcardsticker);
                if (str3.equals(this.P0) && m(g8Var2)) {
                    setcardstickers.bg_nft_address = str3;
                }
            }
        }
        this.f34636d1 = false;
        int currentAccount = this.f34626a.getCurrentAccount();
        TL_wallet.card cardVar = this.f34631b1;
        TL_wallet.card cardVar2 = new TL_wallet.card();
        TL_wallet.card cardVar3 = this.f34631b1;
        if (cardVar3 != null) {
            cardVar2.address = cardVar3.address;
            cardVar2.balance = cardVar3.balance;
        }
        ArrayList<TL_wallet.inputWalletCardSticker> arrayList = setcardstickers.stickers;
        int size3 = arrayList.size();
        while (i10 < size3) {
            TL_wallet.inputWalletCardSticker inputwalletcardsticker2 = arrayList.get(i10);
            i10++;
            TL_wallet.inputWalletCardSticker inputwalletcardsticker3 = inputwalletcardsticker2;
            g8 g8Var3 = (g8) this.f34639f.get(inputwalletcardsticker3.nft_address);
            if (g8Var3 != null && g8Var3.f34578b != null) {
                TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                cardsticker.nft = g8Var3.f34578b;
                cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                cardVar2.stickers.add(cardsticker);
                if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                    cardVar2.bg_nft_item = g8Var3.f34578b;
                }
            }
        }
        e0(currentAccount, cardVar2);
        this.f34641f1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new a3.b(1), new ng(this, currentAccount, cardVar, 3));
    }

    public final TL_wallet.cardSticker R(String str) {
        ArrayList<TL_wallet.cardSticker> arrayList;
        TL_wallet.card cardVar = this.f34631b1;
        if (cardVar != null && (arrayList = cardVar.stickers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i10);
                i10++;
                TL_wallet.cardSticker cardsticker2 = cardsticker;
                TL_wallet.nftItem nftitem = cardsticker2.nft;
                if (nftitem != null && str.equals(nftitem.address)) {
                    return cardsticker2;
                }
            }
        }
        return null;
    }

    public final void S(u7 u7Var) {
        int i10;
        int i11;
        removeCallbacks(this.A1);
        this.f34667s0 = true;
        this.f34659p0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        u7Var.animate().cancel();
        u7Var.n(u7Var.getScaleX() * u7Var.f35279y0);
        u7Var.setScaleX(1.0f);
        u7Var.setScaleY(1.0f);
        u7Var.m(1.0f, 150L, null);
        final g8 v = v(u7Var.f35277w0);
        String str = v.f34576a;
        if (!b(v) && !v.b()) {
            this.f34667s0 = false;
            return;
        }
        z60 I = z60.I(this.f34626a, u7Var);
        I.f32941s = 51;
        if (m(v) || str.equals(this.P0)) {
            if (str.equals(this.P0)) {
                i10 = 2131743129;
            } else {
                i10 = 2131743135;
            }
            I.c(2131232096, cd.L0(i10, null), new Runnable(this) {
                public final h8 f35417b;

                {
                    this.f35417b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f35417b.c0(v);
                            return;
                        default:
                            h8 h8Var = this.f35417b;
                            h8Var.getClass();
                            h8Var.b0(v.f34578b);
                            return;
                    }
                }
            }, false);
        }
        if (v.b()) {
            i11 = 2131743128;
        } else {
            i11 = 2131743136;
        }
        I.c(2131232381, cd.L0(i11, null), new Runnable(this) {
            public final h8 f35417b;

            {
                this.f35417b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f35417b.c0(v);
                        return;
                    default:
                        h8 h8Var = this.f35417b;
                        h8Var.getClass();
                        h8Var.b0(v.f34578b);
                        return;
                }
            }
        }, false);
        I.f32936p = new z7(this, 0);
        I.Z();
        performHapticFeedback(0);
    }

    public final float U() {
        return this.Y0 * 0.231f;
    }

    public final void V(g8 g8Var) {
        if (g8Var.f34576a.equals(this.P0)) {
            l();
        }
        g8Var.N = false;
        g(g8Var);
        u7 j10 = j(g8Var);
        if (j10 != null) {
            j10.setScaleX(0.93f);
            j10.setScaleY(0.93f);
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        O();
        f0();
    }

    public final void W(g8 g8Var, float f7, float f10) {
        boolean z10;
        float[] fArr;
        boolean z11;
        this.f34644h0 = null;
        this.m0 = true;
        if (this.K0 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34657o0 = z10;
        if (this.f34645h1) {
            if (g8Var == this.f34651k1 && !z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f34647i1 = z11;
            this.f34649j1 = false;
            this.f34645h1 = false;
            vp.d1().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z12 = g8Var.N;
        f8 f8Var = g8Var.f34589m;
        f8 f8Var2 = g8Var.f34583f;
        f8 f8Var3 = g8Var.e;
        float f11 = 1.0f;
        if (z12) {
            g8Var.N = false;
            f8 f8Var4 = g8Var.h;
            f8Var4.d = 420.0f;
            f8Var4.e = 0.8f;
            f8Var4.f34509b = 1.0f;
        }
        u7 j10 = j(g8Var);
        if (j10 != null) {
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.f34669t0 = false;
        if (this.f34657o0) {
            fArr = L(f8Var3.f34508a, f8Var2.f34508a);
        } else {
            RectF Z = Z(g8Var);
            if (Z == null) {
                return;
            }
            float[] fArr2 = {Z.centerX(), Z.centerY()};
            f8 f8Var5 = g8Var.f34584g;
            f8Var5.d = 500.0f;
            f8Var5.e = 0.75f;
            f8Var5.a((f(g8Var) * Z.width()) / U());
            f8Var.a(0.0f);
            b6.l0((b6) this.d.f12706c, 0L);
            fArr = fArr2;
        }
        f8Var3.d = 1100.0f;
        f8Var3.e = 0.9f;
        f8Var3.a(fArr[0]);
        f8Var2.d = 1100.0f;
        f8Var2.e = 0.9f;
        f8Var2.a(fArr[1]);
        g8Var.H = 3;
        long j11 = this.N0 + 1;
        this.N0 = j11;
        g8Var.I = j11;
        f8Var.f34509b = 1.0f;
        f8 f8Var6 = g8Var.f34586j;
        f8Var6.d = 320.0f;
        f8Var6.e = 0.75f;
        f8Var6.f34509b = 1.0f;
        g8Var.f34588l.a(0.0f);
        this.f34684z0 = fArr[0] - f7;
        this.A0 = fArr[1] - f10;
        if (!this.f34657o0) {
            f11 = 0.0f;
        }
        this.N.f34509b = f11;
        performHapticFeedback(3);
    }

    public final void X(g8 g8Var, boolean z10) {
        this.S0 = this.T0;
        this.T0 = g8Var;
        this.U0 = 0.0f;
        this.X0 = z10;
        if (g8Var != null) {
            this.V0 = g8Var.e.f34509b / this.Y0;
            this.W0 = g8Var.f34583f.f34509b / this.Z0;
        }
        f0();
    }

    public final void Y(c0 c0Var) {
        TL_wallet.nftItem nftitem;
        ArrayList arrayList = c0Var.f34296a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
            if (nftitem2.gift != null) {
                v(nftitem2);
            }
        }
        Iterator it = this.f34639f.values().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            g8 g8Var = (g8) it.next();
            int i11 = g8Var.H;
            String str = g8Var.f34576a;
            if (i11 != 3) {
                ArrayList arrayList2 = c0Var.f34298c;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                        if (!wallettransaction.failed && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, str)) {
                            if (str.equals(this.P0) || str.equals(this.Q0)) {
                                this.Q0 = null;
                                this.P0 = null;
                                X(null, true);
                            }
                            it.remove();
                            SharedPreferences sharedPreferences = this.e;
                            if (sharedPreferences != null) {
                                sharedPreferences.edit().remove(str).apply();
                            }
                            z10 = true;
                        }
                    }
                }
            }
        }
        if (z10 && !this.f34629b) {
            O();
            k();
        }
        f0();
    }

    public final RectF Z(g8 g8Var) {
        u7 j10 = j(g8Var);
        if (j10 != null && j10.isShown()) {
            Matrix matrix = this.f34675w;
            l6.k(j10, matrix);
            Matrix matrix2 = this.f34678x;
            l6.k(this, matrix2);
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
        this.f34661q0 = false;
        removeCallbacks(this.B1);
        removeCallbacks(this.A1);
        this.f34642g0 = null;
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        f0();
    }

    public final TL_stories.TL_mediaAreaCoordinates a0(g8 g8Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float U = U() * g8Var.h.f34509b;
        tL_mediaAreaCoordinates.f20028x = N((g8Var.e.f34509b / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.f20029y = N((g8Var.f34583f.f34509b / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.f20027w = N((U / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.h = N((U / this.Z0) * 100.0f);
        float f7 = g8Var.f34585i.f34509b % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        tL_mediaAreaCoordinates.rotation = N(f7);
        return tL_mediaAreaCoordinates;
    }

    public final void b0(TL_wallet.nftItem nftitem) {
        if (!A()) {
            return;
        }
        g8 v = v(nftitem);
        if (v.b()) {
            if (this.d.L()) {
                E(v);
            } else {
                V(v);
            }
        } else if (v.H == 0 && b(v)) {
            d0(v);
        }
        k();
    }

    public final void c0(g8 g8Var) {
        String str = g8Var.f34576a;
        if (str.equals(this.P0)) {
            l();
        } else if (m(g8Var)) {
            this.P0 = str;
            if (g8Var.b()) {
                X(g8Var, false);
                k();
            } else {
                this.Q0 = str;
                d0(g8Var);
                if (g8Var.H == 0) {
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
        g8 g8Var;
        g8 g8Var2;
        int i10;
        this.f34631b1 = cardVar;
        this.f34634c1 = T(cardVar);
        if (!this.f34636d1 && this.f34641f1 == 0 && !this.f34659p0) {
            TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
            g8 g8Var3 = null;
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
                int i11 = 0;
                while (i11 < size) {
                    TL_wallet.cardSticker cardsticker = arrayList.get(i11);
                    i11++;
                    TL_wallet.nftItem nftitem2 = cardsticker.nft;
                    if (nftitem2 != null && nftitem2.gift != null) {
                        v(nftitem2);
                    }
                }
            }
            if (this.f34629b) {
                TL_wallet.nftItem nftitem3 = cardVar.bg_nft_item;
                if (nftitem3 != null && nftitem3.gift != null) {
                    g8Var3 = v(nftitem3);
                }
                this.S0 = g8Var3;
                this.T0 = g8Var3;
                this.U0 = 1.0f;
                e();
                f0();
            } else if (!A()) {
                f0();
            } else {
                this.f34638e1 = true;
                ArrayList G = G();
                int size2 = G.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj = G.get(i12);
                    i12++;
                    g8 g8Var4 = (g8) obj;
                    if (g8Var4.K && (i10 = g8Var4.H) != 3 && i10 != 4 && i10 != 5) {
                        TL_wallet.cardSticker R = R(g8Var4.f34576a);
                        if (R != null) {
                            if (!g8Var4.b() || !y(a0(g8Var4)).equals(y(R.coordinates))) {
                                K(g8Var4, R.coordinates, g8Var4.N);
                            }
                        } else if (g8Var4.b()) {
                            E(g8Var4);
                        }
                    }
                }
                ArrayList<TL_wallet.cardSticker> arrayList2 = cardVar.stickers;
                LinkedHashMap linkedHashMap = this.f34639f;
                if (arrayList2 != null) {
                    int size3 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        TL_wallet.cardSticker cardsticker2 = arrayList2.get(i13);
                        i13++;
                        TL_wallet.nftItem nftitem4 = cardsticker2.nft;
                        if (nftitem4 == null) {
                            g8Var2 = null;
                        } else {
                            g8Var2 = (g8) linkedHashMap.get(nftitem4.address);
                        }
                        if (g8Var2 != null && g8Var2.H == 2) {
                            long j10 = this.N0 + 1;
                            this.N0 = j10;
                            g8Var2.I = j10;
                        }
                    }
                }
                if (!equals) {
                    String str2 = this.P0;
                    if (str2 == null) {
                        g8Var = null;
                    } else {
                        g8Var = (g8) linkedHashMap.get(str2);
                    }
                    if (g8Var != null && g8Var.b()) {
                        X(g8Var, false);
                    } else {
                        X(null, true);
                    }
                }
                this.f34638e1 = false;
                O();
                f0();
            }
        }
    }

    public final void d0(g8 g8Var) {
        b6.l0((b6) this.d.f12706c, 2600L);
        if (A()) {
            float[] x10 = x(g8Var, Float.NaN, Float.NaN, true);
            RectF Z = Z(g8Var);
            if (x10 != null && Z != null) {
                g8Var.f34584g.a((f(g8Var) * Z.width()) / U());
                g8Var.f34589m.a(0.0f);
                g8Var.f34586j.a(1.0f);
                float[] fArr = {Z.centerX(), Z.centerY()};
                this.f34666s.mapPoints(fArr);
                I(g8Var, fArr, x10, true);
                performHapticFeedback(3);
                return;
            }
            u7 j10 = j(g8Var);
            if (j10 != null) {
                j10.animate().rotation(3.0f).setDuration(90L).withEndAction(new x7(j10, 0)).start();
            }
        }
    }

    public final void e() {
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2;
        float pow;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4;
        g8 g8Var = this.S0;
        if (g8Var == null) {
            stargiftattributebackdrop = null;
        } else {
            stargiftattributebackdrop = g8Var.f34596t;
        }
        float[] i10 = v7.i(stargiftattributebackdrop);
        g8 g8Var2 = this.T0;
        if (g8Var2 == null) {
            stargiftattributebackdrop2 = null;
        } else {
            stargiftattributebackdrop2 = g8Var2.f34596t;
        }
        float[] i11 = v7.i(stargiftattributebackdrop2);
        float f7 = 1.0f;
        if (this.X0) {
            float f10 = this.U0;
            pow = c3.i0.D(f10, 2.0f, 3.0f, f10 * f10);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - this.U0, 4.0d));
        }
        float[] fArr = new float[18];
        float f11 = i10[0];
        float f12 = i10[1];
        float f13 = i10[2];
        float f14 = i11[0];
        float f15 = i11[1];
        float f16 = i11[2];
        float f17 = this.V0;
        float f18 = this.W0;
        if (!this.X0) {
            f7 = 0.0f;
        }
        System.arraycopy(new float[]{f11, f12, f13, f14, f15, f16, f17, f18, pow, f7}, 0, fArr, 0, 10);
        g8 g8Var3 = this.S0;
        if (g8Var3 == null) {
            stargiftattributebackdrop3 = null;
        } else {
            stargiftattributebackdrop3 = g8Var3.f34596t;
        }
        v7.m(fArr, 0, stargiftattributebackdrop3);
        g8 g8Var4 = this.T0;
        if (g8Var4 == null) {
            stargiftattributebackdrop4 = null;
        } else {
            stargiftattributebackdrop4 = g8Var4.f34596t;
        }
        v7.m(fArr, 1, stargiftattributebackdrop4);
        this.f34632c.setStickerStyle(fArr);
    }

    public final float f(g8 g8Var) {
        u7 j10 = j(g8Var);
        if (j10 != null) {
            org.telegram.ui.Components.g9 g9Var = j10.D;
            if (j10.getWidth() > 0 && g9Var.getWidth() > 0) {
                return ((g9Var.getWidth() / j10.getWidth()) * 288.0f) / 268.0f;
            }
            return 0.77f;
        }
        return 0.77f;
    }

    public final void f0() {
        if (!this.f34628a1 && isAttachedToWindow()) {
            c8 c8Var = this.C1;
            removeCallbacks(c8Var);
            postOnAnimation(c8Var);
        }
    }

    public final void g(g8 g8Var) {
        g8Var.H = 0;
        g8Var.J = 0L;
        g8Var.f34584g.a(1.0f);
        g8Var.h.a(1.0f);
        g8Var.f34585i.a(0.0f);
        g8Var.f34589m.a(0.0f);
        g8Var.f34586j.a(0.0f);
        g8Var.f34587k.a(0.0f);
        u7 j10 = j(g8Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.setScaleX(1.0f);
            j10.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - org.telegram.messenger.i0.L(64.0f)) - org.telegram.messenger.i0.f16021n;
    }

    public final void i(u7 u7Var) {
        float f7;
        ArrayList arrayList = this.h;
        if (!arrayList.contains(u7Var)) {
            arrayList.add(u7Var);
        }
        g8 v = v(u7Var.f35277w0);
        if (v.H == 0) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        u7Var.k(v.R, false, f7);
        f0();
    }

    public final u7 j(g8 g8Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u7 u7Var = (u7) obj;
            if (u7Var.isAttachedToWindow() && u7Var.f35277w0.address.equals(g8Var.f34576a)) {
                return u7Var;
            }
        }
        return null;
    }

    public final void k() {
        if (!this.f34629b && !this.f34638e1) {
            this.f34636d1 = true;
            z7 z7Var = this.f34643g1;
            org.telegram.messenger.i0.r(z7Var);
            org.telegram.messenger.i0.h3(z7Var, 1500L);
        }
    }

    public final void l() {
        this.Q0 = null;
        this.P0 = null;
        X(null, true);
        O();
        k();
    }

    public final boolean m(g8 g8Var) {
        if (b(g8Var) && F(this.f34626a.getCurrentAccount(), g8Var.f34578b.gift.slug)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f34683y1);
        getViewTreeObserver().addOnPreDrawListener(this.f34685z1);
        for (g8 g8Var : this.f34639f.values()) {
            g8Var.f34580c.P();
            g8Var.d.P();
        }
        f0();
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.f34683y1);
        getViewTreeObserver().removeOnPreDrawListener(this.f34685z1);
        removeCallbacks(this.C1);
        removeCallbacks(this.A1);
        for (g8 g8Var : this.f34639f.values()) {
            g8Var.f34580c.R();
            g8Var.d.R();
        }
        this.M0 = 0L;
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        Rect rect;
        float f14;
        int i11;
        float f15;
        g8 g8Var;
        Paint paint;
        ArrayList arrayList;
        RectF rectF;
        h8 h8Var = this;
        Canvas canvas2 = canvas;
        if (h8Var.A()) {
            float f16 = h8Var.N.f34508a;
            int i12 = (f16 > 0.01f ? 1 : (f16 == 0.01f ? 0 : -1));
            RectF rectF2 = h8Var.H;
            ?? r10 = 0;
            Paint paint2 = h8Var.f34681y;
            if (i12 < 0) {
                f10 = 0.0f;
                i10 = 0;
                f7 = 0.4f;
                f11 = 2.0f;
                f12 = 0.6f;
            } else {
                float max = Math.max(0.0f, Math.min(1.2f, h8Var.O.f34508a));
                float l4 = Utilities.l(max);
                f7 = 0.4f;
                Paint paint3 = h8Var.G;
                paint3.setTextSize(org.telegram.messenger.i0.L(15.0f));
                f10 = 0.0f;
                f11 = 2.0f;
                float measureText = (((paint3.measureText(cd.L0(2131746336, null)) + org.telegram.messenger.i0.L(72.0f)) - org.telegram.messenger.i0.L(56.0f)) * max) + org.telegram.messenger.i0.L(56.0f);
                canvas2.save();
                f12 = 0.6f;
                canvas2.translate(h8Var.getWidth() / 2.0f, ((1.0f - f16) * org.telegram.messenger.i0.L(90.0f)) + h8Var.h());
                float f17 = (f16 * 0.4f) + 0.6f;
                canvas2.scale(f17, f17);
                int i13 = org.telegram.ui.ActionBar.t6.f20929d6;
                org.telegram.ui.ActionBar.k2 k2Var = h8Var.f34626a;
                paint2.setColor(i0.b.f(l4, org.telegram.ui.ActionBar.t6.w0(i13, k2Var.getResourceProvider()), -1750963));
                paint2.setAlpha((int) (Utilities.l(f16) * 255.0f));
                float f18 = (-measureText) / 2.0f;
                float f19 = measureText / 2.0f;
                rectF2.set(f18, -org.telegram.messenger.i0.L(28.0f), f19, org.telegram.messenger.i0.L(28.0f));
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), paint2);
                float L = (f18 + org.telegram.messenger.i0.L(30.0f)) * l4;
                float L2 = org.telegram.messenger.i0.L(21.0f);
                int round = Math.round(h8Var.f34633c0.f34508a);
                bi0 bi0Var = h8Var.f34637e0;
                bi0Var.N(round, false, false);
                float f20 = L - L2;
                i10 = 0;
                float f21 = -L2;
                float f22 = L + L2;
                bi0Var.setBounds((int) f20, (int) f21, (int) f22, (int) L2);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.b.f(l4, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, k2Var.getResourceProvider()), -1), PorterDuff.Mode.SRC_IN);
                Paint paint4 = h8Var.f34635d0;
                paint4.setColorFilter(porterDuffColorFilter);
                paint4.setAlpha((int) (Utilities.l(f16) * 255.0f));
                canvas2 = canvas;
                int saveLayer = canvas2.saveLayer(f20, f21, f22, L2, paint4);
                bi0Var.draw(canvas2);
                canvas2.restoreToCount(saveLayer);
                if (l4 > 0.02f) {
                    paint3.setColor(-1);
                    paint3.setAlpha((int) (Utilities.l((l4 - 0.4f) / 0.6f) * 255.0f));
                    Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                    canvas2.save();
                    canvas2.clipRect(org.telegram.messenger.i0.L(22.0f) + L, -org.telegram.messenger.i0.L(28.0f), f19 - org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(28.0f));
                    canvas2.drawText(cd.L0(2131746336, null), L + org.telegram.messenger.i0.L(22.0f), (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f, paint3);
                    canvas2.restore();
                }
                canvas2.restore();
                r10 = 0;
            }
            paint2.setShader(r10);
            paint2.setColorFilter(r10);
            paint2.setAlpha(255);
            ArrayList G = h8Var.G();
            int size = G.size();
            int i14 = i10;
            while (i14 < size) {
                int i15 = i14 + 1;
                g8 g8Var2 = (g8) G.get(i14);
                f8 f8Var = g8Var2.e;
                f8 f8Var2 = g8Var2.f34585i;
                float f23 = f8Var.f34508a;
                float f24 = g8Var2.f34583f.f34508a;
                float U = h8Var.U() * g8Var2.f34584g.f34508a * g8Var2.h.f34508a;
                float f25 = g8Var2.f34586j.f34508a;
                int i16 = g8Var2.H;
                if (i16 == 1 && g8Var2.O && f25 > 0.3f) {
                    float[] L3 = h8Var.L(f23 + g8Var2.f34590n.f34508a, f24 + g8Var2.f34591o.f34508a);
                    float f26 = L3[i10];
                    float f27 = L3[1];
                    U = c3.i0.C(f25, 0.15f, 1.0f, U);
                    f13 = f27;
                    f23 = f26;
                } else if (i16 != 3 && i16 != 4 && i16 != 5) {
                    i14 = i15;
                } else {
                    f13 = f24;
                }
                float f28 = U;
                Bitmap a2 = g8Var2.a();
                if (a2 != null) {
                    if (f28 < 1.0f) {
                        i14 = i15;
                    } else {
                        canvas2.save();
                        canvas2.rotate(f8Var2.f34508a, f23, f13);
                        Paint paint5 = paint2;
                        h8Var.t(canvas2, g8Var2, f23, (org.telegram.messenger.i0.L(5.0f) * f25) + org.telegram.messenger.i0.L(1.5f) + f13, c3.i0.C(f25, 0.04f, 1.0f, f28), f25, 0.0f, 1.0f);
                        canvas.restore();
                        float l10 = Utilities.l(g8Var2.f34589m.f34508a);
                        if (g8Var2.H == 4 && g8Var2.W > f12 && h8Var.j(g8Var2) != null) {
                            float l11 = Utilities.l((g8Var2.W - f12) / f7);
                            float f29 = (1.0f - ((3.0f - (l11 * f11)) * (l11 * l11))) * 0.45f;
                            float l12 = (1.0f - (Utilities.l(-g8Var2.V) * f12)) * 0.55f;
                            if (l10 < 1.0f) {
                                paint5.setAlpha((int) ((1.0f - l10) * 255.0f));
                                i11 = size;
                                paint = paint5;
                                f15 = f28;
                                arrayList = G;
                                rectF = rectF2;
                                f14 = f13;
                                g8Var = g8Var2;
                                h8Var.r(canvas, g8Var2.v, f23, f14, f15, f29, l12, f8Var2.f34508a, g8Var2.U, g8Var2.V);
                            } else {
                                f14 = f13;
                                i11 = size;
                                f15 = f28;
                                g8Var = g8Var2;
                                paint = paint5;
                                arrayList = G;
                                rectF = rectF2;
                            }
                            if (l10 > f10) {
                                paint.setAlpha((int) (l10 * 255.0f));
                                canvas2 = canvas;
                                r(canvas2, a2, f23, f14, f15, f29, l12, f8Var2.f34508a, g8Var.U, g8Var.V);
                            } else {
                                canvas2 = canvas;
                            }
                            paint.setAlpha(255);
                            rectF2 = rectF;
                            paint2 = paint;
                            i14 = i15;
                            G = arrayList;
                            size = i11;
                        } else {
                            float f30 = f13;
                            int i17 = size;
                            ArrayList arrayList2 = G;
                            canvas2 = canvas;
                            RectF rectF3 = rectF2;
                            canvas2.save();
                            canvas2.rotate(f8Var2.f34508a, f23, f30);
                            float f31 = f28 / f11;
                            rectF3.set(f23 - f31, f30 - f31, f23 + f31, f31 + f30);
                            if (l10 < 1.0f) {
                                paint5.setAlpha((int) ((1.0f - l10) * 255.0f));
                                rect = null;
                                canvas2.drawBitmap(g8Var2.v, (Rect) null, rectF3, paint5);
                            } else {
                                rect = null;
                            }
                            if (l10 > f10) {
                                paint5.setAlpha((int) (l10 * 255.0f));
                                canvas2.drawBitmap(a2, rect, rectF3, paint5);
                            }
                            paint5.setAlpha(255);
                            canvas2.restore();
                            rectF2 = rectF3;
                            paint2 = paint5;
                            i14 = i15;
                            G = arrayList2;
                            size = i17;
                        }
                        h8Var = this;
                    }
                } else {
                    h8Var = this;
                    i14 = i15;
                }
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        f0();
    }

    public final void p() {
        org.telegram.messenger.i0.E2(this.f34677w1);
        org.telegram.messenger.i0.E2(this.f34680x1);
        this.f34680x1 = null;
        this.f34677w1 = null;
        O();
        org.telegram.messenger.i0.r(this.f34643g1);
        this.f34644h0 = null;
        this.f34628a1 = true;
        if (this.f34636d1) {
            Q();
        }
        this.f34637e0.C(false);
        removeCallbacks(this.C1);
        removeCallbacks(this.A1);
        removeCallbacks(this.B1);
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        for (g8 g8Var : this.f34639f.values()) {
            g8Var.f34580c.R();
            g8Var.d.R();
        }
        this.h.clear();
    }

    public final void q(org.telegram.ui.Wallet.g8 r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.h8.q(org.telegram.ui.Wallet.g8, float, float):void");
    }

    public final void r(Canvas canvas, Bitmap bitmap, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17;
        float f18 = f11;
        float f19 = (f18 * f12) + ((-f18) / 2.0f);
        float f20 = 0.3f * f18;
        float f21 = 3.2f * f18;
        float f22 = 0.72f * f13;
        float f23 = f20 * f22;
        double d = f14;
        float cos = (float) Math.cos(Math.toRadians(d));
        float sin = (float) Math.sin(Math.toRadians(d));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 <= 14) {
                int i12 = 0;
                for (int i13 = 14; i12 <= i13; i13 = 14) {
                    float f24 = ((i12 / 14.0f) - 0.5f) * f18;
                    float f25 = ((i10 / 14.0f) - 0.5f) * f18;
                    float f26 = (f24 * cos) - (f25 * sin);
                    float f27 = (f25 * cos) + (f24 * sin);
                    float f28 = (f27 * f16) + (f26 * f15);
                    float f29 = (f27 * f15) + ((-f26) * f16);
                    float f30 = f19 - f28;
                    float f31 = 0.0f;
                    float f32 = 1.0f;
                    if (f30 > 0.0f) {
                        float min = Math.min(f22, f30 / f20);
                        float max = Math.max(0.0f, f30 - f23);
                        f17 = f20;
                        double d10 = min;
                        float sin2 = (f19 - (f17 * ((float) Math.sin(d10)))) - (((float) Math.cos(d10)) * max);
                        float sin3 = (max * ((float) Math.sin(d10))) + ((1.0f - ((float) Math.cos(d10))) * f17);
                        f32 = (((float) Math.cos(d10)) * 0.38f) + 0.62f;
                        f28 = sin2;
                        f31 = sin3;
                    } else {
                        f17 = f20;
                    }
                    float f33 = f21 / (f21 - f31);
                    int i14 = i11 * 2;
                    float[] fArr = this.J;
                    fArr[i14] = (((f28 * f15) - (f29 * f16)) * f33) + f7;
                    fArr[i14 + 1] = ((((f29 * f15) + (f28 * f16)) * f33) + f10) - (f31 * 0.15f);
                    int i15 = (int) (255.0f * f32);
                    this.K[i11] = Color.rgb(i15, i15, i15);
                    i12++;
                    f18 = f11;
                    i11++;
                    f20 = f17;
                }
                i10++;
                f18 = f11;
            } else {
                canvas.drawBitmapMesh(bitmap, 14, 14, this.J, 0, this.K, 0, this.f34681y);
                return;
            }
        }
    }

    public final void s(Canvas canvas, g8 g8Var, float f7, float f10, boolean z10) {
        float f11;
        ImageReceiver imageReceiver = g8Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = g8Var.f34596t;
        Bitmap n10 = imageReceiver.n();
        if (n10 != null && stargiftattributebackdrop != null) {
            canvas.save();
            float f12 = this.Y0;
            float f13 = this.Z0;
            Path path = this.I;
            path.rewind();
            float f14 = 0.15f;
            char c10 = 0;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(0.0f, 0.0f, f12, f13, (f12 * 0.15f) / 2.0f, (f13 * 0.15f) / 1.212122f, direction);
            canvas.clipPath(path);
            this.f34632c.h(path, this.Y0, this.Z0);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 >= 0 && !z10) {
                path.rewind();
                path.addCircle(this.V0 * this.Y0, this.W0 * this.Z0, f10, direction);
                canvas.clipPath(path);
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
            Paint paint = this.f34681y;
            paint.setColorFilter(porterDuffColorFilter);
            float f15 = this.Y0 / 336.0f;
            float f16 = this.Z0 / 205.0f;
            int i11 = 16;
            int i12 = 0;
            int i13 = 16;
            while (i13 < 336) {
                int i14 = ((i12 % 2) * 18) + i11;
                while (i14 < 205) {
                    float f17 = i13 * f15;
                    float f18 = i14 * f16;
                    float f19 = f14;
                    float f20 = f15 * 12.0f;
                    float l4 = Utilities.l(Math.min(Math.min(i13, 336 - i13), Math.min(i14, 205 - i14)) / 48.0f);
                    float f21 = f15;
                    float D = f7 * f19 * c3.i0.D(l4, 2.0f, 3.0f, l4 * l4);
                    if (i10 >= 0) {
                        float l10 = Utilities.l((f10 - Utilities.t(f17, f18, this.V0 * this.Y0, this.W0 * this.Z0)) / org.telegram.messenger.i0.L(120.0f));
                        if (z10) {
                            f20 = c3.i0.D(l10, 0.8f, 1.0f, f20);
                            D *= 1.0f - Utilities.l(l10 * 1.6f);
                        } else {
                            f11 = f17;
                            f20 *= (((((float) Math.sin(l10 * 3.141592653589793d)) * 0.28f) + l10) * 0.8f) + 0.2f;
                            D *= Utilities.l(l10 * 1.6f);
                            paint.setAlpha((int) (D * 255.0f));
                            float f22 = f20 / 2.0f;
                            RectF rectF = this.H;
                            rectF.set(f11 - f22, f18 - f22, f11 + f22, f18 + f22);
                            canvas.drawBitmap(n10, (Rect) null, rectF, paint);
                            i14 += 37;
                            f14 = f19;
                            c10 = 0;
                            f15 = f21;
                        }
                    }
                    f11 = f17;
                    paint.setAlpha((int) (D * 255.0f));
                    float f222 = f20 / 2.0f;
                    RectF rectF2 = this.H;
                    rectF2.set(f11 - f222, f18 - f222, f11 + f222, f18 + f222);
                    canvas.drawBitmap(n10, (Rect) null, rectF2, paint);
                    i14 += 37;
                    f14 = f19;
                    c10 = 0;
                    f15 = f21;
                }
                i13 += 33;
                i12++;
                i11 = 16;
            }
            paint.setColorFilter(null);
            paint.setAlpha(255);
            canvas.restore();
        }
    }

    public final void t(Canvas canvas, g8 g8Var, float f7, float f10, float f11, float f12, float f13, float f14) {
        if (f14 > 0.01f && g8Var.f34598w != null) {
            float f15 = (((0.05f * f12) + 1.0f) * ((f11 * 176.0f) / 128.0f)) / 2.0f;
            float f16 = f7 - f15;
            float f17 = f10 - f15;
            float f18 = f7 + f15;
            float f19 = f10 + f15;
            RectF rectF = this.H;
            rectF.set(f16, f17, f18, f19);
            Paint paint = this.f34681y;
            int alpha = paint.getAlpha();
            paint.setColor(-16044452);
            float l4 = Utilities.l(g8Var.f34589m.f34508a);
            paint.setAlpha((int) (l4 * Utilities.l((f13 * 0.12f) + (f12 * (-0.049999997f)) + 0.16f) * 255.0f * f14));
            canvas.drawBitmap(g8Var.f34598w, (Rect) null, rectF, paint);
            paint.setColor(-1);
            paint.setAlpha(alpha);
        }
    }

    public final g8 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f34639f;
        g8 g8Var = (g8) linkedHashMap.get(str);
        if (g8Var == null) {
            g8Var = new g8(this, nftitem);
            linkedHashMap.put(nftitem.address, g8Var);
        }
        g8Var.f34578b = nftitem;
        return g8Var;
    }

    public final void w(float r19, float r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.h8.w(float, float, boolean):void");
    }

    public final float[] x(g8 g8Var, float f7, float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        float f13;
        ArrayList arrayList;
        float min;
        float f14;
        float f15;
        if (!z10) {
            g8Var.N = false;
            return new float[]{f7, f10, g8Var.h.f34509b};
        }
        ArrayList<RectF> stickerObstacles = this.f34632c.getStickerObstacles();
        float f16 = this.Y0 * 0.012f;
        int size = stickerObstacles.size();
        int i10 = 0;
        while (i10 < size) {
            RectF rectF = stickerObstacles.get(i10);
            i10++;
            float f17 = -f16;
            rectF.inset(f17, f17);
        }
        stickerObstacles.get(2).left -= this.Y0 * 0.035f;
        float L = org.telegram.messenger.i0.L(32.0f) / U();
        float f18 = g8Var.h.f34509b;
        g8Var.N = false;
        ArrayList arrayList2 = new ArrayList();
        for (g8 g8Var2 : this.f34639f.values()) {
            if (g8Var2 != g8Var && g8Var2.b()) {
                arrayList2.add(g8Var2);
            }
        }
        if (!Float.isNaN(f7) && !Float.isNaN(f10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && g8Var == this.f34651k1 && this.f34653m1 != null && arrayList2.isEmpty()) {
            return (float[]) this.f34653m1.clone();
        }
        if (!z11) {
            f11 = this.Y0 * 0.6f;
            f12 = this.Z0 * 0.68f;
        } else {
            f11 = f7;
            f12 = f10;
        }
        Random random = new Random((System.nanoTime() / 400000000) + (arrayList2.size() * 31) + (g8Var.f34576a.hashCode() * 7919));
        float nextFloat = (random.nextFloat() * 0.04f) + 0.05f;
        float f19 = 0.5f;
        float nextFloat2 = (((random.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.Y0;
        float nextFloat3 = this.Z0 * (((random.nextFloat() - 0.5f) * 0.08f) + 0.55f);
        float U = U() * L * 0.5f;
        float f20 = -3.4028235E38f;
        float[] fArr = null;
        float f21 = U;
        while (f21 <= this.Z0 - U) {
            float f22 = f19;
            float f23 = U;
            while (true) {
                float f24 = this.Y0;
                if (f23 <= f24 - U) {
                    float min2 = Math.min(Math.min(f23, f24 - f23), Math.min(f21, this.Z0 - f21));
                    float f25 = nextFloat;
                    float min3 = Math.min(Math.max(0.74f, 1.0f - (arrayList2.size() * nextFloat)) * f18, min2 / (U() * f22));
                    int size2 = stickerObstacles.size();
                    float f26 = L;
                    float f27 = f18;
                    int i11 = 0;
                    float f28 = Float.MAX_VALUE;
                    while (i11 < size2) {
                        ArrayList<RectF> arrayList3 = stickerObstacles;
                        RectF rectF2 = stickerObstacles.get(i11);
                        f28 = Math.min(f28, Utilities.t(f23, f21, Math.max(rectF2.left, Math.min(rectF2.right, f23)), Math.max(rectF2.top, Math.min(rectF2.bottom, f21))));
                        i11++;
                        stickerObstacles = arrayList3;
                        z11 = z11;
                    }
                    ArrayList<RectF> arrayList4 = stickerObstacles;
                    boolean z12 = z11;
                    float min4 = Math.min(min3, f28 / (U() * 0.44f));
                    int i12 = 0;
                    for (int size3 = arrayList2.size(); i12 < size3; size3 = size3) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        g8 g8Var3 = (g8) obj;
                        min4 = Math.min(min4, (Utilities.t(f23, f21, g8Var3.e.f34509b, g8Var3.f34583f.f34509b) / (U() * 0.29f)) - g8Var3.h.f34509b);
                    }
                    float l4 = ((Utilities.l((min2 - ((U() * f22) * min4)) / org.telegram.messenger.i0.L(14.0f)) * 0.1f) + 0.9f) * min4;
                    if (l4 < f26) {
                        arrayList = arrayList2;
                    } else {
                        if (arrayList2.isEmpty()) {
                            float f29 = this.Y0 * 0.6f;
                            float z13 = c3.i0.z(f11, f29, 0.2f, f29);
                            float f30 = this.Z0 * 0.68f;
                            f15 = (random.nextFloat() * org.telegram.messenger.i0.L(5.0f)) + (U() * 1.1f * l4) + (Utilities.t(f23, f21, z13, c3.i0.z(f12, f30, 0.2f, f30)) * (-0.45f));
                            f13 = l4;
                            arrayList = arrayList2;
                        } else {
                            float f31 = f21 * l4 * l4;
                            float f32 = l4 * l4;
                            int size4 = arrayList2.size();
                            float f33 = f23 * l4 * l4;
                            int i13 = 0;
                            float f34 = Float.MAX_VALUE;
                            float f35 = 0.0f;
                            while (i13 < size4) {
                                Object obj2 = arrayList2.get(i13);
                                int i14 = i13 + 1;
                                g8 g8Var4 = (g8) obj2;
                                float f36 = l4;
                                f8 f8Var = g8Var4.e;
                                int i15 = size4;
                                f8 f8Var2 = g8Var4.h;
                                ArrayList arrayList5 = arrayList2;
                                f8 f8Var3 = g8Var4.f34583f;
                                f34 = Math.min(f34, Utilities.t(f23, f21, f8Var.f34509b, f8Var3.f34509b) - ((f8Var2.f34509b + f36) * (U() * 0.4f)));
                                float f37 = f8Var2.f34509b;
                                float f38 = f37 * f37;
                                float f39 = g8Var4.e.f34509b;
                                f33 = (f39 * f38) + f33;
                                f31 = (f8Var3.f34509b * f38) + f31;
                                f32 += f38;
                                f35 = Math.max(0.0f, 1.0f - (Math.abs(f8Var3.f34509b - f21) / (U() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f39 - f23) / (U() * 0.12f))) + f35;
                                l4 = f36;
                                i13 = i14;
                                size4 = i15;
                                arrayList2 = arrayList5;
                            }
                            f13 = l4;
                            arrayList = arrayList2;
                            float f40 = f31;
                            if (f34 < 0.0f) {
                                min = f34 * 2.5f;
                            } else {
                                min = Math.min(f34, U() * 0.3f);
                            }
                            float nextFloat4 = (random.nextFloat() * org.telegram.messenger.i0.L(10.0f)) + (((((Math.min(Math.min(min2, f28), U()) * 0.2f) + ((U() * (f13 * 0.9f)) + (min * 1.2f))) - (Utilities.t(f33 / f32, f40 / f32, nextFloat2, nextFloat3) * 0.35f)) - ((U() * f35) * 0.08f)) - (Utilities.t(f23, f21, this.Y0 * f22, this.Z0 * 0.55f) * 0.04f));
                            if (z12) {
                                f14 = Utilities.t(f23, f21, f11, f12) * 0.04f;
                            } else {
                                f14 = 0.0f;
                            }
                            f15 = nextFloat4 - f14;
                        }
                        if (f15 > f20) {
                            f20 = f15;
                            fArr = new float[]{f23, f21, f13};
                            f23 += org.telegram.messenger.i0.L(5.0f);
                            nextFloat = f25;
                            L = f26;
                            f18 = f27;
                            stickerObstacles = arrayList4;
                            z11 = z12;
                            arrayList2 = arrayList;
                        }
                    }
                    f23 += org.telegram.messenger.i0.L(5.0f);
                    nextFloat = f25;
                    L = f26;
                    f18 = f27;
                    stickerObstacles = arrayList4;
                    z11 = z12;
                    arrayList2 = arrayList;
                }
            }
            f21 += org.telegram.messenger.i0.L(5.0f);
            f19 = f22;
            nextFloat = nextFloat;
        }
        return fArr;
    }

    public final boolean z(u7 u7Var) {
        if (u7Var.isShown()) {
            Rect rect = this.F1;
            if (u7Var.getGlobalVisibleRect(rect) && rect.width() >= u7Var.getWidth() - 1 && rect.height() >= u7Var.getHeight() - 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
