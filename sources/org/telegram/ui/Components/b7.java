package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b7 implements RequestDelegate {
    public final int f32010a = 0;
    public final boolean f32011b;
    public final boolean f32012c;
    public final long d;
    public final KeyEvent.Callback f32013e;
    public final Object f32014f;
    public final Object f32015g;
    public final Object h;

    public b7(b8 b8Var, boolean z9, org.telegram.messenger.ij ijVar, boolean z10, Runnable runnable, long j3, TLRPC.Document document) {
        this.f32013e = b8Var;
        this.f32011b = z9;
        this.f32014f = ijVar;
        this.f32012c = z10;
        this.f32015g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f32010a) {
            case 0:
                final b8 b8Var = (b8) this.f32013e;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f32014f;
                final Runnable runnable = (Runnable) this.f32015g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z9 = this.f32012c;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text)) {
                    if (!this.f32011b && ijVar.f1() >= 0) {
                        if (org.telegram.messenger.ij.B0(ijVar.f23237k) >= 0) {
                            final int f12 = ijVar.f1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.f27048id.add(Integer.valueOf(f12));
                            ConnectionsManager.getInstance(b8Var.f28612a).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (r5) {
                                        case 0:
                                            boolean z10 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final b8 b8Var2 = b8Var;
                                            if (z10) {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i7).f26973id == f12) {
                                                            message = messages_messages.messages.get(i7);
                                                        } else {
                                                            i7++;
                                                        }
                                                    } else {
                                                        message = null;
                                                    }
                                                }
                                                if (message != null) {
                                                    b8Var2.R0(new org.telegram.messenger.ij(b8Var2.f28612a, message, false, true), z9, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i10 = r2;
                                                            b8 b8Var3 = b8Var2;
                                                            switch (i10) {
                                                                case 0:
                                                                    new hc((FrameLayout) b8Var3.f28615b, b8Var3.I0).t(org.telegram.messenger.hd.a0(null, null, 2131743879, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new hc((FrameLayout) b8Var3.f28615b, b8Var3.I0).t(org.telegram.messenger.hd.a0(null, null, 2131743879, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.h3(new c7(b8Var2, tL_error2, 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        default:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final b8 b8Var3 = b8Var;
                                            if (z11) {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < messages_messages2.messages.size()) {
                                                        if (messages_messages2.messages.get(i10).f26973id == f12) {
                                                            message2 = messages_messages2.messages.get(i10);
                                                        } else {
                                                            i10++;
                                                        }
                                                    } else {
                                                        message2 = null;
                                                    }
                                                }
                                                if (message2 != null) {
                                                    b8Var3.R0(new org.telegram.messenger.ij(b8Var3.f28612a, message2, false, true), z9, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.g0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i102 = r2;
                                                            b8 b8Var32 = b8Var3;
                                                            switch (i102) {
                                                                case 0:
                                                                    new hc((FrameLayout) b8Var32.f28615b, b8Var32.I0).t(org.telegram.messenger.hd.a0(null, null, 2131743879, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new hc((FrameLayout) b8Var32.f28615b, b8Var32.I0).t(org.telegram.messenger.hd.a0(null, null, 2131743879, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.g0.h3(new c7(b8Var3, tL_error2, 2));
                                                return;
                                            } else {
                                                return;
                                            }
                                    }
                                }
                            });
                            return;
                        }
                        final int f13 = ijVar.f1();
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages.channel = org.telegram.messenger.qp.s1(b8Var.f28612a).h1(-org.telegram.messenger.ij.B0(ijVar.f23237k));
                        tL_channels_getMessages.f26990id.add(Integer.valueOf(f13));
                        ConnectionsManager.getInstance(b8Var.f28612a).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                TLRPC.Message message;
                                TLRPC.Message message2;
                                switch (r5) {
                                    case 0:
                                        boolean z10 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final b8 b8Var2 = b8Var;
                                        if (z10) {
                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 < messages_messages.messages.size()) {
                                                    if (messages_messages.messages.get(i7).f26973id == f13) {
                                                        message = messages_messages.messages.get(i7);
                                                    } else {
                                                        i7++;
                                                    }
                                                } else {
                                                    message = null;
                                                }
                                            }
                                            if (message != null) {
                                                b8Var2.R0(new org.telegram.messenger.ij(b8Var2.f28612a, message, false, true), z9, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        b8 b8Var32 = b8Var2;
                                                        switch (i102) {
                                                            case 0:
                                                                new hc((FrameLayout) b8Var32.f28615b, b8Var32.I0).t(org.telegram.messenger.hd.a0(null, null, 2131743879, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new hc((FrameLayout) b8Var32.f28615b, b8Var32.I0).t(org.telegram.messenger.hd.a0(null, null, 2131743879, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.h3(new c7(b8Var2, tL_error2, 3));
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final b8 b8Var3 = b8Var;
                                        if (z11) {
                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 < messages_messages2.messages.size()) {
                                                    if (messages_messages2.messages.get(i10).f26973id == f13) {
                                                        message2 = messages_messages2.messages.get(i10);
                                                    } else {
                                                        i10++;
                                                    }
                                                } else {
                                                    message2 = null;
                                                }
                                            }
                                            if (message2 != null) {
                                                b8Var3.R0(new org.telegram.messenger.ij(b8Var3.f28612a, message2, false, true), z9, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.g0.h3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i102 = r2;
                                                        b8 b8Var32 = b8Var3;
                                                        switch (i102) {
                                                            case 0:
                                                                new hc((FrameLayout) b8Var32.f28615b, b8Var32.I0).t(org.telegram.messenger.hd.a0(null, null, 2131743879, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new hc((FrameLayout) b8Var32.f28615b, b8Var32.I0).t(org.telegram.messenger.hd.a0(null, null, 2131743879, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.g0.h3(new c7(b8Var3, tL_error2, 2));
                                            return;
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    org.telegram.messenger.g0.h3(new c7(b8Var, tL_error, 0));
                    return;
                }
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new c7(b8Var, tL_error, 1));
                }
                org.telegram.messenger.g0.h3(new j2(b8Var, this.d, z9, document, runnable));
                return;
            default:
                final ze0 ze0Var = (ze0) this.f32013e;
                final org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) this.f32014f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f32015g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.f32011b;
                final boolean z11 = this.f32012c;
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

    public b7(ze0 ze0Var, org.telegram.messenger.qp qpVar, boolean z9, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z10, long j3, ConnectionsManager connectionsManager) {
        this.f32013e = ze0Var;
        this.f32014f = qpVar;
        this.f32011b = z9;
        this.f32015g = tL_channels_searchPosts;
        this.f32012c = z10;
        this.d = j3;
        this.h = connectionsManager;
    }
}
