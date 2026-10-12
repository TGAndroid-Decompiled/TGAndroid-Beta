package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class oe implements Utilities.Callback0Return {
    public final int f29167a;
    public final Canvas f29168b;
    public final View f29169c;
    public final long d;
    public final FrameLayout f29170e;

    public oe(FrameLayout frameLayout, Canvas canvas, View view, long j3, int i10) {
        this.f29167a = i10;
        this.f29170e = frameLayout;
        this.f29168b = canvas;
        this.f29169c = view;
        this.d = j3;
    }

    @Override
    public final Object run() {
        switch (this.f29167a) {
            case 0:
                return pe.a((pe) this.f29170e, this.f29168b, this.f29169c, this.d);
            default:
                return ql0.a((ql0) this.f29170e, this.f29168b, this.f29169c, this.d);
        }
    }
}
