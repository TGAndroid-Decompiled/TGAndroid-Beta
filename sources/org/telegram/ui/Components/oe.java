package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class oe implements Utilities.Callback0Return {
    public final int f29163a;
    public final Canvas f29164b;
    public final View f29165c;
    public final long d;
    public final FrameLayout f29166e;

    public oe(FrameLayout frameLayout, Canvas canvas, View view, long j3, int i10) {
        this.f29163a = i10;
        this.f29166e = frameLayout;
        this.f29164b = canvas;
        this.f29165c = view;
        this.d = j3;
    }

    @Override
    public final Object run() {
        switch (this.f29163a) {
            case 0:
                return pe.a((pe) this.f29166e, this.f29164b, this.f29165c, this.d);
            default:
                return ql0.a((ql0) this.f29166e, this.f29164b, this.f29165c, this.d);
        }
    }
}
