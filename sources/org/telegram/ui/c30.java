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
public final class c30 extends org.telegram.ui.Components.b20 {
    public final h30 f44533o1;

    public c30(h30 h30Var, Context context, TLRPC.Chat chat, boolean z9) {
        super(context, false);
        int i7;
        int i10;
        int i11;
        this.f44533o1 = h30Var;
        int i12 = org.telegram.ui.ActionBar.k6.Tg;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        org.telegram.ui.ActionBar.r6.y(this.f28615b, this.f28642r0, i12, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.w10 w10Var = new org.telegram.ui.Components.w10(this, context);
        this.f28615b = w10Var;
        w10Var.setWillNotDraw(false);
        this.f28615b.setClipChildren(false);
        this.f28615b.setBackgroundDrawable(this.f28642r0);
        ViewGroup viewGroup = this.f28615b;
        int i13 = this.f28645t0;
        viewGroup.setPadding(i13, 0, i13, 0);
        TextView textView = new TextView(getContext());
        if (org.telegram.messenger.t3.W(chat)) {
            textView.setText(org.telegram.messenger.hd.M0(2131743467, null));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131743249, null));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        ViewGroup viewGroup2 = this.f28615b;
        if (org.telegram.messenger.hd.f22871a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        viewGroup2.addView(textView, c8.ha.d(-2, -2.0f, i10 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(org.telegram.messenger.hd.M0(2131743248, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        if (org.telegram.messenger.hd.f22871a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 48);
        this.f28615b.addView(textView2, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.f22871a0 ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.l1 = new TextView[3];
        c5.k kVar = new c5.k(context);
        this.f31984i1 = kVar;
        kVar.setClipChildren(false);
        kVar.setOffscreenPageLimit(4);
        kVar.setClipToPadding(false);
        org.telegram.messenger.g0.C3(kVar, 2130706432);
        kVar.setAdapter(new org.telegram.ui.Components.a20(this, 0));
        kVar.setPageMargin(0);
        this.f28615b.addView(kVar, c8.ha.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        kVar.b(new org.telegram.ui.Components.x10(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.f28615b.addView(view, c8.ha.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.f28615b.addView(view2, c8.ha.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(this, getContext());
        this.f31985j1 = y10Var;
        y10Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        y10Var.setTag(-1);
        y10Var.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.k6.f27821bh;
        org.telegram.ui.ActionBar.r6.V(y10Var, i14, null);
        y10Var.setGravity(17);
        y10Var.setTypeface(org.telegram.messenger.g0.o());
        y10Var.setText(org.telegram.messenger.hd.M0(2131743250, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 76);
        y10Var.setForeground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, o4, o4));
        y10Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        y10Var.setOnClickListener(new org.telegram.ui.Components.h0(this, 22));
        this.f28615b.addView(y10Var, c8.ha.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31986k1 = linearLayout;
        this.f28615b.addView(linearLayout, c8.ha.e(-2, 64, 80));
        int i15 = 0;
        while (true) {
            TextView[] textViewArr = this.l1;
            if (i15 >= textViewArr.length) {
                break;
            }
            textViewArr[i15] = new TextView(context);
            this.l1[i15].setTextSize(1, 12.0f);
            this.l1[i15].setTextColor(-1);
            this.l1[i15].setTypeface(org.telegram.messenger.g0.o());
            this.l1[i15].setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.l1[i15].setGravity(16);
            this.l1[i15].setSingleLine(true);
            this.f31986k1.addView(this.l1[i15], c8.ha.o(-2, -1));
            if (i15 == 0) {
                this.l1[i15].setText(org.telegram.messenger.hd.M0(2131743253, null));
            } else if (i15 == 1) {
                this.l1[i15].setText(org.telegram.messenger.hd.M0(2131743251, null));
            } else {
                this.l1[i15].setText(org.telegram.messenger.hd.M0(2131743252, null));
            }
            this.l1[i15].setOnClickListener(new ai.v(this, i15, 12));
            i15++;
        }
        if (z9) {
            this.f31984i1.setCurrentItem(1);
        }
    }

    public final void J0(int i7) {
        int i10;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i11 = org.telegram.ui.ActionBar.k6.f27858dh;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.I = i11;
        c40 c40Var = this.f44533o1.f46206b;
        c40Var.f44600n2 = false;
        u1Var.R = org.telegram.messenger.hd.M0(2131743327, null);
        if (i7 == 0) {
            if (c40Var.R2.f25201b.rtmp_stream) {
                i10 = 2131743330;
            } else {
                i10 = 2131743328;
            }
            u1Var.T = org.telegram.messenger.hd.M0(i10, null);
        } else {
            int i12 = 2131743329;
            if (org.telegram.messenger.t3.W(c40Var.Q2)) {
                if (!c40Var.R2.f25201b.rtmp_stream) {
                    i12 = 2131743458;
                }
                u1Var.T = org.telegram.messenger.hd.M0(i12, null);
            } else {
                if (!c40Var.R2.f25201b.rtmp_stream) {
                    i12 = 2131743326;
                }
                u1Var.T = org.telegram.messenger.hd.M0(i12, null);
            }
        }
        u1Var.f28590y0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V(getContext(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27822bi, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27842ci, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.f27821bh;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i13, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(org.telegram.messenger.hd.M0(2131743344, null));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f27841ch, null);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i13, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, c8.ha.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new ay(alertDialog$Builder, 2));
        u1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tg, false));
        u1Var.setOnShowListener(new b30(this, u1Var, editTextBoldCursor, 1));
        u1Var.setOnDismissListener(new cy(editTextBoldCursor, 2));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744916, null), new jg.a2(this, editTextBoldCursor, i7, 9));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new zx(editTextBoldCursor, 2));
        u1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27949ih, false));
        u1Var.show();
        u1Var.p(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
    }
}
