package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class g8 extends m41 {

    public static final int f24402a = 0;

    static {
        m41.setup(new g8());
    }

    @Override
    public final void attachedView(zk0 zk0Var, View view, n41 n41Var) {
        h8 h8Var = (h8) view;
        h8Var.b(n41Var.f30838e, true);
        h8Var.c(zk0Var instanceof k51 ? ((k51) zk0Var).Y2 : false);
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        int i10 = b51Var.f26940f;
        h8 h8Var = (h8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) n41Var.G;
        boolean z11 = false;
        h8Var.d(tL_messages_stickerSet, z10, false);
        h8Var.b(n41Var.f30838e, false);
        h8Var.c(k51Var.Y2);
        h8Var.setOnOptionsClick(n41Var.D);
        h8Var.f24462y.setOnClickListener(n41Var.E);
        h8Var.A.setOnClickListener(n41Var.E);
        h8Var.B.setOnClickListener(n41Var.E);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        boolean zIsStickerPackInstalled = MediaDataController.getInstance(i10).isStickerPackInstalled(tL_messages_stickerSet.set.f22407id);
        boolean zIsPremium = UserConfig.getInstance(i10).isPremium();
        boolean z12 = !zIsPremium;
        if (zIsPremium) {
            z11 = z12;
            break;
        }
        for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
            if (!MessageObject.isFreeEmoji(tL_messages_stickerSet.documents.get(i11))) {
                z11 = z12;
                break;
            }
        }
        h8Var.e(z11 ? (!zIsStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : zIsStickerPackInstalled ? 4 : 3);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        final h8 h8Var = new h8(context, 1);
        if (zk0Var instanceof k51) {
            final k51 k51Var = (k51) zk0Var;
            h8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    k51 k51Var2;
                    f2.f0 f0Var;
                    if (motionEvent.getAction() != 0 || (f0Var = (k51Var2 = k51Var).V2) == null) {
                        return false;
                    }
                    f0Var.r(k51Var2.T(h8Var));
                    return false;
                }
            });
        }
        return h8Var;
    }
}
