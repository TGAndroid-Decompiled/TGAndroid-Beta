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
public final class s51 extends vl0 {
    public final Context f28056c;
    public boolean f28059r;
    public boolean f28060s;
    public int f28061w;
    public final t51 f28062x;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f28057f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f28058n = new ArrayList();
    public int v = 5;

    public s51(t51 t51Var, Context context) {
        this.f28062x = t51Var;
        this.f28056c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42932f == 5) {
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
        t51 t51Var = this.f28062x;
        LongSparseArray longSparseArray = t51Var.e;
        LongSparseArray longSparseArray2 = t51Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = t51Var.f28325c;
        int i11 = t51Var.f28323a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.f28061w;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f18323id))) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f18323id);
            }
            z11 = z17;
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
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.f18323id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i13] = null;
                    } else if (stickerSetCoveredArr[i13].set.f18323id == stickerSetCovered2.set.f18323id) {
                        z12 = true;
                        break;
                    }
                }
                i13++;
            } else {
                z12 = false;
                break;
            }
        }
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.f18323id);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f18323id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f18323id) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.f18323id);
            z13 = false;
        } else if (z14 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.f18323id);
        }
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
        s3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        if (!z12 && z13) {
            z15 = true;
        } else {
            z15 = false;
        }
        s3Var.b(z15, z10);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z16 = true;
                s3Var.setNeedDivider(z16);
            }
        }
        z16 = false;
        s3Var.setNeedDivider(z16);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r10, android.widget.FrameLayout r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s51.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i10;
        t51 t51Var = this.f28062x;
        int measuredWidth = t51Var.getMeasuredWidth();
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            k51 k51Var = t51Var.f28328r;
            if (k51Var.J != max) {
                k51Var.y1(max);
                t51Var.J = false;
            }
        }
        if (t51Var.J) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f28057f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.f28061w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(t51Var.f28323a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.f28058n);
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
                    int i14 = this.f28061w;
                    this.f28061w = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f28061w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f28061w));
                int i15 = this.f28061w;
                this.f28061w = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i17 = 0; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.f28061w + i17, stickerSetCovered.covers.get(i17));
                    }
                } else {
                    sparseArray.put(this.f28061w, stickerSetCovered.cover);
                }
                int i18 = 0;
                while (true) {
                    i10 = this.v * i13;
                    if (i18 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.f28061w + i18, stickerSetCovered);
                    i18++;
                }
                this.f28061w = i10 + this.f28061w;
                i12 = i16;
            }
            i11++;
        }
        if (this.f28061w != 0) {
            t51Var.J = true;
            t51Var.K = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f28061w + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.f28061w) {
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42932f;
        View view = c1Var.f42929a;
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
        ((org.telegram.ui.Cells.f8) view).d((TLRPC.Document) this.d.get(i10), null, this.f28057f.get(i10), null, false, false);
    }

    @Override
    public final void w(s4.c1 c1Var, int i10, List list) {
        if (list.contains(0)) {
            int i11 = c1Var.f42932f;
            if (i11 != 2 && i11 != 5) {
                return;
            }
            E(c1Var.f42929a, i10, true);
            return;
        }
        v(c1Var, i10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p3 p3Var;
        t51 t51Var = this.f28062x;
        org.telegram.ui.ActionBar.e6 e6Var = t51Var.P;
        Context context = this.f28056c;
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
                                    public final s51 f27835b;

                                    {
                                        this.f27835b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = s3Var.getStickerSet();
                                                s51 s51Var = this.f27835b;
                                                t51 t51Var2 = s51Var.f28062x;
                                                LongSparseArray longSparseArray = t51Var2.d;
                                                LongSparseArray longSparseArray2 = t51Var2.e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f18323id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f18323id) < 0) {
                                                    if (s3Var.f21021r) {
                                                        longSparseArray2.put(stickerSet.set.f18323id, stickerSet);
                                                        t51Var2.f28324b.h(stickerSet);
                                                        return;
                                                    }
                                                    s51Var.F(stickerSet, s3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.p3 p3Var3 = (org.telegram.ui.Cells.p3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = p3Var3.getStickerSet();
                                                s51 s51Var2 = this.f27835b;
                                                t51 t51Var3 = s51Var2.f28062x;
                                                LongSparseArray longSparseArray3 = t51Var3.d;
                                                LongSparseArray longSparseArray4 = t51Var3.e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f18323id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f18323id) < 0) {
                                                    if (p3Var3.f20770s) {
                                                        longSparseArray4.put(stickerSet2.set.f18323id, stickerSet2);
                                                        t51Var3.f28324b.h(stickerSet2);
                                                        return;
                                                    }
                                                    s51Var2.F(stickerSet2, p3Var3);
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
                    org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(17, this.f28056c, t51Var.P, true, true);
                    s3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final s51 f27835b;

                        {
                            this.f27835b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.s3 s3Var2 = (org.telegram.ui.Cells.s3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = s3Var2.getStickerSet();
                                    s51 s51Var = this.f27835b;
                                    t51 t51Var2 = s51Var.f28062x;
                                    LongSparseArray longSparseArray = t51Var2.d;
                                    LongSparseArray longSparseArray2 = t51Var2.e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f18323id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f18323id) < 0) {
                                        if (s3Var2.f21021r) {
                                            longSparseArray2.put(stickerSet.set.f18323id, stickerSet);
                                            t51Var2.f28324b.h(stickerSet);
                                            return;
                                        }
                                        s51Var.F(stickerSet, s3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.p3 p3Var3 = (org.telegram.ui.Cells.p3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = p3Var3.getStickerSet();
                                    s51 s51Var2 = this.f27835b;
                                    t51 t51Var3 = s51Var2.f28062x;
                                    LongSparseArray longSparseArray3 = t51Var3.d;
                                    LongSparseArray longSparseArray4 = t51Var3.e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f18323id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f18323id) < 0) {
                                        if (p3Var3.f20770s) {
                                            longSparseArray4.put(stickerSet2.set.f18323id, stickerSet2);
                                            t51Var3.f28324b.h(stickerSet2);
                                            return;
                                        }
                                        s51Var2.F(stickerSet2, p3Var3);
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
            gg.f2 f2Var = new gg.f2(3, context, e6Var, false);
            f2Var.getImageView().setLayerNum(3);
            p3Var = f2Var;
        }
        return new s4.c1(p3Var);
    }
}
