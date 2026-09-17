package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class q20 extends LinearLayout {
    public final int f36778a = 0;
    public final Object f36779b;
    public final View f36780c;
    public final Object d;
    public final Object e;

    public q20(Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ml0 ml0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new org.telegram.ui.Components.c6(this);
        this.f36779b = f6Var;
        this.f36780c = ml0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36778a) {
            case 1:
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18806a7, (org.telegram.ui.ActionBar.f6) this.f36779b));
                org.telegram.ui.Components.ml0 ml0Var = (org.telegram.ui.Components.ml0) this.f36780c;
                float f7 = 1.0f;
                if (ml0Var != null) {
                    if (!ml0Var.canScrollVertically(1)) {
                        f7 = 0.0f;
                    }
                    paint.setAlpha((int) (c6Var.d(f7, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (c6Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public q20(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.x5.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f36779b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(context, null);
        this.f36780c = c90Var;
        c90Var.setTextSize(1, 14.0f);
        c90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        c90Var.setGravity(1);
        addView(c90Var, w7.x5.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, w7.x5.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public q20(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        yh.a7 a7Var = new yh.a7(context, 70, 0);
        frameLayout.addView(a7Var, w7.x5.c(-1.0f, -1));
        sg.e eVar = new sg.e(context, 1, 2);
        this.f36780c = eVar;
        sg.a aVar = eVar.f42959b;
        aVar.f42947w = org.telegram.ui.ActionBar.j6.fk;
        aVar.f42948x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        eVar.setStarParticlesView(a7Var);
        frameLayout.addView(eVar, w7.x5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        eVar.setPaused(false);
        yh.m7 m7Var = new yh.m7(context, i10, f6Var);
        this.d = m7Var;
        w7.z5.a(m7Var);
        m7Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 27));
        frameLayout.addView(m7Var, w7.x5.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.x5.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.f36779b = textView;
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.j6.f18969j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setGravity(17);
        addView(textView, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setGravity(17);
        addView(textView2, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
