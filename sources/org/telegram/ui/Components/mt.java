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
public class mt extends EditTextBoldCursor implements org.telegram.ui.ActionBar.r4 {
    public static final int[] X1 = {1, 2, 4, 8, 16, 256, 16384, 32768};
    public String G1;
    public StaticLayout H1;
    public qz0 I1;
    public int J1;
    public int K1;
    public int L1;
    public int M1;
    public kt N1;
    public int O1;
    public int P1;
    public boolean Q1;
    public int R1;
    public boolean S1;
    public final org.telegram.ui.ActionBar.p6 T1;
    public int U1;
    public org.telegram.ui.ActionBar.x1 V1;
    public boolean W1;

    public mt(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.O1 = -1;
        this.P1 = -1;
        this.T1 = p6Var;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gd, p6Var);
        this.U1 = w02;
        this.D = w02;
        addTextChangedListener(new ag.a1(this, 12));
        setClipToPadding(true);
    }

    public g51 A(String str) {
        return new g51(str, null);
    }

    public final void B() {
        int selectionEnd;
        int x02;
        int x03;
        int i10 = this.O1;
        if (i10 >= 0 && (selectionEnd = this.P1) >= 0) {
            this.P1 = -1;
            this.O1 = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        Context context = getContext();
        ht htVar = new ht(this, i10, selectionEnd);
        org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(19);
        Pattern pattern = s4.f30123a;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.T1;
        int i11 = org.telegram.ui.ActionBar.t6.f21037j5;
        if (p6Var != null) {
            x02 = p6Var.f(i11);
        } else {
            x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        }
        int i12 = x02;
        int i13 = org.telegram.ui.ActionBar.t6.f21001h5;
        if (p6Var != null) {
            x03 = p6Var.f(i13);
        } else {
            x03 = org.telegram.ui.ActionBar.t6.x0(null, i13, false);
        }
        int i14 = x03;
        int i15 = org.telegram.ui.ActionBar.t6.xj;
        if (p6Var != null) {
            p6Var.f(i15);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i15, false);
        }
        int i16 = org.telegram.ui.ActionBar.t6.Bj;
        if (p6Var != null) {
            p6Var.f(i16);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i16, false);
        }
        int i17 = org.telegram.ui.ActionBar.t6.E8;
        if (p6Var != null) {
            p6Var.f(i17);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i17, false);
        }
        int i18 = org.telegram.ui.ActionBar.t6.G8;
        if (p6Var != null) {
            p6Var.f(i18);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i18, false);
        }
        int i19 = org.telegram.ui.ActionBar.t6.f21020i6;
        if (p6Var != null) {
            p6Var.f(i19);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i19, false);
        }
        int i20 = org.telegram.ui.ActionBar.t6.Gi;
        if (p6Var != null) {
            p6Var.f(i20);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i20, false);
        }
        int i21 = org.telegram.ui.ActionBar.t6.Ci;
        if (p6Var != null) {
            p6Var.f(i21);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i21, false);
        }
        int i22 = org.telegram.ui.ActionBar.t6.Ei;
        if (p6Var != null) {
            p6Var.f(i22);
        } else {
            org.telegram.ui.ActionBar.t6.x0(null, i22, false);
        }
        l2.f fVar = new l2.f(context, p6Var);
        ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21617v0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i23 = calendar.get(1);
        ac0 ac0Var = new ac0(context, p6Var);
        ac0Var.setTextColor(i12);
        ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
        ac0Var.setItemCount(5);
        ac0Var.setMinValue(1);
        ac0Var.setMaxValue(31);
        ac0Var.setWrapSelectorWheel(false);
        ac0Var.setFormatter(new v1(20));
        ac0 ac0Var2 = new ac0(context, p6Var);
        ac0Var2.setTextColor(i12);
        ac0Var2.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
        ac0Var2.setItemCount(5);
        ac0Var2.setMinValue(0);
        ac0Var2.setMaxValue(239);
        ac0Var2.setValue(120);
        ac0Var2.setWrapSelectorWheel(false);
        ac0Var2.setFormatter(new i2.q(calendar, i23, 6));
        ac0 ac0Var3 = new ac0(context, p6Var);
        ac0Var3.setContentDescriptionCallback(new org.telegram.ui.zh(2));
        ac0Var3.setWrapSelectorWheel(true);
        ac0Var3.setAllItemsCount(24);
        ac0Var3.setItemCount(5);
        ac0Var3.setTextColor(i12);
        ac0Var3.setTextOffset(org.telegram.messenger.i0.L(10.0f));
        ac0Var3.setMinValue(0);
        ac0Var3.setMaxValue(23);
        ac0Var3.setFormatter(new v1(21));
        ac0 ac0Var4 = new ac0(context, p6Var);
        ac0Var4.setContentDescriptionCallback(new org.telegram.ui.zh(3));
        ac0Var4.setWrapSelectorWheel(true);
        ac0Var4.setAllItemsCount(60);
        ac0Var4.setItemCount(5);
        ac0Var4.setTextColor(i12);
        ac0Var4.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
        ac0Var4.setMinValue(0);
        ac0Var4.setMaxValue(59);
        ac0Var4.setValue(0);
        ac0Var4.setFormatter(new v1(22));
        calendar.setTimeInMillis(currentTimeMillis);
        ac0Var4.setValue(calendar.get(12));
        ac0Var3.setValue(calendar.get(11));
        ac0Var.setValue(calendar.get(5));
        ac0Var2.setValue(calendar.get(2) + 120);
        qz0 qz0Var = new qz0(org.telegram.messenger.cd.a0(null, null, 2131742808, "", "").trim(), 16.0f, null);
        qz0Var.p(org.telegram.messenger.i0.L(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        qz0Var.a();
        qz0Var.m(1);
        qz0Var.n(i12);
        qz0 qz0Var2 = new qz0(":", 18.0f, null);
        qz0Var2.p(org.telegram.messenger.i0.L(100.0f));
        qz0Var2.a();
        qz0Var2.m(1);
        qz0Var2.f29772a.setColor(i12);
        FrameLayout frameLayout = new FrameLayout(context);
        mg.o oVar = new mg.o(context, ac0Var2, ac0Var, ac0Var3, ac0Var4);
        oVar.setOrientation(1);
        frameLayout.addView(oVar, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        oVar.addView(frameLayout2, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.cd.L0(2131746351, null));
        textView.setTextColor(i12);
        sc.e.t(textView, 1, 20.0f);
        frameLayout2.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
        jg.d0 d0Var = new jg.d0(context, qz0Var2, ac0Var4);
        d0Var.setOrientation(0);
        d0Var.setWeightSum(1.0f);
        oVar.addView(d0Var, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        vh.d dVar = new vh.d(context, p6Var, true);
        f1.a aVar = new f1.a(dVar, ac0Var, ac0Var2, ac0Var3, ac0Var4);
        d0Var.addView(ac0Var, w7.b6.l(0.2f, 0, 270));
        d0Var.addView(ac0Var2, w7.b6.l(0.4f, 0, 270));
        d0Var.addView(ac0Var3, w7.b6.l(0.2f, 0, 270));
        d0Var.addView(ac0Var4, w7.b6.l(0.2f, 0, 270));
        ac0Var.setOnValueChangedListener(aVar);
        ac0Var2.setOnValueChangedListener(aVar);
        ac0Var3.setOnValueChangedListener(aVar);
        ac0Var4.setOnValueChangedListener(aVar);
        boolean[] zArr = {true};
        dVar.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        dVar.f();
        oVar.addView(dVar, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
        dVar.setOnClickListener(new b3(zArr, ac0Var, ac0Var2, ac0Var3, ac0Var4, htVar, new int[1], fVar));
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.f11587b;
        z2Var.N = frameLayout;
        z2Var.show();
        z2Var.setOnDismissListener(new d2(1, rzVar, zArr));
        z2Var.v0(i14);
        z2Var.P(i14);
        s4.c(dVar, ac0Var, ac0Var2, ac0Var3, ac0Var4);
    }

    public final void C(bi.b bVar) {
        int selectionEnd;
        int i10 = this.O1;
        if (i10 >= 0 && (selectionEnd = this.P1) >= 0) {
            this.P1 = -1;
            this.O1 = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        H(org.telegram.messenger.cd.L0(2131751745, null), org.telegram.messenger.cd.L0(2131743942, null), "http://", true, this.W1, new m4.s0(this, i10, selectionEnd, bVar));
    }

    public final boolean G(int i10) {
        int selectionEnd;
        org.telegram.ui.ActionBar.p6 p6Var;
        int selectionEnd2;
        if (i10 == 2131296503) {
            z(null);
            return true;
        } else if (i10 == 2131296491) {
            ?? obj = new Object();
            obj.f32850a |= 1;
            z(new zz0(obj, 0));
            return true;
        } else if (i10 == 2131296497) {
            ?? obj2 = new Object();
            obj2.f32850a |= 2;
            z(new zz0(obj2, 0));
            return true;
        } else if (i10 == 2131296499) {
            ?? obj3 = new Object();
            obj3.f32850a |= 4;
            z(new zz0(obj3, 0));
            return true;
        } else if (i10 == 2131296498) {
            C(null);
            return true;
        } else if (i10 == 2131296509) {
            ?? obj4 = new Object();
            obj4.f32850a |= 8;
            z(new zz0(obj4, 0));
            return true;
        } else if (i10 == 2131296512) {
            ?? obj5 = new Object();
            obj5.f32850a |= 16;
            z(new zz0(obj5, 0));
            return true;
        } else if (i10 == 2131296508) {
            ?? obj6 = new Object();
            obj6.f32850a |= 256;
            z(new zz0(obj6, 0));
            h();
            return true;
        } else if (i10 == 2131296502) {
            int i11 = this.O1;
            if (i11 >= 0 && (selectionEnd2 = this.P1) >= 0) {
                this.P1 = -1;
                this.O1 = -1;
            } else {
                i11 = getSelectionStart();
                selectionEnd2 = getSelectionEnd();
            }
            int c10 = wh0.c(getText(), i11, selectionEnd2, false);
            if (c10 >= 0) {
                setSelection(c10);
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            g(true);
            h();
            return true;
        } else if (i10 == 2131296493) {
            B();
            return true;
        } else if (i10 != 2131296511) {
            return false;
        } else {
            int i12 = this.O1;
            if (i12 >= 0 && (selectionEnd = this.P1) >= 0) {
                this.P1 = -1;
                this.O1 = -1;
            } else {
                i12 = getSelectionStart();
                selectionEnd = getSelectionEnd();
            }
            CharSequence subSequence = getText().subSequence(i12, selectionEnd);
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            Context context = getContext();
            if (T != null) {
                p6Var = T.getResourceProvider();
            } else {
                p6Var = null;
            }
            ?? haVar = new ha(context, null, false, false, 2, p6Var);
            org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
            haVar.Y1 = 1;
            haVar.Z1 = new String[]{"formal", "neutral", "casual"};
            haVar.a2 = new String[]{"Formal", "Neutral", "Casual"};
            haVar.f32307c2 = true;
            haVar.f32308d2 = -1;
            ImageView imageView = new ImageView(context);
            haVar.P1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231270);
            int i13 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.t(imageView, i13, p6Var2, PorterDuff.Mode.SRC_ATOP);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i13, haVar.I0)), 1, -1);
            org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.1f, i13);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(imageView, h02, null, L, p6Var2);
            haVar.l1.addView(imageView, w7.b6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
            w7.e6.b(imageView, 0.1f, 1.5f);
            imageView.setOnClickListener(new o31(haVar, 2));
            String M0 = m31.M0();
            haVar.X1 = M0;
            if (M0 == null) {
                haVar.X1 = org.telegram.messenger.t10.j();
            }
            haVar.C1 = false;
            haVar.B1 = org.telegram.messenger.i0.L(12.0f);
            int i14 = org.telegram.ui.ActionBar.t6.f20872a7;
            haVar.v0(org.telegram.ui.ActionBar.t6.w0(i14, haVar.I0));
            FrameLayout frameLayout = new FrameLayout(context);
            haVar.Q1 = frameLayout;
            frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, org.telegram.ui.ActionBar.t6.w0(i14, haVar.I0)), org.telegram.ui.ActionBar.t6.w0(i14, haVar.I0), org.telegram.ui.ActionBar.t6.w0(i14, haVar.I0)}));
            vh.d dVar = new vh.d(context, p6Var2, true);
            dVar.setRoundRadius(24);
            haVar.R1 = dVar;
            dVar.setText(org.telegram.messenger.cd.L0(2131747847, null));
            FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
            int i15 = d.leftMargin;
            int i16 = haVar.f21615t0;
            d.leftMargin = i15 + i16;
            d.rightMargin += i16;
            frameLayout.addView(dVar, d);
            haVar.f21586b.addView(frameLayout, w7.b6.e(-1, -2, 80));
            int i17 = haVar.f21615t0;
            int L2 = org.telegram.messenger.i0.L(66.0f);
            tk0 tk0Var = haVar.f26666k1;
            tk0Var.setPadding(i17, 0, i17, L2);
            tk0Var.setClipToPadding(false);
            tk0Var.r1();
            tk0Var.setOnItemClickListener(new mg.q0(14, haVar, p6Var2));
            s4.j jVar = new s4.j();
            jVar.f47927m = false;
            jVar.C = false;
            jVar.o(gr.h);
            jVar.n(350L);
            tk0Var.setItemAnimator(jVar);
            haVar.f32306b2.O(false);
            haVar.S1 = subSequence;
            org.telegram.messenger.js.d(subSequence.toString(), new px(haVar, 24), new z11(1), false);
            haVar.V1 = new gt(this, i12, selectionEnd);
            haVar.show();
            setSelection(i12, selectionEnd);
            return true;
        }
    }

    public final void H(String str, String str2, String str3, boolean z10, boolean z11, lt ltVar) {
        AlertDialog$Builder alertDialog$Builder;
        String str4;
        int i10;
        CharSequence charSequence;
        org.telegram.ui.ActionBar.p6 p6Var = this.T1;
        if (z11) {
            alertDialog$Builder = new AlertDialog$Builder(0, getContext(), p6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, getContext(), p6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder2.f20134a;
        x1Var.R = str;
        FrameLayout frameLayout = new FrameLayout(getContext());
        final org.telegram.ui.zd zdVar = new org.telegram.ui.zd(getContext(), 1);
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        zdVar.setTextSize(1, 18.0f);
        zdVar.setText(str4);
        org.telegram.ui.ActionBar.a7.V(zdVar, org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
        zdVar.setHintText(str2);
        org.telegram.ui.ActionBar.a7.m(zdVar, 35, org.telegram.ui.ActionBar.t6.L6, p6Var);
        zdVar.setSingleLine(true);
        zdVar.setFocusable(true);
        zdVar.setTransformHintToHeader(true);
        org.telegram.ui.ActionBar.a7.G(zdVar, org.telegram.ui.ActionBar.t6.f21058k6, org.telegram.ui.ActionBar.t6.f21076l6, org.telegram.ui.ActionBar.t6.f21153p7, p6Var);
        zdVar.setImeOptions(6);
        zdVar.setBackgroundDrawable(null);
        zdVar.requestFocus();
        zdVar.setPadding(0, 0, 0, 0);
        org.telegram.ui.ActionBar.a7.D(zdVar, org.telegram.ui.ActionBar.t6.f21028ig, p6Var);
        org.telegram.ui.ActionBar.a7.m(zdVar, 36, org.telegram.ui.ActionBar.t6.f21048jg, p6Var);
        frameLayout.addView(zdVar, w7.b6.e(-1, -1, 119));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(org.telegram.messenger.cd.L0(2131747451, null));
        textView.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.t6.f21134o6;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        int L = org.telegram.messenger.i0.L(6.0f);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.12f, w02);
        int r13 = org.telegram.ui.ActionBar.t6.r1(0.15f, w02);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, r12, r13, r13);
        org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.12f, i11);
        org.telegram.ui.ActionBar.w6 L3 = org.telegram.ui.ActionBar.a7.L(0.15f, i11);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView, k02, L2, L3, p6Var);
        w7.e6.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, w7.b6.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        ag.n0 n0Var = new ag.n0(this, z10, zdVar, str4, textView, 8);
        textView.setOnClickListener(new ag.i(this, zdVar, n0Var, 14));
        zdVar.addTextChangedListener(new ag.a1(n0Var, 13));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z10 && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                charSequence = null;
            }
            if (charSequence != null) {
                zdVar.setText(charSequence);
                zdVar.setSelection(0, zdVar.getText().length());
            }
        }
        n0Var.run();
        alertDialog$Builder2.o(frameLayout);
        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), new f2(14, ltVar, zdVar));
        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        if (z11) {
            this.V1 = x1Var;
            x1Var.setOnDismissListener(new r0(this, 6));
            this.V1.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            org.telegram.ui.zd zdVar2 = zdVar;
                            zdVar2.requestFocus();
                            org.telegram.messenger.i0.J3(zdVar2);
                            return;
                        default:
                            org.telegram.ui.zd zdVar3 = zdVar;
                            zdVar3.requestFocus();
                            org.telegram.messenger.i0.J3(zdVar3);
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
                            org.telegram.ui.zd zdVar2 = zdVar;
                            zdVar2.requestFocus();
                            org.telegram.messenger.i0.J3(zdVar2);
                            return;
                        default:
                            org.telegram.ui.zd zdVar3 = zdVar;
                            zdVar3.requestFocus();
                            org.telegram.messenger.i0.J3(zdVar3);
                            return;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zdVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int L4 = org.telegram.messenger.i0.L(24.0f);
            marginLayoutParams.leftMargin = L4;
            marginLayoutParams.rightMargin = L4;
            marginLayoutParams.height = org.telegram.messenger.i0.L(36.0f);
            zdVar.setLayoutParams(marginLayoutParams);
        }
        zdVar.setSelection(0, zdVar.getText().length());
    }

    public void a(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12 && i11 < (min = Math.min(i12, text.length()))) {
            ?? obj = new Object();
            obj.f32850a = i10;
            org.telegram.messenger.ui.f(new zz0(obj, 0), i11, min, text, true);
            if ((i10 & 256) != 0) {
                h();
            }
            kt ktVar = this.N1;
            if (ktVar != null) {
                ktVar.m();
            }
        }
    }

    public void b(int i10, int i11, int i12) {
        zz0[] zz0VarArr;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12) {
            int min = Math.min(i12, text.length());
            int i13 = i10 & 256;
            if (i13 != 0) {
                i10 |= 512;
            }
            for (zz0 zz0Var : (zz0[]) text.getSpans(i11, min, zz0.class)) {
                yz0 yz0Var = zz0Var.f33277b;
                int i14 = yz0Var.f32850a;
                if ((i14 & i10) != 0) {
                    int spanStart = text.getSpanStart(zz0Var);
                    int spanEnd = text.getSpanEnd(zz0Var);
                    text.removeSpan(zz0Var);
                    if (spanStart < i11) {
                        text.setSpan(new zz0(new yz0(yz0Var), 0), spanStart, i11, 33);
                    }
                    if (spanEnd > min) {
                        text.setSpan(new zz0(new yz0(yz0Var), 0), min, spanEnd, 33);
                    }
                    int max = Math.max(spanStart, i11);
                    int min2 = Math.min(spanEnd, min);
                    int i15 = i14 & (~i10);
                    if (i15 != 0 && max < min2) {
                        yz0 yz0Var2 = new yz0(yz0Var);
                        yz0Var2.f32850a = i15;
                        text.setSpan(new zz0(yz0Var2, 0), max, min2, 33);
                    }
                }
            }
            if (i13 != 0) {
                h();
            }
            kt ktVar = this.N1;
            if (ktVar != null) {
                ktVar.m();
            }
        }
    }

    public int c(int i10, int i11) {
        Editable text = getText();
        if (text == null) {
            return 0;
        }
        int max = Math.max(0, i10);
        int min = Math.min(i11, text.length());
        if (max < 0 || min < 0 || max >= min) {
            return 0;
        }
        zz0[] zz0VarArr = (zz0[]) text.getSpans(max, min, zz0.class);
        int i12 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = X1[i13];
            int i15 = max;
            boolean z10 = true;
            while (z10 && i15 < min) {
                z10 = false;
                for (int i16 = 0; i16 < zz0VarArr.length; i16++) {
                    zz0 zz0Var = zz0VarArr[i16];
                    int i17 = zz0Var.f33277b.f32850a;
                    if ((i17 & 512) != 0) {
                        i17 |= 256;
                    }
                    if ((i17 & i14) != 0) {
                        int spanStart = text.getSpanStart(zz0Var);
                        int spanEnd = text.getSpanEnd(zz0VarArr[i16]);
                        if (spanStart <= i15 && spanEnd > i15) {
                            z10 = true;
                            i15 = spanEnd;
                        }
                    }
                }
            }
            if (i15 >= min) {
                i12 |= i14;
            }
        }
        return i12;
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
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gd, this.T1);
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
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (this.I1 != null && length() != 0 && (layout = getLayout()) != null && layout.getLineCount() > 0) {
            canvas2 = canvas;
            this.I1.c(layout.getLineRight(0), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(1.0f), 1.0f, this.M1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s0.c cVar = new s0.c(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.G1)) {
            cVar.l(this.G1);
        }
        ArrayList d = cVar.d();
        int size = d.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            s0.b bVar = (s0.b) d.get(i10);
            if (((AccessibilityNodeInfo.AccessibilityAction) bVar.f47847a).getId() == 268435456) {
                cVar.f47850a.removeAction((AccessibilityNodeInfo.AccessibilityAction) bVar.f47847a);
                break;
            }
            i10++;
        }
        if (hasSelection()) {
            cVar.b(new s0.b(null, 2131296508, org.telegram.messenger.cd.L0(2131745280, null), null));
            cVar.b(new s0.b(null, 2131296491, org.telegram.messenger.cd.L0(2131753671, null), null));
            cVar.b(new s0.b(null, 2131296497, org.telegram.messenger.cd.L0(2131749097, null), null));
            cVar.b(new s0.b(null, 2131296499, org.telegram.messenger.cd.L0(2131748365, null), null));
            cVar.b(new s0.b(null, 2131296509, org.telegram.messenger.cd.L0(2131744463, null), null));
            cVar.b(new s0.b(null, 2131296512, org.telegram.messenger.cd.L0(2131743914, null), null));
            cVar.b(new s0.b(null, 2131296498, org.telegram.messenger.cd.L0(2131751745, null), null));
            cVar.b(new s0.b(null, 2131296503, org.telegram.messenger.cd.L0(2131746352, null), null));
            cVar.b(new s0.b(null, 2131296493, org.telegram.messenger.cd.L0(2131750591, null), null));
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int indexOf;
        int i12;
        boolean z10;
        try {
            if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.S1 = z10;
            super.onMeasure(i10, i11);
            if (this.S1) {
                this.R1 = getLineCount();
            }
            this.S1 = false;
        } catch (Exception e) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(51.0f));
            org.telegram.messenger.f8.g(e, true);
        }
        this.H1 = null;
        String str = this.G1;
        if (str != null && str.length() > 0) {
            Editable text = getText();
            if (text.length() > 1 && text.charAt(0) == '@' && (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) != -1) {
                TextPaint paint = getPaint();
                CharSequence subSequence = text.subSequence(0, indexOf + 1);
                int ceil = (int) Math.ceil(paint.measureText(text, 0, i12));
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
                    this.L1 = ((getMeasuredHeight() - this.H1.getLineBottom(0)) / 2) + org.telegram.messenger.i0.L(0.5f);
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rf.k.a(primaryClip.getItemAt(0).getHtmlText()));
                    org.telegram.messenger.k6.m(spannableStringBuilder, getPaint().getFontMetricsInt(), false, null, 0);
                    o5[] o5VarArr = (o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o5.class);
                    if (o5VarArr != null) {
                        for (o5 o5Var : o5VarArr) {
                            o5Var.applyFontMetrics(getPaint().getFontMetricsInt(), f5.f());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    vh0[] vh0VarArr = (vh0[]) getText().getSpans(max, min, vh0.class);
                    if (vh0VarArr != null && vh0VarArr.length > 0) {
                        vh0[] vh0VarArr2 = (vh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vh0.class);
                        for (int i11 = 0; i11 < vh0VarArr2.length; i11++) {
                            spannableStringBuilder.removeSpan(vh0VarArr2[i11]);
                            spannableStringBuilder.removeSpan(vh0VarArr2[i11].f31258a);
                        }
                    } else {
                        wh0.a(spannableStringBuilder);
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        } else {
            try {
                if (i10 == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    org.telegram.messenger.i0.g(getText().subSequence(max2, min2));
                    org.telegram.messenger.i0.W(getContext()).closeContextMenu();
                    org.telegram.ui.ActionBar.d4 d4Var = this.Y0;
                    if (d4Var != null) {
                        d4Var.finish();
                    }
                    setSelection(max2, min2);
                    return true;
                } else if (i10 == 16908320) {
                    int max3 = Math.max(0, getSelectionStart());
                    int min3 = Math.min(getText().length(), getSelectionEnd());
                    org.telegram.messenger.i0.g(getText().subSequence(max3, min3));
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
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        try {
            super.onWindowFocusChanged(z10);
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (!G(i10) && !super.performAccessibilityAction(i10, bundle)) {
            return false;
        }
        return true;
    }

    public void setAllowTextEntitiesIntersection(boolean z10) {
        this.Q1 = z10;
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

    public void setDelegate(kt ktVar) {
        this.N1 = ktVar;
    }

    @Override
    public void setHintColor(int i10) {
        super.setHintColor(i10);
        this.M1 = i10;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.I1 = new qz0(charSequence, 16.0f, getTypeface());
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new org.telegram.ui.Cells.i9(new org.telegram.ui.Cells.h9(this, callback), callback));
    }

    public final void z(zz0 zz0Var) {
        int selectionEnd;
        int i10 = this.O1;
        if (i10 >= 0 && (selectionEnd = this.P1) >= 0) {
            this.P1 = -1;
            this.O1 = -1;
        } else {
            i10 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        }
        org.telegram.messenger.ui.f(zz0Var, i10, selectionEnd, getText(), this.Q1);
        if (zz0Var == null) {
            Editable text = getText();
            for (di.i iVar : (di.i[]) text.getSpans(i10, selectionEnd, di.i.class)) {
                text.removeSpan(iVar);
            }
            wh0[] wh0VarArr = (wh0[]) text.getSpans(i10, selectionEnd, wh0.class);
            for (int i11 = 0; i11 < wh0VarArr.length; i11++) {
                text.removeSpan(wh0VarArr[i11]);
                text.removeSpan(wh0VarArr[i11].f32190s);
                bi.m6 m6Var = wh0VarArr[i11].f32191w;
                if (m6Var != null) {
                    text.removeSpan(m6Var);
                }
            }
            if (wh0VarArr.length > 0) {
                g(true);
            }
        }
        kt ktVar = this.N1;
        if (ktVar != null) {
            ktVar.m();
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        return super.startActionMode(new org.telegram.ui.Cells.i9(new org.telegram.ui.Cells.h9(this, callback), callback), i10);
    }

    public void D() {
    }

    public void E() {
    }

    public void F(int i10, int i11) {
    }
}
