package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class ac0 {
    public final RuntimeShader f26735a;
    public final float[] f26736b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f26737c = {1.0f, 1.0f, 0.0f, 0.0f};

    public ac0(int i10) {
        zb0.b();
        this.f26735a = zb0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f26736b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26735a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f26737c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26735a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
