package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pe implements RequestDelegate {
    public final int f40465a;
    public final un f40466b;

    public pe(un unVar, int i10) {
        this.f40465a = i10;
        this.f40466b = unVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40465a) {
            case 0:
                final un unVar = this.f40466b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                un.y1(unVar, tLObject);
                                return;
                            case 1:
                                un.t0(unVar, tLObject);
                                return;
                            case 2:
                                un unVar2 = unVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(unVar2)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar2);
                                            if (!unVar2.Y9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            default:
                                un unVar3 = unVar;
                                TLObject tLObject3 = tLObject;
                                unVar3.E5 = 0;
                                if (tLObject3 == null && unVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar3.getParentActivity(), unVar3.f42288xa);
                                    alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131689472, null);
                                    alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                                    unVar3.showDialog(alertDialog$Builder.f20135a);
                                    mk mkVar = unVar3.Z;
                                    if (mkVar != null) {
                                        mkVar.a1(null, null, false);
                                        unVar3.w9(true);
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
                final un unVar2 = this.f40466b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                un.y1(unVar2, tLObject);
                                return;
                            case 1:
                                un.t0(unVar2, tLObject);
                                return;
                            case 2:
                                un unVar22 = unVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(unVar22)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar22);
                                            if (!unVar22.Y9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            default:
                                un unVar3 = unVar2;
                                TLObject tLObject3 = tLObject;
                                unVar3.E5 = 0;
                                if (tLObject3 == null && unVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar3.getParentActivity(), unVar3.f42288xa);
                                    alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131689472, null);
                                    alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                                    unVar3.showDialog(alertDialog$Builder.f20135a);
                                    mk mkVar = unVar3.Z;
                                    if (mkVar != null) {
                                        mkVar.a1(null, null, false);
                                        unVar3.w9(true);
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
                final un unVar3 = this.f40466b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                un.y1(unVar3, tLObject);
                                return;
                            case 1:
                                un.t0(unVar3, tLObject);
                                return;
                            case 2:
                                un unVar22 = unVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(unVar22)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar22);
                                            if (!unVar22.Y9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            default:
                                un unVar32 = unVar3;
                                TLObject tLObject3 = tLObject;
                                unVar32.E5 = 0;
                                if (tLObject3 == null && unVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar32.getParentActivity(), unVar32.f42288xa);
                                    alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131689472, null);
                                    alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                                    unVar32.showDialog(alertDialog$Builder.f20135a);
                                    mk mkVar = unVar32.Z;
                                    if (mkVar != null) {
                                        mkVar.a1(null, null, false);
                                        unVar32.w9(true);
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
                final un unVar4 = this.f40466b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10 = false;
                        switch (r3) {
                            case 0:
                                un.y1(unVar4, tLObject);
                                return;
                            case 1:
                                un.t0(unVar4, tLObject);
                                return;
                            case 2:
                                un unVar22 = unVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.cc.a(unVar22)) {
                                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(unVar22);
                                            if (!unVar22.Y9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            default:
                                un unVar32 = unVar4;
                                TLObject tLObject3 = tLObject;
                                unVar32.E5 = 0;
                                if (tLObject3 == null && unVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar32.getParentActivity(), unVar32.f42288xa);
                                    alertDialog$Builder.f20135a.R = org.telegram.messenger.dd.L0(2131689472, null);
                                    alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131751272, null);
                                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                                    unVar32.showDialog(alertDialog$Builder.f20135a);
                                    mk mkVar = unVar32.Z;
                                    if (mkVar != null) {
                                        mkVar.a1(null, null, false);
                                        unVar32.w9(true);
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
                un unVar5 = this.f40466b;
                if (tL_error != null) {
                    unVar5.getClass();
                    return;
                } else {
                    unVar5.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                un.f1(this.f40466b, tLObject);
                return;
        }
    }
}
