package org.telegram.ui.Components;

import java.util.ArrayList;
public final class i6 extends r1.e {
    public final int f36154a;
    public final Object f36155b;

    public i6(Object obj, int i7) {
        this.f36154a = i7;
        this.f36155b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f36154a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f36155b).W1;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
            default:
                return ((r1.f) this.f36155b).f56346a;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f36154a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f36155b;
                ArrayList arrayList = animatedPhoneNumberEditText.W1;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f10 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
            default:
                ((r1.f) this.f36155b).f56346a = f10;
                return;
        }
    }
}
