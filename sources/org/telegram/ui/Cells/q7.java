package org.telegram.ui.Cells;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.ui.Components.tk;

public final class q7 implements Runnable {

    public final int f25075a;

    public final FrameLayout f25076b;

    public final double f25077c;
    public final double d;

    public q7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.f25075a = i10;
        this.f25076b = frameLayout;
        this.f25077c = d;
        this.d = d10;
    }

    @Override
    public final void run() {
        switch (this.f25075a) {
            case 0:
                r7 r7Var = (r7) this.f25076b;
                double d = this.f25077c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String strDetectOcean = LocationController.detectOcean(d10, d);
                        r7Var.E = strDetectOcean;
                        if (strDetectOcean == null) {
                            r7Var.E = "";
                        } else {
                            r7Var.E = "🌊 " + ((Object) r7Var.E);
                        }
                    } else {
                        Address address = fromLocation.get(0);
                        StringBuilder sb2 = new StringBuilder();
                        HashSet<String> hashSet = new HashSet();
                        hashSet.add(address.getSubAdminArea());
                        hashSet.add(address.getAdminArea());
                        hashSet.add(address.getLocality());
                        hashSet.add(address.getCountryName());
                        for (String str : hashSet) {
                            if (!TextUtils.isEmpty(str)) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(str);
                            }
                        }
                        r7Var.E = sb2.toString();
                        String strCountryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (strCountryCodeToEmoji != null && Emoji.getEmojiDrawable(strCountryCodeToEmoji) != null) {
                            r7Var.E = strCountryCodeToEmoji + " " + ((Object) r7Var.E);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new q7(r7Var, d, d10, 1));
                break;
            case 1:
                r7 r7Var2 = (r7) this.f25076b;
                double d11 = this.f25077c;
                double d12 = this.d;
                r7Var2.B = d11;
                r7Var2.C = d12;
                r7Var2.A = false;
                CharSequence charSequence = r7Var2.E;
                org.telegram.ui.ActionBar.h5 h5Var = r7Var2.f25222b;
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, h5Var.getPaint().getFontMetricsInt(), false);
                r7Var2.E = charSequenceReplaceEmoji;
                h5Var.l(charSequenceReplaceEmoji, false);
                break;
            default:
                ((tk) this.f25076b).b0(this.f25077c, this.d);
                break;
        }
    }
}
