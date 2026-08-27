package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class i41 extends yk0 {

    public final Context f29217c;

    public boolean f29221r;

    public boolean f29222s;

    public int f29223w;

    public final j41 f29224x;
    public final SparseArray d = new SparseArray();

    public final ArrayList f29218e = new ArrayList();

    public final SparseArray f29219f = new SparseArray();
    public final HashMap h = new HashMap();

    public final ArrayList f29220n = new ArrayList();
    public int v = 5;

    public i41(j41 j41Var, Context context) {
        this.f29224x = j41Var;
        this.f29217c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 5;
    }

    public final void E(View view, int i10, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        j41 j41Var = this.f29224x;
        LongSparseArray longSparseArray = j41Var.f29583e;
        LongSparseArray longSparseArray2 = j41Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = j41Var.f29582c;
        int i11 = j41Var.f29580a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.f29223w;
        ArrayList arrayList = this.f29218e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            boolean z14 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f22407id));
            if (z14) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f22407id);
            }
            z11 = z14;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        mediaDataController.preloadStickerSetThumb(stickerSetCovered2);
        int i13 = 0;
        while (true) {
            if (i13 >= stickerSetCoveredArr.length) {
                z12 = false;
                break;
            }
            if (stickerSetCoveredArr[i13] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.f22407id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i13] = null;
                } else if (stickerSetCoveredArr[i13].set.f22407id == stickerSetCovered2.set.f22407id) {
                    z12 = true;
                    break;
                }
            }
            i13++;
        }
        boolean zIsStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.f22407id);
        boolean z15 = longSparseArray2.indexOfKey(stickerSetCovered2.set.f22407id) >= 0;
        boolean z16 = longSparseArray.indexOfKey(stickerSetCovered2.set.f22407id) >= 0;
        if (z15 && zIsStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.f22407id);
            z15 = false;
        } else if (z16 && !zIsStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.f22407id);
        }
        org.telegram.ui.Cells.p3 p3Var = (org.telegram.ui.Cells.p3) view;
        p3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        p3Var.b(!z12 && z15, z10);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        p3Var.setNeedDivider(z13);
    }

    public final void F(TLRPC.StickerSetCovered stickerSetCovered, FrameLayout frameLayout) {
        boolean z10;
        j41 j41Var = this.f29224x;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = j41Var.f29582c;
        for (int i10 = 0; i10 < stickerSetCoveredArr.length; i10++) {
            if (stickerSetCoveredArr[i10] != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(j41Var.f29580a).getStickerSetById(stickerSetCoveredArr[i10].set.f22407id);
                if (stickerSetById != null && !stickerSetById.set.archived) {
                    stickerSetCoveredArr[i10] = null;
                    break;
                } else if (stickerSetCoveredArr[i10].set.f22407id == stickerSetCovered.set.f22407id) {
                    return;
                }
            }
        }
        int i11 = 0;
        while (true) {
            if (i11 >= stickerSetCoveredArr.length) {
                z10 = false;
                break;
            } else {
                if (stickerSetCoveredArr[i11] == null) {
                    stickerSetCoveredArr[i11] = stickerSetCovered;
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        if (!z10 && frameLayout != null) {
            if (frameLayout instanceof org.telegram.ui.Cells.m3) {
                ((org.telegram.ui.Cells.m3) frameLayout).f24671e.a(true, true);
            } else if (frameLayout instanceof org.telegram.ui.Cells.p3) {
                ((org.telegram.ui.Cells.p3) frameLayout).b(true, true);
            }
        }
        j41Var.d.put(stickerSetCovered.set.f22407id, stickerSetCovered);
        if (frameLayout != null) {
            j41Var.f29581b.g(stickerSetCovered, z10);
            return;
        }
        SparseArray sparseArray = this.f29219f;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) sparseArray.get(i12);
            if (stickerSetCovered2 != null && stickerSetCovered2.set.f22407id == stickerSetCovered.set.f22407id) {
                n(i12, 0);
                return;
            }
        }
    }

    public final void G() {
        int i10;
        j41 j41Var = this.f29224x;
        int measuredWidth = j41Var.getMeasuredWidth();
        if (measuredWidth != 0) {
            int iMax = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = iMax;
            a41 a41Var = j41Var.f29586r;
            if (a41Var.J != iMax) {
                a41Var.y1(iMax);
                j41Var.F = false;
            }
        }
        if (j41Var.F) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f29219f;
        sparseArray2.clear();
        HashMap map = this.h;
        map.clear();
        ArrayList arrayList = this.f29218e;
        arrayList.clear();
        this.f29223w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(j41Var.f29580a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.f29220n);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iCeil = 1;
            if (i11 >= arrayList2.size()) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i11);
            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                if (i11 == size) {
                    int i13 = this.f29223w;
                    this.f29223w = i13 + 1;
                    sparseArray.put(i13, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f29223w, stickerSetCovered);
                map.put(stickerSetCovered, Integer.valueOf(this.f29223w));
                int i14 = this.f29223w;
                this.f29223w = i14 + 1;
                int i15 = i12 + 1;
                sparseArray.put(i14, Integer.valueOf(i12));
                if (stickerSetCovered.covers.isEmpty()) {
                    sparseArray.put(this.f29223w, stickerSetCovered.cover);
                } else {
                    iCeil = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i16 = 0; i16 < stickerSetCovered.covers.size(); i16++) {
                        sparseArray.put(this.f29223w + i16, stickerSetCovered.covers.get(i16));
                    }
                }
                int i17 = 0;
                while (true) {
                    i10 = this.v * iCeil;
                    if (i17 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.f29223w + i17, stickerSetCovered);
                    i17++;
                }
                this.f29223w = i10 + this.f29223w;
                i12 = i15;
            }
            i11++;
        }
        if (this.f29223w != 0) {
            j41Var.F = true;
            j41Var.G = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f29223w + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.f29223w) {
            return 3;
        }
        Object obj = this.d.get(i10);
        if (obj == null) {
            return 1;
        }
        if (obj instanceof TLRPC.Document) {
            return 0;
        }
        return obj.equals(-1) ? 4 : 2;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.a8) view).d((TLRPC.Document) this.d.get(i10), null, this.f29219f.get(i10), null, false, false);
        } else {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.i3) view).setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            if (i11 != 2) {
                if (i11 == 4) {
                    ((org.telegram.ui.Cells.s3) view).setText(LocaleController.getString(R.string.OtherStickers));
                    return;
                } else if (i11 != 5) {
                    return;
                }
            }
            E(view, i10, false);
        }
    }

    @Override
    public final void w(f2.o1 o1Var, int i10, List list) {
        if (!list.contains(0)) {
            v(o1Var, i10);
            return;
        }
        int i11 = o1Var.f5793f;
        if (i11 == 2 || i11 == 5) {
            E(o1Var.f5789a, i10, true);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View i3Var;
        j41 j41Var = this.f29224x;
        org.telegram.ui.ActionBar.c6 c6Var = j41Var.L;
        Context context = this.f29217c;
        if (i10 == 0) {
            oy oyVar = new oy(2, context, c6Var, false);
            oyVar.getImageView().setLayerNum(3);
            i3Var = oyVar;
        } else if (i10 == 1) {
            i3Var = new org.telegram.ui.Cells.i3(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.p3 p3Var = new org.telegram.ui.Cells.p3(17, this.f29217c, j41Var.L, true, true);
            final int i11 = 0;
            p3Var.setAddOnClickListener(new View.OnClickListener(this) {

                public final i41 f28929b;

                {
                    this.f28929b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            org.telegram.ui.Cells.p3 p3Var2 = (org.telegram.ui.Cells.p3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = p3Var2.getStickerSet();
                            i41 i41Var = this.f28929b;
                            j41 j41Var2 = i41Var.f29224x;
                            LongSparseArray longSparseArray = j41Var2.d;
                            LongSparseArray longSparseArray2 = j41Var2.f29583e;
                            if (longSparseArray.indexOfKey(stickerSet.set.f22407id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f22407id) < 0) {
                                if (!p3Var2.f24975r) {
                                    i41Var.F(stickerSet, p3Var2);
                                } else {
                                    longSparseArray2.put(stickerSet.set.f22407id, stickerSet);
                                    j41Var2.f29581b.h(stickerSet);
                                }
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = m3Var.getStickerSet();
                            i41 i41Var2 = this.f28929b;
                            j41 j41Var3 = i41Var2.f29224x;
                            LongSparseArray longSparseArray3 = j41Var3.d;
                            LongSparseArray longSparseArray4 = j41Var3.f29583e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.f22407id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f22407id) < 0) {
                                if (!m3Var.f24675s) {
                                    i41Var2.F(stickerSet2, m3Var);
                                } else {
                                    longSparseArray4.put(stickerSet2.set.f22407id, stickerSet2);
                                    j41Var3.f29581b.h(stickerSet2);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            i3Var = p3Var;
        } else if (i10 == 3) {
            i3Var = new View(context);
        } else if (i10 == 4) {
            i3Var = new org.telegram.ui.Cells.s3(context, c6Var);
        } else if (i10 != 5) {
            i3Var = null;
        } else {
            org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, c6Var);
            final int i12 = 1;
            m3Var.setAddOnClickListener(new View.OnClickListener(this) {

                public final i41 f28929b;

                {
                    this.f28929b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            org.telegram.ui.Cells.p3 p3Var2 = (org.telegram.ui.Cells.p3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet = p3Var2.getStickerSet();
                            i41 i41Var = this.f28929b;
                            j41 j41Var2 = i41Var.f29224x;
                            LongSparseArray longSparseArray = j41Var2.d;
                            LongSparseArray longSparseArray2 = j41Var2.f29583e;
                            if (longSparseArray.indexOfKey(stickerSet.set.f22407id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f22407id) < 0) {
                                if (!p3Var2.f24975r) {
                                    i41Var.F(stickerSet, p3Var2);
                                } else {
                                    longSparseArray2.put(stickerSet.set.f22407id, stickerSet);
                                    j41Var2.f29581b.h(stickerSet);
                                }
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.Cells.m3 m3Var2 = (org.telegram.ui.Cells.m3) view.getParent();
                            TLRPC.StickerSetCovered stickerSet2 = m3Var2.getStickerSet();
                            i41 i41Var2 = this.f28929b;
                            j41 j41Var3 = i41Var2.f29224x;
                            LongSparseArray longSparseArray3 = j41Var3.d;
                            LongSparseArray longSparseArray4 = j41Var3.f29583e;
                            if (longSparseArray3.indexOfKey(stickerSet2.set.f22407id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f22407id) < 0) {
                                if (!m3Var2.f24675s) {
                                    i41Var2.F(stickerSet2, m3Var2);
                                } else {
                                    longSparseArray4.put(stickerSet2.set.f22407id, stickerSet2);
                                    j41Var3.f29581b.h(stickerSet2);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            m3Var.getImageView().setLayerNum(3);
            i3Var = m3Var;
        }
        return new lk0(i3Var);
    }
}
