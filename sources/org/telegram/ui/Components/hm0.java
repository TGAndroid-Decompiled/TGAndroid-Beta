package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class hm0 extends FrameLayout {
    public final View f29129a;
    public final ImageView f29130b;
    public final ImageView f29131c;
    public final kh.e2 d;
    public final fg.g f29132e;
    public final org.telegram.ui.ActionBar.b6 f29133f;

    public hm0(Context context, float f10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f29133f = b6Var;
        View view = new View(context);
        this.f29129a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.O5, b6Var)));
        addView(view, g7.e6.i(-1.0f, 36.0f, 8388659, f10, 11.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f29130b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Q5, b6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.i(36.0f, 36.0f, 8388659, f10 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f29131c = imageView2;
        imageView2.setScaleType(scaleType);
        kh.e2 e2Var = new kh.e2(3, this);
        this.d = e2Var;
        imageView2.setImageDrawable(e2Var);
        e2Var.f33975f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, g7.e6.i(36.0f, 36.0f, 8388661, f10, 11.0f, f10, 0.0f));
        imageView2.setOnClickListener(new h70(this, 12));
        fg.g gVar = new fg.g(this, context, 7);
        this.f29132e = gVar;
        gVar.setTextSize(1, 16.0f);
        gVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.P5, b6Var));
        gVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.R5, b6Var));
        gVar.setBackgroundDrawable(null);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setMaxLines(1);
        gVar.setLines(1);
        gVar.setSingleLine(true);
        gVar.setGravity(g7.e6.y() | 16);
        gVar.setImeOptions(268435459);
        gVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Mh, b6Var));
        gVar.setCursorSize(AndroidUtilities.dp(20.0f));
        gVar.setCursorWidth(1.5f);
        float f11 = f10 + 2.0f;
        addView(gVar, g7.e6.i(-1.0f, 40.0f, 8388659, f11 + 38.0f, 9.0f, f11 + 30.0f, 0.0f));
        gVar.addTextChangedListener(new bh.f(this, 12));
        gVar.setOnEditorActionListener(new c1(this, 5));
    }

    public abstract void a(String str);

    public vp getProgressDrawable() {
        return this.d;
    }

    public View getSearchBackground() {
        return this.f29129a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.f29132e;
    }

    public void setHint(String str) {
        this.f29132e.setHint(str);
    }
}
