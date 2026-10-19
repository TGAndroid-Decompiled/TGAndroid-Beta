package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class un0 extends FrameLayout {
    public final View f31028a;
    public final ImageView f31029b;
    public final ImageView f31030c;
    public final ei.f2 d;
    public final ei.e2 e;
    public final org.telegram.ui.ActionBar.d6 f31031f;

    public un0(Context context, float f7, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f31031f = d6Var;
        View view = new View(context);
        this.f31028a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.O5, d6Var)));
        addView(view, w7.z5.i(-1.0f, 36.0f, 8388659, f7, 11.0f, f7, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f31029b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Q5, d6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.i(36.0f, 36.0f, 8388659, f7 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f31030c = imageView2;
        imageView2.setScaleType(scaleType);
        ei.f2 f2Var = new ei.f2(3, this);
        this.d = f2Var;
        imageView2.setImageDrawable(f2Var);
        f2Var.f29368f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.z5.i(36.0f, 36.0f, 8388661, f7, 11.0f, f7, 0.0f));
        imageView2.setOnClickListener(new u80(this, 11));
        ei.e2 e2Var = new ei.e2(this, context, 6);
        this.e = e2Var;
        e2Var.setTextSize(1, 16.0f);
        e2Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.P5, d6Var));
        e2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.R5, d6Var));
        e2Var.setBackgroundDrawable(null);
        e2Var.setPadding(0, 0, 0, 0);
        e2Var.setMaxLines(1);
        e2Var.setLines(1);
        e2Var.setSingleLine(true);
        e2Var.setGravity(w7.z5.y() | 16);
        e2Var.setImeOptions(268435459);
        e2Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Mh, d6Var));
        e2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        e2Var.setCursorWidth(1.5f);
        float f10 = f7 + 2.0f;
        addView(e2Var, w7.z5.i(-1.0f, 40.0f, 8388659, f10 + 38.0f, 9.0f, f10 + 30.0f, 0.0f));
        e2Var.addTextChangedListener(new ai.u(this, 12));
        e2Var.setOnEditorActionListener(new e1(this, 6));
    }

    public abstract void a(String str);

    public pq getProgressDrawable() {
        return this.d;
    }

    public View getSearchBackground() {
        return this.f31028a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.e;
    }

    public void setHint(String str) {
        this.e.setHint(str);
    }
}
