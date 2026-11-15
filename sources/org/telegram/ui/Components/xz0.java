package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ThemeEditorView;
public final class xz0 extends FrameLayout {
    public final ImageView f41815a;
    public final vz0 f41816b;
    public final ThemeEditorView.EditorAlert f41817c;

    public xz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f41817c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(18.0f), -854795));
        addView(view, c8.ja.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232738);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, c8.ja.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f41815a = imageView2;
        imageView2.setScaleType(scaleType);
        wp wpVar = new wp();
        imageView2.setImageDrawable(wpVar);
        wpVar.f41418f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.ja.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new y60(this, 18));
        vz0 vz0Var = new vz0(this, context);
        this.f41816b = vz0Var;
        vz0Var.setTextSize(1, 16.0f);
        vz0Var.setHintTextColor(-6774617);
        vz0Var.setTextColor(-14540254);
        vz0Var.setBackgroundDrawable(null);
        vz0Var.setPadding(0, 0, 0, 0);
        vz0Var.setMaxLines(1);
        vz0Var.setLines(1);
        vz0Var.setSingleLine(true);
        vz0Var.setImeOptions(268435459);
        vz0Var.setHint(org.telegram.messenger.hd.M0(2131745836, null));
        vz0Var.setCursorColor(-11491093);
        vz0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        vz0Var.setCursorWidth(1.5f);
        addView(vz0Var, c8.ja.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        vz0Var.addTextChangedListener(new wz0(this));
        vz0Var.setOnEditorActionListener(new q0(this, 10));
    }
}
