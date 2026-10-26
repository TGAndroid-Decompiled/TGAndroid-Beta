package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class no implements RequestDelegate {
    public final int f41959a;
    public final ap f41960b;

    public no(ap apVar, int i10) {
        this.f41959a = i10;
        this.f41960b = apVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41959a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new po(this.f41960b, 3));
                    return;
                }
                return;
            case 1:
                final ap apVar = this.f41960b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ap apVar2 = apVar;
                                ArrayList arrayList = apVar2.f37853f0;
                                apVar2.f37850d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && apVar2.getParentActivity() != null) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        apVar2.f37860n.removeView((View) arrayList.get(i10));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(apVar2.getParentActivity(), new ro(apVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z10 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        apVar2.f37870x.addView(nVar, org.telegram.ui.Components.gb1.r(-1, 72));
                                    }
                                    apVar2.d0();
                                    return;
                                }
                                return;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                ap apVar3 = apVar;
                                if (z11) {
                                    for (int i12 = 0; i12 < apVar3.X.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = apVar3.X.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                apVar3.f37868s0 = false;
                                AndroidUtilities.runOnUIThread(new po(apVar3, 4));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final ap apVar2 = this.f41960b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ap apVar22 = apVar2;
                                ArrayList arrayList = apVar22.f37853f0;
                                apVar22.f37850d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && apVar22.getParentActivity() != null) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        apVar22.f37860n.removeView((View) arrayList.get(i10));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(apVar22.getParentActivity(), new ro(apVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z10 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        apVar22.f37870x.addView(nVar, org.telegram.ui.Components.gb1.r(-1, 72));
                                    }
                                    apVar22.d0();
                                    return;
                                }
                                return;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                ap apVar3 = apVar2;
                                if (z11) {
                                    for (int i12 = 0; i12 < apVar3.X.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = apVar3.X.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                apVar3.f37868s0 = false;
                                AndroidUtilities.runOnUIThread(new po(apVar3, 4));
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new ed(24, this.f41960b, tL_error));
                return;
        }
    }
}
