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
public final class uv0 extends oj0 {
    public final Context f38753c;
    public int d;
    public final SparseArray f38754e = new SparseArray();
    public final SparseArray f38755f = new SparseArray();
    public int h;
    public int f38756n;
    public final yv0 f38757r;

    public uv0(yv0 yv0Var, Context context) {
        this.f38757r = yv0Var;
        this.f38753c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i7) {
        yv0 yv0Var = this.f38757r;
        if (yv0Var.Q1 != null) {
            Object obj = this.f38754e.get(i7);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yv0Var.M1;
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
        yv0 yv0Var = this.f38757r;
        int i11 = 0;
        if (yv0Var.Q1 != null) {
            int measuredWidth = yv0Var.f40747m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.f22567q.x;
            }
            int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            this.d = L;
            yv0Var.G1.y1(L);
            SparseArray sparseArray = this.f38754e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f38755f;
            sparseArray2.clear();
            this.h = 0;
            this.f38756n = 0;
            for (int i12 = 0; i12 < yv0Var.Q1.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) yv0Var.Q1.get(i12);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f38756n++;
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
            ArrayList arrayList = yv0Var.S1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yv0Var.M1;
                if (tL_messages_stickerSet != null) {
                    i11 = tL_messages_stickerSet.documents.size();
                }
                this.h = i11;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = yv0Var.M1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = yv0Var.M1.set;
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
        ArrayList arrayList = this.f38757r.S1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i7);
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.f57052a;
        yv0 yv0Var = this.f38757r;
        ArrayList arrayList = yv0Var.Q1;
        if (arrayList != null) {
            int i10 = d1Var.f57056f;
            SparseArray sparseArray = this.f38754e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ((org.telegram.ui.Cells.u3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i7)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((org.telegram.ui.Cells.m3) view).setHeight(org.telegram.messenger.g0.L(82.0f));
                return;
            }
            ((org.telegram.ui.Cells.z7) view).d((TLRPC.Document) sparseArray.get(i7), null, this.f38755f.get(i7), null, false, false);
        } else if (yv0Var.R1 != null) {
            ((org.telegram.ui.Cells.z7) view).setSticker((org.telegram.messenger.zy) yv0Var.S1.get(i7));
        } else if (d1Var.f57056f != 3) {
            org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yv0Var.M1;
            if (tL_messages_stickerSet != null) {
                z7Var.d(tL_messages_stickerSet.documents.get(i7), null, yv0Var.M1, null, yv0Var.f40737b2, yv0Var.L1);
                z7Var.J.setOnClickListener(new kk(22, this, z7Var));
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        yv0 yv0Var = this.f38757r;
        Context context = this.f38753c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        frameLayout2 = null;
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = yv0Var.I0;
                        ?? frameLayout3 = new FrameLayout(context);
                        frameLayout3.f38085a = h6Var;
                        View view = new View(context);
                        frameLayout3.f38087c = view;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i10 = org.telegram.ui.ActionBar.m6.Bf;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
                        frameLayout3.f38086b = d02;
                        Drawable h = jg.g.h(context, 2131231080);
                        org.telegram.ui.ActionBar.t6.x(frameLayout3, h, i10, h6Var, PorterDuff.Mode.MULTIPLY);
                        xp xpVar = new xp(d02, h);
                        int L2 = org.telegram.messenger.g0.L(56.0f);
                        int L3 = org.telegram.messenger.g0.L(56.0f);
                        xpVar.h = L2;
                        xpVar.f40379n = L3;
                        int L4 = org.telegram.messenger.g0.L(24.0f);
                        int L5 = org.telegram.messenger.g0.L(24.0f);
                        xpVar.f40377e = L4;
                        xpVar.f40378f = L5;
                        view.setBackground(xpVar);
                        c8.ka.a(view);
                        frameLayout3.addView(view, c8.ha.e(56, 56, 17));
                        frameLayout = frameLayout3;
                    }
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.u3(8, this.f38753c, yv0Var.I0, true, false);
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.m3(context);
            }
            return new v4.d1(frameLayout2);
        }
        tv0 tv0Var = new tv0(this, context, yv0Var.I0);
        tv0Var.getImageView().E0(7);
        frameLayout = tv0Var;
        frameLayout2 = frameLayout;
        return new v4.d1(frameLayout2);
    }
}
