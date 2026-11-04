package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
public final class ks0 extends LinearLayout {
    public final TextView f47007a;
    public final TextView f47008b;
    public final FrameLayout f47009c;
    public final ci.ic d;
    public final rq0 f47010e;
    public boolean f47011f;
    public boolean h;
    public final PremiumPreviewFragment f47012n;

    public ks0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        int i3;
        int i10;
        int i11;
        this.f47012n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47009c = frameLayout;
        int i12 = premiumPreviewFragment.f41644h0;
        if (i12 == 1) {
            i3 = 175;
        } else {
            i3 = 190;
        }
        addView(frameLayout, b8.mf.r(i3, i3, 1));
        boolean z10 = premiumPreviewFragment.f41645i0;
        if (i12 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ci.ic icVar = new ci.ic(this, context, z10 ? 1 : 0, i10, context);
        this.d = icVar;
        frameLayout.addView(icVar, b8.mf.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f47007a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        if (i12 == 1) {
            i11 = 8;
        } else {
            i11 = 20;
        }
        addView(textView, b8.mf.q(-2, -2, 0.0f, 1, 16, i11, 16, 0));
        TextView textView2 = new TextView(context);
        this.f47008b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, b8.mf.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        rq0 rq0Var = new rq0(this, context);
        this.f47010e = rq0Var;
        rq0Var.setOverScrollMode(2);
        rq0Var.setLayoutManager(new u4.b0());
        rq0Var.setAdapter(new js0(this, context));
        rq0Var.setOnItemClickListener(new h(this, 25));
        final Path path = new Path();
        final float[] fArr = new float[8];
        rq0Var.setSelectorTransformer(new q0.a() {
            @Override
            public final void accept(Object obj) {
                int b10;
                Canvas canvas = (Canvas) obj;
                rq0 rq0Var2 = ks0.this.f47010e;
                View pressedChildView = rq0Var2.getPressedChildView();
                if (pressedChildView == null) {
                    b10 = -1;
                } else {
                    b10 = rq0Var2.T(pressedChildView).b();
                }
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = rq0Var2.getSelectorRect();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, org.telegram.messenger.g0.L(12.0f));
                }
                if (b10 == rq0Var2.getAdapter().b() - 1) {
                    Arrays.fill(fArr2, 4, 8, org.telegram.messenger.g0.L(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(rq0Var, b8.mf.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ks0.a():void");
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ks0.b():void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
