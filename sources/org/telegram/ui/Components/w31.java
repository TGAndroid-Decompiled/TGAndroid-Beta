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
public final class w31 extends tj0 {
    public final Context f41243c;
    public boolean f41247r;
    public boolean f41248s;
    public int f41250x;
    public final x31 f41251y;
    public final SparseArray d = new SparseArray();
    public final ArrayList f41244e = new ArrayList();
    public final SparseArray f41245f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f41246n = new ArrayList();
    public int f41249w = 5;

    public w31(x31 x31Var, Context context) {
        this.f41251y = x31Var;
        this.f41243c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 5) {
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
        x31 x31Var = this.f41251y;
        LongSparseArray longSparseArray = x31Var.f41547e;
        LongSparseArray longSparseArray2 = x31Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = x31Var.f41546c;
        int i10 = x31Var.f41544a;
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i10);
        int i11 = this.f41250x;
        ArrayList arrayList = this.f41244e;
        SparseArray sparseArray = this.d;
        if (i7 < i11) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue());
            ArrayList arrayList2 = b02.f26505v0[0];
            if (arrayList2 != null && arrayList2.contains(Long.valueOf(stickerSetCovered.set.f28078id))) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                b02.e1(stickerSetCovered.set.f28078id);
            }
            z11 = z17;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue());
            z11 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        b02.p1(stickerSetCovered2);
        int i12 = 0;
        while (true) {
            if (i12 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i12] != null) {
                    TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.si.b0(i10).o0(stickerSetCoveredArr[i12].set.f28078id);
                    if (o02 != null && !o02.set.archived) {
                        stickerSetCoveredArr[i12] = null;
                    } else if (stickerSetCoveredArr[i12].set.f28078id == stickerSetCovered2.set.f28078id) {
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
        boolean B0 = b02.B0(stickerSetCovered2.set.f28078id, true);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f28078id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f28078id) >= 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && B0) {
            longSparseArray2.remove(stickerSetCovered2.set.f28078id);
            z13 = false;
        } else if (z14 && !B0) {
            longSparseArray.remove(stickerSetCovered2.set.f28078id);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w31.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i7;
        x31 x31Var = this.f41251y;
        int measuredWidth = x31Var.getMeasuredWidth();
        int i10 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / org.telegram.messenger.g0.L(72.0f));
            this.f41249w = max;
            o31 o31Var = x31Var.f41550r;
            if (o31Var.J != max) {
                o31Var.y1(max);
                x31Var.K = false;
            }
        }
        if (x31Var.K) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f41245f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.f41244e;
        arrayList.clear();
        this.f41250x = 0;
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(x31Var.f41544a);
        ArrayList arrayList2 = new ArrayList(b02.f26501t0[0]);
        int size = arrayList2.size();
        arrayList2.addAll(this.f41246n);
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
                    int i14 = this.f41250x;
                    this.f41250x = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f41250x, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f41250x));
                int i15 = this.f41250x;
                this.f41250x = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.f41249w);
                    for (int i17 = i10; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.f41250x + i17, stickerSetCovered.covers.get(i17));
                    }
                } else {
                    sparseArray.put(this.f41250x, stickerSetCovered.cover);
                }
                int i18 = 0;
                while (true) {
                    i7 = this.f41249w * i13;
                    if (i18 >= i7) {
                        break;
                    }
                    sparseArray2.put(this.f41250x + i18, stickerSetCovered);
                    i18++;
                }
                this.f41250x = i7 + this.f41250x;
                i12 = i16;
            }
            i11++;
            i10 = 0;
        }
        if (this.f41250x != 0) {
            x31Var.K = true;
            x31Var.L = b02.X();
        }
        f();
    }

    @Override
    public final int b() {
        return this.f41250x + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == this.f41250x) {
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
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.M0(2131747764, null));
                        return;
                    }
                }
                E(i7, view, false);
                return;
            }
            ((org.telegram.ui.Cells.m3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.y7) view).d((TLRPC.Document) this.d.get(i7), null, this.f41245f.get(i7), null, false, false);
    }

    @Override
    public final void v(v4.e1 e1Var, int i7, List list) {
        if (list.contains(0)) {
            int i10 = e1Var.f58539f;
            if (i10 != 2 && i10 != 5) {
                return;
            }
            E(i7, e1Var.f58535a, true);
            return;
        }
        t(e1Var, i7);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.q3 q3Var;
        x31 x31Var = this.f41251y;
        org.telegram.ui.ActionBar.e6 e6Var = x31Var.Q;
        Context context = this.f41243c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                q3Var = null;
                            } else {
                                org.telegram.ui.Cells.q3 q3Var2 = new org.telegram.ui.Cells.q3(context, e6Var);
                                q3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final w31 f40251b;

                                    {
                                        this.f40251b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                                                w31 w31Var = this.f40251b;
                                                x31 x31Var2 = w31Var.f41251y;
                                                LongSparseArray longSparseArray = x31Var2.d;
                                                LongSparseArray longSparseArray2 = x31Var2.f41547e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f28078id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f28078id) < 0) {
                                                    if (u3Var.f31720r) {
                                                        longSparseArray2.put(stickerSet.set.f28078id, stickerSet);
                                                        x31Var2.f41545b.h(stickerSet);
                                                        return;
                                                    }
                                                    w31Var.F(stickerSet, u3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.q3 q3Var3 = (org.telegram.ui.Cells.q3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = q3Var3.getStickerSet();
                                                w31 w31Var2 = this.f40251b;
                                                x31 x31Var3 = w31Var2.f41251y;
                                                LongSparseArray longSparseArray3 = x31Var3.d;
                                                LongSparseArray longSparseArray4 = x31Var3.f41547e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f28078id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f28078id) < 0) {
                                                    if (q3Var3.f31270w) {
                                                        longSparseArray4.put(stickerSet2.set.f28078id, stickerSet2);
                                                        x31Var3.f41545b.h(stickerSet2);
                                                        return;
                                                    }
                                                    w31Var2.F(stickerSet2, q3Var3);
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
                    org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(17, this.f41243c, x31Var.Q, true, true);
                    u3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final w31 f40251b;

                        {
                            this.f40251b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.u3 u3Var2 = (org.telegram.ui.Cells.u3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = u3Var2.getStickerSet();
                                    w31 w31Var = this.f40251b;
                                    x31 x31Var2 = w31Var.f41251y;
                                    LongSparseArray longSparseArray = x31Var2.d;
                                    LongSparseArray longSparseArray2 = x31Var2.f41547e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f28078id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f28078id) < 0) {
                                        if (u3Var2.f31720r) {
                                            longSparseArray2.put(stickerSet.set.f28078id, stickerSet);
                                            x31Var2.f41545b.h(stickerSet);
                                            return;
                                        }
                                        w31Var.F(stickerSet, u3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.q3 q3Var3 = (org.telegram.ui.Cells.q3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = q3Var3.getStickerSet();
                                    w31 w31Var2 = this.f40251b;
                                    x31 x31Var3 = w31Var2.f41251y;
                                    LongSparseArray longSparseArray3 = x31Var3.d;
                                    LongSparseArray longSparseArray4 = x31Var3.f41547e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f28078id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f28078id) < 0) {
                                        if (q3Var3.f31270w) {
                                            longSparseArray4.put(stickerSet2.set.f28078id, stickerSet2);
                                            x31Var3.f41545b.h(stickerSet2);
                                            return;
                                        }
                                        w31Var2.F(stickerSet2, q3Var3);
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
            jg.b2 b2Var = new jg.b2(3, context, e6Var, false);
            b2Var.getImageView().E0(3);
            q3Var = b2Var;
        }
        return new v4.e1(q3Var);
    }
}
