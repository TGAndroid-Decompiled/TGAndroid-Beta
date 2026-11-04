package org.telegram.ui.Wallet;

import android.icu.util.ULocale;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Currency;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class f {
    public final int f42502a;
    public final k0 f42503b;
    public boolean f42504c;
    public TL_wallet.currencyRates d;
    public String f42505e = "en";
    public String f42506f;

    public f(k0 k0Var) {
        this.f42503b = k0Var;
        this.f42502a = k0Var.f42718a;
        try {
            this.f42506f = org.telegram.messenger.t0.f25457b.getSharedPreferences("gram_wallet", 0).getString("currency", g());
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
        int i3 = 0;
        while (i3 < str.length()) {
            int codePointAt = str.codePointAt(i3);
            int charCount = Character.charCount(codePointAt) + i3;
            if (Character.isLetter(codePointAt)) {
                return str.substring(0, i3) + str.substring(i3, charCount).toUpperCase(locale) + str.substring(charCount);
            }
            i3 = charCount;
        }
        return str;
    }

    public static TL_wallet.currencyRate e() {
        TL_wallet.currencyRate currencyrate = new TL_wallet.currencyRate();
        currencyrate.currency = "USD";
        currencyrate.rate = 1.0d;
        currencyrate.title = bd.M0(2131743157, null);
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
            if (this.f42504c) {
                return null;
            }
            this.f42504c = true;
            ConnectionsManager.getInstance(this.f42502a).sendRequestTyped(new TL_wallet.getCurrencyRates(), new c3.b(1), new d(this, 0));
        } else {
            Locale locale = bd.E0().f21812y;
            if (locale == null || TextUtils.isEmpty(locale.getLanguage())) {
                str = "en";
            } else {
                str = locale.getLanguage();
            }
            if (!TextUtils.equals(this.f42505e, str)) {
                boolean equals = TextUtils.equals(str, "en");
                for (int i3 = 0; i3 < this.d.rates.size(); i3++) {
                    TL_wallet.currencyRate currencyrate = this.d.rates.get(i3);
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
                this.f42505e = str;
            }
        }
        return this.d;
    }

    public final String g() {
        String str = this.f42506f;
        if (str == null) {
            return "USD";
        }
        return str;
    }

    public final double h() {
        String g7 = g();
        if (TextUtils.equals(g7, "USD")) {
            return 1.0d;
        }
        if (this.d != null) {
            for (int i3 = 0; i3 < this.d.rates.size(); i3++) {
                TL_wallet.currencyRate currencyrate = this.d.rates.get(i3);
                if (TextUtils.equals(currencyrate.currency, g7)) {
                    return currencyrate.rate;
                }
            }
            return 0.0d;
        }
        return 0.0d;
    }

    public final String i() {
        String g7 = g();
        TL_wallet.currencyRates f10 = f();
        if (f10 != null) {
            for (int i3 = 0; i3 < f10.rates.size(); i3++) {
                TL_wallet.currencyRate currencyrate = f10.rates.get(i3);
                if (TextUtils.equals(currencyrate.currency, g7)) {
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
        String g7 = g();
        if (this.d == null) {
            if (TextUtils.equals(g7, "USD")) {
                return e();
            }
            return null;
        }
        for (int i3 = 0; i3 < this.d.rates.size(); i3++) {
            TL_wallet.currencyRate currencyrate = this.d.rates.get(i3);
            if (TextUtils.equals(currencyrate.currency, g7)) {
                return currencyrate;
            }
        }
        return null;
    }
}
