package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ThemeEditorView;
public final class uz0 extends FrameLayout {
    public final ImageView f38765a;
    public final sz0 f38766b;
    public final ThemeEditorView.EditorAlert f38767c;

    public uz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f38767c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), -854795));
        addView(view, c8.ha.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232737);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, c8.ha.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f38765a = imageView2;
        imageView2.setScaleType(scaleType);
        op opVar = new op();
        imageView2.setImageDrawable(opVar);
        opVar.f36640f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.ha.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new la0(this, 17));
        sz0 sz0Var = new sz0(this, context);
        this.f38766b = sz0Var;
        sz0Var.setTextSize(1, 16.0f);
        sz0Var.setHintTextColor(-6774617);
        sz0Var.setTextColor(-14540254);
        sz0Var.setBackgroundDrawable(null);
        sz0Var.setPadding(0, 0, 0, 0);
        sz0Var.setMaxLines(1);
        sz0Var.setLines(1);
        sz0Var.setSingleLine(true);
        sz0Var.setImeOptions(268435459);
        sz0Var.setHint(org.telegram.messenger.hd.M0(2131745837, null));
        sz0Var.setCursorColor(-11491093);
        sz0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        sz0Var.setCursorWidth(1.5f);
        addView(sz0Var, c8.ha.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        sz0Var.addTextChangedListener(new tz0(this));
        sz0Var.setOnEditorActionListener(new t0(this, 10));
    }
}
