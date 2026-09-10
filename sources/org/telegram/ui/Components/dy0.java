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
public final class dy0 extends ul0 {
    public final Context f22505c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f22506f = new SparseArray();
    public int h;
    public int f22507n;
    public final hy0 f22508r;

    public dy0(hy0 hy0Var, Context context) {
        this.f22508r = hy0Var;
        this.f22505c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int j(int i10) {
        hy0 hy0Var = this.f22508r;
        if (hy0Var.W != null) {
            Object obj = this.e.get(i10);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy0Var.S;
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
        hy0 hy0Var = this.f22508r;
        int i12 = 0;
        if (hy0Var.W != null) {
            int measuredWidth = hy0Var.f23806c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            hy0Var.M.y1(dp);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f22506f;
            sparseArray2.clear();
            this.h = 0;
            this.f22507n = 0;
            for (int i13 = 0; i13 < hy0Var.W.size(); i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) hy0Var.W.get(i13);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f22507n++;
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
            ArrayList arrayList = hy0Var.Y;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy0Var.S;
                if (tL_messages_stickerSet != null) {
                    i12 = tL_messages_stickerSet.documents.size();
                }
                this.h = i12;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = hy0Var.S;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = hy0Var.S.set;
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
        ArrayList arrayList = this.f22508r.Y;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f41610a;
        hy0 hy0Var = this.f22508r;
        ArrayList arrayList = hy0Var.W;
        if (arrayList != null) {
            int i11 = c1Var.f41613f;
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
            ((org.telegram.ui.Cells.g8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f22506f.get(i10), null, false, false);
        } else if (hy0Var.X != null) {
            ((org.telegram.ui.Cells.g8) view).setSticker((SendMessagesHelper.ImportingSticker) hy0Var.Y.get(i10));
        } else if (c1Var.f41613f != 3) {
            org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy0Var.S;
            if (tL_messages_stickerSet != null) {
                g8Var.d(tL_messages_stickerSet.documents.get(i10), null, hy0Var.S, null, hy0Var.f23813h0, hy0Var.R);
                g8Var.J.setOnClickListener(new u10(12, this, g8Var));
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        hy0 hy0Var = this.f22508r;
        Context context = this.f22505c;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.h3) hy0Var).resourcesProvider;
            cy0 cy0Var = new cy0(this, context, f6Var);
            cy0Var.getImageView().setLayerNum(7);
            frameLayout = cy0Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    f6Var2 = ((org.telegram.ui.ActionBar.h3) hy0Var).resourcesProvider;
                    frameLayout2 = new org.telegram.ui.Cells.r3(8, this.f22505c, f6Var2, true, false);
                } else if (i10 == 3) {
                    f6Var3 = ((org.telegram.ui.ActionBar.h3) hy0Var).resourcesProvider;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    View view = new View(context);
                    int dp = AndroidUtilities.dp(28.0f);
                    int i11 = org.telegram.ui.ActionBar.j6.Me;
                    ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var3)));
                    Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var3), PorterDuff.Mode.MULTIPLY));
                    vq vqVar = new vq(b02, mutate);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    int dp3 = AndroidUtilities.dp(56.0f);
                    vqVar.h = dp2;
                    vqVar.f28577n = dp3;
                    int dp4 = AndroidUtilities.dp(24.0f);
                    int dp5 = AndroidUtilities.dp(24.0f);
                    vqVar.e = dp4;
                    vqVar.f28576f = dp5;
                    view.setBackground(vqVar);
                    w7.c6.a(view);
                    frameLayout3.addView(view, w7.a6.e(56, 56, 17));
                    frameLayout = frameLayout3;
                } else {
                    frameLayout2 = null;
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.k3(context);
            }
            return new s4.c1(frameLayout2);
        }
        frameLayout2 = frameLayout;
        return new s4.c1(frameLayout2);
    }
}
