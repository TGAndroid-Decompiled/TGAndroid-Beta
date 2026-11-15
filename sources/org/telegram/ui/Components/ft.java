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
public class ft extends EditTextBoldCursor implements org.telegram.ui.ActionBar.h4 {
    public static final int[] d2 = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public String M1;
    public StaticLayout N1;
    public oy0 O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public dt T1;
    public int U1;
    public int V1;
    public boolean W1;
    public int X1;
    public boolean Y1;
    public final org.telegram.ui.ActionBar.e6 Z1;
    public int f34693a2;
    public org.telegram.ui.ActionBar.t1 f34694b2;
    public boolean f34695c2;

    public ft(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.U1 = -1;
        this.V1 = -1;
        this.Z1 = e6Var;
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Jd, e6Var);
        this.f34693a2 = w02;
        this.E = w02;
        addTextChangedListener(new ah.j(this, 19));
        setClipToPadding(true);
    }

    public final void A(xy0 xy0Var) {
        int selectionEnd;
        int i7 = this.U1;
        if (i7 >= 0 && (selectionEnd = this.V1) >= 0) {
            this.V1 = -1;
            this.U1 = -1;
        } else {
            i7 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        org.telegram.messenger.si.f(xy0Var, i7, selectionEnd, getText(), this.W1);
        if (xy0Var == null) {
            Editable text = getText();
            for (qi.g gVar : (qi.g[]) text.getSpans(i7, selectionEnd, qi.g.class)) {
                text.removeSpan(gVar);
            }
            xg0[] xg0VarArr = (xg0[]) text.getSpans(i7, selectionEnd, xg0.class);
            for (int i10 = 0; i10 < xg0VarArr.length; i10++) {
                text.removeSpan(xg0VarArr[i10]);
                text.removeSpan(xg0VarArr[i10].f41683s);
                oi.u5 u5Var = xg0VarArr[i10].f41684w;
                if (u5Var != null) {
                    text.removeSpan(u5Var);
                }
            }
            if (xg0VarArr.length > 0) {
                g(true);
            }
        }
        dt dtVar = this.T1;
        if (dtVar != null) {
            dtVar.E();
        }
    }

    public h41 B(String str) {
        return new h41(str, null);
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
        ih ihVar = new ih(4);
        Pattern pattern = t4.f39505a;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.Z1;
        int i10 = org.telegram.ui.ActionBar.j6.f28957j5;
        if (e6Var != null) {
            x02 = e6Var.f(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        }
        int i11 = x02;
        int i12 = org.telegram.ui.ActionBar.j6.f28922h5;
        if (e6Var != null) {
            x03 = e6Var.f(i12);
        } else {
            x03 = org.telegram.ui.ActionBar.j6.x0(null, i12, false);
        }
        int i13 = x03;
        int i14 = org.telegram.ui.ActionBar.j6.Aj;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.j6.Ej;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.j6.E8;
        if (e6Var != null) {
            e6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.j6.G8;
        if (e6Var != null) {
            e6Var.f(i17);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.j6.f28941i6;
        if (e6Var != null) {
            e6Var.f(i18);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.j6.Ji;
        if (e6Var != null) {
            e6Var.f(i19);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.j6.Fi;
        if (e6Var != null) {
            e6Var.f(i20);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.j6.Hi;
        if (e6Var != null) {
            e6Var.f(i21);
        } else {
            org.telegram.ui.ActionBar.j6.x0(null, i21, false);
        }
        org.telegram.messenger.ou ouVar = new org.telegram.messenger.ou(context, e6Var);
        ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29720w0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i22 = calendar.get(1);
        ib0 ib0Var = new ib0(context, e6Var);
        ib0Var.setTextColor(i11);
        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var.setItemCount(5);
        ib0Var.setMinValue(1);
        ib0Var.setMaxValue(31);
        ib0Var.setWrapSelectorWheel(false);
        ib0Var.setFormatter(new e2(10));
        ib0 ib0Var2 = new ib0(context, e6Var);
        ib0Var2.setTextColor(i11);
        ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        ib0Var2.setItemCount(5);
        ib0Var2.setMinValue(0);
        ib0Var2.setMaxValue(239);
        ib0Var2.setValue(120);
        ib0Var2.setWrapSelectorWheel(false);
        ib0Var2.setFormatter(new ai.s1(calendar, i22, 7));
        ib0 ib0Var3 = new ib0(context, e6Var);
        ib0Var3.setContentDescriptionCallback(new ci.x(5));
        ib0Var3.setWrapSelectorWheel(true);
        ib0Var3.setAllItemsCount(24);
        ib0Var3.setItemCount(5);
        ib0Var3.setTextColor(i11);
        ib0Var3.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var3.setMinValue(0);
        ib0Var3.setMaxValue(23);
        ib0Var3.setFormatter(new e2(11));
        ib0 ib0Var4 = new ib0(context, e6Var);
        ib0Var4.setContentDescriptionCallback(new ci.x(6));
        ib0Var4.setWrapSelectorWheel(true);
        ib0Var4.setAllItemsCount(60);
        ib0Var4.setItemCount(5);
        ib0Var4.setTextColor(i11);
        ib0Var4.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        ib0Var4.setMinValue(0);
        ib0Var4.setMaxValue(59);
        ib0Var4.setValue(0);
        ib0Var4.setFormatter(new e2(12));
        calendar.setTimeInMillis(currentTimeMillis);
        ib0Var4.setValue(calendar.get(12));
        ib0Var3.setValue(calendar.get(11));
        ib0Var.setValue(calendar.get(5));
        ib0Var2.setValue(calendar.get(2) + 120);
        oy0 oy0Var = new oy0(org.telegram.messenger.hd.a0(null, null, 2131742783, "", "").trim(), 16.0f, null);
        oy0Var.p(org.telegram.messenger.g0.L(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        oy0Var.a();
        oy0Var.m(1);
        oy0Var.n(i11);
        oy0 oy0Var2 = new oy0(":", 18.0f, null);
        oy0Var2.p(org.telegram.messenger.g0.L(100.0f));
        oy0Var2.a();
        oy0Var2.m(1);
        oy0Var2.f38101a.setColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        w3 w3Var = new w3(context, ib0Var2, ib0Var, ib0Var3, ib0Var4);
        w3Var.setOrientation(1);
        frameLayout.addView(w3Var, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        w3Var.addView(frameLayout2, c8.ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131746336, null));
        textView.setTextColor(i11);
        i5.c.v(textView, 1, 20.0f);
        frameLayout2.addView(textView, c8.ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        hi.y4 y4Var = new hi.y4(context, oy0Var2, ib0Var4);
        y4Var.setOrientation(0);
        y4Var.setWeightSum(1.0f);
        w3Var.addView(y4Var, c8.ja.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        hi.d dVar = new hi.d(context, e6Var, true);
        di.i6 i6Var = new di.i6(dVar, ib0Var, ib0Var2, ib0Var3, ib0Var4);
        y4Var.addView(ib0Var, c8.ja.l(0.2f, 0, 270));
        y4Var.addView(ib0Var2, c8.ja.l(0.4f, 0, 270));
        y4Var.addView(ib0Var3, c8.ja.l(0.2f, 0, 270));
        y4Var.addView(ib0Var4, c8.ja.l(0.2f, 0, 270));
        ib0Var.setOnValueChangedListener(i6Var);
        ib0Var2.setOnValueChangedListener(i6Var);
        ib0Var3.setOnValueChangedListener(i6Var);
        ib0Var4.setOnValueChangedListener(i6Var);
        boolean[] zArr = {true};
        dVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        dVar.f();
        w3Var.addView(dVar, c8.ja.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new a3(zArr, ib0Var, ib0Var2, ib0Var3, ib0Var4, i0Var, new int[1], ouVar));
        org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) ouVar.f25806b;
        u2Var.O = frameLayout;
        u2Var.show();
        u2Var.setOnDismissListener(new c2(1, ihVar, zArr));
        u2Var.v0(i13);
        u2Var.P(i13);
        t4.c(dVar, ib0Var, ib0Var2, ib0Var3, ib0Var4);
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
        I(org.telegram.messenger.hd.M0(2131751744, null), org.telegram.messenger.hd.M0(2131743917, null), "http://", true, this.f34695c2, new bt(this, i7, selectionEnd, bVar));
    }

    public final boolean H(int i7) {
        int selectionEnd;
        org.telegram.ui.ActionBar.e6 e6Var;
        int selectionEnd2;
        if (i7 == 2131296503) {
            A(null);
            return true;
        } else if (i7 == 2131296491) {
            ?? obj = new Object();
            obj.f41487a |= 1;
            A(new xy0(obj, 0));
            return true;
        } else if (i7 == 2131296497) {
            ?? obj2 = new Object();
            obj2.f41487a |= 2;
            A(new xy0(obj2, 0));
            return true;
        } else if (i7 == 2131296499) {
            ?? obj3 = new Object();
            obj3.f41487a |= 4;
            A(new xy0(obj3, 0));
            return true;
        } else if (i7 == 2131296498) {
            D(null);
            return true;
        } else if (i7 == 2131296509) {
            ?? obj4 = new Object();
            obj4.f41487a |= 8;
            A(new xy0(obj4, 0));
            return true;
        } else if (i7 == 2131296512) {
            ?? obj5 = new Object();
            obj5.f41487a |= 16;
            A(new xy0(obj5, 0));
            return true;
        } else if (i7 == 2131296508) {
            ?? obj6 = new Object();
            obj6.f41487a |= 256;
            A(new xy0(obj6, 0));
            h();
            return true;
        } else if (i7 == 2131296502) {
            int i10 = this.U1;
            if (i10 >= 0 && (selectionEnd2 = this.V1) >= 0) {
                this.V1 = -1;
                this.U1 = -1;
            } else {
                i10 = getSelectionStart();
                selectionEnd2 = getSelectionEnd();
            }
            int c10 = xg0.c(getText(), i10, selectionEnd2, false);
            if (c10 >= 0) {
                setSelection(c10);
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            g(true);
            h();
            return true;
        } else if (i7 == 2131296493) {
            C();
            return true;
        } else if (i7 != 2131296511) {
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
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            Context context = getContext();
            if (T != null) {
                e6Var = T.getResourceProvider();
            } else {
                e6Var = null;
            }
            ?? jaVar = new ja(context, null, false, false, 2, e6Var);
            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
            jaVar.f32837c2 = 1;
            jaVar.d2 = new String[]{"formal", "neutral", "casual"};
            jaVar.f32838e2 = new String[]{"Formal", "Neutral", "Casual"};
            jaVar.f32840g2 = true;
            jaVar.f32841h2 = -1;
            ImageView imageView = new ImageView(context);
            jaVar.T1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231269);
            int i12 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.q6.s(imageView, i12, e6Var2, PorterDuff.Mode.SRC_ATOP);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i12, jaVar.J0)), 1, -1);
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(imageView, h02, null, K, e6Var2);
            jaVar.f35932p1.addView(imageView, c8.ja.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
            c8.na.b(imageView, 0.1f, 1.5f);
            imageView.setOnClickListener(new r21(jaVar, 2));
            String M0 = p21.M0();
            jaVar.f32836b2 = M0;
            if (M0 == null) {
                jaVar.f32836b2 = org.telegram.messenger.c10.j();
            }
            jaVar.G1 = false;
            jaVar.F1 = org.telegram.messenger.g0.L(12.0f);
            int i13 = org.telegram.ui.ActionBar.j6.f28792a7;
            jaVar.v0(org.telegram.ui.ActionBar.j6.w0(i13, jaVar.J0));
            FrameLayout frameLayout = new FrameLayout(context);
            jaVar.U1 = frameLayout;
            frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, org.telegram.ui.ActionBar.j6.w0(i13, jaVar.J0)), org.telegram.ui.ActionBar.j6.w0(i13, jaVar.J0), org.telegram.ui.ActionBar.j6.w0(i13, jaVar.J0)}));
            hi.d dVar = new hi.d(context, e6Var2, true);
            dVar.setRoundRadius(24);
            jaVar.V1 = dVar;
            dVar.setText(org.telegram.messenger.hd.M0(2131747831, null));
            FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
            int i14 = d.leftMargin;
            int i15 = jaVar.f29717u0;
            d.leftMargin = i14 + i15;
            d.rightMargin += i15;
            frameLayout.addView(dVar, d);
            jaVar.f29682b.addView(frameLayout, c8.ja.e(-1, -2, 80));
            int i16 = jaVar.f29717u0;
            int L = org.telegram.messenger.g0.L(66.0f);
            uj0 uj0Var = jaVar.f35931o1;
            uj0Var.setPadding(i16, 0, i16, L);
            uj0Var.setClipToPadding(false);
            uj0Var.r1();
            uj0Var.setOnItemClickListener(new fi.i4(15, jaVar, e6Var2));
            v4.k kVar = new v4.k();
            kVar.f58564m = false;
            kVar.C = false;
            kVar.o(er.h);
            kVar.n(350L);
            uj0Var.setItemAnimator(kVar);
            jaVar.f32839f2.O(false);
            jaVar.W1 = subSequence;
            org.telegram.messenger.b6.d(subSequence.toString(), new gx(jaVar, 24), new rb0(20), false);
            jaVar.Z1 = new at(this, i11, selectionEnd);
            jaVar.show();
            setSelection(i11, selectionEnd);
            return true;
        }
    }

    public final void I(String str, String str2, String str3, boolean z10, boolean z11, et etVar) {
        AlertDialog$Builder alertDialog$Builder;
        String str4;
        int i7;
        CharSequence charSequence;
        org.telegram.ui.ActionBar.e6 e6Var = this.Z1;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(0, getContext(), e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, getContext(), e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder2.f28392a;
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
        org.telegram.ui.ActionBar.q6.U(qVar, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        qVar.setHintText(str2);
        org.telegram.ui.ActionBar.q6.l(qVar, 35, org.telegram.ui.ActionBar.j6.L6, e6Var);
        qVar.setSingleLine(true);
        qVar.setFocusable(true);
        qVar.setTransformHintToHeader(true);
        org.telegram.ui.ActionBar.q6.F(qVar, org.telegram.ui.ActionBar.j6.f28978k6, org.telegram.ui.ActionBar.j6.f28996l6, org.telegram.ui.ActionBar.j6.f29070p7, e6Var);
        qVar.setImeOptions(6);
        qVar.setBackgroundDrawable(null);
        qVar.requestFocus();
        qVar.setPadding(0, 0, 0, 0);
        org.telegram.ui.ActionBar.q6.C(qVar, org.telegram.ui.ActionBar.j6.f29005lg, e6Var);
        org.telegram.ui.ActionBar.q6.l(qVar, 36, org.telegram.ui.ActionBar.j6.f29022mg, e6Var);
        frameLayout.addView(qVar, c8.ja.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.M0(2131747435, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.j6.f29049o6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.j6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.12f, i10);
        org.telegram.ui.ActionBar.m6 K2 = org.telegram.ui.ActionBar.q6.K(0.15f, i10);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(textView, k02, K, K2, e6Var);
        c8.na.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, c8.ja.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        textView.setVisibility(i7);
        ai.j jVar = new ai.j(this, z10, qVar, str4, textView, 9);
        textView.setOnClickListener(new ah.g(this, qVar, jVar, 29));
        qVar.addTextChangedListener(new ah.j(jVar, 20));
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
        jVar.run();
        alertDialog$Builder2.o(frameLayout);
        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), new f1(17, etVar, qVar));
        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        if (z11) {
            this.f34694b2 = t1Var;
            t1Var.setOnDismissListener(new m0(this, 5));
            this.f34694b2.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            di.q qVar2 = qVar;
                            qVar2.requestFocus();
                            org.telegram.messenger.g0.J3(qVar2);
                            return;
                        default:
                            di.q qVar3 = qVar;
                            qVar3.requestFocus();
                            org.telegram.messenger.g0.J3(qVar3);
                            return;
                    }
                }
            });
            this.f34694b2.r(250L);
        } else {
            alertDialog$Builder2.p().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            di.q qVar2 = qVar;
                            qVar2.requestFocus();
                            org.telegram.messenger.g0.J3(qVar2);
                            return;
                        default:
                            di.q qVar3 = qVar;
                            qVar3.requestFocus();
                            org.telegram.messenger.g0.J3(qVar3);
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
            obj.f41487a = i7;
            org.telegram.messenger.si.f(new xy0(obj, 0), i10, min, text, true);
            if ((i7 & 256) != 0) {
                h();
            }
            dt dtVar = this.T1;
            if (dtVar != null) {
                dtVar.E();
            }
        }
    }

    public void b(int i7, int i10, int i11) {
        xy0[] xy0VarArr;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11) {
            int min = Math.min(i11, text.length());
            int i12 = i7 & 256;
            if (i12 != 0) {
                i7 |= 512;
            }
            for (xy0 xy0Var : (xy0[]) text.getSpans(i10, min, xy0.class)) {
                wy0 wy0Var = xy0Var.f41795b;
                int i13 = wy0Var.f41487a;
                if ((i13 & i7) != 0) {
                    int spanStart = text.getSpanStart(xy0Var);
                    int spanEnd = text.getSpanEnd(xy0Var);
                    text.removeSpan(xy0Var);
                    if (spanStart < i10) {
                        text.setSpan(new xy0(new wy0(wy0Var), 0), spanStart, i10, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new xy0(new wy0(wy0Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i10);
                    int min2 = Math.min(spanEnd, min);
                    int i14 = i13 & (~i7);
                    if (i14 != 0 && max < min2) {
                        wy0 wy0Var2 = new wy0(wy0Var);
                        wy0Var2.f41487a = i14;
                        text.setSpan(new xy0(wy0Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i12 != 0) {
                h();
            }
            dt dtVar = this.T1;
            if (dtVar != null) {
                dtVar.E();
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
        xy0[] xy0VarArr = (xy0[]) text.getSpans(max, min, xy0.class);
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = d2[i12];
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < xy0VarArr.length; i15++) {
                    xy0 xy0Var = xy0VarArr[i15];
                    int i16 = xy0Var.f41795b.f41487a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(xy0Var);
                        int spanEnd = text.getSpanEnd(xy0VarArr[i15]);
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
        if (this.E == this.f34693a2) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Jd, this.Z1);
            this.f34693a2 = w02;
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
            if (((AccessibilityNodeInfo.AccessibilityAction) bVar.f56163a).getId() == 268435456) {
                cVar.f56166a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bVar.f56163a);
                break;
            }
            i7++;
        }
        if (hasSelection()) {
            cVar.b(new s0.b(null, 2131296508, org.telegram.messenger.hd.M0(2131745262, null), null));
            cVar.b(new s0.b(null, 2131296491, org.telegram.messenger.hd.M0(2131753671, null), null));
            cVar.b(new s0.b(null, 2131296497, org.telegram.messenger.hd.M0(2131749087, null), null));
            cVar.b(new s0.b(null, 2131296499, org.telegram.messenger.hd.M0(2131748350, null), null));
            cVar.b(new s0.b(null, 2131296509, org.telegram.messenger.hd.M0(2131744437, null), null));
            cVar.b(new s0.b(null, 2131296512, org.telegram.messenger.hd.M0(2131743889, null), null));
            cVar.b(new s0.b(null, 2131296498, org.telegram.messenger.hd.M0(2131751744, null), null));
            cVar.b(new s0.b(null, 2131296503, org.telegram.messenger.hd.M0(2131746337, null), null));
            cVar.b(new s0.b(null, 2131296493, org.telegram.messenger.hd.M0(2131750590, null), null));
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
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bg.o.a(primaryClip.getItemAt(0).getHtmlText()));
                    org.telegram.messenger.j6.m(spannableStringBuilder, getPaint().getFontMetricsInt(), false, null, 0);
                    p5[] p5VarArr = (p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p5.class);
                    if (p5VarArr != null) {
                        for (p5 p5Var : p5VarArr) {
                            p5Var.applyFontMetrics(getPaint().getFontMetricsInt(), g5.f());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    wg0[] wg0VarArr = (wg0[]) getText().getSpans(max, min, wg0.class);
                    if (wg0VarArr != null && wg0VarArr.length > 0) {
                        wg0[] wg0VarArr2 = (wg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), wg0.class);
                        for (int i10 = 0; i10 < wg0VarArr2.length; i10++) {
                            spannableStringBuilder.removeSpan(wg0VarArr2[i10]);
                            spannableStringBuilder.removeSpan(wg0VarArr2[i10].f41344a);
                        }
                    } else {
                        xg0.a(spannableStringBuilder);
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
                    org.telegram.ui.ActionBar.u3 u3Var = this.Z0;
                    if (u3Var != null) {
                        u3Var.finish();
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

    public void setDelegate(dt dtVar) {
        this.T1 = dtVar;
    }

    @Override
    public void setHintColor(int i7) {
        super.setHintColor(i7);
        this.S1 = i7;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.O1 = new oy0(charSequence, 16.0f, getTypeface());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.f9(new org.telegram.ui.Cells.e9(this, callback), callback));
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        return super.startActionMode(new org.telegram.ui.Cells.f9(new org.telegram.ui.Cells.e9(this, callback), callback), i7);
    }

    public void E() {
    }

    public void F() {
    }

    public void G(int i7, int i10) {
    }
}
