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
public final class zv extends vm0 {
    public final lw f33495c;

    public zv(lw lwVar) {
        this.f33495c = lwVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47893f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        lw lwVar = this.f33495c;
        vv vvVar = lwVar.f28294e;
        if (lwVar.I) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = vvVar.f27295c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (vvVar.f27295c.length > 1) {
                size = Math.min(lwVar.f28301y.J * 2, size);
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
        lw lwVar = this.f33495c;
        vv vvVar = lwVar.f28294e;
        i10 = ((org.telegram.ui.ActionBar.e3) lwVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = vvVar.f27294b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) vvVar.f27294b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        lwVar.I = r22;
        int i12 = r22 + 1;
        if (vvVar.f27295c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = vvVar.f27295c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(vvVar.f27297f.f28301y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, vvVar.f27295c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        lw lwVar = this.f33495c;
        vv vvVar = lwVar.f28294e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (lwVar.I) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = vvVar.f27295c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (vvVar.f27295c.length > 1) {
                size = Math.min(lwVar.f28301y.J * 2, size);
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
    public final void v(s4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zv.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        lw lwVar = this.f33495c;
        if (i10 == 0) {
            view = lwVar.d;
        } else {
            boolean z10 = true;
            if (i10 == 1) {
                ?? view3 = new View(lwVar.getContext());
                view3.f25035a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = lwVar.getContext();
                if (lwVar.f28294e.f27295c.length > 1) {
                    z10 = false;
                }
                view2 = new gw(lwVar, context, z10);
            } else if (i10 == 3) {
                view2 = new TextView(lwVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(lwVar.getContext());
                int i11 = org.telegram.ui.ActionBar.h6.Ke;
                Pattern pattern = lw.V;
                view4.setBackgroundColor(lwVar.getThemedColor(i11));
                s4.q0 q0Var = new s4.q0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(14.0f);
                view4.setLayoutParams(q0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new s4.d1(view);
    }
}
