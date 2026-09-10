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
public final class c21 extends FrameLayout {
    public final ImageView f21977a;
    public final a21 f21978b;
    public final ThemeEditorView.EditorAlert f21979c;

    public c21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f21979c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.a6.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f21977a = imageView2;
        imageView2.setScaleType(scaleType);
        lq lqVar = new lq();
        imageView2.setImageDrawable(lqVar);
        lqVar.f25074f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.a6.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new g80(this, 21));
        a21 a21Var = new a21(this, context);
        this.f21978b = a21Var;
        a21Var.setTextSize(1, 16.0f);
        a21Var.setHintTextColor(-6774617);
        a21Var.setTextColor(-14540254);
        a21Var.setBackgroundDrawable(null);
        a21Var.setPadding(0, 0, 0, 0);
        a21Var.setMaxLines(1);
        a21Var.setLines(1);
        a21Var.setSingleLine(true);
        a21Var.setImeOptions(268435459);
        a21Var.setHint(LocaleController.getString(R.string.Search));
        a21Var.setCursorColor(-11491093);
        a21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        a21Var.setCursorWidth(1.5f);
        addView(a21Var, w7.a6.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        a21Var.addTextChangedListener(new b21(this));
        a21Var.setOnEditorActionListener(new g1(this, 9));
    }
}
