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
public final class m0 extends FrameLayout {
    public final int f37317a;
    public final org.telegram.ui.ActionBar.h6 f37318b;
    public final k0 f37319c;
    public final FrameLayout d;
    public int f37320e;
    public boolean f37321f;
    public int h;
    public final d6 f37322n;
    public int f37323r;
    public final d6 f37324s;
    public hi.r4 f37325w;

    public m0(Context context, int i7, int i10, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f37323r = -1;
        this.f37317a = i7;
        this.f37318b = h6Var;
        k0 k0Var = new k0(this, context, h6Var);
        this.f37319c = k0Var;
        k0Var.setOrientation(i10);
        nr nrVar = nr.h;
        this.f37322n = new d6(k0Var, 0L, 320L, nrVar);
        this.f37324s = new d6(k0Var, 0L, 320L, nrVar);
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
            this.d.addView(k0Var);
            addView(this.d, c8.na.e(-1, -1, 119));
            return;
        }
        this.d = null;
        addView(k0Var, c8.na.e(-1, -1, 119));
    }

    public final void a(int i7, String str, org.telegram.messenger.y10 y10Var) {
        int i10;
        k0 k0Var = this.f37319c;
        int childCount = k0Var.getChildCount();
        l0 l0Var = new l0(this.f37317a, getContext(), this.f37318b);
        l0Var.f37006c = this.f37320e;
        l0Var.updateColors();
        int i11 = 0;
        l0Var.f37008f = false;
        l0Var.h.setImageResource(i7);
        l0Var.f37009n.setText(str);
        l0Var.setOnClickListener(new ci.q(y10Var, childCount, 9));
        if (k0Var.getOrientation() == 0) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (k0Var.getOrientation() != 1) {
            i11 = -1;
        }
        k0Var.addView(l0Var, c8.na.p(i10, i11, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, org.telegram.messenger.y10 y10Var) {
        int i7;
        l0 l0Var = new l0(this.f37317a, getContext(), this.f37318b);
        l0Var.f37007e = aiComposeTone;
        l0Var.f37006c = this.f37320e;
        l0Var.updateColors();
        int i10 = 0;
        TextView textView = l0Var.f37009n;
        q9 q9Var = l0Var.h;
        if (aiComposeTone == null) {
            l0Var.d = false;
            l0Var.updateColors();
            String N0 = org.telegram.messenger.hd.N0(2131754975, null);
            l0Var.f37008f = false;
            q9Var.setImageResource(2131232784);
            textView.setText(N0);
        } else if (aiComposeTone instanceof j0) {
            l0Var.d = false;
            l0Var.updateColors();
            String N02 = org.telegram.messenger.hd.N0(2131754973, null);
            l0Var.f37008f = false;
            q9Var.setImageResource(2131231579);
            textView.setText(N02);
        } else {
            l0Var.a(null, aiComposeTone.title, Long.valueOf(aiComposeTone.emoji_id));
        }
        l0Var.setOnClickListener(new oi.h1(21, y10Var, aiComposeTone));
        l0Var.setOnLongClickListener(new fi.z1(1, this, l0Var));
        k0 k0Var = this.f37319c;
        if (k0Var.getOrientation() == 0) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        if (k0Var.getOrientation() != 1) {
            i10 = -1;
        }
        k0Var.addView(l0Var, c8.na.p(i7, i10, 1.0f, 119));
    }

    public final void c(int i7, boolean z10) {
        float f10;
        int i10 = this.h;
        if (i10 == i7) {
            return;
        }
        this.h = i7;
        d6 d6Var = this.f37322n;
        d6 d6Var2 = this.f37324s;
        if (i7 >= 0) {
            if (i10 < 0 && d6Var2.f34349c < 0.01f) {
                d6Var.e(true, i7);
            }
            this.f37323r = i7;
        }
        if (!z10) {
            int i11 = this.h;
            if (i11 < 0) {
                i11 = this.f37323r;
            }
            d6Var.e(true, i11);
            if (this.h >= 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            d6Var2.e(true, f10);
        }
        k0 k0Var = this.f37319c;
        if (i7 >= 0 && i7 < k0Var.getChildCount()) {
            View childAt = k0Var.getChildAt(i7);
            if (childAt instanceof l0) {
                q9 q9Var = ((l0) childAt).h;
                if (q9Var.getAnimatedEmojiDrawable() != null) {
                    fi.s2 s2Var = q9Var.getAnimatedEmojiDrawable().f38457k;
                    if (s2Var != null) {
                        s2Var.P0(false);
                    }
                } else {
                    q9Var.getImageReceiver().P0(false);
                }
            }
        }
        k0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone, boolean z10) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i7 = 0;
        while (true) {
            k0 k0Var = this.f37319c;
            if (i7 < k0Var.getChildCount()) {
                View childAt = k0Var.getChildAt(i7);
                if ((childAt instanceof l0) && (aiComposeTone2 = ((l0) childAt).f37007e) != null && aiComposeTone2 == aiComposeTone) {
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
        if (this.f37321f) {
            Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", this.f37318b);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.m6.f29470k0;
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
            k0 k0Var = this.f37319c;
            if (i7 < k0Var.getChildCount()) {
                View childAt = k0Var.getChildAt(this.h);
                if (childAt instanceof l0) {
                    return ((l0) childAt).f37007e;
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
        this.f37321f = z10;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f37319c.setPadding(i7, i10, i11, i12);
    }

    public void setRoundRadius(int i7) {
        this.f37320e = i7;
    }
}
