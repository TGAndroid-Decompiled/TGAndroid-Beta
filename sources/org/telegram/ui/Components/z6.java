package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z6 implements RequestDelegate {
    public final int f40920a = 1;
    public final boolean f40921b;
    public final boolean f40922c;
    public final long d;
    public final KeyEvent.Callback f40923e;
    public final Object f40924f;
    public final Object f40925g;
    public final Object h;

    public z6(z7 z7Var, boolean z10, org.telegram.messenger.zi ziVar, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.f40923e = z7Var;
        this.f40921b = z10;
        this.f40924f = ziVar;
        this.f40922c = z11;
        this.f40925g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40920a) {
            case 0:
                final z7 z7Var = (z7) this.f40923e;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.f40924f;
                final Runnable runnable = (Runnable) this.f40925g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z10 = this.f40922c;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text)) {
                    if (!this.f40921b && ziVar.f1() >= 0) {
                        if (org.telegram.messenger.zi.B0(ziVar.f26868k) >= 0) {
                            final int f12 = ziVar.f1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.f27097id.add(Integer.valueOf(f12));
                            ConnectionsManager.getInstance(z7Var.f28583a).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (r5) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final z7 z7Var2 = z7Var;
                                            if (z11) {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i3 = 0;
                                                while (true) {
                                                    if (i3 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i3).f27022id == f12) {
                                                            message = messages_messages.messages.get(i3);
                                                        } else {
                                                            i3++;
                                                        }
                                                    } else {
                                                        message = null;
                                                    }
                                                }
                                                if (message != null) {
                                                    z7Var2.R0(new org.telegram.messenger.zi(z7Var2.f28583a, message, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i10 = r2;
                                                            z7 z7Var3 = z7Var2;
                                                            switch (i10) {
                                                                case 0:
                                                                    new fc((FrameLayout) z7Var3.f28586b, z7Var3.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new fc((FrameLayout) z7Var3.f28586b, z7Var3.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.h3(new a7(z7Var2, tL_error2, 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final z7 z7Var3 = z7Var;
                                            if (z12) {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < messages_messages2.messages.size()) {
                                                        if (messages_messages2.messages.get(i10).f27022id == f12) {
                                                            message2 = messages_messages2.messages.get(i10);
                                                        } else {
                                                            i10++;
                                                        }
                                                    } else {
                                                        message2 = null;
                                                    }
                                                }
                                                if (message2 != null) {
                                                    z7Var3.R0(new org.telegram.messenger.zi(z7Var3.f28583a, message2, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i102 = r2;
                                                            z7 z7Var32 = z7Var3;
                                                            switch (i102) {
                                                                case 0:
                                                                    new fc((FrameLayout) z7Var32.f28586b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new fc((FrameLayout) z7Var32.f28586b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.h3(new a7(z7Var3, tL_error2, 2));
                                                return;
                                            } else {
                                                return;
                                            }
                                    }
                                }
                            });
                            return;
                        }
                        final int f13 = ziVar.f1();
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages.channel = org.telegram.messenger.hp.s1(z7Var.f28583a).h1(-org.telegram.messenger.zi.B0(ziVar.f26868k));
                        tL_channels_getMessages.f27039id.add(Integer.valueOf(f13));
                        ConnectionsManager.getInstance(z7Var.f28583a).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                TLRPC.Message message;
                                TLRPC.Message message2;
                                switch (r5) {
                                    case 0:
                                        boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final z7 z7Var2 = z7Var;
                                        if (z11) {
                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                            int i3 = 0;
                                            while (true) {
                                                if (i3 < messages_messages.messages.size()) {
                                                    if (messages_messages.messages.get(i3).f27022id == f13) {
                                                        message = messages_messages.messages.get(i3);
                                                    } else {
                                                        i3++;
                                                    }
                                                } else {
                                                    message = null;
                                                }
                                            }
                                            if (message != null) {
                                                z7Var2.R0(new org.telegram.messenger.zi(z7Var2.f28583a, message, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        z7 z7Var32 = z7Var2;
                                                        switch (i102) {
                                                            case 0:
                                                                new fc((FrameLayout) z7Var32.f28586b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new fc((FrameLayout) z7Var32.f28586b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.h3(new a7(z7Var2, tL_error2, 3));
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final z7 z7Var3 = z7Var;
                                        if (z12) {
                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 < messages_messages2.messages.size()) {
                                                    if (messages_messages2.messages.get(i10).f27022id == f13) {
                                                        message2 = messages_messages2.messages.get(i10);
                                                    } else {
                                                        i10++;
                                                    }
                                                } else {
                                                    message2 = null;
                                                }
                                            }
                                            if (message2 != null) {
                                                z7Var3.R0(new org.telegram.messenger.zi(z7Var3.f28583a, message2, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        z7 z7Var32 = z7Var3;
                                                        switch (i102) {
                                                            case 0:
                                                                new fc((FrameLayout) z7Var32.f28586b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new fc((FrameLayout) z7Var32.f28586b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.h3(new a7(z7Var3, tL_error2, 2));
                                            return;
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    org.telegram.messenger.g0.h3(new a7(z7Var, tL_error, 0));
                    return;
                }
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new a7(z7Var, tL_error, 1));
                }
                org.telegram.messenger.g0.h3(new h2(z7Var, this.d, z10, document, runnable));
                return;
            default:
                final bf0 bf0Var = (bf0) this.f40923e;
                final org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) this.f40924f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f40925g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z11 = this.f40921b;
                final boolean z12 = this.f40922c;
                final long j10 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.af0.run():void");
                    }
                });
                return;
        }
    }

    public z6(bf0 bf0Var, org.telegram.messenger.hp hpVar, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.f40923e = bf0Var;
        this.f40924f = hpVar;
        this.f40921b = z10;
        this.f40925g = tL_channels_searchPosts;
        this.f40922c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
