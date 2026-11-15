package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z6 implements RequestDelegate {
    public final int f42256a = 1;
    public final boolean f42257b;
    public final boolean f42258c;
    public final long d;
    public final KeyEvent.Callback f42259e;
    public final Object f42260f;
    public final Object f42261g;
    public final Object h;

    public z6(y7 y7Var, boolean z10, org.telegram.messenger.gj gjVar, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.f42259e = y7Var;
        this.f42257b = z10;
        this.f42260f = gjVar;
        this.f42258c = z11;
        this.f42261g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42256a) {
            case 0:
                final y7 y7Var = (y7) this.f42259e;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f42260f;
                final Runnable runnable = (Runnable) this.f42261g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z10 = this.f42258c;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text)) {
                    if (!this.f42257b && gjVar.e1() >= 0) {
                        if (org.telegram.messenger.gj.B0(gjVar.f23817k) >= 0) {
                            final int e12 = gjVar.e1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.f28147id.add(Integer.valueOf(e12));
                            ConnectionsManager.getInstance(y7Var.f29679a).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (r5) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final y7 y7Var2 = y7Var;
                                            if (z11) {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i7).f28072id == e12) {
                                                            message = messages_messages.messages.get(i7);
                                                        } else {
                                                            i7++;
                                                        }
                                                    } else {
                                                        message = null;
                                                    }
                                                }
                                                if (message != null) {
                                                    y7Var2.R0(new org.telegram.messenger.gj(y7Var2.f29679a, message, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i10 = r2;
                                                            y7 y7Var3 = y7Var2;
                                                            switch (i10) {
                                                                case 0:
                                                                    new cc((FrameLayout) y7Var3.f29682b, y7Var3.J0).t(org.telegram.messenger.hd.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new cc((FrameLayout) y7Var3.f29682b, y7Var3.J0).t(org.telegram.messenger.hd.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.h3(new a7(y7Var2, tL_error2, 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final y7 y7Var3 = y7Var;
                                            if (z12) {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < messages_messages2.messages.size()) {
                                                        if (messages_messages2.messages.get(i10).f28072id == e12) {
                                                            message2 = messages_messages2.messages.get(i10);
                                                        } else {
                                                            i10++;
                                                        }
                                                    } else {
                                                        message2 = null;
                                                    }
                                                }
                                                if (message2 != null) {
                                                    y7Var3.R0(new org.telegram.messenger.gj(y7Var3.f29679a, message2, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i102 = r2;
                                                            y7 y7Var32 = y7Var3;
                                                            switch (i102) {
                                                                case 0:
                                                                    new cc((FrameLayout) y7Var32.f29682b, y7Var32.J0).t(org.telegram.messenger.hd.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new cc((FrameLayout) y7Var32.f29682b, y7Var32.J0).t(org.telegram.messenger.hd.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.h3(new a7(y7Var3, tL_error2, 2));
                                                return;
                                            } else {
                                                return;
                                            }
                                    }
                                }
                            });
                            return;
                        }
                        final int e13 = gjVar.e1();
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages.channel = org.telegram.messenger.np.s1(y7Var.f29679a).h1(-org.telegram.messenger.gj.B0(gjVar.f23817k));
                        tL_channels_getMessages.f28089id.add(Integer.valueOf(e13));
                        ConnectionsManager.getInstance(y7Var.f29679a).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                TLRPC.Message message;
                                TLRPC.Message message2;
                                switch (r5) {
                                    case 0:
                                        boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final y7 y7Var2 = y7Var;
                                        if (z11) {
                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 < messages_messages.messages.size()) {
                                                    if (messages_messages.messages.get(i7).f28072id == e13) {
                                                        message = messages_messages.messages.get(i7);
                                                    } else {
                                                        i7++;
                                                    }
                                                } else {
                                                    message = null;
                                                }
                                            }
                                            if (message != null) {
                                                y7Var2.R0(new org.telegram.messenger.gj(y7Var2.f29679a, message, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        y7 y7Var32 = y7Var2;
                                                        switch (i102) {
                                                            case 0:
                                                                new cc((FrameLayout) y7Var32.f29682b, y7Var32.J0).t(org.telegram.messenger.hd.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new cc((FrameLayout) y7Var32.f29682b, y7Var32.J0).t(org.telegram.messenger.hd.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.h3(new a7(y7Var2, tL_error2, 3));
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final y7 y7Var3 = y7Var;
                                        if (z12) {
                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 < messages_messages2.messages.size()) {
                                                    if (messages_messages2.messages.get(i10).f28072id == e13) {
                                                        message2 = messages_messages2.messages.get(i10);
                                                    } else {
                                                        i10++;
                                                    }
                                                } else {
                                                    message2 = null;
                                                }
                                            }
                                            if (message2 != null) {
                                                y7Var3.R0(new org.telegram.messenger.gj(y7Var3.f29679a, message2, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        y7 y7Var32 = y7Var3;
                                                        switch (i102) {
                                                            case 0:
                                                                new cc((FrameLayout) y7Var32.f29682b, y7Var32.J0).t(org.telegram.messenger.hd.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new cc((FrameLayout) y7Var32.f29682b, y7Var32.J0).t(org.telegram.messenger.hd.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.h3(new a7(y7Var3, tL_error2, 2));
                                            return;
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    org.telegram.messenger.g0.h3(new a7(y7Var, tL_error, 0));
                    return;
                }
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new a7(y7Var, tL_error, 1));
                }
                org.telegram.messenger.g0.h3(new i2(y7Var, this.d, z10, document, runnable));
                return;
            default:
                final cf0 cf0Var = (cf0) this.f42259e;
                final org.telegram.messenger.np npVar = (org.telegram.messenger.np) this.f42260f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f42261g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z11 = this.f42257b;
                final boolean z12 = this.f42258c;
                final long j3 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bf0.run():void");
                    }
                });
                return;
        }
    }

    public z6(cf0 cf0Var, org.telegram.messenger.np npVar, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.f42259e = cf0Var;
        this.f42260f = npVar;
        this.f42257b = z10;
        this.f42261g = tL_channels_searchPosts;
        this.f42258c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
