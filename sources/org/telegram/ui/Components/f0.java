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
public final class f0 extends FrameLayout {
    public final int f25900a;
    public final org.telegram.ui.ActionBar.p6 f25901b;
    public final d0 f25902c;
    public int d;
    public boolean e;
    public int f25903f;
    public final t5 h;
    public i f25904n;

    public f0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.f25900a = i10;
        this.f25901b = p6Var;
        d0 d0Var = new d0(this, context, p6Var);
        this.f25902c = d0Var;
        d0Var.setOrientation(0);
        this.h = new t5(d0Var, 0L, 320L, gr.h);
        if (z10) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(d0Var);
            addView(horizontalScrollView, w7.b6.e(-1, -1, 119));
            return;
        }
        addView(d0Var, w7.b6.e(-1, -1, 119));
    }

    public final void a(int i10, String str, org.telegram.messenger.q20 q20Var) {
        d0 d0Var = this.f25902c;
        int childCount = d0Var.getChildCount();
        e0 e0Var = new e0(this.f25900a, getContext(), this.f25901b);
        e0Var.f25578c = this.d;
        e0Var.updateColors();
        e0Var.f25579f = false;
        e0Var.h.setImageResource(i10);
        e0Var.f25580n.setText(str);
        e0Var.setOnClickListener(new c0(childCount, 0, q20Var));
        d0Var.addView(e0Var, w7.b6.p(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.q20 q20Var) {
        int i10;
        e0 e0Var = new e0(this.f25900a, getContext(), this.f25901b);
        e0Var.e = aiComposeTone;
        e0Var.f25578c = this.d;
        e0Var.updateColors();
        int i11 = 0;
        TextView textView = e0Var.f25580n;
        g9 g9Var = e0Var.h;
        if (aiComposeTone == null) {
            e0Var.d = false;
            e0Var.updateColors();
            String L0 = org.telegram.messenger.cd.L0(2131754975, null);
            e0Var.f25579f = false;
            g9Var.setImageResource(2131232779);
            textView.setText(L0);
        } else if (aiComposeTone instanceof a0) {
            e0Var.d = false;
            e0Var.updateColors();
            String L02 = org.telegram.messenger.cd.L0(2131754973, null);
            e0Var.f25579f = false;
            g9Var.setImageResource(2131231579);
            textView.setText(L02);
        } else {
            String str = aiComposeTone.title;
            long j10 = aiComposeTone.emoji_id;
            e0Var.f25579f = true;
            g9Var.setColorFilter(null);
            g9Var.setImageDrawable(org.telegram.messenger.k6.g(null));
            textView.setText(str);
            int i12 = e0Var.f25576a;
            if (ConnectionsManager.getInstance(i12).isTestBackend()) {
                for (int i13 = 0; i13 < 4 && (!org.telegram.messenger.d20.i(i13).p() || ConnectionsManager.getInstance(i13).isTestBackend()); i13++) {
                }
            }
            g9Var.setAnimatedEmojiDrawable(new f5(9, i12, j10));
        }
        e0Var.setOnClickListener(new org.telegram.ui.ud(11, q20Var, aiComposeTone));
        e0Var.setOnLongClickListener(new b0(0, this, e0Var));
        d0 d0Var = this.f25902c;
        if (d0Var.getOrientation() == 0) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (d0Var.getOrientation() != 1) {
            i11 = -1;
        }
        d0Var.addView(e0Var, w7.b6.p(i10, i11, 1.0f, 119));
    }

    public final void c(int i10) {
        if (this.f25903f == i10) {
            return;
        }
        this.f25903f = i10;
        d0 d0Var = this.f25902c;
        if (i10 >= 0 && i10 < d0Var.getChildCount()) {
            View childAt = d0Var.getChildAt(i10);
            if (childAt instanceof e0) {
                g9 g9Var = ((e0) childAt).h;
                if (g9Var.getAnimatedEmojiDrawable() != null) {
                    ag.c2 c2Var = g9Var.getAnimatedEmojiDrawable().f25975k;
                    if (c2Var != null) {
                        c2Var.P0(false);
                    }
                } else {
                    g9Var.getImageReceiver().P0(false);
                }
            }
        }
        d0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i10 = 0;
        while (true) {
            d0 d0Var = this.f25902c;
            if (i10 < d0Var.getChildCount()) {
                View childAt = d0Var.getChildAt(i10);
                if ((childAt instanceof e0) && (aiComposeTone2 = ((e0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
                    c(i10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            Paint W0 = org.telegram.ui.ActionBar.t6.W0("paintDivider", this.f25901b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.t6.f21052k0;
            }
            canvas.drawRect(org.telegram.messenger.i0.L(10.0f), getHeight() - 1, getWidth() - org.telegram.messenger.i0.L(10.0f), getHeight(), W0);
        }
    }

    public int getSelectedTab() {
        return this.f25903f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i10 = this.f25903f;
        if (i10 >= 0) {
            d0 d0Var = this.f25902c;
            if (i10 < d0Var.getChildCount()) {
                View childAt = d0Var.getChildAt(this.f25903f);
                if (childAt instanceof e0) {
                    return ((e0) childAt).e;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.e = z10;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f25902c.setPadding(i10, i11, i12, i13);
    }

    public void setRoundRadius(int i10) {
        this.d = i10;
    }
}
