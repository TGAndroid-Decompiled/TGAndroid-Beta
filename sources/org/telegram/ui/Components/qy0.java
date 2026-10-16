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
public final class qy0 extends lm0 {
    public final Context f28378c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f28379f = new SparseArray();
    public int h;
    public int f28380n;
    public final uy0 f28381r;

    public qy0(uy0 uy0Var, Context context) {
        this.f28381r = uy0Var;
        this.f28378c = context;
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
        uy0 uy0Var = this.f28381r;
        if (uy0Var.W != null) {
            Object obj = this.e.get(i10);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = uy0Var.S;
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
        uy0 uy0Var = this.f28381r;
        int i12 = 0;
        if (uy0Var.W != null) {
            int measuredWidth = uy0Var.f29491c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            uy0Var.M.y1(dp);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f28379f;
            sparseArray2.clear();
            this.h = 0;
            this.f28380n = 0;
            for (int i13 = 0; i13 < uy0Var.W.size(); i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) uy0Var.W.get(i13);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f28380n++;
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
            ArrayList arrayList = uy0Var.Y;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = uy0Var.S;
                if (tL_messages_stickerSet != null) {
                    i12 = tL_messages_stickerSet.documents.size();
                }
                this.h = i12;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = uy0Var.S;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = uy0Var.S.set;
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
        ArrayList arrayList = this.f28381r.Y;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f44838a;
        uy0 uy0Var = this.f28381r;
        ArrayList arrayList = uy0Var.W;
        if (arrayList != null) {
            int i11 = b1Var.f44841f;
            SparseArray sparseArray = this.e;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ((org.telegram.ui.Cells.s3) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i10)).intValue()), false, false, 0, 0, false);
                        return;
                    }
                    return;
                }
                ((org.telegram.ui.Cells.l3) view).setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            ((org.telegram.ui.Cells.f8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f28379f.get(i10), null, false, false);
        } else if (uy0Var.X != null) {
            ((org.telegram.ui.Cells.f8) view).setSticker((SendMessagesHelper.ImportingSticker) uy0Var.Y.get(i10));
        } else if (b1Var.f44841f != 3) {
            org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = uy0Var.S;
            if (tL_messages_stickerSet != null) {
                f8Var.d(tL_messages_stickerSet.documents.get(i10), null, uy0Var.S, null, uy0Var.f29498h0, uy0Var.R);
                f8Var.J.setOnClickListener(new rt(15, this, f8Var));
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        uy0 uy0Var = this.f28381r;
        Context context = this.f28378c;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.e3) uy0Var).resourcesProvider;
            py0 py0Var = new py0(this, context, c6Var);
            py0Var.getImageView().setLayerNum(7);
            frameLayout = py0Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    c6Var2 = ((org.telegram.ui.ActionBar.e3) uy0Var).resourcesProvider;
                    frameLayout2 = new org.telegram.ui.Cells.s3(8, this.f28378c, c6Var2, true, false);
                } else if (i10 == 3) {
                    c6Var3 = ((org.telegram.ui.ActionBar.e3) uy0Var).resourcesProvider;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    View view = new View(context);
                    int dp = AndroidUtilities.dp(28.0f);
                    int i11 = org.telegram.ui.ActionBar.g6.Me;
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.g6.c0(dp, org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.w0(i11, c6Var3)));
                    Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var3), PorterDuff.Mode.MULTIPLY));
                    cr crVar = new cr(c02, mutate);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    int dp3 = AndroidUtilities.dp(56.0f);
                    crVar.h = dp2;
                    crVar.f23880n = dp3;
                    int dp4 = AndroidUtilities.dp(24.0f);
                    int dp5 = AndroidUtilities.dp(24.0f);
                    crVar.e = dp4;
                    crVar.f23879f = dp5;
                    view.setBackground(crVar);
                    w7.b6.a(view);
                    frameLayout3.addView(view, w7.z5.e(56, 56, 17));
                    frameLayout = frameLayout3;
                } else {
                    frameLayout2 = null;
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.l3(context);
            }
            return new s4.b1(frameLayout2);
        }
        frameLayout2 = frameLayout;
        return new s4.b1(frameLayout2);
    }
}
