package org.telegram.ui.Cells;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.rd;
import org.telegram.ui.Components.dl;
public final class p7 implements Runnable {
    public final int f30873a;
    public final FrameLayout f30874b;
    public final double f30875c;
    public final double d;

    public p7(FrameLayout frameLayout, double d, double d2, int i7) {
        this.f30873a = i7;
        this.f30874b = frameLayout;
        this.f30875c = d;
        this.d = d2;
    }

    @Override
    public final void run() {
        switch (this.f30873a) {
            case 0:
                q7 q7Var = (q7) this.f30874b;
                double d = this.f30875c;
                double d2 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.f26600b, hd.E0().f24129y).getFromLocation(d, d2, 1);
                    if (fromLocation.isEmpty()) {
                        String c10 = rd.c(d2, d);
                        q7Var.L = c10;
                        if (c10 == null) {
                            q7Var.L = "";
                        } else {
                            q7Var.L = "🌊 " + ((Object) q7Var.L);
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
                        q7Var.L = sb2.toString();
                        String b10 = rd.b(address.getCountryCode());
                        if (b10 != null && org.telegram.messenger.j6.g(b10) != null) {
                            q7Var.L = b10 + " " + ((Object) q7Var.L);
                        }
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new p7(q7Var, d, d2, 1));
                return;
            case 1:
                q7 q7Var2 = (q7) this.f30874b;
                double d10 = this.f30875c;
                double d11 = this.d;
                q7Var2.I = d10;
                q7Var2.J = d11;
                q7Var2.H = false;
                CharSequence charSequence = q7Var2.L;
                org.telegram.ui.ActionBar.j5 j5Var = q7Var2.d;
                CharSequence m10 = org.telegram.messenger.j6.m(charSequence, j5Var.getPaint().getFontMetricsInt(), false, null, 0);
                q7Var2.L = m10;
                j5Var.l(m10, false);
                return;
            default:
                ((dl) this.f30874b).h0(this.f30875c, this.d);
                return;
        }
    }
}
