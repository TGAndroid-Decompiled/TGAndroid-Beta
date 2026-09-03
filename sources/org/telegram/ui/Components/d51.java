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
public final class d51 extends ql0 {
    public final Context f24172c;
    public boolean f24175r;
    public boolean f24176s;
    public int f24177w;
    public final e51 f24178x;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f24173f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f24174n = new ArrayList();
    public int v = 5;

    public d51(e51 e51Var, Context context) {
        this.f24178x = e51Var;
        this.f24172c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 5) {
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
        e51 e51Var = this.f24178x;
        LongSparseArray longSparseArray = e51Var.e;
        LongSparseArray longSparseArray2 = e51Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = e51Var.f24481c;
        int i11 = e51Var.f24479a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.f24177w;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f19186id))) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f19186id);
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
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.f19186id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i13] = null;
                    } else if (stickerSetCoveredArr[i13].set.f19186id == stickerSetCovered2.set.f19186id) {
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
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.f19186id);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f19186id) >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f19186id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.f19186id);
            z12 = false;
        } else if (z13 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.f19186id);
        }
        org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view;
        q3Var.c(stickerSetCovered2, z10, z4, 0, 0, z11);
        if (!z11 && z12) {
            z14 = true;
        } else {
            z14 = false;
        }
        q3Var.b(z14, z4);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z15 = true;
                q3Var.setNeedDivider(z15);
            }
        }
        z15 = false;
        q3Var.setNeedDivider(z15);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r10, android.widget.FrameLayout r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d51.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i10;
        e51 e51Var = this.f24178x;
        int measuredWidth = e51Var.getMeasuredWidth();
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            v41 v41Var = e51Var.f24484r;
            if (v41Var.J != max) {
                v41Var.y1(max);
                e51Var.G = false;
            }
        }
        if (e51Var.G) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f24173f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.f24177w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(e51Var.f24479a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.f24174n);
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
                    int i14 = this.f24177w;
                    this.f24177w = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f24177w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f24177w));
                int i15 = this.f24177w;
                this.f24177w = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i17 = 0; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.f24177w + i17, stickerSetCovered.covers.get(i17));
                    }
                } else {
                    sparseArray.put(this.f24177w, stickerSetCovered.cover);
                }
                int i18 = 0;
                while (true) {
                    i10 = this.v * i13;
                    if (i18 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.f24177w + i18, stickerSetCovered);
                    i18++;
                }
                this.f24177w = i10 + this.f24177w;
                i12 = i16;
            }
            i11++;
        }
        if (this.f24177w != 0) {
            e51Var.G = true;
            e51Var.H = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f24177w + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.f24177w) {
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
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.t3) view).setText(LocaleController.getString(R.string.OtherStickers));
                        return;
                    }
                }
                E(view, i10, false);
                return;
            }
            ((org.telegram.ui.Cells.j3) view).setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.c8) view).d((TLRPC.Document) this.d.get(i10), null, this.f24173f.get(i10), null, false, false);
    }

    @Override
    public final void w(f2.l1 l1Var, int i10, List list) {
        if (list.contains(0)) {
            int i11 = l1Var.f5777f;
            if (i11 != 2 && i11 != 5) {
                return;
            }
            E(l1Var.f5774a, i10, true);
            return;
        }
        v(l1Var, i10);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n3 n3Var;
        e51 e51Var = this.f24178x;
        org.telegram.ui.ActionBar.f6 f6Var = e51Var.M;
        Context context = this.f24172c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                n3Var = null;
                            } else {
                                org.telegram.ui.Cells.n3 n3Var2 = new org.telegram.ui.Cells.n3(context, f6Var);
                                n3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final d51 f23822b;

                                    {
                                        this.f23822b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
                                                d51 d51Var = this.f23822b;
                                                e51 e51Var2 = d51Var.f24178x;
                                                LongSparseArray longSparseArray = e51Var2.d;
                                                LongSparseArray longSparseArray2 = e51Var2.e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f19186id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f19186id) < 0) {
                                                    if (q3Var.f21690r) {
                                                        longSparseArray2.put(stickerSet.set.f19186id, stickerSet);
                                                        e51Var2.f24480b.h(stickerSet);
                                                        return;
                                                    }
                                                    d51Var.F(stickerSet, q3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.n3 n3Var3 = (org.telegram.ui.Cells.n3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = n3Var3.getStickerSet();
                                                d51 d51Var2 = this.f23822b;
                                                e51 e51Var3 = d51Var2.f24178x;
                                                LongSparseArray longSparseArray3 = e51Var3.d;
                                                LongSparseArray longSparseArray4 = e51Var3.e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f19186id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f19186id) < 0) {
                                                    if (n3Var3.f21423s) {
                                                        longSparseArray4.put(stickerSet2.set.f19186id, stickerSet2);
                                                        e51Var3.f24480b.h(stickerSet2);
                                                        return;
                                                    }
                                                    d51Var2.F(stickerSet2, n3Var3);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                n3Var2.getImageView().setLayerNum(3);
                                n3Var = n3Var2;
                            }
                        } else {
                            n3Var = new org.telegram.ui.Cells.t3(context, f6Var);
                        }
                    } else {
                        n3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.q3 q3Var = new org.telegram.ui.Cells.q3(17, this.f24172c, e51Var.M, true, true);
                    q3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final d51 f23822b;

                        {
                            this.f23822b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.q3 q3Var2 = (org.telegram.ui.Cells.q3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = q3Var2.getStickerSet();
                                    d51 d51Var = this.f23822b;
                                    e51 e51Var2 = d51Var.f24178x;
                                    LongSparseArray longSparseArray = e51Var2.d;
                                    LongSparseArray longSparseArray2 = e51Var2.e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f19186id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f19186id) < 0) {
                                        if (q3Var2.f21690r) {
                                            longSparseArray2.put(stickerSet.set.f19186id, stickerSet);
                                            e51Var2.f24480b.h(stickerSet);
                                            return;
                                        }
                                        d51Var.F(stickerSet, q3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.n3 n3Var3 = (org.telegram.ui.Cells.n3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = n3Var3.getStickerSet();
                                    d51 d51Var2 = this.f23822b;
                                    e51 e51Var3 = d51Var2.f24178x;
                                    LongSparseArray longSparseArray3 = e51Var3.d;
                                    LongSparseArray longSparseArray4 = e51Var3.e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f19186id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f19186id) < 0) {
                                        if (n3Var3.f21423s) {
                                            longSparseArray4.put(stickerSet2.set.f19186id, stickerSet2);
                                            e51Var3.f24480b.h(stickerSet2);
                                            return;
                                        }
                                        d51Var2.F(stickerSet2, n3Var3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    n3Var = q3Var;
                }
            } else {
                n3Var = new org.telegram.ui.Cells.j3(context);
            }
        } else {
            az azVar = new az(2, context, f6Var, false);
            azVar.getImageView().setLayerNum(3);
            n3Var = azVar;
        }
        return new f2.l1(n3Var);
    }
}
