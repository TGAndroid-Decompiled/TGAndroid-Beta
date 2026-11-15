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
public final class xv0 extends tj0 {
    public final Context f41771c;
    public int d;
    public final SparseArray f41772e = new SparseArray();
    public final SparseArray f41773f = new SparseArray();
    public int h;
    public int f41774n;
    public final bw0 f41775r;

    public xv0(bw0 bw0Var, Context context) {
        this.f41775r = bw0Var;
        this.f41771c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i7) {
        bw0 bw0Var = this.f41775r;
        if (bw0Var.R1 != null) {
            Object obj = this.f41772e.get(i7);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = bw0Var.N1;
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
        bw0 bw0Var = this.f41775r;
        int i11 = 0;
        if (bw0Var.R1 != null) {
            int measuredWidth = bw0Var.n1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.f23609q.x;
            }
            int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            this.d = L;
            bw0Var.H1.y1(L);
            SparseArray sparseArray = this.f41772e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f41773f;
            sparseArray2.clear();
            this.h = 0;
            this.f41774n = 0;
            for (int i12 = 0; i12 < bw0Var.R1.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) bw0Var.R1.get(i12);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f41774n++;
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
            ArrayList arrayList = bw0Var.T1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = bw0Var.N1;
                if (tL_messages_stickerSet != null) {
                    i11 = tL_messages_stickerSet.documents.size();
                }
                this.h = i11;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = bw0Var.N1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = bw0Var.N1.set;
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
        ArrayList arrayList = this.f41775r.T1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i7);
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        View view = e1Var.f58535a;
        bw0 bw0Var = this.f41775r;
        ArrayList arrayList = bw0Var.R1;
        if (arrayList != null) {
            int i10 = e1Var.f58539f;
            SparseArray sparseArray = this.f41772e;
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
            ((org.telegram.ui.Cells.y7) view).d((TLRPC.Document) sparseArray.get(i7), null, this.f41773f.get(i7), null, false, false);
        } else if (bw0Var.S1 != null) {
            ((org.telegram.ui.Cells.y7) view).setSticker((org.telegram.messenger.xy) bw0Var.T1.get(i7));
        } else if (e1Var.f58539f != 3) {
            org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = bw0Var.N1;
            if (tL_messages_stickerSet != null) {
                y7Var.d(tL_messages_stickerSet.documents.get(i7), null, bw0Var.N1, null, bw0Var.f33398c2, bw0Var.M1);
                y7Var.K.setOnClickListener(new vv0(0, this, y7Var));
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        bw0 bw0Var = this.f41775r;
        Context context = this.f41771c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        frameLayout2 = null;
                    } else {
                        org.telegram.ui.ActionBar.e6 e6Var = bw0Var.J0;
                        ?? frameLayout3 = new FrameLayout(context);
                        frameLayout3.f40169a = e6Var;
                        View view = new View(context);
                        frameLayout3.f40171c = view;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i10 = org.telegram.ui.ActionBar.j6.Ef;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.w0(i10, e6Var)));
                        frameLayout3.f40170b = d02;
                        Drawable g10 = i5.c.g(context, 2131231080);
                        org.telegram.ui.ActionBar.q6.x(frameLayout3, g10, i10, e6Var, PorterDuff.Mode.MULTIPLY);
                        fq fqVar = new fq(d02, g10);
                        int L2 = org.telegram.messenger.g0.L(56.0f);
                        int L3 = org.telegram.messenger.g0.L(56.0f);
                        fqVar.h = L2;
                        fqVar.f34674n = L3;
                        int L4 = org.telegram.messenger.g0.L(24.0f);
                        int L5 = org.telegram.messenger.g0.L(24.0f);
                        fqVar.f34672e = L4;
                        fqVar.f34673f = L5;
                        view.setBackground(fqVar);
                        c8.na.a(view);
                        frameLayout3.addView(view, c8.ja.e(56, 56, 17));
                        frameLayout = frameLayout3;
                    }
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.u3(8, this.f41771c, bw0Var.J0, true, false);
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.m3(context);
            }
            return new v4.e1(frameLayout2);
        }
        wv0 wv0Var = new wv0(this, context, bw0Var.J0);
        wv0Var.getImageView().E0(7);
        frameLayout = wv0Var;
        frameLayout2 = frameLayout;
        return new v4.e1(frameLayout2);
    }
}
