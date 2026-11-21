package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g7 implements RequestDelegate {
    public final int f35419a = 0;
    public final boolean f35420b;
    public final boolean f35421c;
    public final long d;
    public final KeyEvent.Callback f35422e;
    public final Object f35423f;
    public final Object f35424g;
    public final Object h;

    public g7(f8 f8Var, boolean z10, org.telegram.messenger.fj fjVar, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.f35422e = f8Var;
        this.f35420b = z10;
        this.f35423f = fjVar;
        this.f35421c = z11;
        this.f35424g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35419a) {
            case 0:
                final f8 f8Var = (f8) this.f35422e;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f35423f;
                final Runnable runnable = (Runnable) this.f35424g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z10 = this.f35421c;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text)) {
                    if (!this.f35420b && fjVar.e1() >= 0) {
                        if (org.telegram.messenger.fj.B0(fjVar.f23993k) >= 0) {
                            final int e12 = fjVar.e1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.f28527id.add(Integer.valueOf(e12));
                            ConnectionsManager.getInstance(f8Var.f30170a).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (r5) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final f8 f8Var2 = f8Var;
                                            if (z11) {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i7).f28452id == e12) {
                                                            message = messages_messages.messages.get(i7);
                                                        } else {
                                                            i7++;
                                                        }
                                                    } else {
                                                        message = null;
                                                    }
                                                }
                                                if (message != null) {
                                                    f8Var2.S0(new org.telegram.messenger.fj(f8Var2.f30170a, message, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i10 = r2;
                                                            f8 f8Var3 = f8Var2;
                                                            switch (i10) {
                                                                case 0:
                                                                    new lc((FrameLayout) f8Var3.f30173b, f8Var3.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743635, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new lc((FrameLayout) f8Var3.f30173b, f8Var3.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743635, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.g3(new h7(f8Var2, tL_error2, 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final f8 f8Var3 = f8Var;
                                            if (z12) {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < messages_messages2.messages.size()) {
                                                        if (messages_messages2.messages.get(i10).f28452id == e12) {
                                                            message2 = messages_messages2.messages.get(i10);
                                                        } else {
                                                            i10++;
                                                        }
                                                    } else {
                                                        message2 = null;
                                                    }
                                                }
                                                if (message2 != null) {
                                                    f8Var3.S0(new org.telegram.messenger.fj(f8Var3.f30170a, message2, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i102 = r2;
                                                            f8 f8Var32 = f8Var3;
                                                            switch (i102) {
                                                                case 0:
                                                                    new lc((FrameLayout) f8Var32.f30173b, f8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743635, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new lc((FrameLayout) f8Var32.f30173b, f8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743635, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.g3(new h7(f8Var3, tL_error2, 2));
                                                return;
                                            } else {
                                                return;
                                            }
                                    }
                                }
                            });
                            return;
                        }
                        final int e13 = fjVar.e1();
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages.channel = org.telegram.messenger.mp.u1(f8Var.f30170a).j1(-org.telegram.messenger.fj.B0(fjVar.f23993k));
                        tL_channels_getMessages.f28469id.add(Integer.valueOf(e13));
                        ConnectionsManager.getInstance(f8Var.f30170a).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                TLRPC.Message message;
                                TLRPC.Message message2;
                                switch (r5) {
                                    case 0:
                                        boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final f8 f8Var2 = f8Var;
                                        if (z11) {
                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 < messages_messages.messages.size()) {
                                                    if (messages_messages.messages.get(i7).f28452id == e13) {
                                                        message = messages_messages.messages.get(i7);
                                                    } else {
                                                        i7++;
                                                    }
                                                } else {
                                                    message = null;
                                                }
                                            }
                                            if (message != null) {
                                                f8Var2.S0(new org.telegram.messenger.fj(f8Var2.f30170a, message, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        f8 f8Var32 = f8Var2;
                                                        switch (i102) {
                                                            case 0:
                                                                new lc((FrameLayout) f8Var32.f30173b, f8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743635, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new lc((FrameLayout) f8Var32.f30173b, f8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743635, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.g3(new h7(f8Var2, tL_error2, 3));
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final f8 f8Var3 = f8Var;
                                        if (z12) {
                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 < messages_messages2.messages.size()) {
                                                    if (messages_messages2.messages.get(i10).f28452id == e13) {
                                                        message2 = messages_messages2.messages.get(i10);
                                                    } else {
                                                        i10++;
                                                    }
                                                } else {
                                                    message2 = null;
                                                }
                                            }
                                            if (message2 != null) {
                                                f8Var3.S0(new org.telegram.messenger.fj(f8Var3.f30170a, message2, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        f8 f8Var32 = f8Var3;
                                                        switch (i102) {
                                                            case 0:
                                                                new lc((FrameLayout) f8Var32.f30173b, f8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743635, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new lc((FrameLayout) f8Var32.f30173b, f8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743635, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.g3(new h7(f8Var3, tL_error2, 2));
                                            return;
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    org.telegram.messenger.g0.g3(new h7(f8Var, tL_error, 0));
                    return;
                }
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new h7(f8Var, tL_error, 1));
                }
                org.telegram.messenger.g0.g3(new s2(f8Var, this.d, z10, document, runnable));
                return;
            default:
                final of0 of0Var = (of0) this.f35422e;
                final org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) this.f35423f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f35424g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z11 = this.f35420b;
                final boolean z12 = this.f35421c;
                final long j3 = this.d;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nf0.run():void");
                    }
                });
                return;
        }
    }

    public g7(of0 of0Var, org.telegram.messenger.mp mpVar, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.f35422e = of0Var;
        this.f35423f = mpVar;
        this.f35420b = z10;
        this.f35424g = tL_channels_searchPosts;
        this.f35421c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
