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

    public final int f27584a;

    public final org.telegram.ui.ActionBar.c6 f27585b;

    public final b0 f27586c;
    public int d;

    public boolean f27587e;

    public int f27588f;
    public final y5 h;

    public lh.e5 f27589n;

    public d0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f27584a = i10;
        this.f27585b = c6Var;
        b0 b0Var = new b0(this, context, c6Var);
        this.f27586c = b0Var;
        b0Var.setOrientation(0);
        this.h = new y5(b0Var, 0L, 320L, er.h);
        if (!z10) {
            addView(b0Var, h7.z5.e(-1, -1, 119));
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(b0Var);
        addView(horizontalScrollView, h7.z5.e(-1, -1, 119));
    }

    public final void a(int i10, String str, Utilities.Callback callback) {
        b0 b0Var = this.f27586c;
        int childCount = b0Var.getChildCount();
        c0 c0Var = new c0(getContext(), this.f27584a, this.f27585b);
        c0Var.f27236c = this.d;
        c0Var.d();
        c0Var.f27238f = false;
        c0Var.h.setImageResource(i10);
        c0Var.f27239n.setText(str);
        c0Var.setOnClickListener(new gh.h2(childCount, 1, callback));
        b0Var.addView(c0Var, h7.z5.o(0, -1, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, Utilities.Callback callback) {
        c0 c0Var = new c0(getContext(), this.f27584a, this.f27585b);
        c0Var.f27237e = aiComposeTone;
        c0Var.f27236c = this.d;
        c0Var.d();
        TextView textView = c0Var.f27239n;
        n9 n9Var = c0Var.h;
        if (aiComposeTone == null) {
            c0Var.d = false;
            c0Var.d();
            int i10 = R.drawable.tone_create;
            String string = LocaleController.getString(R.string.AIEditorStyleNewCreate);
            c0Var.f27238f = false;
            n9Var.setImageResource(i10);
            textView.setText(string);
        } else if (aiComposeTone instanceof a0) {
            c0Var.d = false;
            c0Var.d();
            int i11 = R.drawable.iv_prompt;
            String string2 = LocaleController.getString(R.string.AIEditorStylePrompt);
            c0Var.f27238f = false;
            n9Var.setImageResource(i11);
            textView.setText(string2);
        } else {
            String str = aiComposeTone.title;
            long j10 = aiComposeTone.emoji_id;
            c0Var.f27238f = true;
            n9Var.setColorFilter(null);
            n9Var.setImageDrawable(Emoji.getEmojiDrawable(null));
            textView.setText(str);
            int i12 = c0Var.f27234a;
            if (ConnectionsManager.getInstance(i12).isTestBackend()) {
                for (int i13 = 0; i13 < 4 && (!UserConfig.getInstance(i13).isClientActivated() || ConnectionsManager.getInstance(i13).isTestBackend()); i13++) {
                }
            }
            n9Var.setAnimatedEmojiDrawable(new k5(9, i12, j10));
        }
        c0Var.setOnClickListener(new nh.x1(28, callback, aiComposeTone));
        c0Var.setOnLongClickListener(new jh.f2(1, this, c0Var));
        b0 b0Var = this.f27586c;
        b0Var.addView(c0Var, h7.z5.o(b0Var.getOrientation() == 0 ? 0 : -1, b0Var.getOrientation() != 1 ? -1 : 0, 1.0f, 119));
    }

    public final void c(int i10) {
        if (this.f27588f == i10) {
            return;
        }
        this.f27588f = i10;
        b0 b0Var = this.f27586c;
        if (i10 >= 0 && i10 < b0Var.getChildCount()) {
            View childAt = b0Var.getChildAt(i10);
            if (childAt instanceof c0) {
                n9 n9Var = ((c0) childAt).h;
                if (n9Var.getAnimatedEmojiDrawable() != null) {
                    jh.y2 y2Var = n9Var.getAnimatedEmojiDrawable().f29961k;
                    if (y2Var != null) {
                        y2Var.startAnimation();
                    }
                } else {
                    n9Var.getImageReceiver().startAnimation();
                }
            }
        }
        b0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i10 = 0;
        while (true) {
            b0 b0Var = this.f27586c;
            if (i10 >= b0Var.getChildCount()) {
                return;
            }
            View childAt = b0Var.getChildAt(i10);
            if ((childAt instanceof c0) && (aiComposeTone2 = ((c0) childAt).f27237e) != null && aiComposeTone2 == aiComposeTone) {
                c(i10);
                return;
            }
            i10++;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f27587e) {
            Paint paintT0 = org.telegram.ui.ActionBar.g6.T0("paintDivider", this.f27585b);
            if (paintT0 == null) {
                paintT0 = org.telegram.ui.ActionBar.g6.f23175k0;
            }
            canvas.drawRect(AndroidUtilities.dp(10.0f), getHeight() - 1, getWidth() - AndroidUtilities.dp(10.0f), getHeight(), paintT0);
        }
    }

    public int getSelectedTab() {
        return this.f27588f;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i10 = this.f27588f;
        if (i10 < 0) {
            return null;
        }
        b0 b0Var = this.f27586c;
        if (i10 >= b0Var.getChildCount()) {
            return null;
        }
        View childAt = b0Var.getChildAt(this.f27588f);
        if (childAt instanceof c0) {
            return ((c0) childAt).f27237e;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f27587e = z10;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f27586c.setPadding(i10, i11, i12, i13);
    }

    public void setRoundRadius(int i10) {
        this.d = i10;
    }
}
