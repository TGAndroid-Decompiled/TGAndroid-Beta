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
public final class iu implements ly {
    public final ku f25060a;

    public iu(ku kuVar) {
        this.f25060a = kuVar;
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
        ku kuVar = this.f25060a;
        if (kuVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kuVar.f25701x = z10;
            kuVar.y();
            pv0 pv0Var = kuVar.f25696f;
            if (pv0Var != null) {
                pv0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        fu fuVar = this.f25060a.f25693a;
        if (fuVar.length() == 0) {
            return false;
        }
        fuVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        fu fuVar = this.f25060a.f25693a;
        int selectionEnd = fuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, fuVar.getPaint().getFontMetricsInt(), false);
            fuVar.setText(fuVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            fuVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void n() {
        ku kuVar = this.f25060a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kuVar.getContext(), 0, kuVar.M);
        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new q81(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.n2 n2Var = kuVar.h;
        if (n2Var != null) {
            n2Var.showDialog(alertDialog$Builder.f18409a);
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f25060a.h;
        if (n2Var == null) {
            new rg.x0((org.telegram.ui.ActionBar.n2) new ai.y3(this, 4), 11, false).show();
        } else {
            n2Var.showDialog(new rg.x0(n2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        z5 z5Var;
        ku kuVar = this.f25060a;
        fu fuVar = kuVar.f25693a;
        int selectionEnd = fuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                z5Var = new z5(document, fuVar.getPaint().getFontMetricsInt());
            } else {
                z5Var = new z5(j3, fuVar.getPaint().getFontMetricsInt());
            }
            z5Var.cacheType = kuVar.d.f25966c;
            spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
            fuVar.setText(fuVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            fuVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f25060a.f25701x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(d51 d51Var) {
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
