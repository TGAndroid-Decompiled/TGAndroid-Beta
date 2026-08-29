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
public final class h11 extends FrameLayout {
    public final ImageView f29032a;
    public final f11 f29033b;
    public final ThemeEditorView.EditorAlert f29034c;

    public h11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f29034c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, i7.f6.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, i7.f6.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f29032a = imageView2;
        imageView2.setScaleType(scaleType);
        zp zpVar = new zp();
        imageView2.setImageDrawable(zpVar);
        zpVar.f35387f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, i7.f6.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new u70(this, 21));
        f11 f11Var = new f11(this, context);
        this.f29033b = f11Var;
        f11Var.setTextSize(1, 16.0f);
        f11Var.setHintTextColor(-6774617);
        f11Var.setTextColor(-14540254);
        f11Var.setBackgroundDrawable(null);
        f11Var.setPadding(0, 0, 0, 0);
        f11Var.setMaxLines(1);
        f11Var.setLines(1);
        f11Var.setSingleLine(true);
        f11Var.setImeOptions(268435459);
        f11Var.setHint(LocaleController.getString(R.string.Search));
        f11Var.setCursorColor(-11491093);
        f11Var.setCursorSize(AndroidUtilities.dp(20.0f));
        f11Var.setCursorWidth(1.5f);
        addView(f11Var, i7.f6.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        f11Var.addTextChangedListener(new g11(this));
        f11Var.setOnEditorActionListener(new f1(this, 9));
    }
}
