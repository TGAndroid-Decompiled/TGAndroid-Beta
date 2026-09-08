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
    public final int f39508a;
    public final co f39509b;

    public pe(co coVar, int i10) {
        this.f39508a = i10;
        this.f39509b = coVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39508a) {
            case 0:
                final co coVar = this.f39509b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                co.G0(coVar, tLObject);
                                return;
                            case 1:
                                co.K0(coVar, tLObject);
                                return;
                            case 2:
                                co coVar2 = coVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(coVar2)) {
                                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar2);
                                            if (!coVar2.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                co coVar3 = coVar;
                                TLObject tLObject3 = tLObject;
                                coVar3.f35390o5 = 0;
                                if (tLObject3 == null && coVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar3.getParentActivity(), 0, coVar3.f35274ea);
                                    alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    coVar3.showDialog(alertDialog$Builder.f20225a);
                                    mk mkVar = coVar3.Y;
                                    if (mkVar != null) {
                                        mkVar.c1(null, null, false);
                                        coVar3.e9(true);
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
                final co coVar2 = this.f39509b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                co.G0(coVar2, tLObject);
                                return;
                            case 1:
                                co.K0(coVar2, tLObject);
                                return;
                            case 2:
                                co coVar22 = coVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(coVar22)) {
                                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar22);
                                            if (!coVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                co coVar3 = coVar2;
                                TLObject tLObject3 = tLObject;
                                coVar3.f35390o5 = 0;
                                if (tLObject3 == null && coVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar3.getParentActivity(), 0, coVar3.f35274ea);
                                    alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    coVar3.showDialog(alertDialog$Builder.f20225a);
                                    mk mkVar = coVar3.Y;
                                    if (mkVar != null) {
                                        mkVar.c1(null, null, false);
                                        coVar3.e9(true);
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
                final co coVar3 = this.f39509b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                co.G0(coVar3, tLObject);
                                return;
                            case 1:
                                co.K0(coVar3, tLObject);
                                return;
                            case 2:
                                co coVar22 = coVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(coVar22)) {
                                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar22);
                                            if (!coVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                co coVar32 = coVar3;
                                TLObject tLObject3 = tLObject;
                                coVar32.f35390o5 = 0;
                                if (tLObject3 == null && coVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar32.getParentActivity(), 0, coVar32.f35274ea);
                                    alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    coVar32.showDialog(alertDialog$Builder.f20225a);
                                    mk mkVar = coVar32.Y;
                                    if (mkVar != null) {
                                        mkVar.c1(null, null, false);
                                        coVar32.e9(true);
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
                final co coVar4 = this.f39509b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                co.G0(coVar4, tLObject);
                                return;
                            case 1:
                                co.K0(coVar4, tLObject);
                                return;
                            case 2:
                                co coVar22 = coVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(coVar22)) {
                                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar22);
                                            if (!coVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                co coVar32 = coVar4;
                                TLObject tLObject3 = tLObject;
                                coVar32.f35390o5 = 0;
                                if (tLObject3 == null && coVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar32.getParentActivity(), 0, coVar32.f35274ea);
                                    alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    coVar32.showDialog(alertDialog$Builder.f20225a);
                                    mk mkVar = coVar32.Y;
                                    if (mkVar != null) {
                                        mkVar.c1(null, null, false);
                                        coVar32.e9(true);
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
                co coVar5 = this.f39509b;
                if (tL_error != null) {
                    coVar5.getClass();
                    return;
                } else {
                    coVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                co.Z0(this.f39509b, tLObject);
                return;
        }
    }
}
