package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ThemeEditorView;
public final class v01 extends FrameLayout {
    public final ImageView f33195a;
    public final t01 f33196b;
    public final ThemeEditorView.EditorAlert f33197c;

    public v01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f33197c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, g7.e6.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f33195a = imageView2;
        imageView2.setScaleType(scaleType);
        vp vpVar = new vp();
        imageView2.setImageDrawable(vpVar);
        vpVar.f33975f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, g7.e6.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new h70(this, 21));
        t01 t01Var = new t01(this, context);
        this.f33196b = t01Var;
        t01Var.setTextSize(1, 16.0f);
        t01Var.setHintTextColor(-6774617);
        t01Var.setTextColor(-14540254);
        t01Var.setBackgroundDrawable(null);
        t01Var.setPadding(0, 0, 0, 0);
        t01Var.setMaxLines(1);
        t01Var.setLines(1);
        t01Var.setSingleLine(true);
        t01Var.setImeOptions(268435459);
        t01Var.setHint(LocaleController.getString(R.string.Search));
        t01Var.setCursorColor(-11491093);
        t01Var.setCursorSize(AndroidUtilities.dp(20.0f));
        t01Var.setCursorWidth(1.5f);
        addView(t01Var, g7.e6.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        t01Var.addTextChangedListener(new u01(this));
        t01Var.setOnEditorActionListener(new c1(this, 9));
    }
}
