package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ThemeEditorView;
public final class g01 extends FrameLayout {
    public final ImageView f35319a;
    public final e01 f35320b;
    public final ThemeEditorView.EditorAlert f35321c;

    public g01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f35321c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), -854795));
        addView(view, c8.na.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232739);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, c8.na.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f35319a = imageView2;
        imageView2.setScaleType(scaleType);
        fq fqVar = new fq();
        imageView2.setImageDrawable(fqVar);
        fqVar.f35261f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.na.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new j70(this, 19));
        e01 e01Var = new e01(this, context);
        this.f35320b = e01Var;
        e01Var.setTextSize(1, 16.0f);
        e01Var.setHintTextColor(-6774617);
        e01Var.setTextColor(-14540254);
        e01Var.setBackgroundDrawable(null);
        e01Var.setPadding(0, 0, 0, 0);
        e01Var.setMaxLines(1);
        e01Var.setLines(1);
        e01Var.setSingleLine(true);
        e01Var.setImeOptions(268435459);
        e01Var.setHint(org.telegram.messenger.hd.N0(2131745640, null));
        e01Var.setCursorColor(-11491093);
        e01Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        e01Var.setCursorWidth(1.5f);
        addView(e01Var, c8.na.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        e01Var.addTextChangedListener(new f01(this));
        e01Var.setOnEditorActionListener(new h(this, 11));
    }
}
