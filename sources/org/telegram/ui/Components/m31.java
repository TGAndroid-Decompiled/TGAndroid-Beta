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
public final class m31 extends sj0 {
    public final Context f35989c;
    public boolean f35993r;
    public boolean f35994s;
    public int f35996x;
    public final n31 f35997y;
    public final SparseArray d = new SparseArray();
    public final ArrayList f35990e = new ArrayList();
    public final SparseArray f35991f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f35992n = new ArrayList();
    public int f35995w = 5;

    public m31(n31 n31Var, Context context) {
        this.f35997y = n31Var;
        this.f35989c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 5) {
            return true;
        }
        return false;
    }

    public final void E(int i3, View view, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        n31 n31Var = this.f35997y;
        LongSparseArray longSparseArray = n31Var.f36357e;
        LongSparseArray longSparseArray2 = n31Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = n31Var.f36356c;
        int i10 = n31Var.f36354a;
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i10);
        int i11 = this.f35996x;
        ArrayList arrayList = this.f35990e;
        SparseArray sparseArray = this.d;
        if (i3 < i11) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i3)).intValue());
            ArrayList arrayList2 = b02.f24055v0[0];
            if (arrayList2 != null && arrayList2.contains(Long.valueOf(stickerSetCovered.set.f27028id))) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                b02.e1(stickerSetCovered.set.f27028id);
            }
            z11 = z17;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i3)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        b02.p1(stickerSetCovered2);
        int i12 = 0;
        while (true) {
            if (i12 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i12] != null) {
                    TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.li.b0(i10).o0(stickerSetCoveredArr[i12].set.f27028id);
                    if (o02 != null && !o02.set.archived) {
                        stickerSetCoveredArr[i12] = null;
                    } else if (stickerSetCoveredArr[i12].set.f27028id == stickerSetCovered2.set.f27028id) {
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
        boolean B0 = b02.B0(stickerSetCovered2.set.f27028id, true);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f27028id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f27028id) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && B0) {
            longSparseArray2.remove(stickerSetCovered2.set.f27028id);
            z13 = false;
        } else if (z14 && !B0) {
            longSparseArray.remove(stickerSetCovered2.set.f27028id);
        }
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        u3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        if (!z12 && z13) {
            z15 = true;
        } else {
            z15 = false;
        }
        u3Var.b(z15, z10);
        if (i3 > 0) {
            int i13 = i3 - 1;
            if (sparseArray.get(i13) == null || !sparseArray.get(i13).equals(-1)) {
                z16 = true;
                u3Var.setNeedDivider(z16);
            }
        }
        z16 = false;
        u3Var.setNeedDivider(z16);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, android.widget.FrameLayout r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m31.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i3;
        n31 n31Var = this.f35997y;
        int measuredWidth = n31Var.getMeasuredWidth();
        int i10 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / org.telegram.messenger.g0.L(72.0f));
            this.f35995w = max;
            e31 e31Var = n31Var.f36360r;
            if (e31Var.J != max) {
                e31Var.y1(max);
                n31Var.K = false;
            }
        }
        if (n31Var.K) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f35991f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.f35990e;
        arrayList.clear();
        this.f35996x = 0;
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(n31Var.f36354a);
        ArrayList arrayList2 = new ArrayList(b02.f24051t0[0]);
        int size = arrayList2.size();
        arrayList2.addAll(this.f35992n);
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
                    int i14 = this.f35996x;
                    this.f35996x = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f35996x, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f35996x));
                int i15 = this.f35996x;
                this.f35996x = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.f35995w);
                    for (int i17 = i10; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.f35996x + i17, stickerSetCovered.covers.get(i17));
                    }
                } else {
                    sparseArray.put(this.f35996x, stickerSetCovered.cover);
                }
                int i18 = 0;
                while (true) {
                    i3 = this.f35995w * i13;
                    if (i18 >= i3) {
                        break;
                    }
                    sparseArray2.put(this.f35996x + i18, stickerSetCovered);
                    i18++;
                }
                this.f35996x = i3 + this.f35996x;
                i12 = i16;
            }
            i11++;
            i10 = 0;
        }
        if (this.f35996x != 0) {
            n31Var.K = true;
            n31Var.L = b02.X();
        }
        f();
    }

    @Override
    public final int b() {
        return this.f35996x + 1;
    }

    @Override
    public final int d(int i3) {
        if (i3 == this.f35996x) {
            return 3;
        }
        Object obj = this.d.get(i3);
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
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.M0(2131747772, null));
                        return;
                    }
                }
                E(i3, view, false);
                return;
            }
            ((org.telegram.ui.Cells.m3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.y7) view).d((TLRPC.Document) this.d.get(i3), null, this.f35991f.get(i3), null, false, false);
    }

    @Override
    public final void v(u4.d1 d1Var, int i3, List list) {
        if (list.contains(0)) {
            int i10 = d1Var.f55544f;
            if (i10 != 2 && i10 != 5) {
                return;
            }
            E(i3, d1Var.f55540a, true);
            return;
        }
        t(d1Var, i3);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.q3 q3Var;
        n31 n31Var = this.f35997y;
        org.telegram.ui.ActionBar.e6 e6Var = n31Var.Q;
        Context context = this.f35989c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                q3Var = null;
                            } else {
                                org.telegram.ui.Cells.q3 q3Var2 = new org.telegram.ui.Cells.q3(context, e6Var);
                                q3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final m31 f35592b;

                                    {
                                        this.f35592b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                                                m31 m31Var = this.f35592b;
                                                n31 n31Var2 = m31Var.f35997y;
                                                LongSparseArray longSparseArray = n31Var2.d;
                                                LongSparseArray longSparseArray2 = n31Var2.f36357e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f27028id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f27028id) < 0) {
                                                    if (u3Var.f30644r) {
                                                        longSparseArray2.put(stickerSet.set.f27028id, stickerSet);
                                                        n31Var2.f36355b.h(stickerSet);
                                                        return;
                                                    }
                                                    m31Var.F(stickerSet, u3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.q3 q3Var3 = (org.telegram.ui.Cells.q3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = q3Var3.getStickerSet();
                                                m31 m31Var2 = this.f35592b;
                                                n31 n31Var3 = m31Var2.f35997y;
                                                LongSparseArray longSparseArray3 = n31Var3.d;
                                                LongSparseArray longSparseArray4 = n31Var3.f36357e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f27028id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f27028id) < 0) {
                                                    if (q3Var3.f30194w) {
                                                        longSparseArray4.put(stickerSet2.set.f27028id, stickerSet2);
                                                        n31Var3.f36355b.h(stickerSet2);
                                                        return;
                                                    }
                                                    m31Var2.F(stickerSet2, q3Var3);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                q3Var2.getImageView().setLayerNum(3);
                                q3Var = q3Var2;
                            }
                        } else {
                            q3Var = new org.telegram.ui.Cells.x3(context, e6Var);
                        }
                    } else {
                        q3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(17, this.f35989c, n31Var.Q, true, true);
                    u3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final m31 f35592b;

                        {
                            this.f35592b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.u3 u3Var2 = (org.telegram.ui.Cells.u3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = u3Var2.getStickerSet();
                                    m31 m31Var = this.f35592b;
                                    n31 n31Var2 = m31Var.f35997y;
                                    LongSparseArray longSparseArray = n31Var2.d;
                                    LongSparseArray longSparseArray2 = n31Var2.f36357e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f27028id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f27028id) < 0) {
                                        if (u3Var2.f30644r) {
                                            longSparseArray2.put(stickerSet.set.f27028id, stickerSet);
                                            n31Var2.f36355b.h(stickerSet);
                                            return;
                                        }
                                        m31Var.F(stickerSet, u3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.q3 q3Var3 = (org.telegram.ui.Cells.q3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = q3Var3.getStickerSet();
                                    m31 m31Var2 = this.f35592b;
                                    n31 n31Var3 = m31Var2.f35997y;
                                    LongSparseArray longSparseArray3 = n31Var3.d;
                                    LongSparseArray longSparseArray4 = n31Var3.f36357e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f27028id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f27028id) < 0) {
                                        if (q3Var3.f30194w) {
                                            longSparseArray4.put(stickerSet2.set.f27028id, stickerSet2);
                                            n31Var3.f36355b.h(stickerSet2);
                                            return;
                                        }
                                        m31Var2.F(stickerSet2, q3Var3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    q3Var = u3Var;
                }
            } else {
                q3Var = new org.telegram.ui.Cells.m3(context);
            }
        } else {
            kg.x1 x1Var = new kg.x1(3, context, e6Var, false);
            x1Var.getImageView().E0(3);
            q3Var = x1Var;
        }
        return new u4.d1(q3Var);
    }
}
