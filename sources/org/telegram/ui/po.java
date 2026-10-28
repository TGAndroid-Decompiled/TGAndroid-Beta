package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class po implements RequestDelegate {
    public final int f42462a;
    public final cp f42463b;

    public po(cp cpVar, int i10) {
        this.f42462a = i10;
        this.f42463b = cpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42462a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ro(this.f42463b, 3));
                    return;
                }
                return;
            case 1:
                final cp cpVar = this.f42463b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                cp cpVar2 = cpVar;
                                ArrayList arrayList = cpVar2.f38410f0;
                                cpVar2.f38407d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && cpVar2.getParentActivity() != null) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        cpVar2.f38417n.removeView((View) arrayList.get(i10));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(cpVar2.getParentActivity(), new to(cpVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z10 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        cpVar2.f38427x.addView(nVar, org.telegram.ui.Components.kb1.r(-1, 72));
                                    }
                                    cpVar2.d0();
                                    return;
                                }
                                return;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                cp cpVar3 = cpVar;
                                if (z11) {
                                    for (int i12 = 0; i12 < cpVar3.X.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = cpVar3.X.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                cpVar3.f38425s0 = false;
                                AndroidUtilities.runOnUIThread(new ro(cpVar3, 4));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final cp cpVar2 = this.f42463b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                cp cpVar22 = cpVar2;
                                ArrayList arrayList = cpVar22.f38410f0;
                                cpVar22.f38407d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && cpVar22.getParentActivity() != null) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        cpVar22.f38417n.removeView((View) arrayList.get(i10));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(cpVar22.getParentActivity(), new to(cpVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z10 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        cpVar22.f38427x.addView(nVar, org.telegram.ui.Components.kb1.r(-1, 72));
                                    }
                                    cpVar22.d0();
                                    return;
                                }
                                return;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                cp cpVar3 = cpVar2;
                                if (z11) {
                                    for (int i12 = 0; i12 < cpVar3.X.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = cpVar3.X.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                cpVar3.f38425s0 = false;
                                AndroidUtilities.runOnUIThread(new ro(cpVar3, 4));
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new ed(24, this.f42463b, tL_error));
                return;
        }
    }
}
