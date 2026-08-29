package org.telegram.ui;

import android.app.Activity;
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
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pu0 implements org.telegram.ui.Components.fy {
    public final vu0 f41468a;

    public pu0(vu0 vu0Var) {
        this.f41468a = vu0Var;
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
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        vu0 vu0Var = this.f41468a;
        vu0Var.f43784x0 = z10;
        vu0Var.f43759e.requestLayout();
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        EditTextBoldCursor editField = this.f41468a.X.getEditField();
        if (editField == null) {
            return false;
        }
        editField.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        EditTextBoldCursor editField = this.f41468a.X.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(str, editField.getPaint().getFontMetricsInt(), false);
            editField.setText(editField.getText().insert(selectionEnd, replaceEmoji));
            int length = selectionEnd + replaceEmoji.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.c6 c6Var;
        vu0 vu0Var = this.f41468a;
        Activity parentActivity = vu0Var.getParentActivity();
        c6Var = ((org.telegram.ui.ActionBar.o2) vu0Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, c6Var);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ClearRecentEmojiTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ClearRecentEmojiText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new zk0(this, 5));
        j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override
    public final float p() {
        return 0.0f;
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        org.telegram.ui.Components.y5 y5Var;
        vu0 vu0Var = this.f41468a;
        EditTextBoldCursor editField = vu0Var.X.getEditField();
        if (editField == null) {
            return;
        }
        int selectionEnd = editField.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            SpannableString spannableString = new SpannableString(str);
            if (document != null) {
                y5Var = new org.telegram.ui.Components.y5(document, editField.getPaint().getFontMetricsInt());
            } else {
                y5Var = new org.telegram.ui.Components.y5(j10, editField.getPaint().getFontMetricsInt());
            }
            y5Var.cacheType = vu0Var.N.f28581c;
            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
            editField.setText(editField.getText().insert(selectionEnd, spannableString));
            int length = selectionEnd + spannableString.length();
            editField.setSelection(length, length);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final boolean z() {
        return this.f41468a.f43784x0;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
    }

    @Override
    public final void o(org.telegram.ui.Components.s41 s41Var) {
    }

    @Override
    public final void q() {
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
