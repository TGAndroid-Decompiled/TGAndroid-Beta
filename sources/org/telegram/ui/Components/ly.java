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
public final class ly extends dk0 {
    public boolean E;
    public int M;
    public int N;
    public String O;
    public final qy R;
    public final lx f37250c;
    public long d;
    public TLRPC.StickerSet f37251e;
    public ArrayList f37252f;
    public final Context h;
    public int f37258y;
    public final SparseArray f37253n = new SparseArray();
    public final SparseArray f37254r = new SparseArray();
    public final SparseArray f37255s = new SparseArray();
    public final SparseIntArray f37256w = new SparseIntArray();
    public final SparseArray f37257x = new SparseArray();
    public ArrayList F = new ArrayList();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public HashMap I = new HashMap();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public ArrayList L = new ArrayList();
    public final ky P = new ky(this);
    public int Q = -1;

    public ly(qy qyVar, Context context) {
        this.R = qyVar;
        this.h = context;
        lx lxVar = new lx(context, qyVar.f39047d1, new d(this, 13), new hy(this, 1), qyVar.f39037a2);
        this.f37250c = lxVar;
        lxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        lxVar.setClipToPadding(false);
        lxVar.f35323g3.f33631r = false;
        lxVar.setNestedScrollingEnabled(false);
        lxVar.setDrawSelection(false);
        lxVar.setOnTouchListener(new m.c2(this, 3));
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i7 = this.f37258y;
        if (i7 != 1) {
            return i7 + 1;
        }
        return 2;
    }

    @Override
    public final int d(int i7) {
        if (this.d != 0 && i7 == b() - 1) {
            return 8;
        }
        if (i7 == this.Q) {
            return 7;
        }
        if (i7 == 0) {
            return 4;
        }
        if (i7 == 1 && this.f37258y == 1) {
            return 5;
        }
        Object obj = this.f37254r.get(i7);
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
        int i7;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        qy qyVar = this.R;
        int i13 = qyVar.f39047d1;
        iy iyVar = qyVar.f39116z0;
        this.Q = -1;
        SparseArray sparseArray = this.f37253n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.f37256w;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f37254r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f37257x;
        sparseArray3.clear();
        this.f37258y = 0;
        int size = this.H.size() + this.F.size();
        this.f37250c.f35323g3.O(false);
        int i14 = (this.d > 0L ? 1 : (this.d == 0L ? 0 : -1));
        String str = "";
        SparseArray sparseArray4 = this.f37255s;
        if (i14 != 0) {
            ArrayList arrayList = this.f37252f;
            int i15 = this.f37258y;
            this.f37258y = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.f37258y;
                this.f37258y = i16 + 1;
                this.Q = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.f37258y;
                this.f37258y = i17 + 1;
                sparseArray2.put(i17, org.telegram.messenger.gd.G(this.f37251e.count, "Stickers", new Object[0]));
                i12 = 3;
            } else {
                i12 = 1;
            }
            String str2 = (String) this.I.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f37258y, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.f37258y + i19;
                int i21 = (i19 / iyVar.d) + i12;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i18);
                sparseArray2.put(i20, document);
                ArrayList arrayList2 = arrayList;
                int i22 = i18;
                TLRPC.TL_messages_stickerSet q02 = org.telegram.messenger.ri.d0(i13).q0(org.telegram.messenger.ri.s0(document));
                if (q02 != null) {
                    sparseArray4.put(i20, q02);
                }
                sparseIntArray.put(i20, i21);
                i19++;
                i18 = i22 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i19 / iyVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i12 + i23, Integer.valueOf(i19));
            }
            this.f37258y = (ceil * iyVar.d) + this.f37258y;
        } else {
            boolean isEmpty = this.J.isEmpty();
            ArrayList arrayList3 = this.L;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i24 = this.f37258y;
            this.f37258y = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.f37258y;
                this.f37258y = i25 + 1;
                this.Q = i25;
                sparseArray2.put(i25, "packs");
                i7 = 2;
            } else {
                i7 = 1;
            }
            if (!isEmpty) {
                int i26 = this.f37258y;
                this.f37258y = i26 + 1;
                sparseArray2.put(i26, org.telegram.messenger.gd.N0(2131744633, null));
                int i27 = i7 + 1;
                int size3 = this.J.size();
                int i28 = 0;
                int i29 = 0;
                while (i29 < size3) {
                    int i30 = i13;
                    ArrayList arrayList4 = (ArrayList) this.J.get(i29);
                    boolean z13 = isEmpty;
                    String str3 = (String) this.I.get(arrayList4);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.f37258y + i28, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z14 = z10;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.f37258y + i28;
                        int i34 = size;
                        int i35 = (i28 / iyVar.d) + i27;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i31);
                        sparseArray2.put(i33, document2);
                        String str4 = str;
                        int i36 = i27;
                        TLRPC.TL_messages_stickerSet q03 = org.telegram.messenger.ri.d0(i30).q0(org.telegram.messenger.ri.s0(document2));
                        if (q03 != null) {
                            sparseArray4.put(i33, q03);
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
                int ceil2 = (int) Math.ceil(i28 / iyVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i28));
                }
                this.f37258y = (iyVar.d * ceil2) + this.f37258y;
                i7 = i37 + ceil2;
            } else {
                i10 = i13;
                z11 = isEmpty;
                z12 = z10;
                i11 = size;
            }
            if (z12) {
                int i39 = this.f37258y;
                this.f37258y = i39 + 1;
                sparseArray2.put(i39, org.telegram.messenger.gd.N0(2131744634, null));
                int i40 = i7 + 1;
                String str5 = (String) this.I.get(this.L);
                if (str5 != null) {
                    sparseArray3.put(this.f37258y, str5);
                }
                int size5 = this.L.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.f37258y + i41;
                    int i44 = (i41 / iyVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.L.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet q04 = org.telegram.messenger.ri.d0(i10).q0(org.telegram.messenger.ri.s0(document3));
                    if (q04 != null) {
                        sparseArray4.put(i43, q04);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / iyVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.f37258y = (ceil3 * iyVar.d) + this.f37258y;
            }
            if (z11 && !z12 && i11 == 0) {
                this.f37258y = 1;
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        boolean z10;
        int A1;
        qy qyVar = this.R;
        LongSparseArray longSparseArray = qyVar.A1;
        LongSparseArray longSparseArray2 = qyVar.f39117z1;
        int i11 = f1Var.f59249f;
        View view = f1Var.f59245a;
        SparseArray sparseArray = this.f37254r;
        boolean z11 = true;
        char c10 = 1;
        int i12 = 1;
        z11 = true;
        if (i11 != 0) {
            Integer num = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i7);
                        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f28519id) >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f28519id) < 0) {
                            c10 = 0;
                        }
                        if (z10 || c10 != 0) {
                            if (z10 && v3Var.f32242r) {
                                longSparseArray2.remove(stickerSetCovered.set.f28519id);
                                z10 = false;
                            } else if (c10 != 0 && !v3Var.f32242r) {
                                longSparseArray.remove(stickerSetCovered.set.f28519id);
                            }
                        }
                        v3Var.b(z10, false);
                        if (TextUtils.isEmpty(this.O)) {
                            A1 = -1;
                        } else {
                            A1 = org.telegram.messenger.g0.A1(stickerSetCovered.set.title, this.O);
                        }
                        int i13 = A1;
                        if (i13 >= 0) {
                            v3Var.c(stickerSetCovered, false, false, i13, this.O.length(), false);
                            return;
                        }
                        v3Var.c(stickerSetCovered, false, false, 0, 0, false);
                        if (!TextUtils.isEmpty(this.O) && org.telegram.messenger.g0.A1(stickerSetCovered.set.short_name, this.O) == 0) {
                            v3Var.d(this.O.length(), stickerSetCovered.set.short_name);
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                Object obj = sparseArray.get(i7);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.O) && this.G.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            j8Var.a(0, stickerSet.title);
                        }
                        j8Var.c(this.O.length(), tL_messages_stickerSet.set.short_name);
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
                        j8Var.b(str, 0, null, intValue, i10);
                    }
                    j8Var.c(0, null);
                    return;
                } else if (obj instanceof String) {
                    j8Var.a(0, (String) obj);
                    j8Var.c(0, null);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.n3 n3Var = (org.telegram.ui.Cells.n3) view;
            if (i7 == this.f37258y) {
                int i14 = this.f37256w.get(i7 - 1, Integer.MIN_VALUE);
                if (i14 == Integer.MIN_VALUE) {
                    n3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f37253n.get(i14);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj2).documents.size());
                } else if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                }
                if (num == null) {
                    n3Var.setHeight(1);
                    return;
                } else if (num.intValue() == 0) {
                    n3Var.setHeight(org.telegram.messenger.g0.L(8.0f));
                    return;
                } else {
                    int B = org.telegram.messenger.m10.B(82.0f, (int) Math.ceil(num.intValue() / qyVar.f39116z0.d), qyVar.h.getHeight());
                    if (B > 0) {
                        i12 = B;
                    }
                    n3Var.setHeight(i12);
                    return;
                }
            }
            n3Var.setHeight(org.telegram.messenger.g0.L(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i7);
        org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
        z7Var.d(document, null, this.f37255s.get(i7), (String) this.f37257x.get(i7), false, false);
        if (!qyVar.f39069k1.contains(document) && !qyVar.l1.contains(document)) {
            z11 = false;
        }
        z7Var.setRecent(z11);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        qy qyVar = this.R;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.f39037a2;
        Context context = this.h;
        View view = null;
        switch (i7) {
            case 0:
                view = new jg.b2(2, context, i6Var, true);
                break;
            case 1:
                view = new org.telegram.ui.Cells.n3(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.j8(this.h, false, false, qyVar.f39037a2, qyVar.f39067j2);
                break;
            case 3:
                org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(17, this.h, qyVar.f39037a2, false, true);
                v3Var.setAddOnClickListener(new n0(this, 15));
                view = v3Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new v4.q0(-1, qyVar.f39044c1));
                break;
            case 5:
                bi.g3 g3Var = new bi.g3(20, context, this);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(2131232766);
                int i10 = org.telegram.ui.ActionBar.n6.Df;
                org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-org.telegram.messenger.g0.L(24.0f));
                g3Var.addView(imageView, c8.na.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                org.telegram.messenger.m10.l(16.0f, 2131747956, 1, textView, null);
                org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
                g3Var.addView(textView, c8.na.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                g3Var.setLayoutParams(new v4.q0(-1, -2));
                view = g3Var;
                break;
            case 7:
                v4.q0 q0Var = new v4.q0(-1, org.telegram.messenger.g0.L(79.0f));
                view = this.f37250c;
                view.setLayoutParams(q0Var);
                break;
            case 8:
                view = new View(qyVar.getContext());
                view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(68.0f)));
                break;
        }
        return new v4.f1(view);
    }
}
