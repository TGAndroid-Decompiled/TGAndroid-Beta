package org.telegram.ui;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class mp implements Runnable {
    public final int f39014a;
    public final Object f39015b;
    public final Object f39016c;

    public mp(int i10, Object obj, Object obj2) {
        this.f39014a = i10;
        this.f39015b = obj;
        this.f39016c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f39014a) {
            case 0:
                ((np) this.f39015b).f39421x.d.L = false;
                ((org.telegram.ui.Components.m80) this.f39016c).run();
                return;
            case 1:
                rp rpVar = ((np) this.f39015b).f39421x.d;
                rpVar.L = false;
                rpVar.M = false;
                ((Runnable) this.f39016c).run();
                return;
            case 2:
                np npVar = (np) this.f39015b;
                npVar.getClass();
                ((TLRPC.Chat) this.f39016c).join_request = true;
                npVar.h = true;
                npVar.f29415c.setChecked(true);
                return;
            case 3:
                qr qrVar = (qr) this.f39015b;
                qrVar.getClass();
                qrVar.getMessagesController().loadFullChat(((TLRPC.Updates) this.f39016c).chats.get(0).f20845id, 0, true);
                return;
            case 4:
                TLRPC.User user = (TLRPC.User) this.f39016c;
                qr qrVar2 = ((fr) this.f39015b).f36900a;
                if (org.telegram.ui.Components.qc.a(qrVar2)) {
                    org.telegram.ui.Components.qc.C(qrVar2, user.first_name).j();
                    return;
                }
                return;
            case 5:
                ((org.telegram.ui.Components.f0) this.f39015b).f26722r0.unsave((TL_aicompose.TL_aiComposeTone) this.f39016c);
                return;
            case 6:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.f39015b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f39016c;
                rVar.getClass();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    rVar.dismiss();
                    return;
                }
                return;
            case 7:
                sz0 sz0Var = (sz0) this.f39016c;
                if (((boolean[]) this.f39015b)[0]) {
                    sz0Var.run();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f39015b;
                TLObject tLObject = (TLObject) this.f39016c;
                v9Var.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    v9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) this.f39015b;
                CharSequence charSequence = (CharSequence) this.f39016c;
                icVar.f27782n = true;
                org.telegram.ui.Components.nb nbVar = icVar.f27774e;
                if (nbVar instanceof org.telegram.ui.Components.ob) {
                    org.telegram.ui.Components.pb pbVar = (org.telegram.ui.Components.pb) ((org.telegram.ui.Components.ob) nbVar);
                    pbVar.f30375b.setText(charSequence);
                    AndroidUtilities.updateViewShow(pbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(pbVar.f30375b, true, false, true);
                }
                icVar.i(true);
                return;
            case 10:
                boolean[] zArr = (boolean[]) this.f39015b;
                Runnable runnable = (Runnable) this.f39016c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 11:
                ((org.telegram.ui.Components.bd) this.f39015b).removeView((qh.e3) this.f39016c);
                return;
            case 12:
                int i10 = ChatActivityEnterView.f24570j5;
                ((ChatActivityEnterView) this.f39015b).removeView((qh.e3) this.f39016c);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f39015b;
                int i11 = ChatActivityEnterView.f24570j5;
                chatActivityEnterView.setFieldText((CharSequence) this.f39016c);
                chatActivityEnterView.T = null;
                return;
            case 14:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f39015b;
                int i12 = ChatActivityEnterView.f24570j5;
                ((org.telegram.ui.Components.id) this.f39016c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.N, chatActivityEnterView2.M2, true);
                return;
            case 15:
                org.telegram.ui.Components.fg fgVar = (org.telegram.ui.Components.fg) this.f39016c;
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.ig) this.f39015b).S;
                chatActivityEnterView3.f24605f1 = chatActivityEnterView3.f24598e1.getAudioRightMs() - chatActivityEnterView3.f24598e1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f24598e1.getAudioLeftMs(), chatActivityEnterView3.f24598e1.getAudioRightMs(), fgVar);
                return;
            case 16:
                ((org.telegram.ui.Components.mi) this.f39015b).containerView.removeView((qh.e3) this.f39016c);
                return;
            case 17:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f39016c;
                ((org.telegram.ui.Components.mi) this.f39015b).dismiss(true);
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.mi miVar = (org.telegram.ui.Components.mi) this.f39015b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.fi) this.f39016c).f26923c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                miVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(miVar.G1).updateAttachMenuBotsInCache();
                return;
            case 19:
                org.telegram.ui.Components.mi miVar2 = (org.telegram.ui.Components.mi) this.f39015b;
                MediaDataController.getInstance(miVar2.G1).loadAttachMenuBots(false, true);
                if (miVar2.f29118v0 == miVar2.f29115u0.get(((TLRPC.TL_attachMenuBot) this.f39016c).bot_id)) {
                    miVar2.Q1(miVar2.f29072g0);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.xi xiVar = (org.telegram.ui.Components.xi) this.f39015b;
                xiVar.E = false;
                xiVar.F = (ArrayList) this.f39016c;
                xiVar.P();
                return;
            case 21:
                org.telegram.ui.Components.xi xiVar2 = (org.telegram.ui.Components.xi) this.f39015b;
                ((org.telegram.ui.Components.mi) this.f39016c).Z0();
                xiVar2.K();
                xiVar2.f26590b.X1(xiVar2, 0);
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new mp(23, (org.telegram.ui.Components.rj) this.f39015b, ((org.telegram.ui.Components.qj) this.f39016c).run()));
                return;
            case 23:
                ((org.telegram.ui.Components.rj) this.f39015b).setStatus((CharSequence) this.f39016c);
                return;
            case 24:
                org.telegram.ui.Components.ik ikVar = (org.telegram.ui.Components.ik) this.f39015b;
                String str = (String) this.f39016c;
                ikVar.getClass();
                ArrayList arrayList = new ArrayList(ikVar.U.v.f25628c);
                if (ikVar.U.v.d.isEmpty()) {
                    arrayList.addAll(0, ikVar.U.v.f25629e);
                }
                Utilities.searchQueue.postRunnable(new dg.t0(ikVar, str, !ikVar.O.isEmpty(), arrayList, 13));
                return;
            case 25:
                org.telegram.ui.Components.ik ikVar2 = (org.telegram.ui.Components.ik) this.f39015b;
                ArrayList arrayList2 = (ArrayList) this.f39016c;
                org.telegram.ui.Components.jk jkVar = ikVar2.U;
                boolean z4 = jkVar.V;
                org.telegram.ui.Components.xj xjVar = jkVar.f28132r;
                if (z4) {
                    f2.p0 adapter = xjVar.getAdapter();
                    org.telegram.ui.Components.ik ikVar3 = jkVar.f28136y;
                    if (adapter != ikVar3) {
                        xjVar.setAdapter(ikVar3);
                    }
                }
                ikVar2.f27845s = arrayList2;
                ikVar2.l();
                return;
            case 26:
                org.telegram.ui.Components.cl clVar = (org.telegram.ui.Components.cl) this.f39015b;
                float[] fArr = (float[]) this.f39016c;
                clVar.getClass();
                clVar.b0(fArr[0], fArr[1]);
                return;
            case 27:
                org.telegram.ui.Components.ei eiVar = (org.telegram.ui.Components.ei) this.f39016c;
                boolean z10 = ChatAttachAlertPhotoLayout.f24738n1;
                int currentItemTop = eiVar.getCurrentItemTop();
                int listTopPadding = eiVar.getListTopPadding();
                org.telegram.ui.Components.ql qlVar = ((ChatAttachAlertPhotoLayout) this.f39015b).B;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                qlVar.scrollBy(0, listTopPadding);
                return;
            case 28:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f39016c;
                org.telegram.ui.Components.bm bmVar = ((ChatAttachAlertPhotoLayout) this.f39015b).M;
                if (bmVar != null) {
                    bmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.ei eiVar2 = (org.telegram.ui.Components.ei) this.f39016c;
                int currentItemTop2 = eiVar2.getCurrentItemTop();
                int listTopPadding2 = eiVar2.getListTopPadding();
                mh.d1 d1Var = ((org.telegram.ui.Components.pm) this.f39015b).f30122r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                d1Var.scrollBy(0, listTopPadding2);
                return;
        }
    }
}
