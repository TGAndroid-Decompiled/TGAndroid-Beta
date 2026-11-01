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
public abstract class g31 extends FrameLayout implements org.telegram.messenger.vs, org.telegram.ui.ActionBar.k6 {
    public static String[] f37284b2;
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
    public l21 G;
    public final ArrayList G0;
    public boolean G1;
    public e31 H;
    public final ArrayList H0;
    public boolean H1;
    public boolean I;
    public final ArrayList I0;
    public ValueAnimator I1;
    public HashSet J;
    public ArrayList J0;
    public j11 J1;
    public final HashSet K;
    public final ArrayList K0;
    public ig.k0 K1;
    public final Paint L;
    public ArrayList L0;
    public boolean L1;
    public final Paint M;
    public final ArrayList M0;
    public boolean M1;
    public Drawable N;
    public final boolean N0;
    public View N1;
    public q21 O;
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
    public rh.s8 R1;
    public final ArrayList S;
    public q21 S0;
    public final j11 S1;
    public boolean T;
    public boolean T0;
    public final j11 T1;
    public h21 U;
    public float U0;
    public Runnable U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.f5 W0;
    public ValueAnimator W1;
    public w11 X0;
    public final e2.f X1;
    public final Integer Y0;
    public final Paint Y1;
    public final org.telegram.ui.ActionBar.p6 Z0;
    public Integer Z1;
    public int f37287a;
    public final b21 f37288a0;
    public float f37289a1;
    public int f37290b;
    public final kg.f0 f37291b0;
    public float f37292b1;
    public int f37293c;
    public final org.telegram.ui.Components.mv[] f37294c0;
    public final org.telegram.ui.ActionBar.k2 f37295c1;
    public int d;
    public org.telegram.ui.Components.mv f37296d0;
    public final int f37297d1;
    public int e;
    public final z11 f37298e0;
    public final f21 f37299e1;
    public int f37300f;
    public final y11 f37301f0;
    public int f37302f1;
    public final bg0 f37303g0;
    public boolean f37304g1;
    public int h;
    public final e21 f37305h0;
    public boolean f37306h1;
    public final t11 f37307i0;
    public ValueAnimator f37308i1;
    public final FrameLayout f37309j0;
    public Drawable f37310j1;
    public final fg.i f37311k0;
    public PorterDuffColorFilter f37312k1;
    public final org.telegram.ui.Components.g9 f37313l0;
    public final boolean l1;
    public final View m0;
    public float f37314m1;
    public int f37315n;
    public final org.telegram.ui.Components.bn f37316n0;
    public int f37317n1;
    public final View f37318o0;
    public org.telegram.ui.Components.d5 f37319o1;
    public final g21 f37320p0;
    public Rect f37321p1;
    public final r21 f37322q0;
    public View f37323q1;
    public int f37324r;
    public final u11 f37325r0;
    public float f37326r1;
    public int f37327s;
    public final org.telegram.ui.Components.wj0 f37328s0;
    public q21 f37329s1;
    public final View f37330t0;
    public Rect f37331t1;
    public int f37332u0;
    public final OvershootInterpolator f37333u1;
    public final ArrayList f37334v0;
    public ValueAnimator f37335v1;
    public int f37336w;
    public final SparseIntArray f37337w0;
    public boolean f37338w1;
    public int f37339x;
    public final SparseIntArray f37340x0;
    public boolean f37341x1;
    public int f37342y;
    public final SparseIntArray f37343y0;
    public boolean f37344y1;
    public final SparseIntArray f37345z0;
    public boolean f37346z1;
    public static final List a2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] f37285c2 = new boolean[4];
    public static final HashMap f37286d2 = new HashMap();

    public g31(org.telegram.ui.ActionBar.k2 k2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this(k2Var, context, z10, num, i10, true, p6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.g9 g9Var) {
        List list;
        org.telegram.messenger.jc b10;
        String str;
        if (g9Var != null) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.vi.b0(i10).f18674s0[1]);
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i11 = 0;
            while (true) {
                int size = arrayList.size();
                list = a2;
                if (i11 >= size) {
                    break;
                }
                if ((arrayList.get(i11) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i11)).documents != null) {
                    ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i11)).documents);
                    Collections.shuffle(arrayList2);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i12);
                        if (document2 != null && list.contains(org.telegram.messenger.kj.V(document2, null, null))) {
                            int i13 = round - 1;
                            if (round <= 0) {
                                round = i13;
                                document = document2;
                                break;
                            }
                            round = i13;
                            document = document2;
                        }
                        i12++;
                    }
                }
                if (document != null && round <= 0) {
                    break;
                }
                i11++;
            }
            if (document == null || round > 0) {
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.vi.b0(i10).s0(5));
                Collections.shuffle(arrayList3);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    if (arrayList3.get(i14) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i14)).documents != null) {
                        ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i14)).documents);
                        Collections.shuffle(arrayList4);
                        int i15 = 0;
                        while (true) {
                            if (i15 >= arrayList4.size()) {
                                break;
                            }
                            TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i15);
                            if (document3 != null && list.contains(org.telegram.messenger.kj.V(document3, null, null))) {
                                int i16 = round - 1;
                                if (round <= 0) {
                                    round = i16;
                                    document = document3;
                                    break;
                                }
                                round = i16;
                                document = document3;
                            }
                            i15++;
                        }
                    }
                    if (document != null && round <= 0) {
                        break;
                    }
                }
            }
            if (document != null) {
                org.telegram.messenger.d00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.f21096m6, 0.2f, false);
                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.jc.b(document);
                    if (d != null) {
                        d.e = 512;
                        d.f15264f = 512;
                    }
                    str = "36_36_g";
                } else {
                    if (d != null && org.telegram.messenger.kj.K2(document, false)) {
                        d.e = 512;
                        d.f15264f = 512;
                    }
                    b10 = org.telegram.messenger.jc.b(document);
                    str = "36_36";
                }
                g9Var.setLayerNum(7);
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
                g9Var.m(b10, str, org.telegram.messenger.jc.c(w9, document), "36_36", d, document);
            }
        }
    }

    public static void a(g31 g31Var, int i10, int i11) {
        int i12;
        org.telegram.ui.Components.wj0 wj0Var = g31Var.f37328s0;
        u11 u11Var = g31Var.f37325r0;
        View m10 = u11Var.m(i10);
        int L0 = u11Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !org.telegram.messenger.uz.c()) {
            if (u11Var.L0() < i10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            wj0Var.f32267b = i12;
            wj0Var.d(i10, i11, false, false);
            return;
        }
        org.telegram.ui.Components.qw qwVar = new org.telegram.ui.Components.qw(g31Var, g31Var.f37305h0.getContext(), 3);
        qwVar.f48056a = i10;
        qwVar.f4253p = i11;
        u11Var.w0(qwVar);
    }

    public static boolean c(g31 g31Var) {
        if (!g31Var.T) {
            ValueAnimator valueAnimator = g31Var.V1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i10 = 13;
        int i11 = this.W;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.f5.f();
            }
            if (i11 != 3 && i11 != 4) {
                i10 = 2;
                if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10 && i11 != 2) {
                    return 3;
                }
            }
        }
        return i10;
    }

    public Drawable getPremiumStar() {
        if (this.f37310j1 == null) {
            int i10 = this.W;
            if (i10 != 5 && i10 != 9 && i10 != 10 && i10 != 7) {
                this.f37310j1 = i0.a.f(org.telegram.messenger.w0.f18945b, 2131232361);
            } else {
                this.f37310j1 = i0.a.f(org.telegram.messenger.w0.f18945b, 2131232132);
            }
            this.f37310j1.setColorFilter(this.f37312k1);
        }
        return this.f37310j1;
    }

    public static ArrayList j(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.f19800id))) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        long j10;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String c10 = org.telegram.messenger.k6.c(str);
        int i10 = 0;
        while (true) {
            if (i10 < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i10).documents.isEmpty() && TextUtils.equals(org.telegram.messenger.k6.c(tL_messages_stickerSet.packs.get(i10).emoticon), c10)) {
                    j10 = tL_messages_stickerSet.packs.get(i10).documents.get(0).longValue();
                    break;
                }
                i10++;
            } else {
                j10 = 0;
                break;
            }
        }
        if (j10 == 0) {
            return null;
        }
        for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
            if (document.f19800id == j10) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.f5 f5Var) {
        org.telegram.ui.Components.f5 f5Var2;
        if (this.I && (f5Var2 = this.W0) != f5Var) {
            if (f5Var2 != null) {
                f5Var2.n(this);
            }
            this.W0 = f5Var;
            if (f5Var != null) {
                f5Var.setColorFilter(this.f37312k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(int i10) {
        boolean[] zArr = f37285c2;
        if (!zArr[i10]) {
            org.telegram.messenger.vi.b0(i10);
            zArr[i10] = true;
            org.telegram.messenger.vi.b0(i10).B(5);
            org.telegram.messenger.vi.b0(i10).L(0, true);
            org.telegram.messenger.vi.b0(i10).A();
            org.telegram.messenger.vi.b0(i10).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            org.telegram.messenger.vi.b0(i10).P();
            org.telegram.messenger.vi.b0(i10).v();
            org.telegram.ui.Components.cw0.E3.c(i10, 1, new org.telegram.ui.Components.sv0(i10, 0));
        }
    }

    public final void A(Long l4) {
        this.K.remove(l4);
        e21 e21Var = this.f37305h0;
        if (e21Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < e21Var.getChildCount(); i11++) {
                if (e21Var.getChildAt(i11) instanceof q21) {
                    q21 q21Var = (q21) e21Var.getChildAt(i11);
                    org.telegram.ui.Components.o5 o5Var = q21Var.e;
                    if (o5Var != null && o5Var.getDocumentId() == l4.longValue()) {
                        q21Var.f();
                    } else {
                        TLRPC.Document document = q21Var.d;
                        if (document != null && document.f19800id == l4.longValue()) {
                            q21Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            e21Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f37334v0;
                    if (i10 < arrayList.size()) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (longValue == (l4.longValue() * 13) + 62425 || longValue == (l4.longValue() * 13) + 3212) {
                            break;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
                g21 g21Var = this.f37320p0;
                if (g21Var != null) {
                    g21Var.g(i10);
                }
            }
        }
    }

    public final void B(boolean r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g31.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        y11 y11Var = this.f37301f0;
        if (y11Var == null) {
            return;
        }
        if (this.f37346z1) {
            y11Var.clearAnimation();
            y11Var.setVisibility(0);
            y11Var.animate().translationY(0.0f).start();
            return;
        }
        e21 e21Var = this.f37305h0;
        if (e21Var.getChildCount() > 0) {
            View childAt = e21Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f37287a && "searchbox".equals(childAt.getTag())) {
                y11Var.setVisibility(0);
                y11Var.setTranslationY(childAt.getY());
                return;
            }
            y11Var.setTranslationY(-org.telegram.messenger.i0.L(52.0f));
            return;
        }
        y11Var.setTranslationY(-org.telegram.messenger.i0.L(52.0f));
    }

    public final void E(float f7) {
        int i10;
        int i11 = -1;
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.gr.f26524g.getInterpolation(w7.u.a((((f7 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            view.setScaleY(interpolation * i10);
        }
        org.telegram.ui.Components.bn bnVar = this.f37316n0;
        if (bnVar != null) {
            float a10 = w7.u.a((((f7 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            bnVar.setAlpha(a10);
            bnVar.setScaleX(a10);
            if (!n()) {
                i11 = 1;
            }
            bnVar.setScaleY(a10 * i11);
        }
        float f10 = 800.0f * f7;
        float f11 = f10 - 40.0f;
        float a11 = w7.u.a(f11 / 700.0f, 0.0f, 1.0f);
        float a12 = w7.u.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = w7.u.a(f11 / 750.0f, 0.0f, 1.0f);
        float a14 = w7.u.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        float interpolation2 = grVar.getInterpolation(a11);
        float interpolation3 = grVar.getInterpolation(a12);
        this.f37291b0.setAlpha(a14);
        this.f37301f0.setAlpha(a14);
        int i12 = 0;
        for (int i13 = 0; i13 < this.f37296d0.f33184b.getChildCount(); i13++) {
            this.f37296d0.f33184b.getChildAt(i13).setAlpha(a14);
        }
        if (this.f37319o1 != null) {
            invalidate();
        }
        float f12 = 1.0f - a14;
        b21 b21Var = this.f37288a0;
        b21Var.setTranslationY(org.telegram.messenger.i0.L(-5.0f) * f12);
        if (bnVar != null) {
            bnVar.setTranslationY(org.telegram.messenger.i0.L(-5.0f) * f12);
        }
        this.f37289a1 = (interpolation2 * 0.85f) + 0.15f;
        this.f37292b1 = (interpolation3 * 0.925f) + 0.075f;
        b21Var.invalidateOutline();
        if (bnVar != null) {
            bnVar.setAlpha(a14);
        }
        z11 z11Var = this.f37298e0;
        z11Var.setAlpha(a14);
        z11Var.setScaleX(Math.min(this.f37289a1, 1.0f));
        float pivotX = z11Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(b21Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(b21Var.getHeight(), 2.0d) + Math.pow(b21Var.getWidth() - pivotX, 2.0d)));
        for (int i14 = 0; i14 < this.f37296d0.f33184b.getChildCount(); i14++) {
            View childAt = this.f37296d0.f33184b.getChildAt(i14);
            if (f7 == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f7 == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (n()) {
                height = getMeasuredHeight() - height;
            }
            float s10 = org.telegram.messenger.i0.s(a13, (float) Math.sqrt(c3.i0.u(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s10)) {
                s10 = 0.0f;
            }
            childAt.setScaleX(s10);
            childAt.setScaleY(s10);
        }
        while (true) {
            e21 e21Var = this.f37305h0;
            if (i12 < e21Var.getChildCount()) {
                View childAt2 = e21Var.getChildAt(i12);
                if (childAt2 instanceof q21) {
                    q21 q21Var = (q21) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float s11 = org.telegram.messenger.i0.s(a13, (float) Math.sqrt(c3.i0.u(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(s11)) {
                        s11 = 0.0f;
                    }
                    q21Var.setAnimatedScale(s11);
                }
                i12++;
            } else {
                this.f37311k0.invalidate();
                e21Var.invalidate();
                return;
            }
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.at.f14814x0;
        j11 j11Var = this.T1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                org.telegram.messenger.i0.r(j11Var);
                org.telegram.messenger.i0.g3(j11Var);
            }
        } else if (i10 == org.telegram.messenger.at.A0) {
            org.telegram.messenger.i0.r(j11Var);
            org.telegram.messenger.i0.g3(j11Var);
        } else if (i10 == org.telegram.messenger.at.C1) {
            org.telegram.messenger.i0.r(j11Var);
            org.telegram.messenger.i0.g3(j11Var);
        } else if (i10 == org.telegram.messenger.at.B0) {
            org.telegram.messenger.i0.r(j11Var);
            org.telegram.messenger.i0.g3(j11Var);
        } else if (i10 == org.telegram.messenger.at.f14726i4) {
            ag.z0 z0Var = new ag.z0(2);
            e21 e21Var = this.f37305h0;
            org.telegram.messenger.i0.d0(e21Var, z0Var);
            if (e21Var != null) {
                e21Var.invalidate();
            }
        } else if (i10 == org.telegram.messenger.at.G3 && ((Long) objArr[0]).longValue() == org.telegram.messenger.e20.i(this.V).e()) {
            org.telegram.messenger.i0.r(j11Var);
            org.telegram.messenger.i0.g3(j11Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i10;
        float f7;
        float measuredHeight;
        org.telegram.ui.Components.d5 d5Var = this.f37319o1;
        if (d5Var != null && (num = this.Y0) != null) {
            Rect bounds = d5Var.getBounds();
            View view = this.f37323q1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f37319o1.getAlpha();
            View view2 = this.f37323q1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f37319o1.f25376w = (int) (Math.pow(this.f37288a0.getAlpha(), 0.25d) * alpha * this.f37314m1);
            if (this.f37321p1 == null) {
                this.f37321p1 = new Rect();
            }
            if (scaleY > 1.0f && scaleY < 1.5f) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            float f10 = i10;
            if (scaleY > 1.5f) {
                f7 = (bounds.height() * 0.81f) + 1.0f;
            } else {
                f7 = 0.0f;
            }
            float intValue = num.intValue() + f10;
            float z10 = c3.i0.z(scaleY, 1.0f, bounds.centerY(), -f7);
            boolean n10 = n();
            int i11 = this.f37297d1;
            if (!n10) {
                measuredHeight = org.telegram.messenger.i0.L(i11);
            } else {
                measuredHeight = getMeasuredHeight() - (org.telegram.messenger.i0.L(i11) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f37321p1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.d5 d5Var2 = this.f37319o1;
            Rect rect = this.f37321p1;
            int i12 = rect.left;
            Rect rect2 = this.f37321p1;
            d5Var2.setBounds(i12, rect.top, (int) ((rect.width() / scaleY) + i12), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f37321p1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f37319o1.draw(canvas);
            org.telegram.ui.Components.d5 d5Var3 = this.f37319o1;
            d5Var3.f25376w = alpha;
            d5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        q21 q21Var = this.f37329s1;
        if (q21Var != null && this.f37331t1 != null && q21Var.E != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f37329s1.E.setAlpha((int) (this.f37326r1 * 255.0f));
            this.f37329s1.E.setBounds(this.f37331t1);
            this.f37329s1.E.setColorFilter(new PorterDuffColorFilter(i0.b.f(1.0f - this.f37314m1, this.f37302f1, this.f37317n1), PorterDuff.Mode.SRC_IN));
            this.f37329s1.E.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.P1 - this.O1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.P1 - this.O1) * 25) + f() + 16;
    }

    public rh.s8 getCollectionParticles() {
        if (this.R1 == null) {
            this.R1 = new rh.s8(1, 8);
        }
        return this.R1;
    }

    public long getDialogId() {
        return org.telegram.messenger.e20.i(this.V).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        View view;
        float f7;
        if (this.G1) {
            view = this.f37307i0;
        } else {
            view = this.f37305h0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f37338w1) {
            this.f37338w1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f37318o0.animate();
            if (canScrollVertically) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.a30.l(animate, f7, 200L);
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g31.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i10 = this.W;
        if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder("emoji");
            if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String r10 = a1.g.r(sb2, str, "usehint");
            int i11 = org.telegram.messenger.wp.d1().getInt(r10, 0);
            if (i11 <= 3) {
                org.telegram.messenger.wp.d1().edit().putInt(r10, i11 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i10 = this.W;
        if (i10 != 5 && i10 != 10 && i10 != 12 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r15, org.telegram.ui.Components.o5 r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g31.o(android.view.View, org.telegram.ui.Components.o5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        int i10 = this.V;
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.A0);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14814x0);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.C1);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.B0);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
        int i11 = this.W;
        if (i11 == 0 || i11 == 12) {
            org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.G3);
        }
        org.telegram.ui.Components.d5 d5Var = this.f37319o1;
        if (d5Var != null) {
            d5Var.f25373n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.I = false;
        int i10 = this.V;
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.A0);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14814x0);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.C1);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.B0);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
        int i11 = this.W;
        if (i11 == 0 || i11 == 12) {
            org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.G3);
        }
        org.telegram.ui.Components.d5 d5Var = this.f37319o1;
        if (d5Var != null) {
            d5Var.f25373n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.W == 6) {
            this.f37325r0.y1((getMeasuredWidth() / org.telegram.messenger.i0.L(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.Q0;
        int i12 = this.W;
        if (z10 && i12 != 3 && i12 != 4) {
            Point point = org.telegram.messenger.i0.f16172q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.i0.L(324.0f), point.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.i0.L(330.0f), point.y * 0.75f), Integer.MIN_VALUE));
        } else if (i12 == 6) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.i0.f16172q.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public abstract void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(w21 w21Var) {
        Integer num = this.Z1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) f37286d2.get(num);
        }
        this.U1 = w21Var;
        boolean z10 = this.Q0;
        e21 e21Var = this.f37305h0;
        if (!z10) {
            h();
            for (int i10 = 0; i10 < e21Var.getChildCount(); i10++) {
                View childAt = e21Var.getChildAt(i10);
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
        int i11 = this.W;
        if (i11 != 3 && i11 != 4 && i11 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V1 = ofFloat;
            ofFloat.addUpdateListener(new i11(this, 0));
            this.V1.addListener(new ms0(this, 8));
            j11 j11Var = new j11(this, 0);
            sg.e0.f48333f = true;
            sg.e0.e = true;
            sg.e0.f48334g = false;
            if (sg.e0.d) {
                sg.e0.d = false;
            }
            sg.e0.f48332c = j11Var;
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14729j1, 512);
            this.X1.d();
            this.V1.setDuration(800L);
            e21Var.setLayerType(2, null);
            this.f37301f0.setLayerType(2, null);
            this.f37298e0.setLayerType(2, null);
            this.f37291b0.setLayerType(2, null);
            org.telegram.ui.Components.bn bnVar = this.f37316n0;
            if (bnVar != null) {
                bnVar.setLayerType(2, null);
            }
            View view = this.m0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f37296d0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.P = z10;
    }

    public void setBackgroundDelegate(h21 h21Var) {
        this.U = h21Var;
    }

    public void setDrawBackground(boolean z10) {
        this.Q0 = z10;
        this.f37288a0.setClipToOutline(z10);
        kg.f0 f0Var = this.f37291b0;
        if (!z10) {
            f0Var.setVisibility(8);
        } else {
            f0Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (!z10) {
                org.telegram.messenger.i0.d0(this.f37305h0, new ag.z0(20));
                for (int i10 = 0; i10 < this.f37296d0.f33184b.getChildCount(); i10++) {
                    View childAt = this.f37296d0.f33184b.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f37296d0.f33184b.invalidate();
            }
        }
    }

    public void setExpireDateHint(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.O0 = true;
        this.P0 = Integer.valueOf(i10);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.R = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.N = drawable;
        q21 q21Var = this.O;
        if (q21Var != null) {
            q21Var.h.w0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f37306h1 = z10;
    }

    public void setOnLongPressedListener(e31 e31Var) {
        this.H = e31Var;
    }

    public void setRecentReactions(List<sg.o0> list) {
        this.R0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i10) {
        this.Z1 = Integer.valueOf(i10);
    }

    public void setSelected(Long l4) {
        HashSet hashSet = this.K;
        hashSet.clear();
        hashSet.add(l4);
        e21 e21Var = this.f37305h0;
        if (e21Var != null) {
            for (int i10 = 0; i10 < e21Var.getChildCount(); i10++) {
                if (e21Var.getChildAt(i10) instanceof q21) {
                    q21 q21Var = (q21) e21Var.getChildAt(i10);
                    org.telegram.ui.Components.o5 o5Var = q21Var.e;
                    if (o5Var != null) {
                        q21Var.d(hashSet.contains(Long.valueOf(o5Var.getDocumentId())), true);
                    } else {
                        q21Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            e21Var.invalidate();
        }
    }

    public void setSelectedReaction(sg.o0 o0Var) {
        this.J.clear();
        this.J.add(o0Var);
        e21 e21Var = this.f37305h0;
        if (e21Var != null) {
            for (int i10 = 0; i10 < e21Var.getChildCount(); i10++) {
                if (e21Var.getChildAt(i10) instanceof q21) {
                    q21 q21Var = (q21) e21Var.getChildAt(i10);
                    q21Var.d(this.J.contains(q21Var.f40671y), true);
                }
            }
            e21Var.invalidate();
        }
        t11 t11Var = this.f37307i0;
        if (t11Var != null) {
            for (int i11 = 0; i11 < t11Var.getChildCount(); i11++) {
                if (t11Var.getChildAt(i11) instanceof q21) {
                    q21 q21Var2 = (q21) t11Var.getChildAt(i11);
                    q21Var2.d(this.J.contains(q21Var2.f40671y), true);
                }
            }
            t11Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<sg.o0> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((sg.o0) arrayList.get(i10)).f48446g != 0) {
                hashSet2.add(Long.valueOf(((sg.o0) arrayList.get(i10)).f48446g));
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
            if (!this.l1 || (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21260v6, this.Z0)) == this.f37302f1) {
                return;
            }
            this.f37302f1 = w02;
            this.M.setColor(i0.b.o(w02, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f37302f1, PorterDuff.Mode.SRC_IN);
            this.f37312k1 = porterDuffColorFilter;
            org.telegram.ui.Components.f5 f5Var = this.W0;
            if (f5Var != null) {
                f5Var.setColorFilter(porterDuffColorFilter);
            }
            e21 e21Var = this.f37305h0;
            if (e21Var != null) {
                e21Var.invalidate();
            }
            t11 t11Var = this.f37307i0;
            if (t11Var != null) {
                t11Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j10;
        j11 j11Var = this.J1;
        if (j11Var != null) {
            org.telegram.messenger.i0.r(j11Var);
            this.J1 = null;
        }
        ig.k0 k0Var = this.K1;
        if (k0Var != null) {
            org.telegram.messenger.i0.r(k0Var);
            this.K1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        r21 r21Var = this.f37322q0;
        y11 y11Var = this.f37301f0;
        if (isEmpty) {
            this.f37344y1 = false;
            this.f37346z1 = false;
            z(false, z10);
            if (y11Var != null) {
                y11Var.d(true);
                y11.a(y11Var, false);
            }
            r21Var.E(true);
            this.A1 = null;
        } else {
            boolean z12 = this.f37344y1;
            boolean z13 = !z12;
            this.f37344y1 = true;
            this.f37346z1 = false;
            if (y11Var != null) {
                y11Var.f43535f.b(2);
            }
            if (!z12) {
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
                r21Var.E(false);
            } else if (!str.equals(this.A1)) {
                j11 j11Var2 = new j11(this, 1);
                this.J1 = j11Var2;
                org.telegram.messenger.i0.h3(j11Var2, 120L);
            }
            this.A1 = str;
            String[] G0 = org.telegram.messenger.i0.G0();
            if (!Arrays.equals(G0, f37284b2)) {
                org.telegram.messenger.vi.b0(this.V).M(G0, false);
            }
            f37284b2 = G0;
            ig.k0 k0Var2 = new ig.k0(this, str, z10, z13, G0, 4);
            this.K1 = k0Var2;
            if (z11) {
                j10 = 425;
            } else {
                j10 = 0;
            }
            org.telegram.messenger.i0.h3(k0Var2, j10);
            if (y11Var != null) {
                y11Var.f43535f.b(2);
                y11.a(y11Var, z10);
            }
        }
        C();
    }

    public final void w(float f7) {
        ValueAnimator valueAnimator = this.f37308i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37308i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37330t0.getAlpha(), f7 * 0.25f);
        this.f37308i1 = ofFloat;
        ofFloat.addUpdateListener(new i11(this, 2));
        this.f37308i1.setDuration(200L);
        this.f37308i1.setInterpolator(org.telegram.ui.Components.gr.f26523f);
        this.f37308i1.start();
    }

    public final void x(Long l4, boolean z10) {
        boolean z11;
        HashSet hashSet = this.K;
        if (!hashSet.contains(l4)) {
            hashSet.add(l4);
            z11 = true;
        } else {
            hashSet.remove(l4);
            z11 = false;
        }
        e21 e21Var = this.f37305h0;
        if (e21Var != null) {
            for (int i10 = 0; i10 < e21Var.getChildCount(); i10++) {
                if (e21Var.getChildAt(i10) instanceof q21) {
                    q21 q21Var = (q21) e21Var.getChildAt(i10);
                    org.telegram.ui.Components.o5 o5Var = q21Var.e;
                    if (o5Var != null && o5Var.getDocumentId() == l4.longValue()) {
                        q21Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = q21Var.d;
                        if (document != null && document.f19800id == l4.longValue()) {
                            q21Var.e(z11, z10);
                        }
                    }
                }
            }
            e21Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.d5 d5Var, View view) {
        int i10;
        Integer num;
        if (d5Var != null && (num = d5Var.F) != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        this.f37317n1 = i10;
        this.f37319o1 = d5Var;
        this.f37323q1 = view;
        if (this.I && d5Var != null) {
            d5Var.f25373n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f7;
        if (this.G1 == z10) {
            return;
        }
        this.G1 = z10;
        e21 e21Var = this.f37305h0;
        e21Var.setVisibility(0);
        t11 t11Var = this.f37307i0;
        t11Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new m11(this, z10, 0));
        this.F1.addListener(new a21(this, z10, 0));
        this.F1.setDuration(320L);
        this.F1.setInterpolator(org.telegram.ui.Components.gr.h);
        this.F1.start();
        ViewPropertyAnimator animate = ((View) e21Var.getParent()).animate();
        if (this.G1 && z11) {
            f7 = -org.telegram.messenger.i0.L(36.0f);
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.a30.m(animate.translationY(f7).setUpdateListener(new i11(this, 1)), org.telegram.ui.Components.gr.f26523f, 160L);
        if (this.G1 && z11) {
            t11Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(54.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(38.0f));
        } else {
            t11Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(54.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(38.0f));
        }
        h();
    }

    public g31(org.telegram.ui.ActionBar.k2 k2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, int i11) {
        this(k2Var, context, z10, num, i10, z11, p6Var, i11, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21260v6, p6Var));
    }

    public g31(org.telegram.ui.ActionBar.k2 k2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12) {
        super(context);
        int i13;
        int i14;
        float f7;
        t11 t11Var;
        boolean z12;
        Integer num2;
        boolean z13;
        Integer num3;
        boolean z14;
        float f10;
        int i15 = i10;
        int i16 = i12;
        this.J = new HashSet();
        this.K = new HashSet();
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.S = new ArrayList();
        this.V = org.telegram.messenger.e20.f15506s0;
        this.f37294c0 = new org.telegram.ui.Components.mv[2];
        this.f37334v0 = new ArrayList();
        this.f37337w0 = new SparseIntArray();
        this.f37340x0 = new SparseIntArray();
        this.f37343y0 = new SparseIntArray();
        this.f37345z0 = new SparseIntArray();
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
        this.f37306h1 = true;
        this.f37314m1 = 1.0f;
        this.f37326r1 = 1.0f;
        this.f37333u1 = new OvershootInterpolator(2.0f);
        this.f37338w1 = false;
        this.f37341x1 = false;
        this.f37344y1 = false;
        this.f37346z1 = false;
        this.G1 = false;
        this.H1 = false;
        this.L1 = false;
        this.M1 = false;
        this.O1 = -1;
        this.P1 = -1;
        this.Q1 = -1L;
        this.S1 = new j11(this, 3);
        this.T1 = new j11(this, 4);
        this.X1 = new e2.f((int[]) null);
        this.Y1 = new Paint();
        this.Z0 = p6Var;
        this.W = i15;
        this.N0 = z10;
        this.f37295c1 = k2Var;
        SharedPreferences d12 = org.telegram.messenger.wp.d1();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.O0 = d12.getInt(sb2.toString(), 0) < 3;
        this.f37302f1 = i16;
        this.l1 = i16 == org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21260v6, p6Var);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var));
        paint2.setColor(i0.b.o(i16, 30));
        this.f37312k1 = new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN);
        this.Y0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(w7.u.b(num.intValue(), org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(292.0f)));
        boolean z15 = valueOf != null && valueOf.intValue() > org.telegram.messenger.i0.L(170.0f);
        setFocusableInTouchMode(true);
        if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10 || i15 == 2 || i15 == 5 || i15 == 7) {
            this.f37297d1 = i11;
            setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
            setOnTouchListener(new d0(this, 6));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.m0 = view;
            Drawable mutate = getResources().getDrawable(2131232721).mutate();
            org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.G8, p6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, w7.b6.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / org.telegram.messenger.i0.f16171p) + (z15 ? -12 : 4), n() ? 0 : this.f37297d1, 0.0f, n() ? this.f37297d1 : 0));
        }
        kg.f0 f0Var = new kg.f0(this, context, p6Var, 14);
        this.f37291b0 = f0Var;
        boolean z16 = i15 == 3 || i15 == 4;
        Integer num4 = valueOf;
        b21 b21Var = new b21(this, context, z16, z16, p6Var, num4);
        Integer num5 = num4;
        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
        this.f37288a0 = b21Var;
        if (!z16) {
            b21Var.setOutlineProvider(new c21(this, num5));
            b21Var.setClipToOutline(true);
            if (z16) {
                b21Var.setElevation(2.0f);
            }
        }
        if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10 || i15 == 2 || i15 == 5 || i15 == 15) {
            b21Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        }
        b21Var.addView(f0Var, w7.b6.c(-1.0f, -1));
        addView(b21Var, w7.b6.d(-1, -1.0f, 119, 0.0f, (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 2 || i15 == 7) ? this.f37297d1 + 6 : 0.0f, 0.0f, n() ? this.f37297d1 + 6 : 0.0f));
        if (num5 != null) {
            org.telegram.ui.Components.bn bnVar = new org.telegram.ui.Components.bn(context, 20);
            this.f37316n0 = bnVar;
            Drawable drawable = getResources().getDrawable(2131232722);
            org.telegram.ui.ActionBar.a7.y(this, drawable, org.telegram.ui.ActionBar.t6.G8, p6Var2, PorterDuff.Mode.MULTIPLY);
            bnVar.setBackground(drawable);
            i14 = 3;
            int i17 = (n() ? 80 : 48) | 3;
            float intValue = (num5.intValue() / org.telegram.messenger.i0.f16171p) + (z15 ? -25 : 10);
            float f11 = n() ? 0.0f : this.f37297d1 + 5;
            if (n()) {
                i13 = 14;
                f10 = this.f37297d1 + 14;
            } else {
                i13 = 14;
                f10 = 0.0f;
            }
            addView(bnVar, w7.b6.d(17, 9.0f, i17, intValue, f11, 0.0f, f10));
        } else {
            i13 = 14;
            i14 = 3;
        }
        boolean z17 = (k2Var == null || i15 == i14 || i15 == 6 || i15 == 5 || i15 == 7 || i15 == 4 || i15 == 9 || i15 == 10 || !z11) ? false : true;
        int i18 = 0;
        while (true) {
            if (i18 >= 2) {
                break;
            }
            Integer num6 = num5;
            if (i15 != 4) {
                num2 = num6;
                z13 = true;
            } else {
                num2 = num6;
                z13 = false;
            }
            if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10) {
                num3 = num2;
                z14 = true;
            } else {
                num3 = num2;
                z14 = false;
            }
            Integer num7 = num3;
            int i19 = i18;
            org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
            int i20 = i15;
            d21 d21Var = new d21(this, context, p6Var3, z13, z14, i20, z17 ? new y01(1, this, k2Var) : null, i16, i10);
            org.telegram.ui.Components.iv ivVar = d21Var.D;
            if (ivVar != null) {
                ivVar.setOnLongClickListener(new s(this, 7));
            }
            d21Var.U = false;
            if (i20 == 4) {
                d21Var.setAnimatedEmojiCacheType(13);
            } else {
                d21Var.setAnimatedEmojiCacheType((i20 == 0 || i20 == 12 || i20 == 2) ? 6 : 5);
            }
            d21Var.O = num7 == null;
            d21Var.setPaddingLeft(i20 == 6 ? 10.0f : 5.0f);
            if (i20 != 14 && i20 != 8 && i20 != 13) {
                this.f37288a0.addView(d21Var, w7.b6.c(36.0f, -1));
            }
            this.f37294c0[i19] = d21Var;
            i15 = i20;
            i13 = 14;
            i16 = i12;
            p6Var2 = p6Var3;
            i18 = i19 + 1;
            num5 = num7;
        }
        Integer num8 = num5;
        int i21 = i13;
        org.telegram.ui.ActionBar.p6 p6Var4 = p6Var2;
        int i22 = i15;
        org.telegram.ui.Components.mv[] mvVarArr = this.f37294c0;
        this.f37296d0 = mvVarArr[0];
        mvVarArr[1].setVisibility(8);
        z11 z11Var = new z11(context, num8, 1);
        this.f37298e0 = z11Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, z11Var, p6Var4);
        if (i22 == i21 || i22 == 8 || i22 == 13) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
            this.f37288a0.addView(z11Var, w7.b6.d(-1, 1.0f / org.telegram.messenger.i0.f16171p, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        org.telegram.messenger.i0.Y3(z11Var, true, f7, true, false);
        e21 e21Var = new e21(this, context, i22);
        this.f37305h0 = e21Var;
        ?? jVar = new s4.j();
        this.f37299e1 = jVar;
        float f12 = f7;
        jVar.f47978c = 220L;
        jVar.e = 260L;
        jVar.f47979f = 160L;
        jVar.f47980g = 160L;
        jVar.f47938m = false;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        jVar.f47981i = grVar;
        jVar.C = false;
        e21Var.setItemAnimator(jVar);
        e21Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(38.0f));
        g21 g21Var = new g21(this);
        this.f37320p0 = g21Var;
        e21Var.setAdapter(g21Var);
        u11 u11Var = new u11(this, 1);
        this.f37325r0 = u11Var;
        e21Var.setLayoutManager(u11Var);
        u11Var.O = new s11(this, 0);
        bg0 bg0Var = new bg0(context, 8);
        this.f37303g0 = bg0Var;
        fg.i iVar = new fg.i(this, context);
        this.f37311k0 = iVar;
        iVar.addView(e21Var, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        bg0Var.addView(iVar, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        t11 t11Var2 = new t11(this, context);
        this.f37307i0 = t11Var2;
        if (t11Var2.getItemAnimator() != null) {
            t11Var = t11Var2;
            t11Var2.getItemAnimator().n(180L);
            t11Var.getItemAnimator().f47981i = grVar;
        } else {
            t11Var = t11Var2;
        }
        TextView textView = new TextView(context);
        if (i22 == 4) {
            textView.setText(org.telegram.messenger.dd.L0(2131748229, null));
        } else if (i22 == 0 || i22 == 13 || i22 == 12 || i22 == 11 || i22 == 9 || i22 == 10) {
            textView.setText(org.telegram.messenger.dd.L0(2131748230, null));
        } else if (i22 == 1 || i22 == 2) {
            textView.setText(org.telegram.messenger.dd.L0(2131748190, null));
        } else if (i22 == i21) {
            textView.setText(org.telegram.messenger.dd.L0(2131748231, null));
        } else {
            textView.setText(org.telegram.messenger.dd.L0(2131748220, null));
        }
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Af, p6Var4);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f37313l0 = g9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37309j0 = frameLayout;
        frameLayout.addView(g9Var, w7.b6.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        bg0Var.addView(frameLayout, w7.b6.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        t11 t11Var3 = t11Var;
        t11Var3.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(54.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(38.0f));
        r21 r21Var = new r21(this);
        this.f37322q0 = r21Var;
        t11Var3.setAdapter(r21Var);
        u11 u11Var2 = new u11(this, 0);
        t11Var3.setLayoutManager(u11Var2);
        u11Var2.O = new s11(this, 1);
        t11Var3.setVisibility(8);
        bg0Var.addView(t11Var3, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f37288a0.addView(bg0Var, w7.b6.d(-1, -1.0f, 48, 0.0f, (i22 == 8 || i22 == 13 || i22 == 14) ? 0.0f : (f12 / org.telegram.messenger.i0.f16171p) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.wj0 wj0Var = new org.telegram.ui.Components.wj0(e21Var, u11Var);
        this.f37328s0 = wj0Var;
        wj0Var.f32271i = new v11(this, 0);
        wj0Var.h = new k11(this);
        x11 x11Var = new x11(this, i22, context, p6Var4, num);
        e21Var.p1(x11Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        t11Var3.p1(x11Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        org.telegram.ui.Components.cm0 cm0Var = new org.telegram.ui.Components.cm0(this, i22, 2);
        e21Var.setOnItemClickListener(cm0Var);
        t11Var3.setOnItemClickListener(cm0Var);
        y11 y11Var = new y11(this, context, z11);
        this.f37301f0 = y11Var;
        y11Var.setTranslationY(-org.telegram.messenger.i0.L(52.0f));
        y11Var.setVisibility(4);
        bg0Var.addView(y11Var, w7.b6.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        z11 z11Var2 = new z11(context, num8, 0);
        Drawable drawable2 = getResources().getDrawable(2131231229);
        int i23 = org.telegram.ui.ActionBar.t6.G8;
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.8f, i23);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.l(z11Var2, drawable2, L.f21453a, -1, 2, L.d, p6Var, mode);
        z11Var2.setBackground(drawable2);
        z11Var2.setAlpha(0.0f);
        this.f37288a0.addView(z11Var2, w7.b6.d(-1, 20.0f, 55, 0.0f, (f12 / org.telegram.messenger.i0.f16171p) + 36.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f37318o0 = view2;
        Drawable drawable3 = getResources().getDrawable(2131231226);
        org.telegram.ui.ActionBar.a7.y(this, drawable3, i23, p6Var, mode);
        if (i22 == 14) {
            view2.setBackground(drawable3);
        }
        view2.setAlpha(0.0f);
        this.f37288a0.addView(view2, w7.b6.e(-1, 20, 87));
        View view3 = new View(context);
        this.f37330t0 = view3;
        view3.setAlpha(0.0f);
        view3.setBackgroundColor(-16777216);
        this.f37288a0.addView(view3, w7.b6.c(-1.0f, -1));
        int i24 = this.V;
        org.telegram.messenger.vi.b0(i24);
        org.telegram.messenger.vi.b0(i24).B(5);
        if (i22 == 14) {
            org.telegram.messenger.wp.r1(this.V).E0();
        } else if (i22 == 1 || i22 == 11 || i22 == 2 || i22 == 6 || i22 == 13) {
            org.telegram.messenger.vi.b0(i24).A();
        } else if (i22 == 9 || i22 == 10) {
            if (org.telegram.messenger.wp.r1(i24).f7.getBoolean("resetemojipacks", true)) {
                org.telegram.messenger.vi.b0(i24).a1(5, false, false);
                org.telegram.messenger.wp.r1(i24).f7.edit().putBoolean("resetemojipacks", false).commit();
            }
            org.telegram.messenger.vi.b0(i24).L(2, false);
            org.telegram.messenger.vi.b0(i24).Y0();
            org.telegram.messenger.vi.b0(i24).m0(new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
        } else if (i22 == 0 || i22 == 12) {
            org.telegram.messenger.vi.b0(i24).L(0, true);
            org.telegram.messenger.vi.b0(i24).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        } else if (i22 == 3) {
            org.telegram.messenger.vi.b0(i24).v();
        } else if (i22 == 4) {
            org.telegram.messenger.vi.b0(i24).V0(0, false, true, false);
            org.telegram.messenger.vi.b0(i24).B(0);
        }
        this.V0.E0(7);
        int i25 = this.W;
        if (i25 == 3 || i25 == 4 || i25 == 6) {
            z12 = true;
        } else {
            com.google.android.gms.internal.cast.c0 c0Var = org.telegram.messenger.ic.D().f16258p;
            if (((CountDownLatch) c0Var.f4586c) == null) {
                z12 = true;
                c0Var.f4586c = new CountDownLatch(1);
            } else {
                z12 = true;
            }
            sg.e0.f48334g = z12;
        }
        B(z12, false, z12);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.J.add(sg.o0.b(str));
        }
        e21 e21Var = this.f37305h0;
        if (e21Var != null) {
            for (int i11 = 0; i11 < e21Var.getChildCount(); i11++) {
                if (e21Var.getChildAt(i11) instanceof q21) {
                    q21 q21Var = (q21) e21Var.getChildAt(i11);
                    q21Var.d(this.J.contains(q21Var.f40671y), true);
                }
            }
            e21Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(f31 f31Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void m() {
    }

    public void q() {
    }

    public void r(q21 q21Var, sg.o0 o0Var) {
    }
}
