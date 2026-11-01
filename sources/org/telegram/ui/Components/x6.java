package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements RequestDelegate {
    public final int f32437a = 1;
    public final boolean f32438b;
    public final boolean f32439c;
    public final long d;
    public final KeyEvent.Callback e;
    public final Object f32440f;
    public final Object f32441g;
    public final Object h;

    public x6(w7 w7Var, boolean z10, org.telegram.messenger.kj kjVar, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.e = w7Var;
        this.f32438b = z10;
        this.f32440f = kjVar;
        this.f32439c = z11;
        this.f32441g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f32437a) {
            case 0:
                final w7 w7Var = (w7) this.e;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.f32440f;
                final Runnable runnable = (Runnable) this.f32441g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z10 = this.f32439c;
                if (tL_error != null && org.telegram.messenger.w8.r(tL_error.text)) {
                    if (!this.f32438b && kjVar.f1() >= 0) {
                        if (org.telegram.messenger.kj.B0(kjVar.f16690k) >= 0) {
                            final int f12 = kjVar.f1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.f19890id.add(Integer.valueOf(f12));
                            ConnectionsManager.getInstance(w7Var.f21584a).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (r5) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final w7 w7Var2 = w7Var;
                                            if (z11) {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i10).f19815id == f12) {
                                                            message = messages_messages.messages.get(i10);
                                                        } else {
                                                            i10++;
                                                        }
                                                    } else {
                                                        message = null;
                                                    }
                                                }
                                                if (message != null) {
                                                    w7Var2.R0(new org.telegram.messenger.kj(w7Var2.f21584a, message, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.i0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i11 = r2;
                                                            w7 w7Var3 = w7Var2;
                                                            switch (i11) {
                                                                case 0:
                                                                    new cc((FrameLayout) w7Var3.f21587b, w7Var3.I0).t(org.telegram.messenger.dd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new cc((FrameLayout) w7Var3.f21587b, w7Var3.I0).t(org.telegram.messenger.dd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.i0.g3(new y6(w7Var2, tL_error2, 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final w7 w7Var3 = w7Var;
                                            if (z12) {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 < messages_messages2.messages.size()) {
                                                        if (messages_messages2.messages.get(i11).f19815id == f12) {
                                                            message2 = messages_messages2.messages.get(i11);
                                                        } else {
                                                            i11++;
                                                        }
                                                    } else {
                                                        message2 = null;
                                                    }
                                                }
                                                if (message2 != null) {
                                                    w7Var3.R0(new org.telegram.messenger.kj(w7Var3.f21584a, message2, false, true), z10, runnable, true);
                                                    return;
                                                } else {
                                                    org.telegram.messenger.i0.g3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i112 = r2;
                                                            w7 w7Var32 = w7Var3;
                                                            switch (i112) {
                                                                case 0:
                                                                    new cc((FrameLayout) w7Var32.f21587b, w7Var32.I0).t(org.telegram.messenger.dd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new cc((FrameLayout) w7Var32.f21587b, w7Var32.I0).t(org.telegram.messenger.dd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                org.telegram.messenger.i0.g3(new y6(w7Var3, tL_error2, 2));
                                                return;
                                            } else {
                                                return;
                                            }
                                    }
                                }
                            });
                            return;
                        }
                        final int f13 = kjVar.f1();
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages.channel = org.telegram.messenger.wp.r1(w7Var.f21584a).g1(-org.telegram.messenger.kj.B0(kjVar.f16690k));
                        tL_channels_getMessages.f19832id.add(Integer.valueOf(f13));
                        ConnectionsManager.getInstance(w7Var.f21584a).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                TLRPC.Message message;
                                TLRPC.Message message2;
                                switch (r5) {
                                    case 0:
                                        boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final w7 w7Var2 = w7Var;
                                        if (z11) {
                                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 < messages_messages.messages.size()) {
                                                    if (messages_messages.messages.get(i10).f19815id == f13) {
                                                        message = messages_messages.messages.get(i10);
                                                    } else {
                                                        i10++;
                                                    }
                                                } else {
                                                    message = null;
                                                }
                                            }
                                            if (message != null) {
                                                w7Var2.R0(new org.telegram.messenger.kj(w7Var2.f21584a, message, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.i0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i112 = r2;
                                                        w7 w7Var32 = w7Var2;
                                                        switch (i112) {
                                                            case 0:
                                                                new cc((FrameLayout) w7Var32.f21587b, w7Var32.I0).t(org.telegram.messenger.dd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new cc((FrameLayout) w7Var32.f21587b, w7Var32.I0).t(org.telegram.messenger.dd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.i0.g3(new y6(w7Var2, tL_error2, 3));
                                            return;
                                        } else {
                                            return;
                                        }
                                    default:
                                        boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                        final w7 w7Var3 = w7Var;
                                        if (z12) {
                                            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                            int i11 = 0;
                                            while (true) {
                                                if (i11 < messages_messages2.messages.size()) {
                                                    if (messages_messages2.messages.get(i11).f19815id == f13) {
                                                        message2 = messages_messages2.messages.get(i11);
                                                    } else {
                                                        i11++;
                                                    }
                                                } else {
                                                    message2 = null;
                                                }
                                            }
                                            if (message2 != null) {
                                                w7Var3.R0(new org.telegram.messenger.kj(w7Var3.f21584a, message2, false, true), z10, runnable, true);
                                                return;
                                            } else {
                                                org.telegram.messenger.i0.g3(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        int i112 = r2;
                                                        w7 w7Var32 = w7Var3;
                                                        switch (i112) {
                                                            case 0:
                                                                new cc((FrameLayout) w7Var32.f21587b, w7Var32.I0).t(org.telegram.messenger.dd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                            default:
                                                                new cc((FrameLayout) w7Var32.f21587b, w7Var32.I0).t(org.telegram.messenger.dd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (tL_error2 != null) {
                                            org.telegram.messenger.i0.g3(new y6(w7Var3, tL_error2, 2));
                                            return;
                                        } else {
                                            return;
                                        }
                                }
                            }
                        });
                        return;
                    }
                    org.telegram.messenger.i0.g3(new y6(w7Var, tL_error, 0));
                    return;
                }
                if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new y6(w7Var, tL_error, 1));
                }
                org.telegram.messenger.i0.g3(new k2(w7Var, this.d, z10, document, runnable));
                return;
            default:
                final cg0 cg0Var = (cg0) this.e;
                final org.telegram.messenger.wp wpVar = (org.telegram.messenger.wp) this.f32440f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.f32441g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z11 = this.f32438b;
                final boolean z12 = this.f32439c;
                final long j10 = this.d;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bg0.run():void");
                    }
                });
                return;
        }
    }

    public x6(cg0 cg0Var, org.telegram.messenger.wp wpVar, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.e = cg0Var;
        this.f32440f = wpVar;
        this.f32438b = z10;
        this.f32441g = tL_channels_searchPosts;
        this.f32439c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
