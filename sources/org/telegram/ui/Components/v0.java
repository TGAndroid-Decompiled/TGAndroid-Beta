package org.telegram.ui.Components;
public final class v0 implements ya0 {
    public final int f38918a;
    public final int[] f38919b;

    public v0(int[] iArr, int i3) {
        this.f38918a = i3;
        this.f38919b = iArr;
    }

    @Override
    public final String e(int i3) {
        int i10 = this.f38918a;
        int[] iArr = this.f38919b;
        switch (i10) {
            case 0:
                int i11 = iArr[i3];
                if (i11 == 0) {
                    return org.telegram.messenger.bd.M0(2131748315, null);
                }
                if (i11 < 60) {
                    return org.telegram.messenger.bd.G(i11, "Minutes", new Object[0]);
                }
                if (i11 < 1440) {
                    return org.telegram.messenger.bd.G(i11 / 60, "Hours", new Object[0]);
                }
                if (i11 < 10080) {
                    return org.telegram.messenger.bd.G(i11 / 1440, "Days", new Object[0]);
                }
                if (i11 < 44640) {
                    return org.telegram.messenger.bd.G(i11 / 10080, "Weeks", new Object[0]);
                }
                if (i11 < 525600) {
                    return org.telegram.messenger.bd.G(i11 / 44640, "Months", new Object[0]);
                }
                return org.telegram.messenger.bd.G(i11 / 525600, "Years", new Object[0]);
            default:
                int i12 = iArr[i3];
                if (i12 == 0) {
                    return org.telegram.messenger.bd.M0(2131753849, null);
                }
                if (i12 < 10080) {
                    return org.telegram.messenger.bd.G(i12 / 1440, "Days", new Object[0]);
                }
                if (i12 < 44640) {
                    return org.telegram.messenger.bd.G(i12 / 10080, "Weeks", new Object[0]);
                }
                if (i12 < 525600) {
                    return org.telegram.messenger.bd.G(i12 / 44640, "Months", new Object[0]);
                }
                return org.telegram.messenger.bd.G(i12 / 525600, "Years", new Object[0]);
        }
    }
}
