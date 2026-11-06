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
public abstract class q11 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
    public static String[] f48987b2;
    public final ArrayList A0;
    public String A1;
    public final ArrayList B0;
    public ArrayList B1;
    public boolean C0;
    public ArrayList C1;
    public int D;
    public final ArrayList D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ArrayList E1;
    public int F;
    public final ArrayList F0;
    public ValueAnimator F1;
    public v01 G;
    public final ArrayList G0;
    public boolean G1;
    public o11 H;
    public final ArrayList H0;
    public boolean H1;
    public boolean I;
    public final ArrayList I0;
    public ValueAnimator I1;
    public HashSet J;
    public ArrayList J0;
    public tz0 J1;
    public final HashSet K;
    public final ArrayList K0;
    public di.z5 K1;
    public final Paint L;
    public ArrayList L0;
    public boolean L1;
    public final Paint M;
    public final ArrayList M0;
    public boolean M1;
    public Drawable N;
    public final boolean N0;
    public View N1;
    public a11 O;
    public boolean O0;
    public int O1;
    public boolean P;
    public Integer P0;
    public int P1;
    public boolean Q;
    public boolean Q0;
    public long Q1;
    public boolean R;
    public List R0;
    public bi.ud R1;
    public final ArrayList S;
    public a11 S0;
    public final tz0 S1;
    public boolean T;
    public boolean T0;
    public final tz0 T1;
    public r01 U;
    public float U0;
    public Runnable U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.i5 W0;
    public ValueAnimator W1;
    public g01 X0;
    public final h2.f X1;
    public final Integer Y0;
    public final Paint Y1;
    public final org.telegram.ui.ActionBar.f6 Z0;
    public Integer Z1;
    public int f48989a;
    public final l01 f48990a0;
    public float f48991a1;
    public int f48992b;
    public final fi.p5 f48993b0;
    public float f48994b1;
    public int f48995c;
    public final org.telegram.ui.Components.av[] f48996c0;
    public final org.telegram.ui.ActionBar.f2 f48997c1;
    public int d;
    public org.telegram.ui.Components.av f48998d0;
    public final int f48999d1;
    public int f49000e;
    public final j01 f49001e0;
    public final p01 f49002e1;
    public int f49003f;
    public final i01 f49004f0;
    public int f49005f1;
    public final rq0 f49006g0;
    public boolean f49007g1;
    public int h;
    public final o01 f49008h0;
    public boolean f49009h1;
    public final e01 f49010i0;
    public ValueAnimator f49011i1;
    public final FrameLayout f49012j0;
    public Drawable f49013j1;
    public final bi.x5 f49014k0;
    public PorterDuffColorFilter f49015k1;
    public final org.telegram.ui.Components.l9 f49016l0;
    public final boolean l1;
    public final View m0;
    public float f49017m1;
    public int f49018n;
    public final org.telegram.ui.Components.tm f49019n0;
    public int n1;
    public final View f49020o0;
    public org.telegram.ui.Components.g5 f49021o1;
    public final q01 f49022p0;
    public Rect f49023p1;
    public final b11 f49024q0;
    public View f49025q1;
    public int f49026r;
    public final f01 f49027r0;
    public float f49028r1;
    public int f49029s;
    public final org.telegram.ui.Components.ri0 f49030s0;
    public a11 f49031s1;
    public final View f49032t0;
    public Rect f49033t1;
    public int f49034u0;
    public final OvershootInterpolator f49035u1;
    public final ArrayList f49036v0;
    public ValueAnimator f49037v1;
    public int f49038w;
    public final SparseIntArray f49039w0;
    public boolean f49040w1;
    public int f49041x;
    public final SparseIntArray f49042x0;
    public boolean f49043x1;
    public int f49044y;
    public final SparseIntArray f49045y0;
    public boolean f49046y1;
    public final SparseIntArray f49047z0;
    public boolean f49048z1;
    public static final List f48986a2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] f48988c2 = new boolean[4];
    public static final HashMap d2 = new HashMap();

    public q11(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, Integer num, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this(f2Var, context, z9, num, i7, true, f6Var, 16);
    }

    public static void D(int i7, org.telegram.ui.Components.l9 l9Var) {
        List list;
        org.telegram.messenger.hc b10;
        String str;
        if (l9Var != null) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(i7).f25829s0[1]);
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                list = f48986a2;
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
                        if (document2 != null && list.contains(org.telegram.messenger.ij.V(document2, null, null))) {
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
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.ui.b0(i7).s0(5));
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
                            if (document3 != null && list.contains(org.telegram.messenger.ij.V(document3, null, null))) {
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
                org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f28013m6, 0.2f, false);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.hc.b(document);
                    if (d != null) {
                        d.f25378e = 512;
                        d.f25379f = 512;
                    }
                    str = "36_36_g";
                } else {
                    if (d != null && org.telegram.messenger.ij.L2(document, false)) {
                        d.f25378e = 512;
                        d.f25379f = 512;
                    }
                    b10 = org.telegram.messenger.hc.b(document);
                    str = "36_36";
                }
                l9Var.setLayerNum(7);
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                l9Var.m(b10, str, org.telegram.messenger.hc.c(w10, document), "36_36", d, document);
            }
        }
    }

    public static void a(q11 q11Var, int i7, int i10) {
        int i11;
        org.telegram.ui.Components.ri0 ri0Var = q11Var.f49030s0;
        f01 f01Var = q11Var.f49027r0;
        View m10 = f01Var.m(i7);
        int L0 = f01Var.L0();
        if ((m10 == null && Math.abs(i7 - L0) > 72.0f) || !org.telegram.messenger.iz.c()) {
            if (f01Var.L0() < i7) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            ri0Var.f37749b = i11;
            ri0Var.d(i7, i10, false, false);
            return;
        }
        fi.j1 j1Var = new fi.j1(4, q11Var.f49008h0.getContext(), q11Var);
        j1Var.f57096a = i7;
        j1Var.f20108p = i10;
        f01Var.w0(j1Var);
    }

    public static boolean c(q11 q11Var) {
        if (!q11Var.T) {
            ValueAnimator valueAnimator = q11Var.V1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i7 = 13;
        int i10 = this.W;
        if (i10 != 5 && i10 != 7) {
            if (i10 == 6) {
                return org.telegram.ui.Components.i5.f();
            }
            if (i10 != 3 && i10 != 4) {
                i7 = 2;
                if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                    return 3;
                }
            }
        }
        return i7;
    }

    public Drawable getPremiumStar() {
        if (this.f49013j1 == null) {
            int i7 = this.W;
            if (i7 != 5 && i7 != 9 && i7 != 10 && i7 != 7) {
                this.f49013j1 = jg.g.h(org.telegram.messenger.t0.f25555b, 2131232362);
            } else {
                this.f49013j1 = jg.g.h(org.telegram.messenger.t0.f25555b, 2131232133);
            }
            this.f49013j1.setColorFilter(this.f49015k1);
        }
        return this.f49013j1;
    }

    public static ArrayList j(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
            if (document == null || hashSet.contains(Long.valueOf(document.f26958id))) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        long j3;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String c10 = org.telegram.messenger.i6.c(str);
        int i7 = 0;
        while (true) {
            if (i7 < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i7).documents.isEmpty() && TextUtils.equals(org.telegram.messenger.i6.c(tL_messages_stickerSet.packs.get(i7).emoticon), c10)) {
                    j3 = tL_messages_stickerSet.packs.get(i7).documents.get(0).longValue();
                    break;
                }
                i7++;
            } else {
                j3 = 0;
                break;
            }
        }
        if (j3 == 0) {
            return null;
        }
        for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            if (document.f26958id == j3) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.i5 i5Var) {
        org.telegram.ui.Components.i5 i5Var2;
        if (this.I && (i5Var2 = this.W0) != i5Var) {
            if (i5Var2 != null) {
                i5Var2.n(this);
            }
            this.W0 = i5Var;
            if (i5Var != null) {
                i5Var.setColorFilter(this.f49015k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(int i7) {
        boolean[] zArr = f48988c2;
        if (!zArr[i7]) {
            org.telegram.messenger.ui.b0(i7);
            zArr[i7] = true;
            org.telegram.messenger.ui.b0(i7).B(5);
            org.telegram.messenger.ui.b0(i7).L(0, true);
            org.telegram.messenger.ui.b0(i7).A();
            org.telegram.messenger.ui.b0(i7).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            org.telegram.messenger.ui.b0(i7).P();
            org.telegram.messenger.ui.b0(i7).v();
            org.telegram.ui.Components.yu0.E3.c(i7, 1, new di.f(i7, 1));
        }
    }

    public final void A(Long l10) {
        this.K.remove(l10);
        o01 o01Var = this.f49008h0;
        if (o01Var != null) {
            int i7 = 0;
            boolean z9 = false;
            for (int i10 = 0; i10 < o01Var.getChildCount(); i10++) {
                if (o01Var.getChildAt(i10) instanceof a11) {
                    a11 a11Var = (a11) o01Var.getChildAt(i10);
                    org.telegram.ui.Components.r5 r5Var = a11Var.f43508e;
                    if (r5Var != null && r5Var.getDocumentId() == l10.longValue()) {
                        a11Var.f();
                    } else {
                        TLRPC.Document document = a11Var.d;
                        if (document != null && document.f26958id == l10.longValue()) {
                            a11Var.f();
                        }
                    }
                    z9 = true;
                }
            }
            o01Var.invalidate();
            if (!z9) {
                while (true) {
                    ArrayList arrayList = this.f49036v0;
                    if (i7 < arrayList.size()) {
                        long longValue = ((Long) arrayList.get(i7)).longValue();
                        if (longValue == (l10.longValue() * 13) + 62425 || longValue == (l10.longValue() * 13) + 3212) {
                            break;
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
                q01 q01Var = this.f49022p0;
                if (q01Var != null) {
                    q01Var.g(i7);
                }
            }
        }
    }

    public final void B(boolean r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q11.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        i01 i01Var = this.f49004f0;
        if (i01Var == null) {
            return;
        }
        if (this.f49048z1) {
            i01Var.clearAnimation();
            i01Var.setVisibility(0);
            i01Var.animate().translationY(0.0f).start();
            return;
        }
        o01 o01Var = this.f49008h0;
        if (o01Var.getChildCount() > 0) {
            View childAt = o01Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f48989a && "searchbox".equals(childAt.getTag())) {
                i01Var.setVisibility(0);
                i01Var.setTranslationY(childAt.getY());
                return;
            }
            i01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
            return;
        }
        i01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
    }

    public final void E(float f10) {
        int i7;
        int i10 = -1;
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.xq.f40311g.getInterpolation(c8.j9.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i7 = -1;
            } else {
                i7 = 1;
            }
            view.setScaleY(interpolation * i7);
        }
        org.telegram.ui.Components.tm tmVar = this.f49019n0;
        if (tmVar != null) {
            float a10 = c8.j9.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            tmVar.setAlpha(a10);
            tmVar.setScaleX(a10);
            if (!n()) {
                i10 = 1;
            }
            tmVar.setScaleY(a10 * i10);
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a11 = c8.j9.a(f12 / 700.0f, 0.0f, 1.0f);
        float a12 = c8.j9.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = c8.j9.a(f12 / 750.0f, 0.0f, 1.0f);
        float a14 = c8.j9.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        float interpolation2 = xqVar.getInterpolation(a11);
        float interpolation3 = xqVar.getInterpolation(a12);
        this.f48993b0.setAlpha(a14);
        this.f49004f0.setAlpha(a14);
        int i11 = 0;
        for (int i12 = 0; i12 < this.f48998d0.f38974b.getChildCount(); i12++) {
            this.f48998d0.f38974b.getChildAt(i12).setAlpha(a14);
        }
        if (this.f49021o1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a14;
        l01 l01Var = this.f48990a0;
        l01Var.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        if (tmVar != null) {
            tmVar.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        }
        this.f48991a1 = (interpolation2 * 0.85f) + 0.15f;
        this.f48994b1 = (interpolation3 * 0.925f) + 0.075f;
        l01Var.invalidateOutline();
        if (tmVar != null) {
            tmVar.setAlpha(a14);
        }
        j01 j01Var = this.f49001e0;
        j01Var.setAlpha(a14);
        j01Var.setScaleX(Math.min(this.f48991a1, 1.0f));
        float pivotX = j01Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(l01Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(l01Var.getHeight(), 2.0d) + Math.pow(l01Var.getWidth() - pivotX, 2.0d)));
        for (int i13 = 0; i13 < this.f48998d0.f38974b.getChildCount(); i13++) {
            View childAt = this.f48998d0.f38974b.getChildAt(i13);
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
            float s5 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s5)) {
                s5 = 0.0f;
            }
            childAt.setScaleX(s5);
            childAt.setScaleY(s5);
        }
        while (true) {
            o01 o01Var = this.f49008h0;
            if (i11 < o01Var.getChildCount()) {
                View childAt2 = o01Var.getChildAt(i11);
                if (childAt2 instanceof a11) {
                    a11 a11Var = (a11) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float s9 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(s9)) {
                        s9 = 0.0f;
                    }
                    a11Var.setAnimatedScale(s9);
                }
                i11++;
            } else {
                this.f49014k0.invalidate();
                o01Var.invalidate();
                return;
            }
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25087x0;
        tz0 tz0Var = this.T1;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                org.telegram.messenger.g0.r(tz0Var);
                org.telegram.messenger.g0.h3(tz0Var);
            }
        } else if (i7 == org.telegram.messenger.qs.A0) {
            org.telegram.messenger.g0.r(tz0Var);
            org.telegram.messenger.g0.h3(tz0Var);
        } else if (i7 == org.telegram.messenger.qs.C1) {
            org.telegram.messenger.g0.r(tz0Var);
            org.telegram.messenger.g0.h3(tz0Var);
        } else if (i7 == org.telegram.messenger.qs.B0) {
            org.telegram.messenger.g0.r(tz0Var);
            org.telegram.messenger.g0.h3(tz0Var);
        } else if (i7 == org.telegram.messenger.qs.f25001i4) {
            pg.c cVar = new pg.c(0);
            o01 o01Var = this.f49008h0;
            org.telegram.messenger.g0.d0(o01Var, cVar);
            if (o01Var != null) {
                o01Var.invalidate();
            }
        } else if (i7 == org.telegram.messenger.qs.G3 && ((Long) objArr[0]).longValue() == org.telegram.messenger.p10.i(this.V).e()) {
            org.telegram.messenger.g0.r(tz0Var);
            org.telegram.messenger.g0.h3(tz0Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i7;
        float f10;
        float measuredHeight;
        org.telegram.ui.Components.g5 g5Var = this.f49021o1;
        if (g5Var != null && (num = this.Y0) != null) {
            Rect bounds = g5Var.getBounds();
            View view = this.f49025q1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f49021o1.getAlpha();
            View view2 = this.f49025q1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f49021o1.f33862w = (int) (Math.pow(this.f48990a0.getAlpha(), 0.25d) * alpha * this.f49017m1);
            if (this.f49023p1 == null) {
                this.f49023p1 = new Rect();
            }
            if (scaleY > 1.0f && scaleY < 1.5f) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            float f11 = i7;
            if (scaleY > 1.5f) {
                f10 = (bounds.height() * 0.81f) + 1.0f;
            } else {
                f10 = 0.0f;
            }
            float intValue = num.intValue() + f11;
            float z9 = com.google.android.recaptcha.internal.a.z(scaleY, 1.0f, bounds.centerY(), -f10);
            boolean n10 = n();
            int i10 = this.f48999d1;
            if (!n10) {
                measuredHeight = org.telegram.messenger.g0.L(i10);
            } else {
                measuredHeight = getMeasuredHeight() - (org.telegram.messenger.g0.L(i10) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z9 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f49023p1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.g5 g5Var2 = this.f49021o1;
            Rect rect = this.f49023p1;
            int i11 = rect.left;
            Rect rect2 = this.f49023p1;
            g5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f49023p1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f49021o1.draw(canvas);
            org.telegram.ui.Components.g5 g5Var3 = this.f49021o1;
            g5Var3.f33862w = alpha;
            g5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        a11 a11Var = this.f49031s1;
        if (a11Var != null && this.f49033t1 != null && a11Var.E != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f49031s1.E.setAlpha((int) (this.f49028r1 * 255.0f));
            this.f49031s1.E.setBounds(this.f49033t1);
            this.f49031s1.E.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.f49017m1, this.f49005f1, this.n1), PorterDuff.Mode.SRC_IN));
            this.f49031s1.E.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.P1 - this.O1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.P1 - this.O1) * 25) + f() + 16;
    }

    public bi.ud getCollectionParticles() {
        if (this.R1 == null) {
            this.R1 = new bi.ud(1, 8);
        }
        return this.R1;
    }

    public long getDialogId() {
        return org.telegram.messenger.p10.i(this.V).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        View view;
        float f10;
        if (this.G1) {
            view = this.f49010i0;
        } else {
            view = this.f49008h0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f49040w1) {
            this.f49040w1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f49020o0.animate();
            if (canScrollVertically) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.camera.q.k(animate, f10, 200L);
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q11.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i7 = this.W;
        if (i7 != 2) {
            StringBuilder sb2 = new StringBuilder("emoji");
            if (i7 != 0 && i7 != 12 && i7 != 9 && i7 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String s5 = a8.p0.s(sb2, str, "usehint");
            int i10 = org.telegram.messenger.qp.e1().getInt(s5, 0);
            if (i10 <= 3) {
                org.telegram.messenger.qp.e1().edit().putInt(s5, i10 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i7 = this.W;
        if (i7 != 5 && i7 != 10 && i7 != 12 && i7 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.r5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q11.o(android.view.View, org.telegram.ui.Components.r5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        int i7 = this.V;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.A0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25087x0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.C1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.B0);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25001i4);
        int i10 = this.W;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.G3);
        }
        org.telegram.ui.Components.g5 g5Var = this.f49021o1;
        if (g5Var != null) {
            g5Var.f33859n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.I = false;
        int i7 = this.V;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.A0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25087x0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.C1);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.B0);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25001i4);
        int i10 = this.W;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.G3);
        }
        org.telegram.ui.Components.g5 g5Var = this.f49021o1;
        if (g5Var != null) {
            g5Var.f33859n = null;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (z9 && this.W == 6) {
            this.f49027r0.y1((getMeasuredWidth() / org.telegram.messenger.g0.L(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9 = this.Q0;
        int i11 = this.W;
        if (z9 && i11 != 3 && i11 != 4) {
            Point point = org.telegram.messenger.g0.f22537q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f), Integer.MIN_VALUE));
        } else if (i11 == 6) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.f22537q.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(g11 g11Var) {
        Integer num = this.Z1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) d2.get(num);
        }
        this.U1 = g11Var;
        boolean z9 = this.Q0;
        o01 o01Var = this.f49008h0;
        if (!z9) {
            h();
            for (int i7 = 0; i7 < o01Var.getChildCount(); i7++) {
                View childAt = o01Var.getChildAt(i7);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.V1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V1 = null;
        }
        ValueAnimator valueAnimator2 = this.W1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.W1 = null;
        }
        int i10 = this.W;
        if (i10 != 3 && i10 != 4 && i10 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V1 = ofFloat;
            ofFloat.addUpdateListener(new sz0(this, 0));
            this.V1.addListener(new d30(this, 27));
            tz0 tz0Var = new tz0(this, 0);
            ch.e0.f6235f = true;
            ch.e0.f6234e = true;
            ch.e0.f6236g = false;
            if (ch.e0.d) {
                ch.e0.d = false;
            }
            ch.e0.f6233c = tz0Var;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25004j1, 512);
            this.X1.d();
            this.V1.setDuration(800L);
            o01Var.setLayerType(2, null);
            this.f49004f0.setLayerType(2, null);
            this.f49001e0.setLayerType(2, null);
            this.f48993b0.setLayerType(2, null);
            org.telegram.ui.Components.tm tmVar = this.f49019n0;
            if (tmVar != null) {
                tmVar.setLayerType(2, null);
            }
            View view = this.m0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f48998d0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z9) {
        this.P = z9;
    }

    public void setBackgroundDelegate(r01 r01Var) {
        this.U = r01Var;
    }

    public void setDrawBackground(boolean z9) {
        this.Q0 = z9;
        this.f48990a0.setClipToOutline(z9);
        fi.p5 p5Var = this.f48993b0;
        if (!z9) {
            p5Var.setVisibility(8);
        } else {
            p5Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z9) {
        if (this.T != z9) {
            this.T = z9;
            if (!z9) {
                org.telegram.messenger.g0.d0(this.f49008h0, new di.e(24));
                for (int i7 = 0; i7 < this.f48998d0.f38974b.getChildCount(); i7++) {
                    View childAt = this.f48998d0.f38974b.getChildAt(i7);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f48998d0.f38974b.invalidate();
            }
        }
    }

    public void setExpireDateHint(int i7) {
        if (i7 <= 0) {
            return;
        }
        this.O0 = true;
        this.P0 = Integer.valueOf(i7);
        B(true, false, true);
    }

    public void setForUser(boolean z9) {
        this.R = z9;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.N = drawable;
        a11 a11Var = this.O;
        if (a11Var != null) {
            a11Var.h.w0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z9) {
        this.f49009h1 = z9;
    }

    public void setOnLongPressedListener(o11 o11Var) {
        this.H = o11Var;
    }

    public void setRecentReactions(List<ch.o0> list) {
        this.R0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i7) {
        this.Z1 = Integer.valueOf(i7);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.K;
        hashSet.clear();
        hashSet.add(l10);
        o01 o01Var = this.f49008h0;
        if (o01Var != null) {
            for (int i7 = 0; i7 < o01Var.getChildCount(); i7++) {
                if (o01Var.getChildAt(i7) instanceof a11) {
                    a11 a11Var = (a11) o01Var.getChildAt(i7);
                    org.telegram.ui.Components.r5 r5Var = a11Var.f43508e;
                    if (r5Var != null) {
                        a11Var.d(hashSet.contains(Long.valueOf(r5Var.getDocumentId())), true);
                    } else {
                        a11Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            o01Var.invalidate();
        }
    }

    public void setSelectedReaction(ch.o0 o0Var) {
        this.J.clear();
        this.J.add(o0Var);
        o01 o01Var = this.f49008h0;
        if (o01Var != null) {
            for (int i7 = 0; i7 < o01Var.getChildCount(); i7++) {
                if (o01Var.getChildAt(i7) instanceof a11) {
                    a11 a11Var = (a11) o01Var.getChildAt(i7);
                    a11Var.d(this.J.contains(a11Var.f43515y), true);
                }
            }
            o01Var.invalidate();
        }
        e01 e01Var = this.f49010i0;
        if (e01Var != null) {
            for (int i10 = 0; i10 < e01Var.getChildCount(); i10++) {
                if (e01Var.getChildAt(i10) instanceof a11) {
                    a11 a11Var2 = (a11) e01Var.getChildAt(i10);
                    a11Var2.d(this.J.contains(a11Var2.f43515y), true);
                }
            }
            e01Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ch.o0> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) != null && ((ch.o0) arrayList.get(i7)).f6357g != 0) {
                hashSet2.add(Long.valueOf(((ch.o0) arrayList.get(i7)).f6357g));
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
            if (!this.l1 || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28183v6, this.Z0)) == this.f49005f1) {
                return;
            }
            this.f49005f1 = w02;
            this.M.setColor(i0.a.o(w02, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f49005f1, PorterDuff.Mode.SRC_IN);
            this.f49015k1 = porterDuffColorFilter;
            org.telegram.ui.Components.i5 i5Var = this.W0;
            if (i5Var != null) {
                i5Var.setColorFilter(porterDuffColorFilter);
            }
            o01 o01Var = this.f49008h0;
            if (o01Var != null) {
                o01Var.invalidate();
            }
            e01 e01Var = this.f49010i0;
            if (e01Var != null) {
                e01Var.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v(String str, boolean z9, boolean z10) {
        long j3;
        tz0 tz0Var = this.J1;
        if (tz0Var != null) {
            org.telegram.messenger.g0.r(tz0Var);
            this.J1 = null;
        }
        di.z5 z5Var = this.K1;
        if (z5Var != null) {
            org.telegram.messenger.g0.r(z5Var);
            this.K1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        b11 b11Var = this.f49024q0;
        i01 i01Var = this.f49004f0;
        if (isEmpty) {
            this.f49046y1 = false;
            this.f49048z1 = false;
            z(false, z9);
            if (i01Var != null) {
                i01Var.d(true);
                i01.a(i01Var, false);
            }
            b11Var.E(true);
            this.A1 = null;
        } else {
            boolean z11 = this.f49046y1;
            boolean z12 = !z11;
            this.f49046y1 = true;
            this.f49048z1 = false;
            if (i01Var != null) {
                i01Var.f46532f.b(2);
            }
            if (!z11) {
                ArrayList arrayList = this.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                b11Var.E(false);
            } else if (!str.equals(this.A1)) {
                tz0 tz0Var2 = new tz0(this, 1);
                this.J1 = tz0Var2;
                org.telegram.messenger.g0.i3(tz0Var2, 120L);
            }
            this.A1 = str;
            String[] G0 = org.telegram.messenger.g0.G0();
            if (!Arrays.equals(G0, f48987b2)) {
                org.telegram.messenger.ui.b0(this.V).M(G0, false);
            }
            f48987b2 = G0;
            di.z5 z5Var2 = new di.z5(this, str, z9, z12, G0, 3);
            this.K1 = z5Var2;
            if (z10) {
                j3 = 425;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.i3(z5Var2, j3);
            if (i01Var != null) {
                i01Var.f46532f.b(2);
                i01.a(i01Var, z9);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.f49011i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49011i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f49032t0.getAlpha(), f10 * 0.25f);
        this.f49011i1 = ofFloat;
        ofFloat.addUpdateListener(new sz0(this, 2));
        this.f49011i1.setDuration(200L);
        this.f49011i1.setInterpolator(org.telegram.ui.Components.xq.f40310f);
        this.f49011i1.start();
    }

    public final void x(Long l10, boolean z9) {
        boolean z10;
        HashSet hashSet = this.K;
        if (!hashSet.contains(l10)) {
            hashSet.add(l10);
            z10 = true;
        } else {
            hashSet.remove(l10);
            z10 = false;
        }
        o01 o01Var = this.f49008h0;
        if (o01Var != null) {
            for (int i7 = 0; i7 < o01Var.getChildCount(); i7++) {
                if (o01Var.getChildAt(i7) instanceof a11) {
                    a11 a11Var = (a11) o01Var.getChildAt(i7);
                    org.telegram.ui.Components.r5 r5Var = a11Var.f43508e;
                    if (r5Var != null && r5Var.getDocumentId() == l10.longValue()) {
                        a11Var.e(z10, z9);
                    } else {
                        TLRPC.Document document = a11Var.d;
                        if (document != null && document.f26958id == l10.longValue()) {
                            a11Var.e(z10, z9);
                        }
                    }
                }
            }
            o01Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.g5 g5Var, View view) {
        int i7;
        Integer num;
        if (g5Var != null && (num = g5Var.F) != null) {
            i7 = num.intValue();
        } else {
            i7 = 0;
        }
        this.n1 = i7;
        this.f49021o1 = g5Var;
        this.f49025q1 = view;
        if (this.I && g5Var != null) {
            g5Var.f33859n = this;
        }
        invalidate();
    }

    public final void z(boolean z9, boolean z10) {
        float f10;
        if (this.G1 == z9) {
            return;
        }
        this.G1 = z9;
        o01 o01Var = this.f49008h0;
        o01Var.setVisibility(0);
        e01 e01Var = this.f49010i0;
        e01Var.setVisibility(0);
        ValueAnimator valueAnimator = this.F1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.I1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.I1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F1 = ofFloat;
        ofFloat.addUpdateListener(new wz0(this, z9, 0));
        this.F1.addListener(new k01(this, z9, 0));
        this.F1.setDuration(320L);
        this.F1.setInterpolator(org.telegram.ui.Components.xq.h);
        this.F1.start();
        ViewPropertyAnimator animate = ((View) o01Var.getParent()).animate();
        if (this.G1 && z10) {
            f10 = -org.telegram.messenger.g0.L(36.0f);
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.camera.q.l(animate.translationY(f10).setUpdateListener(new sz0(this, 1)), org.telegram.ui.Components.xq.f40310f, 160L);
        if (this.G1 && z10) {
            e01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        } else {
            e01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        }
        h();
    }

    public q11(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, Integer num, int i7, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this(f2Var, context, z9, num, i7, z10, f6Var, i10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28183v6, f6Var));
    }

    public q11(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, Integer num, int i7, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(context);
        int i12;
        int i13;
        float f10;
        float f11;
        boolean z11;
        Integer num2;
        boolean z12;
        Integer num3;
        boolean z13;
        int i14;
        by0 by0Var;
        int i15 = i7;
        int i16 = i11;
        this.J = new HashSet();
        this.K = new HashSet();
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.S = new ArrayList();
        this.V = org.telegram.messenger.p10.f24459s0;
        this.f48996c0 = new org.telegram.ui.Components.av[2];
        this.f49036v0 = new ArrayList();
        this.f49039w0 = new SparseIntArray();
        this.f49042x0 = new SparseIntArray();
        this.f49045y0 = new SparseIntArray();
        this.f49047z0 = new SparseIntArray();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = false;
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = new ArrayList();
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = false;
        this.O0 = false;
        this.Q0 = true;
        this.V0 = new ImageReceiver(null);
        this.f49009h1 = true;
        this.f49017m1 = 1.0f;
        this.f49028r1 = 1.0f;
        this.f49035u1 = new OvershootInterpolator(2.0f);
        this.f49040w1 = false;
        this.f49043x1 = false;
        this.f49046y1 = false;
        this.f49048z1 = false;
        this.G1 = false;
        this.H1 = false;
        this.L1 = false;
        this.M1 = false;
        this.O1 = -1;
        this.P1 = -1;
        this.Q1 = -1L;
        this.S1 = new tz0(this, 3);
        this.T1 = new tz0(this, 4);
        this.X1 = new h2.f((int[]) null);
        this.Y1 = new Paint();
        this.Z0 = f6Var;
        this.W = i15;
        this.N0 = z9;
        this.f48997c1 = f2Var;
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.O0 = e12.getInt(sb2.toString(), 0) < 3;
        this.f49005f1 = i16;
        this.l1 = i16 == org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28183v6, f6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27940i6, f6Var));
        paint2.setColor(i0.a.o(i16, 30));
        this.f49015k1 = new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN);
        this.Y0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(c8.j9.b(num.intValue(), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(292.0f)));
        boolean z14 = valueOf != null && valueOf.intValue() > org.telegram.messenger.g0.L(170.0f);
        setFocusableInTouchMode(true);
        if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10 || i15 == 2 || i15 == 5 || i15 == 7) {
            this.f48999d1 = i10;
            setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            setOnTouchListener(new d0(this, 6));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.m0 = view;
            Drawable mutate = getResources().getDrawable(2131232724).mutate();
            org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.G8, f6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, c8.ha.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / org.telegram.messenger.g0.f22536p) + (z14 ? -12 : 4), n() ? 0 : this.f48999d1, 0.0f, n() ? this.f48999d1 : 0));
        }
        fi.p5 p5Var = new fi.p5(this, context, f6Var, 15);
        this.f48993b0 = p5Var;
        boolean z15 = i15 == 3 || i15 == 4;
        Integer num4 = valueOf;
        l01 l01Var = new l01(this, context, z15, z15, f6Var, num4);
        Integer num5 = num4;
        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
        this.f48990a0 = l01Var;
        if (!z15) {
            l01Var.setOutlineProvider(new m01(this, num5));
            l01Var.setClipToOutline(true);
            if (z15) {
                l01Var.setElevation(2.0f);
            }
        }
        if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10 || i15 == 2 || i15 == 5 || i15 == 15) {
            l01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        l01Var.addView(p5Var, c8.ha.c(-1.0f, -1));
        addView(l01Var, c8.ha.d(-1, -1.0f, 119, 0.0f, (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 2 || i15 == 7) ? this.f48999d1 + 6 : 0.0f, 0.0f, n() ? this.f48999d1 + 6 : 0.0f));
        if (num5 != null) {
            org.telegram.ui.Components.tm tmVar = new org.telegram.ui.Components.tm(context, 23);
            this.f49019n0 = tmVar;
            i13 = 14;
            Drawable drawable = getResources().getDrawable(2131232725);
            org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.G8, f6Var2, PorterDuff.Mode.MULTIPLY);
            tmVar.setBackground(drawable);
            i12 = 3;
            addView(tmVar, c8.ha.d(17, 9.0f, (n() ? 80 : 48) | 3, (num5.intValue() / org.telegram.messenger.g0.f22536p) + (z14 ? -25 : 10), n() ? 0.0f : this.f48999d1 + 5, 0.0f, n() ? this.f48999d1 + 14 : 0.0f));
        } else {
            i12 = 3;
            i13 = 14;
        }
        boolean z16 = (f2Var == null || i15 == i12 || i15 == 6 || i15 == 5 || i15 == 7 || i15 == 4 || i15 == 9 || i15 == 10 || !z10) ? false : true;
        int i17 = 0;
        while (true) {
            if (i17 >= 2) {
                break;
            }
            Integer num6 = num5;
            if (i15 != 4) {
                num2 = num6;
                z12 = true;
            } else {
                num2 = num6;
                z12 = false;
            }
            if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10) {
                num3 = num2;
                z13 = true;
            } else {
                num3 = num2;
                z13 = false;
            }
            if (z16) {
                i14 = 7;
                by0Var = new by0(7, this, f2Var);
            } else {
                i14 = 7;
                by0Var = null;
            }
            Integer num7 = num3;
            int i18 = i17;
            org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
            int i19 = i15;
            n01 n01Var = new n01(this, context, f6Var3, z12, z13, i19, by0Var, i16, i7);
            org.telegram.ui.Components.wu wuVar = n01Var.D;
            if (wuVar != null) {
                wuVar.setOnLongClickListener(new t(this, i14));
            }
            n01Var.U = false;
            if (i19 == 4) {
                n01Var.setAnimatedEmojiCacheType(13);
            } else {
                n01Var.setAnimatedEmojiCacheType((i19 == 0 || i19 == 12 || i19 == 2) ? 6 : 5);
            }
            n01Var.O = num7 == null;
            n01Var.setPaddingLeft(i19 == 6 ? 10.0f : 5.0f);
            if (i19 != 14 && i19 != 8 && i19 != 13) {
                this.f48990a0.addView(n01Var, c8.ha.c(36.0f, -1));
            }
            this.f48996c0[i18] = n01Var;
            int i20 = i18 + 1;
            i15 = i19;
            i13 = 14;
            i16 = i11;
            f6Var2 = f6Var3;
            i17 = i20;
            num5 = num7;
        }
        Integer num8 = num5;
        org.telegram.ui.ActionBar.f6 f6Var4 = f6Var2;
        int i21 = i15;
        int i22 = i13;
        org.telegram.ui.Components.av[] avVarArr = this.f48996c0;
        this.f48998d0 = avVarArr[0];
        avVarArr[1].setVisibility(8);
        j01 j01Var = new j01(context, num8, 1);
        this.f49001e0 = j01Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d7, j01Var, f6Var4);
        if (i21 == i22 || i21 == 8 || i21 == 13) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            this.f48990a0.addView(j01Var, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.f22536p, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        org.telegram.messenger.g0.Z3(j01Var, true, f10, true, false);
        o01 o01Var = new o01(this, context, i21);
        this.f49008h0 = o01Var;
        ?? kVar = new v4.k();
        this.f49002e1 = kVar;
        kVar.f56999c = 220L;
        kVar.f57000e = 260L;
        kVar.f57001f = 160L;
        kVar.f57002g = 160L;
        kVar.f56954m = false;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        kVar.f57003i = xqVar;
        kVar.C = false;
        o01Var.setItemAnimator(kVar);
        o01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        q01 q01Var = new q01(this);
        this.f49022p0 = q01Var;
        o01Var.setAdapter(q01Var);
        f01 f01Var = new f01(this, 1);
        this.f49027r0 = f01Var;
        o01Var.setLayoutManager(f01Var);
        f01Var.O = new d01(this, 0);
        rq0 rq0Var = new rq0(context, 5);
        this.f49006g0 = rq0Var;
        bi.x5 x5Var = new bi.x5(this, context);
        this.f49014k0 = x5Var;
        x5Var.addView(o01Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        rq0Var.addView(x5Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        e01 e01Var = new e01(this, context);
        this.f49010i0 = e01Var;
        if (e01Var.getItemAnimator() != null) {
            f11 = f10;
            e01Var.getItemAnimator().n(180L);
            e01Var.getItemAnimator().f57003i = xqVar;
        } else {
            f11 = f10;
        }
        TextView textView = new TextView(context);
        if (i21 == 4) {
            textView.setText(org.telegram.messenger.hd.M0(2131748211, null));
        } else if (i21 == 0 || i21 == 13 || i21 == 12 || i21 == 11 || i21 == 9 || i21 == 10) {
            textView.setText(org.telegram.messenger.hd.M0(2131748212, null));
        } else if (i21 == 1 || i21 == 2) {
            textView.setText(org.telegram.messenger.hd.M0(2131748173, null));
        } else if (i21 == i22) {
            textView.setText(org.telegram.messenger.hd.M0(2131748213, null));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131748202, null));
        }
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Af, f6Var4);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f49016l0 = l9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49012j0 = frameLayout;
        frameLayout.addView(l9Var, c8.ha.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        rq0Var.addView(frameLayout, c8.ha.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        e01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        b11 b11Var = new b11(this);
        this.f49024q0 = b11Var;
        e01Var.setAdapter(b11Var);
        f01 f01Var2 = new f01(this, 0);
        e01Var.setLayoutManager(f01Var2);
        f01Var2.O = new d01(this, 1);
        e01Var.setVisibility(8);
        rq0Var.addView(e01Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f48990a0.addView(rq0Var, c8.ha.d(-1, -1.0f, 48, 0.0f, (i21 == 8 || i21 == 13 || i21 == i22) ? 0.0f : (f11 / org.telegram.messenger.g0.f22536p) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(o01Var, f01Var);
        this.f49030s0 = ri0Var;
        ri0Var.f37754i = new ai.m(this, 2);
        ri0Var.h = new uz0(this);
        h01 h01Var = new h01(this, i21, context, f6Var4, num);
        o01Var.p1(h01Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        e01Var.p1(h01Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(this, i21, 2);
        o01Var.setOnItemClickListener(yk0Var);
        e01Var.setOnItemClickListener(yk0Var);
        i01 i01Var = new i01(this, context, z10);
        this.f49004f0 = i01Var;
        i01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
        i01Var.setVisibility(4);
        rq0Var.addView(i01Var, c8.ha.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        j01 j01Var2 = new j01(context, num8, 0);
        Drawable drawable2 = getResources().getDrawable(2131231228);
        int i23 = org.telegram.ui.ActionBar.k6.G8;
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.8f, i23);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.l(j01Var2, drawable2, L.f28323a, -1, 2, L.d, f6Var, mode);
        j01Var2.setBackground(drawable2);
        j01Var2.setAlpha(0.0f);
        this.f48990a0.addView(j01Var2, c8.ha.d(-1, 20.0f, 55, 0.0f, (f11 / org.telegram.messenger.g0.f22536p) + 36.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f49020o0 = view2;
        Drawable drawable3 = getResources().getDrawable(2131231225);
        org.telegram.ui.ActionBar.r6.y(this, drawable3, i23, f6Var, mode);
        if (i7 == i22) {
            view2.setBackground(drawable3);
        }
        view2.setAlpha(0.0f);
        this.f48990a0.addView(view2, c8.ha.e(-1, 20, 87));
        View view3 = new View(context);
        this.f49032t0 = view3;
        view3.setAlpha(0.0f);
        view3.setBackgroundColor(-16777216);
        this.f48990a0.addView(view3, c8.ha.c(-1.0f, -1));
        int i24 = this.V;
        org.telegram.messenger.ui.b0(i24);
        org.telegram.messenger.ui.b0(i24).B(5);
        if (i7 == i22) {
            org.telegram.messenger.qp.s1(this.V).E0();
        } else if (i7 == 1 || i7 == 11 || i7 == 2 || i7 == 6 || i7 == 13) {
            org.telegram.messenger.ui.b0(i24).A();
        } else if (i7 == 9 || i7 == 10) {
            if (org.telegram.messenger.qp.s1(i24).f24759e7.getBoolean("resetemojipacks", true)) {
                org.telegram.messenger.ui.b0(i24).a1(5, false, false);
                org.telegram.messenger.qp.s1(i24).f24759e7.edit().putBoolean("resetemojipacks", false).commit();
            }
            org.telegram.messenger.ui.b0(i24).L(2, false);
            org.telegram.messenger.ui.b0(i24).Y0();
            org.telegram.messenger.ui.b0(i24).m0(new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
        } else if (i7 == 0 || i7 == 12) {
            org.telegram.messenger.ui.b0(i24).L(0, true);
            org.telegram.messenger.ui.b0(i24).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        } else if (i7 == 3) {
            org.telegram.messenger.ui.b0(i24).v();
        } else if (i7 == 4) {
            org.telegram.messenger.ui.b0(i24).V0(0, false, true, false);
            org.telegram.messenger.ui.b0(i24).B(0);
        }
        this.V0.E0(7);
        int i25 = this.W;
        if (i25 == 3 || i25 == 4 || i25 == 6) {
            z11 = true;
        } else {
            com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.gc.D().f22622p;
            if (((CountDownLatch) b0Var.f6815c) == null) {
                z11 = true;
                b0Var.f6815c = new CountDownLatch(1);
            } else {
                z11 = true;
            }
            ch.e0.f6236g = z11;
        }
        B(z11, false, z11);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = arrayList.get(i7);
            i7++;
            this.J.add(ch.o0.b(str));
        }
        o01 o01Var = this.f49008h0;
        if (o01Var != null) {
            for (int i10 = 0; i10 < o01Var.getChildCount(); i10++) {
                if (o01Var.getChildAt(i10) instanceof a11) {
                    a11 a11Var = (a11) o01Var.getChildAt(i10);
                    a11Var.d(this.J.contains(a11Var.f43515y), true);
                }
            }
            o01Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(p11 p11Var) {
    }

    @Override
    public void setPressed(boolean z9) {
    }

    public void m() {
    }

    public void q() {
    }

    public void r(a11 a11Var, ch.o0 o0Var) {
    }
}
