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
public final class d implements org.telegram.messenger.v10 {
    public final int f32807a;
    public final Object f32808b;

    public d(Object obj, int i7) {
        this.f32807a = i7;
        this.f32808b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        tq tqVar = (tq) this.f32808b;
        ArrayList arrayList = (ArrayList) obj;
        m41 m41Var = (m41) obj2;
        String str = null;
        if (tqVar.Y1 == null) {
            Context context = tqVar.getContext();
            org.telegram.ui.ActionBar.g6 g6Var = tqVar.I0;
            bi.t tVar = new bi.t(context, 7);
            tVar.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624328, 112, 112, null);
            imageView.d();
            tVar.addView((View) imageView, c8.ha.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.id.a0(null, null, 2131744438, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, g6Var);
            tVar.addView(textView, c8.ha.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f27973j5, g6Var);
            textView2.setText(org.telegram.messenger.id.a0(null, null, 2131743236, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            tVar.addView(textView2, c8.ha.t(-2, -2, 1, 28, 0, 28, 17));
            tqVar.Y1 = tVar;
        }
        arrayList.add(y31.k(tqVar.Y1));
        arrayList.add(y31.C(null));
        arrayList.add(y31.u(org.telegram.messenger.id.M0(2131743431, null)));
        String str2 = tqVar.T1;
        String M0 = org.telegram.messenger.id.M0(2131743432, null);
        int i10 = sq.f38138b;
        y31 K = y31.K(sq.class);
        K.f40568l = str2;
        K.f40570n = M0;
        K.f40566j = false;
        K.f40564g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = tqVar.V1;
        String M02 = org.telegram.messenger.id.M0(2131743433, null);
        y31 K2 = y31.K(sq.class);
        K2.f40568l = spannableStringBuilder;
        K2.f40570n = M02;
        K2.f40566j = true;
        K2.f40564g = false;
        arrayList.add(K2);
        if (tqVar.X1) {
            if (tqVar.P1) {
                i7 = 2131743428;
            } else {
                i7 = 2131743429;
            }
            str = org.telegram.messenger.id.M0(i7, null);
        }
        arrayList.add(y31.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z9;
        int i7;
        int i10;
        final vr vrVar = (vr) this.f32808b;
        ArrayList arrayList = (ArrayList) obj;
        m41 m41Var = (m41) obj2;
        int i11 = vrVar.P;
        s2 s2Var = vrVar.f39800j0;
        ArrayList arrayList2 = vrVar.V;
        ur urVar = vrVar.S;
        boolean z10 = vrVar.R;
        HashSet hashSet = new HashSet();
        int i12 = 0;
        if (!TextUtils.isEmpty(vrVar.f39797g0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(vrVar.T);
            arrayList3.addAll(vrVar.U);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 5 && !arrayList2.isEmpty() && !z10) {
                    String M0 = org.telegram.messenger.id.M0(2131745822, null);
                    if (vrVar.X) {
                        i10 = 2131745340;
                    } else {
                        i10 = 2131745339;
                    }
                    arrayList.add(y31.s(M0, org.telegram.messenger.id.M0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    vr vrVar2 = vrVar;
                                    vrVar2.X = !vrVar2.X;
                                    vrVar2.O(true);
                                    return;
                                default:
                                    vr vrVar3 = vrVar;
                                    vrVar3.W = !vrVar3.W;
                                    vrVar3.O(true);
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745822, null)));
                }
                int size = arrayList3.size();
                if (!vrVar.X && !arrayList2.isEmpty() && !z10) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    y31 w10 = y31.w((TLObject) arrayList3.get(i13));
                    w10.f40576t = true;
                    w10.H = s2Var;
                    arrayList.add(w10);
                }
            }
            if (!arrayList2.isEmpty() && !z10) {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745756, null)));
                int size2 = arrayList2.size();
                while (i12 < size2) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    y31 y31Var = new y31(33);
                    y31Var.G = (org.telegram.messenger.ij) obj3;
                    arrayList.add(y31Var);
                }
                if (vrVar.f39794d0) {
                    arrayList.add(y31.p(1));
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.ui.b0(i11).l1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.TL_topPeer) arrayList4.get(i14)).peer)));
                if (a22 != null && a22.bot) {
                    arrayList5.add(a22);
                }
            }
        }
        vrVar.Z = arrayList.size();
        if (!arrayList5.isEmpty() && !z10) {
            if (arrayList5.size() > 5) {
                String M02 = org.telegram.messenger.id.M0(2131745820, null);
                if (vrVar.W) {
                    i7 = 2131745340;
                } else {
                    i7 = 2131745339;
                }
                arrayList.add(y31.s(M02, org.telegram.messenger.id.M0(i7, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                vr vrVar2 = vrVar;
                                vrVar2.X = !vrVar2.X;
                                vrVar2.O(true);
                                return;
                            default:
                                vr vrVar3 = vrVar;
                                vrVar3.W = !vrVar3.W;
                                vrVar3.O(true);
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745820, null)));
            }
            for (int i15 = 0; i15 < arrayList5.size() && (i15 < 5 || vrVar.W); i15++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i15);
                if (!hashSet.contains(Long.valueOf(user.f27105id))) {
                    hashSet.add(Long.valueOf(user.f27105id));
                    y31 w11 = y31.w(user);
                    w11.f40573q = true;
                    w11.f40576t = true;
                    w11.H = s2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        vrVar.f39791a0 = arrayList.size();
        ArrayList arrayList6 = urVar.h;
        if (!arrayList6.isEmpty()) {
            if (!z10) {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745819, null)));
            }
            boolean z11 = false;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i16);
                if (!hashSet.contains(Long.valueOf(user2.f27105id))) {
                    hashSet.add(Long.valueOf(user2.f27105id));
                    y31 w12 = y31.w(user2);
                    w12.f40573q = true;
                    w12.f40574r = true;
                    w12.f40576t = true;
                    w12.H = s2Var;
                    arrayList.add(w12);
                    z11 = true;
                }
            }
            if (urVar.f38782c || !urVar.f38783e) {
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
            }
            z9 = z11;
        } else {
            if (urVar.f38782c || !urVar.f38783e) {
                if (!z10) {
                    arrayList.add(y31.p(30));
                }
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
                arrayList.add(y31.p(29));
            }
            z9 = false;
        }
        if (z9) {
            arrayList.add(y31.C(vrVar.Y));
        }
    }

    private final void d(Object obj, Object obj2) {
        int i7;
        org.telegram.messenger.ro roVar;
        int i10;
        final bm0 bm0Var = (bm0) this.f32808b;
        ArrayList arrayList = (ArrayList) obj;
        m41 m41Var = (m41) obj2;
        ArrayList arrayList2 = bm0Var.R;
        ArrayList arrayList3 = bm0Var.X;
        int i11 = bm0Var.P;
        int i12 = 0;
        if (TextUtils.isEmpty(bm0Var.f40472d0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    String M0 = org.telegram.messenger.id.M0(2131745739, null);
                    if (bm0Var.W) {
                        i10 = 2131745340;
                    } else {
                        i10 = 2131745339;
                    }
                    arrayList.add(y31.s(M0, org.telegram.messenger.id.M0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    bm0 bm0Var2 = bm0Var;
                                    bm0Var2.W = !bm0Var2.W;
                                    bm0Var2.O(true);
                                    if (bm0Var2.W) {
                                        org.telegram.messenger.g0.v1(bm0Var2.f32282f0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                                default:
                                    bm0 bm0Var3 = bm0Var;
                                    bm0Var3.V = !bm0Var3.V;
                                    bm0Var3.O(true);
                                    if (bm0Var3.V) {
                                        org.telegram.messenger.g0.v1(bm0Var3.f32282f0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745739, null)));
                }
                int size = arrayList3.size();
                if (!bm0Var.W) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    y31 w10 = y31.w((TLObject) arrayList3.get(i13));
                    w10.I = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.qp.s1(i11).Y7;
            if (hashMap == null) {
                roVar = null;
            } else {
                roVar = (org.telegram.messenger.ro) hashMap.get(0L);
            }
            if (roVar != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = roVar.f25313b;
                int size2 = arrayList5.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj3 = arrayList5.get(i14);
                    i14++;
                    TLObject tLObject = (TLObject) obj3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(chat.f26956id));
                        if (org.telegram.messenger.t3.r0(chat) && (M02 == null || org.telegram.messenger.t3.r0(M02))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745711, null)));
                }
                int size3 = arrayList4.size();
                while (i12 < size3) {
                    Object obj4 = arrayList4.get(i12);
                    i12++;
                    arrayList.add(y31.w((TLRPC.Chat) obj4));
                }
                return;
            }
            arrayList.add(y31.p(30));
            arrayList.add(y31.p(29));
            arrayList.add(y31.p(29));
            arrayList.add(y31.p(29));
            arrayList.add(y31.p(29));
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = bm0Var.S;
        int size4 = arrayList7.size();
        int i15 = 0;
        while (i15 < size4) {
            Object obj5 = arrayList7.get(i15);
            i15++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i16 = size4;
            TLRPC.Chat M03 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(chat2.f26956id));
            if (org.telegram.messenger.t3.r0(chat2) && (M03 == null || org.telegram.messenger.t3.r0(M03))) {
                arrayList6.add(chat2);
            }
            size4 = i16;
        }
        ArrayList arrayList8 = bm0Var.T;
        int size5 = arrayList8.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj6 = arrayList8.get(i17);
            i17++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat M04 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(chat3.f26956id));
            if (org.telegram.messenger.t3.r0(chat3) && (M04 == null || org.telegram.messenger.t3.r0(M04))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = bm0Var.U;
        int size6 = arrayList9.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj7 = arrayList9.get(i18);
            i18++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat M05 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(chat4.f26956id));
            if (org.telegram.messenger.t3.r0(chat4) && (M05 == null || org.telegram.messenger.t3.r0(M05))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 5 && !arrayList2.isEmpty()) {
                String M06 = org.telegram.messenger.id.M0(2131745814, null);
                if (bm0Var.V) {
                    i7 = 2131745340;
                } else {
                    i7 = 2131745339;
                }
                arrayList.add(y31.s(M06, org.telegram.messenger.id.M0(i7, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                bm0 bm0Var2 = bm0Var;
                                bm0Var2.W = !bm0Var2.W;
                                bm0Var2.O(true);
                                if (bm0Var2.W) {
                                    org.telegram.messenger.g0.v1(bm0Var2.f32282f0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                            default:
                                bm0 bm0Var3 = bm0Var;
                                bm0Var3.V = !bm0Var3.V;
                                bm0Var3.O(true);
                                if (bm0Var3.V) {
                                    org.telegram.messenger.g0.v1(bm0Var3.f32282f0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745814, null)));
            }
            int size7 = arrayList6.size();
            if (!bm0Var.V && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i19 = 0; i19 < size7; i19++) {
                arrayList.add(y31.w((TLObject) arrayList6.get(i19)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745756, null)));
            int size8 = arrayList2.size();
            int i20 = 0;
            while (i20 < size8) {
                Object obj8 = arrayList2.get(i20);
                i20++;
                y31 y31Var = new y31(33);
                y31Var.G = (org.telegram.messenger.ij) obj8;
                arrayList.add(y31Var);
            }
            if (bm0Var.f40469a0) {
                arrayList.add(y31.p(1));
            }
        }
    }

    private final void e(Object obj, Object obj2) {
        String str;
        hy hyVar = (hy) this.f32808b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        qx qxVar = hyVar.R1;
        if (qxVar != null && (qxVar.getDrawable() instanceof org.telegram.messenger.f4)) {
            org.telegram.messenger.f4 f4Var = (org.telegram.messenger.f4) hyVar.R1.getDrawable();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (f4Var.f22362c.f22592a != intValue) {
                org.telegram.messenger.g4 g4Var = f4Var.f22365g;
                if (g4Var != null) {
                    f4Var.f22362c = g4Var;
                }
                org.telegram.messenger.g4 g4Var2 = f4Var.f22362c;
                if (g4Var2.f22592a != intValue) {
                    g4Var2 = new org.telegram.messenger.g4(intValue, g4Var2.f22593b);
                }
                f4Var.f22365g = g4Var2;
                w5 w5Var = f4Var.f22363e;
                if (w5Var != null) {
                    w5Var.e(true, 0.0f);
                }
            }
            if (f4Var.d.f22592a != intValue2) {
                org.telegram.messenger.g4 g4Var3 = f4Var.h;
                if (g4Var3 != null) {
                    f4Var.d = g4Var3;
                }
                org.telegram.messenger.g4 g4Var4 = f4Var.d;
                if (g4Var4.f22592a != intValue2) {
                    g4Var4 = new org.telegram.messenger.g4(intValue2, g4Var4.f22593b);
                }
                f4Var.h = g4Var4;
                w5 w5Var2 = f4Var.f22364f;
                if (w5Var2 != null) {
                    w5Var2.e(true, 0.0f);
                }
            }
            f4Var.invalidateSelf();
            String str2 = (String) hyVar.R1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                org.telegram.messenger.i6.f23059j.remove(str2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = (String) org.telegram.messenger.h4.f22840a.get(num.intValue());
                }
                sb2.append(str);
                sb2.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = (String) org.telegram.messenger.h4.f22840a.get(num2.intValue());
                }
                sb2.append(str3);
                org.telegram.messenger.i6.f23059j.put(str2, sb2.toString());
            }
            org.telegram.messenger.i6.q();
        }
    }

    private final void f(Object obj, Object obj2) {
        boolean z9;
        cy cyVar = (cy) this.f32808b;
        ArrayList arrayList = (ArrayList) obj;
        m41 m41Var = (m41) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = cyVar.E;
        int size = arrayList2.size();
        int i7 = 0;
        while (true) {
            boolean z10 = true;
            if (i7 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i7);
            i7++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f26983id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f26983id, 1);
                if (tL_messages_stickerSet.set.f26983id != cyVar.d) {
                    z10 = false;
                }
                int i10 = jx.f35175b;
                y31 K = y31.K(jx.class);
                long j3 = tL_messages_stickerSet.set.f26983id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.B = j3;
                K.G = tL_messages_stickerSet;
                K.f40562e = z10;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = cyVar.J;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            zw zwVar = (zw) obj4;
            TLRPC.StickerSet stickerSet = zwVar.f41174c;
            if (longSparseIntArray.indexOfKey(stickerSet.f26983id) < 0) {
                longSparseIntArray.append(stickerSet.f26983id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = zwVar.f41172a;
                if (stickerSet.f26983id == cyVar.d) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                arrayList.add(jx.i(stickerSetCovered, zwVar, z9));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f32808b;
        float[] fArr = FragmentContextView.W0;
        fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
        MediaController B = MediaController.B();
        boolean z9 = fragmentContextView.W;
        org.telegram.ui.ActionBar.v0 v0Var = fragmentContextView.I;
        float floatValue = ((Float) obj).floatValue();
        v0Var.getClass();
        B.m0(z9, (floatValue * 2.8f) + 0.2f);
    }

    private final void h(Object obj, Object obj2) {
        m41 m41Var = (m41) obj2;
        ((ArrayList) obj).add(y31.j(-1, ((n20) this.f32808b).Q1));
    }

    private final void i(Object obj, Object obj2) {
        int i7;
        u20 u20Var = (u20) this.f32808b;
        ArrayList arrayList = (ArrayList) obj;
        m41 m41Var = (m41) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        u20Var.f38573c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.oa.a(u20Var.f38571a).f24316f);
        if (u20Var.f38573c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < u20Var.f38573c.size(); i10++) {
            String str = (String) u20Var.f38573c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i7 = 2131231774;
                } else {
                    i7 = 2131231830;
                }
                arrayList.add(y31.c(i10 + 1, i7, str.substring(1)));
            }
        }
        arrayList.add(y31.c(0, 2131232094, org.telegram.messenger.id.M0(2131752089, null)));
    }

    private final void j(Object obj, Object obj2) {
        boolean z9;
        di.l6 l6Var;
        v20 v20Var = (v20) this.f32808b;
        ArrayList arrayList = (ArrayList) obj;
        m41 m41Var = (m41) obj2;
        ArrayList arrayList2 = v20Var.Q;
        int i7 = 0;
        if (v20Var.R && (l6Var = v20Var.S) != null && l6Var.f9694i.size() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            di.l6 l6Var2 = v20Var.S;
            int i10 = jg.k1.f16819b;
            y31 K = y31.K(jg.k1.class);
            K.G = l6Var2;
            arrayList.add(K);
        }
        v20Var.T = z9;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            y31 y31Var = new y31(33);
            y31Var.d = i11;
            y31Var.G = (org.telegram.messenger.ij) arrayList2.get(i7);
            arrayList.add(y31Var);
            i7 = i11;
        }
        if (v20Var.U || !v20Var.X) {
            arrayList.add(y31.q(-2, 1));
            arrayList.add(y31.q(-3, 1));
            arrayList.add(y31.q(-4, 1));
        }
        if (!v20Var.T && z9) {
            org.telegram.messenger.g0.h3(new gp(v20Var, 19));
        }
    }

    private final void k(Object obj, Object obj2) {
        j60 j60Var = (j60) this.f32808b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        l60 l60Var = j60Var.f34949y;
        l60Var.f35594f.setAlpha(1.0f);
        if (l60Var.f35619u) {
            j60Var.f34941c = bitmap;
        }
        ri.b bVar = l60Var.f35608n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(l60Var.f35608n, j60Var);
            ViewGroup viewGroup = l60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        af0 af0Var = (af0) this.f32808b;
        ArrayList arrayList = (ArrayList) obj;
        m41 m41Var = (m41) obj2;
        ArrayList arrayList2 = af0Var.f31782e;
        ArrayList arrayList3 = af0Var.f31784n;
        int i7 = 0;
        if (af0Var.d == null) {
            arrayList.add(y31.q(-1, 7));
            arrayList.add(y31.q(-2, 7));
            arrayList.add(y31.q(-3, 7));
            af0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(af0Var.f31788x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745722, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                y31 y31Var = new y31(33);
                y31Var.G = (org.telegram.messenger.ij) obj3;
                arrayList.add(y31Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(y31.r(org.telegram.messenger.id.M0(2131745723, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                y31 y31Var2 = new y31(33);
                y31Var2.G = (org.telegram.messenger.ij) obj4;
                arrayList.add(y31Var2);
            }
        }
        if (af0Var.f31787w || ((af0Var.M && !af0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !af0Var.f31786s))) {
            arrayList.add(y31.q(af0Var.L * 3, 7));
            arrayList.add(y31.q((af0Var.L * 3) + 1, 7));
            arrayList.add(y31.q((af0Var.L * 3) + 2, 7));
        }
        af0Var.Q = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        kk0 kk0Var = (kk0) this.f32808b;
        kk0Var.f35362c = (Bitmap) obj;
        Paint paint = new Paint(1);
        kk0Var.f35363e = paint;
        Bitmap bitmap = kk0Var.f35362c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        kk0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        kk0Var.f35364f = new Matrix();
        ri.b bVar = kk0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, kk0Var.f35367s);
        ViewGroup viewGroup = kk0Var.D;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        zv0 zv0Var = (zv0) this.f32808b;
        CharSequence charSequence = (CharSequence) obj;
        zv0Var.n1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.ui.Z(zv0Var.J1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).sendRequest(tL_stickers_renameStickerSet, new x1((org.telegram.messenger.c20) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        l21 l21Var = (l21) this.f32808b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        w11 w11Var = l21Var.f35566v1;
        k21 k21Var = l21Var.E1;
        if (str != null) {
            l21Var.L1 = false;
            l21Var.f35567w1.setText(l21Var.Q0(str));
            k21Var.D(w11Var);
        } else if (l21Var.I) {
        } else {
            int i7 = 2131743946;
            if (l21Var.L1) {
                l21Var.dismiss();
                org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                if (bool.booleanValue()) {
                    i7 = 2131743947;
                }
                e10.k(org.telegram.messenger.qs.P4, 1, org.telegram.messenger.id.M0(i7, null));
                return;
            }
            hc hcVar = new hc((FrameLayout) l21Var.f28624b, l21Var.I0);
            if (bool.booleanValue()) {
                i7 = 2131743947;
            }
            org.telegram.messenger.k5.p(null, i7, hcVar, null);
            h21 h21Var = l21Var.f35564t1.f34919e;
            String str2 = l21Var.f35563s1;
            l21Var.f35562r1 = str2;
            h21Var.setText(l21.O0(str2, null, null));
            k21Var.D(w11Var);
        }
    }

    @Override
    public final void a(java.lang.Object r34, java.lang.Object r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.a(java.lang.Object, java.lang.Object):void");
    }
}
