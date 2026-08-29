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
    public final int f28219a;
    public final org.telegram.ui.ActionBar.c6 f28220b;
    public final d0 f28221c;
    public int d;
    public boolean f28222e;
    public int f28223f;
    public final d6 h;
    public nh.v4 f28224n;

    public f0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f28219a = i10;
        this.f28220b = c6Var;
        d0 d0Var = new d0(this, context, c6Var);
        this.f28221c = d0Var;
        d0Var.setOrientation(0);
        this.h = new d6(d0Var, 0L, 320L, jr.h);
        if (z10) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            horizontalScrollView.setFillViewport(true);
            horizontalScrollView.addView(d0Var);
            addView(horizontalScrollView, i7.f6.e(-1, -1, 119));
            return;
        }
        addView(d0Var, i7.f6.e(-1, -1, 119));
    }

    public final void a(int i10, String str, Utilities.Callback callback) {
        d0 d0Var = this.f28221c;
        int childCount = d0Var.getChildCount();
        e0 e0Var = new e0(getContext(), this.f28219a, this.f28220b);
        e0Var.f27896c = this.d;
        e0Var.e();
        e0Var.f27898f = false;
        e0Var.h.setImageResource(i10);
        e0Var.f27899n.setText(str);
        e0Var.setOnClickListener(new ih.e2(childCount, 1, callback));
        d0Var.addView(e0Var, i7.f6.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        int i10;
        e0 e0Var = new e0(getContext(), this.f28219a, this.f28220b);
        e0Var.f27897e = aiComposeTone;
        e0Var.f27896c = this.d;
        e0Var.e();
        int i11 = 0;
        TextView textView = e0Var.f27899n;
        t9 t9Var = e0Var.h;
        if (aiComposeTone == null) {
            e0Var.d = false;
            e0Var.e();
            int i12 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            e0Var.f27898f = false;
            t9Var.setImageResource(i12);
            textView.setText(string);
        } else if (aiComposeTone instanceof c0) {
            e0Var.d = false;
            e0Var.e();
            int i13 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            e0Var.f27898f = false;
            t9Var.setImageResource(i13);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j10 = aiComposeTone.emoji_id;
            e0Var.f27898f = true;
            t9Var.setColorFilter(null);
            t9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i14 = e0Var.f27894a;
            if (ConnectionsManager.getInstance(i14).isTestBackend()) {
                for (int i15 = 0; i15 < 4 && (!UserConfig.getInstance(i15).isClientActivated() || ConnectionsManager.getInstance(i15).isTestBackend()); i15++) {
                }
            }
            t9Var.setAnimatedEmojiDrawable(new p5(9, i14, j10));
        }
        e0Var.setOnClickListener(new nh.r7(28, callback, aiComposeTone));
        e0Var.setOnLongClickListener(new lh.e2(1, this, e0Var));
        d0 d0Var = this.f28221c;
        if (d0Var.getOrientation() == 0) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (d0Var.getOrientation() != 1) {
            i11 = -1;
        }
        d0Var.addView(e0Var, i7.f6.o(i10, i11, 1.0f, 119));
    }

    public final void c(int i10) {
        if (this.f28223f == i10) {
            return;
        }
        this.f28223f = i10;
        d0 d0Var = this.f28221c;
        if (i10 >= 0 && i10 < d0Var.getChildCount()) {
            View childAt = d0Var.getChildAt(i10);
            if (childAt instanceof e0) {
                t9 t9Var = ((e0) childAt).h;
                if (t9Var.getAnimatedEmojiDrawable() != null) {
                    lh.x2 x2Var = t9Var.getAnimatedEmojiDrawable().f31593k;
                    if (x2Var != null) {
                        x2Var.startAnimation();
                    }
                } else {
                    t9Var.getImageReceiver().startAnimation();
                }
            }
        }
        d0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i10 = 0;
        while (true) {
            d0 d0Var = this.f28221c;
            if (i10 < d0Var.getChildCount()) {
                View childAt = d0Var.getChildAt(i10);
                if ((childAt instanceof e0) && (aiComposeTone2 = ((e0) childAt).f27897e) != null && aiComposeTone2 == aiComposeTone) {
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
        if (this.f28222e) {
            Paint T0 = org.telegram.ui.ActionBar.g6.T0("paintDivider", this.f28220b);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.g6.f23183k0;
            }
            canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), T0);
        }
    }

    public int getSelectedTab() {
        return this.f28223f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i10 = this.f28223f;
        if (i10 >= 0) {
            d0 d0Var = this.f28221c;
            if (i10 < d0Var.getChildCount()) {
                View childAt = d0Var.getChildAt(this.f28223f);
                if (childAt instanceof e0) {
                    return ((e0) childAt).f27897e;
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
        this.f28222e = z10;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f28221c.setPadding(i10, i11, i12, i13);
    }

    public void setRoundRadius(int i10) {
        this.d = i10;
    }
}
