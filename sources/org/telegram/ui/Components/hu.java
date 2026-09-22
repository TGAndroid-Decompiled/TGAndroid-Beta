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
public final class hu implements ly {
    public final ju f24891a;

    public hu(ju juVar) {
        this.f24891a = juVar;
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
        ju juVar = this.f24891a;
        if (juVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            juVar.f25466x = z10;
            juVar.y();
            cw0 cw0Var = juVar.f25461f;
            if (cw0Var != null) {
                cw0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        eu euVar = this.f24891a.f25458a;
        if (euVar.length() == 0) {
            return false;
        }
        euVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        eu euVar = this.f24891a.f25458a;
        int selectionEnd = euVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, euVar.getPaint().getFontMetricsInt(), false);
            euVar.setText(euVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            euVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void n() {
        ju juVar = this.f24891a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(juVar.getContext(), 0, juVar.M);
        alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.n2 n2Var = juVar.h;
        if (n2Var != null) {
            n2Var.showDialog(alertDialog$Builder.f18669a);
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f24891a.h;
        if (n2Var == null) {
            new rg.x0((org.telegram.ui.ActionBar.n2) new ai.y3(this, 4), 11, false).show();
        } else {
            n2Var.showDialog(new rg.x0(n2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        y5 y5Var;
        ju juVar = this.f24891a;
        eu euVar = juVar.f25458a;
        int selectionEnd = euVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                y5Var = new y5(document, euVar.getPaint().getFontMetricsInt());
            } else {
                y5Var = new y5(j3, euVar.getPaint().getFontMetricsInt());
            }
            y5Var.cacheType = juVar.d.f25856c;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            euVar.setText(euVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            euVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f24891a.f25466x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(u51 u51Var) {
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
