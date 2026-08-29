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
public final class jx0 extends il0 {
    public final Context f29840c;
    public int d;
    public final SparseArray f29841e = new SparseArray();
    public final SparseArray f29842f = new SparseArray();
    public int h;
    public int f29843n;
    public final nx0 f29844r;

    public jx0(nx0 nx0Var, Context context) {
        this.f29844r = nx0Var;
        this.f29840c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int j(int i10) {
        nx0 nx0Var = this.f29844r;
        if (nx0Var.S != null) {
            Object obj = this.f29841e.get(i10);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nx0Var.O;
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
        nx0 nx0Var = this.f29844r;
        int i12 = 0;
        if (nx0Var.S != null) {
            int measuredWidth = nx0Var.f31171c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            nx0Var.I.y1(dp);
            SparseArray sparseArray = this.f29841e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f29842f;
            sparseArray2.clear();
            this.h = 0;
            this.f29843n = 0;
            for (int i13 = 0; i13 < nx0Var.S.size(); i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) nx0Var.S.get(i13);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f29843n++;
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
            ArrayList arrayList = nx0Var.U;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nx0Var.O;
                if (tL_messages_stickerSet != null) {
                    i12 = tL_messages_stickerSet.documents.size();
                }
                this.h = i12;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = nx0Var.O;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = nx0Var.O.set;
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
        ArrayList arrayList = this.f29844r.U;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        View view = n1Var.f6432a;
        nx0 nx0Var = this.f29844r;
        ArrayList arrayList = nx0Var.S;
        if (arrayList != null) {
            int i11 = n1Var.f6436f;
            SparseArray sparseArray = this.f29841e;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ((org.telegram.ui.Cells.p3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((org.telegram.ui.Cells.i3) view).setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            ((org.telegram.ui.Cells.b8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f29842f.get(i10), null, false, false);
        } else if (nx0Var.T != null) {
            ((org.telegram.ui.Cells.b8) view).setSticker((SendMessagesHelper.ImportingSticker) nx0Var.U.get(i10));
        } else if (n1Var.f6436f != 3) {
            org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nx0Var.O;
            if (tL_messages_stickerSet != null) {
                b8Var.d(tL_messages_stickerSet.documents.get(i10), null, nx0Var.O, null, nx0Var.f31173d0, nx0Var.N);
                b8Var.F.setOnClickListener(new fi0(3, this, b8Var));
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        nx0 nx0Var = this.f29844r;
        Context context = this.f29840c;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.f3) nx0Var).resourcesProvider;
            ix0 ix0Var = new ix0(this, context, c6Var);
            ix0Var.getImageView().setLayerNum(7);
            frameLayout = ix0Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    c6Var2 = ((org.telegram.ui.ActionBar.f3) nx0Var).resourcesProvider;
                    frameLayout2 = new org.telegram.ui.Cells.p3(8, this.f29840c, c6Var2, true, false);
                } else if (i10 == 3) {
                    c6Var3 = ((org.telegram.ui.ActionBar.f3) nx0Var).resourcesProvider;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    View view = new View(context);
                    int dp = AndroidUtilities.dp(28.0f);
                    int i11 = org.telegram.ui.ActionBar.g6.Me;
                    ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var3)));
                    Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var3), PorterDuff.Mode.MULTIPLY));
                    jq jqVar = new jq(b02, mutate);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    int dp3 = AndroidUtilities.dp(56.0f);
                    jqVar.h = dp2;
                    jqVar.f29789n = dp3;
                    int dp4 = AndroidUtilities.dp(24.0f);
                    int dp5 = AndroidUtilities.dp(24.0f);
                    jqVar.f29787e = dp4;
                    jqVar.f29788f = dp5;
                    view.setBackground(jqVar);
                    i7.h6.a(view);
                    frameLayout3.addView(view, i7.f6.e(56, 56, 17));
                    frameLayout = frameLayout3;
                } else {
                    frameLayout2 = null;
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.i3(context);
            }
            return new f2.n1(frameLayout2);
        }
        frameLayout2 = frameLayout;
        return new f2.n1(frameLayout2);
    }
}
