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
public final class p11 extends FrameLayout {
    public final ImageView f26924a;
    public final n11 f26925b;
    public final ThemeEditorView.EditorAlert f26926c;

    public p11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f26926c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.x5.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f26924a = imageView2;
        imageView2.setScaleType(scaleType);
        fq fqVar = new fq();
        imageView2.setImageDrawable(fqVar);
        fqVar.f24053f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.x5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new x70(this, 21));
        n11 n11Var = new n11(this, context);
        this.f26925b = n11Var;
        n11Var.setTextSize(1, 16.0f);
        n11Var.setHintTextColor(-6774617);
        n11Var.setTextColor(-14540254);
        n11Var.setBackgroundDrawable(null);
        n11Var.setPadding(0, 0, 0, 0);
        n11Var.setMaxLines(1);
        n11Var.setLines(1);
        n11Var.setSingleLine(true);
        n11Var.setImeOptions(268435459);
        n11Var.setHint(LocaleController.getString(R.string.Search));
        n11Var.setCursorColor(-11491093);
        n11Var.setCursorSize(AndroidUtilities.dp(20.0f));
        n11Var.setCursorWidth(1.5f);
        addView(n11Var, w7.x5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        n11Var.addTextChangedListener(new o11(this));
        n11Var.setOnEditorActionListener(new e1(this, 9));
    }
}
