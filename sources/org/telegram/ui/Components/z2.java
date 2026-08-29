package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;
public final class z2 implements Runnable {
    public final int f35183a;
    public final Object f35184b;
    public final Object f35185c;

    public z2(int i10, Object obj, Object obj2) {
        this.f35183a = i10;
        this.f35184b = obj;
        this.f35185c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f35183a) {
            case 0:
                org.telegram.ui.ky0 ky0Var = (org.telegram.ui.ky0) this.f35185c;
                if (((boolean[]) this.f35184b)[0]) {
                    ky0Var.run();
                    return;
                }
                return;
            case 1:
                aa aaVar = (aa) this.f35184b;
                TLObject tLObject = (TLObject) this.f35185c;
                aaVar.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    aaVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 2:
                mc mcVar = (mc) this.f35184b;
                CharSequence charSequence = (CharSequence) this.f35185c;
                mcVar.f30656n = true;
                rb rbVar = mcVar.f30648e;
                if (rbVar instanceof sb) {
                    tb tbVar = (tb) ((sb) rbVar);
                    tbVar.f33185b.setText(charSequence);
                    AndroidUtilities.updateViewShow(tbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(tbVar.f33185b, true, false, true);
                }
                mcVar.i(true);
                return;
            case 3:
                boolean[] zArr = (boolean[]) this.f35184b;
                Runnable runnable = (Runnable) this.f35185c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ((ed) this.f35184b).removeView((nh.t3) this.f35185c);
                return;
            case 5:
                int i10 = ChatActivityEnterView.f26085i5;
                ((ChatActivityEnterView) this.f35184b).removeView((nh.t3) this.f35185c);
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f35184b;
                int i11 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.setFieldText((CharSequence) this.f35185c);
                chatActivityEnterView.S = null;
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f35184b;
                int i12 = ChatActivityEnterView.f26085i5;
                ((ld) this.f35185c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.M, chatActivityEnterView2.L2, true);
                return;
            case 8:
                ig igVar = (ig) this.f35185c;
                ChatActivityEnterView chatActivityEnterView3 = ((lg) this.f35184b).R;
                chatActivityEnterView3.f26113e1 = chatActivityEnterView3.f26106d1.getAudioRightMs() - chatActivityEnterView3.f26106d1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f26106d1.getAudioLeftMs(), chatActivityEnterView3.f26106d1.getAudioRightMs(), igVar);
                return;
            case 9:
                ((ni) this.f35184b).containerView.removeView((nh.t3) this.f35185c);
                return;
            case 10:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f35185c;
                ((ni) this.f35184b).dismiss(true);
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 11:
                ni niVar = (ni) this.f35184b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((gi) this.f35185c).f28890c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                niVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(niVar.F1).updateAttachMenuBotsInCache();
                return;
            case 12:
                ni niVar2 = (ni) this.f35184b;
                MediaDataController.getInstance(niVar2.F1).loadAttachMenuBots(false, true);
                if (niVar2.f31051u0 == niVar2.f31048t0.get(((TLRPC.TL_attachMenuBot) this.f35185c).bot_id)) {
                    niVar2.Q1(niVar2.f31005f0);
                    return;
                }
                return;
            case 13:
                yi yiVar = (yi) this.f35184b;
                yiVar.D = false;
                yiVar.E = (ArrayList) this.f35185c;
                yiVar.P();
                return;
            case 14:
                yi yiVar2 = (yi) this.f35184b;
                ((ni) this.f35185c).Z0();
                yiVar2.K();
                yiVar2.f28403b.X1(yiVar2, 0);
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new z2(16, (rj) this.f35184b, ((qj) this.f35185c).run()));
                return;
            case 16:
                ((rj) this.f35184b).setStatus((CharSequence) this.f35185c);
                return;
            case 17:
                ik ikVar = (ik) this.f35184b;
                String str = (String) this.f35185c;
                ikVar.getClass();
                ArrayList arrayList = new ArrayList(ikVar.T.v.f27148c);
                if (ikVar.T.v.d.isEmpty()) {
                    arrayList.addAll(0, ikVar.T.v.f27149e);
                }
                Utilities.searchQueue.postRunnable(new ag.w0(ikVar, str, !ikVar.N.isEmpty(), arrayList, 15));
                return;
            case 18:
                ik ikVar2 = (ik) this.f35184b;
                ArrayList arrayList2 = (ArrayList) this.f35185c;
                jk jkVar = ikVar2.T;
                boolean z11 = jkVar.U;
                xj xjVar = jkVar.f29678r;
                if (z11) {
                    f2.p0 adapter = xjVar.getAdapter();
                    ik ikVar3 = jkVar.f29682y;
                    if (adapter != ikVar3) {
                        xjVar.setAdapter(ikVar3);
                    }
                }
                ikVar2.f29401s = arrayList2;
                ikVar2.l();
                return;
            case 19:
                bl blVar = (bl) this.f35184b;
                float[] fArr = (float[]) this.f35185c;
                blVar.getClass();
                blVar.b0(fArr[0], fArr[1]);
                return;
            case 20:
                fi fiVar = (fi) this.f35185c;
                boolean z12 = ChatAttachAlertPhotoLayout.f26252m1;
                int currentItemTop = fiVar.getCurrentItemTop();
                int listTopPadding = fiVar.getListTopPadding();
                ol olVar = ((ChatAttachAlertPhotoLayout) this.f35184b).A;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                olVar.scrollBy(0, listTopPadding);
                return;
            case 21:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35185c;
                yl ylVar = ((ChatAttachAlertPhotoLayout) this.f35184b).L;
                if (ylVar != null) {
                    ylVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 22:
                fi fiVar2 = (fi) this.f35185c;
                int currentItemTop2 = fiVar2.getCurrentItemTop();
                int listTopPadding2 = fiVar2.getListTopPadding();
                jh.e1 e1Var = ((lm) this.f35184b).f30372r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                e1Var.scrollBy(0, listTopPadding2);
                return;
            case 23:
                co.a(((ao) this.f35184b).f26809c);
                ((sf.h) this.f35185c).run();
                return;
            case 24:
                ((bp) this.f35184b).f27198b.x((List) this.f35185c);
                return;
            case 25:
                ((cp) this.f35184b).f27547b.x((List) this.f35185c);
                return;
            case 26:
                ((org.telegram.ui.ActionBar.f3) this.f35184b).dismiss();
                ye.d.s((Context) this.f35185c, "https://t.me/BotFather?start=deletebot");
                return;
            case 27:
                fr frVar = (fr) this.f35184b;
                frVar.getClass();
                ((nh.d) this.f35185c).setLoading(false);
                frVar.dismiss();
                return;
            case 28:
                fr frVar2 = (fr) this.f35184b;
                TLObject tLObject2 = (TLObject) this.f35185c;
                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                    frVar2.X = groupcallstreamrtmpurl.url;
                    frVar2.Y = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(frVar2.Y);
                    frVar2.Z = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f29024a |= 256;
                    obj.f29025b = 0;
                    obj.f29026c = spannableStringBuilder.length();
                    frVar2.Z.setSpan(new i01(obj, 0), 0, frVar2.Z.length(), 0);
                    frVar2.f28520a0.N(false);
                    return;
                }
                return;
            default:
                ks ksVar = (ks) this.f35184b;
                TLObject tLObject3 = (TLObject) this.f35185c;
                hs hsVar = ksVar.f30135b;
                ArrayList arrayList3 = ksVar.h;
                int i13 = ksVar.f30134a;
                if (tLObject3 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject3;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    ksVar.f30139g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ksVar.f30137e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    ksVar.f30138f = currentTimeMillis;
                    if (!ksVar.f30140i) {
                        ksVar.f30140i = true;
                        String str3 = ksVar.f30139g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = a4.w.g(((TLRPC.User) arrayList3.get(i14)).f22539id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new ih.h1(ksVar, messagesStorage, arrayList4, currentTimeMillis, str4, 11));
                    }
                    ksVar.f30136c = false;
                    hsVar.run();
                    return;
                }
                ksVar.f30139g = null;
                ksVar.f30137e = true;
                ksVar.f30136c = false;
                hsVar.run();
                return;
        }
    }
}
