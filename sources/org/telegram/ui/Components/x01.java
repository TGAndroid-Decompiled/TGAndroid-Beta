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

public final class x01 extends FrameLayout {

    public final ImageView f34412a;

    public final v01 f34413b;

    public final ThemeEditorView.EditorAlert f34414c;

    public x01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f34414c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, h7.z5.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, h7.z5.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f34412a = imageView2;
        imageView2.setScaleType(scaleType);
        u01 u01Var = new u01();
        imageView2.setImageDrawable(u01Var);
        u01Var.f32852f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, h7.z5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new l70(this, 21));
        v01 v01Var = new v01(this, context);
        this.f34413b = v01Var;
        v01Var.setTextSize(1, 16.0f);
        v01Var.setHintTextColor(-6774617);
        v01Var.setTextColor(-14540254);
        v01Var.setBackgroundDrawable(null);
        v01Var.setPadding(0, 0, 0, 0);
        v01Var.setMaxLines(1);
        v01Var.setLines(1);
        v01Var.setSingleLine(true);
        v01Var.setImeOptions(268435459);
        v01Var.setHint(LocaleController.getString(R.string.Search));
        v01Var.setCursorColor(-11491093);
        v01Var.setCursorSize(AndroidUtilities.dp(20.0f));
        v01Var.setCursorWidth(1.5f);
        addView(v01Var, h7.z5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        v01Var.addTextChangedListener(new w01(this));
        v01Var.setOnEditorActionListener(new c1(this, 9));
    }
}
