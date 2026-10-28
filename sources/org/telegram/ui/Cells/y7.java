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
import org.telegram.ui.Components.sl;
public final class y7 implements Runnable {
    public final int f25766a;
    public final FrameLayout f25767b;
    public final double f25768c;
    public final double d;

    public y7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.f25766a = i10;
        this.f25767b = frameLayout;
        this.f25768c = d;
        this.d = d10;
    }

    @Override
    public final void run() {
        switch (this.f25766a) {
            case 0:
                z7 z7Var = (z7) this.f25767b;
                double d = this.f25768c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d10, d);
                        z7Var.K = detectOcean;
                        if (detectOcean == null) {
                            z7Var.K = "";
                        } else {
                            z7Var.K = "🌊 " + ((Object) z7Var.K);
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
                        z7Var.K = sb2.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            z7Var.K = countryCodeToEmoji + " " + ((Object) z7Var.K);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new y7(z7Var, d, d10, 1));
                return;
            case 1:
                z7 z7Var2 = (z7) this.f25767b;
                double d11 = this.f25768c;
                double d12 = this.d;
                z7Var2.H = d11;
                z7Var2.I = d12;
                z7Var2.G = false;
                CharSequence charSequence = z7Var2.K;
                org.telegram.ui.ActionBar.b6 b6Var = z7Var2.d;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, b6Var.getPaint().getFontMetricsInt(), false);
                z7Var2.K = replaceEmoji;
                b6Var.l(replaceEmoji, false);
                return;
            default:
                ((sl) this.f25767b).e0(this.f25768c, this.d);
                return;
        }
    }
}
