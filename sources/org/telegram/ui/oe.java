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
public final class oe implements RequestDelegate {
    public final int f42166a;
    public final un f42167b;

    public oe(un unVar, int i10) {
        this.f42166a = i10;
        this.f42167b = unVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42166a) {
            case 0:
                final un unVar = this.f42167b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                un.O0(unVar, tLObject);
                                return;
                            case 1:
                                un.y0(unVar, tLObject);
                                return;
                            case 2:
                                un unVar2 = unVar;
                                TLObject tLObject2 = tLObject;
                                unVar2.A5 = 0;
                                if (tLObject2 == null && unVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar2.getParentActivity(), 0, unVar2.f44388qa);
                                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    unVar2.showDialog(alertDialog$Builder.f22368a);
                                    hk hkVar = unVar2.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        unVar2.o9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                un unVar3 = unVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(unVar3)) {
                                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar3);
                                            if (!unVar3.O9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            b02.k(z10).j();
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
                final un unVar2 = this.f42167b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                un.O0(unVar2, tLObject);
                                return;
                            case 1:
                                un.y0(unVar2, tLObject);
                                return;
                            case 2:
                                un unVar22 = unVar2;
                                TLObject tLObject2 = tLObject;
                                unVar22.A5 = 0;
                                if (tLObject2 == null && unVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar22.getParentActivity(), 0, unVar22.f44388qa);
                                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    unVar22.showDialog(alertDialog$Builder.f22368a);
                                    hk hkVar = unVar22.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        unVar22.o9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                un unVar3 = unVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(unVar3)) {
                                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar3);
                                            if (!unVar3.O9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            b02.k(z10).j();
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
                final un unVar3 = this.f42167b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                un.O0(unVar3, tLObject);
                                return;
                            case 1:
                                un.y0(unVar3, tLObject);
                                return;
                            case 2:
                                un unVar22 = unVar3;
                                TLObject tLObject2 = tLObject;
                                unVar22.A5 = 0;
                                if (tLObject2 == null && unVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar22.getParentActivity(), 0, unVar22.f44388qa);
                                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    unVar22.showDialog(alertDialog$Builder.f22368a);
                                    hk hkVar = unVar22.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        unVar22.o9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                un unVar32 = unVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(unVar32)) {
                                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar32);
                                            if (!unVar32.O9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            b02.k(z10).j();
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
                final un unVar4 = this.f42167b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                un.O0(unVar4, tLObject);
                                return;
                            case 1:
                                un.y0(unVar4, tLObject);
                                return;
                            case 2:
                                un unVar22 = unVar4;
                                TLObject tLObject2 = tLObject;
                                unVar22.A5 = 0;
                                if (tLObject2 == null && unVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar22.getParentActivity(), 0, unVar22.f44388qa);
                                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    unVar22.showDialog(alertDialog$Builder.f22368a);
                                    hk hkVar = unVar22.Y;
                                    if (hkVar != null) {
                                        hkVar.Z0(null, null, false);
                                        unVar22.o9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                un unVar32 = unVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(unVar32)) {
                                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar32);
                                            if (!unVar32.O9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            b02.k(z10).j();
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
                un unVar5 = this.f42167b;
                if (tL_error != null) {
                    unVar5.getClass();
                    return;
                } else {
                    unVar5.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                un.f1(this.f42167b, tLObject);
                return;
        }
    }
}
