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
public final class p61 extends mm0 {
    public final Context f31510c;
    public boolean f31513r;
    public boolean f31514s;
    public int f31515w;
    public final q61 f31516x;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f31511f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f31512n = new ArrayList();
    public int v = 5;

    public p61(q61 q61Var, Context context) {
        this.f31516x = q61Var;
        this.f31510c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 5) {
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
        q61 q61Var = this.f31516x;
        LongSparseArray longSparseArray = q61Var.e;
        LongSparseArray longSparseArray2 = q61Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = q61Var.f31805c;
        int i11 = q61Var.f31803a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.f31515w;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f22055id))) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f22055id);
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
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.f22055id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i13] = null;
                    } else if (stickerSetCoveredArr[i13].set.f22055id == stickerSetCovered2.set.f22055id) {
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
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.f22055id);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f22055id) >= 0) {
            z14 = z12;
        } else {
            z14 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f22055id) >= 0) {
            z15 = z12;
        } else {
            z15 = false;
        }
        if (z14 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.f22055id);
            z14 = false;
        } else if (z15 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.f22055id);
        }
        org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view;
        q3Var.c(stickerSetCovered2, z11, z10, 0, 0, z13);
        if (!z13 && z14) {
            z16 = z12;
        } else {
            z16 = false;
        }
        q3Var.b(z16, z10);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z17 = z12;
                q3Var.setNeedDivider(z17);
            }
        }
        z17 = false;
        q3Var.setNeedDivider(z17);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, android.widget.FrameLayout r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p61.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i10;
        q61 q61Var = this.f31516x;
        int measuredWidth = q61Var.getMeasuredWidth();
        int i11 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            h61 h61Var = q61Var.f31808r;
            if (h61Var.J != max) {
                h61Var.z1(max);
                q61Var.J = false;
            }
        }
        if (q61Var.J) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f31511f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.f31515w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(q61Var.f31803a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.f31512n);
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
                    int i15 = this.f31515w;
                    this.f31515w = i15 + 1;
                    sparseArray.put(i15, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f31515w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f31515w));
                int i16 = this.f31515w;
                this.f31515w = i16 + 1;
                int i17 = i13 + 1;
                sparseArray.put(i16, Integer.valueOf(i13));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i14 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i18 = i11; i18 < stickerSetCovered.covers.size(); i18++) {
                        sparseArray.put(this.f31515w + i18, stickerSetCovered.covers.get(i18));
                    }
                } else {
                    sparseArray.put(this.f31515w, stickerSetCovered.cover);
                }
                int i19 = 0;
                while (true) {
                    i10 = this.v * i14;
                    if (i19 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.f31515w + i19, stickerSetCovered);
                    i19++;
                }
                this.f31515w = i10 + this.f31515w;
                i13 = i17;
            }
            i12++;
            i11 = 0;
        }
        if (this.f31515w != 0) {
            q61Var.J = true;
            q61Var.K = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f31515w + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.f31515w) {
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.z3) view).setText(LocaleController.getString(R.string.OtherStickers));
                        return;
                    }
                }
                E(view, i10, false);
                return;
            }
            ((org.telegram.ui.Cells.i3) view).setHeight(AndroidUtilities.dp(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.i8) view).d((TLRPC.Document) this.d.get(i10), null, this.f31511f.get(i10), null, false, false);
    }

    @Override
    public final void w(s4.e1 e1Var, int i10, List list) {
        if (list.contains(0)) {
            int i11 = e1Var.f47776f;
            if (i11 != 2 && i11 != 5) {
                return;
            }
            E(e1Var.f47773a, i10, true);
            return;
        }
        v(e1Var, i10);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m3 m3Var;
        q61 q61Var = this.f31516x;
        org.telegram.ui.ActionBar.u6 u6Var = q61Var.P;
        Context context = this.f31510c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                m3Var = null;
                            } else {
                                org.telegram.ui.Cells.m3 m3Var2 = new org.telegram.ui.Cells.m3(context, u6Var);
                                m3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final p61 f31205b;

                                    {
                                        this.f31205b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.q3 q3Var = (org.telegram.ui.Cells.q3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = q3Var.getStickerSet();
                                                p61 p61Var = this.f31205b;
                                                q61 q61Var2 = p61Var.f31516x;
                                                LongSparseArray longSparseArray = q61Var2.d;
                                                LongSparseArray longSparseArray2 = q61Var2.e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f22055id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f22055id) < 0) {
                                                    if (q3Var.f24826r) {
                                                        longSparseArray2.put(stickerSet.set.f22055id, stickerSet);
                                                        q61Var2.f31804b.h(stickerSet);
                                                        return;
                                                    }
                                                    p61Var.F(stickerSet, q3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.m3 m3Var3 = (org.telegram.ui.Cells.m3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = m3Var3.getStickerSet();
                                                p61 p61Var2 = this.f31205b;
                                                q61 q61Var3 = p61Var2.f31516x;
                                                LongSparseArray longSparseArray3 = q61Var3.d;
                                                LongSparseArray longSparseArray4 = q61Var3.e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f22055id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f22055id) < 0) {
                                                    if (m3Var3.v) {
                                                        longSparseArray4.put(stickerSet2.set.f22055id, stickerSet2);
                                                        q61Var3.f31804b.h(stickerSet2);
                                                        return;
                                                    }
                                                    p61Var2.F(stickerSet2, m3Var3);
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
                            m3Var = new org.telegram.ui.Cells.z3(context, u6Var);
                        }
                    } else {
                        m3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.q3 q3Var = new org.telegram.ui.Cells.q3(17, this.f31510c, q61Var.P, true, true);
                    q3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final p61 f31205b;

                        {
                            this.f31205b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.q3 q3Var2 = (org.telegram.ui.Cells.q3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = q3Var2.getStickerSet();
                                    p61 p61Var = this.f31205b;
                                    q61 q61Var2 = p61Var.f31516x;
                                    LongSparseArray longSparseArray = q61Var2.d;
                                    LongSparseArray longSparseArray2 = q61Var2.e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f22055id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f22055id) < 0) {
                                        if (q3Var2.f24826r) {
                                            longSparseArray2.put(stickerSet.set.f22055id, stickerSet);
                                            q61Var2.f31804b.h(stickerSet);
                                            return;
                                        }
                                        p61Var.F(stickerSet, q3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.m3 m3Var3 = (org.telegram.ui.Cells.m3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = m3Var3.getStickerSet();
                                    p61 p61Var2 = this.f31205b;
                                    q61 q61Var3 = p61Var2.f31516x;
                                    LongSparseArray longSparseArray3 = q61Var3.d;
                                    LongSparseArray longSparseArray4 = q61Var3.e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f22055id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f22055id) < 0) {
                                        if (m3Var3.v) {
                                            longSparseArray4.put(stickerSet2.set.f22055id, stickerSet2);
                                            q61Var3.f31804b.h(stickerSet2);
                                            return;
                                        }
                                        p61Var2.F(stickerSet2, m3Var3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    m3Var = q3Var;
                }
            } else {
                m3Var = new org.telegram.ui.Cells.i3(context);
            }
        } else {
            ig.c2 c2Var = new ig.c2(3, context, u6Var, false);
            c2Var.getImageView().setLayerNum(3);
            m3Var = c2Var;
        }
        return new s4.e1(m3Var);
    }
}
