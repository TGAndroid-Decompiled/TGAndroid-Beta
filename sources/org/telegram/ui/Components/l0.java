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
    public final int f36956a;
    public final org.telegram.ui.ActionBar.i6 f36957b;
    public final j0 f36958c;
    public final FrameLayout d;
    public int f36959e;
    public boolean f36960f;
    public int h;
    public final c6 f36961n;
    public int f36962r;
    public final c6 f36963s;
    public hi.b5 f36964w;

    public l0(Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f36962r = -1;
        this.f36956a = i7;
        this.f36957b = i6Var;
        j0 j0Var = new j0(this, context, i6Var);
        this.f36958c = j0Var;
        j0Var.setOrientation(i10);
        kr krVar = kr.h;
        this.f36961n = new c6(j0Var, 0L, 320L, krVar);
        this.f36963s = new c6(j0Var, 0L, 320L, krVar);
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
            addView(this.d, c8.na.e(-1, -1, 119));
            return;
        }
        this.d = null;
        addView(j0Var, c8.na.e(-1, -1, 119));
    }

    public final void a(int i7, String str, org.telegram.messenger.w10 w10Var) {
        int i10;
        j0 j0Var = this.f36958c;
        int childCount = j0Var.getChildCount();
        k0 k0Var = new k0(this.f36956a, getContext(), this.f36957b);
        k0Var.f36576c = this.f36959e;
        k0Var.updateColors();
        int i11 = 0;
        k0Var.f36578f = false;
        k0Var.h.setImageResource(i7);
        k0Var.f36579n.setText(str);
        k0Var.setOnClickListener(new ci.q(w10Var, childCount, 9));
        if (j0Var.getOrientation() == 0) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (j0Var.getOrientation() != 1) {
            i11 = -1;
        }
        j0Var.addView(k0Var, c8.na.p(i10, i11, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.w10 w10Var) {
        int i7;
        k0 k0Var = new k0(this.f36956a, getContext(), this.f36957b);
        k0Var.f36577e = aiComposeTone;
        k0Var.f36576c = this.f36959e;
        k0Var.updateColors();
        int i10 = 0;
        TextView textView = k0Var.f36579n;
        p9 p9Var = k0Var.h;
        if (aiComposeTone == null) {
            k0Var.d = false;
            k0Var.updateColors();
            String N0 = org.telegram.messenger.gd.N0(2131754975, null);
            k0Var.f36578f = false;
            p9Var.setImageResource(2131232787);
            textView.setText(N0);
        } else if (aiComposeTone instanceof i0) {
            k0Var.d = false;
            k0Var.updateColors();
            String N02 = org.telegram.messenger.gd.N0(2131754973, null);
            k0Var.f36578f = false;
            p9Var.setImageResource(2131231582);
            textView.setText(N02);
        } else {
            k0Var.a(null, aiComposeTone.title, Long.valueOf(aiComposeTone.emoji_id));
        }
        k0Var.setOnClickListener(new oi.i1(21, w10Var, aiComposeTone));
        k0Var.setOnLongClickListener(new fi.z1(1, this, k0Var));
        j0 j0Var = this.f36958c;
        if (j0Var.getOrientation() == 0) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        if (j0Var.getOrientation() != 1) {
            i10 = -1;
        }
        j0Var.addView(k0Var, c8.na.p(i7, i10, 1.0f, 119));
    }

    public final void c(int i7, boolean z10) {
        float f10;
        int i10 = this.h;
        if (i10 == i7) {
            return;
        }
        this.h = i7;
        c6 c6Var = this.f36961n;
        c6 c6Var2 = this.f36963s;
        if (i7 >= 0) {
            if (i10 < 0 && c6Var2.f33931c < 0.01f) {
                c6Var.e(true, i7);
            }
            this.f36962r = i7;
        }
        if (!z10) {
            int i11 = this.h;
            if (i11 < 0) {
                i11 = this.f36962r;
            }
            c6Var.e(true, i11);
            if (this.h >= 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            c6Var2.e(true, f10);
        }
        j0 j0Var = this.f36958c;
        if (i7 >= 0 && i7 < j0Var.getChildCount()) {
            View childAt = j0Var.getChildAt(i7);
            if (childAt instanceof k0) {
                p9 p9Var = ((k0) childAt).h;
                if (p9Var.getAnimatedEmojiDrawable() != null) {
                    fi.s2 s2Var = p9Var.getAnimatedEmojiDrawable().f38028k;
                    if (s2Var != null) {
                        s2Var.Q0(false);
                    }
                } else {
                    p9Var.getImageReceiver().Q0(false);
                }
            }
        }
        j0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone, boolean z10) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i7 = 0;
        while (true) {
            j0 j0Var = this.f36958c;
            if (i7 < j0Var.getChildCount()) {
                View childAt = j0Var.getChildAt(i7);
                if ((childAt instanceof k0) && (aiComposeTone2 = ((k0) childAt).f36577e) != null && aiComposeTone2 == aiComposeTone) {
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
        if (this.f36960f) {
            Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintDivider", this.f36957b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.n6.f29574k0;
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
            j0 j0Var = this.f36958c;
            if (i7 < j0Var.getChildCount()) {
                View childAt = j0Var.getChildAt(this.h);
                if (childAt instanceof k0) {
                    return ((k0) childAt).f36577e;
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
        this.f36960f = z10;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f36958c.setPadding(i7, i10, i11, i12);
    }

    public void setRoundRadius(int i7) {
        this.f36959e = i7;
    }
}
