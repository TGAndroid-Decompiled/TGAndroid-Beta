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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.t10;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.y90;
import org.telegram.ui.e10;
public final class l5 implements Runnable {
    public final int f21357a;
    public final Object f21358b;
    public final Object f21359c;
    public final Object d;
    public final Object f21360e;

    public l5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21357a = i10;
        this.f21358b = obj;
        this.f21359c = obj2;
        this.d = obj3;
        this.f21360e = obj4;
    }

    private final void a() {
        uz uzVar = (uz) this.f21359c;
        TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
        TLObject tLObject = (TLObject) this.f21358b;
        Runnable runnable = (Runnable) this.f21360e;
        ArrayList arrayList = uzVar.f31618s;
        wz wzVar = uzVar.f31619w;
        if (wzVar.M != uzVar.f31612b) {
            return;
        }
        wzVar.L = 0;
        if (tL_messages_getStickers.emoticon.equals(uzVar.f31611a)) {
            if (!(tLObject instanceof TLRPC.TL_messages_stickers)) {
                runnable.run();
                return;
            }
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            int size = arrayList.size();
            int size2 = tL_messages_stickers.stickers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                if (uzVar.v.indexOfKey(document.f20038id) < 0) {
                    arrayList.add(document);
                }
            }
            if (size != arrayList.size()) {
                uzVar.f31615f.put(arrayList, wzVar.N);
                if (size == 0) {
                    uzVar.h.add(arrayList);
                }
            }
        }
        runnable.run();
    }

    private final void b() {
        t10 t10Var = (t10) this.f21359c;
        TLObject tLObject = (TLObject) this.f21358b;
        Utilities.Callback callback = (Utilities.Callback) this.f21360e;
        int i10 = -1;
        t10Var.f30954z0 = -1;
        m2 m2Var = t10Var.f25523n;
        e10.r0((TLRPC.TL_error) this.d, m2Var, ad.a0(m2Var));
        int i11 = 0;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList<TLRPC.Update> arrayList = updates.updates;
                if (arrayList.isEmpty()) {
                    TLRPC.Update update = updates.update;
                    if (update instanceof TL_update.TL_updateDialogFilter) {
                        i10 = ((TL_update.TL_updateDialogFilter) update).f20287id;
                    }
                } else {
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        } else if (arrayList.get(i11) instanceof TL_update.TL_updateDialogFilter) {
                            i10 = ((TL_update.TL_updateDialogFilter) arrayList.get(i11)).f20287id;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (t10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                m2Var.getMessagesController().loadRemoteFilters(true, new ei.q4(t10Var, callback, i10, 3));
                return;
            }
            if (t10Var.f30930a0 != null) {
                m2Var.getMessagesController().checkChatlistFolderUpdate(t10Var.Y, true);
            }
            t10Var.A0 = true;
            t10Var.dismiss();
            callback.run(Integer.valueOf(i10));
            return;
        }
        t10Var.f30941l0.a(false);
    }

    private final void c() {
        y90 y90Var = (y90) this.f21359c;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f21360e;
        TLObject tLObject = (TLObject) this.f21358b;
        y90Var.f33151y = false;
        y90Var.K = tL_chatInviteExported.link;
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteExported.importers == null) {
                tL_chatInviteExported.importers = new ArrayList<>(3);
            }
            tL_chatInviteExported.importers.clear();
            for (int i10 = 0; i10 < tL_messages_chatInviteImporters.users.size(); i10++) {
                tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
            }
            y90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
        }
    }

    private final void e() {
        eb0 eb0Var = (eb0) this.f21358b;
        ArrayList arrayList = (ArrayList) this.d;
        boolean[] zArr = (boolean[]) this.f21360e;
        ((boolean[]) this.f21359c)[0] = true;
        AndroidUtilities.cancelRunOnUIThread(eb0Var.U);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((TL_stories.StoryItem) arrayList.get(i10)).pinned = zArr[i10];
        }
        eb0Var.getMessagesController().getStoriesController().n0(eb0Var.f25960e, arrayList, false);
    }

    private final void f() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f21358b;
        ci.d dVar = (ci.d) this.f21359c;
        e3 e3Var = (e3) this.d;
        Runnable runnable = (Runnable) this.f21360e;
        if (tL_error != null) {
            ad.X().f0(tL_error, false);
            return;
        }
        dVar.setLoading(false);
        e3Var.dismiss();
        ad.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
        runnable.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l5.run():void");
    }

    public l5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f21357a = i10;
        this.f21359c = obj;
        this.d = obj2;
        this.f21358b = tLObject;
        this.f21360e = obj3;
    }

    public l5(m2 m2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.f21357a = i10;
        this.f21359c = m2Var;
        this.f21358b = tLObject;
        this.d = tLObject2;
        this.f21360e = obj;
    }

    public l5(y90 y90Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f21357a = 26;
        this.f21359c = y90Var;
        this.d = tL_chatInviteExported;
        this.f21360e = tL_error;
        this.f21358b = tLObject;
    }
}
