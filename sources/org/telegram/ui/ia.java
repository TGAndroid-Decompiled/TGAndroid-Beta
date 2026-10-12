package org.telegram.ui;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import bi.ia;
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
public final class ia implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.p6, org.telegram.ui.Components.cm0, MessagesStorage.BooleanCallback, c5.q, org.telegram.ui.Components.voip.h3, e2.j, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.Components.h50 {
    public final int f37075a;
    public final int f37076b;
    public final Object f37077c;
    public final Object d;
    public final Object e;

    public ia(int i10, gj gjVar, org.telegram.ui.ActionBar.b5 b5Var, org.telegram.ui.Components.i50 i50Var) {
        this.f37075a = 11;
        this.f37076b = i10;
        this.f37077c = gjVar;
        this.d = b5Var;
        this.e = i50Var;
    }

    @Override
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final gj gjVar = (gj) this.f37077c;
        final org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.d;
        final org.telegram.ui.Components.i50 i50Var = (org.telegram.ui.Components.i50) this.e;
        final int i10 = this.f37076b;
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new ia(i12, photoSize2, photoSize, gjVar, b5Var, 12));
                i50Var.i();
            }
        });
    }

    @Override
    public boolean a(int i10, View view) {
        int i11;
        org.telegram.ui.Components.ko0 ko0Var = (org.telegram.ui.Components.ko0) this.f37077c;
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
        ArrayList arrayList = ko0Var.f26769r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f37076b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new sg.y0(m2Var, 24, true).show();
                    return true;
                }
                org.telegram.ui.Components.io0 io0Var = ((org.telegram.ui.Components.jo0) view).f26420a;
                if (io0Var != null) {
                    io0Var.q();
                }
                org.telegram.ui.Components.ho0 ho0Var = (org.telegram.ui.Components.ho0) arrayList.get(i10);
                org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(m2Var, view);
                H.f27280i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(ho0Var.f25718c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new bi.n8(ko0Var, i12, ho0Var, c6Var, 22), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f37077c;
        ((u2.k0) obj).i(aVar.f279b, (u2.g0) aVar.f280c, (u2.u) this.d, (u2.c0) this.e, this.f37076b);
    }

    @Override
    public void b(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new bi.ma(iVar, (org.telegram.ui.ActionBar.m2) this.f37077c, list, this.f37076b, (c5.g) this.d, (rx0) this.e, 12));
    }

    @Override
    public void c(org.telegram.ui.Components.voip.i3 i3Var) {
        dj1 dj1Var = (dj1) this.f37077c;
        org.telegram.ui.Components.voip.j3 j3Var = (org.telegram.ui.Components.voip.j3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(dj1Var.S0);
            dj1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(dj1Var.f35277b, false, Integer.valueOf(this.f37076b));
            dj1Var.t(j3Var, voIPService);
        }
    }

    @Override
    public void d(CharSequence charSequence) {
        org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) this.f37077c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j10 = r6Var.j(this.f37076b - ((int) Math.ceil(Math.min(r6Var.d, r6Var.f28754j))), charSequence);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(r6Var, j10, r6Var.d, arrayList.size());
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(r6Var, j10, r6Var.f28754j, arrayList2.size());
        arrayList2.add(o6Var);
        arrayList.add(o6Var2);
        float f7 = r6Var.d;
        float f10 = o6Var.f27857f;
        r6Var.d = f7 + f10;
        r6Var.f28754j += f10;
        r6Var.f(o6Var);
        r6Var.g(o6Var2);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f37075a;
        int i12 = this.f37076b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f37077c;
        switch (i11) {
            case 0:
                final ka kaVar = (ka) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                va vaVar = kaVar.f37613a;
                long j10 = vaVar.f40943x;
                if (j10 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = MessagesController.getInstance(va.b0(vaVar)).getInputUser(j10);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = vaVar.getConnectionsManager();
                final int i13 = this.f37076b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.bj(ka.this, str, tLObject, i13, z11, tL_error, tL_username, z10));
                    }
                });
                vaVar.f40942w.add(tL_username.username);
                ((sa) view).setLoading(true);
                return;
            case 1:
            case 3:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 2:
                org.telegram.ui.Components.as asVar = (org.telegram.ui.Components.as) obj3;
                di.d dVar = (di.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new org.telegram.ui.Components.vr(asVar, dVar, 1));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(xv0Var.getContext(), 3, (org.telegram.ui.ActionBar.c6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f19242id = poll.f19242id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f37076b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(xv0Var.f31363j1);
                tL_messages_editMessage.f19299id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cs0(a2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new bi.ja(xv0Var, a2VarArr, i14, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public kv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        ArrayList arrayList = (ArrayList) this.f37077c;
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
                    if (str != null && str.equals(pVar.f4404c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f4392b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f4393c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new ug.o(chat, this.f37076b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z10) {
        boolean z11;
        int i10;
        yy yyVar = (yy) this.f37077c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView V3 = yyVar.V3();
        int i11 = this.f37076b;
        if (V3 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            V3.n(arrayList2, i10, null, null, new kw(yyVar, i11, arrayList2, z10, hashSet), null);
        }
        if (i11 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        yyVar.Y3(z11);
    }

    @Override
    public boolean v() {
        return false;
    }

    public ia(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f37075a = i11;
        this.f37077c = obj;
        this.f37076b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public ia(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f37075a = i11;
        this.f37077c = obj;
        this.d = obj2;
        this.f37076b = i10;
        this.e = obj3;
    }

    public ia(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f37075a = i11;
        this.f37077c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f37076b = i10;
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
