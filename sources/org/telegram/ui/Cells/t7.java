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
import org.telegram.ui.Components.al;
public final class t7 implements Runnable {
    public final int f22367a;
    public final FrameLayout f22368b;
    public final double f22369c;
    public final double d;

    public t7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.f22367a = i10;
        this.f22368b = frameLayout;
        this.f22369c = d;
        this.d = d10;
    }

    @Override
    public final void run() {
        switch (this.f22367a) {
            case 0:
                u7 u7Var = (u7) this.f22368b;
                double d = this.f22369c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d10, d);
                        u7Var.F = detectOcean;
                        if (detectOcean == null) {
                            u7Var.F = "";
                        } else {
                            u7Var.F = "🌊 " + ((Object) u7Var.F);
                        }
                    } else {
                        Address address = fromLocation.get(0);
                        StringBuilder sb = new StringBuilder();
                        HashSet hashSet = new HashSet();
                        hashSet.add(address.getSubAdminArea());
                        hashSet.add(address.getAdminArea());
                        hashSet.add(address.getLocality());
                        hashSet.add(address.getCountryName());
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (!TextUtils.isEmpty(str)) {
                                if (sb.length() > 0) {
                                    sb.append(", ");
                                }
                                sb.append(str);
                            }
                        }
                        u7Var.F = sb.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            u7Var.F = countryCodeToEmoji + " " + ((Object) u7Var.F);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new t7(u7Var, d, d10, 1));
                return;
            case 1:
                u7 u7Var2 = (u7) this.f22368b;
                double d11 = this.f22369c;
                double d12 = this.d;
                u7Var2.C = d11;
                u7Var2.D = d12;
                u7Var2.B = false;
                CharSequence charSequence = u7Var2.F;
                org.telegram.ui.ActionBar.k5 k5Var = u7Var2.f22404b;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, k5Var.getPaint().getFontMetricsInt(), false);
                u7Var2.F = replaceEmoji;
                k5Var.l(replaceEmoji, false);
                return;
            default:
                ((al) this.f22368b).b0(this.f22369c, this.d);
                return;
        }
    }
}
