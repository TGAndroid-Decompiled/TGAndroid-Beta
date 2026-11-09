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
    public final int f33532a;
    public final org.telegram.ui.ActionBar.g6 f33533b;
    public final d0 f33534c;
    public int d;
    public boolean f33535e;
    public int f33536f;
    public final w5 h;
    public fi.u4 f33537n;

    public f0(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context);
        this.f33532a = i7;
        this.f33533b = g6Var;
        d0 d0Var = new d0(this, context, g6Var);
        this.f33534c = d0Var;
        d0Var.setOrientation(0);
        this.h = new w5(d0Var, 0L, 320L, xq.h);
        if (z9) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(d0Var);
            addView(horizontalScrollView, c8.ha.e(-1, -1, 119));
            return;
        }
        addView(d0Var, c8.ha.e(-1, -1, 119));
    }

    public final void a(int i7, String str, org.telegram.messenger.c20 c20Var) {
        d0 d0Var = this.f33534c;
        int childCount = d0Var.getChildCount();
        e0 e0Var = new e0(this.f33532a, getContext(), this.f33533b);
        e0Var.f33241c = this.d;
        e0Var.updateColors();
        e0Var.f33243f = false;
        e0Var.h.setImageResource(i7);
        e0Var.f33244n.setText(str);
        e0Var.setOnClickListener(new c0(c20Var, childCount, 0));
        d0Var.addView(e0Var, c8.ha.p(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.c20 c20Var) {
        int i7;
        e0 e0Var = new e0(this.f33532a, getContext(), this.f33533b);
        e0Var.f33242e = aiComposeTone;
        e0Var.f33241c = this.d;
        e0Var.updateColors();
        int i10 = 0;
        TextView textView = e0Var.f33244n;
        l9 l9Var = e0Var.h;
        if (aiComposeTone == null) {
            e0Var.d = false;
            e0Var.updateColors();
            String M0 = org.telegram.messenger.id.M0(2131754975, null);
            e0Var.f33243f = false;
            l9Var.setImageResource(2131232782);
            textView.setText(M0);
        } else if (aiComposeTone instanceof b0) {
            e0Var.d = false;
            e0Var.updateColors();
            String M02 = org.telegram.messenger.id.M0(2131754973, null);
            e0Var.f33243f = false;
            l9Var.setImageResource(2131231578);
            textView.setText(M02);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            e0Var.f33243f = true;
            l9Var.setColorFilter(null);
            l9Var.setImageDrawable(org.telegram.messenger.i6.g(null));
            textView.setText(str);
            int i11 = e0Var.f33239a;
            if (ConnectionsManager.getInstance(i11).isTestBackend()) {
                for (int i12 = 0; i12 < 4 && (!org.telegram.messenger.p10.i(i12).p() || ConnectionsManager.getInstance(i12).isTestBackend()); i12++) {
                }
            }
            l9Var.setAnimatedEmojiDrawable(new i5(9, i11, j3));
        }
        e0Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(19, c20Var, aiComposeTone));
        e0Var.setOnLongClickListener(new di.f2(1, this, e0Var));
        d0 d0Var = this.f33534c;
        if (d0Var.getOrientation() == 0) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        if (d0Var.getOrientation() != 1) {
            i10 = -1;
        }
        d0Var.addView(e0Var, c8.ha.p(i7, i10, 1.0f, 119));
    }

    public final void c(int i7) {
        if (this.f33536f == i7) {
            return;
        }
        this.f33536f = i7;
        d0 d0Var = this.f33534c;
        if (i7 >= 0 && i7 < d0Var.getChildCount()) {
            View childAt = d0Var.getChildAt(i7);
            if (childAt instanceof e0) {
                l9 l9Var = ((e0) childAt).h;
                if (l9Var.getAnimatedEmojiDrawable() != null) {
                    di.z2 z2Var = l9Var.getAnimatedEmojiDrawable().f34568k;
                    if (z2Var != null) {
                        z2Var.P0(false);
                    }
                } else {
                    l9Var.getImageReceiver().P0(false);
                }
            }
        }
        d0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i7 = 0;
        while (true) {
            d0 d0Var = this.f33534c;
            if (i7 < d0Var.getChildCount()) {
                View childAt = d0Var.getChildAt(i7);
                if ((childAt instanceof e0) && (aiComposeTone2 = ((e0) childAt).f33242e) != null && aiComposeTone2 == aiComposeTone) {
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
        if (this.f33535e) {
            Paint W0 = org.telegram.ui.ActionBar.l6.W0("paintDivider", this.f33533b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.l6.f27988k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(10.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(10.0f), getHeight(), W0);
        }
    }

    public int getSelectedTab() {
        return this.f33536f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i7 = this.f33536f;
        if (i7 >= 0) {
            d0 d0Var = this.f33534c;
            if (i7 < d0Var.getChildCount()) {
                View childAt = d0Var.getChildAt(this.f33536f);
                if (childAt instanceof e0) {
                    return ((e0) childAt).f33242e;
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
        this.f33535e = z9;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f33534c.setPadding(i7, i10, i11, i12);
    }

    public void setRoundRadius(int i7) {
        this.d = i7;
    }
}
