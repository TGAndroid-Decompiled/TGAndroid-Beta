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
public final class d implements org.telegram.messenger.q10 {
    public final int f34230a;
    public final Object f34231b;

    public d(Object obj, int i7) {
        this.f34230a = i7;
        this.f34231b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        hr hrVar = (hr) this.f34231b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        String str = null;
        if (hrVar.f35954c2 == null) {
            Context context = hrVar.getContext();
            org.telegram.ui.ActionBar.i6 i6Var = hrVar.J0;
            ai.r2 r2Var = new ai.r2(context, 7);
            r2Var.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624329, 112, 112, null);
            imageView.d();
            r2Var.addView((View) imageView, c8.ma.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131744203, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
            r2Var.addView(textView, c8.ma.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29504j5, i6Var);
            textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131742999, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            r2Var.addView(textView2, c8.ma.t(-2, -2, 1, 28, 0, 28, 17));
            hrVar.f35954c2 = r2Var;
        }
        arrayList.add(l41.k(hrVar.f35954c2));
        arrayList.add(l41.C(null));
        arrayList.add(l41.u(org.telegram.messenger.gd.M0(2131743194, null)));
        String str2 = hrVar.X1;
        String M0 = org.telegram.messenger.gd.M0(2131743195, null);
        int i10 = gr.f35552b;
        l41 K = l41.K(gr.class);
        K.f37018m = str2;
        K.f37020o = M0;
        K.f37015j = false;
        K.f37013g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = hrVar.Z1;
        String M02 = org.telegram.messenger.gd.M0(2131743196, null);
        l41 K2 = l41.K(gr.class);
        K2.f37018m = spannableStringBuilder;
        K2.f37020o = M02;
        K2.f37015j = true;
        K2.f37013g = false;
        arrayList.add(K2);
        if (hrVar.f35953b2) {
            if (hrVar.T1) {
                i7 = 2131743191;
            } else {
                i7 = 2131743192;
            }
            str = org.telegram.messenger.gd.M0(i7, null);
        }
        arrayList.add(l41.C(str));
    }

    private final void c(Object obj, Object obj2) {
        boolean z10;
        int i7;
        int i10;
        final is isVar = (is) this.f34231b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        int i11 = isVar.Q;
        y2 y2Var = isVar.f36191k0;
        ArrayList arrayList2 = isVar.W;
        hs hsVar = isVar.T;
        boolean z11 = isVar.S;
        HashSet hashSet = new HashSet();
        int i12 = 0;
        if (!TextUtils.isEmpty(isVar.f36188h0)) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(isVar.U);
            arrayList3.addAll(isVar.V);
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 5 && !arrayList2.isEmpty() && !z11) {
                    String M0 = org.telegram.messenger.gd.M0(2131745627, null);
                    if (isVar.Y) {
                        i10 = 2131745145;
                    } else {
                        i10 = 2131745144;
                    }
                    arrayList.add(l41.s(M0, org.telegram.messenger.gd.M0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    is isVar2 = isVar;
                                    isVar2.Y = !isVar2.Y;
                                    isVar2.O(true);
                                    return;
                                default:
                                    is isVar3 = isVar;
                                    isVar3.X = !isVar3.X;
                                    isVar3.O(true);
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745627, null)));
                }
                int size = arrayList3.size();
                if (!isVar.Y && !arrayList2.isEmpty() && !z11) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    l41 w10 = l41.w((TLObject) arrayList3.get(i13));
                    w10.f37026u = true;
                    w10.I = y2Var;
                    arrayList.add(w10);
                }
            }
            if (!arrayList2.isEmpty() && !z11) {
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745561, null)));
                int size2 = arrayList2.size();
                while (i12 < size2) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    l41 l41Var = new l41(33);
                    l41Var.H = (org.telegram.messenger.fj) obj3;
                    arrayList.add(l41Var);
                }
                if (isVar.f36185e0) {
                    arrayList.add(l41.p(1));
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList4 = org.telegram.messenger.ri.d0(i11).f26626m1;
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(org.telegram.messenger.n5.o(((TLRPC.TL_topPeer) arrayList4.get(i14)).peer)));
                if (c22 != null && c22.bot) {
                    arrayList5.add(c22);
                }
            }
        }
        isVar.f36181a0 = arrayList.size();
        if (!arrayList5.isEmpty() && !z11) {
            if (arrayList5.size() > 5) {
                String M02 = org.telegram.messenger.gd.M0(2131745625, null);
                if (isVar.X) {
                    i7 = 2131745145;
                } else {
                    i7 = 2131745144;
                }
                arrayList.add(l41.s(M02, org.telegram.messenger.gd.M0(i7, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                is isVar2 = isVar;
                                isVar2.Y = !isVar2.Y;
                                isVar2.O(true);
                                return;
                            default:
                                is isVar3 = isVar;
                                isVar3.X = !isVar3.X;
                                isVar3.O(true);
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745625, null)));
            }
            for (int i15 = 0; i15 < arrayList5.size() && (i15 < 5 || isVar.X); i15++) {
                TLRPC.User user = (TLRPC.User) arrayList5.get(i15);
                if (!hashSet.contains(Long.valueOf(user.f28554id))) {
                    hashSet.add(Long.valueOf(user.f28554id));
                    l41 w11 = l41.w(user);
                    w11.f37023r = true;
                    w11.f37026u = true;
                    w11.I = y2Var;
                    arrayList.add(w11);
                }
            }
        }
        hashSet.clear();
        isVar.f36182b0 = arrayList.size();
        ArrayList arrayList6 = hsVar.h;
        if (!arrayList6.isEmpty()) {
            if (!z11) {
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745624, null)));
            }
            boolean z12 = false;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                TLRPC.User user2 = (TLRPC.User) arrayList6.get(i16);
                if (!hashSet.contains(Long.valueOf(user2.f28554id))) {
                    hashSet.add(Long.valueOf(user2.f28554id));
                    l41 w12 = l41.w(user2);
                    w12.f37023r = true;
                    w12.f37024s = true;
                    w12.f37026u = true;
                    w12.I = y2Var;
                    arrayList.add(w12);
                    z12 = true;
                }
            }
            if (hsVar.f35959c || !hsVar.f35960e) {
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
            }
            z10 = z12;
        } else {
            if (hsVar.f35959c || !hsVar.f35960e) {
                if (!z11) {
                    arrayList.add(l41.p(30));
                }
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
                arrayList.add(l41.p(29));
            }
            z10 = false;
        }
        if (z10) {
            arrayList.add(l41.C(isVar.Z));
        }
    }

    private final void d(Object obj, Object obj2) {
        int i7;
        org.telegram.messenger.no noVar;
        int i10;
        final mm0 mm0Var = (mm0) this.f34231b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        ArrayList arrayList2 = mm0Var.S;
        ArrayList arrayList3 = mm0Var.Y;
        int i11 = mm0Var.Q;
        int i12 = 0;
        if (TextUtils.isEmpty(mm0Var.f36871e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    String M0 = org.telegram.messenger.gd.M0(2131745544, null);
                    if (mm0Var.X) {
                        i10 = 2131745145;
                    } else {
                        i10 = 2131745144;
                    }
                    arrayList.add(l41.s(M0, org.telegram.messenger.gd.M0(i10, null), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    mm0 mm0Var2 = mm0Var;
                                    mm0Var2.X = !mm0Var2.X;
                                    mm0Var2.O(true);
                                    if (mm0Var2.X) {
                                        org.telegram.messenger.g0.v1(mm0Var2.f37584g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                                default:
                                    mm0 mm0Var3 = mm0Var;
                                    mm0Var3.W = !mm0Var3.W;
                                    mm0Var3.O(true);
                                    if (mm0Var3.W) {
                                        org.telegram.messenger.g0.v1(mm0Var3.f37584g0.getParentActivity().getCurrentFocus());
                                        return;
                                    }
                                    return;
                            }
                        }
                    }));
                } else {
                    arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745544, null)));
                }
                int size = arrayList3.size();
                if (!mm0Var.X) {
                    size = Math.min(5, size);
                }
                for (int i13 = 0; i13 < size; i13++) {
                    l41 w10 = l41.w((TLObject) arrayList3.get(i13));
                    w10.J = true;
                    arrayList.add(w10);
                }
            }
            HashMap hashMap = org.telegram.messenger.mp.u1(i11).f25642e8;
            if (hashMap == null) {
                noVar = null;
            } else {
                noVar = (org.telegram.messenger.no) hashMap.get(0L);
            }
            if (noVar != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = noVar.f25955b;
                int size2 = arrayList5.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj3 = arrayList5.get(i14);
                    i14++;
                    TLObject tLObject = (TLObject) obj3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(chat.f28405id));
                        if (org.telegram.messenger.v3.r0(chat) && (O0 == null || org.telegram.messenger.v3.r0(O0))) {
                            arrayList4.add(chat);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745516, null)));
                }
                int size3 = arrayList4.size();
                while (i12 < size3) {
                    Object obj4 = arrayList4.get(i12);
                    i12++;
                    arrayList.add(l41.w((TLRPC.Chat) obj4));
                }
                return;
            }
            arrayList.add(l41.p(30));
            arrayList.add(l41.p(29));
            arrayList.add(l41.p(29));
            arrayList.add(l41.p(29));
            arrayList.add(l41.p(29));
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = mm0Var.T;
        int size4 = arrayList7.size();
        int i15 = 0;
        while (i15 < size4) {
            Object obj5 = arrayList7.get(i15);
            i15++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            int i16 = size4;
            TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(chat2.f28405id));
            if (org.telegram.messenger.v3.r0(chat2) && (O02 == null || org.telegram.messenger.v3.r0(O02))) {
                arrayList6.add(chat2);
            }
            size4 = i16;
        }
        ArrayList arrayList8 = mm0Var.U;
        int size5 = arrayList8.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj6 = arrayList8.get(i17);
            i17++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat O03 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(chat3.f28405id));
            if (org.telegram.messenger.v3.r0(chat3) && (O03 == null || org.telegram.messenger.v3.r0(O03))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = mm0Var.V;
        int size6 = arrayList9.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj7 = arrayList9.get(i18);
            i18++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat O04 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(chat4.f28405id));
            if (org.telegram.messenger.v3.r0(chat4) && (O04 == null || org.telegram.messenger.v3.r0(O04))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 5 && !arrayList2.isEmpty()) {
                String M02 = org.telegram.messenger.gd.M0(2131745619, null);
                if (mm0Var.W) {
                    i7 = 2131745145;
                } else {
                    i7 = 2131745144;
                }
                arrayList.add(l41.s(M02, org.telegram.messenger.gd.M0(i7, null), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                mm0 mm0Var2 = mm0Var;
                                mm0Var2.X = !mm0Var2.X;
                                mm0Var2.O(true);
                                if (mm0Var2.X) {
                                    org.telegram.messenger.g0.v1(mm0Var2.f37584g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                            default:
                                mm0 mm0Var3 = mm0Var;
                                mm0Var3.W = !mm0Var3.W;
                                mm0Var3.O(true);
                                if (mm0Var3.W) {
                                    org.telegram.messenger.g0.v1(mm0Var3.f37584g0.getParentActivity().getCurrentFocus());
                                    return;
                                }
                                return;
                        }
                    }
                }));
            } else {
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745619, null)));
            }
            int size7 = arrayList6.size();
            if (!mm0Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i19 = 0; i19 < size7; i19++) {
                arrayList.add(l41.w((TLObject) arrayList6.get(i19)));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745561, null)));
            int size8 = arrayList2.size();
            int i20 = 0;
            while (i20 < size8) {
                Object obj8 = arrayList2.get(i20);
                i20++;
                l41 l41Var = new l41(33);
                l41Var.H = (org.telegram.messenger.fj) obj8;
                arrayList.add(l41Var);
            }
            if (mm0Var.f36868b0) {
                arrayList.add(l41.p(1));
            }
        }
    }

    private final void e(Object obj, Object obj2) {
        String str;
        ry ryVar = (ry) this.f34231b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        zx zxVar = ryVar.S1;
        if (zxVar != null && (zxVar.getDrawable() instanceof org.telegram.messenger.h4)) {
            org.telegram.messenger.h4 h4Var = (org.telegram.messenger.h4) ryVar.S1.getDrawable();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (h4Var.f24385c.f24552a != intValue) {
                org.telegram.messenger.i4 i4Var = h4Var.f24388g;
                if (i4Var != null) {
                    h4Var.f24385c = i4Var;
                }
                org.telegram.messenger.i4 i4Var2 = h4Var.f24385c;
                if (i4Var2.f24552a != intValue) {
                    i4Var2 = new org.telegram.messenger.i4(intValue, i4Var2.f24553b);
                }
                h4Var.f24388g = i4Var2;
                c6 c6Var = h4Var.f24386e;
                if (c6Var != null) {
                    c6Var.e(true, 0.0f);
                }
            }
            if (h4Var.d.f24552a != intValue2) {
                org.telegram.messenger.i4 i4Var3 = h4Var.h;
                if (i4Var3 != null) {
                    h4Var.d = i4Var3;
                }
                org.telegram.messenger.i4 i4Var4 = h4Var.d;
                if (i4Var4.f24552a != intValue2) {
                    i4Var4 = new org.telegram.messenger.i4(intValue2, i4Var4.f24553b);
                }
                h4Var.h = i4Var4;
                c6 c6Var2 = h4Var.f24387f;
                if (c6Var2 != null) {
                    c6Var2.e(true, 0.0f);
                }
            }
            h4Var.invalidateSelf();
            String str2 = (String) ryVar.S1.getTag();
            if (num.intValue() == -1 && num2.intValue() == -1) {
                org.telegram.messenger.j6.f24820j.remove(str2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str3 = "";
                if (num.intValue() < 0) {
                    str = "";
                } else {
                    str = (String) org.telegram.messenger.j4.f24809a.get(num.intValue());
                }
                sb2.append(str);
                sb2.append("\u200d");
                if (num2.intValue() >= 0) {
                    str3 = (String) org.telegram.messenger.j4.f24809a.get(num2.intValue());
                }
                sb2.append(str3);
                org.telegram.messenger.j6.f24820j.put(str2, sb2.toString());
            }
            org.telegram.messenger.j6.q();
        }
    }

    private final void f(Object obj, Object obj2) {
        qx qxVar = (qx) this.f34231b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        ArrayList arrayList2 = qxVar.f38930s;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = arrayList2.get(i7);
            i7++;
            kx kxVar = (kx) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kxVar.f36909b;
            boolean z10 = true;
            if (tL_messages_stickerSet != null) {
                if (tL_messages_stickerSet.set.f28432id != qxVar.d) {
                    z10 = false;
                }
                int i10 = sx.f39861b;
                l41 K = l41.K(sx.class);
                long j3 = tL_messages_stickerSet.set.f28432id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.f37011e = z10;
                arrayList.add(K);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = kxVar.f36908a;
                if (stickerSetCovered != null) {
                    if (stickerSetCovered.set.f28432id != qxVar.d) {
                        z10 = false;
                    }
                    arrayList.add(sx.i(stickerSetCovered, kxVar, z10));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        boolean z10;
        my myVar = (my) this.f34231b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = myVar.F;
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
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.f28432id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.f28432id, 1);
                if (tL_messages_stickerSet.set.f28432id != myVar.d) {
                    z11 = false;
                }
                int i10 = sx.f39861b;
                l41 K = l41.K(sx.class);
                long j3 = tL_messages_stickerSet.set.f28432id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.C = j3;
                K.H = tL_messages_stickerSet;
                K.f37011e = z11;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = myVar.K;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            kx kxVar = (kx) obj4;
            TLRPC.StickerSet stickerSet = kxVar.f36910c;
            if (longSparseIntArray.indexOfKey(stickerSet.f28432id) < 0) {
                longSparseIntArray.append(stickerSet.f28432id, 1);
                TLRPC.StickerSetCovered stickerSetCovered = kxVar.f36908a;
                if (stickerSet.f28432id == myVar.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(sx.i(stickerSetCovered, kxVar, z10));
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f34231b;
        float[] fArr = FragmentContextView.X0;
        fragmentContextView.B0 = !((Boolean) obj2).booleanValue();
        MediaController B = MediaController.B();
        boolean z10 = fragmentContextView.f32953a0;
        org.telegram.ui.ActionBar.v0 v0Var = fragmentContextView.J;
        float floatValue = ((Float) obj).floatValue();
        v0Var.getClass();
        B.m0(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void i(Object obj, Object obj2) {
        int i7;
        e30 e30Var = (e30) this.f34231b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        ArrayList arrayList2 = new ArrayList(0);
        e30Var.f34592c = arrayList2;
        arrayList2.addAll(org.telegram.messenger.ma.a(e30Var.f34590a).f25554f);
        if (e30Var.f34592c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < e30Var.f34592c.size(); i10++) {
            String str = (String) e30Var.f34592c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                if (str.startsWith("$")) {
                    i7 = 2131231775;
                } else {
                    i7 = 2131231831;
                }
                arrayList.add(l41.c(i10 + 1, i7, str.substring(1)));
            }
        }
        arrayList.add(l41.c(0, 2131232096, org.telegram.messenger.gd.M0(2131752078, null)));
    }

    private final void j(Object obj, Object obj2) {
        boolean z10;
        fi.b6 b6Var;
        f30 f30Var = (f30) this.f34231b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        ArrayList arrayList2 = f30Var.R;
        int i7 = 0;
        if (f30Var.S && (b6Var = f30Var.T) != null && b6Var.f12048i.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            fi.b6 b6Var2 = f30Var.T;
            int i10 = jg.j1.f17548b;
            l41 K = l41.K(jg.j1.class);
            K.H = b6Var2;
            arrayList.add(K);
        }
        f30Var.U = z10;
        while (i7 < arrayList2.size()) {
            int i11 = i7 + 1;
            l41 l41Var = new l41(33);
            l41Var.d = i11;
            l41Var.H = (org.telegram.messenger.fj) arrayList2.get(i7);
            arrayList.add(l41Var);
            i7 = i11;
        }
        if (f30Var.V || !f30Var.Y) {
            arrayList.add(l41.q(-2, 1));
            arrayList.add(l41.q(-3, 1));
            arrayList.add(l41.q(-4, 1));
        }
        if (!f30Var.U && z10) {
            org.telegram.messenger.g0.g3(new mo(f30Var, 21));
        }
    }

    private final void k(Object obj, Object obj2) {
        u60 u60Var = (u60) this.f34231b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        y60 y60Var = u60Var.G;
        y60Var.f42351f.setAlpha(1.0f);
        if (y60Var.f42379u) {
            u60Var.f40222c = bitmap;
        }
        ui.b bVar = y60Var.f42365n;
        if (bVar != null) {
            bVar.a(bitmap2);
            ih.d.c(y60Var.f42365n, u60Var);
            ViewGroup viewGroup = y60Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void l(Object obj, Object obj2) {
        mf0 mf0Var = (mf0) this.f34231b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        ArrayList arrayList2 = mf0Var.f37454e;
        ArrayList arrayList3 = mf0Var.f37456n;
        int i7 = 0;
        if (mf0Var.d == null) {
            arrayList.add(l41.q(-1, 7));
            arrayList.add(l41.q(-2, 7));
            arrayList.add(l41.q(-3, 7));
            mf0Var.R = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(mf0Var.f37460x);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745527, null)));
            }
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj3 = arrayList2.get(i7);
                i7++;
                l41 l41Var = new l41(33);
                l41Var.H = (org.telegram.messenger.fj) obj3;
                arrayList.add(l41Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131745528, null)));
            }
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj4 = arrayList3.get(i7);
                i7++;
                l41 l41Var2 = new l41(33);
                l41Var2.H = (org.telegram.messenger.fj) obj4;
                arrayList.add(l41Var2);
            }
        }
        if (mf0Var.f37459w || ((mf0Var.N && !mf0Var.O) || (!isEmpty && !arrayList3.isEmpty() && !mf0Var.f37458s))) {
            arrayList.add(l41.q(mf0Var.M * 3, 7));
            arrayList.add(l41.q((mf0Var.M * 3) + 1, 7));
            arrayList.add(l41.q((mf0Var.M * 3) + 2, 7));
        }
        mf0Var.R = arrayList.isEmpty();
    }

    private final void m(Object obj, Object obj2) {
        wk0 wk0Var = (wk0) this.f34231b;
        wk0Var.f41726c = (Bitmap) obj;
        Paint paint = new Paint(1);
        wk0Var.f41727e = paint;
        Bitmap bitmap = wk0Var.f41726c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        wk0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        wk0Var.f41728f = new Matrix();
        ui.b bVar = wk0Var.h;
        bVar.a((Bitmap) obj2);
        ih.d.c(bVar, wk0Var.f41731s);
        ViewGroup viewGroup = wk0Var.E;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void n(Object obj, Object obj2) {
        iw0 iw0Var = (iw0) this.f34231b;
        CharSequence charSequence = (CharSequence) obj;
        iw0Var.f36253r1.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = org.telegram.messenger.ri.b0(iw0Var.N1.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(org.telegram.messenger.j10.f24773t0).sendRequest(tL_stickers_renameStickerSet, new e2((org.telegram.messenger.x10) obj2, 13));
    }

    private final void o(Object obj, Object obj2) {
        y21 y21Var = (y21) this.f34231b;
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        j21 j21Var = y21Var.f42286z1;
        x21 x21Var = y21Var.I1;
        if (str != null) {
            y21Var.P1 = false;
            y21Var.A1.setText(y21Var.S0(str));
            x21Var.D(j21Var);
        } else if (y21Var.J) {
        } else {
            int i7 = 2131743709;
            if (y21Var.P1) {
                y21Var.dismiss();
                org.telegram.messenger.ks e10 = org.telegram.messenger.ks.e();
                if (bool.booleanValue()) {
                    i7 = 2131743710;
                }
                e10.k(org.telegram.messenger.ks.R4, 1, org.telegram.messenger.gd.M0(i7, null));
                return;
            }
            lc lcVar = new lc((FrameLayout) y21Var.f30192b, y21Var.J0);
            if (bool.booleanValue()) {
                i7 = 2131743710;
            }
            org.telegram.messenger.f3.o(null, i7, lcVar, null);
            u21 u21Var = y21Var.f42284x1.f41546e;
            String str2 = y21Var.f42283w1;
            y21Var.f42282v1 = str2;
            u21Var.setText(y21.P0(str2, null, null));
            x21Var.D(j21Var);
        }
    }

    @Override
    public final void a(java.lang.Object r36, java.lang.Object r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d.a(java.lang.Object, java.lang.Object):void");
    }
}
