package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qe implements Runnable {
    public final int f36851a = 0;
    public final boolean f36852b;
    public final Object f36853c;
    public final boolean d;
    public final Object e;
    public final Object f36854f;
    public final Object h;
    public final Object f36855n;

    public qe(bo boVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11) {
        this.e = boVar;
        this.f36853c = str;
        this.f36854f = characterStyle;
        this.h = messageObject;
        this.f36855n = t1Var;
        this.f36852b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f36851a) {
            case 0:
                bo boVar = (bo) this.e;
                String str = (String) this.f36853c;
                CharacterStyle characterStyle = (CharacterStyle) this.f36854f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f36855n;
                if (str.startsWith("video?")) {
                    boVar.U7(characterStyle, false, messageObject, t1Var);
                    return;
                } else if (this.f36852b && !this.d) {
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
                Runnable runnable = (Runnable) this.f36854f;
                String str2 = (String) this.f36853c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f36855n;
                nVar.f45125w = false;
                nVar.f45128z = true;
                if (this.f36852b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.n.k(nVar.f45120q, false, false);
                if (TextUtils.equals(str2, nVar.f45123t) && tL_error == null) {
                    nVar.f45128z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.z3.A0((yh.z3) this.e, (TLObject) this.f36853c, this.f36852b, (TLRPC.Document) this.f36854f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f36855n);
                return;
        }
    }

    public qe(wh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = nVar;
        this.f36852b = z10;
        this.f36854f = runnable;
        this.f36853c = str;
        this.h = tL_error;
        this.f36855n = tLObject;
        this.d = z11;
    }

    public qe(yh.z3 z3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = z3Var;
        this.f36853c = tLObject;
        this.f36852b = z10;
        this.f36854f = document;
        this.d = z11;
        this.h = tL_error;
        this.f36855n = savestargift;
    }
}
