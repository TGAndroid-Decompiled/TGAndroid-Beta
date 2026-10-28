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
public final class pu implements ty {
    public final ru f31715a;

    public pu(ru ruVar) {
        this.f31715a = ruVar;
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
        ru ruVar = this.f31715a;
        if (ruVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ruVar.f32373x = z10;
            ruVar.y();
            ww0 ww0Var = ruVar.f32368f;
            if (ww0Var != null) {
                ww0Var.R();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        mu muVar = this.f31715a.f32365a;
        if (muVar.length() == 0) {
            return false;
        }
        muVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        mu muVar = this.f31715a.f32365a;
        int selectionEnd = muVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, muVar.getPaint().getFontMetricsInt(), false);
            muVar.setText(muVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            muVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void n() {
        ru ruVar = this.f31715a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ruVar.getContext(), 0, ruVar.M);
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.r2 r2Var = ruVar.h;
        if (r2Var != null) {
            r2Var.showDialog(alertDialog$Builder.f22369a);
        } else {
            alertDialog$Builder.p();
        }
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f31715a.h;
        if (r2Var == null) {
            new tg.y0((org.telegram.ui.ActionBar.r2) new bi.v4(this, 5), 11, false).show();
        } else {
            r2Var.showDialog(new tg.y0(r2Var, 11, false));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        c6 c6Var;
        ru ruVar = this.f31715a;
        mu muVar = ruVar.f32365a;
        int selectionEnd = muVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                c6Var = new c6(document, muVar.getPaint().getFontMetricsInt());
            } else {
                c6Var = new c6(j10, muVar.getPaint().getFontMetricsInt());
            }
            c6Var.cacheType = ruVar.d.f32711c;
            spannableString.setSpan(c6Var, 0, spannableString.length(), 33);
            muVar.setText(muVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            muVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f31715a.f32373x;
    }

    @Override
    public final void u() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(q61 q61Var) {
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
