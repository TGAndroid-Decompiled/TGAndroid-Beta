package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b40 extends org.telegram.ui.Components.r20 {
    public final f40 f35978o1;

    public b40(f40 f40Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int i10;
        int i11;
        int i12;
        this.f35978o1 = f40Var;
        int i13 = org.telegram.ui.ActionBar.t6.Tg;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i13, false);
        org.telegram.ui.ActionBar.a7.y(this.f21586b, this.f21612r0, i13, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.n20 n20Var = new org.telegram.ui.Components.n20(this, context);
        this.f21586b = n20Var;
        n20Var.setWillNotDraw(false);
        this.f21586b.setClipChildren(false);
        this.f21586b.setBackgroundDrawable(this.f21612r0);
        ViewGroup viewGroup = this.f21586b;
        int i14 = this.f21615t0;
        viewGroup.setPadding(i14, 0, i14, 0);
        TextView textView = new TextView(getContext());
        if (org.telegram.messenger.w3.W(chat)) {
            textView.setText(org.telegram.messenger.cd.L0(2131743492, null));
        } else {
            textView.setText(org.telegram.messenger.cd.L0(2131743274, null));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        ViewGroup viewGroup2 = this.f21586b;
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        viewGroup2.addView(textView, w7.b6.d(-2, -2.0f, i11 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(org.telegram.messenger.cd.L0(2131743273, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        if (org.telegram.messenger.cd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12 | 48);
        this.f21586b.addView(textView2, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.l1 = new TextView[3];
        z4.g gVar = new z4.g(context);
        this.f29803i1 = gVar;
        gVar.setClipChildren(false);
        gVar.setOffscreenPageLimit(4);
        gVar.setClipToPadding(false);
        org.telegram.messenger.i0.B3(gVar, 2130706432);
        gVar.setAdapter(new kg.e1(this, 1));
        gVar.setPageMargin(0);
        this.f21586b.addView(gVar, w7.b6.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        gVar.b(new org.telegram.ui.Components.o20(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.f21586b.addView(view, w7.b6.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.f21586b.addView(view2, w7.b6.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.p20 p20Var = new org.telegram.ui.Components.p20(this, getContext());
        this.f29804j1 = p20Var;
        p20Var.setMinWidth(org.telegram.messenger.i0.L(64.0f));
        p20Var.setTag(-1);
        p20Var.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.t6.f20901bh;
        org.telegram.ui.ActionBar.a7.V(p20Var, i15, null);
        p20Var.setGravity(17);
        p20Var.setTypeface(org.telegram.messenger.i0.o());
        p20Var.setText(org.telegram.messenger.cd.L0(2131743275, null));
        int L = org.telegram.messenger.i0.L(6.0f);
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i15, false), 76);
        p20Var.setForeground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, o10, o10));
        p20Var.setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
        p20Var.setOnClickListener(new org.telegram.ui.Components.h0(this, 21));
        this.f21586b.addView(p20Var, w7.b6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f29805k1 = linearLayout;
        this.f21586b.addView(linearLayout, w7.b6.e(-2, 64, 80));
        int i16 = 0;
        while (true) {
            TextView[] textViewArr = this.l1;
            if (i16 >= textViewArr.length) {
                break;
            }
            textViewArr[i16] = new TextView(context);
            this.l1[i16].setTextSize(1, 12.0f);
            this.l1[i16].setTextColor(-1);
            this.l1[i16].setTypeface(org.telegram.messenger.i0.o());
            this.l1[i16].setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            this.l1[i16].setGravity(16);
            this.l1[i16].setSingleLine(true);
            this.f29805k1.addView(this.l1[i16], w7.b6.o(-2, -1));
            if (i16 == 0) {
                this.l1[i16].setText(org.telegram.messenger.cd.L0(2131743278, null));
            } else if (i16 == 1) {
                this.l1[i16].setText(org.telegram.messenger.cd.L0(2131743276, null));
            } else {
                this.l1[i16].setText(org.telegram.messenger.cd.L0(2131743277, null));
            }
            this.l1[i16].setOnClickListener(new bh.f(this, i16, 7));
            i16++;
        }
        if (z10) {
            this.f29803i1.setCurrentItem(1);
        }
    }

    public final void J0(int i10) {
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i12 = org.telegram.ui.ActionBar.t6.f20940dh;
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.I = i12;
        b50 b50Var = this.f35978o1.f37176b;
        b50Var.f36050n2 = false;
        x1Var.R = org.telegram.messenger.cd.L0(2131743352, null);
        if (i10 == 0) {
            if (b50Var.R2.f18228b.rtmp_stream) {
                i11 = 2131743355;
            } else {
                i11 = 2131743353;
            }
            x1Var.T = org.telegram.messenger.cd.L0(i11, null);
        } else {
            int i13 = 2131743354;
            if (org.telegram.messenger.w3.W(b50Var.Q2)) {
                if (!b50Var.R2.f18228b.rtmp_stream) {
                    i13 = 2131743483;
                }
                x1Var.T = org.telegram.messenger.cd.L0(i13, null);
            } else {
                if (!b50Var.R2.f18228b.rtmp_stream) {
                    i13 = 2131743351;
                }
                x1Var.T = org.telegram.messenger.cd.L0(i13, null);
            }
        }
        x1Var.A0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.V(getContext(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20902bi, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20922ci, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i14 = org.telegram.ui.ActionBar.t6.f20901bh;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i14, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(org.telegram.messenger.cd.L0(2131743369, null));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f20921ch, null);
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i14, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.b6.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new dz(alertDialog$Builder, 2));
        x1Var.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Tg, false));
        x1Var.setOnShowListener(new a40(this, x1Var, editTextBoldCursor, 1));
        x1Var.setOnDismissListener(new ez(editTextBoldCursor, 2));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744933, null), new ag.b0(this, editTextBoldCursor, i10, 10));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new cz(editTextBoldCursor, 2));
        x1Var.j(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21029ih, false));
        x1Var.show();
        x1Var.p(org.telegram.ui.ActionBar.t6.x0(null, i14, false));
        editTextBoldCursor.requestFocus();
    }
}
