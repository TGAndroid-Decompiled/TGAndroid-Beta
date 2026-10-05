package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class qc0 {
    public final RuntimeShader f30022a;
    public final float[] f30023b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f30024c = {1.0f, 1.0f, 0.0f, 0.0f};

    public qc0(int i10) {
        mi.d.c();
        this.f30022a = mi.d.b(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f30023b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f30022a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f30024c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f30022a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
