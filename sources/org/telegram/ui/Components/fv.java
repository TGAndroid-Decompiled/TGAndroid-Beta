package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class fv extends kl0 {
    public final rv f26211c;

    public fv(rv rvVar) {
        this.f26211c = rvVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45770f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        rv rvVar = this.f26211c;
        bv bvVar = rvVar.f30122e;
        if (rvVar.I) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = bvVar.f29219c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (bvVar.f29219c.length > 1) {
                size = Math.min(rvVar.f30129y.J * 2, size);
            }
            i11 += size + 2;
            i12++;
        }
        return i11;
    }

    @Override
    public final int h() {
        int i10;
        ?? r22;
        int i11;
        int min;
        ArrayList arrayList;
        rv rvVar = this.f26211c;
        bv bvVar = rvVar.f30122e;
        i10 = ((org.telegram.ui.ActionBar.f3) rvVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = bvVar.f29218b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) bvVar.f29218b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        rvVar.I = r22;
        int i12 = r22 + 1;
        if (bvVar.f29219c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = bvVar.f29219c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(bvVar.f29221f.f30129y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, bvVar.f29219c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        rv rvVar = this.f26211c;
        bv bvVar = rvVar.f30122e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (rvVar.I) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = bvVar.f29219c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (bvVar.f29219c.length > 1) {
                size = Math.min(rvVar.f30129y.J * 2, size);
            }
            int i14 = size + 1 + i13;
            if (i12 == i14) {
                return 4;
            }
            i13 = i14 + 1;
            i11++;
        }
    }

    @Override
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fv.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        rv rvVar = this.f26211c;
        if (i10 == 0) {
            view = rvVar.d;
        } else {
            boolean z10 = true;
            if (i10 == 1) {
                ?? view3 = new View(rvVar.getContext());
                view3.f27294a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = rvVar.getContext();
                if (rvVar.f30122e.f29219c.length > 1) {
                    z10 = false;
                }
                view2 = new mv(rvVar, context, z10);
            } else if (i10 == 3) {
                view2 = new TextView(rvVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(rvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.j6.Ke;
                Pattern pattern = rv.V;
                view4.setBackgroundColor(rvVar.getThemedColor(i11));
                s4.p0 p0Var = new s4.p0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(14.0f);
                view4.setLayoutParams(p0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new s4.c1(view);
    }
}
