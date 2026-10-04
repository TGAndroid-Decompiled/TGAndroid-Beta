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
public final class n21 extends FrameLayout {
    public final ImageView f28844a;
    public final l21 f28845b;
    public final ThemeEditorView.EditorAlert f28846c;

    public n21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f28846c = editorAlert;
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
        this.f28844a = imageView2;
        imageView2.setScaleType(scaleType);
        iq iqVar = new iq();
        imageView2.setImageDrawable(iqVar);
        iqVar.f27459f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.z5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new l80(this, 21));
        l21 l21Var = new l21(this, context);
        this.f28845b = l21Var;
        l21Var.setTextSize(1, 16.0f);
        l21Var.setHintTextColor(-6774617);
        l21Var.setTextColor(-14540254);
        l21Var.setBackgroundDrawable(null);
        l21Var.setPadding(0, 0, 0, 0);
        l21Var.setMaxLines(1);
        l21Var.setLines(1);
        l21Var.setSingleLine(true);
        l21Var.setImeOptions(268435459);
        l21Var.setHint(LocaleController.getString(R.string.Search));
        l21Var.setCursorColor(-11491093);
        l21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        l21Var.setCursorWidth(1.5f);
        addView(l21Var, w7.z5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        l21Var.addTextChangedListener(new m21(this));
        l21Var.setOnEditorActionListener(new e1(this, 9));
    }
}
