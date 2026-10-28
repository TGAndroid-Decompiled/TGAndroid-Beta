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
public final class kp implements Runnable {
    public final int f40900a;
    public final Object f40901b;
    public final Object f40902c;

    public kp(int i10, Object obj, Object obj2) {
        this.f40900a = i10;
        this.f40901b = obj;
        this.f40902c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40900a) {
            case 0:
                lp lpVar = (lp) this.f40901b;
                lpVar.getClass();
                ((TLRPC.Chat) this.f40902c).join_request = true;
                lpVar.h = true;
                lpVar.f28917c.setChecked(true);
                return;
            case 1:
                mr mrVar = (mr) this.f40901b;
                mrVar.getClass();
                mrVar.getMessagesController().loadFullChat(((TLRPC.Updates) this.f40902c).chats.get(0).f22028id, 0, true);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) this.f40902c;
                mr mrVar2 = ((br) this.f40901b).f38090a;
                if (org.telegram.ui.Components.wc.a(mrVar2)) {
                    org.telegram.ui.Components.wc.C(mrVar2, user.first_name).j();
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.e0) this.f40901b).f27629u0.unsave((TL_aicompose.TL_aiComposeTone) this.f40902c);
                return;
            case 4:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) this.f40901b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f40902c;
                qVar.getClass();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.t4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    return;
                }
                return;
            case 5:
                oy0 oy0Var = (oy0) this.f40902c;
                if (((boolean[]) this.f40901b)[0]) {
                    oy0Var.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f40901b;
                TLObject tLObject = (TLObject) this.f40902c;
                haVar.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    haVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f40901b;
                CharSequence charSequence = (CharSequence) this.f40902c;
                qcVar.f31866o = true;
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                if (ubVar instanceof org.telegram.ui.Components.vb) {
                    org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) ((org.telegram.ui.Components.vb) ubVar);
                    wbVar.f35028b.setText(charSequence);
                    AndroidUtilities.updateViewShow(wbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(wbVar.f35028b, true, false, true);
                }
                qcVar.i(true);
                return;
            case 8:
                boolean[] zArr = (boolean[]) this.f40901b;
                Runnable runnable = (Runnable) this.f40902c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 9:
                ((org.telegram.ui.Components.jd) this.f40901b).removeView((fi.v3) this.f40902c);
                return;
            case 10:
                int i10 = ChatActivityEnterView.f25845r5;
                ((ChatActivityEnterView) this.f40901b).removeView((fi.v3) this.f40902c);
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f40901b;
                int i11 = ChatActivityEnterView.f25845r5;
                chatActivityEnterView.setFieldText((CharSequence) this.f40902c);
                chatActivityEnterView.W = null;
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f40901b;
                int i12 = ChatActivityEnterView.f25845r5;
                ((org.telegram.ui.Components.sd) this.f40902c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 13:
                org.telegram.ui.Components.pg pgVar = (org.telegram.ui.Components.pg) this.f40902c;
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.sg) this.f40901b).f32583b0;
                chatActivityEnterView3.f25898i1 = chatActivityEnterView3.f25892h1.getAudioRightMs() - chatActivityEnterView3.f25892h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f25892h1.getAudioLeftMs(), chatActivityEnterView3.f25892h1.getAudioRightMs(), pgVar);
                return;
            case 14:
                ((org.telegram.ui.Components.ti) this.f40901b).containerView.removeView((fi.v3) this.f40902c);
                return;
            case 15:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f40902c;
                ((org.telegram.ui.Components.ti) this.f40901b).dismiss(true);
                if (r2Var != null) {
                    r2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f40902c;
                if (!((org.telegram.ui.Components.ti) this.f40901b).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f40901b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.mi) this.f40902c).f30544c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                tiVar.V1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(tiVar.M1).updateAttachMenuBotsInCache();
                return;
            case 18:
                org.telegram.ui.Components.ti tiVar2 = (org.telegram.ui.Components.ti) this.f40901b;
                MediaDataController.getInstance(tiVar2.M1).loadAttachMenuBots(false, true);
                if (tiVar2.B0 == tiVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f40902c).bot_id)) {
                    tiVar2.Y1(tiVar2.f33002j0);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.fj fjVar = (org.telegram.ui.Components.fj) this.f40901b;
                fjVar.G = false;
                fjVar.H = (ArrayList) this.f40902c;
                fjVar.S();
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new kp(21, (org.telegram.ui.Components.wj) this.f40901b, ((org.telegram.ui.Components.vj) this.f40902c).run()));
                return;
            case 21:
                ((org.telegram.ui.Components.wj) this.f40901b).setStatus((CharSequence) this.f40902c);
                return;
            case 22:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.f40901b;
                String str = (String) this.f40902c;
                mkVar.getClass();
                ArrayList arrayList = new ArrayList(mkVar.X.v.f28595c);
                if (mkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, mkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new bi.s9(mkVar, str, !mkVar.R.isEmpty(), arrayList, 18));
                return;
            case 23:
                org.telegram.ui.Components.mk mkVar2 = (org.telegram.ui.Components.mk) this.f40901b;
                ArrayList arrayList2 = (ArrayList) this.f40902c;
                org.telegram.ui.Components.nk nkVar = mkVar2.X;
                boolean z10 = nkVar.f30941b0;
                org.telegram.ui.Components.ck ckVar = nkVar.f30947r;
                if (z10) {
                    s4.h0 adapter = ckVar.getAdapter();
                    org.telegram.ui.Components.mk mkVar3 = nkVar.f30951y;
                    if (adapter != mkVar3) {
                        ckVar.setAdapter(mkVar3);
                    }
                }
                mkVar2.f30550s = arrayList2;
                mkVar2.l();
                return;
            case 24:
                org.telegram.ui.Components.ti tiVar3 = ((org.telegram.ui.Components.al) this.f40901b).f30254b;
                tiVar3.dismiss();
                tiVar3.f32990f0.presentFragment(wn.ea(((TLRPC.User) this.f40902c).f22177id));
                return;
            case 25:
                org.telegram.messenger.t.q(R.string.WalletAddressCopiedBulletin, new org.telegram.ui.Components.wc((org.telegram.ui.Components.al) this.f40901b, (org.telegram.ui.ActionBar.u6) this.f40902c), R.raw.copy, 36);
                return;
            case 26:
                org.telegram.ui.Components.sl slVar = (org.telegram.ui.Components.sl) this.f40901b;
                float[] fArr = (float[]) this.f40902c;
                slVar.getClass();
                slVar.e0(fArr[0], fArr[1]);
                return;
            case 27:
                org.telegram.ui.Components.li liVar = (org.telegram.ui.Components.li) this.f40902c;
                boolean z11 = ChatAttachAlertPhotoLayout.f26017q1;
                int currentItemTop = liVar.getCurrentItemTop();
                int listTopPadding = liVar.getListTopPadding();
                org.telegram.ui.Components.fm fmVar = ((ChatAttachAlertPhotoLayout) this.f40901b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                fmVar.scrollBy(0, listTopPadding);
                return;
            case 28:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40902c;
                org.telegram.ui.Components.pm pmVar = ((ChatAttachAlertPhotoLayout) this.f40901b).P;
                if (pmVar != null) {
                    pmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.li liVar2 = (org.telegram.ui.Components.li) this.f40902c;
                int currentItemTop2 = liVar2.getCurrentItemTop();
                int listTopPadding2 = liVar2.getListTopPadding();
                bi.r1 r1Var = ((org.telegram.ui.Components.cn) this.f40901b).f27210r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                r1Var.scrollBy(0, listTopPadding2);
                return;
        }
    }
}
