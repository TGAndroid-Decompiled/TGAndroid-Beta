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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.eg;
public final class z7 extends View {
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
    public final t7 L;
    public String L0;
    public final s7 M;
    public long M0;
    public final x7 N;
    public y7 N0;
    public final x7 O;
    public y7 O0;
    public final x7 P;
    public float P0;
    public final x7 Q;
    public float Q0;
    public final x7 R;
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
    public final org.telegram.ui.ActionBar.n2 f35178a;
    public float f35179a0;
    public int f35180a1;
    public final boolean f35181b;
    public float f35182b0;
    public final r7 f35183b1;
    public final x5 f35184c;
    public final x7 f35185c0;
    public boolean f35186c1;
    public final n2.e d;
    public final Paint f35187d0;
    public boolean f35188d1;
    public final SharedPreferences e;
    public final uj0 f35189e0;
    public boolean f35190e1;
    public final LinkedHashMap f35191f;
    public boolean f35192f0;
    public y7 f35193f1;
    public y7 f35194g0;
    public m7 f35195g1;
    public final ArrayList h;
    public boolean f35196h0;
    public float[] f35197h1;
    public boolean f35198i0;
    public float f35199i1;
    public boolean f35200j0;
    public final float[] f35201j1;
    public boolean f35202k0;
    public final x7 f35203k1;
    public boolean f35204l0;
    public final x7 l1;
    public boolean m0;
    public final Paint f35205m1;
    public final ArrayList f35206n;
    public boolean f35207n0;
    public final Paint f35208n1;
    public boolean f35209o0;
    public final Matrix f35210o1;
    public boolean f35211p0;
    public final Path f35212p1;
    public int f35213q0;
    public final RectF f35214q1;
    public final Matrix f35215r;
    public float f35216r0;
    public ei.x3 f35217r1;
    public final Matrix f35218s;
    public float f35219s0;
    public ei.x3 f35220s1;
    public float f35221t0;
    public final o1 f35222t1;
    public float f35223u0;
    public final y4 f35224u1;
    public final Matrix v;
    public float f35225v0;
    public final r7 f35226v1;
    public final Matrix f35227w;
    public float f35228w0;
    public final r7 f35229w1;
    public final Paint f35230x;
    public float f35231x0;
    public final u7 f35232x1;
    public final Paint f35233y;
    public float f35234y0;
    public final RectF f35235y1;
    public float f35236z0;
    public final Paint f35237z1;

    public z7(org.telegram.ui.ActionBar.n2 n2Var, x5 x5Var, n2.e eVar, TL_wallet.card cardVar) {
        super(n2Var.getContext());
        boolean z10;
        SharedPreferences sharedPreferences;
        boolean z11;
        this.f35191f = new LinkedHashMap();
        this.h = new ArrayList();
        this.f35206n = new ArrayList();
        this.f35215r = new Matrix();
        this.f35218s = new Matrix();
        this.v = new Matrix();
        this.f35227w = new Matrix();
        this.f35230x = new Paint(3);
        this.f35233y = new Paint(3);
        this.E = new RectF();
        Paint paint = new Paint(1);
        this.F = paint;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new RectF();
        this.I = new Path();
        this.J = new float[450];
        this.K = new int[225];
        this.N = new x7(0.0f, 260.0f, 0.78f);
        this.O = new x7(0.0f, 420.0f, 0.72f);
        this.P = new x7(1.0f, 420.0f, 0.38f);
        this.Q = new x7(0.0f, 170.0f, 0.42f);
        this.R = new x7(0.0f, 170.0f, 0.42f);
        this.S = new ArrayList();
        this.T = new Path();
        Paint paint3 = new Paint(1);
        this.U = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.V = linearGradient;
        this.W = new Matrix();
        this.f35185c0 = new x7(0.0f, 120.0f, 1.0f);
        this.f35187d0 = new Paint(1);
        this.P0 = 1.0f;
        this.Q0 = 0.5f;
        this.R0 = 0.5f;
        this.f35183b1 = new r7(this, 1);
        this.f35201j1 = new float[3];
        this.f35203k1 = new x7(0.0f, 260.0f, 1.0f);
        this.l1 = new x7(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.f35205m1 = paint4;
        Paint paint5 = new Paint(1);
        this.f35208n1 = paint5;
        this.f35210o1 = new Matrix();
        this.f35212p1 = new Path();
        this.f35214q1 = new RectF();
        this.f35222t1 = new o1(this, 1);
        this.f35224u1 = new y4(2, this);
        this.f35226v1 = new r7(this, 2);
        this.f35229w1 = new r7(this, 3);
        this.f35232x1 = new u7(this);
        this.f35235y1 = new RectF();
        Paint paint6 = new Paint(1);
        this.f35237z1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.A1 = new Rect();
        this.f35178a = n2Var;
        if (cardVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35181b = z10;
        uj0 uj0Var = new uj0(R.raw.wallet_gift_trash, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
        this.f35189e0 = uj0Var;
        uj0Var.R(this);
        this.f35184c = x5Var;
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
        this.f35186c1 = z11;
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
        s7 s7Var = new s7(this, getContext());
        this.M = s7Var;
        t7 t7Var = new t7(this, getContext());
        this.L = t7Var;
        x5Var.getFrontFace().addView(s7Var, 0, w7.z5.d(-1.0f, -1));
        x5Var.getFrontFace().addView(t7Var, x5Var.getStickerLayerIndex(), w7.z5.d(-1.0f, -1));
        if (z10) {
            t7Var.addOnLayoutChangeListener(new o7(this, 0));
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
        return String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.f20510x), Double.valueOf(mediaAreaCoordinates.f20511y), Double.valueOf(mediaAreaCoordinates.f20509w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
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

    public static Path L(y7 y7Var) {
        Bitmap bitmap;
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        if (y7Var != null && y7Var.F == null && (bitmap = y7Var.f35154u) != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
            int[] iArr = new int[16384];
            createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
            if (createScaledBitmap != y7Var.f35154u) {
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
                    y7Var.F = path;
                    return path;
                }
                return null;
            }
            return null;
        } else if (y7Var == null) {
            return null;
        } else {
            return y7Var.F;
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

    public static boolean b(y7 y7Var) {
        TL_wallet.nftItem nftitem;
        if (y7Var != null && (nftitem = y7Var.f35135b) != null && nftitem.gift != null) {
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
        x3Var.f10068a = i10;
        x3Var.m(1.0f, 0.0f);
    }

    public static float u(float f7, float f10, float f11) {
        float clamp01 = Utilities.clamp01((f7 - f10) / (f11 - f10));
        return com.google.android.gms.internal.play_billing.k3.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
    }

    public final boolean B(m7 m7Var) {
        if (m7Var.isShown()) {
            Rect rect = this.A1;
            if (m7Var.getGlobalVisibleRect(rect) && rect.width() >= m7Var.getWidth() - 1 && rect.height() >= m7Var.getHeight() - 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean C() {
        x5 x5Var = this.f35184c;
        this.T0 = x5Var.getFrontFace().getWidth();
        float height = x5Var.getFrontFace().getHeight();
        this.U0 = height;
        if (this.T0 > 0.0f && height > 0.0f) {
            Matrix matrix = this.f35215r;
            if (x5Var.i(this, matrix) && matrix.invert(this.f35218s)) {
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
        if (this.f35197h1 == null) {
            L = null;
        } else {
            L = L(this.f35193f1);
        }
        if (L == null) {
            return false;
        }
        float W = W() * this.f35197h1[2];
        Matrix matrix = this.f35210o1;
        matrix.setScale(W, W);
        float[] fArr = this.f35197h1;
        matrix.postTranslate(fArr[0], fArr[1]);
        L.transform(matrix, this.f35212p1);
        return true;
    }

    public final float[] F(float f7) {
        float[] fArr = this.f35201j1;
        fArr[0] = (u(f7, 0.45f, 0.82f) - u(f7, 1.3f, 1.72f)) * 0.9f;
        fArr[1] = (((float) Math.sin(Utilities.clamp01((f7 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f7, 0.6f, 0.92f) - u(f7, 1.18f, 1.46f));
        fArr[2] = u(f7, 1.58f, 1.7f) - u(f7, 1.7f, 1.92f);
        return fArr;
    }

    public final void G(y7 y7Var) {
        float f7;
        float f10;
        float f11;
        float f12;
        y7Var.J = 0L;
        x7 x7Var = y7Var.h;
        x7 x7Var2 = y7Var.f35140f;
        x7 x7Var3 = y7Var.e;
        if (y7Var.f35133a.equals(this.K0)) {
            l();
        }
        if (y7Var.b()) {
            float[] P = P(x7Var3.f35096a, x7Var2.f35096a);
            x7Var3.a(P[0]);
            x7Var2.a(P[1]);
        }
        y7Var.H = 4;
        y7Var.W = 0.0f;
        y7Var.X = x7Var3.f35096a;
        y7Var.Y = x7Var2.f35096a;
        y7Var.Z = y7Var.f35141g.f35096a * x7Var.f35096a;
        y7Var.f35134a0 = y7Var.f35142i.f35096a;
        if (this.f35216r0 > AndroidUtilities.dp(650.0f)) {
            f7 = 0.32f;
        } else {
            f7 = 0.44f;
        }
        y7Var.f35136b0 = f7;
        this.f35216r0 = 0.0f;
        m7 j10 = j(y7Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.n();
        }
        if (j10 != null) {
            f10 = j10.getScaleX();
        } else {
            f10 = 1.0f;
        }
        y7Var.f35138c0 = f10;
        RectF b02 = b0(y7Var);
        if (b02 != null) {
            float centerX = b02.centerX() - y7Var.X;
            float centerY = b02.centerY() - y7Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            if (hypot > AndroidUtilities.dp(6.0f)) {
                f11 = centerX / hypot;
            } else {
                f11 = 0.0f;
            }
            y7Var.U = f11;
            if (hypot > AndroidUtilities.dp(6.0f)) {
                f12 = centerY / hypot;
            } else {
                f12 = 1.0f;
            }
            y7Var.V = f12;
        }
        y7Var.f35145l.a(0.0f);
        x7Var.a(1.0f);
        long j11 = this.I0 + 1;
        this.I0 = j11;
        y7Var.I = j11;
        R();
        h0();
    }

    public final float[] I(y7 y7Var, float f7, float f10, ArrayList arrayList) {
        float dp = AndroidUtilities.dp(32.0f) / W();
        float f11 = y7Var.h.f35097b;
        for (float f12 = f11; f12 >= dp - 0.001f; f12 -= 0.06f) {
            float[] w9 = w(y7Var, f7, f10, f12, arrayList);
            if (w9 != null && Utilities.dist(w9[0], w9[1], f7, f10) <= AndroidUtilities.dp(26.0f)) {
                return w9;
            }
        }
        return w(y7Var, f7, f10, f11, arrayList);
    }

    public final ArrayList J() {
        ArrayList<RectF> stickerObstacles = this.f35184c.getStickerObstacles();
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
        ArrayList arrayList = new ArrayList(this.f35191f.values());
        List.EL.sort(arrayList, Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(2)));
        return arrayList;
    }

    public final void M(y7 y7Var, float[] fArr, float[] fArr2, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        long j10 = y7Var.J;
        x7 x7Var = y7Var.f35148o;
        x7 x7Var2 = y7Var.f35147n;
        if (j10 == 0) {
            long j11 = this.M0 + 1;
            this.M0 = j11;
            y7Var.J = j11;
            ArrayList arrayList = new ArrayList();
            for (y7 y7Var2 : this.f35191f.values()) {
                if (y7Var2 != y7Var && y7Var2.b()) {
                    arrayList.add(y7Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.EL.sort(arrayList, Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(3)));
                for (int i10 = 0; i10 <= arrayList.size() - 10; i10++) {
                    y7 y7Var3 = (y7) arrayList.get(i10);
                    if (this.d.O()) {
                        G(y7Var3);
                    } else {
                        X(y7Var3);
                    }
                }
                k();
            }
        }
        y7Var.H = 1;
        y7Var.Q = false;
        y7Var.M = false;
        y7Var.L = false;
        y7Var.P = z10;
        y7Var.O = z10;
        long j12 = this.I0 + 1;
        this.I0 = j12;
        y7Var.I = j12;
        x7Var2.a(0.0f);
        x7Var.a(0.0f);
        x7 x7Var3 = y7Var.e;
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
        x7Var3.d = f7;
        x7Var3.e = f10;
        x7Var3.a(fArr[0]);
        x7Var3.f35097b = fArr2[0];
        x7 x7Var4 = y7Var.f35140f;
        if (z10) {
            f13 = 150.0f;
        }
        if (!z10) {
            f15 = 1.0f;
        }
        x7Var4.d = f13;
        x7Var4.e = f15;
        x7Var4.a(fArr[1]);
        float f17 = fArr2[1];
        x7Var4.f35097b = f17;
        y7Var.h.f35097b = fArr2[2];
        x7 x7Var5 = y7Var.f35141g;
        x7Var5.d = 300.0f;
        x7Var5.e = 0.5f;
        x7Var5.f35097b = 1.0f;
        x7 x7Var6 = y7Var.f35143j;
        if (z10) {
            f14 = 110.0f;
        }
        x7Var6.d = f14;
        x7Var6.e = 0.9f;
        x7Var6.f35097b = 0.0f;
        y7Var.f35146m.f35097b = 1.0f;
        y7Var.f35145l.f35097b = 0.0f;
        float f18 = fArr2[0] - fArr[0];
        float f19 = f17 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f18, f19));
        if (max > AndroidUtilities.dp(6.0f)) {
            f11 = f18 / max;
        } else {
            f11 = 0.0f;
        }
        y7Var.U = f11;
        if (max > AndroidUtilities.dp(6.0f)) {
            f12 = f19 / max;
        } else {
            f12 = 1.0f;
        }
        y7Var.V = f12;
        x7 x7Var7 = y7Var.f35144k;
        x7Var7.a(0.9f);
        x7Var7.f35097b = 0.0f;
        if (z10) {
            float min = Math.min(AndroidUtilities.dp(110.0f), 0.32f * max);
            if (f18 >= 0.0f) {
                f16 = -1.0f;
            }
            x7Var2.a(0.0f);
            x7Var2.f35098c = ((-f19) / max) * min * f16 * 20.0f;
            x7Var.a(0.0f);
            x7Var.f35098c = com.google.android.gms.internal.play_billing.k3.B(min, 0.5f, (f18 / max) * min * f16, 20.0f);
        }
        R();
        h0();
    }

    public final void O(y7 y7Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z10) {
        y7Var.h.a((float) (mediaAreaCoordinates.f20509w / 23.100000381469727d));
        y7Var.f35142i.a(c((float) mediaAreaCoordinates.rotation));
        y7Var.N = z10;
        y7Var.e.a((((float) mediaAreaCoordinates.f20510x) / 100.0f) * this.T0);
        y7Var.f35140f.a((((float) mediaAreaCoordinates.f20511y) / 100.0f) * this.U0);
        y7Var.f35141g.a(1.0f);
        y7Var.f35143j.a(0.0f);
        y7Var.f35144k.a(0.0f);
        y7Var.f35147n.a(0.0f);
        y7Var.f35148o.a(0.0f);
        y7Var.f35145l.a(0.0f);
        y7Var.H = 2;
        long j10 = this.I0 + 1;
        this.I0 = j10;
        y7Var.I = j10;
        y7Var.f35146m.a(1.0f);
        if (y7Var.J == 0) {
            long j11 = this.M0 + 1;
            this.M0 = j11;
            y7Var.J = j11;
        }
        if (y7Var.f35133a.equals(this.K0)) {
            this.O0 = y7Var;
            this.N0 = y7Var;
            this.P0 = 1.0f;
            e();
        }
    }

    public final float[] P(float f7, float f10) {
        float[] fArr = {f7, f10};
        this.f35215r.mapPoints(fArr);
        return fArr;
    }

    public final void R() {
        if (!this.f35181b && this.T0 > 0.0f && this.U0 > 0.0f) {
            SharedPreferences.Editor edit = this.e.edit();
            for (y7 y7Var : this.f35191f.values()) {
                boolean b10 = y7Var.b();
                String str = y7Var.f35133a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", y7Var.e.f35097b / this.T0);
                        jSONObject.put("y", y7Var.f35140f.f35097b / this.U0);
                        jSONObject.put("r", y7Var.f35142i.f35097b);
                        jSONObject.put("s", y7Var.h.f35097b);
                        jSONObject.put("q", y7Var.N);
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
        if (!this.Y0 || this.f35180a1 != 0) {
            return;
        }
        if (!this.V0 && (this.f35202k0 || !C())) {
            AndroidUtilities.runOnUIThread(this.f35183b1, 1000L);
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
            y7 y7Var = (y7) obj;
            boolean b10 = y7Var.b();
            String str2 = y7Var.f35133a;
            if (b10) {
                sb2.append(str2);
                sb2.append(':');
                sb2.append(A(c0(y7Var)));
                sb2.append(';');
                if (str2.equals(this.K0) && m(y7Var)) {
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
            y7 y7Var2 = (y7) obj2;
            boolean b11 = y7Var2.b();
            String str3 = y7Var2.f35133a;
            if (b11) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                inputwalletcardsticker.nft_address = str3;
                inputwalletcardsticker.coordinates = c0(y7Var2);
                setcardstickers.stickers.add(inputwalletcardsticker);
                if (str3.equals(this.K0) && m(y7Var2)) {
                    setcardstickers.bg_nft_address = str3;
                }
            }
        }
        this.Y0 = false;
        int currentAccount = this.f35178a.getCurrentAccount();
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
            y7 y7Var3 = (y7) this.f35191f.get(inputwalletcardsticker3.nft_address);
            if (y7Var3 != null && y7Var3.f35135b != null) {
                TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                cardsticker.nft = y7Var3.f35135b;
                cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                cardVar2.stickers.add(cardsticker);
                if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                    cardVar2.bg_nft_item = y7Var3.f35135b;
                }
            }
        }
        g0(currentAccount, cardVar2);
        this.f35180a1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new Object(), new eg(this, currentAccount, cardVar, 3));
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

    public final void U(m7 m7Var) {
        int i10;
        int i11;
        removeCallbacks(this.f35226v1);
        this.f35207n0 = true;
        this.f35202k0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.J0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J0 = null;
        }
        m7Var.animate().cancel();
        m7Var.m(m7Var.getScaleX() * m7Var.f34603q0);
        m7Var.setScaleX(1.0f);
        m7Var.setScaleY(1.0f);
        m7Var.l(1.0f, 150L, null);
        final y7 v = v(m7Var.f34601o0);
        String str = v.f35133a;
        if (!b(v) && !v.b()) {
            this.f35207n0 = false;
            return;
        }
        i80 I = i80.I(this.f35178a, m7Var);
        I.f27141s = 51;
        if (m(v) || str.equals(this.K0)) {
            int i12 = R.drawable.msg_colors;
            if (str.equals(this.K0)) {
                i10 = R.string.WalletGiftRemoveColor;
            } else {
                i10 = R.string.WalletGiftApplyColor;
            }
            I.c(i12, LocaleController.getString(i10), new Runnable(this) {
                public final z7 f34798b;

                {
                    this.f34798b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f34798b.e0(v);
                            return;
                        default:
                            z7 z7Var = this.f34798b;
                            z7Var.getClass();
                            z7Var.d0(v.f35135b);
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
            public final z7 f34798b;

            {
                this.f34798b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f34798b.e0(v);
                        return;
                    default:
                        z7 z7Var = this.f34798b;
                        z7Var.getClass();
                        z7Var.d0(v.f35135b);
                        return;
                }
            }
        }, false);
        I.f27136p = new r7(this, 0);
        I.Z();
        performHapticFeedback(0);
    }

    public final float W() {
        return this.T0 * 0.231f;
    }

    public final void X(y7 y7Var) {
        if (y7Var.f35133a.equals(this.K0)) {
            l();
        }
        y7Var.N = false;
        g(y7Var);
        m7 j10 = j(y7Var);
        if (j10 != null) {
            j10.setScaleX(0.93f);
            j10.setScaleY(0.93f);
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        R();
        h0();
    }

    public final void Y(y7 y7Var, float f7, float f10) {
        boolean z10;
        float[] fArr;
        boolean z11;
        this.f35196h0 = true;
        if (this.F0 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35200j0 = z10;
        if (this.f35186c1) {
            if (y7Var == this.f35193f1 && !z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f35188d1 = z11;
            this.f35190e1 = false;
            this.f35186c1 = false;
            MessagesController.getGlobalMainSettings().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z12 = y7Var.N;
        x7 x7Var = y7Var.f35146m;
        x7 x7Var2 = y7Var.f35140f;
        x7 x7Var3 = y7Var.e;
        float f11 = 1.0f;
        if (z12) {
            y7Var.N = false;
            x7 x7Var4 = y7Var.h;
            x7Var4.d = 420.0f;
            x7Var4.e = 0.8f;
            x7Var4.f35097b = 1.0f;
        }
        m7 j10 = j(y7Var);
        if (j10 != null) {
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.f35209o0 = false;
        if (this.f35200j0) {
            fArr = P(x7Var3.f35096a, x7Var2.f35096a);
        } else {
            RectF b02 = b0(y7Var);
            if (b02 == null) {
                return;
            }
            float[] fArr2 = {b02.centerX(), b02.centerY()};
            x7 x7Var5 = y7Var.f35141g;
            x7Var5.d = 500.0f;
            x7Var5.e = 0.75f;
            x7Var5.a((f(y7Var) * b02.width()) / W());
            x7Var.a(0.0f);
            m5.g0((m5) this.d.f17043c, 0L);
            fArr = fArr2;
        }
        x7Var3.d = 1100.0f;
        x7Var3.e = 0.9f;
        x7Var3.a(fArr[0]);
        x7Var2.d = 1100.0f;
        x7Var2.e = 0.9f;
        x7Var2.a(fArr[1]);
        y7Var.H = 3;
        long j11 = this.I0 + 1;
        this.I0 = j11;
        y7Var.I = j11;
        x7Var.f35097b = 1.0f;
        x7 x7Var6 = y7Var.f35143j;
        x7Var6.d = 320.0f;
        x7Var6.e = 0.75f;
        x7Var6.f35097b = 1.0f;
        y7Var.f35145l.a(0.0f);
        this.f35223u0 = fArr[0] - f7;
        this.f35225v0 = fArr[1] - f10;
        if (!this.f35200j0) {
            f11 = 0.0f;
        }
        this.N.f35097b = f11;
        performHapticFeedback(3);
    }

    public final void Z(y7 y7Var, boolean z10) {
        this.N0 = this.O0;
        this.O0 = y7Var;
        this.P0 = 0.0f;
        this.S0 = z10;
        if (y7Var != null) {
            this.Q0 = y7Var.e.f35097b / this.T0;
            this.R0 = y7Var.f35140f.f35097b / this.U0;
        }
        h0();
    }

    public final void a() {
        this.f35204l0 = false;
        removeCallbacks(this.f35229w1);
        removeCallbacks(this.f35226v1);
        this.f35194g0 = null;
        VelocityTracker velocityTracker = this.J0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J0 = null;
        }
        h0();
    }

    public final void a0(e0 e0Var) {
        TL_wallet.nftItem nftitem;
        ArrayList arrayList = e0Var.f34160a;
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
        Iterator it = this.f35191f.values().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            y7 y7Var = (y7) it.next();
            int i11 = y7Var.H;
            String str = y7Var.f35133a;
            if (i11 != 3) {
                ArrayList arrayList2 = e0Var.f34162c;
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
        if (z10 && !this.f35181b) {
            R();
            k();
        }
        h0();
    }

    public final RectF b0(y7 y7Var) {
        m7 j10 = j(y7Var);
        if (j10 != null && j10.isShown()) {
            Matrix matrix = this.v;
            x5.m(j10, matrix);
            Matrix matrix2 = this.f35227w;
            x5.m(this, matrix2);
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

    public final TL_stories.TL_mediaAreaCoordinates c0(y7 y7Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float W = W() * y7Var.h.f35097b;
        tL_mediaAreaCoordinates.f20510x = Q((y7Var.e.f35097b / this.T0) * 100.0f);
        tL_mediaAreaCoordinates.f20511y = Q((y7Var.f35140f.f35097b / this.U0) * 100.0f);
        tL_mediaAreaCoordinates.f20509w = Q((W / this.T0) * 100.0f);
        tL_mediaAreaCoordinates.h = Q((W / this.U0) * 100.0f);
        float f7 = y7Var.f35142i.f35097b % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        tL_mediaAreaCoordinates.rotation = Q(f7);
        return tL_mediaAreaCoordinates;
    }

    public final void d(TL_wallet.card cardVar) {
        String str;
        y7 y7Var;
        y7 y7Var2;
        int i10;
        this.W0 = cardVar;
        this.X0 = V(cardVar);
        if (!this.Y0 && this.f35180a1 == 0 && !this.f35202k0) {
            TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
            y7 y7Var3 = null;
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
            if (this.f35181b) {
                TL_wallet.nftItem nftitem3 = cardVar.bg_nft_item;
                if (nftitem3 != null && nftitem3.gift != null) {
                    y7Var3 = v(nftitem3);
                }
                this.N0 = y7Var3;
                this.O0 = y7Var3;
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
                    y7 y7Var4 = (y7) obj;
                    if (y7Var4.K && (i10 = y7Var4.H) != 3 && i10 != 4 && i10 != 5) {
                        TL_wallet.cardSticker T = T(y7Var4.f35133a);
                        if (T != null) {
                            if (!y7Var4.b() || !A(c0(y7Var4)).equals(A(T.coordinates))) {
                                O(y7Var4, T.coordinates, y7Var4.N);
                            }
                        } else if (y7Var4.b()) {
                            G(y7Var4);
                        }
                    }
                }
                ArrayList<TL_wallet.cardSticker> arrayList2 = cardVar.stickers;
                LinkedHashMap linkedHashMap = this.f35191f;
                if (arrayList2 != null) {
                    int size3 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        TL_wallet.cardSticker cardsticker2 = arrayList2.get(i13);
                        i13++;
                        TL_wallet.nftItem nftitem4 = cardsticker2.nft;
                        if (nftitem4 == null) {
                            y7Var2 = null;
                        } else {
                            y7Var2 = (y7) linkedHashMap.get(nftitem4.address);
                        }
                        if (y7Var2 != null && y7Var2.H == 2) {
                            long j10 = this.I0 + 1;
                            this.I0 = j10;
                            y7Var2.I = j10;
                        }
                    }
                }
                if (!equals) {
                    String str2 = this.K0;
                    if (str2 == null) {
                        y7Var = null;
                    } else {
                        y7Var = (y7) linkedHashMap.get(str2);
                    }
                    if (y7Var != null && y7Var.b()) {
                        Z(y7Var, false);
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
        y7 v = v(nftitem);
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
        y7 y7Var = this.N0;
        if (y7Var == null) {
            stargiftattributebackdrop = null;
        } else {
            stargiftattributebackdrop = y7Var.f35153t;
        }
        float[] g10 = n7.g(stargiftattributebackdrop);
        y7 y7Var2 = this.O0;
        if (y7Var2 == null) {
            stargiftattributebackdrop2 = null;
        } else {
            stargiftattributebackdrop2 = y7Var2.f35153t;
        }
        float[] g11 = n7.g(stargiftattributebackdrop2);
        float f7 = 1.0f;
        if (this.S0) {
            float f10 = this.P0;
            pow = com.google.android.gms.internal.play_billing.k3.B(f10, 2.0f, 3.0f, f10 * f10);
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
        y7 y7Var3 = this.N0;
        if (y7Var3 == null) {
            stargiftattributebackdrop3 = null;
        } else {
            stargiftattributebackdrop3 = y7Var3.f35153t;
        }
        n7.k(fArr, 0, stargiftattributebackdrop3);
        y7 y7Var4 = this.O0;
        if (y7Var4 == null) {
            stargiftattributebackdrop4 = null;
        } else {
            stargiftattributebackdrop4 = y7Var4.f35153t;
        }
        n7.k(fArr, 1, stargiftattributebackdrop4);
        this.f35184c.setStickerStyle(fArr);
    }

    public final void e0(y7 y7Var) {
        String str = y7Var.f35133a;
        if (str.equals(this.K0)) {
            l();
        } else if (m(y7Var)) {
            this.K0 = str;
            if (y7Var.b()) {
                Z(y7Var, false);
                k();
            } else {
                this.L0 = str;
                f0(y7Var);
                if (y7Var.H == 0) {
                    this.L0 = null;
                    this.K0 = null;
                } else {
                    k();
                }
            }
            R();
        }
    }

    public final float f(y7 y7Var) {
        m7 j10 = j(y7Var);
        if (j10 != null) {
            org.telegram.ui.Components.w9 w9Var = j10.f50330y;
            if (j10.getWidth() > 0 && w9Var.getWidth() > 0) {
                return ((w9Var.getWidth() / j10.getWidth()) * 288.0f) / 268.0f;
            }
            return 0.77f;
        }
        return 0.77f;
    }

    public final void f0(y7 y7Var) {
        m5.g0((m5) this.d.f17043c, 2600L);
        if (C()) {
            float[] z10 = z(y7Var, this.T0 * 0.6f, this.U0 * 0.68f, true);
            RectF b02 = b0(y7Var);
            if (z10 != null && b02 != null) {
                y7Var.f35141g.a((f(y7Var) * b02.width()) / W());
                y7Var.f35146m.a(0.0f);
                y7Var.f35143j.a(1.0f);
                float[] fArr = {b02.centerX(), b02.centerY()};
                this.f35218s.mapPoints(fArr);
                M(y7Var, fArr, z10, true);
                performHapticFeedback(3);
                return;
            }
            m7 j10 = j(y7Var);
            if (j10 != null) {
                j10.animate().rotation(3.0f).setDuration(90L).withEndAction(new p7(j10, 0)).start();
            }
        }
    }

    public final void g(y7 y7Var) {
        y7Var.H = 0;
        y7Var.J = 0L;
        y7Var.f35141g.a(1.0f);
        y7Var.h.a(1.0f);
        y7Var.f35142i.a(0.0f);
        y7Var.f35146m.a(0.0f);
        y7Var.f35143j.a(0.0f);
        y7Var.f35144k.a(0.0f);
        m7 j10 = j(y7Var);
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
            u7 u7Var = this.f35232x1;
            removeCallbacks(u7Var);
            postOnAnimation(u7Var);
        }
    }

    public final void i(m7 m7Var) {
        float f7;
        ArrayList arrayList = this.h;
        if (!arrayList.contains(m7Var)) {
            arrayList.add(m7Var);
        }
        y7 v = v(m7Var.f34601o0);
        if (v.H == 0) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        m7Var.j(v.R, false, f7);
        h0();
    }

    public final m7 j(y7 y7Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m7 m7Var = (m7) obj;
            if (m7Var.isAttachedToWindow() && m7Var.f34601o0.address.equals(y7Var.f35133a)) {
                return m7Var;
            }
        }
        return null;
    }

    public final void k() {
        if (!this.f35181b && !this.Z0) {
            this.Y0 = true;
            r7 r7Var = this.f35183b1;
            AndroidUtilities.cancelRunOnUIThread(r7Var);
            AndroidUtilities.runOnUIThread(r7Var, 1500L);
        }
    }

    public final void l() {
        this.L0 = null;
        this.K0 = null;
        Z(null, true);
        R();
        k();
    }

    public final boolean m(y7 y7Var) {
        if (b(y7Var) && H(this.f35178a.getCurrentAccount(), y7Var.f35135b.gift.slug)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f35222t1);
        getViewTreeObserver().addOnPreDrawListener(this.f35224u1);
        for (y7 y7Var : this.f35191f.values()) {
            y7Var.f35137c.onAttachedToWindow();
            y7Var.d.onAttachedToWindow();
        }
        h0();
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.f35222t1);
        getViewTreeObserver().removeOnPreDrawListener(this.f35224u1);
        removeCallbacks(this.f35232x1);
        removeCallbacks(this.f35226v1);
        for (y7 y7Var : this.f35191f.values()) {
            y7Var.f35137c.onDetachedFromWindow();
            y7Var.d.onDetachedFromWindow();
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
        y7 y7Var;
        RectF rectF;
        ArrayList arrayList;
        x7 x7Var;
        z7 z7Var = this;
        Canvas canvas2 = canvas;
        if (z7Var.C()) {
            float f16 = z7Var.N.f35096a;
            int i12 = (f16 > 0.01f ? 1 : (f16 == 0.01f ? 0 : -1));
            RectF rectF2 = z7Var.H;
            Paint paint = z7Var.f35230x;
            if (i12 < 0) {
                f10 = 0.0f;
                f11 = 2.0f;
                i10 = 0;
                f12 = 0.6f;
                f7 = 0.4f;
            } else {
                float max = Math.max(0.0f, Math.min(1.2f, z7Var.O.f35096a));
                float clamp01 = Utilities.clamp01(max);
                f7 = 0.4f;
                Paint paint2 = z7Var.G;
                paint2.setTextSize(AndroidUtilities.dp(15.0f));
                float measureText = (((paint2.measureText(LocaleController.getString(R.string.Remove)) + AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(56.0f)) * max) + AndroidUtilities.dp(56.0f);
                canvas2.save();
                f10 = 0.0f;
                canvas2.translate(z7Var.getWidth() / 2.0f, ((1.0f - f16) * AndroidUtilities.dp(90.0f)) + z7Var.h());
                float f17 = (f16 * 0.4f) + 0.6f;
                canvas2.scale(f17, f17);
                int i13 = org.telegram.ui.ActionBar.h6.f20993d6;
                org.telegram.ui.ActionBar.n2 n2Var = z7Var.f35178a;
                paint.setColor(i0.a.f(clamp01, org.telegram.ui.ActionBar.h6.w0(i13, n2Var.getResourceProvider()), -1750963));
                paint.setAlpha((int) (Utilities.clamp01(f16) * 255.0f));
                float f18 = (-measureText) / 2.0f;
                float f19 = measureText / 2.0f;
                rectF2.set(f18, -AndroidUtilities.dp(28.0f), f19, AndroidUtilities.dp(28.0f));
                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), paint);
                float dp = (f18 + AndroidUtilities.dp(30.0f)) * clamp01;
                float dp2 = AndroidUtilities.dp(21.0f);
                int round = Math.round(z7Var.f35185c0.f35096a);
                f11 = 2.0f;
                uj0 uj0Var = z7Var.f35189e0;
                uj0Var.N(round, false, false);
                float f20 = dp - dp2;
                i10 = 0;
                f12 = 0.6f;
                float f21 = -dp2;
                float f22 = dp + dp2;
                uj0Var.setBounds((int) f20, (int) f21, (int) f22, (int) dp2);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.f(clamp01, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, n2Var.getResourceProvider()), -1), PorterDuff.Mode.SRC_IN);
                Paint paint3 = z7Var.f35187d0;
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
            ArrayList K = z7Var.K();
            int size = K.size();
            int i14 = i10;
            while (i14 < size) {
                int i15 = i14 + 1;
                y7 y7Var2 = (y7) K.get(i14);
                x7 x7Var2 = y7Var2.e;
                x7 x7Var3 = y7Var2.f35142i;
                float f23 = x7Var2.f35096a;
                float f24 = y7Var2.f35140f.f35096a;
                float W = z7Var.W() * y7Var2.f35141g.f35096a * y7Var2.h.f35096a;
                float f25 = y7Var2.f35143j.f35096a;
                int i16 = y7Var2.H;
                if (i16 == 1 && y7Var2.O && f25 > 0.3f) {
                    float[] P = z7Var.P(f23 + y7Var2.f35147n.f35096a, f24 + y7Var2.f35148o.f35096a);
                    float f26 = P[i10];
                    float f27 = P[1];
                    W = com.google.android.gms.internal.play_billing.k3.A(f25, 0.15f, 1.0f, W);
                    f13 = f27;
                    f23 = f26;
                } else if (i16 != 3 && i16 != 4 && i16 != 5) {
                    i14 = i15;
                } else {
                    f13 = f24;
                }
                float f28 = W;
                Bitmap a2 = y7Var2.a();
                if (a2 != null) {
                    if (f28 >= 1.0f) {
                        canvas2.save();
                        canvas2.rotate(x7Var3.f35096a, f23, f13);
                        Paint paint4 = paint;
                        z7Var.t(canvas2, y7Var2, f23, (AndroidUtilities.dp(5.0f) * f25) + AndroidUtilities.dp(1.5f) + f13, com.google.android.gms.internal.play_billing.k3.A(f25, 0.04f, 1.0f, f28), f25, 0.0f, 1.0f);
                        canvas.restore();
                        float clamp012 = Utilities.clamp01(y7Var2.f35146m.f35096a);
                        if (y7Var2.H == 4 && y7Var2.W > f12 && z7Var.j(y7Var2) != null) {
                            float clamp013 = Utilities.clamp01((y7Var2.W - f12) / f7);
                            float f29 = (1.0f - ((3.0f - (clamp013 * f11)) * (clamp013 * clamp013))) * 0.45f;
                            float clamp014 = (1.0f - (Utilities.clamp01(-y7Var2.V) * f12)) * 0.55f;
                            if (clamp012 < 1.0f) {
                                paint4.setAlpha((int) ((1.0f - clamp012) * 255.0f));
                                ArrayList arrayList2 = K;
                                x7Var = x7Var3;
                                f15 = f28;
                                arrayList = arrayList2;
                                i11 = size;
                                rectF = rectF2;
                                f14 = f13;
                                y7Var = y7Var2;
                                z7Var.r(canvas, y7Var2.v, f23, f14, f15, f29, clamp014, x7Var3.f35096a, y7Var2.U, y7Var2.V);
                            } else {
                                f14 = f13;
                                i11 = size;
                                f15 = f28;
                                y7Var = y7Var2;
                                rectF = rectF2;
                                arrayList = K;
                                x7Var = x7Var3;
                            }
                            if (clamp012 > f10) {
                                paint4.setAlpha((int) (clamp012 * 255.0f));
                                canvas2 = canvas;
                                r(canvas2, a2, f23, f14, f15, f29, clamp014, x7Var.f35096a, y7Var.U, y7Var.V);
                            } else {
                                canvas2 = canvas;
                            }
                            paint4.setAlpha(255);
                            paint = paint4;
                            rectF2 = rectF;
                            i14 = i15;
                            K = arrayList;
                            size = i11;
                            z7Var = this;
                        } else {
                            float f30 = f13;
                            ArrayList arrayList3 = K;
                            int i17 = size;
                            RectF rectF3 = rectF2;
                            canvas2 = canvas;
                            canvas2.save();
                            canvas2.rotate(x7Var3.f35096a, f23, f30);
                            float f31 = f28 / f11;
                            rectF3.set(f23 - f31, f30 - f31, f23 + f31, f31 + f30);
                            if (clamp012 < 1.0f) {
                                paint4.setAlpha((int) ((1.0f - clamp012) * 255.0f));
                                rect = null;
                                canvas2.drawBitmap(y7Var2.v, (Rect) null, rectF3, paint4);
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
                            z7Var = this;
                        }
                    }
                } else {
                    z7Var = this;
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
        AndroidUtilities.removeFromParent(this.f35217r1);
        AndroidUtilities.removeFromParent(this.f35220s1);
        this.f35220s1 = null;
        this.f35217r1 = null;
        R();
        AndroidUtilities.cancelRunOnUIThread(this.f35183b1);
        this.V0 = true;
        if (this.Y0) {
            S();
        }
        this.f35189e0.C(false);
        removeCallbacks(this.f35232x1);
        removeCallbacks(this.f35226v1);
        removeCallbacks(this.f35229w1);
        VelocityTracker velocityTracker = this.J0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J0 = null;
        }
        for (y7 y7Var : this.f35191f.values()) {
            y7Var.f35137c.onDetachedFromWindow();
            y7Var.d.onDetachedFromWindow();
        }
        this.h.clear();
    }

    public final void q(org.telegram.ui.Wallet.y7 r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.z7.q(org.telegram.ui.Wallet.y7, float, float):void");
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
                canvas.drawBitmapMesh(bitmap, 14, 14, this.J, 0, this.K, 0, this.f35230x);
                return;
            }
        }
    }

    public final void s(Canvas canvas, y7 y7Var, float f7, float f10, boolean z10) {
        float f11;
        int i10;
        ImageReceiver imageReceiver = y7Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = y7Var.f35153t;
        Bitmap bitmap = imageReceiver.getBitmap();
        if (bitmap != null && stargiftattributebackdrop != null) {
            canvas.save();
            float f12 = this.T0;
            float f13 = this.U0;
            Path path = this.I;
            w7.i6.a(path, f12, f13);
            canvas.clipPath(path);
            this.f35184c.j(path, this.T0, this.U0);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i11 >= 0 && !z10) {
                path.rewind();
                path.addCircle(this.Q0 * this.T0, this.R0 * this.U0, f10, Path.Direction.CW);
                canvas.clipPath(path);
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
            Paint paint = this.f35230x;
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
                    float B = 0.15f * f7 * com.google.android.gms.internal.play_billing.k3.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
                    if (i16 >= 0) {
                        f11 = 2.0f;
                        float clamp012 = Utilities.clamp01((f10 - Utilities.dist(f16, f17, this.Q0 * this.T0, this.R0 * this.U0)) / AndroidUtilities.dp(120.0f));
                        if (z10) {
                            f18 = com.google.android.gms.internal.play_billing.k3.B(clamp012, 0.8f, 1.0f, f18);
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

    public final void t(Canvas canvas, y7 y7Var, float f7, float f10, float f11, float f12, float f13, float f14) {
        if (f14 > 0.01f && y7Var.f35155w != null) {
            float f15 = (((0.05f * f12) + 1.0f) * ((f11 * 176.0f) / 128.0f)) / 2.0f;
            float f16 = f7 - f15;
            float f17 = f10 - f15;
            float f18 = f7 + f15;
            float f19 = f10 + f15;
            RectF rectF = this.H;
            rectF.set(f16, f17, f18, f19);
            Paint paint = this.f35230x;
            int alpha = paint.getAlpha();
            paint.setColor(-16044452);
            float clamp01 = Utilities.clamp01(y7Var.f35146m.f35096a);
            paint.setAlpha((int) (clamp01 * Utilities.clamp01((f13 * 0.12f) + (f12 * (-0.049999997f)) + 0.16f) * 255.0f * f14));
            canvas.drawBitmap(y7Var.f35155w, (Rect) null, rectF, paint);
            paint.setColor(-1);
            paint.setAlpha(alpha);
        }
    }

    public final y7 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f35191f;
        y7 y7Var = (y7) linkedHashMap.get(str);
        if (y7Var == null) {
            y7Var = new y7(this, nftitem);
            linkedHashMap.put(nftitem.address, y7Var);
        }
        y7Var.f35135b = nftitem;
        return y7Var;
    }

    public final float[] w(y7 y7Var, float f7, float f10, float f11, ArrayList arrayList) {
        float W = W() * 0.5f * f11;
        float f12 = Float.MAX_VALUE;
        float[] fArr = null;
        for (float f13 = W; f13 <= this.U0 - W; f13 += AndroidUtilities.dp(4.0f)) {
            for (float f14 = W; f14 <= this.T0 - W; f14 += AndroidUtilities.dp(4.0f)) {
                float dist = Utilities.dist(f14, f13, f7, f10);
                if (dist < f12 && y(y7Var, f14, f13, f11, arrayList)) {
                    fArr = new float[]{f14, f13, f11};
                    f12 = dist;
                }
            }
        }
        return fArr;
    }

    public final void x(float r21, float r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.z7.x(float, float, boolean):void");
    }

    public final boolean y(y7 y7Var, float f7, float f10, float f11, ArrayList arrayList) {
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
                    for (y7 y7Var2 : this.f35191f.values()) {
                        if (y7Var2 != y7Var && y7Var2.b()) {
                            if (Utilities.dist(y7Var2.e.f35097b, y7Var2.f35140f.f35097b, f7, f10) < (y7Var2.h.f35097b + f11) * W() * 0.29f) {
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final float[] z(y7 y7Var, float f7, float f10, boolean z10) {
        float f11;
        Random random;
        float min;
        float nextFloat;
        char c10;
        ArrayList J = J();
        float dp = AndroidUtilities.dp(32.0f) / W();
        float f12 = y7Var.h.f35097b;
        char c11 = 2;
        LinkedHashMap linkedHashMap = this.f35191f;
        char c12 = 3;
        char c13 = 1;
        int i10 = 0;
        if (!z10) {
            RectF rectF = new RectF((RectF) J.get(3));
            rectF.inset(-AndroidUtilities.dp(10.0f), -AndroidUtilities.dp(10.0f));
            if (rectF.contains(f7, f10)) {
                boolean z11 = false;
                for (y7 y7Var2 : linkedHashMap.values()) {
                    if (y7Var2 != y7Var && y7Var2.b() && y7Var2.N) {
                        z11 = true;
                    }
                }
                if (!z11) {
                    float f13 = this.T0;
                    float f14 = this.U0;
                    x5 x5Var = this.f35184c;
                    Path path = this.I;
                    x5Var.j(path, f13, f14);
                    path.computeBounds(rectF, true);
                    y7Var.N = true;
                    float max = Math.max(dp, Math.min(1.1f, (rectF.width() * 1.22f) / W()));
                    return new float[]{rectF.centerX(), ((rectF.height() * 0.08f) + rectF.top) - ((W() * max) * 0.38f), max};
                }
            }
            y7Var.N = false;
            return I(y7Var, f7, f10, new ArrayList());
        }
        y7Var.N = false;
        ArrayList arrayList = new ArrayList();
        for (y7 y7Var3 : linkedHashMap.values()) {
            char c14 = c11;
            if (y7Var3 != y7Var && y7Var3.b()) {
                arrayList.add(y7Var3);
            }
            c11 = c14;
        }
        char c15 = c11;
        Random random2 = new Random((System.nanoTime() / 400000000) + (arrayList.size() * 31) + (y7Var.f35133a.hashCode() * 7919));
        float d = org.telegram.ui.Cells.c1.d(random2, 0.04f, 0.05f);
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
                        y7 y7Var4 = (y7) obj;
                        min4 = Math.min(min4, (Utilities.dist(f17, f16, y7Var4.e.f35097b, y7Var4.f35140f.f35097b) / (W() * 0.29f)) - y7Var4.h.f35097b);
                    }
                    float clamp01 = ((Utilities.clamp01((min2 - ((W() * 0.5f) * min4)) / AndroidUtilities.dp(14.0f)) * 0.1f) + 0.9f) * min4;
                    if (clamp01 < f20) {
                        random = random2;
                    } else {
                        if (arrayList.isEmpty()) {
                            float f23 = this.T0 * 0.6f;
                            float y3 = com.google.android.gms.internal.play_billing.k3.y(f7, f23, 0.2f, f23);
                            float f24 = this.U0 * 0.68f;
                            nextFloat = (random2.nextFloat() * AndroidUtilities.dp(5.0f)) + (W() * clamp01 * 1.1f) + (Utilities.dist(f17, f16, y3, com.google.android.gms.internal.play_billing.k3.y(f10, f24, 0.2f, f24)) * (-0.45f));
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
                                y7 y7Var5 = (y7) obj2;
                                float f30 = clamp01;
                                x7 x7Var = y7Var5.e;
                                int i16 = size3;
                                x7 x7Var2 = y7Var5.h;
                                Random random3 = random2;
                                x7 x7Var3 = y7Var5.f35140f;
                                f28 = Math.min(f28, Utilities.dist(f17, f16, x7Var.f35097b, x7Var3.f35097b) - ((x7Var2.f35097b + f30) * (W() * 0.4f)));
                                float f31 = x7Var2.f35097b;
                                float f32 = f31 * f31;
                                float f33 = y7Var5.e.f35097b;
                                f27 = (f33 * f32) + f27;
                                f25 = (x7Var3.f35097b * f32) + f25;
                                f26 += f32;
                                f29 = Math.max(0.0f, 1.0f - (Math.abs(x7Var3.f35097b - f16) / (W() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f33 - f17) / (W() * 0.12f))) + f29;
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
