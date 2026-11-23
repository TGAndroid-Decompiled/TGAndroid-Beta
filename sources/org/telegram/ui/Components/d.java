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
public final class d implements org.telegram.messenger.r10 {
    public final int f34337a;
    public final Object f34338b;

    public d(Object obj, int i7) {
        this.f34337a = i7;
        this.f34338b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        jr jrVar = (jr) this.f34338b;
        ArrayList arrayList = (ArrayList) obj;
        c51 c51Var = (c51) obj2;
        String str = null;
        if (jrVar.f36588c2 == null) {
            Context context = jrVar.getContext();
            org.telegram.ui.ActionBar.h6 h6Var = jrVar.J0;
            ai.u2 u2Var = new ai.u2(context, 7);
            u2Var.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624329, 112, 112, null);
            imageView.d();
            u2Var.addView((View) imageView, c8.ma.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131744195, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
            u2Var.addView(textView, c8.ma.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29489j5, h6Var);
            textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131742991, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            u2Var.addView(textView2, c8.ma.t(-2, -2, 1, 28, 0, 28, 17));
            jrVar.f36588c2 = u2Var;
        }
        arrayList.add(o41.k(jrVar.f36588c2));
        arrayList.add(o41.C(null));
        arrayList.add(o41.u(org.telegram.messenger.hd.N0(2131743186, null)));
        String str2 = jrVar.X1;
        String N0 = org.telegram.messenger.hd.N0(2131743187, null);
        int i10 = ir.f36302b;
        o41 K = o41.K(ir.class);
        K.f38091m = str2;
        K.f38093o = N0;
        K.f38088j = false;
        K.f38086g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = jrVar.Z1;
        String N02 = org.telegram.messenger.hd.N0(2131743188, null);
        o41 K2 = o41.K(ir.class);
        K2.f38091m = spannableStringBuilder;
        K2.f38093o = N02;
        K2.f38088j = true;
        K2.f38086g = false;
        arrayList.add(K2);
        if (jrVar.f36587b2) {
            if (jrVar.T1) {
                i7 = 2131743183;
            } else {
                i7 = 2131743184;
            }
            str = org.telegram.messenger.hd.N0(i7, null);
        }
        arrayList.add(o41.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        int i7;
        int i10;
        final ks ksVar = (ks) this.f34338b;
        ArrayList arrayList = (ArrayList) obj;
        c51 c51Var = (c51) obj2;
        int i11 = ksVar.Q;
        z2 z2Var = ksVar.f36974k0;
        ArrayList arrayList2 = ksVar.W;
        js jsVar = ksVar.T;
        boolean z11 = ksVar.S;
        HashSet hashSet = new HashSet();
        int i12 = 0;
        if (!TextUtils.isEmpty(ksVar.f36971h0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(ksVar.U);
            arrayList3.addAll(ksVar.V);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 5 && !arrayList2.isEmpty() && !z11) {
                    String N0 = org.telegram.messenger.hd.N0(2131745626, null);
                    if (ksVar.Y) {
                        i10 = 2131745144;
                    } else {
                        i10 = 2131745143;
                    }
                    arrayList.add(o41.s(N0, org.telegram.messenger.hd.N0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    ks ksVar2 = ksVar;
                                    ksVar2.Y = !ksVar2.Y;
                                    ksVar2.O(true);
                                    return;
                                default:
                                    ks ksVar3 = ksVar;
                                    ksVar3.X = !ksVar3.X;
                                    ksVar3.O(true);
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745626, null)));
                }
                int size = arrayList3.size();
                if (!ksVar.Y && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    o41 w10 = o41.w((TLObject) arrayList3.get(i13));
                    w10.f38099u = true;
                    w10.I = z2Var;
                    arrayList.add(w10);
                }
            }
            if (!arrayList2.isEmpty() && !z11) {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745560, null)));
                int size2 = arrayList2.size();
                while (i12 < size2) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    o41 o41Var = new o41(33);
                    o41Var.H = (org.telegram.messenger.gj) obj3;
                    arrayList.add(o41Var);
                }
                if (ksVar.f36968e0) {
                    arrayList.add(o41.p(1));
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.si.d0(i11).f26838m1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                TLRPC.User c22 = org.telegram.messenger.np.u1(i11).c2(Long.valueOf(org.telegram.messenger.n5.o(((TLRPC.TL_topPeer) arrayList4.get(i14)).peer)));
                if (c22 != null && c22.bot) {
                    arrayList5.add(c22);
                }
            }
        }
        ksVar.f36964a0 = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                String N02 = org.telegram.messenger.hd.N0(2131745624, null);
                if (ksVar.X) {
                    i7 = 2131745144;
                } else {
                    i7 = 2131745143;
                }
                arrayList.add(o41.s(N02, org.telegram.messenger.hd.N0(i7, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                ks ksVar2 = ksVar;
                                ksVar2.Y = !ksVar2.Y;
                                ksVar2.O(true);
                                return;
                            default:
                                ks ksVar3 = ksVar;
                                ksVar3.X = !ksVar3.X;
                                ksVar3.O(true);
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745624, null)));
            }
            for (int i15 = 0; i15 < arrayList5.size() && (i15 < 5 || ksVar.X); i15++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i15);
                if (!hashSet.contains(Long.valueOf(user.f28583id))) {
                    hashSet.add(Long.valueOf(user.f28583id));
                    o41 w11 = o41.w(user);
                    w11.f38096r = true;
                    w11.f38099u = true;
                    w11.I = z2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        ksVar.f36965b0 = arrayList.size();
        ArrayList arrayList6 = jsVar.h;
        if (!arrayList6.isEmpty()) {
            if (!z11) {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745623, null)));
            }
            boolean z12 = false;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i16);
                if (!hashSet.contains(Long.valueOf(user2.f28583id))) {
                    hashSet.add(Long.valueOf(user2.f28583id));
                    o41 w12 = o41.w(user2);
                    w12.f38096r = true;
                    w12.f38097s = true;
                    w12.f38099u = true;
                    w12.I = z2Var;
                    arrayList.add(w12);
                    z12 = true;
                }
            }
            if (jsVar.f36593c || !jsVar.f36594e) {
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
            }
            z10 = z12;
        } else {
            if (jsVar.f36593c || !jsVar.f36594e) {
                if (!z11) {
                    arrayList.add(o41.p(30));
                }
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
                arrayList.add(o41.p(29));
            }
            z10 = false;
        }
        if (z10) {
            arrayList.add(o41.C(ksVar.Z));
        }
    }

    private final void d(Object obj, Object obj2) {
        int i7;
        org.telegram.messenger.oo ooVar;
        int i10;
        final pm0 pm0Var = (pm0) this.f34338b;
        ArrayList arrayList = (ArrayList) obj;
        c51 c51Var = (c51) obj2;
        ArrayList arrayList2 = pm0Var.S;
        ArrayList arrayList3 = pm0Var.Y;
        int i11 = pm0Var.Q;
        int i12 = 0;
        if (TextUtils.isEmpty(pm0Var.f37625e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    String N0 = org.telegram.messenger.hd.N0(2131745543, null);
                    if (pm0Var.X) {
                        i10 = 2131745144;
                    } else {
                        i10 = 2131745143;
                    }
                    arrayList.add(o41.s(N0, org.telegram.messenger.hd.N0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    pm0 pm0Var2 = pm0Var;
                                    pm0Var2.X = !pm0Var2.X;
                                    pm0Var2.O(true);
                                    if (pm0Var2.X) {
                                        org.telegram.messenger.g0.v1(pm0Var2.f38637g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                                default:
                                    pm0 pm0Var3 = pm0Var;
                                    pm0Var3.W = !pm0Var3.W;
                                    pm0Var3.O(true);
                                    if (pm0Var3.W) {
                                        org.telegram.messenger.g0.v1(pm0Var3.f38637g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745543, null)));
                }
                int size = arrayList3.size();
                if (!pm0Var.X) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    o41 w10 = o41.w((TLObject) arrayList3.get(i13));
                    w10.J = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.np.u1(i11).f25839e8;
            if (hashMap == null) {
                ooVar = null;
            } else {
                ooVar = (org.telegram.messenger.oo) hashMap.get(0L);
            }
            if (ooVar != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = ooVar.f26152b;
                int size2 = arrayList5.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj3 = arrayList5.get(i14);
                    i14++;
                    TLObject tLObject = (TLObject) obj3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        TLRPC.Chat O0 = org.telegram.messenger.np.u1(i11).O0(Long.valueOf(chat.f28434id));
                        if (org.telegram.messenger.v3.r0(chat) && (O0 == null || org.telegram.messenger.v3.r0(O0))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745515, null)));
                }
                int size3 = arrayList4.size();
                while (i12 < size3) {
                    Object obj4 = arrayList4.get(i12);
                    i12++;
                    arrayList.add(o41.w((TLRPC.Chat) obj4));
                }
                return;
            }
            arrayList.add(o41.p(30));
            arrayList.add(o41.p(29));
            arrayList.add(o41.p(29));
            arrayList.add(o41.p(29));
            arrayList.add(o41.p(29));
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = pm0Var.T;
        int size4 = arrayList7.size();
        int i15 = 0;
        while (i15 < size4) {
            Object obj5 = arrayList7.get(i15);
            i15++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i16 = size4;
            TLRPC.Chat O02 = org.telegram.messenger.np.u1(i11).O0(Long.valueOf(chat2.f28434id));
            if (org.telegram.messenger.v3.r0(chat2) && (O02 == null || org.telegram.messenger.v3.r0(O02))) {
                arrayList6.add(chat2);
            }
            size4 = i16;
        }
        ArrayList arrayList8 = pm0Var.U;
        int size5 = arrayList8.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj6 = arrayList8.get(i17);
            i17++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat O03 = org.telegram.messenger.np.u1(i11).O0(Long.valueOf(chat3.f28434id));
            if (org.telegram.messenger.v3.r0(chat3) && (O03 == null || org.telegram.messenger.v3.r0(O03))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = pm0Var.V;
        int size6 = arrayList9.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj7 = arrayList9.get(i18);
            i18++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat O04 = org.telegram.messenger.np.u1(i11).O0(Long.valueOf(chat4.f28434id));
            if (org.telegram.messenger.v3.r0(chat4) && (O04 == null || org.telegram.messenger.v3.r0(O04))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 5 && !arrayList2.isEmpty()) {
                String N02 = org.telegram.messenger.hd.N0(2131745618, null);
                if (pm0Var.W) {
                    i7 = 2131745144;
                } else {
                    i7 = 2131745143;
                }
                arrayList.add(o41.s(N02, org.telegram.messenger.hd.N0(i7, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                pm0 pm0Var2 = pm0Var;
                                pm0Var2.X = !pm0Var2.X;
                                pm0Var2.O(true);
                                if (pm0Var2.X) {
                                    org.telegram.messenger.g0.v1(pm0Var2.f38637g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                            default:
                                pm0 pm0Var3 = pm0Var;
                                pm0Var3.W = !pm0Var3.W;
                                pm0Var3.O(true);
                                if (pm0Var3.W) {
                                    org.telegram.messenger.g0.v1(pm0Var3.f38637g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745618, null)));
            }
            int size7 = arrayList6.size();
            if (!pm0Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i19 = 0; i19 < size7; i19++) {
                arrayList.add(o41.w((TLObject) arrayList6.get(i19)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745560, null)));
            int size8 = arrayList2.size();
            int i20 = 0;
            while (i20 < size8) {
                Object obj8 = arrayList2.get(i20);
                i20++;
                o41 o41Var = new o41(33);
                o41Var.H = (org.telegram.messenger.gj) obj8;
                arrayList.add(o41Var);
            }
            if (pm0Var.f37622b0) {
                arrayList.add(o41.p(1));
            }
        }
    }

    private final void e(Object obj, Object obj2) {
        String str;
        ty tyVar = (ty) this.f34338b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        cy cyVar = tyVar.S1;
        if (cyVar != null && (cyVar.getDrawable() instanceof org.telegram.messenger.h4)) {
            org.telegram.messenger.h4 h4Var = (org.telegram.messenger.h4) tyVar.S1.getDrawable();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (h4Var.f24393c.f24587a != intValue) {
                org.telegram.messenger.i4 i4Var = h4Var.f24396g;
                if (i4Var != null) {
                    h4Var.f24393c = i4Var;
                }
                org.telegram.messenger.i4 i4Var2 = h4Var.f24393c;
                if (i4Var2.f24587a != intValue) {
                    i4Var2 = new org.telegram.messenger.i4(intValue, i4Var2.f24588b);
                }
                h4Var.f24396g = i4Var2;
                d6 d6Var = h4Var.f24394e;
                if (d6Var != null) {
                    d6Var.e(true, 0.0f);
                }
            }
            if (h4Var.d.f24587a != intValue2) {
                org.telegram.messenger.i4 i4Var3 = h4Var.h;
                if (i4Var3 != null) {
                    h4Var.d = i4Var3;
                }
                org.telegram.messenger.i4 i4Var4 = h4Var.d;
                if (i4Var4.f24587a != intValue2) {
                    i4Var4 = new org.telegram.messenger.i4(intValue2, i4Var4.f24588b);
                }
                h4Var.h = i4Var4;
                d6 d6Var2 = h4Var.f24395f;
                if (d6Var2 != null) {
                    d6Var2.e(true, 0.0f);
                }
            }
            h4Var.invalidateSelf();
            String str2 = (String) tyVar.S1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                org.telegram.messenger.j6.f24837j.remove(str2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = (String) org.telegram.messenger.j4.f24826a.get(num.intValue());
                }
                sb2.append(str);
                sb2.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = (String) org.telegram.messenger.j4.f24826a.get(num2.intValue());
                }
                sb2.append(str3);
                org.telegram.messenger.j6.f24837j.put(str2, sb2.toString());
            }
            org.telegram.messenger.j6.q();
        }
    }

    private final void f(Object obj, Object obj2) {
        sx sxVar = (sx) this.f34338b;
        ArrayList arrayList = (ArrayList) obj;
        c51 c51Var = (c51) obj2;
        ArrayList arrayList2 = sxVar.f39714s;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = arrayList2.get(i7);
            i7++;
            mx mxVar = (mx) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mxVar.f37655b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f28461id != sxVar.d) {
                    z10 = false;
                }
                int i10 = ux.f40603b;
                o41 K = o41.K(ux.class);
                long j3 = tL_messages_stickerSet.set.f28461id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.f38084e = z10;
                arrayList.add(K);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = mxVar.f37654a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f28461id != sxVar.d) {
                        z10 = false;
                    }
                    arrayList.add(ux.i(stickerSetCovered, mxVar, z10));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        boolean z10;
        oy oyVar = (oy) this.f34338b;
        ArrayList arrayList = (ArrayList) obj;
        c51 c51Var = (c51) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = oyVar.F;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f28461id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f28461id, 1);
                if (tL_messages_stickerSet.set.f28461id != oyVar.d) {
                    z11 = false;
                }
                int i10 = ux.f40603b;
                o41 K = o41.K(ux.class);
                long j3 = tL_messages_stickerSet.set.f28461id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.f38084e = z11;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = oyVar.K;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            mx mxVar = (mx) obj4;
            TLRPC.StickerSet stickerSet = mxVar.f37656c;
            if (longSparseIntArray.indexOfKey(stickerSet.f28461id) < 0) {
                longSparseIntArray.append(stickerSet.f28461id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = mxVar.f37654a;
                if (stickerSet.f28461id == oyVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(ux.i(stickerSetCovered, mxVar, z10));
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f34338b;
        float[] fArr = FragmentContextView.X0;
        fragmentContextView.B0 = !((Boolean) obj2).booleanValue();
        MediaController B = MediaController.B();
        boolean z10 = fragmentContextView.f32989a0;
        org.telegram.ui.ActionBar.u0 u0Var = fragmentContextView.J;
        float floatValue = ((Float) obj).floatValue();
        u0Var.getClass();
        B.m0(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void i(Object obj, Object obj2) {
        int i7;
        h30 h30Var = (h30) this.f34338b;
        ArrayList arrayList = (ArrayList) obj;
        c51 c51Var = (c51) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        h30Var.f35768c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.na.a(h30Var.f35766a).f25751f);
        if (h30Var.f35768c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < h30Var.f35768c.size(); i10++) {
            String str = (String) h30Var.f35768c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i7 = 2131231775;
                } else {
                    i7 = 2131231831;
                }
                arrayList.add(o41.c(i10 + 1, i7, str.substring(1)));
            }
        }
        arrayList.add(o41.c(0, 2131232096, org.telegram.messenger.hd.N0(2131752077, null)));
    }

    private final void j(Object obj, Object obj2) {
        boolean z10;
        fi.b6 b6Var;
        i30 i30Var = (i30) this.f34338b;
        ArrayList arrayList = (ArrayList) obj;
        c51 c51Var = (c51) obj2;
        ArrayList arrayList2 = i30Var.R;
        int i7 = 0;
        if (i30Var.S && (b6Var = i30Var.T) != null && b6Var.f12089i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            fi.b6 b6Var2 = i30Var.T;
            int i10 = jg.j1.f17573b;
            o41 K = o41.K(jg.j1.class);
            K.H = b6Var2;
            arrayList.add(K);
        }
        i30Var.U = z10;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            o41 o41Var = new o41(33);
            o41Var.d = i11;
            o41Var.H = (org.telegram.messenger.gj) arrayList2.get(i7);
            arrayList.add(o41Var);
            i7 = i11;
        }
        if (i30Var.V || !i30Var.Y) {
            arrayList.add(o41.q(-2, 1));
            arrayList.add(o41.q(-3, 1));
            arrayList.add(o41.q(-4, 1));
        }
        if (!i30Var.U && z10) {
            org.telegram.messenger.g0.g3(new oo(i30Var, 21));
        }
    }

    private final void k(Object obj, Object obj2) {
        w60 w60Var = (w60) this.f34338b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        a70 a70Var = w60Var.G;
        a70Var.f33373f.setAlpha(1.0f);
        if (a70Var.f33401u) {
            w60Var.f41654c = bitmap;
        }
        ui.b bVar = a70Var.f33387n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(a70Var.f33387n, w60Var);
            ViewGroup viewGroup = a70Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        of0 of0Var = (of0) this.f34338b;
        ArrayList arrayList = (ArrayList) obj;
        c51 c51Var = (c51) obj2;
        ArrayList arrayList2 = of0Var.f38179e;
        ArrayList arrayList3 = of0Var.f38181n;
        int i7 = 0;
        if (of0Var.d == null) {
            arrayList.add(o41.q(-1, 7));
            arrayList.add(o41.q(-2, 7));
            arrayList.add(o41.q(-3, 7));
            of0Var.R = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(of0Var.f38185x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745526, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                o41 o41Var = new o41(33);
                o41Var.H = (org.telegram.messenger.gj) obj3;
                arrayList.add(o41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(o41.r(org.telegram.messenger.hd.N0(2131745527, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                o41 o41Var2 = new o41(33);
                o41Var2.H = (org.telegram.messenger.gj) obj4;
                arrayList.add(o41Var2);
            }
        }
        if (of0Var.f38184w || ((of0Var.N && !of0Var.O) || (!isEmpty && !arrayList3.isEmpty() && !of0Var.f38183s))) {
            arrayList.add(o41.q(of0Var.M * 3, 7));
            arrayList.add(o41.q((of0Var.M * 3) + 1, 7));
            arrayList.add(o41.q((of0Var.M * 3) + 2, 7));
        }
        of0Var.R = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        yk0 yk0Var = (yk0) this.f34338b;
        yk0Var.f42444c = (Bitmap) obj;
        Paint paint = new Paint(1);
        yk0Var.f42445e = paint;
        Bitmap bitmap = yk0Var.f42444c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        yk0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        yk0Var.f42446f = new Matrix();
        ui.b bVar = yk0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, yk0Var.f42449s);
        ViewGroup viewGroup = yk0Var.E;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        kw0 kw0Var = (kw0) this.f34338b;
        CharSequence charSequence = (CharSequence) obj;
        kw0Var.f37024r1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.si.b0(kw0Var.N1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.k10.f24968t0).sendRequest(tL_stickers_renameStickerSet, new f2((org.telegram.messenger.y10) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        b31 b31Var = (b31) this.f34338b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        m21 m21Var = b31Var.f33734z1;
        a31 a31Var = b31Var.I1;
        if (str != null) {
            b31Var.P1 = false;
            b31Var.A1.setText(b31Var.S0(str));
            a31Var.D(m21Var);
        } else if (b31Var.J) {
        } else {
            int i7 = 2131743701;
            if (b31Var.P1) {
                b31Var.dismiss();
                org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
                if (bool.booleanValue()) {
                    i7 = 2131743702;
                }
                e10.k(org.telegram.messenger.ls.S4, 1, org.telegram.messenger.hd.N0(i7, null));
                return;
            }
            lc lcVar = new lc((FrameLayout) b31Var.f30176b, b31Var.J0);
            if (bool.booleanValue()) {
                i7 = 2131743702;
            }
            org.telegram.messenger.f3.o(null, i7, lcVar, null);
            x21 x21Var = b31Var.f33732x1.f42657e;
            String str2 = b31Var.f33731w1;
            b31Var.f33730v1 = str2;
            x21Var.setText(b31.P0(str2, null, null));
            a31Var.D(m21Var);
        }
    }

    @Override
    public final void a(java.lang.Object r32, java.lang.Object r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.a(java.lang.Object, java.lang.Object):void");
    }
}
