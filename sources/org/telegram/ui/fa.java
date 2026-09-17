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
public final class fa implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.k6, org.telegram.ui.Components.cl0, MessagesStorage.BooleanCallback, c5.p, org.telegram.ui.Components.voip.i3, BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.Components.t40 {
    public final int f33593a;
    public final int f33594b;
    public final Object f33595c;
    public final Object d;
    public final Object e;

    public fa(int i10, ej ejVar, org.telegram.ui.ActionBar.e5 e5Var, org.telegram.ui.Components.u40 u40Var) {
        this.f33593a = 10;
        this.f33594b = i10;
        this.f33595c = ejVar;
        this.d = e5Var;
        this.e = u40Var;
    }

    @Override
    public void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        final ej ejVar = (ej) this.f33595c;
        final org.telegram.ui.ActionBar.e5 e5Var = (org.telegram.ui.ActionBar.e5) this.d;
        final org.telegram.ui.Components.u40 u40Var = (org.telegram.ui.Components.u40) this.e;
        final int i10 = this.f33594b;
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
                ConnectionsManager.getInstance(i12).sendRequest(tL_photos_uploadProfilePhoto, new ya(i12, photoSize2, photoSize, ejVar, e5Var, 12));
                u40Var.j();
            }
        });
    }

    @Override
    public void a(c5.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new ai.cb(hVar, (org.telegram.ui.ActionBar.o2) this.f33595c, list, this.f33594b, (c5.f) this.d, (nx0) this.e, 11));
    }

    @Override
    public void b(CharSequence charSequence) {
        org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) this.f33595c;
        ArrayList arrayList = (ArrayList) this.d;
        StaticLayout h = m6Var.h(this.f33594b - ((int) Math.ceil(Math.min(m6Var.d, m6Var.h))), charSequence);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(m6Var, h, m6Var.d, arrayList.size());
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(m6Var, h, m6Var.h, arrayList.size());
        ((ArrayList) this.e).add(j6Var);
        arrayList.add(j6Var2);
        float f7 = m6Var.d;
        float f10 = j6Var.f25141f;
        m6Var.d = f7 + f10;
        m6Var.h += f10;
        m6Var.e = Math.max(m6Var.e, h.getHeight());
        m6Var.f26071i = Math.max(m6Var.f26071i, h.getHeight());
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        org.telegram.ui.Components.jn0 jn0Var = (org.telegram.ui.Components.jn0) this.f33595c;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
        ArrayList arrayList = jn0Var.f25360r;
        if (i10 >= 0 && i10 < arrayList.size()) {
            int i12 = this.f33594b;
            if (UserConfig.getInstance(i12).isPremium()) {
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new rg.x0(o2Var, 24, true).show();
                    return true;
                }
                org.telegram.ui.Components.hn0 hn0Var = ((org.telegram.ui.Components.in0) view).f24964a;
                if (hn0Var != null) {
                    hn0Var.q();
                }
                org.telegram.ui.Components.gn0 gn0Var = (org.telegram.ui.Components.gn0) arrayList.get(i10);
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(o2Var, view);
                H.f26366i = 3;
                int i13 = R.drawable.menu_tag_rename;
                if (TextUtils.isEmpty(gn0Var.f24351c)) {
                    i11 = R.string.SavedTagLabelTag;
                } else {
                    i11 = R.string.SavedTagRenameTag;
                }
                H.c(i13, LocaleController.getString(i11), new ai.c9(jn0Var, i12, gn0Var, f6Var, 21), false);
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
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        TL_bots.toggleUsername toggleusername;
        int i11 = this.f33593a;
        int i12 = this.f33594b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f33595c;
        switch (i11) {
            case 0:
                final ha haVar = (ha) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z10 = tL_username.active;
                final String str = tL_username.username;
                final boolean z11 = !z10;
                sa saVar = haVar.f34219a;
                long j3 = saVar.f37437x;
                if (j3 == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z11;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    toggleusername3.bot = MessagesController.getInstance(sa.b0(saVar)).getInputUser(j3);
                    toggleusername3.username = str;
                    toggleusername3.active = z11;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = saVar.getConnectionsManager();
                final int i13 = this.f33594b;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.cj(ha.this, str, tLObject, i13, z11, tL_error, tL_username, z10));
                    }
                });
                saVar.f37436w.add(tL_username.username);
                ((pa) view).setLoading(true);
                return;
            case 1:
            case 3:
            default:
                PasskeysActivity.V((PasskeysActivity) obj3, (TL_account.Passkey) obj2, (String) obj, i12);
                return;
            case 2:
                org.telegram.ui.Components.mr mrVar = (org.telegram.ui.Components.mr) obj3;
                ci.d dVar = (ci.d) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i12).sendRequest(getgroupcallstreamrtmpurl, new org.telegram.ui.Components.hr(mrVar, dVar, 1));
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.zu0 zu0Var = (org.telegram.ui.Components.zu0) obj3;
                MessageObject messageObject = (MessageObject) obj;
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(zu0Var.getContext(), 3, (org.telegram.ui.ActionBar.f6) obj2)};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                tL_poll.f18147id = poll.f18147id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i14 = this.f33594b;
                tL_messages_editMessage.peer = MessagesController.getInstance(i14).getInputPeer(zu0Var.f30631j1);
                tL_messages_editMessage.f18204id = messageObject.getId();
                tL_messages_editMessage.flags |= 16384;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cr0(c2VarArr, i14, ConnectionsManager.getInstance(i14).sendRequest(tL_messages_editMessage, new ai.za(zu0Var, c2VarArr, i14, tL_messages_editMessage, 5)), 1), 500L);
                return;
        }
    }

    @Override
    public fv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void h(org.telegram.ui.Components.voip.j3 j3Var) {
        ti1 ti1Var = (ti1) this.f33595c;
        org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) this.d;
        VoIPService voIPService = (VoIPService) this.e;
        if (VoIPService.getSharedInstance() != null) {
            AndroidUtilities.cancelRunOnUIThread(ti1Var.S0);
            ti1Var.R0 = false;
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ti1Var.f37759b, false, Integer.valueOf(this.f33594b));
            ti1Var.u(k3Var, voIPService);
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        ArrayList arrayList = (ArrayList) this.f33595c;
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
                    if (str != null && str.equals(oVar.f3917c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (a2.f3905b / Math.pow(10.0d, 6.0d)));
                        tL_premiumGiftCodeOption.currency = a2.f3906c;
                        break;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new tg.p(chat, this.f33594b, arrayList, callback, 1));
    }

    @Override
    public void run(boolean z10) {
        boolean z11;
        int i10;
        wy wyVar = (wy) this.f33595c;
        ArrayList arrayList = (ArrayList) this.d;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView Y3 = wyVar.Y3();
        int i11 = this.f33594b;
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

    public fa(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f33593a = i11;
        this.f33595c = obj;
        this.f33594b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public fa(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f33593a = i11;
        this.f33595c = obj;
        this.d = obj2;
        this.f33594b = i10;
        this.e = obj3;
    }

    public fa(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f33593a = i11;
        this.f33595c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f33594b = i10;
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
