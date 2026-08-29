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
public final class az extends il0 {
    public int H;
    public int I;
    public String J;
    public final fz M;
    public final zy f26913c;
    public long d;
    public TLRPC.StickerSet f26914e;
    public ArrayList f26915f;
    public final Context h;
    public int f26920x;
    public boolean f26921y;
    public final SparseArray f26916n = new SparseArray();
    public final SparseArray f26917r = new SparseArray();
    public final SparseArray f26918s = new SparseArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseArray f26919w = new SparseArray();
    public ArrayList A = new ArrayList();
    public HashMap B = new HashMap();
    public HashMap C = new HashMap();
    public HashMap D = new HashMap();
    public ArrayList E = new ArrayList();
    public ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public final yy K = new yy(this);
    public int L = -1;

    public az(fz fzVar, Context context) {
        this.M = fzVar;
        this.h = context;
        ?? aVar = new yg.a(context, fzVar.Y0, new d(this, 12), new cv(this, 3), fzVar.V1);
        this.f26913c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.U2.f29939r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.d2(this, 3));
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.f26920x;
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
        if (i10 == this.L) {
            return 7;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1 && this.f26920x == 1) {
            return 5;
        }
        Object obj = this.f26917r.get(i10);
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
        fz fzVar = this.M;
        int i14 = fzVar.Y0;
        wy wyVar = fzVar.f28639u0;
        this.L = -1;
        SparseArray sparseArray = this.f26916n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f26917r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f26919w;
        sparseArray3.clear();
        this.f26920x = 0;
        int size = this.C.size() + this.A.size();
        this.f26913c.U2.N(false);
        long j10 = this.d;
        String str = "";
        SparseArray sparseArray4 = this.f26918s;
        if (j10 != 0) {
            ArrayList arrayList = this.f26915f;
            int i15 = this.f26920x;
            this.f26920x = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.f26920x;
                this.f26920x = i16 + 1;
                this.L = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.f26920x;
                this.f26920x = i17 + 1;
                sparseArray2.put(i17, LocaleController.formatPluralString("Stickers", this.f26914e.count, new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.D.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f26920x, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.f26920x + i19;
                int i21 = (i19 / wyVar.d) + i13;
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
            int ceil = (int) Math.ceil(i19 / wyVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i13 + i23, Integer.valueOf(i19));
            }
            this.f26920x = (ceil * wyVar.d) + this.f26920x;
        } else {
            boolean isEmpty = this.E.isEmpty();
            ArrayList arrayList2 = this.G;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i24 = this.f26920x;
            this.f26920x = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.f26920x;
                this.f26920x = i25 + 1;
                this.L = i25;
                sparseArray2.put(i25, "packs");
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (!isEmpty) {
                int i26 = this.f26920x;
                this.f26920x = i26 + 1;
                sparseArray2.put(i26, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                int i27 = i10 + 1;
                int size3 = this.E.size();
                int i28 = 0;
                int i29 = 0;
                while (i28 < size3) {
                    int i30 = i14;
                    ArrayList arrayList3 = (ArrayList) this.E.get(i28);
                    boolean z13 = isEmpty;
                    String str3 = (String) this.D.get(arrayList3);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.f26920x + i29, str3);
                        str = str3;
                    }
                    int size4 = arrayList3.size();
                    boolean z14 = z10;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.f26920x + i29;
                        String str4 = str;
                        int i34 = (i29 / wyVar.d) + i27;
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
                int ceil2 = (int) Math.ceil(i29 / wyVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i29));
                }
                this.f26920x = (wyVar.d * ceil2) + this.f26920x;
                i10 = i37 + ceil2;
            } else {
                i11 = i14;
                z11 = isEmpty;
                z12 = z10;
                i12 = size;
            }
            if (z12) {
                int i39 = this.f26920x;
                this.f26920x = i39 + 1;
                sparseArray2.put(i39, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i40 = i10 + 1;
                String str5 = (String) this.D.get(this.G);
                if (str5 != null) {
                    sparseArray3.put(this.f26920x, str5);
                }
                int size5 = this.G.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.f26920x + i41;
                    int i44 = (i41 / wyVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.G.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(i11).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        sparseArray4.put(i43, stickerSetById3);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / wyVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.f26920x = (ceil3 * wyVar.d) + this.f26920x;
            }
            if (z11 && !z12 && i12 == 0) {
                this.f26920x = 1;
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        boolean z10;
        int indexOfIgnoreCase;
        fz fzVar = this.M;
        LongSparseArray longSparseArray = fzVar.f28643v1;
        LongSparseArray longSparseArray2 = fzVar.f28640u1;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        SparseArray sparseArray = this.f26917r;
        boolean z11 = true;
        char c3 = 1;
        int i13 = 1;
        z11 = true;
        if (i12 != 0) {
            Integer num = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i10);
                        org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view;
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f22419id) >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f22419id) < 0) {
                            c3 = 0;
                        }
                        if (z10 || c3 != 0) {
                            if (z10 && p3Var.f24966r) {
                                longSparseArray2.remove(stickerSetCovered.set.f22419id);
                                z10 = false;
                            } else if (c3 != 0 && !p3Var.f24966r) {
                                longSparseArray.remove(stickerSetCovered.set.f22419id);
                            }
                        }
                        p3Var.b(z10, false);
                        if (TextUtils.isEmpty(this.J)) {
                            indexOfIgnoreCase = -1;
                        } else {
                            indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.J);
                        }
                        if (indexOfIgnoreCase >= 0) {
                            p3Var.c(stickerSetCovered, false, false, indexOfIgnoreCase, this.J.length(), false);
                            return;
                        }
                        p3Var.c(stickerSetCovered, false, false, 0, 0, false);
                        if (!TextUtils.isEmpty(this.J) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.J) == 0) {
                            String str = stickerSetCovered.set.short_name;
                            int length = this.J.length();
                            p3Var.B = str;
                            p3Var.C = length;
                            p3Var.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.J) && this.B.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            k8Var.b(0, stickerSet.title);
                        }
                        k8Var.d(this.J.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num2 = (Integer) this.C.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num2 != null) {
                        String str2 = stickerSet2.title;
                        int intValue = num2.intValue();
                        if (!TextUtils.isEmpty(this.J)) {
                            i11 = this.J.length();
                        } else {
                            i11 = 0;
                        }
                        k8Var.c(str2, 0, null, intValue, i11);
                    }
                    k8Var.d(0, null);
                    return;
                } else if (obj instanceof String) {
                    k8Var.b(0, (String) obj);
                    k8Var.d(0, null);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) view;
            if (i10 == this.f26920x) {
                int i14 = this.v.get(i10 - 1, Integer.MIN_VALUE);
                if (i14 == Integer.MIN_VALUE) {
                    i3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f26916n.get(i14);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj2).documents.size());
                } else if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                }
                if (num == null) {
                    i3Var.setHeight(1);
                    return;
                } else if (num.intValue() == 0) {
                    i3Var.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int z12 = org.telegram.ui.b.z(82.0f, (int) Math.ceil(num.intValue() / fzVar.f28639u0.d), fzVar.h.getHeight());
                    if (z12 > 0) {
                        i13 = z12;
                    }
                    i3Var.setHeight(i13);
                    return;
                }
            }
            i3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
        b8Var.d(document, null, this.f26918s.get(i10), (String) this.f26919w.get(i10), false, false);
        if (!fzVar.f28594f1.contains(document) && !fzVar.f28597g1.contains(document)) {
            z11 = false;
        }
        b8Var.setRecent(z11);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View vyVar;
        ViewGroup x2Var;
        Context context = this.h;
        fz fzVar = this.M;
        switch (i10) {
            case 0:
                vyVar = new vy(1, context, fzVar.V1, true);
                break;
            case 1:
                vyVar = new org.telegram.ui.Cells.i3(context);
                break;
            case 2:
                vyVar = new org.telegram.ui.Cells.k8(this.h, false, false, fzVar.V1, fzVar.f28591e2);
                break;
            case 3:
                org.telegram.ui.Cells.p3 p3Var = new org.telegram.ui.Cells.p3(17, this.h, fzVar.V1, false, true);
                p3Var.setAddOnClickListener(new h0(this, 15));
                vyVar = p3Var;
                break;
            case 4:
                vyVar = new View(context);
                vyVar.setLayoutParams(new f2.x0(-1, fzVar.X0));
                break;
            case 5:
                x2Var = new bg.x2(this, context, 22);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i11 = org.telegram.ui.ActionBar.g6.Le;
                imageView.setColorFilter(new PorterDuffColorFilter(fzVar.A(i11), PorterDuff.Mode.MULTIPLY));
                imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                x2Var.addView(imageView, i7.f6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(fzVar.A(i11));
                x2Var.addView(textView, i7.f6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                x2Var.setLayoutParams(new f2.x0(-1, -2));
                vyVar = x2Var;
                break;
            case 6:
            default:
                vyVar = null;
                break;
            case 7:
                ViewGroup.LayoutParams x0Var = new f2.x0(-1, AndroidUtilities.dp(79.0f));
                x2Var = this.f26913c;
                x2Var.setLayoutParams(x0Var);
                vyVar = x2Var;
                break;
            case 8:
                vyVar = new View(fzVar.getContext());
                vyVar.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(68.0f)));
                break;
        }
        return new f2.n1(vyVar);
    }
}
