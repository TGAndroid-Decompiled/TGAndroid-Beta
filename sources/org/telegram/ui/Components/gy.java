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
public final class gy extends tj0 {
    public boolean E;
    public int M;
    public int N;
    public String O;
    public final ly R;
    public final hx f35083c;
    public long d;
    public TLRPC.StickerSet f35084e;
    public ArrayList f35085f;
    public final Context h;
    public int f35091y;
    public final SparseArray f35086n = new SparseArray();
    public final SparseArray f35087r = new SparseArray();
    public final SparseArray f35088s = new SparseArray();
    public final SparseIntArray f35089w = new SparseIntArray();
    public final SparseArray f35090x = new SparseArray();
    public ArrayList F = new ArrayList();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public HashMap I = new HashMap();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public ArrayList L = new ArrayList();
    public final fy P = new fy(this);
    public int Q = -1;

    public gy(ly lyVar, Context context) {
        this.R = lyVar;
        this.h = context;
        hx hxVar = new hx(context, lyVar.f36941d1, new d(this, 12), new gx(this, 2), lyVar.f36931a2);
        this.f35083c = hxVar;
        hxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        hxVar.setClipToPadding(false);
        hxVar.f39895g3.f38201r = false;
        hxVar.setNestedScrollingEnabled(false);
        hxVar.setDrawSelection(false);
        hxVar.setOnTouchListener(new m.c2(this, 3));
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i7 = this.f35091y;
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
        if (i7 == 1 && this.f35091y == 1) {
            return 5;
        }
        Object obj = this.f35087r.get(i7);
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
        ly lyVar = this.R;
        int i13 = lyVar.f36941d1;
        dy dyVar = lyVar.f37010z0;
        this.Q = -1;
        SparseArray sparseArray = this.f35086n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.f35089w;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f35087r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f35090x;
        sparseArray3.clear();
        this.f35091y = 0;
        int size = this.H.size() + this.F.size();
        this.f35083c.f39895g3.O(false);
        int i14 = (this.d > 0L ? 1 : (this.d == 0L ? 0 : -1));
        String str = "";
        SparseArray sparseArray4 = this.f35088s;
        if (i14 != 0) {
            ArrayList arrayList = this.f35085f;
            int i15 = this.f35091y;
            this.f35091y = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.f35091y;
                this.f35091y = i16 + 1;
                this.Q = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.f35091y;
                this.f35091y = i17 + 1;
                sparseArray2.put(i17, org.telegram.messenger.hd.G(this.f35084e.count, "Stickers", new Object[0]));
                i12 = 3;
            } else {
                i12 = 1;
            }
            String str2 = (String) this.I.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f35091y, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.f35091y + i19;
                int i21 = (i19 / dyVar.d) + i12;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i18);
                sparseArray2.put(i20, document);
                ArrayList arrayList2 = arrayList;
                int i22 = i18;
                TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.si.b0(i13).o0(org.telegram.messenger.si.q0(document));
                if (o02 != null) {
                    sparseArray4.put(i20, o02);
                }
                sparseIntArray.put(i20, i21);
                i19++;
                i18 = i22 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i19 / dyVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i12 + i23, Integer.valueOf(i19));
            }
            this.f35091y = (ceil * dyVar.d) + this.f35091y;
        } else {
            boolean isEmpty = this.J.isEmpty();
            ArrayList arrayList3 = this.L;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i24 = this.f35091y;
            this.f35091y = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.f35091y;
                this.f35091y = i25 + 1;
                this.Q = i25;
                sparseArray2.put(i25, "packs");
                i7 = 2;
            } else {
                i7 = 1;
            }
            if (!isEmpty) {
                int i26 = this.f35091y;
                this.f35091y = i26 + 1;
                sparseArray2.put(i26, org.telegram.messenger.hd.M0(2131744874, null));
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
                        sparseArray3.put(this.f35091y + i28, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z14 = z10;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.f35091y + i28;
                        int i34 = size;
                        int i35 = (i28 / dyVar.d) + i27;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i31);
                        sparseArray2.put(i33, document2);
                        String str4 = str;
                        int i36 = i27;
                        TLRPC.TL_messages_stickerSet o03 = org.telegram.messenger.si.b0(i30).o0(org.telegram.messenger.si.q0(document2));
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
                int ceil2 = (int) Math.ceil(i28 / dyVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i28));
                }
                this.f35091y = (dyVar.d * ceil2) + this.f35091y;
                i7 = i37 + ceil2;
            } else {
                i10 = i13;
                z11 = isEmpty;
                z12 = z10;
                i11 = size;
            }
            if (z12) {
                int i39 = this.f35091y;
                this.f35091y = i39 + 1;
                sparseArray2.put(i39, org.telegram.messenger.hd.M0(2131744875, null));
                int i40 = i7 + 1;
                String str5 = (String) this.I.get(this.L);
                if (str5 != null) {
                    sparseArray3.put(this.f35091y, str5);
                }
                int size5 = this.L.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.f35091y + i41;
                    int i44 = (i41 / dyVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.L.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet o04 = org.telegram.messenger.si.b0(i10).o0(org.telegram.messenger.si.q0(document3));
                    if (o04 != null) {
                        sparseArray4.put(i43, o04);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / dyVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.f35091y = (ceil3 * dyVar.d) + this.f35091y;
            }
            if (z11 && !z12 && i11 == 0) {
                this.f35091y = 1;
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        boolean z10;
        int A1;
        ly lyVar = this.R;
        LongSparseArray longSparseArray = lyVar.A1;
        LongSparseArray longSparseArray2 = lyVar.f37011z1;
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        SparseArray sparseArray = this.f35087r;
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
                        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f28078id) >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f28078id) < 0) {
                            c10 = 0;
                        }
                        if (z10 || c10 != 0) {
                            if (z10 && u3Var.f31720r) {
                                longSparseArray2.remove(stickerSetCovered.set.f28078id);
                                z10 = false;
                            } else if (c10 != 0 && !u3Var.f31720r) {
                                longSparseArray.remove(stickerSetCovered.set.f28078id);
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
                Object obj = sparseArray.get(i7);
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
            if (i7 == this.f35091y) {
                int i14 = this.f35089w.get(i7 - 1, Integer.MIN_VALUE);
                if (i14 == Integer.MIN_VALUE) {
                    m3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f35086n.get(i14);
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
                    int A = org.telegram.messenger.i20.A(82.0f, (int) Math.ceil(num.intValue() / lyVar.f37010z0.d), lyVar.h.getHeight());
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
        org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
        y7Var.d(document, null, this.f35088s.get(i7), (String) this.f35090x.get(i7), false, false);
        if (!lyVar.f36963k1.contains(document) && !lyVar.l1.contains(document)) {
            z11 = false;
        }
        y7Var.setRecent(z11);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ly lyVar = this.R;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.f36931a2;
        Context context = this.h;
        View view = null;
        switch (i7) {
            case 0:
                view = new jg.b2(2, context, e6Var, true);
                break;
            case 1:
                view = new org.telegram.ui.Cells.m3(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.i8(this.h, false, false, lyVar.f36931a2, lyVar.f36961j2);
                break;
            case 3:
                org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(17, this.h, lyVar.f36931a2, false, true);
                u3Var.setAddOnClickListener(new e0(this, 15));
                view = u3Var;
                break;
            case 4:
                view = new View(context);
                view.setLayoutParams(new v4.p0(-1, lyVar.f36938c1));
                break;
            case 5:
                bi.g2 g2Var = new bi.g2(20, context, this);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(2131232762);
                int i10 = org.telegram.ui.ActionBar.j6.Df;
                org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-org.telegram.messenger.g0.L(24.0f));
                g2Var.addView(imageView, c8.ja.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(org.telegram.messenger.hd.M0(2131748149, null));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
                g2Var.addView(textView, c8.ja.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                g2Var.setLayoutParams(new v4.p0(-1, -2));
                view = g2Var;
                break;
            case 7:
                v4.p0 p0Var = new v4.p0(-1, org.telegram.messenger.g0.L(79.0f));
                view = this.f35083c;
                view.setLayoutParams(p0Var);
                break;
            case 8:
                view = new View(lyVar.getContext());
                view.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(68.0f)));
                break;
        }
        return new v4.e1(view);
    }
}
