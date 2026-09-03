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
public final class vw extends rx {
    public static final int E0 = 0;
    public final org.telegram.ui.ActionBar.p2 B0;
    public final boolean C0;
    public final mz D0;

    public vw(mz mzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        super(mzVar, context, g6Var);
        this.D0 = mzVar;
        this.B0 = p2Var;
        this.C0 = z4;
    }

    @Override
    public final void j() {
        ww wwVar = this.D0.f29348z0;
        if (wwVar != null) {
            wwVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        mz mzVar = this.D0;
        m2.b bVar = mzVar.f29275c2;
        int i12 = mzVar.B1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = mzVar.Z0;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = mzVar.f29267a1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new kl(this, 1));
        ArrayList arrayList2 = mzVar.E2;
        if (arrayList2 != null) {
            arrayList2.clear();
            mzVar.E2.addAll(arrayList);
        }
        mzVar.F();
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = mzVar.f29269b0; i16 < arrayList.size(); i16 = android.support.v4.media.a.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f20872id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new oh.p5(9));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        mzVar.Z(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.p2 p2Var = this.B0;
            if (p2Var != null) {
                qc.a0(p2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new jd(1, p2Var)).j();
                return;
            }
            FrameLayout frameLayout = mzVar.f29319r;
            if (frameLayout != null) {
                new qc(frameLayout, mzVar.W1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        mz mzVar = this.D0;
        mzVar.a0();
        ww wwVar = mzVar.f29348z0;
        if (wwVar != null) {
            wwVar.invalidate();
        }
        invalidate();
        my myVar = mzVar.f29317q1;
        if (myVar != null) {
            myVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (!this.C0) {
                this.D0.f29330u0.invalidate();
            }
        }
    }
}
