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
public final class iv extends wl0 {
    public final uv f25193c;

    public iv(uv uvVar) {
        this.f25193c = uvVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i10) {
        int i11;
        uv uvVar = this.f25193c;
        ev evVar = uvVar.e;
        if (uvVar.I) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = evVar.f28068c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (evVar.f28068c.length > 1) {
                size = Math.min(uvVar.f28919y.J * 2, size);
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
        uv uvVar = this.f25193c;
        ev evVar = uvVar.e;
        i10 = ((org.telegram.ui.ActionBar.e3) uvVar).currentAccount;
        if (!UserConfig.getInstance(i10).isPremium() && (arrayList = evVar.f28067b) != null && arrayList.size() == 1 && MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) evVar.f28067b.get(0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        uvVar.I = r22;
        int i12 = r22 + 1;
        if (evVar.f28068c == null) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = evVar.f28068c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(evVar.f28069f.f28919y.J * 2, arrayList2.size());
                    }
                    i11 = min + i11 + 1;
                }
                i13++;
            }
        }
        return Math.max(0, evVar.f28068c.length - 1) + i12 + i11;
    }

    @Override
    public final int j(int i10) {
        uv uvVar = this.f25193c;
        ev evVar = uvVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (uvVar.I) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = evVar.f28068c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (evVar.f28068c.length > 1) {
                size = Math.min(uvVar.f28919y.J * 2, size);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        uv uvVar = this.f25193c;
        if (i10 == 0) {
            view = uvVar.d;
        } else {
            boolean z10 = true;
            if (i10 == 1) {
                ?? view3 = new View(uvVar.getContext());
                view3.f26182a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = view3;
            } else if (i10 == 2) {
                Context context = uvVar.getContext();
                if (uvVar.e.f28068c.length > 1) {
                    z10 = false;
                }
                view2 = new pv(uvVar, context, z10);
            } else if (i10 == 3) {
                view2 = new TextView(uvVar.getContext());
            } else if (i10 == 4) {
                View view4 = new View(uvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.h6.Ke;
                Pattern pattern = uv.V;
                view4.setBackgroundColor(uvVar.getThemedColor(i11));
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
