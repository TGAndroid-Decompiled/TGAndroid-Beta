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
public class ys extends EditTextBoldCursor implements org.telegram.ui.ActionBar.k4 {
    public static final int[] X1 = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public String G1;
    public StaticLayout H1;
    public my0 I1;
    public int J1;
    public int K1;
    public int L1;
    public int M1;
    public ws N1;
    public int O1;
    public int P1;
    public boolean Q1;
    public int R1;
    public boolean S1;
    public final org.telegram.ui.ActionBar.h6 T1;
    public int U1;
    public org.telegram.ui.ActionBar.u1 V1;
    public boolean W1;

    public ys(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.O1 = -1;
        this.P1 = -1;
        this.T1 = h6Var;
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gd, h6Var);
        this.U1 = w02;
        this.D = w02;
        addTextChangedListener(new ah.j(this, 17));
        setClipToPadding(true);
    }

    public d41 A(String str) {
        return new d41(str, null);
    }

    public final void B() {
        int selectionEnd;
        int x02;
        int x03;
        int i7 = this.O1;
        if (i7 >= 0 && (selectionEnd = this.P1) >= 0) {
            this.P1 = -1;
            this.O1 = -1;
        } else {
            i7 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        Context context = getContext();
        bi.r0 r0Var = new bi.r0(this, i7, selectionEnd);
        us usVar = new us(0);
        Pattern pattern = u4.f38507a;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.T1;
        int i10 = org.telegram.ui.ActionBar.m6.f27998j5;
        if (h6Var != null) {
            x02 = h6Var.f(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        }
        int i11 = x02;
        int i12 = org.telegram.ui.ActionBar.m6.f27963h5;
        if (h6Var != null) {
            x03 = h6Var.f(i12);
        } else {
            x03 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        }
        int i13 = x03;
        int i14 = org.telegram.ui.ActionBar.m6.xj;
        if (h6Var != null) {
            h6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.m6.Bj;
        if (h6Var != null) {
            h6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.m6.E8;
        if (h6Var != null) {
            h6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.m6.G8;
        if (h6Var != null) {
            h6Var.f(i17);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.m6.f27982i6;
        if (h6Var != null) {
            h6Var.f(i18);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.m6.Gi;
        if (h6Var != null) {
            h6Var.f(i19);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.m6.Ci;
        if (h6Var != null) {
            h6Var.f(i20);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.m6.Ei;
        if (h6Var != null) {
            h6Var.f(i21);
        } else {
            org.telegram.ui.ActionBar.m6.x0(null, i21, false);
        }
        h9.f1 f1Var = new h9.f1(context, h6Var);
        ((org.telegram.ui.ActionBar.w2) f1Var.f14325b).f28707v0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i22 = calendar.get(1);
        hb0 hb0Var = new hb0(context, h6Var);
        hb0Var.setTextColor(i11);
        hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        hb0Var.setItemCount(5);
        hb0Var.setMinValue(1);
        hb0Var.setMaxValue(31);
        hb0Var.setWrapSelectorWheel(false);
        hb0Var.setFormatter(new j2(6));
        hb0 hb0Var2 = new hb0(context, h6Var);
        hb0Var2.setTextColor(i11);
        hb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        hb0Var2.setItemCount(5);
        hb0Var2.setMinValue(0);
        hb0Var2.setMaxValue(239);
        hb0Var2.setValue(120);
        hb0Var2.setWrapSelectorWheel(false);
        hb0Var2.setFormatter(new l2.q(calendar, i22, 4));
        hb0 hb0Var3 = new hb0(context, h6Var);
        hb0Var3.setContentDescriptionCallback(new ai.c0(5));
        hb0Var3.setWrapSelectorWheel(true);
        hb0Var3.setAllItemsCount(24);
        hb0Var3.setItemCount(5);
        hb0Var3.setTextColor(i11);
        hb0Var3.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        hb0Var3.setMinValue(0);
        hb0Var3.setMaxValue(23);
        hb0Var3.setFormatter(new j2(7));
        hb0 hb0Var4 = new hb0(context, h6Var);
        hb0Var4.setContentDescriptionCallback(new ai.c0(6));
        hb0Var4.setWrapSelectorWheel(true);
        hb0Var4.setAllItemsCount(60);
        hb0Var4.setItemCount(5);
        hb0Var4.setTextColor(i11);
        hb0Var4.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        hb0Var4.setMinValue(0);
        hb0Var4.setMaxValue(59);
        hb0Var4.setValue(0);
        hb0Var4.setFormatter(new j2(8));
        calendar.setTimeInMillis(currentTimeMillis);
        hb0Var4.setValue(calendar.get(12));
        hb0Var3.setValue(calendar.get(11));
        hb0Var.setValue(calendar.get(5));
        hb0Var2.setValue(calendar.get(2) + 120);
        my0 my0Var = new my0(org.telegram.messenger.id.a0(null, null, 2131742783, "", "").trim(), 16.0f, null);
        my0Var.p(org.telegram.messenger.g0.L(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        my0Var.a();
        my0Var.m(1);
        my0Var.n(i11);
        my0 my0Var2 = new my0(":", 18.0f, null);
        my0Var2.p(org.telegram.messenger.g0.L(100.0f));
        my0Var2.a();
        my0Var2.m(1);
        my0Var2.f36131a.setColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        x3 x3Var = new x3(context, hb0Var2, hb0Var, hb0Var3, hb0Var4);
        x3Var.setOrientation(1);
        frameLayout.addView(x3Var, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        x3Var.addView(frameLayout2, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.id.M0(2131746336, null));
        textView.setTextColor(i11);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        frameLayout2.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.b(10));
        fi.a5 a5Var = new fi.a5(context, my0Var2, hb0Var4);
        a5Var.setOrientation(0);
        a5Var.setWeightSum(1.0f);
        x3Var.addView(a5Var, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        fi.d dVar = new fi.d(context, h6Var, true);
        bi.q7 q7Var = new bi.q7(dVar, hb0Var, hb0Var2, hb0Var3, hb0Var4);
        a5Var.addView(hb0Var, c8.ha.l(0.2f, 0, 270));
        a5Var.addView(hb0Var2, c8.ha.l(0.4f, 0, 270));
        a5Var.addView(hb0Var3, c8.ha.l(0.2f, 0, 270));
        a5Var.addView(hb0Var4, c8.ha.l(0.2f, 0, 270));
        hb0Var.setOnValueChangedListener(q7Var);
        hb0Var2.setOnValueChangedListener(q7Var);
        hb0Var3.setOnValueChangedListener(q7Var);
        hb0Var4.setOnValueChangedListener(q7Var);
        boolean[] zArr = {true};
        dVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        dVar.f();
        x3Var.addView(dVar, c8.ha.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new b3(zArr, hb0Var, hb0Var2, hb0Var3, hb0Var4, r0Var, new int[1], f1Var));
        org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) f1Var.f14325b;
        w2Var.N = frameLayout;
        w2Var.show();
        w2Var.setOnDismissListener(new c2(1, usVar, zArr));
        w2Var.v0(i13);
        w2Var.O(i13);
        u4.c(dVar, hb0Var, hb0Var2, hb0Var3, hb0Var4);
    }

    public final void C(li.b bVar) {
        int selectionEnd;
        int i7 = this.O1;
        if (i7 >= 0 && (selectionEnd = this.P1) >= 0) {
            this.P1 = -1;
            this.O1 = -1;
        } else {
            i7 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        H(org.telegram.messenger.id.M0(2131751744, null), org.telegram.messenger.id.M0(2131743917, null), "http://", true, this.W1, new ts(this, i7, selectionEnd, bVar));
    }

    public final boolean G(int i7) {
        int selectionEnd;
        org.telegram.ui.ActionBar.h6 h6Var;
        int selectionEnd2;
        if (i7 == 2131296503) {
            z(null);
            return true;
        } else if (i7 == 2131296491) {
            ?? obj = new Object();
            obj.f38777a |= 1;
            z(new vy0(obj, 0));
            return true;
        } else if (i7 == 2131296497) {
            ?? obj2 = new Object();
            obj2.f38777a |= 2;
            z(new vy0(obj2, 0));
            return true;
        } else if (i7 == 2131296499) {
            ?? obj3 = new Object();
            obj3.f38777a |= 4;
            z(new vy0(obj3, 0));
            return true;
        } else if (i7 == 2131296498) {
            C(null);
            return true;
        } else if (i7 == 2131296509) {
            ?? obj4 = new Object();
            obj4.f38777a |= 8;
            z(new vy0(obj4, 0));
            return true;
        } else if (i7 == 2131296512) {
            ?? obj5 = new Object();
            obj5.f38777a |= 16;
            z(new vy0(obj5, 0));
            return true;
        } else if (i7 == 2131296508) {
            ?? obj6 = new Object();
            obj6.f38777a |= 256;
            z(new vy0(obj6, 0));
            h();
            return true;
        } else if (i7 == 2131296502) {
            int i10 = this.O1;
            if (i10 >= 0 && (selectionEnd2 = this.P1) >= 0) {
                this.P1 = -1;
                this.O1 = -1;
            } else {
                i10 = getSelectionStart();
                selectionEnd2 = getSelectionEnd();
            }
            int c10 = ug0.c(getText(), i10, selectionEnd2, false);
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
            B();
            return true;
        } else if (i7 != 2131296511) {
            return false;
        } else {
            int i11 = this.O1;
            if (i11 >= 0 && (selectionEnd = this.P1) >= 0) {
                this.P1 = -1;
                this.O1 = -1;
            } else {
                i11 = getSelectionStart();
                selectionEnd = getSelectionEnd();
            }
            CharSequence subSequence = getText().subSequence(i11, selectionEnd);
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            Context context = getContext();
            if (T != null) {
                h6Var = T.getResourceProvider();
            } else {
                h6Var = null;
            }
            ?? maVar = new ma(context, null, false, false, 2, h6Var);
            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
            maVar.f38822b2 = 1;
            maVar.f38823c2 = new String[]{"formal", "neutral", "casual"};
            maVar.d2 = new String[]{"Formal", "Neutral", "Casual"};
            maVar.f38825f2 = true;
            maVar.f38826g2 = -1;
            ImageView imageView = new ImageView(context);
            maVar.S1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231269);
            int i12 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.s(imageView, i12, h6Var2, PorterDuff.Mode.SRC_ATOP);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i12, maVar.I0)), 1, -1);
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(imageView, h02, null, K, h6Var2);
            maVar.f35902o1.addView(imageView, c8.ha.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
            c8.ka.b(imageView, 0.1f, 1.5f);
            imageView.setOnClickListener(new m21(maVar, 2));
            String M0 = k21.M0();
            maVar.f38821a2 = M0;
            if (M0 == null) {
                maVar.f38821a2 = org.telegram.messenger.f10.j();
            }
            maVar.F1 = false;
            maVar.E1 = org.telegram.messenger.g0.L(12.0f);
            int i13 = org.telegram.ui.ActionBar.m6.f27834a7;
            maVar.v0(org.telegram.ui.ActionBar.m6.w0(i13, maVar.I0));
            FrameLayout frameLayout = new FrameLayout(context);
            maVar.T1 = frameLayout;
            frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, org.telegram.ui.ActionBar.m6.w0(i13, maVar.I0)), org.telegram.ui.ActionBar.m6.w0(i13, maVar.I0), org.telegram.ui.ActionBar.m6.w0(i13, maVar.I0)}));
            fi.d dVar = new fi.d(context, h6Var2, true);
            dVar.setRoundRadius(24);
            maVar.U1 = dVar;
            dVar.setText(org.telegram.messenger.id.M0(2131747831, null));
            FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
            int i14 = d.leftMargin;
            int i15 = maVar.f28705t0;
            d.leftMargin = i14 + i15;
            d.rightMargin += i15;
            frameLayout.addView(dVar, d);
            maVar.f28672b.addView(frameLayout, c8.ha.e(-1, -2, 80));
            int i16 = maVar.f28705t0;
            int L = org.telegram.messenger.g0.L(66.0f);
            pj0 pj0Var = maVar.n1;
            pj0Var.setPadding(i16, 0, i16, L);
            pj0Var.setClipToPadding(false);
            pj0Var.r1();
            pj0Var.setOnItemClickListener(new di.q4(15, maVar, h6Var2));
            v4.k kVar = new v4.k();
            kVar.f57079m = false;
            kVar.C = false;
            kVar.o(wq.h);
            kVar.n(350L);
            pj0Var.setItemAnimator(kVar);
            maVar.f38824e2.O(false);
            maVar.V1 = subSequence;
            org.telegram.messenger.b6.d(subSequence.toString(), new ax(maVar, 24), new il0(14), false);
            maVar.Y1 = new ss(this, i11, selectionEnd);
            maVar.show();
            setSelection(i11, selectionEnd);
            return true;
        }
    }

    public final void H(String str, String str2, String str3, boolean z9, boolean z10, xs xsVar) {
        AlertDialog$Builder alertDialog$Builder;
        String str4;
        int i7;
        CharSequence charSequence;
        org.telegram.ui.ActionBar.h6 h6Var = this.T1;
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(0, getContext(), h6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, getContext(), h6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.f27300a;
        u1Var.R = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        final bi.v vVar = new bi.v(getContext(), 4);
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        vVar.setTextSize(1, 18.0f);
        vVar.setText(str4);
        org.telegram.ui.ActionBar.t6.U(vVar, org.telegram.ui.ActionBar.m6.f27998j5, h6Var);
        vVar.setHintText(str2);
        org.telegram.ui.ActionBar.t6.l(vVar, 35, org.telegram.ui.ActionBar.m6.L6, h6Var);
        vVar.setSingleLine(true);
        vVar.setFocusable(true);
        vVar.setTransformHintToHeader(true);
        org.telegram.ui.ActionBar.t6.F(vVar, org.telegram.ui.ActionBar.m6.f28019k6, org.telegram.ui.ActionBar.m6.f28037l6, org.telegram.ui.ActionBar.m6.f28111p7, h6Var);
        vVar.setImeOptions(6);
        vVar.setBackgroundDrawable(null);
        vVar.requestFocus();
        vVar.setPadding(0, 0, 0, 0);
        org.telegram.ui.ActionBar.t6.C(vVar, org.telegram.ui.ActionBar.m6.f27990ig, h6Var);
        org.telegram.ui.ActionBar.t6.l(vVar, 36, org.telegram.ui.ActionBar.m6.f28009jg, h6Var);
        frameLayout.addView(vVar, c8.ha.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.id.M0(2131747435, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.m6.f28090o6;
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
        c8.ka.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, c8.ha.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        textView.setVisibility(i7);
        fi.q1 q1Var = new fi.q1(this, z9, vVar, str4, textView);
        textView.setOnClickListener(new ah.g(this, vVar, q1Var, 24));
        vVar.addTextChangedListener(new ah.j(q1Var, 18));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z9 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                charSequence = null;
            }
            if (charSequence != null) {
                vVar.setText(charSequence);
                vVar.setSelection(0, vVar.getText().length());
            }
        }
        q1Var.run();
        alertDialog$Builder2.o(frameLayout);
        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), new e2(13, xsVar, vVar));
        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
        if (z10) {
            this.V1 = u1Var;
            u1Var.setOnDismissListener(new o0(this, 6));
            this.V1.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            bi.v vVar2 = vVar;
                            vVar2.requestFocus();
                            org.telegram.messenger.g0.K3(vVar2);
                            return;
                        default:
                            bi.v vVar3 = vVar;
                            vVar3.requestFocus();
                            org.telegram.messenger.g0.K3(vVar3);
                            return;
                    }
                }
            });
            this.V1.r(250L);
        } else {
            alertDialog$Builder2.p().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            bi.v vVar2 = vVar;
                            vVar2.requestFocus();
                            org.telegram.messenger.g0.K3(vVar2);
                            return;
                        default:
                            bi.v vVar3 = vVar;
                            vVar3.requestFocus();
                            org.telegram.messenger.g0.K3(vVar3);
                            return;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int L2 = org.telegram.messenger.g0.L(24.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.height = org.telegram.messenger.g0.L(36.0f);
            vVar.setLayoutParams(marginLayoutParams);
        }
        vVar.setSelection(0, vVar.getText().length());
    }

    public void a(int i7, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11 && i10 < (min = Math.min(i11, text.length()))) {
            ?? obj = new Object();
            obj.f38777a = i7;
            org.telegram.messenger.ui.f(new vy0(obj, 0), i10, min, text, true);
            if ((i7 & 256) != 0) {
                h();
            }
            ws wsVar = this.N1;
            if (wsVar != null) {
                wsVar.m();
            }
        }
    }

    public void b(int i7, int i10, int i11) {
        vy0[] vy0VarArr;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11) {
            int min = Math.min(i11, text.length());
            int i12 = i7 & 256;
            if (i12 != 0) {
                i7 |= 512;
            }
            for (vy0 vy0Var : (vy0[]) text.getSpans(i10, min, vy0.class)) {
                uy0 uy0Var = vy0Var.f39820b;
                int i13 = uy0Var.f38777a;
                if ((i13 & i7) != 0) {
                    int spanStart = text.getSpanStart(vy0Var);
                    int spanEnd = text.getSpanEnd(vy0Var);
                    text.removeSpan(vy0Var);
                    if (spanStart < i10) {
                        text.setSpan(new vy0(new uy0(uy0Var), 0), spanStart, i10, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new vy0(new uy0(uy0Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i10);
                    int min2 = Math.min(spanEnd, min);
                    int i14 = i13 & (~i7);
                    if (i14 != 0 && max < min2) {
                        uy0 uy0Var2 = new uy0(uy0Var);
                        uy0Var2.f38777a = i14;
                        text.setSpan(new vy0(uy0Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i12 != 0) {
                h();
            }
            ws wsVar = this.N1;
            if (wsVar != null) {
                wsVar.m();
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
        vy0[] vy0VarArr = (vy0[]) text.getSpans(max, min, vy0.class);
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = X1[i12];
            int i14 = max;
            boolean z9 = true;
            while (z9 && i14 < min) {
                z9 = false;
                for (int i15 = 0; i15 < vy0VarArr.length; i15++) {
                    vy0 vy0Var = vy0VarArr[i15];
                    int i16 = vy0Var.f39820b.f38777a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(vy0Var);
                        int spanEnd = text.getSpanEnd(vy0VarArr[i15]);
                        if (spanStart <= i14 && spanEnd > i14) {
                            z9 = true;
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
        return this.Q1;
    }

    public String getCaption() {
        return this.G1;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        if (this.D == this.U1) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gd, this.T1);
            this.U1 = w02;
            this.D = w02;
        }
        canvas.save();
        canvas.translate(0.0f, this.O);
        super.onDraw(canvas);
        try {
            if (this.H1 != null && this.J1 == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.M1);
                canvas.save();
                canvas.translate(this.K1, this.L1);
                this.H1.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.I1 != null && length() != 0 && (layout = getLayout()) != null && layout.getLineCount() > 0) {
            canvas2 = canvas;
            this.I1.c(layout.getLineRight(0), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, this.M1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s0.d dVar = new s0.d(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.G1)) {
            dVar.l(this.G1);
        }
        ArrayList d = dVar.d();
        int size = d.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            s0.c cVar = (s0.c) d.get(i7);
            if (((AccessibilityNodeInfo.AccessibilityAction) cVar.f54609a).getId() == 268435456) {
                dVar.f54612a.removeAction((AccessibilityNodeInfo.AccessibilityAction) cVar.f54609a);
                break;
            }
            i7++;
        }
        if (hasSelection()) {
            dVar.b(new s0.c(null, 2131296508, org.telegram.messenger.id.M0(2131745262, null), null));
            dVar.b(new s0.c(null, 2131296491, org.telegram.messenger.id.M0(2131753671, null), null));
            dVar.b(new s0.c(null, 2131296497, org.telegram.messenger.id.M0(2131749087, null), null));
            dVar.b(new s0.c(null, 2131296499, org.telegram.messenger.id.M0(2131748350, null), null));
            dVar.b(new s0.c(null, 2131296509, org.telegram.messenger.id.M0(2131744437, null), null));
            dVar.b(new s0.c(null, 2131296512, org.telegram.messenger.id.M0(2131743889, null), null));
            dVar.b(new s0.c(null, 2131296498, org.telegram.messenger.id.M0(2131751744, null), null));
            dVar.b(new s0.c(null, 2131296503, org.telegram.messenger.id.M0(2131746337, null), null));
            dVar.b(new s0.c(null, 2131296493, org.telegram.messenger.id.M0(2131750590, null), null));
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int indexOf;
        int i11;
        boolean z9;
        try {
            if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.S1 = z9;
            super.onMeasure(i7, i10);
            if (this.S1) {
                this.R1 = getLineCount();
            }
            this.S1 = false;
        } catch (Exception e10) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(51.0f));
            org.telegram.messenger.a8.g(e10, true);
        }
        this.H1 = null;
        String str = this.G1;
        if (str != null && str.length() > 0) {
            Editable text = getText();
            if (text.length() > 1 && text.charAt(0) == '@' && (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) != -1) {
                TextPaint paint = getPaint();
                CharSequence subSequence = text.subSequence(0, indexOf + 1);
                int ceil = (int) Math.ceil(paint.measureText(text, 0, i11));
                this.J1 = subSequence.length();
                int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - ceil;
                CharSequence ellipsize = TextUtils.ellipsize(this.G1, paint, measuredWidth, TextUtils.TruncateAt.END);
                this.K1 = ceil;
                try {
                    StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.H1 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        this.K1 = (int) (this.K1 + (-this.H1.getLineLeft(0)));
                    }
                    this.L1 = ((getMeasuredHeight() - this.H1.getLineBottom(0)) / 2) + org.telegram.messenger.g0.L(0.5f);
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
                    org.telegram.messenger.i6.m(spannableStringBuilder, getPaint().getFontMetricsInt(), false, null, 0);
                    q5[] q5VarArr = (q5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), q5.class);
                    if (q5VarArr != null) {
                        for (q5 q5Var : q5VarArr) {
                            q5Var.applyFontMetrics(getPaint().getFontMetricsInt(), h5.f());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    tg0[] tg0VarArr = (tg0[]) getText().getSpans(max, min, tg0.class);
                    if (tg0VarArr != null && tg0VarArr.length > 0) {
                        tg0[] tg0VarArr2 = (tg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), tg0.class);
                        for (int i10 = 0; i10 < tg0VarArr2.length; i10++) {
                            spannableStringBuilder.removeSpan(tg0VarArr2[i10]);
                            spannableStringBuilder.removeSpan(tg0VarArr2[i10].f38307a);
                        }
                    } else {
                        ug0.a(spannableStringBuilder);
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
                    org.telegram.ui.ActionBar.x3 x3Var = this.Y0;
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
    public final void onWindowFocusChanged(boolean z9) {
        try {
            super.onWindowFocusChanged(z9);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (!G(i7) && !super.performAccessibilityAction(i7, bundle)) {
            return false;
        }
        return true;
    }

    public void setAllowTextEntitiesIntersection(boolean z9) {
        this.Q1 = z9;
    }

    public void setCaption(String str) {
        String str2 = this.G1;
        if ((str2 != null && str2.length() != 0) || (str != null && str.length() != 0)) {
            String str3 = this.G1;
            if (str3 == null || !str3.equals(str)) {
                this.G1 = str;
                if (str != null) {
                    this.G1 = str.replace('\n', ' ');
                }
                requestLayout();
            }
        }
    }

    public void setDelegate(ws wsVar) {
        this.N1 = wsVar;
    }

    @Override
    public void setHintColor(int i7) {
        super.setHintColor(i7);
        this.M1 = i7;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.I1 = new my0(charSequence, 16.0f, getTypeface());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.g9(new org.telegram.ui.Cells.f9(this, callback), callback));
    }

    public final void z(vy0 vy0Var) {
        int selectionEnd;
        int i7 = this.O1;
        if (i7 >= 0 && (selectionEnd = this.P1) >= 0) {
            this.P1 = -1;
            this.O1 = -1;
        } else {
            i7 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        org.telegram.messenger.ui.f(vy0Var, i7, selectionEnd, getText(), this.Q1);
        if (vy0Var == null) {
            Editable text = getText();
            for (ni.j jVar : (ni.j[]) text.getSpans(i7, selectionEnd, ni.j.class)) {
                text.removeSpan(jVar);
            }
            ug0[] ug0VarArr = (ug0[]) text.getSpans(i7, selectionEnd, ug0.class);
            for (int i10 = 0; i10 < ug0VarArr.length; i10++) {
                text.removeSpan(ug0VarArr[i10]);
                text.removeSpan(ug0VarArr[i10].f38651s);
                li.w5 w5Var = ug0VarArr[i10].f38652w;
                if (w5Var != null) {
                    text.removeSpan(w5Var);
                }
            }
            if (ug0VarArr.length > 0) {
                g(true);
            }
        }
        ws wsVar = this.N1;
        if (wsVar != null) {
            wsVar.m();
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        return super.startActionMode(new org.telegram.ui.Cells.g9(new org.telegram.ui.Cells.f9(this, callback), callback), i7);
    }

    public void D() {
    }

    public void E() {
    }

    public void F(int i7, int i10) {
    }
}
