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
public abstract class do0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final View f27572a;
    public final ImageView f27573b;
    public final fi.d2 f27574c;
    public final fi.c2 d;
    public final org.telegram.ui.ActionBar.u6 e;

    public do0(Context context, float f7, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = u6Var;
        View view = new View(context);
        this.f27572a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.O5, u6Var)));
        addView(view, gb1.m(-1.0f, 36.0f, 8388659, f7, 11.0f, f7, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Q5, u6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, gb1.m(36.0f, 36.0f, 8388659, f7 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f27573b = imageView2;
        imageView2.setScaleType(scaleType);
        fi.d2 d2Var = new fi.d2(3, this);
        this.f27574c = d2Var;
        imageView2.setImageDrawable(d2Var);
        d2Var.f32285f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, gb1.m(36.0f, 36.0f, 8388661, f7, 11.0f, f7, 0.0f));
        imageView2.setOnClickListener(new w80(this, 10));
        fi.c2 c2Var = new fi.c2(this, context, 7);
        this.d = c2Var;
        c2Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.E(c2Var, org.telegram.ui.ActionBar.y6.P5, u6Var);
        org.telegram.ui.ActionBar.f7.V(c2Var, org.telegram.ui.ActionBar.y6.R5, u6Var);
        c2Var.setBackgroundDrawable(null);
        c2Var.setPadding(0, 0, 0, 0);
        c2Var.setMaxLines(1);
        c2Var.setLines(1);
        c2Var.setSingleLine(true);
        c2Var.setGravity(gb1.E() | 16);
        c2Var.setImeOptions(268435459);
        org.telegram.ui.ActionBar.f7.m(c2Var, 30, org.telegram.ui.ActionBar.y6.Mh, u6Var);
        c2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c2Var.setCursorWidth(1.5f);
        float f10 = f7 + 2.0f;
        addView(c2Var, gb1.m(-1.0f, 40.0f, 8388659, f10 + 38.0f, 9.0f, f10 + 30.0f, 0.0f));
        c2Var.addTextChangedListener(new bi.u(this, 12));
        c2Var.setOnEditorActionListener(new d1(this, 6));
    }

    public abstract void a(String str);

    public rq getProgressDrawable() {
        return this.f27574c;
    }

    public View getSearchBackground() {
        return this.f27572a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.d;
    }

    public void setHint(String str) {
        this.d.setHint(str);
    }

    @Override
    public final void updateColors() {
        View view = this.f27572a;
        if (view != null) {
            try {
                org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.O5, this.e), view.getBackground());
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
