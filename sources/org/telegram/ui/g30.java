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
public final class g30 extends org.telegram.ui.Components.o20 {
    public final k30 f47875s1;

    public g30(k30 k30Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int i7;
        int i10;
        int i11;
        this.f47875s1 = k30Var;
        int i12 = org.telegram.ui.ActionBar.m6.Wg;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        org.telegram.ui.ActionBar.t6.x(this.f30142b, this.f30175s0, i12, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(this, context);
        this.f30142b = j20Var;
        j20Var.setWillNotDraw(false);
        this.f30142b.setClipChildren(false);
        this.f30142b.setBackgroundDrawable(this.f30175s0);
        ViewGroup viewGroup = this.f30142b;
        int i13 = this.f30177u0;
        viewGroup.setPadding(i13, 0, i13, 0);
        TextView textView = new TextView(getContext());
        if (org.telegram.messenger.v3.W(chat)) {
            textView.setText(org.telegram.messenger.hd.N0(2131743223, null));
        } else {
            textView.setText(org.telegram.messenger.hd.N0(2131743005, null));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (org.telegram.messenger.hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        ViewGroup viewGroup2 = this.f30142b;
        if (org.telegram.messenger.hd.f24408a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        viewGroup2.addView(textView, c8.na.d(-2, -2.0f, i10 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(org.telegram.messenger.hd.N0(2131743004, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        if (org.telegram.messenger.hd.f24408a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 48);
        this.f30142b.addView(textView2, c8.na.d(-2, -2.0f, (org.telegram.messenger.hd.f24408a0 ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.f38030p1 = new TextView[3];
        c5.l lVar = new c5.l(context);
        this.f38028m1 = lVar;
        lVar.setClipChildren(false);
        lVar.setOffscreenPageLimit(4);
        lVar.setClipToPadding(false);
        org.telegram.messenger.g0.A3(lVar, 2130706432);
        lVar.setAdapter(new org.telegram.ui.Components.n20(this, 0));
        lVar.setPageMargin(0);
        this.f30142b.addView(lVar, c8.na.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        lVar.b(new org.telegram.ui.Components.k20(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.f30142b.addView(view, c8.na.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.f30142b.addView(view2, c8.na.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(this, getContext());
        this.n1 = l20Var;
        l20Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        l20Var.setTag(-1);
        l20Var.setTextSize(1, 14.0f);
        int i14 = org.telegram.ui.ActionBar.m6.f29376eh;
        org.telegram.ui.ActionBar.t6.U(l20Var, i14, null);
        l20Var.setGravity(17);
        l20Var.setTypeface(org.telegram.messenger.g0.o());
        l20Var.setText(org.telegram.messenger.hd.N0(2131743006, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i14, false), 76);
        l20Var.setForeground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, o4, o4));
        l20Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        l20Var.setOnClickListener(new org.telegram.ui.Components.o0(this, 24));
        this.f30142b.addView(l20Var, c8.na.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38029o1 = linearLayout;
        this.f30142b.addView(linearLayout, c8.na.e(-2, 64, 80));
        int i15 = 0;
        while (true) {
            TextView[] textViewArr = this.f38030p1;
            if (i15 >= textViewArr.length) {
                break;
            }
            textViewArr[i15] = new TextView(context);
            this.f38030p1[i15].setTextSize(1, 12.0f);
            this.f38030p1[i15].setTextColor(-1);
            this.f38030p1[i15].setTypeface(org.telegram.messenger.g0.o());
            this.f38030p1[i15].setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.f38030p1[i15].setGravity(16);
            this.f38030p1[i15].setSingleLine(true);
            this.f38029o1.addView(this.f38030p1[i15], c8.na.o(-2, -1));
            if (i15 == 0) {
                this.f38030p1[i15].setText(org.telegram.messenger.hd.N0(2131743009, null));
            } else if (i15 == 1) {
                this.f38030p1[i15].setText(org.telegram.messenger.hd.N0(2131743007, null));
            } else {
                this.f38030p1[i15].setText(org.telegram.messenger.hd.N0(2131743008, null));
            }
            this.f38030p1[i15].setOnClickListener(new ci.q(this, i15, 14));
            i15++;
        }
        if (z10) {
            this.f38028m1.setCurrentItem(1);
        }
    }

    public final void K0(int i7) {
        int i10;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i11 = org.telegram.ui.ActionBar.m6.f29413gh;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.J = i11;
        f40 f40Var = this.f47875s1.f49147b;
        f40Var.f47503r2 = false;
        t1Var.S = org.telegram.messenger.hd.N0(2131743083, null);
        if (i7 == 0) {
            if (f40Var.V2.f26914b.rtmp_stream) {
                i10 = 2131743086;
            } else {
                i10 = 2131743084;
            }
            t1Var.U = org.telegram.messenger.hd.N0(i10, null);
        } else {
            int i12 = 2131743085;
            if (org.telegram.messenger.v3.W(f40Var.U2)) {
                if (!f40Var.V2.f26914b.rtmp_stream) {
                    i12 = 2131743214;
                }
                t1Var.U = org.telegram.messenger.hd.N0(i12, null);
            } else {
                if (!f40Var.V2.f26914b.rtmp_stream) {
                    i12 = 2131743082;
                }
                t1Var.U = org.telegram.messenger.hd.N0(i12, null);
            }
        }
        t1Var.f30021z0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.V(getContext(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29377ei, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29394fi, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i13 = org.telegram.ui.ActionBar.m6.f29376eh;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i13, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(org.telegram.messenger.hd.N0(2131743100, null));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor, org.telegram.ui.ActionBar.m6.f29393fh, null);
        org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, i13, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, c8.na.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new fy(alertDialog$Builder, 2));
        t1Var.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wg, false));
        t1Var.setOnShowListener(new f30(this, t1Var, editTextBoldCursor, 1));
        t1Var.setOnDismissListener(new gy(editTextBoldCursor, 2));
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744674, null), new ai.n1(this, editTextBoldCursor, i7, 11));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new ey(editTextBoldCursor, 2));
        t1Var.j(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29504lh, false));
        t1Var.show();
        t1Var.p(org.telegram.ui.ActionBar.m6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
    }
}
