package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class mv extends km0 {
    public final yv f28701c;

    public mv(yv yvVar) {
        this.f28701c = yvVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        yv yvVar = this.f28701c;
        hv hvVar = yvVar.e;
        if (yvVar.I) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = hvVar.f32051c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (hvVar.f32051c.length > 1) {
                size = Math.min(yvVar.f33056y.J * 2, size);
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
        yv yvVar = this.f28701c;
        hv hvVar = yvVar.e;
        i10 = ((org.telegram.ui.ActionBar.h3) yvVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = hvVar.f32050b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) hvVar.f32050b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        yvVar.I = r22;
        int i12 = r22 + 1;
        if (hvVar.f32051c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = hvVar.f32051c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(hvVar.f32052f.f33056y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, hvVar.f32051c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        yv yvVar = this.f28701c;
        hv hvVar = yvVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (yvVar.I) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = hvVar.f32051c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (hvVar.f32051c.length > 1) {
                size = Math.min(yvVar.f33056y.J * 2, size);
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
    public final void v(s4.b1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        View view2;
        yv yvVar = this.f28701c;
        if (i10 == 0) {
            view = yvVar.d;
        } else {
            boolean z10 = true;
            if (i10 == 1) {
                ?? view3 = new View(yvVar.getContext());
                view3.f29682a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = yvVar.getContext();
                if (yvVar.e.f32051c.length > 1) {
                    z10 = false;
                }
                view2 = new tv(yvVar, context, z10);
            } else if (i10 == 3) {
                view2 = new TextView(yvVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(yvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.k6.Ke;
                g6Var = ((org.telegram.ui.ActionBar.h3) yvVar).resourcesProvider;
                org.telegram.ui.ActionBar.r6.i(i11, view4, g6Var);
                s4.o0 o0Var = new s4.o0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(14.0f);
                view4.setLayoutParams(o0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new s4.b1(view);
    }
}
