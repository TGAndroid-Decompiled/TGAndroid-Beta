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
    public final int f25496a;
    public final org.telegram.ui.ActionBar.e6 f25497b;
    public final b0 f25498c;
    public int d;
    public boolean f25499e;
    public int f25500f;
    public final g6 h;
    public ci.n5 f25501n;

    public d0(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f25496a = i10;
        this.f25497b = e6Var;
        b0 b0Var = new b0(this, context, e6Var);
        this.f25498c = b0Var;
        b0Var.setOrientation(0);
        this.h = new g6(b0Var, 0L, 320L, is.h);
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
        b0 b0Var = this.f25498c;
        int childCount = b0Var.getChildCount();
        c0 c0Var = new c0(getContext(), this.f25496a, this.f25497b);
        c0Var.f25097c = this.d;
        c0Var.e();
        c0Var.f25099f = false;
        c0Var.h.setImageResource(i10);
        c0Var.f25100n.setText(str);
        c0Var.setOnClickListener(new a0(childCount, 0, callback));
        b0Var.addView(c0Var, w7.x5.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        int i10;
        c0 c0Var = new c0(getContext(), this.f25496a, this.f25497b);
        c0Var.f25098e = aiComposeTone;
        c0Var.f25097c = this.d;
        c0Var.e();
        int i11 = 0;
        TextView textView = c0Var.f25100n;
        y9 y9Var = c0Var.h;
        if (aiComposeTone == null) {
            c0Var.d = false;
            c0Var.e();
            int i12 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            c0Var.f25099f = false;
            y9Var.setImageResource(i12);
            textView.setText(string);
        } else if (aiComposeTone instanceof z) {
            c0Var.d = false;
            c0Var.e();
            int i13 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            c0Var.f25099f = false;
            y9Var.setImageResource(i13);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j3 = aiComposeTone.emoji_id;
            c0Var.f25099f = true;
            y9Var.setColorFilter(null);
            y9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i14 = c0Var.f25095a;
            if (ConnectionsManager.getInstance(i14).isTestBackend()) {
                for (int i15 = 0; i15 < 4 && (!UserConfig.getInstance(i15).isClientActivated() || ConnectionsManager.getInstance(i15).isTestBackend()); i15++) {
                }
            }
            y9Var.setAnimatedEmojiDrawable(new s5(9, i14, j3));
        }
        c0Var.setOnClickListener(new org.telegram.ui.sf(10, callback, aiComposeTone));
        c0Var.setOnLongClickListener(new ai.r3(1, this, c0Var));
        b0 b0Var = this.f25498c;
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
        if (this.f25500f == i10) {
            return;
        }
        this.f25500f = i10;
        b0 b0Var = this.f25498c;
        if (i10 >= 0 && i10 < b0Var.getChildCount()) {
            View childAt = b0Var.getChildAt(i10);
            if (childAt instanceof c0) {
                y9 y9Var = ((c0) childAt).h;
                if (y9Var.getAnimatedEmojiDrawable() != null) {
                    ai.m4 m4Var = y9Var.getAnimatedEmojiDrawable().f30680k;
                    if (m4Var != null) {
                        m4Var.startAnimation();
                    }
                } else {
                    y9Var.getImageReceiver().startAnimation();
                }
            }
        }
        b0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i10 = 0;
        while (true) {
            b0 b0Var = this.f25498c;
            if (i10 < b0Var.getChildCount()) {
                View childAt = b0Var.getChildAt(i10);
                if ((childAt instanceof c0) && (aiComposeTone2 = ((c0) childAt).f25098e) != null && aiComposeTone2 == aiComposeTone) {
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
        if (this.f25499e) {
            Paint U0 = org.telegram.ui.ActionBar.i6.U0("paintDivider", this.f25497b);
            if (U0 == null) {
                U0 = org.telegram.ui.ActionBar.i6.f20923k0;
            }
            canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), U0);
        }
    }

    public int getSelectedTab() {
        return this.f25500f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i10 = this.f25500f;
        if (i10 >= 0) {
            b0 b0Var = this.f25498c;
            if (i10 < b0Var.getChildCount()) {
                View childAt = b0Var.getChildAt(this.f25500f);
                if (childAt instanceof c0) {
                    return ((c0) childAt).f25098e;
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
        this.f25499e = z10;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f25498c.setPadding(i10, i11, i12, i13);
    }

    public void setRoundRadius(int i10) {
        this.d = i10;
    }
}
