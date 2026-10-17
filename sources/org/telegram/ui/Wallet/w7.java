package org.telegram.ui.Wallet;

import android.content.Context;
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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.eg;
public final class w7 extends View {
    public static final int B1 = 0;
    public float A0;
    public final Rect A1;
    public float B0;
    public float C0;
    public float D0;
    public final RectF E;
    public float E0;
    public final Paint F;
    public int F0;
    public final Paint G;
    public boolean G0;
    public final RectF H;
    public long H0;
    public final Path I;
    public long I0;
    public final float[] J;
    public VelocityTracker J0;
    public final int[] K;
    public String K0;
    public final q7 L;
    public String L0;
    public final p7 M;
    public long M0;
    public final u7 N;
    public v7 N0;
    public final u7 O;
    public v7 O0;
    public final u7 P;
    public float P0;
    public final u7 Q;
    public float Q0;
    public final u7 R;
    public float R0;
    public final ArrayList S;
    public boolean S0;
    public final Path T;
    public float T0;
    public final Paint U;
    public float U0;
    public final LinearGradient V;
    public boolean V0;
    public final Matrix W;
    public TL_wallet.card W0;
    public String X0;
    public boolean Y0;
    public boolean Z0;
    public final org.telegram.ui.ActionBar.n2 f35042a;
    public float f35043a0;
    public int f35044a1;
    public final boolean f35045b;
    public float f35046b0;
    public final o7 f35047b1;
    public final v5 f35048c;
    public final u7 f35049c0;
    public boolean f35050c1;
    public final n2.e d;
    public final Paint f35051d0;
    public boolean f35052d1;
    public final SharedPreferences e;
    public final uj0 f35053e0;
    public boolean f35054e1;
    public final LinkedHashMap f35055f;
    public boolean f35056f0;
    public v7 f35057f1;
    public v7 f35058g0;
    public j7 f35059g1;
    public final ArrayList h;
    public boolean f35060h0;
    public float[] f35061h1;
    public boolean f35062i0;
    public float f35063i1;
    public boolean f35064j0;
    public final float[] f35065j1;
    public boolean f35066k0;
    public final u7 f35067k1;
    public boolean f35068l0;
    public final u7 l1;
    public boolean m0;
    public final Paint f35069m1;
    public final ArrayList f35070n;
    public boolean f35071n0;
    public final Paint f35072n1;
    public boolean f35073o0;
    public final Matrix f35074o1;
    public boolean f35075p0;
    public final Path f35076p1;
    public int f35077q0;
    public final RectF f35078q1;
    public final Matrix f35079r;
    public float f35080r0;
    public ei.x3 f35081r1;
    public final Matrix f35082s;
    public float f35083s0;
    public ei.x3 f35084s1;
    public float f35085t0;
    public final o1 f35086t1;
    public float f35087u0;
    public final x4 f35088u1;
    public final Matrix v;
    public float f35089v0;
    public final o7 f35090v1;
    public final Matrix f35091w;
    public float f35092w0;
    public final o7 f35093w1;
    public final Paint f35094x;
    public float f35095x0;
    public final r7 f35096x1;
    public final Paint f35097y;
    public float f35098y0;
    public final RectF f35099y1;
    public float f35100z0;
    public final Paint f35101z1;

    public w7(org.telegram.ui.ActionBar.n2 n2Var, v5 v5Var, n2.e eVar, TL_wallet.card cardVar) {
        super(n2Var.getContext());
        boolean z10;
        SharedPreferences sharedPreferences;
        boolean z11;
        this.f35055f = new LinkedHashMap();
        this.h = new ArrayList();
        this.f35070n = new ArrayList();
        this.f35079r = new Matrix();
        this.f35082s = new Matrix();
        this.v = new Matrix();
        this.f35091w = new Matrix();
        this.f35094x = new Paint(3);
        this.f35097y = new Paint(3);
        this.E = new RectF();
        Paint paint = new Paint(1);
        this.F = paint;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new RectF();
        this.I = new Path();
        this.J = new float[450];
        this.K = new int[225];
        this.N = new u7(0.0f, 260.0f, 0.78f);
        this.O = new u7(0.0f, 420.0f, 0.72f);
        this.P = new u7(1.0f, 420.0f, 0.38f);
        this.Q = new u7(0.0f, 170.0f, 0.42f);
        this.R = new u7(0.0f, 170.0f, 0.42f);
        this.S = new ArrayList();
        this.T = new Path();
        Paint paint3 = new Paint(1);
        this.U = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.V = linearGradient;
        this.W = new Matrix();
        this.f35049c0 = new u7(0.0f, 120.0f, 1.0f);
        this.f35051d0 = new Paint(1);
        this.P0 = 1.0f;
        this.Q0 = 0.5f;
        this.R0 = 0.5f;
        this.f35047b1 = new o7(this, 1);
        this.f35065j1 = new float[3];
        this.f35067k1 = new u7(0.0f, 260.0f, 1.0f);
        this.l1 = new u7(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.f35069m1 = paint4;
        Paint paint5 = new Paint(1);
        this.f35072n1 = paint5;
        this.f35074o1 = new Matrix();
        this.f35076p1 = new Path();
        this.f35078q1 = new RectF();
        this.f35086t1 = new o1(this, 1);
        this.f35088u1 = new x4(2, this);
        this.f35090v1 = new o7(this, 2);
        this.f35093w1 = new o7(this, 3);
        this.f35096x1 = new r7(this);
        this.f35099y1 = new RectF();
        Paint paint6 = new Paint(1);
        this.f35101z1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.A1 = new Rect();
        this.f35042a = n2Var;
        if (cardVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35045b = z10;
        uj0 uj0Var = new uj0(R.raw.wallet_gift_trash, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
        this.f35053e0 = uj0Var;
        uj0Var.R(this);
        this.f35048c = v5Var;
        this.d = eVar;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z10) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + n2Var.getCurrentAccount() + "_" + m0.w(n2Var.getCurrentAccount()).s(), 0);
        }
        this.e = sharedPreferences;
        this.K0 = z10 ? null : sharedPreferences.getString("style", null);
        if (!z10 && !MessagesController.getGlobalMainSettings().getBoolean("walletcardstickerhint", false)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35050c1 = z11;
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
        p7 p7Var = new p7(this, getContext());
        this.M = p7Var;
        q7 q7Var = new q7(this, getContext());
        this.L = q7Var;
        v5Var.getFrontFace().addView(p7Var, 0, w7.z5.d(-1.0f, -1));
        v5Var.getFrontFace().addView(q7Var, v5Var.getStickerLayerIndex(), w7.z5.d(-1.0f, -1));
        if (z10) {
            q7Var.addOnLayoutChangeListener(new l7(this, 0));
            d(cardVar);
            return;
        }
        int currentAccount = n2Var.getCurrentAccount();
        MessagesController messagesController = MessagesController.getInstance(currentAccount);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        TLRPC.UserFull userFull = messagesController.getUserFull(clientUserId);
        if (userFull != null) {
            TL_wallet.card cardVar2 = userFull.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
            return;
        }
        messagesController.loadFullUser(messagesController.getUser(Long.valueOf(clientUserId)), 0, true, new l(this, 4));
    }

    public static String A(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        if (mediaAreaCoordinates == null) {
            return "";
        }
        return String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.f20503x), Double.valueOf(mediaAreaCoordinates.f20504y), Double.valueOf(mediaAreaCoordinates.f20502w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public static boolean H(int i10, String str) {
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

    public static Path L(v7 v7Var) {
        Bitmap bitmap;
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        if (v7Var != null && v7Var.F == null && (bitmap = v7Var.f35014u) != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
            int[] iArr = new int[16384];
            createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
            if (createScaledBitmap != v7Var.f35014u) {
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
                    v7Var.F = path;
                    return path;
                }
                return null;
            }
            return null;
        } else if (v7Var == null) {
            return null;
        } else {
            return v7Var.F;
        }
    }

    public static void N(ei.x3 x3Var, float f7, float f10) {
        o(x3Var, 3);
        x3Var.m(0.0f, f7 - x3Var.getPaddingLeft());
        x3Var.setTranslationY(f10 - x3Var.getLayoutParams().height);
        x3Var.invalidate();
    }

    public static double Q(float f7) {
        return Math.round(f7 * 100.0f) / 100.0d;
    }

    public static String V(TL_wallet.card cardVar) {
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
                    sb2.append(A(cardsticker2.coordinates));
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

    public static boolean b(v7 v7Var) {
        TL_wallet.nftItem nftitem;
        if (v7Var != null && (nftitem = v7Var.f34995b) != null && nftitem.gift != null) {
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

    public static void g0(int i10, TL_wallet.card cardVar) {
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

    public static void o(ei.x3 x3Var, int i10) {
        if ((x3Var.getTag() instanceof Integer) && ((Integer) x3Var.getTag()).intValue() == i10) {
            return;
        }
        x3Var.setTag(Integer.valueOf(i10));
        x3Var.f10066a = i10;
        x3Var.m(1.0f, 0.0f);
    }

    public static float u(float f7, float f10, float f11) {
        float clamp01 = Utilities.clamp01((f7 - f10) / (f11 - f10));
        return com.google.android.gms.internal.cast.a6.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
    }

    public final boolean B(j7 j7Var) {
        if (j7Var.isShown()) {
            Rect rect = this.A1;
            if (j7Var.getGlobalVisibleRect(rect) && rect.width() >= j7Var.getWidth() - 1 && rect.height() >= j7Var.getHeight() - 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean C() {
        v5 v5Var = this.f35048c;
        this.T0 = v5Var.getFrontFace().getWidth();
        float height = v5Var.getFrontFace().getHeight();
        this.U0 = height;
        if (this.T0 > 0.0f && height > 0.0f) {
            Matrix matrix = this.f35079r;
            if (v5Var.i(this, matrix) && matrix.invert(this.f35082s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ei.x3 D(int i10, boolean z10) {
        float f7;
        ei.x3 x3Var = new ei.x3(getContext(), 3);
        x3Var.p(true);
        if (z10) {
            f7 = 15.0f;
        } else {
            f7 = 11.0f;
        }
        x3Var.k(11.0f, 6.0f, f7, 7.0f);
        x3Var.i(z10);
        x3Var.K = Layout.Alignment.ALIGN_NORMAL;
        x3Var.q(12.0f);
        x3Var.d = -1L;
        String string = LocaleController.getString(i10);
        x3Var.h = ei.x3.a(string, x3Var.getTextPaint());
        x3Var.s(string);
        x3Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        x3Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(x3Var, w7.z5.e(-1, 150, 48));
        return x3Var;
    }

    public final boolean E() {
        Path L;
        if (this.f35061h1 == null) {
            L = null;
        } else {
            L = L(this.f35057f1);
        }
        if (L == null) {
            return false;
        }
        float W = W() * this.f35061h1[2];
        Matrix matrix = this.f35074o1;
        matrix.setScale(W, W);
        float[] fArr = this.f35061h1;
        matrix.postTranslate(fArr[0], fArr[1]);
        L.transform(matrix, this.f35076p1);
        return true;
    }

    public final float[] F(float f7) {
        float[] fArr = this.f35065j1;
        fArr[0] = (u(f7, 0.45f, 0.82f) - u(f7, 1.3f, 1.72f)) * 0.9f;
        fArr[1] = (((float) Math.sin(Utilities.clamp01((f7 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f7, 0.6f, 0.92f) - u(f7, 1.18f, 1.46f));
        fArr[2] = u(f7, 1.58f, 1.7f) - u(f7, 1.7f, 1.92f);
        return fArr;
    }

    public final void G(v7 v7Var) {
        float f7;
        float f10;
        float f11;
        float f12;
        v7Var.J = 0L;
        u7 u7Var = v7Var.h;
        u7 u7Var2 = v7Var.f35000f;
        u7 u7Var3 = v7Var.e;
        if (v7Var.f34993a.equals(this.K0)) {
            l();
        }
        if (v7Var.b()) {
            float[] P = P(u7Var3.f34937a, u7Var2.f34937a);
            u7Var3.a(P[0]);
            u7Var2.a(P[1]);
        }
        v7Var.H = 4;
        v7Var.W = 0.0f;
        v7Var.X = u7Var3.f34937a;
        v7Var.Y = u7Var2.f34937a;
        v7Var.Z = v7Var.f35001g.f34937a * u7Var.f34937a;
        v7Var.f34994a0 = v7Var.f35002i.f34937a;
        if (this.f35080r0 > AndroidUtilities.dp(650.0f)) {
            f7 = 0.32f;
        } else {
            f7 = 0.44f;
        }
        v7Var.f34996b0 = f7;
        this.f35080r0 = 0.0f;
        j7 j10 = j(v7Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.n();
        }
        if (j10 != null) {
            f10 = j10.getScaleX();
        } else {
            f10 = 1.0f;
        }
        v7Var.f34998c0 = f10;
        RectF b02 = b0(v7Var);
        if (b02 != null) {
            float centerX = b02.centerX() - v7Var.X;
            float centerY = b02.centerY() - v7Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            if (hypot > AndroidUtilities.dp(6.0f)) {
                f11 = centerX / hypot;
            } else {
                f11 = 0.0f;
            }
            v7Var.U = f11;
            if (hypot > AndroidUtilities.dp(6.0f)) {
                f12 = centerY / hypot;
            } else {
                f12 = 1.0f;
            }
            v7Var.V = f12;
        }
        v7Var.f35005l.a(0.0f);
        u7Var.a(1.0f);
        long j11 = this.I0 + 1;
        this.I0 = j11;
        v7Var.I = j11;
        R();
        h0();
    }

    public final float[] I(v7 v7Var, float f7, float f10, ArrayList arrayList) {
        float dp = AndroidUtilities.dp(32.0f) / W();
        float f11 = v7Var.h.f34938b;
        for (float f12 = f11; f12 >= dp - 0.001f; f12 -= 0.06f) {
            float[] w9 = w(v7Var, f7, f10, f12, arrayList);
            if (w9 != null && Utilities.dist(w9[0], w9[1], f7, f10) <= AndroidUtilities.dp(26.0f)) {
                return w9;
            }
        }
        return w(v7Var, f7, f10, f11, arrayList);
    }

    public final ArrayList J() {
        ArrayList<RectF> stickerObstacles = this.f35048c.getStickerObstacles();
        float f7 = this.T0 * 0.012f;
        int size = stickerObstacles.size();
        int i10 = 0;
        while (i10 < size) {
            RectF rectF = stickerObstacles.get(i10);
            i10++;
            float f10 = -f7;
            rectF.inset(f10, f10);
        }
        stickerObstacles.get(2).left -= this.T0 * 0.035f;
        return stickerObstacles;
    }

    public final ArrayList K() {
        ArrayList arrayList = new ArrayList(this.f35055f.values());
        List.EL.sort(arrayList, Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(2)));
        return arrayList;
    }

    public final void M(v7 v7Var, float[] fArr, float[] fArr2, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        long j10 = v7Var.J;
        u7 u7Var = v7Var.f35008o;
        u7 u7Var2 = v7Var.f35007n;
        if (j10 == 0) {
            long j11 = this.M0 + 1;
            this.M0 = j11;
            v7Var.J = j11;
            ArrayList arrayList = new ArrayList();
            for (v7 v7Var2 : this.f35055f.values()) {
                if (v7Var2 != v7Var && v7Var2.b()) {
                    arrayList.add(v7Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.EL.sort(arrayList, Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(3)));
                for (int i10 = 0; i10 <= arrayList.size() - 10; i10++) {
                    v7 v7Var3 = (v7) arrayList.get(i10);
                    if (this.d.O()) {
                        G(v7Var3);
                    } else {
                        X(v7Var3);
                    }
                }
                k();
            }
        }
        v7Var.H = 1;
        v7Var.Q = false;
        v7Var.M = false;
        v7Var.L = false;
        v7Var.P = z10;
        v7Var.O = z10;
        long j12 = this.I0 + 1;
        this.I0 = j12;
        v7Var.I = j12;
        u7Var2.a(0.0f);
        u7Var.a(0.0f);
        u7 u7Var3 = v7Var.e;
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
        u7Var3.d = f7;
        u7Var3.e = f10;
        u7Var3.a(fArr[0]);
        u7Var3.f34938b = fArr2[0];
        u7 u7Var4 = v7Var.f35000f;
        if (z10) {
            f13 = 150.0f;
        }
        if (!z10) {
            f15 = 1.0f;
        }
        u7Var4.d = f13;
        u7Var4.e = f15;
        u7Var4.a(fArr[1]);
        float f17 = fArr2[1];
        u7Var4.f34938b = f17;
        v7Var.h.f34938b = fArr2[2];
        u7 u7Var5 = v7Var.f35001g;
        u7Var5.d = 300.0f;
        u7Var5.e = 0.5f;
        u7Var5.f34938b = 1.0f;
        u7 u7Var6 = v7Var.f35003j;
        if (z10) {
            f14 = 110.0f;
        }
        u7Var6.d = f14;
        u7Var6.e = 0.9f;
        u7Var6.f34938b = 0.0f;
        v7Var.f35006m.f34938b = 1.0f;
        v7Var.f35005l.f34938b = 0.0f;
        float f18 = fArr2[0] - fArr[0];
        float f19 = f17 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f18, f19));
        if (max > AndroidUtilities.dp(6.0f)) {
            f11 = f18 / max;
        } else {
            f11 = 0.0f;
        }
        v7Var.U = f11;
        if (max > AndroidUtilities.dp(6.0f)) {
            f12 = f19 / max;
        } else {
            f12 = 1.0f;
        }
        v7Var.V = f12;
        u7 u7Var7 = v7Var.f35004k;
        u7Var7.a(0.9f);
        u7Var7.f34938b = 0.0f;
        if (z10) {
            float min = Math.min(AndroidUtilities.dp(110.0f), 0.32f * max);
            if (f18 >= 0.0f) {
                f16 = -1.0f;
            }
            u7Var2.a(0.0f);
            u7Var2.f34939c = ((-f19) / max) * min * f16 * 20.0f;
            u7Var.a(0.0f);
            u7Var.f34939c = com.google.android.gms.internal.cast.a6.B(min, 0.5f, (f18 / max) * min * f16, 20.0f);
        }
        R();
        h0();
    }

    public final void O(v7 v7Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z10) {
        v7Var.h.a((float) (mediaAreaCoordinates.f20502w / 23.100000381469727d));
        v7Var.f35002i.a(c((float) mediaAreaCoordinates.rotation));
        v7Var.N = z10;
        v7Var.e.a((((float) mediaAreaCoordinates.f20503x) / 100.0f) * this.T0);
        v7Var.f35000f.a((((float) mediaAreaCoordinates.f20504y) / 100.0f) * this.U0);
        v7Var.f35001g.a(1.0f);
        v7Var.f35003j.a(0.0f);
        v7Var.f35004k.a(0.0f);
        v7Var.f35007n.a(0.0f);
        v7Var.f35008o.a(0.0f);
        v7Var.f35005l.a(0.0f);
        v7Var.H = 2;
        long j10 = this.I0 + 1;
        this.I0 = j10;
        v7Var.I = j10;
        v7Var.f35006m.a(1.0f);
        if (v7Var.J == 0) {
            long j11 = this.M0 + 1;
            this.M0 = j11;
            v7Var.J = j11;
        }
        if (v7Var.f34993a.equals(this.K0)) {
            this.O0 = v7Var;
            this.N0 = v7Var;
            this.P0 = 1.0f;
            e();
        }
    }

    public final float[] P(float f7, float f10) {
        float[] fArr = {f7, f10};
        this.f35079r.mapPoints(fArr);
        return fArr;
    }

    public final void R() {
        if (!this.f35045b && this.T0 > 0.0f && this.U0 > 0.0f) {
            SharedPreferences.Editor edit = this.e.edit();
            for (v7 v7Var : this.f35055f.values()) {
                boolean b10 = v7Var.b();
                String str = v7Var.f34993a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", v7Var.e.f34938b / this.T0);
                        jSONObject.put("y", v7Var.f35000f.f34938b / this.U0);
                        jSONObject.put("r", v7Var.f35002i.f34938b);
                        jSONObject.put("s", v7Var.h.f34938b);
                        jSONObject.put("q", v7Var.N);
                        edit.putString(str, jSONObject.toString());
                    } catch (Exception unused) {
                    }
                } else {
                    edit.remove(str);
                }
            }
            String str2 = this.K0;
            if (str2 == null) {
                edit.remove("style");
            } else {
                edit.putString("style", str2);
            }
            edit.apply();
        }
    }

    public final void S() {
        if (!this.Y0 || this.f35044a1 != 0) {
            return;
        }
        if (!this.V0 && (this.f35066k0 || !C())) {
            AndroidUtilities.runOnUIThread(this.f35047b1, 1000L);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList K = K();
        int size = K.size();
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (i11 < size) {
            Object obj = K.get(i11);
            i11++;
            v7 v7Var = (v7) obj;
            boolean b10 = v7Var.b();
            String str2 = v7Var.f34993a;
            if (b10) {
                sb2.append(str2);
                sb2.append(':');
                sb2.append(A(c0(v7Var)));
                sb2.append(';');
                if (str2.equals(this.K0) && m(v7Var)) {
                    str = str2;
                }
            }
        }
        if (a1.g.s(sb2, "bg:", str).equals(this.X0)) {
            this.Y0 = false;
            return;
        }
        TL_wallet.setCardStickers setcardstickers = new TL_wallet.setCardStickers();
        ArrayList K2 = K();
        int size2 = K2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = K2.get(i12);
            i12++;
            v7 v7Var2 = (v7) obj2;
            boolean b11 = v7Var2.b();
            String str3 = v7Var2.f34993a;
            if (b11) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                inputwalletcardsticker.nft_address = str3;
                inputwalletcardsticker.coordinates = c0(v7Var2);
                setcardstickers.stickers.add(inputwalletcardsticker);
                if (str3.equals(this.K0) && m(v7Var2)) {
                    setcardstickers.bg_nft_address = str3;
                }
            }
        }
        this.Y0 = false;
        int currentAccount = this.f35042a.getCurrentAccount();
        TL_wallet.card cardVar = this.W0;
        TL_wallet.card cardVar2 = new TL_wallet.card();
        TL_wallet.card cardVar3 = this.W0;
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
            v7 v7Var3 = (v7) this.f35055f.get(inputwalletcardsticker3.nft_address);
            if (v7Var3 != null && v7Var3.f34995b != null) {
                TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                cardsticker.nft = v7Var3.f34995b;
                cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                cardVar2.stickers.add(cardsticker);
                if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                    cardVar2.bg_nft_item = v7Var3.f34995b;
                }
            }
        }
        g0(currentAccount, cardVar2);
        this.f35044a1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new Object(), new eg(this, currentAccount, cardVar, 3));
    }

    public final TL_wallet.cardSticker T(String str) {
        ArrayList<TL_wallet.cardSticker> arrayList;
        TL_wallet.card cardVar = this.W0;
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

    public final void U(j7 j7Var) {
        int i10;
        int i11;
        removeCallbacks(this.f35090v1);
        this.f35071n0 = true;
        this.f35066k0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.J0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J0 = null;
        }
        j7Var.animate().cancel();
        j7Var.m(j7Var.getScaleX() * j7Var.f34362q0);
        j7Var.setScaleX(1.0f);
        j7Var.setScaleY(1.0f);
        j7Var.l(1.0f, 150L, null);
        final v7 v = v(j7Var.f34360o0);
        String str = v.f34993a;
        if (!b(v) && !v.b()) {
            this.f35071n0 = false;
            return;
        }
        i80 I = i80.I(this.f35042a, j7Var);
        I.f27134s = 51;
        if (b(v) || str.equals(this.K0)) {
            int i12 = R.drawable.msg_colors;
            if (str.equals(this.K0)) {
                i10 = R.string.WalletGiftRemoveColor;
            } else {
                i10 = R.string.WalletGiftApplyColor;
            }
            I.c(i12, LocaleController.getString(i10), new Runnable(this) {
                public final w7 f34642b;

                {
                    this.f34642b = this;
                }

                @Override
                public final void run() {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique;
                    switch (r3) {
                        case 0:
                            w7 w7Var = this.f34642b;
                            org.telegram.ui.ActionBar.n2 n2Var = w7Var.f35042a;
                            v7 v7Var = v;
                            if (!v7Var.f34993a.equals(w7Var.K0) && !w7Var.m(v7Var)) {
                                Context context = w7Var.getContext();
                                int currentAccount = n2Var.getCurrentAccount();
                                xc a02 = xc.a0(n2Var);
                                org.telegram.ui.ActionBar.d6 resourceProvider = n2Var.getResourceProvider();
                                TL_stars.StarGift starGift = v7Var.f34995b.gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                } else {
                                    tL_starGiftUnique = null;
                                }
                                ai.k7.K2(context, currentAccount, a02, resourceProvider, tL_starGiftUnique);
                                return;
                            }
                            w7Var.e0(v7Var);
                            return;
                        default:
                            w7 w7Var2 = this.f34642b;
                            w7Var2.getClass();
                            w7Var2.d0(v.f34995b);
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
            public final w7 f34642b;

            {
                this.f34642b = this;
            }

            @Override
            public final void run() {
                TL_stars.TL_starGiftUnique tL_starGiftUnique;
                switch (r3) {
                    case 0:
                        w7 w7Var = this.f34642b;
                        org.telegram.ui.ActionBar.n2 n2Var = w7Var.f35042a;
                        v7 v7Var = v;
                        if (!v7Var.f34993a.equals(w7Var.K0) && !w7Var.m(v7Var)) {
                            Context context = w7Var.getContext();
                            int currentAccount = n2Var.getCurrentAccount();
                            xc a02 = xc.a0(n2Var);
                            org.telegram.ui.ActionBar.d6 resourceProvider = n2Var.getResourceProvider();
                            TL_stars.StarGift starGift = v7Var.f34995b.gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                            } else {
                                tL_starGiftUnique = null;
                            }
                            ai.k7.K2(context, currentAccount, a02, resourceProvider, tL_starGiftUnique);
                            return;
                        }
                        w7Var.e0(v7Var);
                        return;
                    default:
                        w7 w7Var2 = this.f34642b;
                        w7Var2.getClass();
                        w7Var2.d0(v.f34995b);
                        return;
                }
            }
        }, false);
        I.f27129p = new o7(this, 0);
        I.Z();
        performHapticFeedback(0);
    }

    public final float W() {
        return this.T0 * 0.231f;
    }

    public final void X(v7 v7Var) {
        if (v7Var.f34993a.equals(this.K0)) {
            l();
        }
        v7Var.N = false;
        g(v7Var);
        j7 j10 = j(v7Var);
        if (j10 != null) {
            j10.setScaleX(0.93f);
            j10.setScaleY(0.93f);
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        R();
        h0();
    }

    public final void Y(v7 v7Var, float f7, float f10) {
        boolean z10;
        float[] fArr;
        boolean z11;
        this.f35060h0 = true;
        if (this.F0 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35064j0 = z10;
        if (this.f35050c1) {
            if (v7Var == this.f35057f1 && !z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f35052d1 = z11;
            this.f35054e1 = false;
            this.f35050c1 = false;
            MessagesController.getGlobalMainSettings().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z12 = v7Var.N;
        u7 u7Var = v7Var.f35006m;
        u7 u7Var2 = v7Var.f35000f;
        u7 u7Var3 = v7Var.e;
        float f11 = 1.0f;
        if (z12) {
            v7Var.N = false;
            u7 u7Var4 = v7Var.h;
            u7Var4.d = 420.0f;
            u7Var4.e = 0.8f;
            u7Var4.f34938b = 1.0f;
        }
        j7 j10 = j(v7Var);
        if (j10 != null) {
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.f35073o0 = false;
        if (this.f35064j0) {
            fArr = P(u7Var3.f34937a, u7Var2.f34937a);
        } else {
            RectF b02 = b0(v7Var);
            if (b02 == null) {
                return;
            }
            float[] fArr2 = {b02.centerX(), b02.centerY()};
            u7 u7Var5 = v7Var.f35001g;
            u7Var5.d = 500.0f;
            u7Var5.e = 0.75f;
            u7Var5.a((f(v7Var) * b02.width()) / W());
            u7Var.a(0.0f);
            l5.g0((l5) this.d.f17036c, 0L);
            fArr = fArr2;
        }
        u7Var3.d = 1100.0f;
        u7Var3.e = 0.9f;
        u7Var3.a(fArr[0]);
        u7Var2.d = 1100.0f;
        u7Var2.e = 0.9f;
        u7Var2.a(fArr[1]);
        v7Var.H = 3;
        long j11 = this.I0 + 1;
        this.I0 = j11;
        v7Var.I = j11;
        u7Var.f34938b = 1.0f;
        u7 u7Var6 = v7Var.f35003j;
        u7Var6.d = 320.0f;
        u7Var6.e = 0.75f;
        u7Var6.f34938b = 1.0f;
        v7Var.f35005l.a(0.0f);
        this.f35087u0 = fArr[0] - f7;
        this.f35089v0 = fArr[1] - f10;
        if (!this.f35064j0) {
            f11 = 0.0f;
        }
        this.N.f34938b = f11;
        performHapticFeedback(3);
    }

    public final void Z(v7 v7Var, boolean z10) {
        this.N0 = this.O0;
        this.O0 = v7Var;
        this.P0 = 0.0f;
        this.S0 = z10;
        if (v7Var != null) {
            this.Q0 = v7Var.e.f34938b / this.T0;
            this.R0 = v7Var.f35000f.f34938b / this.U0;
        }
        h0();
    }

    public final void a() {
        this.f35068l0 = false;
        removeCallbacks(this.f35093w1);
        removeCallbacks(this.f35090v1);
        this.f35058g0 = null;
        VelocityTracker velocityTracker = this.J0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J0 = null;
        }
        h0();
    }

    public final void a0(e0 e0Var) {
        TL_wallet.nftItem nftitem;
        ArrayList arrayList = e0Var.f34146a;
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
        Iterator it = this.f35055f.values().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            v7 v7Var = (v7) it.next();
            int i11 = v7Var.H;
            String str = v7Var.f34993a;
            if (i11 != 3) {
                ArrayList arrayList2 = e0Var.f34148c;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                        if (!wallettransaction.failed && (nftitem = wallettransaction.nft) != null && m0.a(nftitem.address, str)) {
                            if (str.equals(this.K0) || str.equals(this.L0)) {
                                this.L0 = null;
                                this.K0 = null;
                                Z(null, true);
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
        if (z10 && !this.f35045b) {
            R();
            k();
        }
        h0();
    }

    public final RectF b0(v7 v7Var) {
        j7 j10 = j(v7Var);
        if (j10 != null && j10.isShown()) {
            Matrix matrix = this.v;
            v5.m(j10, matrix);
            Matrix matrix2 = this.f35091w;
            v5.m(this, matrix2);
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

    public final TL_stories.TL_mediaAreaCoordinates c0(v7 v7Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float W = W() * v7Var.h.f34938b;
        tL_mediaAreaCoordinates.f20503x = Q((v7Var.e.f34938b / this.T0) * 100.0f);
        tL_mediaAreaCoordinates.f20504y = Q((v7Var.f35000f.f34938b / this.U0) * 100.0f);
        tL_mediaAreaCoordinates.f20502w = Q((W / this.T0) * 100.0f);
        tL_mediaAreaCoordinates.h = Q((W / this.U0) * 100.0f);
        float f7 = v7Var.f35002i.f34938b % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        tL_mediaAreaCoordinates.rotation = Q(f7);
        return tL_mediaAreaCoordinates;
    }

    public final void d(TL_wallet.card cardVar) {
        String str;
        v7 v7Var;
        v7 v7Var2;
        int i10;
        this.W0 = cardVar;
        this.X0 = V(cardVar);
        if (!this.Y0 && this.f35044a1 == 0 && !this.f35066k0) {
            TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
            v7 v7Var3 = null;
            if (nftitem == null) {
                str = null;
            } else {
                str = nftitem.address;
            }
            boolean equals = TextUtils.equals(str, this.K0);
            if (!equals) {
                this.K0 = str;
                this.L0 = null;
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
            if (this.f35045b) {
                TL_wallet.nftItem nftitem3 = cardVar.bg_nft_item;
                if (nftitem3 != null && nftitem3.gift != null) {
                    v7Var3 = v(nftitem3);
                }
                this.N0 = v7Var3;
                this.O0 = v7Var3;
                this.P0 = 1.0f;
                e();
                h0();
            } else if (!C()) {
                h0();
            } else {
                this.Z0 = true;
                ArrayList K = K();
                int size2 = K.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj = K.get(i12);
                    i12++;
                    v7 v7Var4 = (v7) obj;
                    if (v7Var4.K && (i10 = v7Var4.H) != 3 && i10 != 4 && i10 != 5) {
                        TL_wallet.cardSticker T = T(v7Var4.f34993a);
                        if (T != null) {
                            if (!v7Var4.b() || !A(c0(v7Var4)).equals(A(T.coordinates))) {
                                O(v7Var4, T.coordinates, v7Var4.N);
                            }
                        } else if (v7Var4.b()) {
                            G(v7Var4);
                        }
                    }
                }
                ArrayList<TL_wallet.cardSticker> arrayList2 = cardVar.stickers;
                LinkedHashMap linkedHashMap = this.f35055f;
                if (arrayList2 != null) {
                    int size3 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        TL_wallet.cardSticker cardsticker2 = arrayList2.get(i13);
                        i13++;
                        TL_wallet.nftItem nftitem4 = cardsticker2.nft;
                        if (nftitem4 == null) {
                            v7Var2 = null;
                        } else {
                            v7Var2 = (v7) linkedHashMap.get(nftitem4.address);
                        }
                        if (v7Var2 != null && v7Var2.H == 2) {
                            long j10 = this.I0 + 1;
                            this.I0 = j10;
                            v7Var2.I = j10;
                        }
                    }
                }
                if (!equals) {
                    String str2 = this.K0;
                    if (str2 == null) {
                        v7Var = null;
                    } else {
                        v7Var = (v7) linkedHashMap.get(str2);
                    }
                    if (v7Var != null && v7Var.b()) {
                        Z(v7Var, false);
                    } else {
                        Z(null, true);
                    }
                }
                this.Z0 = false;
                R();
                h0();
            }
        }
    }

    public final void d0(TL_wallet.nftItem nftitem) {
        if (!C()) {
            return;
        }
        v7 v = v(nftitem);
        if (v.b()) {
            if (this.d.O()) {
                G(v);
            } else {
                X(v);
            }
        } else if (v.H == 0 && b(v)) {
            f0(v);
        }
        k();
    }

    public final void e() {
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2;
        float pow;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4;
        v7 v7Var = this.N0;
        if (v7Var == null) {
            stargiftattributebackdrop = null;
        } else {
            stargiftattributebackdrop = v7Var.f35013t;
        }
        float[] g10 = k7.g(stargiftattributebackdrop);
        v7 v7Var2 = this.O0;
        if (v7Var2 == null) {
            stargiftattributebackdrop2 = null;
        } else {
            stargiftattributebackdrop2 = v7Var2.f35013t;
        }
        float[] g11 = k7.g(stargiftattributebackdrop2);
        float f7 = 1.0f;
        if (this.S0) {
            float f10 = this.P0;
            pow = com.google.android.gms.internal.cast.a6.B(f10, 2.0f, 3.0f, f10 * f10);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - this.P0, 4.0d));
        }
        float[] fArr = new float[18];
        float f11 = g10[0];
        float f12 = g10[1];
        float f13 = g10[2];
        float f14 = g11[0];
        float f15 = g11[1];
        float f16 = g11[2];
        float f17 = this.Q0;
        float f18 = this.R0;
        if (!this.S0) {
            f7 = 0.0f;
        }
        System.arraycopy(new float[]{f11, f12, f13, f14, f15, f16, f17, f18, pow, f7}, 0, fArr, 0, 10);
        v7 v7Var3 = this.N0;
        if (v7Var3 == null) {
            stargiftattributebackdrop3 = null;
        } else {
            stargiftattributebackdrop3 = v7Var3.f35013t;
        }
        k7.k(fArr, 0, stargiftattributebackdrop3);
        v7 v7Var4 = this.O0;
        if (v7Var4 == null) {
            stargiftattributebackdrop4 = null;
        } else {
            stargiftattributebackdrop4 = v7Var4.f35013t;
        }
        k7.k(fArr, 1, stargiftattributebackdrop4);
        this.f35048c.setStickerStyle(fArr);
    }

    public final void e0(v7 v7Var) {
        String str = v7Var.f34993a;
        if (str.equals(this.K0)) {
            l();
        } else if (m(v7Var)) {
            this.K0 = str;
            if (v7Var.b()) {
                Z(v7Var, false);
                k();
            } else {
                this.L0 = str;
                f0(v7Var);
                if (v7Var.H == 0) {
                    this.L0 = null;
                    this.K0 = null;
                } else {
                    k();
                }
            }
            R();
        }
    }

    public final float f(v7 v7Var) {
        j7 j10 = j(v7Var);
        if (j10 != null) {
            org.telegram.ui.Components.w9 w9Var = j10.f50305y;
            if (j10.getWidth() > 0 && w9Var.getWidth() > 0) {
                return ((w9Var.getWidth() / j10.getWidth()) * 288.0f) / 268.0f;
            }
            return 0.77f;
        }
        return 0.77f;
    }

    public final void f0(v7 v7Var) {
        l5.g0((l5) this.d.f17036c, 2600L);
        if (C()) {
            float[] z10 = z(v7Var, this.T0 * 0.6f, this.U0 * 0.68f, true);
            RectF b02 = b0(v7Var);
            if (z10 != null && b02 != null) {
                v7Var.f35001g.a((f(v7Var) * b02.width()) / W());
                v7Var.f35006m.a(0.0f);
                v7Var.f35003j.a(1.0f);
                float[] fArr = {b02.centerX(), b02.centerY()};
                this.f35082s.mapPoints(fArr);
                M(v7Var, fArr, z10, true);
                performHapticFeedback(3);
                return;
            }
            j7 j10 = j(v7Var);
            if (j10 != null) {
                j10.animate().rotation(3.0f).setDuration(90L).withEndAction(new m7(j10, 0)).start();
            }
        }
    }

    public final void g(v7 v7Var) {
        v7Var.H = 0;
        v7Var.J = 0L;
        v7Var.f35001g.a(1.0f);
        v7Var.h.a(1.0f);
        v7Var.f35002i.a(0.0f);
        v7Var.f35006m.a(0.0f);
        v7Var.f35003j.a(0.0f);
        v7Var.f35004k.a(0.0f);
        j7 j10 = j(v7Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.setScaleX(1.0f);
            j10.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - AndroidUtilities.dp(64.0f)) - AndroidUtilities.navigationBarHeight;
    }

    public final void h0() {
        if (!this.V0 && isAttachedToWindow()) {
            r7 r7Var = this.f35096x1;
            removeCallbacks(r7Var);
            postOnAnimation(r7Var);
        }
    }

    public final void i(j7 j7Var) {
        float f7;
        ArrayList arrayList = this.h;
        if (!arrayList.contains(j7Var)) {
            arrayList.add(j7Var);
        }
        v7 v = v(j7Var.f34360o0);
        if (v.H == 0) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        j7Var.j(v.R, false, f7);
        h0();
    }

    public final j7 j(v7 v7Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j7 j7Var = (j7) obj;
            if (j7Var.isAttachedToWindow() && j7Var.f34360o0.address.equals(v7Var.f34993a)) {
                return j7Var;
            }
        }
        return null;
    }

    public final void k() {
        if (!this.f35045b && !this.Z0) {
            this.Y0 = true;
            o7 o7Var = this.f35047b1;
            AndroidUtilities.cancelRunOnUIThread(o7Var);
            AndroidUtilities.runOnUIThread(o7Var, 1500L);
        }
    }

    public final void l() {
        this.L0 = null;
        this.K0 = null;
        Z(null, true);
        R();
        k();
    }

    public final boolean m(v7 v7Var) {
        if (b(v7Var) && H(this.f35042a.getCurrentAccount(), v7Var.f34995b.gift.slug)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f35086t1);
        getViewTreeObserver().addOnPreDrawListener(this.f35088u1);
        for (v7 v7Var : this.f35055f.values()) {
            v7Var.f34997c.onAttachedToWindow();
            v7Var.d.onAttachedToWindow();
        }
        h0();
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.f35086t1);
        getViewTreeObserver().removeOnPreDrawListener(this.f35088u1);
        removeCallbacks(this.f35096x1);
        removeCallbacks(this.f35090v1);
        for (v7 v7Var : this.f35055f.values()) {
            v7Var.f34997c.onDetachedFromWindow();
            v7Var.d.onDetachedFromWindow();
        }
        this.H0 = 0L;
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
        v7 v7Var;
        RectF rectF;
        ArrayList arrayList;
        u7 u7Var;
        w7 w7Var = this;
        Canvas canvas2 = canvas;
        if (w7Var.C()) {
            float f16 = w7Var.N.f34937a;
            int i12 = (f16 > 0.01f ? 1 : (f16 == 0.01f ? 0 : -1));
            RectF rectF2 = w7Var.H;
            Paint paint = w7Var.f35094x;
            if (i12 < 0) {
                f10 = 0.0f;
                f11 = 2.0f;
                i10 = 0;
                f12 = 0.6f;
                f7 = 0.4f;
            } else {
                float max = Math.max(0.0f, Math.min(1.2f, w7Var.O.f34937a));
                float clamp01 = Utilities.clamp01(max);
                f7 = 0.4f;
                Paint paint2 = w7Var.G;
                paint2.setTextSize(AndroidUtilities.dp(15.0f));
                float measureText = (((paint2.measureText(LocaleController.getString(R.string.Remove)) + AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(56.0f)) * max) + AndroidUtilities.dp(56.0f);
                canvas2.save();
                f10 = 0.0f;
                canvas2.translate(w7Var.getWidth() / 2.0f, ((1.0f - f16) * AndroidUtilities.dp(90.0f)) + w7Var.h());
                float f17 = (f16 * 0.4f) + 0.6f;
                canvas2.scale(f17, f17);
                int i13 = org.telegram.ui.ActionBar.h6.f20986d6;
                org.telegram.ui.ActionBar.n2 n2Var = w7Var.f35042a;
                paint.setColor(i0.b.f(clamp01, org.telegram.ui.ActionBar.h6.w0(i13, n2Var.getResourceProvider()), -1750963));
                paint.setAlpha((int) (Utilities.clamp01(f16) * 255.0f));
                float f18 = (-measureText) / 2.0f;
                float f19 = measureText / 2.0f;
                rectF2.set(f18, -AndroidUtilities.dp(28.0f), f19, AndroidUtilities.dp(28.0f));
                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), paint);
                float dp = (f18 + AndroidUtilities.dp(30.0f)) * clamp01;
                float dp2 = AndroidUtilities.dp(21.0f);
                int round = Math.round(w7Var.f35049c0.f34937a);
                f11 = 2.0f;
                uj0 uj0Var = w7Var.f35053e0;
                uj0Var.N(round, false, false);
                float f20 = dp - dp2;
                i10 = 0;
                f12 = 0.6f;
                float f21 = -dp2;
                float f22 = dp + dp2;
                uj0Var.setBounds((int) f20, (int) f21, (int) f22, (int) dp2);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.b.f(clamp01, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, n2Var.getResourceProvider()), -1), PorterDuff.Mode.SRC_IN);
                Paint paint3 = w7Var.f35051d0;
                paint3.setColorFilter(porterDuffColorFilter);
                paint3.setAlpha((int) (Utilities.clamp01(f16) * 255.0f));
                canvas2 = canvas;
                int saveLayer = canvas2.saveLayer(f20, f21, f22, dp2, paint3);
                uj0Var.draw(canvas2);
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
            ArrayList K = w7Var.K();
            int size = K.size();
            int i14 = i10;
            while (i14 < size) {
                int i15 = i14 + 1;
                v7 v7Var2 = (v7) K.get(i14);
                u7 u7Var2 = v7Var2.e;
                u7 u7Var3 = v7Var2.f35002i;
                float f23 = u7Var2.f34937a;
                float f24 = v7Var2.f35000f.f34937a;
                float W = w7Var.W() * v7Var2.f35001g.f34937a * v7Var2.h.f34937a;
                float f25 = v7Var2.f35003j.f34937a;
                int i16 = v7Var2.H;
                if (i16 == 1 && v7Var2.O && f25 > 0.3f) {
                    float[] P = w7Var.P(f23 + v7Var2.f35007n.f34937a, f24 + v7Var2.f35008o.f34937a);
                    float f26 = P[i10];
                    float f27 = P[1];
                    W = com.google.android.gms.internal.cast.a6.A(f25, 0.15f, 1.0f, W);
                    f13 = f27;
                    f23 = f26;
                } else if (i16 != 3 && i16 != 4 && i16 != 5) {
                    i14 = i15;
                } else {
                    f13 = f24;
                }
                float f28 = W;
                Bitmap a2 = v7Var2.a();
                if (a2 != null) {
                    if (f28 >= 1.0f) {
                        canvas2.save();
                        canvas2.rotate(u7Var3.f34937a, f23, f13);
                        Paint paint4 = paint;
                        w7Var.t(canvas2, v7Var2, f23, (AndroidUtilities.dp(5.0f) * f25) + AndroidUtilities.dp(1.5f) + f13, com.google.android.gms.internal.cast.a6.A(f25, 0.04f, 1.0f, f28), f25, 0.0f, 1.0f);
                        canvas.restore();
                        float clamp012 = Utilities.clamp01(v7Var2.f35006m.f34937a);
                        if (v7Var2.H == 4 && v7Var2.W > f12 && w7Var.j(v7Var2) != null) {
                            float clamp013 = Utilities.clamp01((v7Var2.W - f12) / f7);
                            float f29 = (1.0f - ((3.0f - (clamp013 * f11)) * (clamp013 * clamp013))) * 0.45f;
                            float clamp014 = (1.0f - (Utilities.clamp01(-v7Var2.V) * f12)) * 0.55f;
                            if (clamp012 < 1.0f) {
                                paint4.setAlpha((int) ((1.0f - clamp012) * 255.0f));
                                ArrayList arrayList2 = K;
                                u7Var = u7Var3;
                                f15 = f28;
                                arrayList = arrayList2;
                                i11 = size;
                                rectF = rectF2;
                                f14 = f13;
                                v7Var = v7Var2;
                                w7Var.r(canvas, v7Var2.v, f23, f14, f15, f29, clamp014, u7Var3.f34937a, v7Var2.U, v7Var2.V);
                            } else {
                                f14 = f13;
                                i11 = size;
                                f15 = f28;
                                v7Var = v7Var2;
                                rectF = rectF2;
                                arrayList = K;
                                u7Var = u7Var3;
                            }
                            if (clamp012 > f10) {
                                paint4.setAlpha((int) (clamp012 * 255.0f));
                                canvas2 = canvas;
                                r(canvas2, a2, f23, f14, f15, f29, clamp014, u7Var.f34937a, v7Var.U, v7Var.V);
                            } else {
                                canvas2 = canvas;
                            }
                            paint4.setAlpha(255);
                            paint = paint4;
                            rectF2 = rectF;
                            i14 = i15;
                            K = arrayList;
                            size = i11;
                            w7Var = this;
                        } else {
                            float f30 = f13;
                            ArrayList arrayList3 = K;
                            int i17 = size;
                            RectF rectF3 = rectF2;
                            canvas2 = canvas;
                            canvas2.save();
                            canvas2.rotate(u7Var3.f34937a, f23, f30);
                            float f31 = f28 / f11;
                            rectF3.set(f23 - f31, f30 - f31, f23 + f31, f31 + f30);
                            if (clamp012 < 1.0f) {
                                paint4.setAlpha((int) ((1.0f - clamp012) * 255.0f));
                                rect = null;
                                canvas2.drawBitmap(v7Var2.v, (Rect) null, rectF3, paint4);
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
                            K = arrayList3;
                            size = i17;
                            w7Var = this;
                        }
                    }
                } else {
                    w7Var = this;
                }
                i14 = i15;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        h0();
    }

    public final void p() {
        AndroidUtilities.removeFromParent(this.f35081r1);
        AndroidUtilities.removeFromParent(this.f35084s1);
        this.f35084s1 = null;
        this.f35081r1 = null;
        R();
        AndroidUtilities.cancelRunOnUIThread(this.f35047b1);
        this.V0 = true;
        if (this.Y0) {
            S();
        }
        this.f35053e0.C(false);
        removeCallbacks(this.f35096x1);
        removeCallbacks(this.f35090v1);
        removeCallbacks(this.f35093w1);
        VelocityTracker velocityTracker = this.J0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J0 = null;
        }
        for (v7 v7Var : this.f35055f.values()) {
            v7Var.f34997c.onDetachedFromWindow();
            v7Var.d.onDetachedFromWindow();
        }
        this.h.clear();
    }

    public final void q(org.telegram.ui.Wallet.v7 r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w7.q(org.telegram.ui.Wallet.v7, float, float):void");
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
                canvas.drawBitmapMesh(bitmap, 14, 14, this.J, 0, this.K, 0, this.f35094x);
                return;
            }
        }
    }

    public final void s(Canvas canvas, v7 v7Var, float f7, float f10, boolean z10) {
        float f11;
        int i10;
        ImageReceiver imageReceiver = v7Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = v7Var.f35013t;
        Bitmap bitmap = imageReceiver.getBitmap();
        if (bitmap != null && stargiftattributebackdrop != null) {
            canvas.save();
            float f12 = this.T0;
            float f13 = this.U0;
            Path path = this.I;
            w7.i6.a(path, f12, f13);
            canvas.clipPath(path);
            this.f35048c.j(path, this.T0, this.U0);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i11 >= 0 && !z10) {
                path.rewind();
                path.addCircle(this.Q0 * this.T0, this.R0 * this.U0, f10, Path.Direction.CW);
                canvas.clipPath(path);
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
            Paint paint = this.f35094x;
            paint.setColorFilter(porterDuffColorFilter);
            float f14 = this.T0 / 336.0f;
            float f15 = this.U0 / 205.0f;
            int i12 = 16;
            int i13 = 0;
            int i14 = 16;
            while (i14 < 336) {
                int i15 = ((i13 % 2) * 18) + i12;
                while (i15 < 205) {
                    float f16 = i14 * f14;
                    float f17 = i15 * f15;
                    float f18 = 12.0f * f14;
                    float clamp01 = Utilities.clamp01(Math.min(Math.min(i14, 336 - i14), Math.min(i15, 205 - i15)) / 48.0f);
                    int i16 = i11;
                    float B = 0.15f * f7 * com.google.android.gms.internal.cast.a6.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
                    if (i16 >= 0) {
                        f11 = 2.0f;
                        float clamp012 = Utilities.clamp01((f10 - Utilities.dist(f16, f17, this.Q0 * this.T0, this.R0 * this.U0)) / AndroidUtilities.dp(120.0f));
                        if (z10) {
                            f18 = com.google.android.gms.internal.cast.a6.B(clamp012, 0.8f, 1.0f, f18);
                            B *= 1.0f - Utilities.clamp01(clamp012 * 1.6f);
                        } else {
                            i10 = i15;
                            f18 *= (((((float) Math.sin(clamp012 * 3.141592653589793d)) * 0.28f) + clamp012) * 0.8f) + 0.2f;
                            B *= Utilities.clamp01(clamp012 * 1.6f);
                            paint.setAlpha((int) (B * 255.0f));
                            float f19 = f18 / f11;
                            RectF rectF = this.H;
                            rectF.set(f16 - f19, f17 - f19, f16 + f19, f17 + f19);
                            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
                            i15 = i10 + 37;
                            i11 = i16;
                        }
                    } else {
                        f11 = 2.0f;
                    }
                    i10 = i15;
                    paint.setAlpha((int) (B * 255.0f));
                    float f192 = f18 / f11;
                    RectF rectF2 = this.H;
                    rectF2.set(f16 - f192, f17 - f192, f16 + f192, f17 + f192);
                    canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint);
                    i15 = i10 + 37;
                    i11 = i16;
                }
                i14 += 33;
                i13++;
                i12 = 16;
            }
            paint.setColorFilter(null);
            paint.setAlpha(255);
            canvas.restore();
        }
    }

    public final void t(Canvas canvas, v7 v7Var, float f7, float f10, float f11, float f12, float f13, float f14) {
        if (f14 > 0.01f && v7Var.f35015w != null) {
            float f15 = (((0.05f * f12) + 1.0f) * ((f11 * 176.0f) / 128.0f)) / 2.0f;
            float f16 = f7 - f15;
            float f17 = f10 - f15;
            float f18 = f7 + f15;
            float f19 = f10 + f15;
            RectF rectF = this.H;
            rectF.set(f16, f17, f18, f19);
            Paint paint = this.f35094x;
            int alpha = paint.getAlpha();
            paint.setColor(-16044452);
            float clamp01 = Utilities.clamp01(v7Var.f35006m.f34937a);
            paint.setAlpha((int) (clamp01 * Utilities.clamp01((f13 * 0.12f) + (f12 * (-0.049999997f)) + 0.16f) * 255.0f * f14));
            canvas.drawBitmap(v7Var.f35015w, (Rect) null, rectF, paint);
            paint.setColor(-1);
            paint.setAlpha(alpha);
        }
    }

    public final v7 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f35055f;
        v7 v7Var = (v7) linkedHashMap.get(str);
        if (v7Var == null) {
            v7Var = new v7(this, nftitem);
            linkedHashMap.put(nftitem.address, v7Var);
        }
        v7Var.f34995b = nftitem;
        return v7Var;
    }

    public final float[] w(v7 v7Var, float f7, float f10, float f11, ArrayList arrayList) {
        float W = W() * 0.5f * f11;
        float f12 = Float.MAX_VALUE;
        float[] fArr = null;
        for (float f13 = W; f13 <= this.U0 - W; f13 += AndroidUtilities.dp(4.0f)) {
            for (float f14 = W; f14 <= this.T0 - W; f14 += AndroidUtilities.dp(4.0f)) {
                float dist = Utilities.dist(f14, f13, f7, f10);
                if (dist < f12 && y(v7Var, f14, f13, f11, arrayList)) {
                    fArr = new float[]{f14, f13, f11};
                    f12 = dist;
                }
            }
        }
        return fArr;
    }

    public final void x(float r21, float r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w7.x(float, float, boolean):void");
    }

    public final boolean y(v7 v7Var, float f7, float f10, float f11, ArrayList arrayList) {
        float W = W() * 0.36f * f11;
        float W2 = W() * 0.5f * f11;
        if (f7 >= W2 && f7 <= this.T0 - W2 && f10 >= W2 && f10 <= this.U0 - W2) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    RectF rectF = (RectF) obj;
                    if (Utilities.dist(f7, f10, Math.max(rectF.left, Math.min(rectF.right, f7)), Math.max(rectF.top, Math.min(rectF.bottom, f10))) < W) {
                        break;
                    }
                } else {
                    for (v7 v7Var2 : this.f35055f.values()) {
                        if (v7Var2 != v7Var && v7Var2.b()) {
                            if (Utilities.dist(v7Var2.e.f34938b, v7Var2.f35000f.f34938b, f7, f10) < (v7Var2.h.f34938b + f11) * W() * 0.29f) {
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final float[] z(v7 v7Var, float f7, float f10, boolean z10) {
        float f11;
        Random random;
        float min;
        float nextFloat;
        char c10;
        ArrayList J = J();
        float dp = AndroidUtilities.dp(32.0f) / W();
        float f12 = v7Var.h.f34938b;
        char c11 = 2;
        LinkedHashMap linkedHashMap = this.f35055f;
        char c12 = 3;
        char c13 = 1;
        int i10 = 0;
        if (!z10) {
            RectF rectF = new RectF((RectF) J.get(3));
            rectF.inset(-AndroidUtilities.dp(10.0f), -AndroidUtilities.dp(10.0f));
            if (rectF.contains(f7, f10)) {
                boolean z11 = false;
                for (v7 v7Var2 : linkedHashMap.values()) {
                    if (v7Var2 != v7Var && v7Var2.b() && v7Var2.N) {
                        z11 = true;
                    }
                }
                if (!z11) {
                    float f13 = this.T0;
                    float f14 = this.U0;
                    v5 v5Var = this.f35048c;
                    Path path = this.I;
                    v5Var.j(path, f13, f14);
                    path.computeBounds(rectF, true);
                    v7Var.N = true;
                    float max = Math.max(dp, Math.min(1.1f, (rectF.width() * 1.22f) / W()));
                    return new float[]{rectF.centerX(), ((rectF.height() * 0.08f) + rectF.top) - ((W() * max) * 0.38f), max};
                }
            }
            v7Var.N = false;
            return I(v7Var, f7, f10, new ArrayList());
        }
        v7Var.N = false;
        ArrayList arrayList = new ArrayList();
        for (v7 v7Var3 : linkedHashMap.values()) {
            char c14 = c11;
            if (v7Var3 != v7Var && v7Var3.b()) {
                arrayList.add(v7Var3);
            }
            c11 = c14;
        }
        char c15 = c11;
        Random random2 = new Random((System.nanoTime() / 400000000) + (arrayList.size() * 31) + (v7Var.f34993a.hashCode() * 7919));
        float d = org.telegram.ui.Cells.t0.d(random2, 0.04f, 0.05f);
        float nextFloat2 = (((random2.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.T0;
        float nextFloat3 = this.U0 * (((random2.nextFloat() - 0.5f) * 0.08f) + 0.55f);
        float W = W() * dp * 0.5f;
        float f15 = -3.4028235E38f;
        float[] fArr = null;
        float f16 = W;
        while (f16 <= this.U0 - W) {
            char c16 = c13;
            float f17 = W;
            while (true) {
                float f18 = this.T0;
                if (f17 <= f18 - W) {
                    int i11 = i10;
                    float min2 = Math.min(Math.min(f17, f18 - f17), Math.min(f16, this.U0 - f16));
                    float min3 = Math.min(Math.max(0.74f, 1.0f - (arrayList.size() * d)) * f12, min2 / (W() * 0.5f));
                    int size = J.size();
                    float f19 = d;
                    float f20 = dp;
                    int i12 = i11;
                    float f21 = Float.MAX_VALUE;
                    while (i12 < size) {
                        ArrayList arrayList2 = J;
                        RectF rectF2 = (RectF) J.get(i12);
                        f21 = Math.min(f21, Utilities.dist(f17, f16, Math.max(rectF2.left, Math.min(rectF2.right, f17)), Math.max(rectF2.top, Math.min(rectF2.bottom, f16))));
                        i12++;
                        J = arrayList2;
                        f12 = f12;
                    }
                    ArrayList arrayList3 = J;
                    float f22 = f12;
                    float min4 = Math.min(min3, f21 / (W() * 0.44f));
                    int i13 = i11;
                    for (int size2 = arrayList.size(); i13 < size2; size2 = size2) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        v7 v7Var4 = (v7) obj;
                        min4 = Math.min(min4, (Utilities.dist(f17, f16, v7Var4.e.f34938b, v7Var4.f35000f.f34938b) / (W() * 0.29f)) - v7Var4.h.f34938b);
                    }
                    float clamp01 = ((Utilities.clamp01((min2 - ((W() * 0.5f) * min4)) / AndroidUtilities.dp(14.0f)) * 0.1f) + 0.9f) * min4;
                    if (clamp01 < f20) {
                        random = random2;
                    } else {
                        if (arrayList.isEmpty()) {
                            float f23 = this.T0 * 0.6f;
                            float x10 = com.google.android.gms.internal.cast.a6.x(f7, f23, 0.2f, f23);
                            float f24 = this.U0 * 0.68f;
                            nextFloat = (random2.nextFloat() * AndroidUtilities.dp(5.0f)) + (W() * clamp01 * 1.1f) + (Utilities.dist(f17, f16, x10, com.google.android.gms.internal.cast.a6.x(f10, f24, 0.2f, f24)) * (-0.45f));
                            f11 = clamp01;
                            random = random2;
                        } else {
                            float f25 = f16 * clamp01 * clamp01;
                            float f26 = clamp01 * clamp01;
                            int size3 = arrayList.size();
                            float f27 = f17 * clamp01 * clamp01;
                            int i14 = i11;
                            float f28 = Float.MAX_VALUE;
                            float f29 = 0.0f;
                            while (i14 < size3) {
                                Object obj2 = arrayList.get(i14);
                                int i15 = i14 + 1;
                                v7 v7Var5 = (v7) obj2;
                                float f30 = clamp01;
                                u7 u7Var = v7Var5.e;
                                int i16 = size3;
                                u7 u7Var2 = v7Var5.h;
                                Random random3 = random2;
                                u7 u7Var3 = v7Var5.f35000f;
                                f28 = Math.min(f28, Utilities.dist(f17, f16, u7Var.f34938b, u7Var3.f34938b) - ((u7Var2.f34938b + f30) * (W() * 0.4f)));
                                float f31 = u7Var2.f34938b;
                                float f32 = f31 * f31;
                                float f33 = v7Var5.e.f34938b;
                                f27 = (f33 * f32) + f27;
                                f25 = (u7Var3.f34938b * f32) + f25;
                                f26 += f32;
                                f29 = Math.max(0.0f, 1.0f - (Math.abs(u7Var3.f34938b - f16) / (W() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f33 - f17) / (W() * 0.12f))) + f29;
                                clamp01 = f30;
                                i14 = i15;
                                size3 = i16;
                                random2 = random3;
                            }
                            f11 = clamp01;
                            random = random2;
                            float f34 = f25;
                            if (f28 < 0.0f) {
                                min = f28 * 2.5f;
                            } else {
                                min = Math.min(f28, W() * 0.3f);
                            }
                            nextFloat = ((random.nextFloat() * AndroidUtilities.dp(10.0f)) + (((((Math.min(Math.min(min2, f21), W()) * 0.2f) + ((W() * (f11 * 0.9f)) + (min * 1.2f))) - (Utilities.dist(f27 / f26, f34 / f26, nextFloat2, nextFloat3) * 0.35f)) - ((W() * f29) * 0.08f)) - (Utilities.dist(f17, f16, this.T0 * 0.5f, this.U0 * 0.55f) * 0.04f))) - (Utilities.dist(f17, f16, f7, f10) * 0.04f);
                        }
                        if (nextFloat > f15) {
                            c10 = 3;
                            float[] fArr2 = new float[3];
                            fArr2[i11] = f17;
                            fArr2[c16] = f16;
                            fArr2[c15] = f11;
                            f15 = nextFloat;
                            fArr = fArr2;
                            f17 += AndroidUtilities.dp(5.0f);
                            c12 = c10;
                            i10 = i11;
                            d = f19;
                            dp = f20;
                            J = arrayList3;
                            f12 = f22;
                            random2 = random;
                        }
                    }
                    c10 = 3;
                    f17 += AndroidUtilities.dp(5.0f);
                    c12 = c10;
                    i10 = i11;
                    d = f19;
                    dp = f20;
                    J = arrayList3;
                    f12 = f22;
                    random2 = random;
                }
            }
            f16 += AndroidUtilities.dp(5.0f);
            c13 = c16;
            d = d;
            J = J;
        }
        return fArr;
    }
}
