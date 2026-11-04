package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mn implements RequestDelegate {
    public final int f47714a;
    public final bo f47715b;

    public mn(bo boVar, int i3) {
        this.f47714a = i3;
        this.f47715b = boVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47714a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new nn(this.f47715b, 3));
                    return;
                }
                return;
            case 1:
                final bo boVar = this.f47715b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                bo boVar2 = boVar;
                                ArrayList arrayList = boVar2.f44099g0;
                                boVar2.f44096e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && boVar2.getParentActivity() != null) {
                                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                        boVar2.f44105n.removeView((View) arrayList.get(i3));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i10 = 0; i10 < tL_messages_chats.chats.size(); i10++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(boVar2.getParentActivity(), new qn(boVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i10);
                                        boolean z10 = true;
                                        if (i10 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        boVar2.f44117y.addView(nVar, b8.mf.o(-1, 72));
                                    }
                                    boVar2.h0();
                                    return;
                                }
                                return;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                bo boVar3 = boVar;
                                if (z11) {
                                    for (int i11 = 0; i11 < boVar3.Y.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = boVar3.Y.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                boVar3.f44114t0 = false;
                                org.telegram.messenger.g0.h3(new nn(boVar3, 4));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final bo boVar2 = this.f47715b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                bo boVar22 = boVar2;
                                ArrayList arrayList = boVar22.f44099g0;
                                boVar22.f44096e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && boVar22.getParentActivity() != null) {
                                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                        boVar22.f44105n.removeView((View) arrayList.get(i3));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i10 = 0; i10 < tL_messages_chats.chats.size(); i10++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(boVar22.getParentActivity(), new qn(boVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i10);
                                        boolean z10 = true;
                                        if (i10 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        boVar22.f44117y.addView(nVar, b8.mf.o(-1, 72));
                                    }
                                    boVar22.h0();
                                    return;
                                }
                                return;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                bo boVar3 = boVar2;
                                if (z11) {
                                    for (int i11 = 0; i11 < boVar3.Y.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = boVar3.Y.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                boVar3.f44114t0 = false;
                                org.telegram.messenger.g0.h3(new nn(boVar3, 4));
                                return;
                        }
                    }
                });
                return;
            default:
                org.telegram.messenger.g0.h3(new sc(26, this.f47715b, tL_error));
                return;
        }
    }
}
