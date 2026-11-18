package org.telegram.ui.Cells;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.messenger.qd;
import org.telegram.ui.Components.kl;
public final class r7 implements Runnable {
    public final int f31712a;
    public final FrameLayout f31713b;
    public final double f31714c;
    public final double d;

    public r7(FrameLayout frameLayout, double d, double d2, int i7) {
        this.f31712a = i7;
        this.f31713b = frameLayout;
        this.f31714c = d;
        this.d = d2;
    }

    @Override
    public final void run() {
        switch (this.f31712a) {
            case 0:
                s7 s7Var = (s7) this.f31713b;
                double d = this.f31714c;
                double d2 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.f26913b, gd.E0().f24241y).getFromLocation(d, d2, 1);
                    if (fromLocation.isEmpty()) {
                        String c10 = qd.c(d2, d);
                        s7Var.L = c10;
                        if (c10 == null) {
                            s7Var.L = "";
                        } else {
                            s7Var.L = "🌊 " + ((Object) s7Var.L);
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
                        s7Var.L = sb2.toString();
                        String b10 = qd.b(address.getCountryCode());
                        if (b10 != null && org.telegram.messenger.j6.g(b10) != null) {
                            s7Var.L = b10 + " " + ((Object) s7Var.L);
                        }
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new r7(s7Var, d, d2, 1));
                return;
            case 1:
                s7 s7Var2 = (s7) this.f31713b;
                double d10 = this.f31714c;
                double d11 = this.d;
                s7Var2.I = d10;
                s7Var2.J = d11;
                s7Var2.H = false;
                CharSequence charSequence = s7Var2.L;
                org.telegram.ui.ActionBar.n5 n5Var = s7Var2.d;
                CharSequence m10 = org.telegram.messenger.j6.m(charSequence, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
                s7Var2.L = m10;
                n5Var.l(m10, false);
                return;
            default:
                ((kl) this.f31713b).h0(this.f31714c, this.d);
                return;
        }
    }
}
