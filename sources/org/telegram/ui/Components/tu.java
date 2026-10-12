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
public final class tu implements wy {
    public final vu f29489a;

    public tu(vu vuVar) {
        this.f29489a = vuVar;
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
        vu vuVar = this.f29489a;
        if (vuVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            vuVar.f30657x = z10;
            vuVar.y();
            ow0 ow0Var = vuVar.f30652f;
            if (ow0Var != null) {
                ow0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        qu quVar = this.f29489a.f30649a;
        if (quVar.length() == 0) {
            return false;
        }
        quVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        qu quVar = this.f29489a.f30649a;
        int selectionEnd = quVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, quVar.getPaint().getFontMetricsInt(), false);
            quVar.setText(quVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            quVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void n() {
        vu vuVar = this.f29489a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vuVar.getContext(), 0, vuVar.M);
        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.m2 m2Var = vuVar.h;
        if (m2Var != null) {
            m2Var.showDialog(alertDialog$Builder.f19548a);
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f29489a.h;
        if (m2Var == null) {
            new sg.y0((org.telegram.ui.ActionBar.m2) new bi.o3(this, 4), 11, false).show();
        } else {
            m2Var.showDialog(new sg.y0(m2Var, 11, false));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        b6 b6Var;
        vu vuVar = this.f29489a;
        qu quVar = vuVar.f30649a;
        int selectionEnd = quVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                b6Var = new b6(document, quVar.getPaint().getFontMetricsInt());
            } else {
                b6Var = new b6(j10, quVar.getPaint().getFontMetricsInt());
            }
            b6Var.cacheType = vuVar.d.f31012c;
            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
            quVar.setText(quVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            quVar.setSelection(length, length);
        } catch (Exception e) {
            FileLog.e(e);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f29489a.f30657x;
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
