package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pe implements RequestDelegate {
    public final int f40109a;
    public final sn f40110b;

    public pe(sn snVar, int i10) {
        this.f40109a = i10;
        this.f40110b = snVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40109a) {
            case 0:
                final sn snVar = this.f40110b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                sn.l1(snVar, tLObject);
                                return;
                            case 1:
                                sn.V0(snVar, tLObject);
                                return;
                            case 2:
                                sn snVar2 = snVar;
                                TLObject tLObject2 = tLObject;
                                snVar2.f41345o5 = 0;
                                if (tLObject2 == null && snVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar2.getParentActivity(), 0, snVar2.f41226ea);
                                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    snVar2.showDialog(alertDialog$Builder.f20608a);
                                    hk hkVar = snVar2.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        snVar2.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                sn snVar3 = snVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(snVar3)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar3);
                                            if (!snVar3.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final sn snVar2 = this.f40110b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                sn.l1(snVar2, tLObject);
                                return;
                            case 1:
                                sn.V0(snVar2, tLObject);
                                return;
                            case 2:
                                sn snVar22 = snVar2;
                                TLObject tLObject2 = tLObject;
                                snVar22.f41345o5 = 0;
                                if (tLObject2 == null && snVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar22.getParentActivity(), 0, snVar22.f41226ea);
                                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    snVar22.showDialog(alertDialog$Builder.f20608a);
                                    hk hkVar = snVar22.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        snVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                sn snVar3 = snVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(snVar3)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar3);
                                            if (!snVar3.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final sn snVar3 = this.f40110b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                sn.l1(snVar3, tLObject);
                                return;
                            case 1:
                                sn.V0(snVar3, tLObject);
                                return;
                            case 2:
                                sn snVar22 = snVar3;
                                TLObject tLObject2 = tLObject;
                                snVar22.f41345o5 = 0;
                                if (tLObject2 == null && snVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar22.getParentActivity(), 0, snVar22.f41226ea);
                                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    snVar22.showDialog(alertDialog$Builder.f20608a);
                                    hk hkVar = snVar22.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        snVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                sn snVar32 = snVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(snVar32)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar32);
                                            if (!snVar32.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                final sn snVar4 = this.f40110b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                sn.l1(snVar4, tLObject);
                                return;
                            case 1:
                                sn.V0(snVar4, tLObject);
                                return;
                            case 2:
                                sn snVar22 = snVar4;
                                TLObject tLObject2 = tLObject;
                                snVar22.f41345o5 = 0;
                                if (tLObject2 == null && snVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar22.getParentActivity(), 0, snVar22.f41226ea);
                                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    snVar22.showDialog(alertDialog$Builder.f20608a);
                                    hk hkVar = snVar22.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        snVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                sn snVar32 = snVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(snVar32)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar32);
                                            if (!snVar32.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                sn snVar5 = this.f40110b;
                if (tL_error != null) {
                    snVar5.getClass();
                    return;
                } else {
                    snVar5.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                sn.e1(this.f40110b, tLObject);
                return;
        }
    }
}
