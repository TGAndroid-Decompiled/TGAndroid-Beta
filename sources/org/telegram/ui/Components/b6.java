package org.telegram.ui.Components;

import java.util.ArrayList;
public final class b6 extends r1.e {
    public final int f32120a;
    public final Object f32121b;

    public b6(Object obj, int i7) {
        this.f32120a = i7;
        this.f32121b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f32120a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f32121b).Q1;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
            default:
                return ((r1.f) this.f32121b).f54261a;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f32120a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f32121b;
                ArrayList arrayList = animatedPhoneNumberEditText.Q1;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f10 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
            default:
                ((r1.f) this.f32121b).f54261a = f10;
                return;
        }
    }
}
