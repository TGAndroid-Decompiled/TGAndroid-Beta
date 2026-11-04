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
public final class e implements org.telegram.messenger.n10 {
    public final int f33232a;
    public final Object f33233b;

    public e(Object obj, int i3) {
        this.f33232a = i3;
        this.f33233b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i3;
        tq tqVar = (tq) this.f33233b;
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        String str = null;
        if (tqVar.Z1 == null) {
            Context context = tqVar.getContext();
            org.telegram.ui.ActionBar.e6 e6Var = tqVar.J0;
            ci.q qVar = new ci.q(context, 7);
            qVar.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624328, 112, 112, null);
            imageView.d();
            qVar.addView((View) imageView, b8.mf.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.bd.a0(null, null, 2131744448, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
            qVar.addView(textView, b8.mf.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
            textView2.setText(org.telegram.messenger.bd.a0(null, null, 2131743246, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            qVar.addView(textView2, b8.mf.t(-2, -2, 1, 28, 0, 28, 17));
            tqVar.Z1 = qVar;
        }
        arrayList.add(r31.k(tqVar.Z1));
        arrayList.add(r31.C(null));
        arrayList.add(r31.u(org.telegram.messenger.bd.M0(2131743441, null)));
        String str2 = tqVar.U1;
        String M0 = org.telegram.messenger.bd.M0(2131743442, null);
        int i10 = sq.f38107b;
        r31 K = r31.K(sq.class);
        K.f37627l = str2;
        K.f37629n = M0;
        K.f37625j = false;
        K.f37623g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = tqVar.W1;
        String M02 = org.telegram.messenger.bd.M0(2131743443, null);
        r31 K2 = r31.K(sq.class);
        K2.f37627l = spannableStringBuilder;
        K2.f37629n = M02;
        K2.f37625j = true;
        K2.f37623g = false;
        arrayList.add(K2);
        if (tqVar.Y1) {
            if (tqVar.Q1) {
                i3 = 2131743438;
            } else {
                i3 = 2131743439;
            }
            str = org.telegram.messenger.bd.M0(i3, null);
        }
        arrayList.add(r31.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        int i3;
        int i10;
        final vr vrVar = (vr) this.f33233b;
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        int i11 = vrVar.Q;
        p2 p2Var = vrVar.f39779k0;
        ArrayList arrayList2 = vrVar.W;
        ur urVar = vrVar.T;
        boolean z11 = vrVar.S;
        HashSet hashSet = new HashSet();
        int i12 = 0;
        if (!TextUtils.isEmpty(vrVar.f39776h0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(vrVar.U);
            arrayList3.addAll(vrVar.V);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 5 && !arrayList2.isEmpty() && !z11) {
                    String M0 = org.telegram.messenger.bd.M0(2131745832, null);
                    if (vrVar.Y) {
                        i10 = 2131745350;
                    } else {
                        i10 = 2131745349;
                    }
                    arrayList.add(r31.s(M0, org.telegram.messenger.bd.M0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    vr vrVar2 = vrVar;
                                    vrVar2.Y = !vrVar2.Y;
                                    vrVar2.O(true);
                                    return;
                                default:
                                    vr vrVar3 = vrVar;
                                    vrVar3.X = !vrVar3.X;
                                    vrVar3.O(true);
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745832, null)));
                }
                int size = arrayList3.size();
                if (!vrVar.Y && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    r31 w10 = r31.w((TLObject) arrayList3.get(i13));
                    w10.f37635t = true;
                    w10.H = p2Var;
                    arrayList.add(w10);
                }
            }
            if (!arrayList2.isEmpty() && !z11) {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745766, null)));
                int size2 = arrayList2.size();
                while (i12 < size2) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    r31 r31Var = new r31(33);
                    r31Var.G = (org.telegram.messenger.zi) obj3;
                    arrayList.add(r31Var);
                }
                if (vrVar.f39773e0) {
                    arrayList.add(r31.p(1));
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.li.b0(i11).m1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                TLRPC.User a22 = org.telegram.messenger.hp.s1(i11).a2(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.TL_topPeer) arrayList4.get(i14)).peer)));
                if (a22 != null && a22.bot) {
                    arrayList5.add(a22);
                }
            }
        }
        vrVar.f39769a0 = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                String M02 = org.telegram.messenger.bd.M0(2131745830, null);
                if (vrVar.X) {
                    i3 = 2131745350;
                } else {
                    i3 = 2131745349;
                }
                arrayList.add(r31.s(M02, org.telegram.messenger.bd.M0(i3, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                vr vrVar2 = vrVar;
                                vrVar2.Y = !vrVar2.Y;
                                vrVar2.O(true);
                                return;
                            default:
                                vr vrVar3 = vrVar;
                                vrVar3.X = !vrVar3.X;
                                vrVar3.O(true);
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745830, null)));
            }
            for (int i15 = 0; i15 < arrayList5.size() && (i15 < 5 || vrVar.X); i15++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i15);
                if (!hashSet.contains(Long.valueOf(user.f27150id))) {
                    hashSet.add(Long.valueOf(user.f27150id));
                    r31 w11 = r31.w(user);
                    w11.f37632q = true;
                    w11.f37635t = true;
                    w11.H = p2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        vrVar.f39770b0 = arrayList.size();
        ArrayList arrayList6 = urVar.h;
        if (!arrayList6.isEmpty()) {
            if (!z11) {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745829, null)));
            }
            boolean z12 = false;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i16);
                if (!hashSet.contains(Long.valueOf(user2.f27150id))) {
                    hashSet.add(Long.valueOf(user2.f27150id));
                    r31 w12 = r31.w(user2);
                    w12.f37632q = true;
                    w12.f37633r = true;
                    w12.f37635t = true;
                    w12.H = p2Var;
                    arrayList.add(w12);
                    z12 = true;
                }
            }
            if (urVar.f38852c || !urVar.f38853e) {
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
            }
            z10 = z12;
        } else {
            if (urVar.f38852c || !urVar.f38853e) {
                if (!z11) {
                    arrayList.add(r31.p(30));
                }
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
                arrayList.add(r31.p(29));
            }
            z10 = false;
        }
        if (z10) {
            arrayList.add(r31.C(vrVar.Z));
        }
    }

    private final void d(Object obj, Object obj2) {
        int i3;
        org.telegram.messenger.io ioVar;
        int i10;
        final dm0 dm0Var = (dm0) this.f33233b;
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        ArrayList arrayList2 = dm0Var.S;
        ArrayList arrayList3 = dm0Var.Y;
        int i11 = dm0Var.Q;
        int i12 = 0;
        if (TextUtils.isEmpty(dm0Var.f40468e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    String M0 = org.telegram.messenger.bd.M0(2131745749, null);
                    if (dm0Var.X) {
                        i10 = 2131745350;
                    } else {
                        i10 = 2131745349;
                    }
                    arrayList.add(r31.s(M0, org.telegram.messenger.bd.M0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    dm0 dm0Var2 = dm0Var;
                                    dm0Var2.X = !dm0Var2.X;
                                    dm0Var2.O(true);
                                    if (dm0Var2.X) {
                                        org.telegram.messenger.g0.v1(dm0Var2.f33164g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                                default:
                                    dm0 dm0Var3 = dm0Var;
                                    dm0Var3.W = !dm0Var3.W;
                                    dm0Var3.O(true);
                                    if (dm0Var3.W) {
                                        org.telegram.messenger.g0.v1(dm0Var3.f33164g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745749, null)));
                }
                int size = arrayList3.size();
                if (!dm0Var.X) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    r31 w10 = r31.w((TLObject) arrayList3.get(i13));
                    w10.I = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.hp.s1(i11).Y7;
            if (hashMap == null) {
                ioVar = null;
            } else {
                ioVar = (org.telegram.messenger.io) hashMap.get(0L);
            }
            if (ioVar != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = ioVar.f23564b;
                int size2 = arrayList5.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj3 = arrayList5.get(i14);
                    i14++;
                    TLObject tLObject = (TLObject) obj3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(chat.f27001id));
                        if (org.telegram.messenger.t3.r0(chat) && (M02 == null || org.telegram.messenger.t3.r0(M02))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745721, null)));
                }
                int size3 = arrayList4.size();
                while (i12 < size3) {
                    Object obj4 = arrayList4.get(i12);
                    i12++;
                    arrayList.add(r31.w((TLRPC.Chat) obj4));
                }
                return;
            }
            arrayList.add(r31.p(30));
            arrayList.add(r31.p(29));
            arrayList.add(r31.p(29));
            arrayList.add(r31.p(29));
            arrayList.add(r31.p(29));
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = dm0Var.T;
        int size4 = arrayList7.size();
        int i15 = 0;
        while (i15 < size4) {
            Object obj5 = arrayList7.get(i15);
            i15++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i16 = size4;
            TLRPC.Chat M03 = org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(chat2.f27001id));
            if (org.telegram.messenger.t3.r0(chat2) && (M03 == null || org.telegram.messenger.t3.r0(M03))) {
                arrayList6.add(chat2);
            }
            size4 = i16;
        }
        ArrayList arrayList8 = dm0Var.U;
        int size5 = arrayList8.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj6 = arrayList8.get(i17);
            i17++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat M04 = org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(chat3.f27001id));
            if (org.telegram.messenger.t3.r0(chat3) && (M04 == null || org.telegram.messenger.t3.r0(M04))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = dm0Var.V;
        int size6 = arrayList9.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj7 = arrayList9.get(i18);
            i18++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat M05 = org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(chat4.f27001id));
            if (org.telegram.messenger.t3.r0(chat4) && (M05 == null || org.telegram.messenger.t3.r0(M05))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 5 && !arrayList2.isEmpty()) {
                String M06 = org.telegram.messenger.bd.M0(2131745824, null);
                if (dm0Var.W) {
                    i3 = 2131745350;
                } else {
                    i3 = 2131745349;
                }
                arrayList.add(r31.s(M06, org.telegram.messenger.bd.M0(i3, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                dm0 dm0Var2 = dm0Var;
                                dm0Var2.X = !dm0Var2.X;
                                dm0Var2.O(true);
                                if (dm0Var2.X) {
                                    org.telegram.messenger.g0.v1(dm0Var2.f33164g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                            default:
                                dm0 dm0Var3 = dm0Var;
                                dm0Var3.W = !dm0Var3.W;
                                dm0Var3.O(true);
                                if (dm0Var3.W) {
                                    org.telegram.messenger.g0.v1(dm0Var3.f33164g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745824, null)));
            }
            int size7 = arrayList6.size();
            if (!dm0Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i19 = 0; i19 < size7; i19++) {
                arrayList.add(r31.w((TLObject) arrayList6.get(i19)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745766, null)));
            int size8 = arrayList2.size();
            int i20 = 0;
            while (i20 < size8) {
                Object obj8 = arrayList2.get(i20);
                i20++;
                r31 r31Var = new r31(33);
                r31Var.G = (org.telegram.messenger.zi) obj8;
                arrayList.add(r31Var);
            }
            if (dm0Var.f40465b0) {
                arrayList.add(r31.p(1));
            }
        }
    }

    private final void e(Object obj, Object obj2) {
        String str;
        ey eyVar = (ey) this.f33233b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        nx nxVar = eyVar.S1;
        if (nxVar != null && (nxVar.getDrawable() instanceof org.telegram.messenger.f4)) {
            org.telegram.messenger.f4 f4Var = (org.telegram.messenger.f4) eyVar.S1.getDrawable();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (f4Var.f22445c.f22635a != intValue) {
                org.telegram.messenger.g4 g4Var = f4Var.f22448g;
                if (g4Var != null) {
                    f4Var.f22445c = g4Var;
                }
                org.telegram.messenger.g4 g4Var2 = f4Var.f22445c;
                if (g4Var2.f22635a != intValue) {
                    g4Var2 = new org.telegram.messenger.g4(intValue, g4Var2.f22636b);
                }
                f4Var.f22448g = g4Var2;
                u5 u5Var = f4Var.f22446e;
                if (u5Var != null) {
                    u5Var.e(true, 0.0f);
                }
            }
            if (f4Var.d.f22635a != intValue2) {
                org.telegram.messenger.g4 g4Var3 = f4Var.h;
                if (g4Var3 != null) {
                    f4Var.d = g4Var3;
                }
                org.telegram.messenger.g4 g4Var4 = f4Var.d;
                if (g4Var4.f22635a != intValue2) {
                    g4Var4 = new org.telegram.messenger.g4(intValue2, g4Var4.f22636b);
                }
                f4Var.h = g4Var4;
                u5 u5Var2 = f4Var.f22447f;
                if (u5Var2 != null) {
                    u5Var2.e(true, 0.0f);
                }
            }
            f4Var.invalidateSelf();
            String str2 = (String) eyVar.S1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                org.telegram.messenger.i6.f23453j.remove(str2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = (String) org.telegram.messenger.h4.f22883a.get(num.intValue());
                }
                sb2.append(str);
                sb2.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = (String) org.telegram.messenger.h4.f22883a.get(num2.intValue());
                }
                sb2.append(str3);
                org.telegram.messenger.i6.f23453j.put(str2, sb2.toString());
            }
            org.telegram.messenger.i6.q();
        }
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        yx yxVar = (yx) this.f33233b;
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = yxVar.F;
        int size = arrayList2.size();
        int i3 = 0;
        while (true) {
            boolean z11 = true;
            if (i3 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i3);
            i3++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f27028id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f27028id, 1);
                if (tL_messages_stickerSet.set.f27028id != yxVar.d) {
                    z11 = false;
                }
                int i10 = gx.f34222b;
                r31 K = r31.K(gx.class);
                long j10 = tL_messages_stickerSet.set.f27028id;
                K.d = (int) ((j10 >>> 32) ^ j10);
                K.B = j10;
                K.G = tL_messages_stickerSet;
                K.f37621e = z11;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = yxVar.K;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            xw xwVar = (xw) obj4;
            TLRPC.StickerSet stickerSet = xwVar.f40536c;
            if (longSparseIntArray.indexOfKey(stickerSet.f27028id) < 0) {
                longSparseIntArray.append(stickerSet.f27028id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = xwVar.f40534a;
                if (stickerSet.f27028id == yxVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(gx.i(stickerSetCovered, xwVar, z10));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f33233b;
        float[] fArr = FragmentContextView.X0;
        fragmentContextView.B0 = !((Boolean) obj2).booleanValue();
        MediaController B = MediaController.B();
        boolean z10 = fragmentContextView.f31449a0;
        org.telegram.ui.ActionBar.u0 u0Var = fragmentContextView.J;
        float floatValue = ((Float) obj).floatValue();
        u0Var.getClass();
        B.m0(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void h(Object obj, Object obj2) {
        f41 f41Var = (f41) obj2;
        ((ArrayList) obj).add(r31.j(-1, ((i20) this.f33233b).R1));
    }

    private final void i(Object obj, Object obj2) {
        int i3;
        p20 p20Var = (p20) this.f33233b;
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        p20Var.f37036c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.ha.a(p20Var.f37034a).f22910f);
        if (p20Var.f37036c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < p20Var.f37036c.size(); i10++) {
            String str = (String) p20Var.f37036c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i3 = 2131231774;
                } else {
                    i3 = 2131231830;
                }
                arrayList.add(r31.c(i10 + 1, i3, str.substring(1)));
            }
        }
        arrayList.add(r31.c(0, 2131232094, org.telegram.messenger.bd.M0(2131752089, null)));
    }

    private final void j(Object obj, Object obj2) {
        boolean z10;
        ei.l6 l6Var;
        q20 q20Var = (q20) this.f33233b;
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        ArrayList arrayList2 = q20Var.R;
        int i3 = 0;
        if (q20Var.S && (l6Var = q20Var.T) != null && l6Var.f10876i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ei.l6 l6Var2 = q20Var.T;
            int i10 = kg.g1.f17033b;
            r31 K = r31.K(kg.g1.class);
            K.G = l6Var2;
            arrayList.add(K);
        }
        q20Var.U = z10;
        while (i3 < arrayList2.size()) {
            int i11 = i3 + 1;
            r31 r31Var = new r31(33);
            r31Var.d = i11;
            r31Var.G = (org.telegram.messenger.zi) arrayList2.get(i3);
            arrayList.add(r31Var);
            i3 = i11;
        }
        if (q20Var.V || !q20Var.Y) {
            arrayList.add(r31.q(-2, 1));
            arrayList.add(r31.q(-3, 1));
            arrayList.add(r31.q(-4, 1));
        }
        if (!q20Var.U && z10) {
            org.telegram.messenger.g0.h3(new gp(q20Var, 19));
        }
    }

    private final void k(Object obj, Object obj2) {
        d60 d60Var = (d60) this.f33233b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        f60 f60Var = d60Var.f32969y;
        f60Var.f33724f.setAlpha(1.0f);
        if (f60Var.f33749u) {
            d60Var.f32961c = bitmap;
        }
        si.b bVar = f60Var.f33738n;
        if (bVar != null) {
            bVar.a(bitmap2);
            jh.d.c(f60Var.f33738n, d60Var);
            ViewGroup viewGroup = f60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        bf0 bf0Var = (bf0) this.f33233b;
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        ArrayList arrayList2 = bf0Var.f32171e;
        ArrayList arrayList3 = bf0Var.f32173n;
        int i3 = 0;
        if (bf0Var.d == null) {
            arrayList.add(r31.q(-1, 7));
            arrayList.add(r31.q(-2, 7));
            arrayList.add(r31.q(-3, 7));
            bf0Var.R = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(bf0Var.f32177x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745732, null)));
            }
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                r31 r31Var = new r31(33);
                r31Var.G = (org.telegram.messenger.zi) obj3;
                arrayList.add(r31Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(r31.r(org.telegram.messenger.bd.M0(2131745733, null)));
            }
            int size2 = arrayList3.size();
            while (i3 < size2) {
                Object obj4 = arrayList3.get(i3);
                i3++;
                r31 r31Var2 = new r31(33);
                r31Var2.G = (org.telegram.messenger.zi) obj4;
                arrayList.add(r31Var2);
            }
        }
        if (bf0Var.f32176w || ((bf0Var.N && !bf0Var.O) || (!isEmpty && !arrayList3.isEmpty() && !bf0Var.f32175s))) {
            arrayList.add(r31.q(bf0Var.M * 3, 7));
            arrayList.add(r31.q((bf0Var.M * 3) + 1, 7));
            arrayList.add(r31.q((bf0Var.M * 3) + 2, 7));
        }
        bf0Var.R = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        nk0 nk0Var = (nk0) this.f33233b;
        nk0Var.f36574c = (Bitmap) obj;
        Paint paint = new Paint(1);
        nk0Var.f36575e = paint;
        Bitmap bitmap = nk0Var.f36574c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        nk0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        nk0Var.f36576f = new Matrix();
        si.b bVar = nk0Var.h;
        bVar.a((Bitmap) obj2);
        jh.d.c(bVar, nk0Var.f36579s);
        ViewGroup viewGroup = nk0Var.E;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        xv0 xv0Var = (xv0) this.f33233b;
        CharSequence charSequence = (CharSequence) obj;
        xv0Var.f40522o1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.li.Z(xv0Var.K1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).sendRequest(tL_stickers_renameStickerSet, new w1((org.telegram.messenger.u10) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        f21 f21Var = (f21) this.f33233b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        q11 q11Var = f21Var.f33677w1;
        e21 e21Var = f21Var.F1;
        if (str != null) {
            f21Var.M1 = false;
            f21Var.f33678x1.setText(f21Var.Q0(str));
            e21Var.D(q11Var);
        } else if (f21Var.J) {
        } else {
            int i3 = 2131743956;
            if (f21Var.M1) {
                f21Var.dismiss();
                org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
                if (bool.booleanValue()) {
                    i3 = 2131743957;
                }
                e10.k(org.telegram.messenger.hs.P4, 1, org.telegram.messenger.bd.M0(i3, null));
                return;
            }
            fc fcVar = new fc((FrameLayout) f21Var.f28586b, f21Var.J0);
            if (bool.booleanValue()) {
                i3 = 2131743957;
            }
            org.telegram.messenger.k5.p(null, i3, fcVar, null);
            b21 b21Var = f21Var.f33675u1.f32920e;
            String str2 = f21Var.f33674t1;
            f21Var.f33673s1 = str2;
            b21Var.setText(f21.O0(str2, null, null));
            e21Var.D(q11Var);
        }
    }

    @Override
    public final void a(java.lang.Object r32, java.lang.Object r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e.a(java.lang.Object, java.lang.Object):void");
    }
}
