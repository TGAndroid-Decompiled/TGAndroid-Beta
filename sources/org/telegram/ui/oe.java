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
public final class oe extends LinearLayout {
    public final LinearLayout f38933a;
    public final LinearLayout[] f38934b;
    public final org.telegram.ui.Components.a6[] f38935c;
    public final TextView[] d;
    public final TextView e;
    public final DecimalFormat f38936f;

    public oe(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f38934b = new LinearLayout[2];
        this.f38935c = new org.telegram.ui.Components.a6[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38933a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.a6.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f38934b[i10] = new LinearLayout(context);
            this.f38934b[i10].setOrientation(0);
            this.f38933a.addView(this.f38934b[i10], w7.a6.o(-1, -2, 1.0f, 119));
            this.f38935c[i10] = new org.telegram.ui.Components.a6(context);
            this.f38935c[i10].setTypeface(AndroidUtilities.bold());
            this.f38935c[i10].setTextSize(1, 16.0f);
            this.f38935c[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            this.f38934b[i10].addView(this.f38935c[i10], w7.a6.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i10] = new org.telegram.ui.Components.a6(context);
            this.d[i10].setTextSize(1, 11.5f);
            this.d[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20288y6, c6Var));
            this.f38934b[i10].addView(this.d[i10], w7.a6.q(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20288y6, c6Var));
        addView(textView, w7.a6.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f38936f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void set(ne neVar) {
        String str;
        long j10;
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        int indexOf;
        this.e.setText(neVar.f38684c);
        int i11 = 0;
        while (i11 < 2) {
            if (i11 == 0) {
                str = neVar.f38683b;
            } else {
                str = neVar.h;
            }
            if (i11 == 0) {
                j10 = neVar.e;
            } else {
                j10 = neVar.f38688j;
            }
            LinearLayout[] linearLayoutArr = this.f38934b;
            if (i11 == 0 && !neVar.f38682a) {
                linearLayoutArr[i11].setVisibility(8);
            } else if (i11 == 1 && !neVar.f38686g) {
                linearLayoutArr[i11].setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(t8.b.u(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.f38935c;
                if (equalsIgnoreCase) {
                    String format = this.f38936f.format(neVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber((long) Math.floor(neVar.d / 1.0E9d), ' '));
                        spannableStringBuilder2.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) format);
                    }
                    spannableStringBuilder = qe.f0(spannableStringBuilder2, textViewArr[i10].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i10 = i11;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i10 == 0) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(neVar.d, ' '));
                        } else {
                            spannableStringBuilder2.append((CharSequence) zh.p7.K0(neVar.f38687i, 0.8f, ' '));
                        }
                        spannableStringBuilder = zh.p7.Y0(false, spannableStringBuilder2, 0.7f, null);
                    } else {
                        spannableStringBuilder2.append((CharSequence) Long.toString(neVar.d));
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
                textView.setText("≈" + BillingController.getInstance().formatCurrency(j10, neVar.f38685f));
                i11 = i10 + 1;
            }
            i10 = i11;
            i11 = i10 + 1;
        }
    }
}
