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
public class ix implements org.telegram.messenger.ls {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public bh D;
    public fx E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.pj0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final an f46762a;
    public int f46763b;
    public TLRPC.TL_messages_stickerSet f46764c;
    public boolean f46767n;
    public String f46770w;
    public boolean d = false;
    public final HashMap f46765e = new HashMap();
    public final HashMap f46766f = new HashMap();
    public final Random h = new Random();
    public int f46768r = -1;
    public long f46769s = 0;
    public final ArrayList f46771x = new ArrayList();
    public final ArrayList f46772y = new ArrayList();
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

    public ix(int i7, FrameLayout frameLayout) {
        this.G = frameLayout;
        this.f46763b = i7;
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
            Point point = org.telegram.messenger.g0.f22563q;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        return (int) ((((int) (min * f10)) * 2.0f) / org.telegram.messenger.g0.f22562p);
    }

    public static java.lang.String p(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ix.p(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(this.f46763b).p0("EmojiAnimations");
            this.f46764c = p02;
            if (p02 == null) {
                this.f46764c = org.telegram.messenger.ui.b0(this.f46763b).n0("EmojiAnimations");
            }
            if (this.f46764c == null) {
                org.telegram.messenger.ui.b0(this.f46763b).c1("EmojiAnimations", false, true);
            }
            if (this.f46764c != null) {
                HashMap hashMap = new HashMap();
                for (int i7 = 0; i7 < this.f46764c.documents.size(); i7++) {
                    hashMap.put(Long.valueOf(this.f46764c.documents.get(i7).f26962id), this.f46764c.documents.get(i7));
                }
                for (int i10 = 0; i10 < this.f46764c.packs.size(); i10++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f46764c.packs.get(i10);
                    if (!M.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = L;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.f46765e;
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
                ((hx) arrayList.get(i7)).f46518r.R();
                if (((hx) arrayList.get(i7)).f46510j != null) {
                    ((hx) arrayList.get(i7)).f46510j.d(this.G);
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
        TLRPC.VideoSize G1;
        boolean z14;
        String str2;
        int intValue2;
        bh bhVar;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i11 = i10;
        if (ijVar != null && ijVar.X3()) {
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
            ArrayList arrayList = (ArrayList) this.f46765e.get(str);
            if (z13 || ((arrayList != null && !arrayList.isEmpty()) || z12)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i12 < arrayList2.size()) {
                        if (((hx) arrayList2.get(i12)).f46516p == i7) {
                            i13++;
                            if (!z13 && (((hx) arrayList2.get(i12)).f46518r.B() == null || ((hx) arrayList2.get(i12)).f46518r.B().y())) {
                                return false;
                            }
                        }
                        if (((hx) arrayList2.get(i12)).f46517q != null && document != null) {
                            if (((hx) arrayList2.get(i12)).f46517q.f26962id == document.f26962id) {
                                i14++;
                            }
                        }
                        i12++;
                    } else if (z9 && z12 && i13 > 0) {
                        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32537w;
                        if (ccVar != null && ccVar.f32539b == ijVar.f1()) {
                            return false;
                        }
                        TLRPC.InputStickerSet k12 = org.telegram.messenger.ij.k1(ijVar.f23262k);
                        if (k12.short_name != null) {
                            tL_messages_stickerSet = org.telegram.messenger.ui.b0(this.f46763b).p0(k12.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = org.telegram.messenger.ui.b0(this.f46763b).o0(k12.f26976id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = k12;
                            ConnectionsManager.getInstance(this.f46763b).sendRequest(tL_messages_getStickerSet, new ld(24, this, ijVar));
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
                            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.qp.s1(this.f46763b).E0();
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
                                    if (document2 != null && document2.f26962id == j11) {
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
                                G1 = org.telegram.messenger.ij.G1(document2);
                                if (G1 != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            }
                            G1 = null;
                        } else {
                            random = random2;
                            j3 = 0;
                            if (z12) {
                                document2 = ijVar.F0();
                                G1 = org.telegram.messenger.ij.G1(ijVar.F0());
                            } else {
                                if (ijVar != null && ijVar.G2()) {
                                    if (i11 >= 0 && i11 <= arrayList.size() - 1) {
                                        intValue = i11;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                                            if (document3 != null) {
                                                HashMap hashMap = this.K;
                                                if (hashMap != null) {
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f26962id));
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
                                G1 = null;
                            }
                        }
                        if (document2 == null && G1 == null) {
                            return false;
                        }
                        hx hxVar = new hx();
                        hxVar.h = z12;
                        hxVar.f46509i = z13;
                        if (!z13) {
                            hxVar.f46507f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            hxVar.f46508g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        hxVar.f46516p = i7;
                        hxVar.f46517q = document2;
                        hxVar.f46513m = z11;
                        ImageReceiver imageReceiver = hxVar.f46518r;
                        imageReceiver.f21220t0 = true;
                        imageReceiver.f21218s0 = z9;
                        if (org.telegram.messenger.iz.o() > 1) {
                            boolean z15 = org.telegram.messenger.r2.f25212a;
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        int i17 = i11;
                        HashMap hashMap2 = this.f46766f;
                        boolean z16 = z12;
                        if (G1 == null) {
                            int f12 = f();
                            boolean z17 = z14;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f26962id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i18 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f26962id), Integer.valueOf(i18));
                            org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i18);
                            sb2.append("_");
                            imageReceiver.f21225v1 = a8.p0.n(hxVar.f46516p, "_", sb2);
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
                            hxVar.f46518r.q0(b10, sb3.toString(), null, "tgs", this.f46764c, 1);
                            imageReceiver.f21195g1 = new gx(this, hxVar, z9, ijVar);
                            if (imageReceiver.B() != null) {
                                imageReceiver.B().N(0, false, true);
                            }
                        } else {
                            boolean z18 = z14;
                            int f13 = f();
                            if (i14 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f26962id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f26962id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(intValue2);
                                sb4.append("_");
                                imageReceiver.f21225v1 = a8.p0.n(hxVar.f46516p, "_", sb4);
                            }
                            hxVar.f46517q = document2;
                            org.telegram.messenger.hc d = org.telegram.messenger.hc.d(G1, document2);
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
                            hxVar.f46518r.q0(d, sb5.toString(), null, "tgs", this.f46764c, 1);
                        }
                        imageReceiver.E0(Integer.MAX_VALUE);
                        imageReceiver.W(0);
                        if (imageReceiver.B() != null) {
                            if (hxVar.h) {
                                imageReceiver.B().N(0, false, true);
                            }
                            imageReceiver.B().start();
                        }
                        arrayList2.add(hxVar);
                        imageReceiver.P();
                        FrameLayout frameLayout = this.G;
                        imageReceiver.H0(frameLayout);
                        frameLayout.invalidate();
                        if (z9 && !z16 && org.telegram.messenger.p10.i(this.f46763b).f24489n != this.I) {
                            int i19 = this.f46768r;
                            if (i19 != 0 && i19 != i7 && (bhVar = this.D) != null) {
                                org.telegram.messenger.g0.r(bhVar);
                                this.D.run();
                            }
                            this.f46768r = i7;
                            this.f46770w = str;
                            int i20 = (this.f46769s > j3 ? 1 : (this.f46769s == j3 ? 0 : -1));
                            ArrayList arrayList4 = this.f46772y;
                            ArrayList arrayList5 = this.f46771x;
                            if (i20 == 0) {
                                this.f46769s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i17));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f46769s));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            bh bhVar2 = this.D;
                            if (bhVar2 != null) {
                                org.telegram.messenger.g0.r(bhVar2);
                                this.D = null;
                            }
                            bh bhVar3 = new bh(this, 27);
                            this.D = bhVar3;
                            org.telegram.messenger.g0.i3(bhVar3, 500L);
                        }
                        if (z10) {
                            org.telegram.messenger.qp.s1(this.f46763b).C4(11, 0, this.I, this.J, str);
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
        if (i7 == org.telegram.messenger.qs.f25111y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i11 = org.telegram.messenger.qs.T4;
        long j3 = this.I;
        if (i7 == i11) {
            if (this.f46762a != null) {
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
        } else if (i7 == org.telegram.messenger.qs.f25063r && (E1 = org.telegram.messenger.qp.s1(this.f46763b).E1(j3, this.J)) != null && E1.intValue() == 5) {
            fx fxVar = this.E;
            if (fxVar != null) {
                org.telegram.messenger.g0.r(fxVar);
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
                hx hxVar = (hx) this.F.get(i7);
                if (this.f46762a != null) {
                    hxVar.f46505c = false;
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
                            if (ijVar != null && ijVar.f1() == hxVar.f46516p) {
                                hxVar.f46505c = true;
                                float x10 = childAt.getX() + this.H.getX();
                                float y10 = childAt.getY() + this.H.getY();
                                f12 = childAt.getY();
                                f10 = 3.0f;
                                float f14 = imageReceiver.M0;
                                hxVar.d = f14;
                                f11 = 2.0f;
                                hxVar.f46506e = imageReceiver.N0;
                                if (hxVar.f46509i && (childAt instanceof org.telegram.ui.Cells.q1)) {
                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                    float f15 = (f() * org.telegram.messenger.g0.f22562p) / 1.3f;
                                    float f16 = f15 / 3.0f;
                                    hxVar.d = f16;
                                    hxVar.f46506e = f16;
                                    float f17 = f15 / 2.0f;
                                    hxVar.f46503a = Utilities.i((q1Var2.getTimeX() + x10) - f17, org.telegram.messenger.g0.f22563q.x - f15, 0.0f);
                                    hxVar.f46504b = (q1Var2.getTimeY() + y10) - f17;
                                } else if (hxVar.h) {
                                    hxVar.f46503a = x10 + imageReceiver.K0;
                                    hxVar.f46504b = y10 + imageReceiver.L0;
                                } else {
                                    float f18 = x10 + imageReceiver.K0;
                                    float f19 = y10 + imageReceiver.L0;
                                    if (hxVar.f46513m) {
                                        f13 = ((-f14) * 2.0f) + org.telegram.messenger.g0.L(24.0f) + f18;
                                    } else {
                                        f13 = (-org.telegram.messenger.g0.L(24.0f)) + f18;
                                    }
                                    hxVar.f46503a = f13;
                                    hxVar.f46504b = f19 - imageReceiver.M0;
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
                    if (!hxVar.f46505c || hxVar.f46506e + f12 < this.f46762a.L9 || f12 > this.H.getMeasuredHeight() - this.f46762a.Ua) {
                        hxVar.f46514n = true;
                    }
                    if (hxVar.h) {
                        float f20 = hxVar.f46506e / f11;
                        if (this.H.getMeasuredHeight() - f12 <= f20) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((f12 - this.f46762a.L9) + f20 <= 0.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 || z12) {
                            hxVar.f46514n = true;
                        }
                    }
                    if (hxVar.f46514n) {
                        float f21 = hxVar.f46515o;
                        if (f21 != 1.0f) {
                            float i11 = Utilities.i(f21 + 0.10666667f, 1.0f, 0.0f);
                            hxVar.f46515o = i11;
                            hxVar.f46518r.setAlpha(1.0f - i11);
                            this.f46762a.l1.invalidate();
                        }
                    }
                } else {
                    f10 = 3.0f;
                    f11 = 2.0f;
                    g(hxVar);
                }
                if (!hxVar.f46512l && hxVar.f46514n) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    if (hxVar.h && !hxVar.f46509i) {
                        float f22 = hxVar.f46506e;
                        float f23 = 1.49926f * f22;
                        float f24 = 0.0546875f * f23;
                        float f25 = (((f22 / f11) + hxVar.f46504b) - (f23 / f11)) - (0.00279f * f23);
                        if (!hxVar.f46513m) {
                            hxVar.f46518r.y0(hxVar.f46503a - f24, f25, f23, f23);
                        } else {
                            hxVar.f46518r.y0(((hxVar.f46503a + hxVar.d) - f23) + f24, f25, f23, f23);
                        }
                        if (!hxVar.f46513m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, hxVar.f46518r.r(), hxVar.f46518r.s());
                            hxVar.f46518r.h(canvas, null);
                            canvas.restore();
                        } else {
                            hxVar.f46518r.h(canvas, null);
                        }
                    } else {
                        ch.d dVar = hxVar.f46510j;
                        if (dVar != null) {
                            float f26 = hxVar.f46503a + hxVar.f46507f;
                            float f27 = hxVar.f46504b + hxVar.f46508g;
                            float f28 = hxVar.d * f10;
                            dVar.e((int) f26, (int) f27, (int) (f26 + f28), (int) (f27 + f28));
                            hxVar.f46510j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = hxVar.f46518r;
                            float f29 = hxVar.f46503a + hxVar.f46507f;
                            float f30 = hxVar.f46504b + hxVar.f46508g;
                            float f31 = hxVar.d * f10;
                            imageReceiver2.y0(f29, f30, f31, f31);
                            if (!hxVar.f46513m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, hxVar.f46518r.r(), hxVar.f46518r.s());
                                hxVar.f46518r.h(canvas, null);
                                canvas.restore();
                            } else {
                                hxVar.f46518r.h(canvas, null);
                            }
                        }
                    }
                }
                ch.d dVar2 = hxVar.f46510j;
                if (dVar2 != null) {
                    z10 = dVar2.c();
                } else if (hxVar.f46512l && hxVar.f46518r.B() != null && hxVar.f46518r.B().f40989a0 >= hxVar.f46518r.B().f40995e[0] - 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (hxVar.f46515o != 1.0f && !z10 && !z9) {
                    if (hxVar.f46518r.B() != null && hxVar.f46518r.B().f41003k0) {
                        hxVar.f46512l = true;
                    } else if (hxVar.f46518r.B() != null && !hxVar.f46518r.B().f41003k0) {
                        hxVar.f46518r.B().N(0, true, false);
                        hxVar.f46518r.B().start();
                    }
                } else {
                    hx hxVar2 = (hx) this.F.remove(i7);
                    if (hxVar.h && hxVar.f46518r.B() != null) {
                        hxVar2.f46518r.B().N(0, true, true);
                    }
                    hxVar2.f46518r.R();
                    ch.d dVar3 = hxVar2.f46510j;
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
        this.f46767n = true;
        b();
        org.telegram.messenger.qs.f(this.f46763b).c(this, org.telegram.messenger.qs.f25111y0);
        org.telegram.messenger.qs.f(this.f46763b).c(this, org.telegram.messenger.qs.T4);
        org.telegram.messenger.qs.f(this.f46763b).c(this, org.telegram.messenger.qs.f25063r);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i7 < arrayList.size()) {
                ((hx) arrayList.get(i7)).f46518r.P();
                if (((hx) arrayList.get(i7)).f46510j != null) {
                    ((hx) arrayList.get(i7)).f46510j.f(this.G);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        int i7 = 0;
        this.f46767n = false;
        org.telegram.messenger.qs.f(this.f46763b).n(this, org.telegram.messenger.qs.f25111y0);
        org.telegram.messenger.qs.f(this.f46763b).n(this, org.telegram.messenger.qs.T4);
        org.telegram.messenger.qs.f(this.f46763b).n(this, org.telegram.messenger.qs.f25063r);
        while (true) {
            ArrayList arrayList = this.F;
            if (i7 < arrayList.size()) {
                ((hx) arrayList.get(i7)).f46518r.R();
                if (((hx) arrayList.get(i7)).f46510j != null) {
                    ((hx) arrayList.get(i7)).f46510j.d(this.G);
                }
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, an anVar, boolean z9) {
        TLRPC.Document T;
        if (!anVar.z() && q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() >= 0) {
            if (q1Var.getMessageObject().X3() || anVar.f43791f != null) {
                boolean n10 = n(q1Var, -1, z9, false);
                if (z9 && n10) {
                    String W1 = q1Var.getMessageObject().W1();
                    if (!org.telegram.messenger.j6.a(W1) && !"🍑".equals(W1) && !"⚰".equals(W1) && !q1Var.getMessageObject().X3() && !q1Var.getMessageObject().G2()) {
                        try {
                            q1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!q1Var.getMessageObject().X3() && q1Var.getEffect() == null && (z9 || q1Var.getMessageObject().f23275o == null)) {
                    Integer E1 = org.telegram.messenger.qp.s1(this.f46763b).E1(this.I, this.J);
                    if ((E1 == null || E1.intValue() != 5) && this.E == null && n10) {
                        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32537w;
                        if ((ccVar == null || !ccVar.f32547l) && org.telegram.messenger.iz.f23395d1 > 0 && org.telegram.messenger.p10.i(this.f46763b).e() != anVar.f43791f.f27105id) {
                            org.telegram.messenger.iz.f23395d1--;
                            org.telegram.messenger.t0.f25566b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", org.telegram.messenger.iz.f23395d1).apply();
                            if (q1Var.getMessageObject().G2()) {
                                T = q1Var.getMessageObject().F0();
                            } else {
                                T = org.telegram.messenger.ui.b0(this.f46763b).T(q1Var.getMessageObject().W1());
                            }
                            org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(anVar.getParentActivity(), null, 1, -1, T, anVar.getResourceProvider());
                            cv0Var.f40641c.setVisibility(8);
                            cv0Var.f40640b.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("EmojiInteractionTapHint", null, 2131751178, anVar.f43791f.first_name)), cv0Var.f40640b.getPaint().getFontMetricsInt(), false, null, 0));
                            cv0Var.f40640b.setTypeface(null);
                            cv0Var.f40640b.setMaxLines(3);
                            cv0Var.f40640b.setSingleLine(false);
                            fx fxVar = new fx(0, this, org.telegram.ui.Components.cc.g(anVar, cv0Var, 2750));
                            this.E = fxVar;
                            org.telegram.messenger.g0.i3(fxVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                q1Var.getMessageObject().R = false;
                q1Var.getMessageObject().f23262k.premiumEffectWasPlayed = true;
                anVar.getMessagesStorage().X1(this.I, q1Var.getMessageObject().f23262k);
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.K;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f26962id))) {
                return;
            }
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.f26962id), Boolean.TRUE);
            org.telegram.messenger.ui.b0(this.f46763b).l1(org.telegram.messenger.hc.b(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.q1 q1Var) {
        ArrayList arrayList;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (!messageObject.X3()) {
            String W1 = messageObject.W1();
            if (W1 == null) {
                W1 = messageObject.f23262k.message;
            }
            String p10 = p(W1);
            if (L.contains(p10) && (arrayList = (ArrayList) this.f46765e.get(p10)) != null && !arrayList.isEmpty()) {
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
                String W1 = messageObject.W1();
                if (W1 == null) {
                    W1 = messageObject.f23262k.message;
                }
                if (q1Var.getEffect() != null || W1 != null) {
                    float f10 = q1Var.getPhotoImage().N0;
                    float f11 = q1Var.getPhotoImage().M0;
                    if (q1Var.getEffect() != null || (f10 > 0.0f && f11 > 0.0f)) {
                        return d(p(W1), q1Var.getMessageObject().f1(), q1Var.getMessageObject().F0(), messageObject, i7, z9, z10, f11, f10, q1Var.getMessageObject().Q3());
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
        an anVar = this.f46762a;
        if (anVar != null && !org.telegram.messenger.qp.s1(this.f46763b).D3() && anVar.getParentActivity() != null) {
            org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(this.G.getContext(), null, 1, -1, ijVar.F0(), anVar.getResourceProvider());
            cv0Var.f40640b.setText(tL_messages_stickerSet.set.title);
            cv0Var.f40641c.setText(org.telegram.messenger.id.M0(2131746949, null));
            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(anVar.getParentActivity(), anVar.getResourceProvider(), true);
            cv0Var.setButton(acVar);
            acVar.f31765b = new org.telegram.ui.Components.l51(19, this, ijVar);
            acVar.e(org.telegram.messenger.id.M0(2131743566, null));
            org.telegram.ui.Components.cc g10 = org.telegram.ui.Components.cc.g(anVar, cv0Var, 2750);
            g10.f32539b = ijVar.f1();
            g10.j();
        }
    }

    public ix(an anVar, FrameLayout frameLayout, org.telegram.ui.Components.pj0 pj0Var, int i7, long j3, long j10) {
        this.f46762a = anVar;
        this.G = frameLayout;
        this.H = pj0Var;
        this.f46763b = i7;
        this.I = j3;
        this.J = j10;
    }

    public void g(hx hxVar) {
    }

    public void h() {
    }
}
