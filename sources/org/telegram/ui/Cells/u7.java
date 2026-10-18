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
import org.telegram.ui.Components.rl;
public final class u7 implements Runnable {
    public final int f23595a;
    public final FrameLayout f23596b;
    public final double f23597c;
    public final double d;

    public u7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.f23595a = i10;
        this.f23596b = frameLayout;
        this.f23597c = d;
        this.d = d10;
    }

    @Override
    public final void run() {
        switch (this.f23595a) {
            case 0:
                v7 v7Var = (v7) this.f23596b;
                double d = this.f23597c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d10, d);
                        v7Var.I = detectOcean;
                        if (detectOcean == null) {
                            v7Var.I = "";
                        } else {
                            v7Var.I = "🌊 " + ((Object) v7Var.I);
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
                        v7Var.I = sb2.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            v7Var.I = countryCodeToEmoji + " " + ((Object) v7Var.I);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new u7(v7Var, d, d10, 1));
                return;
            case 1:
                v7 v7Var2 = (v7) this.f23596b;
                double d11 = this.f23597c;
                double d12 = this.d;
                v7Var2.F = d11;
                v7Var2.G = d12;
                v7Var2.E = false;
                CharSequence charSequence = v7Var2.I;
                org.telegram.ui.ActionBar.j5 j5Var = v7Var2.f23639b;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, j5Var.getPaint().getFontMetricsInt(), false);
                v7Var2.I = replaceEmoji;
                j5Var.l(replaceEmoji, false);
                return;
            default:
                ((rl) this.f23596b).e0(this.f23597c, this.d);
                return;
        }
    }
}
