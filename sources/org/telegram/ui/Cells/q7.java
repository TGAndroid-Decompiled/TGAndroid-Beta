package org.telegram.ui.Cells;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.id;
import org.telegram.messenger.sd;
import org.telegram.ui.Components.vk;
public final class q7 implements Runnable {
    public final int f30170a;
    public final FrameLayout f30171b;
    public final double f30172c;
    public final double d;

    public q7(FrameLayout frameLayout, double d, double d2, int i7) {
        this.f30170a = i7;
        this.f30171b = frameLayout;
        this.f30172c = d;
        this.d = d2;
    }

    @Override
    public final void run() {
        switch (this.f30170a) {
            case 0:
                r7 r7Var = (r7) this.f30171b;
                double d = this.f30172c;
                double d2 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.f25570b, id.E0().f23189y).getFromLocation(d, d2, 1);
                    if (fromLocation.isEmpty()) {
                        String c10 = sd.c(d2, d);
                        r7Var.K = c10;
                        if (c10 == null) {
                            r7Var.K = "";
                        } else {
                            r7Var.K = "🌊 " + ((Object) r7Var.K);
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
                        r7Var.K = sb2.toString();
                        String b10 = sd.b(address.getCountryCode());
                        if (b10 != null && org.telegram.messenger.i6.g(b10) != null) {
                            r7Var.K = b10 + " " + ((Object) r7Var.K);
                        }
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new q7(r7Var, d, d2, 1));
                return;
            case 1:
                r7 r7Var2 = (r7) this.f30171b;
                double d10 = this.f30172c;
                double d11 = this.d;
                r7Var2.H = d10;
                r7Var2.I = d11;
                r7Var2.G = false;
                CharSequence charSequence = r7Var2.K;
                org.telegram.ui.ActionBar.m5 m5Var = r7Var2.d;
                CharSequence m10 = org.telegram.messenger.i6.m(charSequence, m5Var.getPaint().getFontMetricsInt(), false, null, 0);
                r7Var2.K = m10;
                m5Var.l(m10, false);
                return;
            default:
                ((vk) this.f30171b).h0(this.f30172c, this.d);
                return;
        }
    }
}
