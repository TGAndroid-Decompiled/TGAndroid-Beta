package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

public final class ax0 extends yk0 {

    public final Context f26834c;
    public int d;

    public final SparseArray f26835e = new SparseArray();

    public final SparseArray f26836f = new SparseArray();
    public int h;

    public int f26837n;

    public final ex0 f26838r;

    public ax0(ex0 ex0Var, Context context) {
        this.f26838r = ex0Var;
        this.f26834c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int j(int i10) {
        ex0 ex0Var = this.f26838r;
        if (ex0Var.S == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ex0Var.O;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i10) ? 0 : 3;
        }
        Object obj = this.f26835e.get(i10);
        if (obj != null) {
            return obj instanceof TLRPC.Document ? 0 : 2;
        }
        return 1;
    }

    @Override
    public final void l() {
        int iCeil;
        int i10;
        ex0 ex0Var = this.f26838r;
        if (ex0Var.S != null) {
            int measuredWidth = ex0Var.f28173c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int iDp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = iDp;
            ex0Var.I.y1(iDp);
            SparseArray sparseArray = this.f26835e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f26836f;
            sparseArray2.clear();
            this.h = 0;
            this.f26837n = 0;
            for (int i11 = 0; i11 < ex0Var.S.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) ex0Var.S.get(i11);
                List listSubList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                if (listSubList != null) {
                    listSubList = listSubList.subList(0, Math.min(listSubList.size(), this.d));
                }
                if (listSubList != null && (!listSubList.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f26837n++;
                    sparseArray2.put(this.h, stickerSetCovered);
                    int i12 = this.h;
                    this.h = i12 + 1;
                    sparseArray.put(i12, Integer.valueOf(i11));
                    int i13 = this.h / this.d;
                    if (listSubList.isEmpty()) {
                        sparseArray.put(this.h, stickerSetCovered.cover);
                        iCeil = 1;
                    } else {
                        iCeil = (int) Math.ceil(listSubList.size() / this.d);
                        for (int i14 = 0; i14 < listSubList.size(); i14++) {
                            sparseArray.put(this.h + i14, listSubList.get(i14));
                        }
                    }
                    int i15 = 0;
                    while (true) {
                        i10 = this.d * iCeil;
                        if (i15 >= i10) {
                            break;
                        }
                        sparseArray2.put(this.h + i15, stickerSetCovered);
                        i15++;
                    }
                    this.h = i10 + this.h;
                }
            }
        } else {
            ArrayList arrayList = ex0Var.U;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ex0Var.O;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ex0Var.O;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = ex0Var.O.set;
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
        ArrayList arrayList = this.f26838r.U;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.f5789a;
        ex0 ex0Var = this.f26838r;
        ArrayList arrayList = ex0Var.S;
        if (arrayList == null) {
            if (ex0Var.T != null) {
                ((org.telegram.ui.Cells.a8) view).setSticker((SendMessagesHelper.ImportingSticker) ex0Var.U.get(i10));
                return;
            }
            if (o1Var.f5793f != 3) {
                org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ex0Var.O;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                a8Var.d(tL_messages_stickerSet.documents.get(i10), null, ex0Var.O, null, ex0Var.f28175d0, ex0Var.N);
                a8Var.F.setOnClickListener(new xh0(3, this, a8Var));
                return;
            }
            return;
        }
        int i11 = o1Var.f5793f;
        SparseArray sparseArray = this.f26835e;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.a8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f26836f.get(i10), null, false, false);
        } else if (i11 == 1) {
            ((org.telegram.ui.Cells.i3) view).setHeight(AndroidUtilities.dp(82.0f));
        } else {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.p3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View p3Var;
        ex0 ex0Var = this.f26838r;
        Context context = this.f26834c;
        if (i10 != 0) {
            if (i10 == 1) {
                p3Var = new org.telegram.ui.Cells.i3(context);
            } else if (i10 == 2) {
                p3Var = new org.telegram.ui.Cells.p3(8, this.f26834c, ((org.telegram.ui.ActionBar.e3) ex0Var).resourcesProvider, true, false);
            } else if (i10 != 3) {
                p3Var = null;
            } else {
                org.telegram.ui.ActionBar.c6 c6Var = ((org.telegram.ui.ActionBar.e3) ex0Var).resourcesProvider;
                yw0 yw0Var = new yw0(context);
                View view2 = new View(context);
                int iDp = AndroidUtilities.dp(28.0f);
                int i11 = org.telegram.ui.ActionBar.g6.Me;
                ShapeDrawable shapeDrawableB0 = org.telegram.ui.ActionBar.g6.b0(iDp, org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
                dq dqVar = new dq(shapeDrawableB0, drawableMutate);
                int iDp2 = AndroidUtilities.dp(56.0f);
                int iDp3 = AndroidUtilities.dp(56.0f);
                dqVar.h = iDp2;
                dqVar.f27825n = iDp3;
                int iDp4 = AndroidUtilities.dp(24.0f);
                int iDp5 = AndroidUtilities.dp(24.0f);
                dqVar.f27823e = iDp4;
                dqVar.f27824f = iDp5;
                view2.setBackground(dqVar);
                h7.b6.a(view2);
                yw0Var.addView(view2, h7.z5.e(56, 56, 17));
                view = yw0Var;
            }
            return new lk0(p3Var);
        }
        zw0 zw0Var = new zw0(this, context, ((org.telegram.ui.ActionBar.e3) ex0Var).resourcesProvider);
        zw0Var.getImageView().setLayerNum(7);
        view = zw0Var;
        p3Var = view;
        return new lk0(p3Var);
    }
}
