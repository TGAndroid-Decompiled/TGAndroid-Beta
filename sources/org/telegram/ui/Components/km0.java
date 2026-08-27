package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public abstract class km0 extends FrameLayout {

    public final View f30146a;

    public final ImageView f30147b;

    public final ImageView f30148c;
    public final lh.c2 d;

    public final gg.g f30149e;

    public final org.telegram.ui.ActionBar.c6 f30150f;

    public km0(Context context, float f10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f30150f = c6Var;
        View view = new View(context);
        this.f30146a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.O5, c6Var)));
        addView(view, h7.z5.i(-1.0f, 36.0f, 8388659, f10, 11.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30147b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Q5, c6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, h7.z5.i(36.0f, 36.0f, 8388659, f10 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30148c = imageView2;
        imageView2.setScaleType(scaleType);
        lh.c2 c2Var = new lh.c2(3, this);
        this.d = c2Var;
        imageView2.setImageDrawable(c2Var);
        c2Var.f32852f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, h7.z5.i(36.0f, 36.0f, 8388661, f10, 11.0f, f10, 0.0f));
        imageView2.setOnClickListener(new l70(this, 12));
        gg.g gVar = new gg.g(this, context, 7);
        this.f30149e = gVar;
        gVar.setTextSize(1, 16.0f);
        gVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.P5, c6Var));
        gVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.R5, c6Var));
        gVar.setBackgroundDrawable(null);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setMaxLines(1);
        gVar.setLines(1);
        gVar.setSingleLine(true);
        gVar.setGravity(h7.z5.y() | 16);
        gVar.setImeOptions(268435459);
        gVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Mh, c6Var));
        gVar.setCursorSize(AndroidUtilities.dp(20.0f));
        gVar.setCursorWidth(1.5f);
        float f11 = f10 + 2.0f;
        addView(gVar, h7.z5.i(-1.0f, 40.0f, 8388659, f11 + 38.0f, 9.0f, f11 + 30.0f, 0.0f));
        gVar.addTextChangedListener(new ch.e(this, 12));
        gVar.setOnEditorActionListener(new c1(this, 5));
    }

    public abstract void a(String str);

    public tp getProgressDrawable() {
        return this.d;
    }

    public View getSearchBackground() {
        return this.f30146a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.f30149e;
    }

    public void setHint(String str) {
        this.f30149e.setHint(str);
    }
}
