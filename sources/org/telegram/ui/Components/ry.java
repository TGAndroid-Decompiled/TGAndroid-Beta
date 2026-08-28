package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ry extends vk0 {
    public int H;
    public int I;
    public String J;
    public final wy M;
    public final qy f32301c;
    public long d;
    public TLRPC.StickerSet f32302e;
    public ArrayList f32303f;
    public final Context h;
    public int f32308x;
    public boolean f32309y;
    public final SparseArray f32304n = new SparseArray();
    public final SparseArray f32305r = new SparseArray();
    public final SparseArray f32306s = new SparseArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseArray f32307w = new SparseArray();
    public ArrayList A = new ArrayList();
    public HashMap B = new HashMap();
    public HashMap C = new HashMap();
    public HashMap D = new HashMap();
    public ArrayList E = new ArrayList();
    public ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public final py K = new py(this);
    public int L = -1;

    public ry(wy wyVar, Context context) {
        this.M = wyVar;
        this.h = context;
        ?? aVar = new vg.a(context, wyVar.Y0, new d(this, 12), new wu(this, 3), wyVar.V1);
        this.f32301c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.U2.f35188r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.d2(this, 3));
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i9 = this.f32308x;
        if (i9 != 1) {
            return i9 + 1;
        }
        return 2;
    }

    @Override
    public final int j(int i9) {
        if (this.d != 0 && i9 == h() - 1) {
            return 8;
        }
        if (i9 == this.L) {
            return 7;
        }
        if (i9 == 0) {
            return 4;
        }
        if (i9 == 1 && this.f32308x == 1) {
            return 5;
        }
        Object obj = this.f32305r.get(i9);
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
    public final void l() {
        boolean z10;
        int i9;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        wy wyVar = this.M;
        int i13 = wyVar.Y0;
        ny nyVar = wyVar.f34448u0;
        this.L = -1;
        SparseArray sparseArray = this.f32304n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f32305r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f32307w;
        sparseArray3.clear();
        this.f32308x = 0;
        int size = this.C.size() + this.A.size();
        this.f32301c.U2.N(false);
        long j10 = this.d;
        String str = "";
        SparseArray sparseArray4 = this.f32306s;
        if (j10 != 0) {
            ArrayList arrayList = this.f32303f;
            int i14 = this.f32308x;
            this.f32308x = i14 + 1;
            sparseArray2.put(i14, "search");
            if (size > 0) {
                int i15 = this.f32308x;
                this.f32308x = i15 + 1;
                this.L = i15;
                sparseArray2.put(i15, "packs");
                int i16 = this.f32308x;
                this.f32308x = i16 + 1;
                sparseArray2.put(i16, LocaleController.formatPluralString("Stickers", this.f32302e.count, new Object[0]));
                i12 = 3;
            } else {
                i12 = 1;
            }
            String str2 = (String) this.D.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f32308x, str2);
            }
            int size2 = arrayList.size();
            int i17 = 0;
            int i18 = 0;
            while (i17 < size2) {
                int i19 = this.f32308x + i18;
                int i20 = (i18 / nyVar.d) + i12;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i17);
                sparseArray2.put(i19, document);
                SparseArray sparseArray5 = sparseArray2;
                int i21 = size2;
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i13).getStickerSetById(MediaDataController.getStickerSetId(document));
                if (stickerSetById != null) {
                    sparseArray4.put(i19, stickerSetById);
                }
                sparseIntArray.put(i19, i20);
                i18++;
                i17++;
                size2 = i21;
                sparseArray2 = sparseArray5;
            }
            int ceil = (int) Math.ceil(i18 / nyVar.d);
            for (int i22 = 0; i22 < ceil; i22++) {
                sparseArray.put(i12 + i22, Integer.valueOf(i18));
            }
            this.f32308x = (ceil * nyVar.d) + this.f32308x;
        } else {
            boolean isEmpty = this.E.isEmpty();
            ArrayList arrayList2 = this.G;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i23 = this.f32308x;
            this.f32308x = i23 + 1;
            sparseArray2.put(i23, "search");
            if (size > 0) {
                int i24 = this.f32308x;
                this.f32308x = i24 + 1;
                this.L = i24;
                sparseArray2.put(i24, "packs");
                i9 = 2;
            } else {
                i9 = 1;
            }
            if (!isEmpty) {
                int i25 = this.f32308x;
                this.f32308x = i25 + 1;
                sparseArray2.put(i25, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                int i26 = i9 + 1;
                int size3 = this.E.size();
                int i27 = 0;
                int i28 = 0;
                while (i27 < size3) {
                    int i29 = i13;
                    ArrayList arrayList3 = (ArrayList) this.E.get(i27);
                    boolean z13 = isEmpty;
                    String str3 = (String) this.D.get(arrayList3);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.f32308x + i28, str3);
                        str = str3;
                    }
                    int size4 = arrayList3.size();
                    boolean z14 = z10;
                    int i30 = 0;
                    while (i30 < size4) {
                        int i31 = size4;
                        int i32 = this.f32308x + i28;
                        String str4 = str;
                        int i33 = (i28 / nyVar.d) + i26;
                        ArrayList arrayList4 = arrayList3;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i30);
                        sparseArray2.put(i32, document2);
                        int i34 = size;
                        int i35 = i26;
                        TLRPC.TL_messages_stickerSet stickerSetById2 = MediaDataController.getInstance(i29).getStickerSetById(MediaDataController.getStickerSetId(document2));
                        if (stickerSetById2 != null) {
                            sparseArray4.put(i32, stickerSetById2);
                        }
                        sparseIntArray.put(i32, i33);
                        i28++;
                        i30++;
                        size4 = i31;
                        str = str4;
                        arrayList3 = arrayList4;
                        size = i34;
                        i26 = i35;
                    }
                    i27++;
                    i13 = i29;
                    isEmpty = z13;
                    z10 = z14;
                }
                i10 = i13;
                z11 = isEmpty;
                z12 = z10;
                i11 = size;
                int i36 = i26;
                int ceil2 = (int) Math.ceil(i28 / nyVar.d);
                for (int i37 = 0; i37 < ceil2; i37++) {
                    sparseArray.put(i36 + i37, Integer.valueOf(i28));
                }
                this.f32308x = (nyVar.d * ceil2) + this.f32308x;
                i9 = i36 + ceil2;
            } else {
                i10 = i13;
                z11 = isEmpty;
                z12 = z10;
                i11 = size;
            }
            if (z12) {
                int i38 = this.f32308x;
                this.f32308x = i38 + 1;
                sparseArray2.put(i38, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i39 = i9 + 1;
                String str5 = (String) this.D.get(this.G);
                if (str5 != null) {
                    sparseArray3.put(this.f32308x, str5);
                }
                int size5 = this.G.size();
                int i40 = 0;
                for (int i41 = 0; i41 < size5; i41++) {
                    int i42 = this.f32308x + i40;
                    int i43 = (i40 / nyVar.d) + i39;
                    TLRPC.Document document3 = (TLRPC.Document) this.G.get(i41);
                    sparseArray2.put(i42, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(i10).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        sparseArray4.put(i42, stickerSetById3);
                    }
                    sparseIntArray.put(i42, i43);
                    i40++;
                }
                int ceil3 = (int) Math.ceil(i40 / nyVar.d);
                for (int i44 = 0; i44 < ceil3; i44++) {
                    sparseArray.put(i39 + i44, Integer.valueOf(i40));
                }
                this.f32308x = (ceil3 * nyVar.d) + this.f32308x;
            }
            if (z11 && !z12 && i11 == 0) {
                this.f32308x = 1;
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        boolean z10;
        int indexOfIgnoreCase;
        wy wyVar = this.M;
        LongSparseArray longSparseArray = wyVar.f34452v1;
        LongSparseArray longSparseArray2 = wyVar.f34449u1;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        SparseArray sparseArray = this.f32305r;
        boolean z11 = true;
        char c10 = 1;
        int i12 = 1;
        z11 = true;
        if (i11 != 0) {
            Integer num = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i9);
                        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f22407id) >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f22407id) < 0) {
                            c10 = 0;
                        }
                        if (z10 || c10 != 0) {
                            if (z10 && s3Var.f25263r) {
                                longSparseArray2.remove(stickerSetCovered.set.f22407id);
                                z10 = false;
                            } else if (c10 != 0 && !s3Var.f25263r) {
                                longSparseArray.remove(stickerSetCovered.set.f22407id);
                            }
                        }
                        s3Var.b(z10, false);
                        if (TextUtils.isEmpty(this.J)) {
                            indexOfIgnoreCase = -1;
                        } else {
                            indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.J);
                        }
                        if (indexOfIgnoreCase >= 0) {
                            s3Var.c(stickerSetCovered, false, false, indexOfIgnoreCase, this.J.length(), false);
                            return;
                        }
                        s3Var.c(stickerSetCovered, false, false, 0, 0, false);
                        if (!TextUtils.isEmpty(this.J) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.J) == 0) {
                            String str = stickerSetCovered.set.short_name;
                            int length = this.J.length();
                            s3Var.B = str;
                            s3Var.C = length;
                            s3Var.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                Object obj = sparseArray.get(i9);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.J) && this.B.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            m8Var.b(0, stickerSet.title);
                        }
                        m8Var.d(this.J.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num2 = (Integer) this.C.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num2 != null) {
                        String str2 = stickerSet2.title;
                        int intValue = num2.intValue();
                        if (!TextUtils.isEmpty(this.J)) {
                            i10 = this.J.length();
                        } else {
                            i10 = 0;
                        }
                        m8Var.c(str2, 0, null, intValue, i10);
                    }
                    m8Var.d(0, null);
                    return;
                } else if (obj instanceof String) {
                    m8Var.b(0, (String) obj);
                    m8Var.d(0, null);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) view;
            if (i9 == this.f32308x) {
                int i13 = this.v.get(i9 - 1, Integer.MIN_VALUE);
                if (i13 == Integer.MIN_VALUE) {
                    l3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f32304n.get(i13);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj2).documents.size());
                } else if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                }
                if (num == null) {
                    l3Var.setHeight(1);
                    return;
                } else if (num.intValue() == 0) {
                    l3Var.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int A = org.telegram.messenger.ll.A(82.0f, (int) Math.ceil(num.intValue() / wyVar.f34448u0.d), wyVar.h.getHeight());
                    if (A > 0) {
                        i12 = A;
                    }
                    l3Var.setHeight(i12);
                    return;
                }
            }
            l3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i9);
        org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
        d8Var.d(document, null, this.f32306s.get(i9), (String) this.f32307w.get(i9), false, false);
        if (!wyVar.f34403f1.contains(document) && !wyVar.f34406g1.contains(document)) {
            z11 = false;
        }
        d8Var.setRecent(z11);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View x1Var;
        ViewGroup d2Var;
        Context context = this.h;
        wy wyVar = this.M;
        switch (i9) {
            case 0:
                x1Var = new of.x1(2, context, wyVar.V1, true);
                break;
            case 1:
                x1Var = new org.telegram.ui.Cells.l3(context);
                break;
            case 2:
                x1Var = new org.telegram.ui.Cells.m8(this.h, false, false, wyVar.V1, wyVar.f34400e2);
                break;
            case 3:
                org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(17, this.h, wyVar.V1, false, true);
                s3Var.setAddOnClickListener(new f0(this, 15));
                x1Var = s3Var;
                break;
            case 4:
                x1Var = new View(context);
                x1Var.setLayoutParams(new f2.a1(-1, wyVar.X0));
                break;
            case 5:
                d2Var = new fh.d2(this, context, 17);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i10 = org.telegram.ui.ActionBar.f6.Le;
                imageView.setColorFilter(new PorterDuffColorFilter(wyVar.z(i10), PorterDuff.Mode.MULTIPLY));
                imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                d2Var.addView(imageView, g7.e6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(wyVar.z(i10));
                d2Var.addView(textView, g7.e6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                d2Var.setLayoutParams(new f2.a1(-1, -2));
                x1Var = d2Var;
                break;
            case 6:
            default:
                x1Var = null;
                break;
            case 7:
                ViewGroup.LayoutParams a1Var = new f2.a1(-1, AndroidUtilities.dp(79.0f));
                d2Var = this.f32301c;
                d2Var.setLayoutParams(a1Var);
                x1Var = d2Var;
                break;
            case 8:
                x1Var = new View(wyVar.getContext());
                x1Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(68.0f)));
                break;
        }
        return new f2.q1(x1Var);
    }
}
