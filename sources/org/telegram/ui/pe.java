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
    public final int f40777a;
    public final zn f40778b;

    public pe(zn znVar, int i10) {
        this.f40777a = i10;
        this.f40778b = znVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40777a) {
            case 0:
                final zn znVar = this.f40778b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                zn.l1(znVar, tLObject);
                                return;
                            case 1:
                                zn.V0(znVar, tLObject);
                                return;
                            case 2:
                                zn znVar2 = znVar;
                                TLObject tLObject2 = tLObject;
                                znVar2.f44877o5 = 0;
                                if (tLObject2 == null && znVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar2.getParentActivity(), 0, znVar2.f44761ea);
                                    alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar2.showDialog(alertDialog$Builder.f20374a);
                                    ok okVar = znVar2.Y;
                                    if (okVar != null) {
                                        okVar.a1(null, null, false);
                                        znVar2.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                zn znVar3 = znVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.ad.a(znVar3)) {
                                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(znVar3);
                                            if (!znVar3.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final zn znVar2 = this.f40778b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                zn.l1(znVar2, tLObject);
                                return;
                            case 1:
                                zn.V0(znVar2, tLObject);
                                return;
                            case 2:
                                zn znVar22 = znVar2;
                                TLObject tLObject2 = tLObject;
                                znVar22.f44877o5 = 0;
                                if (tLObject2 == null && znVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar22.getParentActivity(), 0, znVar22.f44761ea);
                                    alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar22.showDialog(alertDialog$Builder.f20374a);
                                    ok okVar = znVar22.Y;
                                    if (okVar != null) {
                                        okVar.a1(null, null, false);
                                        znVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                zn znVar3 = znVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.ad.a(znVar3)) {
                                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(znVar3);
                                            if (!znVar3.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final zn znVar3 = this.f40778b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                zn.l1(znVar3, tLObject);
                                return;
                            case 1:
                                zn.V0(znVar3, tLObject);
                                return;
                            case 2:
                                zn znVar22 = znVar3;
                                TLObject tLObject2 = tLObject;
                                znVar22.f44877o5 = 0;
                                if (tLObject2 == null && znVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar22.getParentActivity(), 0, znVar22.f44761ea);
                                    alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar22.showDialog(alertDialog$Builder.f20374a);
                                    ok okVar = znVar22.Y;
                                    if (okVar != null) {
                                        okVar.a1(null, null, false);
                                        znVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                zn znVar32 = znVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.ad.a(znVar32)) {
                                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(znVar32);
                                            if (!znVar32.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 3:
                final zn znVar4 = this.f40778b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                zn.l1(znVar4, tLObject);
                                return;
                            case 1:
                                zn.V0(znVar4, tLObject);
                                return;
                            case 2:
                                zn znVar22 = znVar4;
                                TLObject tLObject2 = tLObject;
                                znVar22.f44877o5 = 0;
                                if (tLObject2 == null && znVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar22.getParentActivity(), 0, znVar22.f44761ea);
                                    alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar22.showDialog(alertDialog$Builder.f20374a);
                                    ok okVar = znVar22.Y;
                                    if (okVar != null) {
                                        okVar.a1(null, null, false);
                                        znVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                zn znVar32 = znVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.ad.a(znVar32)) {
                                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(znVar32);
                                            if (!znVar32.K9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                zn znVar5 = this.f40778b;
                if (tL_error != null) {
                    znVar5.getClass();
                    return;
                } else {
                    znVar5.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                zn.e1(this.f40778b, tLObject);
                return;
        }
    }
}
