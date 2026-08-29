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
public final class pw extends kx {
    public static final int D0 = 0;
    public final org.telegram.ui.ActionBar.o2 A0;
    public final boolean B0;
    public final fz C0;

    public pw(fz fzVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        super(fzVar, context, c6Var);
        this.C0 = fzVar;
        this.A0 = o2Var;
        this.B0 = z10;
    }

    @Override
    public final void j() {
        qw qwVar = this.C0.f28654y0;
        if (qwVar != null) {
            qwVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        fz fzVar = this.C0;
        lh.m7 m7Var = fzVar.f28580b2;
        int i12 = fzVar.A1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = fzVar.Y0;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = fzVar.Z0;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new jl(this, 1));
        ArrayList arrayList2 = fzVar.D2;
        if (arrayList2 != null) {
            arrayList2.clear();
            fzVar.D2.addAll(arrayList);
        }
        fzVar.F();
        AndroidUtilities.cancelRunOnUIThread(m7Var);
        AndroidUtilities.runOnUIThread(m7Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = fzVar.f28575a0; i16 < arrayList.size(); i16 = a4.w.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f22419id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new lh.o5(10));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        fzVar.Z(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.o2 o2Var = this.A0;
            if (o2Var != null) {
                tc.a0(o2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new md(1, o2Var)).j();
                return;
            }
            FrameLayout frameLayout = fzVar.f28628r;
            if (frameLayout != null) {
                new tc(frameLayout, fzVar.V1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        fz fzVar = this.C0;
        fzVar.a0();
        qw qwVar = fzVar.f28654y0;
        if (qwVar != null) {
            qwVar.invalidate();
        }
        invalidate();
        fy fyVar = fzVar.f28623p1;
        if (fyVar != null) {
            fyVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            super.setTranslationY(f9);
            if (!this.B0) {
                this.C0.f28636t0.invalidate();
            }
        }
    }
}
