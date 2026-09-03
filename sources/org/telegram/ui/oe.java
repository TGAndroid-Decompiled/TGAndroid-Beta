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
    public final int f39673a;
    public final xn f39674b;

    public oe(xn xnVar, int i10) {
        this.f39673a = i10;
        this.f39674b = xnVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39673a) {
            case 0:
                final xn xnVar = this.f39674b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                xn.G0(xnVar, tLObject);
                                return;
                            case 1:
                                xn.K0(xnVar, tLObject);
                                return;
                            case 2:
                                xn xnVar2 = xnVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(xnVar2)) {
                                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar2);
                                            if (!xnVar2.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            a02.k(z4).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                        return;
                                    }
                                }
                                return;
                            default:
                                xn xnVar3 = xnVar;
                                TLObject tLObject3 = tLObject;
                                xnVar3.f43235l5 = 0;
                                if (tLObject3 == null && xnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar3.getParentActivity(), 0, xnVar3.f43114ba);
                                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    xnVar3.showDialog(alertDialog$Builder.f21168a);
                                    jk jkVar = xnVar3.V;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        xnVar3.e9(true);
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
                final xn xnVar2 = this.f39674b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                xn.G0(xnVar2, tLObject);
                                return;
                            case 1:
                                xn.K0(xnVar2, tLObject);
                                return;
                            case 2:
                                xn xnVar22 = xnVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(xnVar22)) {
                                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar22);
                                            if (!xnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            a02.k(z4).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                        return;
                                    }
                                }
                                return;
                            default:
                                xn xnVar3 = xnVar2;
                                TLObject tLObject3 = tLObject;
                                xnVar3.f43235l5 = 0;
                                if (tLObject3 == null && xnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar3.getParentActivity(), 0, xnVar3.f43114ba);
                                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    xnVar3.showDialog(alertDialog$Builder.f21168a);
                                    jk jkVar = xnVar3.V;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        xnVar3.e9(true);
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
                final xn xnVar3 = this.f39674b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                xn.G0(xnVar3, tLObject);
                                return;
                            case 1:
                                xn.K0(xnVar3, tLObject);
                                return;
                            case 2:
                                xn xnVar22 = xnVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(xnVar22)) {
                                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar22);
                                            if (!xnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            a02.k(z4).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                        return;
                                    }
                                }
                                return;
                            default:
                                xn xnVar32 = xnVar3;
                                TLObject tLObject3 = tLObject;
                                xnVar32.f43235l5 = 0;
                                if (tLObject3 == null && xnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar32.getParentActivity(), 0, xnVar32.f43114ba);
                                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    xnVar32.showDialog(alertDialog$Builder.f21168a);
                                    jk jkVar = xnVar32.V;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        xnVar32.e9(true);
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
                final xn xnVar4 = this.f39674b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                xn.G0(xnVar4, tLObject);
                                return;
                            case 1:
                                xn.K0(xnVar4, tLObject);
                                return;
                            case 2:
                                xn xnVar22 = xnVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(xnVar22)) {
                                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar22);
                                            if (!xnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            a02.k(z4).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                        return;
                                    }
                                }
                                return;
                            default:
                                xn xnVar32 = xnVar4;
                                TLObject tLObject3 = tLObject;
                                xnVar32.f43235l5 = 0;
                                if (tLObject3 == null && xnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar32.getParentActivity(), 0, xnVar32.f43114ba);
                                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    xnVar32.showDialog(alertDialog$Builder.f21168a);
                                    jk jkVar = xnVar32.V;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        xnVar32.e9(true);
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
                xn xnVar5 = this.f39674b;
                if (tL_error != null) {
                    xnVar5.getClass();
                    return;
                } else {
                    xnVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                xn.Z0(this.f39674b, tLObject);
                return;
        }
    }
}
