package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class n40 extends org.telegram.ui.Components.v20 {
    public final r40 f40589n;

    public n40(r40 r40Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, chat, z10);
        this.f40589n = r40Var;
    }

    @Override
    public final void n(int i9) {
        int i10;
        int i11;
        int i12;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f22702a.E = org.telegram.ui.ActionBar.f6.f23220pg;
        o50 o50Var = this.f40589n.f42265b;
        o50Var.f40956s0 = false;
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i9 == 0) {
            if (o50Var.W0.call.rtmp_stream) {
                i12 = R.string.VoipGroupStartRecordingRtmpText;
            } else {
                i12 = R.string.VoipGroupStartRecordingText;
            }
            alertDialog$Builder.f22702a.P = LocaleController.getString(i12);
        } else if (ChatObject.isChannelOrGiga(o50Var.V0)) {
            if (o50Var.W0.call.rtmp_stream) {
                i11 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i11 = R.string.VoipChannelStartRecordingVideoText;
            }
            alertDialog$Builder.f22702a.P = LocaleController.getString(i11);
        } else {
            if (o50Var.W0.call.rtmp_stream) {
                i10 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i10 = R.string.VoipGroupStartRecordingVideoText;
            }
            alertDialog$Builder.f22702a.P = LocaleController.getString(i10);
        }
        alertDialog$Builder.f22702a.f22788u0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.T(getContext(), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23189nh, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23204oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i13 = org.telegram.ui.ActionBar.f6.f23188ng;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23203og, false));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, g7.e6.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new gz(alertDialog$Builder, 2));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23046fg, false);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.i(w02);
        c2Var.setOnShowListener(new m40(this, c2Var, editTextBoldCursor, 1));
        c2Var.setOnDismissListener(new hz(2, editTextBoldCursor));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new c3.e(this, editTextBoldCursor, i9, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fz(2, editTextBoldCursor));
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23313ug, false);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22702a;
        c2Var2.i(w03);
        c2Var2.show();
        c2Var2.o(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
    }
}
