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
public final class m21 extends FrameLayout {
    public final ImageView f28368a;
    public final k21 f28369b;
    public final ThemeEditorView.EditorAlert f28370c;

    public m21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f28370c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.z5.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f28368a = imageView2;
        imageView2.setScaleType(scaleType);
        pq pqVar = new pq();
        imageView2.setImageDrawable(pqVar);
        pqVar.f29368f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.z5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new u80(this, 20));
        k21 k21Var = new k21(this, context);
        this.f28369b = k21Var;
        k21Var.setTextSize(1, 16.0f);
        k21Var.setHintTextColor(-6774617);
        k21Var.setTextColor(-14540254);
        k21Var.setBackgroundDrawable(null);
        k21Var.setPadding(0, 0, 0, 0);
        k21Var.setMaxLines(1);
        k21Var.setLines(1);
        k21Var.setSingleLine(true);
        k21Var.setImeOptions(268435459);
        k21Var.setHint(LocaleController.getString(R.string.Search));
        k21Var.setCursorColor(-11491093);
        k21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        k21Var.setCursorWidth(1.5f);
        addView(k21Var, w7.z5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        k21Var.addTextChangedListener(new l21(this));
        k21Var.setOnEditorActionListener(new e1(this, 10));
    }
}
