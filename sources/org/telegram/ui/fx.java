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
public class fx implements org.telegram.messenger.cs {
    public static final HashSet M = new HashSet();
    public static final HashSet N;
    public xg E;
    public l9.u F;
    public final FrameLayout H;
    public final org.telegram.ui.Components.tj0 I;
    public final long J;
    public final long K;
    public HashMap L;
    public final wm f45385a;
    public int f45386b;
    public TLRPC.TL_messages_stickerSet f45387c;
    public boolean f45390n;
    public String f45393w;
    public boolean d = false;
    public final HashMap f45388e = new HashMap();
    public final HashMap f45389f = new HashMap();
    public final Random h = new Random();
    public int f45391r = -1;
    public long f45392s = 0;
    public final ArrayList f45394x = new ArrayList();
    public final ArrayList f45395y = new ArrayList();
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

    public fx(int i3, FrameLayout frameLayout) {
        this.H = frameLayout;
        this.f45386b = i3;
    }

    public static boolean a(org.telegram.ui.Cells.q1 q1Var, float f10, int i3) {
        float s6 = q1Var.getPhotoImage().s() + q1Var.getY();
        if (s6 > f10 && s6 < i3) {
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
            Point point = org.telegram.messenger.g0.f22608q;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        return (int) ((((int) (min * f10)) * 2.0f) / org.telegram.messenger.g0.f22607p);
    }

    public static java.lang.String p(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fx.p(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.li.b0(this.f45386b).p0("EmojiAnimations");
            this.f45387c = p02;
            if (p02 == null) {
                this.f45387c = org.telegram.messenger.li.b0(this.f45386b).n0("EmojiAnimations");
            }
            if (this.f45387c == null) {
                org.telegram.messenger.li.b0(this.f45386b).c1("EmojiAnimations", false, true);
            }
            if (this.f45387c != null) {
                HashMap hashMap = new HashMap();
                for (int i3 = 0; i3 < this.f45387c.documents.size(); i3++) {
                    hashMap.put(Long.valueOf(this.f45387c.documents.get(i3).f27007id), this.f45387c.documents.get(i3));
                }
                for (int i10 = 0; i10 < this.f45387c.packs.size(); i10++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f45387c.packs.get(i10);
                    if (!N.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = M;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.f45388e;
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
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i3 < arrayList.size()) {
                ((ex) arrayList.get(i3)).f45078r.R();
                if (((ex) arrayList.get(i3)).f45070j != null) {
                    ((ex) arrayList.get(i3)).f45070j.d(this.H);
                }
                i3++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i3, TLRPC.Document document, org.telegram.messenger.zi ziVar, int i10, boolean z10, boolean z11, float f10, float f11, boolean z12) {
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
        xg xgVar;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i11 = i10;
        if (ziVar != null && ziVar.X3()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (ziVar != null && ziVar.M0() != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || z13 || M.contains(str)) {
            ArrayList arrayList = (ArrayList) this.f45388e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    if (i12 < arrayList2.size()) {
                        if (((ex) arrayList2.get(i12)).f45076p == i3) {
                            i13++;
                            if (!z14 && (((ex) arrayList2.get(i12)).f45078r.B() == null || ((ex) arrayList2.get(i12)).f45078r.B().y())) {
                                return false;
                            }
                        }
                        if (((ex) arrayList2.get(i12)).f45077q != null && document != null) {
                            if (((ex) arrayList2.get(i12)).f45077q.f27007id == document.f27007id) {
                                i14++;
                            }
                        }
                        i12++;
                    } else if (z10 && z13 && i13 > 0) {
                        org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
                        if (acVar != null && acVar.f31786b == ziVar.f1()) {
                            return false;
                        }
                        TLRPC.InputStickerSet k1 = org.telegram.messenger.zi.k1(ziVar.f26868k);
                        if (k1.short_name != null) {
                            tL_messages_stickerSet = org.telegram.messenger.li.b0(this.f45386b).p0(k1.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = org.telegram.messenger.li.b0(this.f45386b).o0(k1.f27021id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = k1;
                            ConnectionsManager.getInstance(this.f45386b).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.ActionBar.h6(27, this, ziVar));
                            return false;
                        }
                        o(tL_messages_stickerSet, ziVar);
                        return false;
                    } else if (i13 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z14) {
                            TLRPC.TL_availableEffect M0 = ziVar.M0();
                            j10 = 0;
                            TLRPC.messages_AvailableEffects E0 = org.telegram.messenger.hp.s1(this.f45386b).E0();
                            if (E0 == null) {
                                return false;
                            }
                            random = random2;
                            long j11 = M0.effect_animation_id;
                            if (j11 == 0) {
                                j11 = M0.effect_sticker_id;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < E0.documents.size()) {
                                    document2 = E0.documents.get(i15);
                                    long j12 = j11;
                                    if (document2 != null && document2.f27007id == j12) {
                                        break;
                                    }
                                    i15++;
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
                                G1 = org.telegram.messenger.zi.G1(document2);
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
                                document2 = ziVar.F0();
                                G1 = org.telegram.messenger.zi.G1(ziVar.F0());
                            } else {
                                if (ziVar != null && ziVar.G2()) {
                                    if (i11 >= 0 && i11 <= arrayList.size() - 1) {
                                        intValue = i11;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                                            if (document3 != null) {
                                                HashMap hashMap = this.L;
                                                if (hashMap != null) {
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f27007id));
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
                                    i11 = intValue;
                                    document2 = (TLRPC.Document) arrayList.get(intValue);
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
                        ex exVar = new ex();
                        exVar.h = z13;
                        exVar.f45069i = z14;
                        if (!z14) {
                            exVar.f45067f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            exVar.f45068g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        exVar.f45076p = i3;
                        exVar.f45077q = document2;
                        exVar.f45073m = z12;
                        ImageReceiver imageReceiver = exVar.f45078r;
                        imageReceiver.f21272u0 = true;
                        imageReceiver.f21270t0 = z10;
                        if (org.telegram.messenger.az.o() > 1) {
                            boolean z16 = org.telegram.messenger.r2.f25040a;
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        int i17 = i11;
                        HashMap hashMap2 = this.f45389f;
                        boolean z17 = z13;
                        if (G1 == null) {
                            int f12 = f();
                            boolean z18 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f27007id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i18 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f27007id), Integer.valueOf(i18));
                            org.telegram.messenger.ac b10 = org.telegram.messenger.ac.b(document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i18);
                            sb2.append("_");
                            imageReceiver.f21278w1 = a1.g.o(exVar.f45076p, "_", sb2);
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
                            exVar.f45078r.q0(b10, sb3.toString(), null, "tgs", this.f45387c, 1);
                            imageReceiver.f21247h1 = new dx(this, exVar, z10, ziVar);
                            if (imageReceiver.B() != null) {
                                imageReceiver.B().N(0, false, true);
                            }
                        } else {
                            boolean z19 = z15;
                            int f13 = f();
                            if (i14 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f27007id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f27007id), Integer.valueOf((intValue2 + 1) % 4));
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(intValue2);
                                sb4.append("_");
                                imageReceiver.f21278w1 = a1.g.o(exVar.f45076p, "_", sb4);
                            }
                            exVar.f45077q = document2;
                            org.telegram.messenger.ac d = org.telegram.messenger.ac.d(G1, document2);
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
                            exVar.f45078r.q0(d, sb5.toString(), null, "tgs", this.f45387c, 1);
                        }
                        imageReceiver.E0(Integer.MAX_VALUE);
                        imageReceiver.W(0);
                        if (imageReceiver.B() != null) {
                            if (exVar.h) {
                                imageReceiver.B().N(0, false, true);
                            }
                            imageReceiver.B().start();
                        }
                        arrayList2.add(exVar);
                        imageReceiver.P();
                        FrameLayout frameLayout = this.H;
                        imageReceiver.H0(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z17 && org.telegram.messenger.h10.i(this.f45386b).f22848n != this.J) {
                            int i19 = this.f45391r;
                            if (i19 != 0 && i19 != i3 && (xgVar = this.E) != null) {
                                org.telegram.messenger.g0.r(xgVar);
                                this.E.run();
                            }
                            this.f45391r = i3;
                            this.f45393w = str;
                            int i20 = (this.f45392s > j10 ? 1 : (this.f45392s == j10 ? 0 : -1));
                            ArrayList arrayList4 = this.f45395y;
                            ArrayList arrayList5 = this.f45394x;
                            if (i20 == 0) {
                                this.f45392s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i17));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f45392s));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            xg xgVar2 = this.E;
                            if (xgVar2 != null) {
                                org.telegram.messenger.g0.r(xgVar2);
                                this.E = null;
                            }
                            xg xgVar3 = new xg(this, 27);
                            this.E = xgVar3;
                            org.telegram.messenger.g0.i3(xgVar3, 500L);
                        }
                        if (z11) {
                            org.telegram.messenger.hp.s1(this.f45386b).C4(11, 0, this.J, this.K, str);
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
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        Integer E1;
        if (i3 == org.telegram.messenger.hs.f23340y0) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i11 = org.telegram.messenger.hs.T4;
        long j10 = this.J;
        if (i3 == i11) {
            if (this.f45385a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j10 && M.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i12 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i13);
                                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.bb0(this, i12, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23292r && (E1 = org.telegram.messenger.hp.s1(this.f45386b).E1(j10, this.K)) != null && E1.intValue() == 5) {
            l9.u uVar = this.F;
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
        org.telegram.messenger.zi ziVar;
        float f13;
        if (!this.G.isEmpty()) {
            int i3 = 0;
            while (i3 < this.G.size()) {
                ex exVar = (ex) this.G.get(i3);
                if (this.f45385a != null) {
                    exVar.f45065c = false;
                    int i10 = 0;
                    while (true) {
                        if (i10 < this.I.getChildCount()) {
                            View childAt = this.I.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.q1) {
                                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                                ziVar = q1Var.getMessageObject();
                                imageReceiver = q1Var.getPhotoImage();
                            } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                                ziVar = t0Var.getMessageObject();
                                imageReceiver = t0Var.getPhotoImage();
                            } else {
                                imageReceiver = null;
                                ziVar = null;
                            }
                            if (ziVar != null && ziVar.f1() == exVar.f45076p) {
                                exVar.f45065c = true;
                                float x10 = childAt.getX() + this.I.getX();
                                float y9 = childAt.getY() + this.I.getY();
                                f12 = childAt.getY();
                                f10 = 3.0f;
                                float f14 = imageReceiver.N0;
                                exVar.d = f14;
                                f11 = 2.0f;
                                exVar.f45066e = imageReceiver.O0;
                                if (exVar.f45069i && (childAt instanceof org.telegram.ui.Cells.q1)) {
                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                    float f15 = (f() * org.telegram.messenger.g0.f22607p) / 1.3f;
                                    float f16 = f15 / 3.0f;
                                    exVar.d = f16;
                                    exVar.f45066e = f16;
                                    float f17 = f15 / 2.0f;
                                    exVar.f45063a = Utilities.i((q1Var2.getTimeX() + x10) - f17, org.telegram.messenger.g0.f22608q.x - f15, 0.0f);
                                    exVar.f45064b = (q1Var2.getTimeY() + y9) - f17;
                                } else if (exVar.h) {
                                    exVar.f45063a = x10 + imageReceiver.L0;
                                    exVar.f45064b = y9 + imageReceiver.M0;
                                } else {
                                    float f18 = x10 + imageReceiver.L0;
                                    float f19 = y9 + imageReceiver.M0;
                                    if (exVar.f45073m) {
                                        f13 = ((-f14) * 2.0f) + org.telegram.messenger.g0.L(24.0f) + f18;
                                    } else {
                                        f13 = (-org.telegram.messenger.g0.L(24.0f)) + f18;
                                    }
                                    exVar.f45063a = f13;
                                    exVar.f45064b = f19 - imageReceiver.N0;
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
                    if (!exVar.f45065c || exVar.f45066e + f12 < this.f45385a.M9 || f12 > this.I.getMeasuredHeight() - this.f45385a.Va) {
                        exVar.f45074n = true;
                    }
                    if (exVar.h) {
                        float f20 = exVar.f45066e / f11;
                        if (this.I.getMeasuredHeight() - f12 <= f20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f12 - this.f45385a.M9) + f20 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            exVar.f45074n = true;
                        }
                    }
                    if (exVar.f45074n) {
                        float f21 = exVar.f45075o;
                        if (f21 != 1.0f) {
                            float i11 = Utilities.i(f21 + 0.10666667f, 1.0f, 0.0f);
                            exVar.f45075o = i11;
                            exVar.f45078r.setAlpha(1.0f - i11);
                            this.f45385a.m1.invalidate();
                        }
                    }
                } else {
                    f10 = 3.0f;
                    f11 = 2.0f;
                    g(exVar);
                }
                if (!exVar.f45072l && exVar.f45074n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (exVar.h && !exVar.f45069i) {
                        float f22 = exVar.f45066e;
                        float f23 = 1.49926f * f22;
                        float f24 = 0.0546875f * f23;
                        float f25 = (((f22 / f11) + exVar.f45064b) - (f23 / f11)) - (0.00279f * f23);
                        if (!exVar.f45073m) {
                            exVar.f45078r.y0(exVar.f45063a - f24, f25, f23, f23);
                        } else {
                            exVar.f45078r.y0(((exVar.f45063a + exVar.d) - f23) + f24, f25, f23, f23);
                        }
                        if (!exVar.f45073m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, exVar.f45078r.r(), exVar.f45078r.s());
                            exVar.f45078r.h(canvas, null);
                            canvas.restore();
                        } else {
                            exVar.f45078r.h(canvas, null);
                        }
                    } else {
                        dh.d dVar = exVar.f45070j;
                        if (dVar != null) {
                            float f26 = exVar.f45063a + exVar.f45067f;
                            float f27 = exVar.f45064b + exVar.f45068g;
                            float f28 = exVar.d * f10;
                            dVar.e((int) f26, (int) f27, (int) (f26 + f28), (int) (f27 + f28));
                            exVar.f45070j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = exVar.f45078r;
                            float f29 = exVar.f45063a + exVar.f45067f;
                            float f30 = exVar.f45064b + exVar.f45068g;
                            float f31 = exVar.d * f10;
                            imageReceiver2.y0(f29, f30, f31, f31);
                            if (!exVar.f45073m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, exVar.f45078r.r(), exVar.f45078r.s());
                                exVar.f45078r.h(canvas, null);
                                canvas.restore();
                            } else {
                                exVar.f45078r.h(canvas, null);
                            }
                        }
                    }
                }
                dh.d dVar2 = exVar.f45070j;
                if (dVar2 != null) {
                    z11 = dVar2.c();
                } else if (exVar.f45072l && exVar.f45078r.B() != null && exVar.f45078r.B().f32721b0 >= exVar.f45078r.B().f32725e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (exVar.f45075o != 1.0f && !z11 && !z10) {
                    if (exVar.f45078r.B() != null && exVar.f45078r.B().f32734l0) {
                        exVar.f45072l = true;
                    } else if (exVar.f45078r.B() != null && !exVar.f45078r.B().f32734l0) {
                        exVar.f45078r.B().N(0, true, false);
                        exVar.f45078r.B().start();
                    }
                } else {
                    ex exVar2 = (ex) this.G.remove(i3);
                    if (exVar.h && exVar.f45078r.B() != null) {
                        exVar2.f45078r.B().N(0, true, true);
                    }
                    exVar2.f45078r.R();
                    dh.d dVar3 = exVar2.f45070j;
                    if (dVar3 != null) {
                        dVar3.d(this.H);
                    }
                    i3--;
                }
                i3++;
            }
            if (this.G.isEmpty()) {
                h();
            }
            this.H.invalidate();
        }
    }

    public final void i() {
        this.f45390n = true;
        b();
        org.telegram.messenger.hs.f(this.f45386b).c(this, org.telegram.messenger.hs.f23340y0);
        org.telegram.messenger.hs.f(this.f45386b).c(this, org.telegram.messenger.hs.T4);
        org.telegram.messenger.hs.f(this.f45386b).c(this, org.telegram.messenger.hs.f23292r);
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i3 < arrayList.size()) {
                ((ex) arrayList.get(i3)).f45078r.P();
                if (((ex) arrayList.get(i3)).f45070j != null) {
                    ((ex) arrayList.get(i3)).f45070j.f(this.H);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        int i3 = 0;
        this.f45390n = false;
        org.telegram.messenger.hs.f(this.f45386b).n(this, org.telegram.messenger.hs.f23340y0);
        org.telegram.messenger.hs.f(this.f45386b).n(this, org.telegram.messenger.hs.T4);
        org.telegram.messenger.hs.f(this.f45386b).n(this, org.telegram.messenger.hs.f23292r);
        while (true) {
            ArrayList arrayList = this.G;
            if (i3 < arrayList.size()) {
                ((ex) arrayList.get(i3)).f45078r.R();
                if (((ex) arrayList.get(i3)).f45070j != null) {
                    ((ex) arrayList.get(i3)).f45070j.d(this.H);
                }
                i3++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, wm wmVar, boolean z10) {
        TLRPC.Document T;
        if (!wmVar.z() && q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() >= 0) {
            if (q1Var.getMessageObject().X3() || wmVar.f51306f != null) {
                boolean n4 = n(q1Var, -1, z10, false);
                if (z10 && n4) {
                    String W1 = q1Var.getMessageObject().W1();
                    if (!org.telegram.messenger.j6.a(W1) && !"🍑".equals(W1) && !"⚰".equals(W1) && !q1Var.getMessageObject().X3() && !q1Var.getMessageObject().G2()) {
                        try {
                            q1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!q1Var.getMessageObject().X3() && q1Var.getEffect() == null && (z10 || q1Var.getMessageObject().f26881o == null)) {
                    Integer E1 = org.telegram.messenger.hp.s1(this.f45386b).E1(this.J, this.K);
                    if ((E1 == null || E1.intValue() != 5) && this.F == null && n4) {
                        org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
                        if ((acVar == null || !acVar.f31794l) && org.telegram.messenger.az.f21622d1 > 0 && org.telegram.messenger.h10.i(this.f45386b).e() != wmVar.f51306f.f27150id) {
                            org.telegram.messenger.az.f21622d1--;
                            org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", org.telegram.messenger.az.f21622d1).apply();
                            if (q1Var.getMessageObject().G2()) {
                                T = q1Var.getMessageObject().F0();
                            } else {
                                T = org.telegram.messenger.li.b0(this.f45386b).T(q1Var.getMessageObject().W1());
                            }
                            org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(wmVar.getParentActivity(), null, 1, -1, T, wmVar.getResourceProvider());
                            bv0Var.f39980c.setVisibility(8);
                            bv0Var.f39979b.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("EmojiInteractionTapHint", null, 2131751178, wmVar.f51306f.first_name)), bv0Var.f39979b.getPaint().getFontMetricsInt(), false, null, 0));
                            bv0Var.f39979b.setTypeface(null);
                            bv0Var.f39979b.setMaxLines(3);
                            bv0Var.f39979b.setSingleLine(false);
                            l9.u uVar = new l9.u(this, org.telegram.ui.Components.ac.g(wmVar, bv0Var, 2750), false, 28);
                            this.F = uVar;
                            org.telegram.messenger.g0.i3(uVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                q1Var.getMessageObject().R = false;
                q1Var.getMessageObject().f26868k.premiumEffectWasPlayed = true;
                wmVar.getMessagesStorage().X1(this.J, q1Var.getMessageObject().f26868k);
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.L;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f27007id))) {
                return;
            }
            if (this.L == null) {
                this.L = new HashMap();
            }
            this.L.put(Long.valueOf(document.f27007id), Boolean.TRUE);
            org.telegram.messenger.li.b0(this.f45386b).l1(org.telegram.messenger.ac.b(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.q1 q1Var) {
        ArrayList arrayList;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (!messageObject.X3()) {
            String W1 = messageObject.W1();
            if (W1 == null) {
                W1 = messageObject.f26868k.message;
            }
            String p10 = p(W1);
            if (M.contains(p10) && (arrayList = (ArrayList) this.f45388e.get(p10)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i3 = 0; i3 < min; i3++) {
                    l((TLRPC.Document) arrayList.get(i3));
                }
            }
        }
    }

    public final boolean n(org.telegram.ui.Cells.q1 q1Var, int i3, boolean z10, boolean z11) {
        if (q1Var != null && this.G.size() <= 12) {
            org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
            if (q1Var.getEffect() != null || q1Var.getPhotoImage().L()) {
                String W1 = messageObject.W1();
                if (W1 == null) {
                    W1 = messageObject.f26868k.message;
                }
                if (q1Var.getEffect() != null || W1 != null) {
                    float f10 = q1Var.getPhotoImage().O0;
                    float f11 = q1Var.getPhotoImage().N0;
                    if (q1Var.getEffect() != null || (f10 > 0.0f && f11 > 0.0f)) {
                        return d(p(W1), q1Var.getMessageObject().f1(), q1Var.getMessageObject().F0(), messageObject, i3, z10, z11, f11, f10, q1Var.getMessageObject().Q3());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, org.telegram.messenger.zi ziVar) {
        wm wmVar = this.f45385a;
        if (wmVar != null && !org.telegram.messenger.hp.s1(this.f45386b).D3() && wmVar.getParentActivity() != null) {
            org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(this.H.getContext(), null, 1, -1, ziVar.F0(), wmVar.getResourceProvider());
            bv0Var.f39979b.setText(tL_messages_stickerSet.set.title);
            bv0Var.f39980c.setText(org.telegram.messenger.bd.M0(2131746956, null));
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(wmVar.getParentActivity(), wmVar.getResourceProvider(), true);
            bv0Var.setButton(ybVar);
            ybVar.f40672b = new org.telegram.ui.Components.p11(24, this, ziVar);
            ybVar.e(org.telegram.messenger.bd.M0(2131743573, null));
            org.telegram.ui.Components.ac g7 = org.telegram.ui.Components.ac.g(wmVar, bv0Var, 2750);
            g7.f31786b = ziVar.f1();
            g7.j();
        }
    }

    public fx(wm wmVar, FrameLayout frameLayout, org.telegram.ui.Components.tj0 tj0Var, int i3, long j10, long j11) {
        this.f45385a = wmVar;
        this.H = frameLayout;
        this.I = tj0Var;
        this.f45386b = i3;
        this.J = j10;
        this.K = j11;
    }

    public void g(ex exVar) {
    }

    public void h() {
    }
}
