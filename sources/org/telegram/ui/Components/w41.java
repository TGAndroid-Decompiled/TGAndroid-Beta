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
public final class w41 extends tk0 {
    public final Context f32075c;
    public boolean f32078r;
    public boolean f32079s;
    public int f32081x;
    public final x41 f32082y;
    public final SparseArray d = new SparseArray();
    public final ArrayList e = new ArrayList();
    public final SparseArray f32076f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f32077n = new ArrayList();
    public int f32080w = 5;

    public w41(x41 x41Var, Context context) {
        this.f32082y = x41Var;
        this.f32075c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 5) {
            return true;
        }
        return false;
    }

    public final void E(int i10, View view, boolean z10) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        x41 x41Var = this.f32082y;
        LongSparseArray longSparseArray = x41Var.e;
        LongSparseArray longSparseArray2 = x41Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = x41Var.f32413c;
        int i11 = x41Var.f32411a;
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(i11);
        int i12 = this.f32081x;
        ArrayList arrayList = this.e;
        SparseArray sparseArray = this.d;
        if (i10 < i12) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            ArrayList arrayList2 = b02.f18678u0[0];
            if (arrayList2 != null && arrayList2.contains(Long.valueOf(stickerSetCovered.set.f19821id))) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                b02.e1(stickerSetCovered.set.f19821id);
            }
            z11 = z17;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        b02.p1(stickerSetCovered2);
        int i13 = 0;
        while (true) {
            if (i13 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i13] != null) {
                    TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.vi.b0(i11).o0(stickerSetCoveredArr[i13].set.f19821id);
                    if (o02 != null && !o02.set.archived) {
                        stickerSetCoveredArr[i13] = null;
                    } else if (stickerSetCoveredArr[i13].set.f19821id == stickerSetCovered2.set.f19821id) {
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
        boolean B0 = b02.B0(stickerSetCovered2.set.f19821id, true);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f19821id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f19821id) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && B0) {
            longSparseArray2.remove(stickerSetCovered2.set.f19821id);
            z13 = false;
        } else if (z14 && !B0) {
            longSparseArray.remove(stickerSetCovered2.set.f19821id);
        }
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
        w3Var.c(stickerSetCovered2, z11, z10, 0, 0, z12);
        if (!z12 && z13) {
            z15 = true;
        } else {
            z15 = false;
        }
        w3Var.b(z15, z10);
        if (i10 > 0) {
            int i14 = i10 - 1;
            if (sparseArray.get(i14) == null || !sparseArray.get(i14).equals(-1)) {
                z16 = true;
                w3Var.setNeedDivider(z16);
            }
        }
        z16 = false;
        w3Var.setNeedDivider(z16);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, android.widget.FrameLayout r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w41.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i10;
        x41 x41Var = this.f32082y;
        int measuredWidth = x41Var.getMeasuredWidth();
        int i11 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / org.telegram.messenger.i0.L(72.0f));
            this.f32080w = max;
            n41 n41Var = x41Var.f32416r;
            if (n41Var.J != max) {
                n41Var.y1(max);
                x41Var.J = false;
            }
        }
        if (x41Var.J) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f32076f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.f32081x = 0;
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(x41Var.f32411a);
        ArrayList arrayList2 = new ArrayList(b02.f18674s0[0]);
        int size = arrayList2.size();
        arrayList2.addAll(this.f32077n);
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
                    int i15 = this.f32081x;
                    this.f32081x = i15 + 1;
                    sparseArray.put(i15, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f32081x, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f32081x));
                int i16 = this.f32081x;
                this.f32081x = i16 + 1;
                int i17 = i13 + 1;
                sparseArray.put(i16, Integer.valueOf(i13));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i14 = (int) Math.ceil(stickerSetCovered.covers.size() / this.f32080w);
                    for (int i18 = i11; i18 < stickerSetCovered.covers.size(); i18++) {
                        sparseArray.put(this.f32081x + i18, stickerSetCovered.covers.get(i18));
                    }
                } else {
                    sparseArray.put(this.f32081x, stickerSetCovered.cover);
                }
                int i19 = 0;
                while (true) {
                    i10 = this.f32080w * i14;
                    if (i19 >= i10) {
                        break;
                    }
                    sparseArray2.put(this.f32081x + i19, stickerSetCovered);
                    i19++;
                }
                this.f32081x = i10 + this.f32081x;
                i13 = i17;
            }
            i12++;
            i11 = 0;
        }
        if (this.f32081x != 0) {
            x41Var.J = true;
            x41Var.K = b02.X();
        }
        f();
    }

    @Override
    public final int b() {
        return this.f32081x + 1;
    }

    @Override
    public final int d(int i10) {
        if (i10 == this.f32081x) {
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
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.L0(2131747780, null));
                        return;
                    }
                }
                E(i10, view, false);
                return;
            }
            ((org.telegram.ui.Cells.o3) view).setHeight(org.telegram.messenger.i0.L(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) this.d.get(i10), null, this.f32076f.get(i10), null, false, false);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10, List list) {
        if (list.contains(0)) {
            int i11 = c1Var.f47912f;
            if (i11 != 2 && i11 != 5) {
                return;
            }
            E(i10, c1Var.f47909a, true);
            return;
        }
        t(c1Var, i10);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s3 s3Var;
        x41 x41Var = this.f32082y;
        org.telegram.ui.ActionBar.p6 p6Var = x41Var.P;
        Context context = this.f32075c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                s3Var = null;
                            } else {
                                org.telegram.ui.Cells.s3 s3Var2 = new org.telegram.ui.Cells.s3(context, p6Var);
                                s3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final w41 f30860b;

                                    {
                                        this.f30860b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = w3Var.getStickerSet();
                                                w41 w41Var = this.f30860b;
                                                x41 x41Var2 = w41Var.f32082y;
                                                LongSparseArray longSparseArray = x41Var2.d;
                                                LongSparseArray longSparseArray2 = x41Var2.e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f19821id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f19821id) < 0) {
                                                    if (w3Var.f23387r) {
                                                        longSparseArray2.put(stickerSet.set.f19821id, stickerSet);
                                                        x41Var2.f32412b.h(stickerSet);
                                                        return;
                                                    }
                                                    w41Var.F(stickerSet, w3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.s3 s3Var3 = (org.telegram.ui.Cells.s3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = s3Var3.getStickerSet();
                                                w41 w41Var2 = this.f30860b;
                                                x41 x41Var3 = w41Var2.f32082y;
                                                LongSparseArray longSparseArray3 = x41Var3.d;
                                                LongSparseArray longSparseArray4 = x41Var3.e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f19821id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f19821id) < 0) {
                                                    if (s3Var3.f23005w) {
                                                        longSparseArray4.put(stickerSet2.set.f19821id, stickerSet2);
                                                        x41Var3.f32412b.h(stickerSet2);
                                                        return;
                                                    }
                                                    w41Var2.F(stickerSet2, s3Var3);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                s3Var2.getImageView().setLayerNum(3);
                                s3Var = s3Var2;
                            }
                        } else {
                            s3Var = new org.telegram.ui.Cells.z3(context, p6Var);
                        }
                    } else {
                        s3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(17, this.f32075c, x41Var.P, true, true);
                    w3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final w41 f30860b;

                        {
                            this.f30860b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.w3 w3Var2 = (org.telegram.ui.Cells.w3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = w3Var2.getStickerSet();
                                    w41 w41Var = this.f30860b;
                                    x41 x41Var2 = w41Var.f32082y;
                                    LongSparseArray longSparseArray = x41Var2.d;
                                    LongSparseArray longSparseArray2 = x41Var2.e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f19821id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f19821id) < 0) {
                                        if (w3Var2.f23387r) {
                                            longSparseArray2.put(stickerSet.set.f19821id, stickerSet);
                                            x41Var2.f32412b.h(stickerSet);
                                            return;
                                        }
                                        w41Var.F(stickerSet, w3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.s3 s3Var3 = (org.telegram.ui.Cells.s3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = s3Var3.getStickerSet();
                                    w41 w41Var2 = this.f30860b;
                                    x41 x41Var3 = w41Var2.f32082y;
                                    LongSparseArray longSparseArray3 = x41Var3.d;
                                    LongSparseArray longSparseArray4 = x41Var3.e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f19821id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f19821id) < 0) {
                                        if (s3Var3.f23005w) {
                                            longSparseArray4.put(stickerSet2.set.f19821id, stickerSet2);
                                            x41Var3.f32412b.h(stickerSet2);
                                            return;
                                        }
                                        w41Var2.F(stickerSet2, s3Var3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    s3Var = w3Var;
                }
            } else {
                s3Var = new org.telegram.ui.Cells.o3(context);
            }
        } else {
            my myVar = new my(2, context, p6Var, false);
            myVar.getImageView().E0(3);
            s3Var = myVar;
        }
        return new s4.c1(s3Var);
    }
}
