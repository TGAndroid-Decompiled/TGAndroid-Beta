package org.telegram.ui.Components;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xu implements az {
    public final zu f33009a;

    public xu(zu zuVar) {
        this.f33009a = zuVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        zu zuVar = this.f33009a;
        if (zuVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zuVar.f33658x = z10;
            zuVar.y();
            sw0 sw0Var = zuVar.f33653f;
            if (sw0Var != null) {
                sw0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        uu uuVar = this.f33009a.f33649a;
        if (uuVar.length() == 0) {
            return false;
        }
        uuVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        uu uuVar = this.f33009a.f33649a;
        int selectionEnd = uuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, uuVar.getPaint().getFontMetricsInt(), false);
            uuVar.setText(uuVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            uuVar.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void n() {
        zu zuVar = this.f33009a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zuVar.getContext(), 0, zuVar.M);
        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.n2 n2Var = zuVar.h;
        if (n2Var != null) {
            n2Var.showDialog(alertDialog$Builder.f20374a);
        } else {
            alertDialog$Builder.o();
        }
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f33009a.h;
        if (n2Var == null) {
            new rg.y0((org.telegram.ui.ActionBar.n2) new ai.z3(this, 4), 11, false).show();
        } else {
            n2Var.showDialog(new rg.y0(n2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        b6 b6Var;
        zu zuVar = this.f33009a;
        uu uuVar = zuVar.f33649a;
        int selectionEnd = uuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                b6Var = new b6(document, uuVar.getPaint().getFontMetricsInt());
            } else {
                b6Var = new b6(j3, uuVar.getPaint().getFontMetricsInt());
            }
            b6Var.cacheType = zuVar.d.f24399c;
            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
            uuVar.setText(uuVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            uuVar.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f33009a.f33658x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(l61 l61Var) {
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void s(int i10) {
    }

    @Override
    public final void t(ArrayList arrayList) {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void y(long j3) {
    }

    @Override
    public final void e(Object obj, Object obj2) {
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10) {
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
    }
}
