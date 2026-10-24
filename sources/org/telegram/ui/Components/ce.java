package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
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
public final class ce implements Runnable {
    public final int f25294a;
    public final Object f25295b;
    public final Object f25296c;

    public ce(int i10, Object obj, Object obj2) {
        this.f25294a = i10;
        this.f25295b = obj;
        this.f25296c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        String str;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f25294a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25295b;
                int i10 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.setFieldText((CharSequence) this.f25296c);
                chatActivityEnterView.W = null;
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f25295b;
                int i11 = ChatActivityEnterView.f24051r5;
                ((pd) this.f25296c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 2:
                ng ngVar = (ng) this.f25296c;
                ChatActivityEnterView chatActivityEnterView3 = ((qg) this.f25295b).f29915b0;
                chatActivityEnterView3.f24104i1 = chatActivityEnterView3.f24098h1.getAudioRightMs() - chatActivityEnterView3.f24098h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f24098h1.getAudioLeftMs(), chatActivityEnterView3.f24098h1.getAudioRightMs(), ngVar);
                return;
            case 3:
                ri.n((ri) this.f25295b, (ei.x3) this.f25296c);
                return;
            case 4:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f25296c;
                ((ri) this.f25295b).dismiss(true);
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f25296c;
                if (!((ri) this.f25295b).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 6:
                ri riVar = (ri) this.f25295b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ki) this.f25296c).f28021c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                riVar.V1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(riVar.M1).updateAttachMenuBotsInCache();
                return;
            case 7:
                ri riVar2 = (ri) this.f25295b;
                MediaDataController.getInstance(riVar2.M1).loadAttachMenuBots(false, true);
                if (riVar2.B0 == riVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f25296c).bot_id)) {
                    riVar2.Y1(riVar2.f30158j0);
                    return;
                }
                return;
            case 8:
                dj djVar = (dj) this.f25295b;
                djVar.G = false;
                djVar.H = (ArrayList) this.f25296c;
                djVar.S();
                return;
            case 9:
                dj djVar2 = (dj) this.f25295b;
                ((ri) this.f25296c).e1();
                djVar2.O();
                djVar2.f27704b.f2(djVar2, 0);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ce(11, (uj) this.f25295b, ((tj) this.f25296c).run()));
                return;
            case 11:
                ((uj) this.f25295b).setStatus((CharSequence) this.f25296c);
                return;
            case 12:
                kk kkVar = (kk) this.f25295b;
                String str3 = (String) this.f25296c;
                kkVar.getClass();
                ArrayList arrayList = new ArrayList(kkVar.X.v.f26068c);
                if (kkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, kkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.x9(kkVar, str3, !kkVar.R.isEmpty(), arrayList, 18));
                return;
            case 13:
                kk kkVar2 = (kk) this.f25295b;
                ArrayList arrayList2 = (ArrayList) this.f25296c;
                lk lkVar = kkVar2.X;
                boolean z11 = lkVar.f28352b0;
                ak akVar = lkVar.f28358r;
                if (z11) {
                    s4.g0 adapter = akVar.getAdapter();
                    kk kkVar3 = lkVar.f28362y;
                    if (adapter != kkVar3) {
                        akVar.setAdapter(kkVar3);
                    }
                }
                kkVar2.f28027s = arrayList2;
                kkVar2.l();
                return;
            case 14:
                ri riVar3 = ((yk) this.f25295b).f27704b;
                riVar3.dismiss();
                riVar3.f30146f0.presentFragment(org.telegram.ui.sn.W9(((TLRPC.User) this.f25296c).f20491id));
                return;
            case 15:
                org.telegram.messenger.v0.p(R.string.WalletAddressCopiedBulletin, new vc((yk) this.f25295b, (org.telegram.ui.ActionBar.g6) this.f25296c), R.raw.copy, 36);
                return;
            case 16:
                pl plVar = (pl) this.f25295b;
                float[] fArr = (float[]) this.f25296c;
                plVar.getClass();
                plVar.e0(fArr[0], fArr[1]);
                return;
            case 17:
                ji jiVar = (ji) this.f25296c;
                boolean z12 = ChatAttachAlertPhotoLayout.f24223q1;
                int currentItemTop = jiVar.getCurrentItemTop();
                int listTopPadding = jiVar.getListTopPadding();
                cm cmVar = ((ChatAttachAlertPhotoLayout) this.f25295b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                cmVar.scrollBy(0, listTopPadding);
                return;
            case 18:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25296c;
                mm mmVar = ((ChatAttachAlertPhotoLayout) this.f25295b).P;
                if (mmVar != null) {
                    mmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 19:
                ji jiVar2 = (ji) this.f25296c;
                int currentItemTop2 = jiVar2.getCurrentItemTop();
                int listTopPadding2 = jiVar2.getListTopPadding();
                ai.u1 u1Var = ((zm) this.f25295b).f33292r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                u1Var.scrollBy(0, listTopPadding2);
                return;
            case 20:
                ro.a(((po) this.f25295b).f29633c);
                ((ig.g) this.f25296c).run();
                return;
            case 21:
                ((qp) this.f25295b).f29971b.C((List) this.f25296c);
                return;
            case 22:
                ((rp) this.f25295b).f30254b.C((List) this.f25296c);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.h3) this.f25295b).dismiss();
                pf.d.r((Context) this.f25296c, "https://t.me/BotFather?start=deletebot");
                return;
            case 24:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.f25295b;
                TreeSet treeSet = (TreeSet) this.f25296c;
                String charSequence = h3Var.getText().toString();
                if (!lr.a(charSequence, "bot") && lr.c(charSequence, treeSet) == null) {
                    str2 = "bot";
                }
                org.telegram.ui.Cells.f3 f3Var = h3Var.d;
                f3Var.setRightText(str2);
                int dp = AndroidUtilities.dp(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f7 = 21.0f;
                } else {
                    f7 = 63.0f;
                }
                f3Var.setPadding(0, dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(15.0f));
                return;
            case 25:
                vr vrVar = (vr) this.f25295b;
                vrVar.getClass();
                ((ei.d) this.f25296c).setLoading(false);
                vrVar.dismiss();
                return;
            case 26:
                vr vrVar2 = (vr) this.f25295b;
                TLObject tLObject = (TLObject) this.f25296c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    vrVar2.f32023b0 = groupcallstreamrtmpurl.url;
                    vrVar2.f32024c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vrVar2.f32024c0);
                    vrVar2.f32025d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f29448a |= 256;
                    obj.f29449b = 0;
                    obj.f29450c = spannableStringBuilder.length();
                    vrVar2.f32025d0.setSpan(new q11(obj, 0), 0, vrVar2.f32025d0.length(), 0);
                    vrVar2.f32026e0.N(false);
                    return;
                }
                return;
            case 27:
                xs xsVar = (xs) this.f25295b;
                TLObject tLObject2 = (TLObject) this.f25296c;
                us usVar = xsVar.f32694b;
                ArrayList arrayList3 = xsVar.h;
                int i12 = xsVar.f32693a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    xsVar.f32697g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    xsVar.f32696f = currentTimeMillis;
                    if (!xsVar.f32698i) {
                        xsVar.f32698i = true;
                        String str5 = xsVar.f32697g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList3.size(); i13 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.User) arrayList3.get(i13)).f20491id, arrayList4, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new ai.z(xsVar, messagesStorage, arrayList4, currentTimeMillis, str, 11));
                    }
                    xsVar.f32695c = false;
                    usVar.run();
                    return;
                }
                xsVar.f32697g = null;
                xsVar.e = true;
                xsVar.f32695c = false;
                usVar.run();
                return;
            case 28:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f25296c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new ce(29, (vt) this.f25295b, decodeFile));
                return;
            default:
                ((vt) this.f25295b).setImage((Bitmap) this.f25296c);
                return;
        }
    }
}
