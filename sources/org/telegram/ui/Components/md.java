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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;
public final class md implements Runnable {
    public final int f28529a;
    public final Object f28530b;
    public final Object f28531c;

    public md(int i10, Object obj, Object obj2) {
        this.f28529a = i10;
        this.f28531c = obj;
        this.f28530b = obj2;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        String str;
        String str2 = "";
        switch (this.f28529a) {
            case 0:
                ((od) this.f28531c).removeView((ci.d4) this.f28530b);
                return;
            case 1:
                int i10 = ChatActivityEnterView.Q5;
                ((ChatActivityEnterView) this.f28531c).removeView((ci.d4) this.f28530b);
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f28531c;
                int i11 = ChatActivityEnterView.Q5;
                chatActivityEnterView.setFieldText((CharSequence) this.f28530b);
                chatActivityEnterView.W = null;
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f28531c;
                int i12 = ChatActivityEnterView.Q5;
                ((ie) this.f28530b).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 4:
                tg tgVar = (tg) this.f28530b;
                ChatActivityEnterView chatActivityEnterView3 = ((wg) this.f28531c).f32395f0;
                chatActivityEnterView3.f23669i1 = chatActivityEnterView3.f23663h1.getAudioRightMs() - chatActivityEnterView3.f23663h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f23663h1.getAudioLeftMs(), chatActivityEnterView3.f23663h1.getAudioRightMs(), tgVar);
                return;
            case 5:
                ((aj) this.f28531c).containerView.removeView((ci.d4) this.f28530b);
                return;
            case 6:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f28530b;
                ((aj) this.f28531c).dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f28530b;
                if (!((aj) this.f28531c).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 8:
                aj ajVar = (aj) this.f28531c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ti) this.f28530b).f30883c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                ajVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(ajVar.M1).updateAttachMenuBotsInCache();
                return;
            case 9:
                aj ajVar2 = (aj) this.f28531c;
                MediaDataController.getInstance(ajVar2.M1).loadAttachMenuBots(false, true);
                if (ajVar2.B0 == ajVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f28530b).bot_id)) {
                    ajVar2.U1(ajVar2.f24354j0);
                    return;
                }
                return;
            case 10:
                mj mjVar = (mj) this.f28531c;
                mjVar.G = false;
                mjVar.H = (ArrayList) this.f28530b;
                mjVar.S();
                return;
            case 11:
                mj mjVar2 = (mj) this.f28531c;
                ((aj) this.f28530b).b1();
                mjVar2.O();
                mjVar2.f30574b.b2(mjVar2, 0);
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new md(13, (dk) this.f28531c, ((ck) this.f28530b).run()));
                return;
            case 13:
                ((dk) this.f28531c).setStatus((CharSequence) this.f28530b);
                return;
            case 14:
                tk tkVar = (tk) this.f28531c;
                String str3 = (String) this.f28530b;
                tkVar.getClass();
                ArrayList arrayList = new ArrayList(tkVar.X.v.f28806c);
                if (tkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, tkVar.X.v.f28807e);
                }
                Utilities.searchQueue.postRunnable(new ai.t4(tkVar, str3, !tkVar.R.isEmpty(), arrayList, 17));
                return;
            case 15:
                tk tkVar2 = (tk) this.f28531c;
                ArrayList arrayList2 = (ArrayList) this.f28530b;
                uk ukVar = tkVar2.X;
                boolean z11 = ukVar.f31188b0;
                jk jkVar = ukVar.f31194r;
                if (z11) {
                    s4.i0 adapter = jkVar.getAdapter();
                    tk tkVar3 = ukVar.f31198y;
                    if (adapter != tkVar3) {
                        jkVar.setAdapter(tkVar3);
                    }
                }
                tkVar2.f30889s = arrayList2;
                tkVar2.l();
                return;
            case 16:
                aj ajVar3 = ((il) this.f28531c).f30574b;
                ajVar3.dismiss();
                ajVar3.f24342f0.presentFragment(org.telegram.ui.eo.W9(((TLRPC.User) this.f28530b).f19949id));
                return;
            case 17:
                org.telegram.messenger.v0.q(R.string.WalletAddressCopiedBulletin, new zc((il) this.f28531c, (org.telegram.ui.ActionBar.c6) this.f28530b), R.raw.copy, 36);
                return;
            case 18:
                zl zlVar = (zl) this.f28531c;
                float[] fArr = (float[]) this.f28530b;
                zlVar.getClass();
                zlVar.e0(fArr[0], fArr[1]);
                return;
            case 19:
                si siVar = (si) this.f28530b;
                boolean z12 = ChatAttachAlertPhotoLayout.f23798q1;
                int currentItemTop = siVar.getCurrentItemTop();
                int listTopPadding = siVar.getListTopPadding();
                mm mmVar = ((ChatAttachAlertPhotoLayout) this.f28531c).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                mmVar.scrollBy(0, listTopPadding);
                return;
            case 20:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28530b;
                wm wmVar = ((ChatAttachAlertPhotoLayout) this.f28531c).P;
                if (wmVar != null) {
                    wmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 21:
                si siVar2 = (si) this.f28530b;
                int currentItemTop2 = siVar2.getCurrentItemTop();
                int listTopPadding2 = siVar2.getListTopPadding();
                ai.w0 w0Var = ((jn) this.f28531c).f27559r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 22:
                bp.a(((zo) this.f28531c).f33464c);
                ((hg.h) this.f28530b).run();
                return;
            case 23:
                ((zp) this.f28531c).f33466b.z((List) this.f28530b);
                return;
            case 24:
                ((aq) this.f28531c).f24458b.z((List) this.f28530b);
                return;
            case 25:
                ((org.telegram.ui.ActionBar.e3) this.f28531c).dismiss();
                of.f.s((Context) this.f28530b, "https://t.me/BotFather?start=deletebot");
                return;
            case 26:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f28531c;
                TreeSet treeSet = (TreeSet) this.f28530b;
                String charSequence = j3Var.getText().toString();
                if (!vr.a(charSequence, "bot") && vr.c(charSequence, treeSet) == null) {
                    str2 = "bot";
                }
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22080b;
                h3Var.setRightText(str2);
                int dp = AndroidUtilities.dp(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f7 = 21.0f;
                } else {
                    f7 = 63.0f;
                }
                h3Var.setPadding(0, dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(15.0f));
                return;
            case 27:
                fs fsVar = (fs) this.f28531c;
                fsVar.getClass();
                ((ci.d) this.f28530b).setLoading(false);
                fsVar.dismiss();
                return;
            case 28:
                fs fsVar2 = (fs) this.f28531c;
                TLObject tLObject = (TLObject) this.f28530b;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    fsVar2.f26158b0 = groupcallstreamrtmpurl.url;
                    fsVar2.f26159c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fsVar2.f26159c0);
                    fsVar2.f26160d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f33249a |= 256;
                    obj.f33250b = 0;
                    obj.f33251c = spannableStringBuilder.length();
                    fsVar2.f26160d0.setSpan(new a21(obj, 0), 0, fsVar2.f26160d0.length(), 0);
                    fsVar2.f26161e0.N(false);
                    return;
                }
                return;
            default:
                jt jtVar = (jt) this.f28531c;
                TLObject tLObject2 = (TLObject) this.f28530b;
                et etVar = jtVar.f27641b;
                ArrayList arrayList3 = jtVar.h;
                int i13 = jtVar.f27640a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    jtVar.f27645g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jtVar.f27643e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    jtVar.f27644f = currentTimeMillis;
                    if (!jtVar.f27646i) {
                        jtVar.f27646i = true;
                        String str5 = jtVar.f27645g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f19949id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(jtVar, messagesStorage, arrayList4, currentTimeMillis, str, 3));
                    }
                    jtVar.f27642c = false;
                    etVar.run();
                    return;
                }
                jtVar.f27645g = null;
                jtVar.f27643e = true;
                jtVar.f27642c = false;
                etVar.run();
                return;
        }
    }
}
