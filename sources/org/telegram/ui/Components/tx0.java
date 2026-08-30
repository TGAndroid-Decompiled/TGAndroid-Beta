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
    public final Context f29064c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f29065f = new SparseArray();
    public int h;
    public int f29066n;
    public final xx0 f29067r;

    public tx0(xx0 xx0Var, Context context) {
        this.f29067r = xx0Var;
        this.f29064c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int j(int i10) {
        xx0 xx0Var = this.f29067r;
        if (xx0Var.T != null) {
            Object obj = this.e.get(i10);
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
        xx0 xx0Var = this.f29067r;
        int i12 = 0;
        if (xx0Var.T != null) {
            int measuredWidth = xx0Var.f30770c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            xx0Var.J.y1(dp);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f29065f;
            sparseArray2.clear();
            this.h = 0;
            this.f29066n = 0;
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
                    this.f29066n++;
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
        ArrayList arrayList = this.f29067r.V;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.f5785a;
        xx0 xx0Var = this.f29067r;
        ArrayList arrayList = xx0Var.T;
        if (arrayList != null) {
            int i11 = l1Var.f5788f;
            SparseArray sparseArray = this.e;
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
            ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f29065f.get(i10), null, false, false);
        } else if (xx0Var.U != null) {
            ((org.telegram.ui.Cells.d8) view).setSticker((SendMessagesHelper.ImportingSticker) xx0Var.V.get(i10));
        } else if (l1Var.f5788f != 3) {
            org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xx0Var.P;
            if (tL_messages_stickerSet != null) {
                d8Var.d(tL_messages_stickerSet.documents.get(i10), null, xx0Var.P, null, xx0Var.f30773e0, xx0Var.O);
                d8Var.G.setOnClickListener(new rx0(0, this, d8Var));
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        xx0 xx0Var = this.f29067r;
        Context context = this.f29064c;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.g3) xx0Var).resourcesProvider;
            sx0 sx0Var = new sx0(this, context, f6Var);
            sx0Var.getImageView().setLayerNum(7);
            frameLayout = sx0Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    f6Var2 = ((org.telegram.ui.ActionBar.g3) xx0Var).resourcesProvider;
                    frameLayout2 = new org.telegram.ui.Cells.r3(8, this.f29064c, f6Var2, true, false);
                } else if (i10 == 3) {
                    f6Var3 = ((org.telegram.ui.ActionBar.g3) xx0Var).resourcesProvider;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    View view = new View(context);
                    int dp = AndroidUtilities.dp(28.0f);
                    int i11 = org.telegram.ui.ActionBar.j6.Me;
                    ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var3)));
                    Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var3), PorterDuff.Mode.MULTIPLY));
                    nq nqVar = new nq(b02, mutate);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    int dp3 = AndroidUtilities.dp(56.0f);
                    nqVar.h = dp2;
                    nqVar.f27339n = dp3;
                    int dp4 = AndroidUtilities.dp(24.0f);
                    int dp5 = AndroidUtilities.dp(24.0f);
                    nqVar.e = dp4;
                    nqVar.f27338f = dp5;
                    view.setBackground(nqVar);
                    k7.d6.a(view);
                    frameLayout3.addView(view, k7.b6.e(56, 56, 17));
                    frameLayout = frameLayout3;
                } else {
                    frameLayout2 = null;
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.k3(context);
            }
            return new f2.l1(frameLayout2);
        }
        frameLayout2 = frameLayout;
        return new f2.l1(frameLayout2);
    }
}
