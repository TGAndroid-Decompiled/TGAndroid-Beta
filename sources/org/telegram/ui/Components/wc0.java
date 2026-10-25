package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class wc0 {
    public final RuntimeShader f34408a;
    public final float[] f34409b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f34410c = {1.0f, 1.0f, 0.0f, 0.0f};

    public wc0(int i10) {
        vc0.c();
        this.f34408a = vc0.b(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f34409b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f34408a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f34410c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f34408a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
