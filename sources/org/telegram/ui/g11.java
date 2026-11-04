package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public abstract class g11 extends FrameLayout implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public static String[] c2;
    public final SparseIntArray A0;
    public boolean A1;
    public final ArrayList B0;
    public String B1;
    public final ArrayList C0;
    public ArrayList C1;
    public boolean D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ArrayList E1;
    public int F;
    public final ArrayList F0;
    public ArrayList F1;
    public int G;
    public final ArrayList G0;
    public ValueAnimator G1;
    public l01 H;
    public final ArrayList H0;
    public boolean H1;
    public e11 I;
    public final ArrayList I0;
    public boolean I1;
    public boolean J;
    public final ArrayList J0;
    public ValueAnimator J1;
    public HashSet K;
    public ArrayList K0;
    public kz0 K1;
    public final HashSet L;
    public final ArrayList L0;
    public ei.a6 L1;
    public final Paint M;
    public ArrayList M0;
    public boolean M1;
    public final Paint N;
    public final ArrayList N0;
    public boolean N1;
    public Drawable O;
    public final boolean O0;
    public View O1;
    public q01 P;
    public boolean P0;
    public int P1;
    public boolean Q;
    public Integer Q0;
    public int Q1;
    public boolean R;
    public boolean R0;
    public long R1;
    public boolean S;
    public List S0;
    public ci.lc S1;
    public final ArrayList T;
    public q01 T0;
    public final kz0 T1;
    public boolean U;
    public boolean U0;
    public final kz0 U1;
    public h01 V;
    public float V0;
    public Runnable V1;
    public final int W;
    public final ImageReceiver W0;
    public ValueAnimator W1;
    public org.telegram.ui.Components.g5 X0;
    public ValueAnimator X1;
    public wz0 Y0;
    public final g2.g Y1;
    public final Integer Z0;
    public final Paint Z1;
    public int f45434a;
    public final int f45435a0;
    public final org.telegram.ui.ActionBar.e6 f45436a1;
    public Integer f45437a2;
    public int f45438b;
    public final b01 f45439b0;
    public float f45440b1;
    public int f45441c;
    public final gi.n5 f45442c0;
    public float f45443c1;
    public int d;
    public final org.telegram.ui.Components.zu[] f45444d0;
    public final org.telegram.ui.ActionBar.d2 f45445d1;
    public int f45446e;
    public org.telegram.ui.Components.zu f45447e0;
    public final int f45448e1;
    public int f45449f;
    public final zz0 f45450f0;
    public final f01 f45451f1;
    public final yz0 f45452g0;
    public int f45453g1;
    public int h;
    public final yg0 f45454h0;
    public boolean f45455h1;
    public final e01 f45456i0;
    public boolean f45457i1;
    public final uz0 f45458j0;
    public ValueAnimator f45459j1;
    public final FrameLayout f45460k0;
    public Drawable k1;
    public final ai.c0 f45461l0;
    public PorterDuffColorFilter f45462l1;
    public final org.telegram.ui.Components.k9 m0;
    public final boolean m1;
    public int f45463n;
    public final View f45464n0;
    public float f45465n1;
    public final org.telegram.ui.Components.sm f45466o0;
    public int f45467o1;
    public final View f45468p0;
    public org.telegram.ui.Components.e5 f45469p1;
    public final g01 f45470q0;
    public Rect f45471q1;
    public int f45472r;
    public final r01 f45473r0;
    public View f45474r1;
    public int f45475s;
    public final vz0 f45476s0;
    public float f45477s1;
    public final org.telegram.ui.Components.vi0 f45478t0;
    public q01 f45479t1;
    public final View f45480u0;
    public Rect f45481u1;
    public int f45482v0;
    public final OvershootInterpolator f45483v1;
    public int f45484w;
    public final ArrayList f45485w0;
    public ValueAnimator f45486w1;
    public int f45487x;
    public final SparseIntArray f45488x0;
    public boolean f45489x1;
    public int f45490y;
    public final SparseIntArray f45491y0;
    public boolean f45492y1;
    public final SparseIntArray f45493z0;
    public boolean f45494z1;
    public static final List f45431b2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] f45432d2 = new boolean[4];
    public static final HashMap f45433e2 = new HashMap();

    public g11(org.telegram.ui.ActionBar.d2 d2Var, Context context, boolean z10, Integer num, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this(d2Var, context, z10, num, i3, true, e6Var, 16);
    }

    public static void D(int i3, org.telegram.ui.Components.k9 k9Var) {
        List list;
        org.telegram.messenger.ac b10;
        String str;
        if (k9Var != null) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.li.b0(i3).f24051t0[1]);
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                list = f45431b2;
                if (i10 >= size) {
                    break;
                }
                if ((arrayList.get(i10) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i10)).documents != null) {
                    ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i10)).documents);
                    Collections.shuffle(arrayList2);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList2.size()) {
                            break;
                        }
                        TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i11);
                        if (document2 != null && list.contains(org.telegram.messenger.zi.V(document2, null, null))) {
                            int i12 = round - 1;
                            if (round <= 0) {
                                round = i12;
                                document = document2;
                                break;
                            }
                            round = i12;
                            document = document2;
                        }
                        i11++;
                    }
                }
                if (document != null && round <= 0) {
                    break;
                }
                i10++;
            }
            if (document == null || round > 0) {
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.li.b0(i3).s0(5));
                Collections.shuffle(arrayList3);
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    if (arrayList3.get(i13) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i13)).documents != null) {
                        ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i13)).documents);
                        Collections.shuffle(arrayList4);
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList4.size()) {
                                break;
                            }
                            TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i14);
                            if (document3 != null && list.contains(org.telegram.messenger.zi.V(document3, null, null))) {
                                int i15 = round - 1;
                                if (round <= 0) {
                                    round = i15;
                                    document = document3;
                                    break;
                                }
                                round = i15;
                                document = document3;
                            }
                            i14++;
                        }
                    }
                    if (document != null && round <= 0) {
                        break;
                    }
                }
            }
            if (document != null) {
                org.telegram.messenger.jz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f28043m6, 0.2f, false);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.ac.b(document);
                    if (d != null) {
                        d.f23763e = 512;
                        d.f23764f = 512;
                    }
                    str = "36_36_g";
                } else {
                    if (d != null && org.telegram.messenger.zi.L2(document, false)) {
                        d.f23763e = 512;
                        d.f23764f = 512;
                    }
                    b10 = org.telegram.messenger.ac.b(document);
                    str = "36_36";
                }
                k9Var.setLayerNum(7);
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                k9Var.m(b10, str, org.telegram.messenger.ac.c(w10, document), "36_36", d, document);
            }
        }
    }

    public static void a(g11 g11Var, int i3, int i10) {
        int i11;
        org.telegram.ui.Components.vi0 vi0Var = g11Var.f45478t0;
        vz0 vz0Var = g11Var.f45476s0;
        View m10 = vz0Var.m(i3);
        int L0 = vz0Var.L0();
        if ((m10 == null && Math.abs(i3 - L0) > 72.0f) || !org.telegram.messenger.az.c()) {
            if (vz0Var.L0() < i3) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            vi0Var.f39126b = i11;
            vi0Var.d(i3, i10, false, false);
            return;
        }
        gi.j1 j1Var = new gi.j1(4, g11Var.f45456i0.getContext(), g11Var);
        j1Var.f55704a = i3;
        j1Var.f20461p = i10;
        vz0Var.w0(j1Var);
    }

    public static boolean c(g11 g11Var) {
        if (!g11Var.U) {
            ValueAnimator valueAnimator = g11Var.W1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i3 = 13;
        int i10 = this.f45435a0;
        if (i10 != 5 && i10 != 7) {
            if (i10 == 6) {
                return org.telegram.ui.Components.g5.f();
            }
            if (i10 != 3 && i10 != 4) {
                i3 = 2;
                if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                    return 3;
                }
            }
        }
        return i3;
    }

    public Drawable getPremiumStar() {
        if (this.k1 == null) {
            int i3 = this.f45435a0;
            if (i3 != 5 && i3 != 9 && i3 != 10 && i3 != 7) {
                this.k1 = k2.p1.g(org.telegram.messenger.t0.f25457b, 2131232362);
            } else {
                this.k1 = k2.p1.g(org.telegram.messenger.t0.f25457b, 2131232133);
            }
            this.k1.setColorFilter(this.f45462l1);
        }
        return this.k1;
    }

    public static ArrayList j(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i3);
            if (document == null || hashSet.contains(Long.valueOf(document.f27007id))) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        long j10;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String c10 = org.telegram.messenger.i6.c(str);
        int i3 = 0;
        while (true) {
            if (i3 < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i3).documents.isEmpty() && TextUtils.equals(org.telegram.messenger.i6.c(tL_messages_stickerSet.packs.get(i3).emoticon), c10)) {
                    j10 = tL_messages_stickerSet.packs.get(i3).documents.get(0).longValue();
                    break;
                }
                i3++;
            } else {
                j10 = 0;
                break;
            }
        }
        if (j10 == 0) {
            return null;
        }
        for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            if (document.f27007id == j10) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.g5 g5Var) {
        org.telegram.ui.Components.g5 g5Var2;
        if (this.J && (g5Var2 = this.X0) != g5Var) {
            if (g5Var2 != null) {
                g5Var2.n(this);
            }
            this.X0 = g5Var;
            if (g5Var != null) {
                g5Var.setColorFilter(this.f45462l1);
                this.X0.a(this);
            }
        }
    }

    public static void t(int i3) {
        boolean[] zArr = f45432d2;
        if (!zArr[i3]) {
            org.telegram.messenger.li.b0(i3);
            zArr[i3] = true;
            org.telegram.messenger.li.b0(i3).B(5);
            org.telegram.messenger.li.b0(i3).L(0, true);
            org.telegram.messenger.li.b0(i3).A();
            org.telegram.messenger.li.b0(i3).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            org.telegram.messenger.li.b0(i3).P();
            org.telegram.messenger.li.b0(i3).v();
            org.telegram.ui.Components.xu0.F3.c(i3, 1, new ei.g(i3, 1));
        }
    }

    public final void A(Long l10) {
        this.L.remove(l10);
        e01 e01Var = this.f45456i0;
        if (e01Var != null) {
            int i3 = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < e01Var.getChildCount(); i10++) {
                if (e01Var.getChildAt(i10) instanceof q01) {
                    q01 q01Var = (q01) e01Var.getChildAt(i10);
                    org.telegram.ui.Components.p5 p5Var = q01Var.f48720e;
                    if (p5Var != null && p5Var.getDocumentId() == l10.longValue()) {
                        q01Var.f();
                    } else {
                        TLRPC.Document document = q01Var.d;
                        if (document != null && document.f27007id == l10.longValue()) {
                            q01Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            e01Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f45485w0;
                    if (i3 < arrayList.size()) {
                        long longValue = ((Long) arrayList.get(i3)).longValue();
                        if (longValue == (l10.longValue() * 13) + 62425 || longValue == (l10.longValue() * 13) + 3212) {
                            break;
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
                g01 g01Var = this.f45470q0;
                if (g01Var != null) {
                    g01Var.g(i3);
                }
            }
        }
    }

    public final void B(boolean r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g11.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        yz0 yz0Var = this.f45452g0;
        if (yz0Var == null) {
            return;
        }
        if (this.A1) {
            yz0Var.clearAnimation();
            yz0Var.setVisibility(0);
            yz0Var.animate().translationY(0.0f).start();
            return;
        }
        e01 e01Var = this.f45456i0;
        if (e01Var.getChildCount() > 0) {
            View childAt = e01Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f45434a && "searchbox".equals(childAt.getTag())) {
                yz0Var.setVisibility(0);
                yz0Var.setTranslationY(childAt.getY());
                return;
            }
            yz0Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
            return;
        }
        yz0Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
    }

    public final void E(float f10) {
        int i3;
        int i10 = -1;
        View view = this.f45464n0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.xq.f40453g.getInterpolation(b8.be.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            view.setScaleY(interpolation * i3);
        }
        org.telegram.ui.Components.sm smVar = this.f45466o0;
        if (smVar != null) {
            float a10 = b8.be.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            smVar.setAlpha(a10);
            smVar.setScaleX(a10);
            if (!n()) {
                i10 = 1;
            }
            smVar.setScaleY(a10 * i10);
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a11 = b8.be.a(f12 / 700.0f, 0.0f, 1.0f);
        float a12 = b8.be.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = b8.be.a(f12 / 750.0f, 0.0f, 1.0f);
        float a14 = b8.be.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        float interpolation2 = xqVar.getInterpolation(a11);
        float interpolation3 = xqVar.getInterpolation(a12);
        this.f45442c0.setAlpha(a14);
        this.f45452g0.setAlpha(a14);
        int i11 = 0;
        for (int i12 = 0; i12 < this.f45447e0.f41058b.getChildCount(); i12++) {
            this.f45447e0.f41058b.getChildAt(i12).setAlpha(a14);
        }
        if (this.f45469p1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a14;
        b01 b01Var = this.f45439b0;
        b01Var.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        if (smVar != null) {
            smVar.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        }
        this.f45440b1 = (interpolation2 * 0.85f) + 0.15f;
        this.f45443c1 = (interpolation3 * 0.925f) + 0.075f;
        b01Var.invalidateOutline();
        if (smVar != null) {
            smVar.setAlpha(a14);
        }
        zz0 zz0Var = this.f45450f0;
        zz0Var.setAlpha(a14);
        zz0Var.setScaleX(Math.min(this.f45440b1, 1.0f));
        float pivotX = zz0Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(b01Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(b01Var.getHeight(), 2.0d) + Math.pow(b01Var.getWidth() - pivotX, 2.0d)));
        for (int i13 = 0; i13 < this.f45447e0.f41058b.getChildCount(); i13++) {
            View childAt = this.f45447e0.f41058b.getChildAt(i13);
            if (f10 == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f10 == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (n()) {
                height = getMeasuredHeight() - height;
            }
            float s6 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.recaptcha.internal.a.v(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s6)) {
                s6 = 0.0f;
            }
            childAt.setScaleX(s6);
            childAt.setScaleY(s6);
        }
        while (true) {
            e01 e01Var = this.f45456i0;
            if (i11 < e01Var.getChildCount()) {
                View childAt2 = e01Var.getChildAt(i11);
                if (childAt2 instanceof q01) {
                    q01 q01Var = (q01) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float s10 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.recaptcha.internal.a.v(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(s10)) {
                        s10 = 0.0f;
                    }
                    q01Var.setAnimatedScale(s10);
                }
                i11++;
            } else {
                this.f45461l0.invalidate();
                e01Var.invalidate();
                return;
            }
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f23333x0;
        kz0 kz0Var = this.U1;
        if (i3 == i11) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.R)) {
                org.telegram.messenger.g0.r(kz0Var);
                org.telegram.messenger.g0.h3(kz0Var);
            }
        } else if (i3 == org.telegram.messenger.hs.A0) {
            org.telegram.messenger.g0.r(kz0Var);
            org.telegram.messenger.g0.h3(kz0Var);
        } else if (i3 == org.telegram.messenger.hs.C1) {
            org.telegram.messenger.g0.r(kz0Var);
            org.telegram.messenger.g0.h3(kz0Var);
        } else if (i3 == org.telegram.messenger.hs.B0) {
            org.telegram.messenger.g0.r(kz0Var);
            org.telegram.messenger.g0.h3(kz0Var);
        } else if (i3 == org.telegram.messenger.hs.f23246i4) {
            ei.e eVar = new ei.e(27);
            e01 e01Var = this.f45456i0;
            org.telegram.messenger.g0.d0(e01Var, eVar);
            if (e01Var != null) {
                e01Var.invalidate();
            }
        } else if (i3 == org.telegram.messenger.hs.G3 && ((Long) objArr[0]).longValue() == org.telegram.messenger.h10.i(this.W).e()) {
            org.telegram.messenger.g0.r(kz0Var);
            org.telegram.messenger.g0.h3(kz0Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i3;
        float f10;
        float measuredHeight;
        org.telegram.ui.Components.e5 e5Var = this.f45469p1;
        if (e5Var != null && (num = this.Z0) != null) {
            Rect bounds = e5Var.getBounds();
            View view = this.f45474r1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f45469p1.getAlpha();
            View view2 = this.f45474r1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f45469p1.f33290w = (int) (Math.pow(this.f45439b0.getAlpha(), 0.25d) * alpha * this.f45465n1);
            if (this.f45471q1 == null) {
                this.f45471q1 = new Rect();
            }
            if (scaleY > 1.0f && scaleY < 1.5f) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            float f11 = i3;
            if (scaleY > 1.5f) {
                f10 = (bounds.height() * 0.81f) + 1.0f;
            } else {
                f10 = 0.0f;
            }
            float intValue = num.intValue() + f11;
            float y9 = com.google.android.recaptcha.internal.a.y(scaleY, 1.0f, bounds.centerY(), -f10);
            boolean n4 = n();
            int i10 = this.f45448e1;
            if (!n4) {
                measuredHeight = org.telegram.messenger.g0.L(i10);
            } else {
                measuredHeight = getMeasuredHeight() - (org.telegram.messenger.g0.L(i10) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + y9 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f45471q1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.e5 e5Var2 = this.f45469p1;
            Rect rect = this.f45471q1;
            int i11 = rect.left;
            Rect rect2 = this.f45471q1;
            e5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f45471q1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f45469p1.draw(canvas);
            org.telegram.ui.Components.e5 e5Var3 = this.f45469p1;
            e5Var3.f33290w = alpha;
            e5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        q01 q01Var = this.f45479t1;
        if (q01Var != null && this.f45481u1 != null && q01Var.F != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f45479t1.F.setAlpha((int) (this.f45477s1 * 255.0f));
            this.f45479t1.F.setBounds(this.f45481u1);
            this.f45479t1.F.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.f45465n1, this.f45453g1, this.f45467o1), PorterDuff.Mode.SRC_IN));
            this.f45479t1.F.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.Q1 - this.P1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.Q1 - this.P1) * 25) + f() + 16;
    }

    public ci.lc getCollectionParticles() {
        if (this.S1 == null) {
            this.S1 = new ci.lc(1, 8);
        }
        return this.S1;
    }

    public long getDialogId() {
        return org.telegram.messenger.h10.i(this.W).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        View view;
        float f10;
        if (this.H1) {
            view = this.f45458j0;
        } else {
            view = this.f45456i0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f45489x1) {
            this.f45489x1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f45468p0.animate();
            if (canScrollVertically) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.camera.q.k(animate, f10, 200L);
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g11.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i3 = this.f45435a0;
        if (i3 != 2) {
            StringBuilder sb2 = new StringBuilder("emoji");
            if (i3 != 0 && i3 != 12 && i3 != 9 && i3 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String s6 = a1.g.s(sb2, str, "usehint");
            int i10 = org.telegram.messenger.hp.e1().getInt(s6, 0);
            if (i10 <= 3) {
                org.telegram.messenger.hp.e1().edit().putInt(s6, i10 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i3 = this.f45435a0;
        if (i3 != 5 && i3 != 10 && i3 != 12 && i3 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.p5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g11.o(android.view.View, org.telegram.ui.Components.p5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        int i3 = this.W;
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.A0);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23333x0);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.C1);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.B0);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        int i10 = this.f45435a0;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.G3);
        }
        org.telegram.ui.Components.e5 e5Var = this.f45469p1;
        if (e5Var != null) {
            e5Var.f33287n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.J = false;
        int i3 = this.W;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.A0);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23333x0);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.C1);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.B0);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        int i10 = this.f45435a0;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.G3);
        }
        org.telegram.ui.Components.e5 e5Var = this.f45469p1;
        if (e5Var != null) {
            e5Var.f33287n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (z10 && this.f45435a0 == 6) {
            this.f45476s0.y1((getMeasuredWidth() / org.telegram.messenger.g0.L(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10 = this.R0;
        int i11 = this.f45435a0;
        if (z10 && i11 != 3 && i11 != 4) {
            Point point = org.telegram.messenger.g0.f22608q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f), Integer.MIN_VALUE));
        } else if (i11 == 6) {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.f22608q.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i3, i10);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(w01 w01Var) {
        Integer num = this.f45437a2;
        if (num != null) {
            Parcelable parcelable = (Parcelable) f45433e2.get(num);
        }
        this.V1 = w01Var;
        boolean z10 = this.R0;
        e01 e01Var = this.f45456i0;
        if (!z10) {
            h();
            for (int i3 = 0; i3 < e01Var.getChildCount(); i3++) {
                View childAt = e01Var.getChildAt(i3);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W1 = null;
        }
        ValueAnimator valueAnimator2 = this.X1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.X1 = null;
        }
        int i10 = this.f45435a0;
        if (i10 != 3 && i10 != 4 && i10 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W1 = ofFloat;
            ofFloat.addUpdateListener(new jz0(this, 0));
            this.W1.addListener(new y20(this, 27));
            kz0 kz0Var = new kz0(this, 0);
            dh.d0.f8986f = true;
            dh.d0.f8985e = true;
            dh.d0.f8987g = false;
            if (dh.d0.d) {
                dh.d0.d = false;
            }
            dh.d0.f8984c = kz0Var;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23249j1, 512);
            this.Y1.d();
            this.W1.setDuration(800L);
            e01Var.setLayerType(2, null);
            this.f45452g0.setLayerType(2, null);
            this.f45450f0.setLayerType(2, null);
            this.f45442c0.setLayerType(2, null);
            org.telegram.ui.Components.sm smVar = this.f45466o0;
            if (smVar != null) {
                smVar.setLayerType(2, null);
            }
            View view = this.f45464n0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f45447e0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.Q = z10;
    }

    public void setBackgroundDelegate(h01 h01Var) {
        this.V = h01Var;
    }

    public void setDrawBackground(boolean z10) {
        this.R0 = z10;
        this.f45439b0.setClipToOutline(z10);
        gi.n5 n5Var = this.f45442c0;
        if (!z10) {
            n5Var.setVisibility(8);
        } else {
            n5Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            if (!z10) {
                org.telegram.messenger.g0.d0(this.f45456i0, new ei.e(21));
                for (int i3 = 0; i3 < this.f45447e0.f41058b.getChildCount(); i3++) {
                    View childAt = this.f45447e0.f41058b.getChildAt(i3);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f45447e0.f41058b.invalidate();
            }
        }
    }

    public void setExpireDateHint(int i3) {
        if (i3 <= 0) {
            return;
        }
        this.P0 = true;
        this.Q0 = Integer.valueOf(i3);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.S = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.O = drawable;
        q01 q01Var = this.P;
        if (q01Var != null) {
            q01Var.h.w0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f45457i1 = z10;
    }

    public void setOnLongPressedListener(e11 e11Var) {
        this.I = e11Var;
    }

    public void setRecentReactions(List<dh.n0> list) {
        this.S0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i3) {
        this.f45437a2 = Integer.valueOf(i3);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.L;
        hashSet.clear();
        hashSet.add(l10);
        e01 e01Var = this.f45456i0;
        if (e01Var != null) {
            for (int i3 = 0; i3 < e01Var.getChildCount(); i3++) {
                if (e01Var.getChildAt(i3) instanceof q01) {
                    q01 q01Var = (q01) e01Var.getChildAt(i3);
                    org.telegram.ui.Components.p5 p5Var = q01Var.f48720e;
                    if (p5Var != null) {
                        q01Var.d(hashSet.contains(Long.valueOf(p5Var.getDocumentId())), true);
                    } else {
                        q01Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            e01Var.invalidate();
        }
    }

    public void setSelectedReaction(dh.n0 n0Var) {
        this.K.clear();
        this.K.add(n0Var);
        e01 e01Var = this.f45456i0;
        if (e01Var != null) {
            for (int i3 = 0; i3 < e01Var.getChildCount(); i3++) {
                if (e01Var.getChildAt(i3) instanceof q01) {
                    q01 q01Var = (q01) e01Var.getChildAt(i3);
                    q01Var.d(this.K.contains(q01Var.f48727y), true);
                }
            }
            e01Var.invalidate();
        }
        uz0 uz0Var = this.f45458j0;
        if (uz0Var != null) {
            for (int i10 = 0; i10 < uz0Var.getChildCount(); i10++) {
                if (uz0Var.getChildAt(i10) instanceof q01) {
                    q01 q01Var2 = (q01) uz0Var.getChildAt(i10);
                    q01Var2.d(this.K.contains(q01Var2.f48727y), true);
                }
            }
            uz0Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<dh.n0> hashSet) {
        this.K = hashSet;
        HashSet hashSet2 = this.L;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3) != null && ((dh.n0) arrayList.get(i3)).f9098g != 0) {
                hashSet2.add(Long.valueOf(((dh.n0) arrayList.get(i3)).f9098g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (!this.m1 || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28214v6, this.f45436a1)) == this.f45453g1) {
                return;
            }
            this.f45453g1 = w02;
            this.N.setColor(i0.a.o(w02, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f45453g1, PorterDuff.Mode.SRC_IN);
            this.f45462l1 = porterDuffColorFilter;
            org.telegram.ui.Components.g5 g5Var = this.X0;
            if (g5Var != null) {
                g5Var.setColorFilter(porterDuffColorFilter);
            }
            e01 e01Var = this.f45456i0;
            if (e01Var != null) {
                e01Var.invalidate();
            }
            uz0 uz0Var = this.f45458j0;
            if (uz0Var != null) {
                uz0Var.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j10;
        kz0 kz0Var = this.K1;
        if (kz0Var != null) {
            org.telegram.messenger.g0.r(kz0Var);
            this.K1 = null;
        }
        ei.a6 a6Var = this.L1;
        if (a6Var != null) {
            org.telegram.messenger.g0.r(a6Var);
            this.L1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        r01 r01Var = this.f45473r0;
        yz0 yz0Var = this.f45452g0;
        if (isEmpty) {
            this.f45494z1 = false;
            this.A1 = false;
            z(false, z10);
            if (yz0Var != null) {
                yz0Var.d(true);
                yz0.a(yz0Var, false);
            }
            r01Var.E(true);
            this.B1 = null;
        } else {
            boolean z12 = this.f45494z1;
            boolean z13 = !z12;
            this.f45494z1 = true;
            this.A1 = false;
            if (yz0Var != null) {
                yz0Var.f52469f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                r01Var.E(false);
            } else if (!str.equals(this.B1)) {
                kz0 kz0Var2 = new kz0(this, 1);
                this.K1 = kz0Var2;
                org.telegram.messenger.g0.i3(kz0Var2, 120L);
            }
            this.B1 = str;
            String[] G0 = org.telegram.messenger.g0.G0();
            if (!Arrays.equals(G0, c2)) {
                org.telegram.messenger.li.b0(this.W).M(G0, false);
            }
            c2 = G0;
            ei.a6 a6Var2 = new ei.a6(this, str, z10, z13, G0, 4);
            this.L1 = a6Var2;
            if (z11) {
                j10 = 425;
            } else {
                j10 = 0;
            }
            org.telegram.messenger.g0.i3(a6Var2, j10);
            if (yz0Var != null) {
                yz0Var.f52469f.b(2);
                yz0.a(yz0Var, z10);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.f45459j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f45459j1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f45480u0.getAlpha(), f10 * 0.25f);
        this.f45459j1 = ofFloat;
        ofFloat.addUpdateListener(new jz0(this, 2));
        this.f45459j1.setDuration(200L);
        this.f45459j1.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        this.f45459j1.start();
    }

    public final void x(Long l10, boolean z10) {
        boolean z11;
        HashSet hashSet = this.L;
        if (!hashSet.contains(l10)) {
            hashSet.add(l10);
            z11 = true;
        } else {
            hashSet.remove(l10);
            z11 = false;
        }
        e01 e01Var = this.f45456i0;
        if (e01Var != null) {
            for (int i3 = 0; i3 < e01Var.getChildCount(); i3++) {
                if (e01Var.getChildAt(i3) instanceof q01) {
                    q01 q01Var = (q01) e01Var.getChildAt(i3);
                    org.telegram.ui.Components.p5 p5Var = q01Var.f48720e;
                    if (p5Var != null && p5Var.getDocumentId() == l10.longValue()) {
                        q01Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = q01Var.d;
                        if (document != null && document.f27007id == l10.longValue()) {
                            q01Var.e(z11, z10);
                        }
                    }
                }
            }
            e01Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.e5 e5Var, View view) {
        int i3;
        Integer num;
        if (e5Var != null && (num = e5Var.G) != null) {
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        this.f45467o1 = i3;
        this.f45469p1 = e5Var;
        this.f45474r1 = view;
        if (this.J && e5Var != null) {
            e5Var.f33287n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f10;
        if (this.H1 == z10) {
            return;
        }
        this.H1 = z10;
        e01 e01Var = this.f45456i0;
        e01Var.setVisibility(0);
        uz0 uz0Var = this.f45458j0;
        uz0Var.setVisibility(0);
        ValueAnimator valueAnimator = this.G1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.J1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.J1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G1 = ofFloat;
        ofFloat.addUpdateListener(new nz0(this, z10, 0));
        this.G1.addListener(new a01(this, z10, 0));
        this.G1.setDuration(320L);
        this.G1.setInterpolator(org.telegram.ui.Components.xq.h);
        this.G1.start();
        ViewPropertyAnimator animate = ((View) e01Var.getParent()).animate();
        if (this.H1 && z11) {
            f10 = -org.telegram.messenger.g0.L(36.0f);
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.camera.q.l(animate.translationY(f10).setUpdateListener(new jz0(this, 1)), org.telegram.ui.Components.xq.f40452f, 160L);
        if (this.H1 && z11) {
            uz0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        } else {
            uz0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        }
        h();
    }

    public g11(org.telegram.ui.ActionBar.d2 d2Var, Context context, boolean z10, Integer num, int i3, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this(d2Var, context, z10, num, i3, z11, e6Var, i10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28214v6, e6Var));
    }

    public g11(org.telegram.ui.ActionBar.d2 d2Var, Context context, boolean z10, Integer num, int i3, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(context);
        int i12;
        int i13;
        float f10;
        boolean z12;
        Integer num2;
        boolean z13;
        Integer num3;
        boolean z14;
        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
        int i14 = i3;
        int i15 = i11;
        this.K = new HashSet();
        this.L = new HashSet();
        Paint paint = new Paint(1);
        this.M = paint;
        Paint paint2 = new Paint(1);
        this.N = paint2;
        this.T = new ArrayList();
        this.W = org.telegram.messenger.h10.f22829t0;
        this.f45444d0 = new org.telegram.ui.Components.zu[2];
        this.f45485w0 = new ArrayList();
        this.f45488x0 = new SparseIntArray();
        this.f45491y0 = new SparseIntArray();
        this.f45493z0 = new SparseIntArray();
        this.A0 = new SparseIntArray();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = false;
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = new ArrayList();
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = new ArrayList();
        this.O0 = false;
        this.P0 = false;
        this.R0 = true;
        this.W0 = new ImageReceiver(null);
        this.f45457i1 = true;
        this.f45465n1 = 1.0f;
        this.f45477s1 = 1.0f;
        this.f45483v1 = new OvershootInterpolator(2.0f);
        this.f45489x1 = false;
        this.f45492y1 = false;
        this.f45494z1 = false;
        this.A1 = false;
        this.H1 = false;
        this.I1 = false;
        this.M1 = false;
        this.N1 = false;
        this.P1 = -1;
        this.Q1 = -1;
        this.R1 = -1L;
        this.T1 = new kz0(this, 3);
        this.U1 = new kz0(this, 4);
        this.Y1 = new g2.g((int[]) null);
        this.Z1 = new Paint();
        this.f45436a1 = e6Var;
        this.f45435a0 = i14;
        this.O0 = z10;
        this.f45445d1 = d2Var2;
        SharedPreferences e12 = org.telegram.messenger.hp.e1();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.P0 = e12.getInt(sb2.toString(), 0) < 3;
        this.f45453g1 = i15;
        this.m1 = i15 == org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28214v6, e6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var));
        paint2.setColor(i0.a.o(i15, 30));
        this.f45462l1 = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
        this.Z0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(b8.be.b(num.intValue(), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(292.0f)));
        boolean z15 = valueOf != null && valueOf.intValue() > org.telegram.messenger.g0.L(170.0f);
        setFocusableInTouchMode(true);
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 7) {
            this.f45448e1 = i10;
            setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            setOnTouchListener(new e0(this, 6));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.f45464n0 = view;
            Drawable mutate = getResources().getDrawable(2131232722).mutate();
            org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.G8, e6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, b8.mf.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / org.telegram.messenger.g0.f22607p) + (z15 ? -12 : 4), n() ? 0 : this.f45448e1, 0.0f, n() ? this.f45448e1 : 0));
        }
        gi.n5 n5Var = new gi.n5(this, context, e6Var, 15);
        this.f45442c0 = n5Var;
        boolean z16 = i14 == 3 || i14 == 4;
        Integer num4 = valueOf;
        b01 b01Var = new b01(this, context, z16, z16, e6Var, num4);
        Integer num5 = num4;
        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        this.f45439b0 = b01Var;
        if (!z16) {
            b01Var.setOutlineProvider(new c01(this, num5));
            b01Var.setClipToOutline(true);
            if (z16) {
                b01Var.setElevation(2.0f);
            }
        }
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 15) {
            b01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        b01Var.addView(n5Var, b8.mf.c(-1.0f, -1));
        addView(b01Var, b8.mf.d(-1, -1.0f, 119, 0.0f, (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 2 || i14 == 7) ? this.f45448e1 + 6 : 0.0f, 0.0f, n() ? this.f45448e1 + 6 : 0.0f));
        if (num5 != null) {
            org.telegram.ui.Components.sm smVar = new org.telegram.ui.Components.sm(context, 24);
            this.f45466o0 = smVar;
            i13 = 14;
            Drawable drawable = getResources().getDrawable(2131232723);
            org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.G8, e6Var2, PorterDuff.Mode.MULTIPLY);
            smVar.setBackground(drawable);
            i12 = 3;
            addView(smVar, b8.mf.d(17, 9.0f, (n() ? 80 : 48) | 3, (num5.intValue() / org.telegram.messenger.g0.f22607p) + (z15 ? -25 : 10), n() ? 0.0f : this.f45448e1 + 5, 0.0f, n() ? this.f45448e1 + 14 : 0.0f));
        } else {
            i12 = 3;
            i13 = 14;
        }
        boolean z17 = (d2Var2 == null || i14 == i12 || i14 == 6 || i14 == 5 || i14 == 7 || i14 == 4 || i14 == 9 || i14 == 10 || !z11) ? false : true;
        int i16 = 0;
        while (true) {
            if (i16 >= 2) {
                break;
            }
            Integer num6 = num5;
            if (i14 != 4) {
                num2 = num6;
                z13 = true;
            } else {
                num2 = num6;
                z13 = false;
            }
            if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10) {
                num3 = num2;
                z14 = true;
            } else {
                num3 = num2;
                z14 = false;
            }
            qv0 qv0Var = z17 ? new qv0(12, this, d2Var2) : null;
            int i17 = i16;
            org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
            int i18 = i14;
            int i19 = i13;
            d01 d01Var = new d01(this, context, e6Var3, z13, z14, i18, qv0Var, i15, i3);
            org.telegram.ui.Components.vu vuVar = d01Var.E;
            if (vuVar != null) {
                vuVar.setOnLongClickListener(new t(this, 7));
            }
            d01Var.V = false;
            if (i18 == 4) {
                d01Var.setAnimatedEmojiCacheType(13);
            } else {
                d01Var.setAnimatedEmojiCacheType((i18 == 0 || i18 == 12 || i18 == 2) ? 6 : 5);
            }
            d01Var.P = num3 == null;
            d01Var.setPaddingLeft(i18 == 6 ? 10.0f : 5.0f);
            if (i18 != i19 && i18 != 8 && i18 != 13) {
                this.f45439b0.addView(d01Var, b8.mf.c(36.0f, -1));
            }
            this.f45444d0[i17] = d01Var;
            i15 = i11;
            i14 = i18;
            i13 = i19;
            d2Var2 = d2Var;
            e6Var2 = e6Var3;
            i16 = i17 + 1;
            num5 = num3;
        }
        Integer num7 = num5;
        org.telegram.ui.ActionBar.e6 e6Var4 = e6Var2;
        int i20 = i14;
        int i21 = i13;
        org.telegram.ui.Components.zu[] zuVarArr = this.f45444d0;
        this.f45447e0 = zuVarArr[0];
        zuVarArr[1].setVisibility(8);
        zz0 zz0Var = new zz0(context, num7, 1);
        this.f45450f0 = zz0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, zz0Var, e6Var4);
        if (i20 == i21 || i20 == 8 || i20 == 13) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            this.f45439b0.addView(zz0Var, b8.mf.d(-1, 1.0f / org.telegram.messenger.g0.f22607p, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        org.telegram.messenger.g0.Z3(zz0Var, true, f10, true, false);
        e01 e01Var = new e01(this, context, i20);
        this.f45456i0 = e01Var;
        ?? kVar = new u4.k();
        this.f45451f1 = kVar;
        kVar.f55616c = 220L;
        kVar.f55617e = 260L;
        kVar.f55618f = 160L;
        kVar.f55619g = 160L;
        kVar.f55567m = false;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        kVar.f55620i = xqVar;
        kVar.C = false;
        e01Var.setItemAnimator(kVar);
        float f11 = f10;
        e01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        g01 g01Var = new g01(this);
        this.f45470q0 = g01Var;
        e01Var.setAdapter(g01Var);
        vz0 vz0Var = new vz0(this, 1);
        this.f45476s0 = vz0Var;
        e01Var.setLayoutManager(vz0Var);
        vz0Var.O = new tz0(this, 0);
        yg0 yg0Var = new yg0(context, 7);
        this.f45454h0 = yg0Var;
        ai.c0 c0Var = new ai.c0(this, context);
        this.f45461l0 = c0Var;
        c0Var.addView(e01Var, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        yg0Var.addView(c0Var, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        uz0 uz0Var = new uz0(this, context);
        this.f45458j0 = uz0Var;
        if (uz0Var.getItemAnimator() != null) {
            uz0Var.getItemAnimator().n(180L);
            uz0Var.getItemAnimator().f55620i = xqVar;
        }
        TextView textView = new TextView(context);
        if (i20 == 4) {
            textView.setText(org.telegram.messenger.bd.M0(2131748220, null));
        } else if (i20 == 0 || i20 == 13 || i20 == 12 || i20 == 11 || i20 == 9 || i20 == 10) {
            textView.setText(org.telegram.messenger.bd.M0(2131748221, null));
        } else if (i20 == 1 || i20 == 2) {
            textView.setText(org.telegram.messenger.bd.M0(2131748182, null));
        } else if (i20 == 14) {
            textView.setText(org.telegram.messenger.bd.M0(2131748222, null));
        } else {
            textView.setText(org.telegram.messenger.bd.M0(2131748211, null));
        }
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Af, e6Var4);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.m0 = k9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45460k0 = frameLayout;
        frameLayout.addView(k9Var, b8.mf.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        yg0Var.addView(frameLayout, b8.mf.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        uz0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        r01 r01Var = new r01(this);
        this.f45473r0 = r01Var;
        uz0Var.setAdapter(r01Var);
        vz0 vz0Var2 = new vz0(this, 0);
        uz0Var.setLayoutManager(vz0Var2);
        vz0Var2.O = new tz0(this, 1);
        uz0Var.setVisibility(8);
        yg0Var.addView(uz0Var, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f45439b0.addView(yg0Var, b8.mf.d(-1, -1.0f, 48, 0.0f, (i20 == 8 || i20 == 13 || i20 == 14) ? 0.0f : (f11 / org.telegram.messenger.g0.f22607p) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.vi0 vi0Var = new org.telegram.ui.Components.vi0(e01Var, vz0Var);
        this.f45478t0 = vi0Var;
        vi0Var.f39131i = new bi.h(this, 2);
        vi0Var.h = new lz0(this);
        xz0 xz0Var = new xz0(this, i20, context, e6Var4, num);
        e01Var.p1(xz0Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        uz0Var.p1(xz0Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        org.telegram.ui.Components.cl0 cl0Var = new org.telegram.ui.Components.cl0(this, i20, 2);
        e01Var.setOnItemClickListener(cl0Var);
        uz0Var.setOnItemClickListener(cl0Var);
        yz0 yz0Var = new yz0(this, context, z11);
        this.f45452g0 = yz0Var;
        yz0Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
        yz0Var.setVisibility(4);
        yg0Var.addView(yz0Var, b8.mf.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        zz0 zz0Var2 = new zz0(context, num7, 0);
        Drawable drawable2 = getResources().getDrawable(2131231228);
        int i22 = org.telegram.ui.ActionBar.k6.G8;
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.8f, i22);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.l(zz0Var2, drawable2, L.f28359a, -1, 2, L.d, e6Var, mode);
        zz0Var2.setBackground(drawable2);
        zz0Var2.setAlpha(0.0f);
        this.f45439b0.addView(zz0Var2, b8.mf.d(-1, 20.0f, 55, 0.0f, (f11 / org.telegram.messenger.g0.f22607p) + 36.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f45468p0 = view2;
        Drawable drawable3 = getResources().getDrawable(2131231225);
        org.telegram.ui.ActionBar.r6.y(this, drawable3, i22, e6Var, mode);
        if (i3 == 14) {
            view2.setBackground(drawable3);
        }
        view2.setAlpha(0.0f);
        this.f45439b0.addView(view2, b8.mf.e(-1, 20, 87));
        View view3 = new View(context);
        this.f45480u0 = view3;
        view3.setAlpha(0.0f);
        view3.setBackgroundColor(-16777216);
        this.f45439b0.addView(view3, b8.mf.c(-1.0f, -1));
        int i23 = this.W;
        org.telegram.messenger.li.b0(i23);
        org.telegram.messenger.li.b0(i23).B(5);
        if (i3 == 14) {
            org.telegram.messenger.hp.s1(this.W).E0();
        } else if (i3 == 1 || i3 == 11 || i3 == 2 || i3 == 6 || i3 == 13) {
            org.telegram.messenger.li.b0(i23).A();
        } else if (i3 == 9 || i3 == 10) {
            if (org.telegram.messenger.hp.s1(i23).f22999e7.getBoolean("resetemojipacks", true)) {
                org.telegram.messenger.li.b0(i23).a1(5, false, false);
                org.telegram.messenger.hp.s1(i23).f22999e7.edit().putBoolean("resetemojipacks", false).commit();
            }
            org.telegram.messenger.li.b0(i23).L(2, false);
            org.telegram.messenger.li.b0(i23).Y0();
            org.telegram.messenger.li.b0(i23).m0(new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
        } else if (i3 == 0 || i3 == 12) {
            org.telegram.messenger.li.b0(i23).L(0, true);
            org.telegram.messenger.li.b0(i23).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        } else if (i3 == 3) {
            org.telegram.messenger.li.b0(i23).v();
        } else if (i3 == 4) {
            org.telegram.messenger.li.b0(i23).V0(0, false, true, false);
            org.telegram.messenger.li.b0(i23).B(0);
        }
        this.W0.E0(7);
        int i24 = this.f45435a0;
        if (i24 == 3 || i24 == 4 || i24 == 6) {
            z12 = true;
        } else {
            com.google.android.gms.internal.cast.c0 c0Var2 = org.telegram.messenger.zb.D().f26770p;
            if (((CountDownLatch) c0Var2.f6883c) == null) {
                z12 = true;
                c0Var2.f6883c = new CountDownLatch(1);
            } else {
                z12 = true;
            }
            dh.d0.f8987g = z12;
        }
        B(z12, false, z12);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.K.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = arrayList.get(i3);
            i3++;
            this.K.add(dh.n0.b(str));
        }
        e01 e01Var = this.f45456i0;
        if (e01Var != null) {
            for (int i10 = 0; i10 < e01Var.getChildCount(); i10++) {
                if (e01Var.getChildAt(i10) instanceof q01) {
                    q01 q01Var = (q01) e01Var.getChildAt(i10);
                    q01Var.d(this.K.contains(q01Var.f48727y), true);
                }
            }
            e01Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(f11 f11Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void m() {
    }

    public void q() {
    }

    public void r(q01 q01Var, dh.n0 n0Var) {
    }
}
