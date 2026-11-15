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
public final class vx0 extends TableLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f41177a;
    public final Path f41178b;
    public final float[] f41179c;
    public final Paint d;
    public final Paint f41180e;
    public final float f41181f;
    public final float h;
    public ArrayList f41182n;
    public ArrayList f41183r;

    public vx0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f41178b = new Path();
        this.f41179c = new float[8];
        this.d = new Paint(1);
        this.f41180e = new Paint(1);
        float max = Math.max(1, org.telegram.messenger.g0.L(0.66f));
        this.f41181f = max;
        this.h = max / 2.0f;
        this.f41177a = e6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final tx0 a(CharSequence charSequence) {
        xh.l lVar = new xh.l(getContext());
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f41177a;
        org.telegram.ui.ActionBar.q6.U(lVar, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(lVar, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setText(org.telegram.messenger.j6.m(charSequence, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ns.i(lVar);
        lVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tx0 tx0Var = new tx0(this, lVar, true);
        tableRow.addView(tx0Var, layoutParams);
        addView(tableRow);
        return tx0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        o5 o5Var = new o5(getContext());
        org.telegram.ui.ActionBar.q6.U(o5Var, org.telegram.ui.ActionBar.j6.G6, this.f41177a);
        o5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        org.telegram.messenger.gj.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        o5Var.setText(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, o5Var.getPaint().getFontMetricsInt(), false, null, 0), arrayList, o5Var.getPaint().getFontMetricsInt(), false));
        org.telegram.messenger.ns.i(o5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new tx0(this, o5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, ux0[] ux0VarArr, ec[] ecVarArr) {
        ec ecVar = new ec(getContext());
        org.telegram.ui.ActionBar.q6.U(ecVar, org.telegram.ui.ActionBar.j6.G6, this.f41177a);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setText(org.telegram.messenger.j6.m(charSequence2, ecVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ns.i(ecVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        ux0 ux0Var = new ux0(this, charSequence);
        if (ux0VarArr != null) {
            ux0VarArr[0] = ux0Var;
        }
        tableRow.addView(ux0Var, layoutParams);
        tableRow.addView(new sx0(this, ecVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (ecVarArr != null) {
            ecVarArr[0] = ecVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        ec ecVar = new ec(getContext());
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f41177a;
        org.telegram.ui.ActionBar.q6.U(ecVar, i7, e6Var);
        ecVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.j6.m(charSequence, ecVar.getPaint().getFontMetricsInt(), false, null, 0));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) fc.b(str2, runnable, e6Var, num));
        }
        ecVar.setText(spannableStringBuilder);
        org.telegram.messenger.ns.i(ecVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new ux0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new sx0(this, ecVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new ux0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new sx0(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public final void g(int i7, String str) {
        long j3 = i7 * 1000;
        c(str, org.telegram.messenger.hd.a0(null, null, 2131742783, org.telegram.messenger.hd.E0().s0().format(new Date(j3)), org.telegram.messenger.hd.E0().p0().format(new Date(j3))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.s4 s4Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.f41177a;
        ec ecVar = new ec(context, e6Var);
        ecVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.j6.Xc;
        org.telegram.ui.ActionBar.q6.U(ecVar, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(ecVar, i7, e6Var);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setSingleLine(true);
        ecVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.w(5, runnable), 0, spannableStringBuilder.length(), 33);
        ecVar.setText(spannableStringBuilder);
        if (str != null) {
            ecVar.P = new fc(str, s4Var, e6Var);
        }
        return l(ecVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i7, di.s2 s2Var, String str, org.telegram.ui.Wallet.r4 r4Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final z70 z70Var = new z70(getContext(), null);
        z70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        float f10 = i7;
        z70Var.setTextSize(1, f10);
        int i10 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.f41177a;
        org.telegram.ui.ActionBar.q6.U(z70Var, i10, e6Var);
        z70Var.setMaxLines(4);
        int i11 = 0;
        z70Var.setSingleLine(false);
        z70Var.setText(charSequence2);
        z70Var.setDisablePaddingsOffsetY(true);
        z70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(z70Var, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            fc fcVar = new fc(str, r4Var, e6Var);
            final ec ecVar = new ec(getContext(), e6Var);
            ecVar.setTextSize(1, f10);
            ecVar.setPadding(0, org.telegram.messenger.g0.L(9.33f), 0, org.telegram.messenger.g0.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(fcVar, 0, spannableString.length(), 33);
            ecVar.setText(spannableString);
            if (s2Var != null) {
                i11 = 34;
            }
            float f11 = i11 + 12.66f;
            ((FrameLayout.LayoutParams) z70Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11) + fcVar.a();
            frameLayout.addView(ecVar, c8.ja.d(-2, -2.0f, 53, 0.0f, 0.0f, f11, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    z70 z70Var2 = z70.this;
                    if (z70Var2.getLayout() != null && z70Var2.getLayout().getLineCount() > 0) {
                        int left = z70Var2.getLeft();
                        float lineRight = z70Var2.getLayout().getLineRight(0) + z70Var2.getPaddingLeft() + left + org.telegram.messenger.g0.L(6.0f);
                        ec ecVar2 = ecVar;
                        ecVar2.setTranslationX(Math.min(0.0f, lineRight - ecVar2.getLeft()));
                    }
                }
            });
        }
        if (s2Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131232104);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.j6.f29184v6;
            org.telegram.ui.ActionBar.q6.s(imageView, i12, e6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new vv0(1, charSequence2, s2Var));
            c8.na.a(imageView);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i12, e6Var)), 7, -1);
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(imageView, h02, null, K, e6Var);
            frameLayout.addView(imageView, c8.ja.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i7, di.s2 s2Var) {
        j(str, charSequence, i7, s2Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new ux0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new sx0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i7, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.f41177a;
        ec ecVar = new ec(context, e6Var);
        ecVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.U(ecVar, i10, e6Var);
        org.telegram.ui.ActionBar.q6.G(ecVar, i10, e6Var);
        ecVar.setTextSize(1, 14.0f);
        ecVar.setSingleLine(true);
        ecVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, ecVar);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f46984b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.hd.M0(2131744949, null);
            fq a10 = di.gb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f34676e = L;
            a10.f34677f = L2;
            imageReceiver.w0(a10);
            z10 = false;
            z11 = false;
        } else if (org.telegram.messenger.q10.A(j3)) {
            str3 = org.telegram.messenger.hd.M0(2131744925, null);
            fq a11 = di.gb.a(44, "fragment");
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            a11.f34676e = L3;
            a11.f34677f = L4;
            imageReceiver.w0(a11);
            z11 = true;
            z10 = false;
        } else {
            if (j3 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3));
                if (a22 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                str2 = org.telegram.messenger.q10.p(a22);
                f5Var.e(a22);
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
                if (M0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (M0 == null) {
                    str2 = "";
                } else {
                    str2 = M0.title;
                }
                f5Var.b(M0);
            }
            str3 = str2;
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(4, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            ecVar.P = new fc(str, runnable2, e6Var);
        }
        ecVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return l(ecVar, charSequence);
    }

    public final void n(String str, int i7, long j3, Runnable runnable) {
        m(str, i7, j3, runnable, null, null);
    }

    public final TableRow o(String str, final int i7, final long j3, Runnable runnable) {
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.f41177a;
        final x70 x70Var = new x70(context, e6Var);
        x70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.X(x70Var, i10, e6Var);
        x70Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        x70Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, x70Var);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f46984b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.hd.M0(2131744949, null);
            fq a10 = di.gb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f34676e = L;
            a10.f34677f = L2;
            imageReceiver.w0(a10);
            z10 = false;
        } else {
            if (org.telegram.messenger.q10.A(j3)) {
                str3 = org.telegram.messenger.hd.M0(2131744925, null);
                fq a11 = di.gb.a(44, "fragment");
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                a11.f34676e = L3;
                a11.f34677f = L4;
                imageReceiver.w0(a11);
            } else if (j3 >= 0) {
                TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3));
                String p10 = org.telegram.messenger.q10.p(a22);
                f5Var.e(a22);
                str3 = p10;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
                if (M0 == null) {
                    str2 = "";
                } else {
                    str2 = M0.title;
                }
                f5Var.b(M0);
                str3 = str2;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z10) {
            x70Var.setClickable(true);
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(3, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        final e5 e5Var = new e5(org.telegram.messenger.g0.L(20.0f), x70Var);
        e5Var.k(Integer.valueOf(w02));
        e5Var.J = org.telegram.messenger.g0.L(12.0f);
        e5Var.K = 0;
        if (this.f41182n == null) {
            this.f41182n = new ArrayList();
            this.f41183r = new ArrayList();
        }
        this.f41182n.add(x70Var);
        this.f41183r.add(e5Var);
        x70Var.addOnAttachStateChangeListener(new bi.u1(e5Var, 1));
        final Drawable mutate = getContext().getResources().getDrawable(2131232308).mutate();
        org.telegram.ui.ActionBar.q6.x(this, mutate, i10, e6Var, PorterDuff.Mode.SRC_IN);
        org.telegram.messenger.z10 z10Var = new org.telegram.messenger.z10() {
            @Override
            public final void a(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rx0.a(java.lang.Object):void");
            }
        };
        z10Var.a(null);
        x70Var.i(e5Var);
        org.telegram.messenger.ns.f(i7).h(x70Var, org.telegram.messenger.ns.f25560r, z10Var);
        org.telegram.messenger.ns.f(i7).h(x70Var, org.telegram.messenger.ns.f25537m5, z10Var);
        x70Var.l(spannableStringBuilder, false);
        return l(x70Var, str);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        super.onLayout(z10, i7, i10, i11, i12);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f41180e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f41181f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i13 = org.telegram.ui.ActionBar.j6.f28933hi;
        org.telegram.ui.ActionBar.e6 e6Var = this.f41177a;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i13, e6Var));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28916gi, e6Var));
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt = tableRow.getChildAt(i15);
                    boolean z16 = true;
                    if (childAt instanceof ux0) {
                        ux0 ux0Var = (ux0) childAt;
                        if (i14 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i14 != childCount - 1) {
                            z16 = false;
                        }
                        if (ux0Var.f40186b != z15 || ux0Var.f40187c != z16) {
                            ux0Var.f40186b = z15;
                            ux0Var.f40187c = z16;
                            ux0Var.invalidate();
                        }
                    } else if (childAt instanceof sx0) {
                        sx0 sx0Var = (sx0) childAt;
                        if (i14 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i14 == childCount - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (sx0Var.f39448b != z12 || sx0Var.f39449c != z13) {
                            sx0Var.f39448b = z12;
                            sx0Var.f39449c = z13;
                            sx0Var.invalidate();
                        }
                        if (i15 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i15 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (sx0Var.d != z14 || sx0Var.f39450e != z16) {
                            sx0Var.d = z14;
                            sx0Var.f39450e = z16;
                            sx0Var.invalidate();
                        }
                    } else if (childAt instanceof tx0) {
                        tx0 tx0Var = (tx0) childAt;
                        if (i14 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i14 != childCount - 1) {
                            z16 = false;
                        }
                        if (tx0Var.f39831c != z11 || tx0Var.d != z16) {
                            tx0Var.f39831c = z11;
                            tx0Var.d = z16;
                            tx0Var.invalidate();
                        }
                    }
                }
            }
        }
    }

    public final void p(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        z70 z70Var = new z70(getContext(), null);
        z70Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        z70Var.setTextSize(1, 13.0f);
        int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.f41177a;
        org.telegram.ui.ActionBar.q6.U(z70Var, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        z70Var.setMaxLines(1);
        z70Var.setSingleLine();
        z70Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        z70Var.setText(spannableStringBuilder);
        z70Var.setDisablePaddingsOffsetY(true);
        z70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(z70Var, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        l(frameLayout, str);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.f28933hi;
        org.telegram.ui.ActionBar.e6 e6Var = this.f41177a;
        this.f41180e.setColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        this.d.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28916gi, e6Var));
        try {
            if (this.f41182n != null && this.f41183r != null) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
                for (int i10 = 0; i10 < this.f41182n.size(); i10++) {
                    x70 x70Var = (x70) this.f41182n.get(i10);
                    if (x70Var != null) {
                        x70Var.setLinkTextColor(w02);
                        x70Var.invalidate();
                    }
                }
                for (int i11 = 0; i11 < this.f41183r.size(); i11++) {
                    e5 e5Var = (e5) this.f41183r.get(i11);
                    if (e5Var != null) {
                        e5Var.k(Integer.valueOf(w02));
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
