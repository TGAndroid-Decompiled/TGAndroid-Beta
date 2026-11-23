package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f7 implements RequestDelegate {
    public final int f35021a = 0;
    public final boolean f35022b;
    public final boolean f35023c;
    public final long d;
    public final KeyEvent.Callback f35024e;
    public final Object f35025f;
    public final Object f35026g;
    public final Object h;

    public f7(e8 e8Var, boolean z10, org.telegram.messenger.fj fjVar, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.f35024e = e8Var;
        this.f35022b = z10;
        this.f35025f = fjVar;
        this.f35023c = z11;
        this.f35026g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35021a) {
            case 0:
                final e8 e8Var = (e8) this.f35024e;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f35025f;
                final Runnable runnable = (Runnable) this.f35026g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z10 = this.f35023c;
                if (tL_error != null && org.telegram.messenger.q8.r(tL_error.text)) {
                    if (!this.f35022b && fjVar.e1() >= 0) {
                        if (org.telegram.messenger.fj.B0(fjVar.f24073k) >= 0) {
                            final int e12 = fjVar.e1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.f28588id.add(Integer.valueOf(e12));
                            ConnectionsManager.getInstance(e8Var.f30223a).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (r5) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final e8 e8Var2 = e8Var;
                                            if (z11) {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i7).f28513id == e12) {
                                                            message = messages_messages.messages.get(i7);
                                                        } else {
                                                            i7++;
                                                        }
                                                    } else {
                                                        message = null;
                                                    }
                                                }
                                                if (message != null) {
                                                    e8Var2.S0(new org.telegram.messenger.fj(e8Var2.f30223a, message, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i10 = r2;
                                                            e8 e8Var3 = e8Var2;
                                                            switch (i10) {
                                                                case 0:
                                                                    new kc((FrameLayout) e8Var3.f30226b, e8Var3.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new kc((FrameLayout) e8Var3.f30226b, e8Var3.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.g3(new g7(e8Var2, tL_error2, 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final e8 e8Var3 = e8Var;
                                            if (z12) {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < messages_messages2.messages.size()) {
                                                        if (messages_messages2.messages.get(i10).f28513id == e12) {
                                                            message2 = messages_messages2.messages.get(i10);
                                                        } else {
                                                            i10++;
                                                        }
                                                    } else {
                                                        message2 = null;
                                                    }
                                                }
                                                if (message2 != null) {
                                                    e8Var3.S0(new org.telegram.messenger.fj(e8Var3.f30223a, message2, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i102 = r2;
                                                            e8 e8Var32 = e8Var3;
                                                            switch (i102) {
                                                                case 0:
                                                                    new kc((FrameLayout) e8Var32.f30226b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new kc((FrameLayout) e8Var32.f30226b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.g3(new g7(e8Var3, tL_error2, 2));
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
                        tL_channels_getMessages.channel = org.telegram.messenger.mp.u1(e8Var.f30223a).j1(-org.telegram.messenger.fj.B0(fjVar.f24073k));
                        tL_channels_getMessages.f28530id.add(Integer.valueOf(e13));
                        ConnectionsManager.getInstance(e8Var.f30223a).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                TLRPC.Message message;
                                TLRPC.Message message2;
                                switch (r5) {
                                    case 0:
                                        boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final e8 e8Var2 = e8Var;
                                        if (z11) {
                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 < messages_messages.messages.size()) {
                                                    if (messages_messages.messages.get(i7).f28513id == e13) {
                                                        message = messages_messages.messages.get(i7);
                                                    } else {
                                                        i7++;
                                                    }
                                                } else {
                                                    message = null;
                                                }
                                            }
                                            if (message != null) {
                                                e8Var2.S0(new org.telegram.messenger.fj(e8Var2.f30223a, message, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        e8 e8Var32 = e8Var2;
                                                        switch (i102) {
                                                            case 0:
                                                                new kc((FrameLayout) e8Var32.f30226b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new kc((FrameLayout) e8Var32.f30226b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.g3(new g7(e8Var2, tL_error2, 3));
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final e8 e8Var3 = e8Var;
                                        if (z12) {
                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 < messages_messages2.messages.size()) {
                                                    if (messages_messages2.messages.get(i10).f28513id == e13) {
                                                        message2 = messages_messages2.messages.get(i10);
                                                    } else {
                                                        i10++;
                                                    }
                                                } else {
                                                    message2 = null;
                                                }
                                            }
                                            if (message2 != null) {
                                                e8Var3.S0(new org.telegram.messenger.fj(e8Var3.f30223a, message2, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        e8 e8Var32 = e8Var3;
                                                        switch (i102) {
                                                            case 0:
                                                                new kc((FrameLayout) e8Var32.f30226b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new kc((FrameLayout) e8Var32.f30226b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.g3(new g7(e8Var3, tL_error2, 2));
                                            return;
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    org.telegram.messenger.g0.g3(new g7(e8Var, tL_error, 0));
                    return;
                }
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new g7(e8Var, tL_error, 1));
                }
                org.telegram.messenger.g0.g3(new r2(e8Var, this.d, z10, document, runnable));
                return;
            default:
                final nf0 nf0Var = (nf0) this.f35024e;
                final org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) this.f35025f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f35026g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z11 = this.f35022b;
                final boolean z12 = this.f35023c;
                final long j3 = this.d;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mf0.run():void");
                    }
                });
                return;
        }
    }

    public f7(nf0 nf0Var, org.telegram.messenger.mp mpVar, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.f35024e = nf0Var;
        this.f35025f = mpVar;
        this.f35022b = z10;
        this.f35026g = tL_channels_searchPosts;
        this.f35023c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
