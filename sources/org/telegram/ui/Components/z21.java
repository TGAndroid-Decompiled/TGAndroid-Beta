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
public final class z21 extends FrameLayout {
    public final ImageView f35224a;
    public final x21 f35225b;
    public final ThemeEditorView.EditorAlert f35226c;

    public z21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f35226c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, kb1.h(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, kb1.h(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f35224a = imageView2;
        imageView2.setScaleType(scaleType);
        rq rqVar = new rq();
        imageView2.setImageDrawable(rqVar);
        rqVar.f32321f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, kb1.h(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new x80(this, 19));
        x21 x21Var = new x21(this, context);
        this.f35225b = x21Var;
        x21Var.setTextSize(1, 16.0f);
        x21Var.setHintTextColor(-6774617);
        x21Var.setTextColor(-14540254);
        x21Var.setBackgroundDrawable(null);
        x21Var.setPadding(0, 0, 0, 0);
        x21Var.setMaxLines(1);
        x21Var.setLines(1);
        x21Var.setSingleLine(true);
        x21Var.setImeOptions(268435459);
        x21Var.setHint(LocaleController.getString(R.string.Search));
        x21Var.setCursorColor(-11491093);
        x21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        x21Var.setCursorWidth(1.5f);
        addView(x21Var, kb1.h(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        x21Var.addTextChangedListener(new y21(this));
        x21Var.setOnEditorActionListener(new d1(this, 10));
    }
}
