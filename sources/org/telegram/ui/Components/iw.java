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

public final class iw extends dx {
    public static final int D0 = 0;
    public final org.telegram.ui.ActionBar.n2 A0;
    public final boolean B0;
    public final yy C0;

    public iw(yy yyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        super(yyVar, context, c6Var);
        this.C0 = yyVar;
        this.A0 = n2Var;
        this.B0 = z10;
    }

    @Override
    public final void j() {
        jw jwVar = this.C0.f35056y0;
        if (jwVar != null) {
            jwVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, int i11) {
        yy yyVar = this.C0;
        m.i3 i3Var = yyVar.f34982b2;
        int i12 = yyVar.A1;
        int i13 = i10 - i12;
        int i14 = i11 - i12;
        int i15 = yyVar.Y0;
        MediaDataController mediaDataController = MediaDataController.getInstance(i15);
        ?? r10 = yyVar.Z0;
        r10.add(i14, (TLRPC.TL_messages_stickerSet) r10.remove(i13));
        int i16 = 1;
        Collections.sort(mediaDataController.getStickerSets(0), new bl(this, i16));
        ArrayList arrayList = yyVar.D2;
        if (arrayList != null) {
            arrayList.clear();
            yyVar.D2.addAll(r10);
        }
        yyVar.G();
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        AndroidUtilities.runOnUIThread(i3Var, 1500L);
        MediaDataController.getInstance(i15).calcNewHash(0);
        TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
        tL_messages_reorderStickerSets.masks = false;
        tL_messages_reorderStickerSets.emojis = false;
        for (?? F = yyVar.f34977a0; F < r10.size(); F = com.google.android.recaptcha.internal.a.f(((TLRPC.TL_messages_stickerSet) r10.get(F)).set.f22407id, tL_messages_reorderStickerSets.order, F, 1)) {
        }
        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_reorderStickerSets, new jh.m5(10));
        NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        yyVar.Z(true);
        if (SharedConfig.updateStickersOrderOnSend) {
            SharedConfig.toggleUpdateStickersOrderOnSend();
            org.telegram.ui.ActionBar.n2 n2Var = this.A0;
            if (n2Var != null) {
                mc.a0(n2Var).K(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), LocaleController.getString("Settings"), new fd(i16, n2Var)).j();
                return;
            }
            FrameLayout frameLayout = yyVar.f35030r;
            if (frameLayout != null) {
                new mc(frameLayout, yyVar.V1).M(LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo), R.raw.filter_reorder).j();
            }
        }
    }

    @Override
    public final void p() {
        yy yyVar = this.C0;
        yyVar.a0();
        jw jwVar = yyVar.f35056y0;
        if (jwVar != null) {
            jwVar.invalidate();
        }
        invalidate();
        xx xxVar = yyVar.f35025p1;
        if (xxVar != null) {
            xxVar.u();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            if (this.B0) {
                return;
            }
            this.C0.f35038t0.invalidate();
        }
    }
}
