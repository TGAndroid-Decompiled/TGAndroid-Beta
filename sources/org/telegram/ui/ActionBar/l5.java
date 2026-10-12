package org.telegram.ui.ActionBar;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.v10;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.zc;
import org.telegram.ui.h10;
public final class l5 implements Runnable {
    public final int f21131a;
    public final Object f21132b;
    public final Object f21133c;
    public final Object d;
    public final Object f21134e;

    public l5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21131a = i10;
        this.f21132b = obj;
        this.f21133c = obj2;
        this.d = obj3;
        this.f21134e = obj4;
    }

    private final void a() {
        wz wzVar = (wz) this.f21133c;
        TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
        TLObject tLObject = (TLObject) this.f21132b;
        Runnable runnable = (Runnable) this.f21134e;
        ArrayList arrayList = wzVar.f32589s;
        yz yzVar = wzVar.f32590w;
        if (yzVar.M != wzVar.f32583b) {
            return;
        }
        yzVar.L = 0;
        if (tL_messages_getStickers.emoticon.equals(wzVar.f32582a)) {
            if (!(tLObject instanceof TLRPC.TL_messages_stickers)) {
                runnable.run();
                return;
            }
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            int size = arrayList.size();
            int size2 = tL_messages_stickers.stickers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                if (wzVar.v.indexOfKey(document.f19808id) < 0) {
                    arrayList.add(document);
                }
            }
            if (size != arrayList.size()) {
                wzVar.f32586f.put(arrayList, yzVar.N);
                if (size == 0) {
                    wzVar.h.add(arrayList);
                }
            }
        }
        runnable.run();
    }

    private final void b() {
        v10 v10Var = (v10) this.f21133c;
        TLObject tLObject = (TLObject) this.f21132b;
        Utilities.Callback callback = (Utilities.Callback) this.f21134e;
        int i10 = -1;
        v10Var.f31348z0 = -1;
        m2 m2Var = v10Var.f25297n;
        h10.r0((TLRPC.TL_error) this.d, m2Var, zc.a0(m2Var));
        int i11 = 0;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList<TLRPC.Update> arrayList = updates.updates;
                if (arrayList.isEmpty()) {
                    TLRPC.Update update = updates.update;
                    if (update instanceof TL_update.TL_updateDialogFilter) {
                        i10 = ((TL_update.TL_updateDialogFilter) update).f20059id;
                    }
                } else {
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        } else if (arrayList.get(i11) instanceof TL_update.TL_updateDialogFilter) {
                            i10 = ((TL_update.TL_updateDialogFilter) arrayList.get(i11)).f20059id;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (v10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                m2Var.getMessagesController().loadRemoteFilters(true, new ei.q4(v10Var, callback, i10, 3));
                return;
            }
            if (v10Var.f31324a0 != null) {
                m2Var.getMessagesController().checkChatlistFolderUpdate(v10Var.Y, true);
            }
            v10Var.A0 = true;
            v10Var.dismiss();
            callback.run(Integer.valueOf(i10));
            return;
        }
        v10Var.f31335l0.a(false);
    }

    private final void c() {
        ba0 ba0Var = (ba0) this.f21133c;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f21134e;
        TLObject tLObject = (TLObject) this.f21132b;
        ba0Var.f24602y = false;
        ba0Var.K = tL_chatInviteExported.link;
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteExported.importers == null) {
                tL_chatInviteExported.importers = new ArrayList<>(3);
            }
            tL_chatInviteExported.importers.clear();
            for (int i10 = 0; i10 < tL_messages_chatInviteImporters.users.size(); i10++) {
                tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
            }
            ba0Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
        }
    }

    private final void e() {
        hb0 hb0Var = (hb0) this.f21132b;
        ArrayList arrayList = (ArrayList) this.d;
        boolean[] zArr = (boolean[]) this.f21134e;
        ((boolean[]) this.f21133c)[0] = true;
        AndroidUtilities.cancelRunOnUIThread(hb0Var.U);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((TL_stories.StoryItem) arrayList.get(i10)).pinned = zArr[i10];
        }
        hb0Var.getMessagesController().getStoriesController().n0(hb0Var.f26737e, arrayList, false);
    }

    private final void f() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f21132b;
        ci.d dVar = (ci.d) this.f21133c;
        e3 e3Var = (e3) this.d;
        Runnable runnable = (Runnable) this.f21134e;
        if (tL_error != null) {
            zc.X().f0(tL_error, false);
            return;
        }
        dVar.setLoading(false);
        e3Var.dismiss();
        zc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
        runnable.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l5.run():void");
    }

    public l5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f21131a = i10;
        this.f21133c = obj;
        this.d = obj2;
        this.f21132b = tLObject;
        this.f21134e = obj3;
    }

    public l5(m2 m2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.f21131a = i10;
        this.f21133c = m2Var;
        this.f21132b = tLObject;
        this.d = tLObject2;
        this.f21134e = obj;
    }

    public l5(ba0 ba0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f21131a = 26;
        this.f21133c = ba0Var;
        this.d = tL_chatInviteExported;
        this.f21134e = tL_error;
        this.f21132b = tLObject;
    }
}
