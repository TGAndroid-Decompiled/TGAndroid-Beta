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
public final class q21 extends FrameLayout {
    public final ImageView f29761a;
    public final o21 f29762b;
    public final ThemeEditorView.EditorAlert f29763c;

    public q21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f29763c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.z5.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f29761a = imageView2;
        imageView2.setScaleType(scaleType);
        pq pqVar = new pq();
        imageView2.setImageDrawable(pqVar);
        pqVar.f29635f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.z5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new v80(this, 20));
        o21 o21Var = new o21(this, context);
        this.f29762b = o21Var;
        o21Var.setTextSize(1, 16.0f);
        o21Var.setHintTextColor(-6774617);
        o21Var.setTextColor(-14540254);
        o21Var.setBackgroundDrawable(null);
        o21Var.setPadding(0, 0, 0, 0);
        o21Var.setMaxLines(1);
        o21Var.setLines(1);
        o21Var.setSingleLine(true);
        o21Var.setImeOptions(268435459);
        o21Var.setHint(LocaleController.getString(R.string.Search));
        o21Var.setCursorColor(-11491093);
        o21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        o21Var.setCursorWidth(1.5f);
        addView(o21Var, w7.z5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        o21Var.addTextChangedListener(new p21(this));
        o21Var.setOnEditorActionListener(new d1(this, 10));
    }
}
