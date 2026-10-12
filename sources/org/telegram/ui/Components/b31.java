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
public final class b31 extends FrameLayout {
    public final ImageView f24562a;
    public final z21 f24563b;
    public final ThemeEditorView.EditorAlert f24564c;

    public b31(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f24564c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.w5.a(36.0f, 14.0f, 11.0f, 14.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.w5.a(36.0f, 16.0f, 11.0f, 0.0f, 0.0f, 36, 51));
        ImageView imageView2 = new ImageView(context);
        this.f24562a = imageView2;
        imageView2.setScaleType(scaleType);
        xq xqVar = new xq();
        imageView2.setImageDrawable(xqVar);
        xqVar.f32828f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.w5.a(36.0f, 14.0f, 11.0f, 14.0f, 0.0f, 36, 53));
        imageView2.setOnClickListener(new f90(this, 21));
        z21 z21Var = new z21(this, context);
        this.f24563b = z21Var;
        z21Var.setTextSize(1, 16.0f);
        z21Var.setHintTextColor(-6774617);
        z21Var.setTextColor(-14540254);
        z21Var.setBackgroundDrawable(null);
        z21Var.setPadding(0, 0, 0, 0);
        z21Var.setMaxLines(1);
        z21Var.setLines(1);
        z21Var.setSingleLine(true);
        z21Var.setImeOptions(268435459);
        z21Var.setHint(LocaleController.getString(R.string.Search));
        z21Var.setCursorColor(-11491093);
        z21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        z21Var.setCursorWidth(1.5f);
        addView(z21Var, w7.w5.a(40.0f, 54.0f, 9.0f, 46.0f, 0.0f, -1, 51));
        z21Var.addTextChangedListener(new a31(this));
        z21Var.setOnEditorActionListener(new e1(this, 10));
    }
}
