package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
public final class c0 extends FrameLayout {
    public final int f33437a;
    public final org.telegram.ui.ActionBar.e6 f33438b;
    public final a0 f33439c;
    public int d;
    public boolean f33440e;
    public int f33441f;
    public final u5 h;
    public hi.s4 f33442n;

    public c0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f33437a = i7;
        this.f33438b = e6Var;
        a0 a0Var = new a0(this, context, e6Var);
        this.f33439c = a0Var;
        a0Var.setOrientation(0);
        this.h = new u5(a0Var, 0L, 320L, er.h);
        if (z10) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(a0Var);
            addView(horizontalScrollView, c8.ja.e(-1, -1, 119));
            return;
        }
        addView(a0Var, c8.ja.e(-1, -1, 119));
    }

    public final void a(int i7, String str, org.telegram.messenger.z10 z10Var) {
        a0 a0Var = this.f33439c;
        int childCount = a0Var.getChildCount();
        b0 b0Var = new b0(this.f33437a, getContext(), this.f33438b);
        b0Var.f33115c = this.d;
        b0Var.updateColors();
        b0Var.f33117f = false;
        b0Var.h.setImageResource(i7);
        b0Var.f33118n.setText(str);
        b0Var.setOnClickListener(new bi.p2(z10Var, childCount, 1));
        a0Var.addView(b0Var, c8.ja.p(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.z10 z10Var) {
        int i7;
        b0 b0Var = new b0(this.f33437a, getContext(), this.f33438b);
        b0Var.f33116e = aiComposeTone;
        b0Var.f33115c = this.d;
        b0Var.updateColors();
        int i10 = 0;
        TextView textView = b0Var.f33118n;
        i9 i9Var = b0Var.h;
        if (aiComposeTone == null) {
            b0Var.d = false;
            b0Var.updateColors();
            String M0 = org.telegram.messenger.hd.M0(2131754975, null);
            b0Var.f33117f = false;
            i9Var.setImageResource(2131232783);
            textView.setText(M0);
        } else if (aiComposeTone instanceof z) {
            b0Var.d = false;
            b0Var.updateColors();
            String M02 = org.telegram.messenger.hd.M0(2131754973, null);
            b0Var.f33117f = false;
            i9Var.setImageResource(2131231578);
            textView.setText(M02);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            b0Var.f33117f = true;
            i9Var.setColorFilter(null);
            i9Var.setImageDrawable(org.telegram.messenger.j6.g(null));
            textView.setText(str);
            int i11 = b0Var.f33113a;
            if (ConnectionsManager.getInstance(i11).isTestBackend()) {
                for (int i12 = 0; i12 < 4 && (!org.telegram.messenger.m10.i(i12).p() || ConnectionsManager.getInstance(i12).isTestBackend()); i12++) {
                }
            }
            i9Var.setAnimatedEmojiDrawable(new g5(9, i11, j3));
        }
        b0Var.setOnClickListener(new org.telegram.messenger.video.e(26, z10Var, aiComposeTone));
        b0Var.setOnLongClickListener(new fi.b2(1, this, b0Var));
        a0 a0Var = this.f33439c;
        if (a0Var.getOrientation() == 0) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        if (a0Var.getOrientation() != 1) {
            i10 = -1;
        }
        a0Var.addView(b0Var, c8.ja.p(i7, i10, 1.0f, 119));
    }

    public final void c(int i7) {
        if (this.f33441f == i7) {
            return;
        }
        this.f33441f = i7;
        a0 a0Var = this.f33439c;
        if (i7 >= 0 && i7 < a0Var.getChildCount()) {
            View childAt = a0Var.getChildAt(i7);
            if (childAt instanceof b0) {
                i9 i9Var = ((b0) childAt).h;
                if (i9Var.getAnimatedEmojiDrawable() != null) {
                    fi.u2 u2Var = i9Var.getAnimatedEmojiDrawable().f34809k;
                    if (u2Var != null) {
                        u2Var.P0(false);
                    }
                } else {
                    i9Var.getImageReceiver().P0(false);
                }
            }
        }
        a0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i7 = 0;
        while (true) {
            a0 a0Var = this.f33439c;
            if (i7 < a0Var.getChildCount()) {
                View childAt = a0Var.getChildAt(i7);
                if ((childAt instanceof b0) && (aiComposeTone2 = ((b0) childAt).f33116e) != null && aiComposeTone2 == aiComposeTone) {
                    c(i7);
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f33440e) {
            Paint W0 = org.telegram.ui.ActionBar.j6.W0("paintDivider", this.f33438b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(10.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(10.0f), getHeight(), W0);
        }
    }

    public int getSelectedTab() {
        return this.f33441f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i7 = this.f33441f;
        if (i7 >= 0) {
            a0 a0Var = this.f33439c;
            if (i7 < a0Var.getChildCount()) {
                View childAt = a0Var.getChildAt(this.f33441f);
                if (childAt instanceof b0) {
                    return ((b0) childAt).f33116e;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setDivider(boolean z10) {
        this.f33440e = z10;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f33439c.setPadding(i7, i10, i11, i12);
    }

    public void setRoundRadius(int i7) {
        this.d = i7;
    }
}
