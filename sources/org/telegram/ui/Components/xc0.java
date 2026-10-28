package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class xc0 {
    public final RuntimeShader f34727a;
    public final float[] f34728b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f34729c = {1.0f, 1.0f, 0.0f, 0.0f};

    public xc0(int i10) {
        wc0.c();
        this.f34727a = wc0.b(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f34728b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f34727a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f34729c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f34727a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
