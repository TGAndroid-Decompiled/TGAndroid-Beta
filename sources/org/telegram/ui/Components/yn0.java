package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public abstract class yn0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final View f33004a;
    public final ImageView f33005b;
    public final ei.f2 f33006c;
    public final ei.e2 d;
    public final org.telegram.ui.ActionBar.g6 e;

    public yn0(Context context, float f7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = g6Var;
        View view = new View(context);
        this.f33004a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, g6Var)));
        addView(view, w7.z5.i(-1.0f, 36.0f, 8388659, f7, 11.0f, f7, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Q5, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.z5.i(36.0f, 36.0f, 8388659, f7 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f33005b = imageView2;
        imageView2.setScaleType(scaleType);
        ei.f2 f2Var = new ei.f2(3, this);
        this.f33006c = f2Var;
        imageView2.setImageDrawable(f2Var);
        f2Var.f29635f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.z5.i(36.0f, 36.0f, 8388661, f7, 11.0f, f7, 0.0f));
        imageView2.setOnClickListener(new v80(this, 11));
        ei.e2 e2Var = new ei.e2(this, context, 6);
        this.d = e2Var;
        e2Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.F(e2Var, org.telegram.ui.ActionBar.k6.P5, g6Var);
        org.telegram.ui.ActionBar.r6.W(e2Var, org.telegram.ui.ActionBar.k6.R5, g6Var);
        e2Var.setBackgroundDrawable(null);
        e2Var.setPadding(0, 0, 0, 0);
        e2Var.setMaxLines(1);
        e2Var.setLines(1);
        e2Var.setSingleLine(true);
        e2Var.setGravity(w7.z5.y() | 16);
        e2Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.r6.m(e2Var, 30, org.telegram.ui.ActionBar.k6.Mh, g6Var);
        e2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        e2Var.setCursorWidth(1.5f);
        float f10 = f7 + 2.0f;
        addView(e2Var, w7.z5.i(-1.0f, 40.0f, 8388659, f10 + 38.0f, 9.0f, f10 + 30.0f, 0.0f));
        e2Var.addTextChangedListener(new ai.u(this, 12));
        e2Var.setOnEditorActionListener(new d1(this, 6));
    }

    public abstract void a(String str);

    public pq getProgressDrawable() {
        return this.f33006c;
    }

    public View getSearchBackground() {
        return this.f33004a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.d;
    }

    public void setHint(String str) {
        this.d.setHint(str);
    }

    @Override
    public final void updateColors() {
        View view = this.f33004a;
        if (view != null) {
            try {
                org.telegram.ui.ActionBar.k6.z1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, this.e), view.getBackground());
                view.invalidate();
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
