package org.telegram.ui;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import bi.fa;
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
public final class da implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.n6, org.telegram.ui.Components.bl0, MessagesStorage.BooleanCallback, c5.p, org.telegram.ui.Components.voip.g3, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.Components.t40 {
    public final int f35740a;
    public final int f35741b;
    public final Object f35742c;
    public final Object d;
    public final Object f35743e;

    public da(int i10, dj djVar, org.telegram.ui.ActionBar.d5 d5Var, org.telegram.ui.Components.u40 u40Var) {
        this.f35740a = 10;
        this.f35741b = i10;
        this.f35742c = djVar;
        this.d = d5Var;
        this.f35743e = u40Var;
    }

    @Override
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final dj djVar = (dj) this.f35742c;
        final org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.d;
        final org.telegram.ui.Components.u40 u40Var = (org.telegram.ui.Components.u40) this.f35743e;
        final int i10 = this.f35741b;
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new fa(i12, photoSize2, photoSize, djVar, d5Var, 12));
                u40Var.j();
            }
        });
    }

    @Override
    public boolean a(int i10, View view) {
        int i11;
        org.telegram.ui.Components.hn0 hn0Var = (org.telegram.ui.Components.hn0) this.f35742c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f35743e;
        ArrayList arrayList = hn0Var.f26768r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f35741b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new sg.a1(n2Var, 24, true).show();
                    return true;
                }
                org.telegram.ui.Components.fn0 fn0Var = ((org.telegram.ui.Components.gn0) view).f26461a;
                if (fn0Var != null) {
                    fn0Var.q();
                }
                org.telegram.ui.Components.en0 en0Var = (org.telegram.ui.Components.en0) arrayList.get(i10);
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(n2Var, view);
                H.f28642i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(en0Var.f25739c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new bi.k8(hn0Var, i12, en0Var, f6Var, 21), false);
                H.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new bi.ia(hVar, (org.telegram.ui.ActionBar.n2) this.f35742c, list, this.f35741b, (c5.f) this.d, (lx0) this.f35743e, 11));
    }

    @Override
    public void c(org.telegram.ui.Components.voip.h3 h3Var) {
        ui1 ui1Var = (ui1) this.f35742c;
        org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) this.d;
        VoIPService voIPService = (VoIPService) this.f35743e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
            ui1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ui1Var.f41110b, false, Integer.valueOf(this.f35741b));
            ui1Var.u(i3Var, voIPService);
        }
    }

    @Override
    public void d(CharSequence charSequence) {
        org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.f35742c;
        ArrayList arrayList = (ArrayList) this.d;
        StaticLayout h = p6Var.h(this.f35741b - ((int) Math.ceil(Math.min(p6Var.d, p6Var.h))), charSequence);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(p6Var, h, p6Var.d, arrayList.size());
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(p6Var, h, p6Var.h, arrayList.size());
        ((ArrayList) this.f35743e).add(m6Var);
        arrayList.add(m6Var2);
        float f7 = p6Var.d;
        float f10 = m6Var.f28391f;
        p6Var.d = f7 + f10;
        p6Var.h += f10;
        p6Var.f29287e = Math.max(p6Var.f29287e, h.getHeight());
        p6Var.f29290i = Math.max(p6Var.f29290i, h.getHeight());
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f35740a;
        int i12 = this.f35741b;
        Object obj = this.f35743e;
        Object obj2 = this.d;
        Object obj3 = this.f35742c;
        switch (i11) {
            case 0:
                final fa faVar = (fa) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                qa qaVar = faVar.f36355a;
                long j3 = qaVar.f39808x;
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
                final int i13 = this.f35741b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.cj(fa.this, str, tLObject, i13, z11, tL_error, tL_username, z10));
                    }
                });
                qaVar.f39807w.add(tL_username.username);
                ((na) view).setLoading(true);
                return;
            case 1:
            case 3:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 2:
                org.telegram.ui.Components.lr lrVar = (org.telegram.ui.Components.lr) obj3;
                di.d dVar = (di.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new org.telegram.ui.Components.gr(lrVar, dVar, 1));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.xu0 xu0Var = (org.telegram.ui.Components.xu0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(xu0Var.getContext(), 3, (org.telegram.ui.ActionBar.f6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f19895id = poll.f19895id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f35741b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(xu0Var.f32701j1);
                tL_messages_editMessage.f19952id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ar0(b2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new bi.ga(xu0Var, b2VarArr, i14, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public cv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        ArrayList arrayList = (ArrayList) this.f35742c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f35743e;
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
                    if (str != null && str.equals(oVar.f4422c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f4409b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f4410c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new ug.o(chat, this.f35741b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z10) {
        boolean z11;
        int i10;
        uy uyVar = (uy) this.f35742c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.f35743e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = uyVar.Y3();
        int i11 = this.f35741b;
        if (Y3 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            Y3.n(arrayList2, i10, null, null, new gw(uyVar, i11, arrayList2, z10, hashSet), null);
        }
        if (i11 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        uyVar.b4(z11);
    }

    @Override
    public boolean t() {
        return false;
    }

    public da(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f35740a = i11;
        this.f35742c = obj;
        this.f35741b = i10;
        this.d = obj2;
        this.f35743e = obj3;
    }

    public da(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f35740a = i11;
        this.f35742c = obj;
        this.d = obj2;
        this.f35741b = i10;
        this.f35743e = obj3;
    }

    public da(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f35740a = i11;
        this.f35742c = obj;
        this.d = obj2;
        this.f35743e = obj3;
        this.f35741b = i10;
    }

    @Override
    public void C(float f7) {
    }

    @Override
    public void P() {
    }

    @Override
    public void L(boolean z10, boolean z11) {
    }
}
