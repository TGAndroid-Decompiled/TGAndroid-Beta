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
    public final int f36221a;
    public final wn f36222b;

    public oe(wn wnVar, int i10) {
        this.f36221a = i10;
        this.f36222b = wnVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36221a) {
            case 0:
                final wn wnVar = this.f36222b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                wn.s1(wnVar, tLObject);
                                return;
                            case 1:
                                wn.m0(wnVar, tLObject);
                                return;
                            case 2:
                                wn wnVar2 = wnVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(wnVar2)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(wnVar2);
                                            if (!wnVar2.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                wn wnVar3 = wnVar;
                                TLObject tLObject3 = tLObject;
                                wnVar3.f39585o5 = 0;
                                if (tLObject3 == null && wnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar3.getParentActivity(), 0, wnVar3.f39469ea);
                                    alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar3.showDialog(alertDialog$Builder.f18661a);
                                    jk jkVar = wnVar3.Y;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        wnVar3.e9(true);
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
                final wn wnVar2 = this.f36222b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                wn.s1(wnVar2, tLObject);
                                return;
                            case 1:
                                wn.m0(wnVar2, tLObject);
                                return;
                            case 2:
                                wn wnVar22 = wnVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(wnVar22)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(wnVar22);
                                            if (!wnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                wn wnVar3 = wnVar2;
                                TLObject tLObject3 = tLObject;
                                wnVar3.f39585o5 = 0;
                                if (tLObject3 == null && wnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar3.getParentActivity(), 0, wnVar3.f39469ea);
                                    alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar3.showDialog(alertDialog$Builder.f18661a);
                                    jk jkVar = wnVar3.Y;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        wnVar3.e9(true);
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
                final wn wnVar3 = this.f36222b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                wn.s1(wnVar3, tLObject);
                                return;
                            case 1:
                                wn.m0(wnVar3, tLObject);
                                return;
                            case 2:
                                wn wnVar22 = wnVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(wnVar22)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(wnVar22);
                                            if (!wnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                wn wnVar32 = wnVar3;
                                TLObject tLObject3 = tLObject;
                                wnVar32.f39585o5 = 0;
                                if (tLObject3 == null && wnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar32.getParentActivity(), 0, wnVar32.f39469ea);
                                    alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar32.showDialog(alertDialog$Builder.f18661a);
                                    jk jkVar = wnVar32.Y;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        wnVar32.e9(true);
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
                final wn wnVar4 = this.f36222b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z10;
                        switch (r3) {
                            case 0:
                                wn.s1(wnVar4, tLObject);
                                return;
                            case 1:
                                wn.m0(wnVar4, tLObject);
                                return;
                            case 2:
                                wn wnVar22 = wnVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(wnVar22)) {
                                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(wnVar22);
                                            if (!wnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")) {
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
                                wn wnVar32 = wnVar4;
                                TLObject tLObject3 = tLObject;
                                wnVar32.f39585o5 = 0;
                                if (tLObject3 == null && wnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar32.getParentActivity(), 0, wnVar32.f39469ea);
                                    alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar32.showDialog(alertDialog$Builder.f18661a);
                                    jk jkVar = wnVar32.Y;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        wnVar32.e9(true);
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
                wn wnVar5 = this.f36222b;
                if (tL_error != null) {
                    wnVar5.getClass();
                    return;
                } else {
                    wnVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                wn.c1(this.f36222b, tLObject);
                return;
        }
    }
}
