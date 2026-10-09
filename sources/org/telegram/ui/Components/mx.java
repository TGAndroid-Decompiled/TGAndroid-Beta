package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class mx extends hy {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.n2 E0;
    public final boolean F0;
    public final a00 G0;

    public mx(a00 a00Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        super(a00Var, context, e6Var);
        this.G0 = a00Var;
        this.E0 = n2Var;
        this.F0 = z10;
    }

    @Override
    public final void j() {
        nx nxVar = this.G0.C0;
        if (nxVar != null) {
            nxVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        a00 a00Var = this.G0;
        org.telegram.ui.Cells.t6 t6Var = a00Var.f24413f2;
        int i12 = a00Var.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = a00Var.f24401c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = a00Var.f24404d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new fm(this, 1));
        ArrayList arrayList2 = a00Var.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            a00Var.G2.addAll(arrayList);
        }
        a00Var.E();
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        AndroidUtilities.runOnUIThread(t6Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = a00Var.f24407e0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.vision.e2.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f20065id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ai.v7(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        a00Var.X(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.n2 n2Var = this.E0;
            if (n2Var != null) {
                ad.a0(n2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new wd(1, n2Var)).j();
                return;
            }
            FrameLayout frameLayout = a00Var.f24446r;
            if (frameLayout != null) {
                new ad(frameLayout, a00Var.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        a00 a00Var = this.G0;
        a00Var.Y();
        nx nxVar = a00Var.C0;
        if (nxVar != null) {
            nxVar.invalidate();
        }
        invalidate();
        az azVar = a00Var.f24455t1;
        if (azVar != null) {
            azVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            if (!this.F0) {
                this.G0.f24468x0.invalidate();
            }
        }
    }
}
