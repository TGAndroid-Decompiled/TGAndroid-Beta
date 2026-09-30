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
public final class jv extends yl0 {
    public final vv f25550c;

    public jv(vv vvVar) {
        this.f25550c = vvVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43071f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        vv vvVar = this.f25550c;
        fv fvVar = vvVar.e;
        if (vvVar.I) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = fvVar.f28354c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (fvVar.f28354c.length > 1) {
                size = Math.min(vvVar.f29733y.J * 2, size);
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
        vv vvVar = this.f25550c;
        fv fvVar = vvVar.e;
        i10 = ((org.telegram.ui.ActionBar.e3) vvVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = fvVar.f28353b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) fvVar.f28353b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        vvVar.I = r22;
        int i12 = r22 + 1;
        if (fvVar.f28354c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = fvVar.f28354c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(fvVar.f28355f.f29733y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, fvVar.f28354c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        vv vvVar = this.f25550c;
        fv fvVar = vvVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (vvVar.I) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = fvVar.f28354c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (fvVar.f28354c.length > 1) {
                size = Math.min(vvVar.f29733y.J * 2, size);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jv.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        vv vvVar = this.f25550c;
        if (i10 == 0) {
            view = vvVar.d;
        } else {
            boolean z10 = true;
            if (i10 == 1) {
                ?? view3 = new View(vvVar.getContext());
                view3.f26394a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = vvVar.getContext();
                if (vvVar.e.f28354c.length > 1) {
                    z10 = false;
                }
                view2 = new qv(vvVar, context, z10);
            } else if (i10 == 3) {
                view2 = new TextView(vvVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(vvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.h6.Ke;
                Pattern pattern = vv.V;
                view4.setBackgroundColor(vvVar.getThemedColor(i11));
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
