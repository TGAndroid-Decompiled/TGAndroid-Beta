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
public final class fe implements Runnable {
    public final int f24274a;
    public final Object f24275b;
    public final Object f24276c;

    public fe(int i10, Object obj, Object obj2) {
        this.f24274a = i10;
        this.f24275b = obj;
        this.f24276c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        switch (this.f24274a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24275b;
                int i10 = ChatActivityEnterView.f21955n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f24276c);
                chatActivityEnterView.W = null;
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f24275b;
                int i11 = ChatActivityEnterView.f21955n5;
                ((sd) this.f24276c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 2:
                pg pgVar = (pg) this.f24276c;
                ChatActivityEnterView chatActivityEnterView3 = ((sg) this.f24275b).V;
                chatActivityEnterView3.f22008i1 = chatActivityEnterView3.f22002h1.getAudioRightMs() - chatActivityEnterView3.f22002h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f22002h1.getAudioLeftMs(), chatActivityEnterView3.f22002h1.getAudioRightMs(), pgVar);
                return;
            case 3:
                wi.m((wi) this.f24275b, (ci.e4) this.f24276c);
                return;
            case 4:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f24276c;
                ((wi) this.f24275b).dismiss(true);
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 5:
                wi wiVar = (wi) this.f24275b;
                MediaDataController.getInstance(wiVar.J1).loadAttachMenuBots(false, true);
                if (wiVar.f30023y0 == wiVar.f30019x0.get(((TLRPC.TL_attachMenuBot) this.f24276c).bot_id)) {
                    wiVar.N1(wiVar.f29974j0);
                    return;
                }
                return;
            case 6:
                wi wiVar2 = (wi) this.f24275b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((pi) this.f24276c).f27377c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                wiVar2.K1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(wiVar2.J1).updateAttachMenuBotsInCache();
                return;
            case 7:
                ij ijVar = (ij) this.f24275b;
                ijVar.G = false;
                ijVar.H = (ArrayList) this.f24276c;
                ijVar.P();
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new fe(9, (zj) this.f24275b, ((yj) this.f24276c).run()));
                return;
            case 9:
                ((zj) this.f24275b).setStatus((CharSequence) this.f24276c);
                return;
            case 10:
                pk pkVar = (pk) this.f24275b;
                String str = (String) this.f24276c;
                pkVar.getClass();
                ArrayList arrayList = new ArrayList(pkVar.X.v.f25492c);
                if (pkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, pkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(pkVar, str, !pkVar.R.isEmpty(), arrayList, 18));
                return;
            case 11:
                pk pkVar2 = (pk) this.f24275b;
                ArrayList arrayList2 = (ArrayList) this.f24276c;
                qk qkVar = pkVar2.X;
                boolean z11 = qkVar.f27756b0;
                fk fkVar = qkVar.f27762r;
                if (z11) {
                    s4.h0 adapter = fkVar.getAdapter();
                    pk pkVar3 = qkVar.f27766y;
                    if (adapter != pkVar3) {
                        fkVar.setAdapter(pkVar3);
                    }
                }
                pkVar2.f27384s = arrayList2;
                pkVar2.l();
                return;
            case 12:
                il ilVar = (il) this.f24275b;
                float[] fArr = (float[]) this.f24276c;
                ilVar.getClass();
                ilVar.b0(fArr[0], fArr[1]);
                return;
            case 13:
                oi oiVar = (oi) this.f24276c;
                boolean z12 = ChatAttachAlertPhotoLayout.f22123q1;
                int currentItemTop = oiVar.getCurrentItemTop();
                int listTopPadding = oiVar.getListTopPadding();
                vl vlVar = ((ChatAttachAlertPhotoLayout) this.f24275b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                vlVar.scrollBy(0, listTopPadding);
                return;
            case 14:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24276c;
                fm fmVar = ((ChatAttachAlertPhotoLayout) this.f24275b).P;
                if (fmVar != null) {
                    fmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 15:
                oi oiVar2 = (oi) this.f24276c;
                int currentItemTop2 = oiVar2.getCurrentItemTop();
                int listTopPadding2 = oiVar2.getListTopPadding();
                ai.w0 w0Var = ((sm) this.f24275b).f28332r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 16:
                lo.a(((jo) this.f24275b).f25516c);
                ((hg.g) this.f24276c).run();
                return;
            case 17:
                ((jp) this.f24275b).f25520b.x((List) this.f24276c);
                return;
            case 18:
                ((kp) this.f24275b).f25810b.x((List) this.f24276c);
                return;
            case 19:
                ((org.telegram.ui.ActionBar.g3) this.f24275b).dismiss();
                nf.f.s((Context) this.f24276c, "https://t.me/BotFather?start=deletebot");
                return;
            case 20:
                or orVar = (or) this.f24275b;
                orVar.getClass();
                ((ci.d) this.f24276c).setLoading(false);
                orVar.dismiss();
                return;
            case 21:
                or orVar2 = (or) this.f24275b;
                TLObject tLObject = (TLObject) this.f24276c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    orVar2.f27199b0 = groupcallstreamrtmpurl.url;
                    orVar2.f27200c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(orVar2.f27200c0);
                    orVar2.f27201d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f23485a |= 256;
                    obj.f23486b = 0;
                    obj.f23487c = spannableStringBuilder.length();
                    orVar2.f27201d0.setSpan(new e11(obj, 0), 0, orVar2.f27201d0.length(), 0);
                    orVar2.f27202e0.N(false);
                    return;
                }
                return;
            case 22:
                ss ssVar = (ss) this.f24275b;
                TLObject tLObject2 = (TLObject) this.f24276c;
                os osVar = ssVar.f28373b;
                ArrayList arrayList3 = ssVar.h;
                int i12 = ssVar.f28372a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    ssVar.f28376g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ssVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    ssVar.f28375f = currentTimeMillis;
                    if (!ssVar.f28377i) {
                        ssVar.f28377i = true;
                        String str3 = ssVar.f28376g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList3.size(); i13 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i13)).f18476id, arrayList4, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(ssVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    ssVar.f28374c = false;
                    osVar.run();
                    return;
                }
                ssVar.f28376g = null;
                ssVar.e = true;
                ssVar.f28374c = false;
                osVar.run();
                return;
            case 23:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f24276c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new fe(24, (rt) this.f24275b, decodeFile));
                return;
            case 24:
                ((rt) this.f24275b).setImage((Bitmap) this.f24276c);
                return;
            case 25:
                ((EditTextBoldCursor) this.f24275b).hintLayout.draw((Canvas) this.f24276c);
                return;
            case 26:
                MessagesController.getInstance(uv.U(((dv) this.f24275b).f23733a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f24276c);
                return;
            case 27:
                MessagesController.getInstance(((gx) this.f24275b).f24673a.f26574c1).updateEmojiStatus((TLRPC.EmojiStatus) this.f24276c);
                return;
            case 28:
                TLObject tLObject3 = (TLObject) this.f24276c;
                mz mzVar = ((gx) this.f24275b).f24673a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(mzVar.f26574c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(mzVar.f26574c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            default:
                dy dyVar = (dy) this.f24275b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.f24276c;
                dyVar.f23764s.f30797f = true;
                mz mzVar2 = dyVar.E;
                if (!mzVar2.f26613p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f18356id))) {
                    mzVar2.f26613p1.add(Long.valueOf(tL_messages_stickerSet2.set.f18356id));
                }
                dyVar.a(true);
                return;
        }
    }
}
