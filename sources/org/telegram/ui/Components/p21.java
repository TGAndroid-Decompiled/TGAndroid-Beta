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
public final class p21 extends FrameLayout {
    public final ImageView f29455a;
    public final n21 f29456b;
    public final ThemeEditorView.EditorAlert f29457c;

    public p21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f29457c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.z5.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f29455a = imageView2;
        imageView2.setScaleType(scaleType);
        nq nqVar = new nq();
        imageView2.setImageDrawable(nqVar);
        nqVar.f28995f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.z5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new t80(this, 20));
        n21 n21Var = new n21(this, context);
        this.f29456b = n21Var;
        n21Var.setTextSize(1, 16.0f);
        n21Var.setHintTextColor(-6774617);
        n21Var.setTextColor(-14540254);
        n21Var.setBackgroundDrawable(null);
        n21Var.setPadding(0, 0, 0, 0);
        n21Var.setMaxLines(1);
        n21Var.setLines(1);
        n21Var.setSingleLine(true);
        n21Var.setImeOptions(268435459);
        n21Var.setHint(LocaleController.getString(R.string.Search));
        n21Var.setCursorColor(-11491093);
        n21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        n21Var.setCursorWidth(1.5f);
        addView(n21Var, w7.z5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        n21Var.addTextChangedListener(new o21(this));
        n21Var.setOnEditorActionListener(new c1(this, 10));
    }
}
