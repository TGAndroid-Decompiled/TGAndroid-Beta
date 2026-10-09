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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
public final class ie extends LinearLayout {
    public final LinearLayout f38616a;
    public final LinearLayout[] f38617b;
    public final org.telegram.ui.Components.a6[] f38618c;
    public final TextView[] d;
    public final TextView f38619e;
    public final DecimalFormat f38620f;

    public ie(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f38617b = new LinearLayout[2];
        this.f38618c = new org.telegram.ui.Components.a6[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38616a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f38617b[i10] = new LinearLayout(context);
            this.f38617b[i10].setOrientation(0);
            this.f38616a.addView(this.f38617b[i10], w7.x5.o(-1, -2, 1.0f, 119));
            this.f38618c[i10] = new org.telegram.ui.Components.a6(context);
            this.f38618c[i10].setTypeface(AndroidUtilities.bold());
            this.f38618c[i10].setTextSize(1, 16.0f);
            this.f38618c[i10].setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
            this.f38617b[i10].addView(this.f38618c[i10], w7.x5.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i10] = new org.telegram.ui.Components.a6(context);
            this.d[i10].setTextSize(1, 11.5f);
            this.d[i10].setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21181y6, e6Var));
            this.f38617b[i10].addView(this.d[i10], w7.x5.q(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.f38619e = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21181y6, e6Var));
        addView(textView, w7.x5.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f38620f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void set(he heVar) {
        String str;
        long j3;
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        int indexOf;
        this.f38619e.setText(heVar.f38295c);
        int i11 = 0;
        while (i11 < 2) {
            if (i11 == 0) {
                str = heVar.f38294b;
            } else {
                str = heVar.h;
            }
            if (i11 == 0) {
                j3 = heVar.f38296e;
            } else {
                j3 = heVar.f38300j;
            }
            LinearLayout[] linearLayoutArr = this.f38617b;
            if (i11 == 0 && !heVar.f38293a) {
                linearLayoutArr[i11].setVisibility(8);
            } else if (i11 == 1 && !heVar.f38298g) {
                linearLayoutArr[i11].setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sc.v.v(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.f38618c;
                if (equalsIgnoreCase) {
                    String format = this.f38620f.format(heVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber((long) Math.floor(heVar.d / 1.0E9d), ' '));
                        spannableStringBuilder2.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) format);
                    }
                    spannableStringBuilder = ke.f0(spannableStringBuilder2, textViewArr[i10].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i10 = i11;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i10 == 0) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(heVar.d, ' '));
                        } else {
                            spannableStringBuilder2.append((CharSequence) yh.p7.K0(heVar.f38299i, 0.8f, ' '));
                        }
                        spannableStringBuilder = yh.p7.Y0(false, spannableStringBuilder2, 0.7f, null);
                    } else {
                        spannableStringBuilder2.append((CharSequence) Long.toString(heVar.d));
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                }
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                if ("TON".equalsIgnoreCase(str) && (indexOf = TextUtils.indexOf(spannableStringBuilder3, ".")) >= 0) {
                    spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder3.length(), 33);
                }
                linearLayoutArr[i10].setVisibility(0);
                textViewArr[i10].setText(spannableStringBuilder3);
                TextView textView = this.d[i10];
                textView.setText("≈" + BillingController.getInstance().formatCurrency(j3, heVar.f38297f));
                i11 = i10 + 1;
            }
            i10 = i11;
            i11 = i10 + 1;
        }
    }
}
