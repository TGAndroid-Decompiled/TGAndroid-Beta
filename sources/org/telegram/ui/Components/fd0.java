package org.telegram.ui.Components;

import android.graphics.RuntimeShader;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class fd0 {
    public final RuntimeShader f26391a;
    public final float[] f26392b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] f26393c = {1.0f, 1.0f, 0.0f, 0.0f};

    public fd0(int i10) {
        ed0.b();
        this.f26391a = ed0.a(AndroidUtilities.readRes(i10));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.f26392b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26391a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.f26393c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.f26391a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
