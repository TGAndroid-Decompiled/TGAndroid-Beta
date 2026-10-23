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
public final class ex extends yx {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.o2 E0;
    public final boolean F0;
    public final tz G0;

    public ex(tz tzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        super(tzVar, context, g6Var);
        this.G0 = tzVar;
        this.E0 = o2Var;
        this.F0 = z10;
    }

    @Override
    public final void j() {
        fx fxVar = this.G0.C0;
        if (fxVar != null) {
            fxVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        tz tzVar = this.G0;
        org.telegram.ui.Cells.u5 u5Var = tzVar.f30977f2;
        int i12 = tzVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = tzVar.f30966c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = tzVar.f30969d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new zl(this, 1));
        ArrayList arrayList2 = tzVar.H2;
        if (arrayList2 != null) {
            arrayList2.clear();
            tzVar.H2.addAll(arrayList);
        }
        tzVar.D();
        AndroidUtilities.cancelRunOnUIThread(u5Var);
        AndroidUtilities.runOnUIThread(u5Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = tzVar.f30971e0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f20370id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ci.d6(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        tzVar.X(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.o2 o2Var = this.E0;
            if (o2Var != null) {
                xc.a0(o2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new sd(1, o2Var)).j();
                return;
            }
            FrameLayout frameLayout = tzVar.f31010r;
            if (frameLayout != null) {
                new xc(frameLayout, tzVar.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        tz tzVar = this.G0;
        tzVar.Y();
        fx fxVar = tzVar.C0;
        if (fxVar != null) {
            fxVar.invalidate();
        }
        invalidate();
        uy uyVar = tzVar.f31019t1;
        if (uyVar != null) {
            uyVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            if (!this.F0) {
                this.G0.f31032x0.invalidate();
            }
        }
    }
}
