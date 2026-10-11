package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l20 extends LinearLayout {
    public final int f39524a = 0;
    public final Object f39525b;
    public final View f39526c;
    public final Object d;
    public final Object f39527e;

    public l20(Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.rm0 rm0Var) {
        super(context);
        this.d = new Paint(1);
        this.f39527e = new org.telegram.ui.Components.g6(this);
        this.f39525b = d6Var;
        this.f39526c = rm0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f39524a) {
            case 1:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f39527e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20766a7, (org.telegram.ui.ActionBar.d6) this.f39525b));
                org.telegram.ui.Components.rm0 rm0Var = (org.telegram.ui.Components.rm0) this.f39526c;
                float f7 = 1.0f;
                if (rm0Var != null) {
                    if (!rm0Var.canScrollVertically(1)) {
                        f7 = 0.0f;
                    }
                    paint.setAlpha((int) (g6Var.d(f7, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (g6Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public l20(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.x5.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f39525b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(context, null);
        this.f39526c = ea0Var;
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ea0Var.setGravity(1);
        addView(ea0Var, w7.x5.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39527e = frameLayout2;
        addView(frameLayout2, w7.x5.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public l20(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        yh.r6 r6Var = new yh.r6(context, 70, 0);
        frameLayout.addView(r6Var, w7.x5.d(-1.0f, -1));
        sg.n nVar = new sg.n(context, 1, 2);
        this.f39526c = nVar;
        sg.g gVar = nVar.f48202b;
        gVar.f48186z = org.telegram.ui.ActionBar.h6.fk;
        gVar.A = org.telegram.ui.ActionBar.h6.gk;
        gVar.b();
        nVar.setStarParticlesView(r6Var);
        frameLayout.addView(nVar, w7.x5.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
        nVar.setPaused(false);
        yh.d7 d7Var = new yh.d7(context, i10, d6Var);
        this.d = d7Var;
        w7.z5.a(d7Var);
        d7Var.setOnClickListener(new org.telegram.ui.Components.voip.p(this, 27));
        frameLayout.addView(d7Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 53));
        addView(frameLayout, w7.x5.d(150.0f, -1));
        TextView textView = new TextView(context);
        this.f39525b = textView;
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.h6.f20930j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        textView.setGravity(17);
        addView(textView, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.f39527e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        textView2.setGravity(17);
        addView(textView2, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
