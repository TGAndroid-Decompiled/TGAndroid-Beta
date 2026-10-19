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
public final class p40 extends org.telegram.ui.Components.u30 {
    public final t40 f40055n;

    public p40(t40 t40Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int i10;
        int i11;
        int i12;
        this.f40055n = t40Var;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.fg, false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.p30 p30Var = new org.telegram.ui.Components.p30(this, context);
        this.containerView = p30Var;
        p30Var.setWillNotDraw(false);
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
        viewGroup2.addView(textView, w7.z5.d(-2, -2.0f, i11 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
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
        this.containerView.addView(textView2, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.e = new TextView[3];
        z4.g gVar = new z4.g(context);
        this.f30873b = gVar;
        gVar.setClipChildren(false);
        gVar.setOffscreenPageLimit(4);
        gVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new org.telegram.ui.Components.t30(this));
        gVar.setPageMargin(0);
        this.containerView.addView(gVar, w7.z5.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        gVar.b(new org.telegram.ui.Components.q30(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.containerView.addView(view, w7.z5.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.containerView.addView(view2, w7.z5.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.r30 r30Var = new org.telegram.ui.Components.r30(this, getContext());
        this.f30874c = r30Var;
        r30Var.setMinWidth(AndroidUtilities.dp(64.0f));
        r30Var.setTag(-1);
        r30Var.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.h6.f21180ng;
        r30Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        r30Var.setGravity(17);
        r30Var.setTypeface(AndroidUtilities.bold());
        r30Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        int dp = AndroidUtilities.dp(6.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i14, false), 76);
        r30Var.setForeground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, o10, o10));
        r30Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        r30Var.setOnClickListener(new org.telegram.ui.Components.f0(this, 22));
        this.containerView.addView(r30Var, w7.z5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
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
            this.e[i15].setOnClickListener(new ai.n1(this, i15, 11));
            i15++;
        }
        if (z10) {
            this.f30873b.setCurrentItem(1);
        }
    }

    public final void o(int i10) {
        int i11;
        int i12;
        int i13;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f20602a.I = org.telegram.ui.ActionBar.h6.f21215pg;
        q50 q50Var = this.f40055n.f41586b;
        q50Var.f40461w0 = false;
        alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            if (q50Var.f40370a1.call.rtmp_stream) {
                i13 = R.string.VoipGroupStartRecordingRtmpText;
            } else {
                i13 = R.string.VoipGroupStartRecordingText;
            }
            alertDialog$Builder.f20602a.T = LocaleController.getString(i13);
        } else if (ChatObject.isChannelOrGiga(q50Var.Z0)) {
            if (q50Var.f40370a1.call.rtmp_stream) {
                i12 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i12 = R.string.VoipChannelStartRecordingVideoText;
            }
            alertDialog$Builder.f20602a.T = LocaleController.getString(i12);
        } else {
            if (q50Var.f40370a1.call.rtmp_stream) {
                i11 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i11 = R.string.VoipGroupStartRecordingVideoText;
            }
            alertDialog$Builder.f20602a.T = LocaleController.getString(i11);
        }
        alertDialog$Builder.f20602a.f20685y0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.U(getContext(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21181nh, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21199oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i14 = org.telegram.ui.ActionBar.h6.f21180ng;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21198og, false));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new gz(alertDialog$Builder, 2));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.fg, false);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
        b2Var.j(x02);
        b2Var.setOnShowListener(new o40(this, b2Var, editTextBoldCursor, 1));
        b2Var.setOnDismissListener(new hz(2, editTextBoldCursor));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new hg.b2(this, editTextBoldCursor, i10, 11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fz(2, editTextBoldCursor));
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21312ug, false);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20602a;
        b2Var2.j(x03);
        b2Var2.show();
        b2Var2.p(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        editTextBoldCursor.requestFocus();
    }
}
