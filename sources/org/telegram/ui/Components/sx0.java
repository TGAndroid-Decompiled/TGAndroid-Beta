package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class sx0 extends TableLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f38140a;
    public final Path f38141b;
    public final float[] f38142c;
    public final Paint d;
    public final Paint f38143e;
    public final float f38144f;
    public final float h;
    public ArrayList f38145n;
    public ArrayList f38146r;

    public sx0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f38141b = new Path();
        this.f38142c = new float[8];
        this.d = new Paint(1);
        this.f38143e = new Paint(1);
        float max = Math.max(1, org.telegram.messenger.g0.L(0.66f));
        this.f38144f = max;
        this.h = max / 2.0f;
        this.f38140a = f6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final qx0 a(CharSequence charSequence) {
        xh.l lVar = new xh.l(getContext());
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38140a;
        org.telegram.ui.ActionBar.r6.V(lVar, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(lVar, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setText(org.telegram.messenger.i6.m(charSequence, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.qs.i(lVar);
        lVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        qx0 qx0Var = new qx0(this, lVar, true);
        tableRow.addView(qx0Var, layoutParams);
        addView(tableRow);
        return qx0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        q5 q5Var = new q5(getContext());
        org.telegram.ui.ActionBar.r6.V(q5Var, org.telegram.ui.ActionBar.k6.G6, this.f38140a);
        q5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        org.telegram.messenger.ij.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        q5Var.setText(org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder, q5Var.getPaint().getFontMetricsInt(), false, null, 0), arrayList, q5Var.getPaint().getFontMetricsInt(), false));
        org.telegram.messenger.qs.i(q5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new qx0(this, q5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, rx0[] rx0VarArr, jc[] jcVarArr) {
        jc jcVar = new jc(getContext());
        org.telegram.ui.ActionBar.r6.V(jcVar, org.telegram.ui.ActionBar.k6.G6, this.f38140a);
        jcVar.setTextSize(1, 14.0f);
        jcVar.setText(org.telegram.messenger.i6.m(charSequence2, jcVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.qs.i(jcVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        rx0 rx0Var = new rx0(this, charSequence);
        if (rx0VarArr != null) {
            rx0VarArr[0] = rx0Var;
        }
        tableRow.addView(rx0Var, layoutParams);
        tableRow.addView(new px0(this, jcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (jcVarArr != null) {
            jcVarArr[0] = jcVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        jc jcVar = new jc(getContext());
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38140a;
        org.telegram.ui.ActionBar.r6.V(jcVar, i7, f6Var);
        jcVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i6.m(charSequence, jcVar.getPaint().getFontMetricsInt(), false, null, 0));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) kc.b(str2, runnable, f6Var, num));
        }
        jcVar.setText(spannableStringBuilder);
        org.telegram.messenger.qs.i(jcVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new rx0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new px0(this, jcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new rx0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new px0(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public final void g(int i7, String str) {
        long j3 = i7 * 1000;
        c(str, org.telegram.messenger.hd.a0(null, null, 2131742784, org.telegram.messenger.hd.E0().s0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.s4 s4Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f38140a;
        jc jcVar = new jc(context, f6Var);
        jcVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        jcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.r6.V(jcVar, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(jcVar, i7, f6Var);
        jcVar.setTextSize(1, 14.0f);
        jcVar.setSingleLine(true);
        jcVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.w(5, runnable), 0, spannableStringBuilder.length(), 33);
        jcVar.setText(spannableStringBuilder);
        if (str != null) {
            jcVar.O = new kc(str, s4Var, f6Var);
        }
        return l(jcVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i7, bi.a4 a4Var, String str, org.telegram.ui.Wallet.r4 r4Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final w70 w70Var = new w70(getContext(), null);
        w70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        float f10 = i7;
        w70Var.setTextSize(1, f10);
        int i10 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38140a;
        org.telegram.ui.ActionBar.r6.V(w70Var, i10, f6Var);
        w70Var.setMaxLines(4);
        int i11 = 0;
        w70Var.setSingleLine(false);
        w70Var.setText(charSequence2);
        w70Var.setDisablePaddingsOffsetY(true);
        w70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(w70Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            kc kcVar = new kc(str, r4Var, f6Var);
            final jc jcVar = new jc(getContext(), f6Var);
            jcVar.setTextSize(1, f10);
            jcVar.setPadding(0, org.telegram.messenger.g0.L(9.33f), 0, org.telegram.messenger.g0.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(kcVar, 0, spannableString.length(), 33);
            jcVar.setText(spannableString);
            if (a4Var != null) {
                i11 = 34;
            }
            float f11 = i11 + 12.66f;
            ((FrameLayout.LayoutParams) w70Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11) + kcVar.a();
            frameLayout.addView(jcVar, c8.ha.d(-2, -2.0f, 53, 0.0f, 0.0f, f11, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    w70 w70Var2 = w70.this;
                    if (w70Var2.getLayout() != null && w70Var2.getLayout().getLineCount() > 0) {
                        int left = w70Var2.getLeft();
                        float lineRight = w70Var2.getLayout().getLineRight(0) + w70Var2.getPaddingLeft() + left + org.telegram.messenger.g0.L(6.0f);
                        jc jcVar2 = jcVar;
                        jcVar2.setTranslationX(Math.min(0.0f, lineRight - jcVar2.getLeft()));
                    }
                }
            });
        }
        if (a4Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131232103);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.k6.f28183v6;
            org.telegram.ui.ActionBar.r6.t(imageView, i12, f6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new lk(23, charSequence2, a4Var));
            c8.ka.a(imageView);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i12, f6Var)), 7, -1);
            org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, f6Var);
            frameLayout.addView(imageView, c8.ha.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i7, bi.a4 a4Var) {
        j(str, charSequence, i7, a4Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new rx0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new px0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i7, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z9;
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f38140a;
        jc jcVar = new jc(context, f6Var);
        jcVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        jcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(jcVar, i10, f6Var);
        org.telegram.ui.ActionBar.r6.H(jcVar, i10, f6Var);
        jcVar.setTextSize(1, 14.0f);
        jcVar.setSingleLine(true);
        jcVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, jcVar);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f45482b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.hd.M0(2131744950, null);
            xp a10 = bi.yc.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f40318e = L;
            a10.f40319f = L2;
            imageReceiver.w0(a10);
            z9 = false;
            z10 = false;
        } else if (org.telegram.messenger.t10.A(j3)) {
            str3 = org.telegram.messenger.hd.M0(2131744926, null);
            xp a11 = bi.yc.a(44, "fragment");
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            a11.f40318e = L3;
            a11.f40319f = L4;
            imageReceiver.w0(a11);
            z10 = true;
            z9 = false;
        } else {
            if (j3 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3));
                if (a22 == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                str2 = org.telegram.messenger.t10.p(a22);
                f5Var.e(a22);
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
                if (M0 == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (M0 == null) {
                    str2 = "";
                } else {
                    str2 = M0.title;
                }
                f5Var.b(M0);
            }
            str3 = str2;
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(4, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            jcVar.O = new kc(str, runnable2, f6Var);
        }
        jcVar.setText(spannableStringBuilder);
        if (z9) {
            return null;
        }
        return l(jcVar, charSequence);
    }

    public final void n(String str, int i7, long j3, Runnable runnable) {
        m(str, i7, j3, runnable, null, null);
    }

    public final TableRow o(String str, final int i7, final long j3, Runnable runnable) {
        String str2;
        String str3;
        boolean z9;
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f38140a;
        final u70 u70Var = new u70(context, f6Var);
        u70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.Y(u70Var, i10, f6Var);
        u70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        u70Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, u70Var);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f45482b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.hd.M0(2131744950, null);
            xp a10 = bi.yc.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f40318e = L;
            a10.f40319f = L2;
            imageReceiver.w0(a10);
            z9 = false;
        } else {
            if (org.telegram.messenger.t10.A(j3)) {
                str3 = org.telegram.messenger.hd.M0(2131744926, null);
                xp a11 = bi.yc.a(44, "fragment");
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                a11.f40318e = L3;
                a11.f40319f = L4;
                imageReceiver.w0(a11);
            } else if (j3 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3));
                String p10 = org.telegram.messenger.t10.p(a22);
                f5Var.e(a22);
                str3 = p10;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
                if (M0 == null) {
                    str2 = "";
                } else {
                    str2 = M0.title;
                }
                f5Var.b(M0);
                str3 = str2;
            }
            z9 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z9) {
            u70Var.setClickable(true);
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(3, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        final g5 g5Var = new g5(org.telegram.messenger.g0.L(20.0f), u70Var);
        g5Var.k(Integer.valueOf(w02));
        g5Var.I = org.telegram.messenger.g0.L(12.0f);
        g5Var.J = 0;
        if (this.f38145n == null) {
            this.f38145n = new ArrayList();
            this.f38146r = new ArrayList();
        }
        this.f38145n.add(u70Var);
        this.f38146r.add(g5Var);
        u70Var.addOnAttachStateChangeListener(new ox0(g5Var, 0));
        final Drawable mutate = getContext().getResources().getDrawable(2131232307).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, i10, f6Var, PorterDuff.Mode.SRC_IN);
        org.telegram.messenger.c20 c20Var = new org.telegram.messenger.c20() {
            @Override
            public final void a(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nx0.a(java.lang.Object):void");
            }
        };
        c20Var.a(null);
        u70Var.i(g5Var);
        org.telegram.messenger.qs.f(i7).h(u70Var, org.telegram.messenger.qs.f25046r, c20Var);
        org.telegram.messenger.qs.f(i7).h(u70Var, org.telegram.messenger.qs.f25023m5, c20Var);
        u70Var.l(spannableStringBuilder, false);
        return l(u70Var, str);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        super.onLayout(z9, i7, i10, i11, i12);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f38143e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f38144f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i13 = org.telegram.ui.ActionBar.k6.f27878ei;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38140a;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i13, f6Var));
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27859di, f6Var));
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt = tableRow.getChildAt(i15);
                    boolean z15 = true;
                    if (childAt instanceof rx0) {
                        rx0 rx0Var = (rx0) childAt;
                        if (i14 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i14 != childCount - 1) {
                            z15 = false;
                        }
                        if (rx0Var.f37813b != z14 || rx0Var.f37814c != z15) {
                            rx0Var.f37813b = z14;
                            rx0Var.f37814c = z15;
                            rx0Var.invalidate();
                        }
                    } else if (childAt instanceof px0) {
                        px0 px0Var = (px0) childAt;
                        if (i14 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i14 == childCount - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (px0Var.f37079b != z11 || px0Var.f37080c != z12) {
                            px0Var.f37079b = z11;
                            px0Var.f37080c = z12;
                            px0Var.invalidate();
                        }
                        if (i15 == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (i15 != childCount2 - 1) {
                            z15 = false;
                        }
                        if (px0Var.d != z13 || px0Var.f37081e != z15) {
                            px0Var.d = z13;
                            px0Var.f37081e = z15;
                            px0Var.invalidate();
                        }
                    } else if (childAt instanceof qx0) {
                        qx0 qx0Var = (qx0) childAt;
                        if (i14 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i14 != childCount - 1) {
                            z15 = false;
                        }
                        if (qx0Var.f37427c != z10 || qx0Var.d != z15) {
                            qx0Var.f37427c = z10;
                            qx0Var.d = z15;
                            qx0Var.invalidate();
                        }
                    }
                }
            }
        }
    }

    public final void p(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        w70 w70Var = new w70(getContext(), null);
        w70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        w70Var.setTextSize(1, 13.0f);
        int i7 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38140a;
        org.telegram.ui.ActionBar.r6.V(w70Var, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setMaxLines(1);
        w70Var.setSingleLine();
        w70Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        w70Var.setText(spannableStringBuilder);
        w70Var.setDisablePaddingsOffsetY(true);
        w70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(w70Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        l(frameLayout, str);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.f27878ei;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38140a;
        this.f38143e.setColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27859di, f6Var));
        try {
            if (this.f38145n != null && this.f38146r != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var);
                for (int i10 = 0; i10 < this.f38145n.size(); i10++) {
                    u70 u70Var = (u70) this.f38145n.get(i10);
                    if (u70Var != null) {
                        u70Var.setLinkTextColor(w02);
                        u70Var.invalidate();
                    }
                }
                for (int i11 = 0; i11 < this.f38146r.size(); i11++) {
                    g5 g5Var = (g5) this.f38146r.get(i11);
                    if (g5Var != null) {
                        g5Var.k(Integer.valueOf(w02));
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            childAt.invalidate();
            if (childAt instanceof ViewGroup) {
                int i13 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (i13 < viewGroup.getChildCount()) {
                        viewGroup.getChildAt(i13).invalidate();
                        i13++;
                    }
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
