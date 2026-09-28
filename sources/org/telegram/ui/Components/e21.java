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
public final class e21 extends FrameLayout {
    public final ImageView f23841a;
    public final c21 f23842b;
    public final ThemeEditorView.EditorAlert f23843c;

    public e21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f23843c = editorAlert;
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
        this.f23841a = imageView2;
        imageView2.setScaleType(scaleType);
        hq hqVar = new hq();
        imageView2.setImageDrawable(hqVar);
        hqVar.f24868f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.y5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new k80(this, 21));
        c21 c21Var = new c21(this, context);
        this.f23842b = c21Var;
        c21Var.setTextSize(1, 16.0f);
        c21Var.setHintTextColor(-6774617);
        c21Var.setTextColor(-14540254);
        c21Var.setBackgroundDrawable(null);
        c21Var.setPadding(0, 0, 0, 0);
        c21Var.setMaxLines(1);
        c21Var.setLines(1);
        c21Var.setSingleLine(true);
        c21Var.setImeOptions(268435459);
        c21Var.setHint(LocaleController.getString(R.string.Search));
        c21Var.setCursorColor(-11491093);
        c21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c21Var.setCursorWidth(1.5f);
        addView(c21Var, w7.y5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        c21Var.addTextChangedListener(new d21(this));
        c21Var.setOnEditorActionListener(new e1(this, 9));
    }
}
