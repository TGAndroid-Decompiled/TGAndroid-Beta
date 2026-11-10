package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f31724a = 0;
    public final boolean f31725b;
    public final boolean f31726c;
    public final long d;
    public final KeyEvent.Callback f31727e;
    public final Object f31728f;
    public final Object f31729g;
    public final Object h;

    public a7(a8 a8Var, boolean z9, org.telegram.messenger.ij ijVar, boolean z10, Runnable runnable, long j3, TLRPC.Document document) {
        this.f31727e = a8Var;
        this.f31725b = z9;
        this.f31728f = ijVar;
        this.f31726c = z10;
        this.f31729g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f31724a) {
            case 0:
                final a8 a8Var = (a8) this.f31727e;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f31728f;
                final Runnable runnable = (Runnable) this.f31729g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z9 = this.f31726c;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text)) {
                    if (!this.f31725b && ijVar.e1() >= 0) {
                        if (org.telegram.messenger.ij.B0(ijVar.f23266k) >= 0) {
                            final int e12 = ijVar.e1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.f27056id.add(Integer.valueOf(e12));
                            ConnectionsManager.getInstance(a8Var.f28669a).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (r5) {
                                        case 0:
                                            boolean z10 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final a8 a8Var2 = a8Var;
                                            if (z10) {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i7).f26981id == e12) {
                                                            message = messages_messages.messages.get(i7);
                                                        } else {
                                                            i7++;
                                                        }
                                                    } else {
                                                        message = null;
                                                    }
                                                }
                                                if (message != null) {
                                                    a8Var2.R0(new org.telegram.messenger.ij(a8Var2.f28669a, message, false, true), z9, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i10 = r2;
                                                            a8 a8Var3 = a8Var2;
                                                            switch (i10) {
                                                                case 0:
                                                                    new gc((FrameLayout) a8Var3.f28672b, a8Var3.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new gc((FrameLayout) a8Var3.f28672b, a8Var3.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.h3(new b7(a8Var2, tL_error2, 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        default:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final a8 a8Var3 = a8Var;
                                            if (z11) {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < messages_messages2.messages.size()) {
                                                        if (messages_messages2.messages.get(i10).f26981id == e12) {
                                                            message2 = messages_messages2.messages.get(i10);
                                                        } else {
                                                            i10++;
                                                        }
                                                    } else {
                                                        message2 = null;
                                                    }
                                                }
                                                if (message2 != null) {
                                                    a8Var3.R0(new org.telegram.messenger.ij(a8Var3.f28669a, message2, false, true), z9, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i102 = r2;
                                                            a8 a8Var32 = a8Var3;
                                                            switch (i102) {
                                                                case 0:
                                                                    new gc((FrameLayout) a8Var32.f28672b, a8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new gc((FrameLayout) a8Var32.f28672b, a8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.h3(new b7(a8Var3, tL_error2, 2));
                                                return;
                                            } else {
                                                return;
                                            }
                                    }
                                }
                            });
                            return;
                        }
                        final int e13 = ijVar.e1();
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages.channel = org.telegram.messenger.qp.s1(a8Var.f28669a).h1(-org.telegram.messenger.ij.B0(ijVar.f23266k));
                        tL_channels_getMessages.f26998id.add(Integer.valueOf(e13));
                        ConnectionsManager.getInstance(a8Var.f28669a).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                TLRPC.Message message;
                                TLRPC.Message message2;
                                switch (r5) {
                                    case 0:
                                        boolean z10 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final a8 a8Var2 = a8Var;
                                        if (z10) {
                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 < messages_messages.messages.size()) {
                                                    if (messages_messages.messages.get(i7).f26981id == e13) {
                                                        message = messages_messages.messages.get(i7);
                                                    } else {
                                                        i7++;
                                                    }
                                                } else {
                                                    message = null;
                                                }
                                            }
                                            if (message != null) {
                                                a8Var2.R0(new org.telegram.messenger.ij(a8Var2.f28669a, message, false, true), z9, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        a8 a8Var32 = a8Var2;
                                                        switch (i102) {
                                                            case 0:
                                                                new gc((FrameLayout) a8Var32.f28672b, a8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new gc((FrameLayout) a8Var32.f28672b, a8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.h3(new b7(a8Var2, tL_error2, 3));
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final a8 a8Var3 = a8Var;
                                        if (z11) {
                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 < messages_messages2.messages.size()) {
                                                    if (messages_messages2.messages.get(i10).f26981id == e13) {
                                                        message2 = messages_messages2.messages.get(i10);
                                                    } else {
                                                        i10++;
                                                    }
                                                } else {
                                                    message2 = null;
                                                }
                                            }
                                            if (message2 != null) {
                                                a8Var3.R0(new org.telegram.messenger.ij(a8Var3.f28669a, message2, false, true), z9, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        a8 a8Var32 = a8Var3;
                                                        switch (i102) {
                                                            case 0:
                                                                new gc((FrameLayout) a8Var32.f28672b, a8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new gc((FrameLayout) a8Var32.f28672b, a8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.h3(new b7(a8Var3, tL_error2, 2));
                                            return;
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    org.telegram.messenger.g0.h3(new b7(a8Var, tL_error, 0));
                    return;
                }
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new b7(a8Var, tL_error, 1));
                }
                org.telegram.messenger.g0.h3(new i2(a8Var, this.d, z9, document, runnable));
                return;
            default:
                final ze0 ze0Var = (ze0) this.f31727e;
                final org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) this.f31728f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f31729g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f31725b;
                final boolean z11 = this.f31726c;
                final long j3 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ye0.run():void");
                    }
                });
                return;
        }
    }

    public a7(ze0 ze0Var, org.telegram.messenger.qp qpVar, boolean z9, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z10, long j3, ConnectionsManager connectionsManager) {
        this.f31727e = ze0Var;
        this.f31728f = qpVar;
        this.f31725b = z9;
        this.f31729g = tL_channels_searchPosts;
        this.f31726c = z10;
        this.d = j3;
        this.h = connectionsManager;
    }
}
