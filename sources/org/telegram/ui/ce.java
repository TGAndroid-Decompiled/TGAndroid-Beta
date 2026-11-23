package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ce implements RequestDelegate {
    public final int f46514a;
    public final bn f46515b;

    public ce(bn bnVar, int i7) {
        this.f46514a = i7;
        this.f46515b = bnVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46514a) {
            case 0:
                final bn bnVar = this.f46515b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                bn.B0(bnVar, tLObject);
                                return;
                            case 1:
                                bn.q0(bnVar, tLObject);
                                return;
                            case 2:
                                bn bnVar2 = bnVar;
                                TLObject tLObject2 = tLObject;
                                bnVar2.G5 = 0;
                                if (tLObject2 == null && bnVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar2.getParentActivity(), bnVar2.Ba);
                                    alertDialog$Builder.f28743a.S = org.telegram.messenger.hd.N0(2131689472, null);
                                    alertDialog$Builder.f28743a.U = org.telegram.messenger.hd.N0(2131751259, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                    bnVar2.showDialog(alertDialog$Builder.f28743a);
                                    rj rjVar = bnVar2.f45903a0;
                                    if (rjVar != null) {
                                        rjVar.E1(null, null, false);
                                        bnVar2.D9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                bn bnVar3 = bnVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f26895b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.lc.a(bnVar3)) {
                                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar3);
                                            if (!bnVar3.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            b02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final bn bnVar2 = this.f46515b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                bn.B0(bnVar2, tLObject);
                                return;
                            case 1:
                                bn.q0(bnVar2, tLObject);
                                return;
                            case 2:
                                bn bnVar22 = bnVar2;
                                TLObject tLObject2 = tLObject;
                                bnVar22.G5 = 0;
                                if (tLObject2 == null && bnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar22.getParentActivity(), bnVar22.Ba);
                                    alertDialog$Builder.f28743a.S = org.telegram.messenger.hd.N0(2131689472, null);
                                    alertDialog$Builder.f28743a.U = org.telegram.messenger.hd.N0(2131751259, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                    bnVar22.showDialog(alertDialog$Builder.f28743a);
                                    rj rjVar = bnVar22.f45903a0;
                                    if (rjVar != null) {
                                        rjVar.E1(null, null, false);
                                        bnVar22.D9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                bn bnVar3 = bnVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f26895b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.lc.a(bnVar3)) {
                                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar3);
                                            if (!bnVar3.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            b02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final bn bnVar3 = this.f46515b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                bn.B0(bnVar3, tLObject);
                                return;
                            case 1:
                                bn.q0(bnVar3, tLObject);
                                return;
                            case 2:
                                bn bnVar22 = bnVar3;
                                TLObject tLObject2 = tLObject;
                                bnVar22.G5 = 0;
                                if (tLObject2 == null && bnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar22.getParentActivity(), bnVar22.Ba);
                                    alertDialog$Builder.f28743a.S = org.telegram.messenger.hd.N0(2131689472, null);
                                    alertDialog$Builder.f28743a.U = org.telegram.messenger.hd.N0(2131751259, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                    bnVar22.showDialog(alertDialog$Builder.f28743a);
                                    rj rjVar = bnVar22.f45903a0;
                                    if (rjVar != null) {
                                        rjVar.E1(null, null, false);
                                        bnVar22.D9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                bn bnVar32 = bnVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f26895b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.lc.a(bnVar32)) {
                                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar32);
                                            if (!bnVar32.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            b02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                final bn bnVar4 = this.f46515b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                bn.B0(bnVar4, tLObject);
                                return;
                            case 1:
                                bn.q0(bnVar4, tLObject);
                                return;
                            case 2:
                                bn bnVar22 = bnVar4;
                                TLObject tLObject2 = tLObject;
                                bnVar22.G5 = 0;
                                if (tLObject2 == null && bnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar22.getParentActivity(), bnVar22.Ba);
                                    alertDialog$Builder.f28743a.S = org.telegram.messenger.hd.N0(2131689472, null);
                                    alertDialog$Builder.f28743a.U = org.telegram.messenger.hd.N0(2131751259, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                                    bnVar22.showDialog(alertDialog$Builder.f28743a);
                                    rj rjVar = bnVar22.f45903a0;
                                    if (rjVar != null) {
                                        rjVar.E1(null, null, false);
                                        bnVar22.D9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                bn bnVar32 = bnVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f26895b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.lc.a(bnVar32)) {
                                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar32);
                                            if (!bnVar32.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            b02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                bn bnVar5 = this.f46515b;
                if (tL_error != null) {
                    bnVar5.getClass();
                    return;
                } else {
                    bnVar5.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                bn.n1(this.f46515b, tLObject);
                return;
        }
    }
}
