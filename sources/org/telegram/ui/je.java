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
public final class je implements RequestDelegate {
    public final int f39451a;
    public final qn f39452b;

    public je(qn qnVar, int i9) {
        this.f39451a = i9;
        this.f39452b = qnVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39451a) {
            case 0:
                final qn qnVar = this.f39452b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                qn.F0(qnVar, tLObject);
                                return;
                            case 1:
                                qn.K0(qnVar, tLObject);
                                return;
                            case 2:
                                qn qnVar2 = qnVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.oc.a(qnVar2)) {
                                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar2);
                                            if (!qnVar2.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                qn qnVar3 = qnVar;
                                TLObject tLObject3 = tLObject;
                                qnVar3.f41971k5 = 0;
                                if (tLObject3 == null && qnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar3.getParentActivity(), 0, qnVar3.f41848aa);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar3.showDialog(alertDialog$Builder.f22702a);
                                    ak akVar = qnVar3.U;
                                    if (akVar != null) {
                                        akVar.c1(null, null, false);
                                        qnVar3.e9(true);
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
                final qn qnVar2 = this.f39452b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                qn.F0(qnVar2, tLObject);
                                return;
                            case 1:
                                qn.K0(qnVar2, tLObject);
                                return;
                            case 2:
                                qn qnVar22 = qnVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.oc.a(qnVar22)) {
                                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar22);
                                            if (!qnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                qn qnVar3 = qnVar2;
                                TLObject tLObject3 = tLObject;
                                qnVar3.f41971k5 = 0;
                                if (tLObject3 == null && qnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar3.getParentActivity(), 0, qnVar3.f41848aa);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar3.showDialog(alertDialog$Builder.f22702a);
                                    ak akVar = qnVar3.U;
                                    if (akVar != null) {
                                        akVar.c1(null, null, false);
                                        qnVar3.e9(true);
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
                final qn qnVar3 = this.f39452b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                qn.F0(qnVar3, tLObject);
                                return;
                            case 1:
                                qn.K0(qnVar3, tLObject);
                                return;
                            case 2:
                                qn qnVar22 = qnVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.oc.a(qnVar22)) {
                                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar22);
                                            if (!qnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                qn qnVar32 = qnVar3;
                                TLObject tLObject3 = tLObject;
                                qnVar32.f41971k5 = 0;
                                if (tLObject3 == null && qnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar32.getParentActivity(), 0, qnVar32.f41848aa);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar32.showDialog(alertDialog$Builder.f22702a);
                                    ak akVar = qnVar32.U;
                                    if (akVar != null) {
                                        akVar.c1(null, null, false);
                                        qnVar32.e9(true);
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
                final qn qnVar4 = this.f39452b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                qn.F0(qnVar4, tLObject);
                                return;
                            case 1:
                                qn.K0(qnVar4, tLObject);
                                return;
                            case 2:
                                qn qnVar22 = qnVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.oc.a(qnVar22)) {
                                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar22);
                                            if (!qnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                qn qnVar32 = qnVar4;
                                TLObject tLObject3 = tLObject;
                                qnVar32.f41971k5 = 0;
                                if (tLObject3 == null && qnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar32.getParentActivity(), 0, qnVar32.f41848aa);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    qnVar32.showDialog(alertDialog$Builder.f22702a);
                                    ak akVar = qnVar32.U;
                                    if (akVar != null) {
                                        akVar.c1(null, null, false);
                                        qnVar32.e9(true);
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
                qn qnVar5 = this.f39452b;
                if (tL_error != null) {
                    qnVar5.getClass();
                    return;
                } else {
                    qnVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                qn.Z0(this.f39452b, tLObject);
                return;
        }
    }
}
