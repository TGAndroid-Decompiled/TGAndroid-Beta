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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mz extends km0 {
    public int L;
    public int M;
    public String N;
    public final rz Q;
    public final lz f28722c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f28723f;
    public final Context h;
    public int f28728x;
    public boolean f28729y;
    public final SparseArray f28724n = new SparseArray();
    public final SparseArray f28725r = new SparseArray();
    public final SparseArray f28726s = new SparseArray();
    public final SparseIntArray v = new SparseIntArray();
    public final SparseArray f28727w = new SparseArray();
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
        ?? aVar = new oh.a(context, rzVar.f30310c1, new d(this, 12), new rv(this, 3), rzVar.Z1);
        this.f28722c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.Z2.f24646r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.d2(this, 3));
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 7) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.f28728x;
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
        if (i10 == 1 && this.f28728x == 1) {
            return 5;
        }
        Object obj = this.f28725r.get(i10);
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
        int i14 = rzVar.f30310c1;
        iz izVar = rzVar.f30380y0;
        this.P = -1;
        SparseArray sparseArray = this.f28724n;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        SparseArray sparseArray2 = this.f28725r;
        sparseArray2.clear();
        SparseArray sparseArray3 = this.f28727w;
        sparseArray3.clear();
        this.f28728x = 0;
        int size = this.G.size() + this.E.size();
        this.f28722c.Z2.N(false);
        int i15 = (this.d > 0L ? 1 : (this.d == 0L ? 0 : -1));
        String str = "";
        SparseArray sparseArray4 = this.f28726s;
        if (i15 != 0) {
            ArrayList arrayList = this.f28723f;
            int i16 = this.f28728x;
            this.f28728x = i16 + 1;
            sparseArray2.put(i16, "search");
            if (size > 0) {
                int i17 = this.f28728x;
                this.f28728x = i17 + 1;
                this.P = i17;
                sparseArray2.put(i17, "packs");
                int i18 = this.f28728x;
                this.f28728x = i18 + 1;
                sparseArray2.put(i18, LocaleController.formatPluralString("Stickers", this.e.count, new Object[0]));
                i13 = 3;
            } else {
                i13 = 1;
            }
            String str2 = (String) this.H.get(arrayList);
            if (str2 != null && !"".equals(str2)) {
                sparseArray3.put(this.f28728x, str2);
            }
            int size2 = arrayList.size();
            int i19 = 0;
            int i20 = 0;
            while (i19 < size2) {
                int i21 = this.f28728x + i20;
                int i22 = (i20 / izVar.d) + i13;
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
            int ceil = (int) Math.ceil(i20 / izVar.d);
            for (int i24 = 0; i24 < ceil; i24++) {
                sparseArray.put(i13 + i24, Integer.valueOf(i20));
            }
            this.f28728x = (ceil * izVar.d) + this.f28728x;
        } else {
            boolean isEmpty = this.I.isEmpty();
            ArrayList arrayList3 = this.K;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i25 = this.f28728x;
            this.f28728x = i25 + 1;
            sparseArray2.put(i25, "search");
            if (size > 0) {
                int i26 = this.f28728x;
                this.f28728x = i26 + 1;
                this.P = i26;
                sparseArray2.put(i26, "packs");
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (!isEmpty) {
                int i27 = this.f28728x;
                this.f28728x = i27 + 1;
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
                        sparseArray3.put(this.f28728x + i30, str3);
                        str = str3;
                    }
                    int size4 = arrayList4.size();
                    boolean z14 = z10;
                    int i32 = 0;
                    while (i32 < size4) {
                        int i33 = size4;
                        int i34 = this.f28728x + i30;
                        int i35 = size;
                        int i36 = (i30 / izVar.d) + i28;
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
                int ceil2 = (int) Math.ceil(i30 / izVar.d);
                for (int i39 = 0; i39 < ceil2; i39++) {
                    sparseArray.put(i38 + i39, Integer.valueOf(i30));
                }
                this.f28728x = (izVar.d * ceil2) + this.f28728x;
                i10 = i38 + ceil2;
            } else {
                i11 = i14;
                z11 = isEmpty;
                z12 = z10;
                i12 = size;
            }
            if (z12) {
                int i40 = this.f28728x;
                this.f28728x = i40 + 1;
                sparseArray2.put(i40, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i41 = i10 + 1;
                String str5 = (String) this.H.get(this.K);
                if (str5 != null) {
                    sparseArray3.put(this.f28728x, str5);
                }
                int size5 = this.K.size();
                int i42 = 0;
                for (int i43 = 0; i43 < size5; i43++) {
                    int i44 = this.f28728x + i42;
                    int i45 = (i42 / izVar.d) + i41;
                    TLRPC.Document document3 = (TLRPC.Document) this.K.get(i43);
                    sparseArray2.put(i44, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(i11).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        sparseArray4.put(i44, stickerSetById3);
                    }
                    sparseIntArray.put(i44, i45);
                    i42++;
                }
                int ceil3 = (int) Math.ceil(i42 / izVar.d);
                for (int i46 = 0; i46 < ceil3; i46++) {
                    sparseArray.put(i41 + i46, Integer.valueOf(i42));
                }
                this.f28728x = (ceil3 * izVar.d) + this.f28728x;
            }
            if (z11 && !z12 && i12 == 0) {
                this.f28728x = 1;
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        int indexOfIgnoreCase;
        rz rzVar = this.Q;
        LongSparseArray longSparseArray = rzVar.f30384z1;
        LongSparseArray longSparseArray2 = rzVar.f30381y1;
        int i12 = b1Var.f46345f;
        View view = b1Var.f46342a;
        SparseArray sparseArray = this.f28725r;
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
                        if (longSparseArray2.indexOfKey(stickerSetCovered.set.f20371id) >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSetCovered.set.f20371id) < 0) {
                            c10 = 0;
                        }
                        if (z10 || c10 != 0) {
                            if (z10 && r3Var.f23095r) {
                                longSparseArray2.remove(stickerSetCovered.set.f20371id);
                                z10 = false;
                            } else if (c10 != 0 && !r3Var.f23095r) {
                                longSparseArray.remove(stickerSetCovered.set.f20371id);
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
                            r3Var.d(this.N.length(), stickerSetCovered.set.short_name);
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
                            o8Var.a(0, stickerSet.title);
                        }
                        o8Var.c(this.N.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num2 = (Integer) this.G.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num2 != null) {
                        String str = stickerSet2.title;
                        int intValue = num2.intValue();
                        if (!TextUtils.isEmpty(this.N)) {
                            i11 = this.N.length();
                        } else {
                            i11 = 0;
                        }
                        o8Var.b(str, 0, null, intValue, i11);
                    }
                    o8Var.c(0, null);
                    return;
                } else if (obj instanceof String) {
                    o8Var.a(0, (String) obj);
                    o8Var.c(0, null);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) view;
            if (i10 == this.f28728x) {
                int i15 = this.v.get(i10 - 1, Integer.MIN_VALUE);
                if (i15 == Integer.MIN_VALUE) {
                    j3Var.setHeight(1);
                    return;
                }
                Object obj2 = this.f28724n.get(i15);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    num = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj2).documents.size());
                } else if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                }
                if (num == null) {
                    j3Var.setHeight(1);
                    return;
                } else if (num.intValue() == 0) {
                    j3Var.setHeight(AndroidUtilities.dp(8.0f));
                    return;
                } else {
                    int B = org.telegram.messenger.tl.B(82.0f, (int) Math.ceil(num.intValue() / rzVar.f30380y0.d), rzVar.h.getHeight());
                    if (B > 0) {
                        i13 = B;
                    }
                    j3Var.setHeight(i13);
                    return;
                }
            }
            j3Var.setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        TLRPC.Document document = (TLRPC.Document) sparseArray.get(i10);
        org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
        e8Var.d(document, null, this.f28726s.get(i10), (String) this.f28727w.get(i10), false, false);
        if (!rzVar.f30332j1.contains(document) && !rzVar.f30335k1.contains(document)) {
            z11 = false;
        }
        e8Var.setRecent(z11);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ?? d2Var;
        lz lzVar;
        rz rzVar = this.Q;
        org.telegram.ui.ActionBar.g6 g6Var = rzVar.Z1;
        Context context = this.h;
        switch (i10) {
            case 0:
                d2Var = new hg.d2(2, context, g6Var, true);
                break;
            case 1:
                d2Var = new org.telegram.ui.Cells.j3(context);
                break;
            case 2:
                d2Var = new org.telegram.ui.Cells.o8(this.h, false, false, rzVar.Z1, rzVar.f30330i2);
                break;
            case 3:
                org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(17, this.h, rzVar.Z1, false, true);
                r3Var.setAddOnClickListener(new f0(this, 14));
                d2Var = r3Var;
                break;
            case 4:
                View view = new View(context);
                view.setLayoutParams(new s4.o0(-1, rzVar.f30306b1));
                lzVar = view;
                d2Var = lzVar;
                break;
            case 5:
                d2Var = new ah.x(this, context, 17);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_empty);
                int i11 = org.telegram.ui.ActionBar.k6.Le;
                org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                d2Var.addView(imageView, w7.z5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                TextView textView = new TextView(context);
                org.telegram.messenger.tl.n(R.string.NoStickersFound, textView, 1, 16.0f);
                org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
                d2Var.addView(textView, w7.z5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                d2Var.setLayoutParams(new s4.o0(-1, -2));
                break;
            case 6:
            default:
                d2Var = null;
                break;
            case 7:
                s4.o0 o0Var = new s4.o0(-1, AndroidUtilities.dp(79.0f));
                lz lzVar2 = this.f28722c;
                lzVar2.setLayoutParams(o0Var);
                lzVar = lzVar2;
                d2Var = lzVar;
                break;
            case 8:
                View view2 = new View(rzVar.getContext());
                view2.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(68.0f)));
                lzVar = view2;
                d2Var = lzVar;
                break;
        }
        return new s4.b1(d2Var);
    }
}
