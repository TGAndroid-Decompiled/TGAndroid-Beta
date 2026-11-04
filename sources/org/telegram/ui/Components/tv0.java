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
public final class tv0 extends sj0 {
    public final Context f38560c;
    public int d;
    public final SparseArray f38561e = new SparseArray();
    public final SparseArray f38562f = new SparseArray();
    public int h;
    public int f38563n;
    public final xv0 f38564r;

    public tv0(xv0 xv0Var, Context context) {
        this.f38564r = xv0Var;
        this.f38560c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i3) {
        xv0 xv0Var = this.f38564r;
        if (xv0Var.O1 != null) {
            Object obj = this.f38561e.get(i3);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv0Var.K1;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i3) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void f() {
        List list;
        int i3;
        int i10;
        xv0 xv0Var = this.f38564r;
        int i11 = 0;
        if (xv0Var.O1 != null) {
            int measuredWidth = xv0Var.k1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.f22608q.x;
            }
            int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            this.d = L;
            xv0Var.E1.y1(L);
            SparseArray sparseArray = this.f38561e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f38562f;
            sparseArray2.clear();
            this.h = 0;
            this.f38563n = 0;
            for (int i12 = 0; i12 < xv0Var.O1.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) xv0Var.O1.get(i12);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f38563n++;
                    sparseArray2.put(this.h, stickerSetCovered);
                    int i13 = this.h;
                    this.h = i13 + 1;
                    sparseArray.put(i13, Integer.valueOf(i12));
                    int i14 = this.h / this.d;
                    if (!list.isEmpty()) {
                        i3 = (int) Math.ceil(list.size() / this.d);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            sparseArray.put(this.h + i15, list.get(i15));
                        }
                    } else {
                        sparseArray.put(this.h, stickerSetCovered.cover);
                        i3 = 1;
                    }
                    int i16 = 0;
                    while (true) {
                        i10 = this.d * i3;
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
            ArrayList arrayList = xv0Var.Q1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv0Var.K1;
                if (tL_messages_stickerSet != null) {
                    i11 = tL_messages_stickerSet.documents.size();
                }
                this.h = i11;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xv0Var.K1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = xv0Var.K1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override
    public final void s(int i3) {
        ArrayList arrayList = this.f38564r.Q1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i3);
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        View view = d1Var.f55540a;
        xv0 xv0Var = this.f38564r;
        ArrayList arrayList = xv0Var.O1;
        if (arrayList != null) {
            int i10 = d1Var.f55544f;
            SparseArray sparseArray = this.f38561e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ((org.telegram.ui.Cells.u3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i3)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((org.telegram.ui.Cells.m3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
                return;
            }
            ((org.telegram.ui.Cells.y7) view).d((TLRPC.Document) sparseArray.get(i3), null, this.f38562f.get(i3), null, false, false);
        } else if (xv0Var.P1 != null) {
            ((org.telegram.ui.Cells.y7) view).setSticker((org.telegram.messenger.ry) xv0Var.Q1.get(i3));
        } else if (d1Var.f55544f != 3) {
            org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv0Var.K1;
            if (tL_messages_stickerSet != null) {
                y7Var.d(tL_messages_stickerSet.documents.get(i3), null, xv0Var.K1, null, xv0Var.Z1, xv0Var.J1);
                y7Var.K.setOnClickListener(new q2(28, this, y7Var));
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        xv0 xv0Var = this.f38564r;
        Context context = this.f38560c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        frameLayout2 = null;
                    } else {
                        org.telegram.ui.ActionBar.e6 e6Var = xv0Var.J0;
                        ?? frameLayout3 = new FrameLayout(context);
                        frameLayout3.f37810a = e6Var;
                        View view = new View(context);
                        frameLayout3.f37812c = view;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i10 = org.telegram.ui.ActionBar.k6.Bf;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
                        frameLayout3.f37811b = d02;
                        Drawable g7 = k2.p1.g(context, 2131231080);
                        org.telegram.ui.ActionBar.r6.y(frameLayout3, g7, i10, e6Var, PorterDuff.Mode.MULTIPLY);
                        xp xpVar = new xp(d02, g7);
                        int L2 = org.telegram.messenger.g0.L(56.0f);
                        int L3 = org.telegram.messenger.g0.L(56.0f);
                        xpVar.h = L2;
                        xpVar.f40443n = L3;
                        int L4 = org.telegram.messenger.g0.L(24.0f);
                        int L5 = org.telegram.messenger.g0.L(24.0f);
                        xpVar.f40441e = L4;
                        xpVar.f40442f = L5;
                        view.setBackground(xpVar);
                        b8.pf.a(view);
                        frameLayout3.addView(view, b8.mf.e(56, 56, 17));
                        frameLayout = frameLayout3;
                    }
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.u3(8, this.f38560c, xv0Var.J0, true, false);
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.m3(context);
            }
            return new u4.d1(frameLayout2);
        }
        sv0 sv0Var = new sv0(this, context, xv0Var.J0);
        sv0Var.getImageView().E0(7);
        frameLayout = sv0Var;
        frameLayout2 = frameLayout;
        return new u4.d1(frameLayout2);
    }
}
