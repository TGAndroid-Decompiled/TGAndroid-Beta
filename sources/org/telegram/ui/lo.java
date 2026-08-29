package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lo implements RequestDelegate {
    public final int f40248a;
    public final yo f40249b;

    public lo(yo yoVar, int i10) {
        this.f40248a = i10;
        this.f40249b = yoVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40248a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new no(this.f40249b, 3));
                    return;
                }
                return;
            case 1:
                final yo yoVar = this.f40249b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                yo yoVar2 = yoVar;
                                if (z10) {
                                    for (int i10 = 0; i10 < yoVar2.T.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = yoVar2.T.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                yoVar2.f44935p0 = false;
                                AndroidUtilities.runOnUIThread(new no(yoVar2, 4));
                                return;
                            default:
                                yo yoVar3 = yoVar;
                                ArrayList arrayList = yoVar3.f44918b0;
                                yoVar3.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && yoVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        yoVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(yoVar3.getParentActivity(), new po(yoVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        yoVar3.f44939x.addView(nVar, i7.f6.n(-1, 72));
                                    }
                                    yoVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final yo yoVar2 = this.f40249b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                yo yoVar22 = yoVar2;
                                if (z10) {
                                    for (int i10 = 0; i10 < yoVar22.T.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = yoVar22.T.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                yoVar22.f44935p0 = false;
                                AndroidUtilities.runOnUIThread(new no(yoVar22, 4));
                                return;
                            default:
                                yo yoVar3 = yoVar2;
                                ArrayList arrayList = yoVar3.f44918b0;
                                yoVar3.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && yoVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        yoVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(yoVar3.getParentActivity(), new po(yoVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        yoVar3.f44939x.addView(nVar, i7.f6.n(-1, 72));
                                    }
                                    yoVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new vf(19, this.f40249b, tL_error));
                return;
        }
    }
}
