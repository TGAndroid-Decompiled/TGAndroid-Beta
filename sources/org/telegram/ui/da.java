package org.telegram.ui;

import ai.ya;
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
public final class da implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.m6, org.telegram.ui.Components.cl0, MessagesStorage.BooleanCallback, c5.p, org.telegram.ui.Components.voip.i3, BillingController.ProductDetailsResponseListenerLegacy, e2.h, org.telegram.ui.Components.u40 {
    public final int f32546a;
    public final int f32547b;
    public final Object f32548c;
    public final Object d;
    public final Object e;

    public da(int i10, aj ajVar, org.telegram.ui.ActionBar.c5 c5Var, org.telegram.ui.Components.v40 v40Var) {
        this.f32546a = 11;
        this.f32547b = i10;
        this.f32548c = ajVar;
        this.d = c5Var;
        this.e = v40Var;
    }

    @Override
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final aj ajVar = (aj) this.f32548c;
        final org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) this.d;
        final org.telegram.ui.Components.v40 v40Var = (org.telegram.ui.Components.v40) this.e;
        final int i10 = this.f32547b;
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new ya(i12, photoSize2, photoSize, ajVar, c5Var, 12));
                v40Var.j();
            }
        });
    }

    @Override
    public void a(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ai.cb(hVar, (org.telegram.ui.ActionBar.n2) this.f32548c, list, this.f32547b, (c5.f) this.d, (ex0) this.e, 11));
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f32548c;
        ((u2.j0) obj).h(aVar.f277b, (u2.f0) aVar.f278c, (u2.t) this.d, (u2.b0) this.e, this.f32547b);
    }

    @Override
    public void b(CharSequence charSequence) {
        org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f32548c;
        ArrayList arrayList = (ArrayList) this.d;
        StaticLayout h = o6Var.h(this.f32547b - ((int) Math.ceil(Math.min(o6Var.d, o6Var.h))), charSequence);
        org.telegram.ui.Components.l6 l6Var = new org.telegram.ui.Components.l6(o6Var, h, o6Var.d, arrayList.size());
        org.telegram.ui.Components.l6 l6Var2 = new org.telegram.ui.Components.l6(o6Var, h, o6Var.h, arrayList.size());
        ((ArrayList) this.e).add(l6Var);
        arrayList.add(l6Var2);
        float f7 = o6Var.d;
        float f10 = l6Var.f25825f;
        o6Var.d = f7 + f10;
        o6Var.h += f10;
        o6Var.e = Math.max(o6Var.e, h.getHeight());
        o6Var.f26618i = Math.max(o6Var.f26618i, h.getHeight());
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        org.telegram.ui.Components.in0 in0Var = (org.telegram.ui.Components.in0) this.f32548c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
        ArrayList arrayList = in0Var.f25009r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f32547b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new rg.x0(n2Var, 24, true).show();
                    return true;
                }
                org.telegram.ui.Components.gn0 gn0Var = ((org.telegram.ui.Components.hn0) view).f24753a;
                if (gn0Var != null) {
                    gn0Var.q();
                }
                org.telegram.ui.Components.fn0 fn0Var = (org.telegram.ui.Components.fn0) arrayList.get(i10);
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(n2Var, view);
                H.f26651i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(fn0Var.f24015c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new ai.c9(in0Var, i12, fn0Var, d6Var, 21), false);
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f32546a;
        int i12 = this.f32547b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f32548c;
        switch (i11) {
            case 0:
                final fa faVar = (fa) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                qa qaVar = faVar.f33265a;
                long j3 = qaVar.f36343x;
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
                final int i13 = this.f32547b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.bj(fa.this, str, tLObject, i13, z11, tL_error, tL_username, z10));
                    }
                });
                qaVar.f36342w.add(tL_username.username);
                ((na) view).setLoading(true);
                return;
            case 1:
            case 3:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 2:
                org.telegram.ui.Components.nr nrVar = (org.telegram.ui.Components.nr) obj3;
                ci.d dVar = (ci.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new org.telegram.ui.Components.ir(nrVar, dVar, 1));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.yu0 yu0Var = (org.telegram.ui.Components.yu0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(yu0Var.getContext(), 3, (org.telegram.ui.ActionBar.d6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f18109id = poll.f18109id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f32547b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(yu0Var.f30425j1);
                tL_messages_editMessage.f18166id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.br0(b2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new ai.za(yu0Var, b2VarArr, i14, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public wu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void h(org.telegram.ui.Components.voip.j3 j3Var) {
        mi1 mi1Var = (mi1) this.f32548c;
        org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(mi1Var.S0);
            mi1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(mi1Var.f35304b, false, Integer.valueOf(this.f32547b));
            mi1Var.u(k3Var, voIPService);
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        ArrayList arrayList = (ArrayList) this.f32548c;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
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
                    if (str != null && str.equals(oVar.f3909c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f3897b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f3898c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new tg.p(chat, this.f32547b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z10) {
        boolean z11;
        int i10;
        ry ryVar = (ry) this.f32548c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = ryVar.Y3();
        int i11 = this.f32547b;
        if (Y3 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            Y3.n(arrayList2, i10, null, null, new cw(ryVar, i11, arrayList2, z10, hashSet), null);
        }
        if (i11 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        ryVar.b4(z11);
    }

    @Override
    public boolean t() {
        return false;
    }

    public da(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f32546a = i11;
        this.f32548c = obj;
        this.f32547b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public da(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f32546a = i11;
        this.f32548c = obj;
        this.d = obj2;
        this.f32547b = i10;
        this.e = obj3;
    }

    public da(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f32546a = i11;
        this.f32548c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f32547b = i10;
    }

    @Override
    public void B(float f7) {
    }

    @Override
    public void P() {
    }

    @Override
    public void L(boolean z10, boolean z11) {
    }
}
