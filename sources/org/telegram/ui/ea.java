package org.telegram.ui;

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import fg.e1;
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
public final class ea implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.l6, org.telegram.ui.Components.ll0, MessagesStorage.BooleanCallback, c5.p, org.telegram.ui.Components.voip.i3, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.Components.d50 {
    public final int f32130a;
    public final int f32131b;
    public final Object f32132c;
    public final Object d;
    public final Object e;

    public ea(int i10, fj fjVar, org.telegram.ui.ActionBar.f5 f5Var, org.telegram.ui.Components.e50 e50Var) {
        this.f32130a = 10;
        this.f32131b = i10;
        this.f32132c = fjVar;
        this.d = f5Var;
        this.e = e50Var;
    }

    @Override
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final fj fjVar = (fj) this.f32132c;
        final org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) this.d;
        final org.telegram.ui.Components.e50 e50Var = (org.telegram.ui.Components.e50) this.e;
        final int i10 = this.f32131b;
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new e1(i12, photoSize2, photoSize, fjVar, f5Var, 11));
                e50Var.j();
            }
        });
    }

    @Override
    public void a(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0(hVar, (org.telegram.ui.ActionBar.p2) this.f32132c, list, this.f32131b, (c5.f) this.d, (nx0) this.e, 10));
    }

    @Override
    public void b(org.telegram.ui.Components.voip.j3 j3Var) {
        zi1 zi1Var = (zi1) this.f32132c;
        org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(zi1Var.S0);
            zi1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(zi1Var.f39359b, false, Integer.valueOf(this.f32131b));
            zi1Var.u(k3Var, voIPService);
        }
    }

    @Override
    public void c(CharSequence charSequence) {
        org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f32132c;
        ArrayList arrayList = (ArrayList) this.d;
        StaticLayout h = n6Var.h(this.f32131b - ((int) Math.ceil(Math.min(n6Var.d, n6Var.h))), charSequence);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(n6Var, h, n6Var.d, arrayList.size());
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(n6Var, h, n6Var.h, arrayList.size());
        ((ArrayList) this.e).add(k6Var);
        arrayList.add(k6Var2);
        float f7 = n6Var.d;
        float f10 = k6Var.f24617f;
        n6Var.d = f7 + f10;
        n6Var.h += f10;
        n6Var.e = Math.max(n6Var.e, h.getHeight());
        n6Var.f25429i = Math.max(n6Var.f25429i, h.getHeight());
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        org.telegram.ui.Components.rn0 rn0Var = (org.telegram.ui.Components.rn0) this.f32132c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
        ArrayList arrayList = rn0Var.f26702r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f32131b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new qg.a1(p2Var, 24, true).show();
                    return true;
                }
                org.telegram.ui.Components.pn0 pn0Var = ((org.telegram.ui.Components.qn0) view).f26450a;
                if (pn0Var != null) {
                    pn0Var.q();
                }
                org.telegram.ui.Components.on0 on0Var = (org.telegram.ui.Components.on0) arrayList.get(i10);
                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(p2Var, view);
                H.f28683i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(on0Var.f25847c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new di.q(rn0Var, i12, on0Var, f6Var, 21), false);
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
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f32130a;
        int i12 = this.f32131b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f32132c;
        switch (i11) {
            case 0:
                final ga gaVar = (ga) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                ra raVar = gaVar.f33049a;
                long j3 = raVar.f36280x;
                if (j3 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = MessagesController.getInstance(ra.b0(raVar)).getInputUser(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = raVar.getConnectionsManager();
                final int i13 = this.f32131b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.kj(ga.this, str, tLObject, i13, z11, tL_error, tL_username, z10));
                    }
                });
                raVar.f36279w.add(tL_username.username);
                ((oa) view).setLoading(true);
                return;
            case 1:
            case 3:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 2:
                org.telegram.ui.Components.sr srVar = (org.telegram.ui.Components.sr) obj3;
                bi.d dVar = (bi.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new org.telegram.ui.Components.nr(srVar, dVar, 1));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.iv0 iv0Var = (org.telegram.ui.Components.iv0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(iv0Var.getContext(), 3, (org.telegram.ui.ActionBar.f6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f17221id = poll.f17221id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f32131b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(iv0Var.f24106j1);
                tL_messages_editMessage.f17278id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lr0(d2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new di.c5(iv0Var, d2VarArr, i14, tL_messages_editMessage, 4)), 1), 500L);
                return;
        }
    }

    @Override
    public ev0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        ArrayList arrayList = (ArrayList) this.f32132c;
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
                    if (str != null && str.equals(oVar.f4331c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f4319b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f4320c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new sg.n(chat, this.f32131b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z10) {
        boolean z11;
        int i10;
        wy wyVar = (wy) this.f32132c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = wyVar.Y3();
        int i11 = this.f32131b;
        if (Y3 != null) {
            if (i11 == 102) {
                i10 = 27;
            } else {
                i10 = 26;
            }
            Y3.n(arrayList2, i10, null, null, new hw(wyVar, i11, arrayList2, z10, hashSet), null);
        }
        if (i11 == 103) {
            z11 = true;
        } else {
            z11 = false;
        }
        wyVar.b4(z11);
    }

    @Override
    public boolean t() {
        return false;
    }

    public ea(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f32130a = i11;
        this.f32132c = obj;
        this.f32131b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public ea(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f32130a = i11;
        this.f32132c = obj;
        this.d = obj2;
        this.f32131b = i10;
        this.e = obj3;
    }

    public ea(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f32130a = i11;
        this.f32132c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f32131b = i10;
    }

    @Override
    public void C(float f7) {
    }

    @Override
    public void P() {
    }

    @Override
    public void K(boolean z10, boolean z11) {
    }
}
