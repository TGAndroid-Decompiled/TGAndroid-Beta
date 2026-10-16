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
public final class s21 extends FrameLayout {
    public final ImageView f28708a;
    public final q21 f28709b;
    public final ThemeEditorView.EditorAlert f28710c;

    public s21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f28710c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.z5.a(36.0f, 14.0f, 11.0f, 14.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.a(36.0f, 16.0f, 11.0f, 0.0f, 0.0f, 36, 51));
        ImageView imageView2 = new ImageView(context);
        this.f28708a = imageView2;
        imageView2.setScaleType(scaleType);
        sq sqVar = new sq();
        imageView2.setImageDrawable(sqVar);
        sqVar.f28880f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.z5.a(36.0f, 14.0f, 11.0f, 14.0f, 0.0f, 36, 53));
        imageView2.setOnClickListener(new y80(this, 20));
        q21 q21Var = new q21(this, context);
        this.f28709b = q21Var;
        q21Var.setTextSize(1, 16.0f);
        q21Var.setHintTextColor(-6774617);
        q21Var.setTextColor(-14540254);
        q21Var.setBackgroundDrawable(null);
        q21Var.setPadding(0, 0, 0, 0);
        q21Var.setMaxLines(1);
        q21Var.setLines(1);
        q21Var.setSingleLine(true);
        q21Var.setImeOptions(268435459);
        q21Var.setHint(LocaleController.getString(R.string.Search));
        q21Var.setCursorColor(-11491093);
        q21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        q21Var.setCursorWidth(1.5f);
        addView(q21Var, w7.z5.a(40.0f, 54.0f, 9.0f, 46.0f, 0.0f, -1, 51));
        q21Var.addTextChangedListener(new r21(this));
        q21Var.setOnEditorActionListener(new e1(this, 10));
    }
}
