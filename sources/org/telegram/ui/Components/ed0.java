package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class ed0 {
    public final RuntimeShader f26072a;
    public final float[] f26073b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f26074c = {1.0f, 1.0f, 0.0f, 0.0f};

    public ed0(int i10) {
        dd0.b();
        this.f26072a = dd0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f26073b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26072a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f26074c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26072a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
