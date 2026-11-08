package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.ThemeEditorView;
public final class vz0 extends FrameLayout {
    public final ImageView f39755a;
    public final tz0 f39756b;
    public final ThemeEditorView.EditorAlert f39757c;

    public vz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.f39757c = editorAlert;
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
        this.f39755a = imageView2;
        imageView2.setScaleType(scaleType);
        op opVar = new op();
        imageView2.setImageDrawable(opVar);
        opVar.f36678f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.ha.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new la0(this, 17));
        tz0 tz0Var = new tz0(this, context);
        this.f39756b = tz0Var;
        tz0Var.setTextSize(1, 16.0f);
        tz0Var.setHintTextColor(-6774617);
        tz0Var.setTextColor(-14540254);
        tz0Var.setBackgroundDrawable(null);
        tz0Var.setPadding(0, 0, 0, 0);
        tz0Var.setMaxLines(1);
        tz0Var.setLines(1);
        tz0Var.setSingleLine(true);
        tz0Var.setImeOptions(268435459);
        tz0Var.setHint(org.telegram.messenger.id.M0(2131745839, null));
        tz0Var.setCursorColor(-11491093);
        tz0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        tz0Var.setCursorWidth(1.5f);
        addView(tz0Var, c8.ha.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        tz0Var.addTextChangedListener(new uz0(this));
        tz0Var.setOnEditorActionListener(new t0(this, 10));
    }
}
