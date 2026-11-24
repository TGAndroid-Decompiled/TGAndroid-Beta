package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ThemeEditorView;
public final class g0 extends FrameLayout {
    public final ImageView a;
    public final e0 b;
    public final ThemeEditorView.EditorAlert c;

    public g0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(bkb.b0(gl.L(18.0f), -854795));
        addView(view, nme.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232742);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, nme.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.a = imageView2;
        imageView2.setScaleType(scaleType);
        wi2 wi2Var = new wi2();
        imageView2.setImageDrawable(wi2Var);
        wi2Var.f = gl.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, nme.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new bna(this, (byte) 18));
        e0 e0Var = new e0(this, context);
        this.b = e0Var;
        e0Var.setTextSize(1, 16.0f);
        e0Var.setHintTextColor(-6774617);
        e0Var.setTextColor(-14540254);
        e0Var.setBackgroundDrawable(null);
        e0Var.setPadding(0, 0, 0, 0);
        e0Var.setMaxLines(1);
        e0Var.setLines(1);
        e0Var.setSingleLine(true);
        e0Var.setImeOptions(268435459);
        e0Var.setHint(k96.M0(2131745644, null));
        e0Var.setCursorColor(-11491093);
        e0Var.setCursorSize(gl.L(20.0f));
        e0Var.setCursorWidth(1.5f);
        addView(e0Var, nme.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        e0Var.addTextChangedListener(new f0(this));
        e0Var.setOnEditorActionListener(new defpackage.j(this, (byte) 26));
    }
}
