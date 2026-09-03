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
public final class zu extends ql0 {
    public final lv f31468c;

    public zu(lv lvVar) {
        this.f31468c = lvVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        lv lvVar = this.f31468c;
        vu vuVar = lvVar.e;
        if (lvVar.F) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = vuVar.f25776c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (vuVar.f25776c.length > 1) {
                size = Math.min(lvVar.f26886y.J * 2, size);
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
        lv lvVar = this.f31468c;
        vu vuVar = lvVar.e;
        i10 = ((org.telegram.ui.ActionBar.g3) lvVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = vuVar.f25775b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) vuVar.f25775b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        lvVar.F = r22;
        int i12 = r22 + 1;
        if (vuVar.f25776c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = vuVar.f25776c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(vuVar.f25777f.f26886y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, vuVar.f25776c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        lv lvVar = this.f31468c;
        vu vuVar = lvVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (lvVar.F) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = vuVar.f25776c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (vuVar.f25776c.length > 1) {
                size = Math.min(lvVar.f26886y.J * 2, size);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        lv lvVar = this.f31468c;
        if (i10 == 0) {
            view = lvVar.d;
        } else {
            boolean z4 = true;
            if (i10 == 1) {
                ?? view3 = new View(lvVar.getContext());
                view3.f24043a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = lvVar.getContext();
                if (lvVar.e.f25776c.length > 1) {
                    z4 = false;
                }
                view2 = new gv(lvVar, context, z4);
            } else if (i10 == 3) {
                view2 = new TextView(lvVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(lvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.j6.Ke;
                Pattern pattern = lv.S;
                view4.setBackgroundColor(lvVar.getThemedColor(i11));
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
