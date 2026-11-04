package org.telegram.ui.Components;

import java.util.ArrayList;
public final class a6 extends q1.e {
    public final int f31729a;
    public final Object f31730b;

    public a6(Object obj, int i3) {
        this.f31729a = i3;
        this.f31730b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f31729a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f31730b).R1;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
            default:
                return ((q1.f) this.f31730b).f53635a;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f31729a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f31730b;
                ArrayList arrayList = animatedPhoneNumberEditText.R1;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f10 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
            default:
                ((q1.f) this.f31730b).f53635a = f10;
                return;
        }
    }
}
