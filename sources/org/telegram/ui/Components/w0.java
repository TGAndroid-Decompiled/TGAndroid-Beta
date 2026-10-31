package org.telegram.ui.Components;
public final class w0 implements wb0 {
    public final int f31952a;
    public final int[] f31953b;

    public w0(int[] iArr, int i10) {
        this.f31952a = i10;
        this.f31953b = iArr;
    }

    @Override
    public final String e(int i10) {
        int i11 = this.f31952a;
        int[] iArr = this.f31953b;
        switch (i11) {
            case 0:
                int i12 = iArr[i10];
                if (i12 == 0) {
                    return org.telegram.messenger.cd.L0(2131748322, null);
                }
                if (i12 < 60) {
                    return org.telegram.messenger.cd.G(i12, "Minutes", new Object[0]);
                }
                if (i12 < 1440) {
                    return org.telegram.messenger.cd.G(i12 / 60, "Hours", new Object[0]);
                }
                if (i12 < 10080) {
                    return org.telegram.messenger.cd.G(i12 / 1440, "Days", new Object[0]);
                }
                if (i12 < 44640) {
                    return org.telegram.messenger.cd.G(i12 / 10080, "Weeks", new Object[0]);
                }
                if (i12 < 525600) {
                    return org.telegram.messenger.cd.G(i12 / 44640, "Months", new Object[0]);
                }
                return org.telegram.messenger.cd.G(i12 / 525600, "Years", new Object[0]);
            default:
                int i13 = iArr[i10];
                if (i13 == 0) {
                    return org.telegram.messenger.cd.L0(2131753849, null);
                }
                if (i13 < 10080) {
                    return org.telegram.messenger.cd.G(i13 / 1440, "Days", new Object[0]);
                }
                if (i13 < 44640) {
                    return org.telegram.messenger.cd.G(i13 / 10080, "Weeks", new Object[0]);
                }
                if (i13 < 525600) {
                    return org.telegram.messenger.cd.G(i13 / 44640, "Months", new Object[0]);
                }
                return org.telegram.messenger.cd.G(i13 / 525600, "Years", new Object[0]);
        }
    }
}
