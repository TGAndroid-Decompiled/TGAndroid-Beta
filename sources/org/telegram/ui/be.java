package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class be implements RequestDelegate {
    public final int f45685a;
    public final an f45686b;

    public be(an anVar, int i7) {
        this.f45685a = i7;
        this.f45686b = anVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45685a) {
            case 0:
                final an anVar = this.f45686b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                an.B0(anVar, tLObject);
                                return;
                            case 1:
                                an.q0(anVar, tLObject);
                                return;
                            case 2:
                                an anVar2 = anVar;
                                TLObject tLObject2 = tLObject;
                                anVar2.F5 = 0;
                                if (tLObject2 == null && anVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar2.getParentActivity(), anVar2.Aa);
                                    alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131689472, null);
                                    alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                    anVar2.showDialog(alertDialog$Builder.f28392a);
                                    qj qjVar = anVar2.f45118a0;
                                    if (qjVar != null) {
                                        qjVar.s1(null, null, false);
                                        anVar2.D9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                an anVar3 = anVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f26600b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(anVar3)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar3);
                                            if (!anVar3.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
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
                final an anVar2 = this.f45686b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                an.B0(anVar2, tLObject);
                                return;
                            case 1:
                                an.q0(anVar2, tLObject);
                                return;
                            case 2:
                                an anVar22 = anVar2;
                                TLObject tLObject2 = tLObject;
                                anVar22.F5 = 0;
                                if (tLObject2 == null && anVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar22.getParentActivity(), anVar22.Aa);
                                    alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131689472, null);
                                    alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                    anVar22.showDialog(alertDialog$Builder.f28392a);
                                    qj qjVar = anVar22.f45118a0;
                                    if (qjVar != null) {
                                        qjVar.s1(null, null, false);
                                        anVar22.D9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                an anVar3 = anVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f26600b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(anVar3)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar3);
                                            if (!anVar3.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
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
                final an anVar3 = this.f45686b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                an.B0(anVar3, tLObject);
                                return;
                            case 1:
                                an.q0(anVar3, tLObject);
                                return;
                            case 2:
                                an anVar22 = anVar3;
                                TLObject tLObject2 = tLObject;
                                anVar22.F5 = 0;
                                if (tLObject2 == null && anVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar22.getParentActivity(), anVar22.Aa);
                                    alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131689472, null);
                                    alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                    anVar22.showDialog(alertDialog$Builder.f28392a);
                                    qj qjVar = anVar22.f45118a0;
                                    if (qjVar != null) {
                                        qjVar.s1(null, null, false);
                                        anVar22.D9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                an anVar32 = anVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f26600b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(anVar32)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar32);
                                            if (!anVar32.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
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
                final an anVar4 = this.f45686b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                an.B0(anVar4, tLObject);
                                return;
                            case 1:
                                an.q0(anVar4, tLObject);
                                return;
                            case 2:
                                an anVar22 = anVar4;
                                TLObject tLObject2 = tLObject;
                                anVar22.F5 = 0;
                                if (tLObject2 == null && anVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar22.getParentActivity(), anVar22.Aa);
                                    alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131689472, null);
                                    alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                                    anVar22.showDialog(alertDialog$Builder.f28392a);
                                    qj qjVar = anVar22.f45118a0;
                                    if (qjVar != null) {
                                        qjVar.s1(null, null, false);
                                        anVar22.D9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                an anVar32 = anVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f26600b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(anVar32)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar32);
                                            if (!anVar32.fa() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
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
                an anVar5 = this.f45686b;
                if (tL_error != null) {
                    anVar5.getClass();
                    return;
                } else {
                    anVar5.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                an.n1(this.f45686b, tLObject);
                return;
        }
    }
}
