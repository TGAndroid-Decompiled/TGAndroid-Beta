package org.telegram.ui;

import ai.za;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.UndoView;
public final class ha implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.o6, org.telegram.ui.Components.mm0, MessagesStorage.BooleanCallback, c5.p, org.telegram.ui.Components.voip.j3, BillingController.ProductDetailsResponseListenerLegacy, e2.h, org.telegram.ui.Components.o50 {
    public final int f38309a;
    public final int f38310b;
    public final Object f38311c;
    public final Object d;
    public final Object f38312e;

    public ha(int i10, gj gjVar, org.telegram.ui.ActionBar.b5 b5Var, org.telegram.ui.Components.p50 p50Var) {
        this.f38309a = 11;
        this.f38310b = i10;
        this.f38311c = gjVar;
        this.d = b5Var;
        this.f38312e = p50Var;
    }

    @Override
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final gj gjVar = (gj) this.f38311c;
        final org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.d;
        final org.telegram.ui.Components.p50 p50Var = (org.telegram.ui.Components.p50) this.f38312e;
        final int i10 = this.f38310b;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                TLRPC.InputFile inputFile3 = TLRPC.InputFile.this;
                if (inputFile3 != null) {
                    tL_photos_uploadProfilePhoto.file = inputFile3;
                    tL_photos_uploadProfilePhoto.flags |= 1;
                }
                TLRPC.InputFile inputFile4 = inputFile2;
                if (inputFile4 != null) {
                    tL_photos_uploadProfilePhoto.video = inputFile4;
                    int i11 = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i11 | 6;
                }
                TLRPC.VideoSize videoSize2 = videoSize;
                if (videoSize2 != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                int i12 = i10;
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new za(i12, photoSize2, photoSize, gjVar, b5Var, 12));
                p50Var.i();
            }
        });
    }

    @Override
    public void a(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ai.db(hVar, (org.telegram.ui.ActionBar.m2) this.f38311c, list, this.f38310b, (c5.f) this.d, (nx0) this.f38312e, 11));
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f38311c;
        ((u2.j0) obj).h(aVar.f299b, (u2.f0) aVar.f300c, (u2.t) this.d, (u2.b0) this.f38312e, this.f38310b);
    }

    @Override
    public void b(CharSequence charSequence) {
        org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f38311c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f38312e;
        StaticLayout j3 = q6Var.j(this.f38310b - ((int) Math.ceil(Math.min(q6Var.d, q6Var.f29719j))), charSequence);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(q6Var, j3, q6Var.d, arrayList.size());
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(q6Var, j3, q6Var.f29719j, arrayList2.size());
        arrayList2.add(n6Var);
        arrayList.add(n6Var2);
        float f7 = q6Var.d;
        float f10 = n6Var.f28742f;
        q6Var.d = f7 + f10;
        q6Var.f29719j += f10;
        q6Var.f(n6Var);
        q6Var.g(n6Var2);
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        org.telegram.ui.Components.to0 to0Var = (org.telegram.ui.Components.to0) this.f38311c;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f38312e;
        ArrayList arrayList = to0Var.f30911r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f38310b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new rg.y0(m2Var, 24, true).show();
                    return true;
                }
                org.telegram.ui.Components.ro0 ro0Var = ((org.telegram.ui.Components.so0) view).f30598a;
                if (ro0Var != null) {
                    ro0Var.q();
                }
                org.telegram.ui.Components.qo0 qo0Var = (org.telegram.ui.Components.qo0) arrayList.get(i10);
                org.telegram.ui.Components.s80 H = org.telegram.ui.Components.s80.H(m2Var, view);
                H.f30454i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(qo0Var.f29875c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new ai.d9(to0Var, i12, qo0Var, c6Var, 22), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f38309a;
        int i12 = this.f38310b;
        Object obj = this.f38312e;
        Object obj2 = this.d;
        Object obj3 = this.f38311c;
        switch (i11) {
            case 0:
                final ja jaVar = (ja) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                ua uaVar = jaVar.f39165a;
                long j3 = uaVar.f42439x;
                if (j3 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = MessagesController.getInstance(ua.b0(uaVar)).getInputUser(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = uaVar.getConnectionsManager();
                final int i13 = this.f38310b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.dj(ja.this, str, tLObject, i13, z11, tL_error, tL_username, z10));
                    }
                });
                uaVar.f42438w.add(tL_username.username);
                ((ra) view).setLoading(true);
                return;
            case 1:
            case 3:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 2:
                org.telegram.ui.Components.fs fsVar = (org.telegram.ui.Components.fs) obj3;
                ci.d dVar = (ci.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new org.telegram.ui.Components.as(fsVar, dVar, 1));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.hw0 hw0Var = (org.telegram.ui.Components.hw0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(hw0Var.getContext(), 3, (org.telegram.ui.ActionBar.c6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f19828id = poll.f19828id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f38310b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(hw0Var.f26947j1);
                tL_messages_editMessage.f19885id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ms0(a2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new ai.ab(hw0Var, a2VarArr, i14, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.Components.voip.k3 k3Var) {
        xi1 xi1Var = (xi1) this.f38311c;
        org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) this.d;
        VoIPService voIPService = (VoIPService) this.f38312e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(xi1Var.S0);
            xi1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(xi1Var.f43981b, false, Integer.valueOf(this.f38310b));
            xi1Var.t(l3Var, voIPService);
        }
    }

    @Override
    public gv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        ArrayList arrayList = (ArrayList) this.f38311c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f38312e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c5.o oVar = (c5.o) it.next();
            c5.k a2 = oVar.a();
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(oVar.f4277c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f4264b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f4265c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new tg.n(chat, this.f38310b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z10) {
        boolean z11;
        int i10;
        vy vyVar = (vy) this.f38311c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.f38312e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView V3 = vyVar.V3();
        int i11 = this.f38310b;
        if (V3 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            V3.n(arrayList2, i10, null, null, new gw(vyVar, i11, arrayList2, z10, hashSet), null);
        }
        if (i11 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        vyVar.Y3(z11);
    }

    @Override
    public boolean u() {
        return false;
    }

    public ha(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f38309a = i11;
        this.f38311c = obj;
        this.f38310b = i10;
        this.d = obj2;
        this.f38312e = obj3;
    }

    public ha(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f38309a = i11;
        this.f38311c = obj;
        this.d = obj2;
        this.f38310b = i10;
        this.f38312e = obj3;
    }

    public ha(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f38309a = i11;
        this.f38311c = obj;
        this.d = obj2;
        this.f38312e = obj3;
        this.f38310b = i10;
    }

    @Override
    public void D(float f7) {
    }

    @Override
    public void P() {
    }

    @Override
    public void L(boolean z10, boolean z11) {
    }
}
