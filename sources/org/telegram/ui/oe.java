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
    public final int f42069a;
    public final wn f42070b;

    public oe(wn wnVar, int i10) {
        this.f42069a = i10;
        this.f42070b = wnVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42069a) {
            case 0:
                final wn wnVar = this.f42070b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                wn.X0(wnVar, tLObject);
                                return;
                            case 1:
                                wn.k0(wnVar, tLObject);
                                return;
                            case 2:
                                wn wnVar2 = wnVar;
                                TLObject tLObject2 = tLObject;
                                wnVar2.E5 = 0;
                                if (tLObject2 == null && wnVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar2.getParentActivity(), 0, wnVar2.f45309ua);
                                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar2.showDialog(alertDialog$Builder.f22369a);
                                    jk jkVar = wnVar2.Y;
                                    if (jkVar != null) {
                                        jkVar.Y0(null, null, false);
                                        wnVar2.r9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                wn wnVar3 = wnVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(wnVar3)) {
                                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar3);
                                            if (!wnVar3.R9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                final wn wnVar2 = this.f42070b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                wn.X0(wnVar2, tLObject);
                                return;
                            case 1:
                                wn.k0(wnVar2, tLObject);
                                return;
                            case 2:
                                wn wnVar22 = wnVar2;
                                TLObject tLObject2 = tLObject;
                                wnVar22.E5 = 0;
                                if (tLObject2 == null && wnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar22.getParentActivity(), 0, wnVar22.f45309ua);
                                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar22.showDialog(alertDialog$Builder.f22369a);
                                    jk jkVar = wnVar22.Y;
                                    if (jkVar != null) {
                                        jkVar.Y0(null, null, false);
                                        wnVar22.r9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                wn wnVar3 = wnVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(wnVar3)) {
                                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar3);
                                            if (!wnVar3.R9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                final wn wnVar3 = this.f42070b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                wn.X0(wnVar3, tLObject);
                                return;
                            case 1:
                                wn.k0(wnVar3, tLObject);
                                return;
                            case 2:
                                wn wnVar22 = wnVar3;
                                TLObject tLObject2 = tLObject;
                                wnVar22.E5 = 0;
                                if (tLObject2 == null && wnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar22.getParentActivity(), 0, wnVar22.f45309ua);
                                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar22.showDialog(alertDialog$Builder.f22369a);
                                    jk jkVar = wnVar22.Y;
                                    if (jkVar != null) {
                                        jkVar.Y0(null, null, false);
                                        wnVar22.r9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                wn wnVar32 = wnVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(wnVar32)) {
                                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar32);
                                            if (!wnVar32.R9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                final wn wnVar4 = this.f42070b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                wn.X0(wnVar4, tLObject);
                                return;
                            case 1:
                                wn.k0(wnVar4, tLObject);
                                return;
                            case 2:
                                wn wnVar22 = wnVar4;
                                TLObject tLObject2 = tLObject;
                                wnVar22.E5 = 0;
                                if (tLObject2 == null && wnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar22.getParentActivity(), 0, wnVar22.f45309ua);
                                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar22.showDialog(alertDialog$Builder.f22369a);
                                    jk jkVar = wnVar22.Y;
                                    if (jkVar != null) {
                                        jkVar.Y0(null, null, false);
                                        wnVar22.r9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                wn wnVar32 = wnVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.wc.a(wnVar32)) {
                                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar32);
                                            if (!wnVar32.R9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                wn wnVar5 = this.f42070b;
                if (tL_error != null) {
                    wnVar5.getClass();
                    return;
                } else {
                    wnVar5.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                wn.n1(this.f42070b, tLObject);
                return;
        }
    }
}
