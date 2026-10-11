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
public final class nx extends iy {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.m2 E0;
    public final boolean F0;
    public final b00 G0;

    public nx(b00 b00Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.m2 m2Var, boolean z10) {
        super(b00Var, context, d6Var);
        this.G0 = b00Var;
        this.E0 = m2Var;
        this.F0 = z10;
    }

    @Override
    public final void j() {
        ox oxVar = this.G0.C0;
        if (oxVar != null) {
            oxVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        b00 b00Var = this.G0;
        org.telegram.ui.Cells.t6 t6Var = b00Var.f24743f2;
        int i12 = b00Var.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = b00Var.f24731c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = b00Var.f24734d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new fm(this, 1));
        ArrayList arrayList2 = b00Var.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            b00Var.G2.addAll(arrayList);
        }
        b00Var.E();
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        AndroidUtilities.runOnUIThread(t6Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = b00Var.f24737e0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.vision.e2.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f20095id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ai.v7(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        b00Var.X(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.m2 m2Var = this.E0;
            if (m2Var != null) {
                ad.a0(m2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new wd(1, m2Var)).j();
                return;
            }
            FrameLayout frameLayout = b00Var.f24776r;
            if (frameLayout != null) {
                new ad(frameLayout, b00Var.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        b00 b00Var = this.G0;
        b00Var.Y();
        ox oxVar = b00Var.C0;
        if (oxVar != null) {
            oxVar.invalidate();
        }
        invalidate();
        bz bzVar = b00Var.f24785t1;
        if (bzVar != null) {
            bzVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            if (!this.F0) {
                this.G0.f24798x0.invalidate();
            }
        }
    }
}
