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
public final class d0 extends FrameLayout {
    public final int f23163a;
    public final org.telegram.ui.ActionBar.f6 f23164b;
    public final b0 f23165c;
    public int d;
    public boolean e;
    public int f23166f;
    public final c6 h;
    public ci.p5 f23167n;

    public d0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.f23163a = i10;
        this.f23164b = f6Var;
        b0 b0Var = new b0(this, context, f6Var);
        this.f23165c = b0Var;
        b0Var.setOrientation(0);
        this.h = new c6(b0Var, 0L, 320L, qr.h);
        if (z10) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(b0Var);
            addView(horizontalScrollView, w7.x5.e(-1, -1, 119));
            return;
        }
        addView(b0Var, w7.x5.e(-1, -1, 119));
    }

    public final void a(int i10, String str, Utilities.Callback callback) {
        b0 b0Var = this.f23165c;
        int childCount = b0Var.getChildCount();
        c0 c0Var = new c0(getContext(), this.f23163a, this.f23164b);
        c0Var.f22853c = this.d;
        c0Var.e();
        c0Var.f22854f = false;
        c0Var.h.setImageResource(i10);
        c0Var.f22855n.setText(str);
        c0Var.setOnClickListener(new a0(childCount, 0, callback));
        b0Var.addView(c0Var, w7.x5.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        int i10;
        c0 c0Var = new c0(getContext(), this.f23163a, this.f23164b);
        c0Var.e = aiComposeTone;
        c0Var.f22853c = this.d;
        c0Var.e();
        int i11 = 0;
        TextView textView = c0Var.f22855n;
        u9 u9Var = c0Var.h;
        if (aiComposeTone == null) {
            c0Var.d = false;
            c0Var.e();
            int i12 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            c0Var.f22854f = false;
            u9Var.setImageResource(i12);
            textView.setText(string);
        } else if (aiComposeTone instanceof z) {
            c0Var.d = false;
            c0Var.e();
            int i13 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            c0Var.f22854f = false;
            u9Var.setImageResource(i13);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            c0Var.f22854f = true;
            u9Var.setColorFilter(null);
            u9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i14 = c0Var.f22851a;
            if (ConnectionsManager.getInstance(i14).isTestBackend()) {
                for (int i15 = 0; i15 < 4 && (!UserConfig.getInstance(i15).isClientActivated() || ConnectionsManager.getInstance(i15).isTestBackend()); i15++) {
                }
            }
            u9Var.setAnimatedEmojiDrawable(new o5(9, i14, j3));
        }
        c0Var.setOnClickListener(new org.telegram.ui.tf(10, callback, aiComposeTone));
        c0Var.setOnLongClickListener(new ai.q3(1, this, c0Var));
        b0 b0Var = this.f23165c;
        if (b0Var.getOrientation() == 0) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (b0Var.getOrientation() != 1) {
            i11 = -1;
        }
        b0Var.addView(c0Var, w7.x5.o(i10, i11, 1.0f, 119));
    }

    public final void c(int i10) {
        if (this.f23166f == i10) {
            return;
        }
        this.f23166f = i10;
        b0 b0Var = this.f23165c;
        if (i10 >= 0 && i10 < b0Var.getChildCount()) {
            View childAt = b0Var.getChildAt(i10);
            if (childAt instanceof c0) {
                u9 u9Var = ((c0) childAt).h;
                if (u9Var.getAnimatedEmojiDrawable() != null) {
                    ai.l4 l4Var = u9Var.getAnimatedEmojiDrawable().f26636k;
                    if (l4Var != null) {
                        l4Var.startAnimation();
                    }
                } else {
                    u9Var.getImageReceiver().startAnimation();
                }
            }
        }
        b0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i10 = 0;
        while (true) {
            b0 b0Var = this.f23165c;
            if (i10 < b0Var.getChildCount()) {
                View childAt = b0Var.getChildAt(i10);
                if ((childAt instanceof c0) && (aiComposeTone2 = ((c0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
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
            Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", this.f23164b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.j6.f18984k0;
            }
            canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), T0);
        }
    }

    public int getSelectedTab() {
        return this.f23166f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i10 = this.f23166f;
        if (i10 >= 0) {
            b0 b0Var = this.f23165c;
            if (i10 < b0Var.getChildCount()) {
                View childAt = b0Var.getChildAt(this.f23166f);
                if (childAt instanceof c0) {
                    return ((c0) childAt).e;
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
        this.f23165c.setPadding(i10, i11, i12, i13);
    }

    public void setRoundRadius(int i10) {
        this.d = i10;
    }
}
