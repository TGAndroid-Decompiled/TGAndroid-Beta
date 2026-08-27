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

public final class de extends LinearLayout {

    public final LinearLayout f37375a;

    public final LinearLayout[] f37376b;

    public final org.telegram.ui.Components.s5[] f37377c;
    public final TextView[] d;

    public final TextView f37378e;

    public final DecimalFormat f37379f;

    public de(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f37376b = new LinearLayout[2];
        this.f37377c = new org.telegram.ui.Components.s5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37375a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, h7.z5.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f37376b[i10] = new LinearLayout(context);
            this.f37376b[i10].setOrientation(0);
            this.f37375a.addView(this.f37376b[i10], h7.z5.o(-1, -2, 1.0f, 119));
            this.f37377c[i10] = new org.telegram.ui.Components.s5(context);
            this.f37377c[i10].setTypeface(AndroidUtilities.bold());
            this.f37377c[i10].setTextSize(1, 16.0f);
            this.f37377c[i10].setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            this.f37376b[i10].addView(this.f37377c[i10], h7.z5.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i10] = new org.telegram.ui.Components.s5(context);
            this.d[i10].setTextSize(1, 11.5f);
            this.d[i10].setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
            this.f37376b[i10].addView(this.d[i10], h7.z5.q(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.f37378e = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        addView(textView, h7.z5.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f37379f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void set(ce ceVar) {
        CharSequence charSequenceX0;
        int iIndexOf;
        this.f37378e.setText(ceVar.f37056c);
        int i10 = 0;
        while (i10 < 2) {
            String str = i10 == 0 ? ceVar.f37055b : ceVar.h;
            long j10 = i10 == 0 ? ceVar.f37057e : ceVar.f37061j;
            LinearLayout[] linearLayoutArr = this.f37376b;
            if (i10 != 0 || ceVar.f37054a) {
                if (i10 != 1 || ceVar.f37059g) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s3.c.l(str, " "));
                    boolean zEqualsIgnoreCase = "TON".equalsIgnoreCase(str);
                    TextView[] textViewArr = this.f37377c;
                    if (zEqualsIgnoreCase) {
                        String str2 = this.f37379f.format(ceVar.d / 1.0E9d);
                        int iIndexOf2 = str2.indexOf(46);
                        if (iIndexOf2 >= 0) {
                            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber((long) Math.floor(ceVar.d / 1.0E9d), ' '));
                            spannableStringBuilder.append((CharSequence) str2.substring(iIndexOf2));
                        } else {
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        charSequenceX0 = fe.f0(spannableStringBuilder, textViewArr[i10].getPaint(), 1.05f, 0.0f, true);
                    } else {
                        i10 = i10;
                        if ("XTR".equalsIgnoreCase(str)) {
                            if (i10 == 0) {
                                spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(ceVar.d, ' '));
                            } else {
                                spannableStringBuilder.append((CharSequence) hh.oa.J0(ceVar.f37060i, 0.8f, ' '));
                            }
                            charSequenceX0 = hh.oa.X0(false, spannableStringBuilder, 0.7f, null);
                        } else {
                            spannableStringBuilder.append((CharSequence) Long.toString(ceVar.d));
                            charSequenceX0 = spannableStringBuilder;
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequenceX0);
                    if ("TON".equalsIgnoreCase(str) && (iIndexOf = TextUtils.indexOf(spannableStringBuilder2, ".")) >= 0) {
                        spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8125f), iIndexOf, spannableStringBuilder2.length(), 33);
                    }
                    linearLayoutArr[i10].setVisibility(0);
                    textViewArr[i10].setText(spannableStringBuilder2);
                    this.d[i10].setText("≈" + BillingController.getInstance().formatCurrency(j10, ceVar.f37058f));
                } else {
                    linearLayoutArr[i10].setVisibility(8);
                }
                i10++;
            } else {
                linearLayoutArr[i10].setVisibility(8);
            }
            i10 = i10;
            i10++;
        }
    }
}
