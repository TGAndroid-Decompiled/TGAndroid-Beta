package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class io implements RequestDelegate {
    public final int f39223a;
    public final vo f39224b;

    public io(vo voVar, int i9) {
        this.f39223a = i9;
        this.f39224b = voVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39223a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ko(this.f39224b, 3));
                    return;
                }
                return;
            case 1:
                final vo voVar = this.f39224b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                vo voVar2 = voVar;
                                if (z10) {
                                    for (int i9 = 0; i9 < voVar2.T.usernames.size(); i9++) {
                                        TLRPC.TL_username tL_username = voVar2.T.usernames.get(i9);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                voVar2.f43544p0 = false;
                                AndroidUtilities.runOnUIThread(new ko(voVar2, 4));
                                return;
                            default:
                                vo voVar3 = voVar;
                                ArrayList arrayList = voVar3.f43527b0;
                                voVar3.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && voVar3.getParentActivity() != null) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        voVar3.h.removeView((View) arrayList.get(i10));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(voVar3.getParentActivity(), new mo(voVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z11 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        voVar3.f43548x.addView(nVar, g7.e6.n(-1, 72));
                                    }
                                    voVar3.a0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final vo voVar2 = this.f39224b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                vo voVar22 = voVar2;
                                if (z10) {
                                    for (int i9 = 0; i9 < voVar22.T.usernames.size(); i9++) {
                                        TLRPC.TL_username tL_username = voVar22.T.usernames.get(i9);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                voVar22.f43544p0 = false;
                                AndroidUtilities.runOnUIThread(new ko(voVar22, 4));
                                return;
                            default:
                                vo voVar3 = voVar2;
                                ArrayList arrayList = voVar3.f43527b0;
                                voVar3.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && voVar3.getParentActivity() != null) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        voVar3.h.removeView((View) arrayList.get(i10));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(voVar3.getParentActivity(), new mo(voVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z11 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        voVar3.f43548x.addView(nVar, g7.e6.n(-1, 72));
                                    }
                                    voVar3.a0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new rd(22, this.f39224b, tL_error));
                return;
        }
    }
}
