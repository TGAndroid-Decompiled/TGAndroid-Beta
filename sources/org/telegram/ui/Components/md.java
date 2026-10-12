package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;
public final class md implements Runnable {
    public final int f28524a;
    public final Object f28525b;
    public final Object f28526c;

    public md(int i10, Object obj, Object obj2) {
        this.f28524a = i10;
        this.f28526c = obj;
        this.f28525b = obj2;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f28524a) {
            case 0:
                ((od) this.f28526c).removeView((ci.d4) this.f28525b);
                return;
            case 1:
                int i10 = ChatActivityEnterView.S5;
                ((ChatActivityEnterView) this.f28526c).removeView((ci.d4) this.f28525b);
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f28526c;
                int i11 = ChatActivityEnterView.S5;
                chatActivityEnterView.getClass();
                if (!((jh.h) this.f28525b).c(1)) {
                    chatActivityEnterView.H5 = false;
                }
                wg wgVar = chatActivityEnterView.O1;
                if (wgVar != null) {
                    wgVar.invalidate();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f28526c;
                int i12 = ChatActivityEnterView.S5;
                chatActivityEnterView2.setFieldText((CharSequence) this.f28525b);
                chatActivityEnterView2.W = null;
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.f28526c;
                int i13 = ChatActivityEnterView.S5;
                ((ie) this.f28525b).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.Q, chatActivityEnterView3.Q2, true);
                return;
            case 5:
                tg tgVar = (tg) this.f28525b;
                ChatActivityEnterView chatActivityEnterView4 = ((wg) this.f28526c).f32382g0;
                chatActivityEnterView4.f23670i1 = chatActivityEnterView4.f23664h1.getAudioRightMs() - chatActivityEnterView4.f23664h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.f23664h1.getAudioLeftMs(), chatActivityEnterView4.f23664h1.getAudioRightMs(), tgVar);
                return;
            case 6:
                ((aj) this.f28526c).containerView.removeView((ci.d4) this.f28525b);
                return;
            case 7:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f28525b;
                ((aj) this.f28526c).dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 8:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f28525b;
                if (!((aj) this.f28526c).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 9:
                aj ajVar = (aj) this.f28526c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ti) this.f28525b).f30886c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                ajVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(ajVar.M1).updateAttachMenuBotsInCache();
                return;
            case 10:
                aj ajVar2 = (aj) this.f28526c;
                MediaDataController.getInstance(ajVar2.M1).loadAttachMenuBots(false, true);
                if (ajVar2.B0 == ajVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f28525b).bot_id)) {
                    ajVar2.U1(ajVar2.f24350j0);
                    return;
                }
                return;
            case 11:
                mj mjVar = (mj) this.f28526c;
                mjVar.G = false;
                mjVar.H = (ArrayList) this.f28525b;
                mjVar.S();
                return;
            case 12:
                mj mjVar2 = (mj) this.f28526c;
                ((aj) this.f28525b).b1();
                mjVar2.O();
                mjVar2.f30570b.b2(mjVar2, 0);
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new md(14, (dk) this.f28526c, ((ck) this.f28525b).run()));
                return;
            case 14:
                ((dk) this.f28526c).setStatus((CharSequence) this.f28525b);
                return;
            case 15:
                tk tkVar = (tk) this.f28526c;
                String str = (String) this.f28525b;
                tkVar.getClass();
                ArrayList arrayList = new ArrayList(tkVar.X.v.f28810c);
                if (tkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, tkVar.X.v.f28811e);
                }
                Utilities.searchQueue.postRunnable(new ai.t4(tkVar, str, !tkVar.R.isEmpty(), arrayList, 17));
                return;
            case 16:
                tk tkVar2 = (tk) this.f28526c;
                ArrayList arrayList2 = (ArrayList) this.f28525b;
                uk ukVar = tkVar2.X;
                boolean z10 = ukVar.f31180b0;
                jk jkVar = ukVar.f31186r;
                if (z10) {
                    s4.i0 adapter = jkVar.getAdapter();
                    tk tkVar3 = ukVar.f31190y;
                    if (adapter != tkVar3) {
                        jkVar.setAdapter(tkVar3);
                    }
                }
                tkVar2.f30891s = arrayList2;
                tkVar2.l();
                return;
            case 17:
                aj ajVar3 = ((il) this.f28526c).f30570b;
                ajVar3.dismiss();
                ajVar3.f24338f0.presentFragment(org.telegram.ui.eo.W9(((TLRPC.User) this.f28525b).f19950id));
                return;
            case 18:
                org.telegram.messenger.v0.q(R.string.WalletAddressCopiedBulletin, new zc((il) this.f28526c, (org.telegram.ui.ActionBar.c6) this.f28525b), R.raw.copy, 36);
                return;
            case 19:
                zl zlVar = (zl) this.f28526c;
                float[] fArr = (float[]) this.f28525b;
                zlVar.getClass();
                zlVar.e0(fArr[0], fArr[1]);
                return;
            case 20:
                si siVar = (si) this.f28525b;
                boolean z11 = ChatAttachAlertPhotoLayout.f23799q1;
                int currentItemTop = siVar.getCurrentItemTop();
                int listTopPadding = siVar.getListTopPadding();
                mm mmVar = ((ChatAttachAlertPhotoLayout) this.f28526c).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                mmVar.scrollBy(0, listTopPadding);
                return;
            case 21:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28525b;
                wm wmVar = ((ChatAttachAlertPhotoLayout) this.f28526c).P;
                if (wmVar != null) {
                    wmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 22:
                si siVar2 = (si) this.f28525b;
                int currentItemTop2 = siVar2.getCurrentItemTop();
                int listTopPadding2 = siVar2.getListTopPadding();
                ai.w0 w0Var = ((jn) this.f28526c).f27566r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 23:
                bp.a(((zo) this.f28526c).f33466c);
                ((hg.h) this.f28525b).run();
                return;
            case 24:
                ((zp) this.f28526c).f33468b.z((List) this.f28525b);
                return;
            case 25:
                ((aq) this.f28526c).f24455b.z((List) this.f28525b);
                return;
            case 26:
                ((org.telegram.ui.ActionBar.e3) this.f28526c).dismiss();
                of.f.s((Context) this.f28525b, "https://t.me/BotFather?start=deletebot");
                return;
            case 27:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f28526c;
                TreeSet treeSet = (TreeSet) this.f28525b;
                String charSequence = j3Var.getText().toString();
                String str2 = "bot";
                str2 = (vr.a(charSequence, "bot") || vr.c(charSequence, treeSet) != null) ? "" : "";
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22081b;
                h3Var.setRightText(str2);
                int dp = AndroidUtilities.dp(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f7 = 21.0f;
                } else {
                    f7 = 63.0f;
                }
                h3Var.setPadding(0, dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(15.0f));
                return;
            case 28:
                fs fsVar = (fs) this.f28526c;
                fsVar.getClass();
                ((ci.d) this.f28525b).setLoading(false);
                fsVar.dismiss();
                return;
            default:
                fs fsVar2 = (fs) this.f28526c;
                TLObject tLObject = (TLObject) this.f28525b;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    fsVar2.f26160b0 = groupcallstreamrtmpurl.url;
                    fsVar2.f26161c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fsVar2.f26161c0);
                    fsVar2.f26162d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f33255a |= 256;
                    obj.f33256b = 0;
                    obj.f33257c = spannableStringBuilder.length();
                    fsVar2.f26162d0.setSpan(new a21(obj, 0), 0, fsVar2.f26162d0.length(), 0);
                    fsVar2.f26163e0.N(false);
                    return;
                }
                return;
        }
    }
}
