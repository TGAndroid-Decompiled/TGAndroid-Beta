package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class de implements RequestDelegate {
    public final int f44922a;
    public final cn f44923b;

    public de(cn cnVar, int i7) {
        this.f44922a = i7;
        this.f44923b = cnVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44922a) {
            case 0:
                final cn cnVar = this.f44923b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9 = false;
                        switch (r3) {
                            case 0:
                                cn.B0(cnVar, tLObject);
                                return;
                            case 1:
                                cn.q0(cnVar, tLObject);
                                return;
                            case 2:
                                cn cnVar2 = cnVar;
                                TLObject tLObject2 = tLObject;
                                cnVar2.E5 = 0;
                                if (tLObject2 == null && cnVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar2.getParentActivity(), cnVar2.f44709za);
                                    alertDialog$Builder.f27296a.R = org.telegram.messenger.id.M0(2131689472, null);
                                    alertDialog$Builder.f27296a.T = org.telegram.messenger.id.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                    cnVar2.showDialog(alertDialog$Builder.f27296a);
                                    sj sjVar = cnVar2.Z;
                                    if (sjVar != null) {
                                        sjVar.c1(null, null, false);
                                        cnVar2.C9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                cn cnVar3 = cnVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(cnVar3)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar3);
                                            if (!cnVar3.ea() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
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
                final cn cnVar2 = this.f44923b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9 = false;
                        switch (r3) {
                            case 0:
                                cn.B0(cnVar2, tLObject);
                                return;
                            case 1:
                                cn.q0(cnVar2, tLObject);
                                return;
                            case 2:
                                cn cnVar22 = cnVar2;
                                TLObject tLObject2 = tLObject;
                                cnVar22.E5 = 0;
                                if (tLObject2 == null && cnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar22.getParentActivity(), cnVar22.f44709za);
                                    alertDialog$Builder.f27296a.R = org.telegram.messenger.id.M0(2131689472, null);
                                    alertDialog$Builder.f27296a.T = org.telegram.messenger.id.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                    cnVar22.showDialog(alertDialog$Builder.f27296a);
                                    sj sjVar = cnVar22.Z;
                                    if (sjVar != null) {
                                        sjVar.c1(null, null, false);
                                        cnVar22.C9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                cn cnVar3 = cnVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(cnVar3)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar3);
                                            if (!cnVar3.ea() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
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
                final cn cnVar3 = this.f44923b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9 = false;
                        switch (r3) {
                            case 0:
                                cn.B0(cnVar3, tLObject);
                                return;
                            case 1:
                                cn.q0(cnVar3, tLObject);
                                return;
                            case 2:
                                cn cnVar22 = cnVar3;
                                TLObject tLObject2 = tLObject;
                                cnVar22.E5 = 0;
                                if (tLObject2 == null && cnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar22.getParentActivity(), cnVar22.f44709za);
                                    alertDialog$Builder.f27296a.R = org.telegram.messenger.id.M0(2131689472, null);
                                    alertDialog$Builder.f27296a.T = org.telegram.messenger.id.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                    cnVar22.showDialog(alertDialog$Builder.f27296a);
                                    sj sjVar = cnVar22.Z;
                                    if (sjVar != null) {
                                        sjVar.c1(null, null, false);
                                        cnVar22.C9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                cn cnVar32 = cnVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(cnVar32)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar32);
                                            if (!cnVar32.ea() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
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
                final cn cnVar4 = this.f44923b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9 = false;
                        switch (r3) {
                            case 0:
                                cn.B0(cnVar4, tLObject);
                                return;
                            case 1:
                                cn.q0(cnVar4, tLObject);
                                return;
                            case 2:
                                cn cnVar22 = cnVar4;
                                TLObject tLObject2 = tLObject;
                                cnVar22.E5 = 0;
                                if (tLObject2 == null && cnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar22.getParentActivity(), cnVar22.f44709za);
                                    alertDialog$Builder.f27296a.R = org.telegram.messenger.id.M0(2131689472, null);
                                    alertDialog$Builder.f27296a.T = org.telegram.messenger.id.M0(2131751271, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                                    cnVar22.showDialog(alertDialog$Builder.f27296a);
                                    sj sjVar = cnVar22.Z;
                                    if (sjVar != null) {
                                        sjVar.c1(null, null, false);
                                        cnVar22.C9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                cn cnVar32 = cnVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(cnVar32)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(cnVar32);
                                            if (!cnVar32.ea() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z9 = true;
                                            }
                                            a02.k(z9).j();
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
                cn cnVar5 = this.f44923b;
                if (tL_error != null) {
                    cnVar5.getClass();
                    return;
                } else {
                    cnVar5.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                cn.n1(this.f44923b, tLObject);
                return;
        }
    }
}
