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
public final class d0 extends FrameLayout {
    public final int f32874a;
    public final org.telegram.ui.ActionBar.e6 f32875b;
    public final b0 f32876c;
    public int d;
    public boolean f32877e;
    public int f32878f;
    public final u5 h;
    public gi.s4 f32879n;

    public d0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f32874a = i3;
        this.f32875b = e6Var;
        b0 b0Var = new b0(this, context, e6Var);
        this.f32876c = b0Var;
        b0Var.setOrientation(0);
        this.h = new u5(b0Var, 0L, 320L, xq.h);
        if (z10) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(b0Var);
            addView(horizontalScrollView, b8.mf.e(-1, -1, 119));
            return;
        }
        addView(b0Var, b8.mf.e(-1, -1, 119));
    }

    public final void a(int i3, String str, org.telegram.messenger.u10 u10Var) {
        b0 b0Var = this.f32876c;
        int childCount = b0Var.getChildCount();
        c0 c0Var = new c0(this.f32874a, getContext(), this.f32875b);
        c0Var.f32487c = this.d;
        c0Var.updateColors();
        c0Var.f32489f = false;
        c0Var.h.setImageResource(i3);
        c0Var.f32490n.setText(str);
        c0Var.setOnClickListener(new ai.y2(childCount, 1, u10Var));
        b0Var.addView(c0Var, b8.mf.p(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.u10 u10Var) {
        int i3;
        c0 c0Var = new c0(this.f32874a, getContext(), this.f32875b);
        c0Var.f32488e = aiComposeTone;
        c0Var.f32487c = this.d;
        c0Var.updateColors();
        int i10 = 0;
        TextView textView = c0Var.f32490n;
        k9 k9Var = c0Var.h;
        if (aiComposeTone == null) {
            c0Var.d = false;
            c0Var.updateColors();
            String M0 = org.telegram.messenger.bd.M0(2131754975, null);
            c0Var.f32489f = false;
            k9Var.setImageResource(2131232780);
            textView.setText(M0);
        } else if (aiComposeTone instanceof a0) {
            c0Var.d = false;
            c0Var.updateColors();
            String M02 = org.telegram.messenger.bd.M0(2131754973, null);
            c0Var.f32489f = false;
            k9Var.setImageResource(2131231578);
            textView.setText(M02);
        } else {
            String str = aiComposeTone.title;
            long j10 = aiComposeTone.emoji_id;
            c0Var.f32489f = true;
            k9Var.setColorFilter(null);
            k9Var.setImageDrawable(org.telegram.messenger.i6.g(null));
            textView.setText(str);
            int i11 = c0Var.f32485a;
            if (ConnectionsManager.getInstance(i11).isTestBackend()) {
                for (int i12 = 0; i12 < 4 && (!org.telegram.messenger.h10.i(i12).p() || ConnectionsManager.getInstance(i12).isTestBackend()); i12++) {
                }
            }
            k9Var.setAnimatedEmojiDrawable(new g5(9, i11, j10));
        }
        c0Var.setOnClickListener(new org.telegram.messenger.video.g(25, u10Var, aiComposeTone));
        c0Var.setOnLongClickListener(new ei.j2(1, this, c0Var));
        b0 b0Var = this.f32876c;
        if (b0Var.getOrientation() == 0) {
            i3 = 0;
        } else {
            i3 = -1;
        }
        if (b0Var.getOrientation() != 1) {
            i10 = -1;
        }
        b0Var.addView(c0Var, b8.mf.p(i3, i10, 1.0f, 119));
    }

    public final void c(int i3) {
        if (this.f32878f == i3) {
            return;
        }
        this.f32878f = i3;
        b0 b0Var = this.f32876c;
        if (i3 >= 0 && i3 < b0Var.getChildCount()) {
            View childAt = b0Var.getChildAt(i3);
            if (childAt instanceof c0) {
                k9 k9Var = ((c0) childAt).h;
                if (k9Var.getAnimatedEmojiDrawable() != null) {
                    ei.c3 c3Var = k9Var.getAnimatedEmojiDrawable().f33971k;
                    if (c3Var != null) {
                        c3Var.P0(false);
                    }
                } else {
                    k9Var.getImageReceiver().P0(false);
                }
            }
        }
        b0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i3 = 0;
        while (true) {
            b0 b0Var = this.f32876c;
            if (i3 < b0Var.getChildCount()) {
                View childAt = b0Var.getChildAt(i3);
                if ((childAt instanceof c0) && (aiComposeTone2 = ((c0) childAt).f32488e) != null && aiComposeTone2 == aiComposeTone) {
                    c(i3);
                    return;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f32877e) {
            Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", this.f32875b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(10.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(10.0f), getHeight(), W0);
        }
    }

    public int getSelectedTab() {
        return this.f32878f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i3 = this.f32878f;
        if (i3 >= 0) {
            b0 b0Var = this.f32876c;
            if (i3 < b0Var.getChildCount()) {
                View childAt = b0Var.getChildAt(this.f32878f);
                if (childAt instanceof c0) {
                    return ((c0) childAt).f32488e;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    public void setDivider(boolean z10) {
        this.f32877e = z10;
    }

    @Override
    public final void setPadding(int i3, int i10, int i11, int i12) {
        this.f32876c.setPadding(i3, i10, i11, i12);
    }

    public void setRoundRadius(int i3) {
        this.d = i3;
    }
}
