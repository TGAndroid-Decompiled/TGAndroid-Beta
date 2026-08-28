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
public final class g41 extends vk0 {
    public final Context f28643c;
    public boolean f28647r;
    public boolean f28648s;
    public int f28649w;
    public final h41 f28650x;
    public final SparseArray d = new SparseArray();
    public final ArrayList f28644e = new ArrayList();
    public final SparseArray f28645f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f28646n = new ArrayList();
    public int v = 5;

    public g41(h41 h41Var, Context context) {
        this.f28650x = h41Var;
        this.f28643c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 5) {
            return true;
        }
        return false;
    }

    public final void E(View view, int i9, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        h41 h41Var = this.f28650x;
        LongSparseArray longSparseArray = h41Var.f28970e;
        LongSparseArray longSparseArray2 = h41Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = h41Var.f28969c;
        int i10 = h41Var.f28967a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        int i11 = this.f28649w;
        ArrayList arrayList = this.f28644e;
        SparseArray sparseArray = this.d;
        if (i9 < i11) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i9)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f22407id))) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f22407id);
            }
            z11 = z17;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i9)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        mediaDataController.preloadStickerSetThumb(stickerSetCovered2);
        int i12 = 0;
        while (true) {
            if (i12 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i12] != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i10).getStickerSetById(stickerSetCoveredArr[i12].set.f22407id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i12] = null;
                    } else if (stickerSetCoveredArr[i12].set.f22407id == stickerSetCovered2.set.f22407id) {
                        z12 = true;
                        break;
                    }
                }
                i12++;
            } else {
                z12 = false;
                break;
            }
        }
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.f22407id);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f22407id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f22407id) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.f22407id);
            z13 = false;
        } else if (z14 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.f22407id);
        }
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
        s3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        if (!z12 && z13) {
            z15 = true;
        } else {
            z15 = false;
        }
        s3Var.b(z15, z10);
        if (i9 > 0) {
            int i13 = i9 - 1;
            if (sparseArray.get(i13) == null || !sparseArray.get(i13).equals(-1)) {
                z16 = true;
                s3Var.setNeedDivider(z16);
            }
        }
        z16 = false;
        s3Var.setNeedDivider(z16);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r10, android.widget.FrameLayout r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g41.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i9;
        h41 h41Var = this.f28650x;
        int measuredWidth = h41Var.getMeasuredWidth();
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            y31 y31Var = h41Var.f28973r;
            if (y31Var.J != max) {
                y31Var.y1(max);
                h41Var.F = false;
            }
        }
        if (h41Var.F) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f28645f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.f28644e;
        arrayList.clear();
        this.f28649w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(h41Var.f28967a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.f28646n);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= arrayList2.size()) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i10);
            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                if (i10 == size) {
                    int i13 = this.f28649w;
                    this.f28649w = i13 + 1;
                    sparseArray.put(i13, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f28649w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f28649w));
                int i14 = this.f28649w;
                this.f28649w = i14 + 1;
                int i15 = i11 + 1;
                sparseArray.put(i14, Integer.valueOf(i11));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i12 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i16 = 0; i16 < stickerSetCovered.covers.size(); i16++) {
                        sparseArray.put(this.f28649w + i16, stickerSetCovered.covers.get(i16));
                    }
                } else {
                    sparseArray.put(this.f28649w, stickerSetCovered.cover);
                }
                int i17 = 0;
                while (true) {
                    i9 = this.v * i12;
                    if (i17 >= i9) {
                        break;
                    }
                    sparseArray2.put(this.f28649w + i17, stickerSetCovered);
                    i17++;
                }
                this.f28649w = i9 + this.f28649w;
                i11 = i15;
            }
            i10++;
        }
        if (this.f28649w != 0) {
            h41Var.F = true;
            h41Var.G = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f28649w + 1;
    }

    @Override
    public final int j(int i9) {
        if (i9 == this.f28649w) {
            return 3;
        }
        Object obj = this.d.get(i9);
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
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.OtherStickers));
                        return;
                    }
                }
                E(view, i9, false);
                return;
            }
            ((org.telegram.ui.Cells.l3) view).setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) this.d.get(i9), null, this.f28645f.get(i9), null, false, false);
    }

    @Override
    public final void w(f2.q1 q1Var, int i9, List list) {
        if (list.contains(0)) {
            int i10 = q1Var.f5505f;
            if (i10 != 2 && i10 != 5) {
                return;
            }
            E(q1Var.f5501a, i9, true);
            return;
        }
        v(q1Var, i9);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.p3 p3Var;
        h41 h41Var = this.f28650x;
        org.telegram.ui.ActionBar.b6 b6Var = h41Var.L;
        Context context = this.f28643c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                p3Var = null;
                            } else {
                                org.telegram.ui.Cells.p3 p3Var2 = new org.telegram.ui.Cells.p3(context, b6Var);
                                p3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final g41 f28268b;

                                    {
                                        this.f28268b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                                                g41 g41Var = this.f28268b;
                                                h41 h41Var2 = g41Var.f28650x;
                                                LongSparseArray longSparseArray = h41Var2.d;
                                                LongSparseArray longSparseArray2 = h41Var2.f28970e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f22407id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f22407id) < 0) {
                                                    if (s3Var.f25263r) {
                                                        longSparseArray2.put(stickerSet.set.f22407id, stickerSet);
                                                        h41Var2.f28968b.h(stickerSet);
                                                        return;
                                                    }
                                                    g41Var.F(stickerSet, s3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.p3 p3Var3 = (org.telegram.ui.Cells.p3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = p3Var3.getStickerSet();
                                                g41 g41Var2 = this.f28268b;
                                                h41 h41Var3 = g41Var2.f28650x;
                                                LongSparseArray longSparseArray3 = h41Var3.d;
                                                LongSparseArray longSparseArray4 = h41Var3.f28970e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f22407id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f22407id) < 0) {
                                                    if (p3Var3.f24863s) {
                                                        longSparseArray4.put(stickerSet2.set.f22407id, stickerSet2);
                                                        h41Var3.f28968b.h(stickerSet2);
                                                        return;
                                                    }
                                                    g41Var2.F(stickerSet2, p3Var3);
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
                            p3Var = new org.telegram.ui.Cells.v3(context, b6Var);
                        }
                    } else {
                        p3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(17, this.f28643c, h41Var.L, true, true);
                    s3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final g41 f28268b;

                        {
                            this.f28268b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                                    g41 g41Var = this.f28268b;
                                    h41 h41Var2 = g41Var.f28650x;
                                    LongSparseArray longSparseArray = h41Var2.d;
                                    LongSparseArray longSparseArray2 = h41Var2.f28970e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f22407id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f22407id) < 0) {
                                        if (s3Var2.f25263r) {
                                            longSparseArray2.put(stickerSet.set.f22407id, stickerSet);
                                            h41Var2.f28968b.h(stickerSet);
                                            return;
                                        }
                                        g41Var.F(stickerSet, s3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.p3 p3Var3 = (org.telegram.ui.Cells.p3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = p3Var3.getStickerSet();
                                    g41 g41Var2 = this.f28268b;
                                    h41 h41Var3 = g41Var2.f28650x;
                                    LongSparseArray longSparseArray3 = h41Var3.d;
                                    LongSparseArray longSparseArray4 = h41Var3.f28970e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f22407id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f22407id) < 0) {
                                        if (p3Var3.f24863s) {
                                            longSparseArray4.put(stickerSet2.set.f22407id, stickerSet2);
                                            h41Var3.f28968b.h(stickerSet2);
                                            return;
                                        }
                                        g41Var2.F(stickerSet2, p3Var3);
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
            of.x1 x1Var = new of.x1(3, context, b6Var, false);
            x1Var.getImageView().setLayerNum(3);
            p3Var = x1Var;
        }
        return new f2.q1(p3Var);
    }
}
