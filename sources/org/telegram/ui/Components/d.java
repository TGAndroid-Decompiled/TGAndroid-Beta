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
public final class d implements org.telegram.messenger.p10 {
    public final int f34175a;
    public final Object f34176b;

    public d(Object obj, int i7) {
        this.f34175a = i7;
        this.f34176b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        gr grVar = (gr) this.f34176b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        String str = null;
        if (grVar.f35521c2 == null) {
            Context context = grVar.getContext();
            org.telegram.ui.ActionBar.i6 i6Var = grVar.J0;
            ai.l2 l2Var = new ai.l2(context, 7);
            l2Var.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624329, 112, 112, null);
            imageView.d();
            l2Var.addView((View) imageView, c8.na.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131744193, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
            l2Var.addView(textView, c8.na.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
            textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131742986, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            l2Var.addView(textView2, c8.na.t(-2, -2, 1, 28, 0, 28, 17));
            grVar.f35521c2 = l2Var;
        }
        arrayList.add(n41.k(grVar.f35521c2));
        arrayList.add(n41.C(null));
        arrayList.add(n41.u(org.telegram.messenger.gd.N0(2131743181, null)));
        String str2 = grVar.X1;
        String N0 = org.telegram.messenger.gd.N0(2131743182, null);
        int i10 = fr.f35184b;
        n41 K = n41.K(fr.class);
        K.f37655m = str2;
        K.f37657o = N0;
        K.f37652j = false;
        K.f37650g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = grVar.Z1;
        String N02 = org.telegram.messenger.gd.N0(2131743183, null);
        n41 K2 = n41.K(fr.class);
        K2.f37655m = spannableStringBuilder;
        K2.f37657o = N02;
        K2.f37652j = true;
        K2.f37650g = false;
        arrayList.add(K2);
        if (grVar.f35520b2) {
            if (grVar.T1) {
                i7 = 2131743178;
            } else {
                i7 = 2131743179;
            }
            str = org.telegram.messenger.gd.N0(i7, null);
        }
        arrayList.add(n41.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        int i7;
        int i10;
        final hs hsVar = (hs) this.f34176b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        int i11 = hsVar.Q;
        y2 y2Var = hsVar.f35812k0;
        ArrayList arrayList2 = hsVar.W;
        gs gsVar = hsVar.T;
        boolean z11 = hsVar.S;
        HashSet hashSet = new HashSet();
        int i12 = 0;
        if (!TextUtils.isEmpty(hsVar.f35809h0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(hsVar.U);
            arrayList3.addAll(hsVar.V);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 5 && !arrayList2.isEmpty() && !z11) {
                    String N0 = org.telegram.messenger.gd.N0(2131745626, null);
                    if (hsVar.Y) {
                        i10 = 2131745144;
                    } else {
                        i10 = 2131745143;
                    }
                    arrayList.add(n41.s(N0, org.telegram.messenger.gd.N0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    hs hsVar2 = hsVar;
                                    hsVar2.Y = !hsVar2.Y;
                                    hsVar2.O(true);
                                    return;
                                default:
                                    hs hsVar3 = hsVar;
                                    hsVar3.X = !hsVar3.X;
                                    hsVar3.O(true);
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745626, null)));
                }
                int size = arrayList3.size();
                if (!hsVar.Y && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    n41 w10 = n41.w((TLObject) arrayList3.get(i13));
                    w10.f37663u = true;
                    w10.I = y2Var;
                    arrayList.add(w10);
                }
            }
            if (!arrayList2.isEmpty() && !z11) {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745560, null)));
                int size2 = arrayList2.size();
                while (i12 < size2) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    n41 n41Var = new n41(33);
                    n41Var.H = (org.telegram.messenger.fj) obj3;
                    arrayList.add(n41Var);
                }
                if (hsVar.f35806e0) {
                    arrayList.add(n41.p(1));
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.ri.d0(i11).f26725m1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(org.telegram.messenger.n5.o(((TLRPC.TL_topPeer) arrayList4.get(i14)).peer)));
                if (c22 != null && c22.bot) {
                    arrayList5.add(c22);
                }
            }
        }
        hsVar.f35802a0 = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                String N02 = org.telegram.messenger.gd.N0(2131745624, null);
                if (hsVar.X) {
                    i7 = 2131745144;
                } else {
                    i7 = 2131745143;
                }
                arrayList.add(n41.s(N02, org.telegram.messenger.gd.N0(i7, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                hs hsVar2 = hsVar;
                                hsVar2.Y = !hsVar2.Y;
                                hsVar2.O(true);
                                return;
                            default:
                                hs hsVar3 = hsVar;
                                hsVar3.X = !hsVar3.X;
                                hsVar3.O(true);
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745624, null)));
            }
            for (int i15 = 0; i15 < arrayList5.size() && (i15 < 5 || hsVar.X); i15++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i15);
                if (!hashSet.contains(Long.valueOf(user.f28641id))) {
                    hashSet.add(Long.valueOf(user.f28641id));
                    n41 w11 = n41.w(user);
                    w11.f37660r = true;
                    w11.f37663u = true;
                    w11.I = y2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        hsVar.f35803b0 = arrayList.size();
        ArrayList arrayList6 = gsVar.h;
        if (!arrayList6.isEmpty()) {
            if (!z11) {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745623, null)));
            }
            boolean z12 = false;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i16);
                if (!hashSet.contains(Long.valueOf(user2.f28641id))) {
                    hashSet.add(Long.valueOf(user2.f28641id));
                    n41 w12 = n41.w(user2);
                    w12.f37660r = true;
                    w12.f37661s = true;
                    w12.f37663u = true;
                    w12.I = y2Var;
                    arrayList.add(w12);
                    z12 = true;
                }
            }
            if (gsVar.f35525c || !gsVar.f35526e) {
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
            }
            z10 = z12;
        } else {
            if (gsVar.f35525c || !gsVar.f35526e) {
                if (!z11) {
                    arrayList.add(n41.p(30));
                }
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
                arrayList.add(n41.p(29));
            }
            z10 = false;
        }
        if (z10) {
            arrayList.add(n41.C(hsVar.Z));
        }
    }

    private final void d(Object obj, Object obj2) {
        int i7;
        org.telegram.messenger.no noVar;
        int i10;
        final om0 om0Var = (om0) this.f34176b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        ArrayList arrayList2 = om0Var.S;
        ArrayList arrayList3 = om0Var.Y;
        int i11 = om0Var.Q;
        int i12 = 0;
        if (TextUtils.isEmpty(om0Var.f36507e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    String N0 = org.telegram.messenger.gd.N0(2131745543, null);
                    if (om0Var.X) {
                        i10 = 2131745144;
                    } else {
                        i10 = 2131745143;
                    }
                    arrayList.add(n41.s(N0, org.telegram.messenger.gd.N0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    om0 om0Var2 = om0Var;
                                    om0Var2.X = !om0Var2.X;
                                    om0Var2.O(true);
                                    if (om0Var2.X) {
                                        org.telegram.messenger.g0.v1(om0Var2.f38218g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                                default:
                                    om0 om0Var3 = om0Var;
                                    om0Var3.W = !om0Var3.W;
                                    om0Var3.O(true);
                                    if (om0Var3.W) {
                                        org.telegram.messenger.g0.v1(om0Var3.f38218g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745543, null)));
                }
                int size = arrayList3.size();
                if (!om0Var.X) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    n41 w10 = n41.w((TLObject) arrayList3.get(i13));
                    w10.J = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.mp.u1(i11).f25735e8;
            if (hashMap == null) {
                noVar = null;
            } else {
                noVar = (org.telegram.messenger.no) hashMap.get(0L);
            }
            if (noVar != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = noVar.f26049b;
                int size2 = arrayList5.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj3 = arrayList5.get(i14);
                    i14++;
                    TLObject tLObject = (TLObject) obj3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(chat.f28492id));
                        if (org.telegram.messenger.v3.r0(chat) && (O0 == null || org.telegram.messenger.v3.r0(O0))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745515, null)));
                }
                int size3 = arrayList4.size();
                while (i12 < size3) {
                    Object obj4 = arrayList4.get(i12);
                    i12++;
                    arrayList.add(n41.w((TLRPC.Chat) obj4));
                }
                return;
            }
            arrayList.add(n41.p(30));
            arrayList.add(n41.p(29));
            arrayList.add(n41.p(29));
            arrayList.add(n41.p(29));
            arrayList.add(n41.p(29));
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = om0Var.T;
        int size4 = arrayList7.size();
        int i15 = 0;
        while (i15 < size4) {
            Object obj5 = arrayList7.get(i15);
            i15++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i16 = size4;
            TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(chat2.f28492id));
            if (org.telegram.messenger.v3.r0(chat2) && (O02 == null || org.telegram.messenger.v3.r0(O02))) {
                arrayList6.add(chat2);
            }
            size4 = i16;
        }
        ArrayList arrayList8 = om0Var.U;
        int size5 = arrayList8.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj6 = arrayList8.get(i17);
            i17++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat O03 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(chat3.f28492id));
            if (org.telegram.messenger.v3.r0(chat3) && (O03 == null || org.telegram.messenger.v3.r0(O03))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = om0Var.V;
        int size6 = arrayList9.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj7 = arrayList9.get(i18);
            i18++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat O04 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(chat4.f28492id));
            if (org.telegram.messenger.v3.r0(chat4) && (O04 == null || org.telegram.messenger.v3.r0(O04))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 5 && !arrayList2.isEmpty()) {
                String N02 = org.telegram.messenger.gd.N0(2131745618, null);
                if (om0Var.W) {
                    i7 = 2131745144;
                } else {
                    i7 = 2131745143;
                }
                arrayList.add(n41.s(N02, org.telegram.messenger.gd.N0(i7, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                om0 om0Var2 = om0Var;
                                om0Var2.X = !om0Var2.X;
                                om0Var2.O(true);
                                if (om0Var2.X) {
                                    org.telegram.messenger.g0.v1(om0Var2.f38218g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                            default:
                                om0 om0Var3 = om0Var;
                                om0Var3.W = !om0Var3.W;
                                om0Var3.O(true);
                                if (om0Var3.W) {
                                    org.telegram.messenger.g0.v1(om0Var3.f38218g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745618, null)));
            }
            int size7 = arrayList6.size();
            if (!om0Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i19 = 0; i19 < size7; i19++) {
                arrayList.add(n41.w((TLObject) arrayList6.get(i19)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745560, null)));
            int size8 = arrayList2.size();
            int i20 = 0;
            while (i20 < size8) {
                Object obj8 = arrayList2.get(i20);
                i20++;
                n41 n41Var = new n41(33);
                n41Var.H = (org.telegram.messenger.fj) obj8;
                arrayList.add(n41Var);
            }
            if (om0Var.f36504b0) {
                arrayList.add(n41.p(1));
            }
        }
    }

    private final void e(Object obj, Object obj2) {
        String str;
        qy qyVar = (qy) this.f34176b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        yx yxVar = qyVar.S1;
        if (yxVar != null && (yxVar.getDrawable() instanceof org.telegram.messenger.h4)) {
            org.telegram.messenger.h4 h4Var = (org.telegram.messenger.h4) qyVar.S1.getDrawable();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (h4Var.f24480c.f24675a != intValue) {
                org.telegram.messenger.i4 i4Var = h4Var.f24483g;
                if (i4Var != null) {
                    h4Var.f24480c = i4Var;
                }
                org.telegram.messenger.i4 i4Var2 = h4Var.f24480c;
                if (i4Var2.f24675a != intValue) {
                    i4Var2 = new org.telegram.messenger.i4(intValue, i4Var2.f24676b);
                }
                h4Var.f24483g = i4Var2;
                c6 c6Var = h4Var.f24481e;
                if (c6Var != null) {
                    c6Var.e(true, 0.0f);
                }
            }
            if (h4Var.d.f24675a != intValue2) {
                org.telegram.messenger.i4 i4Var3 = h4Var.h;
                if (i4Var3 != null) {
                    h4Var.d = i4Var3;
                }
                org.telegram.messenger.i4 i4Var4 = h4Var.d;
                if (i4Var4.f24675a != intValue2) {
                    i4Var4 = new org.telegram.messenger.i4(intValue2, i4Var4.f24676b);
                }
                h4Var.h = i4Var4;
                c6 c6Var2 = h4Var.f24482f;
                if (c6Var2 != null) {
                    c6Var2.e(true, 0.0f);
                }
            }
            h4Var.invalidateSelf();
            String str2 = (String) qyVar.S1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                org.telegram.messenger.j6.f24927j.remove(str2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = (String) org.telegram.messenger.j4.f24916a.get(num.intValue());
                }
                sb2.append(str);
                sb2.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = (String) org.telegram.messenger.j4.f24916a.get(num2.intValue());
                }
                sb2.append(str3);
                org.telegram.messenger.j6.f24927j.put(str2, sb2.toString());
            }
            org.telegram.messenger.j6.q();
        }
    }

    private final void f(Object obj, Object obj2) {
        px pxVar = (px) this.f34176b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        ArrayList arrayList2 = pxVar.f38606s;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = arrayList2.get(i7);
            i7++;
            jx jxVar = (jx) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = jxVar.f36557b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f28519id != pxVar.d) {
                    z10 = false;
                }
                int i10 = rx.f39430b;
                n41 K = n41.K(rx.class);
                long j3 = tL_messages_stickerSet.set.f28519id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.f37648e = z10;
                arrayList.add(K);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = jxVar.f36556a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f28519id != pxVar.d) {
                        z10 = false;
                    }
                    arrayList.add(rx.i(stickerSetCovered, jxVar, z10));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        boolean z10;
        ly lyVar = (ly) this.f34176b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = lyVar.F;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f28519id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f28519id, 1);
                if (tL_messages_stickerSet.set.f28519id != lyVar.d) {
                    z11 = false;
                }
                int i10 = rx.f39430b;
                n41 K = n41.K(rx.class);
                long j3 = tL_messages_stickerSet.set.f28519id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.f37648e = z11;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = lyVar.K;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            jx jxVar = (jx) obj4;
            TLRPC.StickerSet stickerSet = jxVar.f36558c;
            if (longSparseIntArray.indexOfKey(stickerSet.f28519id) < 0) {
                longSparseIntArray.append(stickerSet.f28519id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = jxVar.f36556a;
                if (stickerSet.f28519id == lyVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(rx.i(stickerSetCovered, jxVar, z10));
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f34176b;
        float[] fArr = FragmentContextView.X0;
        fragmentContextView.B0 = !((Boolean) obj2).booleanValue();
        MediaController B = MediaController.B();
        boolean z10 = fragmentContextView.f33053a0;
        org.telegram.ui.ActionBar.u0 u0Var = fragmentContextView.J;
        float floatValue = ((Float) obj).floatValue();
        u0Var.getClass();
        B.m0(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void i(Object obj, Object obj2) {
        int i7;
        e30 e30Var = (e30) this.f34176b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        e30Var.f34559c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.ma.a(e30Var.f34557a).f25647f);
        if (e30Var.f34559c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < e30Var.f34559c.size(); i10++) {
            String str = (String) e30Var.f34559c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i7 = 2131231778;
                } else {
                    i7 = 2131231834;
                }
                arrayList.add(n41.c(i10 + 1, i7, str.substring(1)));
            }
        }
        arrayList.add(n41.c(0, 2131232099, org.telegram.messenger.gd.N0(2131752077, null)));
    }

    private final void j(Object obj, Object obj2) {
        boolean z10;
        fi.b6 b6Var;
        f30 f30Var = (f30) this.f34176b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        ArrayList arrayList2 = f30Var.R;
        int i7 = 0;
        if (f30Var.S && (b6Var = f30Var.T) != null && b6Var.f12051i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            fi.b6 b6Var2 = f30Var.T;
            int i10 = jg.j1.f17641b;
            n41 K = n41.K(jg.j1.class);
            K.H = b6Var2;
            arrayList.add(K);
        }
        f30Var.U = z10;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            n41 n41Var = new n41(33);
            n41Var.d = i11;
            n41Var.H = (org.telegram.messenger.fj) arrayList2.get(i7);
            arrayList.add(n41Var);
            i7 = i11;
        }
        if (f30Var.V || !f30Var.Y) {
            arrayList.add(n41.q(-2, 1));
            arrayList.add(n41.q(-3, 1));
            arrayList.add(n41.q(-4, 1));
        }
        if (!f30Var.U && z10) {
            org.telegram.messenger.g0.g3(new lo(f30Var, 21));
        }
    }

    private final void k(Object obj, Object obj2) {
        t60 t60Var = (t60) this.f34176b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        x60 x60Var = t60Var.G;
        x60Var.f41868f.setAlpha(1.0f);
        if (x60Var.f41896u) {
            t60Var.f39809c = bitmap;
        }
        ui.b bVar = x60Var.f41882n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(x60Var.f41882n, t60Var);
            ViewGroup viewGroup = x60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        nf0 nf0Var = (nf0) this.f34176b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        ArrayList arrayList2 = nf0Var.f37774e;
        ArrayList arrayList3 = nf0Var.f37776n;
        int i7 = 0;
        if (nf0Var.d == null) {
            arrayList.add(n41.q(-1, 7));
            arrayList.add(n41.q(-2, 7));
            arrayList.add(n41.q(-3, 7));
            nf0Var.R = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(nf0Var.f37780x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745526, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                n41 n41Var = new n41(33);
                n41Var.H = (org.telegram.messenger.fj) obj3;
                arrayList.add(n41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131745527, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                n41 n41Var2 = new n41(33);
                n41Var2.H = (org.telegram.messenger.fj) obj4;
                arrayList.add(n41Var2);
            }
        }
        if (nf0Var.f37779w || ((nf0Var.N && !nf0Var.O) || (!isEmpty && !arrayList3.isEmpty() && !nf0Var.f37778s))) {
            arrayList.add(n41.q(nf0Var.M * 3, 7));
            arrayList.add(n41.q((nf0Var.M * 3) + 1, 7));
            arrayList.add(n41.q((nf0Var.M * 3) + 2, 7));
        }
        nf0Var.R = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        yk0 yk0Var = (yk0) this.f34176b;
        yk0Var.f42505c = (Bitmap) obj;
        Paint paint = new Paint(1);
        yk0Var.f42506e = paint;
        Bitmap bitmap = yk0Var.f42505c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        yk0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        yk0Var.f42507f = new Matrix();
        ui.b bVar = yk0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, yk0Var.f42510s);
        ViewGroup viewGroup = yk0Var.E;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        jw0 jw0Var = (jw0) this.f34176b;
        CharSequence charSequence = (CharSequence) obj;
        jw0Var.f36547r1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.ri.b0(jw0Var.N1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.i10.f24637t0).sendRequest(tL_stickers_renameStickerSet, new e2((org.telegram.messenger.w10) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        a31 a31Var = (a31) this.f34176b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        l21 l21Var = a31Var.f33361z1;
        z21 z21Var = a31Var.I1;
        if (str != null) {
            a31Var.P1 = false;
            a31Var.A1.setText(a31Var.S0(str));
            z21Var.D(l21Var);
        } else if (a31Var.J) {
        } else {
            int i7 = 2131743699;
            if (a31Var.P1) {
                a31Var.dismiss();
                org.telegram.messenger.ks e10 = org.telegram.messenger.ks.e();
                if (bool.booleanValue()) {
                    i7 = 2131743700;
                }
                e10.k(org.telegram.messenger.ks.S4, 1, org.telegram.messenger.gd.N0(i7, null));
                return;
            }
            kc kcVar = new kc((FrameLayout) a31Var.f30226b, a31Var.J0);
            if (bool.booleanValue()) {
                i7 = 2131743700;
            }
            org.telegram.messenger.f3.o(null, i7, kcVar, null);
            w21 w21Var = a31Var.f33359x1.f42311e;
            String str2 = a31Var.f33358w1;
            a31Var.f33357v1 = str2;
            w21Var.setText(a31.P0(str2, null, null));
            z21Var.D(l21Var);
        }
    }

    @Override
    public final void a(java.lang.Object r30, java.lang.Object r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.a(java.lang.Object, java.lang.Object):void");
    }
}
