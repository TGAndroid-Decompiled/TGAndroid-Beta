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
import org.telegram.ui.Components.pl;
public final class u7 implements Runnable {
    public final int f23740a;
    public final FrameLayout f23741b;
    public final double f23742c;
    public final double d;

    public u7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.f23740a = i10;
        this.f23741b = frameLayout;
        this.f23742c = d;
        this.d = d10;
    }

    @Override
    public final void run() {
        switch (this.f23740a) {
            case 0:
                v7 v7Var = (v7) this.f23741b;
                double d = this.f23742c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d10, d);
                        v7Var.K = detectOcean;
                        if (detectOcean == null) {
                            v7Var.K = "";
                        } else {
                            v7Var.K = "🌊 " + ((Object) v7Var.K);
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
                        v7Var.K = sb2.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            v7Var.K = countryCodeToEmoji + " " + ((Object) v7Var.K);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new u7(v7Var, d, d10, 1));
                return;
            case 1:
                v7 v7Var2 = (v7) this.f23741b;
                double d11 = this.f23742c;
                double d12 = this.d;
                v7Var2.H = d11;
                v7Var2.I = d12;
                v7Var2.G = false;
                CharSequence charSequence = v7Var2.K;
                org.telegram.ui.ActionBar.n5 n5Var = v7Var2.d;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, n5Var.getPaint().getFontMetricsInt(), false);
                v7Var2.K = replaceEmoji;
                n5Var.l(replaceEmoji, false);
                return;
            default:
                ((pl) this.f23741b).e0(this.f23742c, this.d);
                return;
        }
    }
}
