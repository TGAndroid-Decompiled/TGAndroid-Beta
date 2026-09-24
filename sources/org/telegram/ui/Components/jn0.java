package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class jn0 extends FrameLayout {
    public final View f25448a;
    public final ImageView f25449b;
    public final ImageView f25450c;
    public final ci.j2 d;
    public final ci.h2 e;
    public final org.telegram.ui.ActionBar.d6 f25451f;

    public jn0(Context context, float f7, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f25451f = d6Var;
        View view = new View(context);
        this.f25448a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.O5, d6Var)));
        addView(view, w7.y5.i(-1.0f, 36.0f, 8388659, f7, 11.0f, f7, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f25449b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Q5, d6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.y5.i(36.0f, 36.0f, 8388659, f7 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f25450c = imageView2;
        imageView2.setScaleType(scaleType);
        ci.j2 j2Var = new ci.j2(3, this);
        this.d = j2Var;
        imageView2.setImageDrawable(j2Var);
        j2Var.f24492f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.y5.i(36.0f, 36.0f, 8388661, f7, 11.0f, f7, 0.0f));
        imageView2.setOnClickListener(new i80(this, 12));
        ci.h2 h2Var = new ci.h2(this, context, 6);
        this.e = h2Var;
        h2Var.setTextSize(1, 16.0f);
        h2Var.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.P5, d6Var));
        h2Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.R5, d6Var));
        h2Var.setBackgroundDrawable(null);
        h2Var.setPadding(0, 0, 0, 0);
        h2Var.setMaxLines(1);
        h2Var.setLines(1);
        h2Var.setSingleLine(true);
        h2Var.setGravity(w7.y5.y() | 16);
        h2Var.setImeOptions(268435459);
        h2Var.setCursorColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Mh, d6Var));
        h2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        h2Var.setCursorWidth(1.5f);
        float f10 = f7 + 2.0f;
        addView(h2Var, w7.y5.i(-1.0f, 40.0f, 8388659, f10 + 38.0f, 9.0f, f10 + 30.0f, 0.0f));
        h2Var.addTextChangedListener(new ci.i2(this, 11));
        h2Var.setOnEditorActionListener(new e1(this, 5));
    }

    public abstract void a(String str);

    public gq getProgressDrawable() {
        return this.d;
    }

    public View getSearchBackground() {
        return this.f25448a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.e;
    }

    public void setHint(String str) {
        this.e.setHint(str);
    }
}
