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
public final class h61 extends lm0 {
    public final Context f25187c;
    public boolean f25190r;
    public boolean f25191s;
    public int f25192w;
    public final i61 f25193x;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f25188f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f25189n = new ArrayList();
    public int v = 5;

    public h61(i61 i61Var, Context context) {
        this.f25193x = i61Var;
        this.f25187c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 5) {
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
        i61 i61Var = this.f25193x;
        LongSparseArray longSparseArray = i61Var.e;
        LongSparseArray longSparseArray2 = i61Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = i61Var.f25563c;
        int i11 = i61Var.f25561a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.f25192w;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f18943id))) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f18943id);
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
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.f18943id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i13] = null;
                    } else if (stickerSetCoveredArr[i13].set.f18943id == stickerSetCovered2.set.f18943id) {
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
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.f18943id);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f18943id) >= 0) {
            z14 = z12;
        } else {
            z14 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f18943id) >= 0) {
            z15 = z12;
        } else {
            z15 = false;
        }
        if (z14 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.f18943id);
            z14 = false;
        } else if (z15 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.f18943id);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h61.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i10;
        i61 i61Var = this.f25193x;
        int measuredWidth = i61Var.getMeasuredWidth();
        int i11 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            z51 z51Var = i61Var.f25566r;
            if (z51Var.J != max) {
                z51Var.y1(max);
                i61Var.J = false;
            }
        }
        if (i61Var.J) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f25188f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.f25192w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(i61Var.f25561a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.f25189n);
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
                    int i15 = this.f25192w;
                    this.f25192w = i15 + 1;
                    sparseArray.put(i15, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f25192w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f25192w));
                int i16 = this.f25192w;
                this.f25192w = i16 + 1;
                int i17 = i13 + 1;
                sparseArray.put(i16, Integer.valueOf(i13));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i14 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i18 = i11; i18 < stickerSetCovered.covers.size(); i18++) {
                        sparseArray.put(this.f25192w + i18, stickerSetCovered.covers.get(i18));
                    }
                } else {
                    sparseArray.put(this.f25192w, stickerSetCovered.cover);
                }
                int i19 = 0;
                while (true) {
                    i10 = this.v * i14;
                    if (i19 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.f25192w + i19, stickerSetCovered);
                    i19++;
                }
                this.f25192w = i10 + this.f25192w;
                i13 = i17;
            }
            i12++;
            i11 = 0;
        }
        if (this.f25192w != 0) {
            i61Var.J = true;
            i61Var.K = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f25192w + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.f25192w) {
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
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
        ((org.telegram.ui.Cells.f8) view).d((TLRPC.Document) this.d.get(i10), null, this.f25188f.get(i10), null, false, false);
    }

    @Override
    public final void w(s4.b1 b1Var, int i10, List list) {
        if (list.contains(0)) {
            int i11 = b1Var.f44841f;
            if (i11 != 2 && i11 != 5) {
                return;
            }
            E(b1Var.f44838a, i10, true);
            return;
        }
        v(b1Var, i10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p3 p3Var;
        i61 i61Var = this.f25193x;
        org.telegram.ui.ActionBar.c6 c6Var = i61Var.P;
        Context context = this.f25187c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                p3Var = null;
                            } else {
                                org.telegram.ui.Cells.p3 p3Var2 = new org.telegram.ui.Cells.p3(context, c6Var);
                                p3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final h61 f24894b;

                                    {
                                        this.f24894b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                                                h61 h61Var = this.f24894b;
                                                i61 i61Var2 = h61Var.f25193x;
                                                LongSparseArray longSparseArray = i61Var2.d;
                                                LongSparseArray longSparseArray2 = i61Var2.e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f18943id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f18943id) < 0) {
                                                    if (s3Var.f21637r) {
                                                        longSparseArray2.put(stickerSet.set.f18943id, stickerSet);
                                                        i61Var2.f25562b.h(stickerSet);
                                                        return;
                                                    }
                                                    h61Var.F(stickerSet, s3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.p3 p3Var3 = (org.telegram.ui.Cells.p3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = p3Var3.getStickerSet();
                                                h61 h61Var2 = this.f24894b;
                                                i61 i61Var3 = h61Var2.f25193x;
                                                LongSparseArray longSparseArray3 = i61Var3.d;
                                                LongSparseArray longSparseArray4 = i61Var3.e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f18943id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f18943id) < 0) {
                                                    if (p3Var3.f21390s) {
                                                        longSparseArray4.put(stickerSet2.set.f18943id, stickerSet2);
                                                        i61Var3.f25562b.h(stickerSet2);
                                                        return;
                                                    }
                                                    h61Var2.F(stickerSet2, p3Var3);
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
                            p3Var = new org.telegram.ui.Cells.v3(context, c6Var);
                        }
                    } else {
                        p3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(17, this.f25187c, i61Var.P, true, true);
                    s3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final h61 f24894b;

                        {
                            this.f24894b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                                    h61 h61Var = this.f24894b;
                                    i61 i61Var2 = h61Var.f25193x;
                                    LongSparseArray longSparseArray = i61Var2.d;
                                    LongSparseArray longSparseArray2 = i61Var2.e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f18943id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f18943id) < 0) {
                                        if (s3Var2.f21637r) {
                                            longSparseArray2.put(stickerSet.set.f18943id, stickerSet);
                                            i61Var2.f25562b.h(stickerSet);
                                            return;
                                        }
                                        h61Var.F(stickerSet, s3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.p3 p3Var3 = (org.telegram.ui.Cells.p3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = p3Var3.getStickerSet();
                                    h61 h61Var2 = this.f24894b;
                                    i61 i61Var3 = h61Var2.f25193x;
                                    LongSparseArray longSparseArray3 = i61Var3.d;
                                    LongSparseArray longSparseArray4 = i61Var3.e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f18943id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f18943id) < 0) {
                                        if (p3Var3.f21390s) {
                                            longSparseArray4.put(stickerSet2.set.f18943id, stickerSet2);
                                            i61Var3.f25562b.h(stickerSet2);
                                            return;
                                        }
                                        h61Var2.F(stickerSet2, p3Var3);
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
            hg.d2 d2Var = new hg.d2(3, context, c6Var, false);
            d2Var.getImageView().setLayerNum(3);
            p3Var = d2Var;
        }
        return new s4.b1(p3Var);
    }
}
