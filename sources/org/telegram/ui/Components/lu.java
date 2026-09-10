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
public final class lu implements sy {
    public final nu f25112a;

    public lu(nu nuVar) {
        this.f25112a = nuVar;
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
        nu nuVar = this.f25112a;
        if (nuVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            nuVar.f25603x = z10;
            nuVar.y();
            aw0 aw0Var = nuVar.f25598f;
            if (aw0Var != null) {
                aw0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        iu iuVar = this.f25112a.f25595a;
        if (iuVar.length() == 0) {
            return false;
        }
        iuVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        iu iuVar = this.f25112a.f25595a;
        int selectionEnd = iuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, iuVar.getPaint().getFontMetricsInt(), false);
            iuVar.setText(iuVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            iuVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void n() {
        nu nuVar = this.f25112a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nuVar.getContext(), 0, nuVar.M);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new e91(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.p2 p2Var = nuVar.h;
        if (p2Var != null) {
            p2Var.showDialog(alertDialog$Builder.f17528a);
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f25112a.h;
        if (p2Var == null) {
            new qg.a1((org.telegram.ui.ActionBar.p2) new bi.o1(this, 2), 11, false).show();
        } else {
            p2Var.showDialog(new qg.a1(p2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        y5 y5Var;
        nu nuVar = this.f25112a;
        iu iuVar = nuVar.f25595a;
        int selectionEnd = iuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                y5Var = new y5(document, iuVar.getPaint().getFontMetricsInt());
            } else {
                y5Var = new y5(j3, iuVar.getPaint().getFontMetricsInt());
            }
            y5Var.cacheType = nuVar.d.f26803c;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            iuVar.setText(iuVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            iuVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f25112a.f25603x;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(r51 r51Var) {
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
