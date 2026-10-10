package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class m20 extends LinearLayout {
    public final int f39790a = 0;
    public final Object f39791b;
    public final View f39792c;
    public final Object d;
    public final Object f39793e;

    public m20(Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.rm0 rm0Var) {
        super(context);
        this.d = new Paint(1);
        this.f39793e = new org.telegram.ui.Components.g6(this);
        this.f39791b = e6Var;
        this.f39792c = rm0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f39790a) {
            case 1:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f39793e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20745a7, (org.telegram.ui.ActionBar.e6) this.f39791b));
                org.telegram.ui.Components.rm0 rm0Var = (org.telegram.ui.Components.rm0) this.f39792c;
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

    public m20(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.x5.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f39791b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(context, null);
        this.f39792c = fa0Var;
        fa0Var.setTextSize(1, 14.0f);
        fa0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        fa0Var.setGravity(1);
        addView(fa0Var, w7.x5.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39793e = frameLayout2;
        addView(frameLayout2, w7.x5.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public m20(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        yh.r6 r6Var = new yh.r6(context, 70, 0);
        frameLayout.addView(r6Var, w7.x5.d(-1.0f, -1));
        sg.n nVar = new sg.n(context, 1, 2);
        this.f39792c = nVar;
        sg.g gVar = nVar.f48122b;
        gVar.f48106z = org.telegram.ui.ActionBar.i6.fk;
        gVar.A = org.telegram.ui.ActionBar.i6.gk;
        gVar.b();
        nVar.setStarParticlesView(r6Var);
        frameLayout.addView(nVar, w7.x5.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
        nVar.setPaused(false);
        yh.d7 d7Var = new yh.d7(context, i10, e6Var);
        this.d = d7Var;
        w7.z5.a(d7Var);
        d7Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 27));
        frameLayout.addView(d7Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 53));
        addView(frameLayout, w7.x5.d(150.0f, -1));
        TextView textView = new TextView(context);
        this.f39791b = textView;
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.i6.f20909j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        textView.setGravity(17);
        addView(textView, w7.x5.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.f39793e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        textView2.setGravity(17);
        addView(textView2, w7.x5.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
