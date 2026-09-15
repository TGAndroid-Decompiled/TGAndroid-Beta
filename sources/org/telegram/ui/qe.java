package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qe implements Runnable {
    public final int f36857a = 0;
    public final boolean f36858b;
    public final Object f36859c;
    public final boolean d;
    public final Object e;
    public final Object f36860f;
    public final Object h;
    public final Object f36861n;

    public qe(bo boVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11) {
        this.e = boVar;
        this.f36859c = str;
        this.f36860f = characterStyle;
        this.h = messageObject;
        this.f36861n = t1Var;
        this.f36858b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f36857a) {
            case 0:
                bo boVar = (bo) this.e;
                String str = (String) this.f36859c;
                CharacterStyle characterStyle = (CharacterStyle) this.f36860f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f36861n;
                if (str.startsWith("video?")) {
                    boVar.U7(characterStyle, false, messageObject, t1Var);
                    return;
                } else if (this.f36858b && !this.d) {
                    boVar.getParentActivity();
                    nf.f.n(str);
                    return;
                } else {
                    boVar.J9(messageObject, false, false);
                    boVar.Z9(characterStyle, str, false, t1Var, messageObject);
                    return;
                }
            case 1:
                wh.n nVar = (wh.n) this.e;
                Runnable runnable = (Runnable) this.f36860f;
                String str2 = (String) this.f36859c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f36861n;
                nVar.f45129w = false;
                nVar.f45132z = true;
                if (this.f36858b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.n.k(nVar.f45124q, false, false);
                if (TextUtils.equals(str2, nVar.f45127t) && tL_error == null) {
                    nVar.f45132z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.a4.A0((yh.a4) this.e, (TLObject) this.f36859c, this.f36858b, (TLRPC.Document) this.f36860f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f36861n);
                return;
        }
    }

    public qe(wh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = nVar;
        this.f36858b = z10;
        this.f36860f = runnable;
        this.f36859c = str;
        this.h = tL_error;
        this.f36861n = tLObject;
        this.d = z11;
    }

    public qe(yh.a4 a4Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = a4Var;
        this.f36859c = tLObject;
        this.f36858b = z10;
        this.f36860f = document;
        this.d = z11;
        this.h = tL_error;
        this.f36861n = savestargift;
    }
}
