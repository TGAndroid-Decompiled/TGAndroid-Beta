package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class de implements RequestDelegate {
    public final int f45030a;
    public final an f45031b;

    public de(an anVar, int i7) {
        this.f45030a = i7;
        this.f45031b = anVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45030a) {
            case 0:
                final an anVar = this.f45031b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9 = false;
                        switch (r3) {
                            case 0:
                                an.y0(anVar, tLObject);
                                return;
                            case 1:
                                an.d1(anVar, tLObject);
                                return;
                            case 2:
                                an anVar2 = anVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25555b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(anVar2)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar2);
                                            if (!anVar2.da() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                an anVar3 = anVar;
                                TLObject tLObject3 = tLObject;
                                anVar3.E5 = 0;
                                if (tLObject3 == null && anVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar3.getParentActivity(), anVar3.f43998xa);
                                    alertDialog$Builder.f27292a.R = org.telegram.messenger.hd.M0(2131689472, null);
                                    alertDialog$Builder.f27292a.T = org.telegram.messenger.hd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                    anVar3.showDialog(alertDialog$Builder.f27292a);
                                    qj qjVar = anVar3.Z;
                                    if (qjVar != null) {
                                        qjVar.b1(null, null, false);
                                        anVar3.B9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final an anVar2 = this.f45031b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9 = false;
                        switch (r3) {
                            case 0:
                                an.y0(anVar2, tLObject);
                                return;
                            case 1:
                                an.d1(anVar2, tLObject);
                                return;
                            case 2:
                                an anVar22 = anVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25555b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(anVar22)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar22);
                                            if (!anVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                an anVar3 = anVar2;
                                TLObject tLObject3 = tLObject;
                                anVar3.E5 = 0;
                                if (tLObject3 == null && anVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar3.getParentActivity(), anVar3.f43998xa);
                                    alertDialog$Builder.f27292a.R = org.telegram.messenger.hd.M0(2131689472, null);
                                    alertDialog$Builder.f27292a.T = org.telegram.messenger.hd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                    anVar3.showDialog(alertDialog$Builder.f27292a);
                                    qj qjVar = anVar3.Z;
                                    if (qjVar != null) {
                                        qjVar.b1(null, null, false);
                                        anVar3.B9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final an anVar3 = this.f45031b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9 = false;
                        switch (r3) {
                            case 0:
                                an.y0(anVar3, tLObject);
                                return;
                            case 1:
                                an.d1(anVar3, tLObject);
                                return;
                            case 2:
                                an anVar22 = anVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25555b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(anVar22)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar22);
                                            if (!anVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                an anVar32 = anVar3;
                                TLObject tLObject3 = tLObject;
                                anVar32.E5 = 0;
                                if (tLObject3 == null && anVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar32.getParentActivity(), anVar32.f43998xa);
                                    alertDialog$Builder.f27292a.R = org.telegram.messenger.hd.M0(2131689472, null);
                                    alertDialog$Builder.f27292a.T = org.telegram.messenger.hd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                    anVar32.showDialog(alertDialog$Builder.f27292a);
                                    qj qjVar = anVar32.Z;
                                    if (qjVar != null) {
                                        qjVar.b1(null, null, false);
                                        anVar32.B9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                final an anVar4 = this.f45031b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z9 = false;
                        switch (r3) {
                            case 0:
                                an.y0(anVar4, tLObject);
                                return;
                            case 1:
                                an.d1(anVar4, tLObject);
                                return;
                            case 2:
                                an anVar22 = anVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25555b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.hc.a(anVar22)) {
                                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(anVar22);
                                            if (!anVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                an anVar32 = anVar4;
                                TLObject tLObject3 = tLObject;
                                anVar32.E5 = 0;
                                if (tLObject3 == null && anVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar32.getParentActivity(), anVar32.f43998xa);
                                    alertDialog$Builder.f27292a.R = org.telegram.messenger.hd.M0(2131689472, null);
                                    alertDialog$Builder.f27292a.T = org.telegram.messenger.hd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                                    anVar32.showDialog(alertDialog$Builder.f27292a);
                                    qj qjVar = anVar32.Z;
                                    if (qjVar != null) {
                                        qjVar.b1(null, null, false);
                                        anVar32.B9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                an anVar5 = this.f45031b;
                if (tL_error != null) {
                    anVar5.getClass();
                    return;
                } else {
                    anVar5.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                an.j1(this.f45031b, tLObject);
                return;
        }
    }
}
