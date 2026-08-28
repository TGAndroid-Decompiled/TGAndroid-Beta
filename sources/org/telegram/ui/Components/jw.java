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
public final class jw extends dx {
    public static final int D0 = 0;
    public final org.telegram.ui.ActionBar.o2 A0;
    public final boolean B0;
    public final wy C0;

    public jw(wy wyVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        super(wyVar, context, b6Var);
        this.C0 = wyVar;
        this.A0 = o2Var;
        this.B0 = z10;
    }

    @Override
    public final void j() {
        kw kwVar = this.C0.f34463y0;
        if (kwVar != null) {
            kwVar.invalidate();
        }
    }

    @Override
    public final void o(int i9, int i10) {
        wy wyVar = this.C0;
        m.i3 i3Var = wyVar.f34389b2;
        int i11 = wyVar.A1;
        int i12 = i9 - i11;
        int i13 = i10 - i11;
        int i14 = wyVar.Y0;
        MediaDataController mediaDataController = MediaDataController.getInstance(i14);
        ArrayList arrayList = wyVar.Z0;
        arrayList.add(i13, (TLRPC.TL_messages_stickerSet) arrayList.remove(i12));
        Collections.sort(mediaDataController.getStickerSets(0), new fl(this, 1));
        ArrayList arrayList2 = wyVar.D2;
        if (arrayList2 != null) {
            arrayList2.clear();
            wyVar.D2.addAll(arrayList);
        }
        wyVar.F();
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        AndroidUtilities.runOnUIThread(i3Var, 1500L);
        MediaDataController.getInstance(i14).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (int i15 = wyVar.f34384a0; i15 < arrayList.size(); i15 = aa.d.g(((TLRPC.TL_messages_stickerSet) arrayList.get(i15)).set.f22407id, tL_messages_reorderStickerSets.order, i15, 1)) {
        }
        ConnectionsManager.getInstance(i14).sendRequest(tL_messages_reorderStickerSets, new ih.q5(10));
        NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        wyVar.Y(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.o2 o2Var = this.A0;
            if (o2Var != null) {
                oc.a0(o2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new id(1, o2Var)).j();
                return;
            }
            FrameLayout frameLayout = wyVar.f34437r;
            if (frameLayout != null) {
                new oc(frameLayout, wyVar.V1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        wy wyVar = this.C0;
        wyVar.Z();
        kw kwVar = wyVar.f34463y0;
        if (kwVar != null) {
            kwVar.invalidate();
        }
        invalidate();
        wx wxVar = wyVar.f34432p1;
        if (wxVar != null) {
            wxVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (!this.B0) {
                this.C0.f34445t0.invalidate();
            }
        }
    }
}
