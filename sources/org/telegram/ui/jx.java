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
public class jx implements org.telegram.messenger.is {
    public static final HashSet M = new HashSet();
    public static final HashSet N;
    public bh E;
    public m9.u F;
    public final FrameLayout H;
    public final org.telegram.ui.Components.uj0 I;
    public final long J;
    public final long K;
    public HashMap L;
    public final an f48434a;
    public int f48435b;
    public TLRPC.TL_messages_stickerSet f48436c;
    public boolean f48439n;
    public String f48442w;
    public boolean d = false;
    public final HashMap f48437e = new HashMap();
    public final HashMap f48438f = new HashMap();
    public final Random h = new Random();
    public int f48440r = -1;
    public long f48441s = 0;
    public final ArrayList f48443x = new ArrayList();
    public final ArrayList f48444y = new ArrayList();
    public final ArrayList G = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        N = hashSet;
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

    public jx(int i7, FrameLayout frameLayout) {
        this.H = frameLayout;
        this.f48435b = i7;
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
            Point point = org.telegram.messenger.g0.f23611q;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        return (int) ((((int) (min * f10)) * 2.0f) / org.telegram.messenger.g0.f23610p);
    }

    public static java.lang.String p(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jx.p(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.si.b0(this.f48435b).p0("EmojiAnimations");
            this.f48436c = p02;
            if (p02 == null) {
                this.f48436c = org.telegram.messenger.si.b0(this.f48435b).n0("EmojiAnimations");
            }
            if (this.f48436c == null) {
                org.telegram.messenger.si.b0(this.f48435b).c1("EmojiAnimations", false, true);
            }
            if (this.f48436c != null) {
                HashMap hashMap = new HashMap();
                for (int i7 = 0; i7 < this.f48436c.documents.size(); i7++) {
                    hashMap.put(Long.valueOf(this.f48436c.documents.get(i7).f28057id), this.f48436c.documents.get(i7));
                }
                for (int i10 = 0; i10 < this.f48436c.packs.size(); i10++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f48436c.packs.get(i10);
                    if (!N.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = M;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.f48437e;
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
            ArrayList arrayList = this.G;
            if (i7 < arrayList.size()) {
                ((ix) arrayList.get(i7)).f48139r.R();
                if (((ix) arrayList.get(i7)).f48131j != null) {
                    ((ix) arrayList.get(i7)).f48131j.d(this.H);
                }
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i7, TLRPC.Document document, org.telegram.messenger.gj gjVar, int i10, boolean z10, boolean z11, float f10, float f11, boolean z12) {
        boolean z13;
        boolean z14;
        Random random;
        long j3;
        TLRPC.Document document2;
        int intValue;
        Boolean bool;
        TLRPC.VideoSize F1;
        boolean z15;
        String str2;
        int intValue2;
        bh bhVar;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i11 = i10;
        if (gjVar != null && gjVar.W3()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (gjVar != null && gjVar.M0() != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || z13 || M.contains(str)) {
            ArrayList arrayList = (ArrayList) this.f48437e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    if (i12 < arrayList2.size()) {
                        if (((ix) arrayList2.get(i12)).f48137p == i7) {
                            i13++;
                            if (!z14 && (((ix) arrayList2.get(i12)).f48139r.B() == null || ((ix) arrayList2.get(i12)).f48139r.B().y())) {
                                return false;
                            }
                        }
                        if (((ix) arrayList2.get(i12)).f48138q != null && document != null) {
                            if (((ix) arrayList2.get(i12)).f48138q.f28057id == document.f28057id) {
                                i14++;
                            }
                        }
                        i12++;
                    } else if (z10 && z13 && i13 > 0) {
                        org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41627w;
                        if (xbVar != null && xbVar.f41629b == gjVar.e1()) {
                            return false;
                        }
                        TLRPC.InputStickerSet j12 = org.telegram.messenger.gj.j1(gjVar.f23819k);
                        if (j12.short_name != null) {
                            tL_messages_stickerSet = org.telegram.messenger.si.b0(this.f48435b).p0(j12.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = org.telegram.messenger.si.b0(this.f48435b).o0(j12.f28071id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = j12;
                            ConnectionsManager.getInstance(this.f48435b).sendRequest(tL_messages_getStickerSet, new v7(26, this, gjVar));
                            return false;
                        }
                        o(tL_messages_stickerSet, gjVar);
                        return false;
                    } else if (i13 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z14) {
                            TLRPC.TL_availableEffect M0 = gjVar.M0();
                            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.np.s1(this.f48435b).E0();
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
                                    if (document2 != null && document2.f28057id == j11) {
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
                                F1 = org.telegram.messenger.gj.F1(document2);
                                if (F1 != null) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                            F1 = null;
                        } else {
                            random = random2;
                            j3 = 0;
                            if (z13) {
                                document2 = gjVar.F0();
                                F1 = org.telegram.messenger.gj.F1(gjVar.F0());
                            } else {
                                if (gjVar != null && gjVar.F2()) {
                                    if (i11 >= 0 && i11 <= arrayList.size() - 1) {
                                        intValue = i11;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                                            if (document3 != null) {
                                                HashMap hashMap = this.L;
                                                if (hashMap != null) {
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f28057id));
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
                        ix ixVar = new ix();
                        ixVar.h = z13;
                        ixVar.f48130i = z14;
                        if (!z14) {
                            ixVar.f48128f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            ixVar.f48129g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        ixVar.f48137p = i7;
                        ixVar.f48138q = document2;
                        ixVar.f48134m = z12;
                        ImageReceiver imageReceiver = ixVar.f48139r;
                        imageReceiver.f22301u0 = true;
                        imageReceiver.f22299t0 = z10;
                        if (org.telegram.messenger.gz.o() > 1) {
                            boolean z16 = org.telegram.messenger.r2.f26206a;
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        int i17 = i11;
                        HashMap hashMap2 = this.f48438f;
                        boolean z17 = z13;
                        if (F1 == null) {
                            int f12 = f();
                            boolean z18 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f28057id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i18 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f28057id), Integer.valueOf(i18));
                            org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i18);
                            sb2.append("_");
                            imageReceiver.f22307w1 = a8.p0.n(ixVar.f48137p, "_", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f12);
                            sb3.append("_");
                            sb3.append(f12);
                            if (!z18) {
                                str3 = "";
                            } else {
                                str3 = "_pcache";
                            }
                            sb3.append(str3);
                            ixVar.f48139r.q0(b10, sb3.toString(), null, "tgs", this.f48436c, 1);
                            imageReceiver.f22276h1 = new hx(this, ixVar, z10, gjVar);
                            if (imageReceiver.B() != null) {
                                imageReceiver.B().N(0, false, true);
                            }
                        } else {
                            boolean z19 = z15;
                            int f13 = f();
                            if (i14 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f28057id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f28057id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(intValue2);
                                sb4.append("_");
                                imageReceiver.f22307w1 = a8.p0.n(ixVar.f48137p, "_", sb4);
                            }
                            ixVar.f48138q = document2;
                            org.telegram.messenger.gc d = org.telegram.messenger.gc.d(F1, document2);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(f13);
                            sb5.append("_");
                            sb5.append(f13);
                            if (!z19) {
                                str2 = "";
                            } else {
                                str2 = "_pcache";
                            }
                            sb5.append(str2);
                            ixVar.f48139r.q0(d, sb5.toString(), null, "tgs", this.f48436c, 1);
                        }
                        imageReceiver.E0(Integer.MAX_VALUE);
                        imageReceiver.W(0);
                        if (imageReceiver.B() != null) {
                            if (ixVar.h) {
                                imageReceiver.B().N(0, false, true);
                            }
                            imageReceiver.B().start();
                        }
                        arrayList2.add(ixVar);
                        imageReceiver.P();
                        FrameLayout frameLayout = this.H;
                        imageReceiver.H0(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z17 && org.telegram.messenger.m10.i(this.f48435b).f24959n != this.J) {
                            int i19 = this.f48440r;
                            if (i19 != 0 && i19 != i7 && (bhVar = this.E) != null) {
                                org.telegram.messenger.g0.r(bhVar);
                                this.E.run();
                            }
                            this.f48440r = i7;
                            this.f48442w = str;
                            int i20 = (this.f48441s > j3 ? 1 : (this.f48441s == j3 ? 0 : -1));
                            ArrayList arrayList4 = this.f48444y;
                            ArrayList arrayList5 = this.f48443x;
                            if (i20 == 0) {
                                this.f48441s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i17));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f48441s));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            bh bhVar2 = this.E;
                            if (bhVar2 != null) {
                                org.telegram.messenger.g0.r(bhVar2);
                                this.E = null;
                            }
                            bh bhVar3 = new bh(this, 27);
                            this.E = bhVar3;
                            org.telegram.messenger.g0.i3(bhVar3, 500L);
                        }
                        if (z11) {
                            org.telegram.messenger.np.s1(this.f48435b).D4(11, 0, this.J, this.K, str);
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
        if (i7 == org.telegram.messenger.ns.f25608y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i11 = org.telegram.messenger.ns.T4;
        long j3 = this.J;
        if (i7 == i11) {
            if (this.f48434a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j3 && M.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i12 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i13);
                                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.hb0(this, i12, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25560r && (E1 = org.telegram.messenger.np.s1(this.f48435b).E1(j3, this.K)) != null && E1.intValue() == 5) {
            m9.u uVar = this.F;
            if (uVar != null) {
                org.telegram.messenger.g0.r(uVar);
            }
            this.F = null;
        }
    }

    public final void e(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        boolean z11;
        float f12;
        boolean z12;
        boolean z13;
        ImageReceiver imageReceiver;
        org.telegram.messenger.gj gjVar;
        float f13;
        if (!this.G.isEmpty()) {
            int i7 = 0;
            while (i7 < this.G.size()) {
                ix ixVar = (ix) this.G.get(i7);
                if (this.f48434a != null) {
                    ixVar.f48126c = false;
                    int i10 = 0;
                    while (true) {
                        if (i10 < this.I.getChildCount()) {
                            View childAt = this.I.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                gjVar = q1Var.getMessageObject();
                                imageReceiver = q1Var.getPhotoImage();
                            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                                gjVar = t0Var.getMessageObject();
                                imageReceiver = t0Var.getPhotoImage();
                            } else {
                                imageReceiver = null;
                                gjVar = null;
                            }
                            if (gjVar != null && gjVar.e1() == ixVar.f48137p) {
                                ixVar.f48126c = true;
                                float x10 = childAt.getX() + this.I.getX();
                                float y10 = childAt.getY() + this.I.getY();
                                f12 = childAt.getY();
                                f10 = 3.0f;
                                float f14 = imageReceiver.N0;
                                ixVar.d = f14;
                                f11 = 2.0f;
                                ixVar.f48127e = imageReceiver.O0;
                                if (ixVar.f48130i && (childAt instanceof org.telegram.ui.Cells.q1)) {
                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                    float f15 = (f() * org.telegram.messenger.g0.f23610p) / 1.3f;
                                    float f16 = f15 / 3.0f;
                                    ixVar.d = f16;
                                    ixVar.f48127e = f16;
                                    float f17 = f15 / 2.0f;
                                    ixVar.f48124a = Utilities.i((q1Var2.getTimeX() + x10) - f17, org.telegram.messenger.g0.f23611q.x - f15, 0.0f);
                                    ixVar.f48125b = (q1Var2.getTimeY() + y10) - f17;
                                } else if (ixVar.h) {
                                    ixVar.f48124a = x10 + imageReceiver.L0;
                                    ixVar.f48125b = y10 + imageReceiver.M0;
                                } else {
                                    float f18 = x10 + imageReceiver.L0;
                                    float f19 = y10 + imageReceiver.M0;
                                    if (ixVar.f48134m) {
                                        f13 = ((-f14) * 2.0f) + org.telegram.messenger.g0.L(24.0f) + f18;
                                    } else {
                                        f13 = (-org.telegram.messenger.g0.L(24.0f)) + f18;
                                    }
                                    ixVar.f48124a = f13;
                                    ixVar.f48125b = f19 - imageReceiver.N0;
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
                    if (!ixVar.f48126c || ixVar.f48127e + f12 < this.f48434a.O9 || f12 > this.I.getMeasuredHeight() - this.f48434a.Xa) {
                        ixVar.f48135n = true;
                    }
                    if (ixVar.h) {
                        float f20 = ixVar.f48127e / f11;
                        if (this.I.getMeasuredHeight() - f12 <= f20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f12 - this.f48434a.O9) + f20 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            ixVar.f48135n = true;
                        }
                    }
                    if (ixVar.f48135n) {
                        float f21 = ixVar.f48136o;
                        if (f21 != 1.0f) {
                            float i11 = Utilities.i(f21 + 0.10666667f, 1.0f, 0.0f);
                            ixVar.f48136o = i11;
                            ixVar.f48139r.setAlpha(1.0f - i11);
                            this.f48434a.f45277m1.invalidate();
                        }
                    }
                } else {
                    f10 = 3.0f;
                    f11 = 2.0f;
                    g(ixVar);
                }
                if (!ixVar.f48133l && ixVar.f48135n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (ixVar.h && !ixVar.f48130i) {
                        float f22 = ixVar.f48127e;
                        float f23 = 1.49926f * f22;
                        float f24 = 0.0546875f * f23;
                        float f25 = (((f22 / f11) + ixVar.f48125b) - (f23 / f11)) - (0.00279f * f23);
                        if (!ixVar.f48134m) {
                            ixVar.f48139r.y0(ixVar.f48124a - f24, f25, f23, f23);
                        } else {
                            ixVar.f48139r.y0(((ixVar.f48124a + ixVar.d) - f23) + f24, f25, f23, f23);
                        }
                        if (!ixVar.f48134m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, ixVar.f48139r.r(), ixVar.f48139r.s());
                            ixVar.f48139r.h(canvas, null);
                            canvas.restore();
                        } else {
                            ixVar.f48139r.h(canvas, null);
                        }
                    } else {
                        ch.d dVar = ixVar.f48131j;
                        if (dVar != null) {
                            float f26 = ixVar.f48124a + ixVar.f48128f;
                            float f27 = ixVar.f48125b + ixVar.f48129g;
                            float f28 = ixVar.d * f10;
                            dVar.e((int) f26, (int) f27, (int) (f26 + f28), (int) (f27 + f28));
                            ixVar.f48131j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = ixVar.f48139r;
                            float f29 = ixVar.f48124a + ixVar.f48128f;
                            float f30 = ixVar.f48125b + ixVar.f48129g;
                            float f31 = ixVar.d * f10;
                            imageReceiver2.y0(f29, f30, f31, f31);
                            if (!ixVar.f48134m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, ixVar.f48139r.r(), ixVar.f48139r.s());
                                ixVar.f48139r.h(canvas, null);
                                canvas.restore();
                            } else {
                                ixVar.f48139r.h(canvas, null);
                            }
                        }
                    }
                }
                ch.d dVar2 = ixVar.f48131j;
                if (dVar2 != null) {
                    z11 = dVar2.c();
                } else if (ixVar.f48133l && ixVar.f48139r.B() != null && ixVar.f48139r.B().f33575b0 >= ixVar.f48139r.B().f33579e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (ixVar.f48136o != 1.0f && !z11 && !z10) {
                    if (ixVar.f48139r.B() != null && ixVar.f48139r.B().f33588l0) {
                        ixVar.f48133l = true;
                    } else if (ixVar.f48139r.B() != null && !ixVar.f48139r.B().f33588l0) {
                        ixVar.f48139r.B().N(0, true, false);
                        ixVar.f48139r.B().start();
                    }
                } else {
                    ix ixVar2 = (ix) this.G.remove(i7);
                    if (ixVar.h && ixVar.f48139r.B() != null) {
                        ixVar2.f48139r.B().N(0, true, true);
                    }
                    ixVar2.f48139r.R();
                    ch.d dVar3 = ixVar2.f48131j;
                    if (dVar3 != null) {
                        dVar3.d(this.H);
                    }
                    i7--;
                }
                i7++;
            }
            if (this.G.isEmpty()) {
                h();
            }
            this.H.invalidate();
        }
    }

    public final void i() {
        this.f48439n = true;
        b();
        org.telegram.messenger.ns.f(this.f48435b).c(this, org.telegram.messenger.ns.f25608y0);
        org.telegram.messenger.ns.f(this.f48435b).c(this, org.telegram.messenger.ns.T4);
        org.telegram.messenger.ns.f(this.f48435b).c(this, org.telegram.messenger.ns.f25560r);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 < arrayList.size()) {
                ((ix) arrayList.get(i7)).f48139r.P();
                if (((ix) arrayList.get(i7)).f48131j != null) {
                    ((ix) arrayList.get(i7)).f48131j.f(this.H);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        int i7 = 0;
        this.f48439n = false;
        org.telegram.messenger.ns.f(this.f48435b).n(this, org.telegram.messenger.ns.f25608y0);
        org.telegram.messenger.ns.f(this.f48435b).n(this, org.telegram.messenger.ns.T4);
        org.telegram.messenger.ns.f(this.f48435b).n(this, org.telegram.messenger.ns.f25560r);
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 < arrayList.size()) {
                ((ix) arrayList.get(i7)).f48139r.R();
                if (((ix) arrayList.get(i7)).f48131j != null) {
                    ((ix) arrayList.get(i7)).f48131j.d(this.H);
                }
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, an anVar, boolean z10) {
        TLRPC.Document T;
        if (!anVar.z() && q1Var.getMessageObject() != null && q1Var.getMessageObject().e1() >= 0) {
            if (q1Var.getMessageObject().W3() || anVar.f45186f != null) {
                boolean n10 = n(q1Var, -1, z10, false);
                if (z10 && n10) {
                    String V1 = q1Var.getMessageObject().V1();
                    if (!org.telegram.messenger.k6.a(V1) && !"🍑".equals(V1) && !"⚰".equals(V1) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                        try {
                            q1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!q1Var.getMessageObject().W3() && q1Var.getEffect() == null && (z10 || q1Var.getMessageObject().f23834o == null)) {
                    Integer E1 = org.telegram.messenger.np.s1(this.f48435b).E1(this.J, this.K);
                    if ((E1 == null || E1.intValue() != 5) && this.F == null && n10) {
                        org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41627w;
                        if ((xbVar == null || !xbVar.f41637l) && org.telegram.messenger.gz.f23942d1 > 0 && org.telegram.messenger.m10.i(this.f48435b).e() != anVar.f45186f.f28200id) {
                            org.telegram.messenger.gz.f23942d1--;
                            org.telegram.messenger.t0.f26609b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", org.telegram.messenger.gz.f23942d1).apply();
                            if (q1Var.getMessageObject().F2()) {
                                T = q1Var.getMessageObject().F0();
                            } else {
                                T = org.telegram.messenger.si.b0(this.f48435b).T(q1Var.getMessageObject().V1());
                            }
                            org.telegram.ui.Components.ev0 ev0Var = new org.telegram.ui.Components.ev0(anVar.getParentActivity(), null, 1, -1, T, anVar.getResourceProvider());
                            ev0Var.f39627c.setVisibility(8);
                            ev0Var.f39626b.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("EmojiInteractionTapHint", null, 2131751177, anVar.f45186f.first_name)), ev0Var.f39626b.getPaint().getFontMetricsInt(), false, null, 0));
                            ev0Var.f39626b.setTypeface(null);
                            ev0Var.f39626b.setMaxLines(3);
                            ev0Var.f39626b.setSingleLine(false);
                            m9.u uVar = new m9.u(this, org.telegram.ui.Components.xb.g(anVar, ev0Var, 2750), false, 29);
                            this.F = uVar;
                            org.telegram.messenger.g0.i3(uVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                q1Var.getMessageObject().R = false;
                q1Var.getMessageObject().f23819k.premiumEffectWasPlayed = true;
                anVar.getMessagesStorage().X1(this.J, q1Var.getMessageObject().f23819k);
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.L;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f28057id))) {
                return;
            }
            if (this.L == null) {
                this.L = new HashMap();
            }
            this.L.put(Long.valueOf(document.f28057id), Boolean.TRUE);
            org.telegram.messenger.si.b0(this.f48435b).l1(org.telegram.messenger.gc.b(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.q1 q1Var) {
        ArrayList arrayList;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (!messageObject.W3()) {
            String V1 = messageObject.V1();
            if (V1 == null) {
                V1 = messageObject.f23819k.message;
            }
            String p10 = p(V1);
            if (M.contains(p10) && (arrayList = (ArrayList) this.f48437e.get(p10)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i7 = 0; i7 < min; i7++) {
                    l((TLRPC.Document) arrayList.get(i7));
                }
            }
        }
    }

    public final boolean n(org.telegram.ui.Cells.q1 q1Var, int i7, boolean z10, boolean z11) {
        if (q1Var != null && this.G.size() <= 12) {
            org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
            if (q1Var.getEffect() != null || q1Var.getPhotoImage().L()) {
                String V1 = messageObject.V1();
                if (V1 == null) {
                    V1 = messageObject.f23819k.message;
                }
                if (q1Var.getEffect() != null || V1 != null) {
                    float f10 = q1Var.getPhotoImage().O0;
                    float f11 = q1Var.getPhotoImage().N0;
                    if (q1Var.getEffect() != null || (f10 > 0.0f && f11 > 0.0f)) {
                        return d(p(V1), q1Var.getMessageObject().e1(), q1Var.getMessageObject().F0(), messageObject, i7, z10, z11, f11, f10, q1Var.getMessageObject().P3());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.messenger.gj gjVar) {
        an anVar = this.f48434a;
        if (anVar != null && !org.telegram.messenger.np.s1(this.f48435b).D3() && anVar.getParentActivity() != null) {
            org.telegram.ui.Components.ev0 ev0Var = new org.telegram.ui.Components.ev0(this.H.getContext(), null, 1, -1, gjVar.F0(), anVar.getResourceProvider());
            ev0Var.f39626b.setText(tL_messages_stickerSet.set.title);
            ev0Var.f39627c.setText(org.telegram.messenger.hd.M0(2131746948, null));
            org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(anVar.getParentActivity(), anVar.getResourceProvider(), true);
            ev0Var.setButton(vbVar);
            vbVar.f40372b = new org.telegram.ui.Components.voip.u(15, this, gjVar);
            vbVar.e(org.telegram.messenger.hd.M0(2131743563, null));
            org.telegram.ui.Components.xb g10 = org.telegram.ui.Components.xb.g(anVar, ev0Var, 2750);
            g10.f41629b = gjVar.e1();
            g10.j();
        }
    }

    public jx(an anVar, FrameLayout frameLayout, org.telegram.ui.Components.uj0 uj0Var, int i7, long j3, long j10) {
        this.f48434a = anVar;
        this.H = frameLayout;
        this.I = uj0Var;
        this.f48435b = i7;
        this.J = j3;
        this.K = j10;
    }

    public void g(ix ixVar) {
    }

    public void h() {
    }
}
