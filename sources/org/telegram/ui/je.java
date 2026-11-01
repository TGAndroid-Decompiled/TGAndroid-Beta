package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public final class je extends LinearLayout {
    public final LinearLayout f38370a;
    public final LinearLayout[] f38371b;
    public final org.telegram.ui.Components.n5[] f38372c;
    public final TextView[] d;
    public final TextView e;
    public final DecimalFormat f38373f;

    public je(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f38371b = new LinearLayout[2];
        this.f38372c = new org.telegram.ui.Components.n5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38370a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f38371b[i10] = new LinearLayout(context);
            this.f38371b[i10].setOrientation(0);
            this.f38370a.addView(this.f38371b[i10], w7.b6.p(-1, -2, 1.0f, 119));
            this.f38372c[i10] = new org.telegram.ui.Components.n5(context);
            this.f38372c[i10].setTypeface(org.telegram.messenger.i0.o());
            this.f38372c[i10].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.a7.V(this.f38372c[i10], org.telegram.ui.ActionBar.t6.G6, p6Var);
            this.f38371b[i10].addView(this.f38372c[i10], w7.b6.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i10] = new org.telegram.ui.Components.n5(context);
            this.d[i10].setTextSize(1, 11.5f);
            org.telegram.ui.ActionBar.a7.V(this.d[i10], org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
            this.f38371b[i10].addView(this.d[i10], w7.b6.r(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
        addView(textView, w7.b6.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f38373f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void set(ie ieVar) {
        String str;
        long j10;
        int i10;
        int indexOf;
        this.e.setText(ieVar.f38011c);
        int i11 = 0;
        while (i11 < 2) {
            if (i11 == 0) {
                str = ieVar.f38010b;
            } else {
                str = ieVar.h;
            }
            if (i11 == 0) {
                j10 = ieVar.e;
            } else {
                j10 = ieVar.f38015j;
            }
            LinearLayout[] linearLayoutArr = this.f38371b;
            if (i11 == 0 && !ieVar.f38009a) {
                linearLayoutArr[i11].setVisibility(8);
            } else if (i11 == 1 && !ieVar.f38013g) {
                linearLayoutArr[i11].setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sc.e.A(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.f38372c;
                if (equalsIgnoreCase) {
                    String format = this.f38373f.format(ieVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i10 = i11;
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.E((long) Math.floor(ieVar.d / 1.0E9d), ' '));
                        spannableStringBuilder.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i10 = i11;
                        spannableStringBuilder.append((CharSequence) format);
                    }
                    spannableStringBuilder = le.K(spannableStringBuilder, textViewArr[i10].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i10 = i11;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i10 == 0) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.E(ieVar.d, ' '));
                        } else {
                            spannableStringBuilder.append((CharSequence) rh.h8.M0(ieVar.f38014i, 0.8f, ' '));
                        }
                        spannableStringBuilder = rh.h8.a1(false, spannableStringBuilder, 0.7f, null);
                    } else {
                        spannableStringBuilder.append((CharSequence) Long.toString(ieVar.d));
                    }
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                if ("TON".equalsIgnoreCase(str) && (indexOf = TextUtils.indexOf(spannableStringBuilder2, ".")) >= 0) {
                    spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder2.length(), 33);
                }
                linearLayoutArr[i10].setVisibility(0);
                textViewArr[i10].setText(spannableStringBuilder2);
                TextView textView = this.d[i10];
                textView.setText("≈" + org.telegram.messenger.u1.i().f(j10, ieVar.f38012f));
                i11 = i10 + 1;
            }
            i10 = i11;
            i11 = i10 + 1;
        }
    }
}
