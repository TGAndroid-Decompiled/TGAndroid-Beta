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
public final class k61 extends pm0 {
    public final Context f27855c;
    public boolean f27859r;
    public boolean f27860s;
    public int f27861w;
    public final l61 f27862x;
    public final SparseArray d = new SparseArray();
    public final ArrayList f27856e = new ArrayList();
    public final SparseArray f27857f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f27858n = new ArrayList();
    public int v = 5;

    public k61(l61 l61Var, Context context) {
        this.f27862x = l61Var;
        this.f27855c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47660f == 5) {
            return true;
        }
        return false;
    }

    public final void E(View view, int i10, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        l61 l61Var = this.f27862x;
        LongSparseArray longSparseArray = l61Var.f28306e;
        LongSparseArray longSparseArray2 = l61Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = l61Var.f28305c;
        int i11 = l61Var.f28303a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.f27861w;
        ArrayList arrayList = this.f27856e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f20065id))) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f20065id);
            }
            z11 = z18;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        mediaDataController.preloadStickerSetThumb(stickerSetCovered2);
        int i13 = 0;
        while (true) {
            if (i13 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i13] != null) {
                    z12 = true;
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.f20065id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i13] = null;
                    } else if (stickerSetCoveredArr[i13].set.f20065id == stickerSetCovered2.set.f20065id) {
                        z13 = true;
                        break;
                    }
                }
                i13++;
            } else {
                z12 = true;
                z13 = false;
                break;
            }
        }
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.f20065id);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f20065id) >= 0) {
            z14 = z12;
        } else {
            z14 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f20065id) >= 0) {
            z15 = z12;
        } else {
            z15 = false;
        }
        if (z14 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.f20065id);
            z14 = false;
        } else if (z15 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.f20065id);
        }
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
        s3Var.c(stickerSetCovered2, z11, z10, 0, 0, z13);
        if (!z13 && z14) {
            z16 = z12;
        } else {
            z16 = false;
        }
        s3Var.b(z16, z10);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z17 = z12;
                s3Var.setNeedDivider(z17);
            }
        }
        z17 = false;
        s3Var.setNeedDivider(z17);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, android.widget.FrameLayout r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k61.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i10;
        l61 l61Var = this.f27862x;
        int measuredWidth = l61Var.getMeasuredWidth();
        int i11 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            c61 c61Var = l61Var.f28309r;
            if (c61Var.J != max) {
                c61Var.y1(max);
                l61Var.J = false;
            }
        }
        if (l61Var.J) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f27857f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.f27856e;
        arrayList.clear();
        this.f27861w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(l61Var.f28303a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.f27858n);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i12 >= arrayList2.size()) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i12);
            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                if (i12 == size) {
                    int i15 = this.f27861w;
                    this.f27861w = i15 + 1;
                    sparseArray.put(i15, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f27861w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f27861w));
                int i16 = this.f27861w;
                this.f27861w = i16 + 1;
                int i17 = i13 + 1;
                sparseArray.put(i16, Integer.valueOf(i13));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i14 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i18 = i11; i18 < stickerSetCovered.covers.size(); i18++) {
                        sparseArray.put(this.f27861w + i18, stickerSetCovered.covers.get(i18));
                    }
                } else {
                    sparseArray.put(this.f27861w, stickerSetCovered.cover);
                }
                int i19 = 0;
                while (true) {
                    i10 = this.v * i14;
                    if (i19 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.f27861w + i19, stickerSetCovered);
                    i19++;
                }
                this.f27861w = i10 + this.f27861w;
                i13 = i17;
            }
            i12++;
            i11 = 0;
        }
        if (this.f27861w != 0) {
            l61Var.J = true;
            l61Var.K = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f27861w + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.f27861w) {
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
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f47660f;
        View view = d1Var.f47656a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.OtherStickers));
                        return;
                    }
                }
                E(view, i10, false);
                return;
            }
            ((org.telegram.ui.Cells.l3) view).setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.f8) view).d((TLRPC.Document) this.d.get(i10), null, this.f27857f.get(i10), null, false, false);
    }

    @Override
    public final void w(s4.d1 d1Var, int i10, List list) {
        if (list.contains(0)) {
            int i11 = d1Var.f47660f;
            if (i11 != 2 && i11 != 5) {
                return;
            }
            E(d1Var.f47656a, i10, true);
            return;
        }
        v(d1Var, i10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p3 p3Var;
        l61 l61Var = this.f27862x;
        org.telegram.ui.ActionBar.e6 e6Var = l61Var.P;
        Context context = this.f27855c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                p3Var = null;
                            } else {
                                org.telegram.ui.Cells.p3 p3Var2 = new org.telegram.ui.Cells.p3(context, e6Var);
                                p3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final k61 f27617b;

                                    {
                                        this.f27617b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                                                k61 k61Var = this.f27617b;
                                                l61 l61Var2 = k61Var.f27862x;
                                                LongSparseArray longSparseArray = l61Var2.d;
                                                LongSparseArray longSparseArray2 = l61Var2.f28306e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f20065id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f20065id) < 0) {
                                                    if (s3Var.f22903r) {
                                                        longSparseArray2.put(stickerSet.set.f20065id, stickerSet);
                                                        l61Var2.f28304b.h(stickerSet);
                                                        return;
                                                    }
                                                    k61Var.F(stickerSet, s3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.p3 p3Var3 = (org.telegram.ui.Cells.p3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = p3Var3.getStickerSet();
                                                k61 k61Var2 = this.f27617b;
                                                l61 l61Var3 = k61Var2.f27862x;
                                                LongSparseArray longSparseArray3 = l61Var3.d;
                                                LongSparseArray longSparseArray4 = l61Var3.f28306e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f20065id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f20065id) < 0) {
                                                    if (p3Var3.f22647s) {
                                                        longSparseArray4.put(stickerSet2.set.f20065id, stickerSet2);
                                                        l61Var3.f28304b.h(stickerSet2);
                                                        return;
                                                    }
                                                    k61Var2.F(stickerSet2, p3Var3);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                p3Var2.getImageView().setLayerNum(3);
                                p3Var = p3Var2;
                            }
                        } else {
                            p3Var = new org.telegram.ui.Cells.v3(context, e6Var);
                        }
                    } else {
                        p3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(17, this.f27855c, l61Var.P, true, true);
                    s3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final k61 f27617b;

                        {
                            this.f27617b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                                    k61 k61Var = this.f27617b;
                                    l61 l61Var2 = k61Var.f27862x;
                                    LongSparseArray longSparseArray = l61Var2.d;
                                    LongSparseArray longSparseArray2 = l61Var2.f28306e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f20065id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f20065id) < 0) {
                                        if (s3Var2.f22903r) {
                                            longSparseArray2.put(stickerSet.set.f20065id, stickerSet);
                                            l61Var2.f28304b.h(stickerSet);
                                            return;
                                        }
                                        k61Var.F(stickerSet, s3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.p3 p3Var3 = (org.telegram.ui.Cells.p3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = p3Var3.getStickerSet();
                                    k61 k61Var2 = this.f27617b;
                                    l61 l61Var3 = k61Var2.f27862x;
                                    LongSparseArray longSparseArray3 = l61Var3.d;
                                    LongSparseArray longSparseArray4 = l61Var3.f28306e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f20065id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f20065id) < 0) {
                                        if (p3Var3.f22647s) {
                                            longSparseArray4.put(stickerSet2.set.f20065id, stickerSet2);
                                            l61Var3.f28304b.h(stickerSet2);
                                            return;
                                        }
                                        k61Var2.F(stickerSet2, p3Var3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    p3Var = s3Var;
                }
            } else {
                p3Var = new org.telegram.ui.Cells.l3(context);
            }
        } else {
            gg.e2 e2Var = new gg.e2(3, context, e6Var, false);
            e2Var.getImageView().setLayerNum(3);
            p3Var = e2Var;
        }
        return new s4.d1(p3Var);
    }
}
