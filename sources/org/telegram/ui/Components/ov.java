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
public final class ov extends lm0 {
    public final aw f29320c;

    public ov(aw awVar) {
        this.f29320c = awVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        aw awVar = this.f29320c;
        jv jvVar = awVar.e;
        if (awVar.I) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = jvVar.f32654c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (jvVar.f32654c.length > 1) {
                size = Math.min(awVar.f24862y.J * 2, size);
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
        aw awVar = this.f29320c;
        jv jvVar = awVar.e;
        i10 = ((org.telegram.ui.ActionBar.h3) awVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = jvVar.f32653b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) jvVar.f32653b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        awVar.I = r22;
        int i12 = r22 + 1;
        if (jvVar.f32654c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = jvVar.f32654c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(jvVar.f32655f.f24862y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, jvVar.f32654c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        aw awVar = this.f29320c;
        jv jvVar = awVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (awVar.I) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = jvVar.f32654c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (jvVar.f32654c.length > 1) {
                size = Math.min(awVar.f24862y.J * 2, size);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ov.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        View view2;
        aw awVar = this.f29320c;
        if (i10 == 0) {
            view = awVar.d;
        } else {
            boolean z10 = true;
            if (i10 == 1) {
                ?? view3 = new View(awVar.getContext());
                view3.f30279a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = awVar.getContext();
                if (awVar.e.f32654c.length > 1) {
                    z10 = false;
                }
                view2 = new vv(awVar, context, z10);
            } else if (i10 == 3) {
                view2 = new TextView(awVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(awVar.getContext());
                int i11 = org.telegram.ui.ActionBar.k6.Ke;
                g6Var = ((org.telegram.ui.ActionBar.h3) awVar).resourcesProvider;
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
