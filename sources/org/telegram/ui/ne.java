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
public final class ne implements RequestDelegate {
    public final int f39554a;
    public final qn f39555b;

    public ne(qn qnVar, int i10) {
        this.f39554a = i10;
        this.f39555b = qnVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39554a) {
            case 0:
                final qn qnVar = this.f39555b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                qn.l1(qnVar, tLObject);
                                return;
                            case 1:
                                qn.V0(qnVar, tLObject);
                                return;
                            case 2:
                                qn qnVar2 = qnVar;
                                TLObject tLObject2 = tLObject;
                                qnVar2.f40795o5 = 0;
                                if (tLObject2 == null && qnVar2.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar2.getParentActivity(), 0, qnVar2.f40676ea);
                                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar2.showDialog(alertDialog$Builder.f20608a);
                                    fk fkVar = qnVar2.Y;
                                    if (fkVar != null) {
                                        fkVar.Z0(null, null, false);
                                        qnVar2.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                qn qnVar3 = qnVar;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(qnVar3)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar3);
                                            if (!qnVar3.K9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                final qn qnVar2 = this.f39555b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                qn.l1(qnVar2, tLObject);
                                return;
                            case 1:
                                qn.V0(qnVar2, tLObject);
                                return;
                            case 2:
                                qn qnVar22 = qnVar2;
                                TLObject tLObject2 = tLObject;
                                qnVar22.f40795o5 = 0;
                                if (tLObject2 == null && qnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar22.getParentActivity(), 0, qnVar22.f40676ea);
                                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar22.showDialog(alertDialog$Builder.f20608a);
                                    fk fkVar = qnVar22.Y;
                                    if (fkVar != null) {
                                        fkVar.Z0(null, null, false);
                                        qnVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                qn qnVar3 = qnVar2;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(qnVar3)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar3);
                                            if (!qnVar3.K9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                final qn qnVar3 = this.f39555b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                qn.l1(qnVar3, tLObject);
                                return;
                            case 1:
                                qn.V0(qnVar3, tLObject);
                                return;
                            case 2:
                                qn qnVar22 = qnVar3;
                                TLObject tLObject2 = tLObject;
                                qnVar22.f40795o5 = 0;
                                if (tLObject2 == null && qnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar22.getParentActivity(), 0, qnVar22.f40676ea);
                                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar22.showDialog(alertDialog$Builder.f20608a);
                                    fk fkVar = qnVar22.Y;
                                    if (fkVar != null) {
                                        fkVar.Z0(null, null, false);
                                        qnVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                qn qnVar32 = qnVar3;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(qnVar32)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar32);
                                            if (!qnVar32.K9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                final qn qnVar4 = this.f39555b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                qn.l1(qnVar4, tLObject);
                                return;
                            case 1:
                                qn.V0(qnVar4, tLObject);
                                return;
                            case 2:
                                qn qnVar22 = qnVar4;
                                TLObject tLObject2 = tLObject;
                                qnVar22.f40795o5 = 0;
                                if (tLObject2 == null && qnVar22.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar22.getParentActivity(), 0, qnVar22.f40676ea);
                                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar22.showDialog(alertDialog$Builder.f20608a);
                                    fk fkVar = qnVar22.Y;
                                    if (fkVar != null) {
                                        fkVar.Z0(null, null, false);
                                        qnVar22.j9(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                qn qnVar32 = qnVar4;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject3;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(qnVar32)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar32);
                                            if (!qnVar32.K9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                qn qnVar5 = this.f39555b;
                if (tL_error != null) {
                    qnVar5.getClass();
                    return;
                } else {
                    qnVar5.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                qn.e1(this.f39555b, tLObject);
                return;
        }
    }
}
