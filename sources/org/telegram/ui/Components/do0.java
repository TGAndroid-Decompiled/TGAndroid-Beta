package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class do0 extends FrameLayout {
    public final View f25852a;
    public final ImageView f25853b;
    public final ImageView f25854c;
    public final ci.i2 d;
    public final ci.g2 f25855e;
    public final org.telegram.ui.ActionBar.d6 f25856f;

    public do0(Context context, float f7, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f25856f = d6Var;
        View view = new View(context);
        this.f25852a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.O5, d6Var)));
        addView(view, w7.x5.i(-1.0f, 36.0f, 8388659, f7, 11.0f, f7, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f25853b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Q5, d6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.i(36.0f, 36.0f, 8388659, f7 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f25854c = imageView2;
        imageView2.setScaleType(scaleType);
        ci.i2 i2Var = new ci.i2(3, this);
        this.d = i2Var;
        imageView2.setImageDrawable(i2Var);
        i2Var.f32523f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.x5.i(36.0f, 36.0f, 8388661, f7, 11.0f, f7, 0.0f));
        imageView2.setOnClickListener(new b90(this, 11));
        ci.g2 g2Var = new ci.g2(this, context, 6);
        this.f25855e = g2Var;
        g2Var.setTextSize(1, 16.0f);
        g2Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.P5, d6Var));
        g2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.R5, d6Var));
        g2Var.setBackgroundDrawable(null);
        g2Var.setPadding(0, 0, 0, 0);
        g2Var.setMaxLines(1);
        g2Var.setLines(1);
        g2Var.setSingleLine(true);
        g2Var.setGravity(w7.x5.y() | 16);
        g2Var.setImeOptions(268435459);
        g2Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Mh, d6Var));
        g2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        g2Var.setCursorWidth(1.5f);
        float f10 = f7 + 2.0f;
        addView(g2Var, w7.x5.i(-1.0f, 40.0f, 8388659, f10 + 38.0f, 9.0f, f10 + 30.0f, 0.0f));
        g2Var.addTextChangedListener(new ci.h2(this, 11));
        g2Var.setOnEditorActionListener(new e1(this, 6));
    }

    public abstract void a(String str);

    public vq getProgressDrawable() {
        return this.d;
    }

    public View getSearchBackground() {
        return this.f25852a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.f25855e;
    }

    public void setHint(String str) {
        this.f25855e.setHint(str);
    }
}
