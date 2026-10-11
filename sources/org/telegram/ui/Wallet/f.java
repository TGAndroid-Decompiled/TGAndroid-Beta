package org.telegram.ui.Wallet;

import android.icu.util.ULocale;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Currency;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
public final class f {
    public final int f34911a;
    public final l0 f34912b;
    public boolean f34913c;
    public TL_wallet.currencyRates d;
    public String f34914e = "en";
    public String f34915f;

    public f(l0 l0Var) {
        this.f34912b = l0Var;
        this.f34911a = l0Var.f35219a;
        try {
            this.f34915f = ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).getString("currency", g());
        } catch (Exception e7) {
            FileLog.e("[gram-wallet] failed to load currency prefs", e7);
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
        int i10 = 0;
        while (i10 < str.length()) {
            int codePointAt = str.codePointAt(i10);
            int charCount = Character.charCount(codePointAt) + i10;
            if (Character.isLetter(codePointAt)) {
                return str.substring(0, i10) + str.substring(i10, charCount).toUpperCase(locale) + str.substring(charCount);
            }
            i10 = charCount;
        }
        return str;
    }

    public static TL_wallet.currencyRate e() {
        TL_wallet.currencyRate currencyrate = new TL_wallet.currencyRate();
        currencyrate.currency = "USD";
        currencyrate.rate = 1.0d;
        currencyrate.title = LocaleController.getString(R.string.WalletCurrencyUSD);
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
            if (this.f34913c) {
                return null;
            }
            this.f34913c = true;
            ConnectionsManager.getInstance(this.f34911a).sendRequestTyped(new TL_wallet.getCurrencyRates(), new Object(), new d(this, 0));
        } else {
            Locale currentLocale = LocaleController.getInstance().getCurrentLocale();
            if (currentLocale == null || TextUtils.isEmpty(currentLocale.getLanguage())) {
                str = "en";
            } else {
                str = currentLocale.getLanguage();
            }
            if (!TextUtils.equals(this.f34914e, str)) {
                boolean equals = TextUtils.equals(str, "en");
                for (int i10 = 0; i10 < this.d.rates.size(); i10++) {
                    TL_wallet.currencyRate currencyrate = this.d.rates.get(i10);
                    if (currencyrate != null) {
                        currencyrate.translatedTitle = null;
                        if (!equals && !TextUtils.isEmpty(currencyrate.currency)) {
                            try {
                                currencyrate.translatedTitle = d(Currency.getInstance(currencyrate.currency).getDisplayName(currentLocale), currentLocale);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                }
                this.f34914e = str;
            }
        }
        return this.d;
    }

    public final String g() {
        String str = this.f34915f;
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
            for (int i10 = 0; i10 < this.d.rates.size(); i10++) {
                TL_wallet.currencyRate currencyrate = this.d.rates.get(i10);
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
        TL_wallet.currencyRates f7 = f();
        if (f7 != null) {
            for (int i10 = 0; i10 < f7.rates.size(); i10++) {
                TL_wallet.currencyRate currencyrate = f7.rates.get(i10);
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
        for (int i10 = 0; i10 < this.d.rates.size(); i10++) {
            TL_wallet.currencyRate currencyrate = this.d.rates.get(i10);
            if (TextUtils.equals(currencyrate.currency, g10)) {
                return currencyrate;
            }
        }
        return null;
    }
}
