package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ThemeEditorView;
public final class z01 extends FrameLayout {
    public final ImageView f32862a;
    public final x01 f32863b;
    public final ThemeEditorView.EditorAlert f32864c;

    public z01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f32864c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(18.0f), -854795));
        addView(view, w7.b6.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232734);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.b6.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f32862a = imageView2;
        imageView2.setScaleType(scaleType);
        vp vpVar = new vp();
        imageView2.setImageDrawable(vpVar);
        vpVar.f31806f = org.telegram.messenger.i0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.b6.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new db0(this, 18));
        x01 x01Var = new x01(this, context);
        this.f32863b = x01Var;
        x01Var.setTextSize(1, 16.0f);
        x01Var.setHintTextColor(-6774617);
        x01Var.setTextColor(-14540254);
        x01Var.setBackgroundDrawable(null);
        x01Var.setPadding(0, 0, 0, 0);
        x01Var.setMaxLines(1);
        x01Var.setLines(1);
        x01Var.setSingleLine(true);
        x01Var.setImeOptions(268435459);
        x01Var.setHint(org.telegram.messenger.cd.L0(2131745853, null));
        x01Var.setCursorColor(-11491093);
        x01Var.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        x01Var.setCursorWidth(1.5f);
        addView(x01Var, w7.b6.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        x01Var.addTextChangedListener(new y01(this));
        x01Var.setOnEditorActionListener(new t0(this, 10));
    }
}
