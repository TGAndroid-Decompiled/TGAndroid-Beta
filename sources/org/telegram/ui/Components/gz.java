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
public final class gz extends vl0 {
    public int L;
    public int M;
    public String N;
    public final lz Q;
    public final fz f24570c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f24571f;
    public final Context h;
    public int f24576x;
    public boolean f24577y;
    public final SparseArray f24572n = new SparseArray();
    public final SparseArray f24573r = new SparseArray();
    public final SparseArray f24574s = new SparseArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseArray f24575w = new SparseArray();
    public ArrayList E = new ArrayList();
    public HashMap F = new HashMap();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public final ez O = new ez(this);
    public int P = -1;

    public gz(lz lzVar, Context context) {
        this.Q = lzVar;
        this.h = context;
        ?? aVar = new nh.a(context, lzVar.f26237c1, new d(this, 12), new mv(this, 3), lzVar.Z1);
        this.f24570c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.Y2.f25291r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.c2(this, 3));
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42964f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.f24576x;
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
        if (i10 == 1 && this.f24576x == 1) {
            return 5;
        }
        Object obj = this.f24573r.get(i10);
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
        lz lzVar = this.Q;
        int i14 = lzVar.f26237c1;
        cz czVar = lzVar.f26307y0;
        this.P = -1;
        SparseArray sparseArray = this.f24572n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f24573r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f24575w;
        sparseArray3.clear();
        this.f24576x = 0;
        int size = this.G.size() + this.E.size();
        this.f24570c.Y2.N(false);
        long j3 = this.d;
        String str = "";
        SparseArray sparseArray4 = this.f24574s;
        if (j3 != 0) {
            ArrayList arrayList = this.f24571f;
            int i15 = this.f24576x;
            this.f24576x = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.f24576x;
                this.f24576x = i16 + 1;
                this.P = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.f24576x;
                this.f24576x = i17 + 1;
                sparseArray2.put(i17, LocaleController.formatPluralString("Stickers", this.e.count, new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.H.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f24576x, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.f24576x + i19;
                int i21 = (i19 / czVar.d) + i13;
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
            int ceil = (int) Math.ceil(i19 / czVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i13 + i23, Integer.valueOf(i19));
            }
            this.f24576x = (ceil * czVar.d) + this.f24576x;
        } else {
            boolean isEmpty = this.I.isEmpty();
            ArrayList arrayList2 = this.K;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i24 = this.f24576x;
            this.f24576x = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.f24576x;
                this.f24576x = i25 + 1;
                this.P = i25;
                sparseArray2.put(i25, "packs");
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (!isEmpty) {
                int i26 = this.f24576x;
                this.f24576x = i26 + 1;
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
                        sparseArray3.put(this.f24576x + i29, str3);
                        str = str3;
                    }
                    int size4 = arrayList3.size();
                    boolean z14 = z10;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.f24576x + i29;
                        String str4 = str;
                        int i34 = (i29 / czVar.d) + i27;
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
                int ceil2 = (int) Math.ceil(i29 / czVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i29));
                }
                this.f24576x = (czVar.d * ceil2) + this.f24576x;
                i10 = i37 + ceil2;
            } else {
                i11 = i14;
                z11 = isEmpty;
                z12 = z10;
                i12 = size;
            }
            if (z12) {
                int i39 = this.f24576x;
                this.f24576x = i39 + 1;
                sparseArray2.put(i39, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i40 = i10 + 1;
                String str5 = (String) this.H.get(this.K);
                if (str5 != null) {
                    sparseArray3.put(this.f24576x, str5);
                }
                int size5 = this.K.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.f24576x + i41;
                    int i44 = (i41 / czVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.K.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(i11).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        sparseArray4.put(i43, stickerSetById3);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / czVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.f24576x = (ceil3 * czVar.d) + this.f24576x;
            }
            if (z11 && !z12 && i12 == 0) {
                this.f24576x = 1;
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        int indexOfIgnoreCase;
        lz lzVar = this.Q;
        LongSparseArray longSparseArray = lzVar.f26311z1;
        LongSparseArray longSparseArray2 = lzVar.f26308y1;
        int i12 = c1Var.f42964f;
        View view = c1Var.f42961a;
        SparseArray sparseArray = this.f24573r;
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
                        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f18363id) >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f18363id) < 0) {
                            c10 = 0;
                        }
                        if (z10 || c10 != 0) {
                            if (z10 && s3Var.f21058r) {
                                longSparseArray2.remove(stickerSetCovered.set.f18363id);
                                z10 = false;
                            } else if (c10 != 0 && !s3Var.f21058r) {
                                longSparseArray.remove(stickerSetCovered.set.f18363id);
                            }
                        }
                        s3Var.b(z10, false);
                        if (TextUtils.isEmpty(this.N)) {
                            indexOfIgnoreCase = -1;
                        } else {
                            indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.N);
                        }
                        if (indexOfIgnoreCase >= 0) {
                            s3Var.c(stickerSetCovered, false, false, indexOfIgnoreCase, this.N.length(), false);
                            return;
                        }
                        s3Var.c(stickerSetCovered, false, false, 0, 0, false);
                        if (!TextUtils.isEmpty(this.N) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.N) == 0) {
                            String str = stickerSetCovered.set.short_name;
                            int length = this.N.length();
                            s3Var.F = str;
                            s3Var.G = length;
                            s3Var.f();
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
            org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) view;
            if (i10 == this.f24576x) {
                int i14 = this.v.get(i10 - 1, Integer.MIN_VALUE);
                if (i14 == Integer.MIN_VALUE) {
                    l3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f24572n.get(i14);
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
                    int B = org.telegram.messenger.ok.B(82.0f, (int) Math.ceil(num.intValue() / lzVar.f26307y0.d), lzVar.h.getHeight());
                    if (B > 0) {
                        i13 = B;
                    }
                    l3Var.setHeight(i13);
                    return;
                }
            }
            l3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
        f8Var.d(document, null, this.f24574s.get(i10), (String) this.f24575w.get(i10), false, false);
        if (!lzVar.f26259j1.contains(document) && !lzVar.f26262k1.contains(document)) {
            z11 = false;
        }
        f8Var.setRecent(z11);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View f2Var;
        ViewGroup f0Var;
        Context context = this.h;
        lz lzVar = this.Q;
        switch (i10) {
            case 0:
                f2Var = new gg.f2(2, context, lzVar.Z1, true);
                break;
            case 1:
                f2Var = new org.telegram.ui.Cells.l3(context);
                break;
            case 2:
                f2Var = new org.telegram.ui.Cells.o8(this.h, false, false, lzVar.Z1, lzVar.f26257i2);
                break;
            case 3:
                org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(17, this.h, lzVar.Z1, false, true);
                s3Var.setAddOnClickListener(new f0(this, 15));
                f2Var = s3Var;
                break;
            case 4:
                f2Var = new View(context);
                f2Var.setLayoutParams(new s4.p0(-1, lzVar.f26233b1));
                break;
            case 5:
                f0Var = new ai.f0(this, context, 14);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i11 = org.telegram.ui.ActionBar.h6.Le;
                imageView.setColorFilter(new PorterDuffColorFilter(lzVar.z(i11), PorterDuff.Mode.MULTIPLY));
                imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                f0Var.addView(imageView, w7.y5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(lzVar.z(i11));
                f0Var.addView(textView, w7.y5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                f0Var.setLayoutParams(new s4.p0(-1, -2));
                f2Var = f0Var;
                break;
            case 6:
            default:
                f2Var = null;
                break;
            case 7:
                ViewGroup.LayoutParams p0Var = new s4.p0(-1, AndroidUtilities.dp(79.0f));
                f0Var = this.f24570c;
                f0Var.setLayoutParams(p0Var);
                f2Var = f0Var;
                break;
            case 8:
                f2Var = new View(lzVar.getContext());
                f2Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(68.0f)));
                break;
        }
        return new s4.c1(f2Var);
    }
}
