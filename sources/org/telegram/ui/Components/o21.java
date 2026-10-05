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
public final class o21 extends FrameLayout {
    public final ImageView f29322a;
    public final m21 f29323b;
    public final ThemeEditorView.EditorAlert f29324c;

    public o21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f29324c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.z5.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f29322a = imageView2;
        imageView2.setScaleType(scaleType);
        iq iqVar = new iq();
        imageView2.setImageDrawable(iqVar);
        iqVar.f27562f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.z5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new l80(this, 21));
        m21 m21Var = new m21(this, context);
        this.f29323b = m21Var;
        m21Var.setTextSize(1, 16.0f);
        m21Var.setHintTextColor(-6774617);
        m21Var.setTextColor(-14540254);
        m21Var.setBackgroundDrawable(null);
        m21Var.setPadding(0, 0, 0, 0);
        m21Var.setMaxLines(1);
        m21Var.setLines(1);
        m21Var.setSingleLine(true);
        m21Var.setImeOptions(268435459);
        m21Var.setHint(LocaleController.getString(R.string.Search));
        m21Var.setCursorColor(-11491093);
        m21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        m21Var.setCursorWidth(1.5f);
        addView(m21Var, w7.z5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        m21Var.addTextChangedListener(new n21(this));
        m21Var.setOnEditorActionListener(new e1(this, 9));
    }
}
