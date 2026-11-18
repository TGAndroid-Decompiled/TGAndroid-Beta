package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_aicompose;
public final class l0 extends FrameLayout {
    public final int f36935a;
    public final org.telegram.ui.ActionBar.i6 f36936b;
    public final j0 f36937c;
    public final FrameLayout d;
    public int f36938e;
    public boolean f36939f;
    public int h;
    public final c6 f36940n;
    public int f36941r;
    public final c6 f36942s;
    public hi.q4 f36943w;

    public l0(Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f36941r = -1;
        this.f36935a = i7;
        this.f36936b = i6Var;
        j0 j0Var = new j0(this, context, i6Var);
        this.f36937c = j0Var;
        j0Var.setOrientation(i10);
        lr lrVar = lr.h;
        this.f36940n = new c6(j0Var, 0L, 320L, lrVar);
        this.f36942s = new c6(j0Var, 0L, 320L, lrVar);
        if (z10) {
            if (i10 == 0) {
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                this.d = horizontalScrollView;
                horizontalScrollView.setFillViewport(true);
            } else {
                ScrollView scrollView = new ScrollView(context);
                this.d = scrollView;
                scrollView.setFillViewport(true);
            }
            this.d.addView(j0Var);
            addView(this.d, c8.ma.e(-1, -1, 119));
            return;
        }
        this.d = null;
        addView(j0Var, c8.ma.e(-1, -1, 119));
    }

    public final void a(int i7, String str, org.telegram.messenger.x10 x10Var) {
        int i10;
        j0 j0Var = this.f36937c;
        int childCount = j0Var.getChildCount();
        k0 k0Var = new k0(this.f36935a, getContext(), this.f36936b);
        k0Var.f36590c = this.f36938e;
        k0Var.updateColors();
        int i11 = 0;
        k0Var.f36592f = false;
        k0Var.h.setImageResource(i7);
        k0Var.f36593n.setText(str);
        k0Var.setOnClickListener(new ci.q(x10Var, childCount, 9));
        if (j0Var.getOrientation() == 0) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (j0Var.getOrientation() != 1) {
            i11 = -1;
        }
        j0Var.addView(k0Var, c8.ma.p(i10, i11, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.x10 x10Var) {
        int i7;
        k0 k0Var = new k0(this.f36935a, getContext(), this.f36936b);
        k0Var.f36591e = aiComposeTone;
        k0Var.f36590c = this.f36938e;
        k0Var.updateColors();
        int i10 = 0;
        TextView textView = k0Var.f36593n;
        q9 q9Var = k0Var.h;
        if (aiComposeTone == null) {
            k0Var.d = false;
            k0Var.updateColors();
            String M0 = org.telegram.messenger.gd.M0(2131754975, null);
            k0Var.f36592f = false;
            q9Var.setImageResource(2131232784);
            textView.setText(M0);
        } else if (aiComposeTone instanceof i0) {
            k0Var.d = false;
            k0Var.updateColors();
            String M02 = org.telegram.messenger.gd.M0(2131754973, null);
            k0Var.f36592f = false;
            q9Var.setImageResource(2131231579);
            textView.setText(M02);
        } else {
            k0Var.a(null, aiComposeTone.title, Long.valueOf(aiComposeTone.emoji_id));
        }
        k0Var.setOnClickListener(new ni.b(22, x10Var, aiComposeTone));
        k0Var.setOnLongClickListener(new fi.z1(1, this, k0Var));
        j0 j0Var = this.f36937c;
        if (j0Var.getOrientation() == 0) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        if (j0Var.getOrientation() != 1) {
            i10 = -1;
        }
        j0Var.addView(k0Var, c8.ma.p(i7, i10, 1.0f, 119));
    }

    public final void c(int i7, boolean z10) {
        float f10;
        int i10 = this.h;
        if (i10 == i7) {
            return;
        }
        this.h = i7;
        c6 c6Var = this.f36940n;
        c6 c6Var2 = this.f36942s;
        if (i7 >= 0) {
            if (i10 < 0 && c6Var2.f33892c < 0.01f) {
                c6Var.e(true, i7);
            }
            this.f36941r = i7;
        }
        if (!z10) {
            int i11 = this.h;
            if (i11 < 0) {
                i11 = this.f36941r;
            }
            c6Var.e(true, i11);
            if (this.h >= 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            c6Var2.e(true, f10);
        }
        j0 j0Var = this.f36937c;
        if (i7 >= 0 && i7 < j0Var.getChildCount()) {
            View childAt = j0Var.getChildAt(i7);
            if (childAt instanceof k0) {
                q9 q9Var = ((k0) childAt).h;
                if (q9Var.getAnimatedEmojiDrawable() != null) {
                    fi.s2 s2Var = q9Var.getAnimatedEmojiDrawable().f37976k;
                    if (s2Var != null) {
                        s2Var.P0(false);
                    }
                } else {
                    q9Var.getImageReceiver().P0(false);
                }
            }
        }
        j0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone, boolean z10) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i7 = 0;
        while (true) {
            j0 j0Var = this.f36937c;
            if (i7 < j0Var.getChildCount()) {
                View childAt = j0Var.getChildAt(i7);
                if ((childAt instanceof k0) && (aiComposeTone2 = ((k0) childAt).f36591e) != null && aiComposeTone2 == aiComposeTone) {
                    c(i7, z10);
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
        if (this.f36939f) {
            Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintDivider", this.f36936b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.n6.f29517k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(10.0f), getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(10.0f), getHeight(), W0);
        }
    }

    public int getSelectedTab() {
        return this.h;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i7 = this.h;
        if (i7 >= 0) {
            j0 j0Var = this.f36937c;
            if (i7 < j0Var.getChildCount()) {
                View childAt = j0Var.getChildAt(this.h);
                if (childAt instanceof k0) {
                    return ((k0) childAt).f36591e;
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
        this.f36939f = z10;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f36937c.setPadding(i7, i10, i11, i12);
    }

    public void setRoundRadius(int i7) {
        this.f36938e = i7;
    }
}
