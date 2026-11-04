package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class yx extends sj0 {
    public boolean E;
    public int M;
    public int N;
    public String O;
    public final ey R;
    public final ax f40841c;
    public long d;
    public TLRPC.StickerSet f40842e;
    public ArrayList f40843f;
    public final Context h;
    public int f40849y;
    public final SparseArray f40844n = new SparseArray();
    public final SparseArray f40845r = new SparseArray();
    public final SparseArray f40846s = new SparseArray();
    public final SparseIntArray f40847w = new SparseIntArray();
    public final SparseArray f40848x = new SparseArray();
    public ArrayList F = new ArrayList();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public HashMap I = new HashMap();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public ArrayList L = new ArrayList();
    public final xx P = new xx(this);
    public int Q = -1;

    public yx(ey eyVar, Context context) {
        this.R = eyVar;
        this.h = context;
        ax axVar = new ax(context, eyVar.f33529d1, new e(this, 12), new zw(this, 2), eyVar.f33520a2);
        this.f40841c = axVar;
        axVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        axVar.setClipToPadding(false);
        axVar.f35594g3.f33698r = false;
        axVar.setNestedScrollingEnabled(false);
        axVar.setDrawSelection(false);
        axVar.setOnTouchListener(new m.c2(this, 3));
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i3 = this.f40849y;
        if (i3 != 1) {
            return i3 + 1;
        }
        return 2;
    }

    @Override
    public final int d(int i3) {
        if (this.d != 0 && i3 == b() - 1) {
            return 8;
        }
        if (i3 == this.Q) {
            return 7;
        }
        if (i3 == 0) {
            return 4;
        }
        if (i3 == 1 && this.f40849y == 1) {
            return 5;
        }
        Object obj = this.f40845r.get(i3);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        if (obj instanceof TLRPC.StickerSetCovered) {
            return 3;
        }
        return 2;
    }

    @Override
    public final void f() {
        boolean z10;
        int i3;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        ey eyVar = this.R;
        int i13 = eyVar.f33529d1;
        vx vxVar = eyVar.f33599z0;
        this.Q = -1;
        SparseArray sparseArray = this.f40844n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.f40847w;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f40845r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f40848x;
        sparseArray3.clear();
        this.f40849y = 0;
        int size = this.H.size() + this.F.size();
        this.f40841c.f35594g3.O(false);
        int i14 = (this.d > 0L ? 1 : (this.d == 0L ? 0 : -1));
        String str = "";
        SparseArray sparseArray4 = this.f40846s;
        if (i14 != 0) {
            ArrayList arrayList = this.f40843f;
            int i15 = this.f40849y;
            this.f40849y = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.f40849y;
                this.f40849y = i16 + 1;
                this.Q = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.f40849y;
                this.f40849y = i17 + 1;
                sparseArray2.put(i17, org.telegram.messenger.bd.G(this.f40842e.count, "Stickers", new Object[0]));
                i12 = 3;
            } else {
                i12 = 1;
            }
            String str2 = (String) this.I.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f40849y, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.f40849y + i19;
                int i21 = (i19 / vxVar.d) + i12;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i18);
                sparseArray2.put(i20, document);
                ArrayList arrayList2 = arrayList;
                int i22 = i18;
                TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.li.b0(i13).o0(org.telegram.messenger.li.q0(document));
                if (o02 != null) {
                    sparseArray4.put(i20, o02);
                }
                sparseIntArray.put(i20, i21);
                i19++;
                i18 = i22 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i19 / vxVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i12 + i23, Integer.valueOf(i19));
            }
            this.f40849y = (ceil * vxVar.d) + this.f40849y;
        } else {
            boolean isEmpty = this.J.isEmpty();
            ArrayList arrayList3 = this.L;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i24 = this.f40849y;
            this.f40849y = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.f40849y;
                this.f40849y = i25 + 1;
                this.Q = i25;
                sparseArray2.put(i25, "packs");
                i3 = 2;
            } else {
                i3 = 1;
            }
            if (!isEmpty) {
                int i26 = this.f40849y;
                this.f40849y = i26 + 1;
                sparseArray2.put(i26, org.telegram.messenger.bd.M0(2131744884, null));
                int i27 = i3 + 1;
                int size3 = this.J.size();
                int i28 = 0;
                int i29 = 0;
                while (i29 < size3) {
                    int i30 = i13;
                    ArrayList arrayList4 = (ArrayList) this.J.get(i29);
                    boolean z13 = isEmpty;
                    String str3 = (String) this.I.get(arrayList4);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.f40849y + i28, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z14 = z10;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.f40849y + i28;
                        int i34 = size;
                        int i35 = (i28 / vxVar.d) + i27;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i31);
                        sparseArray2.put(i33, document2);
                        String str4 = str;
                        int i36 = i27;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.li.b0(i30).o0(org.telegram.messenger.li.q0(document2));
                        if (o03 != null) {
                            sparseArray4.put(i33, o03);
                        }
                        sparseIntArray.put(i33, i35);
                        i28++;
                        i31++;
                        size4 = i32;
                        size = i34;
                        arrayList4 = arrayList5;
                        i27 = i36;
                        str = str4;
                    }
                    i29++;
                    i13 = i30;
                    isEmpty = z13;
                    z10 = z14;
                }
                i10 = i13;
                z11 = isEmpty;
                z12 = z10;
                i11 = size;
                int i37 = i27;
                int ceil2 = (int) Math.ceil(i28 / vxVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i28));
                }
                this.f40849y = (vxVar.d * ceil2) + this.f40849y;
                i3 = i37 + ceil2;
            } else {
                i10 = i13;
                z11 = isEmpty;
                z12 = z10;
                i11 = size;
            }
            if (z12) {
                int i39 = this.f40849y;
                this.f40849y = i39 + 1;
                sparseArray2.put(i39, org.telegram.messenger.bd.M0(2131744885, null));
                int i40 = i3 + 1;
                String str5 = (String) this.I.get(this.L);
                if (str5 != null) {
                    sparseArray3.put(this.f40849y, str5);
                }
                int size5 = this.L.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.f40849y + i41;
                    int i44 = (i41 / vxVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.L.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet o04 = org.telegram.messenger.li.b0(i10).o0(org.telegram.messenger.li.q0(document3));
                    if (o04 != null) {
                        sparseArray4.put(i43, o04);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / vxVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.f40849y = (ceil3 * vxVar.d) + this.f40849y;
            }
            if (z11 && !z12 && i11 == 0) {
                this.f40849y = 1;
            }
        }
        super.f();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        boolean z10;
        int A1;
        ey eyVar = this.R;
        LongSparseArray longSparseArray = eyVar.A1;
        LongSparseArray longSparseArray2 = eyVar.f33600z1;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        SparseArray sparseArray = this.f40845r;
        boolean z11 = true;
        char c2 = 1;
        int i12 = 1;
        z11 = true;
        if (i11 != 0) {
            Integer num = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i3);
                        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f27028id) >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f27028id) < 0) {
                            c2 = 0;
                        }
                        if (z10 || c2 != 0) {
                            if (z10 && u3Var.f30644r) {
                                longSparseArray2.remove(stickerSetCovered.set.f27028id);
                                z10 = false;
                            } else if (c2 != 0 && !u3Var.f30644r) {
                                longSparseArray.remove(stickerSetCovered.set.f27028id);
                            }
                        }
                        u3Var.b(z10, false);
                        if (TextUtils.isEmpty(this.O)) {
                            A1 = -1;
                        } else {
                            A1 = org.telegram.messenger.g0.A1(stickerSetCovered.set.title, this.O);
                        }
                        int i13 = A1;
                        if (i13 >= 0) {
                            u3Var.c(stickerSetCovered, false, false, i13, this.O.length(), false);
                            return;
                        }
                        u3Var.c(stickerSetCovered, false, false, 0, 0, false);
                        if (!TextUtils.isEmpty(this.O) && org.telegram.messenger.g0.A1(stickerSetCovered.set.short_name, this.O) == 0) {
                            u3Var.d(this.O.length(), stickerSetCovered.set.short_name);
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
                Object obj = sparseArray.get(i3);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.O) && this.G.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            i8Var.a(0, stickerSet.title);
                        }
                        i8Var.c(this.O.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num2 = (Integer) this.H.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num2 != null) {
                        String str = stickerSet2.title;
                        int intValue = num2.intValue();
                        if (!TextUtils.isEmpty(this.O)) {
                            i10 = this.O.length();
                        } else {
                            i10 = 0;
                        }
                        i8Var.b(str, 0, null, intValue, i10);
                    }
                    i8Var.c(0, null);
                    return;
                } else if (obj instanceof String) {
                    i8Var.a(0, (String) obj);
                    i8Var.c(0, null);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view;
            if (i3 == this.f40849y) {
                int i14 = this.f40847w.get(i3 - 1, Integer.MIN_VALUE);
                if (i14 == Integer.MIN_VALUE) {
                    m3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f40844n.get(i14);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj2).documents.size());
                } else if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                }
                if (num == null) {
                    m3Var.setHeight(1);
                    return;
                } else if (num.intValue() == 0) {
                    m3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                    return;
                } else {
                    int A = org.telegram.messenger.camera.q.A(82.0f, (int) Math.ceil(num.intValue() / eyVar.f33599z0.d), eyVar.h.getHeight());
                    if (A > 0) {
                        i12 = A;
                    }
                    m3Var.setHeight(i12);
                    return;
                }
            }
            m3Var.setHeight(org.telegram.messenger.g0.L(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i3);
        org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
        y7Var.d(document, null, this.f40846s.get(i3), (String) this.f40848x.get(i3), false, false);
        if (!eyVar.k1.contains(document) && !eyVar.f33554l1.contains(document)) {
            z11 = false;
        }
        y7Var.setRecent(z11);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ey eyVar = this.R;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.f33520a2;
        Context context = this.h;
        View view = null;
        switch (i3) {
            case 0:
                view = new kg.x1(2, context, e6Var, true);
                break;
            case 1:
                view = new org.telegram.ui.Cells.m3(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.i8(this.h, false, false, eyVar.f33520a2, eyVar.f33550j2);
                break;
            case 3:
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(17, this.h, eyVar.f33520a2, false, true);
                u3Var.setAddOnClickListener(new f0(this, 14));
                view = u3Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new u4.p0(-1, eyVar.f33527c1));
                break;
            case 5:
                ai.o2 o2Var = new ai.o2(21, context, this);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(2131232759);
                int i10 = org.telegram.ui.ActionBar.k6.Af;
                org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-org.telegram.messenger.g0.L(24.0f));
                o2Var.addView(imageView, b8.mf.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(org.telegram.messenger.bd.M0(2131748157, null));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
                o2Var.addView(textView, b8.mf.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                o2Var.setLayoutParams(new u4.p0(-1, -2));
                view = o2Var;
                break;
            case 7:
                u4.p0 p0Var = new u4.p0(-1, org.telegram.messenger.g0.L(79.0f));
                view = this.f40841c;
                view.setLayoutParams(p0Var);
                break;
            case 8:
                view = new View(eyVar.getContext());
                view.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(68.0f)));
                break;
        }
        return new u4.d1(view);
    }
}
