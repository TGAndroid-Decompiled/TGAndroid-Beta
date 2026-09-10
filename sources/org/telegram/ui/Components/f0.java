package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
public final class f0 extends FrameLayout {
    public final int f22792a;
    public final org.telegram.ui.ActionBar.f6 f22793b;
    public final d0 f22794c;
    public int d;
    public boolean e;
    public int f22795f;
    public final d6 h;
    public bi.n6 f22796n;

    public f0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.f22792a = i10;
        this.f22793b = f6Var;
        d0 d0Var = new d0(this, context, f6Var);
        this.f22794c = d0Var;
        d0Var.setOrientation(0);
        this.h = new d6(d0Var, 0L, 320L, wr.h);
        if (z10) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(d0Var);
            addView(horizontalScrollView, w7.a6.e(-1, -1, 119));
            return;
        }
        addView(d0Var, w7.a6.e(-1, -1, 119));
    }

    public final void a(int i10, String str, Utilities.Callback callback) {
        d0 d0Var = this.f22794c;
        int childCount = d0Var.getChildCount();
        e0 e0Var = new e0(getContext(), this.f22792a, this.f22793b);
        e0Var.f22515c = this.d;
        e0Var.e();
        e0Var.f22516f = false;
        e0Var.h.setImageResource(i10);
        e0Var.f22517n.setText(str);
        e0Var.setOnClickListener(new c0(childCount, 0, callback));
        d0Var.addView(e0Var, w7.a6.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        int i10;
        e0 e0Var = new e0(getContext(), this.f22792a, this.f22793b);
        e0Var.e = aiComposeTone;
        e0Var.f22515c = this.d;
        e0Var.e();
        int i11 = 0;
        TextView textView = e0Var.f22517n;
        w9 w9Var = e0Var.h;
        if (aiComposeTone == null) {
            e0Var.d = false;
            e0Var.e();
            int i12 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            e0Var.f22516f = false;
            w9Var.setImageResource(i12);
            textView.setText(string);
        } else if (aiComposeTone instanceof a0) {
            e0Var.d = false;
            e0Var.e();
            int i13 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            e0Var.f22516f = false;
            w9Var.setImageResource(i13);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            e0Var.f22516f = true;
            w9Var.setColorFilter(null);
            w9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i14 = e0Var.f22513a;
            if (ConnectionsManager.getInstance(i14).isTestBackend()) {
                for (int i15 = 0; i15 < 4 && (!UserConfig.getInstance(i15).isClientActivated() || ConnectionsManager.getInstance(i15).isTestBackend()); i15++) {
                }
            }
            w9Var.setAnimatedEmojiDrawable(new p5(9, i14, j3));
        }
        e0Var.setOnClickListener(new org.telegram.ui.sh(7, callback, aiComposeTone));
        e0Var.setOnLongClickListener(new b0(0, this, e0Var));
        d0 d0Var = this.f22794c;
        if (d0Var.getOrientation() == 0) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (d0Var.getOrientation() != 1) {
            i11 = -1;
        }
        d0Var.addView(e0Var, w7.a6.o(i10, i11, 1.0f, 119));
    }

    public final void c(int i10) {
        if (this.f22795f == i10) {
            return;
        }
        this.f22795f = i10;
        d0 d0Var = this.f22794c;
        if (i10 >= 0 && i10 < d0Var.getChildCount()) {
            View childAt = d0Var.getChildAt(i10);
            if (childAt instanceof e0) {
                w9 w9Var = ((e0) childAt).h;
                if (w9Var.getAnimatedEmojiDrawable() != null) {
                    gg.h1 h1Var = w9Var.getAnimatedEmojiDrawable().f26033k;
                    if (h1Var != null) {
                        h1Var.startAnimation();
                    }
                } else {
                    w9Var.getImageReceiver().startAnimation();
                }
            }
        }
        d0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i10 = 0;
        while (true) {
            d0 d0Var = this.f22794c;
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
            Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", this.f22793b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.j6.f18049k0;
            }
            canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), T0);
        }
    }

    public int getSelectedTab() {
        return this.f22795f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i10 = this.f22795f;
        if (i10 >= 0) {
            d0 d0Var = this.f22794c;
            if (i10 < d0Var.getChildCount()) {
                View childAt = d0Var.getChildAt(this.f22795f);
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
        this.f22794c.setPadding(i10, i11, i12, i13);
    }

    public void setRoundRadius(int i10) {
        this.d = i10;
    }
}
