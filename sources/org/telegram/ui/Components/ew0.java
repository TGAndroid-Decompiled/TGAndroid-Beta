package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class ew0 extends bk0 {
    public final Context f34811c;
    public int d;
    public final SparseArray f34812e = new SparseArray();
    public final SparseArray f34813f = new SparseArray();
    public int h;
    public int f34814n;
    public final iw0 f34815r;

    public ew0(iw0 iw0Var, Context context) {
        this.f34815r = iw0Var;
        this.f34811c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i7) {
        iw0 iw0Var = this.f34815r;
        if (iw0Var.R1 != null) {
            Object obj = this.f34812e.get(i7);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = iw0Var.N1;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i7) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void f() {
        List list;
        int i7;
        int i10;
        iw0 iw0Var = this.f34815r;
        int i11 = 0;
        if (iw0Var.R1 != null) {
            int measuredWidth = iw0Var.n1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.f24118q.x;
            }
            int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            this.d = L;
            iw0Var.H1.y1(L);
            SparseArray sparseArray = this.f34812e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f34813f;
            sparseArray2.clear();
            this.h = 0;
            this.f34814n = 0;
            for (int i12 = 0; i12 < iw0Var.R1.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) iw0Var.R1.get(i12);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f34814n++;
                    sparseArray2.put(this.h, stickerSetCovered);
                    int i13 = this.h;
                    this.h = i13 + 1;
                    sparseArray.put(i13, Integer.valueOf(i12));
                    int i14 = this.h / this.d;
                    if (!list.isEmpty()) {
                        i7 = (int) Math.ceil(list.size() / this.d);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            sparseArray.put(this.h + i15, list.get(i15));
                        }
                    } else {
                        sparseArray.put(this.h, stickerSetCovered.cover);
                        i7 = 1;
                    }
                    int i16 = 0;
                    while (true) {
                        i10 = this.d * i7;
                        if (i16 >= i10) {
                            break;
                        }
                        sparseArray2.put(this.h + i16, stickerSetCovered);
                        i16++;
                    }
                    this.h = i10 + this.h;
                }
            }
        } else {
            ArrayList arrayList = iw0Var.T1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = iw0Var.N1;
                if (tL_messages_stickerSet != null) {
                    i11 = tL_messages_stickerSet.documents.size();
                }
                this.h = i11;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = iw0Var.N1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = iw0Var.N1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override
    public final void s(int i7) {
        ArrayList arrayList = this.f34815r.T1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i7);
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.f59123a;
        iw0 iw0Var = this.f34815r;
        ArrayList arrayList = iw0Var.R1;
        if (arrayList != null) {
            int i10 = f1Var.f59127f;
            SparseArray sparseArray = this.f34812e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ((org.telegram.ui.Cells.v3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((org.telegram.ui.Cells.n3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
                return;
            }
            ((org.telegram.ui.Cells.a8) view).d((TLRPC.Document) sparseArray.get(i7), null, this.f34813f.get(i7), null, false, false);
        } else if (iw0Var.S1 != null) {
            ((org.telegram.ui.Cells.a8) view).setSticker((org.telegram.messenger.sy) iw0Var.T1.get(i7));
        } else if (f1Var.f59127f != 3) {
            org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = iw0Var.N1;
            if (tL_messages_stickerSet != null) {
                a8Var.d(tL_messages_stickerSet.documents.get(i7), null, iw0Var.N1, null, iw0Var.f36235c2, iw0Var.M1);
                a8Var.K.setOnClickListener(new y7(26, this, a8Var));
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        iw0 iw0Var = this.f34815r;
        Context context = this.f34811c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        frameLayout2 = null;
                    } else {
                        org.telegram.ui.ActionBar.i6 i6Var = iw0Var.J0;
                        ?? frameLayout3 = new FrameLayout(context);
                        frameLayout3.f34190a = i6Var;
                        View view = new View(context);
                        frameLayout3.f34192c = view;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i10 = org.telegram.ui.ActionBar.n6.Ef;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
                        frameLayout3.f34191b = d02;
                        Drawable g10 = i5.c.g(context, 2131231080);
                        org.telegram.ui.ActionBar.u6.x(frameLayout3, g10, i10, i6Var, PorterDuff.Mode.MULTIPLY);
                        mq mqVar = new mq(d02, g10);
                        int L2 = org.telegram.messenger.g0.L(56.0f);
                        int L3 = org.telegram.messenger.g0.L(56.0f);
                        mqVar.h = L2;
                        mqVar.f37612n = L3;
                        int L4 = org.telegram.messenger.g0.L(24.0f);
                        int L5 = org.telegram.messenger.g0.L(24.0f);
                        mqVar.f37610e = L4;
                        mqVar.f37611f = L5;
                        view.setBackground(mqVar);
                        c8.ra.a(view);
                        frameLayout3.addView(view, c8.ma.e(56, 56, 17));
                        frameLayout = frameLayout3;
                    }
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.v3(8, this.f34811c, iw0Var.J0, true, false);
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.n3(context);
            }
            return new v4.f1(frameLayout2);
        }
        dw0 dw0Var = new dw0(this, context, iw0Var.J0);
        dw0Var.getImageView().E0(7);
        frameLayout = dw0Var;
        frameLayout2 = frameLayout;
        return new v4.f1(frameLayout2);
    }
}
