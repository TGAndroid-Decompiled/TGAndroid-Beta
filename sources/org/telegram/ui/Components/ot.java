package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class ot extends EditTextBoldCursor implements org.telegram.ui.ActionBar.k4 {
    public static final int[] d2 = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public String M1;
    public StaticLayout N1;
    public xy0 O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public mt T1;
    public int U1;
    public int V1;
    public boolean W1;
    public int X1;
    public boolean Y1;
    public final org.telegram.ui.ActionBar.h6 Z1;
    public int f38316a2;
    public org.telegram.ui.ActionBar.t1 f38317b2;
    public boolean f38318c2;

    public ot(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.U1 = -1;
        this.V1 = -1;
        this.Z1 = h6Var;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jd, h6Var);
        this.f38316a2 = w02;
        this.E = w02;
        addTextChangedListener(new ah.j(this, 20));
        setClipToPadding(true);
    }

    public final void A(gz0 gz0Var) {
        int selectionEnd;
        int i7 = this.U1;
        if (i7 >= 0 && (selectionEnd = this.V1) >= 0) {
            this.V1 = -1;
            this.U1 = -1;
        } else {
            i7 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        org.telegram.messenger.si.f(gz0Var, i7, selectionEnd, getText(), this.W1);
        if (gz0Var == null) {
            Editable text = getText();
            for (qi.g gVar : (qi.g[]) text.getSpans(i7, selectionEnd, qi.g.class)) {
                text.removeSpan(gVar);
            }
            jh0[] jh0VarArr = (jh0[]) text.getSpans(i7, selectionEnd, jh0.class);
            for (int i10 = 0; i10 < jh0VarArr.length; i10++) {
                text.removeSpan(jh0VarArr[i10]);
                text.removeSpan(jh0VarArr[i10].f36467s);
                oi.v5 v5Var = jh0VarArr[i10].f36468w;
                if (v5Var != null) {
                    text.removeSpan(v5Var);
                }
            }
            if (jh0VarArr.length > 0) {
                g(true);
            }
        }
        mt mtVar = this.T1;
        if (mtVar != null) {
            mtVar.g();
        }
    }

    public u41 B(String str) {
        return new u41(str, null);
    }

    public final void C() {
        int selectionEnd;
        int x02;
        int x03;
        int i7 = this.U1;
        if (i7 >= 0 && (selectionEnd = this.V1) >= 0) {
            this.V1 = -1;
            this.U1 = -1;
        } else {
            i7 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        Context context = getContext();
        di.i0 i0Var = new di.i0(this, i7, selectionEnd);
        me meVar = new me(6);
        Pattern pattern = c5.f33977a;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.Z1;
        int i10 = org.telegram.ui.ActionBar.m6.f29455j5;
        if (h6Var != null) {
            x02 = h6Var.i(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        }
        int i11 = x02;
        int i12 = org.telegram.ui.ActionBar.m6.f29420h5;
        if (h6Var != null) {
            x03 = h6Var.i(i12);
        } else {
            x03 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        }
        int i13 = x03;
        int i14 = org.telegram.ui.ActionBar.m6.Aj;
        if (h6Var != null) {
            h6Var.i(i14);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.m6.Ej;
        if (h6Var != null) {
            h6Var.i(i15);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.m6.E8;
        if (h6Var != null) {
            h6Var.i(i16);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.m6.G8;
        if (h6Var != null) {
            h6Var.i(i17);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.m6.f29439i6;
        if (h6Var != null) {
            h6Var.i(i18);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.m6.Ji;
        if (h6Var != null) {
            h6Var.i(i19);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.m6.Fi;
        if (h6Var != null) {
            h6Var.i(i20);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.m6.Hi;
        if (h6Var != null) {
            h6Var.i(i21);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i21, false);
        }
        hi.x4 x4Var = new hi.x4(context, h6Var);
        ((org.telegram.ui.ActionBar.w2) x4Var.f15680b).f30180w0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i22 = calendar.get(1);
        tb0 tb0Var = new tb0(context, h6Var);
        tb0Var.setTextColor(i11);
        tb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        tb0Var.setItemCount(5);
        tb0Var.setMinValue(1);
        tb0Var.setMaxValue(31);
        tb0Var.setWrapSelectorWheel(false);
        tb0Var.setFormatter(new l2(11));
        tb0 tb0Var2 = new tb0(context, h6Var);
        tb0Var2.setTextColor(i11);
        tb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        tb0Var2.setItemCount(5);
        tb0Var2.setMinValue(0);
        tb0Var2.setMaxValue(239);
        tb0Var2.setValue(120);
        tb0Var2.setWrapSelectorWheel(false);
        tb0Var2.setFormatter(new ai.m1(calendar, i22, 6));
        tb0 tb0Var3 = new tb0(context, h6Var);
        tb0Var3.setContentDescriptionCallback(new ci.y(5));
        tb0Var3.setWrapSelectorWheel(true);
        tb0Var3.setAllItemsCount(24);
        tb0Var3.setItemCount(5);
        tb0Var3.setTextColor(i11);
        tb0Var3.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        tb0Var3.setMinValue(0);
        tb0Var3.setMaxValue(23);
        tb0Var3.setFormatter(new l2(12));
        tb0 tb0Var4 = new tb0(context, h6Var);
        tb0Var4.setContentDescriptionCallback(new ci.y(6));
        tb0Var4.setWrapSelectorWheel(true);
        tb0Var4.setAllItemsCount(60);
        tb0Var4.setItemCount(5);
        tb0Var4.setTextColor(i11);
        tb0Var4.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        tb0Var4.setMinValue(0);
        tb0Var4.setMaxValue(59);
        tb0Var4.setValue(0);
        tb0Var4.setFormatter(new l2(13));
        calendar.setTimeInMillis(currentTimeMillis);
        tb0Var4.setValue(calendar.get(12));
        tb0Var3.setValue(calendar.get(11));
        tb0Var.setValue(calendar.get(5));
        tb0Var2.setValue(calendar.get(2) + 120);
        xy0 xy0Var = new xy0(org.telegram.messenger.hd.a0(null, null, 2131742519, "", "").trim(), 16.0f, null);
        xy0Var.p(org.telegram.messenger.g0.L(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        xy0Var.a();
        xy0Var.m(1);
        xy0Var.n(i11);
        xy0 xy0Var2 = new xy0(":", 18.0f, null);
        xy0Var2.p(org.telegram.messenger.g0.L(100.0f));
        xy0Var2.a();
        xy0Var2.m(1);
        xy0Var2.f42222a.setColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        f4 f4Var = new f4(context, tb0Var2, tb0Var, tb0Var3, tb0Var4);
        f4Var.setOrientation(1);
        frameLayout.addView(f4Var, c8.na.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        f4Var.addView(frameLayout2, c8.na.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.N0(2131746140, null));
        textView.setTextColor(i11);
        i5.c.x(textView, 1, 20.0f);
        frameLayout2.addView(textView, c8.na.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        hi.y4 y4Var = new hi.y4(context, xy0Var2, tb0Var4);
        y4Var.setOrientation(0);
        y4Var.setWeightSum(1.0f);
        f4Var.addView(y4Var, c8.na.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        hi.d dVar = new hi.d(context, h6Var, true);
        di.l6 l6Var = new di.l6(dVar, tb0Var, tb0Var2, tb0Var3, tb0Var4);
        y4Var.addView(tb0Var, c8.na.l(0.2f, 0, 270));
        y4Var.addView(tb0Var2, c8.na.l(0.4f, 0, 270));
        y4Var.addView(tb0Var3, c8.na.l(0.2f, 0, 270));
        y4Var.addView(tb0Var4, c8.na.l(0.2f, 0, 270));
        tb0Var.setOnValueChangedListener(l6Var);
        tb0Var2.setOnValueChangedListener(l6Var);
        tb0Var3.setOnValueChangedListener(l6Var);
        tb0Var4.setOnValueChangedListener(l6Var);
        boolean[] zArr = {true};
        dVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        dVar.f();
        f4Var.addView(dVar, c8.na.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new j3(zArr, tb0Var, tb0Var2, tb0Var3, tb0Var4, i0Var, new int[1], x4Var));
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) x4Var.f15680b;
        w2Var.O = frameLayout;
        w2Var.show();
        w2Var.setOnDismissListener(new n2(1, meVar, zArr));
        w2Var.v0(i13);
        w2Var.P(i13);
        c5.c(dVar, tb0Var, tb0Var2, tb0Var3, tb0Var4);
    }

    public final void D(oi.b bVar) {
        int selectionEnd;
        int i7 = this.U1;
        if (i7 >= 0 && (selectionEnd = this.V1) >= 0) {
            this.V1 = -1;
            this.U1 = -1;
        } else {
            i7 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        I(org.telegram.messenger.hd.N0(2131751732, null), org.telegram.messenger.hd.N0(2131743674, null), "http://", true, this.f38318c2, new kt(this, i7, selectionEnd, bVar));
    }

    public final boolean H(int i7) {
        int selectionEnd;
        org.telegram.ui.ActionBar.h6 h6Var;
        int selectionEnd2;
        if (i7 == 2131296505) {
            A(null);
            return true;
        } else if (i7 == 2131296493) {
            ?? obj = new Object();
            obj.f35299a |= 1;
            A(new gz0(obj, 0));
            return true;
        } else if (i7 == 2131296499) {
            ?? obj2 = new Object();
            obj2.f35299a |= 2;
            A(new gz0(obj2, 0));
            return true;
        } else if (i7 == 2131296501) {
            ?? obj3 = new Object();
            obj3.f35299a |= 4;
            A(new gz0(obj3, 0));
            return true;
        } else if (i7 == 2131296500) {
            D(null);
            return true;
        } else if (i7 == 2131296511) {
            ?? obj4 = new Object();
            obj4.f35299a |= 8;
            A(new gz0(obj4, 0));
            return true;
        } else if (i7 == 2131296514) {
            ?? obj5 = new Object();
            obj5.f35299a |= 16;
            A(new gz0(obj5, 0));
            return true;
        } else if (i7 == 2131296510) {
            ?? obj6 = new Object();
            obj6.f35299a |= 256;
            A(new gz0(obj6, 0));
            h();
            return true;
        } else if (i7 == 2131296504) {
            int i10 = this.U1;
            if (i10 >= 0 && (selectionEnd2 = this.V1) >= 0) {
                this.V1 = -1;
                this.U1 = -1;
            } else {
                i10 = getSelectionStart();
                selectionEnd2 = getSelectionEnd();
            }
            int c10 = jh0.c(getText(), i10, selectionEnd2, false);
            if (c10 >= 0) {
                setSelection(c10);
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            g(true);
            h();
            return true;
        } else if (i7 == 2131296495) {
            C();
            return true;
        } else if (i7 != 2131296513) {
            return false;
        } else {
            int i11 = this.U1;
            if (i11 >= 0 && (selectionEnd = this.V1) >= 0) {
                this.V1 = -1;
                this.U1 = -1;
            } else {
                i11 = getSelectionStart();
                selectionEnd = getSelectionEnd();
            }
            CharSequence subSequence = getText().subSequence(i11, selectionEnd);
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            Context context = getContext();
            if (T != null) {
                h6Var = T.getResourceProvider();
            } else {
                h6Var = null;
            }
            ?? saVar = new sa(context, null, false, false, 2, h6Var);
            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
            saVar.f37364c2 = 1;
            saVar.d2 = new String[]{"formal", "neutral", "casual"};
            saVar.f37365e2 = new String[]{"Formal", "Neutral", "Casual"};
            saVar.f37367g2 = true;
            saVar.f37368h2 = -1;
            ImageView imageView = new ImageView(context);
            saVar.T1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231269);
            int i12 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.s(imageView, i12, h6Var2, PorterDuff.Mode.SRC_ATOP);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i12, saVar.J0)), 1, -1);
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var2);
            saVar.f39488p1.addView(imageView, c8.na.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
            c8.sa.b(imageView, 0.1f, 1.5f);
            imageView.setOnClickListener(new d31(saVar, 2));
            String N0 = b31.N0();
            saVar.f37363b2 = N0;
            if (N0 == null) {
                saVar.f37363b2 = org.telegram.messenger.a10.j();
            }
            saVar.G1 = false;
            saVar.F1 = org.telegram.messenger.g0.L(12.0f);
            int i13 = org.telegram.ui.ActionBar.m6.f29290a7;
            saVar.v0(org.telegram.ui.ActionBar.m6.w0(i13, saVar.J0));
            FrameLayout frameLayout = new FrameLayout(context);
            saVar.U1 = frameLayout;
            frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, org.telegram.ui.ActionBar.m6.w0(i13, saVar.J0)), org.telegram.ui.ActionBar.m6.w0(i13, saVar.J0), org.telegram.ui.ActionBar.m6.w0(i13, saVar.J0)}));
            hi.d dVar = new hi.d(context, h6Var2, true);
            dVar.setRoundRadius(24);
            saVar.V1 = dVar;
            dVar.setText(org.telegram.messenger.hd.N0(2131747637, null));
            FrameLayout.LayoutParams d = c8.na.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
            int i14 = d.leftMargin;
            int i15 = saVar.f30177u0;
            d.leftMargin = i14 + i15;
            d.rightMargin += i15;
            frameLayout.addView(dVar, d);
            saVar.f30142b.addView(frameLayout, c8.na.e(-1, -2, 80));
            int i16 = saVar.f30177u0;
            int L = org.telegram.messenger.g0.L(66.0f);
            ek0 ek0Var = saVar.f39487o1;
            ek0Var.setPadding(i16, 0, i16, L);
            ek0Var.setClipToPadding(false);
            ek0Var.r1();
            ek0Var.setOnItemClickListener(new fi.g4(15, saVar, h6Var2));
            v4.k kVar = new v4.k();
            kVar.f59139m = false;
            kVar.C = false;
            kVar.o(nr.h);
            kVar.n(350L);
            ek0Var.setItemAnimator(kVar);
            saVar.f37366f2.O(false);
            saVar.W1 = subSequence;
            org.telegram.messenger.c6.d(subSequence.toString(), new ky(saVar, 23), new xb0(21), false);
            saVar.Z1 = new jt(this, i11, selectionEnd);
            saVar.show();
            setSelection(i11, selectionEnd);
            return true;
        }
    }

    public final void I(String str, String str2, String str3, boolean z10, boolean z11, nt ntVar) {
        AlertDialog$Builder alertDialog$Builder;
        String str4;
        int i7;
        CharSequence charSequence;
        org.telegram.ui.ActionBar.h6 h6Var = this.Z1;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(0, getContext(), h6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, getContext(), h6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28743a;
        t1Var.S = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        final di.q qVar = new di.q(getContext(), 4);
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        qVar.setTextSize(1, 18.0f);
        qVar.setText(str4);
        org.telegram.ui.ActionBar.t6.U(qVar, org.telegram.ui.ActionBar.m6.f29455j5, h6Var);
        qVar.setHintText(str2);
        org.telegram.ui.ActionBar.t6.l(qVar, 35, org.telegram.ui.ActionBar.m6.L6, h6Var);
        qVar.setSingleLine(true);
        qVar.setFocusable(true);
        qVar.setTransformHintToHeader(true);
        org.telegram.ui.ActionBar.t6.F(qVar, org.telegram.ui.ActionBar.m6.f29476k6, org.telegram.ui.ActionBar.m6.f29494l6, org.telegram.ui.ActionBar.m6.f29568p7, h6Var);
        qVar.setImeOptions(6);
        qVar.setBackgroundDrawable(null);
        qVar.requestFocus();
        qVar.setPadding(0, 0, 0, 0);
        org.telegram.ui.ActionBar.t6.C(qVar, org.telegram.ui.ActionBar.m6.f29503lg, h6Var);
        org.telegram.ui.ActionBar.t6.l(qVar, 36, org.telegram.ui.ActionBar.m6.f29520mg, h6Var);
        frameLayout.addView(qVar, c8.na.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.N0(2131747241, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.m6.f29547o6;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.12f, i10);
        org.telegram.ui.ActionBar.p6 K2 = org.telegram.ui.ActionBar.t6.K(0.15f, i10);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView, k02, K, K2, h6Var);
        c8.sa.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, c8.na.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        textView.setVisibility(i7);
        ai.e eVar = new ai.e(this, z10, qVar, str4, textView, 9);
        textView.setOnClickListener(new ah.h(this, qVar, eVar, 29));
        qVar.addTextChangedListener(new ah.j(eVar, 21));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                charSequence = null;
            }
            if (charSequence != null) {
                qVar.setText(charSequence);
                qVar.setSelection(0, qVar.getText().length());
            }
        }
        eVar.run();
        alertDialog$Builder2.o(frameLayout);
        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131747637, null), new h2(16, ntVar, qVar));
        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        if (z11) {
            this.f38317b2 = t1Var;
            t1Var.setOnDismissListener(new z0(this, 5));
            this.f38317b2.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            di.q qVar2 = qVar;
                            qVar2.requestFocus();
                            org.telegram.messenger.g0.I3(qVar2);
                            return;
                        default:
                            di.q qVar3 = qVar;
                            qVar3.requestFocus();
                            org.telegram.messenger.g0.I3(qVar3);
                            return;
                    }
                }
            });
            this.f38317b2.r(250L);
        } else {
            alertDialog$Builder2.p().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            di.q qVar2 = qVar;
                            qVar2.requestFocus();
                            org.telegram.messenger.g0.I3(qVar2);
                            return;
                        default:
                            di.q qVar3 = qVar;
                            qVar3.requestFocus();
                            org.telegram.messenger.g0.I3(qVar3);
                            return;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int L2 = org.telegram.messenger.g0.L(24.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.height = org.telegram.messenger.g0.L(36.0f);
            qVar.setLayoutParams(marginLayoutParams);
        }
        qVar.setSelection(0, qVar.getText().length());
    }

    public void a(int i7, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11 && i10 < (min = Math.min(i11, text.length()))) {
            ?? obj = new Object();
            obj.f35299a = i7;
            org.telegram.messenger.si.f(new gz0(obj, 0), i10, min, text, true);
            if ((i7 & 256) != 0) {
                h();
            }
            mt mtVar = this.T1;
            if (mtVar != null) {
                mtVar.g();
            }
        }
    }

    public void b(int i7, int i10, int i11) {
        gz0[] gz0VarArr;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11) {
            int min = Math.min(i11, text.length());
            int i12 = i7 & 256;
            if (i12 != 0) {
                i7 |= 512;
            }
            for (gz0 gz0Var : (gz0[]) text.getSpans(i10, min, gz0.class)) {
                fz0 fz0Var = gz0Var.f35683b;
                int i13 = fz0Var.f35299a;
                if ((i13 & i7) != 0) {
                    int spanStart = text.getSpanStart(gz0Var);
                    int spanEnd = text.getSpanEnd(gz0Var);
                    text.removeSpan(gz0Var);
                    if (spanStart < i10) {
                        text.setSpan(new gz0(new fz0(fz0Var), 0), spanStart, i10, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new gz0(new fz0(fz0Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i10);
                    int min2 = Math.min(spanEnd, min);
                    int i14 = i13 & (~i7);
                    if (i14 != 0 && max < min2) {
                        fz0 fz0Var2 = new fz0(fz0Var);
                        fz0Var2.f35299a = i14;
                        text.setSpan(new gz0(fz0Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i12 != 0) {
                h();
            }
            mt mtVar = this.T1;
            if (mtVar != null) {
                mtVar.g();
            }
        }
    }

    public int c(int i7, int i10) {
        Editable text = getText();
        if (text == null) {
            return 0;
        }
        int max = Math.max(0, i7);
        int min = Math.min(i10, text.length());
        if (max < 0 || min < 0 || max >= min) {
            return 0;
        }
        gz0[] gz0VarArr = (gz0[]) text.getSpans(max, min, gz0.class);
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = d2[i12];
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < gz0VarArr.length; i15++) {
                    gz0 gz0Var = gz0VarArr[i15];
                    int i16 = gz0Var.f35683b.f35299a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(gz0Var);
                        int spanEnd = text.getSpanEnd(gz0VarArr[i15]);
                        if (spanStart <= i14 && spanEnd > i14) {
                            z10 = true;
                            i14 = spanEnd;
                        }
                    }
                }
            }
            if (i14 >= min) {
                i11 |= i13;
            }
        }
        return i11;
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.W1;
    }

    public String getCaption() {
        return this.M1;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        if (this.E == this.f38316a2) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jd, this.Z1);
            this.f38316a2 = w02;
            this.E = w02;
        }
        canvas.save();
        canvas.translate(0.0f, this.P);
        super.onDraw(canvas);
        try {
            if (this.N1 != null && this.P1 == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.S1);
                canvas.save();
                canvas.translate(this.Q1, this.R1);
                this.N1.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.O1 != null && length() != 0 && (layout = getLayout()) != null && layout.getLineCount() > 0) {
            canvas2 = canvas;
            this.O1.c(layout.getLineRight(0), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, this.S1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s0.c cVar = new s0.c(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.M1)) {
            cVar.l(this.M1);
        }
        ArrayList d = cVar.d();
        int size = d.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            s0.b bVar = (s0.b) d.get(i7);
            if (((AccessibilityNodeInfo.AccessibilityAction) bVar.f56747a).getId() == 268435456) {
                cVar.f56750a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bVar.f56747a);
                break;
            }
            i7++;
        }
        if (hasSelection()) {
            cVar.b(new s0.b(null, 2131296510, org.telegram.messenger.hd.N0(2131745021, null), null));
            cVar.b(new s0.b(null, 2131296493, org.telegram.messenger.hd.N0(2131753668, null), null));
            cVar.b(new s0.b(null, 2131296499, org.telegram.messenger.hd.N0(2131748894, null), null));
            cVar.b(new s0.b(null, 2131296501, org.telegram.messenger.hd.N0(2131748157, null), null));
            cVar.b(new s0.b(null, 2131296511, org.telegram.messenger.hd.N0(2131744196, null), null));
            cVar.b(new s0.b(null, 2131296514, org.telegram.messenger.hd.N0(2131743646, null), null));
            cVar.b(new s0.b(null, 2131296500, org.telegram.messenger.hd.N0(2131751732, null), null));
            cVar.b(new s0.b(null, 2131296505, org.telegram.messenger.hd.N0(2131746141, null), null));
            cVar.b(new s0.b(null, 2131296495, org.telegram.messenger.hd.N0(2131750573, null), null));
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int indexOf;
        int i11;
        boolean z10;
        try {
            if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.Y1 = z10;
            super.onMeasure(i7, i10);
            if (this.Y1) {
                this.X1 = getLineCount();
            }
            this.Y1 = false;
        } catch (Exception e10) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(51.0f));
            org.telegram.messenger.a8.g(e10, true);
        }
        this.N1 = null;
        String str = this.M1;
        if (str != null && str.length() > 0) {
            Editable text = getText();
            if (text.length() > 1 && text.charAt(0) == '@' && (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) != -1) {
                TextPaint paint = getPaint();
                CharSequence subSequence = text.subSequence(0, indexOf + 1);
                int ceil = (int) Math.ceil(paint.measureText(text, 0, i11));
                this.P1 = subSequence.length();
                int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - ceil;
                CharSequence ellipsize = TextUtils.ellipsize(this.M1, paint, measuredWidth, TextUtils.TruncateAt.END);
                this.Q1 = ceil;
                try {
                    StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.N1 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        this.Q1 = (int) (this.Q1 + (-this.N1.getLineLeft(0)));
                    }
                    this.R1 = ((getMeasuredHeight() - this.N1.getLineBottom(0)) / 2) + org.telegram.messenger.g0.L(0.5f);
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bg.p.a(primaryClip.getItemAt(0).getHtmlText()));
                    org.telegram.messenger.j6.m(spannableStringBuilder, getPaint().getFontMetricsInt(), false, null, 0);
                    y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class);
                    if (y5VarArr != null) {
                        for (y5 y5Var : y5VarArr) {
                            y5Var.applyFontMetrics(getPaint().getFontMetricsInt(), p5.f());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    ih0[] ih0VarArr = (ih0[]) getText().getSpans(max, min, ih0.class);
                    if (ih0VarArr != null && ih0VarArr.length > 0) {
                        ih0[] ih0VarArr2 = (ih0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ih0.class);
                        for (int i10 = 0; i10 < ih0VarArr2.length; i10++) {
                            spannableStringBuilder.removeSpan(ih0VarArr2[i10]);
                            spannableStringBuilder.removeSpan(ih0VarArr2[i10].f36212a);
                        }
                    } else {
                        jh0.a(spannableStringBuilder);
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else {
            try {
                if (i7 == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    org.telegram.messenger.g0.g(getText().subSequence(max2, min2));
                    org.telegram.messenger.g0.W(getContext()).closeContextMenu();
                    org.telegram.ui.ActionBar.x3 x3Var = this.Z0;
                    if (x3Var != null) {
                        x3Var.finish();
                    }
                    setSelection(max2, min2);
                    return true;
                } else if (i7 == 16908320) {
                    int max3 = Math.max(0, getSelectionStart());
                    int min3 = Math.min(getText().length(), getSelectionEnd());
                    org.telegram.messenger.g0.g(getText().subSequence(max3, min3));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (max3 != 0) {
                        spannableStringBuilder2.append(getText().subSequence(0, max3));
                    }
                    if (min3 != getText().length()) {
                        spannableStringBuilder2.append(getText().subSequence(min3, getText().length()));
                    }
                    setText(spannableStringBuilder2);
                    setSelection(max3, max3);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        try {
            super.onWindowFocusChanged(z10);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!H(i7) && !super.performAccessibilityAction(i7, bundle)) {
            return false;
        }
        return true;
    }

    public void setAllowTextEntitiesIntersection(boolean z10) {
        this.W1 = z10;
    }

    public void setCaption(String str) {
        String str2 = this.M1;
        if ((str2 != null && str2.length() != 0) || (str != null && str.length() != 0)) {
            String str3 = this.M1;
            if (str3 == null || !str3.equals(str)) {
                this.M1 = str;
                if (str != null) {
                    this.M1 = str.replace('\n', ' ');
                }
                requestLayout();
            }
        }
    }

    public void setDelegate(mt mtVar) {
        this.T1 = mtVar;
    }

    @Override
    public void setHintColor(int i7) {
        super.setHintColor(i7);
        this.S1 = i7;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.O1 = new xy0(charSequence, 16.0f, getTypeface());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.h9(new org.telegram.ui.Cells.g9(this, callback), callback));
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        return super.startActionMode(new org.telegram.ui.Cells.h9(new org.telegram.ui.Cells.g9(this, callback), callback), i7);
    }

    public void E() {
    }

    public void F() {
    }

    public void G(int i7, int i10) {
    }
}
