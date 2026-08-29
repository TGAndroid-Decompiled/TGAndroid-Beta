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
public final class xu extends il0 {
    public final jv f34829c;

    public xu(jv jvVar) {
        this.f34829c = jvVar;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        jv jvVar = this.f34829c;
        tu tuVar = jvVar.f29825e;
        if (jvVar.E) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = tuVar.f29001c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (tuVar.f29001c.length > 1) {
                size = Math.min(jvVar.f29832y.J * 2, size);
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
        jv jvVar = this.f34829c;
        tu tuVar = jvVar.f29825e;
        i10 = ((org.telegram.ui.ActionBar.f3) jvVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = tuVar.f29000b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) tuVar.f29000b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        jvVar.E = r22;
        int i12 = r22 + 1;
        if (tuVar.f29001c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = tuVar.f29001c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(tuVar.f29003f.f29832y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, tuVar.f29001c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        jv jvVar = this.f34829c;
        tu tuVar = jvVar.f29825e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (jvVar.E) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = tuVar.f29001c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (tuVar.f29001c.length > 1) {
                size = Math.min(jvVar.f29832y.J * 2, size);
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
    public final void v(f2.n1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        jv jvVar = this.f34829c;
        if (i10 == 0) {
            view = jvVar.d;
        } else {
            boolean z10 = true;
            if (i10 == 1) {
                ?? view3 = new View(jvVar.getContext());
                view3.f26893a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = jvVar.getContext();
                if (jvVar.f29825e.f29001c.length > 1) {
                    z10 = false;
                }
                view2 = new ev(jvVar, context, z10);
            } else if (i10 == 3) {
                view2 = new TextView(jvVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(jvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.g6.Ke;
                Pattern pattern = jv.R;
                view4.setBackgroundColor(jvVar.getThemedColor(i11));
                f2.x0 x0Var = new f2.x0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(14.0f);
                view4.setLayoutParams(x0Var);
                view2 = view4;
            } else {
                view = null;
            }
            view = view2;
        }
        return new f2.n1(view);
    }
}
