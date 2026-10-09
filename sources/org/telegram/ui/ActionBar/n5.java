package org.telegram.ui.ActionBar;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.x90;
import org.telegram.ui.f10;
import org.telegram.ui.sr;
public final class n5 implements Runnable {
    public final int f21435a;
    public final Object f21436b;
    public final Object f21437c;
    public final Object d;
    public final Object f21438e;

    public n5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21435a = i10;
        this.f21436b = obj;
        this.f21437c = obj2;
        this.d = obj3;
        this.f21438e = obj4;
    }

    private final void a() {
        tz tzVar = (tz) this.f21436b;
        TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.f21437c;
        TLObject tLObject = (TLObject) this.d;
        Runnable runnable = (Runnable) this.f21438e;
        ArrayList arrayList = tzVar.f31317s;
        vz vzVar = tzVar.f31318w;
        if (vzVar.M != tzVar.f31311b) {
            return;
        }
        vzVar.L = 0;
        if (tL_messages_getStickers.emoticon.equals(tzVar.f31310a)) {
            if (!(tLObject instanceof TLRPC.TL_messages_stickers)) {
                runnable.run();
                return;
            }
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            int size = arrayList.size();
            int size2 = tL_messages_stickers.stickers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                if (tzVar.v.indexOfKey(document.f20044id) < 0) {
                    arrayList.add(document);
                }
            }
            if (size != arrayList.size()) {
                tzVar.f31314f.put(arrayList, vzVar.N);
                if (size == 0) {
                    tzVar.h.add(arrayList);
                }
            }
        }
        runnable.run();
    }

    private final void b() {
        s10 s10Var = (s10) this.f21437c;
        TLObject tLObject = (TLObject) this.f21438e;
        Utilities.Callback callback = (Utilities.Callback) this.f21436b;
        int i10 = -1;
        s10Var.f30594z0 = -1;
        n2 n2Var = s10Var.f26025n;
        f10.r0((TLRPC.TL_error) this.d, n2Var, ad.a0(n2Var));
        int i11 = 0;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList<TLRPC.Update> arrayList = updates.updates;
                if (arrayList.isEmpty()) {
                    TLRPC.Update update = updates.update;
                    if (update instanceof TL_update.TL_updateDialogFilter) {
                        i10 = ((TL_update.TL_updateDialogFilter) update).f20293id;
                    }
                } else {
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        } else if (arrayList.get(i11) instanceof TL_update.TL_updateDialogFilter) {
                            i10 = ((TL_update.TL_updateDialogFilter) arrayList.get(i11)).f20293id;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (s10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                n2Var.getMessagesController().loadRemoteFilters(true, new ei.q4(s10Var, callback, i10, 3));
                return;
            }
            if (s10Var.f30570a0 != null) {
                n2Var.getMessagesController().checkChatlistFolderUpdate(s10Var.Y, true);
            }
            s10Var.A0 = true;
            s10Var.dismiss();
            callback.run(Integer.valueOf(i10));
            return;
        }
        s10Var.f30581l0.a(false);
    }

    private final void c() {
        i40.O((i40) this.f21436b, (TLRPC.TL_error) this.f21437c, (TLObject) this.d, (TLRPC.TL_channels_getParticipants) this.f21438e);
    }

    private final void e() {
        i90.p((i90) this.f21436b, (TLRPC.TL_error) this.f21437c, (TLRPC.Updates) this.d, (TLRPC.TL_messages_importChatInvite) this.f21438e);
    }

    private final void f() {
        x90 x90Var = (x90) this.f21436b;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.f21437c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f21438e;
        x90Var.f32790y = false;
        x90Var.K = tL_chatInviteExported.link;
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteExported.importers == null) {
                tL_chatInviteExported.importers = new ArrayList<>(3);
            }
            tL_chatInviteExported.importers.clear();
            for (int i10 = 0; i10 < tL_messages_chatInviteImporters.users.size(); i10++) {
                tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
            }
            x90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
        }
    }

    private final void g() {
        db0 db0Var = (db0) this.f21436b;
        ArrayList arrayList = (ArrayList) this.d;
        boolean[] zArr = (boolean[]) this.f21438e;
        ((boolean[]) this.f21437c)[0] = true;
        AndroidUtilities.cancelRunOnUIThread(db0Var.U);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((TL_stories.StoryItem) arrayList.get(i10)).pinned = zArr[i10];
        }
        db0Var.getMessagesController().getStoriesController().n0(db0Var.f25680e, arrayList, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.n5.run():void");
    }

    public n5(sr srVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f21435a = 15;
        this.f21436b = srVar;
        this.d = str;
        this.f21437c = arrayList;
        this.f21438e = arrayList2;
    }

    public n5(s10 s10Var, TLRPC.TL_error tL_error, TLObject tLObject, Utilities.Callback callback) {
        this.f21435a = 23;
        this.f21437c = s10Var;
        this.d = tL_error;
        this.f21438e = tLObject;
        this.f21436b = callback;
    }

    public n5(int[] iArr, int[] iArr2, String[] strArr, TextView textView) {
        this.f21435a = 18;
        this.f21436b = iArr;
        this.f21437c = iArr2;
        this.f21438e = strArr;
        this.d = textView;
    }
}
