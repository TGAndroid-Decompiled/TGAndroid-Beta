package org.telegram.ui;

import ai.tb;
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
public final class fa implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.l6, org.telegram.ui.Components.bm0, MessagesStorage.BooleanCallback, c5.q, org.telegram.ui.Components.voip.g3, e2.j, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.Components.b50 {
    public final int f37255a;
    public final int f37256b;
    public final Object f37257c;
    public final Object d;
    public final Object e;

    public fa(int i10, ti tiVar, org.telegram.ui.ActionBar.h5 h5Var, org.telegram.ui.Components.c50 c50Var) {
        this.f37255a = 11;
        this.f37256b = i10;
        this.f37257c = tiVar;
        this.d = h5Var;
        this.e = c50Var;
    }

    @Override
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final ti tiVar = (ti) this.f37257c;
        final org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.d;
        final org.telegram.ui.Components.c50 c50Var = (org.telegram.ui.Components.c50) this.e;
        final int i10 = this.f37256b;
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new tb(i12, photoSize2, photoSize, tiVar, h5Var, 15));
                c50Var.i();
            }
        });
    }

    @Override
    public void a(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new ai.wb(iVar, (org.telegram.ui.ActionBar.o2) this.f37257c, list, this.f37256b, (c5.g) this.d, (sw0) this.e, 13));
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f37257c;
        ((u2.m0) obj).i(aVar.f281b, (u2.h0) aVar.f282c, (u2.v) this.d, (u2.d0) this.e, this.f37256b);
    }

    @Override
    public void b(CharSequence charSequence) {
        org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f37257c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j10 = n6Var.j(this.f37256b - ((int) Math.ceil(Math.min(n6Var.d, n6Var.f28803j))), charSequence);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(n6Var, j10, n6Var.d, arrayList.size());
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(n6Var, j10, n6Var.f28803j, arrayList2.size());
        arrayList2.add(k6Var);
        arrayList.add(k6Var2);
        float f7 = n6Var.d;
        float f10 = k6Var.f27872f;
        n6Var.d = f7 + f10;
        n6Var.f28803j += f10;
        n6Var.f(k6Var);
        n6Var.g(k6Var2);
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        org.telegram.ui.Components.io0 io0Var = (org.telegram.ui.Components.io0) this.f37257c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
        ArrayList arrayList = io0Var.f27457r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f37256b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new sg.y0(o2Var, 24, true).show();
                    return true;
                }
                org.telegram.ui.Components.go0 go0Var = ((org.telegram.ui.Components.ho0) view).f27088a;
                if (go0Var != null) {
                    go0Var.q();
                }
                org.telegram.ui.Components.fo0 fo0Var = (org.telegram.ui.Components.fo0) arrayList.get(i10);
                org.telegram.ui.Components.h80 H = org.telegram.ui.Components.h80.H(o2Var, view);
                H.f26911i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(fo0Var.f26402c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new ai.db(io0Var, i12, fo0Var, g6Var), false);
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
    public void f(org.telegram.ui.Components.voip.h3 h3Var) {
        nh1 nh1Var = (nh1) this.f37257c;
        org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(nh1Var.S0);
            nh1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(nh1Var.f39829b, false, Integer.valueOf(this.f37256b));
            nh1Var.t(i3Var, voIPService);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f37255a;
        int i12 = this.f37256b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f37257c;
        switch (i11) {
            case 0:
                final ha haVar = (ha) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                sa saVar = haVar.f37797a;
                long j10 = saVar.f41334x;
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
                final int i13 = this.f37256b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.xi(ha.this, str, tLObject, i13, z11, tL_error, tL_username, z10));
                    }
                });
                saVar.f41333w.add(tL_username.username);
                ((pa) view).setLoading(true);
                return;
            case 1:
            case 3:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 2:
                org.telegram.ui.Components.vr vrVar = (org.telegram.ui.Components.vr) obj3;
                ei.d dVar = (ei.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new org.telegram.ui.Components.qr(vrVar, dVar, 1));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.wv0 wv0Var = (org.telegram.ui.Components.wv0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(wv0Var.getContext(), 3, (org.telegram.ui.ActionBar.g6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f20370id = poll.f20370id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f37256b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(wv0Var.f32385j1);
                tL_messages_editMessage.f20427id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bs0(c2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new ci.s8(wv0Var, c2VarArr, i14, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        ArrayList arrayList = (ArrayList) this.f37257c;
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
                    if (str != null && str.equals(pVar.f4780c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f4768b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f4769c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new ug.m(chat, this.f37256b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z10) {
        boolean z11;
        int i10;
        ey eyVar = (ey) this.f37257c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView W3 = eyVar.W3();
        int i11 = this.f37256b;
        if (W3 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            W3.n(arrayList2, i10, null, null, new rv(eyVar, i11, arrayList2, z10, hashSet), null);
        }
        if (i11 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        eyVar.Z3(z11);
    }

    @Override
    public boolean v() {
        return false;
    }

    public fa(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f37255a = i11;
        this.f37257c = obj;
        this.f37256b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public fa(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f37255a = i11;
        this.f37257c = obj;
        this.d = obj2;
        this.f37256b = i10;
        this.e = obj3;
    }

    public fa(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f37255a = i11;
        this.f37257c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37256b = i10;
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
