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
import org.telegram.ui.Components.bl;
public final class r7 implements Runnable {
    public final int f25237a;
    public final FrameLayout f25238b;
    public final double f25239c;
    public final double d;

    public r7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.f25237a = i10;
        this.f25238b = frameLayout;
        this.f25239c = d;
        this.d = d10;
    }

    @Override
    public final void run() {
        switch (this.f25237a) {
            case 0:
                s7 s7Var = (s7) this.f25238b;
                double d = this.f25239c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d10, d);
                        s7Var.E = detectOcean;
                        if (detectOcean == null) {
                            s7Var.E = "";
                        } else {
                            s7Var.E = "🌊 " + ((Object) s7Var.E);
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
                        s7Var.E = sb2.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            s7Var.E = countryCodeToEmoji + " " + ((Object) s7Var.E);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new r7(s7Var, d, d10, 1));
                return;
            case 1:
                s7 s7Var2 = (s7) this.f25238b;
                double d11 = this.f25239c;
                double d12 = this.d;
                s7Var2.B = d11;
                s7Var2.C = d12;
                s7Var2.A = false;
                CharSequence charSequence = s7Var2.E;
                org.telegram.ui.ActionBar.h5 h5Var = s7Var2.f25659b;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, h5Var.getPaint().getFontMetricsInt(), false);
                s7Var2.E = replaceEmoji;
                h5Var.l(replaceEmoji, false);
                return;
            default:
                ((bl) this.f25238b).b0(this.f25239c, this.d);
                return;
        }
    }
}
