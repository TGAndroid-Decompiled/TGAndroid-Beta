package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

public final class pb0 {

    public final RuntimeShader f31578a;

    public final float[] f31579b = {1.0f, 1.0f, 0.0f, 0.0f};

    public final float[] f31580c = {1.0f, 1.0f, 0.0f, 0.0f};

    public pb0(int i10) {
        ob0.b();
        this.f31578a = ob0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f31579b;
        if (Arrays.equals(fArr, fArr2)) {
            return;
        }
        System.arraycopy(fArr, 0, fArr2, 0, 4);
        this.f31578a.setFloatUniform("transformGradient", fArr2);
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f31580c;
        if (Arrays.equals(fArr, fArr2)) {
            return;
        }
        System.arraycopy(fArr, 0, fArr2, 0, 4);
        this.f31578a.setFloatUniform("transformPattern", fArr2);
    }
}
