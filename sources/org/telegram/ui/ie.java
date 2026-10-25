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
    public final LinearLayout f40227a;
    public final LinearLayout[] f40228b;
    public final org.telegram.ui.Components.b6[] f40229c;
    public final TextView[] d;
    public final TextView e;
    public final DecimalFormat f40230f;

    public ie(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f40228b = new LinearLayout[2];
        this.f40229c = new org.telegram.ui.Components.b6[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f40227a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, org.telegram.ui.Components.gb1.o(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f40228b[i10] = new LinearLayout(context);
            this.f40228b[i10].setOrientation(0);
            this.f40227a.addView(this.f40228b[i10], org.telegram.ui.Components.gb1.s(-1, -2, 1.0f, 119));
            this.f40229c[i10] = new org.telegram.ui.Components.b6(context);
            this.f40229c[i10].setTypeface(AndroidUtilities.bold());
            this.f40229c[i10].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.f7.V(this.f40229c[i10], org.telegram.ui.ActionBar.y6.G6, u6Var);
            this.f40228b[i10].addView(this.f40229c[i10], org.telegram.ui.Components.gb1.x(-2, -2, 80, 0, 0, 5, 0));
            this.d[i10] = new org.telegram.ui.Components.b6(context);
            this.d[i10].setTextSize(1, 11.5f);
            org.telegram.ui.ActionBar.f7.V(this.d[i10], org.telegram.ui.ActionBar.y6.f23746y6, u6Var);
            this.f40228b[i10].addView(this.d[i10], org.telegram.ui.Components.gb1.u(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23746y6, u6Var);
        addView(textView, org.telegram.ui.Components.gb1.x(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f40230f = decimalFormat;
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
        long j10;
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        int indexOf;
        this.e.setText(heVar.f39987c);
        int i11 = 0;
        while (i11 < 2) {
            if (i11 == 0) {
                str = heVar.f39986b;
            } else {
                str = heVar.h;
            }
            if (i11 == 0) {
                j10 = heVar.e;
            } else {
                j10 = heVar.f39991j;
            }
            LinearLayout[] linearLayoutArr = this.f40228b;
            if (i11 == 0 && !heVar.f39985a) {
                linearLayoutArr[i11].setVisibility(8);
            } else if (i11 == 1 && !heVar.f39989g) {
                linearLayoutArr[i11].setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.ui.Components.b10.u(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.f40229c;
                if (equalsIgnoreCase) {
                    String format = this.f40230f.format(heVar.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    if (indexOf2 >= 0) {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber((long) Math.floor(heVar.d / 1.0E9d), ' '));
                        spannableStringBuilder2.append((CharSequence) format.substring(indexOf2));
                    } else {
                        i10 = i11;
                        spannableStringBuilder2.append((CharSequence) format);
                    }
                    spannableStringBuilder = ke.K(spannableStringBuilder2, textViewArr[i10].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i10 = i11;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i10 == 0) {
                            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(heVar.d, ' '));
                        } else {
                            spannableStringBuilder2.append((CharSequence) bi.dd.I0(heVar.f39990i, 0.8f, ' '));
                        }
                        spannableStringBuilder = bi.dd.W0(false, spannableStringBuilder2, 0.7f, null);
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
                textView.setText("≈" + BillingController.getInstance().formatCurrency(j10, heVar.f39988f));
                i11 = i10 + 1;
            }
            i10 = i11;
            i11 = i10 + 1;
        }
    }
}
