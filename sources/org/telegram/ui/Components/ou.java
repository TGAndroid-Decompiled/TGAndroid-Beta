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
public final class ou implements uy {
    public final qu f29146a;

    public ou(qu quVar) {
        this.f29146a = quVar;
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
        qu quVar = this.f29146a;
        if (quVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            quVar.f29722x = z10;
            quVar.y();
            lw0 lw0Var = quVar.f29717f;
            if (lw0Var != null) {
                lw0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        lu luVar = this.f29146a.f29714a;
        if (luVar.length() == 0) {
            return false;
        }
        luVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        lu luVar = this.f29146a.f29714a;
        int selectionEnd = luVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, luVar.getPaint().getFontMetricsInt(), false);
            luVar.setText(luVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            luVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void n() {
        qu quVar = this.f29146a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(quVar.getContext(), 0, quVar.M);
        alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.n2 n2Var = quVar.h;
        if (n2Var != null) {
            n2Var.showDialog(alertDialog$Builder.f20609a);
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f29146a.h;
        if (n2Var == null) {
            new sg.y0((org.telegram.ui.ActionBar.n2) new ai.a5(this, 5), 11, false).show();
        } else {
            n2Var.showDialog(new sg.y0(n2Var, 11, false));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        a6 a6Var;
        qu quVar = this.f29146a;
        lu luVar = quVar.f29714a;
        int selectionEnd = luVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                a6Var = new a6(document, luVar.getPaint().getFontMetricsInt());
            } else {
                a6Var = new a6(j10, luVar.getPaint().getFontMetricsInt());
            }
            a6Var.cacheType = quVar.d.f30725c;
            spannableString.setSpan(a6Var, 0, spannableString.length(), 33);
            luVar.setText(luVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            luVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f29146a.f29722x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(d61 d61Var) {
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
    public final void y(long j10) {
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
