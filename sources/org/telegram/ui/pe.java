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
    public final int f39456a;
    public final yn f39457b;

    public pe(yn ynVar, int i10) {
        this.f39456a = i10;
        this.f39457b = ynVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39456a) {
            case 0:
                final yn ynVar = this.f39457b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                yn.C0(ynVar, tLObject);
                                return;
                            case 1:
                                yn.G0(ynVar, tLObject);
                                return;
                            case 2:
                                yn ynVar2 = ynVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(ynVar2)) {
                                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar2);
                                            if (!ynVar2.E9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                yn ynVar3 = ynVar;
                                TLObject tLObject3 = tLObject;
                                ynVar3.f43416m5 = 0;
                                if (tLObject3 == null && ynVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar3.getParentActivity(), 0, ynVar3.f43299ca);
                                    alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    ynVar3.showDialog(alertDialog$Builder.f20367a);
                                    jk jkVar = ynVar3.W;
                                    if (jkVar != null) {
                                        jkVar.b1(null, null, false);
                                        ynVar3.f9(true);
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
                final yn ynVar2 = this.f39457b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                yn.C0(ynVar2, tLObject);
                                return;
                            case 1:
                                yn.G0(ynVar2, tLObject);
                                return;
                            case 2:
                                yn ynVar22 = ynVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(ynVar22)) {
                                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar22);
                                            if (!ynVar22.E9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                yn ynVar3 = ynVar2;
                                TLObject tLObject3 = tLObject;
                                ynVar3.f43416m5 = 0;
                                if (tLObject3 == null && ynVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar3.getParentActivity(), 0, ynVar3.f43299ca);
                                    alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    ynVar3.showDialog(alertDialog$Builder.f20367a);
                                    jk jkVar = ynVar3.W;
                                    if (jkVar != null) {
                                        jkVar.b1(null, null, false);
                                        ynVar3.f9(true);
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
                final yn ynVar3 = this.f39457b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                yn.C0(ynVar3, tLObject);
                                return;
                            case 1:
                                yn.G0(ynVar3, tLObject);
                                return;
                            case 2:
                                yn ynVar22 = ynVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(ynVar22)) {
                                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar22);
                                            if (!ynVar22.E9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                yn ynVar32 = ynVar3;
                                TLObject tLObject3 = tLObject;
                                ynVar32.f43416m5 = 0;
                                if (tLObject3 == null && ynVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar32.getParentActivity(), 0, ynVar32.f43299ca);
                                    alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    ynVar32.showDialog(alertDialog$Builder.f20367a);
                                    jk jkVar = ynVar32.W;
                                    if (jkVar != null) {
                                        jkVar.b1(null, null, false);
                                        ynVar32.f9(true);
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
                final yn ynVar4 = this.f39457b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                yn.C0(ynVar4, tLObject);
                                return;
                            case 1:
                                yn.G0(ynVar4, tLObject);
                                return;
                            case 2:
                                yn ynVar22 = ynVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.yc.a(ynVar22)) {
                                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar22);
                                            if (!ynVar22.E9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                yn ynVar32 = ynVar4;
                                TLObject tLObject3 = tLObject;
                                ynVar32.f43416m5 = 0;
                                if (tLObject3 == null && ynVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar32.getParentActivity(), 0, ynVar32.f43299ca);
                                    alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    ynVar32.showDialog(alertDialog$Builder.f20367a);
                                    jk jkVar = ynVar32.W;
                                    if (jkVar != null) {
                                        jkVar.b1(null, null, false);
                                        ynVar32.f9(true);
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
                yn ynVar5 = this.f39457b;
                if (tL_error != null) {
                    ynVar5.getClass();
                    return;
                } else {
                    ynVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                yn.Y0(this.f39457b, tLObject);
                return;
        }
    }
}
