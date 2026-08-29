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
public final class r41 extends il0 {
    public final Context f32171c;
    public boolean f32175r;
    public boolean f32176s;
    public int f32177w;
    public final s41 f32178x;
    public final SparseArray d = new SparseArray();
    public final ArrayList f32172e = new ArrayList();
    public final SparseArray f32173f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f32174n = new ArrayList();
    public int v = 5;

    public r41(s41 s41Var, Context context) {
        this.f32178x = s41Var;
        this.f32171c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 5) {
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
        s41 s41Var = this.f32178x;
        LongSparseArray longSparseArray = s41Var.f32483e;
        LongSparseArray longSparseArray2 = s41Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = s41Var.f32482c;
        int i11 = s41Var.f32480a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.f32177w;
        ArrayList arrayList = this.f32172e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f22419id))) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f22419id);
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
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.f22419id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i13] = null;
                    } else if (stickerSetCoveredArr[i13].set.f22419id == stickerSetCovered2.set.f22419id) {
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
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.f22419id);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f22419id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f22419id) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.f22419id);
            z13 = false;
        } else if (z14 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.f22419id);
        }
        org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view;
        p3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        if (!z12 && z13) {
            z15 = true;
        } else {
            z15 = false;
        }
        p3Var.b(z15, z10);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z16 = true;
                p3Var.setNeedDivider(z16);
            }
        }
        z16 = false;
        p3Var.setNeedDivider(z16);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r10, android.widget.FrameLayout r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r41.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i10;
        s41 s41Var = this.f32178x;
        int measuredWidth = s41Var.getMeasuredWidth();
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            j41 j41Var = s41Var.f32486r;
            if (j41Var.J != max) {
                j41Var.y1(max);
                s41Var.F = false;
            }
        }
        if (s41Var.F) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f32173f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.f32172e;
        arrayList.clear();
        this.f32177w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(s41Var.f32480a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.f32174n);
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
                    int i14 = this.f32177w;
                    this.f32177w = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f32177w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f32177w));
                int i15 = this.f32177w;
                this.f32177w = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i17 = 0; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.f32177w + i17, stickerSetCovered.covers.get(i17));
                    }
                } else {
                    sparseArray.put(this.f32177w, stickerSetCovered.cover);
                }
                int i18 = 0;
                while (true) {
                    i10 = this.v * i13;
                    if (i18 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.f32177w + i18, stickerSetCovered);
                    i18++;
                }
                this.f32177w = i10 + this.f32177w;
                i12 = i16;
            }
            i11++;
        }
        if (this.f32177w != 0) {
            s41Var.F = true;
            s41Var.G = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f32177w + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.f32177w) {
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.s3) view).setText(LocaleController.getString(R.string.OtherStickers));
                        return;
                    }
                }
                E(view, i10, false);
                return;
            }
            ((org.telegram.ui.Cells.i3) view).setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.b8) view).d((TLRPC.Document) this.d.get(i10), null, this.f32173f.get(i10), null, false, false);
    }

    @Override
    public final void w(f2.n1 n1Var, int i10, List list) {
        if (list.contains(0)) {
            int i11 = n1Var.f6436f;
            if (i11 != 2 && i11 != 5) {
                return;
            }
            E(n1Var.f6432a, i10, true);
            return;
        }
        v(n1Var, i10);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m3 m3Var;
        s41 s41Var = this.f32178x;
        org.telegram.ui.ActionBar.c6 c6Var = s41Var.L;
        Context context = this.f32171c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                m3Var = null;
                            } else {
                                org.telegram.ui.Cells.m3 m3Var2 = new org.telegram.ui.Cells.m3(context, c6Var);
                                m3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final r41 f31857b;

                                    {
                                        this.f31857b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = p3Var.getStickerSet();
                                                r41 r41Var = this.f31857b;
                                                s41 s41Var2 = r41Var.f32178x;
                                                LongSparseArray longSparseArray = s41Var2.d;
                                                LongSparseArray longSparseArray2 = s41Var2.f32483e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f22419id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f22419id) < 0) {
                                                    if (p3Var.f24966r) {
                                                        longSparseArray2.put(stickerSet.set.f22419id, stickerSet);
                                                        s41Var2.f32481b.h(stickerSet);
                                                        return;
                                                    }
                                                    r41Var.F(stickerSet, p3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.m3 m3Var3 = (org.telegram.ui.Cells.m3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = m3Var3.getStickerSet();
                                                r41 r41Var2 = this.f31857b;
                                                s41 s41Var3 = r41Var2.f32178x;
                                                LongSparseArray longSparseArray3 = s41Var3.d;
                                                LongSparseArray longSparseArray4 = s41Var3.f32483e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f22419id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f22419id) < 0) {
                                                    if (m3Var3.f24693s) {
                                                        longSparseArray4.put(stickerSet2.set.f22419id, stickerSet2);
                                                        s41Var3.f32481b.h(stickerSet2);
                                                        return;
                                                    }
                                                    r41Var2.F(stickerSet2, m3Var3);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                m3Var2.getImageView().setLayerNum(3);
                                m3Var = m3Var2;
                            }
                        } else {
                            m3Var = new org.telegram.ui.Cells.s3(context, c6Var);
                        }
                    } else {
                        m3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.p3 p3Var = new org.telegram.ui.Cells.p3(17, this.f32171c, s41Var.L, true, true);
                    p3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final r41 f31857b;

                        {
                            this.f31857b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.p3 p3Var2 = (org.telegram.ui.Cells.p3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = p3Var2.getStickerSet();
                                    r41 r41Var = this.f31857b;
                                    s41 s41Var2 = r41Var.f32178x;
                                    LongSparseArray longSparseArray = s41Var2.d;
                                    LongSparseArray longSparseArray2 = s41Var2.f32483e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f22419id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f22419id) < 0) {
                                        if (p3Var2.f24966r) {
                                            longSparseArray2.put(stickerSet.set.f22419id, stickerSet);
                                            s41Var2.f32481b.h(stickerSet);
                                            return;
                                        }
                                        r41Var.F(stickerSet, p3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.m3 m3Var3 = (org.telegram.ui.Cells.m3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = m3Var3.getStickerSet();
                                    r41 r41Var2 = this.f31857b;
                                    s41 s41Var3 = r41Var2.f32178x;
                                    LongSparseArray longSparseArray3 = s41Var3.d;
                                    LongSparseArray longSparseArray4 = s41Var3.f32483e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f22419id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f22419id) < 0) {
                                        if (m3Var3.f24693s) {
                                            longSparseArray4.put(stickerSet2.set.f22419id, stickerSet2);
                                            s41Var3.f32481b.h(stickerSet2);
                                            return;
                                        }
                                        r41Var2.F(stickerSet2, m3Var3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    m3Var = p3Var;
                }
            } else {
                m3Var = new org.telegram.ui.Cells.i3(context);
            }
        } else {
            vy vyVar = new vy(2, context, c6Var, false);
            vyVar.getImageView().setLayerNum(3);
            m3Var = vyVar;
        }
        return new f2.n1(m3Var);
    }
}
