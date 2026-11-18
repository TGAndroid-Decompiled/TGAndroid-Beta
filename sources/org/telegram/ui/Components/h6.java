package org.telegram.ui.Components;

import java.util.ArrayList;
public final class h6 extends r1.e {
    public final int f35755a;
    public final Object f35756b;

    public h6(Object obj, int i7) {
        this.f35755a = i7;
        this.f35756b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f35755a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f35756b).W1;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
            default:
                return ((r1.f) this.f35756b).f56305a;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f35755a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f35756b;
                ArrayList arrayList = animatedPhoneNumberEditText.W1;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f10 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
            default:
                ((r1.f) this.f35756b).f56305a = f10;
                return;
        }
    }
}
