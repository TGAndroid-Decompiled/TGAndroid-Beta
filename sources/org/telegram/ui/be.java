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
public final class be extends LinearLayout {
    public final LinearLayout f36771a;
    public final LinearLayout[] f36772b;
    public final org.telegram.ui.Components.x5[] f36773c;
    public final TextView[] d;
    public final TextView f36774e;
    public final DecimalFormat f36775f;

    public be(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f36772b = new LinearLayout[2];
        this.f36773c = new org.telegram.ui.Components.x5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36771a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, i7.f6.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f36772b[i10] = new LinearLayout(context);
            this.f36772b[i10].setOrientation(0);
            this.f36771a.addView(this.f36772b[i10], i7.f6.o(-1, -2, 1.0f, 119));
            this.f36773c[i10] = new org.telegram.ui.Components.x5(context);
            this.f36773c[i10].setTypeface(AndroidUtilities.bold());
            this.f36773c[i10].setTextSize(1, 16.0f);
            this.f36773c[i10].setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            this.f36772b[i10].addView(this.f36773c[i10], i7.f6.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i10] = new org.telegram.ui.Components.x5(context);
            this.d[i10].setTextSize(1, 11.5f);
            this.d[i10].setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
            this.f36772b[i10].addView(this.d[i10], i7.f6.q(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.f36774e = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
        addView(textView, i7.f6.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f36775f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void set(ae aeVar) {
        String str;
        long j10;
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        int indexOf;
        this.f36774e.setText(aeVar.f36521c);
        int i11 = 0;
        while (i11 < 2) {
            if (i11 == 0) {
                str = aeVar.f36520b;
            } else {
                str = aeVar.h;
            }
            if (i11 == 0) {
                j10 = aeVar.f36522e;
            } else {
                j10 = aeVar.f36526j;
            }
            LinearLayout[] linearLayoutArr = this.f36772b;
            if (i11 == 0 && !aeVar.f36519a) {
                linearLayoutArr[i11].setVisibility(8);
            } else if (i11 == 1 && !aeVar.f36524g) {
                linearLayoutArr[i11].setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(u3.c.k(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.f36773c;
                if (equalsIgnoreCase) {
                    String format = this.f36775f.format(aeVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber((long) Math.floor(aeVar.d / 1.0E9d), ' '));
                        spannableStringBuilder2.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) format);
                    }
                    spannableStringBuilder = de.f0(spannableStringBuilder2, textViewArr[i10].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i10 = i11;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i10 == 0) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(aeVar.d, ' '));
                        } else {
                            spannableStringBuilder2.append((CharSequence) jh.ia.J0(aeVar.f36525i, 0.8f, ' '));
                        }
                        spannableStringBuilder = jh.ia.X0(false, spannableStringBuilder2, 0.7f, null);
                    } else {
                        spannableStringBuilder2.append((CharSequence) Long.toString(aeVar.d));
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
                textView.setText("≈" + BillingController.getInstance().formatCurrency(j10, aeVar.f36523f));
                i11 = i10 + 1;
            }
            i10 = i11;
            i11 = i10 + 1;
        }
    }
}
