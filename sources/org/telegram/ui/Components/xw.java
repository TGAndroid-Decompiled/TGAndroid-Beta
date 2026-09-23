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
public final class xw extends rx {
    public static final int H0 = 0;
    public final org.telegram.ui.ActionBar.n2 E0;
    public final boolean F0;
    public final lz G0;

    public xw(lz lzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        super(lzVar, context, d6Var);
        this.G0 = lzVar;
        this.E0 = n2Var;
        this.F0 = z10;
    }

    @Override
    public final void j() {
        yw ywVar = this.G0.C0;
        if (ywVar != null) {
            ywVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        lz lzVar = this.G0;
        org.telegram.ui.Cells.l7 l7Var = lzVar.f25979f2;
        int i12 = lzVar.E1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = lzVar.f25968c1;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ArrayList arrayList = lzVar.f25971d1;
        arrayList.add(i14, (TLRPC.TL_messages_stickerSet) arrayList.remove(i13));
        Collections.sort(mediaDataController.getStickerSets(0), new pl(this, 1));
        ArrayList arrayList2 = lzVar.G2;
        if (arrayList2 != null) {
            arrayList2.clear();
            lzVar.G2.addAll(arrayList);
        }
        lzVar.E();
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        AndroidUtilities.runOnUIThread(l7Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i16 = lzVar.f25973e0; i16 < arrayList.size(); i16 = com.google.android.gms.internal.vision.e2.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i16)).set.f18110id, tL_messages_reorderStickerSets.order, i16, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new ai.u7(13));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        lzVar.X(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.n2 n2Var = this.E0;
            if (n2Var != null) {
                xc.a0(n2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new td(1, n2Var)).j();
                return;
            }
            FrameLayout frameLayout = lzVar.f26012r;
            if (frameLayout != null) {
                new xc(frameLayout, lzVar.Z1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        lz lzVar = this.G0;
        lzVar.Y();
        yw ywVar = lzVar.C0;
        if (ywVar != null) {
            ywVar.invalidate();
        }
        invalidate();
        ly lyVar = lzVar.f26021t1;
        if (lyVar != null) {
            lyVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            if (!this.F0) {
                this.G0.f26034x0.invalidate();
            }
        }
    }
}
