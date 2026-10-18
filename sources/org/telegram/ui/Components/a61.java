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
public final class a61 extends hm0 {
    public final Context f24502c;
    public boolean f24505r;
    public boolean f24506s;
    public int f24507w;
    public final b61 f24508x;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f24503f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f24504n = new ArrayList();
    public int v = 5;

    public a61(b61 b61Var, Context context) {
        this.f24508x = b61Var;
        this.f24502c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45913f == 5) {
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
        b61 b61Var = this.f24508x;
        LongSparseArray longSparseArray = b61Var.e;
        LongSparseArray longSparseArray2 = b61Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = b61Var.f24814c;
        int i11 = b61Var.f24812a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.f24507w;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f20299id))) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f20299id);
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
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.f20299id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i13] = null;
                    } else if (stickerSetCoveredArr[i13].set.f20299id == stickerSetCovered2.set.f20299id) {
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
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.f20299id);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f20299id) >= 0) {
            z14 = z12;
        } else {
            z14 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f20299id) >= 0) {
            z15 = z12;
        } else {
            z15 = false;
        }
        if (z14 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.f20299id);
            z14 = false;
        } else if (z15 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.f20299id);
        }
        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view;
        r3Var.c(stickerSetCovered2, z11, z10, 0, 0, z13);
        if (!z13 && z14) {
            z16 = z12;
        } else {
            z16 = false;
        }
        r3Var.b(z16, z10);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z17 = z12;
                r3Var.setNeedDivider(z17);
            }
        }
        z17 = false;
        r3Var.setNeedDivider(z17);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, android.widget.FrameLayout r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a61.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i10;
        b61 b61Var = this.f24508x;
        int measuredWidth = b61Var.getMeasuredWidth();
        int i11 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            s51 s51Var = b61Var.f24817r;
            if (s51Var.J != max) {
                s51Var.y1(max);
                b61Var.J = false;
            }
        }
        if (b61Var.J) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f24503f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.f24507w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(b61Var.f24812a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.f24504n);
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
                    int i15 = this.f24507w;
                    this.f24507w = i15 + 1;
                    sparseArray.put(i15, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f24507w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f24507w));
                int i16 = this.f24507w;
                this.f24507w = i16 + 1;
                int i17 = i13 + 1;
                sparseArray.put(i16, Integer.valueOf(i13));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i14 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i18 = i11; i18 < stickerSetCovered.covers.size(); i18++) {
                        sparseArray.put(this.f24507w + i18, stickerSetCovered.covers.get(i18));
                    }
                } else {
                    sparseArray.put(this.f24507w, stickerSetCovered.cover);
                }
                int i19 = 0;
                while (true) {
                    i10 = this.v * i14;
                    if (i19 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.f24507w + i19, stickerSetCovered);
                    i19++;
                }
                this.f24507w = i10 + this.f24507w;
                i13 = i17;
            }
            i12++;
            i11 = 0;
        }
        if (this.f24507w != 0) {
            b61Var.J = true;
            b61Var.K = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f24507w + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.f24507w) {
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
        int i11 = b1Var.f45913f;
        View view = b1Var.f45910a;
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
        ((org.telegram.ui.Cells.e8) view).d((TLRPC.Document) this.d.get(i10), null, this.f24503f.get(i10), null, false, false);
    }

    @Override
    public final void w(s4.b1 b1Var, int i10, List list) {
        if (list.contains(0)) {
            int i11 = b1Var.f45913f;
            if (i11 != 2 && i11 != 5) {
                return;
            }
            E(b1Var.f45910a, i10, true);
            return;
        }
        v(b1Var, i10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o3 o3Var;
        b61 b61Var = this.f24508x;
        org.telegram.ui.ActionBar.d6 d6Var = b61Var.P;
        Context context = this.f24502c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                o3Var = null;
                            } else {
                                org.telegram.ui.Cells.o3 o3Var2 = new org.telegram.ui.Cells.o3(context, d6Var);
                                o3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final a61 f32844b;

                                    {
                                        this.f32844b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                                                a61 a61Var = this.f32844b;
                                                b61 b61Var2 = a61Var.f24508x;
                                                LongSparseArray longSparseArray = b61Var2.d;
                                                LongSparseArray longSparseArray2 = b61Var2.e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f20299id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f20299id) < 0) {
                                                    if (r3Var.f22938r) {
                                                        longSparseArray2.put(stickerSet.set.f20299id, stickerSet);
                                                        b61Var2.f24813b.h(stickerSet);
                                                        return;
                                                    }
                                                    a61Var.F(stickerSet, r3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.o3 o3Var3 = (org.telegram.ui.Cells.o3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = o3Var3.getStickerSet();
                                                a61 a61Var2 = this.f32844b;
                                                b61 b61Var3 = a61Var2.f24508x;
                                                LongSparseArray longSparseArray3 = b61Var3.d;
                                                LongSparseArray longSparseArray4 = b61Var3.e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f20299id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f20299id) < 0) {
                                                    if (o3Var3.f22715s) {
                                                        longSparseArray4.put(stickerSet2.set.f20299id, stickerSet2);
                                                        b61Var3.f24813b.h(stickerSet2);
                                                        return;
                                                    }
                                                    a61Var2.F(stickerSet2, o3Var3);
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
                            o3Var = new org.telegram.ui.Cells.u3(context, d6Var);
                        }
                    } else {
                        o3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(17, this.f24502c, b61Var.P, true, true);
                    r3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final a61 f32844b;

                        {
                            this.f32844b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                                    a61 a61Var = this.f32844b;
                                    b61 b61Var2 = a61Var.f24508x;
                                    LongSparseArray longSparseArray = b61Var2.d;
                                    LongSparseArray longSparseArray2 = b61Var2.e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f20299id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f20299id) < 0) {
                                        if (r3Var2.f22938r) {
                                            longSparseArray2.put(stickerSet.set.f20299id, stickerSet);
                                            b61Var2.f24813b.h(stickerSet);
                                            return;
                                        }
                                        a61Var.F(stickerSet, r3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.o3 o3Var3 = (org.telegram.ui.Cells.o3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = o3Var3.getStickerSet();
                                    a61 a61Var2 = this.f32844b;
                                    b61 b61Var3 = a61Var2.f24508x;
                                    LongSparseArray longSparseArray3 = b61Var3.d;
                                    LongSparseArray longSparseArray4 = b61Var3.e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f20299id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f20299id) < 0) {
                                        if (o3Var3.f22715s) {
                                            longSparseArray4.put(stickerSet2.set.f20299id, stickerSet2);
                                            b61Var3.f24813b.h(stickerSet2);
                                            return;
                                        }
                                        a61Var2.F(stickerSet2, o3Var3);
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
            hg.d2 d2Var = new hg.d2(3, context, d6Var, false);
            d2Var.getImageView().setLayerNum(3);
            o3Var = d2Var;
        }
        return new s4.b1(o3Var);
    }
}
