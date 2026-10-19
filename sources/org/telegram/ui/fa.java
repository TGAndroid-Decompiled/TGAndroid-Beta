package org.telegram.ui;

import ai.sb;
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
public final class fa implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.n6, org.telegram.ui.Components.yl0, MessagesStorage.BooleanCallback, c5.q, org.telegram.ui.Components.voip.g3, e2.j, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.Components.d50 {
    public final int f36947a;
    public final int f36948b;
    public final Object f36949c;
    public final Object d;
    public final Object e;

    public fa(int i10, ti tiVar, org.telegram.ui.ActionBar.d5 d5Var, org.telegram.ui.Components.e50 e50Var) {
        this.f36947a = 11;
        this.f36948b = i10;
        this.f36949c = tiVar;
        this.d = d5Var;
        this.e = e50Var;
    }

    @Override
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final ti tiVar = (ti) this.f36949c;
        final org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.d;
        final org.telegram.ui.Components.e50 e50Var = (org.telegram.ui.Components.e50) this.e;
        final int i10 = this.f36948b;
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new sb(i12, photoSize2, photoSize, tiVar, d5Var, 15));
                e50Var.i();
            }
        });
    }

    @Override
    public boolean a(int i10, View view) {
        int i11;
        org.telegram.ui.Components.fo0 fo0Var = (org.telegram.ui.Components.fo0) this.f36949c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
        ArrayList arrayList = fo0Var.f26310r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f36948b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new sg.y0(n2Var, 24, true).show();
                    return true;
                }
                org.telegram.ui.Components.do0 do0Var = ((org.telegram.ui.Components.eo0) view).f25952a;
                if (do0Var != null) {
                    do0Var.q();
                }
                org.telegram.ui.Components.co0 co0Var = (org.telegram.ui.Components.co0) arrayList.get(i10);
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(n2Var, view);
                H.f27116i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(co0Var.f25291c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new ai.cb(fo0Var, i12, co0Var, d6Var), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f36949c;
        ((u2.k0) obj).i(aVar.f281b, (u2.g0) aVar.f282c, (u2.u) this.d, (u2.c0) this.e, this.f36948b);
    }

    @Override
    public void b(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new ai.vb(iVar, (org.telegram.ui.ActionBar.n2) this.f36949c, list, this.f36948b, (c5.g) this.d, (pw0) this.e, 13));
    }

    @Override
    public void c(org.telegram.ui.Components.voip.h3 h3Var) {
        hh1 hh1Var = (hh1) this.f36949c;
        org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(hh1Var.S0);
            hh1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(hh1Var.f37627b, false, Integer.valueOf(this.f36948b));
            hh1Var.t(i3Var, voIPService);
        }
    }

    @Override
    public void d(CharSequence charSequence) {
        org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.f36949c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j10 = p6Var.j(this.f36948b - ((int) Math.ceil(Math.min(p6Var.d, p6Var.f29186j))), charSequence);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(p6Var, j10, p6Var.d, arrayList.size());
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(p6Var, j10, p6Var.f29186j, arrayList2.size());
        arrayList2.add(m6Var);
        arrayList.add(m6Var2);
        float f7 = p6Var.d;
        float f10 = m6Var.f28399f;
        p6Var.d = f7 + f10;
        p6Var.f29186j += f10;
        p6Var.f(m6Var);
        p6Var.g(m6Var2);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f36947a;
        int i12 = this.f36948b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f36949c;
        switch (i11) {
            case 0:
                final ha haVar = (ha) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                sa saVar = haVar.f37555a;
                long j10 = saVar.f41413x;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = MessagesController.getInstance(sa.b0(saVar)).getInputUser(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = saVar.getConnectionsManager();
                final int i13 = this.f36948b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.ti(ha.this, str, tLObject, i13, z11, tL_error, tL_username, z10));
                    }
                });
                saVar.f41412w.add(tL_username.username);
                ((pa) view).setLoading(true);
                return;
            case 1:
            case 3:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 2:
                org.telegram.ui.Components.xr xrVar = (org.telegram.ui.Components.xr) obj3;
                ei.d dVar = (ei.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new org.telegram.ui.Components.sr(xrVar, dVar, 1));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.tv0 tv0Var = (org.telegram.ui.Components.tv0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(tv0Var.getContext(), 3, (org.telegram.ui.ActionBar.d6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f20299id = poll.f20299id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f36948b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(tv0Var.f30707j1);
                tL_messages_editMessage.f20356id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yr0(b2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new ci.t8(tv0Var, b2VarArr, i14, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public ju0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        ArrayList arrayList = (ArrayList) this.f36949c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c5.p pVar = (c5.p) it.next();
            c5.l a2 = pVar.a();
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(pVar.f4775c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f4763b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f4764c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new ug.n(chat, this.f36948b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z10) {
        boolean z11;
        int i10;
        cy cyVar = (cy) this.f36949c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView W3 = cyVar.W3();
        int i11 = this.f36948b;
        if (W3 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            W3.n(arrayList2, i10, null, null, new pv(cyVar, i11, arrayList2, z10, hashSet), null);
        }
        if (i11 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        cyVar.Z3(z11);
    }

    @Override
    public boolean v() {
        return false;
    }

    public fa(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f36947a = i11;
        this.f36949c = obj;
        this.f36948b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public fa(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f36947a = i11;
        this.f36949c = obj;
        this.d = obj2;
        this.f36948b = i10;
        this.e = obj3;
    }

    public fa(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f36947a = i11;
        this.f36949c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f36948b = i10;
    }

    @Override
    public void E(float f7) {
    }

    @Override
    public void P() {
    }

    @Override
    public void K(boolean z10, boolean z11) {
    }
}
