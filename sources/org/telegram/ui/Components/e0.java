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
    public final int f26355a;
    public final org.telegram.ui.ActionBar.g6 f26356b;
    public final c0 f26357c;
    public int d;
    public boolean f26358e;
    public int f26359f;
    public final z5 h;
    public i f26360n;

    public e0(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.f26355a = i10;
        this.f26356b = g6Var;
        c0 c0Var = new c0(this, context, g6Var);
        this.f26357c = c0Var;
        c0Var.setOrientation(0);
        this.h = new z5(c0Var, 0L, 320L, pr.h);
        if (z4) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(c0Var);
            addView(horizontalScrollView, k7.c6.e(-1, -1, 119));
            return;
        }
        addView(c0Var, k7.c6.e(-1, -1, 119));
    }

    public final void a(int i10, String str, Utilities.Callback callback) {
        c0 c0Var = this.f26357c;
        int childCount = c0Var.getChildCount();
        d0 d0Var = new d0(getContext(), this.f26355a, this.f26356b);
        d0Var.f26123c = this.d;
        d0Var.e();
        d0Var.f26125f = false;
        d0Var.h.setImageResource(i10);
        d0Var.f26126n.setText(str);
        d0Var.setOnClickListener(new lh.d2(childCount, 1, callback));
        c0Var.addView(d0Var, k7.c6.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        int i10;
        d0 d0Var = new d0(getContext(), this.f26355a, this.f26356b);
        d0Var.f26124e = aiComposeTone;
        d0Var.f26123c = this.d;
        d0Var.e();
        int i11 = 0;
        TextView textView = d0Var.f26126n;
        p9 p9Var = d0Var.h;
        if (aiComposeTone == null) {
            d0Var.d = false;
            d0Var.e();
            int i12 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            d0Var.f26125f = false;
            p9Var.setImageResource(i12);
            textView.setText(string);
        } else if (aiComposeTone instanceof b0) {
            d0Var.d = false;
            d0Var.e();
            int i13 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            d0Var.f26125f = false;
            p9Var.setImageResource(i13);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j10 = aiComposeTone.emoji_id;
            d0Var.f26125f = true;
            p9Var.setColorFilter(null);
            p9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i14 = d0Var.f26121a;
            if (ConnectionsManager.getInstance(i14).isTestBackend()) {
                for (int i15 = 0; i15 < 4 && (!UserConfig.getInstance(i15).isClientActivated() || ConnectionsManager.getInstance(i15).isTestBackend()); i15++) {
                }
            }
            p9Var.setAnimatedEmojiDrawable(new l5(9, i14, j10));
        }
        d0Var.setOnClickListener(new org.telegram.messenger.video.g(25, callback, aiComposeTone));
        d0Var.setOnLongClickListener(new oh.g2(1, this, d0Var));
        c0 c0Var = this.f26357c;
        if (c0Var.getOrientation() == 0) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (c0Var.getOrientation() != 1) {
            i11 = -1;
        }
        c0Var.addView(d0Var, k7.c6.o(i10, i11, 1.0f, 119));
    }

    public final void c(int i10) {
        if (this.f26359f == i10) {
            return;
        }
        this.f26359f = i10;
        c0 c0Var = this.f26357c;
        if (i10 >= 0 && i10 < c0Var.getChildCount()) {
            View childAt = c0Var.getChildAt(i10);
            if (childAt instanceof d0) {
                p9 p9Var = ((d0) childAt).h;
                if (p9Var.getAnimatedEmojiDrawable() != null) {
                    oh.z2 z2Var = p9Var.getAnimatedEmojiDrawable().f28604k;
                    if (z2Var != null) {
                        z2Var.startAnimation();
                    }
                } else {
                    p9Var.getImageReceiver().startAnimation();
                }
            }
        }
        c0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i10 = 0;
        while (true) {
            c0 c0Var = this.f26357c;
            if (i10 < c0Var.getChildCount()) {
                View childAt = c0Var.getChildAt(i10);
                if ((childAt instanceof d0) && (aiComposeTone2 = ((d0) childAt).f26124e) != null && aiComposeTone2 == aiComposeTone) {
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
        if (this.f26358e) {
            Paint T0 = org.telegram.ui.ActionBar.k6.T0("paintDivider", this.f26356b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.k6.f21779k0;
            }
            canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), T0);
        }
    }

    public int getSelectedTab() {
        return this.f26359f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i10 = this.f26359f;
        if (i10 >= 0) {
            c0 c0Var = this.f26357c;
            if (i10 < c0Var.getChildCount()) {
                View childAt = c0Var.getChildAt(this.f26359f);
                if (childAt instanceof d0) {
                    return ((d0) childAt).f26124e;
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

    public void setDivider(boolean z4) {
        this.f26358e = z4;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f26357c.setPadding(i10, i11, i12, i13);
    }

    public void setRoundRadius(int i10) {
        this.d = i10;
    }
}
