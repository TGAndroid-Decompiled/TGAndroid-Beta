package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class dc0 {
    public final RuntimeShader f23369a;
    public final float[] f23370b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f23371c = {1.0f, 1.0f, 0.0f, 0.0f};

    public dc0(int i10) {
        cc0.b();
        this.f23369a = cc0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f23370b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f23369a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f23371c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f23369a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
