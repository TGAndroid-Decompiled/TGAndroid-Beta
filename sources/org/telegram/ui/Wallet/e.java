package org.telegram.ui.Wallet;

import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.tgnet.tl.TL_wallet;
public final class e implements Runnable {
    public final int f34439a;
    public final f f34440b;
    public final TL_wallet.currencyRates f34441c;

    public e(f fVar, TL_wallet.currencyRates currencyrates, int i10) {
        this.f34439a = i10;
        this.f34440b = fVar;
        this.f34441c = currencyrates;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        String str;
        switch (this.f34439a) {
            case 0:
                f fVar = this.f34440b;
                TL_wallet.currencyRates currencyrates = this.f34441c;
                boolean z11 = true;
                if (currencyrates == null || currencyrates.rates == null) {
                    i10 = 1;
                } else {
                    try {
                        InputStream open = org.telegram.messenger.w0.f18945b.getAssets().open("currencies.json");
                        String str2 = e2.l0.f6165a;
                        JSONObject jSONObject = new JSONObject(new String(f9.f.b(open), d9.j.f5805a));
                        ArrayList<TL_wallet.currencyRate> arrayList = currencyrates.rates;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            TL_wallet.currencyRate currencyrate = arrayList.get(i11);
                            i11++;
                            TL_wallet.currencyRate currencyrate2 = currencyrate;
                            if (currencyrate2 != null) {
                                JSONObject optJSONObject = jSONObject.optJSONObject(currencyrate2.currency);
                                if (optJSONObject == null) {
                                    String str3 = currencyrate2.currency;
                                    currencyrate2.title = str3;
                                    currencyrate2.symbol = str3;
                                    currencyrate2.thousandsSeparator = ",";
                                    currencyrate2.decimalSeparator = ".";
                                    currencyrate2.spaceBetween = z11;
                                    currencyrate2.exp = 2;
                                } else {
                                    currencyrate2.title = optJSONObject.optString("title", currencyrate2.currency);
                                    String optString = optJSONObject.optString("native", currencyrate2.currency);
                                    String optString2 = optJSONObject.optString("symbol", currencyrate2.currency);
                                    if (("$".equals(optString) && !"USD".equals(currencyrate2.currency)) || "kr".equals(optString)) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if ("AED".equals(currencyrate2.currency)) {
                                        str = "\u20c3";
                                    } else if ("GEL".equals(currencyrate2.currency)) {
                                        str = "₾";
                                    } else if (z10) {
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
                                    z11 = true;
                                }
                            }
                        }
                        open.close();
                        i10 = 1;
                    } catch (Exception e) {
                        i10 = 1;
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                org.telegram.messenger.i0.g3(new e(fVar, currencyrates, i10));
                return;
            default:
                f fVar2 = this.f34440b;
                fVar2.d = this.f34441c;
                fVar2.f34475c = false;
                fVar2.f34474b.L();
                return;
        }
    }
}
