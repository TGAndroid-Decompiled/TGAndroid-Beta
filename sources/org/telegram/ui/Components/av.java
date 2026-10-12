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
public final class av implements dz {
    public final cv f24481a;

    public av(cv cvVar) {
        this.f24481a = cvVar;
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
        cv cvVar = this.f24481a;
        if (cvVar.b()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            cvVar.f25024x = z10;
            cvVar.y();
            yw0 yw0Var = cvVar.f25019f;
            if (yw0Var != null) {
                yw0Var.S();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        xu xuVar = this.f24481a.f25015a;
        if (xuVar.length() == 0) {
            return false;
        }
        xuVar.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        xu xuVar = this.f24481a.f25015a;
        int selectionEnd = xuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, xuVar.getPaint().getFontMetricsInt(), false);
            xuVar.setText(xuVar.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            xuVar.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void n() {
        cv cvVar = this.f24481a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cvVar.getContext(), 0, cvVar.M);
        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new s(this, 29));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.m2 m2Var = cvVar.h;
        if (m2Var != null) {
            m2Var.showDialog(alertDialog$Builder.f20142a);
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f24481a.h;
        if (m2Var == null) {
            new rg.y0((org.telegram.ui.ActionBar.m2) new ai.z3(this, 4), 11, false).show();
        } else {
            m2Var.showDialog(new rg.y0(m2Var, 11, false));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        b6 b6Var;
        cv cvVar = this.f24481a;
        xu xuVar = cvVar.f25015a;
        int selectionEnd = xuVar.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                b6Var = new b6(document, xuVar.getPaint().getFontMetricsInt());
            } else {
                b6Var = new b6(j3, xuVar.getPaint().getFontMetricsInt());
            }
            b6Var.cacheType = cvVar.d.f25070c;
            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
            xuVar.setText(xuVar.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            xuVar.setSelection(length, length);
        } catch (Exception e7) {
            FileLog.e(e7);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final boolean z() {
        return this.f24481a.f25024x;
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
