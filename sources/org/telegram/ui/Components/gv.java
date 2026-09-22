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
public final class gv extends kl0 {
    public final sv f24460c;

    public gv(sv svVar) {
        this.f24460c = svVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42674f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        sv svVar = this.f24460c;
        cv cvVar = svVar.e;
        if (svVar.I) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = cvVar.f27151c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (cvVar.f27151c.length > 1) {
                size = Math.min(svVar.f27979y.J * 2, size);
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
        sv svVar = this.f24460c;
        cv cvVar = svVar.e;
        i10 = ((org.telegram.ui.ActionBar.f3) svVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = cvVar.f27150b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) cvVar.f27150b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        svVar.I = r22;
        int i12 = r22 + 1;
        if (cvVar.f27151c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = cvVar.f27151c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(cvVar.f27152f.f27979y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, cvVar.f27151c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        sv svVar = this.f24460c;
        cv cvVar = svVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (svVar.I) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = cvVar.f27151c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (cvVar.f27151c.length > 1) {
                size = Math.min(svVar.f27979y.J * 2, size);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gv.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        sv svVar = this.f24460c;
        if (i10 == 0) {
            view = svVar.d;
        } else {
            boolean z10 = true;
            if (i10 == 1) {
                ?? view3 = new View(svVar.getContext());
                view3.f25437a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = svVar.getContext();
                if (svVar.e.f27151c.length > 1) {
                    z10 = false;
                }
                view2 = new nv(svVar, context, z10);
            } else if (i10 == 3) {
                view2 = new TextView(svVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(svVar.getContext());
                int i11 = org.telegram.ui.ActionBar.i6.Ke;
                Pattern pattern = sv.V;
                view4.setBackgroundColor(svVar.getThemedColor(i11));
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
