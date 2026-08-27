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

    public final int f39348a;

    public final rn f39349b;

    public je(rn rnVar, int i10) {
        this.f39348a = i10;
        this.f39349b = rnVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39348a) {
            case 0:
                final int i10 = 0;
                final rn rnVar = this.f39349b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                rn.G0(rnVar, tLObject);
                                break;
                            case 1:
                                rn.K0(rnVar, tLObject);
                                break;
                            case 2:
                                rn rnVar2 = rnVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.mc.a(rnVar2)) {
                                            org.telegram.ui.Components.mc.a0(rnVar2).k(!rnVar2.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                        }
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                        return;
                                    }
                                }
                                break;
                            default:
                                rn rnVar3 = rnVar;
                                TLObject tLObject3 = tLObject;
                                rnVar3.f42108k5 = 0;
                                if (tLObject3 == null && rnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar3.getParentActivity(), 0, rnVar3.f41983aa);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    rnVar3.showDialog(alertDialog$Builder.f22702a);
                                    ck ckVar = rnVar3.U;
                                    if (ckVar != null) {
                                        ckVar.b1(null, null, false);
                                        rnVar3.e9(true);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final rn rnVar2 = this.f39349b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                rn.G0(rnVar2, tLObject);
                                break;
                            case 1:
                                rn.K0(rnVar2, tLObject);
                                break;
                            case 2:
                                rn rnVar3 = rnVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.mc.a(rnVar3)) {
                                            org.telegram.ui.Components.mc.a0(rnVar3).k(!rnVar3.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                        }
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                        return;
                                    }
                                }
                                break;
                            default:
                                rn rnVar4 = rnVar2;
                                TLObject tLObject3 = tLObject;
                                rnVar4.f42108k5 = 0;
                                if (tLObject3 == null && rnVar4.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar4.getParentActivity(), 0, rnVar4.f41983aa);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    rnVar4.showDialog(alertDialog$Builder.f22702a);
                                    ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.b1(null, null, false);
                                        rnVar4.e9(true);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i12 = 2;
                final rn rnVar3 = this.f39349b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                rn.G0(rnVar3, tLObject);
                                break;
                            case 1:
                                rn.K0(rnVar3, tLObject);
                                break;
                            case 2:
                                rn rnVar4 = rnVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.mc.a(rnVar4)) {
                                            org.telegram.ui.Components.mc.a0(rnVar4).k(!rnVar4.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                        }
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                        return;
                                    }
                                }
                                break;
                            default:
                                rn rnVar5 = rnVar3;
                                TLObject tLObject3 = tLObject;
                                rnVar5.f42108k5 = 0;
                                if (tLObject3 == null && rnVar5.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar5.getParentActivity(), 0, rnVar5.f41983aa);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    rnVar5.showDialog(alertDialog$Builder.f22702a);
                                    ck ckVar = rnVar5.U;
                                    if (ckVar != null) {
                                        ckVar.b1(null, null, false);
                                        rnVar5.e9(true);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i13 = 3;
                final rn rnVar4 = this.f39349b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i13) {
                            case 0:
                                rn.G0(rnVar4, tLObject);
                                break;
                            case 1:
                                rn.K0(rnVar4, tLObject);
                                break;
                            case 2:
                                rn rnVar5 = rnVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.mc.a(rnVar5)) {
                                            org.telegram.ui.Components.mc.a0(rnVar5).k(!rnVar5.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                        }
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                        return;
                                    }
                                }
                                break;
                            default:
                                rn rnVar6 = rnVar4;
                                TLObject tLObject3 = tLObject;
                                rnVar6.f42108k5 = 0;
                                if (tLObject3 == null && rnVar6.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar6.getParentActivity(), 0, rnVar6.f41983aa);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    rnVar6.showDialog(alertDialog$Builder.f22702a);
                                    ck ckVar = rnVar6.U;
                                    if (ckVar != null) {
                                        ckVar.b1(null, null, false);
                                        rnVar6.e9(true);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                rn rnVar5 = this.f39349b;
                if (tL_error == null) {
                    rnVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                } else {
                    rnVar5.getClass();
                }
                break;
            default:
                rn.Z0(this.f39349b, tLObject);
                break;
        }
    }
}
