package org.telegram.ui.Cells;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.ui.Components.xl;
public final class v7 implements Runnable {
    public final int f23585a;
    public final FrameLayout f23586b;
    public final double f23587c;
    public final double d;

    public v7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.f23585a = i10;
        this.f23586b = frameLayout;
        this.f23587c = d;
        this.d = d10;
    }

    @Override
    public final void run() {
        switch (this.f23585a) {
            case 0:
                w7 w7Var = (w7) this.f23586b;
                double d = this.f23587c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d10, d);
                        w7Var.I = detectOcean;
                        if (detectOcean == null) {
                            w7Var.I = "";
                        } else {
                            w7Var.I = "🌊 " + ((Object) w7Var.I);
                        }
                    } else {
                        Address address = fromLocation.get(0);
                        StringBuilder sb2 = new StringBuilder();
                        HashSet hashSet = new HashSet();
                        hashSet.add(address.getSubAdminArea());
                        hashSet.add(address.getAdminArea());
                        hashSet.add(address.getLocality());
                        hashSet.add(address.getCountryName());
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (!TextUtils.isEmpty(str)) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(str);
                            }
                        }
                        w7Var.I = sb2.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            w7Var.I = countryCodeToEmoji + " " + ((Object) w7Var.I);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new v7(w7Var, d, d10, 1));
                return;
            case 1:
                w7 w7Var2 = (w7) this.f23586b;
                double d11 = this.f23587c;
                double d12 = this.d;
                w7Var2.F = d11;
                w7Var2.G = d12;
                w7Var2.E = false;
                CharSequence charSequence = w7Var2.I;
                org.telegram.ui.ActionBar.h5 h5Var = w7Var2.f23703b;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, h5Var.getPaint().getFontMetricsInt(), false);
                w7Var2.I = replaceEmoji;
                h5Var.l(replaceEmoji, false);
                return;
            default:
                ((xl) this.f23586b).e0(this.f23587c, this.d);
                return;
        }
    }
}
