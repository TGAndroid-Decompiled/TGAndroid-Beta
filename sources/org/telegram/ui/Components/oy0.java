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
public final class oy0 extends km0 {
    public final Context f29430c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f29431f = new SparseArray();
    public int h;
    public int f29432n;
    public final sy0 f29433r;

    public oy0(sy0 sy0Var, Context context) {
        this.f29433r = sy0Var;
        this.f29430c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int j(int i10) {
        sy0 sy0Var = this.f29433r;
        if (sy0Var.W != null) {
            Object obj = this.e.get(i10);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = sy0Var.S;
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
        sy0 sy0Var = this.f29433r;
        int i12 = 0;
        if (sy0Var.W != null) {
            int measuredWidth = sy0Var.f30637c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            sy0Var.M.y1(dp);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f29431f;
            sparseArray2.clear();
            this.h = 0;
            this.f29432n = 0;
            for (int i13 = 0; i13 < sy0Var.W.size(); i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) sy0Var.W.get(i13);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f29432n++;
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
            ArrayList arrayList = sy0Var.Y;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = sy0Var.S;
                if (tL_messages_stickerSet != null) {
                    i12 = tL_messages_stickerSet.documents.size();
                }
                this.h = i12;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = sy0Var.S;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = sy0Var.S.set;
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
        ArrayList arrayList = this.f29433r.Y;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f46342a;
        sy0 sy0Var = this.f29433r;
        ArrayList arrayList = sy0Var.W;
        if (arrayList != null) {
            int i11 = b1Var.f46345f;
            SparseArray sparseArray = this.e;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ((org.telegram.ui.Cells.r3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((org.telegram.ui.Cells.j3) view).setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            ((org.telegram.ui.Cells.e8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f29431f.get(i10), null, false, false);
        } else if (sy0Var.X != null) {
            ((org.telegram.ui.Cells.e8) view).setSticker((SendMessagesHelper.ImportingSticker) sy0Var.Y.get(i10));
        } else if (b1Var.f46345f != 3) {
            org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = sy0Var.S;
            if (tL_messages_stickerSet != null) {
                e8Var.d(tL_messages_stickerSet.documents.get(i10), null, sy0Var.S, null, sy0Var.f30644h0, sy0Var.R);
                e8Var.J.setOnClickListener(new aa(26, this, e8Var));
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        sy0 sy0Var = this.f29433r;
        Context context = this.f29430c;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) sy0Var).resourcesProvider;
            ny0 ny0Var = new ny0(this, context, g6Var);
            ny0Var.getImageView().setLayerNum(7);
            frameLayout = ny0Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    g6Var2 = ((org.telegram.ui.ActionBar.h3) sy0Var).resourcesProvider;
                    frameLayout2 = new org.telegram.ui.Cells.r3(8, this.f29430c, g6Var2, true, false);
                } else if (i10 == 3) {
                    g6Var3 = ((org.telegram.ui.ActionBar.h3) sy0Var).resourcesProvider;
                    ?? frameLayout3 = new FrameLayout(context);
                    frameLayout3.f28719a = g6Var3;
                    View view = new View(context);
                    frameLayout3.f28721c = view;
                    int dp = AndroidUtilities.dp(28.0f);
                    int i11 = org.telegram.ui.ActionBar.k6.Me;
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.w0(i11, g6Var3)));
                    frameLayout3.f28720b = c02;
                    Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    org.telegram.ui.ActionBar.r6.z(frameLayout3, mutate, i11, g6Var3, PorterDuff.Mode.MULTIPLY);
                    wq wqVar = new wq(c02, mutate);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    int dp3 = AndroidUtilities.dp(56.0f);
                    wqVar.h = dp2;
                    wqVar.f32326n = dp3;
                    int dp4 = AndroidUtilities.dp(24.0f);
                    int dp5 = AndroidUtilities.dp(24.0f);
                    wqVar.e = dp4;
                    wqVar.f32325f = dp5;
                    view.setBackground(wqVar);
                    w7.b6.a(view);
                    frameLayout3.addView(view, w7.z5.e(56, 56, 17));
                    frameLayout = frameLayout3;
                } else {
                    frameLayout2 = null;
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.j3(context);
            }
            return new s4.b1(frameLayout2);
        }
        frameLayout2 = frameLayout;
        return new s4.b1(frameLayout2);
    }
}
