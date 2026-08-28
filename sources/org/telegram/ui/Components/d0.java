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
    public final int f27602a;
    public final org.telegram.ui.ActionBar.b6 f27603b;
    public final b0 f27604c;
    public int d;
    public boolean f27605e;
    public int f27606f;
    public final y5 h;
    public kh.f5 f27607n;

    public d0(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.f27602a = i9;
        this.f27603b = b6Var;
        b0 b0Var = new b0(this, context, b6Var);
        this.f27604c = b0Var;
        b0Var.setOrientation(0);
        this.h = new y5(b0Var, 0L, 320L, gr.h);
        if (z10) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(b0Var);
            addView(horizontalScrollView, g7.e6.e(-1, -1, 119));
            return;
        }
        addView(b0Var, g7.e6.e(-1, -1, 119));
    }

    public final void a(int i9, String str, Utilities.Callback callback) {
        b0 b0Var = this.f27604c;
        int childCount = b0Var.getChildCount();
        c0 c0Var = new c0(getContext(), this.f27602a, this.f27603b);
        c0Var.f27311c = this.d;
        c0Var.d();
        c0Var.f27313f = false;
        c0Var.h.setImageResource(i9);
        c0Var.f27314n.setText(str);
        c0Var.setOnClickListener(new fh.m2(childCount, 1, callback));
        b0Var.addView(c0Var, g7.e6.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        int i9;
        c0 c0Var = new c0(getContext(), this.f27602a, this.f27603b);
        c0Var.f27312e = aiComposeTone;
        c0Var.f27311c = this.d;
        c0Var.d();
        int i10 = 0;
        TextView textView = c0Var.f27314n;
        o9 o9Var = c0Var.h;
        if (aiComposeTone == null) {
            c0Var.d = false;
            c0Var.d();
            int i11 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            c0Var.f27313f = false;
            o9Var.setImageResource(i11);
            textView.setText(string);
        } else if (aiComposeTone instanceof a0) {
            c0Var.d = false;
            c0Var.d();
            int i12 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            c0Var.f27313f = false;
            o9Var.setImageResource(i12);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j10 = aiComposeTone.emoji_id;
            c0Var.f27313f = true;
            o9Var.setColorFilter(null);
            o9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i13 = c0Var.f27309a;
            if (ConnectionsManager.getInstance(i13).isTestBackend()) {
                for (int i14 = 0; i14 < 4 && (!UserConfig.getInstance(i14).isClientActivated() || ConnectionsManager.getInstance(i14).isTestBackend()); i14++) {
                }
            }
            o9Var.setAnimatedEmojiDrawable(new k5(9, i13, j10));
        }
        c0Var.setOnClickListener(new mh.k3(27, callback, aiComposeTone));
        c0Var.setOnLongClickListener(new ih.g2(1, this, c0Var));
        b0 b0Var = this.f27604c;
        if (b0Var.getOrientation() == 0) {
            i9 = 0;
        } else {
            i9 = -1;
        }
        if (b0Var.getOrientation() != 1) {
            i10 = -1;
        }
        b0Var.addView(c0Var, g7.e6.o(i9, i10, 1.0f, 119));
    }

    public final void c(int i9) {
        if (this.f27606f == i9) {
            return;
        }
        this.f27606f = i9;
        b0 b0Var = this.f27604c;
        if (i9 >= 0 && i9 < b0Var.getChildCount()) {
            View childAt = b0Var.getChildAt(i9);
            if (childAt instanceof c0) {
                o9 o9Var = ((c0) childAt).h;
                if (o9Var.getAnimatedEmojiDrawable() != null) {
                    ih.z2 z2Var = o9Var.getAnimatedEmojiDrawable().f29951k;
                    if (z2Var != null) {
                        z2Var.startAnimation();
                    }
                } else {
                    o9Var.getImageReceiver().startAnimation();
                }
            }
        }
        b0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i9 = 0;
        while (true) {
            b0 b0Var = this.f27604c;
            if (i9 < b0Var.getChildCount()) {
                View childAt = b0Var.getChildAt(i9);
                if ((childAt instanceof c0) && (aiComposeTone2 = ((c0) childAt).f27312e) != null && aiComposeTone2 == aiComposeTone) {
                    c(i9);
                    return;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f27605e) {
            Paint T0 = org.telegram.ui.ActionBar.f6.T0("paintDivider", this.f27603b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), T0);
        }
    }

    public int getSelectedTab() {
        return this.f27606f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i9 = this.f27606f;
        if (i9 >= 0) {
            b0 b0Var = this.f27604c;
            if (i9 < b0Var.getChildCount()) {
                View childAt = b0Var.getChildAt(this.f27606f);
                if (childAt instanceof c0) {
                    return ((c0) childAt).f27312e;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    public void setDivider(boolean z10) {
        this.f27605e = z10;
    }

    @Override
    public final void setPadding(int i9, int i10, int i11, int i12) {
        this.f27604c.setPadding(i9, i10, i11, i12);
    }

    public void setRoundRadius(int i9) {
        this.d = i9;
    }
}
