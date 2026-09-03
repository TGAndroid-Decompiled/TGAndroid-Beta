package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class tx0 extends rl0 {
    public final Context f31434c;
    public int d;
    public final SparseArray f31435e = new SparseArray();
    public final SparseArray f31436f = new SparseArray();
    public int h;
    public int f31437n;
    public final xx0 f31438r;

    public tx0(xx0 xx0Var, Context context) {
        this.f31438r = xx0Var;
        this.f31434c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int j(int i10) {
        xx0 xx0Var = this.f31438r;
        if (xx0Var.T != null) {
            Object obj = this.f31435e.get(i10);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i10) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void l() {
        List list;
        int i10;
        int i11;
        xx0 xx0Var = this.f31438r;
        int i12 = 0;
        if (xx0Var.T != null) {
            int measuredWidth = xx0Var.f33223c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            xx0Var.J.y1(dp);
            SparseArray sparseArray = this.f31435e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f31436f;
            sparseArray2.clear();
            this.h = 0;
            this.f31437n = 0;
            for (int i13 = 0; i13 < xx0Var.T.size(); i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) xx0Var.T.get(i13);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f31437n++;
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
            ArrayList arrayList = xx0Var.V;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
                if (tL_messages_stickerSet != null) {
                    i12 = tL_messages_stickerSet.documents.size();
                }
                this.h = i12;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xx0Var.P;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = xx0Var.P.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.l();
    }

    @Override
    public final void u(int i10) {
        ArrayList arrayList = this.f31438r.V;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.f5875a;
        xx0 xx0Var = this.f31438r;
        ArrayList arrayList = xx0Var.T;
        if (arrayList != null) {
            int i11 = m1Var.f5879f;
            SparseArray sparseArray = this.f31435e;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ((org.telegram.ui.Cells.r3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((org.telegram.ui.Cells.k3) view).setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f31436f.get(i10), null, false, false);
        } else if (xx0Var.U != null) {
            ((org.telegram.ui.Cells.d8) view).setSticker((SendMessagesHelper.ImportingSticker) xx0Var.V.get(i10));
        } else if (m1Var.f5879f != 3) {
            org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
            if (tL_messages_stickerSet != null) {
                d8Var.d(tL_messages_stickerSet.documents.get(i10), null, xx0Var.P, null, xx0Var.f33227e0, xx0Var.O);
                d8Var.G.setOnClickListener(new rx0(0, this, d8Var));
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        xx0 xx0Var = this.f31438r;
        Context context = this.f31434c;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) xx0Var).resourcesProvider;
            sx0 sx0Var = new sx0(this, context, g6Var);
            sx0Var.getImageView().setLayerNum(7);
            frameLayout = sx0Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    g6Var2 = ((org.telegram.ui.ActionBar.h3) xx0Var).resourcesProvider;
                    frameLayout2 = new org.telegram.ui.Cells.r3(8, this.f31434c, g6Var2, true, false);
                } else if (i10 == 3) {
                    g6Var3 = ((org.telegram.ui.ActionBar.h3) xx0Var).resourcesProvider;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    View view = new View(context);
                    int dp = AndroidUtilities.dp(28.0f);
                    int i11 = org.telegram.ui.ActionBar.k6.Me;
                    ShapeDrawable b02 = org.telegram.ui.ActionBar.k6.b0(dp, org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.v0(i11, g6Var3)));
                    Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var3), PorterDuff.Mode.MULTIPLY));
                    pq pqVar = new pq(b02, mutate);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    int dp3 = AndroidUtilities.dp(56.0f);
                    pqVar.h = dp2;
                    pqVar.f30163n = dp3;
                    int dp4 = AndroidUtilities.dp(24.0f);
                    int dp5 = AndroidUtilities.dp(24.0f);
                    pqVar.f30161e = dp4;
                    pqVar.f30162f = dp5;
                    view.setBackground(pqVar);
                    k7.e6.a(view);
                    frameLayout3.addView(view, k7.c6.e(56, 56, 17));
                    frameLayout = frameLayout3;
                } else {
                    frameLayout2 = null;
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.k3(context);
            }
            return new f2.m1(frameLayout2);
        }
        frameLayout2 = frameLayout;
        return new f2.m1(frameLayout2);
    }
}
