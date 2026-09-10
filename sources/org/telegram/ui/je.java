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
public final class je extends LinearLayout {
    public final LinearLayout f34082a;
    public final LinearLayout[] f34083b;
    public final org.telegram.ui.Components.x5[] f34084c;
    public final TextView[] d;
    public final TextView e;
    public final DecimalFormat f34085f;

    public je(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f34083b = new LinearLayout[2];
        this.f34084c = new org.telegram.ui.Components.x5[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34082a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.a6.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f34083b[i10] = new LinearLayout(context);
            this.f34083b[i10].setOrientation(0);
            this.f34082a.addView(this.f34083b[i10], w7.a6.o(-1, -2, 1.0f, 119));
            this.f34084c[i10] = new org.telegram.ui.Components.x5(context);
            this.f34084c[i10].setTypeface(AndroidUtilities.bold());
            this.f34084c[i10].setTextSize(1, 16.0f);
            this.f34084c[i10].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            this.f34083b[i10].addView(this.f34084c[i10], w7.a6.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i10] = new org.telegram.ui.Components.x5(context);
            this.d[i10].setTextSize(1, 11.5f);
            this.d[i10].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var));
            this.f34083b[i10].addView(this.d[i10], w7.a6.q(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var));
        addView(textView, w7.a6.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f34085f = decimalFormat;
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
        long j3;
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        int indexOf;
        this.e.setText(ieVar.f33653c);
        int i11 = 0;
        while (i11 < 2) {
            if (i11 == 0) {
                str = ieVar.f33652b;
            } else {
                str = ieVar.h;
            }
            if (i11 == 0) {
                j3 = ieVar.e;
            } else {
                j3 = ieVar.f33657j;
            }
            LinearLayout[] linearLayoutArr = this.f34083b;
            if (i11 == 0 && !ieVar.f33651a) {
                linearLayoutArr[i11].setVisibility(8);
            } else if (i11 == 1 && !ieVar.f33655g) {
                linearLayoutArr[i11].setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.ui.Cells.r6.t(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.f34084c;
                if (equalsIgnoreCase) {
                    String format = this.f34085f.format(ieVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber((long) Math.floor(ieVar.d / 1.0E9d), ' '));
                        spannableStringBuilder2.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) format);
                    }
                    spannableStringBuilder = le.f0(spannableStringBuilder2, textViewArr[i10].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i10 = i11;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i10 == 0) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(ieVar.d, ' '));
                        } else {
                            spannableStringBuilder2.append((CharSequence) xh.z7.J0(ieVar.f33656i, 0.8f, ' '));
                        }
                        spannableStringBuilder = xh.z7.X0(false, spannableStringBuilder2, 0.7f, null);
                    } else {
                        spannableStringBuilder2.append((CharSequence) Long.toString(ieVar.d));
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
                textView.setText("≈" + BillingController.getInstance().formatCurrency(j3, ieVar.f33654f));
                i11 = i10 + 1;
            }
            i10 = i11;
            i11 = i10 + 1;
        }
    }
}
