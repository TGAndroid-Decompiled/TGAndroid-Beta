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
    public final int f36907a;
    public final bo f36908b;

    public qe(bo boVar, int i10) {
        this.f36907a = i10;
        this.f36908b = boVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36907a) {
            case 0:
                final bo boVar = this.f36908b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                bo.G0(boVar, tLObject);
                                return;
                            case 1:
                                bo.K0(boVar, tLObject);
                                return;
                            case 2:
                                bo boVar2 = boVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.vc.a(boVar2)) {
                                            org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar2);
                                            if (!boVar2.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                bo boVar3 = boVar;
                                TLObject tLObject3 = tLObject;
                                boVar3.f32396o5 = 0;
                                if (tLObject3 == null && boVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar3.getParentActivity(), 0, boVar3.f32279ea);
                                    alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    boVar3.showDialog(alertDialog$Builder.f18447a);
                                    nk nkVar = boVar3.Y;
                                    if (nkVar != null) {
                                        nkVar.c1(null, null, false);
                                        boVar3.e9(true);
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
                final bo boVar2 = this.f36908b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                bo.G0(boVar2, tLObject);
                                return;
                            case 1:
                                bo.K0(boVar2, tLObject);
                                return;
                            case 2:
                                bo boVar22 = boVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.vc.a(boVar22)) {
                                            org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar22);
                                            if (!boVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                bo boVar3 = boVar2;
                                TLObject tLObject3 = tLObject;
                                boVar3.f32396o5 = 0;
                                if (tLObject3 == null && boVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar3.getParentActivity(), 0, boVar3.f32279ea);
                                    alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    boVar3.showDialog(alertDialog$Builder.f18447a);
                                    nk nkVar = boVar3.Y;
                                    if (nkVar != null) {
                                        nkVar.c1(null, null, false);
                                        boVar3.e9(true);
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
                final bo boVar3 = this.f36908b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                bo.G0(boVar3, tLObject);
                                return;
                            case 1:
                                bo.K0(boVar3, tLObject);
                                return;
                            case 2:
                                bo boVar22 = boVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.vc.a(boVar22)) {
                                            org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar22);
                                            if (!boVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                bo boVar32 = boVar3;
                                TLObject tLObject3 = tLObject;
                                boVar32.f32396o5 = 0;
                                if (tLObject3 == null && boVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar32.getParentActivity(), 0, boVar32.f32279ea);
                                    alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    boVar32.showDialog(alertDialog$Builder.f18447a);
                                    nk nkVar = boVar32.Y;
                                    if (nkVar != null) {
                                        nkVar.c1(null, null, false);
                                        boVar32.e9(true);
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
                final bo boVar4 = this.f36908b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                bo.G0(boVar4, tLObject);
                                return;
                            case 1:
                                bo.K0(boVar4, tLObject);
                                return;
                            case 2:
                                bo boVar22 = boVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.vc.a(boVar22)) {
                                            org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar22);
                                            if (!boVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                            default:
                                bo boVar32 = boVar4;
                                TLObject tLObject3 = tLObject;
                                boVar32.f32396o5 = 0;
                                if (tLObject3 == null && boVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar32.getParentActivity(), 0, boVar32.f32279ea);
                                    alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    boVar32.showDialog(alertDialog$Builder.f18447a);
                                    nk nkVar = boVar32.Y;
                                    if (nkVar != null) {
                                        nkVar.c1(null, null, false);
                                        boVar32.e9(true);
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
                bo boVar5 = this.f36908b;
                if (tL_error != null) {
                    boVar5.getClass();
                    return;
                } else {
                    boVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                bo.Z0(this.f36908b, tLObject);
                return;
        }
    }
}
