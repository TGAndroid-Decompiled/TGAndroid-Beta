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
public final class u21 extends FrameLayout {
    public final ImageView f31347a;
    public final s21 f31348b;
    public final ThemeEditorView.EditorAlert f31349c;

    public u21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f31349c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.x5.a(36.0f, 14.0f, 11.0f, 14.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.a(36.0f, 16.0f, 11.0f, 0.0f, 0.0f, 36, 51));
        ImageView imageView2 = new ImageView(context);
        this.f31347a = imageView2;
        imageView2.setScaleType(scaleType);
        vq vqVar = new vq();
        imageView2.setImageDrawable(vqVar);
        vqVar.f32422f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.x5.a(36.0f, 14.0f, 11.0f, 14.0f, 0.0f, 36, 53));
        imageView2.setOnClickListener(new b90(this, 20));
        s21 s21Var = new s21(this, context);
        this.f31348b = s21Var;
        s21Var.setTextSize(1, 16.0f);
        s21Var.setHintTextColor(-6774617);
        s21Var.setTextColor(-14540254);
        s21Var.setBackgroundDrawable(null);
        s21Var.setPadding(0, 0, 0, 0);
        s21Var.setMaxLines(1);
        s21Var.setLines(1);
        s21Var.setSingleLine(true);
        s21Var.setImeOptions(268435459);
        s21Var.setHint(LocaleController.getString(R.string.Search));
        s21Var.setCursorColor(-11491093);
        s21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        s21Var.setCursorWidth(1.5f);
        addView(s21Var, w7.x5.a(40.0f, 54.0f, 9.0f, 46.0f, 0.0f, -1, 51));
        s21Var.addTextChangedListener(new t21(this));
        s21Var.setOnEditorActionListener(new e1(this, 10));
    }
}
