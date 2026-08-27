package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

public final class os implements jg.j {

    public final int f41159a;

    public final org.telegram.ui.Components.zk0 f41160b;

    public os(org.telegram.ui.Components.zk0 zk0Var, int i10) {
        this.f41159a = i10;
        this.f41160b = zk0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f41159a) {
        }
        return this.f41160b.drawChild(canvas, view, j10);
    }
}
