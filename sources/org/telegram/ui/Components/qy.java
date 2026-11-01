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
public final class qy extends tk0 {
    public boolean D;
    public int L;
    public int M;
    public String N;
    public final vy Q;
    public final qx f29823c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f29824f;
    public final Context h;
    public int f29830y;
    public final SparseArray f29825n = new SparseArray();
    public final SparseArray f29826r = new SparseArray();
    public final SparseArray f29827s = new SparseArray();
    public final SparseIntArray f29828w = new SparseIntArray();
    public final SparseArray f29829x = new SparseArray();
    public ArrayList E = new ArrayList();
    public HashMap F = new HashMap();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public final py O = new py(this);
    public int P = -1;

    public qy(vy vyVar, Context context) {
        this.Q = vyVar;
        this.h = context;
        qx qxVar = new qx(context, vyVar.f31943c1, new d(this, 12), new px(this, 2), vyVar.Z1);
        this.f29823c = qxVar;
        qxVar.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f));
        qxVar.setClipToPadding(false);
        qxVar.f31183f3.f29638r = false;
        qxVar.setNestedScrollingEnabled(false);
        qxVar.setDrawSelection(false);
        qxVar.setOnTouchListener(new m.c2(this, 3));
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i10 = this.f29830y;
        if (i10 != 1) {
            return i10 + 1;
        }
        return 2;
    }

    @Override
    public final int d(int i10) {
        if (this.d != 0 && i10 == b() - 1) {
            return 8;
        }
        if (i10 == this.P) {
            return 7;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1 && this.f29830y == 1) {
            return 5;
        }
        Object obj = this.f29826r.get(i10);
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
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        vy vyVar = this.Q;
        int i14 = vyVar.f31943c1;
        ny nyVar = vyVar.f32013y0;
        this.P = -1;
        SparseArray sparseArray = this.f29825n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.f29828w;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f29826r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f29829x;
        sparseArray3.clear();
        this.f29830y = 0;
        int size = this.G.size() + this.E.size();
        this.f29823c.f31183f3.O(false);
        int i15 = (this.d > 0L ? 1 : (this.d == 0L ? 0 : -1));
        String str = "";
        SparseArray sparseArray4 = this.f29827s;
        if (i15 != 0) {
            ArrayList arrayList = this.f29824f;
            int i16 = this.f29830y;
            this.f29830y = i16 + 1;
            sparseArray2.put(i16, "search");
            if (size > 0) {
                int i17 = this.f29830y;
                this.f29830y = i17 + 1;
                this.P = i17;
                sparseArray2.put(i17, "packs");
                int i18 = this.f29830y;
                this.f29830y = i18 + 1;
                sparseArray2.put(i18, org.telegram.messenger.dd.G(this.e.count, "Stickers", new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.H.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f29830y, str2);
            }
            int size2 = arrayList.size();
            int i19 = 0;
            int i20 = 0;
            while (i19 < size2) {
                int i21 = this.f29830y + i20;
                int i22 = (i20 / nyVar.d) + i13;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i19);
                sparseArray2.put(i21, document);
                ArrayList arrayList2 = arrayList;
                int i23 = i19;
                TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.vi.b0(i14).o0(org.telegram.messenger.vi.q0(document));
                if (o02 != null) {
                    sparseArray4.put(i21, o02);
                }
                sparseIntArray.put(i21, i22);
                i20++;
                i19 = i23 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i20 / nyVar.d);
            for (int i24 = 0; i24 < ceil; i24++) {
                sparseArray.put(i13 + i24, Integer.valueOf(i20));
            }
            this.f29830y = (ceil * nyVar.d) + this.f29830y;
        } else {
            boolean isEmpty = this.I.isEmpty();
            ArrayList arrayList3 = this.K;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i25 = this.f29830y;
            this.f29830y = i25 + 1;
            sparseArray2.put(i25, "search");
            if (size > 0) {
                int i26 = this.f29830y;
                this.f29830y = i26 + 1;
                this.P = i26;
                sparseArray2.put(i26, "packs");
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (!isEmpty) {
                int i27 = this.f29830y;
                this.f29830y = i27 + 1;
                sparseArray2.put(i27, org.telegram.messenger.dd.L0(2131744892, null));
                int i28 = i10 + 1;
                int size3 = this.I.size();
                int i29 = 0;
                int i30 = 0;
                while (i30 < size3) {
                    int i31 = i14;
                    ArrayList arrayList4 = (ArrayList) this.I.get(i30);
                    boolean z13 = isEmpty;
                    String str3 = (String) this.H.get(arrayList4);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.f29830y + i29, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z14 = z10;
                    int i32 = 0;
                    while (i32 < size4) {
                        int i33 = size4;
                        int i34 = this.f29830y + i29;
                        int i35 = size;
                        int i36 = (i29 / nyVar.d) + i28;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i32);
                        sparseArray2.put(i34, document2);
                        String str4 = str;
                        int i37 = i28;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.vi.b0(i31).o0(org.telegram.messenger.vi.q0(document2));
                        if (o03 != null) {
                            sparseArray4.put(i34, o03);
                        }
                        sparseIntArray.put(i34, i36);
                        i29++;
                        i32++;
                        size4 = i33;
                        size = i35;
                        arrayList4 = arrayList5;
                        i28 = i37;
                        str = str4;
                    }
                    i30++;
                    i14 = i31;
                    isEmpty = z13;
                    z10 = z14;
                }
                i11 = i14;
                z11 = isEmpty;
                z12 = z10;
                i12 = size;
                int i38 = i28;
                int ceil2 = (int) Math.ceil(i29 / nyVar.d);
                for (int i39 = 0; i39 < ceil2; i39++) {
                    sparseArray.put(i38 + i39, Integer.valueOf(i29));
                }
                this.f29830y = (nyVar.d * ceil2) + this.f29830y;
                i10 = i38 + ceil2;
            } else {
                i11 = i14;
                z11 = isEmpty;
                z12 = z10;
                i12 = size;
            }
            if (z12) {
                int i40 = this.f29830y;
                this.f29830y = i40 + 1;
                sparseArray2.put(i40, org.telegram.messenger.dd.L0(2131744893, null));
                int i41 = i10 + 1;
                String str5 = (String) this.H.get(this.K);
                if (str5 != null) {
                    sparseArray3.put(this.f29830y, str5);
                }
                int size5 = this.K.size();
                int i42 = 0;
                for (int i43 = 0; i43 < size5; i43++) {
                    int i44 = this.f29830y + i42;
                    int i45 = (i42 / nyVar.d) + i41;
                    TLRPC.Document document3 = (TLRPC.Document) this.K.get(i43);
                    sparseArray2.put(i44, document3);
                    TLRPC.TL_messages_stickerSet o04 = org.telegram.messenger.vi.b0(i11).o0(org.telegram.messenger.vi.q0(document3));
                    if (o04 != null) {
                        sparseArray4.put(i44, o04);
                    }
                    sparseIntArray.put(i44, i45);
                    i42++;
                }
                int ceil3 = (int) Math.ceil(i42 / nyVar.d);
                for (int i46 = 0; i46 < ceil3; i46++) {
                    sparseArray.put(i41 + i46, Integer.valueOf(i42));
                }
                this.f29830y = (ceil3 * nyVar.d) + this.f29830y;
            }
            if (z11 && !z12 && i12 == 0) {
                this.f29830y = 1;
            }
        }
        super.f();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        int A1;
        vy vyVar = this.Q;
        LongSparseArray longSparseArray = vyVar.f32017z1;
        LongSparseArray longSparseArray2 = vyVar.f32014y1;
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        SparseArray sparseArray = this.f29826r;
        boolean z11 = true;
        char c10 = 1;
        int i13 = 1;
        z11 = true;
        if (i12 != 0) {
            Integer num = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i10);
                        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f19821id) >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f19821id) < 0) {
                            c10 = 0;
                        }
                        if (z10 || c10 != 0) {
                            if (z10 && w3Var.f23387r) {
                                longSparseArray2.remove(stickerSetCovered.set.f19821id);
                                z10 = false;
                            } else if (c10 != 0 && !w3Var.f23387r) {
                                longSparseArray.remove(stickerSetCovered.set.f19821id);
                            }
                        }
                        w3Var.b(z10, false);
                        if (TextUtils.isEmpty(this.N)) {
                            A1 = -1;
                        } else {
                            A1 = org.telegram.messenger.i0.A1(stickerSetCovered.set.title, this.N);
                        }
                        int i14 = A1;
                        if (i14 >= 0) {
                            w3Var.c(stickerSetCovered, false, false, i14, this.N.length(), false);
                            return;
                        }
                        w3Var.c(stickerSetCovered, false, false, 0, 0, false);
                        if (!TextUtils.isEmpty(this.N) && org.telegram.messenger.i0.A1(stickerSetCovered.set.short_name, this.N) == 0) {
                            w3Var.d(this.N.length(), stickerSetCovered.set.short_name);
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.N) && this.F.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            n8Var.a(0, stickerSet.title);
                        }
                        n8Var.c(this.N.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num2 = (Integer) this.G.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num2 != null) {
                        String str = stickerSet2.title;
                        int intValue = num2.intValue();
                        if (!TextUtils.isEmpty(this.N)) {
                            i11 = this.N.length();
                        } else {
                            i11 = 0;
                        }
                        n8Var.b(str, 0, null, intValue, i11);
                    }
                    n8Var.c(0, null);
                    return;
                } else if (obj instanceof String) {
                    n8Var.a(0, (String) obj);
                    n8Var.c(0, null);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.o3 o3Var = (org.telegram.ui.Cells.o3) view;
            if (i10 == this.f29830y) {
                int i15 = this.f29828w.get(i10 - 1, Integer.MIN_VALUE);
                if (i15 == Integer.MIN_VALUE) {
                    o3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f29825n.get(i15);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj2).documents.size());
                } else if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                }
                if (num == null) {
                    o3Var.setHeight(1);
                    return;
                } else if (num.intValue() == 0) {
                    o3Var.setHeight(org.telegram.messenger.i0.L(8.0f));
                    return;
                } else {
                    int A = org.telegram.messenger.a30.A(82.0f, (int) Math.ceil(num.intValue() / vyVar.f32013y0.d), vyVar.h.getHeight());
                    if (A > 0) {
                        i13 = A;
                    }
                    o3Var.setHeight(i13);
                    return;
                }
            }
            o3Var.setHeight(org.telegram.messenger.i0.L(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
        d8Var.d(document, null, this.f29827s.get(i10), (String) this.f29829x.get(i10), false, false);
        if (!vyVar.f31965j1.contains(document) && !vyVar.f31968k1.contains(document)) {
            z11 = false;
        }
        d8Var.setRecent(z11);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        vy vyVar = this.Q;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        Context context = this.h;
        View view = null;
        switch (i10) {
            case 0:
                view = new my(1, context, p6Var, true);
                break;
            case 1:
                view = new org.telegram.ui.Cells.o3(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.n8(this.h, false, false, vyVar.Z1, vyVar.f31963i2);
                break;
            case 3:
                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(17, this.h, vyVar.Z1, false, true);
                w3Var.setAddOnClickListener(new h0(this, 13));
                view = w3Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new s4.o0(-1, vyVar.f31939b1));
                break;
            case 5:
                jg.l0 l0Var = new jg.l0(this, context, 18);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(2131232758);
                int i11 = org.telegram.ui.ActionBar.t6.Af;
                org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-org.telegram.messenger.i0.L(24.0f));
                l0Var.addView(imageView, w7.b6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(org.telegram.messenger.dd.L0(2131748165, null));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
                l0Var.addView(textView, w7.b6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                l0Var.setLayoutParams(new s4.o0(-1, -2));
                view = l0Var;
                break;
            case 7:
                s4.o0 o0Var = new s4.o0(-1, org.telegram.messenger.i0.L(79.0f));
                view = this.f29823c;
                view.setLayoutParams(o0Var);
                break;
            case 8:
                view = new View(vyVar.getContext());
                view.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(68.0f)));
                break;
        }
        return new s4.c1(view);
    }
}
