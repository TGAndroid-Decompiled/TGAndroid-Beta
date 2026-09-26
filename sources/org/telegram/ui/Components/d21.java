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
public final class d21 extends FrameLayout {
    public final ImageView f23480a;
    public final b21 f23481b;
    public final ThemeEditorView.EditorAlert f23482c;

    public d21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f23482c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.y5.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.y5.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f23480a = imageView2;
        imageView2.setScaleType(scaleType);
        hq hqVar = new hq();
        imageView2.setImageDrawable(hqVar);
        hqVar.f24836f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.y5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new j80(this, 21));
        b21 b21Var = new b21(this, context);
        this.f23481b = b21Var;
        b21Var.setTextSize(1, 16.0f);
        b21Var.setHintTextColor(-6774617);
        b21Var.setTextColor(-14540254);
        b21Var.setBackgroundDrawable(null);
        b21Var.setPadding(0, 0, 0, 0);
        b21Var.setMaxLines(1);
        b21Var.setLines(1);
        b21Var.setSingleLine(true);
        b21Var.setImeOptions(268435459);
        b21Var.setHint(LocaleController.getString(R.string.Search));
        b21Var.setCursorColor(-11491093);
        b21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        b21Var.setCursorWidth(1.5f);
        addView(b21Var, w7.y5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        b21Var.addTextChangedListener(new c21(this));
        b21Var.setOnEditorActionListener(new e1(this, 9));
    }
}
