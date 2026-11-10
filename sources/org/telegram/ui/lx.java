package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public class lx implements org.telegram.messenger.ls {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public dh D;
    public ix E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.pj0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final cn f47710a;
    public int f47711b;
    public TLRPC.TL_messages_stickerSet f47712c;
    public boolean f47715n;
    public String f47718w;
    public boolean d = false;
    public final HashMap f47713e = new HashMap();
    public final HashMap f47714f = new HashMap();
    public final Random h = new Random();
    public int f47716r = -1;
    public long f47717s = 0;
    public final ArrayList f47719x = new ArrayList();
    public final ArrayList f47720y = new ArrayList();
    public final ArrayList F = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        M = hashSet;
        hashSet.add("0⃣");
        hashSet.add("1⃣");
        hashSet.add("2⃣");
        hashSet.add("3⃣");
        hashSet.add("4⃣");
        hashSet.add("5⃣");
        hashSet.add("6⃣");
        hashSet.add("7⃣");
        hashSet.add("8⃣");
        hashSet.add("9⃣");
    }

    public lx(int i7, FrameLayout frameLayout) {
        this.G = frameLayout;
        this.f47711b = i7;
    }

    public static boolean a(org.telegram.ui.Cells.q1 q1Var, float f10, int i7) {
        float s5 = q1Var.getPhotoImage().s() + q1Var.getY();
        if (s5 > f10 && s5 < i7) {
            return true;
        }
        return false;
    }

    public static int f() {
        float min;
        float f10;
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
            f10 = 0.4f;
        } else {
            Point point = org.telegram.messenger.g0.f22567q;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        return (int) ((((int) (min * f10)) * 2.0f) / org.telegram.messenger.g0.f22566p);
    }

    public static java.lang.String p(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lx.p(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(this.f47711b).p0("EmojiAnimations");
            this.f47712c = p02;
            if (p02 == null) {
                this.f47712c = org.telegram.messenger.ui.b0(this.f47711b).n0("EmojiAnimations");
            }
            if (this.f47712c == null) {
                org.telegram.messenger.ui.b0(this.f47711b).c1("EmojiAnimations", false, true);
            }
            if (this.f47712c != null) {
                HashMap hashMap = new HashMap();
                for (int i7 = 0; i7 < this.f47712c.documents.size(); i7++) {
                    hashMap.put(Long.valueOf(this.f47712c.documents.get(i7).f26966id), this.f47712c.documents.get(i7));
                }
                for (int i10 = 0; i10 < this.f47712c.packs.size(); i10++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f47712c.packs.get(i10);
                    if (!M.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = L;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.f47713e;
                        hashMap2.put(str2, arrayList);
                        for (int i11 = 0; i11 < tL_stickerPack.documents.size(); i11++) {
                            arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i11)));
                        }
                        if (tL_stickerPack.emoticon.equals("❤")) {
                            String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                            for (int i12 = 0; i12 < 8; i12++) {
                                String str3 = strArr[i12];
                                hashSet.add(str3);
                                hashMap2.put(str3, arrayList);
                            }
                        }
                    }
                }
                this.d = true;
            }
        }
    }

    public final void c() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i7 < arrayList.size()) {
                ((kx) arrayList.get(i7)).f47455r.R();
                if (((kx) arrayList.get(i7)).f47447j != null) {
                    ((kx) arrayList.get(i7)).f47447j.d(this.G);
                }
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i7, TLRPC.Document document, org.telegram.messenger.ij ijVar, int i10, boolean z9, boolean z10, float f10, float f11, boolean z11) {
        boolean z12;
        boolean z13;
        Random random;
        long j3;
        TLRPC.Document document2;
        int intValue;
        Boolean bool;
        TLRPC.VideoSize F1;
        boolean z14;
        String str2;
        int intValue2;
        dh dhVar;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i11 = i10;
        if (ijVar != null && ijVar.W3()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (ijVar != null && ijVar.M0() != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12 || L.contains(str)) {
            ArrayList arrayList = (ArrayList) this.f47713e.get(str);
            if (z13 || ((arrayList != null && !arrayList.isEmpty()) || z12)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i12 < arrayList2.size()) {
                        if (((kx) arrayList2.get(i12)).f47453p == i7) {
                            i13++;
                            if (!z13 && (((kx) arrayList2.get(i12)).f47455r.B() == null || ((kx) arrayList2.get(i12)).f47455r.B().y())) {
                                return false;
                            }
                        }
                        if (((kx) arrayList2.get(i12)).f47454q != null && document != null) {
                            if (((kx) arrayList2.get(i12)).f47454q.f26966id == document.f26966id) {
                                i14++;
                            }
                        }
                        i12++;
                    } else if (z9 && z12 && i13 > 0) {
                        org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.f32195w;
                        if (bcVar != null && bcVar.f32197b == ijVar.e1()) {
                            return false;
                        }
                        TLRPC.InputStickerSet j12 = org.telegram.messenger.ij.j1(ijVar.f23266k);
                        if (j12.short_name != null) {
                            tL_messages_stickerSet = org.telegram.messenger.ui.b0(this.f47711b).p0(j12.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = org.telegram.messenger.ui.b0(this.f47711b).o0(j12.f26980id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = j12;
                            ConnectionsManager.getInstance(this.f47711b).sendRequest(tL_messages_getStickerSet, new ld(24, this, ijVar));
                            return false;
                        }
                        o(tL_messages_stickerSet, ijVar);
                        return false;
                    } else if (i13 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z13) {
                            TLRPC.TL_availableEffect M0 = ijVar.M0();
                            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.qp.s1(this.f47711b).E0();
                            if (E0 == null) {
                                return false;
                            }
                            j3 = 0;
                            long j10 = M0.effect_animation_id;
                            if (j10 == 0) {
                                j10 = M0.effect_sticker_id;
                            }
                            random = random2;
                            int i15 = 0;
                            while (true) {
                                if (i15 < E0.documents.size()) {
                                    document2 = E0.documents.get(i15);
                                    long j11 = j10;
                                    if (document2 != null && document2.f26966id == j11) {
                                        break;
                                    }
                                    i15++;
                                    j10 = j11;
                                } else {
                                    document2 = null;
                                    break;
                                }
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (M0.effect_sticker_id != 0) {
                                F1 = org.telegram.messenger.ij.F1(document2);
                                if (F1 != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            }
                            F1 = null;
                        } else {
                            random = random2;
                            j3 = 0;
                            if (z12) {
                                document2 = ijVar.F0();
                                F1 = org.telegram.messenger.ij.F1(ijVar.F0());
                            } else {
                                if (ijVar != null && ijVar.F2()) {
                                    if (i11 >= 0 && i11 <= arrayList.size() - 1) {
                                        intValue = i11;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                                            if (document3 != null) {
                                                HashMap hashMap = this.K;
                                                if (hashMap != null) {
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f26966id));
                                                } else {
                                                    bool = null;
                                                }
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i16));
                                                }
                                            }
                                        }
                                        if (arrayList3.isEmpty()) {
                                            intValue = Math.abs(random.nextInt()) % arrayList.size();
                                        } else {
                                            intValue = ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                        }
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(intValue);
                                    i11 = intValue;
                                } else {
                                    if (i11 < 0 || i11 > arrayList.size() - 1) {
                                        i11 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i11);
                                }
                                F1 = null;
                            }
                        }
                        if (document2 == null && F1 == null) {
                            return false;
                        }
                        kx kxVar = new kx();
                        kxVar.h = z12;
                        kxVar.f47446i = z13;
                        if (!z13) {
                            kxVar.f47444f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            kxVar.f47445g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        kxVar.f47453p = i7;
                        kxVar.f47454q = document2;
                        kxVar.f47450m = z11;
                        ImageReceiver imageReceiver = kxVar.f47455r;
                        imageReceiver.f21225t0 = true;
                        imageReceiver.f21223s0 = z9;
                        if (org.telegram.messenger.iz.o() > 1) {
                            boolean z15 = org.telegram.messenger.r2.f25216a;
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        int i17 = i11;
                        HashMap hashMap2 = this.f47714f;
                        boolean z16 = z12;
                        if (F1 == null) {
                            int f12 = f();
                            boolean z17 = z14;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f26966id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i18 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f26966id), Integer.valueOf(i18));
                            org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i18);
                            sb2.append("_");
                            imageReceiver.f21230v1 = a8.p0.n(kxVar.f47453p, "_", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f12);
                            sb3.append("_");
                            sb3.append(f12);
                            if (!z17) {
                                str3 = "";
                            } else {
                                str3 = "_pcache";
                            }
                            sb3.append(str3);
                            kxVar.f47455r.q0(b10, sb3.toString(), null, "tgs", this.f47712c, 1);
                            imageReceiver.f21200g1 = new jx(this, kxVar, z9, ijVar);
                            if (imageReceiver.B() != null) {
                                imageReceiver.B().N(0, false, true);
                            }
                        } else {
                            boolean z18 = z14;
                            int f13 = f();
                            if (i14 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f26966id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f26966id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(intValue2);
                                sb4.append("_");
                                imageReceiver.f21230v1 = a8.p0.n(kxVar.f47453p, "_", sb4);
                            }
                            kxVar.f47454q = document2;
                            org.telegram.messenger.hc d = org.telegram.messenger.hc.d(F1, document2);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(f13);
                            sb5.append("_");
                            sb5.append(f13);
                            if (!z18) {
                                str2 = "";
                            } else {
                                str2 = "_pcache";
                            }
                            sb5.append(str2);
                            kxVar.f47455r.q0(d, sb5.toString(), null, "tgs", this.f47712c, 1);
                        }
                        imageReceiver.E0(Integer.MAX_VALUE);
                        imageReceiver.W(0);
                        if (imageReceiver.B() != null) {
                            if (kxVar.h) {
                                imageReceiver.B().N(0, false, true);
                            }
                            imageReceiver.B().start();
                        }
                        arrayList2.add(kxVar);
                        imageReceiver.P();
                        FrameLayout frameLayout = this.G;
                        imageReceiver.H0(frameLayout);
                        frameLayout.invalidate();
                        if (z9 && !z16 && org.telegram.messenger.p10.i(this.f47711b).f24493n != this.I) {
                            int i19 = this.f47716r;
                            if (i19 != 0 && i19 != i7 && (dhVar = this.D) != null) {
                                org.telegram.messenger.g0.r(dhVar);
                                this.D.run();
                            }
                            this.f47716r = i7;
                            this.f47718w = str;
                            int i20 = (this.f47717s > j3 ? 1 : (this.f47717s == j3 ? 0 : -1));
                            ArrayList arrayList4 = this.f47720y;
                            ArrayList arrayList5 = this.f47719x;
                            if (i20 == 0) {
                                this.f47717s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i17));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f47717s));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            dh dhVar2 = this.D;
                            if (dhVar2 != null) {
                                org.telegram.messenger.g0.r(dhVar2);
                                this.D = null;
                            }
                            dh dhVar3 = new dh(this, 27);
                            this.D = dhVar3;
                            org.telegram.messenger.g0.i3(dhVar3, 500L);
                        }
                        if (z10) {
                            org.telegram.messenger.qp.s1(this.f47711b).C4(11, 0, this.I, this.J, str);
                            return true;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Integer E1;
        if (i7 == org.telegram.messenger.qs.f25115y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i11 = org.telegram.messenger.qs.T4;
        long j3 = this.I;
        if (i7 == i11) {
            if (this.f47710a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j3 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i12 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i13);
                                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.gb0(this, i12, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25067r && (E1 = org.telegram.messenger.qp.s1(this.f47711b).E1(j3, this.J)) != null && E1.intValue() == 5) {
            ix ixVar = this.E;
            if (ixVar != null) {
                org.telegram.messenger.g0.r(ixVar);
            }
            this.E = null;
        }
    }

    public final void e(Canvas canvas) {
        float f10;
        float f11;
        boolean z9;
        boolean z10;
        float f12;
        boolean z11;
        boolean z12;
        ImageReceiver imageReceiver;
        org.telegram.messenger.ij ijVar;
        float f13;
        if (!this.F.isEmpty()) {
            int i7 = 0;
            while (i7 < this.F.size()) {
                kx kxVar = (kx) this.F.get(i7);
                if (this.f47710a != null) {
                    kxVar.f47442c = false;
                    int i10 = 0;
                    while (true) {
                        if (i10 < this.H.getChildCount()) {
                            View childAt = this.H.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                ijVar = q1Var.getMessageObject();
                                imageReceiver = q1Var.getPhotoImage();
                            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                                ijVar = t0Var.getMessageObject();
                                imageReceiver = t0Var.getPhotoImage();
                            } else {
                                imageReceiver = null;
                                ijVar = null;
                            }
                            if (ijVar != null && ijVar.e1() == kxVar.f47453p) {
                                kxVar.f47442c = true;
                                float x10 = childAt.getX() + this.H.getX();
                                float y10 = childAt.getY() + this.H.getY();
                                f12 = childAt.getY();
                                f10 = 3.0f;
                                float f14 = imageReceiver.M0;
                                kxVar.d = f14;
                                f11 = 2.0f;
                                kxVar.f47443e = imageReceiver.N0;
                                if (kxVar.f47446i && (childAt instanceof org.telegram.ui.Cells.q1)) {
                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                    float f15 = (f() * org.telegram.messenger.g0.f22566p) / 1.3f;
                                    float f16 = f15 / 3.0f;
                                    kxVar.d = f16;
                                    kxVar.f47443e = f16;
                                    float f17 = f15 / 2.0f;
                                    kxVar.f47440a = Utilities.i((q1Var2.getTimeX() + x10) - f17, org.telegram.messenger.g0.f22567q.x - f15, 0.0f);
                                    kxVar.f47441b = (q1Var2.getTimeY() + y10) - f17;
                                } else if (kxVar.h) {
                                    kxVar.f47440a = x10 + imageReceiver.K0;
                                    kxVar.f47441b = y10 + imageReceiver.L0;
                                } else {
                                    float f18 = x10 + imageReceiver.K0;
                                    float f19 = y10 + imageReceiver.L0;
                                    if (kxVar.f47450m) {
                                        f13 = ((-f14) * 2.0f) + org.telegram.messenger.g0.L(24.0f) + f18;
                                    } else {
                                        f13 = (-org.telegram.messenger.g0.L(24.0f)) + f18;
                                    }
                                    kxVar.f47440a = f13;
                                    kxVar.f47441b = f19 - imageReceiver.M0;
                                }
                            } else {
                                i10++;
                            }
                        } else {
                            f10 = 3.0f;
                            f11 = 2.0f;
                            f12 = 0.0f;
                            break;
                        }
                    }
                    if (!kxVar.f47442c || kxVar.f47443e + f12 < this.f47710a.N9 || f12 > this.H.getMeasuredHeight() - this.f47710a.Wa) {
                        kxVar.f47451n = true;
                    }
                    if (kxVar.h) {
                        float f20 = kxVar.f47443e / f11;
                        if (this.H.getMeasuredHeight() - f12 <= f20) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((f12 - this.f47710a.N9) + f20 <= 0.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 || z12) {
                            kxVar.f47451n = true;
                        }
                    }
                    if (kxVar.f47451n) {
                        float f21 = kxVar.f47452o;
                        if (f21 != 1.0f) {
                            float i11 = Utilities.i(f21 + 0.10666667f, 1.0f, 0.0f);
                            kxVar.f47452o = i11;
                            kxVar.f47455r.setAlpha(1.0f - i11);
                            this.f47710a.l1.invalidate();
                        }
                    }
                } else {
                    f10 = 3.0f;
                    f11 = 2.0f;
                    g(kxVar);
                }
                if (!kxVar.f47449l && kxVar.f47451n) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    if (kxVar.h && !kxVar.f47446i) {
                        float f22 = kxVar.f47443e;
                        float f23 = 1.49926f * f22;
                        float f24 = 0.0546875f * f23;
                        float f25 = (((f22 / f11) + kxVar.f47441b) - (f23 / f11)) - (0.00279f * f23);
                        if (!kxVar.f47450m) {
                            kxVar.f47455r.y0(kxVar.f47440a - f24, f25, f23, f23);
                        } else {
                            kxVar.f47455r.y0(((kxVar.f47440a + kxVar.d) - f23) + f24, f25, f23, f23);
                        }
                        if (!kxVar.f47450m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, kxVar.f47455r.r(), kxVar.f47455r.s());
                            kxVar.f47455r.h(canvas, null);
                            canvas.restore();
                        } else {
                            kxVar.f47455r.h(canvas, null);
                        }
                    } else {
                        ch.d dVar = kxVar.f47447j;
                        if (dVar != null) {
                            float f26 = kxVar.f47440a + kxVar.f47444f;
                            float f27 = kxVar.f47441b + kxVar.f47445g;
                            float f28 = kxVar.d * f10;
                            dVar.e((int) f26, (int) f27, (int) (f26 + f28), (int) (f27 + f28));
                            kxVar.f47447j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = kxVar.f47455r;
                            float f29 = kxVar.f47440a + kxVar.f47444f;
                            float f30 = kxVar.f47441b + kxVar.f47445g;
                            float f31 = kxVar.d * f10;
                            imageReceiver2.y0(f29, f30, f31, f31);
                            if (!kxVar.f47450m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, kxVar.f47455r.r(), kxVar.f47455r.s());
                                kxVar.f47455r.h(canvas, null);
                                canvas.restore();
                            } else {
                                kxVar.f47455r.h(canvas, null);
                            }
                        }
                    }
                }
                ch.d dVar2 = kxVar.f47447j;
                if (dVar2 != null) {
                    z10 = dVar2.c();
                } else if (kxVar.f47449l && kxVar.f47455r.B() != null && kxVar.f47455r.B().f40962a0 >= kxVar.f47455r.B().f40968e[0] - 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (kxVar.f47452o != 1.0f && !z10 && !z9) {
                    if (kxVar.f47455r.B() != null && kxVar.f47455r.B().f40976k0) {
                        kxVar.f47449l = true;
                    } else if (kxVar.f47455r.B() != null && !kxVar.f47455r.B().f40976k0) {
                        kxVar.f47455r.B().N(0, true, false);
                        kxVar.f47455r.B().start();
                    }
                } else {
                    kx kxVar2 = (kx) this.F.remove(i7);
                    if (kxVar.h && kxVar.f47455r.B() != null) {
                        kxVar2.f47455r.B().N(0, true, true);
                    }
                    kxVar2.f47455r.R();
                    ch.d dVar3 = kxVar2.f47447j;
                    if (dVar3 != null) {
                        dVar3.d(this.G);
                    }
                    i7--;
                }
                i7++;
            }
            if (this.F.isEmpty()) {
                h();
            }
            this.G.invalidate();
        }
    }

    public final void i() {
        this.f47715n = true;
        b();
        org.telegram.messenger.qs.f(this.f47711b).c(this, org.telegram.messenger.qs.f25115y0);
        org.telegram.messenger.qs.f(this.f47711b).c(this, org.telegram.messenger.qs.T4);
        org.telegram.messenger.qs.f(this.f47711b).c(this, org.telegram.messenger.qs.f25067r);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i7 < arrayList.size()) {
                ((kx) arrayList.get(i7)).f47455r.P();
                if (((kx) arrayList.get(i7)).f47447j != null) {
                    ((kx) arrayList.get(i7)).f47447j.f(this.G);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        int i7 = 0;
        this.f47715n = false;
        org.telegram.messenger.qs.f(this.f47711b).n(this, org.telegram.messenger.qs.f25115y0);
        org.telegram.messenger.qs.f(this.f47711b).n(this, org.telegram.messenger.qs.T4);
        org.telegram.messenger.qs.f(this.f47711b).n(this, org.telegram.messenger.qs.f25067r);
        while (true) {
            ArrayList arrayList = this.F;
            if (i7 < arrayList.size()) {
                ((kx) arrayList.get(i7)).f47455r.R();
                if (((kx) arrayList.get(i7)).f47447j != null) {
                    ((kx) arrayList.get(i7)).f47447j.d(this.G);
                }
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, cn cnVar, boolean z9) {
        TLRPC.Document T;
        if (!cnVar.z() && q1Var.getMessageObject() != null && q1Var.getMessageObject().e1() >= 0) {
            if (q1Var.getMessageObject().W3() || cnVar.f44487f != null) {
                boolean n10 = n(q1Var, -1, z9, false);
                if (z9 && n10) {
                    String V1 = q1Var.getMessageObject().V1();
                    if (!org.telegram.messenger.j6.a(V1) && !"🍑".equals(V1) && !"⚰".equals(V1) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                        try {
                            q1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!q1Var.getMessageObject().W3() && q1Var.getEffect() == null && (z9 || q1Var.getMessageObject().f23279o == null)) {
                    Integer E1 = org.telegram.messenger.qp.s1(this.f47711b).E1(this.I, this.J);
                    if ((E1 == null || E1.intValue() != 5) && this.E == null && n10) {
                        org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.f32195w;
                        if ((bcVar == null || !bcVar.f32205l) && org.telegram.messenger.iz.f23399d1 > 0 && org.telegram.messenger.p10.i(this.f47711b).e() != cnVar.f44487f.f27109id) {
                            org.telegram.messenger.iz.f23399d1--;
                            org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", org.telegram.messenger.iz.f23399d1).apply();
                            if (q1Var.getMessageObject().F2()) {
                                T = q1Var.getMessageObject().F0();
                            } else {
                                T = org.telegram.messenger.ui.b0(this.f47711b).T(q1Var.getMessageObject().V1());
                            }
                            org.telegram.ui.Components.dv0 dv0Var = new org.telegram.ui.Components.dv0(cnVar.getParentActivity(), null, 1, -1, T, cnVar.getResourceProvider());
                            dv0Var.f40281c.setVisibility(8);
                            dv0Var.f40280b.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("EmojiInteractionTapHint", null, 2131751177, cnVar.f44487f.first_name)), dv0Var.f40280b.getPaint().getFontMetricsInt(), false, null, 0));
                            dv0Var.f40280b.setTypeface(null);
                            dv0Var.f40280b.setMaxLines(3);
                            dv0Var.f40280b.setSingleLine(false);
                            ix ixVar = new ix(0, this, org.telegram.ui.Components.bc.g(cnVar, dv0Var, 2750));
                            this.E = ixVar;
                            org.telegram.messenger.g0.i3(ixVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                q1Var.getMessageObject().R = false;
                q1Var.getMessageObject().f23266k.premiumEffectWasPlayed = true;
                cnVar.getMessagesStorage().X1(this.I, q1Var.getMessageObject().f23266k);
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.K;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f26966id))) {
                return;
            }
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.f26966id), Boolean.TRUE);
            org.telegram.messenger.ui.b0(this.f47711b).l1(org.telegram.messenger.hc.b(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.q1 q1Var) {
        ArrayList arrayList;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (!messageObject.W3()) {
            String V1 = messageObject.V1();
            if (V1 == null) {
                V1 = messageObject.f23266k.message;
            }
            String p10 = p(V1);
            if (L.contains(p10) && (arrayList = (ArrayList) this.f47713e.get(p10)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i7 = 0; i7 < min; i7++) {
                    l((TLRPC.Document) arrayList.get(i7));
                }
            }
        }
    }

    public final boolean n(org.telegram.ui.Cells.q1 q1Var, int i7, boolean z9, boolean z10) {
        if (q1Var != null && this.F.size() <= 12) {
            org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            if (q1Var.getEffect() != null || q1Var.getPhotoImage().L()) {
                String V1 = messageObject.V1();
                if (V1 == null) {
                    V1 = messageObject.f23266k.message;
                }
                if (q1Var.getEffect() != null || V1 != null) {
                    float f10 = q1Var.getPhotoImage().N0;
                    float f11 = q1Var.getPhotoImage().M0;
                    if (q1Var.getEffect() != null || (f10 > 0.0f && f11 > 0.0f)) {
                        return d(p(V1), q1Var.getMessageObject().e1(), q1Var.getMessageObject().F0(), messageObject, i7, z9, z10, f11, f10, q1Var.getMessageObject().P3());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.messenger.ij ijVar) {
        cn cnVar = this.f47710a;
        if (cnVar != null && !org.telegram.messenger.qp.s1(this.f47711b).D3() && cnVar.getParentActivity() != null) {
            org.telegram.ui.Components.dv0 dv0Var = new org.telegram.ui.Components.dv0(this.G.getContext(), null, 1, -1, ijVar.F0(), cnVar.getResourceProvider());
            dv0Var.f40280b.setText(tL_messages_stickerSet.set.title);
            dv0Var.f40281c.setText(org.telegram.messenger.id.M0(2131746948, null));
            org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(cnVar.getParentActivity(), cnVar.getResourceProvider(), true);
            dv0Var.setButton(zbVar);
            zbVar.f40908b = new org.telegram.ui.Components.h41(20, this, ijVar);
            zbVar.e(org.telegram.messenger.id.M0(2131743563, null));
            org.telegram.ui.Components.bc g10 = org.telegram.ui.Components.bc.g(cnVar, dv0Var, 2750);
            g10.f32197b = ijVar.e1();
            g10.j();
        }
    }

    public lx(cn cnVar, FrameLayout frameLayout, org.telegram.ui.Components.pj0 pj0Var, int i7, long j3, long j10) {
        this.f47710a = cnVar;
        this.G = frameLayout;
        this.H = pj0Var;
        this.f47711b = i7;
        this.I = j3;
        this.J = j10;
    }

    public void g(kx kxVar) {
    }

    public void h() {
    }
}
