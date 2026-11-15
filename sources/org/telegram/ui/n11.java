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
public abstract class n11 extends FrameLayout implements org.telegram.messenger.is, org.telegram.ui.ActionBar.z5 {
    public static String[] f49362c2;
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
    public s01 H;
    public final ArrayList H0;
    public boolean H1;
    public l11 I;
    public final ArrayList I0;
    public boolean I1;
    public boolean J;
    public final ArrayList J0;
    public ValueAnimator J1;
    public HashSet K;
    public ArrayList K0;
    public rz0 K1;
    public final HashSet L;
    public final ArrayList L0;
    public fi.r5 L1;
    public final Paint M;
    public ArrayList M0;
    public boolean M1;
    public final Paint N;
    public final ArrayList N0;
    public boolean N1;
    public Drawable O;
    public final boolean O0;
    public View O1;
    public x01 P;
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
    public di.bc S1;
    public final ArrayList T;
    public x01 T0;
    public final rz0 T1;
    public boolean U;
    public boolean U0;
    public final rz0 U1;
    public o01 V;
    public float V0;
    public Runnable V1;
    public final int W;
    public final ImageReceiver W0;
    public ValueAnimator W1;
    public org.telegram.ui.Components.g5 X0;
    public ValueAnimator X1;
    public d01 Y0;
    public final h2.f Y1;
    public final Integer Z0;
    public final Paint Z1;
    public int f49364a;
    public final int f49365a0;
    public final org.telegram.ui.ActionBar.e6 f49366a1;
    public Integer f49367a2;
    public int f49368b;
    public final i01 f49369b0;
    public float f49370b1;
    public int f49371c;
    public final hi.n5 f49372c0;
    public float f49373c1;
    public int d;
    public final org.telegram.ui.Components.gv[] f49374d0;
    public final org.telegram.ui.ActionBar.e2 f49375d1;
    public int f49376e;
    public org.telegram.ui.Components.gv f49377e0;
    public final int f49378e1;
    public int f49379f;
    public final g01 f49380f0;
    public final m01 f49381f1;
    public final f01 f49382g0;
    public int f49383g1;
    public int h;
    public final eh0 f49384h0;
    public boolean f49385h1;
    public final l01 f49386i0;
    public boolean f49387i1;
    public final b01 f49388j0;
    public ValueAnimator f49389j1;
    public final FrameLayout f49390k0;
    public Drawable f49391k1;
    public final ai.j0 f49392l0;
    public PorterDuffColorFilter l1;
    public final org.telegram.ui.Components.i9 m0;
    public final boolean f49393m1;
    public int f49394n;
    public final View f49395n0;
    public float n1;
    public final org.telegram.ui.Components.bn f49396o0;
    public int f49397o1;
    public final View f49398p0;
    public org.telegram.ui.Components.e5 f49399p1;
    public final n01 f49400q0;
    public Rect f49401q1;
    public int f49402r;
    public final y01 f49403r0;
    public View f49404r1;
    public int f49405s;
    public final c01 f49406s0;
    public float f49407s1;
    public final org.telegram.ui.Components.wi0 f49408t0;
    public x01 f49409t1;
    public final View f49410u0;
    public Rect f49411u1;
    public int f49412v0;
    public final OvershootInterpolator f49413v1;
    public int f49414w;
    public final ArrayList f49415w0;
    public ValueAnimator f49416w1;
    public int f49417x;
    public final SparseIntArray f49418x0;
    public boolean f49419x1;
    public int f49420y;
    public final SparseIntArray f49421y0;
    public boolean f49422y1;
    public final SparseIntArray f49423z0;
    public boolean f49424z1;
    public static final List f49361b2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] d2 = new boolean[4];
    public static final HashMap f49363e2 = new HashMap();

    public n11(org.telegram.ui.ActionBar.e2 e2Var, Context context, boolean z10, Integer num, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this(e2Var, context, z10, num, i7, true, e6Var, 16);
    }

    public static void D(int i7, org.telegram.ui.Components.i9 i9Var) {
        List list;
        org.telegram.messenger.gc b10;
        String str;
        if (i9Var != null) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.si.b0(i7).f26501t0[1]);
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                list = f49361b2;
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
                        if (document2 != null && list.contains(org.telegram.messenger.gj.V(document2, null, null))) {
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
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.si.b0(i7).s0(5));
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
                            if (document3 != null && list.contains(org.telegram.messenger.gj.V(document3, null, null))) {
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
                org.telegram.messenger.pz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.f29014m6, 0.2f, false);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.gc.b(document);
                    if (d != null) {
                        d.f26029e = 512;
                        d.f26030f = 512;
                    }
                    str = "36_36_g";
                } else {
                    if (d != null && org.telegram.messenger.gj.K2(document, false)) {
                        d.f26029e = 512;
                        d.f26030f = 512;
                    }
                    b10 = org.telegram.messenger.gc.b(document);
                    str = "36_36";
                }
                i9Var.setLayerNum(7);
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                i9Var.m(b10, str, org.telegram.messenger.gc.c(w10, document), "36_36", d, document);
            }
        }
    }

    public static void a(n11 n11Var, int i7, int i10) {
        int i11;
        org.telegram.ui.Components.wi0 wi0Var = n11Var.f49408t0;
        c01 c01Var = n11Var.f49406s0;
        View m10 = c01Var.m(i7);
        int L0 = c01Var.L0();
        if ((m10 == null && Math.abs(i7 - L0) > 72.0f) || !org.telegram.messenger.gz.c()) {
            if (c01Var.L0() < i7) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            wi0Var.f41354b = i11;
            wi0Var.d(i7, i10, false, false);
            return;
        }
        hi.l1 l1Var = new hi.l1(4, n11Var.f49386i0.getContext(), n11Var);
        l1Var.f58480a = i7;
        l1Var.f55123p = i10;
        c01Var.w0(l1Var);
    }

    public static boolean c(n11 n11Var) {
        if (!n11Var.U) {
            ValueAnimator valueAnimator = n11Var.W1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i7 = 13;
        int i10 = this.f49365a0;
        if (i10 != 5 && i10 != 7) {
            if (i10 == 6) {
                return org.telegram.ui.Components.g5.f();
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
        if (this.f49391k1 == null) {
            int i7 = this.f49365a0;
            if (i7 != 5 && i7 != 9 && i7 != 10 && i7 != 7) {
                this.f49391k1 = i5.c.g(org.telegram.messenger.t0.f26600b, 2131232363);
            } else {
                this.f49391k1 = i5.c.g(org.telegram.messenger.t0.f26600b, 2131232134);
            }
            this.f49391k1.setColorFilter(this.l1);
        }
        return this.f49391k1;
    }

    public static ArrayList j(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
            if (document == null || hashSet.contains(Long.valueOf(document.f28057id))) {
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
        String c10 = org.telegram.messenger.j6.c(str);
        int i7 = 0;
        while (true) {
            if (i7 < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i7).documents.isEmpty() && TextUtils.equals(org.telegram.messenger.j6.c(tL_messages_stickerSet.packs.get(i7).emoticon), c10)) {
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
            if (document.f28057id == j3) {
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
                g5Var.setColorFilter(this.l1);
                this.X0.a(this);
            }
        }
    }

    public static void t(int i7) {
        boolean[] zArr = d2;
        if (!zArr[i7]) {
            org.telegram.messenger.si.b0(i7);
            zArr[i7] = true;
            org.telegram.messenger.si.b0(i7).B(5);
            org.telegram.messenger.si.b0(i7).L(0, true);
            org.telegram.messenger.si.b0(i7).A();
            org.telegram.messenger.si.b0(i7).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            org.telegram.messenger.si.b0(i7).P();
            org.telegram.messenger.si.b0(i7).v();
            org.telegram.ui.Components.av0.F3.c(i7, 1, new fi.f(i7, 1));
        }
    }

    public final void A(Long l10) {
        this.L.remove(l10);
        l01 l01Var = this.f49386i0;
        if (l01Var != null) {
            int i7 = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < l01Var.getChildCount(); i10++) {
                if (l01Var.getChildAt(i10) instanceof x01) {
                    x01 x01Var = (x01) l01Var.getChildAt(i10);
                    org.telegram.ui.Components.p5 p5Var = x01Var.f53057e;
                    if (p5Var != null && p5Var.getDocumentId() == l10.longValue()) {
                        x01Var.f();
                    } else {
                        TLRPC.Document document = x01Var.d;
                        if (document != null && document.f28057id == l10.longValue()) {
                            x01Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            l01Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f49415w0;
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
                n01 n01Var = this.f49400q0;
                if (n01Var != null) {
                    n01Var.g(i7);
                }
            }
        }
    }

    public final void B(boolean r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n11.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        f01 f01Var = this.f49382g0;
        if (f01Var == null) {
            return;
        }
        if (this.A1) {
            f01Var.clearAnimation();
            f01Var.setVisibility(0);
            f01Var.animate().translationY(0.0f).start();
            return;
        }
        l01 l01Var = this.f49386i0;
        if (l01Var.getChildCount() > 0) {
            View childAt = l01Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f49364a && "searchbox".equals(childAt.getTag())) {
                f01Var.setVisibility(0);
                f01Var.setTranslationY(childAt.getY());
                return;
            }
            f01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
            return;
        }
        f01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
    }

    public final void E(float f10) {
        int i7;
        int i10 = -1;
        View view = this.f49395n0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.er.f34421g.getInterpolation(c8.i9.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i7 = -1;
            } else {
                i7 = 1;
            }
            view.setScaleY(interpolation * i7);
        }
        org.telegram.ui.Components.bn bnVar = this.f49396o0;
        if (bnVar != null) {
            float a10 = c8.i9.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            bnVar.setAlpha(a10);
            bnVar.setScaleX(a10);
            if (!n()) {
                i10 = 1;
            }
            bnVar.setScaleY(a10 * i10);
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a11 = c8.i9.a(f12 / 700.0f, 0.0f, 1.0f);
        float a12 = c8.i9.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = c8.i9.a(f12 / 750.0f, 0.0f, 1.0f);
        float a14 = c8.i9.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        float interpolation2 = erVar.getInterpolation(a11);
        float interpolation3 = erVar.getInterpolation(a12);
        this.f49372c0.setAlpha(a14);
        this.f49382g0.setAlpha(a14);
        int i11 = 0;
        for (int i12 = 0; i12 < this.f49377e0.f33010b.getChildCount(); i12++) {
            this.f49377e0.f33010b.getChildAt(i12).setAlpha(a14);
        }
        if (this.f49399p1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a14;
        i01 i01Var = this.f49369b0;
        i01Var.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        if (bnVar != null) {
            bnVar.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        }
        this.f49370b1 = (interpolation2 * 0.85f) + 0.15f;
        this.f49373c1 = (interpolation3 * 0.925f) + 0.075f;
        i01Var.invalidateOutline();
        if (bnVar != null) {
            bnVar.setAlpha(a14);
        }
        g01 g01Var = this.f49380f0;
        g01Var.setAlpha(a14);
        g01Var.setScaleX(Math.min(this.f49370b1, 1.0f));
        float pivotX = g01Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(i01Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(i01Var.getHeight(), 2.0d) + Math.pow(i01Var.getWidth() - pivotX, 2.0d)));
        for (int i13 = 0; i13 < this.f49377e0.f33010b.getChildCount(); i13++) {
            View childAt = this.f49377e0.f33010b.getChildAt(i13);
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
            float s5 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s5)) {
                s5 = 0.0f;
            }
            childAt.setScaleX(s5);
            childAt.setScaleY(s5);
        }
        while (true) {
            l01 l01Var = this.f49386i0;
            if (i11 < l01Var.getChildCount()) {
                View childAt2 = l01Var.getChildAt(i11);
                if (childAt2 instanceof x01) {
                    x01 x01Var = (x01) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float s9 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(s9)) {
                        s9 = 0.0f;
                    }
                    x01Var.setAnimatedScale(s9);
                }
                i11++;
            } else {
                this.f49392l0.invalidate();
                l01Var.invalidate();
                return;
            }
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f25600x0;
        rz0 rz0Var = this.U1;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.R)) {
                org.telegram.messenger.g0.r(rz0Var);
                org.telegram.messenger.g0.h3(rz0Var);
            }
        } else if (i7 == org.telegram.messenger.ns.A0) {
            org.telegram.messenger.g0.r(rz0Var);
            org.telegram.messenger.g0.h3(rz0Var);
        } else if (i7 == org.telegram.messenger.ns.C1) {
            org.telegram.messenger.g0.r(rz0Var);
            org.telegram.messenger.g0.h3(rz0Var);
        } else if (i7 == org.telegram.messenger.ns.B0) {
            org.telegram.messenger.g0.r(rz0Var);
            org.telegram.messenger.g0.h3(rz0Var);
        } else if (i7 == org.telegram.messenger.ns.f25514i4) {
            pg.c cVar = new pg.c(0);
            l01 l01Var = this.f49386i0;
            org.telegram.messenger.g0.d0(l01Var, cVar);
            if (l01Var != null) {
                l01Var.invalidate();
            }
        } else if (i7 == org.telegram.messenger.ns.G3 && ((Long) objArr[0]).longValue() == org.telegram.messenger.m10.i(this.W).e()) {
            org.telegram.messenger.g0.r(rz0Var);
            org.telegram.messenger.g0.h3(rz0Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i7;
        float f10;
        float measuredHeight;
        org.telegram.ui.Components.e5 e5Var = this.f49399p1;
        if (e5Var != null && (num = this.Z0) != null) {
            Rect bounds = e5Var.getBounds();
            View view = this.f49404r1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f49399p1.getAlpha();
            View view2 = this.f49404r1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f49399p1.f34198w = (int) (Math.pow(this.f49369b0.getAlpha(), 0.25d) * alpha * this.n1);
            if (this.f49401q1 == null) {
                this.f49401q1 = new Rect();
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
            float z10 = com.google.android.gms.internal.vision.e2.z(scaleY, 1.0f, bounds.centerY(), -f10);
            boolean n10 = n();
            int i10 = this.f49378e1;
            if (!n10) {
                measuredHeight = org.telegram.messenger.g0.L(i10);
            } else {
                measuredHeight = getMeasuredHeight() - (org.telegram.messenger.g0.L(i10) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f49401q1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.e5 e5Var2 = this.f49399p1;
            Rect rect = this.f49401q1;
            int i11 = rect.left;
            Rect rect2 = this.f49401q1;
            e5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f49401q1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f49399p1.draw(canvas);
            org.telegram.ui.Components.e5 e5Var3 = this.f49399p1;
            e5Var3.f34198w = alpha;
            e5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        x01 x01Var = this.f49409t1;
        if (x01Var != null && this.f49411u1 != null && x01Var.F != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f49409t1.F.setAlpha((int) (this.f49407s1 * 255.0f));
            this.f49409t1.F.setBounds(this.f49411u1);
            this.f49409t1.F.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.n1, this.f49383g1, this.f49397o1), PorterDuff.Mode.SRC_IN));
            this.f49409t1.F.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.Q1 - this.P1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.Q1 - this.P1) * 25) + f() + 16;
    }

    public di.bc getCollectionParticles() {
        if (this.S1 == null) {
            this.S1 = new di.bc(1, 8);
        }
        return this.S1;
    }

    public long getDialogId() {
        return org.telegram.messenger.m10.i(this.W).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        View view;
        float f10;
        if (this.H1) {
            view = this.f49388j0;
        } else {
            view = this.f49386i0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f49419x1) {
            this.f49419x1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f49398p0.animate();
            if (canScrollVertically) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.i20.m(animate, f10, 200L);
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n11.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i7 = this.f49365a0;
        if (i7 != 2) {
            StringBuilder sb2 = new StringBuilder("emoji");
            if (i7 != 0 && i7 != 12 && i7 != 9 && i7 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String s5 = a8.p0.s(sb2, str, "usehint");
            int i10 = org.telegram.messenger.np.e1().getInt(s5, 0);
            if (i10 <= 3) {
                org.telegram.messenger.np.e1().edit().putInt(s5, i10 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i7 = this.f49365a0;
        if (i7 != 5 && i7 != 10 && i7 != 12 && i7 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.p5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n11.o(android.view.View, org.telegram.ui.Components.p5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        int i7 = this.W;
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.A0);
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.f25600x0);
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.C1);
        org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.B0);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25514i4);
        int i10 = this.f49365a0;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.G3);
        }
        org.telegram.ui.Components.e5 e5Var = this.f49399p1;
        if (e5Var != null) {
            e5Var.f34195n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.J = false;
        int i7 = this.W;
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.A0);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.f25600x0);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.C1);
        org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.B0);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
        int i10 = this.f49365a0;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.G3);
        }
        org.telegram.ui.Components.e5 e5Var = this.f49399p1;
        if (e5Var != null) {
            e5Var.f34195n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (z10 && this.f49365a0 == 6) {
            this.f49406s0.y1((getMeasuredWidth() / org.telegram.messenger.g0.L(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10 = this.R0;
        int i11 = this.f49365a0;
        if (z10 && i11 != 3 && i11 != 4) {
            Point point = org.telegram.messenger.g0.f23609q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f), Integer.MIN_VALUE));
        } else if (i11 == 6) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.f23609q.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(d11 d11Var) {
        Integer num = this.f49367a2;
        if (num != null) {
            Parcelable parcelable = (Parcelable) f49363e2.get(num);
        }
        this.V1 = d11Var;
        boolean z10 = this.R0;
        l01 l01Var = this.f49386i0;
        if (!z10) {
            h();
            for (int i7 = 0; i7 < l01Var.getChildCount(); i7++) {
                View childAt = l01Var.getChildAt(i7);
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
        int i10 = this.f49365a0;
        if (i10 != 3 && i10 != 4 && i10 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W1 = ofFloat;
            ofFloat.addUpdateListener(new qz0(this, 0));
            this.W1.addListener(new xx(this, 28));
            rz0 rz0Var = new rz0(this, 0);
            ch.f0.f5068f = true;
            ch.f0.f5067e = true;
            ch.f0.f5069g = false;
            if (ch.f0.d) {
                ch.f0.d = false;
            }
            ch.f0.f5066c = rz0Var;
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25517j1, 512);
            this.Y1.d();
            this.W1.setDuration(800L);
            l01Var.setLayerType(2, null);
            this.f49382g0.setLayerType(2, null);
            this.f49380f0.setLayerType(2, null);
            this.f49372c0.setLayerType(2, null);
            org.telegram.ui.Components.bn bnVar = this.f49396o0;
            if (bnVar != null) {
                bnVar.setLayerType(2, null);
            }
            View view = this.f49395n0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f49377e0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.Q = z10;
    }

    public void setBackgroundDelegate(o01 o01Var) {
        this.V = o01Var;
    }

    public void setDrawBackground(boolean z10) {
        this.R0 = z10;
        this.f49369b0.setClipToOutline(z10);
        hi.n5 n5Var = this.f49372c0;
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
                org.telegram.messenger.g0.d0(this.f49386i0, new fi.e(24));
                for (int i7 = 0; i7 < this.f49377e0.f33010b.getChildCount(); i7++) {
                    View childAt = this.f49377e0.f33010b.getChildAt(i7);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f49377e0.f33010b.invalidate();
            }
        }
    }

    public void setExpireDateHint(int i7) {
        if (i7 <= 0) {
            return;
        }
        this.P0 = true;
        this.Q0 = Integer.valueOf(i7);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.S = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.O = drawable;
        x01 x01Var = this.P;
        if (x01Var != null) {
            x01Var.h.w0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f49387i1 = z10;
    }

    public void setOnLongPressedListener(l11 l11Var) {
        this.I = l11Var;
    }

    public void setRecentReactions(List<ch.p0> list) {
        this.S0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i7) {
        this.f49367a2 = Integer.valueOf(i7);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.L;
        hashSet.clear();
        hashSet.add(l10);
        l01 l01Var = this.f49386i0;
        if (l01Var != null) {
            for (int i7 = 0; i7 < l01Var.getChildCount(); i7++) {
                if (l01Var.getChildAt(i7) instanceof x01) {
                    x01 x01Var = (x01) l01Var.getChildAt(i7);
                    org.telegram.ui.Components.p5 p5Var = x01Var.f53057e;
                    if (p5Var != null) {
                        x01Var.d(hashSet.contains(Long.valueOf(p5Var.getDocumentId())), true);
                    } else {
                        x01Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            l01Var.invalidate();
        }
    }

    public void setSelectedReaction(ch.p0 p0Var) {
        this.K.clear();
        this.K.add(p0Var);
        l01 l01Var = this.f49386i0;
        if (l01Var != null) {
            for (int i7 = 0; i7 < l01Var.getChildCount(); i7++) {
                if (l01Var.getChildAt(i7) instanceof x01) {
                    x01 x01Var = (x01) l01Var.getChildAt(i7);
                    x01Var.d(this.K.contains(x01Var.f53064y), true);
                }
            }
            l01Var.invalidate();
        }
        b01 b01Var = this.f49388j0;
        if (b01Var != null) {
            for (int i10 = 0; i10 < b01Var.getChildCount(); i10++) {
                if (b01Var.getChildAt(i10) instanceof x01) {
                    x01 x01Var2 = (x01) b01Var.getChildAt(i10);
                    x01Var2.d(this.K.contains(x01Var2.f53064y), true);
                }
            }
            b01Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ch.p0> hashSet) {
        this.K = hashSet;
        HashSet hashSet2 = this.L;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) != null && ((ch.p0) arrayList.get(i7)).f5189g != 0) {
                hashSet2.add(Long.valueOf(((ch.p0) arrayList.get(i7)).f5189g));
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
            if (!this.f49393m1 || (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29184v6, this.f49366a1)) == this.f49383g1) {
                return;
            }
            this.f49383g1 = w02;
            this.N.setColor(i0.a.o(w02, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f49383g1, PorterDuff.Mode.SRC_IN);
            this.l1 = porterDuffColorFilter;
            org.telegram.ui.Components.g5 g5Var = this.X0;
            if (g5Var != null) {
                g5Var.setColorFilter(porterDuffColorFilter);
            }
            l01 l01Var = this.f49386i0;
            if (l01Var != null) {
                l01Var.invalidate();
            }
            b01 b01Var = this.f49388j0;
            if (b01Var != null) {
                b01Var.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j3;
        rz0 rz0Var = this.K1;
        if (rz0Var != null) {
            org.telegram.messenger.g0.r(rz0Var);
            this.K1 = null;
        }
        fi.r5 r5Var = this.L1;
        if (r5Var != null) {
            org.telegram.messenger.g0.r(r5Var);
            this.L1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        y01 y01Var = this.f49403r0;
        f01 f01Var = this.f49382g0;
        if (isEmpty) {
            this.f49424z1 = false;
            this.A1 = false;
            z(false, z10);
            if (f01Var != null) {
                f01Var.d(true);
                f01.a(f01Var, false);
            }
            y01Var.E(true);
            this.B1 = null;
        } else {
            boolean z12 = this.f49424z1;
            boolean z13 = !z12;
            this.f49424z1 = true;
            this.A1 = false;
            if (f01Var != null) {
                f01Var.f46957f.b(2);
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
                y01Var.E(false);
            } else if (!str.equals(this.B1)) {
                rz0 rz0Var2 = new rz0(this, 1);
                this.K1 = rz0Var2;
                org.telegram.messenger.g0.i3(rz0Var2, 120L);
            }
            this.B1 = str;
            String[] G0 = org.telegram.messenger.g0.G0();
            if (!Arrays.equals(G0, f49362c2)) {
                org.telegram.messenger.si.b0(this.W).M(G0, false);
            }
            f49362c2 = G0;
            fi.r5 r5Var2 = new fi.r5(this, str, z10, z13, G0, 3);
            this.L1 = r5Var2;
            if (z11) {
                j3 = 425;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.i3(r5Var2, j3);
            if (f01Var != null) {
                f01Var.f46957f.b(2);
                f01.a(f01Var, z10);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.f49389j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49389j1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f49410u0.getAlpha(), f10 * 0.25f);
        this.f49389j1 = ofFloat;
        ofFloat.addUpdateListener(new qz0(this, 2));
        this.f49389j1.setDuration(200L);
        this.f49389j1.setInterpolator(org.telegram.ui.Components.er.f34420f);
        this.f49389j1.start();
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
        l01 l01Var = this.f49386i0;
        if (l01Var != null) {
            for (int i7 = 0; i7 < l01Var.getChildCount(); i7++) {
                if (l01Var.getChildAt(i7) instanceof x01) {
                    x01 x01Var = (x01) l01Var.getChildAt(i7);
                    org.telegram.ui.Components.p5 p5Var = x01Var.f53057e;
                    if (p5Var != null && p5Var.getDocumentId() == l10.longValue()) {
                        x01Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = x01Var.d;
                        if (document != null && document.f28057id == l10.longValue()) {
                            x01Var.e(z11, z10);
                        }
                    }
                }
            }
            l01Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.e5 e5Var, View view) {
        int i7;
        Integer num;
        if (e5Var != null && (num = e5Var.G) != null) {
            i7 = num.intValue();
        } else {
            i7 = 0;
        }
        this.f49397o1 = i7;
        this.f49399p1 = e5Var;
        this.f49404r1 = view;
        if (this.J && e5Var != null) {
            e5Var.f34195n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f10;
        if (this.H1 == z10) {
            return;
        }
        this.H1 = z10;
        l01 l01Var = this.f49386i0;
        l01Var.setVisibility(0);
        b01 b01Var = this.f49388j0;
        b01Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new uz0(this, z10, 0));
        this.G1.addListener(new h01(this, z10, 0));
        this.G1.setDuration(320L);
        this.G1.setInterpolator(org.telegram.ui.Components.er.h);
        this.G1.start();
        ViewPropertyAnimator animate = ((View) l01Var.getParent()).animate();
        if (this.H1 && z11) {
            f10 = -org.telegram.messenger.g0.L(36.0f);
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.i20.n(animate.translationY(f10).setUpdateListener(new qz0(this, 1)), org.telegram.ui.Components.er.f34420f, 160L);
        if (this.H1 && z11) {
            b01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        } else {
            b01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        }
        h();
    }

    public n11(org.telegram.ui.ActionBar.e2 e2Var, Context context, boolean z10, Integer num, int i7, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this(e2Var, context, z10, num, i7, z11, e6Var, i10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29184v6, e6Var));
    }

    public n11(org.telegram.ui.ActionBar.e2 e2Var, Context context, boolean z10, Integer num, int i7, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(context);
        int i12;
        int i13;
        float f10;
        float f11;
        Integer num2;
        boolean z12;
        Integer num3;
        boolean z13;
        Integer num4;
        boolean z14;
        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
        int i14 = i7;
        int i15 = i11;
        this.K = new HashSet();
        this.L = new HashSet();
        Paint paint = new Paint(1);
        this.M = paint;
        Paint paint2 = new Paint(1);
        this.N = paint2;
        this.T = new ArrayList();
        this.W = org.telegram.messenger.m10.f24934t0;
        this.f49374d0 = new org.telegram.ui.Components.gv[2];
        this.f49415w0 = new ArrayList();
        this.f49418x0 = new SparseIntArray();
        this.f49421y0 = new SparseIntArray();
        this.f49423z0 = new SparseIntArray();
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
        this.f49387i1 = true;
        this.n1 = 1.0f;
        this.f49407s1 = 1.0f;
        this.f49413v1 = new OvershootInterpolator(2.0f);
        this.f49419x1 = false;
        this.f49422y1 = false;
        this.f49424z1 = false;
        this.A1 = false;
        this.H1 = false;
        this.I1 = false;
        this.M1 = false;
        this.N1 = false;
        this.P1 = -1;
        this.Q1 = -1;
        this.R1 = -1L;
        this.T1 = new rz0(this, 3);
        this.U1 = new rz0(this, 4);
        this.Y1 = new h2.f((int[]) null);
        this.Z1 = new Paint();
        this.f49366a1 = e6Var;
        this.f49365a0 = i14;
        this.O0 = z10;
        this.f49375d1 = e2Var2;
        SharedPreferences e12 = org.telegram.messenger.np.e1();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.P0 = e12.getInt(sb2.toString(), 0) < 3;
        this.f49383g1 = i15;
        this.f49393m1 = i15 == org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29184v6, e6Var);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var));
        paint2.setColor(i0.a.o(i15, 30));
        this.l1 = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
        this.Z0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(c8.i9.b(num.intValue(), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(292.0f)));
        boolean z15 = valueOf != null && valueOf.intValue() > org.telegram.messenger.g0.L(170.0f);
        setFocusableInTouchMode(true);
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 7) {
            this.f49378e1 = i10;
            setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            setOnTouchListener(new c0(this, 6));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.f49395n0 = view;
            Drawable mutate = getResources().getDrawable(2131232725).mutate();
            org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.G8, e6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, c8.ja.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / org.telegram.messenger.g0.f23608p) + (z15 ? -12 : 4), n() ? 0 : this.f49378e1, 0.0f, n() ? this.f49378e1 : 0));
        }
        hi.n5 n5Var = new hi.n5(this, context, e6Var, 15);
        this.f49372c0 = n5Var;
        boolean z16 = i14 == 3 || i14 == 4;
        Integer num5 = valueOf;
        i01 i01Var = new i01(this, context, z16, z16, e6Var, num5);
        Integer num6 = num5;
        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        this.f49369b0 = i01Var;
        if (!z16) {
            i01Var.setOutlineProvider(new j01(this, num6));
            i01Var.setClipToOutline(true);
            if (z16) {
                i01Var.setElevation(2.0f);
            }
        }
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 15) {
            i01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        i01Var.addView(n5Var, c8.ja.c(-1.0f, -1));
        addView(i01Var, c8.ja.d(-1, -1.0f, 119, 0.0f, (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 2 || i14 == 7) ? this.f49378e1 + 6 : 0.0f, 0.0f, n() ? this.f49378e1 + 6 : 0.0f));
        if (num6 != null) {
            org.telegram.ui.Components.bn bnVar = new org.telegram.ui.Components.bn(context, 23);
            this.f49396o0 = bnVar;
            i13 = 14;
            Drawable drawable = getResources().getDrawable(2131232726);
            org.telegram.ui.ActionBar.q6.x(this, drawable, org.telegram.ui.ActionBar.j6.G8, e6Var2, PorterDuff.Mode.MULTIPLY);
            bnVar.setBackground(drawable);
            i12 = 3;
            addView(bnVar, c8.ja.d(17, 9.0f, (n() ? 80 : 48) | 3, (num6.intValue() / org.telegram.messenger.g0.f23608p) + (z15 ? -25 : 10), n() ? 0.0f : this.f49378e1 + 5, 0.0f, n() ? this.f49378e1 + 14 : 0.0f));
        } else {
            i12 = 3;
            i13 = 14;
        }
        boolean z17 = (e2Var2 == null || i14 == i12 || i14 == 6 || i14 == 5 || i14 == 7 || i14 == 4 || i14 == 9 || i14 == 10 || !z11) ? false : true;
        int i16 = 0;
        while (true) {
            if (i16 >= 2) {
                break;
            }
            Integer num7 = num6;
            if (i14 != 4) {
                num3 = num7;
                z13 = true;
            } else {
                num3 = num7;
                z13 = false;
            }
            if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10) {
                num4 = num3;
                z14 = true;
            } else {
                num4 = num3;
                z14 = false;
            }
            Integer num8 = num4;
            fy0 fy0Var = z17 ? new fy0(4, this, e2Var2) : null;
            int i17 = i16;
            org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
            int i18 = i14;
            int i19 = i13;
            k01 k01Var = new k01(this, context, e6Var3, z13, z14, i18, fy0Var, i15, i7);
            org.telegram.ui.Components.cv cvVar = k01Var.E;
            if (cvVar != null) {
                cvVar.setOnLongClickListener(new t(this, 7));
            }
            k01Var.V = false;
            if (i18 == 4) {
                k01Var.setAnimatedEmojiCacheType(13);
            } else {
                k01Var.setAnimatedEmojiCacheType((i18 == 0 || i18 == 12 || i18 == 2) ? 6 : 5);
            }
            k01Var.P = num8 == null;
            k01Var.setPaddingLeft(i18 == 6 ? 10.0f : 5.0f);
            if (i18 != i19 && i18 != 8 && i18 != 13) {
                this.f49369b0.addView(k01Var, c8.ja.c(36.0f, -1));
            }
            this.f49374d0[i17] = k01Var;
            i15 = i11;
            i14 = i18;
            i13 = i19;
            e2Var2 = e2Var;
            e6Var2 = e6Var3;
            i16 = i17 + 1;
            num6 = num8;
        }
        Integer num9 = num6;
        org.telegram.ui.ActionBar.e6 e6Var4 = e6Var2;
        int i20 = i14;
        int i21 = i13;
        org.telegram.ui.Components.gv[] gvVarArr = this.f49374d0;
        this.f49377e0 = gvVarArr[0];
        gvVarArr[1].setVisibility(8);
        g01 g01Var = new g01(context, num9, 1);
        this.f49380f0 = g01Var;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, g01Var, e6Var4);
        if (i20 == i21 || i20 == 8 || i20 == 13) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            this.f49369b0.addView(g01Var, c8.ja.d(-1, 1.0f / org.telegram.messenger.g0.f23608p, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        org.telegram.messenger.g0.Y3(g01Var, true, f10, true, false);
        l01 l01Var = new l01(this, context, i20);
        this.f49386i0 = l01Var;
        ?? kVar = new v4.k();
        this.f49381f1 = kVar;
        kVar.f58608c = 220L;
        kVar.f58609e = 260L;
        kVar.f58610f = 160L;
        kVar.f58611g = 160L;
        kVar.f58564m = false;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        kVar.f58612i = erVar;
        kVar.C = false;
        l01Var.setItemAnimator(kVar);
        float f12 = f10;
        l01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        n01 n01Var = new n01(this);
        this.f49400q0 = n01Var;
        l01Var.setAdapter(n01Var);
        c01 c01Var = new c01(this, 1);
        this.f49406s0 = c01Var;
        l01Var.setLayoutManager(c01Var);
        c01Var.O = new a01(this, 0);
        eh0 eh0Var = new eh0(context, 7);
        this.f49384h0 = eh0Var;
        ai.j0 j0Var = new ai.j0(this, context);
        this.f49392l0 = j0Var;
        j0Var.addView(l01Var, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        eh0Var.addView(j0Var, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        b01 b01Var = new b01(this, context);
        this.f49388j0 = b01Var;
        if (b01Var.getItemAnimator() != null) {
            f11 = 38.0f;
            num2 = num9;
            b01Var.getItemAnimator().n(180L);
            b01Var.getItemAnimator().f58612i = erVar;
        } else {
            f11 = 38.0f;
            num2 = num9;
        }
        TextView textView = new TextView(context);
        if (i20 == 4) {
            textView.setText(org.telegram.messenger.hd.M0(2131748212, null));
        } else if (i20 == 0 || i20 == 13 || i20 == 12 || i20 == 11 || i20 == 9 || i20 == 10) {
            textView.setText(org.telegram.messenger.hd.M0(2131748213, null));
        } else if (i20 == 1 || i20 == 2) {
            textView.setText(org.telegram.messenger.hd.M0(2131748174, null));
        } else if (i20 == i21) {
            textView.setText(org.telegram.messenger.hd.M0(2131748214, null));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131748203, null));
        }
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Df, e6Var4);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.m0 = i9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49390k0 = frameLayout;
        frameLayout.addView(i9Var, c8.ja.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        eh0Var.addView(frameLayout, c8.ja.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        b01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(f11));
        y01 y01Var = new y01(this);
        this.f49403r0 = y01Var;
        b01Var.setAdapter(y01Var);
        c01 c01Var2 = new c01(this, 0);
        b01Var.setLayoutManager(c01Var2);
        c01Var2.O = new a01(this, 1);
        b01Var.setVisibility(8);
        eh0Var.addView(b01Var, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f49369b0.addView(eh0Var, c8.ja.d(-1, -1.0f, 48, 0.0f, (i20 == 8 || i20 == 13 || i20 == i21) ? 0.0f : (f12 / org.telegram.messenger.g0.f23608p) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(l01Var, c01Var);
        this.f49408t0 = wi0Var;
        wi0Var.f41359i = new ci.h(this, 2);
        wi0Var.h = new sz0(this);
        e01 e01Var = new e01(this, i20, context, e6Var4, num);
        l01Var.p1(e01Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        b01Var.p1(e01Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        org.telegram.ui.Components.dl0 dl0Var = new org.telegram.ui.Components.dl0(this, i20, 2);
        l01Var.setOnItemClickListener(dl0Var);
        b01Var.setOnItemClickListener(dl0Var);
        f01 f01Var = new f01(this, context, z11);
        this.f49382g0 = f01Var;
        f01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
        f01Var.setVisibility(4);
        eh0Var.addView(f01Var, c8.ja.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        g01 g01Var2 = new g01(context, num2, 0);
        Drawable drawable2 = getResources().getDrawable(2131231228);
        int i22 = org.telegram.ui.ActionBar.j6.G8;
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.8f, i22);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.k(g01Var2, drawable2, K.f29392a, -1, 2, K.d, e6Var, mode);
        g01Var2.setBackground(drawable2);
        g01Var2.setAlpha(0.0f);
        this.f49369b0.addView(g01Var2, c8.ja.d(-1, 20.0f, 55, 0.0f, (f12 / org.telegram.messenger.g0.f23608p) + 36.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f49398p0 = view2;
        Drawable drawable3 = getResources().getDrawable(2131231225);
        org.telegram.ui.ActionBar.q6.x(this, drawable3, i22, e6Var, mode);
        if (i20 == i21) {
            view2.setBackground(drawable3);
        }
        view2.setAlpha(0.0f);
        this.f49369b0.addView(view2, c8.ja.e(-1, 20, 87));
        View view3 = new View(context);
        this.f49410u0 = view3;
        view3.setAlpha(0.0f);
        view3.setBackgroundColor(-16777216);
        this.f49369b0.addView(view3, c8.ja.c(-1.0f, -1));
        int i23 = this.W;
        org.telegram.messenger.si.b0(i23);
        org.telegram.messenger.si.b0(i23).B(5);
        if (i20 == i21) {
            org.telegram.messenger.np.s1(this.W).E0();
        } else if (i20 == 1 || i20 == 11 || i20 == 2 || i20 == 6 || i20 == 13) {
            org.telegram.messenger.si.b0(i23).A();
        } else if (i20 == 9 || i20 == 10) {
            if (org.telegram.messenger.np.s1(i23).f25280f7.getBoolean("resetemojipacks", true)) {
                org.telegram.messenger.si.b0(i23).a1(5, false, false);
                org.telegram.messenger.np.s1(i23).f25280f7.edit().putBoolean("resetemojipacks", false).commit();
            }
            org.telegram.messenger.si.b0(i23).L(2, false);
            org.telegram.messenger.si.b0(i23).Y0();
            org.telegram.messenger.si.b0(i23).m0(new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
        } else if (i20 == 0 || i20 == 12) {
            org.telegram.messenger.si.b0(i23).L(0, true);
            org.telegram.messenger.si.b0(i23).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        } else if (i20 == 3) {
            org.telegram.messenger.si.b0(i23).v();
        } else if (i20 == 4) {
            org.telegram.messenger.si.b0(i23).V0(0, false, true, false);
            org.telegram.messenger.si.b0(i23).B(0);
        }
        this.W0.E0(7);
        int i24 = this.f49365a0;
        if (i24 == 3 || i24 == 4 || i24 == 6) {
            z12 = true;
        } else {
            com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.fc.D().f23473p;
            if (((CountDownLatch) b0Var.f6204c) == null) {
                z12 = true;
                b0Var.f6204c = new CountDownLatch(1);
            } else {
                z12 = true;
            }
            ch.f0.f5069g = z12;
        }
        B(z12, false, z12);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.K.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = arrayList.get(i7);
            i7++;
            this.K.add(ch.p0.b(str));
        }
        l01 l01Var = this.f49386i0;
        if (l01Var != null) {
            for (int i10 = 0; i10 < l01Var.getChildCount(); i10++) {
                if (l01Var.getChildAt(i10) instanceof x01) {
                    x01 x01Var = (x01) l01Var.getChildAt(i10);
                    x01Var.d(this.K.contains(x01Var.f53064y), true);
                }
            }
            l01Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(m11 m11Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void m() {
    }

    public void q() {
    }

    public void r(x01 x01Var, ch.p0 p0Var) {
    }
}
