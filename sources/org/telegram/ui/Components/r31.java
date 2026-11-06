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
public final class r31 extends oj0 {
    public final Context f37522c;
    public boolean f37526r;
    public boolean f37527s;
    public int f37529x;
    public final s31 f37530y;
    public final SparseArray d = new SparseArray();
    public final ArrayList f37523e = new ArrayList();
    public final SparseArray f37524f = new SparseArray();
    public final HashMap h = new HashMap();
    public final ArrayList f37525n = new ArrayList();
    public int f37528w = 5;

    public r31(s31 s31Var, Context context) {
        this.f37530y = s31Var;
        this.f37522c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56956f == 5) {
            return true;
        }
        return false;
    }

    public final void E(int i7, View view, boolean z9) {
        TLRPC.StickerSetCovered stickerSetCovered;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        s31 s31Var = this.f37530y;
        LongSparseArray longSparseArray = s31Var.f37870e;
        LongSparseArray longSparseArray2 = s31Var.d;
        TLRPC.StickerSetCovered[] stickerSetCoveredArr = s31Var.f37869c;
        int i10 = s31Var.f37867a;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
        int i11 = this.f37529x;
        ArrayList arrayList = this.f37523e;
        SparseArray sparseArray = this.d;
        if (i7 < i11) {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue());
            ArrayList arrayList2 = b02.f25833u0[0];
            if (arrayList2 != null && arrayList2.contains(Long.valueOf(stickerSetCovered.set.f26979id))) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                b02.e1(stickerSetCovered.set.f26979id);
            }
            z10 = z16;
        } else {
            stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue());
            z10 = false;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
        b02.p1(stickerSetCovered2);
        int i12 = 0;
        while (true) {
            if (i12 < stickerSetCoveredArr.length) {
                if (stickerSetCoveredArr[i12] != null) {
                    TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ui.b0(i10).o0(stickerSetCoveredArr[i12].set.f26979id);
                    if (o02 != null && !o02.set.archived) {
                        stickerSetCoveredArr[i12] = null;
                    } else if (stickerSetCoveredArr[i12].set.f26979id == stickerSetCovered2.set.f26979id) {
                        z11 = true;
                        break;
                    }
                }
                i12++;
            } else {
                z11 = false;
                break;
            }
        }
        boolean B0 = b02.B0(stickerSetCovered2.set.f26979id, true);
        if (longSparseArray2.indexOfKey(stickerSetCovered2.set.f26979id) >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (longSparseArray.indexOfKey(stickerSetCovered2.set.f26979id) >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 && B0) {
            longSparseArray2.remove(stickerSetCovered2.set.f26979id);
            z12 = false;
        } else if (z13 && !B0) {
            longSparseArray.remove(stickerSetCovered2.set.f26979id);
        }
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        u3Var.c(stickerSetCovered2, z10, z9, 0, 0, z11);
        if (!z11 && z12) {
            z14 = true;
        } else {
            z14 = false;
        }
        u3Var.b(z14, z9);
        if (i7 > 0) {
            int i13 = i7 - 1;
            if (sparseArray.get(i13) == null || !sparseArray.get(i13).equals(-1)) {
                z15 = true;
                u3Var.setNeedDivider(z15);
            }
        }
        z15 = false;
        u3Var.setNeedDivider(z15);
    }

    public final void F(org.telegram.tgnet.TLRPC.StickerSetCovered r9, android.widget.FrameLayout r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r31.F(org.telegram.tgnet.TLRPC$StickerSetCovered, android.widget.FrameLayout):void");
    }

    public final void G() {
        int i7;
        s31 s31Var = this.f37530y;
        int measuredWidth = s31Var.getMeasuredWidth();
        int i10 = 0;
        if (measuredWidth != 0) {
            int max = Math.max(5, measuredWidth / org.telegram.messenger.g0.L(72.0f));
            this.f37528w = max;
            i31 i31Var = s31Var.f37873r;
            if (i31Var.J != max) {
                i31Var.y1(max);
                s31Var.J = false;
            }
        }
        if (s31Var.J) {
            return;
        }
        SparseArray sparseArray = this.d;
        sparseArray.clear();
        SparseArray sparseArray2 = this.f37524f;
        sparseArray2.clear();
        HashMap hashMap = this.h;
        hashMap.clear();
        ArrayList arrayList = this.f37523e;
        arrayList.clear();
        this.f37529x = 0;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(s31Var.f37867a);
        ArrayList arrayList2 = new ArrayList(b02.f25829s0[0]);
        int size = arrayList2.size();
        arrayList2.addAll(this.f37525n);
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
                    int i14 = this.f37529x;
                    this.f37529x = i14 + 1;
                    sparseArray.put(i14, -1);
                }
                arrayList.add(stickerSetCovered);
                sparseArray2.put(this.f37529x, stickerSetCovered);
                hashMap.put(stickerSetCovered, Integer.valueOf(this.f37529x));
                int i15 = this.f37529x;
                this.f37529x = i15 + 1;
                int i16 = i12 + 1;
                sparseArray.put(i15, Integer.valueOf(i12));
                if (!stickerSetCovered.covers.isEmpty()) {
                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / this.f37528w);
                    for (int i17 = i10; i17 < stickerSetCovered.covers.size(); i17++) {
                        sparseArray.put(this.f37529x + i17, stickerSetCovered.covers.get(i17));
                    }
                } else {
                    sparseArray.put(this.f37529x, stickerSetCovered.cover);
                }
                int i18 = 0;
                while (true) {
                    i7 = this.f37528w * i13;
                    if (i18 >= i7) {
                        break;
                    }
                    sparseArray2.put(this.f37529x + i18, stickerSetCovered);
                    i18++;
                }
                this.f37529x = i7 + this.f37529x;
                i12 = i16;
            }
            i11++;
            i10 = 0;
        }
        if (this.f37529x != 0) {
            s31Var.J = true;
            s31Var.K = b02.X();
        }
        f();
    }

    @Override
    public final int b() {
        return this.f37529x + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == this.f37529x) {
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
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f56956f;
        View view = d1Var.f56952a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return;
                        }
                    } else {
                        ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.M0(2131747763, null));
                        return;
                    }
                }
                E(i7, view, false);
                return;
            }
            ((org.telegram.ui.Cells.m3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
            return;
        }
        ((org.telegram.ui.Cells.z7) view).d((TLRPC.Document) this.d.get(i7), null, this.f37524f.get(i7), null, false, false);
    }

    @Override
    public final void v(v4.d1 d1Var, int i7, List list) {
        if (list.contains(0)) {
            int i10 = d1Var.f56956f;
            if (i10 != 2 && i10 != 5) {
                return;
            }
            E(i7, d1Var.f56952a, true);
            return;
        }
        t(d1Var, i7);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.q3 q3Var;
        s31 s31Var = this.f37530y;
        org.telegram.ui.ActionBar.f6 f6Var = s31Var.P;
        Context context = this.f37522c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                q3Var = null;
                            } else {
                                org.telegram.ui.Cells.q3 q3Var2 = new org.telegram.ui.Cells.q3(context, f6Var);
                                q3Var2.setAddOnClickListener(new View.OnClickListener(this) {
                                    public final r31 f36779b;

                                    {
                                        this.f36779b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (r2) {
                                            case 0:
                                                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                                                r31 r31Var = this.f36779b;
                                                s31 s31Var2 = r31Var.f37530y;
                                                LongSparseArray longSparseArray = s31Var2.d;
                                                LongSparseArray longSparseArray2 = s31Var2.f37870e;
                                                if (longSparseArray.indexOfKey(stickerSet.set.f26979id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f26979id) < 0) {
                                                    if (u3Var.f30567r) {
                                                        longSparseArray2.put(stickerSet.set.f26979id, stickerSet);
                                                        s31Var2.f37868b.h(stickerSet);
                                                        return;
                                                    }
                                                    r31Var.F(stickerSet, u3Var);
                                                    return;
                                                }
                                                return;
                                            default:
                                                org.telegram.ui.Cells.q3 q3Var3 = (org.telegram.ui.Cells.q3) view.getParent();
                                                TLRPC.StickerSetCovered stickerSet2 = q3Var3.getStickerSet();
                                                r31 r31Var2 = this.f36779b;
                                                s31 s31Var3 = r31Var2.f37530y;
                                                LongSparseArray longSparseArray3 = s31Var3.d;
                                                LongSparseArray longSparseArray4 = s31Var3.f37870e;
                                                if (longSparseArray3.indexOfKey(stickerSet2.set.f26979id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f26979id) < 0) {
                                                    if (q3Var3.f30117w) {
                                                        longSparseArray4.put(stickerSet2.set.f26979id, stickerSet2);
                                                        s31Var3.f37868b.h(stickerSet2);
                                                        return;
                                                    }
                                                    r31Var2.F(stickerSet2, q3Var3);
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
                            q3Var = new org.telegram.ui.Cells.x3(context, f6Var);
                        }
                    } else {
                        q3Var = new View(context);
                    }
                } else {
                    org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(17, this.f37522c, s31Var.P, true, true);
                    u3Var.setAddOnClickListener(new View.OnClickListener(this) {
                        public final r31 f36779b;

                        {
                            this.f36779b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.u3 u3Var2 = (org.telegram.ui.Cells.u3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet = u3Var2.getStickerSet();
                                    r31 r31Var = this.f36779b;
                                    s31 s31Var2 = r31Var.f37530y;
                                    LongSparseArray longSparseArray = s31Var2.d;
                                    LongSparseArray longSparseArray2 = s31Var2.f37870e;
                                    if (longSparseArray.indexOfKey(stickerSet.set.f26979id) < 0 && longSparseArray2.indexOfKey(stickerSet.set.f26979id) < 0) {
                                        if (u3Var2.f30567r) {
                                            longSparseArray2.put(stickerSet.set.f26979id, stickerSet);
                                            s31Var2.f37868b.h(stickerSet);
                                            return;
                                        }
                                        r31Var.F(stickerSet, u3Var2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.Cells.q3 q3Var3 = (org.telegram.ui.Cells.q3) view.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = q3Var3.getStickerSet();
                                    r31 r31Var2 = this.f36779b;
                                    s31 s31Var3 = r31Var2.f37530y;
                                    LongSparseArray longSparseArray3 = s31Var3.d;
                                    LongSparseArray longSparseArray4 = s31Var3.f37870e;
                                    if (longSparseArray3.indexOfKey(stickerSet2.set.f26979id) < 0 && longSparseArray4.indexOfKey(stickerSet2.set.f26979id) < 0) {
                                        if (q3Var3.f30117w) {
                                            longSparseArray4.put(stickerSet2.set.f26979id, stickerSet2);
                                            s31Var3.f37868b.h(stickerSet2);
                                            return;
                                        }
                                        r31Var2.F(stickerSet2, q3Var3);
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
            jg.c2 c2Var = new jg.c2(3, context, f6Var, false);
            c2Var.getImageView().E0(3);
            q3Var = c2Var;
        }
        return new v4.d1(q3Var);
    }
}
