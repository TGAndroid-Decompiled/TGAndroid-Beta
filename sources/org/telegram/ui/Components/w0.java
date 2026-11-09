package org.telegram.ui.Components;
public final class w0 implements eb0 {
    public final int f39848a;
    public final int[] f39849b;

    public w0(int[] iArr, int i7) {
        this.f39848a = i7;
        this.f39849b = iArr;
    }

    @Override
    public final String h(int i7) {
        int i10 = this.f39848a;
        int[] iArr = this.f39849b;
        switch (i10) {
            case 0:
                int i11 = iArr[i7];
                if (i11 == 0) {
                    return org.telegram.messenger.id.M0(2131748307, null);
                }
                if (i11 < 60) {
                    return org.telegram.messenger.id.G(i11, "Minutes", new Object[0]);
                }
                if (i11 < 1440) {
                    return org.telegram.messenger.id.G(i11 / 60, "Hours", new Object[0]);
                }
                if (i11 < 10080) {
                    return org.telegram.messenger.id.G(i11 / 1440, "Days", new Object[0]);
                }
                if (i11 < 44640) {
                    return org.telegram.messenger.id.G(i11 / 10080, "Weeks", new Object[0]);
                }
                if (i11 < 525600) {
                    return org.telegram.messenger.id.G(i11 / 44640, "Months", new Object[0]);
                }
                return org.telegram.messenger.id.G(i11 / 525600, "Years", new Object[0]);
            default:
                int i12 = iArr[i7];
                if (i12 == 0) {
                    return org.telegram.messenger.id.M0(2131753849, null);
                }
                if (i12 < 10080) {
                    return org.telegram.messenger.id.G(i12 / 1440, "Days", new Object[0]);
                }
                if (i12 < 44640) {
                    return org.telegram.messenger.id.G(i12 / 10080, "Weeks", new Object[0]);
                }
                if (i12 < 525600) {
                    return org.telegram.messenger.id.G(i12 / 44640, "Months", new Object[0]);
                }
                return org.telegram.messenger.id.G(i12 / 525600, "Years", new Object[0]);
        }
    }
}
