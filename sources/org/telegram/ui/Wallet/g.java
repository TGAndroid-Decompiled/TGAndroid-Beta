package org.telegram.ui.Wallet;

import android.icu.util.ULocale;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Currency;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.telegram.messenger.gd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class g {
    public final int f44331a;
    public final v0 f44332b;
    public boolean f44333c;
    public TL_wallet.currencyRates d;
    public String f44334e = "en";
    public String f44335f;

    public g(v0 v0Var) {
        this.f44332b = v0Var;
        this.f44331a = v0Var.f45255a;
        try {
            this.f44335f = org.telegram.messenger.t0.f27013b.getSharedPreferences("gram_wallet", 0).getString("currency", g());
        } catch (Exception e10) {
            org.telegram.messenger.a8.e("[gram-wallet] failed to load currency prefs", e10);
        }
        if (!TextUtils.equals(g(), "USD")) {
            f();
        }
    }

    public static void a(LinkedHashSet linkedHashSet, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Currency currency = Currency.getInstance(new Locale("", str.toUpperCase(Locale.US)));
                if (currency != null) {
                    linkedHashSet.add(currency.getCurrencyCode());
                }
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public static void b(LinkedHashSet linkedHashSet, InputMethodSubtype inputMethodSubtype) {
        String str;
        if (inputMethodSubtype != null && "keyboard".equals(inputMethodSubtype.getMode())) {
            if (Build.VERSION.SDK_INT >= 24) {
                str = inputMethodSubtype.getLanguageTag();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = inputMethodSubtype.getLocale();
            }
            if (!TextUtils.isEmpty(str)) {
                c(linkedHashSet, Locale.forLanguageTag(str.replace('_', '-')));
            }
        }
    }

    public static void c(LinkedHashSet linkedHashSet, Locale locale) {
        if (locale == null) {
            return;
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country) && Build.VERSION.SDK_INT >= 24) {
            country = ULocale.addLikelySubtags(ULocale.forLocale(locale)).getCountry();
        }
        a(linkedHashSet, country);
    }

    public static String d(String str, Locale locale) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i7 = 0;
        while (i7 < str.length()) {
            int codePointAt = str.codePointAt(i7);
            int charCount = Character.charCount(codePointAt) + i7;
            if (Character.isLetter(codePointAt)) {
                return str.substring(0, i7) + str.substring(i7, charCount).toUpperCase(locale) + str.substring(charCount);
            }
            i7 = charCount;
        }
        return str;
    }

    public static TL_wallet.currencyRate e() {
        TL_wallet.currencyRate currencyrate = new TL_wallet.currencyRate();
        currencyrate.currency = "USD";
        currencyrate.rate = 1.0d;
        currencyrate.title = gd.N0(2131742896, null);
        currencyrate.symbol = "$";
        currencyrate.thousandsSeparator = ",";
        currencyrate.decimalSeparator = ".";
        currencyrate.symbolLeft = true;
        currencyrate.spaceBetween = false;
        currencyrate.dropZeros = false;
        currencyrate.exp = 2;
        return currencyrate;
    }

    public final TL_wallet.currencyRates f() {
        String str;
        if (this.d == null) {
            if (this.f44333c) {
                return null;
            }
            this.f44333c = true;
            ConnectionsManager.getInstance(this.f44331a).sendRequestTyped(new TL_wallet.getCurrencyRates(), new d3.b(1), new e(this, 0));
        } else {
            Locale locale = gd.E0().f24342y;
            if (locale == null || TextUtils.isEmpty(locale.getLanguage())) {
                str = "en";
            } else {
                str = locale.getLanguage();
            }
            if (!TextUtils.equals(this.f44334e, str)) {
                boolean equals = TextUtils.equals(str, "en");
                for (int i7 = 0; i7 < this.d.rates.size(); i7++) {
                    TL_wallet.currencyRate currencyrate = this.d.rates.get(i7);
                    if (currencyrate != null) {
                        currencyrate.translatedTitle = null;
                        if (!equals && !TextUtils.isEmpty(currencyrate.currency)) {
                            try {
                                currencyrate.translatedTitle = d(Currency.getInstance(currencyrate.currency).getDisplayName(locale), locale);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                }
                this.f44334e = str;
            }
        }
        return this.d;
    }

    public final String g() {
        String str = this.f44335f;
        if (str == null) {
            return "USD";
        }
        return str;
    }

    public final double h() {
        String g10 = g();
        if (TextUtils.equals(g10, "USD")) {
            return 1.0d;
        }
        if (this.d != null) {
            for (int i7 = 0; i7 < this.d.rates.size(); i7++) {
                TL_wallet.currencyRate currencyrate = this.d.rates.get(i7);
                if (TextUtils.equals(currencyrate.currency, g10)) {
                    return currencyrate.rate;
                }
            }
            return 0.0d;
        }
        return 0.0d;
    }

    public final String i() {
        String g10 = g();
        TL_wallet.currencyRates f10 = f();
        if (f10 != null) {
            for (int i7 = 0; i7 < f10.rates.size(); i7++) {
                TL_wallet.currencyRate currencyrate = f10.rates.get(i7);
                if (TextUtils.equals(currencyrate.currency, g10)) {
                    if (TextUtils.isEmpty(currencyrate.translatedTitle)) {
                        return currencyrate.title;
                    }
                    return currencyrate.translatedTitle;
                }
            }
            return "";
        }
        return "";
    }

    public final TL_wallet.currencyRate j() {
        String g10 = g();
        if (this.d == null) {
            if (TextUtils.equals(g10, "USD")) {
                return e();
            }
            return null;
        }
        for (int i7 = 0; i7 < this.d.rates.size(); i7++) {
            TL_wallet.currencyRate currencyrate = this.d.rates.get(i7);
            if (TextUtils.equals(currencyrate.currency, g10)) {
                return currencyrate;
            }
        }
        return null;
    }
}
