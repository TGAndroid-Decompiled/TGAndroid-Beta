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
public final class ww extends qx {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.o2 E0;
    public final boolean F0;
    public final kz G0;

    public ww(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        super(kzVar, context, f6Var);
        this.G0 = kzVar;
        this.E0 = o2Var;
        this.F0 = z10;
    }

    @Override
    public final void j() {
        xw xwVar = this.G0.C0;
        if (xwVar != null) {
            xwVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        kz kzVar = this.G0;
        org.telegram.ui.Cells.l7 l7Var = kzVar.f25724f2;
        int i12 = kzVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = kzVar.f25713c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = kzVar.f25716d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new ol(this, 1));
        ArrayList arrayList2 = kzVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            kzVar.G2.addAll(arrayList);
        }
        kzVar.F();
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        AndroidUtilities.runOnUIThread(l7Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = kzVar.f25718e0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.vision.e2.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f18148id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ai.t7(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        kzVar.Y(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.o2 o2Var = this.E0;
            if (o2Var != null) {
                vc.a0(o2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new rd(1, o2Var)).j();
                return;
            }
            FrameLayout frameLayout = kzVar.f25757r;
            if (frameLayout != null) {
                new vc(frameLayout, kzVar.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        kz kzVar = this.G0;
        kzVar.Z();
        xw xwVar = kzVar.C0;
        if (xwVar != null) {
            xwVar.invalidate();
        }
        invalidate();
        ky kyVar = kzVar.f25766t1;
        if (kyVar != null) {
            kyVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            if (!this.F0) {
                this.G0.f25779x0.invalidate();
            }
        }
    }
}
