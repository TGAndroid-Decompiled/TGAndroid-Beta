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
public final class d30 extends org.telegram.ui.Components.e20 {
    public final h30 f46298s1;

    public d30(h30 h30Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int i7;
        int i10;
        int i11;
        this.f46298s1 = h30Var;
        int i12 = org.telegram.ui.ActionBar.j6.Wg;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i12, false);
        org.telegram.ui.ActionBar.q6.x(this.f29682b, this.f29715s0, i12, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(this, context);
        this.f29682b = z10Var;
        z10Var.setWillNotDraw(false);
        this.f29682b.setClipChildren(false);
        this.f29682b.setBackgroundDrawable(this.f29715s0);
        ViewGroup viewGroup = this.f29682b;
        int i13 = this.f29717u0;
        viewGroup.setPadding(i13, 0, i13, 0);
        TextView textView = new TextView(getContext());
        if (org.telegram.messenger.t3.W(chat)) {
            textView.setText(org.telegram.messenger.hd.M0(2131743466, null));
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131743248, null));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        ViewGroup viewGroup2 = this.f29682b;
        if (org.telegram.messenger.hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        viewGroup2.addView(textView, c8.ja.d(-2, -2.0f, i10 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(org.telegram.messenger.hd.M0(2131743247, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        if (org.telegram.messenger.hd.f24101a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 48);
        this.f29682b.addView(textView2, c8.ja.d(-2, -2.0f, (org.telegram.messenger.hd.f24101a0 ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.f34167p1 = new TextView[3];
        c5.l lVar = new c5.l(context);
        this.f34165m1 = lVar;
        lVar.setClipChildren(false);
        lVar.setOffscreenPageLimit(4);
        lVar.setClipToPadding(false);
        org.telegram.messenger.g0.B3(lVar, 2130706432);
        lVar.setAdapter(new org.telegram.ui.Components.d20(this, 0));
        lVar.setPageMargin(0);
        this.f29682b.addView(lVar, c8.ja.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        lVar.b(new org.telegram.ui.Components.a20(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.f29682b.addView(view, c8.ja.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.f29682b.addView(view2, c8.ja.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.b20 b20Var = new org.telegram.ui.Components.b20(this, getContext());
        this.n1 = b20Var;
        b20Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        b20Var.setTag(-1);
        b20Var.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.j6.f28878eh;
        org.telegram.ui.ActionBar.q6.U(b20Var, i14, null);
        b20Var.setGravity(17);
        b20Var.setTypeface(org.telegram.messenger.g0.o());
        b20Var.setText(org.telegram.messenger.hd.M0(2131743249, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i14, false), 76);
        b20Var.setForeground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, o4, o4));
        b20Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        b20Var.setOnClickListener(new org.telegram.ui.Components.e0(this, 23));
        this.f29682b.addView(b20Var, c8.ja.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34166o1 = linearLayout;
        this.f29682b.addView(linearLayout, c8.ja.e(-2, 64, 80));
        int i15 = 0;
        while (true) {
            TextView[] textViewArr = this.f34167p1;
            if (i15 >= textViewArr.length) {
                break;
            }
            textViewArr[i15] = new TextView(context);
            this.f34167p1[i15].setTextSize(1, 12.0f);
            this.f34167p1[i15].setTextColor(-1);
            this.f34167p1[i15].setTypeface(org.telegram.messenger.g0.o());
            this.f34167p1[i15].setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.f34167p1[i15].setGravity(16);
            this.f34167p1[i15].setSingleLine(true);
            this.f34166o1.addView(this.f34167p1[i15], c8.ja.o(-2, -1));
            if (i15 == 0) {
                this.f34167p1[i15].setText(org.telegram.messenger.hd.M0(2131743252, null));
            } else if (i15 == 1) {
                this.f34167p1[i15].setText(org.telegram.messenger.hd.M0(2131743250, null));
            } else {
                this.f34167p1[i15].setText(org.telegram.messenger.hd.M0(2131743251, null));
            }
            this.f34167p1[i15].setOnClickListener(new ci.q(this, i15, 12));
            i15++;
        }
        if (z10) {
            this.f34165m1.setCurrentItem(1);
        }
    }

    public final void J0(int i7) {
        int i10;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i11 = org.telegram.ui.ActionBar.j6.f28915gh;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.J = i11;
        c40 c40Var = this.f46298s1.f47598b;
        c40Var.f45966r2 = false;
        t1Var.S = org.telegram.messenger.hd.M0(2131743326, null);
        if (i7 == 0) {
            if (c40Var.V2.f26208b.rtmp_stream) {
                i10 = 2131743329;
            } else {
                i10 = 2131743327;
            }
            t1Var.U = org.telegram.messenger.hd.M0(i10, null);
        } else {
            int i12 = 2131743328;
            if (org.telegram.messenger.t3.W(c40Var.U2)) {
                if (!c40Var.V2.f26208b.rtmp_stream) {
                    i12 = 2131743457;
                }
                t1Var.U = org.telegram.messenger.hd.M0(i12, null);
            } else {
                if (!c40Var.V2.f26208b.rtmp_stream) {
                    i12 = 2131743325;
                }
                t1Var.U = org.telegram.messenger.hd.M0(i12, null);
            }
        }
        t1Var.f29659z0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V(getContext(), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28879ei, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28896fi, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i13 = org.telegram.ui.ActionBar.j6.f28878eh;
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i13, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(org.telegram.messenger.hd.M0(2131743343, null));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.q6.D(editTextBoldCursor, org.telegram.ui.ActionBar.j6.f28895fh, null);
        org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 30, i13, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, c8.ja.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new cy(alertDialog$Builder, 2));
        t1Var.j(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Wg, false));
        t1Var.setOnShowListener(new c30(this, t1Var, editTextBoldCursor, 1));
        t1Var.setOnDismissListener(new dy(editTextBoldCursor, 2));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744915, null), new ai.q1(this, editTextBoldCursor, i7, 10));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new ay(editTextBoldCursor, 2));
        t1Var.j(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29006lh, false));
        t1Var.show();
        t1Var.p(org.telegram.ui.ActionBar.j6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
    }
}
