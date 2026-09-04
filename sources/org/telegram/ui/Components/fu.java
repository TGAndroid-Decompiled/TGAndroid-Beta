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
public final class fu implements ly {
    public final hu f26183a;

    public fu(hu huVar) {
        this.f26183a = huVar;
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
        hu huVar = this.f26183a;
        if (huVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            huVar.f26856x = z10;
            huVar.y();
            ov0 ov0Var = huVar.f26851f;
            if (ov0Var != null) {
                ov0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        cu cuVar = this.f26183a.f26847a;
        if (cuVar.length() == 0) {
            return false;
        }
        cuVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        cu cuVar = this.f26183a.f26847a;
        int selectionEnd = cuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, cuVar.getPaint().getFontMetricsInt(), false);
            cuVar.setText(cuVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            cuVar.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void n() {
        hu huVar = this.f26183a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(huVar.getContext(), 0, huVar.M);
        alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new r81(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.n2 n2Var = huVar.h;
        if (n2Var != null) {
            n2Var.showDialog(alertDialog$Builder.f20198a);
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f26183a.h;
        if (n2Var == null) {
            new sg.a1((org.telegram.ui.ActionBar.n2) new bi.l3(this, 4), 11, false).show();
        } else {
            n2Var.showDialog(new sg.a1(n2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        z5 z5Var;
        hu huVar = this.f26183a;
        cu cuVar = huVar.f26847a;
        int selectionEnd = cuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                z5Var = new z5(document, cuVar.getPaint().getFontMetricsInt());
            } else {
                z5Var = new z5(j3, cuVar.getPaint().getFontMetricsInt());
            }
            z5Var.cacheType = huVar.d.f27930c;
            spannableString.setSpan(z5Var, 0, spannableString.length(), 33);
            cuVar.setText(cuVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            cuVar.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f26183a.f26856x;
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
