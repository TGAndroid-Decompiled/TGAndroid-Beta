package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements org.telegram.messenger.s10 {
    public final int f33747a;
    public final Object f33748b;

    public d(Object obj, int i7) {
        this.f33747a = i7;
        this.f33748b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        ar arVar = (ar) this.f33748b;
        ArrayList arrayList = (ArrayList) obj;
        p41 p41Var = (p41) obj2;
        String str = null;
        if (arVar.f33046c2 == null) {
            Context context = arVar.getContext();
            org.telegram.ui.ActionBar.e6 e6Var = arVar.J0;
            ai.r2 r2Var = new ai.r2(context, 7);
            r2Var.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624329, 112, 112, null);
            imageView.d();
            r2Var.addView((View) imageView, c8.ja.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131744438, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
            r2Var.addView(textView, c8.ja.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
            textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131743236, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            r2Var.addView(textView2, c8.ja.t(-2, -2, 1, 28, 0, 28, 17));
            arVar.f33046c2 = r2Var;
        }
        arrayList.add(b41.k(arVar.f33046c2));
        arrayList.add(b41.C(null));
        arrayList.add(b41.u(org.telegram.messenger.hd.M0(2131743431, null)));
        String str2 = arVar.X1;
        String M0 = org.telegram.messenger.hd.M0(2131743432, null);
        int i10 = zq.f42414b;
        b41 K = b41.K(zq.class);
        K.f33184l = str2;
        K.f33186n = M0;
        K.f33182j = false;
        K.f33180g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = arVar.Z1;
        String M02 = org.telegram.messenger.hd.M0(2131743433, null);
        b41 K2 = b41.K(zq.class);
        K2.f33184l = spannableStringBuilder;
        K2.f33186n = M02;
        K2.f33182j = true;
        K2.f33180g = false;
        arrayList.add(K2);
        if (arVar.f33045b2) {
            if (arVar.T1) {
                i7 = 2131743428;
            } else {
                i7 = 2131743429;
            }
            str = org.telegram.messenger.hd.M0(i7, null);
        }
        arrayList.add(b41.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        int i7;
        int i10;
        final bs bsVar = (bs) this.f33748b;
        ArrayList arrayList = (ArrayList) obj;
        p41 p41Var = (p41) obj2;
        int i11 = bsVar.Q;
        q2 q2Var = bsVar.f33368k0;
        ArrayList arrayList2 = bsVar.W;
        as asVar = bsVar.T;
        boolean z11 = bsVar.S;
        HashSet hashSet = new HashSet();
        int i12 = 0;
        if (!TextUtils.isEmpty(bsVar.f33365h0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(bsVar.U);
            arrayList3.addAll(bsVar.V);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 5 && !arrayList2.isEmpty() && !z11) {
                    String M0 = org.telegram.messenger.hd.M0(2131745822, null);
                    if (bsVar.Y) {
                        i10 = 2131745340;
                    } else {
                        i10 = 2131745339;
                    }
                    arrayList.add(b41.s(M0, org.telegram.messenger.hd.M0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    bs bsVar2 = bsVar;
                                    bsVar2.Y = !bsVar2.Y;
                                    bsVar2.O(true);
                                    return;
                                default:
                                    bs bsVar3 = bsVar;
                                    bsVar3.X = !bsVar3.X;
                                    bsVar3.O(true);
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745822, null)));
                }
                int size = arrayList3.size();
                if (!bsVar.Y && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    b41 w10 = b41.w((TLObject) arrayList3.get(i13));
                    w10.f33192t = true;
                    w10.H = q2Var;
                    arrayList.add(w10);
                }
            }
            if (!arrayList2.isEmpty() && !z11) {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745756, null)));
                int size2 = arrayList2.size();
                while (i12 < size2) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    b41 b41Var = new b41(33);
                    b41Var.G = (org.telegram.messenger.gj) obj3;
                    arrayList.add(b41Var);
                }
                if (bsVar.f33362e0) {
                    arrayList.add(b41.p(1));
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.si.b0(i11).f26496m1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                TLRPC.User a22 = org.telegram.messenger.np.s1(i11).a2(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.TL_topPeer) arrayList4.get(i14)).peer)));
                if (a22 != null && a22.bot) {
                    arrayList5.add(a22);
                }
            }
        }
        bsVar.f33358a0 = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                String M02 = org.telegram.messenger.hd.M0(2131745820, null);
                if (bsVar.X) {
                    i7 = 2131745340;
                } else {
                    i7 = 2131745339;
                }
                arrayList.add(b41.s(M02, org.telegram.messenger.hd.M0(i7, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                bs bsVar2 = bsVar;
                                bsVar2.Y = !bsVar2.Y;
                                bsVar2.O(true);
                                return;
                            default:
                                bs bsVar3 = bsVar;
                                bsVar3.X = !bsVar3.X;
                                bsVar3.O(true);
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745820, null)));
            }
            for (int i15 = 0; i15 < arrayList5.size() && (i15 < 5 || bsVar.X); i15++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i15);
                if (!hashSet.contains(Long.valueOf(user.f28200id))) {
                    hashSet.add(Long.valueOf(user.f28200id));
                    b41 w11 = b41.w(user);
                    w11.f33189q = true;
                    w11.f33192t = true;
                    w11.H = q2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        bsVar.f33359b0 = arrayList.size();
        ArrayList arrayList6 = asVar.h;
        if (!arrayList6.isEmpty()) {
            if (!z11) {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745819, null)));
            }
            boolean z12 = false;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i16);
                if (!hashSet.contains(Long.valueOf(user2.f28200id))) {
                    hashSet.add(Long.valueOf(user2.f28200id));
                    b41 w12 = b41.w(user2);
                    w12.f33189q = true;
                    w12.f33190r = true;
                    w12.f33192t = true;
                    w12.H = q2Var;
                    arrayList.add(w12);
                    z12 = true;
                }
            }
            if (asVar.f33053c || !asVar.f33054e) {
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
            }
            z10 = z12;
        } else {
            if (asVar.f33053c || !asVar.f33054e) {
                if (!z11) {
                    arrayList.add(b41.p(30));
                }
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
                arrayList.add(b41.p(29));
            }
            z10 = false;
        }
        if (z10) {
            arrayList.add(b41.C(bsVar.Z));
        }
    }

    private final void d(Object obj, Object obj2) {
        int i7;
        org.telegram.messenger.oo ooVar;
        int i10;
        final em0 em0Var = (em0) this.f33748b;
        ArrayList arrayList = (ArrayList) obj;
        p41 p41Var = (p41) obj2;
        ArrayList arrayList2 = em0Var.S;
        ArrayList arrayList3 = em0Var.Y;
        int i11 = em0Var.Q;
        int i12 = 0;
        if (TextUtils.isEmpty(em0Var.f34047e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    String M0 = org.telegram.messenger.hd.M0(2131745739, null);
                    if (em0Var.X) {
                        i10 = 2131745340;
                    } else {
                        i10 = 2131745339;
                    }
                    arrayList.add(b41.s(M0, org.telegram.messenger.hd.M0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    em0 em0Var2 = em0Var;
                                    em0Var2.X = !em0Var2.X;
                                    em0Var2.O(true);
                                    if (em0Var2.X) {
                                        org.telegram.messenger.g0.v1(em0Var2.f34373g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                                default:
                                    em0 em0Var3 = em0Var;
                                    em0Var3.W = !em0Var3.W;
                                    em0Var3.O(true);
                                    if (em0Var3.W) {
                                        org.telegram.messenger.g0.v1(em0Var3.f34373g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745739, null)));
                }
                int size = arrayList3.size();
                if (!em0Var.X) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    b41 w10 = b41.w((TLObject) arrayList3.get(i13));
                    w10.I = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.np.s1(i11).Z7;
            if (hashMap == null) {
                ooVar = null;
            } else {
                ooVar = (org.telegram.messenger.oo) hashMap.get(0L);
            }
            if (ooVar != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = ooVar.f25787b;
                int size2 = arrayList5.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj3 = arrayList5.get(i14);
                    i14++;
                    TLObject tLObject = (TLObject) obj3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        TLRPC.Chat M02 = org.telegram.messenger.np.s1(i11).M0(Long.valueOf(chat.f28051id));
                        if (org.telegram.messenger.t3.r0(chat) && (M02 == null || org.telegram.messenger.t3.r0(M02))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745711, null)));
                }
                int size3 = arrayList4.size();
                while (i12 < size3) {
                    Object obj4 = arrayList4.get(i12);
                    i12++;
                    arrayList.add(b41.w((TLRPC.Chat) obj4));
                }
                return;
            }
            arrayList.add(b41.p(30));
            arrayList.add(b41.p(29));
            arrayList.add(b41.p(29));
            arrayList.add(b41.p(29));
            arrayList.add(b41.p(29));
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = em0Var.T;
        int size4 = arrayList7.size();
        int i15 = 0;
        while (i15 < size4) {
            Object obj5 = arrayList7.get(i15);
            i15++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i16 = size4;
            TLRPC.Chat M03 = org.telegram.messenger.np.s1(i11).M0(Long.valueOf(chat2.f28051id));
            if (org.telegram.messenger.t3.r0(chat2) && (M03 == null || org.telegram.messenger.t3.r0(M03))) {
                arrayList6.add(chat2);
            }
            size4 = i16;
        }
        ArrayList arrayList8 = em0Var.U;
        int size5 = arrayList8.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj6 = arrayList8.get(i17);
            i17++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat M04 = org.telegram.messenger.np.s1(i11).M0(Long.valueOf(chat3.f28051id));
            if (org.telegram.messenger.t3.r0(chat3) && (M04 == null || org.telegram.messenger.t3.r0(M04))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = em0Var.V;
        int size6 = arrayList9.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj7 = arrayList9.get(i18);
            i18++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat M05 = org.telegram.messenger.np.s1(i11).M0(Long.valueOf(chat4.f28051id));
            if (org.telegram.messenger.t3.r0(chat4) && (M05 == null || org.telegram.messenger.t3.r0(M05))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 5 && !arrayList2.isEmpty()) {
                String M06 = org.telegram.messenger.hd.M0(2131745814, null);
                if (em0Var.W) {
                    i7 = 2131745340;
                } else {
                    i7 = 2131745339;
                }
                arrayList.add(b41.s(M06, org.telegram.messenger.hd.M0(i7, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                em0 em0Var2 = em0Var;
                                em0Var2.X = !em0Var2.X;
                                em0Var2.O(true);
                                if (em0Var2.X) {
                                    org.telegram.messenger.g0.v1(em0Var2.f34373g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                            default:
                                em0 em0Var3 = em0Var;
                                em0Var3.W = !em0Var3.W;
                                em0Var3.O(true);
                                if (em0Var3.W) {
                                    org.telegram.messenger.g0.v1(em0Var3.f34373g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745814, null)));
            }
            int size7 = arrayList6.size();
            if (!em0Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i19 = 0; i19 < size7; i19++) {
                arrayList.add(b41.w((TLObject) arrayList6.get(i19)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745756, null)));
            int size8 = arrayList2.size();
            int i20 = 0;
            while (i20 < size8) {
                Object obj8 = arrayList2.get(i20);
                i20++;
                b41 b41Var = new b41(33);
                b41Var.G = (org.telegram.messenger.gj) obj8;
                arrayList.add(b41Var);
            }
            if (em0Var.f34044b0) {
                arrayList.add(b41.p(1));
            }
        }
    }

    private final void e(Object obj, Object obj2) {
        String str;
        ly lyVar = (ly) this.f33748b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ux uxVar = lyVar.S1;
        if (uxVar != null && (uxVar.getDrawable() instanceof org.telegram.messenger.f4)) {
            org.telegram.messenger.f4 f4Var = (org.telegram.messenger.f4) lyVar.S1.getDrawable();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (f4Var.f23442c.f23663a != intValue) {
                org.telegram.messenger.g4 g4Var = f4Var.f23445g;
                if (g4Var != null) {
                    f4Var.f23442c = g4Var;
                }
                org.telegram.messenger.g4 g4Var2 = f4Var.f23442c;
                if (g4Var2.f23663a != intValue) {
                    g4Var2 = new org.telegram.messenger.g4(intValue, g4Var2.f23664b);
                }
                f4Var.f23445g = g4Var2;
                u5 u5Var = f4Var.f23443e;
                if (u5Var != null) {
                    u5Var.e(true, 0.0f);
                }
            }
            if (f4Var.d.f23663a != intValue2) {
                org.telegram.messenger.g4 g4Var3 = f4Var.h;
                if (g4Var3 != null) {
                    f4Var.d = g4Var3;
                }
                org.telegram.messenger.g4 g4Var4 = f4Var.d;
                if (g4Var4.f23663a != intValue2) {
                    g4Var4 = new org.telegram.messenger.g4(intValue2, g4Var4.f23664b);
                }
                f4Var.h = g4Var4;
                u5 u5Var2 = f4Var.f23444f;
                if (u5Var2 != null) {
                    u5Var2.e(true, 0.0f);
                }
            }
            f4Var.invalidateSelf();
            String str2 = (String) lyVar.S1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                org.telegram.messenger.j6.f24532j.remove(str2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = (String) org.telegram.messenger.h4.f24056a.get(num.intValue());
                }
                sb2.append(str);
                sb2.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = (String) org.telegram.messenger.h4.f24056a.get(num2.intValue());
                }
                sb2.append(str3);
                org.telegram.messenger.j6.f24532j.put(str2, sb2.toString());
            }
            org.telegram.messenger.j6.q();
        }
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        gy gyVar = (gy) this.f33748b;
        ArrayList arrayList = (ArrayList) obj;
        p41 p41Var = (p41) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = gyVar.F;
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            boolean z11 = true;
            if (i7 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i7);
            i7++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f28078id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f28078id, 1);
                if (tL_messages_stickerSet.set.f28078id != gyVar.d) {
                    z11 = false;
                }
                int i10 = nx.f37734b;
                b41 K = b41.K(nx.class);
                long j3 = tL_messages_stickerSet.set.f28078id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.B = j3;
                K.G = tL_messages_stickerSet;
                K.f33178e = z11;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = gyVar.K;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            ex exVar = (ex) obj4;
            TLRPC.StickerSet stickerSet = exVar.f34445c;
            if (longSparseIntArray.indexOfKey(stickerSet.f28078id) < 0) {
                longSparseIntArray.append(stickerSet.f28078id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = exVar.f34443a;
                if (stickerSet.f28078id == gyVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(nx.i(stickerSetCovered, exVar, z10));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f33748b;
        float[] fArr = FragmentContextView.X0;
        fragmentContextView.B0 = !((Boolean) obj2).booleanValue();
        MediaController B = MediaController.B();
        boolean z10 = fragmentContextView.f32556a0;
        org.telegram.ui.ActionBar.v0 v0Var = fragmentContextView.J;
        float floatValue = ((Float) obj).floatValue();
        v0Var.getClass();
        B.m0(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void h(Object obj, Object obj2) {
        p41 p41Var = (p41) obj2;
        ((ArrayList) obj).add(b41.j(-1, ((p20) this.f33748b).U1));
    }

    private final void i(Object obj, Object obj2) {
        int i7;
        w20 w20Var = (w20) this.f33748b;
        ArrayList arrayList = (ArrayList) obj;
        p41 p41Var = (p41) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        w20Var.f41236c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.na.a(w20Var.f41234a).f25183f);
        if (w20Var.f41236c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < w20Var.f41236c.size(); i10++) {
            String str = (String) w20Var.f41236c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i7 = 2131231774;
                } else {
                    i7 = 2131231830;
                }
                arrayList.add(b41.c(i10 + 1, i7, str.substring(1)));
            }
        }
        arrayList.add(b41.c(0, 2131232095, org.telegram.messenger.hd.M0(2131752089, null)));
    }

    private final void j(Object obj, Object obj2) {
        boolean z10;
        fi.d6 d6Var;
        x20 x20Var = (x20) this.f33748b;
        ArrayList arrayList = (ArrayList) obj;
        p41 p41Var = (p41) obj2;
        ArrayList arrayList2 = x20Var.R;
        int i7 = 0;
        if (x20Var.S && (d6Var = x20Var.T) != null && d6Var.f11944i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            fi.d6 d6Var2 = x20Var.T;
            int i10 = jg.j1.f17162b;
            b41 K = b41.K(jg.j1.class);
            K.G = d6Var2;
            arrayList.add(K);
        }
        x20Var.U = z10;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            b41 b41Var = new b41(33);
            b41Var.d = i11;
            b41Var.G = (org.telegram.messenger.gj) arrayList2.get(i7);
            arrayList.add(b41Var);
            i7 = i11;
        }
        if (x20Var.V || !x20Var.Y) {
            arrayList.add(b41.q(-2, 1));
            arrayList.add(b41.q(-3, 1));
            arrayList.add(b41.q(-4, 1));
        }
        if (!x20Var.U && z10) {
            org.telegram.messenger.g0.h3(new fo(x20Var, 21));
        }
    }

    private final void k(Object obj, Object obj2) {
        k60 k60Var = (k60) this.f33748b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        m60 m60Var = k60Var.f36303y;
        m60Var.f37088f.setAlpha(1.0f);
        if (m60Var.f37113u) {
            k60Var.f36295c = bitmap;
        }
        ui.b bVar = m60Var.f37102n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(m60Var.f37102n, k60Var);
            ViewGroup viewGroup = m60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        cf0 cf0Var = (cf0) this.f33748b;
        ArrayList arrayList = (ArrayList) obj;
        p41 p41Var = (p41) obj2;
        ArrayList arrayList2 = cf0Var.f33549e;
        ArrayList arrayList3 = cf0Var.f33551n;
        int i7 = 0;
        if (cf0Var.d == null) {
            arrayList.add(b41.q(-1, 7));
            arrayList.add(b41.q(-2, 7));
            arrayList.add(b41.q(-3, 7));
            cf0Var.R = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(cf0Var.f33555x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745722, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                b41 b41Var = new b41(33);
                b41Var.G = (org.telegram.messenger.gj) obj3;
                arrayList.add(b41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(b41.r(org.telegram.messenger.hd.M0(2131745723, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                b41 b41Var2 = new b41(33);
                b41Var2.G = (org.telegram.messenger.gj) obj4;
                arrayList.add(b41Var2);
            }
        }
        if (cf0Var.f33554w || ((cf0Var.N && !cf0Var.O) || (!isEmpty && !arrayList3.isEmpty() && !cf0Var.f33553s))) {
            arrayList.add(b41.q(cf0Var.M * 3, 7));
            arrayList.add(b41.q((cf0Var.M * 3) + 1, 7));
            arrayList.add(b41.q((cf0Var.M * 3) + 2, 7));
        }
        cf0Var.R = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        ok0 ok0Var = (ok0) this.f33748b;
        ok0Var.f38007c = (Bitmap) obj;
        Paint paint = new Paint(1);
        ok0Var.f38008e = paint;
        Bitmap bitmap = ok0Var.f38007c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        ok0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        ok0Var.f38009f = new Matrix();
        ui.b bVar = ok0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, ok0Var.f38012s);
        ViewGroup viewGroup = ok0Var.E;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        bw0 bw0Var = (bw0) this.f33748b;
        CharSequence charSequence = (CharSequence) obj;
        bw0Var.f33419r1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.si.Z(bw0Var.N1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.m10.f24940t0).sendRequest(tL_stickers_renameStickerSet, new v1((org.telegram.messenger.z10) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        p21 p21Var = (p21) this.f33748b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        a21 a21Var = p21Var.f38180z1;
        o21 o21Var = p21Var.I1;
        if (str != null) {
            p21Var.P1 = false;
            p21Var.A1.setText(p21Var.R0(str));
            o21Var.D(a21Var);
        } else if (p21Var.J) {
        } else {
            int i7 = 2131743946;
            if (p21Var.P1) {
                p21Var.dismiss();
                org.telegram.messenger.ns e10 = org.telegram.messenger.ns.e();
                if (bool.booleanValue()) {
                    i7 = 2131743947;
                }
                e10.k(org.telegram.messenger.ns.P4, 1, org.telegram.messenger.hd.M0(i7, null));
                return;
            }
            cc ccVar = new cc((FrameLayout) p21Var.f29682b, p21Var.J0);
            if (bool.booleanValue()) {
                i7 = 2131743947;
            }
            org.telegram.messenger.k5.o(null, i7, ccVar, null);
            l21 l21Var = p21Var.f38178x1.f37437e;
            String str2 = p21Var.f38177w1;
            p21Var.f38176v1 = str2;
            l21Var.setText(p21.O0(str2, null, null));
            o21Var.D(a21Var);
        }
    }

    @Override
    public final void a(java.lang.Object r34, java.lang.Object r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.a(java.lang.Object, java.lang.Object):void");
    }
}
