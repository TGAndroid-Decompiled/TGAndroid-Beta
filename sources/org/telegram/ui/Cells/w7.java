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
import org.telegram.ui.Components.ll;
public final class w7 implements Runnable {
    public final int f20674a;
    public final FrameLayout f20675b;
    public final double f20676c;
    public final double d;

    public w7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.f20674a = i10;
        this.f20675b = frameLayout;
        this.f20676c = d;
        this.d = d10;
    }

    @Override
    public final void run() {
        switch (this.f20674a) {
            case 0:
                x7 x7Var = (x7) this.f20675b;
                double d = this.f20676c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d10, d);
                        x7Var.I = detectOcean;
                        if (detectOcean == null) {
                            x7Var.I = "";
                        } else {
                            x7Var.I = "🌊 " + ((Object) x7Var.I);
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
                        x7Var.I = sb2.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            x7Var.I = countryCodeToEmoji + " " + ((Object) x7Var.I);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new w7(x7Var, d, d10, 1));
                return;
            case 1:
                x7 x7Var2 = (x7) this.f20675b;
                double d11 = this.f20676c;
                double d12 = this.d;
                x7Var2.F = d11;
                x7Var2.G = d12;
                x7Var2.E = false;
                CharSequence charSequence = x7Var2.I;
                org.telegram.ui.ActionBar.l5 l5Var = x7Var2.f20713b;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, l5Var.getPaint().getFontMetricsInt(), false);
                x7Var2.I = replaceEmoji;
                l5Var.l(replaceEmoji, false);
                return;
            default:
                ((ll) this.f20675b).b0(this.f20676c, this.d);
                return;
        }
    }
}
