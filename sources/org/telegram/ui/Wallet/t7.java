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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.lg;
public final class t7 extends View {
    public static final int G1 = 0;
    public float A0;
    public final l7 A1;
    public float B0;
    public final l7 B1;
    public float C0;
    public final o7 C1;
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
    public final n7 L;
    public boolean L0;
    public final m7 M;
    public long M0;
    public final r7 N;
    public long N0;
    public final r7 O;
    public VelocityTracker O0;
    public final r7 P;
    public String P0;
    public final r7 Q;
    public String Q0;
    public final r7 R;
    public long R0;
    public final ArrayList S;
    public s7 S0;
    public final Path T;
    public s7 T0;
    public final Paint U;
    public float U0;
    public final LinearGradient V;
    public float V0;
    public final Matrix W;
    public float W0;
    public boolean X0;
    public float Y0;
    public float Z0;
    public final org.telegram.ui.ActionBar.r2 f37275a;
    public float f37276a0;
    public boolean f37277a1;
    public final boolean f37278b;
    public float f37279b0;
    public TL_wallet.card f37280b1;
    public final w5 f37281c;
    public final r7 f37282c0;
    public String f37283c1;
    public final m4.c d;
    public final Paint f37284d0;
    public boolean f37285d1;
    public final SharedPreferences e;
    public final xj0 f37286e0;
    public boolean f37287e1;
    public final LinkedHashMap f37288f;
    public boolean f37289f0;
    public int f37290f1;
    public s7 f37291g0;
    public final l7 f37292g1;
    public final ArrayList h;
    public s7 f37293h0;
    public boolean f37294h1;
    public boolean f37295i0;
    public boolean f37296i1;
    public final Paint f37297j0;
    public boolean f37298j1;
    public final Paint f37299k0;
    public s7 f37300k1;
    public final Paint f37301l0;
    public g7 l1;
    public boolean m0;
    public float[] f37302m1;
    public final ArrayList f37303n;
    public boolean f37304n0;
    public float f37305n1;
    public boolean f37306o0;
    public final float[] f37307o1;
    public boolean f37308p0;
    public final r7 f37309p1;
    public boolean f37310q0;
    public final r7 f37311q1;
    public final Matrix f37312r;
    public boolean f37313r0;
    public final Paint f37314r1;
    public final Matrix f37315s;
    public boolean f37316s0;
    public final Paint f37317s1;
    public boolean f37318t0;
    public final Matrix f37319t1;
    public boolean f37320u0;
    public final Path f37321u1;
    public final Matrix v;
    public int f37322v0;
    public final RectF f37323v1;
    public final Matrix f37324w;
    public float f37325w0;
    public fi.v3 f37326w1;
    public final Paint f37327x;
    public float f37328x0;
    public fi.v3 f37329x1;
    public final Paint f37330y;
    public float f37331y0;
    public final n1 f37332y1;
    public float f37333z0;
    public final x4 f37334z1;

    public t7(org.telegram.ui.ActionBar.r2 r2Var, w5 w5Var, m4.c cVar, TL_wallet.card cardVar) {
        super(r2Var.getContext());
        boolean z10;
        SharedPreferences sharedPreferences;
        boolean z11;
        this.f37288f = new LinkedHashMap();
        this.h = new ArrayList();
        this.f37303n = new ArrayList();
        this.f37312r = new Matrix();
        this.f37315s = new Matrix();
        this.v = new Matrix();
        this.f37324w = new Matrix();
        this.f37327x = new Paint(3);
        this.f37330y = new Paint(3);
        this.E = new RectF();
        Paint paint = new Paint(1);
        this.F = paint;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new RectF();
        this.I = new Path();
        this.J = new float[450];
        this.K = new int[225];
        this.N = new r7(0.0f, 260.0f, 0.78f);
        this.O = new r7(0.0f, 420.0f, 0.72f);
        this.P = new r7(1.0f, 420.0f, 0.38f);
        this.Q = new r7(0.0f, 170.0f, 0.42f);
        this.R = new r7(0.0f, 170.0f, 0.42f);
        this.S = new ArrayList();
        this.T = new Path();
        Paint paint3 = new Paint(1);
        this.U = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.V = linearGradient;
        this.W = new Matrix();
        this.f37282c0 = new r7(0.0f, 120.0f, 1.0f);
        this.f37284d0 = new Paint(1);
        this.f37297j0 = new Paint(1);
        this.f37299k0 = new Paint(1);
        this.f37301l0 = new Paint(1);
        this.U0 = 1.0f;
        this.V0 = 0.5f;
        this.W0 = 0.5f;
        this.f37292g1 = new l7(this, 1);
        this.f37307o1 = new float[3];
        this.f37309p1 = new r7(0.0f, 260.0f, 1.0f);
        this.f37311q1 = new r7(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.f37314r1 = paint4;
        Paint paint5 = new Paint(1);
        this.f37317s1 = paint5;
        this.f37319t1 = new Matrix();
        this.f37321u1 = new Path();
        this.f37323v1 = new RectF();
        this.f37332y1 = new n1(this, 1);
        this.f37334z1 = new x4(2, this);
        this.A1 = new l7(this, 2);
        this.B1 = new l7(this, 3);
        this.C1 = new o7(this);
        this.D1 = new RectF();
        Paint paint6 = new Paint(1);
        this.E1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.F1 = new Rect();
        this.f37275a = r2Var;
        if (cardVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37278b = z10;
        xj0 xj0Var = new xj0(R.raw.wallet_gift_trash, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
        this.f37286e0 = xj0Var;
        xj0Var.R(this);
        this.f37281c = w5Var;
        this.d = cVar;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z10) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + r2Var.getCurrentAccount() + "_" + l0.w(r2Var.getCurrentAccount()).s(), 0);
        }
        this.e = sharedPreferences;
        this.P0 = z10 ? null : sharedPreferences.getString("style", null);
        if (!z10 && !MessagesController.getGlobalMainSettings().getBoolean("walletcardstickerhint", false)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f37294h1 = z11;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint4.setStrokeCap(cap);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(-1);
        setImportantForAccessibility(2);
        setTranslationZ(AndroidUtilities.dp(24.0f));
        paint.setStyle(style);
        paint.setStrokeCap(cap);
        paint2.setTypeface(AndroidUtilities.bold());
        m7 m7Var = new m7(this, getContext());
        this.M = m7Var;
        n7 n7Var = new n7(this, getContext());
        this.L = n7Var;
        m7Var.setTag(r5.f37165n0);
        w5Var.getFrontFace().addView(m7Var, 0, gb1.g(-1.0f, -1));
        w5Var.getFrontFace().addView(n7Var, w5Var.getStickerLayerIndex(), gb1.g(-1.0f, -1));
        if (z10) {
            n7Var.addOnLayoutChangeListener(new i7(this, 0));
            d(cardVar);
            return;
        }
        int currentAccount = r2Var.getCurrentAccount();
        MessagesController messagesController = MessagesController.getInstance(currentAccount);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        TLRPC.UserFull userFull = messagesController.getUserFull(clientUserId);
        if (userFull != null) {
            TL_wallet.card cardVar2 = userFull.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
            return;
        }
        messagesController.loadFullUser(messagesController.getUser(Long.valueOf(clientUserId)), 0, true, new k(this, 4));
    }

    public static boolean F(int i10, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int lastIndexOf = str.lastIndexOf(45);
        Set<String> set = AppGlobalConfig.getInstance(i10).walletCardBgGifts.get();
        if (set != null) {
            if (lastIndexOf > 0) {
                str = str.substring(0, lastIndexOf);
            }
            if (set.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static Path H(s7 s7Var) {
        Bitmap bitmap;
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        if (s7Var != null && s7Var.F == null && (bitmap = s7Var.f37245u) != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
            int[] iArr = new int[16384];
            createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
            if (createScaledBitmap != s7Var.f37245u) {
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
                    s7Var.F = path;
                    return path;
                }
                return null;
            }
            return null;
        } else if (s7Var == null) {
            return null;
        } else {
            return s7Var.F;
        }
    }

    public static void J(fi.v3 v3Var, float f7, float f10) {
        o(v3Var, 3);
        v3Var.m(0.0f, f7 - v3Var.getPaddingLeft());
        v3Var.setTranslationY(f10 - v3Var.getLayoutParams().height);
        v3Var.invalidate();
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

    public static boolean b(s7 s7Var) {
        TL_wallet.nftItem nftitem;
        if (s7Var != null && (nftitem = s7Var.f37226b) != null && nftitem.gift != null) {
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
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(UserConfig.getInstance(i10).getClientUserId());
        if (userFull == null) {
            return;
        }
        userFull.wallet_card = cardVar;
        MessagesStorage.getInstance(i10).updateUserInfo(userFull, false);
    }

    public static float n(RectF rectF, RectF rectF2) {
        float min = Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left);
        float min2 = Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top);
        if (min <= 0.0f || min2 <= 0.0f || rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return 0.0f;
        }
        return Utilities.clamp01(((min * min2) / (rectF2.height() * rectF2.width())) * 4.0f);
    }

    public static void o(fi.v3 v3Var, int i10) {
        if ((v3Var.getTag() instanceof Integer) && ((Integer) v3Var.getTag()).intValue() == i10) {
            return;
        }
        v3Var.setTag(Integer.valueOf(i10));
        v3Var.f11783a = i10;
        v3Var.m(1.0f, 0.0f);
    }

    public static float u(float f7, float f10, float f11) {
        float clamp01 = Utilities.clamp01((f7 - f10) / (f11 - f10));
        return c3.h0.D(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
    }

    public static String y(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        if (mediaAreaCoordinates == null) {
            return "";
        }
        return String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.f22263x), Double.valueOf(mediaAreaCoordinates.f22264y), Double.valueOf(mediaAreaCoordinates.f22262w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public final boolean A() {
        w5 w5Var = this.f37281c;
        this.Y0 = w5Var.getFrontFace().getWidth();
        float height = w5Var.getFrontFace().getHeight();
        this.Z0 = height;
        if (this.Y0 > 0.0f && height > 0.0f) {
            Matrix matrix = this.f37312r;
            if (w5Var.g(this, matrix) && matrix.invert(this.f37315s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final fi.v3 B(int i10, boolean z10) {
        float f7;
        fi.v3 v3Var = new fi.v3(getContext(), 3);
        v3Var.p(true);
        if (z10) {
            f7 = 15.0f;
        } else {
            f7 = 11.0f;
        }
        v3Var.k(11.0f, 6.0f, f7, 7.0f);
        v3Var.i(z10);
        v3Var.K = Layout.Alignment.ALIGN_NORMAL;
        v3Var.q(12.0f);
        v3Var.d = -1L;
        String string = LocaleController.getString(i10);
        v3Var.h = fi.v3.a(string, v3Var.getTextPaint());
        v3Var.s(string);
        v3Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        v3Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(v3Var, gb1.i(-1, 150, 48));
        return v3Var;
    }

    public final boolean C() {
        Path H;
        if (this.f37302m1 == null) {
            H = null;
        } else {
            H = H(this.f37300k1);
        }
        if (H == null) {
            return false;
        }
        float U = U() * this.f37302m1[2];
        Matrix matrix = this.f37319t1;
        matrix.setScale(U, U);
        float[] fArr = this.f37302m1;
        matrix.postTranslate(fArr[0], fArr[1]);
        H.transform(matrix, this.f37321u1);
        return true;
    }

    public final float[] D(float f7) {
        float[] fArr = this.f37307o1;
        fArr[0] = (u(f7, 0.45f, 0.82f) - u(f7, 1.3f, 1.72f)) * 0.9f;
        fArr[1] = (((float) Math.sin(Utilities.clamp01((f7 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f7, 0.6f, 0.92f) - u(f7, 1.18f, 1.46f));
        fArr[2] = u(f7, 1.58f, 1.7f) - u(f7, 1.7f, 1.92f);
        return fArr;
    }

    public final void E(s7 s7Var) {
        float f7;
        float f10;
        float f11;
        float f12;
        s7Var.J = 0L;
        r7 r7Var = s7Var.h;
        r7 r7Var2 = s7Var.f37231f;
        r7 r7Var3 = s7Var.e;
        if (s7Var.f37224a.equals(this.P0)) {
            l();
        }
        if (s7Var.b()) {
            float[] L = L(r7Var3.f37191a, r7Var2.f37191a);
            r7Var3.a(L[0]);
            r7Var2.a(L[1]);
        }
        s7Var.H = 4;
        s7Var.W = 0.0f;
        s7Var.X = r7Var3.f37191a;
        s7Var.Y = r7Var2.f37191a;
        s7Var.Z = s7Var.f37232g.f37191a * r7Var.f37191a;
        s7Var.f37225a0 = s7Var.f37233i.f37191a;
        if (this.f37325w0 > AndroidUtilities.dp(650.0f)) {
            f7 = 0.32f;
        } else {
            f7 = 0.44f;
        }
        s7Var.f37227b0 = f7;
        this.f37325w0 = 0.0f;
        g7 j10 = j(s7Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.o();
        }
        if (j10 != null) {
            f10 = j10.getScaleX();
        } else {
            f10 = 1.0f;
        }
        s7Var.f37229c0 = f10;
        RectF Z = Z(s7Var);
        if (Z != null) {
            float centerX = Z.centerX() - s7Var.X;
            float centerY = Z.centerY() - s7Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            if (hypot > AndroidUtilities.dp(6.0f)) {
                f11 = centerX / hypot;
            } else {
                f11 = 0.0f;
            }
            s7Var.U = f11;
            if (hypot > AndroidUtilities.dp(6.0f)) {
                f12 = centerY / hypot;
            } else {
                f12 = 1.0f;
            }
            s7Var.V = f12;
        }
        s7Var.f37236l.a(0.0f);
        r7Var.a(1.0f);
        long j11 = this.N0 + 1;
        this.N0 = j11;
        s7Var.I = j11;
        O();
        f0();
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList(this.f37288f.values());
        List.EL.sort(arrayList, Comparator$CC.comparingLong(new org.telegram.ui.Components.v0(2)));
        return arrayList;
    }

    public final void I(s7 s7Var, float[] fArr, float[] fArr2, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        long j10 = s7Var.J;
        r7 r7Var = s7Var.f37239o;
        r7 r7Var2 = s7Var.f37238n;
        if (j10 == 0) {
            long j11 = this.R0 + 1;
            this.R0 = j11;
            s7Var.J = j11;
            ArrayList arrayList = new ArrayList();
            for (s7 s7Var2 : this.f37288f.values()) {
                if (s7Var2 != s7Var && s7Var2.b()) {
                    arrayList.add(s7Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.EL.sort(arrayList, Comparator$CC.comparingLong(new org.telegram.ui.Components.v0(3)));
                for (int i10 = 0; i10 <= arrayList.size() - 10; i10++) {
                    s7 s7Var3 = (s7) arrayList.get(i10);
                    if (this.d.f0()) {
                        E(s7Var3);
                    } else {
                        V(s7Var3);
                    }
                }
                k();
            }
        }
        s7Var.H = 1;
        s7Var.Q = false;
        s7Var.M = false;
        s7Var.L = false;
        s7Var.P = z10;
        s7Var.O = z10;
        long j12 = this.N0 + 1;
        this.N0 = j12;
        s7Var.I = j12;
        r7Var2.a(0.0f);
        r7Var.a(0.0f);
        r7 r7Var3 = s7Var.e;
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
        r7Var3.d = f7;
        r7Var3.e = f10;
        r7Var3.a(fArr[0]);
        r7Var3.f37192b = fArr2[0];
        r7 r7Var4 = s7Var.f37231f;
        if (z10) {
            f13 = 150.0f;
        }
        if (!z10) {
            f15 = 1.0f;
        }
        r7Var4.d = f13;
        r7Var4.e = f15;
        r7Var4.a(fArr[1]);
        float f17 = fArr2[1];
        r7Var4.f37192b = f17;
        s7Var.h.f37192b = fArr2[2];
        r7 r7Var5 = s7Var.f37232g;
        r7Var5.d = 300.0f;
        r7Var5.e = 0.5f;
        r7Var5.f37192b = 1.0f;
        r7 r7Var6 = s7Var.f37234j;
        if (z10) {
            f14 = 110.0f;
        }
        r7Var6.d = f14;
        r7Var6.e = 0.9f;
        r7Var6.f37192b = 0.0f;
        s7Var.f37237m.f37192b = 1.0f;
        s7Var.f37236l.f37192b = 0.0f;
        float f18 = fArr2[0] - fArr[0];
        float f19 = f17 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f18, f19));
        if (max > AndroidUtilities.dp(6.0f)) {
            f11 = f18 / max;
        } else {
            f11 = 0.0f;
        }
        s7Var.U = f11;
        if (max > AndroidUtilities.dp(6.0f)) {
            f12 = f19 / max;
        } else {
            f12 = 1.0f;
        }
        s7Var.V = f12;
        r7 r7Var7 = s7Var.f37235k;
        r7Var7.a(0.9f);
        r7Var7.f37192b = 0.0f;
        if (z10) {
            float min = Math.min(AndroidUtilities.dp(110.0f), 0.32f * max);
            if (f18 >= 0.0f) {
                f16 = -1.0f;
            }
            r7Var2.a(0.0f);
            r7Var2.f37193c = ((-f19) / max) * min * f16 * 20.0f;
            r7Var.a(0.0f);
            r7Var.f37193c = c3.h0.D(min, 0.5f, (f18 / max) * min * f16, 20.0f);
        }
        O();
        f0();
    }

    public final void K(s7 s7Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z10) {
        s7Var.h.a((float) (mediaAreaCoordinates.f22262w / 23.100000381469727d));
        s7Var.f37233i.a(c((float) mediaAreaCoordinates.rotation));
        s7Var.N = z10;
        s7Var.e.a((((float) mediaAreaCoordinates.f22263x) / 100.0f) * this.Y0);
        s7Var.f37231f.a((((float) mediaAreaCoordinates.f22264y) / 100.0f) * this.Z0);
        s7Var.f37232g.a(1.0f);
        s7Var.f37234j.a(0.0f);
        s7Var.f37235k.a(0.0f);
        s7Var.f37238n.a(0.0f);
        s7Var.f37239o.a(0.0f);
        s7Var.f37236l.a(0.0f);
        s7Var.H = 2;
        long j10 = this.N0 + 1;
        this.N0 = j10;
        s7Var.I = j10;
        s7Var.f37237m.a(1.0f);
        if (s7Var.J == 0) {
            long j11 = this.R0 + 1;
            this.R0 = j11;
            s7Var.J = j11;
        }
        if (s7Var.f37224a.equals(this.P0)) {
            this.T0 = s7Var;
            this.S0 = s7Var;
            this.U0 = 1.0f;
            e();
        }
    }

    public final float[] L(float f7, float f10) {
        float[] fArr = {f7, f10};
        this.f37312r.mapPoints(fArr);
        return fArr;
    }

    public final void M(s7 s7Var, float f7, float f10) {
        float z10;
        r7 r7Var = s7Var.e;
        r7 r7Var2 = s7Var.h;
        float[] L = L(r7Var.f37191a, s7Var.f37231f.f37191a);
        boolean z11 = false;
        float dist = Utilities.dist(f7, f10, L[0], L[1]);
        if (Float.isNaN(this.E0)) {
            this.E0 = dist;
            this.F0 = r7Var2.f37192b;
        }
        if (Math.abs(dist - this.E0) > AndroidUtilities.dp(5.0f)) {
            r7 r7Var3 = s7Var.f37241q;
            r7Var3.d = 700.0f;
            r7Var3.e = 1.0f;
            r7Var3.f37192b = 1.0f;
        }
        float dp = AndroidUtilities.dp(32.0f) / U();
        if (this.f37295i0) {
            z10 = (this.F0 * dist) / Math.max(1.0f, this.E0);
        } else {
            z10 = c3.h0.z(1.21f, dp, (dist - this.E0) / AndroidUtilities.dp(110.0f), this.F0);
        }
        r7Var2.d = 900.0f;
        r7Var2.e = 1.0f;
        r7Var2.f37192b = Math.max(dp, Math.min(1.21f, z10));
        if (dist < AndroidUtilities.dp(14.0f)) {
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
        r7 r7Var4 = s7Var.f37233i;
        r7Var4.d = 900.0f;
        r7Var4.e = 0.95f;
        if (z11) {
            f11 = round;
        }
        r7Var4.f37192b = f11;
    }

    public final void O() {
        if (!this.f37278b && this.Y0 > 0.0f && this.Z0 > 0.0f) {
            SharedPreferences.Editor edit = this.e.edit();
            for (s7 s7Var : this.f37288f.values()) {
                boolean b10 = s7Var.b();
                String str = s7Var.f37224a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", s7Var.e.f37192b / this.Y0);
                        jSONObject.put("y", s7Var.f37231f.f37192b / this.Z0);
                        jSONObject.put("r", s7Var.f37233i.f37192b);
                        jSONObject.put("s", s7Var.h.f37192b);
                        jSONObject.put("q", s7Var.N);
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

    public final float P(s7 s7Var) {
        return (((1.0f - (s7Var.f37241q.f37191a * 0.9f)) * s7Var.f37236l.f37191a * 0.04f) + 1.0f) * U() * s7Var.f37232g.f37191a * s7Var.h.f37191a;
    }

    public final void Q() {
        if (!this.f37285d1 || this.f37290f1 != 0) {
            return;
        }
        if (!this.f37277a1 && (this.f37308p0 || !A())) {
            AndroidUtilities.runOnUIThread(this.f37292g1, 1000L);
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
            s7 s7Var = (s7) obj;
            boolean b10 = s7Var.b();
            String str2 = s7Var.f37224a;
            if (b10) {
                sb2.append(str2);
                sb2.append(':');
                sb2.append(y(a0(s7Var)));
                sb2.append(';');
                if (str2.equals(this.P0) && m(s7Var)) {
                    str = str2;
                }
            }
        }
        if (a1.g.s(sb2, "bg:", str).equals(this.f37283c1)) {
            this.f37285d1 = false;
            return;
        }
        TL_wallet.setCardStickers setcardstickers = new TL_wallet.setCardStickers();
        ArrayList G2 = G();
        int size2 = G2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = G2.get(i12);
            i12++;
            s7 s7Var2 = (s7) obj2;
            boolean b11 = s7Var2.b();
            String str3 = s7Var2.f37224a;
            if (b11) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                inputwalletcardsticker.nft_address = str3;
                inputwalletcardsticker.coordinates = a0(s7Var2);
                setcardstickers.stickers.add(inputwalletcardsticker);
                if (str3.equals(this.P0) && m(s7Var2)) {
                    setcardstickers.bg_nft_address = str3;
                }
            }
        }
        this.f37285d1 = false;
        int currentAccount = this.f37275a.getCurrentAccount();
        TL_wallet.card cardVar = this.f37280b1;
        TL_wallet.card cardVar2 = new TL_wallet.card();
        TL_wallet.card cardVar3 = this.f37280b1;
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
            s7 s7Var3 = (s7) this.f37288f.get(inputwalletcardsticker3.nft_address);
            if (s7Var3 != null && s7Var3.f37226b != null) {
                TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                cardsticker.nft = s7Var3.f37226b;
                cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                cardVar2.stickers.add(cardsticker);
                if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                    cardVar2.bg_nft_item = s7Var3.f37226b;
                }
            }
        }
        e0(currentAccount, cardVar2);
        this.f37290f1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new Object(), new lg(this, currentAccount, cardVar, 3));
    }

    public final TL_wallet.cardSticker R(String str) {
        ArrayList<TL_wallet.cardSticker> arrayList;
        TL_wallet.card cardVar = this.f37280b1;
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

    public final void S(g7 g7Var) {
        int i10;
        int i11;
        removeCallbacks(this.A1);
        this.f37316s0 = true;
        this.f37308p0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        g7Var.animate().cancel();
        g7Var.n(g7Var.getScaleX() * g7Var.f36604y0);
        g7Var.setScaleX(1.0f);
        g7Var.setScaleY(1.0f);
        g7Var.m(1.0f, 150L, null);
        final s7 v = v(g7Var.f36602w0);
        String str = v.f37224a;
        if (!b(v) && !v.b()) {
            this.f37316s0 = false;
            return;
        }
        k80 I = k80.I(this.f37275a, g7Var);
        I.f29868s = 51;
        if (m(v) || str.equals(this.P0)) {
            int i12 = R.drawable.msg_colors;
            if (str.equals(this.P0)) {
                i10 = R.string.WalletGiftRemoveColor;
            } else {
                i10 = R.string.WalletGiftApplyColor;
            }
            I.c(i12, LocaleController.getString(i10), new Runnable(this) {
                public final t7 f36791b;

                {
                    this.f36791b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f36791b.c0(v);
                            return;
                        default:
                            t7 t7Var = this.f36791b;
                            t7Var.getClass();
                            t7Var.b0(v.f37226b);
                            return;
                    }
                }
            }, false);
        }
        int i13 = R.drawable.msg_sticker;
        if (v.b()) {
            i11 = R.string.WalletGiftRemoveFromCard;
        } else {
            i11 = R.string.WalletGiftAddToCard;
        }
        I.c(i13, LocaleController.getString(i11), new Runnable(this) {
            public final t7 f36791b;

            {
                this.f36791b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f36791b.c0(v);
                        return;
                    default:
                        t7 t7Var = this.f36791b;
                        t7Var.getClass();
                        t7Var.b0(v.f37226b);
                        return;
                }
            }
        }, false);
        I.f29863p = new l7(this, 0);
        I.Z();
        performHapticFeedback(0);
    }

    public final float U() {
        return this.Y0 * 0.231f;
    }

    public final void V(s7 s7Var) {
        if (s7Var.f37224a.equals(this.P0)) {
            l();
        }
        s7Var.N = false;
        g(s7Var);
        g7 j10 = j(s7Var);
        if (j10 != null) {
            j10.setScaleX(0.93f);
            j10.setScaleY(0.93f);
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        O();
        f0();
    }

    public final void W(s7 s7Var, float f7, float f10) {
        boolean z10;
        float[] fArr;
        boolean z11;
        this.f37293h0 = null;
        this.m0 = true;
        if (this.K0 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37306o0 = z10;
        if (this.f37294h1) {
            if (s7Var == this.f37300k1 && !z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f37296i1 = z11;
            this.f37298j1 = false;
            this.f37294h1 = false;
            MessagesController.getGlobalMainSettings().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z12 = s7Var.N;
        r7 r7Var = s7Var.f37237m;
        r7 r7Var2 = s7Var.f37231f;
        r7 r7Var3 = s7Var.e;
        float f11 = 1.0f;
        if (z12) {
            s7Var.N = false;
            r7 r7Var4 = s7Var.h;
            r7Var4.d = 420.0f;
            r7Var4.e = 0.8f;
            r7Var4.f37192b = 1.0f;
        }
        g7 j10 = j(s7Var);
        if (j10 != null) {
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.f37318t0 = false;
        if (this.f37306o0) {
            fArr = L(r7Var3.f37191a, r7Var2.f37191a);
        } else {
            RectF Z = Z(s7Var);
            if (Z == null) {
                return;
            }
            float[] fArr2 = {Z.centerX(), Z.centerY()};
            r7 r7Var5 = s7Var.f37232g;
            r7Var5.d = 500.0f;
            r7Var5.e = 0.75f;
            r7Var5.a((f(s7Var) * Z.width()) / U());
            r7Var.a(0.0f);
            m5.i0((m5) this.d.f18010c, 0L);
            fArr = fArr2;
        }
        r7Var3.d = 1100.0f;
        r7Var3.e = 0.9f;
        r7Var3.a(fArr[0]);
        r7Var2.d = 1100.0f;
        r7Var2.e = 0.9f;
        r7Var2.a(fArr[1]);
        s7Var.H = 3;
        long j11 = this.N0 + 1;
        this.N0 = j11;
        s7Var.I = j11;
        r7Var.f37192b = 1.0f;
        r7 r7Var6 = s7Var.f37234j;
        r7Var6.d = 320.0f;
        r7Var6.e = 0.75f;
        r7Var6.f37192b = 1.0f;
        s7Var.f37236l.a(0.0f);
        this.f37333z0 = fArr[0] - f7;
        this.A0 = fArr[1] - f10;
        if (!this.f37306o0) {
            f11 = 0.0f;
        }
        this.N.f37192b = f11;
        performHapticFeedback(3);
    }

    public final void X(s7 s7Var, boolean z10) {
        this.S0 = this.T0;
        this.T0 = s7Var;
        this.U0 = 0.0f;
        this.X0 = z10;
        if (s7Var != null) {
            this.V0 = s7Var.e.f37192b / this.Y0;
            this.W0 = s7Var.f37231f.f37192b / this.Z0;
        }
        f0();
    }

    public final void Y(d0 d0Var) {
        TL_wallet.nftItem nftitem;
        ArrayList arrayList = d0Var.f36442a;
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
        Iterator it = this.f37288f.values().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            s7 s7Var = (s7) it.next();
            int i11 = s7Var.H;
            String str = s7Var.f37224a;
            if (i11 != 3) {
                ArrayList arrayList2 = d0Var.f36444c;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                        if (!wallettransaction.failed && (nftitem = wallettransaction.nft) != null && l0.a(nftitem.address, str)) {
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
        if (z10 && !this.f37278b) {
            O();
            k();
        }
        f0();
    }

    public final RectF Z(s7 s7Var) {
        g7 j10 = j(s7Var);
        if (j10 != null && j10.isShown()) {
            Matrix matrix = this.v;
            w5.k(j10, matrix);
            Matrix matrix2 = this.f37324w;
            w5.k(this, matrix2);
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
        this.f37310q0 = false;
        removeCallbacks(this.B1);
        removeCallbacks(this.A1);
        this.f37291g0 = null;
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        f0();
    }

    public final TL_stories.TL_mediaAreaCoordinates a0(s7 s7Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float U = U() * s7Var.h.f37192b;
        tL_mediaAreaCoordinates.f22263x = N((s7Var.e.f37192b / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.f22264y = N((s7Var.f37231f.f37192b / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.f22262w = N((U / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.h = N((U / this.Z0) * 100.0f);
        float f7 = s7Var.f37233i.f37192b % 360.0f;
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
        s7 v = v(nftitem);
        if (v.b()) {
            if (this.d.f0()) {
                E(v);
            } else {
                V(v);
            }
        } else if (v.H == 0 && b(v)) {
            d0(v);
        }
        k();
    }

    public final void c0(s7 s7Var) {
        String str = s7Var.f37224a;
        if (str.equals(this.P0)) {
            l();
        } else if (m(s7Var)) {
            this.P0 = str;
            if (s7Var.b()) {
                X(s7Var, false);
                k();
            } else {
                this.Q0 = str;
                d0(s7Var);
                if (s7Var.H == 0) {
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
        s7 s7Var;
        s7 s7Var2;
        int i10;
        this.f37280b1 = cardVar;
        this.f37283c1 = T(cardVar);
        if (!this.f37285d1 && this.f37290f1 == 0 && !this.f37308p0) {
            TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
            s7 s7Var3 = null;
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
            if (this.f37278b) {
                TL_wallet.nftItem nftitem3 = cardVar.bg_nft_item;
                if (nftitem3 != null && nftitem3.gift != null) {
                    s7Var3 = v(nftitem3);
                }
                this.S0 = s7Var3;
                this.T0 = s7Var3;
                this.U0 = 1.0f;
                e();
                f0();
            } else if (!A()) {
                f0();
            } else {
                this.f37287e1 = true;
                ArrayList G = G();
                int size2 = G.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj = G.get(i12);
                    i12++;
                    s7 s7Var4 = (s7) obj;
                    if (s7Var4.K && (i10 = s7Var4.H) != 3 && i10 != 4 && i10 != 5) {
                        TL_wallet.cardSticker R = R(s7Var4.f37224a);
                        if (R != null) {
                            if (!s7Var4.b() || !y(a0(s7Var4)).equals(y(R.coordinates))) {
                                K(s7Var4, R.coordinates, s7Var4.N);
                            }
                        } else if (s7Var4.b()) {
                            E(s7Var4);
                        }
                    }
                }
                ArrayList<TL_wallet.cardSticker> arrayList2 = cardVar.stickers;
                LinkedHashMap linkedHashMap = this.f37288f;
                if (arrayList2 != null) {
                    int size3 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        TL_wallet.cardSticker cardsticker2 = arrayList2.get(i13);
                        i13++;
                        TL_wallet.nftItem nftitem4 = cardsticker2.nft;
                        if (nftitem4 == null) {
                            s7Var2 = null;
                        } else {
                            s7Var2 = (s7) linkedHashMap.get(nftitem4.address);
                        }
                        if (s7Var2 != null && s7Var2.H == 2) {
                            long j10 = this.N0 + 1;
                            this.N0 = j10;
                            s7Var2.I = j10;
                        }
                    }
                }
                if (!equals) {
                    String str2 = this.P0;
                    if (str2 == null) {
                        s7Var = null;
                    } else {
                        s7Var = (s7) linkedHashMap.get(str2);
                    }
                    if (s7Var != null && s7Var.b()) {
                        X(s7Var, false);
                    } else {
                        X(null, true);
                    }
                }
                this.f37287e1 = false;
                O();
                f0();
            }
        }
    }

    public final void d0(s7 s7Var) {
        m5.i0((m5) this.d.f18010c, 2600L);
        if (A()) {
            float[] x9 = x(s7Var, Float.NaN, Float.NaN, true);
            RectF Z = Z(s7Var);
            if (x9 != null && Z != null) {
                s7Var.f37232g.a((f(s7Var) * Z.width()) / U());
                s7Var.f37237m.a(0.0f);
                s7Var.f37234j.a(1.0f);
                float[] fArr = {Z.centerX(), Z.centerY()};
                this.f37315s.mapPoints(fArr);
                I(s7Var, fArr, x9, true);
                performHapticFeedback(3);
                return;
            }
            g7 j10 = j(s7Var);
            if (j10 != null) {
                j10.animate().rotation(3.0f).setDuration(90L).withEndAction(new j7(j10, 0)).start();
            }
        }
    }

    public final void e() {
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2;
        float pow;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4;
        s7 s7Var = this.S0;
        if (s7Var == null) {
            stargiftattributebackdrop = null;
        } else {
            stargiftattributebackdrop = s7Var.f37244t;
        }
        float[] i10 = h7.i(stargiftattributebackdrop);
        s7 s7Var2 = this.T0;
        if (s7Var2 == null) {
            stargiftattributebackdrop2 = null;
        } else {
            stargiftattributebackdrop2 = s7Var2.f37244t;
        }
        float[] i11 = h7.i(stargiftattributebackdrop2);
        float f7 = 1.0f;
        if (this.X0) {
            float f10 = this.U0;
            pow = c3.h0.D(f10, 2.0f, 3.0f, f10 * f10);
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
        s7 s7Var3 = this.S0;
        if (s7Var3 == null) {
            stargiftattributebackdrop3 = null;
        } else {
            stargiftattributebackdrop3 = s7Var3.f37244t;
        }
        h7.m(fArr, 0, stargiftattributebackdrop3);
        s7 s7Var4 = this.T0;
        if (s7Var4 == null) {
            stargiftattributebackdrop4 = null;
        } else {
            stargiftattributebackdrop4 = s7Var4.f37244t;
        }
        h7.m(fArr, 1, stargiftattributebackdrop4);
        this.f37281c.setStickerStyle(fArr);
    }

    public final float f(s7 s7Var) {
        g7 j10 = j(s7Var);
        if (j10 != null) {
            org.telegram.ui.Components.y9 y9Var = j10.f53010y;
            if (j10.getWidth() > 0 && y9Var.getWidth() > 0) {
                return ((y9Var.getWidth() / j10.getWidth()) * 288.0f) / 268.0f;
            }
            return 0.77f;
        }
        return 0.77f;
    }

    public final void f0() {
        if (!this.f37277a1 && isAttachedToWindow()) {
            o7 o7Var = this.C1;
            removeCallbacks(o7Var);
            postOnAnimation(o7Var);
        }
    }

    public final void g(s7 s7Var) {
        s7Var.H = 0;
        s7Var.J = 0L;
        s7Var.f37232g.a(1.0f);
        s7Var.h.a(1.0f);
        s7Var.f37233i.a(0.0f);
        s7Var.f37237m.a(0.0f);
        s7Var.f37234j.a(0.0f);
        s7Var.f37235k.a(0.0f);
        g7 j10 = j(s7Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.setScaleX(1.0f);
            j10.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - AndroidUtilities.dp(64.0f)) - AndroidUtilities.navigationBarHeight;
    }

    public final void i(g7 g7Var) {
        float f7;
        ArrayList arrayList = this.h;
        if (!arrayList.contains(g7Var)) {
            arrayList.add(g7Var);
        }
        s7 v = v(g7Var.f36602w0);
        if (v.H == 0) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        g7Var.k(v.R, false, f7);
        f0();
    }

    public final g7 j(s7 s7Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g7 g7Var = (g7) obj;
            if (g7Var.isAttachedToWindow() && g7Var.f36602w0.address.equals(s7Var.f37224a)) {
                return g7Var;
            }
        }
        return null;
    }

    public final void k() {
        if (!this.f37278b && !this.f37287e1) {
            this.f37285d1 = true;
            l7 l7Var = this.f37292g1;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            AndroidUtilities.runOnUIThread(l7Var, 1500L);
        }
    }

    public final void l() {
        this.Q0 = null;
        this.P0 = null;
        X(null, true);
        O();
        k();
    }

    public final boolean m(s7 s7Var) {
        if (b(s7Var) && F(this.f37275a.getCurrentAccount(), s7Var.f37226b.gift.slug)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f37332y1);
        getViewTreeObserver().addOnPreDrawListener(this.f37334z1);
        for (s7 s7Var : this.f37288f.values()) {
            s7Var.f37228c.onAttachedToWindow();
            s7Var.d.onAttachedToWindow();
        }
        f0();
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.f37332y1);
        getViewTreeObserver().removeOnPreDrawListener(this.f37334z1);
        removeCallbacks(this.C1);
        removeCallbacks(this.A1);
        for (s7 s7Var : this.f37288f.values()) {
            s7Var.f37228c.onDetachedFromWindow();
            s7Var.d.onDetachedFromWindow();
        }
        this.M0 = 0L;
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        Rect rect;
        float f14;
        int i11;
        float f15;
        s7 s7Var;
        RectF rectF;
        ArrayList arrayList;
        r7 r7Var;
        t7 t7Var = this;
        Canvas canvas2 = canvas;
        if (t7Var.A()) {
            float f16 = t7Var.N.f37191a;
            int i12 = (f16 > 0.01f ? 1 : (f16 == 0.01f ? 0 : -1));
            RectF rectF2 = t7Var.H;
            Paint paint = t7Var.f37327x;
            if (i12 < 0) {
                f10 = 0.0f;
                f11 = 2.0f;
                i10 = 0;
                f12 = 0.6f;
                f7 = 0.4f;
            } else {
                float max = Math.max(0.0f, Math.min(1.2f, t7Var.O.f37191a));
                float clamp01 = Utilities.clamp01(max);
                f7 = 0.4f;
                Paint paint2 = t7Var.G;
                paint2.setTextSize(AndroidUtilities.dp(15.0f));
                float measureText = (((paint2.measureText(LocaleController.getString(R.string.Remove)) + AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(56.0f)) * max) + AndroidUtilities.dp(56.0f);
                canvas2.save();
                f10 = 0.0f;
                canvas2.translate(t7Var.getWidth() / 2.0f, ((1.0f - f16) * AndroidUtilities.dp(90.0f)) + t7Var.h());
                float f17 = (f16 * 0.4f) + 0.6f;
                canvas2.scale(f17, f17);
                int i13 = org.telegram.ui.ActionBar.y6.f23356d6;
                org.telegram.ui.ActionBar.r2 r2Var = t7Var.f37275a;
                paint.setColor(i0.a.f(clamp01, org.telegram.ui.ActionBar.y6.w0(i13, r2Var.getResourceProvider()), -1750963));
                paint.setAlpha((int) (Utilities.clamp01(f16) * 255.0f));
                float f18 = (-measureText) / 2.0f;
                float f19 = measureText / 2.0f;
                rectF2.set(f18, -AndroidUtilities.dp(28.0f), f19, AndroidUtilities.dp(28.0f));
                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), paint);
                float dp = (f18 + AndroidUtilities.dp(30.0f)) * clamp01;
                float dp2 = AndroidUtilities.dp(21.0f);
                int round = Math.round(t7Var.f37282c0.f37191a);
                f11 = 2.0f;
                xj0 xj0Var = t7Var.f37286e0;
                xj0Var.N(round, false, false);
                float f20 = dp - dp2;
                i10 = 0;
                f12 = 0.6f;
                float f21 = -dp2;
                float f22 = dp + dp2;
                xj0Var.setBounds((int) f20, (int) f21, (int) f22, (int) dp2);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.f(clamp01, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, r2Var.getResourceProvider()), -1), PorterDuff.Mode.SRC_IN);
                Paint paint3 = t7Var.f37284d0;
                paint3.setColorFilter(porterDuffColorFilter);
                paint3.setAlpha((int) (Utilities.clamp01(f16) * 255.0f));
                canvas2 = canvas;
                int saveLayer = canvas2.saveLayer(f20, f21, f22, dp2, paint3);
                xj0Var.draw(canvas2);
                canvas2.restoreToCount(saveLayer);
                if (clamp01 > 0.02f) {
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (Utilities.clamp01((clamp01 - 0.4f) / 0.6f) * 255.0f));
                    Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
                    canvas2.save();
                    canvas2.clipRect(AndroidUtilities.dp(22.0f) + dp, -AndroidUtilities.dp(28.0f), f19 - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(28.0f));
                    canvas2.drawText(LocaleController.getString(R.string.Remove), dp + AndroidUtilities.dp(22.0f), (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f, paint2);
                    canvas2.restore();
                }
                canvas2.restore();
            }
            paint.setShader(null);
            paint.setColorFilter(null);
            paint.setAlpha(255);
            ArrayList G = t7Var.G();
            int size = G.size();
            int i14 = i10;
            while (i14 < size) {
                int i15 = i14 + 1;
                s7 s7Var2 = (s7) G.get(i14);
                r7 r7Var2 = s7Var2.e;
                r7 r7Var3 = s7Var2.f37233i;
                float f23 = r7Var2.f37191a;
                float f24 = s7Var2.f37231f.f37191a;
                float U = t7Var.U() * s7Var2.f37232g.f37191a * s7Var2.h.f37191a;
                float f25 = s7Var2.f37234j.f37191a;
                int i16 = s7Var2.H;
                if (i16 == 1 && s7Var2.O && f25 > 0.3f) {
                    float[] L = t7Var.L(f23 + s7Var2.f37238n.f37191a, f24 + s7Var2.f37239o.f37191a);
                    float f26 = L[i10];
                    float f27 = L[1];
                    U = c3.h0.C(f25, 0.15f, 1.0f, U);
                    f13 = f27;
                    f23 = f26;
                } else if (i16 != 3 && i16 != 4 && i16 != 5) {
                    i14 = i15;
                } else {
                    f13 = f24;
                }
                float f28 = U;
                Bitmap a2 = s7Var2.a();
                if (a2 != null) {
                    if (f28 >= 1.0f) {
                        canvas2.save();
                        canvas2.rotate(r7Var3.f37191a, f23, f13);
                        Paint paint4 = paint;
                        t7Var.t(canvas2, s7Var2, f23, (AndroidUtilities.dp(5.0f) * f25) + AndroidUtilities.dp(1.5f) + f13, c3.h0.C(f25, 0.04f, 1.0f, f28), f25, 0.0f, 1.0f);
                        canvas.restore();
                        float clamp012 = Utilities.clamp01(s7Var2.f37237m.f37191a);
                        if (s7Var2.H == 4 && s7Var2.W > f12 && t7Var.j(s7Var2) != null) {
                            float clamp013 = Utilities.clamp01((s7Var2.W - f12) / f7);
                            float f29 = (1.0f - ((3.0f - (clamp013 * f11)) * (clamp013 * clamp013))) * 0.45f;
                            float clamp014 = (1.0f - (Utilities.clamp01(-s7Var2.V) * f12)) * 0.55f;
                            if (clamp012 < 1.0f) {
                                paint4.setAlpha((int) ((1.0f - clamp012) * 255.0f));
                                ArrayList arrayList2 = G;
                                r7Var = r7Var3;
                                f15 = f28;
                                arrayList = arrayList2;
                                i11 = size;
                                rectF = rectF2;
                                f14 = f13;
                                s7Var = s7Var2;
                                t7Var.r(canvas, s7Var2.v, f23, f14, f15, f29, clamp014, r7Var3.f37191a, s7Var2.U, s7Var2.V);
                            } else {
                                f14 = f13;
                                i11 = size;
                                f15 = f28;
                                s7Var = s7Var2;
                                rectF = rectF2;
                                arrayList = G;
                                r7Var = r7Var3;
                            }
                            if (clamp012 > f10) {
                                paint4.setAlpha((int) (clamp012 * 255.0f));
                                canvas2 = canvas;
                                r(canvas2, a2, f23, f14, f15, f29, clamp014, r7Var.f37191a, s7Var.U, s7Var.V);
                            } else {
                                canvas2 = canvas;
                            }
                            paint4.setAlpha(255);
                            paint = paint4;
                            rectF2 = rectF;
                            i14 = i15;
                            G = arrayList;
                            size = i11;
                            t7Var = this;
                        } else {
                            float f30 = f13;
                            ArrayList arrayList3 = G;
                            int i17 = size;
                            RectF rectF3 = rectF2;
                            canvas2 = canvas;
                            canvas2.save();
                            canvas2.rotate(r7Var3.f37191a, f23, f30);
                            float f31 = f28 / f11;
                            rectF3.set(f23 - f31, f30 - f31, f23 + f31, f31 + f30);
                            if (clamp012 < 1.0f) {
                                paint4.setAlpha((int) ((1.0f - clamp012) * 255.0f));
                                rect = null;
                                canvas2.drawBitmap(s7Var2.v, (Rect) null, rectF3, paint4);
                            } else {
                                rect = null;
                            }
                            if (clamp012 > f10) {
                                paint4.setAlpha((int) (clamp012 * 255.0f));
                                canvas2.drawBitmap(a2, rect, rectF3, paint4);
                            }
                            paint4.setAlpha(255);
                            canvas2.restore();
                            paint = paint4;
                            rectF2 = rectF3;
                            i14 = i15;
                            G = arrayList3;
                            size = i17;
                            t7Var = this;
                        }
                    }
                } else {
                    t7Var = this;
                }
                i14 = i15;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        f0();
    }

    public final void p() {
        AndroidUtilities.removeFromParent(this.f37326w1);
        AndroidUtilities.removeFromParent(this.f37329x1);
        this.f37329x1 = null;
        this.f37326w1 = null;
        O();
        AndroidUtilities.cancelRunOnUIThread(this.f37292g1);
        this.f37293h0 = null;
        this.f37277a1 = true;
        if (this.f37285d1) {
            Q();
        }
        this.f37286e0.C(false);
        removeCallbacks(this.C1);
        removeCallbacks(this.A1);
        removeCallbacks(this.B1);
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        for (s7 s7Var : this.f37288f.values()) {
            s7Var.f37228c.onDetachedFromWindow();
            s7Var.d.onDetachedFromWindow();
        }
        this.h.clear();
    }

    public final void q(org.telegram.ui.Wallet.s7 r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.t7.q(org.telegram.ui.Wallet.s7, float, float):void");
    }

    public final void r(Canvas canvas, Bitmap bitmap, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17;
        float f18;
        float f19 = f11;
        float f20 = (f19 * f12) + ((-f19) / 2.0f);
        float f21 = 0.3f * f19;
        float f22 = 3.2f * f19;
        float f23 = 0.72f * f13;
        float f24 = f21 * f23;
        double d = f14;
        float cos = (float) Math.cos(Math.toRadians(d));
        float sin = (float) Math.sin(Math.toRadians(d));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 <= 14) {
                int i12 = 0;
                for (int i13 = 14; i12 <= i13; i13 = 14) {
                    float f25 = ((i12 / 14.0f) - 0.5f) * f19;
                    float f26 = ((i10 / 14.0f) - 0.5f) * f19;
                    float f27 = (f25 * cos) - (f26 * sin);
                    float f28 = (f26 * cos) + (f25 * sin);
                    float f29 = (f28 * f16) + (f27 * f15);
                    float f30 = (f28 * f15) + ((-f27) * f16);
                    float f31 = f20 - f29;
                    float f32 = 0.0f;
                    float f33 = 1.0f;
                    if (f31 > 0.0f) {
                        float min = Math.min(f23, f31 / f21);
                        float max = Math.max(0.0f, f31 - f24);
                        f17 = f21;
                        f18 = f20;
                        double d10 = min;
                        float sin2 = (f18 - (((float) Math.sin(d10)) * f17)) - (((float) Math.cos(d10)) * max);
                        float sin3 = (max * ((float) Math.sin(d10))) + ((1.0f - ((float) Math.cos(d10))) * f17);
                        f33 = (((float) Math.cos(d10)) * 0.38f) + 0.62f;
                        f29 = sin2;
                        f32 = sin3;
                    } else {
                        f17 = f21;
                        f18 = f20;
                    }
                    float f34 = f22 / (f22 - f32);
                    int i14 = i11 * 2;
                    float[] fArr = this.J;
                    fArr[i14] = (((f29 * f15) - (f30 * f16)) * f34) + f7;
                    fArr[i14 + 1] = org.telegram.ui.d3.e(f30, f15, f29 * f16, f34, f10) - (f32 * 0.15f);
                    int i15 = (int) (255.0f * f33);
                    this.K[i11] = Color.rgb(i15, i15, i15);
                    i12++;
                    f19 = f11;
                    i11++;
                    f20 = f18;
                    f21 = f17;
                }
                i10++;
                f19 = f11;
                f20 = f20;
            } else {
                canvas.drawBitmapMesh(bitmap, 14, 14, this.J, 0, this.K, 0, this.f37327x);
                return;
            }
        }
    }

    public final void s(Canvas canvas, s7 s7Var, float f7, float f10, boolean z10) {
        float f11;
        ImageReceiver imageReceiver = s7Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = s7Var.f37244t;
        Bitmap bitmap = imageReceiver.getBitmap();
        if (bitmap != null && stargiftattributebackdrop != null) {
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
            this.f37281c.h(path, this.Y0, this.Z0);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 >= 0 && !z10) {
                path.rewind();
                path.addCircle(this.V0 * this.Y0, this.W0 * this.Z0, f10, direction);
                canvas.clipPath(path);
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
            Paint paint = this.f37327x;
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
                    float clamp01 = Utilities.clamp01(Math.min(Math.min(i13, 336 - i13), Math.min(i14, 205 - i14)) / 48.0f);
                    float f21 = f15;
                    float D = f7 * f19 * c3.h0.D(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
                    if (i10 >= 0) {
                        float clamp012 = Utilities.clamp01((f10 - Utilities.dist(f17, f18, this.V0 * this.Y0, this.W0 * this.Z0)) / AndroidUtilities.dp(120.0f));
                        if (z10) {
                            f20 = c3.h0.D(clamp012, 0.8f, 1.0f, f20);
                            D *= 1.0f - Utilities.clamp01(clamp012 * 1.6f);
                        } else {
                            f11 = f17;
                            f20 *= (((((float) Math.sin(clamp012 * 3.141592653589793d)) * 0.28f) + clamp012) * 0.8f) + 0.2f;
                            D *= Utilities.clamp01(clamp012 * 1.6f);
                            paint.setAlpha((int) (D * 255.0f));
                            float f22 = f20 / 2.0f;
                            RectF rectF = this.H;
                            rectF.set(f11 - f22, f18 - f22, f11 + f22, f18 + f22);
                            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
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
                    canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint);
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

    public final void t(Canvas canvas, s7 s7Var, float f7, float f10, float f11, float f12, float f13, float f14) {
        if (f14 > 0.01f && s7Var.f37246w != null) {
            float f15 = (((0.05f * f12) + 1.0f) * ((f11 * 176.0f) / 128.0f)) / 2.0f;
            float f16 = f7 - f15;
            float f17 = f10 - f15;
            float f18 = f7 + f15;
            float f19 = f10 + f15;
            RectF rectF = this.H;
            rectF.set(f16, f17, f18, f19);
            Paint paint = this.f37327x;
            int alpha = paint.getAlpha();
            paint.setColor(-16044452);
            float clamp01 = Utilities.clamp01(s7Var.f37237m.f37191a);
            paint.setAlpha((int) (clamp01 * Utilities.clamp01((f13 * 0.12f) + (f12 * (-0.049999997f)) + 0.16f) * 255.0f * f14));
            canvas.drawBitmap(s7Var.f37246w, (Rect) null, rectF, paint);
            paint.setColor(-1);
            paint.setAlpha(alpha);
        }
    }

    public final s7 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f37288f;
        s7 s7Var = (s7) linkedHashMap.get(str);
        if (s7Var == null) {
            s7Var = new s7(this, nftitem);
            linkedHashMap.put(nftitem.address, s7Var);
        }
        s7Var.f37226b = nftitem;
        return s7Var;
    }

    public final void w(float r19, float r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.t7.w(float, float, boolean):void");
    }

    public final float[] x(s7 s7Var, float f7, float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        float f13;
        ArrayList arrayList;
        float min;
        float f14;
        float f15;
        if (!z10) {
            s7Var.N = false;
            return new float[]{f7, f10, s7Var.h.f37192b};
        }
        ArrayList<RectF> stickerObstacles = this.f37281c.getStickerObstacles();
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
        float dp = AndroidUtilities.dp(32.0f) / U();
        float f18 = s7Var.h.f37192b;
        s7Var.N = false;
        ArrayList arrayList2 = new ArrayList();
        for (s7 s7Var2 : this.f37288f.values()) {
            if (s7Var2 != s7Var && s7Var2.b()) {
                arrayList2.add(s7Var2);
            }
        }
        if (!Float.isNaN(f7) && !Float.isNaN(f10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && s7Var == this.f37300k1 && this.f37302m1 != null && arrayList2.isEmpty()) {
            return (float[]) this.f37302m1.clone();
        }
        if (!z11) {
            f11 = this.Y0 * 0.6f;
            f12 = this.Z0 * 0.68f;
        } else {
            f11 = f7;
            f12 = f10;
        }
        Random random = new Random((System.nanoTime() / 400000000) + (arrayList2.size() * 31) + (s7Var.f37224a.hashCode() * 7919));
        float f19 = org.telegram.ui.d3.f(random, 0.04f, 0.05f);
        float f20 = 0.5f;
        float nextFloat = (((random.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.Y0;
        float nextFloat2 = this.Z0 * (((random.nextFloat() - 0.5f) * 0.08f) + 0.55f);
        float U = U() * dp * 0.5f;
        float f21 = -3.4028235E38f;
        float[] fArr = null;
        float f22 = U;
        while (f22 <= this.Z0 - U) {
            float f23 = f20;
            float f24 = U;
            while (true) {
                float f25 = this.Y0;
                if (f24 <= f25 - U) {
                    float min2 = Math.min(Math.min(f24, f25 - f24), Math.min(f22, this.Z0 - f22));
                    float f26 = f19;
                    float min3 = Math.min(Math.max(0.74f, 1.0f - (arrayList2.size() * f19)) * f18, min2 / (U() * f23));
                    int size2 = stickerObstacles.size();
                    float f27 = dp;
                    float f28 = f18;
                    int i11 = 0;
                    float f29 = Float.MAX_VALUE;
                    while (i11 < size2) {
                        ArrayList<RectF> arrayList3 = stickerObstacles;
                        RectF rectF2 = stickerObstacles.get(i11);
                        f29 = Math.min(f29, Utilities.dist(f24, f22, Math.max(rectF2.left, Math.min(rectF2.right, f24)), Math.max(rectF2.top, Math.min(rectF2.bottom, f22))));
                        i11++;
                        stickerObstacles = arrayList3;
                        z11 = z11;
                    }
                    ArrayList<RectF> arrayList4 = stickerObstacles;
                    boolean z12 = z11;
                    float min4 = Math.min(min3, f29 / (U() * 0.44f));
                    int i12 = 0;
                    for (int size3 = arrayList2.size(); i12 < size3; size3 = size3) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        s7 s7Var3 = (s7) obj;
                        min4 = Math.min(min4, (Utilities.dist(f24, f22, s7Var3.e.f37192b, s7Var3.f37231f.f37192b) / (U() * 0.29f)) - s7Var3.h.f37192b);
                    }
                    float clamp01 = ((Utilities.clamp01((min2 - ((U() * f23) * min4)) / AndroidUtilities.dp(14.0f)) * 0.1f) + 0.9f) * min4;
                    if (clamp01 < f27) {
                        arrayList = arrayList2;
                    } else {
                        if (arrayList2.isEmpty()) {
                            float f30 = this.Y0 * 0.6f;
                            float z13 = c3.h0.z(f11, f30, 0.2f, f30);
                            float f31 = this.Z0 * 0.68f;
                            f15 = (random.nextFloat() * AndroidUtilities.dp(5.0f)) + (U() * 1.1f * clamp01) + (Utilities.dist(f24, f22, z13, c3.h0.z(f12, f31, 0.2f, f31)) * (-0.45f));
                            f13 = clamp01;
                            arrayList = arrayList2;
                        } else {
                            float f32 = f22 * clamp01 * clamp01;
                            float f33 = clamp01 * clamp01;
                            int size4 = arrayList2.size();
                            float f34 = f24 * clamp01 * clamp01;
                            int i13 = 0;
                            float f35 = Float.MAX_VALUE;
                            float f36 = 0.0f;
                            while (i13 < size4) {
                                Object obj2 = arrayList2.get(i13);
                                int i14 = i13 + 1;
                                s7 s7Var4 = (s7) obj2;
                                float f37 = clamp01;
                                r7 r7Var = s7Var4.e;
                                int i15 = size4;
                                r7 r7Var2 = s7Var4.h;
                                ArrayList arrayList5 = arrayList2;
                                r7 r7Var3 = s7Var4.f37231f;
                                f35 = Math.min(f35, Utilities.dist(f24, f22, r7Var.f37192b, r7Var3.f37192b) - ((r7Var2.f37192b + f37) * (U() * 0.4f)));
                                float f38 = r7Var2.f37192b;
                                float f39 = f38 * f38;
                                float f40 = s7Var4.e.f37192b;
                                f34 = (f40 * f39) + f34;
                                f32 = (r7Var3.f37192b * f39) + f32;
                                f33 += f39;
                                f36 = Math.max(0.0f, 1.0f - (Math.abs(r7Var3.f37192b - f22) / (U() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f40 - f24) / (U() * 0.12f))) + f36;
                                clamp01 = f37;
                                i13 = i14;
                                size4 = i15;
                                arrayList2 = arrayList5;
                            }
                            f13 = clamp01;
                            arrayList = arrayList2;
                            float f41 = f32;
                            if (f35 < 0.0f) {
                                min = f35 * 2.5f;
                            } else {
                                min = Math.min(f35, U() * 0.3f);
                            }
                            float nextFloat3 = (random.nextFloat() * AndroidUtilities.dp(10.0f)) + (((((Math.min(Math.min(min2, f29), U()) * 0.2f) + ((U() * (f13 * 0.9f)) + (min * 1.2f))) - (Utilities.dist(f34 / f33, f41 / f33, nextFloat, nextFloat2) * 0.35f)) - ((U() * f36) * 0.08f)) - (Utilities.dist(f24, f22, this.Y0 * f23, this.Z0 * 0.55f) * 0.04f));
                            if (z12) {
                                f14 = Utilities.dist(f24, f22, f11, f12) * 0.04f;
                            } else {
                                f14 = 0.0f;
                            }
                            f15 = nextFloat3 - f14;
                        }
                        if (f15 > f21) {
                            f21 = f15;
                            fArr = new float[]{f24, f22, f13};
                            f24 += AndroidUtilities.dp(5.0f);
                            f19 = f26;
                            dp = f27;
                            f18 = f28;
                            stickerObstacles = arrayList4;
                            z11 = z12;
                            arrayList2 = arrayList;
                        }
                    }
                    f24 += AndroidUtilities.dp(5.0f);
                    f19 = f26;
                    dp = f27;
                    f18 = f28;
                    stickerObstacles = arrayList4;
                    z11 = z12;
                    arrayList2 = arrayList;
                }
            }
            f22 += AndroidUtilities.dp(5.0f);
            f20 = f23;
            f19 = f19;
        }
        return fArr;
    }

    public final boolean z(g7 g7Var) {
        if (g7Var.isShown()) {
            Rect rect = this.F1;
            if (g7Var.getGlobalVisibleRect(rect) && rect.width() >= g7Var.getWidth() - 1 && rect.height() >= g7Var.getHeight() - 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
