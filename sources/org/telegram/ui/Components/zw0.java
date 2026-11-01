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
public final class zw0 extends tk0 {
    public final Context f33242c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f33243f = new SparseArray();
    public int h;
    public int f33244n;
    public final dx0 f33245r;

    public zw0(dx0 dx0Var, Context context) {
        this.f33245r = dx0Var;
        this.f33242c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i10) {
        dx0 dx0Var = this.f33245r;
        if (dx0Var.N1 != null) {
            Object obj = this.e.get(i10);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dx0Var.J1;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i10) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void f() {
        List list;
        int i10;
        int i11;
        dx0 dx0Var = this.f33245r;
        int i12 = 0;
        if (dx0Var.N1 != null) {
            int measuredWidth = dx0Var.f25619j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.i0.f16172q.x;
            }
            int L = measuredWidth / org.telegram.messenger.i0.L(72.0f);
            this.d = L;
            dx0Var.D1.y1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f33243f;
            sparseArray2.clear();
            this.h = 0;
            this.f33244n = 0;
            for (int i13 = 0; i13 < dx0Var.N1.size(); i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) dx0Var.N1.get(i13);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f33244n++;
                    sparseArray2.put(this.h, stickerSetCovered);
                    int i14 = this.h;
                    this.h = i14 + 1;
                    sparseArray.put(i14, Integer.valueOf(i13));
                    int i15 = this.h / this.d;
                    if (!list.isEmpty()) {
                        i10 = (int) Math.ceil(list.size() / this.d);
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            sparseArray.put(this.h + i16, list.get(i16));
                        }
                    } else {
                        sparseArray.put(this.h, stickerSetCovered.cover);
                        i10 = 1;
                    }
                    int i17 = 0;
                    while (true) {
                        i11 = this.d * i10;
                        if (i17 >= i11) {
                            break;
                        }
                        sparseArray2.put(this.h + i17, stickerSetCovered);
                        i17++;
                    }
                    this.h = i11 + this.h;
                }
            }
        } else {
            ArrayList arrayList = dx0Var.P1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dx0Var.J1;
                if (tL_messages_stickerSet != null) {
                    i12 = tL_messages_stickerSet.documents.size();
                }
                this.h = i12;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = dx0Var.J1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = dx0Var.J1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override
    public final void s(int i10) {
        ArrayList arrayList = this.f33245r.P1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i10);
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        View view = c1Var.f47909a;
        dx0 dx0Var = this.f33245r;
        ArrayList arrayList = dx0Var.N1;
        if (arrayList != null) {
            int i11 = c1Var.f47912f;
            SparseArray sparseArray = this.e;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ((org.telegram.ui.Cells.w3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((org.telegram.ui.Cells.o3) view).setHeight(org.telegram.messenger.i0.L(82.0f));
                return;
            }
            ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f33243f.get(i10), null, false, false);
        } else if (dx0Var.O1 != null) {
            ((org.telegram.ui.Cells.d8) view).setSticker((org.telegram.messenger.kz) dx0Var.P1.get(i10));
        } else if (c1Var.f47912f != 3) {
            org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dx0Var.J1;
            if (tL_messages_stickerSet != null) {
                d8Var.d(tL_messages_stickerSet.documents.get(i10), null, dx0Var.J1, null, dx0Var.Y1, dx0Var.I1);
                d8Var.J.setOnClickListener(new sr(15, this, d8Var));
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        dx0 dx0Var = this.f33245r;
        Context context = this.f33242c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        frameLayout2 = null;
                    } else {
                        org.telegram.ui.ActionBar.p6 p6Var = dx0Var.I0;
                        ?? frameLayout3 = new FrameLayout(context);
                        frameLayout3.f32646a = p6Var;
                        View view = new View(context);
                        frameLayout3.f32648c = view;
                        int L = org.telegram.messenger.i0.L(28.0f);
                        int i11 = org.telegram.ui.ActionBar.t6.Bf;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
                        frameLayout3.f32647b = d02;
                        Drawable f7 = i0.a.f(context, 2131231080);
                        org.telegram.ui.ActionBar.a7.y(frameLayout3, f7, i11, p6Var, PorterDuff.Mode.MULTIPLY);
                        eq eqVar = new eq(d02, f7);
                        int L2 = org.telegram.messenger.i0.L(56.0f);
                        int L3 = org.telegram.messenger.i0.L(56.0f);
                        eqVar.h = L2;
                        eqVar.f25905n = L3;
                        int L4 = org.telegram.messenger.i0.L(24.0f);
                        int L5 = org.telegram.messenger.i0.L(24.0f);
                        eqVar.e = L4;
                        eqVar.f25904f = L5;
                        view.setBackground(eqVar);
                        w7.e6.a(view);
                        frameLayout3.addView(view, w7.b6.e(56, 56, 17));
                        frameLayout = frameLayout3;
                    }
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.w3(8, this.f33242c, dx0Var.I0, true, false);
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.o3(context);
            }
            return new s4.c1(frameLayout2);
        }
        yw0 yw0Var = new yw0(this, context, dx0Var.I0);
        yw0Var.getImageView().E0(7);
        frameLayout = yw0Var;
        frameLayout2 = frameLayout;
        return new s4.c1(frameLayout2);
    }
}
