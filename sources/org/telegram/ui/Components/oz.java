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
public final class oz extends im0 {
    public int L;
    public int M;
    public String N;
    public final tz Q;
    public final nz f29155c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f29156f;
    public final Context h;
    public int f29161x;
    public boolean f29162y;
    public final SparseArray f29157n = new SparseArray();
    public final SparseArray f29158r = new SparseArray();
    public final SparseArray f29159s = new SparseArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseArray f29160w = new SparseArray();
    public ArrayList E = new ArrayList();
    public HashMap F = new HashMap();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public final mz O = new mz(this);
    public int P = -1;

    public oz(tz tzVar, Context context) {
        this.Q = tzVar;
        this.h = context;
        ?? aVar = new oh.a(context, tzVar.f30723c1, new d(this, 12), new tv(this, 3), tzVar.Z1);
        this.f29155c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.W2.f30861r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.d2(this, 3));
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45920f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.f29161x;
        if (i10 != 1) {
            return i10 + 1;
        }
        return 2;
    }

    @Override
    public final int j(int i10) {
        if (this.d != 0 && i10 == h() - 1) {
            return 8;
        }
        if (i10 == this.P) {
            return 7;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1 && this.f29161x == 1) {
            return 5;
        }
        Object obj = this.f29158r.get(i10);
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
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        tz tzVar = this.Q;
        int i14 = tzVar.f30723c1;
        kz kzVar = tzVar.f30793y0;
        this.P = -1;
        SparseArray sparseArray = this.f29157n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f29158r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f29160w;
        sparseArray3.clear();
        this.f29161x = 0;
        int size = this.G.size() + this.E.size();
        this.f29155c.W2.N(false);
        int i15 = (this.d > 0L ? 1 : (this.d == 0L ? 0 : -1));
        String str = "";
        SparseArray sparseArray4 = this.f29159s;
        if (i15 != 0) {
            ArrayList arrayList = this.f29156f;
            int i16 = this.f29161x;
            this.f29161x = i16 + 1;
            sparseArray2.put(i16, "search");
            if (size > 0) {
                int i17 = this.f29161x;
                this.f29161x = i17 + 1;
                this.P = i17;
                sparseArray2.put(i17, "packs");
                int i18 = this.f29161x;
                this.f29161x = i18 + 1;
                sparseArray2.put(i18, LocaleController.formatPluralString("Stickers", this.e.count, new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.H.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f29161x, str2);
            }
            int size2 = arrayList.size();
            int i19 = 0;
            int i20 = 0;
            while (i19 < size2) {
                int i21 = this.f29161x + i20;
                int i22 = (i20 / kzVar.d) + i13;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i19);
                sparseArray2.put(i21, document);
                ArrayList arrayList2 = arrayList;
                int i23 = i19;
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i14).getStickerSetById(MediaDataController.getStickerSetId(document));
                if (stickerSetById != null) {
                    sparseArray4.put(i21, stickerSetById);
                }
                sparseIntArray.put(i21, i22);
                i20++;
                i19 = i23 + 1;
                arrayList = arrayList2;
            }
            int ceil = (int) Math.ceil(i20 / kzVar.d);
            for (int i24 = 0; i24 < ceil; i24++) {
                sparseArray.put(i13 + i24, Integer.valueOf(i20));
            }
            this.f29161x = (ceil * kzVar.d) + this.f29161x;
        } else {
            boolean isEmpty = this.I.isEmpty();
            ArrayList arrayList3 = this.K;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i25 = this.f29161x;
            this.f29161x = i25 + 1;
            sparseArray2.put(i25, "search");
            if (size > 0) {
                int i26 = this.f29161x;
                this.f29161x = i26 + 1;
                this.P = i26;
                sparseArray2.put(i26, "packs");
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (!isEmpty) {
                int i27 = this.f29161x;
                this.f29161x = i27 + 1;
                sparseArray2.put(i27, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                int i28 = i10 + 1;
                int size3 = this.I.size();
                int i29 = 0;
                int i30 = 0;
                while (i29 < size3) {
                    int i31 = i14;
                    ArrayList arrayList4 = (ArrayList) this.I.get(i29);
                    boolean z13 = isEmpty;
                    String str3 = (String) this.H.get(arrayList4);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.f29161x + i30, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z14 = z10;
                    int i32 = 0;
                    while (i32 < size4) {
                        int i33 = size4;
                        int i34 = this.f29161x + i30;
                        int i35 = size;
                        int i36 = (i30 / kzVar.d) + i28;
                        ArrayList arrayList5 = arrayList4;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList4.get(i32);
                        sparseArray2.put(i34, document2);
                        String str4 = str;
                        int i37 = i28;
                        TLRPC.TL_messages_stickerSet stickerSetById2 = MediaDataController.getInstance(i31).getStickerSetById(MediaDataController.getStickerSetId(document2));
                        if (stickerSetById2 != null) {
                            sparseArray4.put(i34, stickerSetById2);
                        }
                        sparseIntArray.put(i34, i36);
                        i30++;
                        i32++;
                        size4 = i33;
                        size = i35;
                        arrayList4 = arrayList5;
                        i28 = i37;
                        str = str4;
                    }
                    i29++;
                    i14 = i31;
                    isEmpty = z13;
                    z10 = z14;
                }
                i11 = i14;
                z11 = isEmpty;
                z12 = z10;
                i12 = size;
                int i38 = i28;
                int ceil2 = (int) Math.ceil(i30 / kzVar.d);
                for (int i39 = 0; i39 < ceil2; i39++) {
                    sparseArray.put(i38 + i39, Integer.valueOf(i30));
                }
                this.f29161x = (kzVar.d * ceil2) + this.f29161x;
                i10 = i38 + ceil2;
            } else {
                i11 = i14;
                z11 = isEmpty;
                z12 = z10;
                i12 = size;
            }
            if (z12) {
                int i40 = this.f29161x;
                this.f29161x = i40 + 1;
                sparseArray2.put(i40, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i41 = i10 + 1;
                String str5 = (String) this.H.get(this.K);
                if (str5 != null) {
                    sparseArray3.put(this.f29161x, str5);
                }
                int size5 = this.K.size();
                int i42 = 0;
                for (int i43 = 0; i43 < size5; i43++) {
                    int i44 = this.f29161x + i42;
                    int i45 = (i42 / kzVar.d) + i41;
                    TLRPC.Document document3 = (TLRPC.Document) this.K.get(i43);
                    sparseArray2.put(i44, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(i11).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        sparseArray4.put(i44, stickerSetById3);
                    }
                    sparseIntArray.put(i44, i45);
                    i42++;
                }
                int ceil3 = (int) Math.ceil(i42 / kzVar.d);
                for (int i46 = 0; i46 < ceil3; i46++) {
                    sparseArray.put(i41 + i46, Integer.valueOf(i42));
                }
                this.f29161x = (ceil3 * kzVar.d) + this.f29161x;
            }
            if (z11 && !z12 && i12 == 0) {
                this.f29161x = 1;
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        int indexOfIgnoreCase;
        tz tzVar = this.Q;
        LongSparseArray longSparseArray = tzVar.f30797z1;
        LongSparseArray longSparseArray2 = tzVar.f30794y1;
        int i12 = b1Var.f45920f;
        View view = b1Var.f45917a;
        SparseArray sparseArray = this.f29158r;
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
                        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view;
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f20303id) >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f20303id) < 0) {
                            c10 = 0;
                        }
                        if (z10 || c10 != 0) {
                            if (z10 && r3Var.f22942r) {
                                longSparseArray2.remove(stickerSetCovered.set.f20303id);
                                z10 = false;
                            } else if (c10 != 0 && !r3Var.f22942r) {
                                longSparseArray.remove(stickerSetCovered.set.f20303id);
                            }
                        }
                        r3Var.b(z10, false);
                        if (TextUtils.isEmpty(this.N)) {
                            indexOfIgnoreCase = -1;
                        } else {
                            indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.N);
                        }
                        int i14 = indexOfIgnoreCase;
                        if (i14 >= 0) {
                            r3Var.c(stickerSetCovered, false, false, i14, this.N.length(), false);
                            return;
                        }
                        r3Var.c(stickerSetCovered, false, false, 0, 0, false);
                        if (!TextUtils.isEmpty(this.N) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.N) == 0) {
                            String str = stickerSetCovered.set.short_name;
                            int length = this.N.length();
                            r3Var.F = str;
                            r3Var.G = length;
                            r3Var.f();
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
                            n8Var.b(0, stickerSet.title);
                        }
                        n8Var.d(this.N.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num2 = (Integer) this.G.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num2 != null) {
                        String str2 = stickerSet2.title;
                        int intValue = num2.intValue();
                        if (!TextUtils.isEmpty(this.N)) {
                            i11 = this.N.length();
                        } else {
                            i11 = 0;
                        }
                        n8Var.c(str2, 0, null, intValue, i11);
                    }
                    n8Var.d(0, null);
                    return;
                } else if (obj instanceof String) {
                    n8Var.b(0, (String) obj);
                    n8Var.d(0, null);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
            if (i10 == this.f29161x) {
                int i15 = this.v.get(i10 - 1, Integer.MIN_VALUE);
                if (i15 == Integer.MIN_VALUE) {
                    k3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f29157n.get(i15);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj2).documents.size());
                } else if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                }
                if (num == null) {
                    k3Var.setHeight(1);
                    return;
                } else if (num.intValue() == 0) {
                    k3Var.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int B = org.telegram.messenger.mk.B(82.0f, (int) Math.ceil(num.intValue() / tzVar.f30793y0.d), tzVar.h.getHeight());
                    if (B > 0) {
                        i13 = B;
                    }
                    k3Var.setHeight(i13);
                    return;
                }
            }
            k3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
        e8Var.d(document, null, this.f29159s.get(i10), (String) this.f29160w.get(i10), false, false);
        if (!tzVar.f30745j1.contains(document) && !tzVar.f30748k1.contains(document)) {
            z11 = false;
        }
        e8Var.setRecent(z11);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View d2Var;
        ViewGroup xVar;
        Context context = this.h;
        tz tzVar = this.Q;
        switch (i10) {
            case 0:
                d2Var = new hg.d2(2, context, tzVar.Z1, true);
                break;
            case 1:
                d2Var = new org.telegram.ui.Cells.k3(context);
                break;
            case 2:
                d2Var = new org.telegram.ui.Cells.n8(this.h, false, false, tzVar.Z1, tzVar.f30743i2);
                break;
            case 3:
                org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(17, this.h, tzVar.Z1, false, true);
                r3Var.setAddOnClickListener(new f0(this, 14));
                d2Var = r3Var;
                break;
            case 4:
                d2Var = new View(context);
                d2Var.setLayoutParams(new s4.o0(-1, tzVar.f30719b1));
                break;
            case 5:
                xVar = new ah.x(this, context, 17);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i11 = org.telegram.ui.ActionBar.h6.Le;
                imageView.setColorFilter(new PorterDuffColorFilter(tzVar.A(i11), PorterDuff.Mode.MULTIPLY));
                imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                xVar.addView(imageView, w7.z5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                org.telegram.messenger.mk.j(16.0f, R.string.NoStickersFound, 1, textView);
                textView.setTextColor(tzVar.A(i11));
                xVar.addView(textView, w7.z5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                xVar.setLayoutParams(new s4.o0(-1, -2));
                d2Var = xVar;
                break;
            case 6:
            default:
                d2Var = null;
                break;
            case 7:
                ViewGroup.LayoutParams o0Var = new s4.o0(-1, AndroidUtilities.dp(79.0f));
                xVar = this.f29155c;
                xVar.setLayoutParams(o0Var);
                d2Var = xVar;
                break;
            case 8:
                d2Var = new View(tzVar.getContext());
                d2Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(68.0f)));
                break;
        }
        return new s4.b1(d2Var);
    }
}
