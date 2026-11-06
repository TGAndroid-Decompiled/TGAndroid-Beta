package org.telegram.ui.Wallet;

import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class e implements Runnable {
    public final int f42401a;
    public final f f42402b;
    public final TL_wallet.currencyRates f42403c;

    public e(f fVar, TL_wallet.currencyRates currencyrates, int i7) {
        this.f42401a = i7;
        this.f42402b = fVar;
        this.f42403c = currencyrates;
    }

    @Override
    public final void run() {
        int i7;
        boolean z9;
        String str;
        switch (this.f42401a) {
            case 0:
                f fVar = this.f42402b;
                TL_wallet.currencyRates currencyrates = this.f42403c;
                boolean z10 = true;
                if (currencyrates == null || currencyrates.rates == null) {
                    i7 = 1;
                } else {
                    try {
                        InputStream open = org.telegram.messenger.t0.f25555b.getAssets().open("currencies.json");
                        String str2 = h2.m0.f14112a;
                        JSONObject jSONObject = new JSONObject(new String(i9.f.b(open), g9.j.f13590a));
                        ArrayList<TL_wallet.currencyRate> arrayList = currencyrates.rates;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TL_wallet.currencyRate currencyrate = arrayList.get(i10);
                            i10++;
                            TL_wallet.currencyRate currencyrate2 = currencyrate;
                            if (currencyrate2 != null) {
                                JSONObject optJSONObject = jSONObject.optJSONObject(currencyrate2.currency);
                                if (optJSONObject == null) {
                                    String str3 = currencyrate2.currency;
                                    currencyrate2.title = str3;
                                    currencyrate2.symbol = str3;
                                    currencyrate2.thousandsSeparator = ",";
                                    currencyrate2.decimalSeparator = ".";
                                    currencyrate2.spaceBetween = z10;
                                    currencyrate2.exp = 2;
                                } else {
                                    currencyrate2.title = optJSONObject.optString("title", currencyrate2.currency);
                                    String optString = optJSONObject.optString("native", currencyrate2.currency);
                                    String optString2 = optJSONObject.optString("symbol", currencyrate2.currency);
                                    if (("$".equals(optString) && !"USD".equals(currencyrate2.currency)) || "kr".equals(optString)) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if ("AED".equals(currencyrate2.currency)) {
                                        str = "\u20c3";
                                    } else if ("GEL".equals(currencyrate2.currency)) {
                                        str = "₾";
                                    } else if (z9) {
                                        str = optString2;
                                    } else {
                                        str = optString;
                                    }
                                    currencyrate2.symbol = str;
                                    currencyrate2.thousandsSeparator = optJSONObject.optString("thousands_sep", ",");
                                    currencyrate2.decimalSeparator = optJSONObject.optString("decimal_sep", ".");
                                    currencyrate2.symbolLeft = optJSONObject.optBoolean("symbol_left");
                                    currencyrate2.spaceBetween = optJSONObject.optBoolean("space_between");
                                    currencyrate2.dropZeros = optJSONObject.optBoolean("drop_zeros");
                                    currencyrate2.exp = optJSONObject.optInt("exp", 2);
                                    if ("AED".equals(currencyrate2.currency)) {
                                        currencyrate2.title = currencyrate2.title.replace("United Arab Emirates", "UAE");
                                    } else if ("USD".equalsIgnoreCase(currencyrate2.currency)) {
                                        currencyrate2.title = currencyrate2.title.replace("United States", "US");
                                    }
                                    z10 = true;
                                }
                            }
                        }
                        open.close();
                        i7 = 1;
                    } catch (Exception e10) {
                        i7 = 1;
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                org.telegram.messenger.g0.h3(new e(fVar, currencyrates, i7));
                return;
            default:
                f fVar2 = this.f42402b;
                fVar2.d = this.f42403c;
                fVar2.f42440c = false;
                fVar2.f42439b.L();
                return;
        }
    }
}
