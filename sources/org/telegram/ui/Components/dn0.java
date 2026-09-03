package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class dn0 extends FrameLayout {
    public final View f24325a;
    public final ImageView f24326b;
    public final ImageView f24327c;
    public final org.telegram.ui.ActionBar.m0 d;
    public final kg.f e;
    public final org.telegram.ui.ActionBar.f6 f24328f;

    public dn0(Context context, float f10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24328f = f6Var;
        View view = new View(context);
        this.f24325a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.O5, f6Var)));
        addView(view, k7.b6.i(-1.0f, 36.0f, 8388659, f10, 11.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f24326b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Q5, f6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.b6.i(36.0f, 36.0f, 8388659, f10 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f24327c = imageView2;
        imageView2.setScaleType(scaleType);
        org.telegram.ui.ActionBar.m0 m0Var = new org.telegram.ui.ActionBar.m0(2, this);
        this.d = m0Var;
        imageView2.setImageDrawable(m0Var);
        m0Var.f24014f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, k7.b6.i(36.0f, 36.0f, 8388661, f10, 11.0f, f10, 0.0f));
        imageView2.setOnClickListener(new a80(this, 12));
        kg.f fVar = new kg.f(this, context, 5);
        this.e = fVar;
        fVar.setTextSize(1, 16.0f);
        fVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.P5, f6Var));
        fVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.R5, f6Var));
        fVar.setBackgroundDrawable(null);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setMaxLines(1);
        fVar.setLines(1);
        fVar.setSingleLine(true);
        fVar.setGravity(k7.b6.y() | 16);
        fVar.setImeOptions(268435459);
        fVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Mh, f6Var));
        fVar.setCursorSize(AndroidUtilities.dp(20.0f));
        fVar.setCursorWidth(1.5f);
        float f11 = f10 + 2.0f;
        addView(fVar, k7.b6.i(-1.0f, 40.0f, 8388659, f11 + 38.0f, 9.0f, f11 + 30.0f, 0.0f));
        fVar.addTextChangedListener(new dh.c(this, 11));
        fVar.setOnEditorActionListener(new d1(this, 5));
    }

    public abstract void a(String str);

    public cq getProgressDrawable() {
        return this.d;
    }

    public View getSearchBackground() {
        return this.f24325a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.e;
    }

    public void setHint(String str) {
        this.e.setHint(str);
    }
}
