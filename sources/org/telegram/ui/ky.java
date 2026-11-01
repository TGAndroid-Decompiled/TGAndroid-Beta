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
public class ky implements org.telegram.messenger.vs {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public rh D;
    public j9.u E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.uk0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final un f39016a;
    public int f39017b;
    public TLRPC.TL_messages_stickerSet f39018c;
    public boolean f39020n;
    public String f39023w;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f39019f = new HashMap();
    public final Random h = new Random();
    public int f39021r = -1;
    public long f39022s = 0;
    public final ArrayList f39024x = new ArrayList();
    public final ArrayList f39025y = new ArrayList();
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

    public ky(int i10, FrameLayout frameLayout) {
        this.G = frameLayout;
        this.f39017b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.q1 q1Var, float f7, int i10) {
        float s10 = q1Var.getPhotoImage().s() + q1Var.getY();
        if (s10 > f7 && s10 < i10) {
            return true;
        }
        return false;
    }

    public static int f() {
        float min;
        float f7;
        if (org.telegram.messenger.i0.Q1()) {
            min = org.telegram.messenger.i0.Q0();
            f7 = 0.4f;
        } else {
            Point point = org.telegram.messenger.i0.f16172q;
            min = Math.min(point.x, point.y);
            f7 = 0.5f;
        }
        return (int) ((((int) (min * f7)) * 2.0f) / org.telegram.messenger.i0.f16171p);
    }

    public static java.lang.String p(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ky.p(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.vi.b0(this.f39017b).p0("EmojiAnimations");
            this.f39018c = p02;
            if (p02 == null) {
                this.f39018c = org.telegram.messenger.vi.b0(this.f39017b).n0("EmojiAnimations");
            }
            if (this.f39018c == null) {
                org.telegram.messenger.vi.b0(this.f39017b).c1("EmojiAnimations", false, true);
            }
            if (this.f39018c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f39018c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f39018c.documents.get(i10).f19800id), this.f39018c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f39018c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f39018c.packs.get(i11);
                    if (!M.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = L;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.e;
                        hashMap2.put(str2, arrayList);
                        for (int i12 = 0; i12 < tL_stickerPack.documents.size(); i12++) {
                            arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i12)));
                        }
                        if (tL_stickerPack.emoticon.equals("❤")) {
                            String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                            for (int i13 = 0; i13 < 8; i13++) {
                                String str3 = strArr[i13];
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((jy) arrayList.get(i10)).f38592r.R();
                if (((jy) arrayList.get(i10)).f38584j != null) {
                    ((jy) arrayList.get(i10)).f38584j.d(this.G);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i10, TLRPC.Document document, org.telegram.messenger.kj kjVar, int i11, boolean z10, boolean z11, float f7, float f10, boolean z12) {
        boolean z13;
        boolean z14;
        Random random;
        long j10;
        TLRPC.Document document2;
        int intValue;
        Boolean bool;
        TLRPC.VideoSize G1;
        boolean z15;
        String str2;
        int intValue2;
        rh rhVar;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i12 = i11;
        if (kjVar != null && kjVar.W3()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (kjVar != null && kjVar.M0() != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || z13 || L.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i13 < arrayList2.size()) {
                        if (((jy) arrayList2.get(i13)).f38590p == i10) {
                            i14++;
                            if (!z14 && (((jy) arrayList2.get(i13)).f38592r.B() == null || ((jy) arrayList2.get(i13)).f38592r.B().y())) {
                                return false;
                            }
                        }
                        if (((jy) arrayList2.get(i13)).f38591q != null && document != null) {
                            if (((jy) arrayList2.get(i13)).f38591q.f19800id == document.f19800id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z10 && z13 && i14 > 0) {
                        org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32194w;
                        if (wbVar != null && wbVar.f32196b == kjVar.f1()) {
                            return false;
                        }
                        TLRPC.InputStickerSet k12 = org.telegram.messenger.kj.k1(kjVar.f16690k);
                        if (k12.short_name != null) {
                            tL_messages_stickerSet = org.telegram.messenger.vi.b0(this.f39017b).p0(k12.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = org.telegram.messenger.vi.b0(this.f39017b).o0(k12.f19814id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = k12;
                            ConnectionsManager.getInstance(this.f39017b).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.Components.t20(8, this, kjVar));
                            return false;
                        }
                        o(tL_messages_stickerSet, kjVar);
                        return false;
                    } else if (i14 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z14) {
                            TLRPC.TL_availableEffect M0 = kjVar.M0();
                            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.wp.r1(this.f39017b).E0();
                            if (E0 == null) {
                                return false;
                            }
                            j10 = 0;
                            long j11 = M0.effect_animation_id;
                            if (j11 == 0) {
                                j11 = M0.effect_sticker_id;
                            }
                            random = random2;
                            int i16 = 0;
                            while (true) {
                                if (i16 < E0.documents.size()) {
                                    document2 = E0.documents.get(i16);
                                    long j12 = j11;
                                    if (document2 != null && document2.f19800id == j12) {
                                        break;
                                    }
                                    i16++;
                                    j11 = j12;
                                } else {
                                    document2 = null;
                                    break;
                                }
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (M0.effect_sticker_id != 0) {
                                G1 = org.telegram.messenger.kj.G1(document2);
                                if (G1 != null) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                            G1 = null;
                        } else {
                            random = random2;
                            j10 = 0;
                            if (z13) {
                                document2 = kjVar.F0();
                                G1 = org.telegram.messenger.kj.G1(kjVar.F0());
                            } else {
                                if (kjVar != null && kjVar.F2()) {
                                    if (i12 >= 0 && i12 <= arrayList.size() - 1) {
                                        intValue = i12;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i17);
                                            if (document3 != null) {
                                                HashMap hashMap = this.K;
                                                if (hashMap != null) {
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f19800id));
                                                } else {
                                                    bool = null;
                                                }
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i17));
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
                                    i12 = intValue;
                                } else {
                                    if (i12 < 0 || i12 > arrayList.size() - 1) {
                                        i12 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i12);
                                }
                                G1 = null;
                            }
                        }
                        if (document2 == null && G1 == null) {
                            return false;
                        }
                        jy jyVar = new jy();
                        jyVar.h = z13;
                        jyVar.f38583i = z14;
                        if (!z14) {
                            jyVar.f38581f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            jyVar.f38582g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        jyVar.f38590p = i10;
                        jyVar.f38591q = document2;
                        jyVar.f38587m = z12;
                        ImageReceiver imageReceiver = jyVar.f38592r;
                        imageReceiver.f14409t0 = true;
                        imageReceiver.f14407s0 = z10;
                        if (org.telegram.messenger.uz.o() > 1) {
                            boolean z16 = org.telegram.messenger.v2.f18578a;
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        int i18 = i12;
                        HashMap hashMap2 = this.f39019f;
                        boolean z17 = z13;
                        if (G1 == null) {
                            int f11 = f();
                            boolean z18 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f19800id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f19800id), Integer.valueOf(i19));
                            org.telegram.messenger.jc b10 = org.telegram.messenger.jc.b(document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i19);
                            sb2.append("_");
                            imageReceiver.f14414v1 = a1.g.p(sb2, jyVar.f38590p, "_");
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f11);
                            sb3.append("_");
                            sb3.append(f11);
                            if (!z18) {
                                str3 = "";
                            } else {
                                str3 = "_pcache";
                            }
                            sb3.append(str3);
                            jyVar.f38592r.q0(b10, sb3.toString(), null, "tgs", this.f39018c, 1);
                            imageReceiver.f14383g1 = new iy(this, jyVar, z10, kjVar);
                            if (imageReceiver.B() != null) {
                                imageReceiver.B().N(0, false, true);
                            }
                        } else {
                            boolean z19 = z15;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f19800id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f19800id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(intValue2);
                                sb4.append("_");
                                imageReceiver.f14414v1 = a1.g.p(sb4, jyVar.f38590p, "_");
                            }
                            jyVar.f38591q = document2;
                            org.telegram.messenger.jc d = org.telegram.messenger.jc.d(G1, document2);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(f12);
                            sb5.append("_");
                            sb5.append(f12);
                            if (!z19) {
                                str2 = "";
                            } else {
                                str2 = "_pcache";
                            }
                            sb5.append(str2);
                            jyVar.f38592r.q0(d, sb5.toString(), null, "tgs", this.f39018c, 1);
                        }
                        imageReceiver.E0(Integer.MAX_VALUE);
                        imageReceiver.W(0);
                        if (imageReceiver.B() != null) {
                            if (jyVar.h) {
                                imageReceiver.B().N(0, false, true);
                            }
                            imageReceiver.B().start();
                        }
                        arrayList2.add(jyVar);
                        imageReceiver.P();
                        FrameLayout frameLayout = this.G;
                        imageReceiver.H0(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z17 && org.telegram.messenger.e20.i(this.f39017b).f15524n != this.I) {
                            int i20 = this.f39021r;
                            if (i20 != 0 && i20 != i10 && (rhVar = this.D) != null) {
                                org.telegram.messenger.i0.r(rhVar);
                                this.D.run();
                            }
                            this.f39021r = i10;
                            this.f39023w = str;
                            int i21 = (this.f39022s > j10 ? 1 : (this.f39022s == j10 ? 0 : -1));
                            ArrayList arrayList4 = this.f39025y;
                            ArrayList arrayList5 = this.f39024x;
                            if (i21 == 0) {
                                this.f39022s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f39022s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            rh rhVar2 = this.D;
                            if (rhVar2 != null) {
                                org.telegram.messenger.i0.r(rhVar2);
                                this.D = null;
                            }
                            rh rhVar3 = new rh(this, 28);
                            this.D = rhVar3;
                            org.telegram.messenger.i0.h3(rhVar3, 500L);
                        }
                        if (z11) {
                            org.telegram.messenger.wp.r1(this.f39017b).z4(11, 0, this.I, this.J, str);
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Integer D1;
        if (i10 == org.telegram.messenger.at.f14821y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i12 = org.telegram.messenger.at.T4;
        long j10 = this.I;
        if (i10 == i12) {
            if (this.f39016a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j10 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.zb0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14772r && (D1 = org.telegram.messenger.wp.r1(this.f39017b).D1(j10, this.J)) != null && D1.intValue() == 5) {
            j9.u uVar = this.E;
            if (uVar != null) {
                org.telegram.messenger.i0.r(uVar);
            }
            this.E = null;
        }
    }

    public final void e(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        boolean z11;
        float f11;
        boolean z12;
        boolean z13;
        ImageReceiver imageReceiver;
        org.telegram.messenger.kj kjVar;
        float f12;
        if (!this.F.isEmpty()) {
            int i10 = 0;
            while (i10 < this.F.size()) {
                jy jyVar = (jy) this.F.get(i10);
                if (this.f39016a != null) {
                    jyVar.f38580c = false;
                    int i11 = 0;
                    while (true) {
                        if (i11 < this.H.getChildCount()) {
                            View childAt = this.H.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                kjVar = q1Var.getMessageObject();
                                imageReceiver = q1Var.getPhotoImage();
                            } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                                kjVar = s0Var.getMessageObject();
                                imageReceiver = s0Var.getPhotoImage();
                            } else {
                                imageReceiver = null;
                                kjVar = null;
                            }
                            if (kjVar != null && kjVar.f1() == jyVar.f38590p) {
                                jyVar.f38580c = true;
                                float x10 = childAt.getX() + this.H.getX();
                                float y3 = childAt.getY() + this.H.getY();
                                f11 = childAt.getY();
                                f7 = 3.0f;
                                float f13 = imageReceiver.M0;
                                jyVar.d = f13;
                                f10 = 2.0f;
                                jyVar.e = imageReceiver.N0;
                                if (jyVar.f38583i && (childAt instanceof org.telegram.ui.Cells.q1)) {
                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                    float f14 = (f() * org.telegram.messenger.i0.f16171p) / 1.3f;
                                    float f15 = f14 / 3.0f;
                                    jyVar.d = f15;
                                    jyVar.e = f15;
                                    float f16 = f14 / 2.0f;
                                    jyVar.f38578a = Utilities.i((q1Var2.getTimeX() + x10) - f16, org.telegram.messenger.i0.f16172q.x - f14, 0.0f);
                                    jyVar.f38579b = (q1Var2.getTimeY() + y3) - f16;
                                } else if (jyVar.h) {
                                    jyVar.f38578a = x10 + imageReceiver.K0;
                                    jyVar.f38579b = y3 + imageReceiver.L0;
                                } else {
                                    float f17 = x10 + imageReceiver.K0;
                                    float f18 = y3 + imageReceiver.L0;
                                    if (jyVar.f38587m) {
                                        f12 = ((-f13) * 2.0f) + org.telegram.messenger.i0.L(24.0f) + f17;
                                    } else {
                                        f12 = (-org.telegram.messenger.i0.L(24.0f)) + f17;
                                    }
                                    jyVar.f38578a = f12;
                                    jyVar.f38579b = f18 - imageReceiver.M0;
                                }
                            } else {
                                i11++;
                            }
                        } else {
                            f7 = 3.0f;
                            f10 = 2.0f;
                            f11 = 0.0f;
                            break;
                        }
                    }
                    if (!jyVar.f38580c || jyVar.e + f11 < this.f39016a.L9 || f11 > this.H.getMeasuredHeight() - this.f39016a.Ua) {
                        jyVar.f38588n = true;
                    }
                    if (jyVar.h) {
                        float f19 = jyVar.e / f10;
                        if (this.H.getMeasuredHeight() - f11 <= f19) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f11 - this.f39016a.L9) + f19 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            jyVar.f38588n = true;
                        }
                    }
                    if (jyVar.f38588n) {
                        float f20 = jyVar.f38589o;
                        if (f20 != 1.0f) {
                            float i12 = Utilities.i(f20 + 0.10666667f, 1.0f, 0.0f);
                            jyVar.f38589o = i12;
                            jyVar.f38592r.setAlpha(1.0f - i12);
                            this.f39016a.l1.invalidate();
                        }
                    }
                } else {
                    f7 = 3.0f;
                    f10 = 2.0f;
                    g(jyVar);
                }
                if (!jyVar.f38586l && jyVar.f38588n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (jyVar.h && !jyVar.f38583i) {
                        float f21 = jyVar.e;
                        float f22 = 1.49926f * f21;
                        float f23 = 0.0546875f * f22;
                        float f24 = (((f21 / f10) + jyVar.f38579b) - (f22 / f10)) - (0.00279f * f22);
                        if (!jyVar.f38587m) {
                            jyVar.f38592r.y0(jyVar.f38578a - f23, f24, f22, f22);
                        } else {
                            jyVar.f38592r.y0(((jyVar.f38578a + jyVar.d) - f22) + f23, f24, f22, f22);
                        }
                        if (!jyVar.f38587m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, jyVar.f38592r.r(), jyVar.f38592r.s());
                            jyVar.f38592r.h(canvas, null);
                            canvas.restore();
                        } else {
                            jyVar.f38592r.h(canvas, null);
                        }
                    } else {
                        sg.d dVar = jyVar.f38584j;
                        if (dVar != null) {
                            float f25 = jyVar.f38578a + jyVar.f38581f;
                            float f26 = jyVar.f38579b + jyVar.f38582g;
                            float f27 = jyVar.d * f7;
                            dVar.e((int) f25, (int) f26, (int) (f25 + f27), (int) (f26 + f27));
                            jyVar.f38584j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = jyVar.f38592r;
                            float f28 = jyVar.f38578a + jyVar.f38581f;
                            float f29 = jyVar.f38579b + jyVar.f38582g;
                            float f30 = jyVar.d * f7;
                            imageReceiver2.y0(f28, f29, f30, f30);
                            if (!jyVar.f38587m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, jyVar.f38592r.r(), jyVar.f38592r.s());
                                jyVar.f38592r.h(canvas, null);
                                canvas.restore();
                            } else {
                                jyVar.f38592r.h(canvas, null);
                            }
                        }
                    }
                }
                sg.d dVar2 = jyVar.f38584j;
                if (dVar2 != null) {
                    z11 = dVar2.c();
                } else if (jyVar.f38586l && jyVar.f38592r.B() != null && jyVar.f38592r.B().f25131a0 >= jyVar.f38592r.B().e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (jyVar.f38589o != 1.0f && !z11 && !z10) {
                    if (jyVar.f38592r.B() != null && jyVar.f38592r.B().f25144k0) {
                        jyVar.f38586l = true;
                    } else if (jyVar.f38592r.B() != null && !jyVar.f38592r.B().f25144k0) {
                        jyVar.f38592r.B().N(0, true, false);
                        jyVar.f38592r.B().start();
                    }
                } else {
                    jy jyVar2 = (jy) this.F.remove(i10);
                    if (jyVar.h && jyVar.f38592r.B() != null) {
                        jyVar2.f38592r.B().N(0, true, true);
                    }
                    jyVar2.f38592r.R();
                    sg.d dVar3 = jyVar2.f38584j;
                    if (dVar3 != null) {
                        dVar3.d(this.G);
                    }
                    i10--;
                }
                i10++;
            }
            if (this.F.isEmpty()) {
                h();
            }
            this.G.invalidate();
        }
    }

    public final void i() {
        this.f39020n = true;
        b();
        org.telegram.messenger.at.f(this.f39017b).c(this, org.telegram.messenger.at.f14821y0);
        org.telegram.messenger.at.f(this.f39017b).c(this, org.telegram.messenger.at.T4);
        org.telegram.messenger.at.f(this.f39017b).c(this, org.telegram.messenger.at.f14772r);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((jy) arrayList.get(i10)).f38592r.P();
                if (((jy) arrayList.get(i10)).f38584j != null) {
                    ((jy) arrayList.get(i10)).f38584j.f(this.G);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        int i10 = 0;
        this.f39020n = false;
        org.telegram.messenger.at.f(this.f39017b).n(this, org.telegram.messenger.at.f14821y0);
        org.telegram.messenger.at.f(this.f39017b).n(this, org.telegram.messenger.at.T4);
        org.telegram.messenger.at.f(this.f39017b).n(this, org.telegram.messenger.at.f14772r);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((jy) arrayList.get(i10)).f38592r.R();
                if (((jy) arrayList.get(i10)).f38584j != null) {
                    ((jy) arrayList.get(i10)).f38584j.d(this.G);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, un unVar, boolean z10) {
        TLRPC.Document T;
        if (!unVar.A() && q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() >= 0) {
            if (q1Var.getMessageObject().W3() || unVar.f42054f != null) {
                boolean n10 = n(q1Var, -1, z10, false);
                if (z10 && n10) {
                    String W1 = q1Var.getMessageObject().W1();
                    if (!org.telegram.messenger.l6.a(W1) && !"🍑".equals(W1) && !"⚰".equals(W1) && !q1Var.getMessageObject().W3() && !q1Var.getMessageObject().F2()) {
                        try {
                            q1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!q1Var.getMessageObject().W3() && q1Var.getEffect() == null && (z10 || q1Var.getMessageObject().f16704o == null)) {
                    Integer D1 = org.telegram.messenger.wp.r1(this.f39017b).D1(this.I, this.J);
                    if ((D1 == null || D1.intValue() != 5) && this.E == null && n10) {
                        org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32194w;
                        if ((wbVar == null || !wbVar.f32203l) && org.telegram.messenger.uz.f18510d1 > 0 && org.telegram.messenger.e20.i(this.f39017b).e() != unVar.f42054f.f19943id) {
                            org.telegram.messenger.uz.f18510d1--;
                            org.telegram.messenger.w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", org.telegram.messenger.uz.f18510d1).apply();
                            if (q1Var.getMessageObject().F2()) {
                                T = q1Var.getMessageObject().F0();
                            } else {
                                T = org.telegram.messenger.vi.b0(this.f39017b).T(q1Var.getMessageObject().W1());
                            }
                            org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(unVar.getParentActivity(), null, 1, -1, T, unVar.getResourceProvider());
                            gw0Var.f30256c.setVisibility(8);
                            gw0Var.f30255b.setText(org.telegram.messenger.k6.m(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("EmojiInteractionTapHint", null, 2131751178, unVar.f42054f.first_name)), gw0Var.f30255b.getPaint().getFontMetricsInt(), false, null, 0));
                            gw0Var.f30255b.setTypeface(null);
                            gw0Var.f30255b.setMaxLines(3);
                            gw0Var.f30255b.setSingleLine(false);
                            j9.u uVar = new j9.u(this, org.telegram.ui.Components.wb.g(unVar, gw0Var, 2750), false, 27);
                            this.E = uVar;
                            org.telegram.messenger.i0.h3(uVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                q1Var.getMessageObject().R = false;
                q1Var.getMessageObject().f16690k.premiumEffectWasPlayed = true;
                unVar.getMessagesStorage().X1(this.I, q1Var.getMessageObject().f16690k);
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.K;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f19800id))) {
                return;
            }
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.f19800id), Boolean.TRUE);
            org.telegram.messenger.vi.b0(this.f39017b).l1(org.telegram.messenger.jc.b(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.q1 q1Var) {
        ArrayList arrayList;
        org.telegram.messenger.kj messageObject = q1Var.getMessageObject();
        if (!messageObject.W3()) {
            String W1 = messageObject.W1();
            if (W1 == null) {
                W1 = messageObject.f16690k.message;
            }
            String p5 = p(W1);
            if (L.contains(p5) && (arrayList = (ArrayList) this.e.get(p5)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    l((TLRPC.Document) arrayList.get(i10));
                }
            }
        }
    }

    public final boolean n(org.telegram.ui.Cells.q1 q1Var, int i10, boolean z10, boolean z11) {
        if (q1Var != null && this.F.size() <= 12) {
            org.telegram.messenger.kj messageObject = q1Var.getMessageObject();
            if (q1Var.getEffect() != null || q1Var.getPhotoImage().L()) {
                String W1 = messageObject.W1();
                if (W1 == null) {
                    W1 = messageObject.f16690k.message;
                }
                if (q1Var.getEffect() != null || W1 != null) {
                    float f7 = q1Var.getPhotoImage().N0;
                    float f10 = q1Var.getPhotoImage().M0;
                    if (q1Var.getEffect() != null || (f7 > 0.0f && f10 > 0.0f)) {
                        return d(p(W1), q1Var.getMessageObject().f1(), q1Var.getMessageObject().F0(), messageObject, i10, z10, z11, f10, f7, q1Var.getMessageObject().P3());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.messenger.kj kjVar) {
        un unVar = this.f39016a;
        if (unVar != null && !org.telegram.messenger.wp.r1(this.f39017b).A3() && unVar.getParentActivity() != null) {
            org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(this.G.getContext(), null, 1, -1, kjVar.F0(), unVar.getResourceProvider());
            gw0Var.f30255b.setText(tL_messages_stickerSet.set.title);
            gw0Var.f30256c.setText(org.telegram.messenger.dd.L0(2131746963, null));
            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(unVar.getParentActivity(), unVar.getResourceProvider(), true);
            gw0Var.setButton(ubVar);
            ubVar.f30924b = new org.telegram.ui.Components.voip.u(13, this, kjVar);
            ubVar.e(org.telegram.messenger.dd.L0(2131743589, null));
            org.telegram.ui.Components.wb g10 = org.telegram.ui.Components.wb.g(unVar, gw0Var, 2750);
            g10.f32196b = kjVar.f1();
            g10.j();
        }
    }

    public ky(un unVar, FrameLayout frameLayout, org.telegram.ui.Components.uk0 uk0Var, int i10, long j10, long j11) {
        this.f39016a = unVar;
        this.G = frameLayout;
        this.H = uk0Var;
        this.f39017b = i10;
        this.I = j10;
        this.J = j11;
    }

    public void g(jy jyVar) {
    }

    public void h() {
    }
}
