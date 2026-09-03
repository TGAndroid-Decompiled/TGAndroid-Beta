package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class c51 extends rl0 {
    public final Context f25773c;
    public boolean f25777r;
    public boolean f25778s;
    public int f25779w;
    public final d51 f25780x;
    public final SparseArray d = new SparseArray();
    public final ArrayList f25774e = new ArrayList();
    public final SparseArray f25775f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f25776n = new ArrayList();
    public int v = 5;

    public c51(d51 d51Var, Context context) {
        this.f25780x = d51Var;
        this.f25773c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 5) {
            return true;
        }
        return false;
    }

    public final void E(View view, int i10, boolean z4) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        d51 d51Var = this.f25780x;
        LongSparseArray longSparseArray = d51Var.f26189e;
        LongSparseArray longSparseArray2 = d51Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = d51Var.f26188c;
        int i11 = d51Var.f26186a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.f25779w;
        ArrayList arrayList = this.f25774e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f20872id))) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f20872id);
            }
            z10 = z16;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            z10 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        mediaDataController.preloadStickerSetThumb(stickerSetCovered2);
        int i13 = 0;
        while (true) {
            if (i13 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i13] != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.f20872id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i13] = null;
                    } else if (stickerSetCoveredArr[i13].set.f20872id == stickerSetCovered2.set.f20872id) {
                        z11 = true;
                        break;
                    }
                }
                i13++;
            } else {
                z11 = false;
                break;
            }
        }
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.f20872id);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f20872id) >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f20872id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.f20872id);
            z12 = false;
        } else if (z13 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.f20872id);
        }
        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view;
        r3Var.c(stickerSetCovered2, z10, z4, 0, 0, z11);
        if (!z11 && z12) {
            z14 = true;
        } else {
            z14 = false;
        }
        r3Var.b(z14, z4);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z15 = true;
                r3Var.setNeedDivider(z15);
            }
        }
        z15 = false;
        r3Var.setNeedDivider(z15);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r10, android.widget.FrameLayout r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c51.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i10;
        d51 d51Var = this.f25780x;
        int measuredWidth = d51Var.getMeasuredWidth();
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            u41 u41Var = d51Var.f26192r;
            if (u41Var.J != max) {
                u41Var.y1(max);
                d51Var.G = false;
            }
        }
        if (d51Var.G) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f25775f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.f25774e;
        arrayList.clear();
        this.f25779w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(d51Var.f26186a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.f25776n);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = 1;
            if (i11 >= arrayList2.size()) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i11);
            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                if (i11 == size) {
                    int i14 = this.f25779w;
                    this.f25779w = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f25779w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f25779w));
                int i15 = this.f25779w;
                this.f25779w = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i17 = 0; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.f25779w + i17, stickerSetCovered.covers.get(i17));
                    }
                } else {
                    sparseArray.put(this.f25779w, stickerSetCovered.cover);
                }
                int i18 = 0;
                while (true) {
                    i10 = this.v * i13;
                    if (i18 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.f25779w + i18, stickerSetCovered);
                    i18++;
                }
                this.f25779w = i10 + this.f25779w;
                i12 = i16;
            }
            i11++;
        }
        if (this.f25779w != 0) {
            d51Var.G = true;
            d51Var.H = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f25779w + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.f25779w) {
            return 3;
        }
        Object obj = this.d.get(i10);
        if (obj != null) {
            if (obj instanceof TLRPC.Document) {
                return 0;
            }
            if (obj.equals(-1)) {
                return 4;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString(R.string.OtherStickers));
                        return;
                    }
                }
                E(view, i10, false);
                return;
            }
            ((org.telegram.ui.Cells.k3) view).setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) this.d.get(i10), null, this.f25775f.get(i10), null, false, false);
    }

    @Override
    public final void w(f2.m1 m1Var, int i10, List list) {
        if (list.contains(0)) {
            int i11 = m1Var.f5879f;
            if (i11 != 2 && i11 != 5) {
                return;
            }
            E(m1Var.f5875a, i10, true);
            return;
        }
        v(m1Var, i10);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o3 o3Var;
        d51 d51Var = this.f25780x;
        org.telegram.ui.ActionBar.g6 g6Var = d51Var.M;
        Context context = this.f25773c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                o3Var = null;
                            } else {
                                org.telegram.ui.Cells.o3 o3Var2 = new org.telegram.ui.Cells.o3(context, g6Var);
                                o3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final c51 f25513b;

                                    {
                                        this.f25513b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                                                c51 c51Var = this.f25513b;
                                                d51 d51Var2 = c51Var.f25780x;
                                                LongSparseArray longSparseArray = d51Var2.d;
                                                LongSparseArray longSparseArray2 = d51Var2.f26189e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f20872id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f20872id) < 0) {
                                                    if (r3Var.f23551r) {
                                                        longSparseArray2.put(stickerSet.set.f20872id, stickerSet);
                                                        d51Var2.f26187b.h(stickerSet);
                                                        return;
                                                    }
                                                    c51Var.F(stickerSet, r3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.o3 o3Var3 = (org.telegram.ui.Cells.o3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = o3Var3.getStickerSet();
                                                c51 c51Var2 = this.f25513b;
                                                d51 d51Var3 = c51Var2.f25780x;
                                                LongSparseArray longSparseArray3 = d51Var3.d;
                                                LongSparseArray longSparseArray4 = d51Var3.f26189e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f20872id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f20872id) < 0) {
                                                    if (o3Var3.f23297s) {
                                                        longSparseArray4.put(stickerSet2.set.f20872id, stickerSet2);
                                                        d51Var3.f26187b.h(stickerSet2);
                                                        return;
                                                    }
                                                    c51Var2.F(stickerSet2, o3Var3);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                o3Var2.getImageView().setLayerNum(3);
                                o3Var = o3Var2;
                            }
                        } else {
                            o3Var = new org.telegram.ui.Cells.u3(context, g6Var);
                        }
                    } else {
                        o3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(17, this.f25773c, d51Var.M, true, true);
                    r3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final c51 f25513b;

                        {
                            this.f25513b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                                    c51 c51Var = this.f25513b;
                                    d51 d51Var2 = c51Var.f25780x;
                                    LongSparseArray longSparseArray = d51Var2.d;
                                    LongSparseArray longSparseArray2 = d51Var2.f26189e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f20872id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f20872id) < 0) {
                                        if (r3Var2.f23551r) {
                                            longSparseArray2.put(stickerSet.set.f20872id, stickerSet);
                                            d51Var2.f26187b.h(stickerSet);
                                            return;
                                        }
                                        c51Var.F(stickerSet, r3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.o3 o3Var3 = (org.telegram.ui.Cells.o3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = o3Var3.getStickerSet();
                                    c51 c51Var2 = this.f25513b;
                                    d51 d51Var3 = c51Var2.f25780x;
                                    LongSparseArray longSparseArray3 = d51Var3.d;
                                    LongSparseArray longSparseArray4 = d51Var3.f26189e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f20872id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f20872id) < 0) {
                                        if (o3Var3.f23297s) {
                                            longSparseArray4.put(stickerSet2.set.f20872id, stickerSet2);
                                            d51Var3.f26187b.h(stickerSet2);
                                            return;
                                        }
                                        c51Var2.F(stickerSet2, o3Var3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    o3Var = r3Var;
                }
            } else {
                o3Var = new org.telegram.ui.Cells.k3(context);
            }
        } else {
            cz czVar = new cz(2, context, g6Var, false);
            czVar.getImageView().setLayerNum(3);
            o3Var = czVar;
        }
        return new f2.m1(o3Var);
    }
}
