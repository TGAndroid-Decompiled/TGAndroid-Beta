package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class en0 extends FrameLayout {
    public final View f26632a;
    public final ImageView f26633b;
    public final ImageView f26634c;
    public final org.telegram.ui.ActionBar.m0 d;
    public final lg.f f26635e;
    public final org.telegram.ui.ActionBar.g6 f26636f;

    public en0(Context context, float f10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f26636f = g6Var;
        View view = new View(context);
        this.f26632a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.O5, g6Var)));
        addView(view, k7.c6.i(-1.0f, 36.0f, 8388659, f10, 11.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f26633b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Q5, g6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.c6.i(36.0f, 36.0f, 8388659, f10 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f26634c = imageView2;
        imageView2.setScaleType(scaleType);
        org.telegram.ui.ActionBar.m0 m0Var = new org.telegram.ui.ActionBar.m0(2, this);
        this.d = m0Var;
        imageView2.setImageDrawable(m0Var);
        m0Var.f26978f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, k7.c6.i(36.0f, 36.0f, 8388661, f10, 11.0f, f10, 0.0f));
        imageView2.setOnClickListener(new b80(this, 12));
        lg.f fVar = new lg.f(this, context, 5);
        this.f26635e = fVar;
        fVar.setTextSize(1, 16.0f);
        fVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.P5, g6Var));
        fVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.R5, g6Var));
        fVar.setBackgroundDrawable(null);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setMaxLines(1);
        fVar.setLines(1);
        fVar.setSingleLine(true);
        fVar.setGravity(k7.c6.y() | 16);
        fVar.setImeOptions(268435459);
        fVar.setCursorColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Mh, g6Var));
        fVar.setCursorSize(AndroidUtilities.dp(20.0f));
        fVar.setCursorWidth(1.5f);
        float f11 = f10 + 2.0f;
        addView(fVar, k7.c6.i(-1.0f, 40.0f, 8388659, f11 + 38.0f, 9.0f, f11 + 30.0f, 0.0f));
        fVar.addTextChangedListener(new eh.c(this, 11));
        fVar.setOnEditorActionListener(new d1(this, 5));
    }

    public abstract void a(String str);

    public fq getProgressDrawable() {
        return this.d;
    }

    public View getSearchBackground() {
        return this.f26632a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.f26635e;
    }

    public void setHint(String str) {
        this.f26635e.setHint(str);
    }
}
