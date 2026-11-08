package org.telegram.ui.Components;

import java.util.ArrayList;
public final class c6 extends r1.e {
    public final int f32459a;
    public final Object f32460b;

    public c6(Object obj, int i7) {
        this.f32459a = i7;
        this.f32460b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f32459a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f32460b).Q1;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
            default:
                return ((r1.f) this.f32460b).f54250a;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f32459a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f32460b;
                ArrayList arrayList = animatedPhoneNumberEditText.Q1;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f10 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
            default:
                ((r1.f) this.f32460b).f54250a = f10;
                return;
        }
    }
}
