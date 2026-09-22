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
public final class f21 extends FrameLayout {
    public final ImageView f24086a;
    public final d21 f24087b;
    public final ThemeEditorView.EditorAlert f24088c;

    public f21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f24088c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.y5.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.y5.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f24086a = imageView2;
        imageView2.setScaleType(scaleType);
        fq fqVar = new fq();
        imageView2.setImageDrawable(fqVar);
        fqVar.f24322f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.y5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new i80(this, 21));
        d21 d21Var = new d21(this, context);
        this.f24087b = d21Var;
        d21Var.setTextSize(1, 16.0f);
        d21Var.setHintTextColor(-6774617);
        d21Var.setTextColor(-14540254);
        d21Var.setBackgroundDrawable(null);
        d21Var.setPadding(0, 0, 0, 0);
        d21Var.setMaxLines(1);
        d21Var.setLines(1);
        d21Var.setSingleLine(true);
        d21Var.setImeOptions(268435459);
        d21Var.setHint(LocaleController.getString(R.string.Search));
        d21Var.setCursorColor(-11491093);
        d21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        d21Var.setCursorWidth(1.5f);
        addView(d21Var, w7.y5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        d21Var.addTextChangedListener(new e21(this));
        d21Var.setOnEditorActionListener(new e1(this, 9));
    }
}
