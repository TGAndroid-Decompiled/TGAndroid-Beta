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
public final class av extends rl0 {
    public final mv f23509c;

    public av(mv mvVar) {
        this.f23509c = mvVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        mv mvVar = this.f23509c;
        wu wuVar = mvVar.e;
        if (mvVar.F) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = wuVar.f26050c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (wuVar.f26050c.length > 1) {
                size = Math.min(mvVar.f27131y.J * 2, size);
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
        mv mvVar = this.f23509c;
        wu wuVar = mvVar.e;
        i10 = ((org.telegram.ui.ActionBar.g3) mvVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = wuVar.f26049b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) wuVar.f26049b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        mvVar.F = r22;
        int i12 = r22 + 1;
        if (wuVar.f26050c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = wuVar.f26050c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(wuVar.f26051f.f27131y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, wuVar.f26050c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        mv mvVar = this.f23509c;
        wu wuVar = mvVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (mvVar.F) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = wuVar.f26050c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (wuVar.f26050c.length > 1) {
                size = Math.min(mvVar.f27131y.J * 2, size);
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
    public final void v(f2.l1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.av.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        mv mvVar = this.f23509c;
        if (i10 == 0) {
            view = mvVar.d;
        } else {
            boolean z4 = true;
            if (i10 == 1) {
                ?? view3 = new View(mvVar.getContext());
                view3.f24377a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = mvVar.getContext();
                if (mvVar.e.f26050c.length > 1) {
                    z4 = false;
                }
                view2 = new hv(mvVar, context, z4);
            } else if (i10 == 3) {
                view2 = new TextView(mvVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(mvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.j6.Ke;
                Pattern pattern = mv.S;
                view4.setBackgroundColor(mvVar.getThemedColor(i11));
                f2.w0 w0Var = new f2.w0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) w0Var).topMargin = AndroidUtilities.dp(14.0f);
                view4.setLayoutParams(w0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new f2.l1(view);
    }
}
