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
public final class x21 extends FrameLayout {
    public final ImageView f32809a;
    public final v21 f32810b;
    public final ThemeEditorView.EditorAlert f32811c;

    public x21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f32811c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.x5.a(36.0f, 14.0f, 11.0f, 14.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.a(36.0f, 16.0f, 11.0f, 0.0f, 0.0f, 36, 51));
        ImageView imageView2 = new ImageView(context);
        this.f32809a = imageView2;
        imageView2.setScaleType(scaleType);
        vq vqVar = new vq();
        imageView2.setImageDrawable(vqVar);
        vqVar.f32462f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.x5.a(36.0f, 14.0f, 11.0f, 14.0f, 0.0f, 36, 53));
        imageView2.setOnClickListener(new c90(this, 20));
        v21 v21Var = new v21(this, context);
        this.f32810b = v21Var;
        v21Var.setTextSize(1, 16.0f);
        v21Var.setHintTextColor(-6774617);
        v21Var.setTextColor(-14540254);
        v21Var.setBackgroundDrawable(null);
        v21Var.setPadding(0, 0, 0, 0);
        v21Var.setMaxLines(1);
        v21Var.setLines(1);
        v21Var.setSingleLine(true);
        v21Var.setImeOptions(268435459);
        v21Var.setHint(LocaleController.getString(R.string.Search));
        v21Var.setCursorColor(-11491093);
        v21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        v21Var.setCursorWidth(1.5f);
        addView(v21Var, w7.x5.a(40.0f, 54.0f, 9.0f, 46.0f, 0.0f, -1, 51));
        v21Var.addTextChangedListener(new w21(this));
        v21Var.setOnEditorActionListener(new e1(this, 10));
    }
}
