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
public final class l21 extends FrameLayout {
    public final ImageView f28061a;
    public final j21 f28062b;
    public final ThemeEditorView.EditorAlert f28063c;

    public l21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f28063c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.z5.a(36.0f, 14.0f, 11.0f, 14.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.a(36.0f, 16.0f, 11.0f, 0.0f, 0.0f, 36, 51));
        ImageView imageView2 = new ImageView(context);
        this.f28061a = imageView2;
        imageView2.setScaleType(scaleType);
        pq pqVar = new pq();
        imageView2.setImageDrawable(pqVar);
        pqVar.f29403f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.z5.a(36.0f, 14.0f, 11.0f, 14.0f, 0.0f, 36, 53));
        imageView2.setOnClickListener(new u80(this, 20));
        j21 j21Var = new j21(this, context);
        this.f28062b = j21Var;
        j21Var.setTextSize(1, 16.0f);
        j21Var.setHintTextColor(-6774617);
        j21Var.setTextColor(-14540254);
        j21Var.setBackgroundDrawable(null);
        j21Var.setPadding(0, 0, 0, 0);
        j21Var.setMaxLines(1);
        j21Var.setLines(1);
        j21Var.setSingleLine(true);
        j21Var.setImeOptions(268435459);
        j21Var.setHint(LocaleController.getString(R.string.Search));
        j21Var.setCursorColor(-11491093);
        j21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        j21Var.setCursorWidth(1.5f);
        addView(j21Var, w7.z5.a(40.0f, 54.0f, 9.0f, 46.0f, 0.0f, -1, 51));
        j21Var.addTextChangedListener(new k21(this));
        j21Var.setOnEditorActionListener(new e1(this, 10));
    }
}
