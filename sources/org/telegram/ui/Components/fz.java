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
public final class fz extends kl0 {
    public int L;
    public int M;
    public String N;
    public final kz Q;
    public final ez f26202c;
    public long d;
    public TLRPC.StickerSet f26203e;
    public ArrayList f26204f;
    public final Context h;
    public int f26209x;
    public boolean f26210y;
    public final SparseArray f26205n = new SparseArray();
    public final SparseArray f26206r = new SparseArray();
    public final SparseArray f26207s = new SparseArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseArray f26208w = new SparseArray();
    public ArrayList E = new ArrayList();
    public HashMap F = new HashMap();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public final dz O = new dz(this);
    public int P = -1;

    public fz(kz kzVar, Context context) {
        this.Q = kzVar;
        this.h = context;
        ?? aVar = new oh.a(context, kzVar.f27932c1, new d(this, 12), new kv(this, 3), kzVar.Z1);
        this.f26202c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.Y2.f31135r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.c2(this, 3));
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.f26209x;
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
        if (i10 == 1 && this.f26209x == 1) {
            return 5;
        }
        Object obj = this.f26206r.get(i10);
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
        kz kzVar = this.Q;
        int i14 = kzVar.f27932c1;
        bz bzVar = kzVar.f28003y0;
        this.P = -1;
        SparseArray sparseArray = this.f26205n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f26206r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f26208w;
        sparseArray3.clear();
        this.f26209x = 0;
        int size = this.G.size() + this.E.size();
        this.f26202c.Y2.N(false);
        long j3 = this.d;
        String str = "";
        SparseArray sparseArray4 = this.f26207s;
        if (j3 != 0) {
            ArrayList arrayList = this.f26204f;
            int i15 = this.f26209x;
            this.f26209x = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.f26209x;
                this.f26209x = i16 + 1;
                this.P = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.f26209x;
                this.f26209x = i17 + 1;
                sparseArray2.put(i17, LocaleController.formatPluralString("Stickers", this.f26203e.count, new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.H.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f26209x, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.f26209x + i19;
                int i21 = (i19 / bzVar.d) + i13;
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i18);
                sparseArray2.put(i20, document);
                SparseArray sparseArray5 = sparseArray2;
                int i22 = size2;
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i14).getStickerSetById(MediaDataController.getStickerSetId(document));
                if (stickerSetById != null) {
                    sparseArray4.put(i20, stickerSetById);
                }
                sparseIntArray.put(i20, i21);
                i19++;
                i18++;
                size2 = i22;
                sparseArray2 = sparseArray5;
            }
            int ceil = (int) Math.ceil(i19 / bzVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i13 + i23, Integer.valueOf(i19));
            }
            this.f26209x = (ceil * bzVar.d) + this.f26209x;
        } else {
            boolean isEmpty = this.I.isEmpty();
            ArrayList arrayList2 = this.K;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i24 = this.f26209x;
            this.f26209x = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.f26209x;
                this.f26209x = i25 + 1;
                this.P = i25;
                sparseArray2.put(i25, "packs");
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (!isEmpty) {
                int i26 = this.f26209x;
                this.f26209x = i26 + 1;
                sparseArray2.put(i26, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                int i27 = i10 + 1;
                int size3 = this.I.size();
                int i28 = 0;
                int i29 = 0;
                while (i28 < size3) {
                    int i30 = i14;
                    ArrayList arrayList3 = (ArrayList) this.I.get(i28);
                    boolean z13 = isEmpty;
                    String str3 = (String) this.H.get(arrayList3);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.f26209x + i29, str3);
                        str = str3;
                    }
                    int size4 = arrayList3.size();
                    boolean z14 = z10;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.f26209x + i29;
                        String str4 = str;
                        int i34 = (i29 / bzVar.d) + i27;
                        ArrayList arrayList4 = arrayList3;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i31);
                        sparseArray2.put(i33, document2);
                        int i35 = size;
                        int i36 = i27;
                        TLRPC.TL_messages_stickerSet stickerSetById2 = MediaDataController.getInstance(i30).getStickerSetById(MediaDataController.getStickerSetId(document2));
                        if (stickerSetById2 != null) {
                            sparseArray4.put(i33, stickerSetById2);
                        }
                        sparseIntArray.put(i33, i34);
                        i29++;
                        i31++;
                        size4 = i32;
                        str = str4;
                        arrayList3 = arrayList4;
                        size = i35;
                        i27 = i36;
                    }
                    i28++;
                    i14 = i30;
                    isEmpty = z13;
                    z10 = z14;
                }
                i11 = i14;
                z11 = isEmpty;
                z12 = z10;
                i12 = size;
                int i37 = i27;
                int ceil2 = (int) Math.ceil(i29 / bzVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i29));
                }
                this.f26209x = (bzVar.d * ceil2) + this.f26209x;
                i10 = i37 + ceil2;
            } else {
                i11 = i14;
                z11 = isEmpty;
                z12 = z10;
                i12 = size;
            }
            if (z12) {
                int i39 = this.f26209x;
                this.f26209x = i39 + 1;
                sparseArray2.put(i39, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i40 = i10 + 1;
                String str5 = (String) this.H.get(this.K);
                if (str5 != null) {
                    sparseArray3.put(this.f26209x, str5);
                }
                int size5 = this.K.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.f26209x + i41;
                    int i44 = (i41 / bzVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.K.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(i11).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        sparseArray4.put(i43, stickerSetById3);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / bzVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.f26209x = (ceil3 * bzVar.d) + this.f26209x;
            }
            if (z11 && !z12 && i12 == 0) {
                this.f26209x = 1;
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        int indexOfIgnoreCase;
        kz kzVar = this.Q;
        LongSparseArray longSparseArray = kzVar.f28007z1;
        LongSparseArray longSparseArray2 = kzVar.f28004y1;
        int i12 = c1Var.f45742f;
        View view = c1Var.f45738a;
        SparseArray sparseArray = this.f26206r;
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
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f19896id) >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f19896id) < 0) {
                            c10 = 0;
                        }
                        if (z10 || c10 != 0) {
                            if (z10 && r3Var.f22671r) {
                                longSparseArray2.remove(stickerSetCovered.set.f19896id);
                                z10 = false;
                            } else if (c10 != 0 && !r3Var.f22671r) {
                                longSparseArray.remove(stickerSetCovered.set.f19896id);
                            }
                        }
                        r3Var.b(z10, false);
                        if (TextUtils.isEmpty(this.N)) {
                            indexOfIgnoreCase = -1;
                        } else {
                            indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.N);
                        }
                        if (indexOfIgnoreCase >= 0) {
                            r3Var.c(stickerSetCovered, false, false, indexOfIgnoreCase, this.N.length(), false);
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
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.N) && this.F.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            o8Var.b(0, stickerSet.title);
                        }
                        o8Var.d(this.N.length(), tL_messages_stickerSet.set.short_name);
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
                        o8Var.c(str2, 0, null, intValue, i11);
                    }
                    o8Var.d(0, null);
                    return;
                } else if (obj instanceof String) {
                    o8Var.b(0, (String) obj);
                    o8Var.d(0, null);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
            if (i10 == this.f26209x) {
                int i14 = this.v.get(i10 - 1, Integer.MIN_VALUE);
                if (i14 == Integer.MIN_VALUE) {
                    k3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f26205n.get(i14);
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
                    int A = org.telegram.messenger.vl.A(82.0f, (int) Math.ceil(num.intValue() / kzVar.f28003y0.d), kzVar.h.getHeight());
                    if (A > 0) {
                        i13 = A;
                    }
                    k3Var.setHeight(i13);
                    return;
                }
            }
            k3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
        f8Var.d(document, null, this.f26207s.get(i10), (String) this.f26208w.get(i10), false, false);
        if (!kzVar.f27955j1.contains(document) && !kzVar.f27958k1.contains(document)) {
            z11 = false;
        }
        f8Var.setRecent(z11);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View e2Var;
        ViewGroup yVar;
        Context context = this.h;
        kz kzVar = this.Q;
        switch (i10) {
            case 0:
                e2Var = new hg.e2(2, context, kzVar.Z1, true);
                break;
            case 1:
                e2Var = new org.telegram.ui.Cells.k3(context);
                break;
            case 2:
                e2Var = new org.telegram.ui.Cells.o8(this.h, false, false, kzVar.Z1, kzVar.f27953i2);
                break;
            case 3:
                org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(17, this.h, kzVar.Z1, false, true);
                r3Var.setAddOnClickListener(new g0(this, 15));
                e2Var = r3Var;
                break;
            case 4:
                e2Var = new View(context);
                e2Var.setLayoutParams(new s4.p0(-1, kzVar.f27928b1));
                break;
            case 5:
                yVar = new ah.y(this, context, 15);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i11 = org.telegram.ui.ActionBar.j6.Le;
                imageView.setColorFilter(new PorterDuffColorFilter(kzVar.A(i11), PorterDuff.Mode.MULTIPLY));
                imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                yVar.addView(imageView, w7.x5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(kzVar.A(i11));
                yVar.addView(textView, w7.x5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                yVar.setLayoutParams(new s4.p0(-1, -2));
                e2Var = yVar;
                break;
            case 6:
            default:
                e2Var = null;
                break;
            case 7:
                ViewGroup.LayoutParams p0Var = new s4.p0(-1, AndroidUtilities.dp(79.0f));
                yVar = this.f26202c;
                yVar.setLayoutParams(p0Var);
                e2Var = yVar;
                break;
            case 8:
                e2Var = new View(kzVar.getContext());
                e2Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(68.0f)));
                break;
        }
        return new s4.c1(e2Var);
    }
}
