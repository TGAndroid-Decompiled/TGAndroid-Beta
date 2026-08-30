package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class da implements View.OnAttachStateChangeListener {
    public final int f24212a;
    public final Object f24213b;
    public final Object f24214c;

    public da(int i10, Object obj, Object obj2) {
        this.f24212a = i10;
        this.f24214c = obj;
        this.f24213b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f24212a;
        Object obj = this.f24213b;
        Object obj2 = this.f24214c;
        switch (i10) {
            case 0:
                ba baVar = (ba) obj;
                if (baVar != null) {
                    baVar.d.add((fa) obj2);
                    return;
                }
                return;
            default:
                k01 k01Var = (k01) obj2;
                k01Var.f26089k = u5.update(k01Var.f26090l, (View) obj, k01Var.f26089k, k01Var.f26083b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f24212a) {
            case 0:
                fa faVar = (fa) this.f24214c;
                ba baVar = (ba) this.f24213b;
                if (baVar != null) {
                    ArrayList arrayList = baVar.d;
                    arrayList.remove(faVar);
                    if (baVar.e.isEmpty() && arrayList.isEmpty()) {
                        baVar.f23617n.a();
                    }
                }
                faVar.f24837n = null;
                Paint paint = faVar.h;
                faVar.f24838o = null;
                paint.setShader(null);
                return;
            default:
                u5.release((View) this.f24213b, ((k01) this.f24214c).f26089k);
                return;
        }
    }
}
