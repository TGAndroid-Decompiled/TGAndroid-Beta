package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class m50 extends org.telegram.ui.Components.y30 {
    public final q50 f37911n;

    public m50(q50 q50Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int i10;
        int i11;
        int i12;
        this.f37911n = q50Var;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.fg, false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.t30 t30Var = new org.telegram.ui.Components.t30(this, context);
        this.containerView = t30Var;
        t30Var.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setBackgroundDrawable(this.shadowDrawable);
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i13, 0, i13, 0);
        TextView textView = new TextView(getContext());
        if (ChatObject.isChannelOrGiga(chat)) {
            textView.setText(LocaleController.getString(R.string.VoipChannelRecordVoiceChat));
        } else {
            textView.setText(LocaleController.getString(R.string.VoipRecordVoiceChat));
        }
        org.telegram.messenger.g0.m(20.0f, -1, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        ViewGroup viewGroup2 = this.containerView;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        viewGroup2.addView(textView, w7.z5.a(-2.0f, 24.0f, 29.0f, 24.0f, 0.0f, -2, i11 | 48));
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString(R.string.VoipRecordVoiceChatInfo));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12 | 48);
        this.containerView.addView(textView2, w7.z5.a(-2.0f, 24.0f, 62.0f, 24.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
        this.e = new TextView[3];
        z4.g gVar = new z4.g(context);
        this.f31128b = gVar;
        gVar.setClipChildren(false);
        gVar.setOffscreenPageLimit(4);
        gVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new org.telegram.ui.Components.x30(this));
        gVar.setPageMargin(0);
        this.containerView.addView(gVar, w7.z5.a(-1.0f, 0.0f, 100.0f, 0.0f, 130.0f, -1, 1));
        gVar.b(new org.telegram.ui.Components.u30(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.containerView.addView(view, w7.z5.a(-1.0f, 0.0f, 100.0f, 0.0f, 130.0f, 120, 51));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.containerView.addView(view2, w7.z5.a(-1.0f, 0.0f, 100.0f, 0.0f, 130.0f, 120, 53));
        org.telegram.ui.Components.v30 v30Var = new org.telegram.ui.Components.v30(this, getContext());
        this.f31129c = v30Var;
        v30Var.setMinWidth(AndroidUtilities.dp(64.0f));
        v30Var.setTag(-1);
        v30Var.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.g6.f19794ng;
        v30Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        v30Var.setGravity(17);
        v30Var.setTypeface(AndroidUtilities.bold());
        v30Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        int dp = AndroidUtilities.dp(6.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i14, false), 76);
        v30Var.setForeground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, k10, k10));
        v30Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        v30Var.setOnClickListener(new org.telegram.ui.Components.f0(this, 22));
        this.containerView.addView(v30Var, w7.z5.a(48.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 80));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, w7.z5.e(-2, 64, 80));
        int i15 = 0;
        while (true) {
            TextView[] textViewArr = this.e;
            if (i15 >= textViewArr.length) {
                break;
            }
            textViewArr[i15] = new TextView(context);
            this.e[i15].setTextSize(1, 12.0f);
            this.e[i15].setTextColor(-1);
            this.e[i15].setTypeface(AndroidUtilities.bold());
            this.e[i15].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.e[i15].setGravity(16);
            this.e[i15].setSingleLine(true);
            this.d.addView(this.e[i15], w7.z5.n(-2, -1));
            if (i15 == 0) {
                this.e[i15].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i15 == 1) {
                this.e[i15].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.e[i15].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.e[i15].setOnClickListener(new di.m4(this, i15, 9));
            i15++;
        }
        if (z10) {
            this.f31128b.setCurrentItem(1);
        }
    }

    public final void o(int i10) {
        int i11;
        int i12;
        int i13;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f19248a.I = org.telegram.ui.ActionBar.g6.f19829pg;
        n60 n60Var = this.f37911n.f39065b;
        n60Var.f38248w0 = false;
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            if (n60Var.f38157a1.call.rtmp_stream) {
                i13 = R.string.VoipGroupStartRecordingRtmpText;
            } else {
                i13 = R.string.VoipGroupStartRecordingText;
            }
            alertDialog$Builder.f19248a.T = LocaleController.getString(i13);
        } else if (ChatObject.isChannelOrGiga(n60Var.Z0)) {
            if (n60Var.f38157a1.call.rtmp_stream) {
                i12 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i12 = R.string.VoipChannelStartRecordingVideoText;
            }
            alertDialog$Builder.f19248a.T = LocaleController.getString(i12);
        } else {
            if (n60Var.f38157a1.call.rtmp_stream) {
                i11 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i11 = R.string.VoipGroupStartRecordingVideoText;
            }
            alertDialog$Builder.f19248a.T = LocaleController.getString(i11);
        }
        alertDialog$Builder.f19248a.f19292y0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.U(getContext(), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19795nh, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19813oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i14 = org.telegram.ui.ActionBar.g6.f19794ng;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19812og, false));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new c00(alertDialog$Builder, 2));
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.fg, false);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.i(x02);
        a2Var.setOnShowListener(new l50(this, a2Var, editTextBoldCursor, 1));
        a2Var.setOnDismissListener(new d00(2, editTextBoldCursor));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new hg.b2(this, editTextBoldCursor, i10, 11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new b00(2, editTextBoldCursor));
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19925ug, false);
        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19248a;
        a2Var2.i(x03);
        a2Var2.show();
        a2Var2.o(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        editTextBoldCursor.requestFocus();
    }
}
