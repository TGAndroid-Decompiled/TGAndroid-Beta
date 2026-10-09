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
public final class ty0 extends pm0 {
    public final Context f31305c;
    public int d;
    public final SparseArray f31306e = new SparseArray();
    public final SparseArray f31307f = new SparseArray();
    public int h;
    public int f31308n;
    public final xy0 f31309r;

    public ty0(xy0 xy0Var, Context context) {
        this.f31309r = xy0Var;
        this.f31305c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.h;
    }

    @Override
    public final int j(int i10) {
        xy0 xy0Var = this.f31309r;
        if (xy0Var.W != null) {
            Object obj = this.f31306e.get(i10);
            if (obj != null) {
                if (obj instanceof TLRPC.Document) {
                    return 0;
                }
                return 2;
            }
            return 1;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xy0Var.S;
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
        xy0 xy0Var = this.f31309r;
        int i12 = 0;
        if (xy0Var.W != null) {
            int measuredWidth = xy0Var.f33025c.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            int dp = measuredWidth / AndroidUtilities.dp(72.0f);
            this.d = dp;
            xy0Var.M.y1(dp);
            SparseArray sparseArray = this.f31306e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f31307f;
            sparseArray2.clear();
            this.h = 0;
            this.f31308n = 0;
            for (int i13 = 0; i13 < xy0Var.W.size(); i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) xy0Var.W.get(i13);
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    list = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else {
                    list = stickerSetCovered.covers;
                }
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.f31308n++;
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
            ArrayList arrayList = xy0Var.Y;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xy0Var.S;
                if (tL_messages_stickerSet != null) {
                    i12 = tL_messages_stickerSet.documents.size();
                }
                this.h = i12;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xy0Var.S;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = xy0Var.S.set;
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
        ArrayList arrayList = this.f31309r.Y;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.u(i10);
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        View view = d1Var.f47656a;
        xy0 xy0Var = this.f31309r;
        ArrayList arrayList = xy0Var.W;
        if (arrayList != null) {
            int i11 = d1Var.f47660f;
            SparseArray sparseArray = this.f31306e;
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
            ((org.telegram.ui.Cells.f8) view).d((TLRPC.Document) sparseArray.get(i10), null, this.f31307f.get(i10), null, false, false);
        } else if (xy0Var.X != null) {
            ((org.telegram.ui.Cells.f8) view).setSticker((SendMessagesHelper.ImportingSticker) xy0Var.Y.get(i10));
        } else if (d1Var.f47660f != 3) {
            org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xy0Var.S;
            if (tL_messages_stickerSet != null) {
                f8Var.d(tL_messages_stickerSet.documents.get(i10), null, xy0Var.S, null, xy0Var.f33033h0, xy0Var.R);
                f8Var.J.setOnClickListener(new ut(15, this, f8Var));
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        xy0 xy0Var = this.f31309r;
        Context context = this.f31305c;
        if (i10 == 0) {
            e6Var = ((org.telegram.ui.ActionBar.f3) xy0Var).resourcesProvider;
            sy0 sy0Var = new sy0(this, context, e6Var);
            sy0Var.getImageView().setLayerNum(7);
            frameLayout = sy0Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    e6Var2 = ((org.telegram.ui.ActionBar.f3) xy0Var).resourcesProvider;
                    frameLayout2 = new org.telegram.ui.Cells.s3(8, this.f31305c, e6Var2, true, false);
                } else if (i10 == 3) {
                    e6Var3 = ((org.telegram.ui.ActionBar.f3) xy0Var).resourcesProvider;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    View view = new View(context);
                    int dp = AndroidUtilities.dp(28.0f);
                    int i11 = org.telegram.ui.ActionBar.i6.Me;
                    ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(dp, org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var3)));
                    Drawable mutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var3), PorterDuff.Mode.MULTIPLY));
                    fr frVar = new fr(c02, mutate);
                    int dp2 = AndroidUtilities.dp(56.0f);
                    int dp3 = AndroidUtilities.dp(56.0f);
                    frVar.h = dp2;
                    frVar.f26468n = dp3;
                    int dp4 = AndroidUtilities.dp(24.0f);
                    int dp5 = AndroidUtilities.dp(24.0f);
                    frVar.f26466e = dp4;
                    frVar.f26467f = dp5;
                    view.setBackground(frVar);
                    w7.z5.a(view);
                    frameLayout3.addView(view, w7.x5.e(56, 56, 17));
                    frameLayout = frameLayout3;
                } else {
                    frameLayout2 = null;
                }
            } else {
                frameLayout2 = new org.telegram.ui.Cells.l3(context);
            }
            return new s4.d1(frameLayout2);
        }
        frameLayout2 = frameLayout;
        return new s4.d1(frameLayout2);
    }
}
