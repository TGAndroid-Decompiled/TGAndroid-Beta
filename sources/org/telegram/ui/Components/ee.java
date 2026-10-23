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
public final class ee implements Runnable {
    public final int f25958a;
    public final Object f25959b;
    public final Object f25960c;

    public ee(int i10, Object obj, Object obj2) {
        this.f25958a = i10;
        this.f25959b = obj;
        this.f25960c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        String str;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f25958a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25959b;
                int i10 = ChatActivityEnterView.f24050r5;
                chatActivityEnterView.setFieldText((CharSequence) this.f25960c);
                chatActivityEnterView.W = null;
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f25959b;
                int i11 = ChatActivityEnterView.f24050r5;
                ((rd) this.f25960c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 2:
                pg pgVar = (pg) this.f25960c;
                ChatActivityEnterView chatActivityEnterView3 = ((sg) this.f25959b).f30482b0;
                chatActivityEnterView3.f24103i1 = chatActivityEnterView3.f24097h1.getAudioRightMs() - chatActivityEnterView3.f24097h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f24097h1.getAudioLeftMs(), chatActivityEnterView3.f24097h1.getAudioRightMs(), pgVar);
                return;
            case 3:
                ti.n((ti) this.f25959b, (ei.x3) this.f25960c);
                return;
            case 4:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f25960c;
                ((ti) this.f25959b).dismiss(true);
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f25960c;
                if (!((ti) this.f25959b).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 6:
                ti tiVar = (ti) this.f25959b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((mi) this.f25960c).f28663c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                tiVar.V1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(tiVar.M1).updateAttachMenuBotsInCache();
                return;
            case 7:
                ti tiVar2 = (ti) this.f25959b;
                MediaDataController.getInstance(tiVar2.M1).loadAttachMenuBots(false, true);
                if (tiVar2.B0 == tiVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f25960c).bot_id)) {
                    tiVar2.Y1(tiVar2.f30742j0);
                    return;
                }
                return;
            case 8:
                fj fjVar = (fj) this.f25959b;
                fjVar.G = false;
                fjVar.H = (ArrayList) this.f25960c;
                fjVar.S();
                return;
            case 9:
                fj fjVar2 = (fj) this.f25959b;
                ((ti) this.f25960c).e1();
                fjVar2.O();
                fjVar2.f28366b.f2(fjVar2, 0);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ee(11, (wj) this.f25959b, ((vj) this.f25960c).run()));
                return;
            case 11:
                ((wj) this.f25959b).setStatus((CharSequence) this.f25960c);
                return;
            case 12:
                mk mkVar = (mk) this.f25959b;
                String str3 = (String) this.f25960c;
                mkVar.getClass();
                ArrayList arrayList = new ArrayList(mkVar.X.v.f26615c);
                if (mkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, mkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.x9(mkVar, str3, !mkVar.R.isEmpty(), arrayList, 18));
                return;
            case 13:
                mk mkVar2 = (mk) this.f25959b;
                ArrayList arrayList2 = (ArrayList) this.f25960c;
                nk nkVar = mkVar2.X;
                boolean z11 = nkVar.f28971b0;
                ck ckVar = nkVar.f28977r;
                if (z11) {
                    s4.g0 adapter = ckVar.getAdapter();
                    mk mkVar3 = nkVar.f28981y;
                    if (adapter != mkVar3) {
                        ckVar.setAdapter(mkVar3);
                    }
                }
                mkVar2.f28669s = arrayList2;
                mkVar2.l();
                return;
            case 14:
                ti tiVar3 = ((al) this.f25959b).f28366b;
                tiVar3.dismiss();
                tiVar3.f30730f0.presentFragment(org.telegram.ui.sn.W9(((TLRPC.User) this.f25960c).f20490id));
                return;
            case 15:
                org.telegram.messenger.v0.p(R.string.WalletAddressCopiedBulletin, new xc((al) this.f25959b, (org.telegram.ui.ActionBar.g6) this.f25960c), R.raw.copy, 36);
                return;
            case 16:
                rl rlVar = (rl) this.f25959b;
                float[] fArr = (float[]) this.f25960c;
                rlVar.getClass();
                rlVar.f0(fArr[0], fArr[1]);
                return;
            case 17:
                li liVar = (li) this.f25960c;
                boolean z12 = ChatAttachAlertPhotoLayout.f24222q1;
                int currentItemTop = liVar.getCurrentItemTop();
                int listTopPadding = liVar.getListTopPadding();
                em emVar = ((ChatAttachAlertPhotoLayout) this.f25959b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                emVar.scrollBy(0, listTopPadding);
                return;
            case 18:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25960c;
                om omVar = ((ChatAttachAlertPhotoLayout) this.f25959b).P;
                if (omVar != null) {
                    omVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 19:
                li liVar2 = (li) this.f25960c;
                int currentItemTop2 = liVar2.getCurrentItemTop();
                int listTopPadding2 = liVar2.getListTopPadding();
                ai.u1 u1Var = ((bn) this.f25959b).f25102r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                u1Var.scrollBy(0, listTopPadding2);
                return;
            case 20:
                to.a(((ro) this.f25959b).f30237c);
                ((ig.g) this.f25960c).run();
                return;
            case 21:
                ((sp) this.f25959b).f30535b.C((List) this.f25960c);
                return;
            case 22:
                ((tp) this.f25959b).f30884b.C((List) this.f25960c);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.h3) this.f25959b).dismiss();
                pf.d.r((Context) this.f25960c, "https://t.me/BotFather?start=deletebot");
                return;
            case 24:
                org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) this.f25959b;
                TreeSet treeSet = (TreeSet) this.f25960c;
                String charSequence = h3Var.getText().toString();
                if (!nr.a(charSequence, "bot") && nr.c(charSequence, treeSet) == null) {
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
                xr xrVar = (xr) this.f25959b;
                xrVar.getClass();
                ((ei.d) this.f25960c).setLoading(false);
                xrVar.dismiss();
                return;
            case 26:
                xr xrVar2 = (xr) this.f25959b;
                TLObject tLObject = (TLObject) this.f25960c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    xrVar2.f32630b0 = groupcallstreamrtmpurl.url;
                    xrVar2.f32631c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xrVar2.f32631c0);
                    xrVar2.f32632d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f29754a |= 256;
                    obj.f29755b = 0;
                    obj.f29756c = spannableStringBuilder.length();
                    xrVar2.f32632d0.setSpan(new r11(obj, 0), 0, xrVar2.f32632d0.length(), 0);
                    xrVar2.f32633e0.N(false);
                    return;
                }
                return;
            case 27:
                zs zsVar = (zs) this.f25959b;
                TLObject tLObject2 = (TLObject) this.f25960c;
                ws wsVar = zsVar.f33329b;
                ArrayList arrayList3 = zsVar.h;
                int i12 = zsVar.f33328a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    zsVar.f33332g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    zsVar.f33331f = currentTimeMillis;
                    if (!zsVar.f33333i) {
                        zsVar.f33333i = true;
                        String str5 = zsVar.f33332g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList3.size(); i13 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.User) arrayList3.get(i13)).f20490id, arrayList4, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new ai.z(zsVar, messagesStorage, arrayList4, currentTimeMillis, str, 11));
                    }
                    zsVar.f33330c = false;
                    wsVar.run();
                    return;
                }
                zsVar.f33332g = null;
                zsVar.e = true;
                zsVar.f33330c = false;
                wsVar.run();
                return;
            case 28:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f25960c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new ee(29, (xt) this.f25959b, decodeFile));
                return;
            default:
                ((xt) this.f25959b).setImage((Bitmap) this.f25960c);
                return;
        }
    }
}
