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
public final class da implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.o6, org.telegram.ui.Components.im0, MessagesStorage.BooleanCallback, c5.p, org.telegram.ui.Components.voip.j3, BillingController.ProductDetailsResponseListenerLegacy, e2.h, org.telegram.ui.Components.m50 {
    public final int f36962a;
    public final int f36963b;
    public final Object f36964c;
    public final Object d;
    public final Object f36965e;

    public da(int i10, cj cjVar, org.telegram.ui.ActionBar.b5 b5Var, org.telegram.ui.Components.n50 n50Var) {
        this.f36962a = 11;
        this.f36963b = i10;
        this.f36964c = cjVar;
        this.d = b5Var;
        this.f36965e = n50Var;
    }

    @Override
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final cj cjVar = (cj) this.f36964c;
        final org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.d;
        final org.telegram.ui.Components.n50 n50Var = (org.telegram.ui.Components.n50) this.f36965e;
        final int i10 = this.f36963b;
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new za(i12, photoSize2, photoSize, cjVar, b5Var, 12));
                n50Var.i();
            }
        });
    }

    @Override
    public void a(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ai.db(hVar, (org.telegram.ui.ActionBar.m2) this.f36964c, list, this.f36963b, (c5.f) this.d, (kx0) this.f36965e, 11));
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f36964c;
        ((u2.j0) obj).h(aVar.f299b, (u2.f0) aVar.f300c, (u2.t) this.d, (u2.b0) this.f36965e, this.f36963b);
    }

    @Override
    public void b(CharSequence charSequence) {
        org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f36964c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f36965e;
        StaticLayout j3 = q6Var.j(this.f36963b - ((int) Math.ceil(Math.min(q6Var.d, q6Var.f30026j))), charSequence);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(q6Var, j3, q6Var.d, arrayList.size());
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(q6Var, j3, q6Var.f30026j, arrayList2.size());
        arrayList2.add(n6Var);
        arrayList.add(n6Var2);
        float f7 = q6Var.d;
        float f10 = n6Var.f28971f;
        q6Var.d = f7 + f10;
        q6Var.f30026j += f10;
        q6Var.f(n6Var);
        q6Var.g(n6Var2);
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        org.telegram.ui.Components.po0 po0Var = (org.telegram.ui.Components.po0) this.f36964c;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f36965e;
        ArrayList arrayList = po0Var.f29786r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f36963b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new rg.y0(m2Var, 24, true).show();
                    return true;
                }
                org.telegram.ui.Components.no0 no0Var = ((org.telegram.ui.Components.oo0) view).f29438a;
                if (no0Var != null) {
                    no0Var.q();
                }
                org.telegram.ui.Components.mo0 mo0Var = (org.telegram.ui.Components.mo0) arrayList.get(i10);
                org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(m2Var, view);
                H.f30065i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(mo0Var.f28812c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new ai.d9(po0Var, i12, mo0Var, d6Var, 22), false);
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
        int i11 = this.f36962a;
        int i12 = this.f36963b;
        Object obj = this.f36965e;
        Object obj2 = this.d;
        Object obj3 = this.f36964c;
        switch (i11) {
            case 0:
                final fa faVar = (fa) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                qa qaVar = faVar.f37613a;
                long j3 = qaVar.f41087x;
                if (j3 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = MessagesController.getInstance(qa.b0(qaVar)).getInputUser(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = qaVar.getConnectionsManager();
                final int i13 = this.f36963b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.yi(fa.this, str, tLObject, i13, z11, tL_error, tL_username, z10));
                    }
                });
                qaVar.f41086w.add(tL_username.username);
                ((na) view).setLoading(true);
                return;
            case 1:
            case 3:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 2:
                org.telegram.ui.Components.es esVar = (org.telegram.ui.Components.es) obj3;
                ci.d dVar = (ci.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new org.telegram.ui.Components.yr(esVar, dVar, 1));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.dw0 dw0Var = (org.telegram.ui.Components.dw0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(dw0Var.getContext(), 3, (org.telegram.ui.ActionBar.d6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f20058id = poll.f20058id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f36963b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(dw0Var.f25710j1);
                tL_messages_editMessage.f20115id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.is0(a2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new ai.ab(dw0Var, a2VarArr, i14, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.Components.voip.k3 k3Var) {
        ui1 ui1Var = (ui1) this.f36964c;
        org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) this.d;
        VoIPService voIPService = (VoIPService) this.f36965e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
            ui1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ui1Var.f42580b, false, Integer.valueOf(this.f36963b));
            ui1Var.t(l3Var, voIPService);
        }
    }

    @Override
    public dv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        ArrayList arrayList = (ArrayList) this.f36964c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f36965e;
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
                    if (str != null && str.equals(oVar.f4278c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f4265b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f4266c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new tg.n(chat, this.f36963b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z10) {
        boolean z11;
        int i10;
        sy syVar = (sy) this.f36964c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.f36965e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView V3 = syVar.V3();
        int i11 = this.f36963b;
        if (V3 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            V3.n(arrayList2, i10, null, null, new dw(syVar, i11, arrayList2, z10, hashSet), null);
        }
        if (i11 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        syVar.Y3(z11);
    }

    @Override
    public boolean u() {
        return false;
    }

    public da(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f36962a = i11;
        this.f36964c = obj;
        this.f36963b = i10;
        this.d = obj2;
        this.f36965e = obj3;
    }

    public da(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f36962a = i11;
        this.f36964c = obj;
        this.d = obj2;
        this.f36963b = i10;
        this.f36965e = obj3;
    }

    public da(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f36962a = i11;
        this.f36964c = obj;
        this.d = obj2;
        this.f36965e = obj3;
        this.f36963b = i10;
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
