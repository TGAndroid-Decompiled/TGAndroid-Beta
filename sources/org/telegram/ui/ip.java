package org.telegram.ui;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ip implements Runnable {
    public final int f40337a;
    public final Object f40338b;
    public final Object f40339c;

    public ip(int i10, Object obj, Object obj2) {
        this.f40337a = i10;
        this.f40338b = obj;
        this.f40339c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40337a) {
            case 0:
                jp jpVar = (jp) this.f40338b;
                jpVar.getClass();
                ((TLRPC.Chat) this.f40339c).join_request = true;
                jpVar.h = true;
                jpVar.f28503c.setChecked(true);
                return;
            case 1:
                kr krVar = (kr) this.f40338b;
                krVar.getClass();
                krVar.getMessagesController().loadFullChat(((TLRPC.Updates) this.f40339c).chats.get(0).f22027id, 0, true);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) this.f40339c;
                kr krVar2 = ((zq) this.f40338b).f46348a;
                if (org.telegram.ui.Components.wc.a(krVar2)) {
                    org.telegram.ui.Components.wc.C(krVar2, user.first_name).j();
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.e0) this.f40338b).f27661u0.unsave((TL_aicompose.TL_aiComposeTone) this.f40339c);
                return;
            case 4:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) this.f40338b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f40339c;
                qVar.getClass();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.t4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    return;
                }
                return;
            case 5:
                my0 my0Var = (my0) this.f40339c;
                if (((boolean[]) this.f40338b)[0]) {
                    my0Var.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f40338b;
                TLObject tLObject = (TLObject) this.f40339c;
                haVar.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    haVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f40338b;
                CharSequence charSequence = (CharSequence) this.f40339c;
                qcVar.f31894o = true;
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                if (ubVar instanceof org.telegram.ui.Components.vb) {
                    org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) ((org.telegram.ui.Components.vb) ubVar);
                    wbVar.f35001b.setText(charSequence);
                    AndroidUtilities.updateViewShow(wbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(wbVar.f35001b, true, false, true);
                }
                qcVar.i(true);
                return;
            case 8:
                boolean[] zArr = (boolean[]) this.f40338b;
                Runnable runnable = (Runnable) this.f40339c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 9:
                ((org.telegram.ui.Components.jd) this.f40338b).removeView((fi.v3) this.f40339c);
                return;
            case 10:
                int i10 = ChatActivityEnterView.f25843r5;
                ((ChatActivityEnterView) this.f40338b).removeView((fi.v3) this.f40339c);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f40338b;
                int i11 = ChatActivityEnterView.f25843r5;
                chatActivityEnterView.setFieldText((CharSequence) this.f40339c);
                chatActivityEnterView.W = null;
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f40338b;
                int i12 = ChatActivityEnterView.f25843r5;
                ((org.telegram.ui.Components.sd) this.f40339c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 13:
                org.telegram.ui.Components.pg pgVar = (org.telegram.ui.Components.pg) this.f40339c;
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.sg) this.f40338b).f32544b0;
                chatActivityEnterView3.f25896i1 = chatActivityEnterView3.f25890h1.getAudioRightMs() - chatActivityEnterView3.f25890h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f25890h1.getAudioLeftMs(), chatActivityEnterView3.f25890h1.getAudioRightMs(), pgVar);
                return;
            case 14:
                ((org.telegram.ui.Components.ti) this.f40338b).containerView.removeView((fi.v3) this.f40339c);
                return;
            case 15:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f40339c;
                ((org.telegram.ui.Components.ti) this.f40338b).dismiss(true);
                if (r2Var != null) {
                    r2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f40339c;
                if (!((org.telegram.ui.Components.ti) this.f40338b).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f40338b;
                MediaDataController.getInstance(tiVar.M1).loadAttachMenuBots(false, true);
                if (tiVar.B0 == tiVar.A0.get(((TLRPC.TL_attachMenuBot) this.f40339c).bot_id)) {
                    tiVar.X1(tiVar.f33033j0);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.ti tiVar2 = (org.telegram.ui.Components.ti) this.f40338b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.mi) this.f40339c).f30591c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                tiVar2.U1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(tiVar2.M1).updateAttachMenuBotsInCache();
                return;
            case 19:
                org.telegram.ui.Components.fj fjVar = (org.telegram.ui.Components.fj) this.f40338b;
                fjVar.G = false;
                fjVar.H = (ArrayList) this.f40339c;
                fjVar.S();
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new ip(21, (org.telegram.ui.Components.wj) this.f40338b, ((org.telegram.ui.Components.vj) this.f40339c).run()));
                return;
            case 21:
                ((org.telegram.ui.Components.wj) this.f40338b).setStatus((CharSequence) this.f40339c);
                return;
            case 22:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.f40338b;
                String str = (String) this.f40339c;
                mkVar.getClass();
                ArrayList arrayList = new ArrayList(mkVar.X.v.f28584c);
                if (mkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, mkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new bi.s9(mkVar, str, !mkVar.R.isEmpty(), arrayList, 18));
                return;
            case 23:
                org.telegram.ui.Components.mk mkVar2 = (org.telegram.ui.Components.mk) this.f40338b;
                ArrayList arrayList2 = (ArrayList) this.f40339c;
                org.telegram.ui.Components.nk nkVar = mkVar2.X;
                boolean z10 = nkVar.f31028b0;
                org.telegram.ui.Components.ck ckVar = nkVar.f31034r;
                if (z10) {
                    s4.h0 adapter = ckVar.getAdapter();
                    org.telegram.ui.Components.mk mkVar3 = nkVar.f31038y;
                    if (adapter != mkVar3) {
                        ckVar.setAdapter(mkVar3);
                    }
                }
                mkVar2.f30606s = arrayList2;
                mkVar2.l();
                return;
            case 24:
                org.telegram.ui.Components.ti tiVar3 = ((org.telegram.ui.Components.al) this.f40338b).f30215b;
                tiVar3.dismiss();
                tiVar3.f33021f0.presentFragment(un.ba(((TLRPC.User) this.f40339c).f22176id));
                return;
            case 25:
                org.telegram.messenger.t.q(R.string.WalletAddressCopiedBulletin, new org.telegram.ui.Components.wc((org.telegram.ui.Components.al) this.f40338b, (org.telegram.ui.ActionBar.u6) this.f40339c), R.raw.copy, 36);
                return;
            case 26:
                org.telegram.ui.Components.sl slVar = (org.telegram.ui.Components.sl) this.f40338b;
                float[] fArr = (float[]) this.f40339c;
                slVar.getClass();
                slVar.e0(fArr[0], fArr[1]);
                return;
            case 27:
                org.telegram.ui.Components.li liVar = (org.telegram.ui.Components.li) this.f40339c;
                boolean z11 = ChatAttachAlertPhotoLayout.f26015q1;
                int currentItemTop = liVar.getCurrentItemTop();
                int listTopPadding = liVar.getListTopPadding();
                org.telegram.ui.Components.fm fmVar = ((ChatAttachAlertPhotoLayout) this.f40338b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                fmVar.scrollBy(0, listTopPadding);
                return;
            case 28:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40339c;
                org.telegram.ui.Components.pm pmVar = ((ChatAttachAlertPhotoLayout) this.f40338b).P;
                if (pmVar != null) {
                    pmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.li liVar2 = (org.telegram.ui.Components.li) this.f40339c;
                int currentItemTop2 = liVar2.getCurrentItemTop();
                int listTopPadding2 = liVar2.getListTopPadding();
                bi.r1 r1Var = ((org.telegram.ui.Components.cn) this.f40338b).f27201r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                r1Var.scrollBy(0, listTopPadding2);
                return;
        }
    }
}
