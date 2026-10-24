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
public final class cx extends wx {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.o2 E0;
    public final boolean F0;
    public final rz G0;

    public cx(rz rzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        super(rzVar, context, g6Var);
        this.G0 = rzVar;
        this.E0 = o2Var;
        this.F0 = z10;
    }

    @Override
    public final void j() {
        dx dxVar = this.G0.C0;
        if (dxVar != null) {
            dxVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        rz rzVar = this.G0;
        org.telegram.ui.Cells.u5 u5Var = rzVar.f30321f2;
        int i12 = rzVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = rzVar.f30310c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = rzVar.f30313d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new xl(this, 1));
        ArrayList arrayList2 = rzVar.H2;
        if (arrayList2 != null) {
            arrayList2.clear();
            rzVar.H2.addAll(arrayList);
        }
        rzVar.D();
        AndroidUtilities.cancelRunOnUIThread(u5Var);
        AndroidUtilities.runOnUIThread(u5Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = rzVar.f30315e0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f20371id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ci.d6(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        rzVar.X(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.o2 o2Var = this.E0;
            if (o2Var != null) {
                vc.a0(o2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new qd(1, o2Var)).j();
                return;
            }
            FrameLayout frameLayout = rzVar.f30354r;
            if (frameLayout != null) {
                new vc(frameLayout, rzVar.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        rz rzVar = this.G0;
        rzVar.Y();
        dx dxVar = rzVar.C0;
        if (dxVar != null) {
            dxVar.invalidate();
        }
        invalidate();
        sy syVar = rzVar.f30363t1;
        if (syVar != null) {
            syVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            if (!this.F0) {
                this.G0.f30376x0.invalidate();
            }
        }
    }
}
