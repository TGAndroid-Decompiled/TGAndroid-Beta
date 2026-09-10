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
public final class i50 extends org.telegram.ui.Components.v30 {
    public final m50 f33537n;

    public i50(m50 m50Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, chat, z10);
        this.f33537n = m50Var;
    }

    @Override
    public final void n(int i10) {
        int i11;
        int i12;
        int i13;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f17528a.I = org.telegram.ui.ActionBar.j6.f18153pg;
        j60 j60Var = this.f33537n.f34847b;
        j60Var.f34026w0 = false;
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            if (j60Var.f33936a1.call.rtmp_stream) {
                i13 = R.string.VoipGroupStartRecordingRtmpText;
            } else {
                i13 = R.string.VoipGroupStartRecordingText;
            }
            alertDialog$Builder.f17528a.T = LocaleController.getString(i13);
        } else if (ChatObject.isChannelOrGiga(j60Var.Z0)) {
            if (j60Var.f33936a1.call.rtmp_stream) {
                i12 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i12 = R.string.VoipChannelStartRecordingVideoText;
            }
            alertDialog$Builder.f17528a.T = LocaleController.getString(i12);
        } else {
            if (j60Var.f33936a1.call.rtmp_stream) {
                i11 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i11 = R.string.VoipGroupStartRecordingVideoText;
            }
            alertDialog$Builder.f17528a.T = LocaleController.getString(i11);
        }
        alertDialog$Builder.f17528a.f17644y0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.T(getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18118nh, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18136oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i14 = org.telegram.ui.ActionBar.j6.f18117ng;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18135og, false));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.a6.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new zz(alertDialog$Builder, 2));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17972fg, false);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.i(w02);
        d2Var.setOnShowListener(new h50(this, d2Var, editTextBoldCursor, 1));
        d2Var.setOnDismissListener(new a00(2, editTextBoldCursor));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new fg.e2(this, editTextBoldCursor, i10, 10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new yz(2, editTextBoldCursor));
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18246ug, false);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f17528a;
        d2Var2.i(w03);
        d2Var2.show();
        d2Var2.o(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        editTextBoldCursor.requestFocus();
    }
}
