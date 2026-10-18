package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.uj0;
import w7.z5;
public final class i3 extends FrameLayout {
    public final o1 f31518a;
    public h3 f31519b;
    public int f31520c;
    public final TextView d;
    public final TextView e;
    public int f31521f;

    public i3(Activity activity, o1 o1Var) {
        super(activity);
        this.f31518a = o1Var;
        setWillNotDraw(true);
        h3 h3Var = new h3(activity, o1Var);
        this.f31519b = h3Var;
        addView(h3Var, z5.b(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, z5.a(-2.0f, 0.0f, 58.0f, 0.0f, 2.0f, -1, 0));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, z5.a(-2.0f, 0.0f, 58.0f, 0.0f, 2.0f, -1, 0));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.f31519b.f31500a = new uj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f31519b.f31501b = new uj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f31519b.f31501b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        h3 h3Var = new h3(getContext(), this.f31518a);
        if (i10 == R.raw.camera_flip2) {
            uj0 uj0Var = new uj0(i10, i11, i11, true, null);
            h3Var.f31502c = uj0Var;
            uj0Var.R(h3Var);
        } else {
            h3Var.f31500a = new uj0(i10, i11, i11, true, null);
            uj0 uj0Var2 = new uj0(i10, i11, i11, true, null);
            h3Var.f31501b = uj0Var2;
            uj0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        h3Var.a(i12, z10, false);
        h3Var.setAlpha(0.0f);
        h3Var.setOnBtnClickedListener(this.f31519b.f31508x);
        addView(h3Var, z5.b(53.5f, 53.5f, 1));
        h3 h3Var2 = this.f31519b;
        this.f31519b = h3Var;
        h3Var.animate().alpha(1.0f).setDuration(250L).start();
        h3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new ml0(6, this, h3Var2)).start();
    }

    public final void c(int i10) {
        this.f31519b.f31500a = new uj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f31519b.f31501b = new uj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f31519b.f31501b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.i3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(g3 g3Var) {
        this.f31519b.setOnBtnClickedListener(g3Var);
    }
}
