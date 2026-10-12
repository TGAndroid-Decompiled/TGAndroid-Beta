package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class io0 extends FrameLayout {
    public final View f27241a;
    public final ImageView f27242b;
    public final ImageView f27243c;
    public final ci.i2 d;
    public final ci.g2 f27244e;
    public final org.telegram.ui.ActionBar.c6 f27245f;

    public io0(Context context, float f7, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f27245f = c6Var;
        View view = new View(context);
        this.f27241a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.O5, c6Var)));
        addView(view, w7.w5.i(-1.0f, 36.0f, 8388659, f7, 11.0f, f7, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f27242b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Q5, c6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.w5.i(36.0f, 36.0f, 8388659, f7 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f27243c = imageView2;
        imageView2.setScaleType(scaleType);
        ci.i2 i2Var = new ci.i2(3, this);
        this.d = i2Var;
        imageView2.setImageDrawable(i2Var);
        i2Var.f32818f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.w5.i(36.0f, 36.0f, 8388661, f7, 11.0f, f7, 0.0f));
        imageView2.setOnClickListener(new f90(this, 12));
        ci.g2 g2Var = new ci.g2(this, context, 6);
        this.f27244e = g2Var;
        g2Var.setTextSize(1, 16.0f);
        g2Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.P5, c6Var));
        g2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.R5, c6Var));
        g2Var.setBackgroundDrawable(null);
        g2Var.setPadding(0, 0, 0, 0);
        g2Var.setMaxLines(1);
        g2Var.setLines(1);
        g2Var.setSingleLine(true);
        g2Var.setGravity(w7.w5.y() | 16);
        g2Var.setImeOptions(268435459);
        g2Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Mh, c6Var));
        g2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        g2Var.setCursorWidth(1.5f);
        float f10 = f7 + 2.0f;
        addView(g2Var, w7.w5.i(-1.0f, 40.0f, 8388659, f10 + 38.0f, 9.0f, f10 + 30.0f, 0.0f));
        g2Var.addTextChangedListener(new ci.h2(this, 12));
        g2Var.setOnEditorActionListener(new e1(this, 6));
    }

    public abstract void a(String str);

    public xq getProgressDrawable() {
        return this.d;
    }

    public View getSearchBackground() {
        return this.f27241a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.f27244e;
    }

    public void setHint(String str) {
        this.f27244e.setHint(str);
    }
}
