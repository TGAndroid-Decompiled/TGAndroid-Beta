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
    public final int f32730a;
    public final Object f32731b;

    public d(Object obj, int i7) {
        this.f32730a = i7;
        this.f32731b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        tq tqVar = (tq) this.f32731b;
        ArrayList arrayList = (ArrayList) obj;
        k41 k41Var = (k41) obj2;
        String str = null;
        if (tqVar.Y1 == null) {
            Context context = tqVar.getContext();
            org.telegram.ui.ActionBar.f6 f6Var = tqVar.I0;
            bi.t tVar = new bi.t(context, 7);
            tVar.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624328, 112, 112, null);
            imageView.d();
            tVar.addView((View) imageView, c8.ha.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131744439, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
            tVar.addView(textView, c8.ha.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
            textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131743237, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            tVar.addView(textView2, c8.ha.t(-2, -2, 1, 28, 0, 28, 17));
            tqVar.Y1 = tVar;
        }
        arrayList.add(w31.k(tqVar.Y1));
        arrayList.add(w31.C(null));
        arrayList.add(w31.u(org.telegram.messenger.hd.M0(2131743432, null)));
        String str2 = tqVar.T1;
        String M0 = org.telegram.messenger.hd.M0(2131743433, null);
        int i10 = sq.f38095b;
        w31 K = w31.K(sq.class);
        K.f39830l = str2;
        K.f39832n = M0;
        K.f39828j = false;
        K.f39826g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = tqVar.V1;
        String M02 = org.telegram.messenger.hd.M0(2131743434, null);
        w31 K2 = w31.K(sq.class);
        K2.f39830l = spannableStringBuilder;
        K2.f39832n = M02;
        K2.f39828j = true;
        K2.f39826g = false;
        arrayList.add(K2);
        if (tqVar.X1) {
            if (tqVar.P1) {
                i7 = 2131743429;
            } else {
                i7 = 2131743430;
            }
            str = org.telegram.messenger.hd.M0(i7, null);
        }
        arrayList.add(w31.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z9;
        int i7;
        int i10;
        final vr vrVar = (vr) this.f32731b;
        ArrayList arrayList = (ArrayList) obj;
        k41 k41Var = (k41) obj2;
        int i11 = vrVar.P;
        s2 s2Var = vrVar.f39658j0;
        ArrayList arrayList2 = vrVar.V;
        ur urVar = vrVar.S;
        boolean z10 = vrVar.R;
        HashSet hashSet = new HashSet();
        int i12 = 0;
        if (!TextUtils.isEmpty(vrVar.f39655g0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(vrVar.T);
            arrayList3.addAll(vrVar.U);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 5 && !arrayList2.isEmpty() && !z10) {
                    String M0 = org.telegram.messenger.hd.M0(2131745823, null);
                    if (vrVar.X) {
                        i10 = 2131745341;
                    } else {
                        i10 = 2131745340;
                    }
                    arrayList.add(w31.s(M0, org.telegram.messenger.hd.M0(i10, null), new View.OnClickListener() {
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
                    arrayList.add(w31.r(org.telegram.messenger.hd.M0(2131745823, null)));
                }
                int size = arrayList3.size();
                if (!vrVar.X && !arrayList2.isEmpty() && !z10) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    w31 w10 = w31.w((TLObject) arrayList3.get(i13));
                    w10.f39838t = true;
                    w10.H = s2Var;
                    arrayList.add(w10);
                }
            }
            if (!arrayList2.isEmpty() && !z10) {
                arrayList.add(w31.r(org.telegram.messenger.hd.M0(2131745757, null)));
                int size2 = arrayList2.size();
                while (i12 < size2) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    w31 w31Var = new w31(33);
                    w31Var.G = (org.telegram.messenger.ij) obj3;
                    arrayList.add(w31Var);
                }
                if (vrVar.f39652d0) {
                    arrayList.add(w31.p(1));
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
                String M02 = org.telegram.messenger.hd.M0(2131745821, null);
                if (vrVar.W) {
                    i7 = 2131745341;
                } else {
                    i7 = 2131745340;
                }
                arrayList.add(w31.s(M02, org.telegram.messenger.hd.M0(i7, null), new View.OnClickListener() {
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
                arrayList.add(w31.r(org.telegram.messenger.hd.M0(2131745821, null)));
            }
            for (int i15 = 0; i15 < arrayList5.size() && (i15 < 5 || vrVar.W); i15++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i15);
                if (!hashSet.contains(Long.valueOf(user.f27101id))) {
                    hashSet.add(Long.valueOf(user.f27101id));
                    w31 w11 = w31.w(user);
                    w11.f39835q = true;
                    w11.f39838t = true;
                    w11.H = s2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        vrVar.f39649a0 = arrayList.size();
        ArrayList arrayList6 = urVar.h;
        if (!arrayList6.isEmpty()) {
            if (!z10) {
                arrayList.add(w31.r(org.telegram.messenger.hd.M0(2131745820, null)));
            }
            boolean z11 = false;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i16);
                if (!hashSet.contains(Long.valueOf(user2.f27101id))) {
                    hashSet.add(Long.valueOf(user2.f27101id));
                    w31 w12 = w31.w(user2);
                    w12.f39835q = true;
                    w12.f39836r = true;
                    w12.f39838t = true;
                    w12.H = s2Var;
                    arrayList.add(w12);
                    z11 = true;
                }
            }
            if (urVar.f38704c || !urVar.f38705e) {
                arrayList.add(w31.p(29));
                arrayList.add(w31.p(29));
                arrayList.add(w31.p(29));
            }
            z9 = z11;
        } else {
            if (urVar.f38704c || !urVar.f38705e) {
                if (!z10) {
                    arrayList.add(w31.p(30));
                }
                arrayList.add(w31.p(29));
                arrayList.add(w31.p(29));
                arrayList.add(w31.p(29));
                arrayList.add(w31.p(29));
            }
            z9 = false;
        }
        if (z9) {
            arrayList.add(w31.C(vrVar.Y));
        }
    }

    private final void d(Object obj, Object obj2) {
        int i7;
        org.telegram.messenger.ro roVar;
        int i10;
        final am0 am0Var = (am0) this.f32731b;
        ArrayList arrayList = (ArrayList) obj;
        k41 k41Var = (k41) obj2;
        ArrayList arrayList2 = am0Var.R;
        ArrayList arrayList3 = am0Var.X;
        int i11 = am0Var.P;
        int i12 = 0;
        if (TextUtils.isEmpty(am0Var.f40344d0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    String M0 = org.telegram.messenger.hd.M0(2131745740, null);
                    if (am0Var.W) {
                        i10 = 2131745341;
                    } else {
                        i10 = 2131745340;
                    }
                    arrayList.add(w31.s(M0, org.telegram.messenger.hd.M0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    am0 am0Var2 = am0Var;
                                    am0Var2.W = !am0Var2.W;
                                    am0Var2.O(true);
                                    if (am0Var2.W) {
                                        org.telegram.messenger.g0.v1(am0Var2.f31858f0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                                default:
                                    am0 am0Var3 = am0Var;
                                    am0Var3.V = !am0Var3.V;
                                    am0Var3.O(true);
                                    if (am0Var3.V) {
                                        org.telegram.messenger.g0.v1(am0Var3.f31858f0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(w31.r(org.telegram.messenger.hd.M0(2131745740, null)));
                }
                int size = arrayList3.size();
                if (!am0Var.W) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    w31 w10 = w31.w((TLObject) arrayList3.get(i13));
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
                ArrayList arrayList5 = roVar.f25306b;
                int size2 = arrayList5.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj3 = arrayList5.get(i14);
                    i14++;
                    TLObject tLObject = (TLObject) obj3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(chat.f26952id));
                        if (org.telegram.messenger.t3.r0(chat) && (M02 == null || org.telegram.messenger.t3.r0(M02))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(w31.r(org.telegram.messenger.hd.M0(2131745712, null)));
                }
                int size3 = arrayList4.size();
                while (i12 < size3) {
                    Object obj4 = arrayList4.get(i12);
                    i12++;
                    arrayList.add(w31.w((TLRPC.Chat) obj4));
                }
                return;
            }
            arrayList.add(w31.p(30));
            arrayList.add(w31.p(29));
            arrayList.add(w31.p(29));
            arrayList.add(w31.p(29));
            arrayList.add(w31.p(29));
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = am0Var.S;
        int size4 = arrayList7.size();
        int i15 = 0;
        while (i15 < size4) {
            Object obj5 = arrayList7.get(i15);
            i15++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i16 = size4;
            TLRPC.Chat M03 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(chat2.f26952id));
            if (org.telegram.messenger.t3.r0(chat2) && (M03 == null || org.telegram.messenger.t3.r0(M03))) {
                arrayList6.add(chat2);
            }
            size4 = i16;
        }
        ArrayList arrayList8 = am0Var.T;
        int size5 = arrayList8.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj6 = arrayList8.get(i17);
            i17++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat M04 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(chat3.f26952id));
            if (org.telegram.messenger.t3.r0(chat3) && (M04 == null || org.telegram.messenger.t3.r0(M04))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = am0Var.U;
        int size6 = arrayList9.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj7 = arrayList9.get(i18);
            i18++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat M05 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(chat4.f26952id));
            if (org.telegram.messenger.t3.r0(chat4) && (M05 == null || org.telegram.messenger.t3.r0(M05))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 5 && !arrayList2.isEmpty()) {
                String M06 = org.telegram.messenger.hd.M0(2131745815, null);
                if (am0Var.V) {
                    i7 = 2131745341;
                } else {
                    i7 = 2131745340;
                }
                arrayList.add(w31.s(M06, org.telegram.messenger.hd.M0(i7, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                am0 am0Var2 = am0Var;
                                am0Var2.W = !am0Var2.W;
                                am0Var2.O(true);
                                if (am0Var2.W) {
                                    org.telegram.messenger.g0.v1(am0Var2.f31858f0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                            default:
                                am0 am0Var3 = am0Var;
                                am0Var3.V = !am0Var3.V;
                                am0Var3.O(true);
                                if (am0Var3.V) {
                                    org.telegram.messenger.g0.v1(am0Var3.f31858f0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(w31.r(org.telegram.messenger.hd.M0(2131745815, null)));
            }
            int size7 = arrayList6.size();
            if (!am0Var.V && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i19 = 0; i19 < size7; i19++) {
                arrayList.add(w31.w((TLObject) arrayList6.get(i19)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(w31.r(org.telegram.messenger.hd.M0(2131745757, null)));
            int size8 = arrayList2.size();
            int i20 = 0;
            while (i20 < size8) {
                Object obj8 = arrayList2.get(i20);
                i20++;
                w31 w31Var = new w31(33);
                w31Var.G = (org.telegram.messenger.ij) obj8;
                arrayList.add(w31Var);
            }
            if (am0Var.f40341a0) {
                arrayList.add(w31.p(1));
            }
        }
    }

    private final void e(Object obj, Object obj2) {
        String str;
        gy gyVar = (gy) this.f32731b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        px pxVar = gyVar.R1;
        if (pxVar != null && (pxVar.getDrawable() instanceof org.telegram.messenger.f4)) {
            org.telegram.messenger.f4 f4Var = (org.telegram.messenger.f4) gyVar.R1.getDrawable();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (f4Var.f22336c.f22566a != intValue) {
                org.telegram.messenger.g4 g4Var = f4Var.f22339g;
                if (g4Var != null) {
                    f4Var.f22336c = g4Var;
                }
                org.telegram.messenger.g4 g4Var2 = f4Var.f22336c;
                if (g4Var2.f22566a != intValue) {
                    g4Var2 = new org.telegram.messenger.g4(intValue, g4Var2.f22567b);
                }
                f4Var.f22339g = g4Var2;
                w5 w5Var = f4Var.f22337e;
                if (w5Var != null) {
                    w5Var.e(true, 0.0f);
                }
            }
            if (f4Var.d.f22566a != intValue2) {
                org.telegram.messenger.g4 g4Var3 = f4Var.h;
                if (g4Var3 != null) {
                    f4Var.d = g4Var3;
                }
                org.telegram.messenger.g4 g4Var4 = f4Var.d;
                if (g4Var4.f22566a != intValue2) {
                    g4Var4 = new org.telegram.messenger.g4(intValue2, g4Var4.f22567b);
                }
                f4Var.h = g4Var4;
                w5 w5Var2 = f4Var.f22338f;
                if (w5Var2 != null) {
                    w5Var2.e(true, 0.0f);
                }
            }
            f4Var.invalidateSelf();
            String str2 = (String) gyVar.R1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                org.telegram.messenger.i6.f23062j.remove(str2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = (String) org.telegram.messenger.h4.f22827a.get(num.intValue());
                }
                sb2.append(str);
                sb2.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = (String) org.telegram.messenger.h4.f22827a.get(num2.intValue());
                }
                sb2.append(str3);
                org.telegram.messenger.i6.f23062j.put(str2, sb2.toString());
            }
            org.telegram.messenger.i6.q();
        }
    }

    private final void f(Object obj, Object obj2) {
        boolean z9;
        ay ayVar = (ay) this.f32731b;
        ArrayList arrayList = (ArrayList) obj;
        k41 k41Var = (k41) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = ayVar.E;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f26979id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f26979id, 1);
                if (tL_messages_stickerSet.set.f26979id != ayVar.d) {
                    z10 = false;
                }
                int i10 = ix.f34778b;
                w31 K = w31.K(ix.class);
                long j3 = tL_messages_stickerSet.set.f26979id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.B = j3;
                K.G = tL_messages_stickerSet;
                K.f39824e = z10;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = ayVar.J;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            yw ywVar = (yw) obj4;
            TLRPC.StickerSet stickerSet = ywVar.f40770c;
            if (longSparseIntArray.indexOfKey(stickerSet.f26979id) < 0) {
                longSparseIntArray.append(stickerSet.f26979id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = ywVar.f40768a;
                if (stickerSet.f26979id == ayVar.d) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                arrayList.add(ix.i(stickerSetCovered, ywVar, z9));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f32731b;
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
        k41 k41Var = (k41) obj2;
        ((ArrayList) obj).add(w31.j(-1, ((m20) this.f32731b).Q1));
    }

    private final void i(Object obj, Object obj2) {
        int i7;
        t20 t20Var = (t20) this.f32731b;
        ArrayList arrayList = (ArrayList) obj;
        k41 k41Var = (k41) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        t20Var.f38197c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.oa.a(t20Var.f38195a).f24305f);
        if (t20Var.f38197c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < t20Var.f38197c.size(); i10++) {
            String str = (String) t20Var.f38197c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i7 = 2131231774;
                } else {
                    i7 = 2131231830;
                }
                arrayList.add(w31.c(i10 + 1, i7, str.substring(1)));
            }
        }
        arrayList.add(w31.c(0, 2131232094, org.telegram.messenger.hd.M0(2131752089, null)));
    }

    private final void j(Object obj, Object obj2) {
        boolean z9;
        di.k6 k6Var;
        u20 u20Var = (u20) this.f32731b;
        ArrayList arrayList = (ArrayList) obj;
        k41 k41Var = (k41) obj2;
        ArrayList arrayList2 = u20Var.Q;
        int i7 = 0;
        if (u20Var.R && (k6Var = u20Var.S) != null && k6Var.f9643i.size() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            di.k6 k6Var2 = u20Var.S;
            int i10 = jg.k1.f16816b;
            w31 K = w31.K(jg.k1.class);
            K.G = k6Var2;
            arrayList.add(K);
        }
        u20Var.T = z9;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            w31 w31Var = new w31(33);
            w31Var.d = i11;
            w31Var.G = (org.telegram.messenger.ij) arrayList2.get(i7);
            arrayList.add(w31Var);
            i7 = i11;
        }
        if (u20Var.U || !u20Var.X) {
            arrayList.add(w31.q(-2, 1));
            arrayList.add(w31.q(-3, 1));
            arrayList.add(w31.q(-4, 1));
        }
        if (!u20Var.T && z9) {
            org.telegram.messenger.g0.h3(new gp(u20Var, 19));
        }
    }

    private final void k(Object obj, Object obj2) {
        i60 i60Var = (i60) this.f32731b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        k60 k60Var = i60Var.f34510y;
        k60Var.f35157f.setAlpha(1.0f);
        if (k60Var.f35182u) {
            i60Var.f34502c = bitmap;
        }
        ri.b bVar = k60Var.f35171n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(k60Var.f35171n, i60Var);
            ViewGroup viewGroup = k60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        ze0 ze0Var = (ze0) this.f32731b;
        ArrayList arrayList = (ArrayList) obj;
        k41 k41Var = (k41) obj2;
        ArrayList arrayList2 = ze0Var.f40926e;
        ArrayList arrayList3 = ze0Var.f40928n;
        int i7 = 0;
        if (ze0Var.d == null) {
            arrayList.add(w31.q(-1, 7));
            arrayList.add(w31.q(-2, 7));
            arrayList.add(w31.q(-3, 7));
            ze0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(ze0Var.f40932x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(w31.r(org.telegram.messenger.hd.M0(2131745723, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                w31 w31Var = new w31(33);
                w31Var.G = (org.telegram.messenger.ij) obj3;
                arrayList.add(w31Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(w31.r(org.telegram.messenger.hd.M0(2131745724, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                w31 w31Var2 = new w31(33);
                w31Var2.G = (org.telegram.messenger.ij) obj4;
                arrayList.add(w31Var2);
            }
        }
        if (ze0Var.f40931w || ((ze0Var.M && !ze0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !ze0Var.f40930s))) {
            arrayList.add(w31.q(ze0Var.L * 3, 7));
            arrayList.add(w31.q((ze0Var.L * 3) + 1, 7));
            arrayList.add(w31.q((ze0Var.L * 3) + 2, 7));
        }
        ze0Var.Q = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        jk0 jk0Var = (jk0) this.f32731b;
        jk0Var.f34959c = (Bitmap) obj;
        Paint paint = new Paint(1);
        jk0Var.f34960e = paint;
        Bitmap bitmap = jk0Var.f34959c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        jk0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        jk0Var.f34961f = new Matrix();
        ri.b bVar = jk0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, jk0Var.f34964s);
        ViewGroup viewGroup = jk0Var.D;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        yv0 yv0Var = (yv0) this.f32731b;
        CharSequence charSequence = (CharSequence) obj;
        yv0Var.n1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.ui.Z(yv0Var.J1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.p10.f24459s0).sendRequest(tL_stickers_renameStickerSet, new x1((org.telegram.messenger.c20) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        j21 j21Var = (j21) this.f32731b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        u11 u11Var = j21Var.f34838v1;
        i21 i21Var = j21Var.E1;
        if (str != null) {
            j21Var.L1 = false;
            j21Var.f34839w1.setText(j21Var.Q0(str));
            i21Var.D(u11Var);
        } else if (j21Var.I) {
        } else {
            int i7 = 2131743947;
            if (j21Var.L1) {
                j21Var.dismiss();
                org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                if (bool.booleanValue()) {
                    i7 = 2131743948;
                }
                e10.k(org.telegram.messenger.qs.P4, 1, org.telegram.messenger.hd.M0(i7, null));
                return;
            }
            hc hcVar = new hc((FrameLayout) j21Var.f28615b, j21Var.I0);
            if (bool.booleanValue()) {
                i7 = 2131743948;
            }
            org.telegram.messenger.k5.p(null, i7, hcVar, null);
            f21 f21Var = j21Var.f34836t1.f34151e;
            String str2 = j21Var.f34835s1;
            j21Var.f34834r1 = str2;
            f21Var.setText(j21.O0(str2, null, null));
            i21Var.D(u11Var);
        }
    }

    @Override
    public final void a(java.lang.Object r34, java.lang.Object r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.a(java.lang.Object, java.lang.Object):void");
    }
}
