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
public final class g41 extends bk0 {
    public final Context f35327c;
    public boolean f35331r;
    public boolean f35332s;
    public int f35334x;
    public final h41 f35335y;
    public final SparseArray d = new SparseArray();
    public final ArrayList f35328e = new ArrayList();
    public final SparseArray f35329f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f35330n = new ArrayList();
    public int f35333w = 5;

    public g41(h41 h41Var, Context context) {
        this.f35335y = h41Var;
        this.f35327c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59126f == 5) {
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
        h41 h41Var = this.f35335y;
        LongSparseArray longSparseArray = h41Var.f35717e;
        LongSparseArray longSparseArray2 = h41Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = h41Var.f35716c;
        int i10 = h41Var.f35714a;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i10);
        int i11 = this.f35334x;
        ArrayList arrayList = this.f35328e;
        SparseArray sparseArray = this.d;
        if (i7 < i11) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue());
            ArrayList arrayList2 = d02.f26645v0[0];
            if (arrayList2 != null && arrayList2.contains(Long.valueOf(stickerSetCovered.set.f28432id))) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                d02.h1(stickerSetCovered.set.f28432id);
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
                    TLRPC.TL_messages_stickerSet q02 = org.telegram.messenger.ri.d0(i10).q0(stickerSetCoveredArr[i12].set.f28432id);
                    if (q02 != null && !q02.set.archived) {
                        stickerSetCoveredArr[i12] = null;
                    } else if (stickerSetCoveredArr[i12].set.f28432id == stickerSetCovered2.set.f28432id) {
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
        boolean E0 = d02.E0(stickerSetCovered2.set.f28432id, true);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f28432id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f28432id) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && E0) {
            longSparseArray2.remove(stickerSetCovered2.set.f28432id);
            z13 = false;
        } else if (z14 && !E0) {
            longSparseArray.remove(stickerSetCovered2.set.f28432id);
        }
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        u3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        if (!z12 && z13) {
            z15 = true;
        } else {
            z15 = false;
        }
        u3Var.b(z15, z10);
        if (i7 > 0) {
            int i13 = i7 - 1;
            if (sparseArray.get(i13) == null || !sparseArray.get(i13).equals(-1)) {
                z16 = true;
                u3Var.setNeedDivider(z16);
            }
        }
        z16 = false;
        u3Var.setNeedDivider(z16);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, android.widget.FrameLayout r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g41.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i7;
        h41 h41Var = this.f35335y;
        int measuredWidth = h41Var.getMeasuredWidth();
        int i10 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / org.telegram.messenger.g0.L(72.0f));
            this.f35333w = max;
            y31 y31Var = h41Var.f35720r;
            if (y31Var.J != max) {
                y31Var.y1(max);
                h41Var.K = false;
            }
        }
        if (h41Var.K) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f35329f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.f35328e;
        arrayList.clear();
        this.f35334x = 0;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(h41Var.f35714a);
        ArrayList arrayList2 = new ArrayList(d02.f26641t0[0]);
        int size = arrayList2.size();
        arrayList2.addAll(this.f35330n);
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
                    int i14 = this.f35334x;
                    this.f35334x = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f35334x, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f35334x));
                int i15 = this.f35334x;
                this.f35334x = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.f35333w);
                    for (int i17 = i10; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.f35334x + i17, stickerSetCovered.covers.get(i17));
                    }
                } else {
                    sparseArray.put(this.f35334x, stickerSetCovered.cover);
                }
                int i18 = 0;
                while (true) {
                    i7 = this.f35333w * i13;
                    if (i18 >= i7) {
                        break;
                    }
                    sparseArray2.put(this.f35334x + i18, stickerSetCovered);
                    i18++;
                }
                this.f35334x = i7 + this.f35334x;
                i12 = i16;
            }
            i11++;
            i10 = 0;
        }
        if (this.f35334x != 0) {
            h41Var.K = true;
            h41Var.L = d02.Z();
        }
        f();
    }

    @Override
    public final int b() {
        return this.f35334x + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == this.f35334x) {
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
        int i10 = f1Var.f59126f;
        View view = f1Var.f59122a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.gd.M0(2131747571, null));
                        return;
                    }
                }
                E(i7, view, false);
                return;
            }
            ((org.telegram.ui.Cells.m3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.z7) view).d((TLRPC.Document) this.d.get(i7), null, this.f35329f.get(i7), null, false, false);
    }

    @Override
    public final void v(v4.f1 f1Var, int i7, List list) {
        if (list.contains(0)) {
            int i10 = f1Var.f59126f;
            if (i10 != 2 && i10 != 5) {
                return;
            }
            E(i7, f1Var.f59122a, true);
            return;
        }
        t(f1Var, i7);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.q3 q3Var;
        h41 h41Var = this.f35335y;
        org.telegram.ui.ActionBar.i6 i6Var = h41Var.Q;
        Context context = this.f35327c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                q3Var = null;
                            } else {
                                org.telegram.ui.Cells.q3 q3Var2 = new org.telegram.ui.Cells.q3(context, i6Var);
                                q3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final g41 f34937b;

                                    {
                                        this.f34937b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                                                g41 g41Var = this.f34937b;
                                                h41 h41Var2 = g41Var.f35335y;
                                                LongSparseArray longSparseArray = h41Var2.d;
                                                LongSparseArray longSparseArray2 = h41Var2.f35717e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f28432id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f28432id) < 0) {
                                                    if (u3Var.f32105r) {
                                                        longSparseArray2.put(stickerSet.set.f28432id, stickerSet);
                                                        h41Var2.f35715b.h(stickerSet);
                                                        return;
                                                    }
                                                    g41Var.F(stickerSet, u3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.q3 q3Var3 = (org.telegram.ui.Cells.q3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = q3Var3.getStickerSet();
                                                g41 g41Var2 = this.f34937b;
                                                h41 h41Var3 = g41Var2.f35335y;
                                                LongSparseArray longSparseArray3 = h41Var3.d;
                                                LongSparseArray longSparseArray4 = h41Var3.f35717e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f28432id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f28432id) < 0) {
                                                    if (q3Var3.f31642w) {
                                                        longSparseArray4.put(stickerSet2.set.f28432id, stickerSet2);
                                                        h41Var3.f35715b.h(stickerSet2);
                                                        return;
                                                    }
                                                    g41Var2.F(stickerSet2, q3Var3);
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
                            q3Var = new org.telegram.ui.Cells.x3(context, i6Var);
                        }
                    } else {
                        q3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(17, this.f35327c, h41Var.Q, true, true);
                    u3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final g41 f34937b;

                        {
                            this.f34937b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.u3 u3Var2 = (org.telegram.ui.Cells.u3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = u3Var2.getStickerSet();
                                    g41 g41Var = this.f34937b;
                                    h41 h41Var2 = g41Var.f35335y;
                                    LongSparseArray longSparseArray = h41Var2.d;
                                    LongSparseArray longSparseArray2 = h41Var2.f35717e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f28432id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f28432id) < 0) {
                                        if (u3Var2.f32105r) {
                                            longSparseArray2.put(stickerSet.set.f28432id, stickerSet);
                                            h41Var2.f35715b.h(stickerSet);
                                            return;
                                        }
                                        g41Var.F(stickerSet, u3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.q3 q3Var3 = (org.telegram.ui.Cells.q3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = q3Var3.getStickerSet();
                                    g41 g41Var2 = this.f34937b;
                                    h41 h41Var3 = g41Var2.f35335y;
                                    LongSparseArray longSparseArray3 = h41Var3.d;
                                    LongSparseArray longSparseArray4 = h41Var3.f35717e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f28432id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f28432id) < 0) {
                                        if (q3Var3.f31642w) {
                                            longSparseArray4.put(stickerSet2.set.f28432id, stickerSet2);
                                            h41Var3.f35715b.h(stickerSet2);
                                            return;
                                        }
                                        g41Var2.F(stickerSet2, q3Var3);
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
            jg.b2 b2Var = new jg.b2(3, context, i6Var, false);
            b2Var.getImageView().E0(3);
            q3Var = b2Var;
        }
        return new v4.f1(q3Var);
    }
}
