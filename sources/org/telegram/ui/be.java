package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class be implements RequestDelegate {
    public final int f44027a;
    public final wm f44028b;

    public be(wm wmVar, int i3) {
        this.f44027a = i3;
        this.f44028b = wmVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44027a) {
            case 0:
                final wm wmVar = this.f44028b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                wm.y0(wmVar, tLObject);
                                return;
                            case 1:
                                wm.d1(wmVar, tLObject);
                                return;
                            case 2:
                                wm wmVar2 = wmVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.fc.a(wmVar2)) {
                                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar2);
                                            if (!wmVar2.da() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                wm wmVar3 = wmVar;
                                TLObject tLObject3 = tLObject;
                                wmVar3.F5 = 0;
                                if (tLObject3 == null && wmVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar3.getParentActivity(), wmVar3.f51557ya);
                                    alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131689472, null);
                                    alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    wmVar3.showDialog(alertDialog$Builder.f27343a);
                                    mj mjVar = wmVar3.f51237a0;
                                    if (mjVar != null) {
                                        mjVar.b1(null, null, false);
                                        wmVar3.B9(true);
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
                final wm wmVar2 = this.f44028b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                wm.y0(wmVar2, tLObject);
                                return;
                            case 1:
                                wm.d1(wmVar2, tLObject);
                                return;
                            case 2:
                                wm wmVar22 = wmVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.fc.a(wmVar22)) {
                                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar22);
                                            if (!wmVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                wm wmVar3 = wmVar2;
                                TLObject tLObject3 = tLObject;
                                wmVar3.F5 = 0;
                                if (tLObject3 == null && wmVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar3.getParentActivity(), wmVar3.f51557ya);
                                    alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131689472, null);
                                    alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    wmVar3.showDialog(alertDialog$Builder.f27343a);
                                    mj mjVar = wmVar3.f51237a0;
                                    if (mjVar != null) {
                                        mjVar.b1(null, null, false);
                                        wmVar3.B9(true);
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
                final wm wmVar3 = this.f44028b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                wm.y0(wmVar3, tLObject);
                                return;
                            case 1:
                                wm.d1(wmVar3, tLObject);
                                return;
                            case 2:
                                wm wmVar22 = wmVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.fc.a(wmVar22)) {
                                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar22);
                                            if (!wmVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                wm wmVar32 = wmVar3;
                                TLObject tLObject3 = tLObject;
                                wmVar32.F5 = 0;
                                if (tLObject3 == null && wmVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar32.getParentActivity(), wmVar32.f51557ya);
                                    alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131689472, null);
                                    alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    wmVar32.showDialog(alertDialog$Builder.f27343a);
                                    mj mjVar = wmVar32.f51237a0;
                                    if (mjVar != null) {
                                        mjVar.b1(null, null, false);
                                        wmVar32.B9(true);
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
                final wm wmVar4 = this.f44028b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                wm.y0(wmVar4, tLObject);
                                return;
                            case 1:
                                wm.d1(wmVar4, tLObject);
                                return;
                            case 2:
                                wm wmVar22 = wmVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.fc.a(wmVar22)) {
                                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar22);
                                            if (!wmVar22.da() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                wm wmVar32 = wmVar4;
                                TLObject tLObject3 = tLObject;
                                wmVar32.F5 = 0;
                                if (tLObject3 == null && wmVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar32.getParentActivity(), wmVar32.f51557ya);
                                    alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131689472, null);
                                    alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    wmVar32.showDialog(alertDialog$Builder.f27343a);
                                    mj mjVar = wmVar32.f51237a0;
                                    if (mjVar != null) {
                                        mjVar.b1(null, null, false);
                                        wmVar32.B9(true);
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
                wm wmVar5 = this.f44028b;
                if (tL_error != null) {
                    wmVar5.getClass();
                    return;
                } else {
                    wmVar5.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                wm.j1(this.f44028b, tLObject);
                return;
        }
    }
}
