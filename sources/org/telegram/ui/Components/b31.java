package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class b31 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int f32076a;
    public final long f32077b;
    public final org.telegram.ui.cn f32078c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.Cells.w3 f32079e;
    public final Drawable f32080f;
    public final SpannableString h;
    public final ImageView f32081n;
    public final boolean[] f32082r;
    public int f32083s;
    public int f32084w;
    public int f32085x;
    public boolean f32086y;

    public b31(Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.cn cnVar) {
        super(context);
        final int currentAccount = cnVar.getCurrentAccount();
        final long a10 = cnVar.a();
        this.f32082r = new boolean[1];
        this.f32076a = currentAccount;
        this.f32077b = a10;
        this.f32078c = cnVar;
        this.d = g6Var;
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, true, true, false, 2);
        this.f32079e = w3Var;
        w3Var.b(0.3f, 450L, xq.h);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o());
        w3Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        w3Var.setGravity(1);
        w3Var.setIgnoreRTL(!org.telegram.messenger.id.f23157a0);
        w3Var.f34937n = false;
        final org.telegram.ui.dk dkVar = (org.telegram.ui.dk) this;
        w3Var.setOnClickListener(new ma0(dkVar, 20));
        addView(w3Var, c8.ha.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(2131232408).mutate();
        this.f32080f = mutate;
        mutate.setBounds(0, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.f32081n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232237);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                String a02;
                int i7;
                int i10 = currentAccount;
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-a10));
                boolean q10 = org.telegram.messenger.p10.i(i10).q();
                org.telegram.ui.dk dkVar2 = org.telegram.ui.dk.this;
                if (!q10 && (M0 == null || !M0.autotranslation)) {
                    org.telegram.ui.cn cnVar2 = dkVar2.D;
                    i7 = ((org.telegram.ui.ActionBar.f2) cnVar2).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i7).f24764d7.edit();
                    edit.putInt("dialog_show_translate_count" + cnVar2.a(), 140).commit();
                    cnVar2.yd(true);
                    return;
                }
                int i11 = dkVar2.f32076a;
                org.telegram.messenger.f10 f10Var = org.telegram.messenger.qp.s1(i11).f24896s7;
                Context context2 = dkVar2.getContext();
                org.telegram.ui.ActionBar.g6 g6Var2 = dkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232567, 1, context2, g6Var2);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, g6Var2);
                LinearLayout linearLayout = new LinearLayout(dkVar2.getContext());
                linearLayout.setOrientation(1);
                ?? scrollView = new ScrollView(dkVar2.getContext());
                scrollView.f31702b = new w5((View) scrollView, 350L, xq.h);
                LinearLayout linearLayout2 = new LinearLayout(dkVar2.getContext());
                scrollView.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27287c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, dkVar2.getContext(), dkVar2.d, true, false);
                z0Var.j(org.telegram.messenger.id.M0(2131743953, null), 2131232408, null);
                long j3 = dkVar2.f32077b;
                z0Var.setSubtext(l21.K0(l21.O0(f10Var.m(j3), null, null)));
                z0Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, dkVar2.getContext(), dkVar2.d, true, false);
                z0Var2.j(org.telegram.messenger.id.M0(2131753756, null), 2131231240, null);
                z0Var2.setOnClickListener(new ma0(actionBarPopupWindow$ActionBarPopupWindowLayout, 21));
                linearLayout.addView(z0Var2);
                linearLayout.addView((View) scrollView, c8.ha.o(-1, 420));
                String str = (String) f10Var.f22345e.get(Long.valueOf(j3));
                l21.O0(str, null, null);
                boolean[] zArr = dkVar2.f32082r;
                String O0 = l21.O0(str, zArr, null);
                String m10 = f10Var.m(j3);
                ArrayList o4 = org.telegram.messenger.f10.o(m10);
                ArrayList n10 = org.telegram.messenger.f10.n();
                linearLayout2.addView(new org.telegram.ui.ActionBar.d1(dkVar2.getContext(), g6Var2), c8.ha.o(-1, 8));
                z0Var.setOnClickListener(new bi.la(new z21(dkVar2, new boolean[1], m10, linearLayout2, o4, str, f10Var, g1Var, n10), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 13));
                if (org.telegram.messenger.p10.i(i11).q() && O0 != null) {
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, dkVar2.getContext(), dkVar2.d, false, false);
                    if (zArr[0]) {
                        a02 = org.telegram.messenger.id.a0(null, null, 2131751357, O0);
                    } else {
                        a02 = org.telegram.messenger.id.a0(null, null, 2131751356, O0);
                    }
                    z0Var3.setMultiline(false);
                    z0Var3.j(fi.m3.b(a02, z0Var3.getTextView().getPaint()), 2131232068, null);
                    z0Var3.setOnClickListener(new di.d0(dkVar2, str, f10Var, O0, g1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
                }
                org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, dkVar2.getContext(), dkVar2.d, false, false);
                z0Var4.j(org.telegram.messenger.id.M0(2131749325, null), 2131232087, null);
                z0Var4.setOnClickListener(new ud0(dkVar2, f10Var, g1Var, 2));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.d1(dkVar2.getContext(), g6Var2), c8.ha.o(-1, 8));
                x70 x70Var = new x70(dkVar2.getContext(), null);
                x70Var.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f));
                x70Var.setDisablePaddingsOffsetY(true);
                int i12 = org.telegram.ui.ActionBar.l6.f27973j5;
                org.telegram.ui.ActionBar.s6.U(x70Var, i12, g6Var2);
                org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.Uc, g6Var2);
                x70Var.setEmojiColor(org.telegram.ui.ActionBar.l6.w0(i12, g6Var2));
                CharSequence concat = TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131752026, null)), " ", org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131752025, null), new w80(26, dkVar2, g1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new r5(5197252827247841976L, x70Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                x70Var.setText(fi.m3.b(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), x70Var.getPaint()));
                int i13 = org.telegram.ui.ActionBar.l6.f27957i6;
                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i13, g6Var2), 0, 12);
                org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i13);
                x70Var.setBackground(a03);
                org.telegram.ui.ActionBar.s6.j(x70Var, a03, null, M, g6Var2);
                x70Var.setOnClickListener(new lk(28, dkVar2, g1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(x70Var);
                g1Var.f27487e = true;
                g1Var.f27486c = 220;
                g1Var.setOutsideTouchable(true);
                g1Var.setClippingEnabled(true);
                g1Var.setAnimationStyle(2131755192);
                g1Var.setFocusable(true);
                g1Var.setInputMethodMode(2);
                g1Var.setSoftInputMode(0);
                ImageView imageView2 = dkVar2.f32081n;
                g1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
            }
        });
        addView(imageView, c8.ha.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, g6Var, false);
        l10.f28656v0 = false;
        l10.f28655u0 = false;
        org.telegram.ui.ActionBar.v2[] v2VarArr = new org.telegram.ui.ActionBar.v2[1];
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(1);
        gradientDrawable.setColors(new int[]{-15982491, -16379606});
        gradientDrawable.setGradientRadius(org.telegram.messenger.g0.L(150.0f));
        float L = org.telegram.messenger.g0.L(12.0f);
        gradientDrawable.setCornerRadii(new float[]{L, L, L, L, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, c8.ha.e(-1, -1, 119));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131231007);
        linearLayout.addView(imageView, c8.ha.t(132, 132, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231008);
        linearLayout.addView(imageView2, c8.ha.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131752024, null));
        v31[] v31VarArr = (v31[]) X2.getSpans(0, X2.length(), v31.class);
        for (int i7 = 0; i7 < v31VarArr.length; i7++) {
            X2.setSpan(new ForegroundColorSpan(-1), X2.getSpanStart(v31VarArr[i7]), X2.getSpanEnd(v31VarArr[i7]), X2.getSpanFlags(v31VarArr[i7]));
        }
        textView.setText(X2);
        linearLayout.addView(textView, c8.ha.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        f10.addView(frameLayout, c8.ha.c(-2.0f, -1));
        f10.addView(new di.b4(context, 2131231860, org.telegram.messenger.id.M0(2131752034, null), org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752036, null), new bi.xa(v2VarArr, context, 1)), g6Var), c8.ha.t(-1, -2, 49, 32, 16, 32, 16));
        f10.addView(new di.b4(context, 2131232378, org.telegram.messenger.id.M0(2131752032, null), org.telegram.messenger.id.M0(2131752033, null), g6Var), c8.ha.t(-1, -2, 49, 32, 0, 32, 16));
        f10.addView(new di.b4(context, 2131231827, org.telegram.messenger.id.M0(2131752029, null), org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752031, null), new bi.xa(v2VarArr, context, 2)), g6Var), c8.ha.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27866d7, view, g6Var);
        f10.addView(view, c8.ha.n(1.0f / org.telegram.messenger.g0.f22562p, -1, 7, 24, 0, 24, 0));
        x70 x70Var = new x70(context, null);
        x70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.Uc, g6Var);
        x70Var.setGravity(17);
        x70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131752028, null), new bi.xa(v2VarArr, context, 3)));
        x70Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        x70Var.setDisablePaddingsOffsetY(true);
        f10.addView(x70Var, c8.ha.t(-1, -2, 7, 32, 0, 32, 0));
        fi.d h = org.telegram.messenger.k5.h(24, context, g6Var, true);
        h.setText(bi.k7.f2(org.telegram.messenger.id.M0(2131743888, null)));
        h.setOnClickListener(new i2(v2VarArr, 3));
        f10.addView(h, c8.ha.t(-1, 48, 7, 16, 0, 16, 16));
        l10.N = f10;
        v2VarArr[0] = l10;
        l10.N();
        v2VarArr[0].show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Re));
    }

    public final void b() {
        String a02;
        int i7;
        int i10 = this.f32076a;
        org.telegram.messenger.f10 f10Var = org.telegram.messenger.qp.s1(i10).f24896s7;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
        long j3 = this.f32077b;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        boolean B = f10Var.B(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.w3 w3Var = this.f32079e;
        if (B) {
            String O0 = l21.O0((String) f10Var.f22345e.get(Long.valueOf(j3)), null, null);
            if (!TextUtils.isEmpty(O0)) {
                w3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.id.a0(null, null, 2131745333, O0)));
            } else {
                w3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.id.M0(2131745334, null)));
            }
        } else {
            String m10 = f10Var.m(j3);
            if (m10 == null) {
                m10 = "en";
            }
            boolean[] zArr = this.f32082r;
            String O02 = l21.O0(m10, zArr, null);
            if (zArr[0]) {
                a02 = org.telegram.messenger.id.a0(null, null, 2131743952, O02);
            } else {
                a02 = org.telegram.messenger.id.a0(null, null, 2131743951, O02);
            }
            w3Var.setText(TextUtils.concat(spannableString, " ", a02));
        }
        if (!org.telegram.messenger.p10.i(i10).q() && (M0 == null || !M0.autotranslation)) {
            i7 = 2131232096;
        } else {
            i7 = 2131232237;
        }
        this.f32081n.setImageResource(i7);
    }

    public void setLeftMargin(float f10) {
        this.f32079e.setTranslationX(f10 / 2.0f);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.Ve;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        int i10 = org.telegram.ui.ActionBar.l6.f27957i6;
        int w03 = org.telegram.ui.ActionBar.l6.w0(i10, g6Var);
        int i11 = org.telegram.ui.ActionBar.l6.Re;
        int w04 = org.telegram.ui.ActionBar.l6.w0(i11, g6Var);
        if (this.f32086y && w02 == this.f32083s && w03 == this.f32084w && w04 == this.f32085x) {
            return;
        }
        this.f32086y = true;
        this.f32083s = w02;
        this.f32084w = w03;
        this.f32085x = w04;
        int w05 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        org.telegram.ui.Cells.w3 w3Var = this.f32079e;
        w3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var) & 436207615;
        int L = org.telegram.messenger.g0.L(3.0f);
        w3Var.setBackground(org.telegram.ui.ActionBar.l6.Y(org.telegram.messenger.g0.L(15.0f), w06, L, L, L, L));
        org.telegram.ui.Cells.y O = org.telegram.ui.ActionBar.l6.O(org.telegram.ui.ActionBar.l6.w0(i10, g6Var), 0, 0);
        ImageView imageView = this.f32081n;
        imageView.setBackground(O);
        int w07 = org.telegram.ui.ActionBar.l6.w0(i11, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f32080f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i7, g6Var), mode));
    }
}
