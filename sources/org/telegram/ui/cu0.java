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
public final class cu0 extends LinearLayout {
    public final TextView f36409a;
    public final TextView f36410b;
    public final FrameLayout f36411c;
    public final kg.h d;
    public final ks0 e;
    public boolean f36412f;
    public boolean h;
    public final PremiumPreviewFragment f36413n;

    public cu0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f36413n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36411c = frameLayout;
        int i13 = premiumPreviewFragment.f33706g0;
        if (i13 == 1) {
            i10 = 175;
        } else {
            i10 = 190;
        }
        addView(frameLayout, w7.b6.r(i10, i10, 1));
        boolean z10 = premiumPreviewFragment.f33707h0;
        if (i13 == 1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        kg.h hVar = new kg.h(this, context, z10 ? 1 : 0, i11, context);
        this.d = hVar;
        frameLayout.addView(hVar, w7.b6.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f36409a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        if (i13 == 1) {
            i12 = 8;
        } else {
            i12 = 20;
        }
        addView(textView, w7.b6.q(-2, -2, 0.0f, 1, 16, i12, 16, 0));
        TextView textView2 = new TextView(context);
        this.f36410b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, w7.b6.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        ks0 ks0Var = new ks0(this, context);
        this.e = ks0Var;
        ks0Var.setOverScrollMode(2);
        ks0Var.setLayoutManager(new s4.a0());
        ks0Var.setAdapter(new bu0(this, context));
        ks0Var.setOnItemClickListener(new g(this, 25));
        final Path path = new Path();
        final float[] fArr = new float[8];
        ks0Var.setSelectorTransformer(new q0.a() {
            @Override
            public final void accept(Object obj) {
                int b10;
                Canvas canvas = (Canvas) obj;
                ks0 ks0Var2 = cu0.this.e;
                View pressedChildView = ks0Var2.getPressedChildView();
                if (pressedChildView == null) {
                    b10 = -1;
                } else {
                    b10 = ks0Var2.T(pressedChildView).b();
                }
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = ks0Var2.getSelectorRect();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, org.telegram.messenger.i0.L(12.0f));
                }
                if (b10 == ks0Var2.getAdapter().b() - 1) {
                    Arrays.fill(fArr2, 4, 8, org.telegram.messenger.i0.L(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(ks0Var, w7.b6.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cu0.a():void");
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cu0.b():void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
