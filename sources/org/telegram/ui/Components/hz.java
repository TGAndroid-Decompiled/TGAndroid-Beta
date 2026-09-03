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
public final class hz extends rl0 {
    public int I;
    public int J;
    public String K;
    public final mz N;
    public final gz f27660c;
    public long d;
    public TLRPC.StickerSet f27661e;
    public ArrayList f27662f;
    public final Context h;
    public int f27667x;
    public boolean f27668y;
    public final SparseArray f27663n = new SparseArray();
    public final SparseArray f27664r = new SparseArray();
    public final SparseArray f27665s = new SparseArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseArray f27666w = new SparseArray();
    public ArrayList B = new ArrayList();
    public HashMap C = new HashMap();
    public HashMap D = new HashMap();
    public HashMap E = new HashMap();
    public ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public ArrayList H = new ArrayList();
    public final fz L = new fz(this);
    public int M = -1;

    public hz(mz mzVar, Context context) {
        this.N = mzVar;
        this.h = context;
        ?? bVar = new bh.b(context, mzVar.Z0, new d(this, 12), new hv(this, 3), mzVar.W1);
        this.f27660c = bVar;
        bVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        bVar.setClipToPadding(false);
        bVar.V2.f32651r = false;
        bVar.setNestedScrollingEnabled(false);
        bVar.setDrawSelection(false);
        bVar.setOnTouchListener(new m.c2(this, 3));
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.f27667x;
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
        if (i10 == this.M) {
            return 7;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1 && this.f27667x == 1) {
            return 5;
        }
        Object obj = this.f27664r.get(i10);
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
        boolean z4;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        mz mzVar = this.N;
        int i14 = mzVar.Z0;
        dz dzVar = mzVar.f29333v0;
        this.M = -1;
        SparseArray sparseArray = this.f27663n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f27664r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f27666w;
        sparseArray3.clear();
        this.f27667x = 0;
        int size = this.D.size() + this.B.size();
        this.f27660c.V2.N(false);
        long j10 = this.d;
        String str = "";
        SparseArray sparseArray4 = this.f27665s;
        if (j10 != 0) {
            ArrayList arrayList = this.f27662f;
            int i15 = this.f27667x;
            this.f27667x = i15 + 1;
            sparseArray2.put(i15, "search");
            if (size > 0) {
                int i16 = this.f27667x;
                this.f27667x = i16 + 1;
                this.M = i16;
                sparseArray2.put(i16, "packs");
                int i17 = this.f27667x;
                this.f27667x = i17 + 1;
                sparseArray2.put(i17, LocaleController.formatPluralString("Stickers", this.f27661e.count, new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.E.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f27667x, str2);
            }
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                int i20 = this.f27667x + i19;
                int i21 = (i19 / dzVar.d) + i13;
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
            int ceil = (int) Math.ceil(i19 / dzVar.d);
            for (int i23 = 0; i23 < ceil; i23++) {
                sparseArray.put(i13 + i23, Integer.valueOf(i19));
            }
            this.f27667x = (ceil * dzVar.d) + this.f27667x;
        } else {
            boolean isEmpty = this.F.isEmpty();
            ArrayList arrayList2 = this.H;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i24 = this.f27667x;
            this.f27667x = i24 + 1;
            sparseArray2.put(i24, "search");
            if (size > 0) {
                int i25 = this.f27667x;
                this.f27667x = i25 + 1;
                this.M = i25;
                sparseArray2.put(i25, "packs");
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (!isEmpty) {
                int i26 = this.f27667x;
                this.f27667x = i26 + 1;
                sparseArray2.put(i26, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                int i27 = i10 + 1;
                int size3 = this.F.size();
                int i28 = 0;
                int i29 = 0;
                while (i28 < size3) {
                    int i30 = i14;
                    ArrayList arrayList3 = (ArrayList) this.F.get(i28);
                    boolean z12 = isEmpty;
                    String str3 = (String) this.E.get(arrayList3);
                    if (str3 != null && !str.equals(str3)) {
                        sparseArray3.put(this.f27667x + i29, str3);
                        str = str3;
                    }
                    int size4 = arrayList3.size();
                    boolean z13 = z4;
                    int i31 = 0;
                    while (i31 < size4) {
                        int i32 = size4;
                        int i33 = this.f27667x + i29;
                        String str4 = str;
                        int i34 = (i29 / dzVar.d) + i27;
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
                    isEmpty = z12;
                    z4 = z13;
                }
                i11 = i14;
                z10 = isEmpty;
                z11 = z4;
                i12 = size;
                int i37 = i27;
                int ceil2 = (int) Math.ceil(i29 / dzVar.d);
                for (int i38 = 0; i38 < ceil2; i38++) {
                    sparseArray.put(i37 + i38, Integer.valueOf(i29));
                }
                this.f27667x = (dzVar.d * ceil2) + this.f27667x;
                i10 = i37 + ceil2;
            } else {
                i11 = i14;
                z10 = isEmpty;
                z11 = z4;
                i12 = size;
            }
            if (z11) {
                int i39 = this.f27667x;
                this.f27667x = i39 + 1;
                sparseArray2.put(i39, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i40 = i10 + 1;
                String str5 = (String) this.E.get(this.H);
                if (str5 != null) {
                    sparseArray3.put(this.f27667x, str5);
                }
                int size5 = this.H.size();
                int i41 = 0;
                for (int i42 = 0; i42 < size5; i42++) {
                    int i43 = this.f27667x + i41;
                    int i44 = (i41 / dzVar.d) + i40;
                    TLRPC.Document document3 = (TLRPC.Document) this.H.get(i42);
                    sparseArray2.put(i43, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(i11).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        sparseArray4.put(i43, stickerSetById3);
                    }
                    sparseIntArray.put(i43, i44);
                    i41++;
                }
                int ceil3 = (int) Math.ceil(i41 / dzVar.d);
                for (int i45 = 0; i45 < ceil3; i45++) {
                    sparseArray.put(i40 + i45, Integer.valueOf(i41));
                }
                this.f27667x = (ceil3 * dzVar.d) + this.f27667x;
            }
            if (z10 && !z11 && i12 == 0) {
                this.f27667x = 1;
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        boolean z4;
        int indexOfIgnoreCase;
        mz mzVar = this.N;
        LongSparseArray longSparseArray = mzVar.f29338w1;
        LongSparseArray longSparseArray2 = mzVar.f29334v1;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        SparseArray sparseArray = this.f27664r;
        boolean z10 = true;
        char c3 = 1;
        int i13 = 1;
        z10 = true;
        if (i12 != 0) {
            Integer num = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sparseArray.get(i10);
                        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view;
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f20872id) >= 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f20872id) < 0) {
                            c3 = 0;
                        }
                        if (z4 || c3 != 0) {
                            if (z4 && r3Var.f23551r) {
                                longSparseArray2.remove(stickerSetCovered.set.f20872id);
                                z4 = false;
                            } else if (c3 != 0 && !r3Var.f23551r) {
                                longSparseArray.remove(stickerSetCovered.set.f20872id);
                            }
                        }
                        r3Var.b(z4, false);
                        if (TextUtils.isEmpty(this.K)) {
                            indexOfIgnoreCase = -1;
                        } else {
                            indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.K);
                        }
                        if (indexOfIgnoreCase >= 0) {
                            r3Var.c(stickerSetCovered, false, false, indexOfIgnoreCase, this.K.length(), false);
                            return;
                        }
                        r3Var.c(stickerSetCovered, false, false, 0, 0, false);
                        if (!TextUtils.isEmpty(this.K) && AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.K) == 0) {
                            String str = stickerSetCovered.set.short_name;
                            int length = this.K.length();
                            r3Var.C = str;
                            r3Var.D = length;
                            r3Var.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                Object obj = sparseArray.get(i10);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.K) && this.C.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            m8Var.b(0, stickerSet.title);
                        }
                        m8Var.d(this.K.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num2 = (Integer) this.D.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num2 != null) {
                        String str2 = stickerSet2.title;
                        int intValue = num2.intValue();
                        if (!TextUtils.isEmpty(this.K)) {
                            i11 = this.K.length();
                        } else {
                            i11 = 0;
                        }
                        m8Var.c(str2, 0, null, intValue, i11);
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
            org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) view;
            if (i10 == this.f27667x) {
                int i14 = this.v.get(i10 - 1, Integer.MIN_VALUE);
                if (i14 == Integer.MIN_VALUE) {
                    k3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f27663n.get(i14);
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
                    int z11 = org.telegram.ui.b.z(82.0f, (int) Math.ceil(num.intValue() / mzVar.f29333v0.d), mzVar.h.getHeight());
                    if (z11 > 0) {
                        i13 = z11;
                    }
                    k3Var.setHeight(i13);
                    return;
                }
            }
            k3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
        d8Var.d(document, null, this.f27665s.get(i10), (String) this.f27666w.get(i10), false, false);
        if (!mzVar.f29288g1.contains(document) && !mzVar.f29291h1.contains(document)) {
            z10 = false;
        }
        d8Var.setRecent(z10);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View czVar;
        ViewGroup s2Var;
        Context context = this.h;
        mz mzVar = this.N;
        switch (i10) {
            case 0:
                czVar = new cz(1, context, mzVar.W1, true);
                break;
            case 1:
                czVar = new org.telegram.ui.Cells.k3(context);
                break;
            case 2:
                czVar = new org.telegram.ui.Cells.m8(this.h, false, false, mzVar.W1, mzVar.f29286f2);
                break;
            case 3:
                org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(17, this.h, mzVar.W1, false, true);
                r3Var.setAddOnClickListener(new g0(this, 15));
                czVar = r3Var;
                break;
            case 4:
                czVar = new View(context);
                czVar.setLayoutParams(new f2.x0(-1, mzVar.Y0));
                break;
            case 5:
                s2Var = new eg.s2(this, context, 20);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i11 = org.telegram.ui.ActionBar.k6.Le;
                imageView.setColorFilter(new PorterDuffColorFilter(mzVar.A(i11), PorterDuff.Mode.MULTIPLY));
                imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                s2Var.addView(imageView, k7.c6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.NoStickersFound));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(mzVar.A(i11));
                s2Var.addView(textView, k7.c6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                s2Var.setLayoutParams(new f2.x0(-1, -2));
                czVar = s2Var;
                break;
            case 6:
            default:
                czVar = null;
                break;
            case 7:
                ViewGroup.LayoutParams x0Var = new f2.x0(-1, AndroidUtilities.dp(79.0f));
                s2Var = this.f27660c;
                s2Var.setLayoutParams(x0Var);
                czVar = s2Var;
                break;
            case 8:
                czVar = new View(mzVar.getContext());
                czVar.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(68.0f)));
                break;
        }
        return new f2.m1(czVar);
    }
}
