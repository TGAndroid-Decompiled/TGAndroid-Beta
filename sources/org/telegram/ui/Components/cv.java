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
public final class cv extends sl0 {
    public final ov f26088c;

    public cv(ov ovVar) {
        this.f26088c = ovVar;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        ov ovVar = this.f26088c;
        yu yuVar = ovVar.f29874e;
        if (ovVar.F) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = yuVar.f28832c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (yuVar.f28832c.length > 1) {
                size = Math.min(ovVar.f29881y.J * 2, size);
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
        ov ovVar = this.f26088c;
        yu yuVar = ovVar.f29874e;
        i10 = ((org.telegram.ui.ActionBar.h3) ovVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = yuVar.f28831b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) yuVar.f28831b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        ovVar.F = r22;
        int i12 = r22 + 1;
        if (yuVar.f28832c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = yuVar.f28832c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(yuVar.f28834f.f29881y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, yuVar.f28832c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        ov ovVar = this.f26088c;
        yu yuVar = ovVar.f29874e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (ovVar.F) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = yuVar.f28832c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (yuVar.f28832c.length > 1) {
                size = Math.min(ovVar.f29881y.J * 2, size);
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
    public final void v(f2.m1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cv.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        ov ovVar = this.f26088c;
        if (i10 == 0) {
            view = ovVar.d;
        } else {
            boolean z4 = true;
            if (i10 == 1) {
                ?? view3 = new View(ovVar.getContext());
                view3.f27018a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = ovVar.getContext();
                if (ovVar.f29874e.f28832c.length > 1) {
                    z4 = false;
                }
                view2 = new jv(ovVar, context, z4);
            } else if (i10 == 3) {
                view2 = new TextView(ovVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(ovVar.getContext());
                int i11 = org.telegram.ui.ActionBar.k6.Ke;
                Pattern pattern = ov.S;
                view4.setBackgroundColor(ovVar.getThemedColor(i11));
                f2.x0 x0Var = new f2.x0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(14.0f);
                view4.setLayoutParams(x0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new f2.m1(view);
    }
}
