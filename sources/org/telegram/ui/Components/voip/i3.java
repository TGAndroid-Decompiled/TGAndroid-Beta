package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.xi0;
import w7.x5;
public final class i3 extends FrameLayout {
    public final o1 f31576a;
    public h3 f31577b;
    public int f31578c;
    public final TextView d;
    public final TextView f31579e;
    public int f31580f;

    public i3(Activity activity, o1 o1Var) {
        super(activity);
        this.f31576a = o1Var;
        setWillNotDraw(true);
        h3 h3Var = new h3(activity, o1Var);
        this.f31577b = h3Var;
        addView(h3Var, x5.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, x5.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.f31579e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, x5.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.f31577b.f31557a = new xi0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f31577b.f31558b = new xi0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.f31577b.f31558b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        h3 h3Var = new h3(getContext(), this.f31576a);
        if (i10 == R.raw.camera_flip2) {
            xi0 xi0Var = new xi0(i10, i11, i11, true, null);
            h3Var.f31559c = xi0Var;
            xi0Var.f32605v0 = h3Var;
        } else {
            h3Var.f31557a = new xi0(i10, i11, i11, true, null);
            xi0 xi0Var2 = new xi0(i10, i11, i11, true, null);
            h3Var.f31558b = xi0Var2;
            xi0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        h3Var.a(i12, z10, false);
        h3Var.setAlpha(0.0f);
        h3Var.setOnBtnClickedListener(this.f31577b.f31566x);
        addView(h3Var, x5.a(53.5f, 53.5f, 1));
        h3 h3Var2 = this.f31577b;
        this.f31577b = h3Var;
        h3Var.animate().alpha(1.0f).setDuration(250L).start();
        h3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new pk0(5, this, h3Var2)).start();
    }

    public final void c(int i10) {
        this.f31577b.f31557a = new xi0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f31577b.f31558b = new xi0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.f31577b.f31558b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void d(int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.i3.d(int, boolean, boolean):void");
    }

    public void setOnBtnClickedListener(g3 g3Var) {
        this.f31577b.setOnBtnClickedListener(g3Var);
    }
}
