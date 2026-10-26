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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class yy0 extends lm0 {
    public final Context f35151c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f35152f = new SparseArray();
    public int h;
    public int f35153n;
    public final cz0 f35154r;

    public yy0(cz0 cz0Var, Context context) {
        this.f35154r = cz0Var;
        this.f35151c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int j(int i10) {
        cz0 cz0Var = this.f35154r;
        if (cz0Var.W != null) {
            Object obj = this.e.get(i10);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cz0Var.S;
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
        cz0 cz0Var = this.f35154r;
        int i12 = 0;
        if (cz0Var.W != null) {
            int measuredWidth = cz0Var.f27291c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            cz0Var.M.z1(dp);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f35152f;
            sparseArray2.clear();
            this.h = 0;
            this.f35153n = 0;
            for (int i13 = 0; i13 < cz0Var.W.size(); i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) cz0Var.W.get(i13);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f35153n++;
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
            ArrayList arrayList = cz0Var.Y;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cz0Var.S;
                if (tL_messages_stickerSet != null) {
                    i12 = tL_messages_stickerSet.documents.size();
                }
                this.h = i12;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cz0Var.S;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = cz0Var.S.set;
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
        ArrayList arrayList = this.f35154r.Y;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.f47738a;
        cz0 cz0Var = this.f35154r;
        ArrayList arrayList = cz0Var.W;
        if (arrayList != null) {
            int i11 = e1Var.f47741f;
            SparseArray sparseArray = this.e;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ((org.telegram.ui.Cells.q3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((org.telegram.ui.Cells.i3) view).setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            ((org.telegram.ui.Cells.i8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f35152f.get(i10), null, false, false);
        } else if (cz0Var.X != null) {
            ((org.telegram.ui.Cells.i8) view).setSticker((SendMessagesHelper.ImportingSticker) cz0Var.Y.get(i10));
        } else if (e1Var.f47741f != 3) {
            org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cz0Var.S;
            if (tL_messages_stickerSet != null) {
                i8Var.d(tL_messages_stickerSet.documents.get(i10), null, cz0Var.S, null, cz0Var.f27298h0, cz0Var.R);
                i8Var.J.setOnClickListener(new ga(26, this, i8Var));
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        cz0 cz0Var = this.f35154r;
        Context context = this.f35151c;
        if (i10 == 0) {
            u6Var = ((org.telegram.ui.ActionBar.k3) cz0Var).resourcesProvider;
            xy0 xy0Var = new xy0(this, context, u6Var);
            xy0Var.getImageView().setLayerNum(7);
            frameLayout = xy0Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    u6Var2 = ((org.telegram.ui.ActionBar.k3) cz0Var).resourcesProvider;
                    frameLayout2 = new org.telegram.ui.Cells.q3(8, this.f35151c, u6Var2, true, false);
                } else if (i10 == 3) {
                    u6Var3 = ((org.telegram.ui.ActionBar.k3) cz0Var).resourcesProvider;
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f34556a = u6Var3;
                    View view = new View(context);
                    frameLayout3.f34558c = view;
                    int dp = AndroidUtilities.dp(28.0f);
                    int i11 = org.telegram.ui.ActionBar.y6.Me;
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.w0(i11, u6Var3)));
                    frameLayout3.f34557b = c02;
                    Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    org.telegram.ui.ActionBar.f7.y(frameLayout3, mutate, i11, u6Var3, PorterDuff.Mode.MULTIPLY);
                    ar arVar = new ar(c02, mutate);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    int dp3 = AndroidUtilities.dp(56.0f);
                    arVar.h = dp2;
                    arVar.f26596n = dp3;
                    int dp4 = AndroidUtilities.dp(24.0f);
                    int dp5 = AndroidUtilities.dp(24.0f);
                    arVar.e = dp4;
                    arVar.f26595f = dp5;
                    view.setBackground(arVar);
                    gb1.b(view);
                    frameLayout3.addView(view, gb1.i(56, 56, 17));
                    frameLayout = frameLayout3;
                } else {
                    frameLayout2 = null;
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.i3(context);
            }
            return new s4.e1(frameLayout2);
        }
        frameLayout2 = frameLayout;
        return new s4.e1(frameLayout2);
    }
}
