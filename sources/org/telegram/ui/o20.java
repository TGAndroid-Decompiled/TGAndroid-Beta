package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o20 extends LinearLayout {
    public final int f39084a = 0;
    public final Object f39085b;
    public final View f39086c;
    public final Object d;
    public final Object f39087e;

    public o20(Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.zl0 zl0Var) {
        super(context);
        this.d = new Paint(1);
        this.f39087e = new org.telegram.ui.Components.e6(this);
        this.f39085b = d6Var;
        this.f39086c = zl0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f39084a) {
            case 1:
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.f39087e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20771a7, (org.telegram.ui.ActionBar.d6) this.f39085b));
                org.telegram.ui.Components.zl0 zl0Var = (org.telegram.ui.Components.zl0) this.f39086c;
                float f7 = 1.0f;
                if (zl0Var != null) {
                    if (!zl0Var.canScrollVertically(1)) {
                        f7 = 0.0f;
                    }
                    paint.setAlpha((int) (e6Var.d(f7, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (e6Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public o20(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.z5.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f39085b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.z5.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(context, null);
        this.f39086c = q90Var;
        q90Var.setTextSize(1, 14.0f);
        q90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        q90Var.setGravity(1);
        addView(q90Var, w7.z5.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39087e = frameLayout2;
        addView(frameLayout2, w7.z5.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public o20(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        yh.c7 c7Var = new yh.c7(context, 70, 0);
        frameLayout.addView(c7Var, w7.z5.c(-1.0f, -1));
        sg.e eVar = new sg.e(context, 1, 2);
        this.f39086c = eVar;
        sg.a aVar = eVar.f46827b;
        aVar.f46815w = org.telegram.ui.ActionBar.i6.fk;
        aVar.f46816x = org.telegram.ui.ActionBar.i6.gk;
        aVar.b();
        eVar.setStarParticlesView(c7Var);
        frameLayout.addView(eVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        eVar.setPaused(false);
        yh.m7 m7Var = new yh.m7(context, i10, d6Var);
        this.d = m7Var;
        w7.b6.a(m7Var);
        m7Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 27));
        frameLayout.addView(m7Var, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.z5.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.f39085b = textView;
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.i6.f20935j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        textView.setGravity(17);
        addView(textView, w7.z5.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.f39087e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        textView2.setGravity(17);
        addView(textView2, w7.z5.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
