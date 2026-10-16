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
public final class ix extends dy {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.m2 E0;
    public final boolean F0;
    public final wz G0;

    public ix(wz wzVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.m2 m2Var, boolean z10) {
        super(wzVar, context, c6Var);
        this.G0 = wzVar;
        this.E0 = m2Var;
        this.F0 = z10;
    }

    @Override
    public final void j() {
        jx jxVar = this.G0.C0;
        if (jxVar != null) {
            jxVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        wz wzVar = this.G0;
        org.telegram.ui.Cells.l7 l7Var = wzVar.f30718f2;
        int i12 = wzVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = wzVar.f30707c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = wzVar.f30710d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new bm(this, 1));
        ArrayList arrayList2 = wzVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            wzVar.G2.addAll(arrayList);
        }
        wzVar.E();
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        AndroidUtilities.runOnUIThread(l7Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = wzVar.f30712e0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f18943id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new bi.g7(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        wzVar.X(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.m2 m2Var = this.E0;
            if (m2Var != null) {
                zc.a0(m2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new ud(1, m2Var)).j();
                return;
            }
            FrameLayout frameLayout = wzVar.f30751r;
            if (frameLayout != null) {
                new zc(frameLayout, wzVar.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        wz wzVar = this.G0;
        wzVar.Y();
        jx jxVar = wzVar.C0;
        if (jxVar != null) {
            jxVar.invalidate();
        }
        invalidate();
        wy wyVar = wzVar.f30760t1;
        if (wyVar != null) {
            wyVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            if (!this.F0) {
                this.G0.f30773x0.invalidate();
            }
        }
    }
}
