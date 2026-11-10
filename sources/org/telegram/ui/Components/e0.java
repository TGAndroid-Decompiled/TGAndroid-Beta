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
public final class e0 extends FrameLayout {
    public final int f33112a;
    public final org.telegram.ui.ActionBar.h6 f33113b;
    public final c0 f33114c;
    public int d;
    public boolean f33115e;
    public int f33116f;
    public final v5 h;
    public fi.u4 f33117n;

    public e0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context);
        this.f33112a = i7;
        this.f33113b = h6Var;
        c0 c0Var = new c0(this, context, h6Var);
        this.f33114c = c0Var;
        c0Var.setOrientation(0);
        this.h = new v5(c0Var, 0L, 320L, wq.h);
        if (z9) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(c0Var);
            addView(horizontalScrollView, c8.ha.e(-1, -1, 119));
            return;
        }
        addView(c0Var, c8.ha.e(-1, -1, 119));
    }

    public final void a(int i7, String str, org.telegram.messenger.c20 c20Var) {
        c0 c0Var = this.f33114c;
        int childCount = c0Var.getChildCount();
        d0 d0Var = new d0(this.f33112a, getContext(), this.f33113b);
        d0Var.f32837c = this.d;
        d0Var.updateColors();
        d0Var.f32839f = false;
        d0Var.h.setImageResource(i7);
        d0Var.f32840n.setText(str);
        d0Var.setOnClickListener(new b0(c20Var, childCount, 0));
        c0Var.addView(d0Var, c8.ha.p(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.c20 c20Var) {
        int i7;
        d0 d0Var = new d0(this.f33112a, getContext(), this.f33113b);
        d0Var.f32838e = aiComposeTone;
        d0Var.f32837c = this.d;
        d0Var.updateColors();
        int i10 = 0;
        TextView textView = d0Var.f32840n;
        k9 k9Var = d0Var.h;
        if (aiComposeTone == null) {
            d0Var.d = false;
            d0Var.updateColors();
            String M0 = org.telegram.messenger.id.M0(2131754975, null);
            d0Var.f32839f = false;
            k9Var.setImageResource(2131232782);
            textView.setText(M0);
        } else if (aiComposeTone instanceof a0) {
            d0Var.d = false;
            d0Var.updateColors();
            String M02 = org.telegram.messenger.id.M0(2131754973, null);
            d0Var.f32839f = false;
            k9Var.setImageResource(2131231578);
            textView.setText(M02);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            d0Var.f32839f = true;
            k9Var.setColorFilter(null);
            k9Var.setImageDrawable(org.telegram.messenger.i6.g(null));
            textView.setText(str);
            int i11 = d0Var.f32835a;
            if (ConnectionsManager.getInstance(i11).isTestBackend()) {
                for (int i12 = 0; i12 < 4 && (!org.telegram.messenger.p10.i(i12).p() || ConnectionsManager.getInstance(i12).isTestBackend()); i12++) {
                }
            }
            k9Var.setAnimatedEmojiDrawable(new h5(9, i11, j3));
        }
        d0Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(19, c20Var, aiComposeTone));
        d0Var.setOnLongClickListener(new di.f2(1, this, d0Var));
        c0 c0Var = this.f33114c;
        if (c0Var.getOrientation() == 0) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        if (c0Var.getOrientation() != 1) {
            i10 = -1;
        }
        c0Var.addView(d0Var, c8.ha.p(i7, i10, 1.0f, 119));
    }

    public final void c(int i7) {
        if (this.f33116f == i7) {
            return;
        }
        this.f33116f = i7;
        c0 c0Var = this.f33114c;
        if (i7 >= 0 && i7 < c0Var.getChildCount()) {
            View childAt = c0Var.getChildAt(i7);
            if (childAt instanceof d0) {
                k9 k9Var = ((d0) childAt).h;
                if (k9Var.getAnimatedEmojiDrawable() != null) {
                    di.z2 z2Var = k9Var.getAnimatedEmojiDrawable().f34176k;
                    if (z2Var != null) {
                        z2Var.P0(false);
                    }
                } else {
                    k9Var.getImageReceiver().P0(false);
                }
            }
        }
        c0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i7 = 0;
        while (true) {
            c0 c0Var = this.f33114c;
            if (i7 < c0Var.getChildCount()) {
                View childAt = c0Var.getChildAt(i7);
                if ((childAt instanceof d0) && (aiComposeTone2 = ((d0) childAt).f32838e) != null && aiComposeTone2 == aiComposeTone) {
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
        if (this.f33115e) {
            Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", this.f33113b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.m6.f28013k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(10.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(10.0f), getHeight(), W0);
        }
    }

    public int getSelectedTab() {
        return this.f33116f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i7 = this.f33116f;
        if (i7 >= 0) {
            c0 c0Var = this.f33114c;
            if (i7 < c0Var.getChildCount()) {
                View childAt = c0Var.getChildAt(this.f33116f);
                if (childAt instanceof d0) {
                    return ((d0) childAt).f32838e;
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

    public void setDivider(boolean z9) {
        this.f33115e = z9;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f33114c.setPadding(i7, i10, i11, i12);
    }

    public void setRoundRadius(int i7) {
        this.d = i7;
    }
}
