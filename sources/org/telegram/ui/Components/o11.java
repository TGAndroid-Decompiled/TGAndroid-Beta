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
public final class o11 extends FrameLayout {
    public final ImageView f28922a;
    public final m11 f28923b;
    public final ThemeEditorView.EditorAlert f28924c;

    public o11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f28924c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.x5.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f28922a = imageView2;
        imageView2.setScaleType(scaleType);
        eq eqVar = new eq();
        imageView2.setImageDrawable(eqVar);
        eqVar.f25750f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.x5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new x70(this, 21));
        m11 m11Var = new m11(this, context);
        this.f28923b = m11Var;
        m11Var.setTextSize(1, 16.0f);
        m11Var.setHintTextColor(-6774617);
        m11Var.setTextColor(-14540254);
        m11Var.setBackgroundDrawable(null);
        m11Var.setPadding(0, 0, 0, 0);
        m11Var.setMaxLines(1);
        m11Var.setLines(1);
        m11Var.setSingleLine(true);
        m11Var.setImeOptions(268435459);
        m11Var.setHint(LocaleController.getString(R.string.Search));
        m11Var.setCursorColor(-11491093);
        m11Var.setCursorSize(AndroidUtilities.dp(20.0f));
        m11Var.setCursorWidth(1.5f);
        addView(m11Var, w7.x5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        m11Var.addTextChangedListener(new n11(this));
        m11Var.setOnEditorActionListener(new f1(this, 9));
    }
}
