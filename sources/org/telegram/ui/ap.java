package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ap implements RequestDelegate {
    public final int f34003a;
    public final np f34004b;

    public ap(np npVar, int i10) {
        this.f34003a = i10;
        this.f34004b = npVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34003a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new cp(this.f34004b, 3));
                    return;
                }
                return;
            case 1:
                final np npVar = this.f34004b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                np npVar2 = npVar;
                                if (z10) {
                                    for (int i10 = 0; i10 < npVar2.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = npVar2.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                npVar2.f38457t0 = false;
                                AndroidUtilities.runOnUIThread(new cp(npVar2, 4));
                                return;
                            default:
                                np npVar3 = npVar;
                                ArrayList arrayList = npVar3.f38441f0;
                                npVar3.f38438d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && npVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        npVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(npVar3.getParentActivity(), new ep(npVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        npVar3.f38459x.addView(nVar, w7.z5.n(-1, 72));
                                    }
                                    npVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final np npVar2 = this.f34004b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                np npVar22 = npVar2;
                                if (z10) {
                                    for (int i10 = 0; i10 < npVar22.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = npVar22.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                npVar22.f38457t0 = false;
                                AndroidUtilities.runOnUIThread(new cp(npVar22, 4));
                                return;
                            default:
                                np npVar3 = npVar2;
                                ArrayList arrayList = npVar3.f38441f0;
                                npVar3.f38438d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && npVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        npVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(npVar3.getParentActivity(), new ep(npVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        npVar3.f38459x.addView(nVar, w7.z5.n(-1, 72));
                                    }
                                    npVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new jd(24, this.f34004b, tL_error));
                return;
        }
    }
}
