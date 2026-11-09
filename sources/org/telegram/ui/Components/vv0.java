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
public final class vv0 extends pj0 {
    public final Context f39812c;
    public int d;
    public final SparseArray f39813e = new SparseArray();
    public final SparseArray f39814f = new SparseArray();
    public int h;
    public int f39815n;
    public final zv0 f39816r;

    public vv0(zv0 zv0Var, Context context) {
        this.f39816r = zv0Var;
        this.f39812c = context;
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
        zv0 zv0Var = this.f39816r;
        if (zv0Var.N1 != null) {
            Object obj = this.f39813e.get(i7);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zv0Var.J1;
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
        zv0 zv0Var = this.f39816r;
        int i11 = 0;
        if (zv0Var.N1 != null) {
            int measuredWidth = zv0Var.f41153j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.f22563q.x;
            }
            int L = measuredWidth / org.telegram.messenger.g0.L(72.0f);
            this.d = L;
            zv0Var.D1.y1(L);
            SparseArray sparseArray = this.f39813e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f39814f;
            sparseArray2.clear();
            this.h = 0;
            this.f39815n = 0;
            for (int i12 = 0; i12 < zv0Var.N1.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) zv0Var.N1.get(i12);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f39815n++;
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
            ArrayList arrayList = zv0Var.P1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zv0Var.J1;
                if (tL_messages_stickerSet != null) {
                    i11 = tL_messages_stickerSet.documents.size();
                }
                this.h = i11;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = zv0Var.J1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = zv0Var.J1.set;
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
        ArrayList arrayList = this.f39816r.P1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i7);
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.f57056a;
        zv0 zv0Var = this.f39816r;
        ArrayList arrayList = zv0Var.N1;
        if (arrayList != null) {
            int i10 = d1Var.f57060f;
            SparseArray sparseArray = this.f39813e;
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
            ((org.telegram.ui.Cells.z7) view).d((TLRPC.Document) sparseArray.get(i7), null, this.f39814f.get(i7), null, false, false);
        } else if (zv0Var.O1 != null) {
            ((org.telegram.ui.Cells.z7) view).setSticker((org.telegram.messenger.zy) zv0Var.P1.get(i7));
        } else if (d1Var.f57060f != 3) {
            org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zv0Var.J1;
            if (tL_messages_stickerSet != null) {
                z7Var.d(tL_messages_stickerSet.documents.get(i7), null, zv0Var.J1, null, zv0Var.Y1, zv0Var.I1);
                z7Var.J.setOnClickListener(new lk(22, this, z7Var));
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        zv0 zv0Var = this.f39816r;
        Context context = this.f39812c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        frameLayout2 = null;
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = zv0Var.I0;
                        ?? frameLayout3 = new FrameLayout(context);
                        frameLayout3.f38513a = g6Var;
                        View view = new View(context);
                        frameLayout3.f38515c = view;
                        int L = org.telegram.messenger.g0.L(28.0f);
                        int i10 = org.telegram.ui.ActionBar.l6.Bf;
                        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.r1(0.12f, org.telegram.ui.ActionBar.l6.w0(i10, g6Var)));
                        frameLayout3.f38514b = d02;
                        Drawable h = jg.g.h(context, 2131231080);
                        org.telegram.ui.ActionBar.s6.x(frameLayout3, h, i10, g6Var, PorterDuff.Mode.MULTIPLY);
                        xp xpVar = new xp(d02, h);
                        int L2 = org.telegram.messenger.g0.L(56.0f);
                        int L3 = org.telegram.messenger.g0.L(56.0f);
                        xpVar.h = L2;
                        xpVar.f40449n = L3;
                        int L4 = org.telegram.messenger.g0.L(24.0f);
                        int L5 = org.telegram.messenger.g0.L(24.0f);
                        xpVar.f40447e = L4;
                        xpVar.f40448f = L5;
                        view.setBackground(xpVar);
                        c8.ka.a(view);
                        frameLayout3.addView(view, c8.ha.e(56, 56, 17));
                        frameLayout = frameLayout3;
                    }
                } else {
                    frameLayout2 = new org.telegram.ui.Cells.u3(8, this.f39812c, zv0Var.I0, true, false);
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.m3(context);
            }
            return new v4.d1(frameLayout2);
        }
        uv0 uv0Var = new uv0(this, context, zv0Var.I0);
        uv0Var.getImageView().E0(7);
        frameLayout = uv0Var;
        frameLayout2 = frameLayout;
        return new v4.d1(frameLayout2);
    }
}
