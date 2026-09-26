package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;
public final class kd implements Runnable {
    public final int f25697a;
    public final Object f25698b;
    public final Object f25699c;

    public kd(int i10, Object obj, Object obj2) {
        this.f25697a = i10;
        this.f25699c = obj;
        this.f25698b = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        switch (this.f25697a) {
            case 0:
                ((md) this.f25699c).removeView((ci.e4) this.f25698b);
                return;
            case 1:
                int i10 = ChatActivityEnterView.f21952n5;
                ((ChatActivityEnterView) this.f25699c).removeView((ci.e4) this.f25698b);
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25699c;
                int i11 = ChatActivityEnterView.f21952n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f25698b);
                chatActivityEnterView.W = null;
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f25699c;
                int i12 = ChatActivityEnterView.f21952n5;
                ((td) this.f25698b).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 4:
                pg pgVar = (pg) this.f25698b;
                ChatActivityEnterView chatActivityEnterView3 = ((sg) this.f25699c).V;
                chatActivityEnterView3.f22005i1 = chatActivityEnterView3.f21999h1.getAudioRightMs() - chatActivityEnterView3.f21999h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f21999h1.getAudioLeftMs(), chatActivityEnterView3.f21999h1.getAudioRightMs(), pgVar);
                return;
            case 5:
                ((wi) this.f25699c).containerView.removeView((ci.e4) this.f25698b);
                return;
            case 6:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f25698b;
                ((wi) this.f25699c).dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 7:
                wi wiVar = (wi) this.f25699c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((pi) this.f25698b).f27394c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                wiVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(wiVar.J1).updateAttachMenuBotsInCache();
                return;
            case 8:
                wi wiVar2 = (wi) this.f25699c;
                MediaDataController.getInstance(wiVar2.J1).loadAttachMenuBots(false, true);
                if (wiVar2.f30081y0 == wiVar2.f30077x0.get(((TLRPC.TL_attachMenuBot) this.f25698b).bot_id)) {
                    wiVar2.Q1(wiVar2.f30032j0);
                    return;
                }
                return;
            case 9:
                ij ijVar = (ij) this.f25699c;
                ijVar.G = false;
                ijVar.H = (ArrayList) this.f25698b;
                ijVar.P();
                return;
            case 10:
                ij ijVar2 = (ij) this.f25699c;
                ((wi) this.f25698b).Z0();
                ijVar2.L();
                ijVar2.f27043b.X1(ijVar2, 0);
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new kd(12, (zj) this.f25699c, ((yj) this.f25698b).run()));
                return;
            case 12:
                ((zj) this.f25699c).setStatus((CharSequence) this.f25698b);
                return;
            case 13:
                pk pkVar = (pk) this.f25699c;
                String str = (String) this.f25698b;
                pkVar.getClass();
                ArrayList arrayList = new ArrayList(pkVar.X.v.f25456c);
                if (pkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, pkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(pkVar, str, !pkVar.R.isEmpty(), arrayList, 18));
                return;
            case 14:
                pk pkVar2 = (pk) this.f25699c;
                ArrayList arrayList2 = (ArrayList) this.f25698b;
                qk qkVar = pkVar2.X;
                boolean z11 = qkVar.f27699b0;
                fk fkVar = qkVar.f27705r;
                if (z11) {
                    s4.h0 adapter = fkVar.getAdapter();
                    pk pkVar3 = qkVar.f27709y;
                    if (adapter != pkVar3) {
                        fkVar.setAdapter(pkVar3);
                    }
                }
                pkVar2.f27403s = arrayList2;
                pkVar2.l();
                return;
            case 15:
                il ilVar = (il) this.f25699c;
                float[] fArr = (float[]) this.f25698b;
                ilVar.getClass();
                ilVar.b0(fArr[0], fArr[1]);
                return;
            case 16:
                oi oiVar = (oi) this.f25698b;
                boolean z12 = ChatAttachAlertPhotoLayout.f22120q1;
                int currentItemTop = oiVar.getCurrentItemTop();
                int listTopPadding = oiVar.getListTopPadding();
                vl vlVar = ((ChatAttachAlertPhotoLayout) this.f25699c).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                vlVar.scrollBy(0, listTopPadding);
                return;
            case 17:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25698b;
                fm fmVar = ((ChatAttachAlertPhotoLayout) this.f25699c).P;
                if (fmVar != null) {
                    fmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 18:
                oi oiVar2 = (oi) this.f25698b;
                int currentItemTop2 = oiVar2.getCurrentItemTop();
                int listTopPadding2 = oiVar2.getListTopPadding();
                ai.w0 w0Var = ((sm) this.f25699c).f28309r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 19:
                lo.a(((jo) this.f25699c).f25485c);
                ((hg.h) this.f25698b).run();
                return;
            case 20:
                ((jp) this.f25699c).f25489b.x((List) this.f25698b);
                return;
            case 21:
                ((kp) this.f25699c).f25768b.x((List) this.f25698b);
                return;
            case 22:
                ((org.telegram.ui.ActionBar.e3) this.f25699c).dismiss();
                nf.f.s((Context) this.f25698b, "https://t.me/BotFather?start=deletebot");
                return;
            case 23:
                or orVar = (or) this.f25699c;
                orVar.getClass();
                ((ci.d) this.f25698b).setLoading(false);
                orVar.dismiss();
                return;
            case 24:
                or orVar2 = (or) this.f25699c;
                TLObject tLObject = (TLObject) this.f25698b;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    orVar2.f27105b0 = groupcallstreamrtmpurl.url;
                    orVar2.f27106c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(orVar2.f27106c0);
                    orVar2.f27107d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f23182a |= 256;
                    obj.f23183b = 0;
                    obj.f23184c = spannableStringBuilder.length();
                    orVar2.f27107d0.setSpan(new d11(obj, 0), 0, orVar2.f27107d0.length(), 0);
                    orVar2.f27108e0.N(false);
                    return;
                }
                return;
            case 25:
                ss ssVar = (ss) this.f25699c;
                TLObject tLObject2 = (TLObject) this.f25698b;
                os osVar = ssVar.f28352b;
                ArrayList arrayList3 = ssVar.h;
                int i13 = ssVar.f28351a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    ssVar.f28355g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ssVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    ssVar.f28354f = currentTimeMillis;
                    if (!ssVar.f28356i) {
                        ssVar.f28356i = true;
                        String str3 = ssVar.f28355g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f18482id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(ssVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    ssVar.f28353c = false;
                    osVar.run();
                    return;
                }
                ssVar.f28355g = null;
                ssVar.e = true;
                ssVar.f28353c = false;
                osVar.run();
                return;
            case 26:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f25698b);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new kd(27, (rt) this.f25699c, decodeFile));
                return;
            case 27:
                ((rt) this.f25699c).setImage((Bitmap) this.f25698b);
                return;
            case 28:
                ((EditTextBoldCursor) this.f25699c).hintLayout.draw((Canvas) this.f25698b);
                return;
            default:
                MessagesController.getInstance(uv.U(((dv) this.f25699c).f23762a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f25698b);
                return;
        }
    }
}
