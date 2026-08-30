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
public final class tw extends px {
    public static final int E0 = 0;
    public final org.telegram.ui.ActionBar.p2 B0;
    public final boolean C0;
    public final kz D0;

    public tw(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        super(kzVar, context, f6Var);
        this.D0 = kzVar;
        this.B0 = p2Var;
        this.C0 = z4;
    }

    @Override
    public final void j() {
        uw uwVar = this.D0.f26491z0;
        if (uwVar != null) {
            uwVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        kz kzVar = this.D0;
        m2.b bVar = kzVar.f26419c2;
        int i12 = kzVar.B1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = kzVar.Z0;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = kzVar.f26411a1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new jl(this, 1));
        ArrayList arrayList2 = kzVar.E2;
        if (arrayList2 != null) {
            arrayList2.clear();
            kzVar.E2.addAll(arrayList);
        }
        kzVar.F();
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = kzVar.f26413b0; i16 < arrayList.size(); i16 = android.support.v4.media.a.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f19211id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new nh.p5(9));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        kzVar.Z(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.p2 p2Var = this.B0;
            if (p2Var != null) {
                qc.a0(p2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new jd(1, p2Var)).j();
                return;
            }
            FrameLayout frameLayout = kzVar.f26462r;
            if (frameLayout != null) {
                new qc(frameLayout, kzVar.W1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        kz kzVar = this.D0;
        kzVar.a0();
        uw uwVar = kzVar.f26491z0;
        if (uwVar != null) {
            uwVar.invalidate();
        }
        invalidate();
        ky kyVar = kzVar.f26460q1;
        if (kyVar != null) {
            kyVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (!this.C0) {
                this.D0.f26473u0.invalidate();
            }
        }
    }
}
