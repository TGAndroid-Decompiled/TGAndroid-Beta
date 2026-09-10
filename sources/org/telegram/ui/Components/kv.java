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
public final class kv extends ul0 {
    public final wv f24813c;

    public kv(wv wvVar) {
        this.f24813c = wvVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        wv wvVar = this.f24813c;
        gv gvVar = wvVar.e;
        if (wvVar.I) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = gvVar.f27497c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (gvVar.f27497c.length > 1) {
                size = Math.min(wvVar.f28849y.J * 2, size);
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
        wv wvVar = this.f24813c;
        gv gvVar = wvVar.e;
        i10 = ((org.telegram.ui.ActionBar.h3) wvVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = gvVar.f27496b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) gvVar.f27496b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        wvVar.I = r22;
        int i12 = r22 + 1;
        if (gvVar.f27497c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = gvVar.f27497c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(gvVar.f27498f.f28849y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, gvVar.f27497c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        wv wvVar = this.f24813c;
        gv gvVar = wvVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (wvVar.I) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = gvVar.f27497c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (gvVar.f27497c.length > 1) {
                size = Math.min(wvVar.f28849y.J * 2, size);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kv.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        wv wvVar = this.f24813c;
        if (i10 == 0) {
            view = wvVar.d;
        } else {
            boolean z10 = true;
            if (i10 == 1) {
                ?? view3 = new View(wvVar.getContext());
                view3.f25605a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = wvVar.getContext();
                if (wvVar.e.f27497c.length > 1) {
                    z10 = false;
                }
                view2 = new rv(wvVar, context, z10);
            } else if (i10 == 3) {
                view2 = new TextView(wvVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(wvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.j6.Ke;
                Pattern pattern = wv.V;
                view4.setBackgroundColor(wvVar.getThemedColor(i11));
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
