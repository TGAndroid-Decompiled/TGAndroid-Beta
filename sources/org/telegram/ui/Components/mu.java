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
public final class mu implements sy {
    public final ou f28697a;

    public mu(ou ouVar) {
        this.f28697a = ouVar;
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
        ou ouVar = this.f28697a;
        if (ouVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ouVar.f29389x = z10;
            ouVar.y();
            nw0 nw0Var = ouVar.f29384f;
            if (nw0Var != null) {
                nw0Var.R();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        ju juVar = this.f28697a.f29381a;
        if (juVar.length() == 0) {
            return false;
        }
        juVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        ju juVar = this.f28697a.f29381a;
        int selectionEnd = juVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, juVar.getPaint().getFontMetricsInt(), false);
            juVar.setText(juVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            juVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void n() {
        ou ouVar = this.f28697a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ouVar.getContext(), 0, ouVar.M);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.o2 o2Var = ouVar.h;
        if (o2Var != null) {
            o2Var.showDialog(alertDialog$Builder.f20679a);
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f28697a.h;
        if (o2Var == null) {
            new sg.y0((org.telegram.ui.ActionBar.o2) new ai.a5(this, 5), 11, false).show();
        } else {
            o2Var.showDialog(new sg.y0(o2Var, 11, false));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        y5 y5Var;
        ou ouVar = this.f28697a;
        ju juVar = ouVar.f29381a;
        int selectionEnd = juVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                y5Var = new y5(document, juVar.getPaint().getFontMetricsInt());
            } else {
                y5Var = new y5(j10, juVar.getPaint().getFontMetricsInt());
            }
            y5Var.cacheType = ouVar.d.f30308c;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            juVar.setText(juVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            juVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f28697a.f29389x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(h61 h61Var) {
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
