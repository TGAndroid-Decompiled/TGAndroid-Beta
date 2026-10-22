package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jo implements RequestDelegate {
    public final int f38290a;
    public final wo f38291b;

    public jo(wo woVar, int i10) {
        this.f38290a = i10;
        this.f38291b = woVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38290a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new lo(this.f38291b, 3));
                    return;
                }
                return;
            case 1:
                final wo woVar = this.f38291b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                wo woVar2 = woVar;
                                if (z10) {
                                    for (int i10 = 0; i10 < woVar2.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = woVar2.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                woVar2.f42934t0 = false;
                                AndroidUtilities.runOnUIThread(new lo(woVar2, 4));
                                return;
                            default:
                                wo woVar3 = woVar;
                                ArrayList arrayList = woVar3.f42918f0;
                                woVar3.f42915d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && woVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        woVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(woVar3.getParentActivity(), new no(woVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        woVar3.f42936x.addView(nVar, w7.z5.n(-1, 72));
                                    }
                                    woVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final wo woVar2 = this.f38291b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                wo woVar22 = woVar2;
                                if (z10) {
                                    for (int i10 = 0; i10 < woVar22.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = woVar22.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                woVar22.f42934t0 = false;
                                AndroidUtilities.runOnUIThread(new lo(woVar22, 4));
                                return;
                            default:
                                wo woVar3 = woVar2;
                                ArrayList arrayList = woVar3.f42918f0;
                                woVar3.f42915d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && woVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        woVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(woVar3.getParentActivity(), new no(woVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        woVar3.f42936x.addView(nVar, w7.z5.n(-1, 72));
                                    }
                                    woVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new eh(13, this.f38291b, tL_error));
                return;
        }
    }
}
