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
public final class ru extends vk0 {
    public final dv f32289c;

    public ru(dv dvVar) {
        this.f32289c = dvVar;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i9) {
        int i10;
        dv dvVar = this.f32289c;
        nu nuVar = dvVar.f27816e;
        if (dvVar.E) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = nuVar.f26910c;
            if (i11 >= arrayListArr.length || i11 == i9) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (nuVar.f26910c.length > 1) {
                size = Math.min(dvVar.f27823y.J * 2, size);
            }
            i10 += size + 2;
            i11++;
        }
        return i10;
    }

    @Override
    public final int h() {
        int i9;
        ?? r22;
        int i10;
        int min;
        ArrayList arrayList;
        dv dvVar = this.f32289c;
        nu nuVar = dvVar.f27816e;
        i9 = ((org.telegram.ui.ActionBar.f3) dvVar).currentAccount;
        if (!UserConfig.getInstance(i9).isPremium() && (arrayList = nuVar.f26909b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) nuVar.f26909b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        dvVar.E = r22;
        int i11 = r22 + 1;
        if (nuVar.f26910c == null) {
            i10 = 0;
        } else {
            int i12 = 0;
            i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = nuVar.f26910c;
                if (i12 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i12];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(nuVar.f26912f.f27823y.J * 2, arrayList2.size());
                    }
                    i10 = min + i10 + 1;
                }
                i12++;
            }
        }
        return Math.max(0, nuVar.f26910c.length - 1) + i11 + i10;
    }

    @Override
    public final int j(int i9) {
        dv dvVar = this.f32289c;
        nu nuVar = dvVar.f27816e;
        int i10 = 0;
        if (i9 == 0) {
            return 0;
        }
        int i11 = i9 - 1;
        if (dvVar.E) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i9 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = nuVar.f26910c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (nuVar.f26910c.length > 1) {
                size = Math.min(dvVar.f27823y.J * 2, size);
            }
            int i13 = size + 1 + i12;
            if (i11 == i13) {
                return 4;
            }
            i12 = i13 + 1;
            i10++;
        }
    }

    @Override
    public final void v(f2.q1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ru.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2;
        dv dvVar = this.f32289c;
        if (i9 == 0) {
            view = dvVar.d;
        } else {
            boolean z10 = true;
            if (i9 == 1) {
                ?? view3 = new View(dvVar.getContext());
                view3.f33143a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i9 == 2) {
                Context context = dvVar.getContext();
                if (dvVar.f27816e.f26910c.length > 1) {
                    z10 = false;
                }
                view2 = new yu(dvVar, context, z10);
            } else if (i9 == 3) {
                view2 = new TextView(dvVar.getContext());
            } else if (i9 == 4) {
                View view4 = new View(dvVar.getContext());
                int i10 = org.telegram.ui.ActionBar.f6.Ke;
                Pattern pattern = dv.R;
                view4.setBackgroundColor(dvVar.getThemedColor(i10));
                f2.a1 a1Var = new f2.a1(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) a1Var).topMargin = AndroidUtilities.dp(14.0f);
                view4.setLayoutParams(a1Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new f2.q1(view);
    }
}
