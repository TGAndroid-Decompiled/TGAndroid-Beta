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
public final class y21 extends FrameLayout {
    public final ImageView f34911a;
    public final w21 f34912b;
    public final ThemeEditorView.EditorAlert f34913c;

    public y21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f34913c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, gb1.h(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, gb1.h(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f34911a = imageView2;
        imageView2.setScaleType(scaleType);
        rq rqVar = new rq();
        imageView2.setImageDrawable(rqVar);
        rqVar.f32283f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, gb1.h(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new w80(this, 19));
        w21 w21Var = new w21(this, context);
        this.f34912b = w21Var;
        w21Var.setTextSize(1, 16.0f);
        w21Var.setHintTextColor(-6774617);
        w21Var.setTextColor(-14540254);
        w21Var.setBackgroundDrawable(null);
        w21Var.setPadding(0, 0, 0, 0);
        w21Var.setMaxLines(1);
        w21Var.setLines(1);
        w21Var.setSingleLine(true);
        w21Var.setImeOptions(268435459);
        w21Var.setHint(LocaleController.getString(R.string.Search));
        w21Var.setCursorColor(-11491093);
        w21Var.setCursorSize(AndroidUtilities.dp(20.0f));
        w21Var.setCursorWidth(1.5f);
        addView(w21Var, gb1.h(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        w21Var.addTextChangedListener(new x21(this));
        w21Var.setOnEditorActionListener(new d1(this, 10));
    }
}
