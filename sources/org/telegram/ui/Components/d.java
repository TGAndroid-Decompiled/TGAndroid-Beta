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
public final class d implements org.telegram.messenger.k20 {
    public final int f25300a;
    public final Object f25301b;

    public d(Object obj, int i10) {
        this.f25300a = i10;
        this.f25301b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i10;
        cr crVar = (cr) this.f25301b;
        ArrayList arrayList = (ArrayList) obj;
        q51 q51Var = (q51) obj2;
        String str = null;
        if (crVar.Y1 == null) {
            Context context = crVar.getContext();
            org.telegram.ui.ActionBar.p6 p6Var = crVar.I0;
            jg.z2 z2Var = new jg.z2(context, 7);
            z2Var.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624326, 112, 112, null);
            imageView.d();
            z2Var.addView((View) imageView, w7.b6.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(org.telegram.messenger.dd.a0(null, null, 2131744464, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
            z2Var.addView(textView, w7.b6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21038j5, p6Var);
            textView2.setText(org.telegram.messenger.dd.a0(null, null, 2131743262, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            z2Var.addView(textView2, w7.b6.t(-2, -2, 1, 28, 0, 28, 17));
            crVar.Y1 = z2Var;
        }
        arrayList.add(b51.k(crVar.Y1));
        arrayList.add(b51.C(null));
        arrayList.add(b51.u(org.telegram.messenger.dd.L0(2131743457, null)));
        String str2 = crVar.T1;
        String L0 = org.telegram.messenger.dd.L0(2131743458, null);
        int i11 = br.f24912b;
        b51 K = b51.K(br.class);
        K.f24643l = str2;
        K.f24645n = L0;
        K.f24641j = false;
        K.f24639g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = crVar.V1;
        String L02 = org.telegram.messenger.dd.L0(2131743459, null);
        b51 K2 = b51.K(br.class);
        K2.f24643l = spannableStringBuilder;
        K2.f24645n = L02;
        K2.f24641j = true;
        K2.f24639g = false;
        arrayList.add(K2);
        if (crVar.X1) {
            if (crVar.P1) {
                i10 = 2131743454;
            } else {
                i10 = 2131743455;
            }
            str = org.telegram.messenger.dd.L0(i10, null);
        }
        arrayList.add(b51.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        int i10;
        int i11;
        final gs gsVar = (gs) this.f25301b;
        ArrayList arrayList = (ArrayList) obj;
        q51 q51Var = (q51) obj2;
        int i12 = gsVar.P;
        r2 r2Var = gsVar.f26542j0;
        ArrayList arrayList2 = gsVar.V;
        fs fsVar = gsVar.S;
        boolean z11 = gsVar.R;
        HashSet hashSet = new HashSet();
        int i13 = 0;
        if (!TextUtils.isEmpty(gsVar.f26539g0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(gsVar.T);
            arrayList3.addAll(gsVar.U);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 5 && !arrayList2.isEmpty() && !z11) {
                    String L0 = org.telegram.messenger.dd.L0(2131745839, null);
                    if (gsVar.X) {
                        i11 = 2131745358;
                    } else {
                        i11 = 2131745357;
                    }
                    arrayList.add(b51.s(L0, org.telegram.messenger.dd.L0(i11, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    gs gsVar2 = gsVar;
                                    gsVar2.X = !gsVar2.X;
                                    gsVar2.O(true);
                                    return;
                                default:
                                    gs gsVar3 = gsVar;
                                    gsVar3.W = !gsVar3.W;
                                    gsVar3.O(true);
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(b51.r(org.telegram.messenger.dd.L0(2131745839, null)));
                }
                int size = arrayList3.size();
                if (!gsVar.X && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i14 = 0; i14 < size; i14++) {
                    b51 w9 = b51.w((TLObject) arrayList3.get(i14));
                    w9.f24651t = true;
                    w9.H = r2Var;
                    arrayList.add(w9);
                }
            }
            if (!arrayList2.isEmpty() && !z11) {
                arrayList.add(b51.r(org.telegram.messenger.dd.L0(2131745773, null)));
                int size2 = arrayList2.size();
                while (i13 < size2) {
                    Object obj3 = arrayList2.get(i13);
                    i13++;
                    b51 b51Var = new b51(33);
                    b51Var.G = (org.telegram.messenger.kj) obj3;
                    arrayList.add(b51Var);
                }
                if (gsVar.f26536d0) {
                    arrayList.add(b51.p(1));
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.vi.b0(i12).l1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                TLRPC.User Z1 = org.telegram.messenger.wp.r1(i12).Z1(Long.valueOf(org.telegram.messenger.o5.o(((TLRPC.TL_topPeer) arrayList4.get(i15)).peer)));
                if (Z1 != null && Z1.bot) {
                    arrayList5.add(Z1);
                }
            }
        }
        gsVar.Z = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                String L02 = org.telegram.messenger.dd.L0(2131745837, null);
                if (gsVar.W) {
                    i10 = 2131745358;
                } else {
                    i10 = 2131745357;
                }
                arrayList.add(b51.s(L02, org.telegram.messenger.dd.L0(i10, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                gs gsVar2 = gsVar;
                                gsVar2.X = !gsVar2.X;
                                gsVar2.O(true);
                                return;
                            default:
                                gs gsVar3 = gsVar;
                                gsVar3.W = !gsVar3.W;
                                gsVar3.O(true);
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(b51.r(org.telegram.messenger.dd.L0(2131745837, null)));
            }
            for (int i16 = 0; i16 < arrayList5.size() && (i16 < 5 || gsVar.W); i16++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i16);
                if (!hashSet.contains(Long.valueOf(user.f19943id))) {
                    hashSet.add(Long.valueOf(user.f19943id));
                    b51 w10 = b51.w(user);
                    w10.f24648q = true;
                    w10.f24651t = true;
                    w10.H = r2Var;
                    arrayList.add(w10);
                }
            }
        }
        hashSet.clear();
        gsVar.f26533a0 = arrayList.size();
        ArrayList arrayList6 = fsVar.h;
        if (!arrayList6.isEmpty()) {
            if (!z11) {
                arrayList.add(b51.r(org.telegram.messenger.dd.L0(2131745836, null)));
            }
            boolean z12 = false;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i17);
                if (!hashSet.contains(Long.valueOf(user2.f19943id))) {
                    hashSet.add(Long.valueOf(user2.f19943id));
                    b51 w11 = b51.w(user2);
                    w11.f24648q = true;
                    w11.f24649r = true;
                    w11.f24651t = true;
                    w11.H = r2Var;
                    arrayList.add(w11);
                    z12 = true;
                }
            }
            if (fsVar.f26211c || !fsVar.e) {
                arrayList.add(b51.p(29));
                arrayList.add(b51.p(29));
                arrayList.add(b51.p(29));
            }
            z10 = z12;
        } else {
            if (fsVar.f26211c || !fsVar.e) {
                if (!z11) {
                    arrayList.add(b51.p(30));
                }
                arrayList.add(b51.p(29));
                arrayList.add(b51.p(29));
                arrayList.add(b51.p(29));
                arrayList.add(b51.p(29));
            }
            z10 = false;
        }
        if (z10) {
            arrayList.add(b51.C(gsVar.Y));
        }
    }

    private final void d(Object obj, Object obj2) {
        int i10;
        org.telegram.messenger.xo xoVar;
        int i11;
        final cn0 cn0Var = (cn0) this.f25301b;
        ArrayList arrayList = (ArrayList) obj;
        q51 q51Var = (q51) obj2;
        ArrayList arrayList2 = cn0Var.R;
        ArrayList arrayList3 = cn0Var.X;
        int i12 = cn0Var.P;
        int i13 = 0;
        if (TextUtils.isEmpty(cn0Var.f27164d0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    String L0 = org.telegram.messenger.dd.L0(2131745756, null);
                    if (cn0Var.W) {
                        i11 = 2131745358;
                    } else {
                        i11 = 2131745357;
                    }
                    arrayList.add(b51.s(L0, org.telegram.messenger.dd.L0(i11, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    cn0 cn0Var2 = cn0Var;
                                    cn0Var2.W = !cn0Var2.W;
                                    cn0Var2.O(true);
                                    if (cn0Var2.W) {
                                        org.telegram.messenger.i0.v1(cn0Var2.f25188f0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                                default:
                                    cn0 cn0Var3 = cn0Var;
                                    cn0Var3.V = !cn0Var3.V;
                                    cn0Var3.O(true);
                                    if (cn0Var3.V) {
                                        org.telegram.messenger.i0.v1(cn0Var3.f25188f0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(b51.r(org.telegram.messenger.dd.L0(2131745756, null)));
                }
                int size = arrayList3.size();
                if (!cn0Var.W) {
                    size = Math.min(5, size);
                }
                for (int i14 = 0; i14 < size; i14++) {
                    b51 w9 = b51.w((TLObject) arrayList3.get(i14));
                    w9.I = true;
                    arrayList.add(w9);
                }
            }
            HashMap hashMap = org.telegram.messenger.wp.r1(i12).Z7;
            if (hashMap == null) {
                xoVar = null;
            } else {
                xoVar = (org.telegram.messenger.xo) hashMap.get(0L);
            }
            if (xoVar != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = xoVar.f19460b;
                int size2 = arrayList5.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj3 = arrayList5.get(i15);
                    i15++;
                    TLObject tLObject = (TLObject) obj3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        TLRPC.Chat L02 = org.telegram.messenger.wp.r1(i12).L0(Long.valueOf(chat.f19794id));
                        if (org.telegram.messenger.w3.r0(chat) && (L02 == null || org.telegram.messenger.w3.r0(L02))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(b51.r(org.telegram.messenger.dd.L0(2131745728, null)));
                }
                int size3 = arrayList4.size();
                while (i13 < size3) {
                    Object obj4 = arrayList4.get(i13);
                    i13++;
                    arrayList.add(b51.w((TLRPC.Chat) obj4));
                }
                return;
            }
            arrayList.add(b51.p(30));
            arrayList.add(b51.p(29));
            arrayList.add(b51.p(29));
            arrayList.add(b51.p(29));
            arrayList.add(b51.p(29));
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = cn0Var.S;
        int size4 = arrayList7.size();
        int i16 = 0;
        while (i16 < size4) {
            Object obj5 = arrayList7.get(i16);
            i16++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i17 = size4;
            TLRPC.Chat L03 = org.telegram.messenger.wp.r1(i12).L0(Long.valueOf(chat2.f19794id));
            if (org.telegram.messenger.w3.r0(chat2) && (L03 == null || org.telegram.messenger.w3.r0(L03))) {
                arrayList6.add(chat2);
            }
            size4 = i17;
        }
        ArrayList arrayList8 = cn0Var.T;
        int size5 = arrayList8.size();
        int i18 = 0;
        while (i18 < size5) {
            Object obj6 = arrayList8.get(i18);
            i18++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat L04 = org.telegram.messenger.wp.r1(i12).L0(Long.valueOf(chat3.f19794id));
            if (org.telegram.messenger.w3.r0(chat3) && (L04 == null || org.telegram.messenger.w3.r0(L04))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = cn0Var.U;
        int size6 = arrayList9.size();
        int i19 = 0;
        while (i19 < size6) {
            Object obj7 = arrayList9.get(i19);
            i19++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat L05 = org.telegram.messenger.wp.r1(i12).L0(Long.valueOf(chat4.f19794id));
            if (org.telegram.messenger.w3.r0(chat4) && (L05 == null || org.telegram.messenger.w3.r0(L05))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 5 && !arrayList2.isEmpty()) {
                String L06 = org.telegram.messenger.dd.L0(2131745831, null);
                if (cn0Var.V) {
                    i10 = 2131745358;
                } else {
                    i10 = 2131745357;
                }
                arrayList.add(b51.s(L06, org.telegram.messenger.dd.L0(i10, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                cn0 cn0Var2 = cn0Var;
                                cn0Var2.W = !cn0Var2.W;
                                cn0Var2.O(true);
                                if (cn0Var2.W) {
                                    org.telegram.messenger.i0.v1(cn0Var2.f25188f0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                            default:
                                cn0 cn0Var3 = cn0Var;
                                cn0Var3.V = !cn0Var3.V;
                                cn0Var3.O(true);
                                if (cn0Var3.V) {
                                    org.telegram.messenger.i0.v1(cn0Var3.f25188f0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(b51.r(org.telegram.messenger.dd.L0(2131745831, null)));
            }
            int size7 = arrayList6.size();
            if (!cn0Var.V && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i20 = 0; i20 < size7; i20++) {
                arrayList.add(b51.w((TLObject) arrayList6.get(i20)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(b51.r(org.telegram.messenger.dd.L0(2131745773, null)));
            int size8 = arrayList2.size();
            int i21 = 0;
            while (i21 < size8) {
                Object obj8 = arrayList2.get(i21);
                i21++;
                b51 b51Var = new b51(33);
                b51Var.G = (org.telegram.messenger.kj) obj8;
                arrayList.add(b51Var);
            }
            if (cn0Var.f27161a0) {
                arrayList.add(b51.p(1));
            }
        }
    }

    private final void e(Object obj, Object obj2) {
        String str;
        vy vyVar = (vy) this.f25301b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ey eyVar = vyVar.R1;
        if (eyVar != null && (eyVar.getDrawable() instanceof org.telegram.messenger.i4)) {
            org.telegram.messenger.i4 i4Var = (org.telegram.messenger.i4) vyVar.R1.getDrawable();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (i4Var.f16203c.f16413a != intValue) {
                org.telegram.messenger.j4 j4Var = i4Var.f16205g;
                if (j4Var != null) {
                    i4Var.f16203c = j4Var;
                }
                org.telegram.messenger.j4 j4Var2 = i4Var.f16203c;
                if (j4Var2.f16413a != intValue) {
                    j4Var2 = new org.telegram.messenger.j4(intValue, j4Var2.f16414b);
                }
                i4Var.f16205g = j4Var2;
                t5 t5Var = i4Var.e;
                if (t5Var != null) {
                    t5Var.e(true, 0.0f);
                }
            }
            if (i4Var.d.f16413a != intValue2) {
                org.telegram.messenger.j4 j4Var3 = i4Var.h;
                if (j4Var3 != null) {
                    i4Var.d = j4Var3;
                }
                org.telegram.messenger.j4 j4Var4 = i4Var.d;
                if (j4Var4.f16413a != intValue2) {
                    j4Var4 = new org.telegram.messenger.j4(intValue2, j4Var4.f16414b);
                }
                i4Var.h = j4Var4;
                t5 t5Var2 = i4Var.f16204f;
                if (t5Var2 != null) {
                    t5Var2.e(true, 0.0f);
                }
            }
            i4Var.invalidateSelf();
            String str2 = (String) vyVar.R1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                org.telegram.messenger.k6.f16570j.remove(str2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = (String) org.telegram.messenger.k4.f16557a.get(num.intValue());
                }
                sb2.append(str);
                sb2.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = (String) org.telegram.messenger.k4.f16557a.get(num2.intValue());
                }
                sb2.append(str3);
                org.telegram.messenger.k6.f16570j.put(str2, sb2.toString());
            }
            org.telegram.messenger.k6.q();
        }
    }

    private final void f(Object obj, Object obj2) {
        boolean z10;
        qy qyVar = (qy) this.f25301b;
        ArrayList arrayList = (ArrayList) obj;
        q51 q51Var = (q51) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = qyVar.E;
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i10);
            i10++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f19821id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f19821id, 1);
                if (tL_messages_stickerSet.set.f19821id != qyVar.d) {
                    z11 = false;
                }
                int i11 = wx.f32331b;
                b51 K = b51.K(wx.class);
                long j10 = tL_messages_stickerSet.set.f19821id;
                K.d = (int) ((j10 >>> 32) ^ j10);
                K.B = j10;
                K.G = tL_messages_stickerSet;
                K.e = z11;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = qyVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            nx nxVar = (nx) obj4;
            TLRPC.StickerSet stickerSet = nxVar.f28972c;
            if (longSparseIntArray.indexOfKey(stickerSet.f19821id) < 0) {
                longSparseIntArray.append(stickerSet.f19821id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = nxVar.f28970a;
                if (stickerSet.f19821id == qyVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(wx.i(stickerSetCovered, nxVar, z10));
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f25301b;
        float[] fArr = FragmentContextView.W0;
        fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
        MediaController B = MediaController.B();
        boolean z10 = fragmentContextView.W;
        org.telegram.ui.ActionBar.x0 x0Var = fragmentContextView.I;
        float floatValue = ((Float) obj).floatValue();
        x0Var.getClass();
        B.m0(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void h(Object obj, Object obj2) {
        q51 q51Var = (q51) obj2;
        ((ArrayList) obj).add(b51.j(-1, ((e30) this.f25301b).Q1));
    }

    private final void i(Object obj, Object obj2) {
        int i10;
        l30 l30Var = (l30) this.f25301b;
        ArrayList arrayList = (ArrayList) obj;
        q51 q51Var = (q51) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        l30Var.f28040c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.pa.a(l30Var.f28038a).f17580f);
        if (l30Var.f28040c.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < l30Var.f28040c.size(); i11++) {
            String str = (String) l30Var.f28040c.get(i11);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i10 = 2131231773;
                } else {
                    i10 = 2131231829;
                }
                arrayList.add(b51.c(i11 + 1, i10, str.substring(1)));
            }
        }
        arrayList.add(b51.c(0, 2131232093, org.telegram.messenger.dd.L0(2131752089, null)));
    }

    private final void j(Object obj, Object obj2) {
        boolean z10;
        th.r4 r4Var;
        m30 m30Var = (m30) this.f25301b;
        ArrayList arrayList = (ArrayList) obj;
        q51 q51Var = (q51) obj2;
        ArrayList arrayList2 = m30Var.Q;
        int i10 = 0;
        if (m30Var.R && (r4Var = m30Var.S) != null && r4Var.f49650i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            th.r4 r4Var2 = m30Var.S;
            int i11 = zf.z0.f55733b;
            b51 K = b51.K(zf.z0.class);
            K.G = r4Var2;
            arrayList.add(K);
        }
        m30Var.T = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            b51 b51Var = new b51(33);
            b51Var.d = i12;
            b51Var.G = (org.telegram.messenger.kj) arrayList2.get(i10);
            arrayList.add(b51Var);
            i10 = i12;
        }
        if (m30Var.U || !m30Var.X) {
            arrayList.add(b51.q(-2, 1));
            arrayList.add(b51.q(-3, 1));
            arrayList.add(b51.q(-4, 1));
        }
        if (!m30Var.T && z10) {
            org.telegram.messenger.i0.g3(new ho(m30Var, 21));
        }
    }

    private final void k(Object obj, Object obj2) {
        x60 x60Var = (x60) this.f25301b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        z60 z60Var = x60Var.f32451y;
        z60Var.f33021f.setAlpha(1.0f);
        if (z60Var.f33046u) {
            x60Var.f32444c = bitmap;
        }
        hi.b bVar = z60Var.f33035n;
        if (bVar != null) {
            bVar.a(bitmap2);
            yg.d.c(z60Var.f33035n, x60Var);
            ViewGroup viewGroup = z60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        cg0 cg0Var = (cg0) this.f25301b;
        ArrayList arrayList = (ArrayList) obj;
        q51 q51Var = (q51) obj2;
        ArrayList arrayList2 = cg0Var.e;
        ArrayList arrayList3 = cg0Var.f25110n;
        int i10 = 0;
        if (cg0Var.d == null) {
            arrayList.add(b51.q(-1, 7));
            arrayList.add(b51.q(-2, 7));
            arrayList.add(b51.q(-3, 7));
            cg0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(cg0Var.f25114x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(b51.r(org.telegram.messenger.dd.L0(2131745739, null)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                b51 b51Var = new b51(33);
                b51Var.G = (org.telegram.messenger.kj) obj3;
                arrayList.add(b51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(b51.r(org.telegram.messenger.dd.L0(2131745740, null)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                b51 b51Var2 = new b51(33);
                b51Var2.G = (org.telegram.messenger.kj) obj4;
                arrayList.add(b51Var2);
            }
        }
        if (cg0Var.f25113w || ((cg0Var.M && !cg0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !cg0Var.f25112s))) {
            arrayList.add(b51.q(cg0Var.L * 3, 7));
            arrayList.add(b51.q((cg0Var.L * 3) + 1, 7));
            arrayList.add(b51.q((cg0Var.L * 3) + 2, 7));
        }
        cg0Var.Q = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        ol0 ol0Var = (ol0) this.f25301b;
        ol0Var.f29165c = (Bitmap) obj;
        Paint paint = new Paint(1);
        ol0Var.e = paint;
        Bitmap bitmap = ol0Var.f29165c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        ol0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        ol0Var.f29166f = new Matrix();
        hi.b bVar = ol0Var.h;
        bVar.a((Bitmap) obj2);
        yg.d.c(bVar, ol0Var.f29169s);
        ViewGroup viewGroup = ol0Var.D;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        dx0 dx0Var = (dx0) this.f25301b;
        CharSequence charSequence = (CharSequence) obj;
        dx0Var.f25626n1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.vi.Z(dx0Var.J1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.e20.f15506s0).sendRequest(tL_stickers_renameStickerSet, new x1((org.telegram.messenger.r20) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        n31 n31Var = (n31) this.f25301b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        y21 y21Var = n31Var.f28658v1;
        m31 m31Var = n31Var.E1;
        if (str != null) {
            n31Var.L1 = false;
            n31Var.f28659w1.setText(n31Var.Q0(str));
            m31Var.D(y21Var);
        } else if (n31Var.I) {
        } else {
            int i10 = 2131743971;
            if (n31Var.L1) {
                n31Var.dismiss();
                org.telegram.messenger.at e = org.telegram.messenger.at.e();
                if (bool.booleanValue()) {
                    i10 = 2131743972;
                }
                e.k(org.telegram.messenger.at.P4, 1, org.telegram.messenger.dd.L0(i10, null));
                return;
            }
            cc ccVar = new cc((FrameLayout) n31Var.f21587b, n31Var.I0);
            if (bool.booleanValue()) {
                i10 = 2131743972;
            }
            org.telegram.messenger.m5.o(null, i10, ccVar, null);
            j31 j31Var = n31Var.f28656t1.e;
            String str2 = n31Var.f28655s1;
            n31Var.f28654r1 = str2;
            j31Var.setText(n31.O0(str2, null, null));
            m31Var.D(y21Var);
        }
    }

    @Override
    public final void a(java.lang.Object r34, java.lang.Object r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.a(java.lang.Object, java.lang.Object):void");
    }
}
