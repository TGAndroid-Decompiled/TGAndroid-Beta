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
public final class dy0 extends TableLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f34491a;
    public final Path f34492b;
    public final float[] f34493c;
    public final Paint d;
    public final Paint f34494e;
    public final float f34495f;
    public final float h;
    public ArrayList f34496n;
    public ArrayList f34497r;

    public dy0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f34492b = new Path();
        this.f34493c = new float[8];
        this.d = new Paint(1);
        this.f34494e = new Paint(1);
        float max = Math.max(1, org.telegram.messenger.g0.L(0.66f));
        this.f34495f = max;
        this.h = max / 2.0f;
        this.f34491a = i6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final by0 a(CharSequence charSequence) {
        xh.l lVar = new xh.l(getContext());
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f34491a;
        org.telegram.ui.ActionBar.u6.U(lVar, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(lVar, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setText(org.telegram.messenger.j6.m(charSequence, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ks.i(lVar);
        lVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        by0 by0Var = new by0(this, lVar, true);
        tableRow.addView(by0Var, layoutParams);
        addView(tableRow);
        return by0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        w5 w5Var = new w5(getContext());
        org.telegram.ui.ActionBar.u6.U(w5Var, org.telegram.ui.ActionBar.n6.G6, this.f34491a);
        w5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        org.telegram.messenger.fj.b(spannableStringBuilder, arrayList, false, false, false, false, 0);
        w5Var.setText(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, w5Var.getPaint().getFontMetricsInt(), false, null, 0), arrayList, w5Var.getPaint().getFontMetricsInt(), false));
        org.telegram.messenger.ks.i(w5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new by0(this, w5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(TextView textView, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new cy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ay0(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, CharSequence charSequence2, String str, Runnable runnable, Integer num) {
        mc mcVar = new mc(getContext());
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f34491a;
        org.telegram.ui.ActionBar.u6.U(mcVar, i7, i6Var);
        mcVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.j6.m(charSequence2, mcVar.getPaint().getFontMetricsInt(), false, null, 0));
        if (str != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) nc.b(str, runnable, i6Var, num));
        }
        mcVar.setText(spannableStringBuilder);
        org.telegram.messenger.ks.i(mcVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new cy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ay0(this, mcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow e(CharSequence charSequence, CharSequence charSequence2, cy0[] cy0VarArr, mc[] mcVarArr) {
        mc mcVar = new mc(getContext());
        org.telegram.ui.ActionBar.u6.U(mcVar, org.telegram.ui.ActionBar.n6.G6, this.f34491a);
        mcVar.setTextSize(1, 14.0f);
        mcVar.setText(org.telegram.messenger.j6.m(charSequence2, mcVar.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.messenger.ks.i(mcVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        cy0 cy0Var = new cy0(this, charSequence);
        if (cy0VarArr != null) {
            cy0VarArr[0] = cy0Var;
        }
        tableRow.addView(cy0Var, layoutParams);
        tableRow.addView(new ay0(this, mcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (mcVarArr != null) {
            mcVarArr[0] = mcVar;
        }
        return tableRow;
    }

    public final TableRow f(CharSequence charSequence, String str) {
        return e(str, charSequence, null, null);
    }

    public final void g(int i7, String str) {
        long j3 = i7 * 1000;
        e(str, org.telegram.messenger.gd.a0(null, null, 2131742512, org.telegram.messenger.gd.E0().s0().format(new Date(j3)), org.telegram.messenger.gd.E0().p0().format(new Date(j3))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.g5 g5Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.i6 i6Var = this.f34491a;
        mc mcVar = new mc(context, i6Var);
        mcVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        mcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i7 = org.telegram.ui.ActionBar.n6.Xc;
        org.telegram.ui.ActionBar.u6.U(mcVar, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(mcVar, i7, i6Var);
        mcVar.setTextSize(1, 14.0f);
        mcVar.setSingleLine(true);
        mcVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new org.telegram.messenger.w(5, runnable), 0, spannableStringBuilder.length(), 33);
        mcVar.setText(spannableStringBuilder);
        if (str != null) {
            mcVar.P = new nc(str, g5Var, i6Var);
        }
        return l(mcVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i7, di.f2 f2Var, String str, org.telegram.ui.Wallet.f5 f5Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final j80 j80Var = new j80(getContext(), null);
        j80Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        float f10 = i7;
        j80Var.setTextSize(1, f10);
        int i10 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.i6 i6Var = this.f34491a;
        org.telegram.ui.ActionBar.u6.U(j80Var, i10, i6Var);
        j80Var.setMaxLines(4);
        int i11 = 0;
        j80Var.setSingleLine(false);
        j80Var.setText(charSequence2);
        j80Var.setDisablePaddingsOffsetY(true);
        j80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(10.66f), org.telegram.messenger.g0.L(9.33f));
        frameLayout.addView(j80Var, c8.na.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            nc ncVar = new nc(str, f5Var, i6Var);
            final mc mcVar = new mc(getContext(), i6Var);
            mcVar.setTextSize(1, f10);
            mcVar.setPadding(0, org.telegram.messenger.g0.L(9.33f), 0, org.telegram.messenger.g0.L(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(ncVar, 0, spannableString.length(), 33);
            mcVar.setText(spannableString);
            if (f2Var != null) {
                i11 = 34;
            }
            float f11 = i11 + 12.66f;
            ((FrameLayout.LayoutParams) j80Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f11) + ncVar.a();
            frameLayout.addView(mcVar, c8.na.d(-2, -2.0f, 53, 0.0f, 0.0f, f11, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    j80 j80Var2 = j80.this;
                    if (j80Var2.getLayout() != null && j80Var2.getLayout().getLineCount() > 0) {
                        int left = j80Var2.getLeft();
                        float lineRight = j80Var2.getLayout().getLineRight(0) + j80Var2.getPaddingLeft() + left + org.telegram.messenger.g0.L(6.0f);
                        mc mcVar2 = mcVar;
                        mcVar2.setTranslationX(Math.min(0.0f, lineRight - mcVar2.getLeft()));
                    }
                }
            });
        }
        if (f2Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131232108);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.n6.f29786v6;
            org.telegram.ui.ActionBar.u6.s(imageView, i12, i6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new l8(25, charSequence2, f2Var));
            c8.sa.a(imageView);
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i12, i6Var)), 7, -1);
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.1f, i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(imageView, h02, null, K, i6Var);
            frameLayout.addView(imageView, c8.na.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i7, di.f2 f2Var) {
        j(str, charSequence, i7, f2Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new cy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ay0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i7, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.i6 i6Var = this.f34491a;
        mc mcVar = new mc(context, i6Var);
        mcVar.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        mcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.U(mcVar, i10, i6Var);
        org.telegram.ui.ActionBar.u6.G(mcVar, i10, i6Var);
        mcVar.setTextSize(1, 14.0f);
        mcVar.setSingleLine(true);
        mcVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, mcVar);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f47679b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.gd.N0(2131744708, null);
            lq a10 = di.kb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f37198e = L;
            a10.f37199f = L2;
            imageReceiver.x0(a10);
            z10 = false;
            z11 = false;
        } else if (org.telegram.messenger.n10.B(j3)) {
            str3 = org.telegram.messenger.gd.N0(2131744684, null);
            lq a11 = di.kb.a(44, "fragment");
            int L3 = org.telegram.messenger.g0.L(16.0f);
            int L4 = org.telegram.messenger.g0.L(16.0f);
            a11.f37198e = L3;
            a11.f37199f = L4;
            imageReceiver.x0(a11);
            z11 = true;
            z10 = false;
        } else {
            if (j3 >= 0) {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3));
                if (c22 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                str2 = org.telegram.messenger.n10.q(c22);
                f5Var.e(c22);
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
                if (O0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (O0 == null) {
                    str2 = "";
                } else {
                    str2 = O0.title;
                }
                f5Var.b(O0);
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
            mcVar.P = new nc(str, runnable2, i6Var);
        }
        mcVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return l(mcVar, charSequence);
    }

    public final void n(String str, int i7, long j3, Runnable runnable) {
        m(str, i7, j3, runnable, null, null);
    }

    public final TableRow o(String str, final int i7, final long j3, Runnable runnable) {
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.i6 i6Var = this.f34491a;
        final h80 h80Var = new h80(context, i6Var);
        h80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.X(h80Var, i10, i6Var);
        h80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        h80Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, h80Var);
        int i11 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f47679b;
        if (i11 == 0) {
            str3 = org.telegram.messenger.gd.N0(2131744708, null);
            lq a10 = di.kb.a(44, "anonymous");
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            a10.f37198e = L;
            a10.f37199f = L2;
            imageReceiver.x0(a10);
            z10 = false;
        } else {
            if (org.telegram.messenger.n10.B(j3)) {
                str3 = org.telegram.messenger.gd.N0(2131744684, null);
                lq a11 = di.kb.a(44, "fragment");
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                a11.f37198e = L3;
                a11.f37199f = L4;
                imageReceiver.x0(a11);
            } else if (j3 >= 0) {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3));
                String q10 = org.telegram.messenger.n10.q(c22);
                f5Var.e(c22);
                str3 = q10;
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
                if (O0 == null) {
                    str2 = "";
                } else {
                    str2 = O0.title;
                }
                f5Var.b(O0);
                str3 = str2;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z10) {
            h80Var.setClickable(true);
            spannableStringBuilder.setSpan(new org.telegram.messenger.w(3, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        final m5 m5Var = new m5(org.telegram.messenger.g0.L(20.0f), h80Var);
        m5Var.k(Integer.valueOf(w02));
        m5Var.J = org.telegram.messenger.g0.L(12.0f);
        m5Var.K = 0;
        if (this.f34496n == null) {
            this.f34496n = new ArrayList();
            this.f34497r = new ArrayList();
        }
        this.f34496n.add(h80Var);
        this.f34497r.add(m5Var);
        h80Var.addOnAttachStateChangeListener(new bi.u2(m5Var, 1));
        final Drawable mutate = getContext().getResources().getDrawable(2131232312).mutate();
        org.telegram.ui.ActionBar.u6.x(this, mutate, i10, i6Var, PorterDuff.Mode.SRC_IN);
        org.telegram.messenger.w10 w10Var = new org.telegram.messenger.w10() {
            @Override
            public final void a(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zx0.a(java.lang.Object):void");
            }
        };
        w10Var.a(null);
        h80Var.i(m5Var);
        org.telegram.messenger.ks.f(i7).h(h80Var, org.telegram.messenger.ks.f25276r, w10Var);
        org.telegram.messenger.ks.f(i7).h(h80Var, org.telegram.messenger.ks.f25269p5, w10Var);
        h80Var.l(spannableStringBuilder, false);
        return l(h80Var, str);
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
        Paint paint = this.f34494e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f34495f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i13 = org.telegram.ui.ActionBar.n6.f29535hi;
        org.telegram.ui.ActionBar.i6 i6Var = this.f34491a;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i13, i6Var));
        paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29518gi, i6Var));
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt = tableRow.getChildAt(i15);
                    boolean z16 = true;
                    if (childAt instanceof cy0) {
                        cy0 cy0Var = (cy0) childAt;
                        if (i14 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i14 != childCount - 1) {
                            z16 = false;
                        }
                        if (cy0Var.f34165b != z15 || cy0Var.f34166c != z16) {
                            cy0Var.f34165b = z15;
                            cy0Var.f34166c = z16;
                            cy0Var.invalidate();
                        }
                    } else if (childAt instanceof ay0) {
                        ay0 ay0Var = (ay0) childAt;
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
                        if (ay0Var.f33580b != z12 || ay0Var.f33581c != z13) {
                            ay0Var.f33580b = z12;
                            ay0Var.f33581c = z13;
                            ay0Var.invalidate();
                        }
                        if (i15 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i15 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (ay0Var.d != z14 || ay0Var.f33582e != z16) {
                            ay0Var.d = z14;
                            ay0Var.f33582e = z16;
                            ay0Var.invalidate();
                        }
                    } else if (childAt instanceof by0) {
                        by0 by0Var = (by0) childAt;
                        if (i14 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i14 != childCount - 1) {
                            z16 = false;
                        }
                        if (by0Var.f33842c != z11 || by0Var.d != z16) {
                            by0Var.f33842c = z11;
                            by0Var.d = z16;
                            by0Var.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.f29535hi;
        org.telegram.ui.ActionBar.i6 i6Var = this.f34491a;
        this.f34494e.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.d.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29518gi, i6Var));
        try {
            if (this.f34496n != null && this.f34497r != null) {
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
                for (int i10 = 0; i10 < this.f34496n.size(); i10++) {
                    h80 h80Var = (h80) this.f34496n.get(i10);
                    if (h80Var != null) {
                        h80Var.setLinkTextColor(w02);
                        h80Var.invalidate();
                    }
                }
                for (int i11 = 0; i11 < this.f34497r.size(); i11++) {
                    m5 m5Var = (m5) this.f34497r.get(i11);
                    if (m5Var != null) {
                        m5Var.k(Integer.valueOf(w02));
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
