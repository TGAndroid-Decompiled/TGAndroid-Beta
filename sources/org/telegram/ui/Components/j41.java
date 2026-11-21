package org.telegram.ui.Components;

import android.content.Context;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class j41 extends dk0 {
    public final Context f36399c;
    public boolean f36403r;
    public boolean f36404s;
    public int f36406x;
    public final k41 f36407y;
    public final SparseArray d = new SparseArray();
    public final ArrayList f36400e = new ArrayList();
    public final SparseArray f36401f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f36402n = new ArrayList();
    public int f36405w = 5;

    public j41(k41 k41Var, Context context) {
        this.f36407y = k41Var;
        this.f36399c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59165f == 5) {
            return true;
        }
        return false;
    }

    public final void E(int i7, View view, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        k41 k41Var = this.f36407y;
        LongSparseArray longSparseArray = k41Var.f36768e;
        LongSparseArray longSparseArray2 = k41Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = k41Var.f36767c;
        int i10 = k41Var.f36765a;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i10);
        int i11 = this.f36406x;
        ArrayList arrayList = this.f36400e;
        SparseArray sparseArray = this.d;
        if (i7 < i11) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue());
            ArrayList arrayList2 = d02.f26671v0[0];
            if (arrayList2 != null && arrayList2.contains(Long.valueOf(stickerSetCovered.set.f28458id))) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                d02.h1(stickerSetCovered.set.f28458id);
            }
            z11 = z17;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        d02.s1(stickerSetCovered2);
        int i12 = 0;
        while (true) {
            if (i12 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i12] != null) {
                    TLRPC.TL_messages_stickerSet q02 = org.telegram.messenger.ri.d0(i10).q0(stickerSetCoveredArr[i12].set.f28458id);
                    if (q02 != null && !q02.set.archived) {
                        stickerSetCoveredArr[i12] = null;
                    } else if (stickerSetCoveredArr[i12].set.f28458id == stickerSetCovered2.set.f28458id) {
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
        boolean E0 = d02.E0(stickerSetCovered2.set.f28458id, true);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f28458id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f28458id) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && E0) {
            longSparseArray2.remove(stickerSetCovered2.set.f28458id);
            z13 = false;
        } else if (z14 && !E0) {
            longSparseArray.remove(stickerSetCovered2.set.f28458id);
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        v3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        if (!z12 && z13) {
            z15 = true;
        } else {
            z15 = false;
        }
        v3Var.b(z15, z10);
        if (i7 > 0) {
            int i13 = i7 - 1;
            if (sparseArray.get(i13) == null || !sparseArray.get(i13).equals(-1)) {
                z16 = true;
                v3Var.setNeedDivider(z16);
            }
        }
        z16 = false;
        v3Var.setNeedDivider(z16);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, android.widget.FrameLayout r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j41.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i7;
        k41 k41Var = this.f36407y;
        int measuredWidth = k41Var.getMeasuredWidth();
        int i10 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / org.telegram.messenger.g0.L(72.0f));
            this.f36405w = max;
            b41 b41Var = k41Var.f36771r;
            if (b41Var.J != max) {
                b41Var.y1(max);
                k41Var.K = false;
            }
        }
        if (k41Var.K) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f36401f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.f36400e;
        arrayList.clear();
        this.f36406x = 0;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(k41Var.f36765a);
        ArrayList arrayList2 = new ArrayList(d02.f26667t0[0]);
        int size = arrayList2.size();
        arrayList2.addAll(this.f36402n);
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
                    int i14 = this.f36406x;
                    this.f36406x = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f36406x, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f36406x));
                int i15 = this.f36406x;
                this.f36406x = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.f36405w);
                    for (int i17 = i10; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.f36406x + i17, stickerSetCovered.covers.get(i17));
                    }
                } else {
                    sparseArray.put(this.f36406x, stickerSetCovered.cover);
                }
                int i18 = 0;
                while (true) {
                    i7 = this.f36405w * i13;
                    if (i18 >= i7) {
                        break;
                    }
                    sparseArray2.put(this.f36406x + i18, stickerSetCovered);
                    i18++;
                }
                this.f36406x = i7 + this.f36406x;
                i12 = i16;
            }
            i11++;
            i10 = 0;
        }
        if (this.f36406x != 0) {
            k41Var.K = true;
            k41Var.L = d02.Z();
        }
        f();
    }

    @Override
    public final int b() {
        return this.f36406x + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == this.f36406x) {
            return 3;
        }
        Object obj = this.d.get(i7);
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
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f59165f;
        View view = f1Var.f59161a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.N0(2131747570, null));
                        return;
                    }
                }
                E(i7, view, false);
                return;
            }
            ((org.telegram.ui.Cells.n3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.a8) view).d((TLRPC.Document) this.d.get(i7), null, this.f36401f.get(i7), null, false, false);
    }

    @Override
    public final void v(v4.f1 f1Var, int i7, List list) {
        if (list.contains(0)) {
            int i10 = f1Var.f59165f;
            if (i10 != 2 && i10 != 5) {
                return;
            }
            E(i7, f1Var.f59161a, true);
            return;
        }
        t(f1Var, i7);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.r3 r3Var;
        k41 k41Var = this.f36407y;
        org.telegram.ui.ActionBar.h6 h6Var = k41Var.Q;
        Context context = this.f36399c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                r3Var = null;
                            } else {
                                org.telegram.ui.Cells.r3 r3Var2 = new org.telegram.ui.Cells.r3(context, h6Var);
                                r3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final j41 f36146b;

                                    {
                                        this.f36146b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                                                j41 j41Var = this.f36146b;
                                                k41 k41Var2 = j41Var.f36407y;
                                                LongSparseArray longSparseArray = k41Var2.d;
                                                LongSparseArray longSparseArray2 = k41Var2.f36768e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f28458id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f28458id) < 0) {
                                                    if (v3Var.f32190r) {
                                                        longSparseArray2.put(stickerSet.set.f28458id, stickerSet);
                                                        k41Var2.f36766b.h(stickerSet);
                                                        return;
                                                    }
                                                    j41Var.F(stickerSet, v3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.r3 r3Var3 = (org.telegram.ui.Cells.r3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = r3Var3.getStickerSet();
                                                j41 j41Var2 = this.f36146b;
                                                k41 k41Var3 = j41Var2.f36407y;
                                                LongSparseArray longSparseArray3 = k41Var3.d;
                                                LongSparseArray longSparseArray4 = k41Var3.f36768e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f28458id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f28458id) < 0) {
                                                    if (r3Var3.f31720w) {
                                                        longSparseArray4.put(stickerSet2.set.f28458id, stickerSet2);
                                                        k41Var3.f36766b.h(stickerSet2);
                                                        return;
                                                    }
                                                    j41Var2.F(stickerSet2, r3Var3);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                r3Var2.getImageView().setLayerNum(3);
                                r3Var = r3Var2;
                            }
                        } else {
                            r3Var = new org.telegram.ui.Cells.y3(context, h6Var);
                        }
                    } else {
                        r3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(17, this.f36399c, k41Var.Q, true, true);
                    v3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final j41 f36146b;

                        {
                            this.f36146b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.v3 v3Var2 = (org.telegram.ui.Cells.v3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = v3Var2.getStickerSet();
                                    j41 j41Var = this.f36146b;
                                    k41 k41Var2 = j41Var.f36407y;
                                    LongSparseArray longSparseArray = k41Var2.d;
                                    LongSparseArray longSparseArray2 = k41Var2.f36768e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f28458id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f28458id) < 0) {
                                        if (v3Var2.f32190r) {
                                            longSparseArray2.put(stickerSet.set.f28458id, stickerSet);
                                            k41Var2.f36766b.h(stickerSet);
                                            return;
                                        }
                                        j41Var.F(stickerSet, v3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.r3 r3Var3 = (org.telegram.ui.Cells.r3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = r3Var3.getStickerSet();
                                    j41 j41Var2 = this.f36146b;
                                    k41 k41Var3 = j41Var2.f36407y;
                                    LongSparseArray longSparseArray3 = k41Var3.d;
                                    LongSparseArray longSparseArray4 = k41Var3.f36768e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f28458id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f28458id) < 0) {
                                        if (r3Var3.f31720w) {
                                            longSparseArray4.put(stickerSet2.set.f28458id, stickerSet2);
                                            k41Var3.f36766b.h(stickerSet2);
                                            return;
                                        }
                                        j41Var2.F(stickerSet2, r3Var3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    r3Var = v3Var;
                }
            } else {
                r3Var = new org.telegram.ui.Cells.n3(context);
            }
        } else {
            jg.b2 b2Var = new jg.b2(3, context, h6Var, false);
            b2Var.getImageView().E0(3);
            r3Var = b2Var;
        }
        return new v4.f1(r3Var);
    }
}
