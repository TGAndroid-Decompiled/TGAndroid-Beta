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
public final class ax extends ux {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.n2 E0;
    public final boolean F0;
    public final nz G0;

    public ax(nz nzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        super(nzVar, context, d6Var);
        this.G0 = nzVar;
        this.E0 = n2Var;
        this.F0 = z10;
    }

    @Override
    public final void j() {
        bx bxVar = this.G0.C0;
        if (bxVar != null) {
            bxVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        nz nzVar = this.G0;
        org.telegram.ui.Cells.t6 t6Var = nzVar.f29103f2;
        int i12 = nzVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = nzVar.f29091c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = nzVar.f29094d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new rl(this, 1));
        ArrayList arrayList2 = nzVar.E2;
        if (arrayList2 != null) {
            arrayList2.clear();
            nzVar.E2.addAll(arrayList);
        }
        nzVar.C();
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        AndroidUtilities.runOnUIThread(t6Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = nzVar.f29097e0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.vision.e2.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f20064id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ai.u7(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        nzVar.W(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.n2 n2Var = this.E0;
            if (n2Var != null) {
                yc.a0(n2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new ud(1, n2Var)).j();
                return;
            }
            FrameLayout frameLayout = nzVar.f29136r;
            if (frameLayout != null) {
                new yc(frameLayout, nzVar.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        nz nzVar = this.G0;
        nzVar.X();
        bx bxVar = nzVar.C0;
        if (bxVar != null) {
            bxVar.invalidate();
        }
        invalidate();
        oy oyVar = nzVar.f29145t1;
        if (oyVar != null) {
            oyVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            if (!this.F0) {
                this.G0.f29158x0.invalidate();
            }
        }
    }
}
