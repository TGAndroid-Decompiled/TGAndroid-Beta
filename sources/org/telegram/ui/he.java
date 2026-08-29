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
public final class he implements RequestDelegate {
    public final int f38883a;
    public final tn f38884b;

    public he(tn tnVar, int i10) {
        this.f38883a = i10;
        this.f38884b = tnVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38883a) {
            case 0:
                final tn tnVar = this.f38884b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                tn.G0(tnVar, tLObject);
                                return;
                            case 1:
                                tn.K0(tnVar, tLObject);
                                return;
                            case 2:
                                tn tnVar2 = tnVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.tc.a(tnVar2)) {
                                            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar2);
                                            if (!tnVar2.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                return;
                            default:
                                tn tnVar3 = tnVar;
                                TLObject tLObject3 = tLObject;
                                tnVar3.f42869k5 = 0;
                                if (tLObject3 == null && tnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar3.getParentActivity(), 0, tnVar3.f42746aa);
                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    tnVar3.showDialog(alertDialog$Builder.f22714a);
                                    dk dkVar = tnVar3.U;
                                    if (dkVar != null) {
                                        dkVar.c1(null, null, false);
                                        tnVar3.e9(true);
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
                final tn tnVar2 = this.f38884b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                tn.G0(tnVar2, tLObject);
                                return;
                            case 1:
                                tn.K0(tnVar2, tLObject);
                                return;
                            case 2:
                                tn tnVar22 = tnVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.tc.a(tnVar22)) {
                                            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar22);
                                            if (!tnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                return;
                            default:
                                tn tnVar3 = tnVar2;
                                TLObject tLObject3 = tLObject;
                                tnVar3.f42869k5 = 0;
                                if (tLObject3 == null && tnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar3.getParentActivity(), 0, tnVar3.f42746aa);
                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    tnVar3.showDialog(alertDialog$Builder.f22714a);
                                    dk dkVar = tnVar3.U;
                                    if (dkVar != null) {
                                        dkVar.c1(null, null, false);
                                        tnVar3.e9(true);
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
                final tn tnVar3 = this.f38884b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                tn.G0(tnVar3, tLObject);
                                return;
                            case 1:
                                tn.K0(tnVar3, tLObject);
                                return;
                            case 2:
                                tn tnVar22 = tnVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.tc.a(tnVar22)) {
                                            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar22);
                                            if (!tnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                return;
                            default:
                                tn tnVar32 = tnVar3;
                                TLObject tLObject3 = tLObject;
                                tnVar32.f42869k5 = 0;
                                if (tLObject3 == null && tnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar32.getParentActivity(), 0, tnVar32.f42746aa);
                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    tnVar32.showDialog(alertDialog$Builder.f22714a);
                                    dk dkVar = tnVar32.U;
                                    if (dkVar != null) {
                                        dkVar.c1(null, null, false);
                                        tnVar32.e9(true);
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
                final tn tnVar4 = this.f38884b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                tn.G0(tnVar4, tLObject);
                                return;
                            case 1:
                                tn.K0(tnVar4, tLObject);
                                return;
                            case 2:
                                tn tnVar22 = tnVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.tc.a(tnVar22)) {
                                            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar22);
                                            if (!tnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            a02.k(z10).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        return;
                                    }
                                }
                                return;
                            default:
                                tn tnVar32 = tnVar4;
                                TLObject tLObject3 = tLObject;
                                tnVar32.f42869k5 = 0;
                                if (tLObject3 == null && tnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar32.getParentActivity(), 0, tnVar32.f42746aa);
                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    tnVar32.showDialog(alertDialog$Builder.f22714a);
                                    dk dkVar = tnVar32.U;
                                    if (dkVar != null) {
                                        dkVar.c1(null, null, false);
                                        tnVar32.e9(true);
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
                tn tnVar5 = this.f38884b;
                if (tL_error != null) {
                    tnVar5.getClass();
                    return;
                } else {
                    tnVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                tn.Z0(this.f38884b, tLObject);
                return;
        }
    }
}
