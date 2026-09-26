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
public final class zw extends tx {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.m2 E0;
    public final boolean F0;
    public final mz G0;

    public zw(mz mzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.m2 m2Var, boolean z10) {
        super(mzVar, context, d6Var);
        this.G0 = mzVar;
        this.E0 = m2Var;
        this.F0 = z10;
    }

    @Override
    public final void j() {
        ax axVar = this.G0.C0;
        if (axVar != null) {
            axVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        mz mzVar = this.G0;
        org.telegram.ui.Cells.t6 t6Var = mzVar.f26559f2;
        int i12 = mzVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = mzVar.f26548c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = mzVar.f26551d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new ql(this, 1));
        ArrayList arrayList2 = mzVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            mzVar.G2.addAll(arrayList);
        }
        mzVar.E();
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        AndroidUtilities.runOnUIThread(t6Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = mzVar.f26553e0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.vision.e2.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f18362id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ai.u7(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        mzVar.X(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.m2 m2Var = this.E0;
            if (m2Var != null) {
                xc.a0(m2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new ud(1, m2Var)).j();
                return;
            }
            FrameLayout frameLayout = mzVar.f26592r;
            if (frameLayout != null) {
                new xc(frameLayout, mzVar.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        mz mzVar = this.G0;
        mzVar.Y();
        ax axVar = mzVar.C0;
        if (axVar != null) {
            axVar.invalidate();
        }
        invalidate();
        ny nyVar = mzVar.f26601t1;
        if (nyVar != null) {
            nyVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            if (!this.F0) {
                this.G0.f26614x0.invalidate();
            }
        }
    }
}
