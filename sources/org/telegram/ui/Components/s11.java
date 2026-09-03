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
public final class s11 extends FrameLayout {
    public final ImageView f30958a;
    public final q11 f30959b;
    public final ThemeEditorView.EditorAlert f30960c;

    public s11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f30960c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, k7.c6.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.c6.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30958a = imageView2;
        imageView2.setScaleType(scaleType);
        fq fqVar = new fq();
        imageView2.setImageDrawable(fqVar);
        fqVar.f26978f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, k7.c6.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new b80(this, 21));
        q11 q11Var = new q11(this, context);
        this.f30959b = q11Var;
        q11Var.setTextSize(1, 16.0f);
        q11Var.setHintTextColor(-6774617);
        q11Var.setTextColor(-14540254);
        q11Var.setBackgroundDrawable(null);
        q11Var.setPadding(0, 0, 0, 0);
        q11Var.setMaxLines(1);
        q11Var.setLines(1);
        q11Var.setSingleLine(true);
        q11Var.setImeOptions(268435459);
        q11Var.setHint(LocaleController.getString(R.string.Search));
        q11Var.setCursorColor(-11491093);
        q11Var.setCursorSize(AndroidUtilities.dp(20.0f));
        q11Var.setCursorWidth(1.5f);
        addView(q11Var, k7.c6.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        q11Var.addTextChangedListener(new r11(this));
        q11Var.setOnEditorActionListener(new d1(this, 9));
    }
}
