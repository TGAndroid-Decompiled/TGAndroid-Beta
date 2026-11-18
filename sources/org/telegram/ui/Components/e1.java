package org.telegram.ui.Components;
public final class e1 implements ob0 {
    public final int f34558a;
    public final int[] f34559b;

    public e1(int[] iArr, int i7) {
        this.f34558a = i7;
        this.f34559b = iArr;
    }

    @Override
    public final String i(int i7) {
        int i10 = this.f34558a;
        int[] iArr = this.f34559b;
        switch (i10) {
            case 0:
                int i11 = iArr[i7];
                if (i11 == 0) {
                    return org.telegram.messenger.gd.M0(2131748115, null);
                }
                if (i11 < 60) {
                    return org.telegram.messenger.gd.G(i11, "Minutes", new Object[0]);
                }
                if (i11 < 1440) {
                    return org.telegram.messenger.gd.G(i11 / 60, "Hours", new Object[0]);
                }
                if (i11 < 10080) {
                    return org.telegram.messenger.gd.G(i11 / 1440, "Days", new Object[0]);
                }
                if (i11 < 44640) {
                    return org.telegram.messenger.gd.G(i11 / 10080, "Weeks", new Object[0]);
                }
                if (i11 < 525600) {
                    return org.telegram.messenger.gd.G(i11 / 44640, "Months", new Object[0]);
                }
                return org.telegram.messenger.gd.G(i11 / 525600, "Years", new Object[0]);
            default:
                int i12 = iArr[i7];
                if (i12 == 0) {
                    return org.telegram.messenger.gd.M0(2131753847, null);
                }
                if (i12 < 10080) {
                    return org.telegram.messenger.gd.G(i12 / 1440, "Days", new Object[0]);
                }
                if (i12 < 44640) {
                    return org.telegram.messenger.gd.G(i12 / 10080, "Weeks", new Object[0]);
                }
                if (i12 < 525600) {
                    return org.telegram.messenger.gd.G(i12 / 44640, "Months", new Object[0]);
                }
                return org.telegram.messenger.gd.G(i12 / 525600, "Years", new Object[0]);
        }
    }
}
