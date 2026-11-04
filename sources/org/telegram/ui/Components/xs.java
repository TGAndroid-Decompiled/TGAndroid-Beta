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
public class xs extends EditTextBoldCursor implements org.telegram.ui.ActionBar.j4 {
    public static final int[] Y1 = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public String H1;
    public StaticLayout I1;
    public ly0 J1;
    public int K1;
    public int L1;
    public int M1;
    public int N1;
    public vs O1;
    public int P1;
    public int Q1;
    public boolean R1;
    public int S1;
    public boolean T1;
    public final org.telegram.ui.ActionBar.e6 U1;
    public int V1;
    public org.telegram.ui.ActionBar.s1 W1;
    public boolean X1;

    public xs(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.P1 = -1;
        this.Q1 = -1;
        this.U1 = e6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gd, e6Var);
        this.V1 = w02;
        this.E = w02;
        addTextChangedListener(new bh.h(this, 17));
        setClipToPadding(true);
    }

    public x31 A(String str) {
        return new x31(str, null);
    }

    public final void B() {
        int selectionEnd;
        int x02;
        int x03;
        int i3 = this.P1;
        if (i3 >= 0 && (selectionEnd = this.Q1) >= 0) {
            this.Q1 = -1;
            this.P1 = -1;
        } else {
            i3 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        Context context = getContext();
        ci.m0 m0Var = new ci.m0(this, i3, selectionEnd);
        go goVar = new go(2);
        Pattern pattern = t4.f38241a;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.U1;
        int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        if (e6Var != null) {
            x02 = e6Var.f(i10);
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        int i11 = x02;
        int i12 = org.telegram.ui.ActionBar.k6.f27954h5;
        if (e6Var != null) {
            x03 = e6Var.f(i12);
        } else {
            x03 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        }
        int i13 = x03;
        int i14 = org.telegram.ui.ActionBar.k6.xj;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        }
        int i15 = org.telegram.ui.ActionBar.k6.Bj;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.k6.E8;
        if (e6Var != null) {
            e6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.k6.G8;
        if (e6Var != null) {
            e6Var.f(i17);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.k6.f27972i6;
        if (e6Var != null) {
            e6Var.f(i18);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.k6.Gi;
        if (e6Var != null) {
            e6Var.f(i19);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.k6.Ci;
        if (e6Var != null) {
            e6Var.f(i20);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.k6.Ei;
        if (e6Var != null) {
            e6Var.f(i21);
        } else {
            org.telegram.ui.ActionBar.k6.x0(null, i21, false);
        }
        hi.d dVar = new hi.d(context, e6Var);
        ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28621w0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i22 = calendar.get(1);
        cb0 cb0Var = new cb0(context, e6Var);
        cb0Var.setTextColor(i11);
        cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var.setItemCount(5);
        cb0Var.setMinValue(1);
        cb0Var.setMaxValue(31);
        cb0Var.setWrapSelectorWheel(false);
        cb0Var.setFormatter(new a3(3));
        cb0 cb0Var2 = new cb0(context, e6Var);
        cb0Var2.setTextColor(i11);
        cb0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        cb0Var2.setItemCount(5);
        cb0Var2.setMinValue(0);
        cb0Var2.setMaxValue(239);
        cb0Var2.setValue(120);
        cb0Var2.setWrapSelectorWheel(false);
        cb0Var2.setFormatter(new k2.q(calendar, i22, 5));
        cb0 cb0Var3 = new cb0(context, e6Var);
        cb0Var3.setContentDescriptionCallback(new bi.x(5));
        cb0Var3.setWrapSelectorWheel(true);
        cb0Var3.setAllItemsCount(24);
        cb0Var3.setItemCount(5);
        cb0Var3.setTextColor(i11);
        cb0Var3.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        cb0Var3.setMinValue(0);
        cb0Var3.setMaxValue(23);
        cb0Var3.setFormatter(new a3(4));
        cb0 cb0Var4 = new cb0(context, e6Var);
        cb0Var4.setContentDescriptionCallback(new bi.x(6));
        cb0Var4.setWrapSelectorWheel(true);
        cb0Var4.setAllItemsCount(60);
        cb0Var4.setItemCount(5);
        cb0Var4.setTextColor(i11);
        cb0Var4.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        cb0Var4.setMinValue(0);
        cb0Var4.setMaxValue(59);
        cb0Var4.setValue(0);
        cb0Var4.setFormatter(new a3(5));
        calendar.setTimeInMillis(currentTimeMillis);
        cb0Var4.setValue(calendar.get(12));
        cb0Var3.setValue(calendar.get(11));
        cb0Var.setValue(calendar.get(5));
        cb0Var2.setValue(calendar.get(2) + 120);
        ly0 ly0Var = new ly0(org.telegram.messenger.bd.a0(null, null, 2131742793, "", "").trim(), 16.0f, null);
        ly0Var.p(org.telegram.messenger.g0.L(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ly0Var.a();
        ly0Var.m(1);
        ly0Var.n(i11);
        ly0 ly0Var2 = new ly0(":", 18.0f, null);
        ly0Var2.p(org.telegram.messenger.g0.L(100.0f));
        ly0Var2.a();
        ly0Var2.m(1);
        ly0Var2.f35916a.setColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        w3 w3Var = new w3(context, cb0Var2, cb0Var, cb0Var3, cb0Var4);
        w3Var.setOrientation(1);
        frameLayout.addView(w3Var, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        w3Var.addView(frameLayout2, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131746344, null));
        textView.setTextColor(i11);
        k2.p1.t(textView, 1, 20.0f);
        frameLayout2.addView(textView, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new fi.a(10));
        gi.y4 y4Var = new gi.y4(context, ly0Var2, cb0Var4);
        y4Var.setOrientation(0);
        y4Var.setWeightSum(1.0f);
        w3Var.addView(y4Var, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        gi.d dVar2 = new gi.d(context, e6Var, true);
        ci.r6 r6Var = new ci.r6(dVar2, cb0Var, cb0Var2, cb0Var3, cb0Var4);
        y4Var.addView(cb0Var, b8.mf.l(0.2f, 0, 270));
        y4Var.addView(cb0Var2, b8.mf.l(0.4f, 0, 270));
        y4Var.addView(cb0Var3, b8.mf.l(0.2f, 0, 270));
        y4Var.addView(cb0Var4, b8.mf.l(0.2f, 0, 270));
        cb0Var.setOnValueChangedListener(r6Var);
        cb0Var2.setOnValueChangedListener(r6Var);
        cb0Var3.setOnValueChangedListener(r6Var);
        cb0Var4.setOnValueChangedListener(r6Var);
        boolean[] zArr = {true};
        dVar2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        dVar2.f();
        w3Var.addView(dVar2, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
        dVar2.setOnClickListener(new b3(zArr, cb0Var, cb0Var2, cb0Var3, cb0Var4, m0Var, new int[1], dVar));
        org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.f14429b;
        t2Var.O = frameLayout;
        t2Var.show();
        t2Var.setOnDismissListener(new c2(1, goVar, zArr));
        t2Var.v0(i13);
        t2Var.O(i13);
        t4.c(dVar2, cb0Var, cb0Var2, cb0Var3, cb0Var4);
    }

    public final void C(mi.b bVar) {
        int selectionEnd;
        int i3 = this.P1;
        if (i3 >= 0 && (selectionEnd = this.Q1) >= 0) {
            this.Q1 = -1;
            this.P1 = -1;
        } else {
            i3 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        H(org.telegram.messenger.bd.M0(2131751745, null), org.telegram.messenger.bd.M0(2131743927, null), "http://", true, this.X1, new o4.r0(this, i3, selectionEnd, bVar));
    }

    public final boolean G(int i3) {
        int selectionEnd;
        org.telegram.ui.ActionBar.e6 e6Var;
        int selectionEnd2;
        if (i3 == 2131296503) {
            z(null);
            return true;
        } else if (i3 == 2131296491) {
            ?? obj = new Object();
            obj.f38578a |= 1;
            z(new uy0(obj, 0));
            return true;
        } else if (i3 == 2131296497) {
            ?? obj2 = new Object();
            obj2.f38578a |= 2;
            z(new uy0(obj2, 0));
            return true;
        } else if (i3 == 2131296499) {
            ?? obj3 = new Object();
            obj3.f38578a |= 4;
            z(new uy0(obj3, 0));
            return true;
        } else if (i3 == 2131296498) {
            C(null);
            return true;
        } else if (i3 == 2131296509) {
            ?? obj4 = new Object();
            obj4.f38578a |= 8;
            z(new uy0(obj4, 0));
            return true;
        } else if (i3 == 2131296512) {
            ?? obj5 = new Object();
            obj5.f38578a |= 16;
            z(new uy0(obj5, 0));
            return true;
        } else if (i3 == 2131296508) {
            ?? obj6 = new Object();
            obj6.f38578a |= 256;
            z(new uy0(obj6, 0));
            h();
            return true;
        } else if (i3 == 2131296502) {
            int i10 = this.P1;
            if (i10 >= 0 && (selectionEnd2 = this.Q1) >= 0) {
                this.Q1 = -1;
                this.P1 = -1;
            } else {
                i10 = getSelectionStart();
                selectionEnd2 = getSelectionEnd();
            }
            int c2 = xg0.c(getText(), i10, selectionEnd2, false);
            if (c2 >= 0) {
                setSelection(c2);
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            g(true);
            h();
            return true;
        } else if (i3 == 2131296493) {
            B();
            return true;
        } else if (i3 != 2131296511) {
            return false;
        } else {
            int i11 = this.P1;
            if (i11 >= 0 && (selectionEnd = this.Q1) >= 0) {
                this.Q1 = -1;
                this.P1 = -1;
            } else {
                i11 = getSelectionStart();
                selectionEnd = getSelectionEnd();
            }
            CharSequence subSequence = getText().subSequence(i11, selectionEnd);
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            Context context = getContext();
            if (T != null) {
                e6Var = T.getResourceProvider();
            } else {
                e6Var = null;
            }
            ?? maVar = new ma(context, null, false, false, 2, e6Var);
            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
            maVar.Z1 = 1;
            maVar.f37328a2 = new String[]{"formal", "neutral", "casual"};
            maVar.f37329b2 = new String[]{"Formal", "Neutral", "Casual"};
            maVar.f37330d2 = true;
            maVar.f37331e2 = -1;
            ImageView imageView = new ImageView(context);
            maVar.Q1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231269);
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.t(imageView, i12, e6Var2, PorterDuff.Mode.SRC_ATOP);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i12, maVar.J0)), 1, -1);
            org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, e6Var2);
            maVar.m1.addView(imageView, b8.mf.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
            b8.pf.b(imageView, 0.1f, 1.5f);
            imageView.setOnClickListener(new h21(maVar, 2));
            String M0 = f21.M0();
            maVar.Y1 = M0;
            if (M0 == null) {
                maVar.Y1 = org.telegram.messenger.x00.j();
            }
            maVar.D1 = false;
            maVar.C1 = org.telegram.messenger.g0.L(12.0f);
            int i13 = org.telegram.ui.ActionBar.k6.f27824a7;
            maVar.v0(org.telegram.ui.ActionBar.k6.w0(i13, maVar.J0));
            FrameLayout frameLayout = new FrameLayout(context);
            maVar.R1 = frameLayout;
            frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, org.telegram.ui.ActionBar.k6.w0(i13, maVar.J0)), org.telegram.ui.ActionBar.k6.w0(i13, maVar.J0), org.telegram.ui.ActionBar.k6.w0(i13, maVar.J0)}));
            gi.d dVar = new gi.d(context, e6Var2, true);
            dVar.setRoundRadius(24);
            maVar.S1 = dVar;
            dVar.setText(org.telegram.messenger.bd.M0(2131747839, null));
            FrameLayout.LayoutParams d = b8.mf.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
            int i14 = d.leftMargin;
            int i15 = maVar.f28618u0;
            d.leftMargin = i14 + i15;
            d.rightMargin += i15;
            frameLayout.addView(dVar, d);
            maVar.f28586b.addView(frameLayout, b8.mf.e(-1, -2, 80));
            int i16 = maVar.f28618u0;
            int L2 = org.telegram.messenger.g0.L(66.0f);
            tj0 tj0Var = maVar.f36102l1;
            tj0Var.setPadding(i16, 0, i16, L2);
            tj0Var.setClipToPadding(false);
            tj0Var.r1();
            tj0Var.setOnItemClickListener(new ei.q4(15, maVar, e6Var2));
            u4.k kVar = new u4.k();
            kVar.f55567m = false;
            kVar.C = false;
            kVar.o(xq.h);
            kVar.n(350L);
            tj0Var.setItemAnimator(kVar);
            maVar.c2.O(false);
            maVar.T1 = subSequence;
            org.telegram.messenger.b6.d(subSequence.toString(), new zw(maVar, 24), new lf0(15), false);
            maVar.W1 = new ts(this, i11, selectionEnd);
            maVar.show();
            setSelection(i11, selectionEnd);
            return true;
        }
    }

    public final void H(String str, String str2, String str3, boolean z10, boolean z11, ws wsVar) {
        AlertDialog$Builder alertDialog$Builder;
        String str4;
        int i3;
        CharSequence charSequence;
        org.telegram.ui.ActionBar.e6 e6Var = this.U1;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(0, getContext(), e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, getContext(), e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder2.f27343a;
        s1Var.S = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        final ci.s sVar = new ci.s(getContext(), 4);
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        sVar.setTextSize(1, 18.0f);
        sVar.setText(str4);
        org.telegram.ui.ActionBar.r6.V(sVar, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        sVar.setHintText(str2);
        org.telegram.ui.ActionBar.r6.m(sVar, 35, org.telegram.ui.ActionBar.k6.L6, e6Var);
        sVar.setSingleLine(true);
        sVar.setFocusable(true);
        sVar.setTransformHintToHeader(true);
        org.telegram.ui.ActionBar.r6.G(sVar, org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, e6Var);
        sVar.setImeOptions(6);
        sVar.setBackgroundDrawable(null);
        sVar.requestFocus();
        sVar.setPadding(0, 0, 0, 0);
        org.telegram.ui.ActionBar.r6.D(sVar, org.telegram.ui.ActionBar.k6.ig, e6Var);
        org.telegram.ui.ActionBar.r6.m(sVar, 36, org.telegram.ui.ActionBar.k6.f27998jg, e6Var);
        frameLayout.addView(sVar, b8.mf.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.bd.M0(2131747443, null));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.k6.f28081o6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        int L = org.telegram.messenger.g0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.k6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i10);
        org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.15f, i10);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView, k02, L2, L3, e6Var);
        b8.pf.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, b8.mf.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        gi.q1 q1Var = new gi.q1(this, z10, sVar, str4, textView);
        textView.setOnClickListener(new ai.h(this, sVar, q1Var, 29));
        sVar.addTextChangedListener(new bh.h(q1Var, 18));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                charSequence = null;
            }
            if (charSequence != null) {
                sVar.setText(charSequence);
                sVar.setSelection(0, sVar.getText().length());
            }
        }
        q1Var.run();
        alertDialog$Builder2.o(frameLayout);
        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), new org.telegram.ui.jo(23, wsVar, sVar));
        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        if (z11) {
            this.W1 = s1Var;
            s1Var.setOnDismissListener(new p0(this, 6));
            this.W1.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ci.s sVar2 = sVar;
                            sVar2.requestFocus();
                            org.telegram.messenger.g0.K3(sVar2);
                            return;
                        default:
                            ci.s sVar3 = sVar;
                            sVar3.requestFocus();
                            org.telegram.messenger.g0.K3(sVar3);
                            return;
                    }
                }
            });
            this.W1.r(250L);
        } else {
            alertDialog$Builder2.p().setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ci.s sVar2 = sVar;
                            sVar2.requestFocus();
                            org.telegram.messenger.g0.K3(sVar2);
                            return;
                        default:
                            ci.s sVar3 = sVar;
                            sVar3.requestFocus();
                            org.telegram.messenger.g0.K3(sVar3);
                            return;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int L4 = org.telegram.messenger.g0.L(24.0f);
            marginLayoutParams.leftMargin = L4;
            marginLayoutParams.rightMargin = L4;
            marginLayoutParams.height = org.telegram.messenger.g0.L(36.0f);
            sVar.setLayoutParams(marginLayoutParams);
        }
        sVar.setSelection(0, sVar.getText().length());
    }

    public void a(int i3, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11 && i10 < (min = Math.min(i11, text.length()))) {
            ?? obj = new Object();
            obj.f38578a = i3;
            org.telegram.messenger.li.f(new uy0(obj, 0), i10, min, text, true);
            if ((i3 & 256) != 0) {
                h();
            }
            vs vsVar = this.O1;
            if (vsVar != null) {
                vsVar.m();
            }
        }
    }

    public void b(int i3, int i10, int i11) {
        uy0[] uy0VarArr;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11) {
            int min = Math.min(i11, text.length());
            int i12 = i3 & 256;
            if (i12 != 0) {
                i3 |= 512;
            }
            for (uy0 uy0Var : (uy0[]) text.getSpans(i10, min, uy0.class)) {
                ty0 ty0Var = uy0Var.f38912b;
                int i13 = ty0Var.f38578a;
                if ((i13 & i3) != 0) {
                    int spanStart = text.getSpanStart(uy0Var);
                    int spanEnd = text.getSpanEnd(uy0Var);
                    text.removeSpan(uy0Var);
                    if (spanStart < i10) {
                        text.setSpan(new uy0(new ty0(ty0Var), 0), spanStart, i10, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new uy0(new ty0(ty0Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i10);
                    int min2 = Math.min(spanEnd, min);
                    int i14 = i13 & (~i3);
                    if (i14 != 0 && max < min2) {
                        ty0 ty0Var2 = new ty0(ty0Var);
                        ty0Var2.f38578a = i14;
                        text.setSpan(new uy0(ty0Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i12 != 0) {
                h();
            }
            vs vsVar = this.O1;
            if (vsVar != null) {
                vsVar.m();
            }
        }
    }

    public int c(int i3, int i10) {
        Editable text = getText();
        if (text == null) {
            return 0;
        }
        int max = Math.max(0, i3);
        int min = Math.min(i10, text.length());
        if (max < 0 || min < 0 || max >= min) {
            return 0;
        }
        uy0[] uy0VarArr = (uy0[]) text.getSpans(max, min, uy0.class);
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = Y1[i12];
            int i14 = max;
            boolean z10 = true;
            while (z10 && i14 < min) {
                z10 = false;
                for (int i15 = 0; i15 < uy0VarArr.length; i15++) {
                    uy0 uy0Var = uy0VarArr[i15];
                    int i16 = uy0Var.f38912b.f38578a;
                    if ((i16 & 512) != 0) {
                        i16 |= 256;
                    }
                    if ((i16 & i13) != 0) {
                        int spanStart = text.getSpanStart(uy0Var);
                        int spanEnd = text.getSpanEnd(uy0VarArr[i15]);
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
        return this.R1;
    }

    public String getCaption() {
        return this.H1;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        if (this.E == this.V1) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gd, this.U1);
            this.V1 = w02;
            this.E = w02;
        }
        canvas.save();
        canvas.translate(0.0f, this.P);
        super.onDraw(canvas);
        try {
            if (this.I1 != null && this.K1 == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.N1);
                canvas.save();
                canvas.translate(this.L1, this.M1);
                this.I1.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.J1 != null && length() != 0 && (layout = getLayout()) != null && layout.getLineCount() > 0) {
            canvas2 = canvas;
            this.J1.c(layout.getLineRight(0), (getHeight() / 2.0f) + org.telegram.messenger.g0.L(1.0f), 1.0f, this.N1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s0.d dVar = new s0.d(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.H1)) {
            dVar.l(this.H1);
        }
        ArrayList d = dVar.d();
        int size = d.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            s0.c cVar = (s0.c) d.get(i3);
            if (((AccessibilityNodeInfo.AccessibilityAction) cVar.f54567a).getId() == 268435456) {
                dVar.f54570a.removeAction((AccessibilityNodeInfo.AccessibilityAction) cVar.f54567a);
                break;
            }
            i3++;
        }
        if (hasSelection()) {
            dVar.b(new s0.c(null, 2131296508, org.telegram.messenger.bd.M0(2131745272, null), null));
            dVar.b(new s0.c(null, 2131296491, org.telegram.messenger.bd.M0(2131753671, null), null));
            dVar.b(new s0.c(null, 2131296497, org.telegram.messenger.bd.M0(2131749095, null), null));
            dVar.b(new s0.c(null, 2131296499, org.telegram.messenger.bd.M0(2131748358, null), null));
            dVar.b(new s0.c(null, 2131296509, org.telegram.messenger.bd.M0(2131744447, null), null));
            dVar.b(new s0.c(null, 2131296512, org.telegram.messenger.bd.M0(2131743899, null), null));
            dVar.b(new s0.c(null, 2131296498, org.telegram.messenger.bd.M0(2131751745, null), null));
            dVar.b(new s0.c(null, 2131296503, org.telegram.messenger.bd.M0(2131746345, null), null));
            dVar.b(new s0.c(null, 2131296493, org.telegram.messenger.bd.M0(2131750591, null), null));
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int indexOf;
        int i11;
        boolean z10;
        try {
            if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T1 = z10;
            super.onMeasure(i3, i10);
            if (this.T1) {
                this.S1 = getLineCount();
            }
            this.T1 = false;
        } catch (Exception e10) {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(51.0f));
            org.telegram.messenger.a8.g(e10, true);
        }
        this.I1 = null;
        String str = this.H1;
        if (str != null && str.length() > 0) {
            Editable text = getText();
            if (text.length() > 1 && text.charAt(0) == '@' && (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) != -1) {
                TextPaint paint = getPaint();
                CharSequence subSequence = text.subSequence(0, indexOf + 1);
                int ceil = (int) Math.ceil(paint.measureText(text, 0, i11));
                this.K1 = subSequence.length();
                int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - ceil;
                CharSequence ellipsize = TextUtils.ellipsize(this.H1, paint, measuredWidth, TextUtils.TruncateAt.END);
                this.L1 = ceil;
                try {
                    StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.I1 = staticLayout;
                    if (staticLayout.getLineCount() > 0) {
                        this.L1 = (int) (this.L1 + (-this.I1.getLineLeft(0)));
                    }
                    this.M1 = ((getMeasuredHeight() - this.I1.getLineBottom(0)) / 2) + org.telegram.messenger.g0.L(0.5f);
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i3) {
        if (i3 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cg.n.a(primaryClip.getItemAt(0).getHtmlText()));
                    org.telegram.messenger.i6.m(spannableStringBuilder, getPaint().getFontMetricsInt(), false, null, 0);
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
                            spannableStringBuilder.removeSpan(wg0VarArr2[i10].f40007a);
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
                if (i3 == 16908321) {
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
                } else if (i3 == 16908320) {
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
        return super.onTextContextMenuItem(i3);
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
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        if (!G(i3) && !super.performAccessibilityAction(i3, bundle)) {
            return false;
        }
        return true;
    }

    public void setAllowTextEntitiesIntersection(boolean z10) {
        this.R1 = z10;
    }

    public void setCaption(String str) {
        String str2 = this.H1;
        if ((str2 != null && str2.length() != 0) || (str != null && str.length() != 0)) {
            String str3 = this.H1;
            if (str3 == null || !str3.equals(str)) {
                this.H1 = str;
                if (str != null) {
                    this.H1 = str.replace('\n', ' ');
                }
                requestLayout();
            }
        }
    }

    public void setDelegate(vs vsVar) {
        this.O1 = vsVar;
    }

    @Override
    public void setHintColor(int i3) {
        super.setHintColor(i3);
        this.N1 = i3;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.J1 = new ly0(charSequence, 16.0f, getTypeface());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.f9(new org.telegram.ui.Cells.e9(this, callback), callback));
    }

    public final void z(uy0 uy0Var) {
        int selectionEnd;
        int i3 = this.P1;
        if (i3 >= 0 && (selectionEnd = this.Q1) >= 0) {
            this.Q1 = -1;
            this.P1 = -1;
        } else {
            i3 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        org.telegram.messenger.li.f(uy0Var, i3, selectionEnd, getText(), this.R1);
        if (uy0Var == null) {
            Editable text = getText();
            for (oi.h hVar : (oi.h[]) text.getSpans(i3, selectionEnd, oi.h.class)) {
                text.removeSpan(hVar);
            }
            xg0[] xg0VarArr = (xg0[]) text.getSpans(i3, selectionEnd, xg0.class);
            for (int i10 = 0; i10 < xg0VarArr.length; i10++) {
                text.removeSpan(xg0VarArr[i10]);
                text.removeSpan(xg0VarArr[i10].f40361s);
                mi.x5 x5Var = xg0VarArr[i10].f40362w;
                if (x5Var != null) {
                    text.removeSpan(x5Var);
                }
            }
            if (xg0VarArr.length > 0) {
                g(true);
            }
        }
        vs vsVar = this.O1;
        if (vsVar != null) {
            vsVar.m();
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i3) {
        return super.startActionMode(new org.telegram.ui.Cells.f9(new org.telegram.ui.Cells.e9(this, callback), callback), i3);
    }

    public void D() {
    }

    public void E() {
    }

    public void F(int i3, int i10) {
    }
}
