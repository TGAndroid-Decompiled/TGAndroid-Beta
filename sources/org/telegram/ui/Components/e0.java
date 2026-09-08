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
public final class e0 extends FrameLayout {
    public final int f25522a;
    public final org.telegram.ui.ActionBar.f6 f25523b;
    public final c0 f25524c;
    public int d;
    public boolean f25525e;
    public int f25526f;
    public final e6 h;
    public di.p5 f25527n;

    public e0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.f25522a = i10;
        this.f25523b = f6Var;
        c0 c0Var = new c0(this, context, f6Var);
        this.f25524c = c0Var;
        c0Var.setOrientation(0);
        this.h = new e6(c0Var, 0L, 320L, pr.h);
        if (z10) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(c0Var);
            addView(horizontalScrollView, w7.x5.e(-1, -1, 119));
            return;
        }
        addView(c0Var, w7.x5.e(-1, -1, 119));
    }

    public final void a(int i10, String str, Utilities.Callback callback) {
        c0 c0Var = this.f25524c;
        int childCount = c0Var.getChildCount();
        d0 d0Var = new d0(getContext(), this.f25522a, this.f25523b);
        d0Var.f25189c = this.d;
        d0Var.d();
        d0Var.f25191f = false;
        d0Var.h.setImageResource(i10);
        d0Var.f25192n.setText(str);
        d0Var.setOnClickListener(new b0(childCount, 0, callback));
        c0Var.addView(d0Var, w7.x5.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        int i10;
        d0 d0Var = new d0(getContext(), this.f25522a, this.f25523b);
        d0Var.f25190e = aiComposeTone;
        d0Var.f25189c = this.d;
        d0Var.d();
        int i11 = 0;
        TextView textView = d0Var.f25192n;
        x9 x9Var = d0Var.h;
        if (aiComposeTone == null) {
            d0Var.d = false;
            d0Var.d();
            int i12 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            d0Var.f25191f = false;
            x9Var.setImageResource(i12);
            textView.setText(string);
        } else if (aiComposeTone instanceof a0) {
            d0Var.d = false;
            d0Var.d();
            int i13 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            d0Var.f25191f = false;
            x9Var.setImageResource(i13);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            d0Var.f25191f = true;
            x9Var.setColorFilter(null);
            x9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i14 = d0Var.f25187a;
            if (ConnectionsManager.getInstance(i14).isTestBackend()) {
                for (int i15 = 0; i15 < 4 && (!UserConfig.getInstance(i15).isClientActivated() || ConnectionsManager.getInstance(i15).isTestBackend()); i15++) {
                }
            }
            x9Var.setAnimatedEmojiDrawable(new q5(9, i14, j3));
        }
        d0Var.setOnClickListener(new org.telegram.ui.rf(10, callback, aiComposeTone));
        d0Var.setOnLongClickListener(new bi.d3(1, this, d0Var));
        c0 c0Var = this.f25524c;
        if (c0Var.getOrientation() == 0) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (c0Var.getOrientation() != 1) {
            i11 = -1;
        }
        c0Var.addView(d0Var, w7.x5.o(i10, i11, 1.0f, 119));
    }

    public final void c(int i10) {
        if (this.f25526f == i10) {
            return;
        }
        this.f25526f = i10;
        c0 c0Var = this.f25524c;
        if (i10 >= 0 && i10 < c0Var.getChildCount()) {
            View childAt = c0Var.getChildAt(i10);
            if (childAt instanceof d0) {
                x9 x9Var = ((d0) childAt).h;
                if (x9Var.getAnimatedEmojiDrawable() != null) {
                    bi.y3 y3Var = x9Var.getAnimatedEmojiDrawable().f29611k;
                    if (y3Var != null) {
                        y3Var.startAnimation();
                    }
                } else {
                    x9Var.getImageReceiver().startAnimation();
                }
            }
        }
        c0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i10 = 0;
        while (true) {
            c0 c0Var = this.f25524c;
            if (i10 < c0Var.getChildCount()) {
                View childAt = c0Var.getChildAt(i10);
                if ((childAt instanceof d0) && (aiComposeTone2 = ((d0) childAt).f25190e) != null && aiComposeTone2 == aiComposeTone) {
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
        if (this.f25525e) {
            Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", this.f25523b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.j6.f20812k0;
            }
            canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), T0);
        }
    }

    public int getSelectedTab() {
        return this.f25526f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i10 = this.f25526f;
        if (i10 >= 0) {
            c0 c0Var = this.f25524c;
            if (i10 < c0Var.getChildCount()) {
                View childAt = c0Var.getChildAt(this.f25526f);
                if (childAt instanceof d0) {
                    return ((d0) childAt).f25190e;
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
        this.f25525e = z10;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f25524c.setPadding(i10, i11, i12, i13);
    }

    public void setRoundRadius(int i10) {
        this.d = i10;
    }
}
