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
import org.telegram.ui.Components.xk;
public final class t7 implements Runnable {
    public final int f25705a;
    public final FrameLayout f25706b;
    public final double f25707c;
    public final double d;

    public t7(FrameLayout frameLayout, double d, double d9, int i9) {
        this.f25705a = i9;
        this.f25706b = frameLayout;
        this.f25707c = d;
        this.d = d9;
    }

    @Override
    public final void run() {
        switch (this.f25705a) {
            case 0:
                u7 u7Var = (u7) this.f25706b;
                double d = this.f25707c;
                double d9 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d9, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d9, d);
                        u7Var.E = detectOcean;
                        if (detectOcean == null) {
                            u7Var.E = "";
                        } else {
                            u7Var.E = "🌊 " + ((Object) u7Var.E);
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
                        u7Var.E = sb2.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            u7Var.E = countryCodeToEmoji + " " + ((Object) u7Var.E);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new t7(u7Var, d, d9, 1));
                return;
            case 1:
                u7 u7Var2 = (u7) this.f25706b;
                double d10 = this.f25707c;
                double d11 = this.d;
                u7Var2.B = d10;
                u7Var2.C = d11;
                u7Var2.A = false;
                CharSequence charSequence = u7Var2.E;
                org.telegram.ui.ActionBar.h5 h5Var = u7Var2.f25750b;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, h5Var.getPaint().getFontMetricsInt(), false);
                u7Var2.E = replaceEmoji;
                h5Var.l(replaceEmoji, false);
                return;
            default:
                ((xk) this.f25706b).a0(this.f25707c, this.d);
                return;
        }
    }
}
