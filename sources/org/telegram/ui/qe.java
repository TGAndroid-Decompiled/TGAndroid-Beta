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
public final class qe implements RequestDelegate {
    public final int f37397a;
    public final zn f37398b;

    public qe(zn znVar, int i10) {
        this.f37397a = i10;
        this.f37398b = znVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37397a) {
            case 0:
                final zn znVar = this.f37398b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                zn.G0(znVar, tLObject);
                                return;
                            case 1:
                                zn.K0(znVar, tLObject);
                                return;
                            case 2:
                                zn znVar2 = znVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(znVar2)) {
                                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar2);
                                            if (!znVar2.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            a02.k(z4).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                            default:
                                zn znVar3 = znVar;
                                TLObject tLObject3 = tLObject;
                                znVar3.f40654l5 = 0;
                                if (tLObject3 == null && znVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar3.getParentActivity(), 0, znVar3.f40534ba);
                                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar3.showDialog(alertDialog$Builder.f19478a);
                                    lk lkVar = znVar3.V;
                                    if (lkVar != null) {
                                        lkVar.c1(null, null, false);
                                        znVar3.e9(true);
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
                final zn znVar2 = this.f37398b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                zn.G0(znVar2, tLObject);
                                return;
                            case 1:
                                zn.K0(znVar2, tLObject);
                                return;
                            case 2:
                                zn znVar22 = znVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(znVar22)) {
                                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar22);
                                            if (!znVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            a02.k(z4).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                            default:
                                zn znVar3 = znVar2;
                                TLObject tLObject3 = tLObject;
                                znVar3.f40654l5 = 0;
                                if (tLObject3 == null && znVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar3.getParentActivity(), 0, znVar3.f40534ba);
                                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar3.showDialog(alertDialog$Builder.f19478a);
                                    lk lkVar = znVar3.V;
                                    if (lkVar != null) {
                                        lkVar.c1(null, null, false);
                                        znVar3.e9(true);
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
                final zn znVar3 = this.f37398b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                zn.G0(znVar3, tLObject);
                                return;
                            case 1:
                                zn.K0(znVar3, tLObject);
                                return;
                            case 2:
                                zn znVar22 = znVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(znVar22)) {
                                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar22);
                                            if (!znVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            a02.k(z4).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                            default:
                                zn znVar32 = znVar3;
                                TLObject tLObject3 = tLObject;
                                znVar32.f40654l5 = 0;
                                if (tLObject3 == null && znVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar32.getParentActivity(), 0, znVar32.f40534ba);
                                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar32.showDialog(alertDialog$Builder.f19478a);
                                    lk lkVar = znVar32.V;
                                    if (lkVar != null) {
                                        lkVar.c1(null, null, false);
                                        znVar32.e9(true);
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
                final zn znVar4 = this.f37398b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z4;
                        switch (r3) {
                            case 0:
                                zn.G0(znVar4, tLObject);
                                return;
                            case 1:
                                zn.K0(znVar4, tLObject);
                                return;
                            case 2:
                                zn znVar22 = znVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.qc.a(znVar22)) {
                                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar22);
                                            if (!znVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            a02.k(z4).j();
                                            return;
                                        }
                                        return;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                return;
                            default:
                                zn znVar32 = znVar4;
                                TLObject tLObject3 = tLObject;
                                znVar32.f40654l5 = 0;
                                if (tLObject3 == null && znVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar32.getParentActivity(), 0, znVar32.f40534ba);
                                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    znVar32.showDialog(alertDialog$Builder.f19478a);
                                    lk lkVar = znVar32.V;
                                    if (lkVar != null) {
                                        lkVar.c1(null, null, false);
                                        znVar32.e9(true);
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
                zn znVar5 = this.f37398b;
                if (tL_error != null) {
                    znVar5.getClass();
                    return;
                } else {
                    znVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                zn.Z0(this.f37398b, tLObject);
                return;
        }
    }
}
