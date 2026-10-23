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
public final class ge extends LinearLayout {
    public final LinearLayout f37299a;
    public final LinearLayout[] f37300b;
    public final org.telegram.ui.Components.z5[] f37301c;
    public final TextView[] d;
    public final TextView e;
    public final DecimalFormat f37302f;

    public ge(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f37300b = new LinearLayout[2];
        this.f37301c = new org.telegram.ui.Components.z5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37299a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f37300b[i10] = new LinearLayout(context);
            this.f37300b[i10].setOrientation(0);
            this.f37299a.addView(this.f37300b[i10], w7.z5.o(-1, -2, 1.0f, 119));
            this.f37301c[i10] = new org.telegram.ui.Components.z5(context);
            this.f37301c[i10].setTypeface(AndroidUtilities.bold());
            this.f37301c[i10].setTextSize(1, 16.0f);
            this.f37301c[i10].setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            this.f37300b[i10].addView(this.f37301c[i10], w7.z5.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i10] = new org.telegram.ui.Components.z5(context);
            this.d[i10].setTextSize(1, 11.5f);
            this.d[i10].setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21382y6, d6Var));
            this.f37300b[i10].addView(this.d[i10], w7.z5.q(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21382y6, d6Var));
        addView(textView, w7.z5.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f37302f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void set(fe feVar) {
        String str;
        long j10;
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        int indexOf;
        this.e.setText(feVar.f36983c);
        int i11 = 0;
        while (i11 < 2) {
            if (i11 == 0) {
                str = feVar.f36982b;
            } else {
                str = feVar.h;
            }
            if (i11 == 0) {
                j10 = feVar.e;
            } else {
                j10 = feVar.f36987j;
            }
            LinearLayout[] linearLayoutArr = this.f37300b;
            if (i11 == 0 && !feVar.f36981a) {
                linearLayoutArr[i11].setVisibility(8);
            } else if (i11 == 1 && !feVar.f36985g) {
                linearLayoutArr[i11].setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(r4.c.u(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.f37301c;
                if (equalsIgnoreCase) {
                    String format = this.f37302f.format(feVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber((long) Math.floor(feVar.d / 1.0E9d), ' '));
                        spannableStringBuilder2.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) format);
                    }
                    spannableStringBuilder = ie.f0(spannableStringBuilder2, textViewArr[i10].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i10 = i11;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i10 == 0) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(feVar.d, ' '));
                        } else {
                            spannableStringBuilder2.append((CharSequence) ai.md.K0(feVar.f36986i, 0.8f, ' '));
                        }
                        spannableStringBuilder = ai.md.Y0(false, spannableStringBuilder2, 0.7f, null);
                    } else {
                        spannableStringBuilder2.append((CharSequence) Long.toString(feVar.d));
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
                textView.setText("≈" + BillingController.getInstance().formatCurrency(j10, feVar.f36984f));
                i11 = i10 + 1;
            }
            i10 = i11;
            i11 = i10 + 1;
        }
    }
}
