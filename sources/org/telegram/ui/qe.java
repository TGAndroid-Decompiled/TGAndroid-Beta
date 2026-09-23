package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qe implements Runnable {
    public final int f36403a = 0;
    public final boolean f36404b;
    public final Object f36405c;
    public final boolean d;
    public final Object e;
    public final Object f36406f;
    public final Object h;
    public final Object f36407n;

    public qe(xn xnVar, String str, CharacterStyle characterStyle, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11) {
        this.e = xnVar;
        this.f36405c = str;
        this.f36406f = characterStyle;
        this.h = messageObject;
        this.f36407n = t1Var;
        this.f36404b = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f36403a) {
            case 0:
                xn xnVar = (xn) this.e;
                String str = (String) this.f36405c;
                CharacterStyle characterStyle = (CharacterStyle) this.f36406f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f36407n;
                if (str.startsWith("video?")) {
                    xnVar.U7(characterStyle, false, messageObject, t1Var);
                    return;
                } else if (this.f36404b && !this.d) {
                    xnVar.getParentActivity();
                    nf.f.n(str);
                    return;
                } else {
                    xnVar.J9(messageObject, false, false);
                    xnVar.Z9(characterStyle, str, false, t1Var, messageObject);
                    return;
                }
            case 1:
                wh.n nVar = (wh.n) this.e;
                Runnable runnable = (Runnable) this.f36406f;
                String str2 = (String) this.f36405c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLObject tLObject = (TLObject) this.f36407n;
                nVar.f45079w = false;
                nVar.f45082z = true;
                if (this.f36404b) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                wh.n.k(nVar.f45074q, false, false);
                if (TextUtils.equals(str2, nVar.f45077t) && tL_error == null) {
                    nVar.f45082z = true;
                    nVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str2, this.d, false);
                    return;
                }
                return;
            default:
                yh.y3.A0((yh.y3) this.e, (TLObject) this.f36405c, this.f36404b, (TLRPC.Document) this.f36406f, this.d, (TLRPC.TL_error) this.h, (TL_stars.saveStarGift) this.f36407n);
                return;
        }
    }

    public qe(wh.n nVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = nVar;
        this.f36404b = z10;
        this.f36406f = runnable;
        this.f36405c = str;
        this.h = tL_error;
        this.f36407n = tLObject;
        this.d = z11;
    }

    public qe(yh.y3 y3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = y3Var;
        this.f36405c = tLObject;
        this.f36404b = z10;
        this.f36406f = document;
        this.d = z11;
        this.h = tL_error;
        this.f36407n = savestargift;
    }
}
