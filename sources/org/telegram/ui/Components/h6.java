package org.telegram.ui.Components;

import java.util.ArrayList;
public final class h6 extends r1.e {
    public final int f35643a;
    public final Object f35644b;

    public h6(Object obj, int i7) {
        this.f35643a = i7;
        this.f35644b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f35643a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f35644b).W1;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
            default:
                return ((r1.f) this.f35644b).f56428a;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f35643a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f35644b;
                ArrayList arrayList = animatedPhoneNumberEditText.W1;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f10 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
            default:
                ((r1.f) this.f35644b).f56428a = f10;
                return;
        }
    }
}
