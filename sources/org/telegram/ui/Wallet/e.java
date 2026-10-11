package org.telegram.ui.Wallet;

import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_wallet;
public final class e implements Runnable {
    public final int f34828a;
    public final f f34829b;
    public final TL_wallet.currencyRates f34830c;

    public e(f fVar, TL_wallet.currencyRates currencyrates, int i10) {
        this.f34828a = i10;
        this.f34829b = fVar;
        this.f34830c = currencyrates;
    }

    @Override
    public final void run() {
        boolean z10;
        String str;
        switch (this.f34828a) {
            case 0:
                f fVar = this.f34829b;
                TL_wallet.currencyRates currencyrates = this.f34830c;
                boolean z11 = true;
                if (currencyrates != null && currencyrates.rates != null) {
                    try {
                        InputStream open = ApplicationLoader.applicationContext.getAssets().open("currencies.json");
                        String str2 = e2.d0.f8531a;
                        JSONObject jSONObject = new JSONObject(new String(f9.b.b(open), d9.d.f8210a));
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                AndroidUtilities.runOnUIThread(new e(fVar, currencyrates, 1));
                return;
            default:
                f fVar2 = this.f34829b;
                fVar2.d = this.f34830c;
                fVar2.f34879c = false;
                fVar2.f34878b.I();
                return;
        }
    }
}
