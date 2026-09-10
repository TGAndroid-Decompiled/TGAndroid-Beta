package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class gn0 extends FrameLayout {
    public final View f23388a;
    public final ImageView f23389b;
    public final ImageView f23390c;
    public final bi.v2 d;
    public final bi.t2 e;
    public final org.telegram.ui.ActionBar.f6 f23391f;

    public gn0(Context context, float f7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23391f = f6Var;
        View view = new View(context);
        this.f23388a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.O5, f6Var)));
        addView(view, w7.a6.i(-1.0f, 36.0f, 8388659, f7, 11.0f, f7, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f23389b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Q5, f6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.i(36.0f, 36.0f, 8388659, f7 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f23390c = imageView2;
        imageView2.setScaleType(scaleType);
        bi.v2 v2Var = new bi.v2(3, this);
        this.d = v2Var;
        imageView2.setImageDrawable(v2Var);
        v2Var.f25074f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.a6.i(36.0f, 36.0f, 8388661, f7, 11.0f, f7, 0.0f));
        imageView2.setOnClickListener(new g80(this, 12));
        bi.t2 t2Var = new bi.t2(this, context, 6);
        this.e = t2Var;
        t2Var.setTextSize(1, 16.0f);
        t2Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.P5, f6Var));
        t2Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.R5, f6Var));
        t2Var.setBackgroundDrawable(null);
        t2Var.setPadding(0, 0, 0, 0);
        t2Var.setMaxLines(1);
        t2Var.setLines(1);
        t2Var.setSingleLine(true);
        t2Var.setGravity(w7.a6.y() | 16);
        t2Var.setImeOptions(268435459);
        t2Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Mh, f6Var));
        t2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        t2Var.setCursorWidth(1.5f);
        float f10 = f7 + 2.0f;
        addView(t2Var, w7.a6.i(-1.0f, 40.0f, 8388659, f10 + 38.0f, 9.0f, f10 + 30.0f, 0.0f));
        t2Var.addTextChangedListener(new bi.u2(this, 11));
        t2Var.setOnEditorActionListener(new g1(this, 5));
    }

    public abstract void a(String str);

    public lq getProgressDrawable() {
        return this.d;
    }

    public View getSearchBackground() {
        return this.f23388a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.e;
    }

    public void setHint(String str) {
        this.e.setHint(str);
    }
}
