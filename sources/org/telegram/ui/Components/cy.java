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
public final class cy extends oj0 {
    public boolean D;
    public int L;
    public int M;
    public String N;
    public final hy Q;
    public final cx f32719c;
    public long d;
    public TLRPC.StickerSet f32720e;
    public ArrayList f32721f;
    public final Context h;
    public int f32727y;
    public final SparseArray f32722n = new SparseArray();
    public final SparseArray f32723r = new SparseArray();
    public final SparseArray f32724s = new SparseArray();
    public final SparseIntArray f32725w = new SparseIntArray();
    public final SparseArray f32726x = new SparseArray();
    public ArrayList E = new ArrayList();
    public HashMap F = new HashMap();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public final ay O = new ay(this);
    public int P = -1;

    public cy(hy hyVar, Context context) {
        this.Q = hyVar;
        this.h = context;
        cx cxVar = new cx(context, hyVar.f34400c1, new d(this, 12), new bx(this, 2), hyVar.Z1);
        this.f32719c = cxVar;
        cxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        cxVar.setClipToPadding(false);
        cxVar.f37190f3.f35528r = false;
        cxVar.setNestedScrollingEnabled(false);
        cxVar.setDrawSelection(false);
        cxVar.setOnTouchListener(new m.d2(this, 3));
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57047f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i7 = this.f32727y;
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
        if (i7 == this.P) {
            return 7;
        }
        if (i7 == 0) {
            return 4;
        }
        if (i7 == 1 && this.f32727y == 1) {
            return 5;
        }
        Object obj = this.f32723r.get(i7);
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
        boolean z9;
        int i7;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        hy hyVar = this.Q;
        int i13 = hyVar.f34400c1;
        yx yxVar = hyVar.f34469y0;
        this.P = -1;
        SparseArray sparseArray = this.f32722n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.f32725w;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f32723r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f32726x;
        sparseArray3.clear();
        this.f32727y = 0;
        int size = this.G.size() + this.E.size();
        this.f32719c.f37190f3.O(false);
        int i14 = (this.d > 0L ? 1 : (this.d == 0L ? 0 : -1));
        String str = "";
        SparseArray sparseArray4 = this.f32724s;
        if (i14 != 0) {
            ArrayList arrayList = this.f32721f;
            int i15 = this.f32727y;
            this.f32727y = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.f32727y;
                this.f32727y = i16 + 1;
                this.P = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.f32727y;
                this.f32727y = i17 + 1;
                sparseArray2.put(i17, org.telegram.messenger.id.G(this.f32720e.count, "Stickers", new Object[0]));
                i12 = 3;
            } else {
                i12 = 1;
            }
            String str2 = (String) this.H.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f32727y, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.f32727y + i19;
                int i21 = (i19 / yxVar.d) + i12;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i18);
                sparseArray2.put(i20, document);
                ArrayList arrayList2 = arrayList;
                int i22 = i18;
                TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ui.b0(i13).o0(org.telegram.messenger.ui.q0(document));
                if (o02 != null) {
                    sparseArray4.put(i20, o02);
                }
                sparseIntArray.put(i20, i21);
                i19++;
                i18 = i22 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i19 / yxVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i12 + i23, Integer.valueOf(i19));
            }
            this.f32727y = (ceil * yxVar.d) + this.f32727y;
        } else {
            boolean isEmpty = this.I.isEmpty();
            ArrayList arrayList3 = this.K;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i24 = this.f32727y;
            this.f32727y = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.f32727y;
                this.f32727y = i25 + 1;
                this.P = i25;
                sparseArray2.put(i25, "packs");
                i7 = 2;
            } else {
                i7 = 1;
            }
            if (!isEmpty) {
                int i26 = this.f32727y;
                this.f32727y = i26 + 1;
                sparseArray2.put(i26, org.telegram.messenger.id.M0(2131744877, null));
                int i27 = i7 + 1;
                int size3 = this.I.size();
                int i28 = 0;
                int i29 = 0;
                while (i29 < size3) {
                    int i30 = i13;
                    ArrayList arrayList4 = (ArrayList) this.I.get(i29);
                    boolean z12 = isEmpty;
                    String str3 = (String) this.H.get(arrayList4);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.f32727y + i28, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z13 = z9;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.f32727y + i28;
                        int i34 = size;
                        int i35 = (i28 / yxVar.d) + i27;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i31);
                        sparseArray2.put(i33, document2);
                        String str4 = str;
                        int i36 = i27;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.ui.b0(i30).o0(org.telegram.messenger.ui.q0(document2));
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
                    isEmpty = z12;
                    z9 = z13;
                }
                i10 = i13;
                z10 = isEmpty;
                z11 = z9;
                i11 = size;
                int i37 = i27;
                int ceil2 = (int) Math.ceil(i28 / yxVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i28));
                }
                this.f32727y = (yxVar.d * ceil2) + this.f32727y;
                i7 = i37 + ceil2;
            } else {
                i10 = i13;
                z10 = isEmpty;
                z11 = z9;
                i11 = size;
            }
            if (z11) {
                int i39 = this.f32727y;
                this.f32727y = i39 + 1;
                sparseArray2.put(i39, org.telegram.messenger.id.M0(2131744878, null));
                int i40 = i7 + 1;
                String str5 = (String) this.H.get(this.K);
                if (str5 != null) {
                    sparseArray3.put(this.f32727y, str5);
                }
                int size5 = this.K.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.f32727y + i41;
                    int i44 = (i41 / yxVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.K.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet o04 = org.telegram.messenger.ui.b0(i10).o0(org.telegram.messenger.ui.q0(document3));
                    if (o04 != null) {
                        sparseArray4.put(i43, o04);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / yxVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.f32727y = (ceil3 * yxVar.d) + this.f32727y;
            }
            if (z10 && !z11 && i11 == 0) {
                this.f32727y = 1;
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        boolean z9;
        int A1;
        hy hyVar = this.Q;
        LongSparseArray longSparseArray = hyVar.f34473z1;
        LongSparseArray longSparseArray2 = hyVar.f34470y1;
        int i11 = d1Var.f57047f;
        View view = d1Var.f57043a;
        SparseArray sparseArray = this.f32723r;
        boolean z10 = true;
        char c10 = 1;
        int i12 = 1;
        z10 = true;
        if (i11 != 0) {
            Integer num = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i7);
                        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f26983id) >= 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f26983id) < 0) {
                            c10 = 0;
                        }
                        if (z9 || c10 != 0) {
                            if (z9 && u3Var.f30572r) {
                                longSparseArray2.remove(stickerSetCovered.set.f26983id);
                                z9 = false;
                            } else if (c10 != 0 && !u3Var.f30572r) {
                                longSparseArray.remove(stickerSetCovered.set.f26983id);
                            }
                        }
                        u3Var.b(z9, false);
                        if (TextUtils.isEmpty(this.N)) {
                            A1 = -1;
                        } else {
                            A1 = org.telegram.messenger.g0.A1(stickerSetCovered.set.title, this.N);
                        }
                        int i13 = A1;
                        if (i13 >= 0) {
                            u3Var.c(stickerSetCovered, false, false, i13, this.N.length(), false);
                            return;
                        }
                        u3Var.c(stickerSetCovered, false, false, 0, 0, false);
                        if (!TextUtils.isEmpty(this.N) && org.telegram.messenger.g0.A1(stickerSetCovered.set.short_name, this.N) == 0) {
                            u3Var.d(this.N.length(), stickerSetCovered.set.short_name);
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
                    if (!TextUtils.isEmpty(this.N) && this.F.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            j8Var.a(0, stickerSet.title);
                        }
                        j8Var.c(this.N.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num2 = (Integer) this.G.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num2 != null) {
                        String str = stickerSet2.title;
                        int intValue = num2.intValue();
                        if (!TextUtils.isEmpty(this.N)) {
                            i10 = this.N.length();
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
            org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view;
            if (i7 == this.f32727y) {
                int i14 = this.f32725w.get(i7 - 1, Integer.MIN_VALUE);
                if (i14 == Integer.MIN_VALUE) {
                    m3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f32722n.get(i14);
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
                    int A = org.telegram.messenger.camera.q.A(82.0f, (int) Math.ceil(num.intValue() / hyVar.f34469y0.d), hyVar.h.getHeight());
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
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i7);
        org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
        z7Var.d(document, null, this.f32724s.get(i7), (String) this.f32726x.get(i7), false, false);
        if (!hyVar.f34422j1.contains(document) && !hyVar.f34425k1.contains(document)) {
            z10 = false;
        }
        z7Var.setRecent(z10);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        hy hyVar = this.Q;
        org.telegram.ui.ActionBar.f6 f6Var = hyVar.Z1;
        Context context = this.h;
        View view = null;
        switch (i7) {
            case 0:
                view = new jg.c2(2, context, f6Var, true);
                break;
            case 1:
                view = new org.telegram.ui.Cells.m3(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.j8(this.h, false, false, hyVar.Z1, hyVar.f34420i2);
                break;
            case 3:
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(17, this.h, hyVar.Z1, false, true);
                u3Var.setAddOnClickListener(new h0(this, 14));
                view = u3Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new v4.o0(-1, hyVar.f34396b1));
                break;
            case 5:
                bi.e5 e5Var = new bi.e5(19, context, this);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(2131232761);
                int i10 = org.telegram.ui.ActionBar.k6.Af;
                org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-org.telegram.messenger.g0.L(24.0f));
                e5Var.addView(imageView, c8.ha.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(org.telegram.messenger.id.M0(2131748150, null));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
                e5Var.addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                e5Var.setLayoutParams(new v4.o0(-1, -2));
                view = e5Var;
                break;
            case 7:
                v4.o0 o0Var = new v4.o0(-1, org.telegram.messenger.g0.L(79.0f));
                view = this.f32719c;
                view.setLayoutParams(o0Var);
                break;
            case 8:
                view = new View(hyVar.getContext());
                view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(68.0f)));
                break;
        }
        return new v4.d1(view);
    }
}
