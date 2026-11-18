package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f7 implements RequestDelegate {
    public final int f34982a = 0;
    public final boolean f34983b;
    public final boolean f34984c;
    public final long d;
    public final KeyEvent.Callback f34985e;
    public final Object f34986f;
    public final Object f34987g;
    public final Object h;

    public f7(g8 g8Var, boolean z10, org.telegram.messenger.fj fjVar, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.f34985e = g8Var;
        this.f34983b = z10;
        this.f34986f = fjVar;
        this.f34984c = z11;
        this.f34987g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f34982a) {
            case 0:
                final g8 g8Var = (g8) this.f34985e;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f34986f;
                final Runnable runnable = (Runnable) this.f34987g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z10 = this.f34984c;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text)) {
                    if (!this.f34983b && fjVar.e1() >= 0) {
                        if (org.telegram.messenger.fj.B0(fjVar.f23965k) >= 0) {
                            final int e12 = fjVar.e1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.f28499id.add(Integer.valueOf(e12));
                            ConnectionsManager.getInstance(g8Var.f30187a).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (r5) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final g8 g8Var2 = g8Var;
                                            if (z11) {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i7).f28424id == e12) {
                                                            message = messages_messages.messages.get(i7);
                                                        } else {
                                                            i7++;
                                                        }
                                                    } else {
                                                        message = null;
                                                    }
                                                }
                                                if (message != null) {
                                                    g8Var2.S0(new org.telegram.messenger.fj(g8Var2.f30187a, message, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i10 = r2;
                                                            g8 g8Var3 = g8Var2;
                                                            switch (i10) {
                                                                case 0:
                                                                    new lc((FrameLayout) g8Var3.f30190b, g8Var3.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743641, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new lc((FrameLayout) g8Var3.f30190b, g8Var3.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743641, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.g3(new g7(g8Var2, tL_error2, 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final g8 g8Var3 = g8Var;
                                            if (z12) {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < messages_messages2.messages.size()) {
                                                        if (messages_messages2.messages.get(i10).f28424id == e12) {
                                                            message2 = messages_messages2.messages.get(i10);
                                                        } else {
                                                            i10++;
                                                        }
                                                    } else {
                                                        message2 = null;
                                                    }
                                                }
                                                if (message2 != null) {
                                                    g8Var3.S0(new org.telegram.messenger.fj(g8Var3.f30187a, message2, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i102 = r2;
                                                            g8 g8Var32 = g8Var3;
                                                            switch (i102) {
                                                                case 0:
                                                                    new lc((FrameLayout) g8Var32.f30190b, g8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743641, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new lc((FrameLayout) g8Var32.f30190b, g8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743641, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.g3(new g7(g8Var3, tL_error2, 2));
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
                        tL_channels_getMessages.channel = org.telegram.messenger.mp.u1(g8Var.f30187a).j1(-org.telegram.messenger.fj.B0(fjVar.f23965k));
                        tL_channels_getMessages.f28441id.add(Integer.valueOf(e13));
                        ConnectionsManager.getInstance(g8Var.f30187a).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                TLRPC.Message message;
                                TLRPC.Message message2;
                                switch (r5) {
                                    case 0:
                                        boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final g8 g8Var2 = g8Var;
                                        if (z11) {
                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 < messages_messages.messages.size()) {
                                                    if (messages_messages.messages.get(i7).f28424id == e13) {
                                                        message = messages_messages.messages.get(i7);
                                                    } else {
                                                        i7++;
                                                    }
                                                } else {
                                                    message = null;
                                                }
                                            }
                                            if (message != null) {
                                                g8Var2.S0(new org.telegram.messenger.fj(g8Var2.f30187a, message, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        g8 g8Var32 = g8Var2;
                                                        switch (i102) {
                                                            case 0:
                                                                new lc((FrameLayout) g8Var32.f30190b, g8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743641, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new lc((FrameLayout) g8Var32.f30190b, g8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743641, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.g3(new g7(g8Var2, tL_error2, 3));
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final g8 g8Var3 = g8Var;
                                        if (z12) {
                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 < messages_messages2.messages.size()) {
                                                    if (messages_messages2.messages.get(i10).f28424id == e13) {
                                                        message2 = messages_messages2.messages.get(i10);
                                                    } else {
                                                        i10++;
                                                    }
                                                } else {
                                                    message2 = null;
                                                }
                                            }
                                            if (message2 != null) {
                                                g8Var3.S0(new org.telegram.messenger.fj(g8Var3.f30187a, message2, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        g8 g8Var32 = g8Var3;
                                                        switch (i102) {
                                                            case 0:
                                                                new lc((FrameLayout) g8Var32.f30190b, g8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743641, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new lc((FrameLayout) g8Var32.f30190b, g8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743641, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.g3(new g7(g8Var3, tL_error2, 2));
                                            return;
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    org.telegram.messenger.g0.g3(new g7(g8Var, tL_error, 0));
                    return;
                }
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new g7(g8Var, tL_error, 1));
                }
                org.telegram.messenger.g0.g3(new r2(g8Var, this.d, z10, document, runnable));
                return;
            default:
                final mf0 mf0Var = (mf0) this.f34985e;
                final org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) this.f34986f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f34987g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z11 = this.f34983b;
                final boolean z12 = this.f34984c;
                final long j3 = this.d;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lf0.run():void");
                    }
                });
                return;
        }
    }

    public f7(mf0 mf0Var, org.telegram.messenger.mp mpVar, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.f34985e = mf0Var;
        this.f34986f = mpVar;
        this.f34983b = z10;
        this.f34987g = tL_channels_searchPosts;
        this.f34984c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
