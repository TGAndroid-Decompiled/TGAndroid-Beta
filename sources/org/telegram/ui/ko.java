package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ko implements RequestDelegate {

    public final int f39814a;

    public final xo f39815b;

    public ko(xo xoVar, int i10) {
        this.f39814a = i10;
        this.f39815b = xoVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39814a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new mo(this.f39815b, 3));
                }
                break;
            case 1:
                final int i10 = 0;
                final xo xoVar = this.f39815b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                xo xoVar2 = xoVar;
                                if (z10) {
                                    for (int i11 = 0; i11 < xoVar2.T.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = xoVar2.T.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                xoVar2.f44568p0 = false;
                                AndroidUtilities.runOnUIThread(new mo(xoVar2, 4));
                                break;
                            default:
                                xo xoVar3 = xoVar;
                                ArrayList arrayList = xoVar3.f44551b0;
                                xoVar3.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && xoVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        xoVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(xoVar3.getParentActivity(), new oo(xoVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        xoVar3.f44572x.addView(nVar, h7.z5.n(-1, 72));
                                    }
                                    xoVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final xo xoVar2 = this.f39815b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                xo xoVar3 = xoVar2;
                                if (z10) {
                                    for (int i12 = 0; i12 < xoVar3.T.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = xoVar3.T.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                xoVar3.f44568p0 = false;
                                AndroidUtilities.runOnUIThread(new mo(xoVar3, 4));
                                break;
                            default:
                                xo xoVar4 = xoVar2;
                                ArrayList arrayList = xoVar4.f44551b0;
                                xoVar4.Z = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && xoVar4.getParentActivity() != null) {
                                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                        xoVar4.h.removeView((View) arrayList.get(i13));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i14 = 0; i14 < tL_messages_chats.chats.size(); i14++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(xoVar4.getParentActivity(), new oo(xoVar4, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i14);
                                        boolean z11 = true;
                                        if (i14 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        xoVar4.f44572x.addView(nVar, h7.z5.n(-1, 72));
                                    }
                                    xoVar4.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new rd(22, this.f39815b, tL_error));
                break;
        }
    }
}
