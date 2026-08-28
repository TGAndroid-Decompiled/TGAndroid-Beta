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
public final class yw0 extends vk0 {
    public final Context f35087c;
    public int d;
    public final SparseArray f35088e = new SparseArray();
    public final SparseArray f35089f = new SparseArray();
    public int h;
    public int f35090n;
    public final cx0 f35091r;

    public yw0(cx0 cx0Var, Context context) {
        this.f35091r = cx0Var;
        this.f35087c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int j(int i9) {
        cx0 cx0Var = this.f35091r;
        if (cx0Var.S != null) {
            Object obj = this.f35088e.get(i9);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.O;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i9) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void l() {
        List list;
        int i9;
        int i10;
        cx0 cx0Var = this.f35091r;
        int i11 = 0;
        if (cx0Var.S != null) {
            int measuredWidth = cx0Var.f27573c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            cx0Var.I.y1(dp);
            SparseArray sparseArray = this.f35088e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f35089f;
            sparseArray2.clear();
            this.h = 0;
            this.f35090n = 0;
            for (int i12 = 0; i12 < cx0Var.S.size(); i12++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) cx0Var.S.get(i12);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f35090n++;
                    sparseArray2.put(this.h, stickerSetCovered);
                    int i13 = this.h;
                    this.h = i13 + 1;
                    sparseArray.put(i13, Integer.valueOf(i12));
                    int i14 = this.h / this.d;
                    if (!list.isEmpty()) {
                        i9 = (int) Math.ceil(list.size() / this.d);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            sparseArray.put(this.h + i15, list.get(i15));
                        }
                    } else {
                        sparseArray.put(this.h, stickerSetCovered.cover);
                        i9 = 1;
                    }
                    int i16 = 0;
                    while (true) {
                        i10 = this.d * i9;
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
            ArrayList arrayList = cx0Var.U;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.O;
                if (tL_messages_stickerSet != null) {
                    i11 = tL_messages_stickerSet.documents.size();
                }
                this.h = i11;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cx0Var.O;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = cx0Var.O.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.l();
    }

    @Override
    public final void u(int i9) {
        ArrayList arrayList = this.f35091r.U;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i9);
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        View view = q1Var.f5501a;
        cx0 cx0Var = this.f35091r;
        ArrayList arrayList = cx0Var.S;
        if (arrayList != null) {
            int i10 = q1Var.f5505f;
            SparseArray sparseArray = this.f35088e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ((org.telegram.ui.Cells.s3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i9)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((org.telegram.ui.Cells.l3) view).setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            ((org.telegram.ui.Cells.d8) view).d((TLRPC.Document) sparseArray.get(i9), null, this.f35089f.get(i9), null, false, false);
        } else if (cx0Var.T != null) {
            ((org.telegram.ui.Cells.d8) view).setSticker((SendMessagesHelper.ImportingSticker) cx0Var.U.get(i9));
        } else if (q1Var.f5505f != 3) {
            org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.O;
            if (tL_messages_stickerSet != null) {
                d8Var.d(tL_messages_stickerSet.documents.get(i9), null, cx0Var.O, null, cx0Var.f27575d0, cx0Var.N);
                d8Var.F.setOnClickListener(new vh0(2, this, d8Var));
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        cx0 cx0Var = this.f35091r;
        Context context = this.f35087c;
        if (i9 == 0) {
            b6Var = ((org.telegram.ui.ActionBar.f3) cx0Var).resourcesProvider;
            xw0 xw0Var = new xw0(this, context, b6Var);
            xw0Var.getImageView().setLayerNum(7);
            frameLayout = xw0Var;
        } else {
            if (i9 != 1) {
                if (i9 == 2) {
                    b6Var2 = ((org.telegram.ui.ActionBar.f3) cx0Var).resourcesProvider;
                    frameLayout2 = new org.telegram.ui.Cells.s3(8, this.f35087c, b6Var2, true, false);
                } else if (i9 == 3) {
                    b6Var3 = ((org.telegram.ui.ActionBar.f3) cx0Var).resourcesProvider;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    View view = new View(context);
                    int dp = AndroidUtilities.dp(28.0f);
                    int i10 = org.telegram.ui.ActionBar.f6.Me;
                    ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var3)));
                    Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var3), PorterDuff.Mode.MULTIPLY));
                    fq fqVar = new fq(b02, mutate);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    int dp3 = AndroidUtilities.dp(56.0f);
                    fqVar.h = dp2;
                    fqVar.f28547n = dp3;
                    int dp4 = AndroidUtilities.dp(24.0f);
                    int dp5 = AndroidUtilities.dp(24.0f);
                    fqVar.f28545e = dp4;
                    fqVar.f28546f = dp5;
                    view.setBackground(fqVar);
                    g7.g6.a(view);
                    frameLayout3.addView(view, g7.e6.e(56, 56, 17));
                    frameLayout = frameLayout3;
                } else {
                    frameLayout2 = null;
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.l3(context);
            }
            return new f2.q1(frameLayout2);
        }
        frameLayout2 = frameLayout;
        return new f2.q1(frameLayout2);
    }
}
