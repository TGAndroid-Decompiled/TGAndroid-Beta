package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class wm0 extends FrameLayout {
    public final View f32319a;
    public final ImageView f32320b;
    public final ImageView f32321c;
    public final di.j2 d;
    public final di.h2 f32322e;
    public final org.telegram.ui.ActionBar.f6 f32323f;

    public wm0(Context context, float f7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f32323f = f6Var;
        View view = new View(context);
        this.f32319a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.O5, f6Var)));
        addView(view, w7.x5.i(-1.0f, 36.0f, 8388659, f7, 11.0f, f7, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f32320b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Q5, f6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.i(36.0f, 36.0f, 8388659, f7 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f32321c = imageView2;
        imageView2.setScaleType(scaleType);
        di.j2 j2Var = new di.j2(3, this);
        this.d = j2Var;
        imageView2.setImageDrawable(j2Var);
        j2Var.f25777f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.x5.i(36.0f, 36.0f, 8388661, f7, 11.0f, f7, 0.0f));
        imageView2.setOnClickListener(new x70(this, 12));
        di.h2 h2Var = new di.h2(this, context, 6);
        this.f32322e = h2Var;
        h2Var.setTextSize(1, 16.0f);
        h2Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.P5, f6Var));
        h2Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.R5, f6Var));
        h2Var.setBackgroundDrawable(null);
        h2Var.setPadding(0, 0, 0, 0);
        h2Var.setMaxLines(1);
        h2Var.setLines(1);
        h2Var.setSingleLine(true);
        h2Var.setGravity(w7.x5.y() | 16);
        h2Var.setImeOptions(268435459);
        h2Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Mh, f6Var));
        h2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        h2Var.setCursorWidth(1.5f);
        float f10 = f7 + 2.0f;
        addView(h2Var, w7.x5.i(-1.0f, 40.0f, 8388659, f10 + 38.0f, 9.0f, f10 + 30.0f, 0.0f));
        h2Var.addTextChangedListener(new di.i2(this, 11));
        h2Var.setOnEditorActionListener(new f1(this, 5));
    }

    public abstract void a(String str);

    public eq getProgressDrawable() {
        return this.d;
    }

    public View getSearchBackground() {
        return this.f32319a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.f32322e;
    }

    public void setHint(String str) {
        this.f32322e.setHint(str);
    }
}
