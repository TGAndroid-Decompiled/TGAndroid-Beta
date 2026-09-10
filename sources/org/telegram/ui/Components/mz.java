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
public final class mz extends ul0 {
    public int L;
    public int M;
    public String N;
    public final rz Q;
    public final lz f25318c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f25319f;
    public final Context h;
    public int f25324x;
    public boolean f25325y;
    public final SparseArray f25320n = new SparseArray();
    public final SparseArray f25321r = new SparseArray();
    public final SparseArray f25322s = new SparseArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseArray f25323w = new SparseArray();
    public ArrayList E = new ArrayList();
    public HashMap F = new HashMap();
    public HashMap G = new HashMap();
    public HashMap H = new HashMap();
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public final kz O = new kz(this);
    public int P = -1;

    public mz(rz rzVar, Context context) {
        this.Q = rzVar;
        this.h = context;
        ?? aVar = new mh.a(context, rzVar.f26805c1, new e(this, 12), new pv(this, 3), rzVar.Z1);
        this.f25318c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.Y2.f24250r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.c2(this, 3));
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.f25324x;
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
        if (i10 == 1 && this.f25324x == 1) {
            return 5;
        }
        Object obj = this.f25321r.get(i10);
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
        rz rzVar = this.Q;
        int i14 = rzVar.f26805c1;
        iz izVar = rzVar.f26875y0;
        this.P = -1;
        SparseArray sparseArray = this.f25320n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f25321r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f25323w;
        sparseArray3.clear();
        this.f25324x = 0;
        int size = this.G.size() + this.E.size();
        this.f25318c.Y2.N(false);
        long j3 = this.d;
        String str = "";
        SparseArray sparseArray4 = this.f25322s;
        if (j3 != 0) {
            ArrayList arrayList = this.f25319f;
            int i15 = this.f25324x;
            this.f25324x = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.f25324x;
                this.f25324x = i16 + 1;
                this.P = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.f25324x;
                this.f25324x = i17 + 1;
                sparseArray2.put(i17, LocaleController.formatPluralString("Stickers", this.e.count, new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.H.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f25324x, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.f25324x + i19;
                int i21 = (i19 / izVar.d) + i13;
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
            int ceil = (int) Math.ceil(i19 / izVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i13 + i23, Integer.valueOf(i19));
            }
            this.f25324x = (ceil * izVar.d) + this.f25324x;
        } else {
            boolean isEmpty = this.I.isEmpty();
            ArrayList arrayList2 = this.K;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i24 = this.f25324x;
            this.f25324x = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.f25324x;
                this.f25324x = i25 + 1;
                this.P = i25;
                sparseArray2.put(i25, "packs");
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (!isEmpty) {
                int i26 = this.f25324x;
                this.f25324x = i26 + 1;
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
                        sparseArray3.put(this.f25324x + i29, str3);
                        str = str3;
                    }
                    int size4 = arrayList3.size();
                    boolean z14 = z10;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.f25324x + i29;
                        String str4 = str;
                        int i34 = (i29 / izVar.d) + i27;
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
                int ceil2 = (int) Math.ceil(i29 / izVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i29));
                }
                this.f25324x = (izVar.d * ceil2) + this.f25324x;
                i10 = i37 + ceil2;
            } else {
                i11 = i14;
                z11 = isEmpty;
                z12 = z10;
                i12 = size;
            }
            if (z12) {
                int i39 = this.f25324x;
                this.f25324x = i39 + 1;
                sparseArray2.put(i39, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i40 = i10 + 1;
                String str5 = (String) this.H.get(this.K);
                if (str5 != null) {
                    sparseArray3.put(this.f25324x, str5);
                }
                int size5 = this.K.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.f25324x + i41;
                    int i44 = (i41 / izVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.K.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(i11).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        sparseArray4.put(i43, stickerSetById3);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / izVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.f25324x = (ceil3 * izVar.d) + this.f25324x;
            }
            if (z11 && !z12 && i12 == 0) {
                this.f25324x = 1;
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        int indexOfIgnoreCase;
        rz rzVar = this.Q;
        LongSparseArray longSparseArray = rzVar.f26879z1;
        LongSparseArray longSparseArray2 = rzVar.f26876y1;
        int i12 = c1Var.f41613f;
        View view = c1Var.f41610a;
        SparseArray sparseArray = this.f25321r;
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
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f17222id) >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f17222id) < 0) {
                            c10 = 0;
                        }
                        if (z10 || c10 != 0) {
                            if (z10 && r3Var.f19889r) {
                                longSparseArray2.remove(stickerSetCovered.set.f17222id);
                                z10 = false;
                            } else if (c10 != 0 && !r3Var.f19889r) {
                                longSparseArray.remove(stickerSetCovered.set.f17222id);
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
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.N) && this.F.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            p8Var.b(0, stickerSet.title);
                        }
                        p8Var.d(this.N.length(), tL_messages_stickerSet.set.short_name);
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
                        p8Var.c(str2, 0, null, intValue, i11);
                    }
                    p8Var.d(0, null);
                    return;
                } else if (obj instanceof String) {
                    p8Var.b(0, (String) obj);
                    p8Var.d(0, null);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
            if (i10 == this.f25324x) {
                int i14 = this.v.get(i10 - 1, Integer.MIN_VALUE);
                if (i14 == Integer.MIN_VALUE) {
                    k3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f25320n.get(i14);
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
                    int A = org.telegram.messenger.em.A(82.0f, (int) Math.ceil(num.intValue() / rzVar.f26875y0.d), rzVar.h.getHeight());
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
        org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
        g8Var.d(document, null, this.f25322s.get(i10), (String) this.f25323w.get(i10), false, false);
        if (!rzVar.f26827j1.contains(document) && !rzVar.f26830k1.contains(document)) {
            z11 = false;
        }
        g8Var.setRecent(z11);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View g2Var;
        ViewGroup ldVar;
        Context context = this.h;
        rz rzVar = this.Q;
        switch (i10) {
            case 0:
                g2Var = new fg.g2(2, context, rzVar.Z1, true);
                break;
            case 1:
                g2Var = new org.telegram.ui.Cells.k3(context);
                break;
            case 2:
                g2Var = new org.telegram.ui.Cells.p8(this.h, false, false, rzVar.Z1, rzVar.f26825i2);
                break;
            case 3:
                org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(17, this.h, rzVar.Z1, false, true);
                r3Var.setAddOnClickListener(new h0(this, 15));
                g2Var = r3Var;
                break;
            case 4:
                g2Var = new View(context);
                g2Var.setLayoutParams(new s4.p0(-1, rzVar.f26801b1));
                break;
            case 5:
                ldVar = new bi.ld(this, context, 12);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i11 = org.telegram.ui.ActionBar.j6.Le;
                imageView.setColorFilter(new PorterDuffColorFilter(rzVar.z(i11), PorterDuff.Mode.MULTIPLY));
                imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                ldVar.addView(imageView, w7.a6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(rzVar.z(i11));
                ldVar.addView(textView, w7.a6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                ldVar.setLayoutParams(new s4.p0(-1, -2));
                g2Var = ldVar;
                break;
            case 6:
            default:
                g2Var = null;
                break;
            case 7:
                ViewGroup.LayoutParams p0Var = new s4.p0(-1, AndroidUtilities.dp(79.0f));
                ldVar = this.f25318c;
                ldVar.setLayoutParams(p0Var);
                g2Var = ldVar;
                break;
            case 8:
                g2Var = new View(rzVar.getContext());
                g2Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(68.0f)));
                break;
        }
        return new s4.c1(g2Var);
    }
}
