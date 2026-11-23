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
public class mx implements org.telegram.messenger.fs {
    public static final HashSet M = new HashSet();
    public static final HashSet N;
    public ch E;
    public m9.u F;
    public final FrameLayout H;
    public final org.telegram.ui.Components.ek0 I;
    public final long J;
    public final long K;
    public HashMap L;
    public final bn f50134a;
    public int f50135b;
    public TLRPC.TL_messages_stickerSet f50136c;
    public boolean f50139n;
    public String f50142w;
    public boolean d = false;
    public final HashMap f50137e = new HashMap();
    public final HashMap f50138f = new HashMap();
    public final Random h = new Random();
    public int f50140r = -1;
    public long f50141s = 0;
    public final ArrayList f50143x = new ArrayList();
    public final ArrayList f50144y = new ArrayList();
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

    public mx(int i7, FrameLayout frameLayout) {
        this.H = frameLayout;
        this.f50135b = i7;
    }

    public static boolean a(org.telegram.ui.Cells.r1 r1Var, float f10, int i7) {
        float s5 = r1Var.getPhotoImage().s() + r1Var.getY();
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
            Point point = org.telegram.messenger.g0.f24226q;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        return (int) ((((int) (min * f10)) * 2.0f) / org.telegram.messenger.g0.f24225p);
    }

    public static java.lang.String p(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mx.p(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.ri.d0(this.f50135b).r0("EmojiAnimations");
            this.f50136c = r02;
            if (r02 == null) {
                this.f50136c = org.telegram.messenger.ri.d0(this.f50135b).p0("EmojiAnimations");
            }
            if (this.f50136c == null) {
                org.telegram.messenger.ri.d0(this.f50135b).f1("EmojiAnimations", false, true);
            }
            if (this.f50136c != null) {
                HashMap hashMap = new HashMap();
                for (int i7 = 0; i7 < this.f50136c.documents.size(); i7++) {
                    hashMap.put(Long.valueOf(this.f50136c.documents.get(i7).f28498id), this.f50136c.documents.get(i7));
                }
                for (int i10 = 0; i10 < this.f50136c.packs.size(); i10++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f50136c.packs.get(i10);
                    if (!N.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = M;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.f50137e;
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
                ((lx) arrayList.get(i7)).f49867r.S();
                if (((lx) arrayList.get(i7)).f49859j != null) {
                    ((lx) arrayList.get(i7)).f49859j.d(this.H);
                }
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i7, TLRPC.Document document, org.telegram.messenger.fj fjVar, int i10, boolean z10, boolean z11, float f10, float f11, boolean z12) {
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
        ch chVar;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i11 = i10;
        if (fjVar != null && fjVar.W3()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (fjVar != null && fjVar.M0() != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || z13 || M.contains(str)) {
            ArrayList arrayList = (ArrayList) this.f50137e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    if (i12 < arrayList2.size()) {
                        if (((lx) arrayList2.get(i12)).f49865p == i7) {
                            i13++;
                            if (!z14 && (((lx) arrayList2.get(i12)).f49867r.C() == null || ((lx) arrayList2.get(i12)).f49867r.C().y())) {
                                return false;
                            }
                        }
                        if (((lx) arrayList2.get(i12)).f49866q != null && document != null) {
                            if (((lx) arrayList2.get(i12)).f49866q.f28498id == document.f28498id) {
                                i14++;
                            }
                        }
                        i12++;
                    } else if (z10 && z13 && i13 > 0) {
                        org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.f35083w;
                        if (fcVar != null && fcVar.f35085b == fjVar.e1()) {
                            return false;
                        }
                        TLRPC.InputStickerSet j12 = org.telegram.messenger.fj.j1(fjVar.f24073k);
                        if (j12.short_name != null) {
                            tL_messages_stickerSet = org.telegram.messenger.ri.d0(this.f50135b).r0(j12.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = org.telegram.messenger.ri.d0(this.f50135b).q0(j12.f28512id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = j12;
                            ConnectionsManager.getInstance(this.f50135b).sendRequest(tL_messages_getStickerSet, new v7(26, this, fjVar));
                            return false;
                        }
                        o(tL_messages_stickerSet, fjVar);
                        return false;
                    } else if (i13 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z14) {
                            TLRPC.TL_availableEffect M0 = fjVar.M0();
                            TLRPC.messages_AvailableEffects G0 = org.telegram.messenger.mp.u1(this.f50135b).G0();
                            if (G0 == null) {
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
                                if (i15 < G0.documents.size()) {
                                    document2 = G0.documents.get(i15);
                                    long j11 = j10;
                                    if (document2 != null && document2.f28498id == j11) {
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
                                F1 = org.telegram.messenger.fj.F1(document2);
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
                                document2 = fjVar.F0();
                                F1 = org.telegram.messenger.fj.F1(fjVar.F0());
                            } else {
                                if (fjVar != null && fjVar.F2()) {
                                    if (i11 >= 0 && i11 <= arrayList.size() - 1) {
                                        intValue = i11;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                                            if (document3 != null) {
                                                HashMap hashMap = this.L;
                                                if (hashMap != null) {
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f28498id));
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
                        lx lxVar = new lx();
                        lxVar.h = z13;
                        lxVar.f49858i = z14;
                        if (!z14) {
                            lxVar.f49856f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            lxVar.f49857g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        lxVar.f49865p = i7;
                        lxVar.f49866q = document2;
                        lxVar.f49862m = z12;
                        ImageReceiver imageReceiver = lxVar.f49867r;
                        imageReceiver.f22762u0 = true;
                        imageReceiver.f22760t0 = z10;
                        if (org.telegram.messenger.bz.o() > 1) {
                            boolean z16 = org.telegram.messenger.s2.f26829a;
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        int i17 = i11;
                        HashMap hashMap2 = this.f50138f;
                        boolean z17 = z13;
                        if (F1 == null) {
                            int f12 = f();
                            boolean z18 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f28498id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i18 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f28498id), Integer.valueOf(i18));
                            org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i18);
                            sb2.append("_");
                            imageReceiver.f22768w1 = a8.p0.n(lxVar.f49865p, "_", sb2);
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
                            lxVar.f49867r.r0(b10, sb3.toString(), null, "tgs", this.f50136c, 1);
                            imageReceiver.f22737h1 = new kx(this, lxVar, z10, fjVar);
                            if (imageReceiver.C() != null) {
                                imageReceiver.C().N(0, false, true);
                            }
                        } else {
                            boolean z19 = z15;
                            int f13 = f();
                            if (i14 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f28498id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f28498id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(intValue2);
                                sb4.append("_");
                                imageReceiver.f22768w1 = a8.p0.n(lxVar.f49865p, "_", sb4);
                            }
                            lxVar.f49866q = document2;
                            org.telegram.messenger.fc d = org.telegram.messenger.fc.d(F1, document2);
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
                            lxVar.f49867r.r0(d, sb5.toString(), null, "tgs", this.f50136c, 1);
                        }
                        imageReceiver.F0(Integer.MAX_VALUE);
                        imageReceiver.X(0);
                        if (imageReceiver.C() != null) {
                            if (lxVar.h) {
                                imageReceiver.C().N(0, false, true);
                            }
                            imageReceiver.C().start();
                        }
                        arrayList2.add(lxVar);
                        imageReceiver.Q();
                        FrameLayout frameLayout = this.H;
                        imageReceiver.I0(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z17 && org.telegram.messenger.i10.i(this.f50135b).f24656n != this.J) {
                            int i19 = this.f50140r;
                            if (i19 != 0 && i19 != i7 && (chVar = this.E) != null) {
                                org.telegram.messenger.g0.r(chVar);
                                this.E.run();
                            }
                            this.f50140r = i7;
                            this.f50142w = str;
                            int i20 = (this.f50141s > j3 ? 1 : (this.f50141s == j3 ? 0 : -1));
                            ArrayList arrayList4 = this.f50144y;
                            ArrayList arrayList5 = this.f50143x;
                            if (i20 == 0) {
                                this.f50141s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i17));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f50141s));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            ch chVar2 = this.E;
                            if (chVar2 != null) {
                                org.telegram.messenger.g0.r(chVar2);
                                this.E = null;
                            }
                            ch chVar3 = new ch(this, 27);
                            this.E = chVar3;
                            org.telegram.messenger.g0.h3(chVar3, 500L);
                        }
                        if (z11) {
                            org.telegram.messenger.mp.u1(this.f50135b).N4(11, 0, this.J, this.K, str);
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
        Integer G1;
        if (i7 == org.telegram.messenger.ks.f25324y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i11 = org.telegram.messenger.ks.W4;
        long j3 = this.J;
        if (i7 == i11) {
            if (this.f50134a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j3 && M.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i12 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i13);
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.pb0(this, i12, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25276r && (G1 = org.telegram.messenger.mp.u1(this.f50135b).G1(j3, this.K)) != null && G1.intValue() == 5) {
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
        org.telegram.messenger.fj fjVar;
        float f13;
        if (!this.G.isEmpty()) {
            int i7 = 0;
            while (i7 < this.G.size()) {
                lx lxVar = (lx) this.G.get(i7);
                if (this.f50134a != null) {
                    lxVar.f49854c = false;
                    int i10 = 0;
                    while (true) {
                        if (i10 < this.I.getChildCount()) {
                            View childAt = this.I.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.r1) {
                                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                                fjVar = r1Var.getMessageObject();
                                imageReceiver = r1Var.getPhotoImage();
                            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                                fjVar = v0Var.getMessageObject();
                                imageReceiver = v0Var.getPhotoImage();
                            } else {
                                imageReceiver = null;
                                fjVar = null;
                            }
                            if (fjVar != null && fjVar.e1() == lxVar.f49865p) {
                                lxVar.f49854c = true;
                                float x10 = childAt.getX() + this.I.getX();
                                float y10 = childAt.getY() + this.I.getY();
                                f12 = childAt.getY();
                                f10 = 3.0f;
                                float f14 = imageReceiver.N0;
                                lxVar.d = f14;
                                f11 = 2.0f;
                                lxVar.f49855e = imageReceiver.O0;
                                if (lxVar.f49858i && (childAt instanceof org.telegram.ui.Cells.r1)) {
                                    org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                                    float f15 = (f() * org.telegram.messenger.g0.f24225p) / 1.3f;
                                    float f16 = f15 / 3.0f;
                                    lxVar.d = f16;
                                    lxVar.f49855e = f16;
                                    float f17 = f15 / 2.0f;
                                    lxVar.f49852a = Utilities.i((r1Var2.getTimeX() + x10) - f17, org.telegram.messenger.g0.f24226q.x - f15, 0.0f);
                                    lxVar.f49853b = (r1Var2.getTimeY() + y10) - f17;
                                } else if (lxVar.h) {
                                    lxVar.f49852a = x10 + imageReceiver.L0;
                                    lxVar.f49853b = y10 + imageReceiver.M0;
                                } else {
                                    float f18 = x10 + imageReceiver.L0;
                                    float f19 = y10 + imageReceiver.M0;
                                    if (lxVar.f49862m) {
                                        f13 = ((-f14) * 2.0f) + org.telegram.messenger.g0.L(24.0f) + f18;
                                    } else {
                                        f13 = (-org.telegram.messenger.g0.L(24.0f)) + f18;
                                    }
                                    lxVar.f49852a = f13;
                                    lxVar.f49853b = f19 - imageReceiver.N0;
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
                    if (!lxVar.f49854c || lxVar.f49855e + f12 < this.f50134a.P9 || f12 > this.I.getMeasuredHeight() - this.f50134a.Ya) {
                        lxVar.f49863n = true;
                    }
                    if (lxVar.h) {
                        float f20 = lxVar.f49855e / f11;
                        if (this.I.getMeasuredHeight() - f12 <= f20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f12 - this.f50134a.P9) + f20 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            lxVar.f49863n = true;
                        }
                    }
                    if (lxVar.f49863n) {
                        float f21 = lxVar.f49864o;
                        if (f21 != 1.0f) {
                            float i11 = Utilities.i(f21 + 0.10666667f, 1.0f, 0.0f);
                            lxVar.f49864o = i11;
                            lxVar.f49867r.setAlpha(1.0f - i11);
                            this.f50134a.f46279m1.invalidate();
                        }
                    }
                } else {
                    f10 = 3.0f;
                    f11 = 2.0f;
                    g(lxVar);
                }
                if (!lxVar.f49861l && lxVar.f49863n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (lxVar.h && !lxVar.f49858i) {
                        float f22 = lxVar.f49855e;
                        float f23 = 1.49926f * f22;
                        float f24 = 0.0546875f * f23;
                        float f25 = (((f22 / f11) + lxVar.f49853b) - (f23 / f11)) - (0.00279f * f23);
                        if (!lxVar.f49862m) {
                            lxVar.f49867r.z0(lxVar.f49852a - f24, f25, f23, f23);
                        } else {
                            lxVar.f49867r.z0(((lxVar.f49852a + lxVar.d) - f23) + f24, f25, f23, f23);
                        }
                        if (!lxVar.f49862m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, lxVar.f49867r.r(), lxVar.f49867r.s());
                            lxVar.f49867r.h(canvas, null);
                            canvas.restore();
                        } else {
                            lxVar.f49867r.h(canvas, null);
                        }
                    } else {
                        ch.d dVar = lxVar.f49859j;
                        if (dVar != null) {
                            float f26 = lxVar.f49852a + lxVar.f49856f;
                            float f27 = lxVar.f49853b + lxVar.f49857g;
                            float f28 = lxVar.d * f10;
                            dVar.e((int) f26, (int) f27, (int) (f26 + f28), (int) (f27 + f28));
                            lxVar.f49859j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = lxVar.f49867r;
                            float f29 = lxVar.f49852a + lxVar.f49856f;
                            float f30 = lxVar.f49853b + lxVar.f49857g;
                            float f31 = lxVar.d * f10;
                            imageReceiver2.z0(f29, f30, f31, f31);
                            if (!lxVar.f49862m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, lxVar.f49867r.r(), lxVar.f49867r.s());
                                lxVar.f49867r.h(canvas, null);
                                canvas.restore();
                            } else {
                                lxVar.f49867r.h(canvas, null);
                            }
                        }
                    }
                }
                ch.d dVar2 = lxVar.f49859j;
                if (dVar2 != null) {
                    z11 = dVar2.c();
                } else if (lxVar.f49861l && lxVar.f49867r.C() != null && lxVar.f49867r.C().f37801b0 >= lxVar.f49867r.C().f37805e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (lxVar.f49864o != 1.0f && !z11 && !z10) {
                    if (lxVar.f49867r.C() != null && lxVar.f49867r.C().f37814l0) {
                        lxVar.f49861l = true;
                    } else if (lxVar.f49867r.C() != null && !lxVar.f49867r.C().f37814l0) {
                        lxVar.f49867r.C().N(0, true, false);
                        lxVar.f49867r.C().start();
                    }
                } else {
                    lx lxVar2 = (lx) this.G.remove(i7);
                    if (lxVar.h && lxVar.f49867r.C() != null) {
                        lxVar2.f49867r.C().N(0, true, true);
                    }
                    lxVar2.f49867r.S();
                    ch.d dVar3 = lxVar2.f49859j;
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
        this.f50139n = true;
        b();
        org.telegram.messenger.ks.f(this.f50135b).c(this, org.telegram.messenger.ks.f25324y0);
        org.telegram.messenger.ks.f(this.f50135b).c(this, org.telegram.messenger.ks.W4);
        org.telegram.messenger.ks.f(this.f50135b).c(this, org.telegram.messenger.ks.f25276r);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 < arrayList.size()) {
                ((lx) arrayList.get(i7)).f49867r.Q();
                if (((lx) arrayList.get(i7)).f49859j != null) {
                    ((lx) arrayList.get(i7)).f49859j.f(this.H);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        int i7 = 0;
        this.f50139n = false;
        org.telegram.messenger.ks.f(this.f50135b).n(this, org.telegram.messenger.ks.f25324y0);
        org.telegram.messenger.ks.f(this.f50135b).n(this, org.telegram.messenger.ks.W4);
        org.telegram.messenger.ks.f(this.f50135b).n(this, org.telegram.messenger.ks.f25276r);
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 < arrayList.size()) {
                ((lx) arrayList.get(i7)).f49867r.S();
                if (((lx) arrayList.get(i7)).f49859j != null) {
                    ((lx) arrayList.get(i7)).f49859j.d(this.H);
                }
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(org.telegram.ui.Cells.r1 r1Var, bn bnVar, boolean z10) {
        TLRPC.Document V;
        if (!bnVar.y() && r1Var.getMessageObject() != null && r1Var.getMessageObject().e1() >= 0) {
            if (r1Var.getMessageObject().W3() || bnVar.f46187f != null) {
                boolean n10 = n(r1Var, -1, z10, false);
                if (z10 && n10) {
                    String V1 = r1Var.getMessageObject().V1();
                    if (!org.telegram.messenger.k6.a(V1) && !"🍑".equals(V1) && !"⚰".equals(V1) && !r1Var.getMessageObject().W3() && !r1Var.getMessageObject().F2()) {
                        try {
                            r1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!r1Var.getMessageObject().W3() && r1Var.getEffect() == null && (z10 || r1Var.getMessageObject().f24088o == null)) {
                    Integer G1 = org.telegram.messenger.mp.u1(this.f50135b).G1(this.J, this.K);
                    if ((G1 == null || G1.intValue() != 5) && this.F == null && n10) {
                        org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.f35083w;
                        if ((fcVar == null || !fcVar.f35093l) && org.telegram.messenger.bz.f23280d1 > 0 && org.telegram.messenger.i10.i(this.f50135b).e() != bnVar.f46187f.f28641id) {
                            org.telegram.messenger.bz.f23280d1--;
                            org.telegram.messenger.t0.f27013b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", org.telegram.messenger.bz.f23280d1).apply();
                            if (r1Var.getMessageObject().F2()) {
                                V = r1Var.getMessageObject().F0();
                            } else {
                                V = org.telegram.messenger.ri.d0(this.f50135b).V(r1Var.getMessageObject().V1());
                            }
                            org.telegram.ui.Components.ov0 ov0Var = new org.telegram.ui.Components.ov0(bnVar.getParentActivity(), null, 1, -1, V, bnVar.getResourceProvider());
                            ov0Var.f33735c.setVisibility(8);
                            ov0Var.f33734b.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("EmojiInteractionTapHint", null, 2131751165, bnVar.f46187f.first_name)), ov0Var.f33734b.getPaint().getFontMetricsInt(), false, null, 0));
                            ov0Var.f33734b.setTypeface(null);
                            ov0Var.f33734b.setMaxLines(3);
                            ov0Var.f33734b.setSingleLine(false);
                            m9.u uVar = new m9.u(this, org.telegram.ui.Components.fc.g(bnVar, ov0Var, 2750), false, 29);
                            this.F = uVar;
                            org.telegram.messenger.g0.h3(uVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                r1Var.getMessageObject().R = false;
                r1Var.getMessageObject().f24073k.premiumEffectWasPlayed = true;
                bnVar.getMessagesStorage().X1(this.J, r1Var.getMessageObject().f24073k);
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.L;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f28498id))) {
                return;
            }
            if (this.L == null) {
                this.L = new HashMap();
            }
            this.L.put(Long.valueOf(document.f28498id), Boolean.TRUE);
            org.telegram.messenger.ri.d0(this.f50135b).o1(org.telegram.messenger.fc.b(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.r1 r1Var) {
        ArrayList arrayList;
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        if (!messageObject.W3()) {
            String V1 = messageObject.V1();
            if (V1 == null) {
                V1 = messageObject.f24073k.message;
            }
            String p10 = p(V1);
            if (M.contains(p10) && (arrayList = (ArrayList) this.f50137e.get(p10)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i7 = 0; i7 < min; i7++) {
                    l((TLRPC.Document) arrayList.get(i7));
                }
            }
        }
    }

    public final boolean n(org.telegram.ui.Cells.r1 r1Var, int i7, boolean z10, boolean z11) {
        if (r1Var != null && this.G.size() <= 12) {
            org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
            if (r1Var.getEffect() != null || r1Var.getPhotoImage().M()) {
                String V1 = messageObject.V1();
                if (V1 == null) {
                    V1 = messageObject.f24073k.message;
                }
                if (r1Var.getEffect() != null || V1 != null) {
                    float f10 = r1Var.getPhotoImage().O0;
                    float f11 = r1Var.getPhotoImage().N0;
                    if (r1Var.getEffect() != null || (f10 > 0.0f && f11 > 0.0f)) {
                        return d(p(V1), r1Var.getMessageObject().e1(), r1Var.getMessageObject().F0(), messageObject, i7, z10, z11, f11, f10, r1Var.getMessageObject().P3());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.messenger.fj fjVar) {
        bn bnVar = this.f50134a;
        if (bnVar != null && !org.telegram.messenger.mp.u1(this.f50135b).K3() && bnVar.getParentActivity() != null) {
            org.telegram.ui.Components.ov0 ov0Var = new org.telegram.ui.Components.ov0(this.H.getContext(), null, 1, -1, fjVar.F0(), bnVar.getResourceProvider());
            ov0Var.f33734b.setText(tL_messages_stickerSet.set.title);
            ov0Var.f33735c.setText(org.telegram.messenger.gd.N0(2131746754, null));
            org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(bnVar.getParentActivity(), bnVar.getResourceProvider(), true);
            ov0Var.setButton(dcVar);
            dcVar.f34267b = new org.telegram.ui.Components.voip.o(16, this, fjVar);
            dcVar.e(org.telegram.messenger.gd.N0(2131743313, null));
            org.telegram.ui.Components.fc g10 = org.telegram.ui.Components.fc.g(bnVar, ov0Var, 2750);
            g10.f35085b = fjVar.e1();
            g10.j();
        }
    }

    public mx(bn bnVar, FrameLayout frameLayout, org.telegram.ui.Components.ek0 ek0Var, int i7, long j3, long j10) {
        this.f50134a = bnVar;
        this.H = frameLayout;
        this.I = ek0Var;
        this.f50135b = i7;
        this.J = j3;
        this.K = j10;
    }

    public void g(lx lxVar) {
    }

    public void h() {
    }
}
