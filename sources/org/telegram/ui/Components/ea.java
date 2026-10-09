package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
public final class ea implements Runnable {
    public final int f26004a;
    public final Object f26005b;
    public final Object f26006c;

    public ea(int i10, Object obj, Object obj2) {
        this.f26004a = i10;
        this.f26005b = obj;
        this.f26006c = obj2;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f26004a) {
            case 0:
                ga gaVar = (ga) this.f26005b;
                TLObject tLObject = (TLObject) this.f26006c;
                gaVar.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    gaVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 1:
                tc tcVar = (tc) this.f26005b;
                CharSequence charSequence = (CharSequence) this.f26006c;
                tcVar.f31134n = true;
                xb xbVar = tcVar.f31126e;
                if (xbVar instanceof yb) {
                    zb zbVar = (zb) ((yb) xbVar);
                    zbVar.f24967b.setText(charSequence);
                    AndroidUtilities.updateViewShow(zbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(zbVar.f24967b, true, false, true);
                }
                tcVar.i(true);
                return;
            case 2:
                boolean[] zArr = (boolean[]) this.f26005b;
                Runnable runnable = (Runnable) this.f26006c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ((od) this.f26005b).removeView((ci.d4) this.f26006c);
                return;
            case 4:
                int i10 = ChatActivityEnterView.f23850n5;
                ((ChatActivityEnterView) this.f26005b).removeView((ci.d4) this.f26006c);
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f26005b;
                int i11 = ChatActivityEnterView.f23850n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f26006c);
                chatActivityEnterView.W = null;
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f26005b;
                int i12 = ChatActivityEnterView.f23850n5;
                ((vd) this.f26006c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 7:
                rg rgVar = (rg) this.f26006c;
                ChatActivityEnterView chatActivityEnterView3 = ((ug) this.f26005b).V;
                chatActivityEnterView3.f23904i1 = chatActivityEnterView3.f23898h1.getAudioRightMs() - chatActivityEnterView3.f23898h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f23898h1.getAudioLeftMs(), chatActivityEnterView3.f23898h1.getAudioRightMs(), rgVar);
                return;
            case 8:
                ((yi) this.f26005b).containerView.removeView((ci.d4) this.f26006c);
                return;
            case 9:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f26006c;
                ((yi) this.f26005b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 10:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f26006c;
                if (!((yi) this.f26005b).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 11:
                yi yiVar = (yi) this.f26005b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ri) this.f26006c).f30450c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                yiVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(yiVar.M1).updateAttachMenuBotsInCache();
                return;
            case 12:
                yi yiVar2 = (yi) this.f26005b;
                MediaDataController.getInstance(yiVar2.M1).loadAttachMenuBots(false, true);
                if (yiVar2.B0 == yiVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f26006c).bot_id)) {
                    yiVar2.U1(yiVar2.f33240j0);
                    return;
                }
                return;
            case 13:
                kj kjVar = (kj) this.f26005b;
                kjVar.G = false;
                kjVar.H = (ArrayList) this.f26006c;
                kjVar.S();
                return;
            case 14:
                kj kjVar2 = (kj) this.f26005b;
                ((yi) this.f26006c).b1();
                kjVar2.O();
                kjVar2.f30173b.b2(kjVar2, 0);
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ea(16, (bk) this.f26005b, ((ak) this.f26006c).run()));
                return;
            case 16:
                ((bk) this.f26005b).setStatus((CharSequence) this.f26006c);
                return;
            case 17:
                rk rkVar = (rk) this.f26005b;
                String str2 = (String) this.f26006c;
                rkVar.getClass();
                ArrayList arrayList = new ArrayList(rkVar.X.v.f28467c);
                if (rkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, rkVar.X.v.f28468e);
                }
                Utilities.searchQueue.postRunnable(new ai.t4(rkVar, str2, !rkVar.R.isEmpty(), arrayList, 18));
                return;
            case 18:
                rk rkVar2 = (rk) this.f26005b;
                ArrayList arrayList2 = (ArrayList) this.f26006c;
                sk skVar = rkVar2.X;
                boolean z10 = skVar.f30831b0;
                hk hkVar = skVar.f30837r;
                if (z10) {
                    s4.i0 adapter = hkVar.getAdapter();
                    rk rkVar3 = skVar.f30841y;
                    if (adapter != rkVar3) {
                        hkVar.setAdapter(rkVar3);
                    }
                }
                rkVar2.f30460s = arrayList2;
                rkVar2.l();
                return;
            case 19:
                yi yiVar3 = ((gl) this.f26005b).f30173b;
                yiVar3.dismiss();
                yiVar3.f33228f0.presentFragment(org.telegram.ui.zn.W9(((TLRPC.User) this.f26006c).f20185id));
                return;
            case 20:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, new ad((gl) this.f26005b, (org.telegram.ui.ActionBar.e6) this.f26006c), R.raw.copy, 36);
                return;
            case 21:
                xl xlVar = (xl) this.f26005b;
                float[] fArr = (float[]) this.f26006c;
                xlVar.getClass();
                xlVar.e0(fArr[0], fArr[1]);
                return;
            case 22:
                qi qiVar = (qi) this.f26006c;
                boolean z11 = ChatAttachAlertPhotoLayout.f24021q1;
                int currentItemTop = qiVar.getCurrentItemTop();
                int listTopPadding = qiVar.getListTopPadding();
                km kmVar = ((ChatAttachAlertPhotoLayout) this.f26005b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                kmVar.scrollBy(0, listTopPadding);
                return;
            case 23:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26006c;
                um umVar = ((ChatAttachAlertPhotoLayout) this.f26005b).P;
                if (umVar != null) {
                    umVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 24:
                qi qiVar2 = (qi) this.f26006c;
                int currentItemTop2 = qiVar2.getCurrentItemTop();
                int listTopPadding2 = qiVar2.getListTopPadding();
                ai.w0 w0Var = ((hn) this.f26005b).f27090r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 25:
                zo.a(((xo) this.f26005b).f32986c);
                ((hg.h) this.f26006c).run();
                return;
            case 26:
                ((xp) this.f26005b).f32988b.z((List) this.f26006c);
                return;
            case 27:
                ((yp) this.f26005b).f33325b.z((List) this.f26006c);
                return;
            case 28:
                ((org.telegram.ui.ActionBar.f3) this.f26005b).dismiss();
                of.f.s((Context) this.f26006c, "https://t.me/BotFather?start=deletebot");
                return;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f26005b;
                String charSequence2 = j3Var.getText().toString();
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22297b;
                Iterator it = ((Set) this.f26006c).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (charSequence2.endsWith((String) it.next())) {
                            str = "";
                        }
                    } else {
                        str = "bot";
                    }
                }
                h3Var.setRightText(str);
                return;
        }
    }
}
