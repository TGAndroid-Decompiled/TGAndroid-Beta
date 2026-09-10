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
public final class q51 extends ul0 {
    public final Context f26319c;
    public boolean f26322r;
    public boolean f26323s;
    public int f26324w;
    public final r51 f26325x;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f26320f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f26321n = new ArrayList();
    public int v = 5;

    public q51(r51 r51Var, Context context) {
        this.f26325x = r51Var;
        this.f26319c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 5) {
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
        r51 r51Var = this.f26325x;
        LongSparseArray longSparseArray = r51Var.e;
        LongSparseArray longSparseArray2 = r51Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = r51Var.f26591c;
        int i11 = r51Var.f26589a;
        MediaDataController mediaDataController = MediaDataController.getInstance(i11);
        int i12 = this.f26324w;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
            if (unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.f17222id))) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.f17222id);
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
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(i11).getStickerSetById(stickerSetCoveredArr[i13].set.f17222id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i13] = null;
                    } else if (stickerSetCoveredArr[i13].set.f17222id == stickerSetCovered2.set.f17222id) {
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
        boolean isStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.f17222id);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f17222id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f17222id) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && isStickerPackInstalled) {
            longSparseArray2.remove(stickerSetCovered2.set.f17222id);
            z13 = false;
        } else if (z14 && !isStickerPackInstalled) {
            longSparseArray.remove(stickerSetCovered2.set.f17222id);
        }
        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view;
        r3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        if (!z12 && z13) {
            z15 = true;
        } else {
            z15 = false;
        }
        r3Var.b(z15, z10);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z16 = true;
                r3Var.setNeedDivider(z16);
            }
        }
        z16 = false;
        r3Var.setNeedDivider(z16);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r10, android.widget.FrameLayout r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q51.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i10;
        r51 r51Var = this.f26325x;
        int measuredWidth = r51Var.getMeasuredWidth();
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
            this.v = max;
            i51 i51Var = r51Var.f26594r;
            if (i51Var.J != max) {
                i51Var.y1(max);
                r51Var.J = false;
            }
        }
        if (r51Var.J) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f26320f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.f26324w = 0;
        MediaDataController mediaDataController = MediaDataController.getInstance(r51Var.f26589a);
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
        int size = arrayList2.size();
        arrayList2.addAll(this.f26321n);
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
                    int i14 = this.f26324w;
                    this.f26324w = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f26324w, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f26324w));
                int i15 = this.f26324w;
                this.f26324w = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.v);
                    for (int i17 = 0; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.f26324w + i17, stickerSetCovered.covers.get(i17));
                    }
                } else {
                    sparseArray.put(this.f26324w, stickerSetCovered.cover);
                }
                int i18 = 0;
                while (true) {
                    i10 = this.v * i13;
                    if (i18 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.f26324w + i18, stickerSetCovered);
                    i18++;
                }
                this.f26324w = i10 + this.f26324w;
                i12 = i16;
            }
            i11++;
        }
        if (this.f26324w != 0) {
            r51Var.J = true;
            r51Var.K = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
        }
        l();
    }

    @Override
    public final int h() {
        return this.f26324w + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.f26324w) {
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
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
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
        ((org.telegram.ui.Cells.g8) view).d((TLRPC.Document) this.d.get(i10), null, this.f26320f.get(i10), null, false, false);
    }

    @Override
    public final void w(s4.c1 c1Var, int i10, List list) {
        if (list.contains(0)) {
            int i11 = c1Var.f41613f;
            if (i11 != 2 && i11 != 5) {
                return;
            }
            E(c1Var.f41610a, i10, true);
            return;
        }
        v(c1Var, i10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o3 o3Var;
        r51 r51Var = this.f26325x;
        org.telegram.ui.ActionBar.f6 f6Var = r51Var.P;
        Context context = this.f26319c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                o3Var = null;
                            } else {
                                org.telegram.ui.Cells.o3 o3Var2 = new org.telegram.ui.Cells.o3(context, f6Var);
                                o3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final q51 f26042b;

                                    {
                                        this.f26042b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = r3Var.getStickerSet();
                                                q51 q51Var = this.f26042b;
                                                r51 r51Var2 = q51Var.f26325x;
                                                LongSparseArray longSparseArray = r51Var2.d;
                                                LongSparseArray longSparseArray2 = r51Var2.e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f17222id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f17222id) < 0) {
                                                    if (r3Var.f19889r) {
                                                        longSparseArray2.put(stickerSet.set.f17222id, stickerSet);
                                                        r51Var2.f26590b.h(stickerSet);
                                                        return;
                                                    }
                                                    q51Var.F(stickerSet, r3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.o3 o3Var3 = (org.telegram.ui.Cells.o3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = o3Var3.getStickerSet();
                                                q51 q51Var2 = this.f26042b;
                                                r51 r51Var3 = q51Var2.f26325x;
                                                LongSparseArray longSparseArray3 = r51Var3.d;
                                                LongSparseArray longSparseArray4 = r51Var3.e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f17222id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f17222id) < 0) {
                                                    if (o3Var3.f19634s) {
                                                        longSparseArray4.put(stickerSet2.set.f17222id, stickerSet2);
                                                        r51Var3.f26590b.h(stickerSet2);
                                                        return;
                                                    }
                                                    q51Var2.F(stickerSet2, o3Var3);
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
                            o3Var = new org.telegram.ui.Cells.u3(context, f6Var);
                        }
                    } else {
                        o3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(17, this.f26319c, r51Var.P, true, true);
                    r3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final q51 f26042b;

                        {
                            this.f26042b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.r3 r3Var2 = (org.telegram.ui.Cells.r3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = r3Var2.getStickerSet();
                                    q51 q51Var = this.f26042b;
                                    r51 r51Var2 = q51Var.f26325x;
                                    LongSparseArray longSparseArray = r51Var2.d;
                                    LongSparseArray longSparseArray2 = r51Var2.e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f17222id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f17222id) < 0) {
                                        if (r3Var2.f19889r) {
                                            longSparseArray2.put(stickerSet.set.f17222id, stickerSet);
                                            r51Var2.f26590b.h(stickerSet);
                                            return;
                                        }
                                        q51Var.F(stickerSet, r3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.o3 o3Var3 = (org.telegram.ui.Cells.o3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = o3Var3.getStickerSet();
                                    q51 q51Var2 = this.f26042b;
                                    r51 r51Var3 = q51Var2.f26325x;
                                    LongSparseArray longSparseArray3 = r51Var3.d;
                                    LongSparseArray longSparseArray4 = r51Var3.e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f17222id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f17222id) < 0) {
                                        if (o3Var3.f19634s) {
                                            longSparseArray4.put(stickerSet2.set.f17222id, stickerSet2);
                                            r51Var3.f26590b.h(stickerSet2);
                                            return;
                                        }
                                        q51Var2.F(stickerSet2, o3Var3);
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
            fg.g2 g2Var = new fg.g2(3, context, f6Var, false);
            g2Var.getImageView().setLayerNum(3);
            o3Var = g2Var;
        }
        return new s4.c1(o3Var);
    }
}
